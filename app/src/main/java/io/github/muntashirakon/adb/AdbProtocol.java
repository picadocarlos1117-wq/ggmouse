package io.github.muntashirakon.adb;

import java.io.InputStream;
import java.io.StreamCorruptedException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import p000.AbstractC1308pu;
import p000.ca0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
final class AdbProtocol {
    public static final int ADB_AUTH_RSAPUBLICKEY = 3;
    public static final int ADB_AUTH_SIGNATURE = 2;
    public static final int ADB_AUTH_TOKEN = 1;
    public static final int ADB_HEADER_LENGTH = 24;
    public static final int A_AUTH = 1213486401;
    public static final int A_CLSE = 1163086915;
    public static final int A_CNXN = 1314410051;
    public static final int A_OKAY = 1497451343;
    public static final int A_OPEN = 1313165391;
    public static final int A_STLS = 1397511251;
    public static final int A_STLS_VERSION = 16777216;
    public static final int A_STLS_VERSION_MIN = 16777216;
    public static final int A_SYNC = 1129208147;
    public static final int A_VERSION = 16777216;
    public static final int A_VERSION_MIN = 16777216;
    public static final int A_VERSION_SKIP_CHECKSUM = 16777217;
    public static final int A_WRTE = 1163154007;
    public static final int MAX_PAYLOAD = 4096;
    public static final int MAX_PAYLOAD_V1 = 4096;
    public static final int MAX_PAYLOAD_V2 = 262144;
    public static final int MAX_PAYLOAD_V3 = 1048576;
    public static final byte[] SYSTEM_IDENTITY_STRING_HOST = StringCompat.getBytes("host::\u0000", "UTF-8");

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static final class Message {
        public final int arg0;
        public final int arg1;
        public final int command;
        public final int dataCheck;
        public final int dataLength;
        public final int magic;
        public byte[] payload;

        private Message(ByteBuffer byteBuffer) {
            this.command = byteBuffer.getInt();
            this.arg0 = byteBuffer.getInt();
            this.arg1 = byteBuffer.getInt();
            this.dataLength = byteBuffer.getInt();
            this.dataCheck = byteBuffer.getInt();
            this.magic = byteBuffer.getInt();
        }

        public static Message parse(InputStream inputStream, int i, int i2) {
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(24).order(ByteOrder.LITTLE_ENDIAN);
            int i3 = 0;
            int i4 = 0;
            do {
                int i5 = inputStream.read(byteBufferOrder.array(), i4, 24 - i4);
                if (i5 < 0) {
                    ca0.m1178j("Stream closed");
                    return null;
                }
                i4 += i5;
            } while (i4 < 24);
            Message message = new Message(byteBufferOrder);
            int i6 = message.command;
            if (i6 != (~message.magic)) {
                throw new StreamCorruptedException(String.format("Invalid header: Invalid magic 0x%x.", Integer.valueOf(message.magic)));
            }
            if (i6 != 1129208147 && i6 != 1314410051 && i6 != 1313165391 && i6 != 1497451343 && i6 != 1163086915 && i6 != 1163154007 && i6 != 1213486401 && i6 != 1397511251) {
                throw new StreamCorruptedException(String.format("Invalid header: Invalid command 0x%x.", Integer.valueOf(message.command)));
            }
            int i7 = message.dataLength;
            if (i7 < 0 || i7 > i2) {
                throw new StreamCorruptedException(String.format("Invalid header: Invalid data length %d", Integer.valueOf(message.dataLength)));
            }
            if (i7 != 0) {
                message.payload = new byte[i7];
                do {
                    int i8 = inputStream.read(message.payload, i3, message.dataLength - i3);
                    if (i8 < 0) {
                        ca0.m1178j("Stream closed");
                        return null;
                    }
                    i3 += i8;
                } while (i3 < message.dataLength);
                if ((i <= 16777216 || (message.command == 1314410051 && message.arg0 <= 16777216)) && AdbProtocol.getPayloadChecksum(message.payload) != message.dataCheck) {
                    throw new StreamCorruptedException("Invalid header: Checksum mismatched.");
                }
            }
            return message;
        }

        public String toString() {
            String str;
            switch (this.command) {
                case AdbProtocol.A_SYNC /* 1129208147 */:
                    str = "SYNC";
                    break;
                case AdbProtocol.A_CLSE /* 1163086915 */:
                    str = "CLSE";
                    break;
                case AdbProtocol.A_WRTE /* 1163154007 */:
                    str = "WRTE";
                    break;
                case AdbProtocol.A_AUTH /* 1213486401 */:
                    str = "AUTH";
                    break;
                case AdbProtocol.A_OPEN /* 1313165391 */:
                    str = "OPEN";
                    break;
                case AdbProtocol.A_CNXN /* 1314410051 */:
                    str = "CNXN";
                    break;
                case AdbProtocol.A_STLS /* 1397511251 */:
                    str = "STLS";
                    break;
                case AdbProtocol.A_OKAY /* 1497451343 */:
                    str = "OKAY";
                    break;
                default:
                    str = "????";
                    break;
            }
            StringBuilder sbM5347n = AbstractC1308pu.m5347n("Message{command=", str, ", arg0=0x");
            sbM5347n.append(Integer.toHexString(this.arg0));
            sbM5347n.append(", arg1=0x");
            sbM5347n.append(Integer.toHexString(this.arg1));
            sbM5347n.append(", payloadLength=");
            sbM5347n.append(this.dataLength);
            sbM5347n.append(", checksum=");
            sbM5347n.append(this.dataCheck);
            sbM5347n.append(", magic=0x");
            sbM5347n.append(Integer.toHexString(this.magic));
            sbM5347n.append(", payload=");
            sbM5347n.append(Arrays.toString(this.payload));
            sbM5347n.append('}');
            return sbM5347n.toString();
        }
    }

