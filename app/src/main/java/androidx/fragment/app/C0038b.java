package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import p000.C0701h4;
import p000.f40;
import p000.of0;

/* JADX INFO: renamed from: androidx.fragment.app.b */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0038b implements Parcelable {
    public static final Parcelable.Creator<C0038b> CREATOR = new C0701h4(4);

    /* JADX INFO: renamed from: a */
    public final int[] f660a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f661b;

    /* JADX INFO: renamed from: c */
    public final int[] f662c;

    /* JADX INFO: renamed from: d */
    public final int[] f663d;

    /* JADX INFO: renamed from: e */
    public final int f664e;

    /* JADX INFO: renamed from: f */
    public final String f665f;

    /* JADX INFO: renamed from: g */
    public final int f666g;

    /* JADX INFO: renamed from: m */
    public final int f667m;

    /* JADX INFO: renamed from: n */
    public final CharSequence f668n;

    /* JADX INFO: renamed from: o */
    public final int f669o;

    /* JADX INFO: renamed from: p */
    public final CharSequence f670p;

    /* JADX INFO: renamed from: q */
    public final ArrayList f671q;

    /* JADX INFO: renamed from: r */
    public final ArrayList f672r;

    /* JADX INFO: renamed from: s */
    public final boolean f673s;

    public C0038b(C0037a c0037a) {
        int size = c0037a.f8873a.size();
        this.f660a = new int[size * 6];
        if (!c0037a.f8879g) {
            f40.m2719o("Not on back stack");
            throw null;
        }
        this.f661b = new ArrayList(size);
        this.f662c = new int[size];
        this.f663d = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            of0 of0Var = (of0) c0037a.f8873a.get(i2);
            int i3 = i + 1;
            this.f660a[i] = of0Var.f7772a;
            ArrayList arrayList = this.f661b;
            AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = of0Var.f7773b;
            arrayList.add(abstractComponentCallbacksC0048l != null ? abstractComponentCallbacksC0048l.mWho : null);
            int[] iArr = this.f660a;
            iArr[i3] = of0Var.f7774c ? 1 : 0;
            iArr[i + 2] = of0Var.f7775d;
            iArr[i + 3] = of0Var.f7776e;
            int i4 = i + 5;
            iArr[i + 4] = of0Var.f7777f;
            i += 6;
            iArr[i4] = of0Var.f7778g;
            this.f662c[i2] = of0Var.f7779h.ordinal();
            this.f663d[i2] = of0Var.f7780i.ordinal();
        }
        this.f664e = c0037a.f8878f;
        this.f665f = c0037a.f8880h;
        this.f666g = c0037a.f659r;
        this.f667m = c0037a.f8881i;
        this.f668n = c0037a.f8882j;
        this.f669o = c0037a.f8883k;
        this.f670p = c0037a.f8884l;
        this.f671q = c0037a.f8885m;
        this.f672r = c0037a.f8886n;
        this.f673s = c0037a.f8887o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f660a);
        parcel.writeStringList(this.f661b);
        parcel.writeIntArray(this.f662c);
        parcel.writeIntArray(this.f663d);
        parcel.writeInt(this.f664e);
        parcel.writeString(this.f665f);
        parcel.writeInt(this.f666g);
        parcel.writeInt(this.f667m);
        TextUtils.writeToParcel(this.f668n, parcel, 0);
        parcel.writeInt(this.f669o);
        TextUtils.writeToParcel(this.f670p, parcel, 0);
        parcel.writeStringList(this.f671q);
        parcel.writeStringList(this.f672r);
        parcel.writeInt(this.f673s ? 1 : 0);
    }

    public C0038b(Parcel parcel) {
        this.f660a = parcel.createIntArray();
        this.f661b = parcel.createStringArrayList();
        this.f662c = parcel.createIntArray();
        this.f663d = parcel.createIntArray();
        this.f664e = parcel.readInt();
        this.f665f = parcel.readString();
        this.f666g = parcel.readInt();
        this.f667m = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f668n = (CharSequence) creator.createFromParcel(parcel);
        this.f669o = parcel.readInt();
        this.f670p = (CharSequence) creator.createFromParcel(parcel);
        this.f671q = parcel.createStringArrayList();
        this.f672r = parcel.createStringArrayList();
        this.f673s = parcel.readInt() != 0;
    }
}
