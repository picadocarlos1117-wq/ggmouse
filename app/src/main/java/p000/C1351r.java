package p000;

import android.sun.security.util.DerValue;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: r */
/* JADX INFO: loaded from: classes3.dex */
public final class C1351r extends AbstractC1536w {

    /* JADX INFO: renamed from: c */
    public static final ConcurrentHashMap f9639c;

    /* JADX INFO: renamed from: a */
    public final byte[] f9640a;

    /* JADX INFO: renamed from: b */
    public String f9641b;

    static {
        new C0549d(C1351r.class, 3);
        f9639c = new ConcurrentHashMap();
    }

    public C1351r(String str) {
        char cCharAt;
        String strSubstring;
        int i;
        String strSubstring2;
        String strSubstring3;
        if (str.length() > 16385) {
            f40.m2713i("exceeded OID contents length limit");
            throw null;
        }
        if (str.length() < 3 || str.charAt(1) != '.' || (cCharAt = str.charAt(0)) < '0' || cCharAt > '2' || !C1573x.m6851w(2, str) || !(cCharAt == '2' || str.length() == 3 || str.charAt(3) == '.' || ((str.length() == 4 || str.charAt(4) == '.') && str.charAt(2) < '4'))) {
            f40.m2713i(jd0.m3615m("string ", str, " not a valid OID"));
            throw null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int iIndexOf = str.indexOf(46, 0);
        if (iIndexOf == -1) {
            strSubstring = str.substring(0);
            i = -1;
        } else {
            strSubstring = str.substring(0, iIndexOf);
            i = iIndexOf + 1;
        }
        int i2 = Integer.parseInt(strSubstring) * 40;
        if (i == -1) {
            strSubstring2 = null;
        } else {
            int iIndexOf2 = str.indexOf(46, i);
            if (iIndexOf2 == -1) {
                strSubstring2 = str.substring(i);
                i = -1;
            } else {
                String strSubstring4 = str.substring(i, iIndexOf2);
                i = 1 + iIndexOf2;
                strSubstring2 = strSubstring4;
            }
        }
        if (strSubstring2.length() <= 18) {
            C1573x.m6852x(byteArrayOutputStream, Long.parseLong(strSubstring2) + ((long) i2));
        } else {
            C1573x.m6853y(byteArrayOutputStream, new BigInteger(strSubstring2).add(BigInteger.valueOf(i2)));
        }
        while (i != -1) {
            if (i == -1) {
                strSubstring3 = null;
            } else {
                int iIndexOf3 = str.indexOf(46, i);
                if (iIndexOf3 == -1) {
                    strSubstring3 = str.substring(i);
                    i = -1;
                } else {
                    String strSubstring5 = str.substring(i, iIndexOf3);
                    i = iIndexOf3 + 1;
                    strSubstring3 = strSubstring5;
                }
            }
            if (strSubstring3.length() <= 18) {
                C1573x.m6852x(byteArrayOutputStream, Long.parseLong(strSubstring3));
            } else {
                C1573x.m6853y(byteArrayOutputStream, new BigInteger(strSubstring3));
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        m5632v(byteArray.length);
        this.f9640a = byteArray;
        this.f9641b = str;
    }

    /* JADX INFO: renamed from: A */
    public static String m5631A(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        BigInteger bigIntegerShiftLeft = null;
        long j = 0;
        for (int i = 0; i != bArr.length; i++) {
            byte b = bArr[i];
            if (j <= 72057594037927808L) {
                long j2 = j + ((long) (b & 127));
                if ((b & DerValue.TAG_CONTEXT) == 0) {
                    if (z) {
                        if (j2 < 40) {
                            sb.append('0');
                        } else if (j2 < 80) {
                            sb.append('1');
                            j2 -= 40;
                        } else {
                            sb.append('2');
                            j2 -= 80;
                        }
                        z = false;
                    }
                    sb.append('.');
                    sb.append(j2);
                    j = 0;
                } else {
                    j = j2 << 7;
                }
            } else {
                if (bigIntegerShiftLeft == null) {
                    bigIntegerShiftLeft = BigInteger.valueOf(j);
                }
                BigInteger bigIntegerOr = bigIntegerShiftLeft.or(BigInteger.valueOf(b & 127));
                if ((b & DerValue.TAG_CONTEXT) == 0) {
                    if (z) {
                        sb.append('2');
                        bigIntegerOr = bigIntegerOr.subtract(BigInteger.valueOf(80L));
                        z = false;
                    }
                    sb.append('.');
                    sb.append(bigIntegerOr);
                    bigIntegerShiftLeft = null;
                    j = 0;
                } else {
                    bigIntegerShiftLeft = bigIntegerOr.shiftLeft(7);
                }
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: v */
    public static void m5632v(int i) {
        if (i <= 4096) {
            return;
        }
        f40.m2713i("exceeded OID contents length limit");
    }

    /* JADX INFO: renamed from: w */
    public static C1351r m5633w(byte[] bArr, boolean z) {
        m5632v(bArr.length);
        C1351r c1351r = (C1351r) f9639c.get(new C1314q(bArr));
        if (c1351r != null) {
            return c1351r;
        }
        if (!C1573x.m6850v(bArr)) {
            f40.m2713i("invalid OID contents");
            return null;
        }
        if (z) {
            bArr = sc2.m6061e(bArr);
        }
        return new C1351r(null, bArr);
    }

    @Override // p000.AbstractC1536w, p000.AbstractC1164o
    public final int hashCode() {
        return sc2.m6079w(this.f9640a);
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: j */
    public final boolean mo2j(AbstractC1536w abstractC1536w) {
        if (this == abstractC1536w) {
            return true;
        }
        if (abstractC1536w instanceof C1351r) {
            return Arrays.equals(this.f9640a, ((C1351r) abstractC1536w).f9640a);
        }
        return false;
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: k */
    public final void mo1094k(C1462u c1462u, boolean z) {
        c1462u.m6367m(6, z, this.f9640a);
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: m */
    public final boolean mo3m() {
        return false;
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: n */
    public final int mo1095n(boolean z) {
        return C1462u.m6358f(this.f9640a.length, z);
    }

    public final String toString() {
        return m5635x();
    }

    /* JADX INFO: renamed from: u */
    public final C1351r m5634u(String str) {
        String strM3615m;
        byte[] bArrM6064h;
        String strSubstring;
        ConcurrentHashMap concurrentHashMap = C1573x.f12387c;
        if (str.length() <= 16383) {
            int i = 0;
            if (C1573x.m6851w(0, str)) {
                int length = str.length();
                byte[] bArr = this.f9640a;
                if (length <= 2) {
                    m5632v(bArr.length + 1);
                    int iCharAt = str.charAt(0) - '0';
                    if (str.length() == 2) {
                        iCharAt = (iCharAt * 10) + (str.charAt(1) - '0');
                    }
                    int length2 = bArr.length;
                    bArrM6064h = new byte[length2 + 1];
                    System.arraycopy(bArr, 0, bArrM6064h, 0, length2);
                    bArrM6064h[length2] = (byte) iCharAt;
                } else {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        int i2 = -1;
                        if (i == -1) {
                            break;
                        }
                        if (i == -1) {
                            i2 = i;
                            strSubstring = null;
                        } else {
                            int iIndexOf = str.indexOf(46, i);
                            if (iIndexOf == -1) {
                                strSubstring = str.substring(i);
                            } else {
                                strSubstring = str.substring(i, iIndexOf);
                                i2 = iIndexOf + 1;
                            }
                        }
                        if (strSubstring.length() <= 18) {
                            C1573x.m6852x(byteArrayOutputStream, Long.parseLong(strSubstring));
                        } else {
                            C1573x.m6853y(byteArrayOutputStream, new BigInteger(strSubstring));
                        }
                        i = i2;
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    m5632v(bArr.length + byteArray.length);
                    bArrM6064h = sc2.m6064h(bArr, byteArray);
                }
                return new C1351r(AbstractC1308pu.m5340g(m5635x(), ".", str), bArrM6064h);
            }
            strM3615m = jd0.m3615m("string ", str, " not a valid relative OID");
        } else {
            strM3615m = "exceeded relative OID contents length limit";
        }
        f40.m2713i(strM3615m);
        return null;
    }

    /* JADX INFO: renamed from: x */
    public final synchronized String m5635x() {
        try {
            if (this.f9641b == null) {
                this.f9641b = m5631A(this.f9640a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f9641b;
    }

    /* JADX INFO: renamed from: y */
    public final C1351r m5636y() {
        C1314q c1314q = new C1314q(this.f9640a);
        ConcurrentHashMap concurrentHashMap = f9639c;
        C1351r c1351r = (C1351r) concurrentHashMap.get(c1314q);
        if (c1351r != null) {
            return c1351r;
        }
        synchronized (concurrentHashMap) {
            try {
                if (concurrentHashMap.containsKey(c1314q)) {
                    this = (C1351r) concurrentHashMap.get(c1314q);
                } else {
                    concurrentHashMap.put(c1314q, this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m5637z(C1351r c1351r) {
        byte[] bArr = c1351r.f9640a;
        int length = bArr.length;
        byte[] bArr2 = this.f9640a;
        if (bArr2.length > length) {
            for (int i = 0; i < length; i++) {
                if (bArr2[i] == bArr[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public C1351r(String str, byte[] bArr) {
        this.f9640a = bArr;
        this.f9641b = str;
    }
}
