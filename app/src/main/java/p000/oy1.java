package p000;

import android.view.View;
import android.view.ViewParent;
import com.example.ssmousepro.injection.TouchPipeline;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class oy1 extends ki0 {

    /* JADX INFO: renamed from: q */
    public int f8580q;

    /* JADX INFO: renamed from: r */
    public int f8581r = -1;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ SwipeDismissBehavior f8582s;

    public oy1(SwipeDismissBehavior swipeDismissBehavior) {
        this.f8582s = swipeDismissBehavior;
    }

    @Override // p000.ki0
    /* JADX INFO: renamed from: C */
    public final int mo3879C(View view) {
        return view.getWidth();
    }

    @Override // p000.ki0
    /* JADX INFO: renamed from: L */
    public final void mo3881L(View view, int i) {
        this.f8581r = i;
        this.f8580q = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f8582s;
            swipeDismissBehavior.f1950c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f1950c = false;
        }
    }

    @Override // p000.ki0
    /* JADX INFO: renamed from: N */
    public final void mo3883N(View view, int i, int i2) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f8582s;
        float f = width * swipeDismissBehavior.f1952e;
        float width2 = view.getWidth() * swipeDismissBehavior.f1953f;
        float fAbs = Math.abs(i - this.f8580q);
        if (fAbs <= f) {
            view.setAlpha(1.0f);
        } else if (fAbs >= width2) {
            view.setAlpha(TouchPipeline.SIZE);
        } else {
            view.setAlpha(Math.min(Math.max(TouchPipeline.SIZE, 1.0f - ((fAbs - f) / (width2 - f))), 1.0f));
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:35:0x0067  */
    @Override // p000.ki0
    /* JADX INFO: renamed from: O */
    public final void mo3884O(View view, float f, float f2) {
        int i;
        int left;
        int i2;
        this.f8581r = -1;
        int width = view.getWidth();
        boolean z = false;
        SwipeDismissBehavior swipeDismissBehavior = this.f8582s;
        if (f != TouchPipeline.SIZE) {
            WeakHashMap weakHashMap = i72.f4849a;
            boolean z2 = t62.m6240d(view) == 1;
            int i3 = swipeDismissBehavior.f1951d;
            if (i3 != 2 && (i3 != 0 ? i3 != 1 || (!z2 ? f < TouchPipeline.SIZE : f > TouchPipeline.SIZE) : !z2 ? f > TouchPipeline.SIZE : f < TouchPipeline.SIZE)) {
                i = this.f8580q;
            } else {
                if (f >= TouchPipeline.SIZE) {
                    left = view.getLeft();
                    i2 = this.f8580q;
                    if (left < i2) {
                        i = this.f8580q - width;
                    } else {
                        i = i2 + width;
                    }
                } else {
                    i = this.f8580q - width;
                }
                z = true;
            }
        } else {
            if (Math.abs(view.getLeft() - this.f8580q) >= Math.round(view.getWidth() * 0.5f)) {
                if (f >= TouchPipeline.SIZE) {
                    left = view.getLeft();
                    i2 = this.f8580q;
                    if (left < i2) {
                        i = this.f8580q - width;
                    } else {
                        i = i2 + width;
                    }
                } else {
                    i = this.f8580q - width;
                }
                z = true;
            } else {
                i = this.f8580q;
            }
        }
        if (swipeDismissBehavior.f1948a.m4403o(i, view.getTop())) {
            im1 im1Var = new im1(swipeDismissBehavior, view, z);
            WeakHashMap weakHashMap2 = i72.f4849a;
            s62.m5992m(view, im1Var);
        }
    }

    @Override // p000.ki0
    /* JADX INFO: renamed from: d0 */
    public final boolean mo3885d0(View view, int i) {
        int i2 = this.f8581r;
        return (i2 == -1 || i2 == i) && this.f8582s.mo1647v(view);
    }

    @Override // p000.ki0
    /* JADX INFO: renamed from: l */
    public final int mo3886l(View view, int i) {
        int width;
        int width2;
        WeakHashMap weakHashMap = i72.f4849a;
        boolean z = t62.m6240d(view) == 1;
        int i2 = this.f8582s.f1951d;
        if (i2 == 0) {
            width = this.f8580q;
            if (z) {
                width -= view.getWidth();
                width2 = this.f8580q;
            } else {
                width2 = view.getWidth() + width;
            }
        } else {
            int i3 = this.f8580q;
            if (i2 != 1) {
                width = i3 - view.getWidth();
                width2 = this.f8580q + view.getWidth();
            } else if (z) {
                width2 = view.getWidth() + i3;
                width = i3;
            } else {
                width = i3 - view.getWidth();
                width2 = this.f8580q;
            }
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // p000.ki0
    /* JADX INFO: renamed from: m */
    public final int mo3887m(View view, int i) {
        return view.getTop();
    }

    @Override // p000.ki0
    /* JADX INFO: renamed from: M */
    public final void mo3882M(int i) {
    }
}
