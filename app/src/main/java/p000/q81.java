package p000;

import android.app.Notification;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q81 {
    /* JADX INFO: renamed from: a */
    public static Notification.BigTextStyle m5453a(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
        return bigTextStyle.bigText(charSequence);
    }

    /* JADX INFO: renamed from: b */
    public static Notification.BigTextStyle m5454b(Notification.Builder builder) {
        return new Notification.BigTextStyle(builder);
    }

    /* JADX INFO: renamed from: c */
    public static Notification.BigTextStyle m5455c(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
        return bigTextStyle.setBigContentTitle(charSequence);
    }

    /* JADX INFO: renamed from: d */
    public static Notification.BigTextStyle m5456d(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
        return bigTextStyle.setSummaryText(charSequence);
    }
}
