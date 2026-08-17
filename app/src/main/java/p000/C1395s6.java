package p000;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: s6 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1395s6 implements gp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10246a;

    /* JADX INFO: renamed from: b */
    public final Object f10247b;

    public C1395s6(hp1 hp1Var) {
        this.f10246a = 1;
        this.f10247b = new LinkedHashSet();
        hp1Var.m3235c("androidx.savedstate.Restarter", this);
    }

    @Override // p000.gp1
    /* JADX INFO: renamed from: a */
    public final Bundle mo359a() {
        int i = this.f10246a;
        Object obj = this.f10247b;
        switch (i) {
            case 0:
                Bundle bundle = new Bundle();
                ((AbstractActivityC1469u6) obj).getDelegate().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) obj));
                return bundle2;
        }
    }

    public C1395s6(AbstractActivityC1469u6 abstractActivityC1469u6) {
        this.f10246a = 0;
        this.f10247b = abstractActivityC1469u6;
    }
}
