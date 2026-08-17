package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class d41 extends m40 {

    /* JADX INFO: renamed from: r */
    public final int f2779r;

    /* JADX INFO: renamed from: s */
    public final int f2780s;

    /* JADX INFO: renamed from: t */
    public q31 f2781t;

    /* JADX INFO: renamed from: u */
    public r31 f2782u;

    public d41(Context context, boolean z) {
        super(context, z);
        if (1 == c41.m1127a(context.getResources().getConfiguration())) {
            this.f2779r = 21;
            this.f2780s = 22;
        } else {
            this.f2779r = 22;
            this.f2780s = 21;
        }
    }

    @Override // p000.m40, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        f31 f31Var;
        int headersCount;
        int iPointToPosition;
        int i;
        if (this.f2781t != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                f31Var = (f31) headerViewListAdapter.getWrappedAdapter();
            } else {
                f31Var = (f31) adapter;
                headersCount = 0;
            }
            r31 r31VarM2701b = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= f31Var.getCount()) ? null : f31Var.getItem(i);
            r31 r31Var = this.f2782u;
            if (r31Var != r31VarM2701b) {
                i31 i31Var = f31Var.f3598a;
                if (r31Var != null) {
                    this.f2781t.mo769e(i31Var, r31Var);
                }
                this.f2782u = r31VarM2701b;
                if (r31VarM2701b != null) {
                    this.f2781t.mo776l(i31Var, r31VarM2701b);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.f2779r) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.f2780s) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (f31) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (f31) adapter).f3598a.m3340c(false);
        return true;
    }

    public void setHoverListener(q31 q31Var) {
        this.f2781t = q31Var;
    }

    @Override // p000.m40, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
