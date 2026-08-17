package p000;

import android.app.Notification;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z81 {
    /* JADX INFO: renamed from: a */
    public static Notification.Builder m7260a(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    /* JADX INFO: renamed from: b */
    public static Notification.Builder m7261b(Notification.Builder builder, int i) {
        return builder.setBadgeIconType(i);
    }

    /* JADX INFO: renamed from: c */
    public static Notification.Builder m7262c(Notification.Builder builder, boolean z) {
        return builder.setColorized(z);
    }

    /* JADX INFO: renamed from: d */
    public static Notification.Builder m7263d(Notification.Builder builder, int i) {
        return builder.setGroupAlertBehavior(i);
    }

    /* JADX INFO: renamed from: e */
    public static Notification.Builder m7264e(Notification.Builder builder, CharSequence charSequence) {
        return builder.setSettingsText(charSequence);
    }

    /* JADX INFO: renamed from: f */
    public static Notification.Builder m7265f(Notification.Builder builder, String str) {
        return builder.setShortcutId(str);
    }

    /* JADX INFO: renamed from: g */
    public static Notification.Builder m7266g(Notification.Builder builder, long j) {
        return builder.setTimeoutAfter(j);
    }
}
