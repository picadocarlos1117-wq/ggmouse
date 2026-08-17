package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import p000.n21;
import p000.o21;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new n21(12);

    /* JADX INFO: renamed from: a */
    public final int f323a;

    /* JADX INFO: renamed from: b */
    public final long f324b;

    /* JADX INFO: renamed from: c */
    public final long f325c;

    /* JADX INFO: renamed from: d */
    public final float f326d;

    /* JADX INFO: renamed from: e */
    public final long f327e;

    /* JADX INFO: renamed from: f */
    public final int f328f;

    /* JADX INFO: renamed from: g */
    public final CharSequence f329g;

    /* JADX INFO: renamed from: m */
    public final long f330m;

    /* JADX INFO: renamed from: n */
    public final ArrayList f331n;

    /* JADX INFO: renamed from: o */
    public final long f332o;

    /* JADX INFO: renamed from: p */
    public final Bundle f333p;

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new C0032b();

        /* JADX INFO: renamed from: a */
        public final String f334a;

        /* JADX INFO: renamed from: b */
        public final CharSequence f335b;

        /* JADX INFO: renamed from: c */
        public final int f336c;

        /* JADX INFO: renamed from: d */
        public final Bundle f337d;

        public CustomAction(Parcel parcel) {
            this.f334a = parcel.readString();
            this.f335b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f336c = parcel.readInt();
            this.f337d = parcel.readBundle(o21.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.f335b) + ", mIcon=" + this.f336c + ", mExtras=" + this.f337d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f334a);
            TextUtils.writeToParcel(this.f335b, parcel, i);
            parcel.writeInt(this.f336c);
            parcel.writeBundle(this.f337d);
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f323a = parcel.readInt();
        this.f324b = parcel.readLong();
        this.f326d = parcel.readFloat();
        this.f330m = parcel.readLong();
        this.f325c = parcel.readLong();
        this.f327e = parcel.readLong();
        this.f329g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f331n = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f332o = parcel.readLong();
        this.f333p = parcel.readBundle(o21.class.getClassLoader());
        this.f328f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "PlaybackState {state=" + this.f323a + ", position=" + this.f324b + ", buffered position=" + this.f325c + ", speed=" + this.f326d + ", updated=" + this.f330m + ", actions=" + this.f327e + ", error code=" + this.f328f + ", error message=" + this.f329g + ", custom actions=" + this.f331n + ", active item id=" + this.f332o + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f323a);
        parcel.writeLong(this.f324b);
        parcel.writeFloat(this.f326d);
        parcel.writeLong(this.f330m);
        parcel.writeLong(this.f325c);
        parcel.writeLong(this.f327e);
        TextUtils.writeToParcel(this.f329g, parcel, i);
        parcel.writeTypedList(this.f331n);
        parcel.writeLong(this.f332o);
        parcel.writeBundle(this.f333p);
        parcel.writeInt(this.f328f);
    }
}
