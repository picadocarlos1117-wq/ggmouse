package p000;

import android.view.View;
import android.view.ViewGroup;
import com.example.ssmousepro.injection.TouchPipeline;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: oi */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1183oi extends ki0 {

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ int f7794q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ AbstractC0727hu f7795r;

    public /* synthetic */ C1183oi(AbstractC0727hu abstractC0727hu, int i) {
        this.f7794q = i;
        this.f7795r = abstractC0727hu;
    }

    @Override // p000.ki0
    /* JADX INFO: renamed from: C */
    public int mo3879C(View view) {
        switch (this.f7794q) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f7795r;
                return sideSheetBehavior.f2099l + sideSheetBehavior.f2102o;
            default:
                return super.mo3879C(view);
        }
    }

    @Override // p000.ki0
    /* JADX INFO: renamed from: D */
    public int mo3880D() {
        switch (this.f7794q) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f7795r;
                return bottomSheetBehavior.f1963I ? bottomSheetBehavior.f1974T : bottomSheetBehavior.f1961G;
            default:
                return super.mo3880D();
        }
    }

    @Override // p000.ki0
    /* JADX INFO: renamed from: M */
    public final void mo3882M(int i) {
        int i2 = this.f7794q;
        AbstractC0727hu abstractC0727hu = this.f7795r;
        switch (i2) {
            case 0:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) abstractC0727hu;
                    if (bottomSheetBehavior.f1965K) {
                        bottomSheetBehavior.m1657I(1);
                    }
                }
                break;
            default:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) abstractC0727hu;
                    if (sideSheetBehavior.f2094g) {
                        sideSheetBehavior.m1695w(1);
                    }
                }
                break;
        }
    }

    @Override // p000.ki0
    /* JADX INFO: renamed from: N */
    public final void mo3883N(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i3 = this.f7794q;
        AbstractC0727hu abstractC0727hu = this.f7795r;
        switch (i3) {
            case 0:
                ((BottomSheetBehavior) abstractC0727hu).m1670y(i2);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) abstractC0727hu;
                WeakReference weakReference = sideSheetBehavior.f2104q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f2088a.mo6472e0(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f2109v;
                if (!linkedHashSet.isEmpty()) {
                    sideSheetBehavior.f2088a.mo6471e(i);
                    Iterator it = linkedHashSet.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        l41.m4035b();
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005e  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e6  */
    @Override // p000.ki0
    /* JADX INFO: renamed from: O */
    public final void mo3884O(View view, float f, float f2) {
        int i = this.f7794q;
        int i2 = 3;
        AbstractC0727hu abstractC0727hu = this.f7795r;
        switch (i) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) abstractC0727hu;
                if (f2 < TouchPipeline.SIZE) {
                    if (!bottomSheetBehavior.f1983b) {
                        int top = view.getTop();
                        System.currentTimeMillis();
                        if (top > bottomSheetBehavior.f1959E) {
                            i2 = 6;
                        }
                    }
                } else if (bottomSheetBehavior.f1963I && bottomSheetBehavior.m1658J(view, f2)) {
                    if (Math.abs(f) >= Math.abs(f2) || f2 <= bottomSheetBehavior.f1987d) {
                        if (view.getTop() > (bottomSheetBehavior.m1651C() + bottomSheetBehavior.f1974T) / 2) {
                            i2 = 5;
                        } else if (!bottomSheetBehavior.f1983b && Math.abs(view.getTop() - bottomSheetBehavior.m1651C()) >= Math.abs(view.getTop() - bottomSheetBehavior.f1959E)) {
                            i2 = 6;
                        }
                    } else {
                        i2 = 5;
                    }
                } else if (f2 == TouchPipeline.SIZE || Math.abs(f) > Math.abs(f2)) {
                    int top2 = view.getTop();
                    if (!bottomSheetBehavior.f1983b) {
                        int i3 = bottomSheetBehavior.f1959E;
                        if (top2 < i3) {
                            if (top2 >= Math.abs(top2 - bottomSheetBehavior.f1961G)) {
                            }
                        } else if (Math.abs(top2 - i3) >= Math.abs(top2 - bottomSheetBehavior.f1961G)) {
                            i2 = 4;
                        }
                        i2 = 6;
                    } else if (Math.abs(top2 - bottomSheetBehavior.f1958D) >= Math.abs(top2 - bottomSheetBehavior.f1961G)) {
                        i2 = 4;
                    }
                } else {
                    if (!bottomSheetBehavior.f1983b) {
                        int top3 = view.getTop();
                        if (Math.abs(top3 - bottomSheetBehavior.f1959E) < Math.abs(top3 - bottomSheetBehavior.f1961G)) {
                            i2 = 6;
                        }
                    }
                    i2 = 4;
                }
                bottomSheetBehavior.m1659K(view, i2, true);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) abstractC0727hu;
                if (!sideSheetBehavior.f2088a.mo6465F(f)) {
                    if (sideSheetBehavior.f2088a.mo6468P(view, f)) {
                        if (sideSheetBehavior.f2088a.mo6467H(f, f2) || sideSheetBehavior.f2088a.mo6466G(view)) {
                            i2 = 5;
                        }
                    } else if (f == TouchPipeline.SIZE || Math.abs(f) <= Math.abs(f2)) {
                        int left = view.getLeft();
                        if (Math.abs(left - sideSheetBehavior.f2088a.mo6474s()) >= Math.abs(left - sideSheetBehavior.f2088a.mo6475t())) {
                            i2 = 5;
                        }
                    } else {
                        i2 = 5;
                    }
                }
                sideSheetBehavior.m1697y(view, i2, true);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0046  */
    @Override // p000.ki0
    /* JADX INFO: renamed from: d0 */
    public final boolean mo3885d0(View view, int i) {
        WeakReference weakReference;
        WeakReference weakReference2;
        int i2 = this.f7794q;
        AbstractC0727hu abstractC0727hu = this.f7795r;
        switch (i2) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) abstractC0727hu;
                int i3 = bottomSheetBehavior.f1966L;
                if (i3 != 1 && !bottomSheetBehavior.f1984b0) {
                    if (i3 == 3 && bottomSheetBehavior.f1980Z == i) {
                        WeakReference weakReference3 = bottomSheetBehavior.f1976V;
                        View view2 = weakReference3 != null ? (View) weakReference3.get() : null;
                        if (view2 == null || !view2.canScrollVertically(-1)) {
                            System.currentTimeMillis();
                            weakReference = bottomSheetBehavior.f1975U;
                            if (weakReference != null) {
                                return true;
                            }
                        }
                    } else {
                        System.currentTimeMillis();
                        weakReference = bottomSheetBehavior.f1975U;
                        if (weakReference != null && weakReference.get() == view) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) abstractC0727hu;
                return (sideSheetBehavior.f2095h == 1 || (weakReference2 = sideSheetBehavior.f2103p) == null || weakReference2.get() != view) ? false : true;
        }
    }

    @Override // p000.ki0
    /* JADX INFO: renamed from: l */
    public final int mo3886l(View view, int i) {
        switch (this.f7794q) {
            case 0:
                return view.getLeft();
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f7795r;
                return rc2.m5795m(i, sideSheetBehavior.f2088a.mo6477w(), sideSheetBehavior.f2088a.mo6476v());
        }
    }

    @Override // p000.ki0
    /* JADX INFO: renamed from: m */
    public final int mo3887m(View view, int i) {
        switch (this.f7794q) {
            case 0:
                return rc2.m5795m(i, ((BottomSheetBehavior) this.f7795r).m1651C(), mo3880D());
            default:
                return view.getTop();
        }
    }
}
