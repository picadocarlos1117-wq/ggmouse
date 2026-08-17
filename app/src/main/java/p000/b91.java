package p000;

import android.app.Notification;
import android.content.LocusId;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b91 {
    /* JADX INFO: renamed from: a */
    public static Notification.Builder m948a(Notification.Builder builder, boolean z) {
        return builder.setAllowSystemGeneratedContextualActions(z);
    }

    /* JADX INFO: renamed from: b */
    public static Notification.Builder m949b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
        return builder.setBubbleMetadata(bubbleMetadata);
    }

    /* JADX INFO: renamed from: c */
    public static Notification.Action.Builder m950c(Notification.Action.Builder builder, boolean z) {
        return builder.setContextual(z);
    }

    /* JADX INFO: renamed from: d */
    public static Notification.Builder m951d(Notification.Builder builder, Object obj) {
        return builder.setLocusId((LocusId) obj);
    }
}
