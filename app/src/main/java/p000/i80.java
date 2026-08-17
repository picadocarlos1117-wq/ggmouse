package p000;

import android.view.View;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class i80 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4861a = 1;

    /* JADX INFO: renamed from: b */
    public int f4862b;

    /* JADX INFO: renamed from: c */
    public int f4863c;

    /* JADX INFO: renamed from: d */
    public boolean f4864d;

    /* JADX INFO: renamed from: e */
    public boolean f4865e;

    /* JADX INFO: renamed from: f */
    public Object f4866f;

    public i80(int i) {
        this.f4862b = i;
        byte[] bArr = new byte[131];
        this.f4866f = bArr;
        bArr[2] = 1;
    }

    /* JADX INFO: renamed from: a */
    public void m3382a(int i, int i2, byte[] bArr) {
        if (this.f4864d) {
            int i3 = i2 - i;
            byte[] bArr2 = (byte[]) this.f4866f;
            int length = bArr2.length;
            int i4 = this.f4863c + i3;
            if (length < i4) {
                this.f4866f = Arrays.copyOf(bArr2, i4 * 2);
            }
            System.arraycopy(bArr, i, (byte[]) this.f4866f, this.f4863c, i3);
            this.f4863c += i3;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m3383b() {
        boolean z = this.f4864d;
        q50 q50Var = (q50) this.f4866f;
        this.f4863c = z ? q50Var.mo2790g() : q50Var.mo2794k();
    }

    /* JADX INFO: renamed from: c */
    public void m3384c(View view, int i) {
        q50 q50Var = (q50) this.f4866f;
        int iMo2795l = Integer.MIN_VALUE == q50Var.f9390a ? 0 : q50Var.mo2795l() - q50Var.f9390a;
        if (iMo2795l >= 0) {
            boolean z = this.f4864d;
            q50 q50Var2 = (q50) this.f4866f;
            if (z) {
                int iMo2785b = q50Var2.mo2785b(view);
                q50 q50Var3 = (q50) this.f4866f;
                this.f4863c = (Integer.MIN_VALUE != q50Var3.f9390a ? q50Var3.mo2795l() - q50Var3.f9390a : 0) + iMo2785b;
            } else {
                this.f4863c = q50Var2.mo2788e(view);
            }
            this.f4862b = i;
            return;
        }
        this.f4862b = i;
        boolean z2 = this.f4864d;
        q50 q50Var4 = (q50) this.f4866f;
        if (!z2) {
            int iMo2788e = q50Var4.mo2788e(view);
            int iMo2794k = iMo2788e - ((q50) this.f4866f).mo2794k();
            this.f4863c = iMo2788e;
            if (iMo2794k > 0) {
                int iMo2790g = (((q50) this.f4866f).mo2790g() - Math.min(0, (((q50) this.f4866f).mo2790g() - iMo2795l) - ((q50) this.f4866f).mo2785b(view))) - (((q50) this.f4866f).mo2786c(view) + iMo2788e);
                if (iMo2790g < 0) {
                    this.f4863c -= Math.min(iMo2794k, -iMo2790g);
                    return;
                }
                return;
            }
            return;
        }
        int iMo2790g2 = (q50Var4.mo2790g() - iMo2795l) - ((q50) this.f4866f).mo2785b(view);
        this.f4863c = ((q50) this.f4866f).mo2790g() - iMo2790g2;
        if (iMo2790g2 > 0) {
            int iMo2786c = this.f4863c - ((q50) this.f4866f).mo2786c(view);
            int iMo2794k2 = ((q50) this.f4866f).mo2794k();
            int iMin = iMo2786c - (Math.min(((q50) this.f4866f).mo2788e(view) - iMo2794k2, 0) + iMo2794k2);
            if (iMin < 0) {
                this.f4863c = Math.min(iMo2790g2, -iMin) + this.f4863c;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m3385d(int i) {
        if (!this.f4864d) {
            return false;
        }
        this.f4863c -= i;
        this.f4864d = false;
        this.f4865e = true;
        return true;
    }

    /* JADX INFO: renamed from: e */
    public void m3386e(int i) {
        this.f4864d |= i > 0;
        this.f4862b += i;
    }

    /* JADX INFO: renamed from: f */
    public void m3387f() {
        switch (this.f4861a) {
            case 1:
                this.f4862b = -1;
                this.f4863c = Integer.MIN_VALUE;
                this.f4864d = false;
                this.f4865e = false;
                break;
            default:
                this.f4864d = false;
                this.f4865e = false;
                break;
        }
    }

    /* JADX INFO: renamed from: g */
    public void m3388g(int i) {
        ki0.m3864h(!this.f4864d);
        boolean z = i == this.f4862b;
        this.f4864d = z;
        if (z) {
            this.f4863c = 3;
            this.f4865e = false;
        }
    }

    public String toString() {
        switch (this.f4861a) {
            case 1:
                return "AnchorInfo{mPosition=" + this.f4862b + ", mCoordinate=" + this.f4863c + ", mLayoutFromEnd=" + this.f4864d + ", mValid=" + this.f4865e + '}';
            default:
                return super.toString();
        }
    }

    public i80(sd1 sd1Var) {
        this.f4866f = sd1Var;
    }

    public i80() {
        m3387f();
    }
}
