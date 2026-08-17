package p000;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class y00 implements Spatializer$OnSpatializerStateChangedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ d10 f12795a;

    public y00(d10 d10Var) {
        this.f12795a = d10Var;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        eb1 eb1Var = d10.f2702j;
        this.f12795a.m2172d();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        eb1 eb1Var = d10.f2702j;
        this.f12795a.m2172d();
    }
}
