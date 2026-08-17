package io.github.muntashirakon.adb;

import android.os.Build;
import android.util.Log;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;
import java.util.Objects;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;
import p000.ca0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class PairingConnectionCtx implements Closeable {
    public static final String EXPORTED_KEY_LABEL = "adb-label\u0000";
    public static final int EXPORT_KEY_SIZE = 64;
    public static final String TAG = "PairingConnectionCtx";
    private final String mHost;
    private DataInputStream mInputStream;
    private DataOutputStream mOutputStream;
    private PairingAuthCtx mPairingAuthCtx;
    private final PeerInfo mPeerInfo;
    private final int mPort;
    private final byte[] mPswd;
    private final Role mRole;
    private final SSLContext mSslContext;
    private State mState;

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static class PairingPacketHeader {
        public static final byte CURRENT_KEY_HEADER_VERSION = 1;
        public static final int MAX_PAYLOAD_SIZE = 16384;
        public static final byte MAX_SUPPORTED_KEY_HEADER_VERSION = 1;
        public static final byte MIN_SUPPORTED_KEY_HEADER_VERSION = 1;
        public static final byte PAIRING_PACKET_HEADER_SIZE = 6;
        public static final byte PEER_INFO = 1;
        public static final byte SPAKE2_MSG = 0;
        private final int payloadSize;
        private final byte type;
        private final byte version;

        public PairingPacketHeader(byte b, byte b2, int i) {
            this.version = b;
            this.type = b2;
            this.payloadSize = i;
        }

        public static PairingPacketHeader readFrom(ByteBuffer byteBuffer) {
            byte b = byteBuffer.get();
            byte b2 = byteBuffer.get();
            int i = byteBuffer.getInt();
            if (b < 1 || b > 1) {
                Log.e(PairingConnectionCtx.TAG, "PairingPacketHeader version mismatch (us=1 them=" + ((int) b) + ")");
                return null;
            }
            if (b2 != 0 && b2 != 1) {
                Log.e(PairingConnectionCtx.TAG, "Unknown PairingPacket type " + ((int) b2));
                return null;
            }
            if (i > 0 && i <= 16384) {
                return new PairingPacketHeader(b, b2, i);
            }
            Log.e(PairingConnectionCtx.TAG, "Header payload not within a safe payload size (size=" + i + ")");
            return null;
        }

        public String toString() {
            return "PairingPacketHeader{version=" + ((int) this.version) + ", type=" + ((int) this.type) + ", payloadSize=" + this.payloadSize + '}';
        }

        public void writeTo(ByteBuffer byteBuffer) {
            byteBuffer.put(this.version).put(this.type).putInt(this.payloadSize);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static class PeerInfo {
        public static final byte ADB_DEVICE_GUID = 0;
        public static final byte ADB_RSA_PUB_KEY = 0;
        public static final int MAX_PEER_INFO_SIZE = 8192;
        private final byte[] data;
        private final byte type;

        public PeerInfo(byte b, byte[] bArr) {
            byte[] bArr2 = new byte[8191];
            this.data = bArr2;
            this.type = b;
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, 8191));
        }

        public static PeerInfo readFrom(ByteBuffer byteBuffer) {
            byte b = byteBuffer.get();
            byte[] bArr = new byte[8191];
            byteBuffer.get(bArr);
            return new PeerInfo(b, bArr);
        }

        public String toString() {
            return "PeerInfo{type=" + ((int) this.type) + ", data=" + Arrays.toString(this.data) + '}';
        }

        public void writeTo(ByteBuffer byteBuffer) {
            byteBuffer.put(this.type).put(this.data);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public enum Role {
        Client,
        Server
    }

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public enum State {
        Ready,
        ExchangingMsgs,
        ExchangingPeerInfo,
        Stopped
    }

    public PairingConnectionCtx(String str, int i, byte[] bArr, KeyPair keyPair, String str2) {
        this.mRole = Role.Client;
        this.mState = State.Ready;
        Objects.requireNonNull(str);
        this.mHost = str;
        this.mPort = i;
        Objects.requireNonNull(bArr);
        this.mPswd = bArr;
        RSAPublicKey rSAPublicKey = (RSAPublicKey) keyPair.getPublicKey();
        Objects.requireNonNull(str2);
        this.mPeerInfo = new PeerInfo((byte) 0, AndroidPubkey.encodeWithName(rSAPublicKey, str2));
        this.mSslContext = SslUtils.getSslContext(keyPair);
    }

    private boolean checkHeaderType(byte b, byte b2) {
        if (b == b2) {
            return true;
        }
        Log.e(TAG, "Unexpected header type (expected=" + ((int) b) + " actual=" + ((int) b2) + ")");
        return false;
    }

    private PairingPacketHeader createHeader(byte b, int i) {
        return new PairingPacketHeader((byte) 1, b, i);
    }

    private boolean doExchangeMsgs() throws IOException {
        byte[] msg = this.mPairingAuthCtx.getMsg();
        writeHeader(createHeader((byte) 0, msg.length), msg);
        PairingPacketHeader header = readHeader();
        if (header == null || !checkHeaderType((byte) 0, header.type)) {
            return false;
        }
        byte[] bArr = new byte[header.payloadSize];
        this.mInputStream.readFully(bArr);
        try {
            return this.mPairingAuthCtx.initCipher(bArr);
        } catch (Exception e) {
            Log.e(TAG, "Unable to initialize pairing cipher");
            throw ((IOException) new IOException().initCause(e));
        }
    }

    private boolean doExchangePeerInfo() throws IOException {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(PeerInfo.MAX_PEER_INFO_SIZE).order(ByteOrder.BIG_ENDIAN);
        this.mPeerInfo.writeTo(byteBufferOrder);
        byte[] bArrEncrypt = this.mPairingAuthCtx.encrypt(byteBufferOrder.array());
        if (bArrEncrypt == null) {
            Log.e(TAG, "Failed to encrypt peer info");
            return false;
        }
        writeHeader(createHeader((byte) 1, bArrEncrypt.length), bArrEncrypt);
        PairingPacketHeader header = readHeader();
        if (header == null || !checkHeaderType((byte) 1, header.type)) {
            return false;
        }
        byte[] bArr = new byte[header.payloadSize];
        this.mInputStream.readFully(bArr);
        byte[] bArrDecrypt = this.mPairingAuthCtx.decrypt(bArr);
        if (bArrDecrypt == null) {
            Log.e(TAG, "Unsupported payload while decrypting peer info.");
            return false;
        }
        if (bArrDecrypt.length == 8192) {
            PeerInfo.readFrom(ByteBuffer.wrap(bArrDecrypt)).toString();
            return true;
        }
        Log.e(TAG, "Got size=" + bArrDecrypt.length + " PeerInfo.size=8192");
        return false;
    }

    private byte[] exportKeyingMaterial(SSLSocket sSLSocket, int i) throws SSLException {
        Class cls;
        try {
            if (SslUtils.isCustomConscrypt()) {
                cls = Conscrypt.class;
                int i2 = Conscrypt.f8438a;
            } else {
                if (Build.VERSION.SDK_INT < 29) {
                    throw new SSLException("TLSv1.3 isn't supported on your platform. Use custom Conscrypt library instead.");
                }
                cls = Class.forName("com.android.org.conscrypt.Conscrypt");
            }
            return (byte[]) cls.getMethod("exportKeyingMaterial", SSLSocket.class, String.class, byte[].class, Integer.TYPE).invoke(null, sSLSocket, EXPORTED_KEY_LABEL, null, Integer.valueOf(i));
        } catch (SSLException e) {
            throw e;
        } catch (Throwable th) {
            throw new SSLException(th);
        }
    }

    private void notifyResult() {
        this.mState = State.Stopped;
    }

    private PairingPacketHeader readHeader() throws IOException {
        byte[] bArr = new byte[6];
        this.mInputStream.readFully(bArr);
        return PairingPacketHeader.readFrom(ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN));
    }

    private void setupTlsConnection() throws IOException {
        Socket socketAccept = this.mRole == Role.Server ? ((SSLServerSocket) this.mSslContext.getServerSocketFactory().createServerSocket(this.mPort)).accept() : new Socket(this.mHost, this.mPort);
        socketAccept.setTcpNoDelay(true);
        SSLSocket sSLSocket = (SSLSocket) this.mSslContext.getSocketFactory().createSocket(socketAccept, this.mHost, this.mPort, true);
        sSLSocket.startHandshake();
        this.mInputStream = new DataInputStream(sSLSocket.getInputStream());
        this.mOutputStream = new DataOutputStream(sSLSocket.getOutputStream());
        byte[] bArrExportKeyingMaterial = exportKeyingMaterial(sSLSocket, 64);
        byte[] bArr = this.mPswd;
        byte[] bArr2 = new byte[bArr.length + bArrExportKeyingMaterial.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        System.arraycopy(bArrExportKeyingMaterial, 0, bArr2, this.mPswd.length, bArrExportKeyingMaterial.length);
        PairingAuthCtx pairingAuthCtxCreateAlice = PairingAuthCtx.createAlice(bArr2);
        if (pairingAuthCtxCreateAlice != null) {
            this.mPairingAuthCtx = pairingAuthCtxCreateAlice;
        } else {
            ca0.m1178j("Unable to create PairingAuthCtx.");
        }
    }

    private void writeHeader(PairingPacketHeader pairingPacketHeader, byte[] bArr) throws IOException {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(6).order(ByteOrder.BIG_ENDIAN);
        pairingPacketHeader.writeTo(byteBufferOrder);
        this.mOutputStream.write(byteBufferOrder.array());
        this.mOutputStream.write(bArr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Arrays.fill(this.mPswd, (byte) 0);
        try {
            this.mInputStream.close();
        } catch (IOException unused) {
        }
        try {
            this.mOutputStream.close();
        } catch (IOException unused2) {
        }
        if (this.mState != State.Ready) {
            this.mPairingAuthCtx.destroy();
        }
    }

    public void start() throws IOException {
        if (this.mState != State.Ready) {
            ca0.m1178j("Connection is not ready yet.");
            return;
        }
        this.mState = State.ExchangingMsgs;
        setupTlsConnection();
        while (true) {
            int iOrdinal = this.mState.ordinal();
            if (iOrdinal == 0) {
                break;
            }
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    if (doExchangePeerInfo()) {
                        notifyResult();
                        return;
                    } else {
                        notifyResult();
                        ca0.m1178j("Could not exchange peer info.");
                        return;
                    }
                }
                if (iOrdinal == 3) {
                    break;
                }
            } else {
                if (!doExchangeMsgs()) {
                    notifyResult();
                    ca0.m1178j("Exchanging message wasn't successful.");
                    return;
                }
                this.mState = State.ExchangingPeerInfo;
            }
        }
        ca0.m1178j("Connection closed with errors.");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PairingConnectionCtx(String str, int i, byte[] bArr, PrivateKey privateKey, Certificate certificate, String str2) {
        this(str, i, bArr, new KeyPair(privateKey, certificate), str2);
        Objects.requireNonNull(privateKey);
        Objects.requireNonNull(certificate);
    }
}
