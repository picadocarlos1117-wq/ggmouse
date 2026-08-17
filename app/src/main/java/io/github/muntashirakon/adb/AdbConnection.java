package io.github.muntashirakon.adb;

import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.Socket;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.interfaces.RSAPublicKey;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSocket;
import javax.security.auth.DestroyFailedException;
import p000.C0694gy;
import p000.RunnableC1430t4;
import p000.ca0;
import p000.f40;
import p000.jd0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class AdbConnection implements Closeable {
    public static final String TAG = "AdbConnection";
    private volatile boolean mAbortOnUnauthorised;
    private final int mApi;
    private volatile boolean mAuthorisationFailed;
    private volatile boolean mConnectAttempted;
    private volatile boolean mConnectionEstablished;
    private volatile Exception mConnectionException;
    private final Thread mConnectionThread;
    private final String mHost;
    private final KeyPair mKeyPair;
    private int mLastLocalId;
    private volatile int mMaxData;
    private final ConcurrentHashMap<Integer, AdbStream> mOpenedStreams;
    private final InputStream mPlainInputStream;
    private final OutputStream mPlainOutputStream;
    private final int mPort;
    private volatile int mProtocolVersion;
    private volatile boolean mSentSignature;
    private final Socket mSocket;
    private volatile InputStream mTlsInputStream;
    private volatile OutputStream mTlsOutputStream;
    private volatile String mDeviceName = "Unknown Device";
    private volatile boolean mIsTls = false;
    private final Object mLock = new Object();

    private AdbConnection(String str, int i, KeyPair keyPair, int i2) throws IOException {
        Objects.requireNonNull(str);
        this.mHost = str;
        this.mPort = i;
        this.mApi = i2;
        this.mProtocolVersion = AdbProtocol.getProtocolVersion(i2);
        this.mMaxData = AdbProtocol.getMaxData(i2);
        Objects.requireNonNull(keyPair);
        this.mKeyPair = keyPair;
        try {
            Socket socket = new Socket(str, i);
            this.mSocket = socket;
            this.mPlainInputStream = socket.getInputStream();
            this.mPlainOutputStream = socket.getOutputStream();
            socket.setTcpNoDelay(true);
            this.mOpenedStreams = new ConcurrentHashMap<>();
            this.mLastLocalId = 0;
            this.mConnectionThread = createConnectionThread();
        } catch (Throwable th) {
            throw ((IOException) new IOException().initCause(th));
        }
    }

    private void cleanupStreams() {
        Iterator<AdbStream> it = this.mOpenedStreams.values().iterator();
        while (it.hasNext()) {
            try {
                it.next().close();
            } catch (IOException unused) {
            }
        }
        this.mOpenedStreams.clear();
    }

    public static AdbConnection create(String str, int i, PrivateKey privateKey, Certificate certificate, int i2) {
        Objects.requireNonNull(privateKey);
        Objects.requireNonNull(certificate);
        return create(str, i, new KeyPair(privateKey, certificate), i2);
    }

    private Thread createConnectionThread() {
        return new Thread(new RunnableC1430t4(this, 1));
    }

    private InputStream getInputStream() {
        if (!this.mIsTls) {
            return this.mPlainInputStream;
        }
        InputStream inputStream = this.mTlsInputStream;
        Objects.requireNonNull(inputStream);
        return inputStream;
    }

    private OutputStream getOutputStream() {
        if (!this.mIsTls) {
            return this.mPlainOutputStream;
        }
        OutputStream outputStream = this.mTlsOutputStream;
        Objects.requireNonNull(outputStream);
        return outputStream;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:73:0x0110 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public /* synthetic */ void lambda$createConnectionThread$0() {
        AdbStream adbStream;
        byte[] bArrGenerateAuth;
        while (!this.mConnectionThread.isInterrupted()) {
            try {
                AdbProtocol.Message message = AdbProtocol.Message.parse(getInputStream(), this.mProtocolVersion, this.mMaxData);
                int i = message.command;
                switch (i) {
                    case AdbProtocol.A_CLSE /* 1163086915 */:
                    case AdbProtocol.A_WRTE /* 1163154007 */:
                    case AdbProtocol.A_OKAY /* 1497451343 */:
                        if (this.mConnectionEstablished && (adbStream = this.mOpenedStreams.get(Integer.valueOf(message.arg1))) != null) {
                            synchronized (adbStream) {
                                try {
                                    int i2 = message.command;
                                    if (i2 == 1497451343) {
                                        adbStream.updateRemoteId(message.arg0);
                                        adbStream.readyForWrite();
                                        adbStream.notify();
                                    } else if (i2 == 1163154007) {
                                        adbStream.addPayload(message.payload);
                                        adbStream.sendReady();
                                    } else {
                                        this.mOpenedStreams.remove(Integer.valueOf(message.arg1));
                                        adbStream.notifyClose(true);
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        break;
                    case AdbProtocol.A_AUTH /* 1213486401 */:
                        if (!this.mIsTls && message.arg0 == 1) {
                            if (!this.mSentSignature) {
                                bArrGenerateAuth = AdbProtocol.generateAuth(2, AndroidPubkey.adbAuthSign(this.mKeyPair.getPrivateKey(), message.payload));
                                this.mSentSignature = true;
                            } else {
                                if (this.mAbortOnUnauthorised) {
                                    this.mAuthorisationFailed = true;
                                    synchronized (this) {
                                        cleanupStreams();
                                        notifyAll();
                                        this.mConnectionEstablished = false;
                                        this.mConnectAttempted = false;
                                    }
                                }
                                bArrGenerateAuth = AdbProtocol.generateAuth(3, AndroidPubkey.encodeWithName((RSAPublicKey) this.mKeyPair.getPublicKey(), this.mDeviceName));
                            }
                            sendPacket(bArrGenerateAuth);
                        }
                        break;
                    case AdbProtocol.A_CNXN /* 1314410051 */:
                        synchronized (this) {
                            this.mProtocolVersion = message.arg0;
                            this.mMaxData = message.arg1;
                            this.mConnectionEstablished = true;
                            notifyAll();
                            break;
                        }
                        break;
                    case AdbProtocol.A_STLS /* 1397511251 */:
                        sendPacket(AdbProtocol.generateStls());
                        SSLSocket sSLSocket = (SSLSocket) SslUtils.getSslContext(this.mKeyPair).getSocketFactory().createSocket(this.mSocket, this.mHost, this.mPort, true);
                        sSLSocket.startHandshake();
                        synchronized (this) {
                            this.mTlsInputStream = sSLSocket.getInputStream();
                            this.mTlsOutputStream = sSLSocket.getOutputStream();
                            this.mIsTls = true;
                            break;
                        }
                        break;
                    default:
                        Log.e(TAG, String.format("Unrecognized command = 0x%x", Integer.valueOf(i)));
                        break;
                }
            } catch (Exception e) {
                this.mConnectionException = e;
                e.printStackTrace();
            }
        }
        synchronized (this) {
            cleanupStreams();
            notifyAll();
            this.mConnectionEstablished = false;
            this.mConnectAttempted = false;
        }
    }

    private boolean waitForConnection(long j, TimeUnit timeUnit) {
        String message;
        synchronized (this) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Objects.requireNonNull(timeUnit);
                long millis = jCurrentTimeMillis + timeUnit.toMillis(j);
                while (!this.mConnectionEstablished && this.mConnectAttempted && millis - System.currentTimeMillis() > 0) {
                    wait(millis - System.currentTimeMillis());
                }
                if (this.mConnectionEstablished) {
                    return true;
                }
                if (this.mConnectAttempted) {
                    return false;
                }
                if (this.mAuthorisationFailed) {
                    throw new AdbAuthenticationFailedException();
                }
                Exception exc = this.mConnectionException;
                if (exc == null || !(exc instanceof SSLProtocolException) || (message = exc.getMessage()) == null || !message.contains("protocol error")) {
                    throw new IOException("Connection failed");
                }
                throw ((AdbPairingRequiredException) new AdbPairingRequiredException("ADB pairing is required.").initCause(exc));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.mSocket.close();
        this.mConnectionThread.interrupt();
        try {
            this.mConnectionThread.join();
        } catch (InterruptedException unused) {
        }
        try {
            this.mKeyPair.destroy();
        } catch (DestroyFailedException unused2) {
        }
    }

    public boolean connect(long j, TimeUnit timeUnit, boolean z) {
        if (this.mConnectionEstablished) {
            f40.m2719o("Already connected");
            return false;
        }
        sendPacket(AdbProtocol.generateConnect(this.mApi));
        this.mConnectAttempted = true;
        this.mAbortOnUnauthorised = z;
        this.mAuthorisationFailed = false;
        this.mConnectionThread.start();
        Objects.requireNonNull(timeUnit);
        return waitForConnection(j, timeUnit);
    }

    public void flushPacket() {
        synchronized (this.mLock) {
            getOutputStream().flush();
        }
    }

    public int getMaxData() {
        if (this.mConnectAttempted) {
            waitForConnection(Long.MAX_VALUE, TimeUnit.MILLISECONDS);
            return this.mMaxData;
        }
        f40.m2719o("connect() must be called first");
        return 0;
    }

    public int getProtocolVersion() {
        return this.mProtocolVersion;
    }

    public boolean isConnected() {
        return !this.mSocket.isClosed() && this.mSocket.isConnected();
    }

    public boolean isConnectionEstablished() {
        return this.mConnectionEstablished;
    }

    public AdbStream open(String str) throws ConnectException {
        int i = this.mLastLocalId + 1;
        this.mLastLocalId = i;
        if (!this.mConnectAttempted) {
            f40.m2719o("connect() must be called first");
            return null;
        }
        waitForConnection(Long.MAX_VALUE, TimeUnit.MILLISECONDS);
        AdbStream adbStream = new AdbStream(this, i);
        this.mOpenedStreams.put(Integer.valueOf(i), adbStream);
        Objects.requireNonNull(str);
        sendPacket(AdbProtocol.generateOpen(i, str));
        synchronized (adbStream) {
            adbStream.wait();
        }
        if (!adbStream.isClosed()) {
            return adbStream;
        }
        this.mOpenedStreams.remove(Integer.valueOf(i));
        throw new ConnectException("Stream open actively rejected by remote peer.");
    }

    public void sendPacket(byte[] bArr) {
        synchronized (this.mLock) {
            OutputStream outputStream = getOutputStream();
            outputStream.write(bArr);
            outputStream.flush();
        }
    }

    public void setDeviceName(String str) {
        Objects.requireNonNull(str);
        this.mDeviceName = str;
    }

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static class Builder {
        private int mApi;
        private Certificate mCertificate;
        private String mDeviceName;
        private String mHost;
        private KeyPair mKeyPair;
        private int mPort;
        private PrivateKey mPrivateKey;

        public Builder() {
            this.mHost = "127.0.0.1";
            this.mPort = 5555;
            this.mApi = 1;
        }

        public AdbConnection build() {
            Certificate certificate;
            if (this.mKeyPair == null) {
                PrivateKey privateKey = this.mPrivateKey;
                if (privateKey == null || (certificate = this.mCertificate) == null) {
                    C0694gy.m3079e("Private key and certificate must be set.");
                    return null;
                }
                this.mKeyPair = new KeyPair(privateKey, certificate);
            }
            AdbConnection adbConnectionCreate = AdbConnection.create(this.mHost, this.mPort, this.mKeyPair, this.mApi);
            String str = this.mDeviceName;
            if (str != null) {
                adbConnectionCreate.setDeviceName(str);
            }
            return adbConnectionCreate;
        }

        public AdbConnection connect() throws IOException {
            AdbConnection adbConnectionBuild = build();
            if (!adbConnectionBuild.connect()) {
                return adbConnectionBuild;
            }
            ca0.m1178j("Unable to establish a new connection.");
            return null;
        }

        public Builder setApi(int i) {
            this.mApi = i;
            return this;
        }

        public Builder setCertificate(Certificate certificate) {
            this.mCertificate = certificate;
            return this;
        }

        public Builder setDeviceName(String str) {
            this.mDeviceName = str;
            return this;
        }

        public Builder setHost(String str) {
            this.mHost = str;
            return this;
        }

        public Builder setKeyPair(KeyPair keyPair) {
            this.mKeyPair = keyPair;
            return this;
        }

        public Builder setPort(int i) {
            this.mPort = i;
            return this;
        }

        public Builder setPrivateKey(PrivateKey privateKey) {
            this.mPrivateKey = privateKey;
            return this;
        }

        public Builder(String str, int i) {
            this.mApi = 1;
            this.mHost = str;
            this.mPort = i;
        }

        public AdbConnection connect(long j, TimeUnit timeUnit, boolean z) throws IOException {
            AdbConnection adbConnectionBuild = build();
            if (!adbConnectionBuild.connect(j, timeUnit, z)) {
                return adbConnectionBuild;
            }
            ca0.m1178j("Unable to establish a new connection.");
            return null;
        }
    }

    public static AdbConnection create(String str, int i, PrivateKey privateKey, Certificate certificate) {
        return create(str, i, privateKey, certificate, 1);
    }

    public static AdbConnection create(String str, int i, KeyPair keyPair, int i2) {
        return new AdbConnection(str, i, keyPair, i2);
    }

    public boolean connect() {
        return connect(Long.MAX_VALUE, TimeUnit.MILLISECONDS, false);
    }

    public AdbStream open(int i, String... strArr) {
        if (i >= 1 && i <= 15) {
            return open(LocalServices.getDestination(i, strArr));
        }
        f40.m2713i(jd0.m3609g(i, "Invalid service: "));
        return null;
    }
}
