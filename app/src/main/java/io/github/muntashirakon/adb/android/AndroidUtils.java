package io.github.muntashirakon.adb.android;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import java.net.InetAddress;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class AndroidUtils {
    private static final String GOLDFISH = "goldfish";
    private static final String RANCHU = "ranchu";
    private static final String SDK = "sdk";

    public static String getHostIpAddress(Context context) {
        if (isEmulator(context)) {
            return "10.0.2.2";
        }
        String hostAddress = InetAddress.getLoopbackAddress().getHostAddress();
        return (hostAddress == null || hostAddress.equals("::1")) ? "127.0.0.1" : hostAddress;
    }

    public static boolean isEmulator(Context context) {
        if (Build.PRODUCT.contains(SDK)) {
            return true;
        }
        String str = Build.HARDWARE;
        return str.contains(GOLDFISH) || str.contains(RANCHU) || Settings.Secure.getString(context.getContentResolver(), "android_id") == null;
    }
}
