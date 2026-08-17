package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class tc2 implements IInterface {

    /* JADX INFO: renamed from: a */
    public final IBinder f10840a;

    /* JADX INFO: renamed from: b */
    public final String f10841b;

    public tc2(IBinder iBinder, String str) {
        this.f10840a = iBinder;
        this.f10841b = str;
    }

    /* JADX INFO: renamed from: a */
    public final void m6268a(int i, Parcel parcel) {
        try {
            this.f10840a.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f10840a;
    }
}
