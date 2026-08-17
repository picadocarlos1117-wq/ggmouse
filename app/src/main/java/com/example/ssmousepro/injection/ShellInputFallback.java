package com.example.ssmousepro.injection;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ShellInputFallback {
    public static final ShellInputFallback INSTANCE = new ShellInputFallback();
    private static final String TAG = "ShellInputFallback";

    private ShellInputFallback() {
    }

    public final boolean tap(int i, int i2) {
        try {
            boolean z = true;
            if (new ProcessBuilder("input", "tap", String.valueOf(i), String.valueOf(i2)).redirectErrorStream(true).start().waitFor() != 0) {
                z = false;
            }
            if (z) {
                return z;
            }
            Log.w(TAG, "input tap falhou para (" + i + ", " + i2 + ")");
            return z;
        } catch (Exception e) {
            Log.e(TAG, "Erro no fallback input tap (" + i + ", " + i2 + ")", e);
            return false;
        }
    }
}
