package p000;

import android.graphics.Rect;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ld0 implements Comparator {

    /* JADX INFO: renamed from: a */
    public final Rect f6319a = new Rect();

    /* JADX INFO: renamed from: b */
    public final Rect f6320b = new Rect();

    /* JADX INFO: renamed from: c */
    public final boolean f6321c;

    /* JADX INFO: renamed from: d */
    public final bz1 f6322d;

    public ld0(boolean z, bz1 bz1Var) {
        this.f6321c = z;
        this.f6322d = bz1Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f6322d.getClass();
        Rect rect = this.f6319a;
        ((C1539w2) obj).m6687e(rect);
        Rect rect2 = this.f6320b;
        ((C1539w2) obj2).m6687e(rect2);
        int i = rect.top;
        int i2 = rect2.top;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        int i3 = rect.left;
        int i4 = rect2.left;
        boolean z = this.f6321c;
        if (i3 < i4) {
            return z ? 1 : -1;
        }
        if (i3 > i4) {
            return z ? -1 : 1;
        }
        int i5 = rect.bottom;
        int i6 = rect2.bottom;
        if (i5 < i6) {
            return -1;
        }
        if (i5 > i6) {
            return 1;
        }
        int i7 = rect.right;
        int i8 = rect2.right;
        if (i7 < i8) {
            return z ? 1 : -1;
        }
        if (i7 > i8) {
            return z ? -1 : 1;
        }
        return 0;
    }
}
