package p000;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.C0067f;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ak1 extends C1056l2 {

    /* JADX INFO: renamed from: d */
    public final bk1 f255d;

    /* JADX INFO: renamed from: e */
    public final WeakHashMap f256e = new WeakHashMap();

    public ak1(bk1 bk1Var) {
        this.f255d = bk1Var;
    }

    @Override // p000.C1056l2
    /* JADX INFO: renamed from: a */
    public final boolean mo158a(View view, AccessibilityEvent accessibilityEvent) {
        C1056l2 c1056l2 = (C1056l2) this.f256e.get(view);
        return c1056l2 != null ? c1056l2.mo158a(view, accessibilityEvent) : this.f6143a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // p000.C1056l2
    /* JADX INFO: renamed from: b */
    public final ay0 mo159b(View view) {
        C1056l2 c1056l2 = (C1056l2) this.f256e.get(view);
        return c1056l2 != null ? c1056l2.mo159b(view) : super.mo159b(view);
    }

    @Override // p000.C1056l2
    /* JADX INFO: renamed from: c */
    public final void mo160c(View view, AccessibilityEvent accessibilityEvent) {
        C1056l2 c1056l2 = (C1056l2) this.f256e.get(view);
        if (c1056l2 != null) {
            c1056l2.mo160c(view, accessibilityEvent);
        } else {
            super.mo160c(view, accessibilityEvent);
        }
    }

    @Override // p000.C1056l2
    /* JADX INFO: renamed from: d */
    public final void mo161d(View view, C1539w2 c1539w2) {
        AccessibilityNodeInfo accessibilityNodeInfo = c1539w2.f11909a;
        bk1 bk1Var = this.f255d;
        RecyclerView recyclerView = bk1Var.f1397d;
        RecyclerView recyclerView2 = bk1Var.f1397d;
        boolean zM563L = recyclerView.m563L();
        View.AccessibilityDelegate accessibilityDelegate = this.f6143a;
        if (zM563L || recyclerView2.getLayoutManager() == null) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            return;
        }
        recyclerView2.getLayoutManager().m663T(view, c1539w2);
        C1056l2 c1056l2 = (C1056l2) this.f256e.get(view);
        if (c1056l2 != null) {
            c1056l2.mo161d(view, c1539w2);
        } else {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }
    }

    @Override // p000.C1056l2
    /* JADX INFO: renamed from: e */
    public final void mo162e(View view, AccessibilityEvent accessibilityEvent) {
        C1056l2 c1056l2 = (C1056l2) this.f256e.get(view);
        if (c1056l2 != null) {
            c1056l2.mo162e(view, accessibilityEvent);
        } else {
            super.mo162e(view, accessibilityEvent);
        }
    }

    @Override // p000.C1056l2
    /* JADX INFO: renamed from: f */
    public final boolean mo163f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C1056l2 c1056l2 = (C1056l2) this.f256e.get(viewGroup);
        return c1056l2 != null ? c1056l2.mo163f(viewGroup, view, accessibilityEvent) : this.f6143a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // p000.C1056l2
    /* JADX INFO: renamed from: g */
    public final boolean mo164g(View view, int i, Bundle bundle) {
        bk1 bk1Var = this.f255d;
        RecyclerView recyclerView = bk1Var.f1397d;
        RecyclerView recyclerView2 = bk1Var.f1397d;
        if (recyclerView.m563L() || recyclerView2.getLayoutManager() == null) {
            return super.mo164g(view, i, bundle);
        }
        C1056l2 c1056l2 = (C1056l2) this.f256e.get(view);
        if (c1056l2 != null) {
            if (c1056l2.mo164g(view, i, bundle)) {
                return true;
            }
        } else if (super.mo164g(view, i, bundle)) {
            return true;
        }
        C0067f c0067f = recyclerView2.getLayoutManager().f983b.f904c;
        return false;
    }

    @Override // p000.C1056l2
    /* JADX INFO: renamed from: h */
    public final void mo165h(View view, int i) {
        C1056l2 c1056l2 = (C1056l2) this.f256e.get(view);
        if (c1056l2 != null) {
            c1056l2.mo165h(view, i);
        } else {
            super.mo165h(view, i);
        }
    }

    @Override // p000.C1056l2
    /* JADX INFO: renamed from: i */
    public final void mo166i(View view, AccessibilityEvent accessibilityEvent) {
        C1056l2 c1056l2 = (C1056l2) this.f256e.get(view);
        if (c1056l2 != null) {
            c1056l2.mo166i(view, accessibilityEvent);
        } else {
            super.mo166i(view, accessibilityEvent);
        }
    }
}
