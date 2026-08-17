package p000;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.firebase.firestore.local.LocalStore;

/* JADX INFO: renamed from: ec */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0598ec implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3307a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f3308b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f3309c;

    public /* synthetic */ RunnableC0598ec(l80 l80Var, int i, boolean z) {
        this.f3307a = 1;
        this.f3309c = l80Var;
        this.f3308b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f3307a;
        int i2 = this.f3308b;
        Object obj = this.f3309c;
        switch (i) {
            case 0:
                C0672gc c0672gc = ((C0635fc) obj).f3747b;
                if (i2 == -3 || i2 == -2) {
                    if (i2 == -2) {
                        c80 c80Var = c0672gc.f4136c;
                        if (c80Var != null) {
                            f80 f80Var = c80Var.f1699a;
                            f80Var.m2750K(0, 1, f80Var.m2767n());
                        }
                        c0672gc.m2953b(3);
                    } else {
                        c0672gc.m2953b(4);
                    }
                } else if (i2 == -1) {
                    c80 c80Var2 = c0672gc.f4136c;
                    if (c80Var2 != null) {
                        f80 f80Var2 = c80Var2.f1699a;
                        f80Var2.m2750K(-1, 2, f80Var2.m2767n());
                    }
                    c0672gc.m2952a();
                    c0672gc.m2953b(1);
                } else if (i2 == 1) {
                    c0672gc.m2953b(2);
                    c80 c80Var3 = c0672gc.f4136c;
                    if (c80Var3 != null) {
                        f80 f80Var3 = c80Var3.f1699a;
                        f80Var3.m2750K(1, 1, f80Var3.m2767n());
                    }
                } else {
                    jd0.m3621s(i2, "Unknown focus change type: ", "AudioFocusManager");
                }
                break;
            case 1:
                l80 l80Var = (l80) obj;
                C0808jy c0808jy = l80Var.f6213C;
                int i3 = l80Var.f6237a[i2].f5807b;
                c0808jy.m3724k(c0808jy.m3723j(), 1033, new C0583dy(13));
                break;
            case 2:
                ((LocalStore) obj).lambda$releaseTarget$17(i2);
                break;
            case 3:
                ((AbstractC1337qm) obj).mo4487M(i2);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                View view = (View) sideSheetBehavior.f2103p.get();
                if (view != null) {
                    sideSheetBehavior.m1697y(view, i2, false);
                }
                break;
        }
    }

    public /* synthetic */ RunnableC0598ec(int i, int i2, Object obj) {
        this.f3307a = i2;
        this.f3309c = obj;
        this.f3308b = i;
    }
}
