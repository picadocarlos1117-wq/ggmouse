package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class il0 implements kl0 {

    /* JADX INFO: renamed from: a */
    public IBinder f5067a;

    /* JADX INFO: renamed from: a */
    public final int m3446a() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("moe.shizuku.server.IRemoteProcess");
            if (!this.f5067a.transact(5, parcelObtain, parcelObtain2, 0)) {
                int i = jl0.f5443a;
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
        return this.f5067a;
    }

    /* JADX INFO: renamed from: b */
    public final ParcelFileDescriptor m3447b() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("moe.shizuku.server.IRemoteProcess");
            if (!this.f5067a.transact(3, parcelObtain, parcelObtain2, 0)) {
                int i = jl0.f5443a;
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0 ? (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(parcelObtain2) : null;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    /* JADX INFO: renamed from: c */
    public final ParcelFileDescriptor m3448c() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("moe.shizuku.server.IRemoteProcess");
            if (!this.f5067a.transact(2, parcelObtain, parcelObtain2, 0)) {
                int i = jl0.f5443a;
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0 ? (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(parcelObtain2) : null;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    /* JADX INFO: renamed from: d */
    public final ParcelFileDescriptor m3449d() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("moe.shizuku.server.IRemoteProcess");
            if (!this.f5067a.transact(1, parcelObtain, parcelObtain2, 0)) {
                int i = jl0.f5443a;
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0 ? (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(parcelObtain2) : null;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m3450e() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("moe.shizuku.server.IRemoteProcess");
            if (!this.f5067a.transact(4, parcelObtain, parcelObtain2, 0)) {
                int i = jl0.f5443a;
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
