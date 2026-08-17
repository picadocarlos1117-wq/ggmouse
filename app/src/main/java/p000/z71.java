package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class z71 extends eb1 implements Serializable {

    /* JADX INFO: renamed from: b */
    public static final z71 f13301b = new z71(0);

    /* JADX INFO: renamed from: c */
    public static final z71 f13302c = new z71(1);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f13303a;

    public /* synthetic */ z71(int i) {
        this.f13303a = i;
    }

    @Override // p000.eb1
    /* JADX INFO: renamed from: a */
    public final eb1 mo2565a() {
        switch (this.f13303a) {
            case 0:
                return f13302c;
            default:
                return f13301b;
        }
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f13303a) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                comparable3.getClass();
                if (comparable3 == comparable4) {
                    return 0;
                }
                return comparable4.compareTo(comparable3);
        }
    }

    public final String toString() {
        switch (this.f13303a) {
            case 0:
                return "Ordering.natural()";
            default:
                return "Ordering.natural().reverse()";
        }
    }
}
