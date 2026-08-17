package p000;

import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import androidx.fragment.app.C0038b;
import androidx.fragment.app.C0058v;
import com.example.ssmousepro.injection.InjectionMetrics;
import java.util.ArrayList;
import moe.shizuku.api.BinderContainer;
import p000.C0701h4;

/* JADX INFO: renamed from: h4 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0701h4 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4448a;

    public /* synthetic */ C0701h4(int i) {
        this.f4448a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(final Parcel parcel) {
        Bundle bundle;
        switch (this.f4448a) {
            case 0:
                return new C0738i4(parcel);
            case 1:
                return new C1097m6(parcel);
            case 2:
                C1434t8 c1434t8 = new C1434t8(parcel);
                c1434t8.f10800a = parcel.readByte() != 0;
                return c1434t8;
            case 3:
                String string = parcel.readString();
                string.getClass();
                return new C1100m9(parcel.readInt(), string);
            case 4:
                return new C0038b(parcel);
            case 5:
                return new C1405sg(parcel);
            case 6:
                return new C1665zh(parcel);
            case 7:
                BinderContainer binderContainer = new BinderContainer();
                binderContainer.f7059a = parcel.readStrongBinder();
                return binderContainer;
            case 8:
                return new C1409sk((b61) parcel.readParcelable(b61.class.getClassLoader()), (b61) parcel.readParcelable(b61.class.getClassLoader()), (C1124mx) parcel.readParcelable(C1124mx.class.getClassLoader()), (b61) parcel.readParcelable(b61.class.getClassLoader()), parcel.readInt());
            case 9:
                return new C1522vm(parcel);
            case 10:
                return new C1559wm(parcel);
            case 11:
                return new C0649fq(parcel);
            case 12:
                return new C1124mx(parcel.readLong());
            case 13:
                return new z30(parcel);
            case 14:
                return new y30(parcel);
            case 15:
                return new d70(parcel);
            case 16:
                ef0 ef0Var = new ef0();
                ef0Var.f3328a = parcel.readString();
                ef0Var.f3329b = parcel.readInt();
                return ef0Var;
            case 17:
                if0 if0Var = new if0();
                if0Var.f5005e = null;
                if0Var.f5006f = new ArrayList();
                if0Var.f5007g = new ArrayList();
                if0Var.f5001a = parcel.createStringArrayList();
                if0Var.f5002b = parcel.createStringArrayList();
                if0Var.f5003c = (C0038b[]) parcel.createTypedArray(C0038b.CREATOR);
                if0Var.f5004d = parcel.readInt();
                if0Var.f5005e = parcel.readString();
                if0Var.f5006f = parcel.createStringArrayList();
                if0Var.f5007g = parcel.createTypedArrayList(C1405sg.CREATOR);
                if0Var.f5008m = parcel.createTypedArrayList(ef0.CREATOR);
                return if0Var;
            case 18:
                return new C0058v(parcel);
            case 19:
                return new gi0(parcel);
            case 20:
                return new wl0(parcel);
            case 21:
                return new xl0(parcel);
            case 22:
                parcel.getClass();
                Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                parcelable.getClass();
                return new eo0((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 23:
                return new to0(parcel);
            case 24:
                vs0 vs0Var = new vs0();
                vs0Var.f11761a = parcel.readInt();
                vs0Var.f11762b = parcel.readInt();
                vs0Var.f11763c = parcel.readInt() == 1;
                return vs0Var;
            case 25:
                sz0 sz0Var = new sz0(parcel);
                sz0Var.f10656a = ((Integer) parcel.readValue(sz0.class.getClassLoader())).intValue();
                return sz0Var;
            case InjectionMetrics.I_MAX_ACTIVE_REJ /* 26 */:
                return new p01(parcel);
            case InjectionMetrics.I_TAP_ID_EXHAUST /* 27 */:
                return new Parcelable(parcel) { // from class: android.support.v4.media.MediaBrowserCompat$MediaItem
                    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new C0701h4(27);

                    /* JADX INFO: renamed from: a */
                    public final int f299a;

                    /* JADX INFO: renamed from: b */
                    public final MediaDescriptionCompat f300b;

                    {
                        this.f299a = parcel.readInt();
                        this.f300b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaItem{mFlags=" + this.f299a + ", mDescription=" + this.f300b + '}';
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i) {
                        parcel2.writeInt(this.f299a);
                        this.f300b.writeToParcel(parcel2, i);
                    }
                };
            default:
                Object objCreateFromParcel = MediaDescription.CREATOR.createFromParcel(parcel);
                if (objCreateFromParcel == null) {
                    return null;
                }
                MediaDescription mediaDescription = (MediaDescription) objCreateFromParcel;
                String strM5394g = q11.m5394g(mediaDescription);
                CharSequence charSequenceM5396i = q11.m5396i(mediaDescription);
                CharSequence charSequenceM5395h = q11.m5395h(mediaDescription);
                CharSequence charSequenceM5390c = q11.m5390c(mediaDescription);
                Bitmap bitmapM5392e = q11.m5392e(mediaDescription);
                Uri uriM5393f = q11.m5393f(mediaDescription);
                Bundle bundleM5391d = q11.m5391d(mediaDescription);
                if (bundleM5391d != null) {
                    bundleM5391d = o21.m4691y0(bundleM5391d);
                }
                Uri uriM5656a = bundleM5391d != null ? (Uri) bundleM5391d.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
                if (uriM5656a == null) {
                    bundle = bundleM5391d;
                } else if (bundleM5391d.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && bundleM5391d.size() == 2) {
                    bundle = null;
                } else {
                    bundleM5391d.remove("android.support.v4.media.description.MEDIA_URI");
                    bundleM5391d.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                    bundle = bundleM5391d;
                }
                if (uriM5656a == null) {
                    uriM5656a = r11.m5656a(mediaDescription);
                }
                MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(strM5394g, charSequenceM5396i, charSequenceM5395h, charSequenceM5390c, bitmapM5392e, uriM5393f, bundle, uriM5656a);
                mediaDescriptionCompat.f309n = mediaDescription;
                return mediaDescriptionCompat;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f4448a) {
            case 0:
                return new C0738i4[i];
            case 1:
                return new C1097m6[i];
            case 2:
                return new C1434t8[i];
            case 3:
                return new C1100m9[i];
            case 4:
                return new C0038b[i];
            case 5:
                return new C1405sg[i];
            case 6:
                return new C1665zh[i];
            case 7:
                return new BinderContainer[i];
            case 8:
                return new C1409sk[i];
            case 9:
                return new C1522vm[i];
            case 10:
                return new C1559wm[i];
            case 11:
                return new C0649fq[i];
            case 12:
                return new C1124mx[i];
            case 13:
                return new z30[i];
            case 14:
                return new y30[i];
            case 15:
                return new d70[i];
            case 16:
                return new ef0[i];
            case 17:
                return new if0[i];
            case 18:
                return new C0058v[i];
            case 19:
                return new gi0[i];
            case 20:
                return new wl0[i];
            case 21:
                return new xl0[i];
            case 22:
                return new eo0[i];
            case 23:
                return new to0[i];
            case 24:
                return new vs0[i];
            case 25:
                return new sz0[i];
            case InjectionMetrics.I_MAX_ACTIVE_REJ /* 26 */:
                return new p01[i];
            case InjectionMetrics.I_TAP_ID_EXHAUST /* 27 */:
                return new MediaBrowserCompat$MediaItem[i];
            default:
                return new MediaDescriptionCompat[i];
        }
    }
}
