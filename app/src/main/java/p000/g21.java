package p000;

import android.view.View;
import androidx.recyclerview.widget.AbstractC0068g;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class g21 {

    /* JADX INFO: renamed from: a */
    public int f4020a;

    /* JADX INFO: renamed from: b */
    public int f4021b;

    public /* synthetic */ g21(int i, int i2) {
        this.f4020a = i;
        this.f4021b = i2;
    }

    /* JADX INFO: renamed from: a */
    public int m2920a() {
        int i = this.f4021b;
        if (i == 2) {
            return 10;
        }
        if (i == 5) {
            return 11;
        }
        if (i == 29) {
            return 12;
        }
        if (i == 42) {
            return 16;
        }
        if (i != 22) {
            return i != 23 ? 0 : 15;
        }
        return 1073741824;
    }

    /* JADX INFO: renamed from: b */
    public void m2921b(AbstractC0068g abstractC0068g) {
        View view = abstractC0068g.itemView;
        this.f4020a = view.getLeft();
        this.f4021b = view.getTop();
        view.getRight();
        view.getBottom();
    }
}
