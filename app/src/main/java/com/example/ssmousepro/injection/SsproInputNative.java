package com.example.ssmousepro.injection;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class SsproInputNative {
    public static final SsproInputNative INSTANCE = new SsproInputNative();
    private static final String TAG = "SsproInputNative";
    private static volatile boolean loadAttempted;
    private static volatile boolean loaded;

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public interface Callback {
        void onKey(int i, int i2, boolean z, boolean z2);

        void onMouseMove(int i, int i2);

        void onSync();
    }

    private SsproInputNative() {
    }

    public static final native boolean nativeIsRunning();

    public static final native void nativeRefreshDevices();

    public static final native void nativeSetGrabMouse(boolean z);

    public static final native boolean nativeStart(Callback callback);

    public static final native void nativeStop();

    public final boolean ensureLoaded() {
        if (loadAttempted) {
            return loaded;
        }
        synchronized (this) {
            if (loadAttempted) {
                return loaded;
            }
            boolean z = true;
            loadAttempted = true;
            try {
                System.loadLibrary("sspro_input");
            } catch (Throwable th) {
                Log.w(TAG, "libsspro_input indisponível — fallback Kotlin", th);
                z = false;
            }
            loaded = z;
            return loaded;
        }
    }

    public final boolean getLoaded() {
        return loaded;
    }
}
