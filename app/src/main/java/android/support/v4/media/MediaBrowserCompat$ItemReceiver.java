package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import p000.o21;
import p000.wl1;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
class MediaBrowserCompat$ItemReceiver extends wl1 {
    @Override // p000.wl1
    /* JADX INFO: renamed from: a */
    public final void mo202a(int i, Bundle bundle) {
        if (bundle != null) {
            bundle = o21.m4691y0(bundle);
        }
        if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
            throw null;
        }
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable != null && !(parcelable instanceof MediaBrowserCompat$MediaItem)) {
            throw null;
        }
        throw null;
    }
}
