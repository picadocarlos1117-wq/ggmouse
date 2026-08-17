package p000;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class t31 extends FrameLayout implements InterfaceC1232op {

    /* JADX INFO: renamed from: a */
    public final CollapsibleActionView f10735a;

    /* JADX WARN: Multi-variable type inference failed */
    public t31(View view) {
        super(view.getContext());
        this.f10735a = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // p000.InterfaceC1232op
    public final void onActionViewCollapsed() {
        this.f10735a.onActionViewCollapsed();
    }

    @Override // p000.InterfaceC1232op
    public final void onActionViewExpanded() {
        this.f10735a.onActionViewExpanded();
    }
}
