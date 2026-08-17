package p000;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: m5 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1096m5 implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1320q5 f6640a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1133n5 f6641b;

    public C1096m5(C1133n5 c1133n5, C1320q5 c1320q5) {
        this.f6641b = c1133n5;
        this.f6640a = c1320q5;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C1133n5 c1133n5 = this.f6641b;
        DialogInterface.OnClickListener onClickListener = c1133n5.f7231p;
        C1320q5 c1320q5 = this.f6640a;
        onClickListener.onClick(c1320q5.f9365b, i);
        if (c1133n5.f7233r) {
            return;
        }
        c1320q5.f9365b.dismiss();
    }
}
