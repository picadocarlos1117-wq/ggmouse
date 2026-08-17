package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class dc2 extends k01 implements r60 {

    /* JADX INFO: renamed from: c */
    public final ac2 f2885c;

    /* JADX INFO: renamed from: d */
    public final byte[] f2886d;

    /* JADX INFO: renamed from: e */
    public final byte[] f2887e;

    /* JADX INFO: renamed from: f */
    public final byte[] f2888f;

    /* JADX INFO: renamed from: g */
    public final byte[] f2889g;

    /* JADX INFO: renamed from: m */
    public volatile long f2890m;

    /* JADX INFO: renamed from: n */
    public volatile C0017ag f2891n;

    /* JADX WARN: Illegal instructions before constructor call */
    public dc2(cc2 cc2Var) {
        ac2 ac2Var = cc2Var.f1759a;
        hc2 hc2Var = ac2Var.f143b;
        super(true, hc2Var.f4530e);
        this.f2885c = ac2Var;
        int i = hc2Var.f4531f;
        this.f2890m = cc2Var.f1760b;
        byte[] bArr = cc2Var.f1762d;
        if (bArr == null) {
            this.f2886d = new byte[i];
        } else {
            if (bArr.length != i) {
                f40.m2713i("size of secretKeySeed needs to be equal size of digest");
                throw null;
            }
            this.f2886d = bArr;
        }
        byte[] bArr2 = cc2Var.f1763e;
        if (bArr2 == null) {
            this.f2887e = new byte[i];
        } else {
            if (bArr2.length != i) {
                f40.m2713i("size of secretKeyPRF needs to be equal size of digest");
                throw null;
            }
            this.f2887e = bArr2;
        }
        byte[] bArr3 = cc2Var.f1764f;
        if (bArr3 == null) {
            this.f2888f = new byte[i];
        } else {
            if (bArr3.length != i) {
                f40.m2713i("size of publicSeed needs to be equal size of digest");
                throw null;
            }
            this.f2888f = bArr3;
        }
        byte[] bArr4 = cc2Var.f1765g;
        if (bArr4 == null) {
            this.f2889g = new byte[i];
        } else {
            if (bArr4.length != i) {
                f40.m2713i("size of root needs to be equal size of digest");
                throw null;
            }
            this.f2889g = bArr4;
        }
        C0017ag c0017ag = cc2Var.f1766h;
        if (c0017ag == null) {
            c0017ag = (!o21.m4649T(ac2Var.f144c, cc2Var.f1760b) || bArr3 == null || bArr == null) ? new C0017ag(cc2Var.f1761c + 1) : new C0017ag(ac2Var, cc2Var.f1760b, bArr3, bArr);
        }
        this.f2891n = c0017ag;
        long j = cc2Var.f1761c;
        if (j < 0 || j == this.f2891n.f226b) {
            return;
        }
        f40.m2713i("maxIndex set but not reflected in state");
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m2344a() {
        byte[] bArrM6064h;
        synchronized (this) {
            try {
                ac2 ac2Var = this.f2885c;
                int i = ac2Var.f143b.f4531f;
                int i2 = (ac2Var.f144c + 7) / 8;
                int i3 = i2 + i;
                int i4 = i3 + i;
                int i5 = i4 + i;
                byte[] bArr = new byte[i + i5];
                o21.m4681t(0, bArr, o21.m4687w0(i2, this.f2890m));
                o21.m4681t(i2, bArr, this.f2886d);
                o21.m4681t(i3, bArr, this.f2887e);
                o21.m4681t(i4, bArr, this.f2888f);
                o21.m4681t(i5, bArr, this.f2889g);
                try {
                    C0017ag c0017ag = this.f2891n;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    objectOutputStream.writeObject(c0017ag);
                    objectOutputStream.flush();
                    bArrM6064h = sc2.m6064h(bArr, byteArrayOutputStream.toByteArray());
                } catch (IOException e) {
                    throw new IllegalStateException("error serializing bds state: " + e.getMessage(), e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArrM6064h;
    }

    @Override // p000.r60
    public final byte[] getEncoded() {
        byte[] bArrM2344a;
        synchronized (this) {
            bArrM2344a = m2344a();
        }
        return bArrM2344a;
    }
}
