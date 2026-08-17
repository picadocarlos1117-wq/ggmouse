package p000;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class uj1 {

    /* JADX INFO: renamed from: a */
    public int f11316a;

    /* JADX INFO: renamed from: b */
    public int f11317b;

    /* JADX INFO: renamed from: c */
    public int f11318c;

    /* JADX INFO: renamed from: d */
    public int f11319d;

    /* JADX INFO: renamed from: e */
    public Interpolator f11320e;

    /* JADX INFO: renamed from: f */
    public boolean f11321f;

    /* JADX INFO: renamed from: g */
    public int f11322g;

    /* JADX INFO: renamed from: a */
    public final void m6496a(RecyclerView recyclerView) {
        int i = this.f11319d;
        if (i >= 0) {
            this.f11319d = -1;
            recyclerView.m565N(i);
            this.f11321f = false;
            return;
        }
        if (!this.f11321f) {
            this.f11322g = 0;
            return;
        }
        Interpolator interpolator = this.f11320e;
        if (interpolator != null && this.f11318c < 1) {
            f40.m2719o("If you provide an interpolator, you must set a positive duration");
            return;
        }
        int i2 = this.f11318c;
        if (i2 < 1) {
            f40.m2719o("Scroll duration must be a positive number");
            return;
        }
        recyclerView.f915i0.m7319c(this.f11316a, this.f11317b, i2, interpolator);
        int i3 = this.f11322g + 1;
        this.f11322g = i3;
        if (i3 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f11321f = false;
    }
}
