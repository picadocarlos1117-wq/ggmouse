package p000;

import android.media.MediaFormat;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class d80 implements z52, InterfaceC0718hl, ze1 {

    /* JADX INFO: renamed from: a */
    public z52 f2823a;

    /* JADX INFO: renamed from: b */
    public InterfaceC0718hl f2824b;

    /* JADX INFO: renamed from: c */
    public z52 f2825c;

    /* JADX INFO: renamed from: d */
    public InterfaceC0718hl f2826d;

    @Override // p000.InterfaceC0718hl
    /* JADX INFO: renamed from: a */
    public final void mo2285a(long j, float[] fArr) {
        InterfaceC0718hl interfaceC0718hl = this.f2826d;
        if (interfaceC0718hl != null) {
            interfaceC0718hl.mo2285a(j, fArr);
        }
        InterfaceC0718hl interfaceC0718hl2 = this.f2824b;
        if (interfaceC0718hl2 != null) {
            interfaceC0718hl2.mo2285a(j, fArr);
        }
    }

    @Override // p000.InterfaceC0718hl
    /* JADX INFO: renamed from: b */
    public final void mo2286b() {
        InterfaceC0718hl interfaceC0718hl = this.f2826d;
        if (interfaceC0718hl != null) {
            interfaceC0718hl.mo2286b();
        }
        InterfaceC0718hl interfaceC0718hl2 = this.f2824b;
        if (interfaceC0718hl2 != null) {
            interfaceC0718hl2.mo2286b();
        }
    }

    @Override // p000.z52
    /* JADX INFO: renamed from: c */
    public final void mo2287c(long j, long j2, be0 be0Var, MediaFormat mediaFormat) {
        z52 z52Var = this.f2825c;
        if (z52Var != null) {
            z52Var.mo2287c(j, j2, be0Var, mediaFormat);
        }
        z52 z52Var2 = this.f2823a;
        if (z52Var2 != null) {
            z52Var2.mo2287c(j, j2, be0Var, mediaFormat);
        }
    }

    @Override // p000.ze1
    /* JADX INFO: renamed from: d */
    public final void mo29d(int i, Object obj) {
        if (i == 7) {
            this.f2823a = (z52) obj;
            return;
        }
        if (i == 8) {
            this.f2824b = (InterfaceC0718hl) obj;
            return;
        }
        if (i != 10000) {
            return;
        }
        lu1 lu1Var = (lu1) obj;
        if (lu1Var == null) {
            this.f2825c = null;
            this.f2826d = null;
        } else {
            this.f2825c = lu1Var.getVideoFrameMetadataListener();
            this.f2826d = lu1Var.getCameraMotionListener();
        }
    }
}
