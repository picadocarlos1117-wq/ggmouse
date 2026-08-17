package p000;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ty0 extends me0 {

    /* JADX INFO: renamed from: e */
    public static final Object f11035e = new Object();

    /* JADX INFO: renamed from: c */
    public final Object f11036c;

    /* JADX INFO: renamed from: d */
    public final Object f11037d;

    public ty0(t02 t02Var, Object obj, Object obj2) {
        super(t02Var);
        this.f11036c = obj;
        this.f11037d = obj2;
    }

    @Override // p000.me0, p000.t02
    /* JADX INFO: renamed from: b */
    public final int mo1054b(Object obj) {
        Object obj2;
        if (f11035e == obj && (obj2 = this.f11037d) != null) {
            obj = obj2;
        }
        return this.f6780b.mo1054b(obj);
    }

    @Override // p000.me0, p000.t02
    /* JADX INFO: renamed from: f */
    public final r02 mo1055f(int i, r02 r02Var, boolean z) {
        this.f6780b.mo1055f(i, r02Var, z);
        if (Objects.equals(r02Var.f9650b, this.f11037d) && z) {
            r02Var.f9650b = f11035e;
        }
        return r02Var;
    }

    @Override // p000.me0, p000.t02
    /* JADX INFO: renamed from: l */
    public final Object mo1057l(int i) {
        Object objMo1057l = this.f6780b.mo1057l(i);
        int i2 = z42.f13274a;
        return Objects.equals(objMo1057l, this.f11037d) ? f11035e : objMo1057l;
    }

    @Override // p000.me0, p000.t02
    /* JADX INFO: renamed from: m */
    public final s02 mo1058m(int i, s02 s02Var, long j) {
        this.f6780b.mo1058m(i, s02Var, j);
        if (Objects.equals(s02Var.f10181a, this.f11036c)) {
            s02Var.f10181a = s02.f10179o;
        }
        return s02Var;
    }
}
