package p000;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class l70 {

    /* JADX INFO: renamed from: a */
    public final int f6202a;

    /* JADX INFO: renamed from: b */
    public final int f6203b;

    /* JADX INFO: renamed from: c */
    public final long f6204c;

    /* JADX INFO: renamed from: d */
    public final byte[] f6205d;

    public l70(long j, byte[] bArr, int i, int i2) {
        this.f6202a = i;
        this.f6203b = i2;
        this.f6204c = j;
        this.f6205d = bArr;
    }

    /* JADX INFO: renamed from: a */
    public static l70 m4068a(long j, ByteOrder byteOrder) {
        long[] jArr = {j};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[p70.f8747D[4]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putInt((int) jArr[0]);
        return new l70(4, 1, byteBufferWrap.array());
    }

    /* JADX INFO: renamed from: b */
    public static l70 m4069b(n70 n70Var, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[p70.f8747D[5]]);
        byteBufferWrap.order(byteOrder);
        n70 n70Var2 = new n70[]{n70Var}[0];
        byteBufferWrap.putInt((int) n70Var2.f7300a);
        byteBufferWrap.putInt((int) n70Var2.f7301b);
        return new l70(5, 1, byteBufferWrap.array());
    }

    /* JADX INFO: renamed from: c */
    public static l70 m4070c(int i, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[p70.f8747D[3]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putShort((short) new int[]{i}[0]);
        return new l70(3, 1, byteBufferWrap.array());
    }

    /* JADX INFO: renamed from: d */
    public final double m4071d(ByteOrder byteOrder) throws Throwable {
        Object objM4074g = m4074g(byteOrder);
        if (objM4074g == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (objM4074g instanceof String) {
            return Double.parseDouble((String) objM4074g);
        }
        if (objM4074g instanceof long[]) {
            long[] jArr = (long[]) objM4074g;
            if (jArr.length == 1) {
                return jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objM4074g instanceof int[]) {
            int[] iArr = (int[]) objM4074g;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objM4074g instanceof double[]) {
            double[] dArr = (double[]) objM4074g;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objM4074g instanceof n70[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        n70[] n70VarArr = (n70[]) objM4074g;
        if (n70VarArr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        n70 n70Var = n70VarArr[0];
        return n70Var.f7300a / n70Var.f7301b;
    }

    /* JADX INFO: renamed from: e */
    public final int m4072e(ByteOrder byteOrder) {
        Object objM4074g = m4074g(byteOrder);
        if (objM4074g == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objM4074g instanceof String) {
            return Integer.parseInt((String) objM4074g);
        }
        if (objM4074g instanceof long[]) {
            long[] jArr = (long[]) objM4074g;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objM4074g instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) objM4074g;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    /* JADX INFO: renamed from: f */
    public final String m4073f(ByteOrder byteOrder) throws Throwable {
        Object objM4074g = m4074g(byteOrder);
        if (objM4074g == null) {
            return null;
        }
        if (objM4074g instanceof String) {
            return (String) objM4074g;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (objM4074g instanceof long[]) {
            long[] jArr = (long[]) objM4074g;
            while (i < jArr.length) {
                sb.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objM4074g instanceof int[]) {
            int[] iArr = (int[]) objM4074g;
            while (i < iArr.length) {
                sb.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objM4074g instanceof double[]) {
            double[] dArr = (double[]) objM4074g;
            while (i < dArr.length) {
                sb.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(objM4074g instanceof n70[])) {
            return null;
        }
        n70[] n70VarArr = (n70[]) objM4074g;
        while (i < n70VarArr.length) {
            sb.append(n70VarArr[i].f7300a);
            sb.append('/');
            sb.append(n70VarArr[i].f7301b);
            i++;
            if (i != n70VarArr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0134 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0032: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:51), block:B:17:0x0032 */
    /* JADX WARN: Type inference failed for: r13v14, types: [int[]] */
    /* JADX WARN: Type inference failed for: r13v15, types: [long[]] */
    /* JADX WARN: Type inference failed for: r13v16, types: [n70[]] */
    /* JADX WARN: Type inference failed for: r13v17, types: [int[]] */
    /* JADX WARN: Type inference failed for: r13v18, types: [int[]] */
    /* JADX WARN: Type inference failed for: r13v19, types: [n70[]] */
    /* JADX WARN: Type inference failed for: r13v20, types: [double[]] */
    /* JADX WARN: Type inference failed for: r13v21, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r13v22, types: [double[]] */
    /* JADX INFO: renamed from: g */
    public final Serializable m4074g(ByteOrder byteOrder) throws Throwable {
        k70 k70Var;
        InputStream inputStream;
        String str;
        byte b;
        Object r13;
        byte[] bArr = this.f6205d;
        InputStream inputStream2 = null;
        try {
            try {
                k70Var = new k70(bArr);
                try {
                    k70Var.f5689b = byteOrder;
                    int i = this.f6202a;
                    int length = 0;
                    int i2 = this.f6203b;
                    switch (i) {
                        case 1:
                        case 6:
                            if (bArr.length != 1 || (b = bArr[0]) < 0 || b > 1) {
                                str = new String(bArr, p70.f8756M);
                                try {
                                    k70Var.close();
                                    return str;
                                } catch (IOException e) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e);
                                    return str;
                                }
                            }
                            String str2 = new String(new char[]{(char) (b + 48)});
                            try {
                                k70Var.close();
                                return str2;
                            } catch (IOException e2) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e2);
                                return str2;
                            }
                        case 2:
                        case 7:
                            if (i2 >= p70.f8748E.length) {
                                int i3 = 0;
                                while (true) {
                                    byte[] bArr2 = p70.f8748E;
                                    if (i3 >= bArr2.length) {
                                        length = bArr2.length;
                                    } else if (bArr[i3] == bArr2[i3]) {
                                        i3++;
                                    }
                                }
                            }
                            StringBuilder sb = new StringBuilder();
                            while (length < i2) {
                                byte b2 = bArr[length];
                                if (b2 == 0) {
                                    str = sb.toString();
                                    k70Var.close();
                                    return str;
                                }
                                if (b2 >= 32) {
                                    sb.append((char) b2);
                                } else {
                                    sb.append('?');
                                }
                                length++;
                            }
                            str = sb.toString();
                            k70Var.close();
                            return str;
                        case 3:
                            r13 = new int[i2];
                            while (length < i2) {
                                r13[length] = k70Var.readUnsignedShort();
                                length++;
                            }
                            try {
                                k70Var.close();
                                return r13;
                            } catch (IOException e3) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e3);
                                return r13;
                            }
                        case 4:
                            r13 = new long[i2];
                            while (length < i2) {
                                r13[length] = ((long) k70Var.readInt()) & 4294967295L;
                                length++;
                            }
                            k70Var.close();
                            return r13;
                        case 5:
                            r13 = new n70[i2];
                            while (length < i2) {
                                r13[length] = new n70(((long) k70Var.readInt()) & 4294967295L, ((long) k70Var.readInt()) & 4294967295L);
                                length++;
                            }
                            k70Var.close();
                            return r13;
                        case 8:
                            r13 = new int[i2];
                            while (length < i2) {
                                r13[length] = k70Var.readShort();
                                length++;
                            }
                            k70Var.close();
                            return r13;
                        case 9:
                            r13 = new int[i2];
                            while (length < i2) {
                                r13[length] = k70Var.readInt();
                                length++;
                            }
                            k70Var.close();
                            return r13;
                        case 10:
                            r13 = new n70[i2];
                            while (length < i2) {
                                r13[length] = new n70(k70Var.readInt(), k70Var.readInt());
                                length++;
                            }
                            k70Var.close();
                            return r13;
                        case 11:
                            r13 = new double[i2];
                            while (length < i2) {
                                r13[length] = k70Var.readFloat();
                                length++;
                            }
                            k70Var.close();
                            return r13;
                        case 12:
                            r13 = new double[i2];
                            while (length < i2) {
                                r13[length] = k70Var.readDouble();
                                length++;
                            }
                            k70Var.close();
                            return r13;
                        default:
                            try {
                                k70Var.close();
                                return null;
                            } catch (IOException e4) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e4);
                                return null;
                            }
                    }
                } catch (IOException e5) {
                    e = e5;
                    Log.w("ExifInterface", "IOException occurred during reading a value", e);
                    if (k70Var != null) {
                        try {
                            k70Var.close();
                        } catch (IOException e6) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e6);
                        }
                    }
                    return null;
                }
            } catch (IOException e7) {
                e = e7;
                k70Var = null;
            } catch (Throwable th) {
                th = th;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException e8) {
                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e8);
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream2 = inputStream;
            if (inputStream2 != null) {
                inputStream2.close();
            }
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(p70.f8746C[this.f6202a]);
        sb.append(", data length:");
        return AbstractC1308pu.m5341h(sb, this.f6205d.length, ")");
    }

    public l70(int i, int i2, byte[] bArr) {
        this(-1L, bArr, i, i2);
    }
}
