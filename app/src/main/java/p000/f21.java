package p000;

import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class f21 {
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ NetworkEvent.Builder m2679e() {
        return new NetworkEvent.Builder();
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ PlaybackErrorEvent.Builder m2680f() {
        return new PlaybackErrorEvent.Builder();
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ PlaybackMetrics.Builder m2681g() {
        return new PlaybackMetrics.Builder();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ PlaybackStateEvent.Builder m2682h() {
        return new PlaybackStateEvent.Builder();
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ TrackChangeEvent.Builder m2683i(int i) {
        return new TrackChangeEvent.Builder(i);
    }
}
