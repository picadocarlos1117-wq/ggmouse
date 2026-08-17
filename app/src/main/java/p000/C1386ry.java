package p000;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* JADX INFO: renamed from: ry */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1386ry extends AudioTrack$StreamEventCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1174o9 f10157a;

    public C1386ry(C1174o9 c1174o9) {
        this.f10157a = c1174o9;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        C1423sy c1423sy;
        pn0 pn0Var;
        g80 g80Var;
        C1174o9 c1174o9 = this.f10157a;
        if (audioTrack.equals(((C1423sy) c1174o9.f7701d).f10641v) && (pn0Var = (c1423sy = (C1423sy) c1174o9.f7701d).f10637r) != null && c1423sy.f10606V && (g80Var = ((a11) pn0Var.f8968a).f3965K) != null) {
            g80Var.m2941a();
        }
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        C1174o9 c1174o9 = this.f10157a;
        if (audioTrack.equals(((C1423sy) c1174o9.f7701d).f10641v)) {
            ((C1423sy) c1174o9.f7701d).f10605U = true;
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        C1423sy c1423sy;
        pn0 pn0Var;
        g80 g80Var;
        C1174o9 c1174o9 = this.f10157a;
        if (audioTrack.equals(((C1423sy) c1174o9.f7701d).f10641v) && (pn0Var = (c1423sy = (C1423sy) c1174o9.f7701d).f10637r) != null && c1423sy.f10606V && (g80Var = ((a11) pn0Var.f8968a).f3965K) != null) {
            g80Var.m2941a();
        }
    }
}
