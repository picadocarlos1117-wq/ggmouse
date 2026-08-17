package p000;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v81 {
    /* JADX INFO: renamed from: a */
    public static Notification.Builder m6599a(Notification.Builder builder, Notification.Action action) {
        return builder.addAction(action);
    }

    /* JADX INFO: renamed from: b */
    public static Notification.Action.Builder m6600b(Notification.Action.Builder builder, Bundle bundle) {
        return builder.addExtras(bundle);
    }

    /* JADX INFO: renamed from: c */
    public static Notification.Action.Builder m6601c(Notification.Action.Builder builder, RemoteInput remoteInput) {
        return builder.addRemoteInput(remoteInput);
    }

    /* JADX INFO: renamed from: d */
    public static Notification.Action m6602d(Notification.Action.Builder builder) {
        return builder.build();
    }

    /* JADX INFO: renamed from: e */
    public static Notification.Action.Builder m6603e(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        return new Notification.Action.Builder(i, charSequence, pendingIntent);
    }

    /* JADX INFO: renamed from: f */
    public static String m6604f(Notification notification) {
        return notification.getGroup();
    }

    /* JADX INFO: renamed from: g */
    public static Notification.Builder m6605g(Notification.Builder builder, String str) {
        return builder.setGroup(str);
    }

    /* JADX INFO: renamed from: h */
    public static Notification.Builder m6606h(Notification.Builder builder, boolean z) {
        return builder.setGroupSummary(z);
    }

    /* JADX INFO: renamed from: i */
    public static Notification.Builder m6607i(Notification.Builder builder, boolean z) {
        return builder.setLocalOnly(z);
    }

    /* JADX INFO: renamed from: j */
    public static Notification.Builder m6608j(Notification.Builder builder, String str) {
        return builder.setSortKey(str);
    }
}
