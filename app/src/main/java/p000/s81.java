package p000;

import android.app.Notification;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s81 {
    /* JADX INFO: renamed from: a */
    public static Notification m6004a(Notification.Builder builder) {
        return builder.build();
    }

    /* JADX INFO: renamed from: b */
    public static Notification.Builder m6005b(Notification.Builder builder, int i) {
        return builder.setPriority(i);
    }

    /* JADX INFO: renamed from: c */
    public static Notification.Builder m6006c(Notification.Builder builder, CharSequence charSequence) {
        return builder.setSubText(charSequence);
    }

    /* JADX INFO: renamed from: d */
    public static Notification.Builder m6007d(Notification.Builder builder, boolean z) {
        return builder.setUsesChronometer(z);
    }
}
