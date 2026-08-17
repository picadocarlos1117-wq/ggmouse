package p000;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class b82 {

    /* JADX INFO: renamed from: a */
    public final WeakReference f1254a;

    public b82(View view) {
        this.f1254a = new WeakReference(view);
    }

    /* JADX INFO: renamed from: a */
    public final void m942a(float f) {
        View view = (View) this.f1254a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m943b() {
        View view = (View) this.f1254a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m944c(long j) {
        View view = (View) this.f1254a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m945d(d82 d82Var) {
        View view = (View) this.f1254a.get();
        if (view != null) {
            if (d82Var != null) {
                view.animate().setListener(new q22(d82Var, view, 1));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m946e(float f) {
        View view = (View) this.f1254a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }
}
