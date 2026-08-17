package p000;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import com.sousasantoslogic.sspro.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class n82 extends u22 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ViewGroup f7306a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f7307b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f7308c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ e90 f7309d;

    public n82(e90 e90Var, ViewGroup viewGroup, View view, View view2) {
        this.f7309d = e90Var;
        this.f7306a = viewGroup;
        this.f7307b = view;
        this.f7308c = view2;
    }

    @Override // p000.u22, p000.s22
    /* JADX INFO: renamed from: a */
    public final void mo4507a() {
        this.f7306a.getOverlay().remove(this.f7307b);
    }

    @Override // p000.s22
    /* JADX INFO: renamed from: b */
    public final void mo149b(t22 t22Var) {
        this.f7308c.setTag(R.id.save_overlay_view, null);
        this.f7306a.getOverlay().remove(this.f7307b);
        t22Var.m6218w(this);
    }

    @Override // p000.u22, p000.s22
    /* JADX INFO: renamed from: e */
    public final void mo4508e() {
        View view = this.f7307b;
        if (view.getParent() == null) {
            this.f7306a.getOverlay().add(view);
            return;
        }
        e90 e90Var = this.f7309d;
        ArrayList arrayList = e90Var.f10725r;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((Animator) arrayList.get(size)).cancel();
        }
        ArrayList arrayList2 = e90Var.f10729v;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            return;
        }
        ArrayList arrayList3 = (ArrayList) e90Var.f10729v.clone();
        int size2 = arrayList3.size();
        for (int i = 0; i < size2; i++) {
            ((s22) arrayList3.get(i)).mo4560c();
        }
    }
}
