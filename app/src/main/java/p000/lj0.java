package p000;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class lj0 {

    /* JADX INFO: renamed from: a */
    public int f6362a;

    /* JADX INFO: renamed from: b */
    public int f6363b;

    /* JADX INFO: renamed from: c */
    public Object f6364c;

    /* JADX INFO: renamed from: d */
    public Object f6365d;

    /* JADX INFO: renamed from: e */
    public Object f6366e;

    public lj0(byte[] bArr, byte[] bArr2, j20 j20Var) {
        this.f6365d = bArr;
        this.f6366e = bArr2;
        this.f6364c = j20Var;
    }

    /* JADX INFO: renamed from: a */
    public void m4220a(int i, boolean z, byte[] bArr) {
        int length = bArr.length - i;
        j20 j20Var = (j20) this.f6364c;
        if (length < j20Var.mo3528g()) {
            f40.m2713i("target length is less than digest size.");
            return;
        }
        byte[] bArr2 = (byte[]) this.f6365d;
        j20Var.mo729e(0, bArr2.length, bArr2);
        j20Var.mo728c((byte) (this.f6362a >>> 24));
        j20Var.mo728c((byte) (this.f6362a >>> 16));
        j20Var.mo728c((byte) (this.f6362a >>> 8));
        j20Var.mo728c((byte) this.f6362a);
        j20Var.mo728c((byte) (this.f6363b >>> 8));
        j20Var.mo728c((byte) this.f6363b);
        j20Var.mo728c((byte) -1);
        byte[] bArr3 = (byte[]) this.f6366e;
        j20Var.mo729e(0, bArr3.length, bArr3);
        j20Var.mo3526b(i, bArr);
        if (z) {
            this.f6363b++;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m4221b() {
        mj0 mj0Var = (mj0) this.f6364c;
        int i = this.f6363b;
        int i2 = this.f6362a;
        int i3 = (i / i2) + 1;
        if (i3 >= 256) {
            throw new C0656fx("HKDF cannot generate more than 255 blocks of HashLen size");
        }
        if (i != 0) {
            mj0Var.f7003a.mo729e(0, i2, (byte[]) this.f6366e);
        }
        byte[] bArr = (byte[]) this.f6365d;
        mj0Var.f7003a.mo729e(0, bArr.length, bArr);
        mj0Var.f7003a.mo728c((byte) i3);
        mj0Var.m4426a((byte[]) this.f6366e);
    }

    /* JADX INFO: renamed from: c */
    public void m4222c(bb2 bb2Var, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ma2 ma2Var = (ma2) it.next();
            if ((ma2Var.f6733a.mo3815c() & 8) != 0) {
                ((View) this.f6365d).setTranslationY(AbstractC0779j6.m3570c(ma2Var.f6733a.mo3814b(), this.f6363b, 0));
                return;
            }
        }
    }
}
