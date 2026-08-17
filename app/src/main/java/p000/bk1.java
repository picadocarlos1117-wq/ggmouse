package p000;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.AbstractC0066e;
import androidx.recyclerview.widget.C0067f;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class bk1 extends C1056l2 {

    /* JADX INFO: renamed from: d */
    public final RecyclerView f1397d;

    /* JADX INFO: renamed from: e */
    public final ak1 f1398e;

    public bk1(RecyclerView recyclerView) {
        this.f1397d = recyclerView;
        ak1 ak1Var = this.f1398e;
        if (ak1Var != null) {
            this.f1398e = ak1Var;
        } else {
            this.f1398e = new ak1(this);
        }
    }

    @Override // p000.C1056l2
    /* JADX INFO: renamed from: c */
    public final void mo160c(View view, AccessibilityEvent accessibilityEvent) {
        super.mo160c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f1397d.m563L()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().mo521R(accessibilityEvent);
        }
    }

    @Override // p000.C1056l2
    /* JADX INFO: renamed from: d */
    public final void mo161d(View view, C1539w2 c1539w2) {
        this.f6143a.onInitializeAccessibilityNodeInfo(view, c1539w2.f11909a);
        RecyclerView recyclerView = this.f1397d;
        if (recyclerView.m563L() || recyclerView.getLayoutManager() == null) {
            return;
        }
        AbstractC0066e layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f983b;
        layoutManager.mo470S(recyclerView2.f904c, recyclerView2.f918l0, c1539w2);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0079 A[PHI: r5
  0x0079: PHI (r5v12 int) = (r5v9 int), (r5v15 int) binds: [B:32:0x0095, B:24:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p000.C1056l2
    /* JADX INFO: renamed from: g */
    public final boolean mo164g(View view, int i, Bundle bundle) {
        int iM661E;
        int iM659C;
        if (super.mo164g(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f1397d;
        if (!recyclerView.m563L() && recyclerView.getLayoutManager() != null) {
            AbstractC0066e layoutManager = recyclerView.getLayoutManager();
            C0067f c0067f = layoutManager.f983b.f904c;
            int iHeight = layoutManager.f996o;
            int iWidth = layoutManager.f995n;
            Rect rect = new Rect();
            if (layoutManager.f983b.getMatrix().isIdentity() && layoutManager.f983b.getGlobalVisibleRect(rect)) {
                iHeight = rect.height();
                iWidth = rect.width();
            }
            if (i == 4096) {
                iM661E = layoutManager.f983b.canScrollVertically(1) ? (iHeight - layoutManager.m661E()) - layoutManager.m658B() : 0;
                if (layoutManager.f983b.canScrollHorizontally(1)) {
                    iM659C = (iWidth - layoutManager.m659C()) - layoutManager.m660D();
                } else {
                    iM659C = 0;
                }
            } else if (i != 8192) {
                iM661E = 0;
                iM659C = 0;
            } else {
                iM661E = layoutManager.f983b.canScrollVertically(-1) ? -((iHeight - layoutManager.m661E()) - layoutManager.m658B()) : 0;
                if (layoutManager.f983b.canScrollHorizontally(-1)) {
                    iM659C = -((iWidth - layoutManager.m659C()) - layoutManager.m660D());
                } else {
                    iM659C = 0;
                }
            }
            if (iM661E != 0 || iM659C != 0) {
                layoutManager.f983b.m584f0(iM659C, iM661E, true);
                return true;
            }
        }
        return false;
    }
}