    public static byte[] generateAuth(int i, byte[] bArr) {
        return generateMessage(A_AUTH, i, 0, bArr);
    }

    public static byte[] generateClose(int i, int i2) {
        return generateMessage(A_CLSE, i, i2, null);
    }

    public static byte[] generateConnect(int i) {
        return generateMessage(A_CNXN, getProtocolVersion(i), getMaxData(i), SYSTEM_IDENTITY_STRING_HOST);
    }

    public static byte[] generateMessage(int i, int i2, int i3, byte[] bArr, int i4, int i5) {
        ByteBuffer byteBufferOrder = bArr != null ? ByteBuffer.allocate(i5 + 24).order(ByteOrder.LITTLE_ENDIAN) : ByteBuffer.allocate(24).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.putInt(i);
        byteBufferOrder.putInt(i2);
        byteBufferOrder.putInt(i3);
        if (bArr != null) {
            byteBufferOrder.putInt(i5);
            byteBufferOrder.putInt(getPayloadChecksum(bArr, i4, i5));
        } else {
            byteBufferOrder.putInt(0);
            byteBufferOrder.putInt(0);
        }
        byteBufferOrder.putInt(~i);
        if (bArr != null) {
            byteBufferOrder.put(bArr, i4, i5);
        }
        return byteBufferOrder.array();
    }

    public static byte[] generateOpen(int i, String str) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(str.length() + 1);
        byteBufferAllocate.put(StringCompat.getBytes(str, "UTF-8"));
        byteBufferAllocate.put((byte) 0);
        return generateMessage(A_OPEN, i, 0, byteBufferAllocate.array());
    }

    public static byte[] generateReady(int i, int i2) {
        return generateMessage(A_OKAY, i, i2, null);
    }

    public static byte[] generateStls() {
        return generateMessage(A_STLS, 16777216, 0, null);
    }

    public static byte[] generateWrite(int i, int i2, byte[] bArr, int i3, int i4) {
        return generateMessage(A_WRTE, i, i2, bArr, i3, i4);
    }

    public static int getMaxData(int i) {
        if (i >= 28) {
            return MAX_PAYLOAD_V3;
        }
        if (i >= 24) {
            return MAX_PAYLOAD_V2;
        }
        return 4096;
    }

    private static int getPayloadChecksum(byte[] bArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = i; i4 < i + i2; i4++) {
            i3 += bArr[i4] & 255;
        }
        return i3;
    }

    public static int getProtocolVersion(int i) {
        if (i >= 28) {
            return A_VERSION_SKIP_CHECKSUM;
        }
        return 16777216;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getPayloadChecksum(byte[] bArr) {
        return getPayloadChecksum(bArr, 0, bArr.length);
    }

    public static byte[] generateMessage(int i, int i2, int i3, byte[] bArr) {
        return generateMessage(i, i2, i3, bArr, 0, bArr == null ? 0 : bArr.length);
    }
}
