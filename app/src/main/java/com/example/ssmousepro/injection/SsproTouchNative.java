package com.example.ssmousepro.injection;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class SsproTouchNative {
    public static final SsproTouchNative INSTANCE = new SsproTouchNative();
    private static final String TAG = "SsproTouchNative";
    private static volatile boolean loadAttempted;
    private static volatile boolean loaded;

    private SsproTouchNative() {
    }

    public static final native void nativeTouchClose();

    public static final native boolean nativeTouchDown(int i, int i2, int i3);

    public static final native boolean nativeTouchIsOpen();

    public static final native boolean nativeTouchMove(int i, int i2, int i3);

    public static final native boolean nativeTouchOpen(int i, int i2, int i3);

    public static final native boolean nativeTouchUp(int i);

    public final boolean ensureLoaded() {
        if (loadAttempted) {
            return loaded;
        }
        synchronized (this) {
            if (loadAttempted) {
                return loaded;
            }
            loadAttempted = true;
            loaded = SsproInputNative.INSTANCE.ensureLoaded();
            if (!loaded) {
                Log.w(TAG, "libsspro_input indisponível para uinput");
            }
            return loaded;
        }
    }

    public final boolean getLoaded() {
        return loaded;
    }
}
