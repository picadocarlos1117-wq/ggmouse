package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class rr1 extends xr1 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ArrayList f10112c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Matrix f10113d;

    public rr1(ArrayList arrayList, Matrix matrix) {
        this.f10112c = arrayList;
        this.f10113d = matrix;
    }

    @Override // p000.xr1
    /* JADX INFO: renamed from: a */
    public final void mo5902a(Matrix matrix, nr1 nr1Var, int i, Canvas canvas) {
        ArrayList arrayList = this.f10112c;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((xr1) obj).mo5902a(this.f10113d, nr1Var, i, canvas);
        }
    }
}
