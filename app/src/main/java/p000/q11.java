package p000;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q11 {
    /* JADX INFO: renamed from: a */
    public static MediaDescription m5388a(MediaDescription.Builder builder) {
        return builder.build();
    }

    /* JADX INFO: renamed from: b */
    public static MediaDescription.Builder m5389b() {
        return new MediaDescription.Builder();
    }

    /* JADX INFO: renamed from: c */
    public static CharSequence m5390c(MediaDescription mediaDescription) {
        return mediaDescription.getDescription();
    }

    /* JADX INFO: renamed from: d */
    public static Bundle m5391d(MediaDescription mediaDescription) {
        return mediaDescription.getExtras();
    }

    /* JADX INFO: renamed from: e */
    public static Bitmap m5392e(MediaDescription mediaDescription) {
        return mediaDescription.getIconBitmap();
    }

    /* JADX INFO: renamed from: f */
    public static Uri m5393f(MediaDescription mediaDescription) {
        return mediaDescription.getIconUri();
    }

    /* JADX INFO: renamed from: g */
    public static String m5394g(MediaDescription mediaDescription) {
        return mediaDescription.getMediaId();
    }

    /* JADX INFO: renamed from: h */
    public static CharSequence m5395h(MediaDescription mediaDescription) {
        return mediaDescription.getSubtitle();
    }

    /* JADX INFO: renamed from: i */
    public static CharSequence m5396i(MediaDescription mediaDescription) {
        return mediaDescription.getTitle();
    }

    /* JADX INFO: renamed from: j */
    public static void m5397j(MediaDescription.Builder builder, CharSequence charSequence) {
        builder.setDescription(charSequence);
    }

    /* JADX INFO: renamed from: k */
    public static void m5398k(MediaDescription.Builder builder, Bundle bundle) {
        builder.setExtras(bundle);
    }

    /* JADX INFO: renamed from: l */
    public static void m5399l(MediaDescription.Builder builder, Bitmap bitmap) {
        builder.setIconBitmap(bitmap);
    }

    /* JADX INFO: renamed from: m */
    public static void m5400m(MediaDescription.Builder builder, Uri uri) {
        builder.setIconUri(uri);
    }

    /* JADX INFO: renamed from: n */
    public static void m5401n(MediaDescription.Builder builder, String str) {
        builder.setMediaId(str);
    }

    /* JADX INFO: renamed from: o */
    public static void m5402o(MediaDescription.Builder builder, CharSequence charSequence) {
        builder.setSubtitle(charSequence);
    }

    /* JADX INFO: renamed from: p */
    public static void m5403p(MediaDescription.Builder builder, CharSequence charSequence) {
        builder.setTitle(charSequence);
    }
}
