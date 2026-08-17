package p000;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.ArraySet;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class rs1 extends Process implements Parcelable {

    /* JADX INFO: renamed from: a */
    public kl0 f10127a;

    /* JADX INFO: renamed from: b */
    public ParcelFileDescriptor.AutoCloseOutputStream f10128b;

    /* JADX INFO: renamed from: c */
    public ParcelFileDescriptor.AutoCloseInputStream f10129c;

    /* JADX INFO: renamed from: d */
    public static final Set f10126d = Collections.synchronizedSet(new ArraySet());
    public static final Parcelable.Creator<rs1> CREATOR = new n21(17);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Process
    public final void destroy() {
        try {
            il0 il0Var = (il0) this.f10127a;
            il0Var.getClass();
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("moe.shizuku.server.IRemoteProcess");
                if (!il0Var.f5067a.transact(6, parcelObtain, parcelObtain2, 0)) {
                    int i = jl0.f5443a;
                }
                parcelObtain2.readException();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        } catch (RemoteException e) {
            ca0.m1184p(e);
        }
    }

    @Override // java.lang.Process
    public final int exitValue() {
        try {
            return ((il0) this.f10127a).m3446a();
        } catch (RemoteException e) {
            ca0.m1184p(e);
            return 0;
        }
    }

    @Override // java.lang.Process
    public final InputStream getErrorStream() {
        try {
            return new ParcelFileDescriptor.AutoCloseInputStream(((il0) this.f10127a).m3447b());
        } catch (RemoteException e) {
            ca0.m1184p(e);
            return null;
        }
    }

    @Override // java.lang.Process
    public final InputStream getInputStream() {
        if (this.f10129c == null) {
            try {
                this.f10129c = new ParcelFileDescriptor.AutoCloseInputStream(((il0) this.f10127a).m3448c());
            } catch (RemoteException e) {
                ca0.m1184p(e);
                return null;
            }
        }
        return this.f10129c;
    }

    @Override // java.lang.Process
    public final OutputStream getOutputStream() {
        if (this.f10128b == null) {
            try {
                this.f10128b = new ParcelFileDescriptor.AutoCloseOutputStream(((il0) this.f10127a).m3449d());
            } catch (RemoteException e) {
                ca0.m1184p(e);
                return null;
            }
        }
        return this.f10128b;
    }

    @Override // java.lang.Process
    public final int waitFor() {
        try {
            return ((il0) this.f10127a).m3450e();
        } catch (RemoteException e) {
            ca0.m1184p(e);
            return 0;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.f10127a.asBinder());
    }
}
