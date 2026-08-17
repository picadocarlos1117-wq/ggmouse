package p000;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class sj0 extends fr0 {

    /* JADX INFO: renamed from: b */
    public final int f10417b;

    /* JADX INFO: renamed from: c */
    public final ir0 f10418c;

    public sj0(int i, ir0 ir0Var) {
        super(false);
        if (ir0Var == null) {
            l41.m4051t("lmsPublicKey");
            throw null;
        }
        this.f10417b = i;
        this.f10418c = ir0Var;
    }

    /* JADX INFO: renamed from: a */
    public static sj0 m6105a(Object obj) {
        if (obj instanceof sj0) {
            return (sj0) obj;
        }
        if (obj instanceof DataInputStream) {
            return new sj0(((DataInputStream) obj).readInt(), ir0.m3478a(obj));
        }
        DataInputStream dataInputStream = null;
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return m6105a(o21.m4674o0((InputStream) obj));
            }
            l41.m4038g(obj, "cannot parse ");
            return null;
        }
        try {
            DataInputStream dataInputStream2 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                sj0 sj0VarM6105a = m6105a(dataInputStream2);
                dataInputStream2.close();
                return sj0VarM6105a;
            } catch (Throwable th) {
                th = th;
                dataInputStream = dataInputStream2;
                if (dataInputStream != null) {
                    dataInputStream.close();
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
        if (obj == null || sj0.class != obj.getClass()) {
            return false;
        }
        sj0 sj0Var = (sj0) obj;
        if (this.f10417b != sj0Var.f10417b) {
            return false;
        }
        return this.f10418c.equals(sj0Var.f10418c);
    }

    @Override // p000.r60
    public final byte[] getEncoded() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = this.f10417b;
        byteArrayOutputStream.write((byte) (i >>> 24));
        byteArrayOutputStream.write((byte) (i >>> 16));
        byteArrayOutputStream.write((byte) (i >>> 8));
        byteArrayOutputStream.write((byte) i);
        try {
            byteArrayOutputStream.write(this.f10418c.m3479b());
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            l41.m4043l(e.getMessage(), e);
            return null;
        }
    }

    public final int hashCode() {
        return this.f10418c.hashCode() + (this.f10417b * 31);
    }
}
