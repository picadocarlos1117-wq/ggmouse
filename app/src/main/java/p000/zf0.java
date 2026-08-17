package p000;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class zf0 implements s22 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ View f13393a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList f13394b;

    public zf0(ArrayList arrayList, View view) {
        this.f13393a = view;
        this.f13394b = arrayList;
    }

    @Override // p000.s22
    /* JADX INFO: renamed from: b */
    public final void mo149b(t22 t22Var) {
        t22Var.m6218w(this);
        this.f13393a.setVisibility(8);
        ArrayList arrayList = this.f13394b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((View) arrayList.get(i)).setVisibility(0);
        }
    }

    @Override // p000.s22
    /* JADX INFO: renamed from: a */
    public final void mo4507a() {
    }

    @Override // p000.s22
    /* JADX INFO: renamed from: c */
    public final void mo4560c() {
    }

    @Override // p000.s22
    /* JADX INFO: renamed from: d */
    public final void mo150d() {
    }

    @Override // p000.s22
    /* JADX INFO: renamed from: e */
    public final void mo4508e() {
    }
}
