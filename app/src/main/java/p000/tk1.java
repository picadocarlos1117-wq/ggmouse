package p000;

import android.app.RemoteInput;
import android.content.Intent;
import android.net.Uri;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class tk1 {
    /* JADX INFO: renamed from: a */
    public static void m6285a(vk1 vk1Var, Intent intent, Map<String, Uri> map) {
        RemoteInput.addDataResultToIntent(vk1.m6641a(vk1Var), intent, map);
    }

    /* JADX INFO: renamed from: b */
    public static Set<String> m6286b(Object obj) {
        return ((RemoteInput) obj).getAllowedDataTypes();
    }

    /* JADX INFO: renamed from: c */
    public static Map<String, Uri> m6287c(Intent intent, String str) {
        return RemoteInput.getDataResultsFromIntent(intent, str);
    }

    /* JADX INFO: renamed from: d */
    public static RemoteInput.Builder m6288d(RemoteInput.Builder builder, String str, boolean z) {
        return builder.setAllowDataType(str, z);
    }
}
