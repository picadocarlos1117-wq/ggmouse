package androidx.fragment.app;

import java.util.HashSet;
import p000.C1112ml;
import p000.jd0;

/* JADX INFO: renamed from: androidx.fragment.app.e */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0041e {

    /* JADX INFO: renamed from: a */
    public final C0061y f680a;

    /* JADX INFO: renamed from: b */
    public final C1112ml f681b;

    public AbstractC0041e(C0061y c0061y, C1112ml c1112ml) {
        this.f680a = c0061y;
        this.f681b = c1112ml;
    }

    /* JADX INFO: renamed from: a */
    public final void m336a() {
        C0061y c0061y = this.f680a;
        HashSet hashSet = c0061y.f771e;
        if (hashSet.remove(this.f681b) && hashSet.isEmpty()) {
            c0061y.m441b();
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m337b() {
        C0061y c0061y = this.f680a;
        int iM3605c = jd0.m3605c(c0061y.f769c.mView);
        int i = c0061y.f767a;
        if (iM3605c != i) {
            return (iM3605c == 2 || i == 2) ? false : true;
        }
        return true;
    }
}
