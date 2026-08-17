package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.versionedparcelable.ParcelImpl;
import com.example.ssmousepro.injection.InjectionMetrics;
import java.util.ArrayList;
import p000.n21;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class n21 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7178a;

    public /* synthetic */ n21(int i) {
        this.f7178a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(final Parcel parcel) {
        ml0 ml0Var = null;
        kl0 kl0Var = null;
        switch (this.f7178a) {
            case 0:
                return new Parcelable(parcel) { // from class: android.support.v4.media.session.MediaSessionCompat$QueueItem
                    public static final Parcelable.Creator<MediaSessionCompat$QueueItem> CREATOR = new n21(0);

                    /* JADX INFO: renamed from: a */
                    public final MediaDescriptionCompat f313a;

                    /* JADX INFO: renamed from: b */
                    public final long f314b;

                    {
                        this.f313a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                        this.f314b = parcel.readLong();
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaSession.QueueItem {Description=" + this.f313a + ", Id=" + this.f314b + " }";
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i) {
                        this.f313a.writeToParcel(parcel2, i);
                        parcel2.writeLong(this.f314b);
                    }
                };
            case 1:
                final Parcelable parcelable = parcel.readParcelable(null);
                return new Parcelable(parcelable) { // from class: android.support.v4.media.session.MediaSessionCompat$Token
                    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new n21(1);

                    /* JADX INFO: renamed from: a */
                    public final Object f316a = new Object();

                    /* JADX INFO: renamed from: b */
                    public final Object f317b;

                    {
                        this.f317b = parcelable;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof MediaSessionCompat$Token)) {
                            return false;
                        }
                        Object obj2 = ((MediaSessionCompat$Token) obj).f317b;
                        Object obj3 = this.f317b;
                        if (obj3 == null) {
                            return obj2 == null;
                        }
                        if (obj2 == null) {
                            return false;
                        }
                        return obj3.equals(obj2);
                    }

                    public final int hashCode() {
                        Object obj = this.f317b;
                        if (obj == null) {
                            return 0;
                        }
                        return obj.hashCode();
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i) {
                        parcel2.writeParcelable((Parcelable) this.f317b, i);
                    }
                };
            case 2:
                return new k51(parcel);
            case 3:
                return new w51(parcel);
            case 4:
                return b61.m935a(parcel.readInt(), parcel.readInt());
            case 5:
                return new g61(parcel);
            case 6:
                return new o61(parcel);
            case 7:
                return new p61(parcel);
            case 8:
                d81 d81Var = new d81(parcel);
                d81Var.f2827a = parcel.readInt();
                return d81Var;
            case 9:
                return new ParcelImpl(parcel);
            case 10:
                ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo();
                parcelableVolumeInfo.f318a = parcel.readInt();
                parcelableVolumeInfo.f320c = parcel.readInt();
                parcelableVolumeInfo.f321d = parcel.readInt();
                parcelableVolumeInfo.f322e = parcel.readInt();
                parcelableVolumeInfo.f319b = parcel.readInt();
                return parcelableVolumeInfo;
            case 11:
                return new dd1(parcel);
            case 12:
                return new PlaybackStateCompat(parcel);
            case 13:
                return new fg1(parcel);
            case 14:
                return new gg1(parcel);
            case 15:
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            case 16:
                wl1 wl1Var = new wl1();
                IBinder strongBinder = parcel.readStrongBinder();
                int i = vl1.f11705b;
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(ml0.f7036g);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ml0)) {
                        ll0 ll0Var = new ll0();
                        ll0Var.f6384a = strongBinder;
                        ml0Var = ll0Var;
                    } else {
                        ml0Var = (ml0) iInterfaceQueryLocalInterface;
                    }
                }
                wl1Var.f12224a = ml0Var;
                return wl1Var;
            case 17:
                rs1 rs1Var = new rs1();
                IBinder strongBinder2 = parcel.readStrongBinder();
                int i2 = jl0.f5443a;
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("moe.shizuku.server.IRemoteProcess");
                    if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof kl0)) {
                        il0 il0Var = new il0();
                        il0Var.f5067a = strongBinder2;
                        kl0Var = il0Var;
                    } else {
                        kl0Var = (kl0) iInterfaceQueryLocalInterface2;
                    }
                }
                rs1Var.f10127a = kl0Var;
                return rs1Var;
            case 18:
                ArrayList arrayList = new ArrayList();
                parcel.readList(arrayList, kt1.class.getClassLoader());
                return new lt1(arrayList);
            case 19:
                return new kt1(parcel.readLong(), parcel.readLong(), parcel.readInt());
            case 20:
                return new rt1(parcel);
            case 21:
                return new pu1(parcel);
            case 22:
                return new qu1();
            case 23:
                return new tu1(parcel);
            case 24:
                cv1 cv1Var = new cv1();
                cv1Var.f2645a = parcel.readInt();
                cv1Var.f2646b = parcel.readInt();
                cv1Var.f2648d = parcel.readInt() == 1;
                int i3 = parcel.readInt();
                if (i3 > 0) {
                    int[] iArr = new int[i3];
                    cv1Var.f2647c = iArr;
                    parcel.readIntArray(iArr);
                }
                return cv1Var;
            case 25:
                dv1 dv1Var = new dv1();
                dv1Var.f3026a = parcel.readInt();
                dv1Var.f3027b = parcel.readInt();
                int i4 = parcel.readInt();
                dv1Var.f3028c = i4;
                if (i4 > 0) {
                    int[] iArr2 = new int[i4];
                    dv1Var.f3029d = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int i5 = parcel.readInt();
                dv1Var.f3030e = i5;
                if (i5 > 0) {
                    int[] iArr3 = new int[i5];
                    dv1Var.f3031f = iArr3;
                    parcel.readIntArray(iArr3);
                }
                dv1Var.f3033m = parcel.readInt() == 1;
                dv1Var.f3034n = parcel.readInt() == 1;
                dv1Var.f3035o = parcel.readInt() == 1;
                dv1Var.f3032g = parcel.readArrayList(cv1.class.getClassLoader());
                return dv1Var;
            case InjectionMetrics.I_MAX_ACTIVE_REJ /* 26 */:
                String string = parcel.readString();
                string.getClass();
                String string2 = parcel.readString();
                String[] strArrCreateStringArray = parcel.createStringArray();
                strArrCreateStringArray.getClass();
                return new tz1(string, string2, qm0.m5568p(strArrCreateStringArray));
            case InjectionMetrics.I_TAP_ID_EXHAUST /* 27 */:
                return new n02(parcel.readLong(), parcel.readLong());
            case InjectionMetrics.I_AIM_LOOP_TICKS /* 28 */:
                return new r42(parcel);
            default:
                return new s82(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f7178a) {
            case 0:
                return new MediaSessionCompat$QueueItem[i];
            case 1:
                return new MediaSessionCompat$Token[i];
            case 2:
                return new k51[i];
            case 3:
                return new w51[i];
            case 4:
                return new b61[i];
            case 5:
                return new g61[i];
            case 6:
                return new o61[i];
            case 7:
                return new p61[i];
            case 8:
                return new d81[i];
            case 9:
                return new ParcelImpl[i];
            case 10:
                return new ParcelableVolumeInfo[i];
            case 11:
                return new dd1[i];
            case 12:
                return new PlaybackStateCompat[i];
            case 13:
                return new fg1[i];
            case 14:
                return new gg1[i];
            case 15:
                return new RatingCompat[i];
            case 16:
                return new wl1[i];
            case 17:
                return new rs1[i];
            case 18:
                return new lt1[i];
            case 19:
                return new kt1[i];
            case 20:
                return new rt1[i];
            case 21:
                return new pu1[i];
            case 22:
                return new qu1[i];
            case 23:
                return new tu1[i];
            case 24:
                return new cv1[i];
            case 25:
                return new dv1[i];
            case InjectionMetrics.I_MAX_ACTIVE_REJ /* 26 */:
                return new tz1[i];
            case InjectionMetrics.I_TAP_ID_EXHAUST /* 27 */:
                return new n02[i];
            case InjectionMetrics.I_AIM_LOOP_TICKS /* 28 */:
                return new r42[i];
            default:
                return new s82[i];
        }
    }
}
