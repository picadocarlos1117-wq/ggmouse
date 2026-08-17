package p000;

import java.util.Comparator;

/* JADX INFO: renamed from: oq */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1233oq extends AbstractC1341qq {
    /* JADX INFO: renamed from: f */
    public static AbstractC1341qq m5043f(int i) {
        if (i < 0) {
            return AbstractC1341qq.f9557b;
        }
        return i > 0 ? AbstractC1341qq.f9558c : AbstractC1341qq.f9556a;
    }

    @Override // p000.AbstractC1341qq
    /* JADX INFO: renamed from: a */
    public final AbstractC1341qq mo5044a(int i, int i2) {
        return m5043f(Integer.compare(i, i2));
    }

    @Override // p000.AbstractC1341qq
    /* JADX INFO: renamed from: b */
    public final AbstractC1341qq mo5045b(Object obj, Object obj2, Comparator comparator) {
        return m5043f(comparator.compare(obj, obj2));
    }

    @Override // p000.AbstractC1341qq
    /* JADX INFO: renamed from: c */
    public final AbstractC1341qq mo5046c(boolean z, boolean z2) {
        return m5043f(Boolean.compare(z, z2));
    }

    @Override // p000.AbstractC1341qq
    /* JADX INFO: renamed from: d */
    public final AbstractC1341qq mo5047d(boolean z, boolean z2) {
        return m5043f(Boolean.compare(z2, z));
    }

    @Override // p000.AbstractC1341qq
    /* JADX INFO: renamed from: e */
    public final int mo5048e() {
        return 0;
    }
}
