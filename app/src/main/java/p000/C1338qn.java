package p000;

import androidx.recyclerview.widget.AbstractC0066e;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* JADX INFO: renamed from: qn */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1338qn {

    /* JADX INFO: renamed from: a */
    public int f9542a;

    /* JADX INFO: renamed from: b */
    public int f9543b;

    /* JADX INFO: renamed from: c */
    public int[] f9544c;

    /* JADX INFO: renamed from: d */
    public int f9545d;

    public C1338qn() {
        int iHighestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
        this.f9545d = iHighestOneBit - 1;
        this.f9544c = new int[iHighestOneBit];
    }

    /* JADX INFO: renamed from: a */
    public void m5573a(int i) {
        int[] iArr = this.f9544c;
        int i2 = this.f9543b;
        iArr[i2] = i;
        int i3 = this.f9545d & (i2 + 1);
        this.f9543b = i3;
        int i4 = this.f9542a;
        if (i3 == i4) {
            int length = iArr.length;
            int i5 = length - i4;
            int i6 = length << 1;
            if (i6 < 0) {
                l41.m4048q("Max array capacity exceeded");
                return;
            }
            int[] iArr2 = new int[i6];
            System.arraycopy(iArr, i4, iArr2, 0, i5);
            System.arraycopy(this.f9544c, 0, iArr2, i5, this.f9542a);
            this.f9544c = iArr2;
            this.f9542a = 0;
            this.f9543b = length;
            this.f9545d = i6 - 1;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m5574b(int i, int i2) {
        if (i < 0) {
            f40.m2713i("Layout positions must be non-negative");
            return;
        }
        if (i2 < 0) {
            f40.m2713i("Pixel distance must be non-negative");
            return;
        }
        int i3 = this.f9545d;
        int i4 = i3 * 2;
        int[] iArr = this.f9544c;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f9544c = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i4 >= iArr.length) {
            int[] iArr3 = new int[i3 * 4];
            this.f9544c = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.f9544c;
        iArr4[i4] = i;
        iArr4[i4 + 1] = i2;
        this.f9545d++;
    }

    /* JADX INFO: renamed from: c */
    public void m5575c(RecyclerView recyclerView, boolean z) {
        this.f9545d = 0;
        int[] iArr = this.f9544c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        AbstractC0066e abstractC0066e = recyclerView.f931s;
        if (recyclerView.f929r == null || abstractC0066e == null || !abstractC0066e.f990i) {
            return;
        }
        if (z) {
            if (!recyclerView.f908e.m7201l()) {
                abstractC0066e.mo538i(recyclerView.f929r.getItemCount(), this);
            }
        } else if (!recyclerView.m563L()) {
            abstractC0066e.mo537h(this.f9542a, this.f9543b, recyclerView.f918l0, this);
        }
        int i = this.f9545d;
        if (i > abstractC0066e.f991j) {
            abstractC0066e.f991j = i;
            abstractC0066e.f992k = z;
            recyclerView.f904c.m695m();
        }
    }
}
