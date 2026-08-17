package p000;

import android.media.LoudnessCodecController$OnLoudnessCodecUpdateListener;
import android.media.MediaCodec;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class gw0 implements LoudnessCodecController$OnLoudnessCodecUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1174o9 f4356a;

    public gw0(C1174o9 c1174o9) {
        this.f4356a = c1174o9;
    }

    public final Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
        ((f40) this.f4356a.f7699b).getClass();
        return bundle;
    }
}
