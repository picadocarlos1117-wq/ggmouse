package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dd2 extends Binder implements IInterface {
    public dd2(String str) {
        attachInterface(this, str);
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo2347a(int i, Parcel parcel, Parcel parcel2, int i2);

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return mo2347a(i, parcel, parcel2, i2);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
