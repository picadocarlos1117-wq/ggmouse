package p000;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.drawable.Icon;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x81 {
    /* JADX INFO: renamed from: a */
    public static Notification.Action.Builder m6870a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
        return new Notification.Action.Builder(icon, charSequence, pendingIntent);
    }

    /* JADX INFO: renamed from: b */
    public static Notification.Builder m6871b(Notification.Builder builder, Object obj) {
        return builder.setSmallIcon((Icon) obj);
    }
}
