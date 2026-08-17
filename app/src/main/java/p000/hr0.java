package p000;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class hr0 extends fr0 {

    /* JADX INFO: renamed from: q */
    public static final gr0 f4670q;

    /* JADX INFO: renamed from: r */
    public static final gr0[] f4671r;

    /* JADX INFO: renamed from: b */
    public final byte[] f4672b;

    /* JADX INFO: renamed from: c */
    public final kr0 f4673c;

    /* JADX INFO: renamed from: d */
    public final dr0 f4674d;

    /* JADX INFO: renamed from: e */
    public final int f4675e;

    /* JADX INFO: renamed from: f */
    public final byte[] f4676f;

    /* JADX INFO: renamed from: g */
    public final WeakHashMap f4677g;

    /* JADX INFO: renamed from: m */
    public final int f4678m;

    /* JADX INFO: renamed from: n */
    public final j20 f4679n;

    /* JADX INFO: renamed from: o */
    public int f4680o;

    /* JADX INFO: renamed from: p */
    public ir0 f4681p;

    static {
        gr0 gr0Var = new gr0(1);
        f4670q = gr0Var;
        gr0[] gr0VarArr = new gr0[129];
        f4671r = gr0VarArr;
        gr0VarArr[1] = gr0Var;
        int i = 2;
        while (true) {
            gr0[] gr0VarArr2 = f4671r;
            if (i >= gr0VarArr2.length) {
                return;
            }
            gr0VarArr2[i] = new gr0(i);
            i++;
        }
    }

    public hr0(kr0 kr0Var, dr0 dr0Var, int i, byte[] bArr, int i2, byte[] bArr2) {
        super(true);
        this.f4673c = kr0Var;
        this.f4674d = dr0Var;
        this.f4680o = i;
        this.f4672b = sc2.m6061e(bArr);
        this.f4675e = i2;
        this.f4676f = sc2.m6061e(bArr2);
        this.f4678m = 1 << (kr0Var.f5992c + 1);
        this.f4677g = new WeakHashMap();
        this.f4679n = ua0.m6454j(kr0Var.f5991b, kr0Var.f5993d);
    }

    /* JADX INFO: renamed from: e */
    public static hr0 m3244e(Object obj) throws Throwable {
        Throwable th;
        if (obj instanceof hr0) {
            return (hr0) obj;
        }
        DataInputStream dataInputStream = null;
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream2 = (DataInputStream) obj;
            if (dataInputStream2.readInt() != 0) {
                f40.m2719o("expected version 0 lms private key");
                return null;
            }
            kr0 kr0Var = (kr0) kr0.f5989e.get(Integer.valueOf(dataInputStream2.readInt()));
            dr0 dr0Var = (dr0) dr0.f2996g.get(Integer.valueOf(dataInputStream2.readInt()));
            byte[] bArr = new byte[16];
            dataInputStream2.readFully(bArr);
            int i = dataInputStream2.readInt();
            int i2 = dataInputStream2.readInt();
            int i3 = dataInputStream2.readInt();
            if (i3 < 0) {
                f40.m2719o("secret length less than zero");
                return null;
            }
            if (i3 > dataInputStream2.available()) {
                f40.m2710f(dataInputStream2.available(), "secret length exceeded ");
                return null;
            }
            byte[] bArr2 = new byte[i3];
            dataInputStream2.readFully(bArr2);
            return new hr0(kr0Var, dr0Var, i, bArr, i2, bArr2);
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return m3244e(o21.m4674o0((InputStream) obj));
            }
            l41.m4038g(obj, "cannot parse ");
            return null;
        }
        try {
            DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                hr0 hr0VarM3244e = m3244e(dataInputStream3);
                dataInputStream3.close();
                return hr0VarM3244e;
            } catch (Throwable th2) {
                th = th2;
                dataInputStream = dataInputStream3;
                if (dataInputStream == null) {
                    throw th;
                }
                dataInputStream.close();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m3245a(int i) {
        byte[] bArr;
        int i2 = 1 << this.f4673c.f5992c;
        byte[] bArr2 = this.f4672b;
        j20 j20Var = this.f4679n;
        if (i < i2) {
            int i3 = i * 2;
            byte[] bArrM3246b = m3246b(i3);
            byte[] bArrM3246b2 = m3246b(i3 + 1);
            byte[] bArrM6061e = sc2.m6061e(bArr2);
            j20Var.mo729e(0, bArrM6061e.length, bArrM6061e);
            ki0.m3861e0(i, j20Var);
            j20Var.mo728c((byte) -125);
            j20Var.mo728c((byte) -125);
            j20Var.mo729e(0, bArrM3246b.length, bArrM3246b);
            j20Var.mo729e(0, bArrM3246b2.length, bArrM3246b2);
            byte[] bArr3 = new byte[j20Var.mo3528g()];
            j20Var.mo3526b(0, bArr3);
            return bArr3;
        }
        byte[] bArrM6061e2 = sc2.m6061e(bArr2);
        j20Var.mo729e(0, bArrM6061e2.length, bArrM6061e2);
        ki0.m3861e0(i, j20Var);
        j20Var.mo728c((byte) -126);
        j20Var.mo728c((byte) -126);
        byte[] bArrM6061e3 = sc2.m6061e(bArr2);
        int i4 = i - i2;
        byte[] bArrM6061e4 = sc2.m6061e(this.f4676f);
        dr0 dr0Var = this.f4674d;
        j20 j20VarM6461r = ua0.m6461r(dr0Var);
        C1351r c1351r = dr0Var.f3002f;
        int i5 = dr0Var.f2998b;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(bArrM6061e3);
            byte b = (byte) (i4 >>> 24);
            byteArrayOutputStream.write(b);
            byte b2 = (byte) (i4 >>> 16);
            byteArrayOutputStream.write(b2);
            byte b3 = (byte) (i4 >>> 8);
            byteArrayOutputStream.write(b3);
            byte b4 = (byte) i4;
            byteArrayOutputStream.write(b4);
            byteArrayOutputStream.write(-128);
            byteArrayOutputStream.write(-128);
            while (true) {
                bArr = null;
                if (byteArrayOutputStream.size() >= 22) {
                    break;
                }
                byteArrayOutputStream.write(0);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            j20VarM6461r.mo729e(0, byteArray.length, byteArray);
            j20 j20VarM6454j = ua0.m6454j(i5, c1351r);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream2.write(bArrM6061e3);
                byteArrayOutputStream2.write(b);
                byteArrayOutputStream2.write(b2);
                byteArrayOutputStream2.write(b3);
                byteArrayOutputStream2.write(b4);
                int iMo3528g = j20VarM6454j.mo3528g() + 23;
                while (byteArrayOutputStream2.size() < iMo3528g) {
                    byteArrayOutputStream2.write(0);
                }
                byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                lj0 lj0Var = new lj0(bArrM6061e3, bArrM6061e4, ua0.m6454j(i5, c1351r));
                lj0Var.f6362a = i4;
                lj0Var.f6363b = 0;
                int i6 = dr0Var.f3000d;
                int i7 = (1 << dr0Var.f2999c) - 1;
                int i8 = 0;
                while (i8 < i6) {
                    lj0Var.m4220a(23, i8 < i6 + (-1), byteArray2);
                    short s = (short) i8;
                    byteArray2[20] = (byte) (s >>> 8);
                    byteArray2[21] = (byte) s;
                    for (int i9 = 0; i9 < i7; i9++) {
                        byteArray2[22] = (byte) i9;
                        j20VarM6454j.mo729e(0, byteArray2.length, byteArray2);
                        j20VarM6454j.mo3526b(23, byteArray2);
                    }
                    j20VarM6461r.mo729e(23, i5, byteArray2);
                    i8++;
                }
                int iMo3528g2 = j20VarM6461r.mo3528g();
                byte[] bArr4 = new byte[iMo3528g2];
                j20VarM6461r.mo3526b(0, bArr4);
                j20Var.mo729e(0, iMo3528g2, bArr4);
                byte[] bArr5 = new byte[j20Var.mo3528g()];
                j20Var.mo3526b(0, bArr5);
                return bArr5;
            } catch (Exception e) {
                e = e;
                l41.m4043l(e.getMessage(), e);
                return bArr;
            }
        } catch (Exception e2) {
            e = e2;
            bArr = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m3246b(int i) {
        if (i < this.f4678m) {
            return m3247c(i < 129 ? f4671r[i] : new gr0(i));
        }
        return m3245a(i);
    }

    /* JADX INFO: renamed from: c */
    public final byte[] m3247c(gr0 gr0Var) {
        synchronized (this.f4677g) {
            try {
                byte[] bArr = (byte[]) this.f4677g.get(gr0Var);
                if (bArr != null) {
                    return bArr;
                }
                byte[] bArrM3245a = m3245a(gr0Var.f4301a);
                this.f4677g.put(gr0Var, bArrM3245a);
                return bArrM3245a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized int m3248d() {
        return this.f4680o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hr0.class != obj.getClass()) {
            return false;
        }
        hr0 hr0Var = (hr0) obj;
        if (this.f4680o != hr0Var.f4680o || this.f4675e != hr0Var.f4675e || !Arrays.equals(this.f4672b, hr0Var.f4672b)) {
            return false;
        }
        kr0 kr0Var = hr0Var.f4673c;
        kr0 kr0Var2 = this.f4673c;
        if (kr0Var2 == null ? kr0Var != null : !kr0Var2.equals(kr0Var)) {
            return false;
        }
        dr0 dr0Var = hr0Var.f4674d;
        dr0 dr0Var2 = this.f4674d;
        if (dr0Var2 == null ? dr0Var == null : dr0Var2.equals(dr0Var)) {
            return Arrays.equals(this.f4676f, hr0Var.f4676f);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final ir0 m3249f() {
        ir0 ir0Var;
        synchronized (this) {
            try {
                if (this.f4681p == null) {
                    this.f4681p = new ir0(this.f4673c, this.f4674d, m3247c(f4670q), this.f4672b);
                }
                ir0Var = this.f4681p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ir0Var;
    }

    @Override // p000.r60
    public final byte[] getEncoded() {
        C1462u c1462u = new C1462u();
        c1462u.m6363h(0);
        c1462u.m6363h(this.f4673c.f5990a);
        c1462u.m6363h(this.f4674d.f2997a);
        c1462u.m6361b(this.f4672b);
        c1462u.m6363h(this.f4680o);
        c1462u.m6363h(this.f4675e);
        byte[] bArr = this.f4676f;
        c1462u.m6363h(bArr.length);
        c1462u.m6361b(bArr);
        return c1462u.f11078a.toByteArray();
    }

    public final int hashCode() {
        int iM6079w = (sc2.m6079w(this.f4672b) + (this.f4680o * 31)) * 31;
        kr0 kr0Var = this.f4673c;
        int iHashCode = (iM6079w + (kr0Var != null ? kr0Var.hashCode() : 0)) * 31;
        dr0 dr0Var = this.f4674d;
        return sc2.m6079w(this.f4676f) + ((((iHashCode + (dr0Var != null ? dr0Var.hashCode() : 0)) * 31) + this.f4675e) * 31);
    }
}
