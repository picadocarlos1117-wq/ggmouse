package p000;

import android.app.Notification;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c91 {
    /* JADX INFO: renamed from: a */
    public static Notification.Action.Builder m1171a(Notification.Action.Builder builder, boolean z) {
        return builder.setAuthenticationRequired(z);
    }

    /* JADX INFO: renamed from: b */
    public static Notification.Builder m1172b(Notification.Builder builder, int i) {
        return builder.setForegroundServiceBehavior(i);
    }
}
