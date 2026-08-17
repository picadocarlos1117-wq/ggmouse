package p000;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class er0 implements r60 {

    /* JADX INFO: renamed from: a */
    public final dr0 f3420a;

    /* JADX INFO: renamed from: b */
    public final byte[] f3421b;

    /* JADX INFO: renamed from: c */
    public final byte[] f3422c;

    public er0(dr0 dr0Var, byte[] bArr, byte[] bArr2) {
        this.f3420a = dr0Var;
        this.f3421b = bArr;
        this.f3422c = bArr2;
    }

    /* JADX INFO: renamed from: a */
    public static er0 m2638a(Object obj) throws Throwable {
        if (obj instanceof er0) {
            return (er0) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            dr0 dr0Var = (dr0) dr0.f2996g.get(Integer.valueOf(dataInputStream.readInt()));
            byte[] bArr = new byte[dr0Var.f2998b];
            dataInputStream.readFully(bArr);
            byte[] bArr2 = new byte[dr0Var.f3000d * dr0Var.f2998b];
            dataInputStream.readFully(bArr2);
            return new er0(dr0Var, bArr, bArr2);
        }
        DataInputStream dataInputStream2 = null;
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return m2638a(o21.m4674o0((InputStream) obj));
            }
            l41.m4038g(obj, "cannot parse ");
            return null;
        }
        try {
            DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                er0 er0VarM2638a = m2638a(dataInputStream3);
                dataInputStream3.close();
                return er0VarM2638a;
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && er0.class == obj.getClass()) {
            er0 er0Var = (er0) obj;
            dr0 dr0Var = er0Var.f3420a;
            dr0 dr0Var2 = this.f3420a;
            if (dr0Var2 != null) {
                if (dr0Var2 != dr0Var) {
                    return false;
                }
            } else if (dr0Var == null) {
            }
            if (Arrays.equals(this.f3421b, er0Var.f3421b)) {
                return Arrays.equals(this.f3422c, er0Var.f3422c);
            }
        }
        return false;
    }

    @Override // p000.r60
    public final byte[] getEncoded() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = this.f3420a.f2997a;
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write((byte) i);
        try {
            byteArrayOutputStream.write(this.f3421b);
            byteArrayOutputStream.write(this.f3422c);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            l41.m4043l(e.getMessage(), e);
            return null;
        }
    }

    public final int hashCode() {
        dr0 dr0Var = this.f3420a;
        int iHashCode = dr0Var != null ? dr0Var.hashCode() : 0;
        return Arrays.hashCode(this.f3422c) + ((Arrays.hashCode(this.f3421b) + (iHashCode * 31)) * 31);
    }
}
