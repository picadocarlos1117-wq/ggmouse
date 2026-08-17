package p000;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class sm0 extends km0 {
    @Override // p000.km0
    /* JADX INFO: renamed from: c */
    public final km0 mo3903c(Object obj) {
        obj.getClass();
        m3901a(obj);
        return this;
    }

    /* JADX INFO: renamed from: g */
    public final tm0 m6116g() {
        int i = this.f5901b;
        if (i == 0) {
            int i2 = tm0.f10905c;
            return qk1.f9525o;
        }
        Object[] objArr = this.f5900a;
        if (i != 1) {
            tm0 tm0VarM6291m = tm0.m6291m(i, objArr);
            this.f5901b = tm0VarM6291m.size();
            this.f5902c = true;
            return tm0VarM6291m;
        }
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        int i3 = tm0.f10905c;
        return new et1(obj);
    }
}
