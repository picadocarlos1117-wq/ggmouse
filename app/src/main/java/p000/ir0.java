package p000;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class ir0 extends fr0 {

    /* JADX INFO: renamed from: b */
    public final kr0 f5135b;

    /* JADX INFO: renamed from: c */
    public final dr0 f5136c;

    /* JADX INFO: renamed from: d */
    public final byte[] f5137d;

    /* JADX INFO: renamed from: e */
    public final byte[] f5138e;

    public ir0(kr0 kr0Var, dr0 dr0Var, byte[] bArr, byte[] bArr2) {
        super(false);
        this.f5135b = kr0Var;
        this.f5136c = dr0Var;
        this.f5137d = sc2.m6061e(bArr2);
        this.f5138e = sc2.m6061e(bArr);
    }

    /* JADX INFO: renamed from: a */
    public static ir0 m3478a(Object obj) throws Throwable {
        if (obj instanceof ir0) {
            return (ir0) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            kr0 kr0Var = (kr0) kr0.f5989e.get(Integer.valueOf(dataInputStream.readInt()));
            dr0 dr0Var = (dr0) dr0.f2996g.get(Integer.valueOf(dataInputStream.readInt()));
            byte[] bArr = new byte[16];
            dataInputStream.readFully(bArr);
            byte[] bArr2 = new byte[kr0Var.f5991b];
            dataInputStream.readFully(bArr2);
            return new ir0(kr0Var, dr0Var, bArr2, bArr);
        }
        DataInputStream dataInputStream2 = null;
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return m3478a(o21.m4674o0((InputStream) obj));
            }
            l41.m4038g(obj, "cannot parse ");
            return null;
        }
        try {
            DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                ir0 ir0VarM3478a = m3478a(dataInputStream3);
                dataInputStream3.close();
                return ir0VarM3478a;
            } catch (Throwable th) {
                th = th;
                dataInputStream2 = dataInputStream3;
                if (dataInputStream2 != null) {
                    dataInputStream2.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m3479b() {
        C1462u c1462u = new C1462u();
        c1462u.m6363h(this.f5135b.f5990a);
        c1462u.m6363h(this.f5136c.f2997a);
        c1462u.m6361b(this.f5137d);
        c1462u.m6361b(this.f5138e);
        return c1462u.f11078a.toByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ir0.class != obj.getClass()) {
            return false;
        }
        ir0 ir0Var = (ir0) obj;
        if (this.f5135b.equals(ir0Var.f5135b) && this.f5136c.equals(ir0Var.f5136c) && Arrays.equals(this.f5137d, ir0Var.f5137d)) {
            return Arrays.equals(this.f5138e, ir0Var.f5138e);
        }
        return false;
    }

    @Override // p000.r60
    public final byte[] getEncoded() {
        return m3479b();
    }

    public final int hashCode() {
        return sc2.m6079w(this.f5138e) + ((sc2.m6079w(this.f5137d) + ((this.f5136c.hashCode() + (this.f5135b.hashCode() * 31)) * 31)) * 31);
    }
}
