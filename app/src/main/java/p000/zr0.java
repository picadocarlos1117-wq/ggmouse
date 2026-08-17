package p000;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.example.ssmousepro.injection.TouchPipeline;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class zr0 extends ua0 {

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ int f13522q;

    /* JADX INFO: renamed from: r */
    public final SideSheetBehavior f13523r;

    public /* synthetic */ zr0(SideSheetBehavior sideSheetBehavior, int i) {
        this.f13522q = i;
        this.f13523r = sideSheetBehavior;
    }

    @Override // p000.ua0
    /* JADX INFO: renamed from: B */
    public final int mo6464B() {
        switch (this.f13522q) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // p000.ua0
    /* JADX INFO: renamed from: F */
    public final boolean mo6465F(float f) {
        switch (this.f13522q) {
            case 0:
                return f > TouchPipeline.SIZE;
            default:
                return f < TouchPipeline.SIZE;
        }
    }

    @Override // p000.ua0
    /* JADX INFO: renamed from: G */
    public final boolean mo6466G(View view) {
        switch (this.f13522q) {
            case 0:
                return view.getRight() < (mo6474s() - mo6475t()) / 2;
            default:
                return view.getLeft() > (mo6474s() + this.f13523r.f2100m) / 2;
        }
    }

    @Override // p000.ua0
    /* JADX INFO: renamed from: H */
    public final boolean mo6467H(float f, float f2) {
        switch (this.f13522q) {
            case 0:
                return Math.abs(f) > Math.abs(f2) && Math.abs(f) > 500.0f;
            default:
                return Math.abs(f) > Math.abs(f2) && Math.abs(f) > 500.0f;
        }
    }

    @Override // p000.ua0
    /* JADX INFO: renamed from: P */
    public final boolean mo6468P(View view, float f) {
        int i = this.f13522q;
        SideSheetBehavior sideSheetBehavior = this.f13523r;
        switch (i) {
            case 0:
                return Math.abs((f * sideSheetBehavior.f2098k) + ((float) view.getLeft())) > 0.5f;
            default:
                return Math.abs((f * sideSheetBehavior.f2098k) + ((float) view.getRight())) > 0.5f;
        }
    }

    @Override // p000.ua0
    /* JADX INFO: renamed from: d */
    public final int mo6469d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f13522q) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // p000.ua0
    /* JADX INFO: renamed from: d0 */
    public final void mo6470d0(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        switch (this.f13522q) {
            case 0:
                marginLayoutParams.leftMargin = i;
                break;
            default:
                marginLayoutParams.rightMargin = i;
                break;
        }
    }

    @Override // p000.ua0
    /* JADX INFO: renamed from: e */
    public final float mo6471e(int i) {
        switch (this.f13522q) {
            case 0:
                float fMo6475t = mo6475t();
                return (i - fMo6475t) / (mo6474s() - fMo6475t);
            default:
                float f = this.f13523r.f2100m;
                return (f - i) / (f - mo6474s());
        }
    }

    @Override // p000.ua0
    /* JADX INFO: renamed from: e0 */
    public final void mo6472e0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        int i3 = this.f13522q;
        SideSheetBehavior sideSheetBehavior = this.f13523r;
        switch (i3) {
            case 0:
                if (i <= sideSheetBehavior.f2100m) {
                    marginLayoutParams.leftMargin = i2;
                }
                break;
            default:
                int i4 = sideSheetBehavior.f2100m;
                if (i <= i4) {
                    marginLayoutParams.rightMargin = i4 - i;
                }
                break;
        }
    }

    @Override // p000.ua0
    /* JADX INFO: renamed from: q */
    public final int mo6473q(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f13522q) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // p000.ua0
    /* JADX INFO: renamed from: s */
    public final int mo6474s() {
        int i = this.f13522q;
        SideSheetBehavior sideSheetBehavior = this.f13523r;
        switch (i) {
            case 0:
                return Math.max(0, sideSheetBehavior.f2101n + sideSheetBehavior.f2102o);
            default:
                return Math.max(0, (sideSheetBehavior.f2100m - sideSheetBehavior.f2099l) - sideSheetBehavior.f2102o);
        }
    }

    @Override // p000.ua0
    /* JADX INFO: renamed from: t */
    public final int mo6475t() {
        int i = this.f13522q;
        SideSheetBehavior sideSheetBehavior = this.f13523r;
        switch (i) {
            case 0:
                return (-sideSheetBehavior.f2099l) - sideSheetBehavior.f2102o;
            default:
                return sideSheetBehavior.f2100m;
        }
    }

    @Override // p000.ua0
    /* JADX INFO: renamed from: v */
    public final int mo6476v() {
        int i = this.f13522q;
        SideSheetBehavior sideSheetBehavior = this.f13523r;
        switch (i) {
            case 0:
                return sideSheetBehavior.f2102o;
            default:
                return sideSheetBehavior.f2100m;
        }
    }

    @Override // p000.ua0
    /* JADX INFO: renamed from: w */
    public final int mo6477w() {
        switch (this.f13522q) {
            case 0:
                return -this.f13523r.f2099l;
            default:
                return mo6474s();
        }
    }

    @Override // p000.ua0
    /* JADX INFO: renamed from: x */
    public final int mo6478x(View view) {
        int i = this.f13522q;
        SideSheetBehavior sideSheetBehavior = this.f13523r;
        switch (i) {
            case 0:
                return view.getRight() + sideSheetBehavior.f2102o;
            default:
                return view.getLeft() - sideSheetBehavior.f2102o;
        }
    }

    @Override // p000.ua0
    /* JADX INFO: renamed from: y */
    public final int mo6479y(CoordinatorLayout coordinatorLayout) {
        switch (this.f13522q) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }
}
