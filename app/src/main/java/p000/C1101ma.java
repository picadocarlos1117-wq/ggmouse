package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: ma */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1101ma implements Iterable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6724a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f6725b;

    public /* synthetic */ C1101ma(Object obj, int i) {
        this.f6724a = i;
        this.f6725b = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i = this.f6724a;
        Object obj = this.f6725b;
        switch (i) {
            case 0:
                Object[] objArr = (Object[]) obj;
                objArr.getClass();
                return new C1657z9(objArr, 0);
            default:
                return new w10((x10) obj);
        }
    }
}
