package p000;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class r81 {

    /* JADX INFO: renamed from: a */
    public final Context f9809a;

    /* JADX INFO: renamed from: e */
    public CharSequence f9813e;

    /* JADX INFO: renamed from: f */
    public CharSequence f9814f;

    /* JADX INFO: renamed from: g */
    public PendingIntent f9815g;

    /* JADX INFO: renamed from: h */
    public int f9816h;

    /* JADX INFO: renamed from: j */
    public qo0 f9818j;

    /* JADX INFO: renamed from: l */
    public Bundle f9820l;

    /* JADX INFO: renamed from: m */
    public String f9821m;

    /* JADX INFO: renamed from: n */
    public final boolean f9822n;

    /* JADX INFO: renamed from: o */
    public final Notification f9823o;

    /* JADX INFO: renamed from: p */
    public final ArrayList f9824p;

    /* JADX INFO: renamed from: b */
    public final ArrayList f9810b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final ArrayList f9811c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final ArrayList f9812d = new ArrayList();

    /* JADX INFO: renamed from: i */
    public final boolean f9817i = true;

    /* JADX INFO: renamed from: k */
    public boolean f9819k = false;

    public r81(Context context, String str) {
        Notification notification = new Notification();
        this.f9823o = notification;
        this.f9809a = context;
        this.f9821m = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f9816h = 0;
        this.f9824p = new ArrayList();
        this.f9822n = true;
    }

    /* JADX INFO: renamed from: b */
    public static CharSequence m5742b(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    /* JADX INFO: renamed from: a */
    public final Notification m5743a() {
        Bundle bundle;
        C1174o9 c1174o9 = new C1174o9(this);
        Notification.Builder builder = (Notification.Builder) c1174o9.f7699b;
        r81 r81Var = (r81) c1174o9.f7700c;
        qo0 qo0Var = r81Var.f9818j;
        if (qo0Var != null) {
            q81.m5453a(q81.m5455c(q81.m5454b(builder), null), (CharSequence) qo0Var.f9549c);
        }
        Notification notificationM6004a = s81.m6004a(builder);
        if (qo0Var != null) {
            r81Var.f9818j.getClass();
        }
        if (qo0Var != null && (bundle = notificationM6004a.extras) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", "androidx.core.app.NotificationCompat$BigTextStyle");
        }
        return notificationM6004a;
    }

    /* JADX INFO: renamed from: c */
    public final void m5744c(int i, boolean z) {
        Notification notification = this.f9823o;
        if (z) {
            notification.flags = i | notification.flags;
        } else {
            notification.flags = (~i) & notification.flags;
        }
    }
}
