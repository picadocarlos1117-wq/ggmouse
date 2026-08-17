package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class kc2 extends k01 implements r60 {

    /* JADX INFO: renamed from: c */
    public final hc2 f5749c;

    /* JADX INFO: renamed from: d */
    public final byte[] f5750d;

    /* JADX INFO: renamed from: e */
    public final byte[] f5751e;

    /* JADX INFO: renamed from: f */
    public final byte[] f5752f;

    /* JADX INFO: renamed from: g */
    public final byte[] f5753g;

    /* JADX INFO: renamed from: m */
    public volatile C1663zf f5754m;

    /* JADX WARN: Illegal instructions before constructor call */
    public kc2(jc2 jc2Var) {
        hc2 hc2Var = jc2Var.f5364a;
        super(true, hc2Var.f4530e);
        this.f5749c = hc2Var;
        int i = hc2Var.f4531f;
        byte[] bArr = jc2Var.f5367d;
        if (bArr == null) {
            this.f5750d = new byte[i];
        } else {
            if (bArr.length != i) {
                f40.m2713i("size of secretKeySeed needs to be equal size of digest");
                throw null;
            }
            this.f5750d = bArr;
        }
        byte[] bArr2 = jc2Var.f5368e;
        if (bArr2 == null) {
            this.f5751e = new byte[i];
        } else {
            if (bArr2.length != i) {
                f40.m2713i("size of secretKeyPRF needs to be equal size of digest");
                throw null;
            }
            this.f5751e = bArr2;
        }
        byte[] bArr3 = jc2Var.f5369f;
        if (bArr3 == null) {
            this.f5752f = new byte[i];
        } else {
            if (bArr3.length != i) {
                f40.m2713i("size of publicSeed needs to be equal size of digest");
                throw null;
            }
            this.f5752f = bArr3;
        }
        byte[] bArr4 = jc2Var.f5370g;
        if (bArr4 == null) {
            this.f5753g = new byte[i];
        } else {
            if (bArr4.length != i) {
                f40.m2713i("size of root needs to be equal size of digest");
                throw null;
            }
            this.f5753g = bArr4;
        }
        C1663zf c1663zf = jc2Var.f5371h;
        if (c1663zf != null) {
            this.f5754m = c1663zf;
        } else {
            int i2 = jc2Var.f5365b;
            int i3 = 1 << hc2Var.f4527b;
            if (i2 >= i3 - 2 || bArr3 == null || bArr == null) {
                C1663zf c1663zf2 = new C1663zf(new C0599ed(hc2Var.f4532g), hc2Var.f4527b, hc2Var.f4528c, i2);
                c1663zf2.f13392p = i3 - 1;
                c1663zf2.f13390n = i2;
                c1663zf2.f13391o = true;
                this.f5754m = c1663zf2;
            } else {
                h91 h91Var = new h91(new lr0(1));
                C0599ed c0599ed = new C0599ed(hc2Var.f4532g);
                int i4 = hc2Var.f4527b;
                C1663zf c1663zf3 = new C1663zf(c0599ed, i4, hc2Var.f4528c, (1 << i4) - 1);
                c1663zf3.m7304a(bArr3, bArr, h91Var);
                while (c1663zf3.f13390n < i2) {
                    c1663zf3.m7305b(bArr3, bArr, h91Var);
                    c1663zf3.f13391o = false;
                }
                this.f5754m = c1663zf3;
            }
        }
        int i5 = jc2Var.f5366c;
        if (i5 < 0 || i5 == this.f5754m.f13392p) {
            return;
        }
        f40.m2713i("maxIndex set but not reflected in state");
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m3817a() {
        byte[] bArrM6064h;
        synchronized (this) {
            try {
                int i = this.f5749c.f4531f;
                int i2 = i + 4;
                int i3 = i2 + i;
                int i4 = i3 + i;
                byte[] bArr = new byte[i + i4];
                sc2.m6081y(this.f5754m.f13390n, 0, bArr);
                o21.m4681t(4, bArr, this.f5750d);
                o21.m4681t(i2, bArr, this.f5751e);
                o21.m4681t(i3, bArr, this.f5752f);
                o21.m4681t(i4, bArr, this.f5753g);
                try {
                    C1663zf c1663zf = this.f5754m;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    objectOutputStream.writeObject(c1663zf);
                    objectOutputStream.flush();
                    bArrM6064h = sc2.m6064h(bArr, byteArrayOutputStream.toByteArray());
                } catch (IOException e) {
                    throw new RuntimeException("error serializing bds state: " + e.getMessage());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArrM6064h;
    }

    @Override // p000.r60
    public final byte[] getEncoded() {
        byte[] bArrM3817a;
        synchronized (this) {
            bArrM3817a = m3817a();
        }
        return bArrM3817a;
    }
}
