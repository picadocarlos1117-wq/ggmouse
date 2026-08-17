package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class nl0 implements pl0 {

    /* JADX INFO: renamed from: a */
    public IBinder f7445a;

    /* JADX INFO: renamed from: a */
    public final int m4554a(ss1 ss1Var, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("moe.shizuku.server.IShizukuService");
            parcelObtain.writeStrongBinder(ss1Var);
            parcelObtain.writeInt(1);
            bundle.writeToParcel(parcelObtain, 0);
            if (!this.f7445a.transact(12, parcelObtain, parcelObtain2, 0)) {
                int i = ol0.f8393a;
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f7445a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m4555b() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("moe.shizuku.server.IShizukuService");
            if (!this.f7445a.transact(16, parcelObtain, parcelObtain2, 0)) {
                int i = ol0.f8393a;
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m4556c() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("moe.shizuku.server.IShizukuService");
            if (!this.f7445a.transact(3, parcelObtain, parcelObtain2, 0)) {
                int i = ol0.f8393a;
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    /* JADX INFO: renamed from: d */
    public final kl0 m4557d(String[] strArr, String[] strArr2, String str) {
        kl0 kl0Var;
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("moe.shizuku.server.IShizukuService");
            parcelObtain.writeStringArray(strArr);
            parcelObtain.writeStringArray(strArr2);
            parcelObtain.writeString(str);
            if (!this.f7445a.transact(8, parcelObtain, parcelObtain2, 0)) {
                int i = ol0.f8393a;
            }
            parcelObtain2.readException();
            IBinder strongBinder = parcelObtain2.readStrongBinder();
            int i2 = jl0.f5443a;
            if (strongBinder == null) {
                kl0Var = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("moe.shizuku.server.IRemoteProcess");
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof kl0)) {
                    il0 il0Var = new il0();
                    il0Var.f5067a = strongBinder;
                    kl0Var = il0Var;
                } else {
                    kl0Var = (kl0) iInterfaceQueryLocalInterface;
                }
            }
            return kl0Var;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m4558e(ss1 ss1Var, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("moe.shizuku.server.IShizukuService");
            if (ss1Var == null) {
                ss1Var = null;
            }
            parcelObtain.writeStrongBinder(ss1Var);
            parcelObtain.writeInt(1);
            bundle.writeToParcel(parcelObtain, 0);
            if (!this.f7445a.transact(13, parcelObtain, parcelObtain2, 0)) {
                int i = ol0.f8393a;
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m4559f(int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("moe.shizuku.server.IShizukuService");
            parcelObtain.writeInt(i);
            if (!this.f7445a.transact(15, parcelObtain, parcelObtain2, 0)) {
                int i2 = ol0.f8393a;
            }
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
