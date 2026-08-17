package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p000.C0701h4;
import p000.q11;
import p000.r11;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new C0701h4(28);

    /* JADX INFO: renamed from: a */
    public final String f301a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f302b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f303c;

    /* JADX INFO: renamed from: d */
    public final CharSequence f304d;

    /* JADX INFO: renamed from: e */
    public final Bitmap f305e;

    /* JADX INFO: renamed from: f */
    public final Uri f306f;

    /* JADX INFO: renamed from: g */
    public final Bundle f307g;

    /* JADX INFO: renamed from: m */
    public final Uri f308m;

    /* JADX INFO: renamed from: n */
    public MediaDescription f309n;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f301a = str;
        this.f302b = charSequence;
        this.f303c = charSequence2;
        this.f304d = charSequence3;
        this.f305e = bitmap;
        this.f306f = uri;
        this.f307g = bundle;
        this.f308m = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f302b) + ", " + ((Object) this.f303c) + ", " + ((Object) this.f304d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MediaDescription mediaDescriptionM5388a = this.f309n;
        if (mediaDescriptionM5388a == null) {
            MediaDescription.Builder builderM5389b = q11.m5389b();
            q11.m5401n(builderM5389b, this.f301a);
            q11.m5403p(builderM5389b, this.f302b);
            q11.m5402o(builderM5389b, this.f303c);
            q11.m5397j(builderM5389b, this.f304d);
            q11.m5399l(builderM5389b, this.f305e);
            q11.m5400m(builderM5389b, this.f306f);
            q11.m5398k(builderM5389b, this.f307g);
            r11.m5657b(builderM5389b, this.f308m);
            mediaDescriptionM5388a = q11.m5388a(builderM5389b);
            this.f309n = mediaDescriptionM5388a;
        }
        mediaDescriptionM5388a.writeToParcel(parcel, i);
    }
}
