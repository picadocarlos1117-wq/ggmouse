package p000;

import java.io.OutputStream;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class t41 extends OutputStream {

    /* JADX INFO: renamed from: a */
    public final ArrayList f10746a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public fa1 f10747b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ v41 f10748c;

    public t41(v41 v41Var) {
        this.f10748c = v41Var;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        ax0 ax0Var = this.f10748c.f11523h;
        fa1 fa1Var = this.f10747b;
        ArrayList arrayList = this.f10746a;
        if (fa1Var == null) {
            ax0Var.getClass();
            fa1 fa1VarM736m = ax0.m736m(i2);
            this.f10747b = fa1VarM736m;
            arrayList.add(fa1VarM736m);
        }
        while (i2 > 0) {
            int iMin = Math.min(i2, this.f10747b.f3734b);
            fa1 fa1Var2 = this.f10747b;
            if (iMin == 0) {
                int iMax = Math.max(i2, fa1Var2.f3735c * 2);
                ax0Var.getClass();
                fa1 fa1VarM736m2 = ax0.m736m(iMax);
                this.f10747b = fa1VarM736m2;
                arrayList.add(fa1VarM736m2);
            } else {
                fa1Var2.m2781a(bArr, i, iMin);
                i += iMin;
                i2 -= iMin;
            }
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        fa1 fa1Var = this.f10747b;
        if (fa1Var != null && fa1Var.f3734b > 0) {
            fa1Var.f3733a.m4192D((byte) i);
            fa1Var.f3734b--;
            fa1Var.f3735c++;
            return;
        }
        write(new byte[]{(byte) i}, 0, 1);
    }
}
