package p000;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import com.example.ssmousepro.PreferencesActivity;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class js1 extends Binder implements IInterface {
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3 = 0;
        if (i == 2) {
            parcel.enforceInterface("moe.shizuku.server.IShizukuApplication");
            Bundle bundle = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
            bundle.getInt("shizuku:attach-reply-uid", -1);
            IBinder iBinder = ps1.f9128a;
            ps1.f9130c = bundle.getInt("shizuku:attach-reply-version", -1);
            bundle.getInt("shizuku:attach-reply-patch-version", -1);
            IBinder iBinder2 = ps1.f9128a;
            bundle.getString("shizuku:attach-reply-secontext");
            ps1.f9131d = bundle.getBoolean("shizuku:attach-reply-permission-granted", false);
            bundle.getBoolean("shizuku:attach-reply-should-show-request-permission-rationale", false);
            ps1.m5323g();
            return true;
        }
        if (i != 3) {
            if (i != 10001) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("moe.shizuku.server.IShizukuApplication");
                return true;
            }
            parcel.enforceInterface("moe.shizuku.server.IShizukuApplication");
            parcel.readInt();
            parcel.readInt();
            parcel.readString();
            parcel.readInt();
            parcel2.writeNoException();
            return true;
        }
        parcel.enforceInterface("moe.shizuku.server.IShizukuApplication");
        int i4 = parcel.readInt();
        int i5 = (parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null).getBoolean("shizuku:request-permission-reply-allowed", false) ? 0 : -1;
        synchronized (ps1.f9135h) {
            try {
                ArrayList arrayList = ps1.f9137j;
                int size = arrayList.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj = arrayList.get(i6);
                    i6++;
                    ks1 ks1Var = (ks1) obj;
                    ks1Var.getClass();
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        PreferencesActivity.shizukuPermissionListener$lambda$5(((yf1) ((ns1) ks1Var.f5997a)).f12974a, i4, i5);
                    } else {
                        ps1.f9138k.post(new is1(i4, i5, i3, ks1Var));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
