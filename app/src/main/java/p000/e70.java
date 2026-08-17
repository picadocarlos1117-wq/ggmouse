package p000;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class e70 implements b90 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3234a;

    /* JADX INFO: renamed from: b */
    public final qh1 f3235b;

    public /* synthetic */ e70(qh1 qh1Var, int i) {
        this.f3234a = i;
        this.f3235b = qh1Var;
    }

    @Override // p000.qh1
    public final Object get() {
        int i = this.f3234a;
        qh1 qh1Var = this.f3235b;
        switch (i) {
            case 0:
                String packageName = ((Context) qh1Var.get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                l41.m4051t("Cannot return null from a non-@Nullable @Provides method");
                return null;
            default:
                return new sp1((Context) qh1Var.get(), Integer.valueOf(sp1.f10476d).intValue(), "com.google.android.datatransport.events");
        }
    }
}
