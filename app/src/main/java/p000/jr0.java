package p000;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class jr0 implements r60 {

    /* JADX INFO: renamed from: a */
    public final int f5497a;

    /* JADX INFO: renamed from: b */
    public final er0 f5498b;

    /* JADX INFO: renamed from: c */
    public final kr0 f5499c;

    /* JADX INFO: renamed from: d */
    public final byte[][] f5500d;

    public jr0(int i, er0 er0Var, kr0 kr0Var, byte[][] bArr) {
        this.f5497a = i;
        this.f5498b = er0Var;
        this.f5499c = kr0Var;
        this.f5500d = bArr;
    }

    /* JADX INFO: renamed from: a */
    public static jr0 m3706a(Object obj) throws Throwable {
        if (obj instanceof jr0) {
            return (jr0) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            int i = dataInputStream.readInt();
            er0 er0VarM2638a = er0.m2638a(obj);
            kr0 kr0Var = (kr0) kr0.f5989e.get(Integer.valueOf(dataInputStream.readInt()));
            int i2 = kr0Var.f5992c;
            byte[][] bArr = new byte[i2][];
            for (int i3 = 0; i3 < i2; i3++) {
                byte[] bArr2 = new byte[kr0Var.f5991b];
                bArr[i3] = bArr2;
                dataInputStream.readFully(bArr2);
            }
            return new jr0(i, er0VarM2638a, kr0Var, bArr);
        }
        DataInputStream dataInputStream2 = null;
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return m3706a(o21.m4674o0((InputStream) obj));
            }
            l41.m4038g(obj, "cannot parse ");
            return null;
        }
        try {
            DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                jr0 jr0VarM3706a = m3706a(dataInputStream3);
                dataInputStream3.close();
                return jr0VarM3706a;
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

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0032, code lost:
    
        if (r1 != null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            if (r3 != r4) goto L4
            r3 = 1
            return r3
        L4:
            r0 = 0
            if (r4 == 0) goto L3e
            java.lang.Class<jr0> r1 = p000.jr0.class
            java.lang.Class r2 = r4.getClass()
            if (r1 == r2) goto L10
            goto L3e
        L10:
            jr0 r4 = (p000.jr0) r4
            int r1 = r3.f5497a
            int r2 = r4.f5497a
            if (r1 == r2) goto L19
            goto L3e
        L19:
            er0 r1 = r4.f5498b
            er0 r2 = r3.f5498b
            if (r2 == 0) goto L26
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L29
            goto L3e
        L26:
            if (r1 == 0) goto L29
            goto L3e
        L29:
            kr0 r1 = r4.f5499c
            kr0 r2 = r3.f5499c
            if (r2 == 0) goto L32
            if (r2 == r1) goto L35
            return r0
        L32:
            if (r1 == 0) goto L35
            goto L3e
        L35:
            byte[][] r3 = r3.f5500d
            byte[][] r4 = r4.f5500d
            boolean r3 = java.util.Arrays.deepEquals(r3, r4)
            return r3
        L3e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.jr0.equals(java.lang.Object):boolean");
    }

    @Override // p000.r60
    public final byte[] getEncoded() {
        C1462u c1462u = new C1462u();
        c1462u.m6363h(this.f5497a);
        c1462u.m6361b(this.f5498b.getEncoded());
        c1462u.m6363h(this.f5499c.f5990a);
        byte[][] bArr = this.f5500d;
        try {
            int length = bArr.length;
            int i = 0;
            while (true) {
                ByteArrayOutputStream byteArrayOutputStream = c1462u.f11078a;
                if (i >= length) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr[i]);
                i++;
            }
        } catch (Exception e) {
            l41.m4043l(e.getMessage(), e);
            return null;
        }
    }

    public final int hashCode() {
        int i = this.f5497a * 31;
        er0 er0Var = this.f5498b;
        int iHashCode = (i + (er0Var != null ? er0Var.hashCode() : 0)) * 31;
        kr0 kr0Var = this.f5499c;
        return Arrays.deepHashCode(this.f5500d) + ((iHashCode + (kr0Var != null ? kr0Var.hashCode() : 0)) * 31);
    }
}
