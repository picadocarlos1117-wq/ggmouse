package p000;

import android.app.Notification;
import android.media.AudioAttributes;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w81 {
    /* JADX INFO: renamed from: a */
    public static Notification.Builder m6727a(Notification.Builder builder, String str) {
        return builder.addPerson(str);
    }

    /* JADX INFO: renamed from: b */
    public static Notification.Builder m6728b(Notification.Builder builder, String str) {
        return builder.setCategory(str);
    }

    /* JADX INFO: renamed from: c */
    public static Notification.Builder m6729c(Notification.Builder builder, int i) {
        return builder.setColor(i);
    }

    /* JADX INFO: renamed from: d */
    public static Notification.Builder m6730d(Notification.Builder builder, Notification notification) {
        return builder.setPublicVersion(notification);
    }

    /* JADX INFO: renamed from: e */
    public static Notification.Builder m6731e(Notification.Builder builder, Uri uri, Object obj) {
        return builder.setSound(uri, (AudioAttributes) obj);
    }

    /* JADX INFO: renamed from: f */
    public static Notification.Builder m6732f(Notification.Builder builder, int i) {
        return builder.setVisibility(i);
    }
}
