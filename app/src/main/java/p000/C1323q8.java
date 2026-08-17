package p000;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: renamed from: q8 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1323q8 implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9441a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f9442b;

    public /* synthetic */ C1323q8(Object obj, int i) {
        this.f9441a = i;
        this.f9442b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object item;
        int i2 = this.f9441a;
        Object obj = this.f9442b;
        switch (i2) {
            case 0:
                C1397s8 c1397s8 = (C1397s8) obj;
                C1508v8 c1508v8 = c1397s8.f10282L;
                c1508v8.setSelection(i);
                if (c1508v8.getOnItemClickListener() != null) {
                    c1508v8.performItemClick(view, i, c1397s8.f10279I.getItemId(i));
                }
                c1397s8.dismiss();
                break;
            case 1:
                yy0 yy0Var = (yy0) obj;
                ot0 ot0Var = yy0Var.f13161e;
                if (i < 0) {
                    item = !ot0Var.f8470E.isShowing() ? null : ot0Var.f8473c.getSelectedItem();
                } else {
                    item = yy0Var.getAdapter().getItem(i);
                }
                yy0.m7161a(yy0Var, item);
                AdapterView.OnItemClickListener onItemClickListener = yy0Var.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = !ot0Var.f8470E.isShowing() ? null : ot0Var.f8473c.getSelectedView();
                        i = !ot0Var.f8470E.isShowing() ? -1 : ot0Var.f8473c.getSelectedItemPosition();
                        j = !ot0Var.f8470E.isShowing() ? Long.MIN_VALUE : ot0Var.f8473c.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(ot0Var.f8473c, view, i, j);
                }
                ot0Var.dismiss();
                break;
            default:
                ((SearchView) obj).m242n(i);
                break;
        }
    }
}
