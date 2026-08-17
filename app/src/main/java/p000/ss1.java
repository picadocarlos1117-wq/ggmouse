package p000;

import android.content.ComponentName;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ss1 extends Binder implements IInterface {

    /* JADX INFO: renamed from: d */
    public static final Handler f10538d = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: a */
    public final HashSet f10539a;

    /* JADX INFO: renamed from: b */
    public final ComponentName f10540b;

    /* JADX INFO: renamed from: c */
    public boolean f10541c;

    public ss1(os1 os1Var) {
        attachInterface(this, "moe.shizuku.server.IShizukuServiceConnection");
        this.f10539a = new HashSet();
        this.f10541c = false;
        this.f10540b = os1Var.f8459a;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Handler handler = f10538d;
        int i3 = 1;
        if (i != 1) {
            int i4 = 2;
            if (i != 2) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("moe.shizuku.server.IShizukuServiceConnection");
                return true;
            }
            parcel.enforceInterface("moe.shizuku.server.IShizukuServiceConnection");
            if (!this.f10541c) {
                this.f10541c = true;
                handler.post(new fs1(this, i4));
                return true;
            }
        } else {
            parcel.enforceInterface("moe.shizuku.server.IShizukuServiceConnection");
            IBinder strongBinder = parcel.readStrongBinder();
            handler.post(new RunnableC1467u4(28, this, strongBinder));
            try {
                strongBinder.linkToDeath(new qs1(this, i3), 0);
            } catch (RemoteException unused) {
            }
        }
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
