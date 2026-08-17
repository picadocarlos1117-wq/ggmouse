package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class q20 extends a20 {

    /* JADX INFO: renamed from: m */
    public int f9308m;

    public q20(r92 r92Var) {
        super(r92Var);
        if (r92Var instanceof ok0) {
            this.f31e = 2;
        } else {
            this.f31e = 3;
        }
    }

    @Override // p000.a20
    /* JADX INFO: renamed from: d */
    public final void mo53d(int i) {
        if (this.f36j) {
            return;
        }
        this.f36j = true;
        this.f33g = i;
        ArrayList arrayList = this.f37k;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            y10 y10Var = (y10) obj;
            y10Var.mo50a(y10Var);
        }
    }
}
