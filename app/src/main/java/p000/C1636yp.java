package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: yp */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1636yp implements vq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f13045a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f13046b;

    public /* synthetic */ C1636yp(Object obj, int i) {
        this.f13045a = i;
        this.f13046b = obj;
    }

    @Override // p000.vq1
    public final Iterator iterator() {
        int i = this.f13045a;
        Object obj = this.f13046b;
        switch (i) {
            case 0:
                return ((Iterable) obj).iterator();
            case 1:
                return hr1.m3251B((ch0) obj);
            case 2:
                return (Iterator) obj;
            default:
                return new ys0((CharSequence) obj);
        }
    }
}
