package p000;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class p81 {

    /* JADX INFO: renamed from: a */
    public final Bundle f8798a;

    /* JADX INFO: renamed from: b */
    public IconCompat f8799b;

    /* JADX INFO: renamed from: c */
    public final vk1[] f8800c;

    /* JADX INFO: renamed from: d */
    public final boolean f8801d;

    /* JADX INFO: renamed from: e */
    public final boolean f8802e;

    /* JADX INFO: renamed from: f */
    public final int f8803f;

    /* JADX INFO: renamed from: g */
    public final CharSequence f8804g;

    /* JADX INFO: renamed from: h */
    public final PendingIntent f8805h;

    public p81(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, vk1[] vk1VarArr) {
        this.f8802e = true;
        this.f8799b = iconCompat;
        if (iconCompat != null) {
            int i = iconCompat.f610a;
            if ((i == -1 ? sl0.m6114c(iconCompat.f611b) : i) == 2) {
                this.f8803f = iconCompat.m307b();
            }
        }
        this.f8804g = r81.m5742b(charSequence);
        this.f8805h = pendingIntent;
        this.f8798a = bundle;
        this.f8800c = vk1VarArr;
        this.f8801d = true;
        this.f8802e = true;
    }
}
