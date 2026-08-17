package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class by0 extends dy0 implements Iterator {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f1568e;

    public by0(ey0 ey0Var, int i) {
        this.f1568e = i;
        ey0Var.getClass();
        this.f3076d = ey0Var;
        this.f3074b = -1;
        this.f3075c = ey0Var.f3488m;
        m2410e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f1568e) {
            case 0:
                m2407b();
                int i = this.f3073a;
                ey0 ey0Var = (ey0) this.f3076d;
                if (i >= ey0Var.f3486f) {
                    ca0.m1185q();
                    return null;
                }
                this.f3073a = i + 1;
                this.f3074b = i;
                cy0 cy0Var = new cy0(ey0Var, i);
                m2410e();
                return cy0Var;
            case 1:
                m2407b();
                int i2 = this.f3073a;
                ey0 ey0Var2 = (ey0) this.f3076d;
                if (i2 >= ey0Var2.f3486f) {
                    ca0.m1185q();
                    return null;
                }
                this.f3073a = i2 + 1;
                this.f3074b = i2;
                Object obj = ey0Var2.f3481a[i2];
                m2410e();
                return obj;
            default:
                m2407b();
                int i3 = this.f3073a;
                ey0 ey0Var3 = (ey0) this.f3076d;
                if (i3 >= ey0Var3.f3486f) {
                    ca0.m1185q();
                    return null;
                }
                this.f3073a = i3 + 1;
                this.f3074b = i3;
                Object[] objArr = ey0Var3.f3482b;
                objArr.getClass();
                Object obj2 = objArr[this.f3074b];
                m2410e();
                return obj2;
        }
    }
}
