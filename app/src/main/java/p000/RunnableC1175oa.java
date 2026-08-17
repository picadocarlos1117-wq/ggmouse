package p000;

import androidx.media3.p003ui.AspectRatioFrameLayout;

/* JADX INFO: renamed from: oa */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1175oa implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7707a;

    /* JADX INFO: renamed from: b */
    public boolean f7708b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f7709c;

    public /* synthetic */ RunnableC1175oa(boolean z, int i, Object obj) {
        this.f7707a = i;
        this.f7709c = obj;
        this.f7708b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f7707a;
        Object obj = this.f7709c;
        switch (i) {
            case 0:
                this.f7708b = false;
                int i2 = AspectRatioFrameLayout.f784d;
                break;
            case 1:
                ((kx0) obj).f6056f.setMessageCompression(this.f7708b);
                break;
            case 2:
                ((t10) obj).f10697c.mo1025a(this.f7708b);
                break;
            default:
                w20 w20Var = (w20) ((RunnableC1466u3) obj).f11107c;
                if (this.f7708b) {
                    w20Var.f11917A = true;
                    if (w20Var.f11932x > 0) {
                        sv1 sv1Var = w20Var.f11934z;
                        sv1Var.f10565a = false;
                        sv1Var.m6142b();
                    }
                }
                w20Var.f11922F = false;
                break;
        }
    }

    public RunnableC1175oa(AspectRatioFrameLayout aspectRatioFrameLayout) {
        this.f7707a = 0;
        this.f7709c = aspectRatioFrameLayout;
    }
}
