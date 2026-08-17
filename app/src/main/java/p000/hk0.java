package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class hk0 extends C1639ys {

    /* JADX INFO: renamed from: q0 */
    public C1639ys[] f4611q0 = new C1639ys[4];

    /* JADX INFO: renamed from: r0 */
    public int f4612r0 = 0;

    /* JADX INFO: renamed from: R */
    public final void m3174R(int i, q92 q92Var, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.f4612r0; i2++) {
            C1639ys c1639ys = this.f4611q0[i2];
            ArrayList arrayList2 = q92Var.f9449a;
            if (!arrayList2.contains(c1639ys)) {
                arrayList2.add(c1639ys);
            }
        }
        for (int i3 = 0; i3 < this.f4612r0; i3++) {
            rc2.m5764F(this.f4611q0[i3], i, arrayList, q92Var);
        }
    }

    /* JADX INFO: renamed from: S */
    public void mo3175S() {
    }
}
