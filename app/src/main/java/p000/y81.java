package p000;

import android.app.Notification;
import android.widget.RemoteViews;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y81 {
    /* JADX INFO: renamed from: a */
    public static Notification.Action.Builder m7040a(Notification.Action.Builder builder, boolean z) {
        return builder.setAllowGeneratedReplies(z);
    }

    /* JADX INFO: renamed from: b */
    public static Notification.Builder m7041b(Notification.Builder builder, RemoteViews remoteViews) {
        return builder.setCustomBigContentView(remoteViews);
    }

    /* JADX INFO: renamed from: c */
    public static Notification.Builder m7042c(Notification.Builder builder, RemoteViews remoteViews) {
        return builder.setCustomContentView(remoteViews);
    }

    /* JADX INFO: renamed from: d */
    public static Notification.Builder m7043d(Notification.Builder builder, RemoteViews remoteViews) {
        return builder.setCustomHeadsUpContentView(remoteViews);
    }

    /* JADX INFO: renamed from: e */
    public static Notification.Builder m7044e(Notification.Builder builder, CharSequence[] charSequenceArr) {
        return builder.setRemoteInputHistory(charSequenceArr);
    }
}
