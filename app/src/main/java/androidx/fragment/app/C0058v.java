package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p000.C0701h4;

/* JADX INFO: renamed from: androidx.fragment.app.v */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0058v implements Parcelable {
    public static final Parcelable.Creator<C0058v> CREATOR = new C0701h4(18);

    /* JADX INFO: renamed from: a */
    public final String f745a;

    /* JADX INFO: renamed from: b */
    public final String f746b;

    /* JADX INFO: renamed from: c */
    public final boolean f747c;

    /* JADX INFO: renamed from: d */
    public final int f748d;

    /* JADX INFO: renamed from: e */
    public final int f749e;

    /* JADX INFO: renamed from: f */
    public final String f750f;

    /* JADX INFO: renamed from: g */
    public final boolean f751g;

    /* JADX INFO: renamed from: m */
    public final boolean f752m;

    /* JADX INFO: renamed from: n */
    public final boolean f753n;

    /* JADX INFO: renamed from: o */
    public final Bundle f754o;

    /* JADX INFO: renamed from: p */
    public final boolean f755p;

    /* JADX INFO: renamed from: q */
    public final int f756q;

    /* JADX INFO: renamed from: r */
    public Bundle f757r;

    public C0058v(Parcel parcel) {
        this.f745a = parcel.readString();
        this.f746b = parcel.readString();
        this.f747c = parcel.readInt() != 0;
        this.f748d = parcel.readInt();
        this.f749e = parcel.readInt();
        this.f750f = parcel.readString();
        this.f751g = parcel.readInt() != 0;
        this.f752m = parcel.readInt() != 0;
        this.f753n = parcel.readInt() != 0;
        this.f754o = parcel.readBundle();
        this.f755p = parcel.readInt() != 0;
        this.f757r = parcel.readBundle();
        this.f756q = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f745a);
        sb.append(" (");
        sb.append(this.f746b);
        sb.append(")}:");
        if (this.f747c) {
            sb.append(" fromLayout");
        }
        int i = this.f749e;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.f750f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f751g) {
            sb.append(" retainInstance");
        }
        if (this.f752m) {
            sb.append(" removing");
        }
        if (this.f753n) {
            sb.append(" detached");
        }
        if (this.f755p) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f745a);
        parcel.writeString(this.f746b);
        parcel.writeInt(this.f747c ? 1 : 0);
        parcel.writeInt(this.f748d);
        parcel.writeInt(this.f749e);
        parcel.writeString(this.f750f);
        parcel.writeInt(this.f751g ? 1 : 0);
        parcel.writeInt(this.f752m ? 1 : 0);
        parcel.writeInt(this.f753n ? 1 : 0);
        parcel.writeBundle(this.f754o);
        parcel.writeInt(this.f755p ? 1 : 0);
        parcel.writeBundle(this.f757r);
        parcel.writeInt(this.f756q);
    }

    public C0058v(AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l) {
        this.f745a = abstractComponentCallbacksC0048l.getClass().getName();
        this.f746b = abstractComponentCallbacksC0048l.mWho;
        this.f747c = abstractComponentCallbacksC0048l.mFromLayout;
        this.f748d = abstractComponentCallbacksC0048l.mFragmentId;
        this.f749e = abstractComponentCallbacksC0048l.mContainerId;
        this.f750f = abstractComponentCallbacksC0048l.mTag;
        this.f751g = abstractComponentCallbacksC0048l.mRetainInstance;
        this.f752m = abstractComponentCallbacksC0048l.mRemoving;
        this.f753n = abstractComponentCallbacksC0048l.mDetached;
        this.f754o = abstractComponentCallbacksC0048l.mArguments;
        this.f755p = abstractComponentCallbacksC0048l.mHidden;
        this.f756q = abstractComponentCallbacksC0048l.mMaxState.ordinal();
    }
}
