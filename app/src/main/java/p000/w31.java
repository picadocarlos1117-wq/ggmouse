package p000;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w31 implements us1, g41, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    public Rect f11960a;

    /* JADX INFO: renamed from: m */
    public static int m6700m(ListAdapter listAdapter, Context context, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, frameLayout);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    @Override // p000.g41
    /* JADX INFO: renamed from: e */
    public final boolean mo2931e(r31 r31Var) {
        return false;
    }

    @Override // p000.g41
    /* JADX INFO: renamed from: h */
    public final boolean mo2933h(r31 r31Var) {
        return false;
    }

    /* JADX INFO: renamed from: l */
    public abstract void mo3061l(i31 i31Var);

    /* JADX INFO: renamed from: n */
    public abstract void mo3062n(View view);

    /* JADX INFO: renamed from: o */
    public abstract void mo3063o(boolean z);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (f31) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (f31) listAdapter).f3598a.m3354q((MenuItem) listAdapter.getItem(i), this, !(this instanceof ViewOnKeyListenerC1484ul) ? 0 : 4);
    }

    /* JADX INFO: renamed from: p */
    public abstract void mo3064p(int i);

    /* JADX INFO: renamed from: q */
    public abstract void mo3065q(int i);

    /* JADX INFO: renamed from: r */
    public abstract void mo3066r(PopupWindow.OnDismissListener onDismissListener);

    /* JADX INFO: renamed from: s */
    public abstract void mo3067s(boolean z);

    /* JADX INFO: renamed from: t */
    public abstract void mo3068t(int i);

    @Override // p000.g41
    /* JADX INFO: renamed from: k */
    public final void mo2935k(Context context, i31 i31Var) {
    }
}
