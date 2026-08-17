package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gu0 {

    /* JADX INFO: renamed from: a */
    public final j91 f4322a;

    /* JADX INFO: renamed from: b */
    public boolean f4323b;

    /* JADX INFO: renamed from: c */
    public int f4324c = -1;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ hu0 f4325d;

    public gu0(hu0 hu0Var, j91 j91Var) {
        this.f4325d = hu0Var;
        this.f4322a = j91Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m3057a(boolean z) {
        if (z == this.f4323b) {
            return;
        }
        this.f4323b = z;
        int i = z ? 1 : -1;
        hu0 hu0Var = this.f4325d;
        int i2 = hu0Var.f4707c;
        hu0Var.f4707c = i + i2;
        if (!hu0Var.f4708d) {
            hu0Var.f4708d = true;
            while (true) {
                try {
                    int i3 = hu0Var.f4707c;
                    if (i2 == i3) {
                        break;
                    }
                    boolean z2 = i2 == 0 && i3 > 0;
                    boolean z3 = i2 > 0 && i3 == 0;
                    if (z2) {
                        hu0Var.mo1068e();
                    } else if (z3) {
                        hu0Var.mo1069f();
                    }
                    i2 = i3;
                } catch (Throwable th) {
                    hu0Var.f4708d = false;
                    throw th;
                }
            }
            hu0Var.f4708d = false;
        }
        if (this.f4323b) {
            hu0Var.m3293c(this);
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean mo2851d(ms0 ms0Var) {
        return false;
    }

    /* JADX INFO: renamed from: e */
    public abstract boolean mo2644e();

    /* JADX INFO: renamed from: b */
    public void mo2850b() {
    }
}
