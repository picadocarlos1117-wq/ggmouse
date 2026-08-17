package p000;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RunnableC0062a;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class zj1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public int f13432a;

    /* JADX INFO: renamed from: b */
    public int f13433b;

    /* JADX INFO: renamed from: c */
    public OverScroller f13434c;

    /* JADX INFO: renamed from: d */
    public Interpolator f13435d;

    /* JADX INFO: renamed from: e */
    public boolean f13436e;

    /* JADX INFO: renamed from: f */
    public boolean f13437f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ RecyclerView f13438g;

    public zj1(RecyclerView recyclerView) {
        this.f13438g = recyclerView;
        cj1 cj1Var = RecyclerView.f871K0;
        this.f13435d = cj1Var;
        this.f13436e = false;
        this.f13437f = false;
        this.f13434c = new OverScroller(recyclerView.getContext(), cj1Var);
    }

    /* JADX INFO: renamed from: a */
    public final void m7317a(int i, int i2) {
        RecyclerView recyclerView = this.f13438g;
        recyclerView.setScrollState(2);
        this.f13433b = 0;
        this.f13432a = 0;
        Interpolator interpolator = this.f13435d;
        cj1 cj1Var = RecyclerView.f871K0;
        if (interpolator != cj1Var) {
            this.f13435d = cj1Var;
            this.f13434c = new OverScroller(recyclerView.getContext(), cj1Var);
        }
        this.f13434c.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        m7318b();
    }

    /* JADX INFO: renamed from: b */
    public final void m7318b() {
        if (this.f13436e) {
            this.f13437f = true;
            return;
        }
        RecyclerView recyclerView = this.f13438g;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = i72.f4849a;
        s62.m5992m(recyclerView, this);
    }

    /* JADX INFO: renamed from: c */
    public final void m7319c(int i, int i2, int i3, Interpolator interpolator) {
        RecyclerView recyclerView = this.f13438g;
        if (i3 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i);
            int iAbs2 = Math.abs(i2);
            boolean z = iAbs > iAbs2;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z) {
                iAbs = iAbs2;
            }
            i3 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }
        int i4 = i3;
        if (interpolator == null) {
            interpolator = RecyclerView.f871K0;
        }
        if (this.f13435d != interpolator) {
            this.f13435d = interpolator;
            this.f13434c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f13433b = 0;
        this.f13432a = 0;
        recyclerView.setScrollState(2);
        this.f13434c.startScroll(0, 0, i, i2, i4);
        m7318b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        RecyclerView recyclerView = this.f13438g;
        int[] iArr = recyclerView.f942x0;
        if (recyclerView.f931s == null) {
            recyclerView.removeCallbacks(this);
            this.f13434c.abortAnimation();
            return;
        }
        this.f13437f = false;
        this.f13436e = true;
        recyclerView.m593n();
        OverScroller overScroller = this.f13434c;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i6 = currX - this.f13432a;
            int i7 = currY - this.f13433b;
            this.f13432a = currX;
            this.f13433b = currY;
            int iM553m = RecyclerView.m553m(i6, recyclerView.f889M, recyclerView.f891O, recyclerView.getWidth());
            int iM553m2 = RecyclerView.m553m(i7, recyclerView.f890N, recyclerView.f892P, recyclerView.getHeight());
            int[] iArr2 = recyclerView.f942x0;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.m598s(iM553m, iM553m2, 1, iArr2, null)) {
                iM553m -= iArr[0];
                iM553m2 -= iArr[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.m592l(iM553m, iM553m2);
            }
            if (recyclerView.f929r != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.m580c0(iM553m, iM553m2, iArr);
                int i8 = iArr[0];
                int i9 = iArr[1];
                int i10 = iM553m - i8;
                int i11 = iM553m2 - i9;
                ws0 ws0Var = recyclerView.f931s.f986e;
                if (ws0Var != null && !ws0Var.f12274d && ws0Var.f12275e) {
                    int iM6801b = recyclerView.f918l0.m6801b();
                    if (iM6801b == 0) {
                        ws0Var.m6830i();
                    } else if (ws0Var.f12271a >= iM6801b) {
                        ws0Var.f12271a = iM6801b - 1;
                        ws0Var.m6828g(i8, i9);
                    } else {
                        ws0Var.m6828g(i8, i9);
                    }
                }
                i = i10;
                i3 = i8;
                i2 = i11;
                i4 = i9;
            } else {
                i = iM553m;
                i2 = iM553m2;
                i3 = 0;
                i4 = 0;
            }
            if (!recyclerView.f935u.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f942x0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.m599t(i3, i4, i, i2, null, 1, iArr3);
            int i12 = i - iArr[0];
            int i13 = i2 - iArr[1];
            if (i3 != 0 || i4 != 0) {
                recyclerView.m600u(i3, i4);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i12 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i13 != 0));
            ws0 ws0Var2 = recyclerView.f931s.f986e;
            if ((ws0Var2 == null || !ws0Var2.f12274d) && z) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i12 < 0) {
                        i5 = -currVelocity;
                    } else {
                        i5 = i12 > 0 ? currVelocity : 0;
                    }
                    if (i13 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i13 <= 0) {
                        currVelocity = 0;
                    }
                    if (i5 < 0) {
                        recyclerView.m602w();
                        if (recyclerView.f889M.isFinished()) {
                            recyclerView.f889M.onAbsorb(-i5);
                        }
                    } else if (i5 > 0) {
                        recyclerView.m603x();
                        if (recyclerView.f891O.isFinished()) {
                            recyclerView.f891O.onAbsorb(i5);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.m604y();
                        if (recyclerView.f890N.isFinished()) {
                            recyclerView.f890N.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.m601v();
                        if (recyclerView.f892P.isFinished()) {
                            recyclerView.f892P.onAbsorb(currVelocity);
                        }
                    }
                    if (i5 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = i72.f4849a;
                        s62.m5990k(recyclerView);
                    }
                }
                if (RecyclerView.f869I0) {
                    C1338qn c1338qn = recyclerView.f917k0;
                    int[] iArr4 = c1338qn.f9544c;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    c1338qn.f9545d = 0;
                }
            } else {
                m7318b();
                RunnableC0062a runnableC0062a = recyclerView.f916j0;
                if (runnableC0062a != null) {
                    runnableC0062a.m638a(recyclerView, i3, i4);
                }
            }
        }
        ws0 ws0Var3 = recyclerView.f931s.f986e;
        if (ws0Var3 != null && ws0Var3.f12274d) {
            ws0Var3.m6828g(0, 0);
        }
        this.f13436e = false;
        if (!this.f13437f) {
            recyclerView.setScrollState(0);
            recyclerView.m590i0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = i72.f4849a;
            s62.m5992m(recyclerView, this);
        }
    }
}
