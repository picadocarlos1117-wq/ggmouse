package p000;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.example.ssmousepro.PreferencesActivity;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ps1 {

    /* JADX INFO: renamed from: a */
    public static IBinder f9128a = null;

    /* JADX INFO: renamed from: b */
    public static pl0 f9129b = null;

    /* JADX INFO: renamed from: c */
    public static int f9130c = -1;

    /* JADX INFO: renamed from: d */
    public static boolean f9131d = false;

    /* JADX INFO: renamed from: e */
    public static boolean f9132e = false;

    /* JADX INFO: renamed from: f */
    public static final js1 f9133f;

    /* JADX INFO: renamed from: g */
    public static final hs1 f9134g;

    /* JADX INFO: renamed from: h */
    public static final ArrayList f9135h;

    /* JADX INFO: renamed from: i */
    public static final ArrayList f9136i;

    /* JADX INFO: renamed from: j */
    public static final ArrayList f9137j;

    /* JADX INFO: renamed from: k */
    public static final Handler f9138k;

    static {
        js1 js1Var = new js1();
        js1Var.attachInterface(js1Var, "moe.shizuku.server.IShizukuApplication");
        f9133f = js1Var;
        f9134g = new hs1();
        f9135h = new ArrayList();
        f9136i = new ArrayList();
        f9137j = new ArrayList();
        f9138k = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: renamed from: a */
    public static boolean m5317a(IBinder iBinder, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("moe.shizuku.server.IShizukuService");
            js1 js1Var = f9133f;
            js1Var.getClass();
            parcelObtain.writeStrongBinder(js1Var);
            parcelObtain.writeString(str);
            boolean zTransact = iBinder.transact(14, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return zTransact;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m5318b(IBinder iBinder, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt("shizuku:attach-api-version", 13);
        bundle.putString("shizuku:attach-package-name", str);
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("moe.shizuku.server.IShizukuService");
            js1 js1Var = f9133f;
            js1Var.getClass();
            parcelObtain.writeStrongBinder(js1Var);
            parcelObtain.writeInt(1);
            bundle.writeToParcel(parcelObtain, 0);
            boolean zTransact = iBinder.transact(18, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return zTransact;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m5319c() {
        int i = f9130c;
        if (i != -1) {
            return i;
        }
        try {
            int iM4556c = ((nl0) m5322f()).m4556c();
            f9130c = iM4556c;
            return iM4556c;
        } catch (RemoteException e) {
            ca0.m1184p(e);
            return 0;
        } catch (SecurityException unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: d */
    public static rs1 m5320d(String[] strArr, String[] strArr2, String str) {
        try {
            kl0 kl0VarM4557d = ((nl0) m5322f()).m4557d(strArr, strArr2, str);
            rs1 rs1Var = new rs1();
            rs1Var.f10127a = kl0VarM4557d;
            try {
                kl0VarM4557d.asBinder().linkToDeath(new qs1(rs1Var, 0), 0);
            } catch (RemoteException e) {
                Log.e("ShizukuRemoteProcess", "linkToDeath", e);
            }
            rs1.f10126d.add(rs1Var);
            return rs1Var;
        } catch (RemoteException e2) {
            ca0.m1184p(e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m5321e(IBinder iBinder, String str) {
        pl0 pl0Var;
        IBinder iBinder2 = f9128a;
        if (iBinder2 == iBinder) {
            return;
        }
        int i = 1;
        int i2 = 0;
        if (iBinder == null) {
            f9128a = null;
            f9129b = null;
            f9130c = -1;
            synchronized (f9135h) {
                try {
                    ArrayList arrayList = f9136i;
                    int size = arrayList.size();
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        ks1 ks1Var = (ks1) obj;
                        ks1Var.getClass();
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            PreferencesActivity.shizukuBinderDeadListener$lambda$3(((xf1) ((ls1) ks1Var.f5997a)).f12597a);
                        } else {
                            Handler handler = f9138k;
                            ls1 ls1Var = (ls1) ks1Var.f5997a;
                            Objects.requireNonNull(ls1Var);
                            handler.post(new fs1(ls1Var, i));
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        if (iBinder2 != null) {
            iBinder2.unlinkToDeath(f9134g, 0);
        }
        f9128a = iBinder;
        int i3 = ol0.f8393a;
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("moe.shizuku.server.IShizukuService");
        if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof pl0)) {
            nl0 nl0Var = new nl0();
            nl0Var.f7445a = iBinder;
            pl0Var = nl0Var;
        } else {
            pl0Var = (pl0) iInterfaceQueryLocalInterface;
        }
        f9129b = pl0Var;
        try {
            f9128a.linkToDeath(f9134g, 0);
        } catch (Throwable unused) {
        }
        try {
            if (!m5318b(f9128a, str) && !m5317a(f9128a, str)) {
                f9132e = true;
            }
        } catch (Throwable th2) {
            Log.w("ShizukuApplication", Log.getStackTraceString(th2));
        }
        if (f9132e) {
            m5323g();
        }
    }

    /* JADX INFO: renamed from: f */
    public static pl0 m5322f() {
        pl0 pl0Var = f9129b;
        if (pl0Var != null) {
            return pl0Var;
        }
        f40.m2719o("binder haven't been received");
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static void m5323g() {
        ArrayList arrayList = f9135h;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ks1 ks1Var = (ks1) obj;
                    ks1Var.getClass();
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        PreferencesActivity.shizukuBinderListener$lambda$1(((wf1) ((ms1) ks1Var.f5997a)).f12127a);
                    } else {
                        Handler handler = f9138k;
                        ms1 ms1Var = (ms1) ks1Var.f5997a;
                        Objects.requireNonNull(ms1Var);
                        handler.post(new fs1(ms1Var, i));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m5324h(os1 os1Var) {
        try {
            pl0 pl0VarM5322f = m5322f();
            Bundle bundle = new Bundle();
            bundle.putParcelable("shizuku:user-service-arg-component", os1Var.f8459a);
            String str = os1Var.f8462d;
            if (str != null) {
                bundle.putString("shizuku:user-service-arg-tag", str);
            }
            bundle.putBoolean("shizuku:user-service-remove", true);
            ((nl0) pl0VarM5322f).m4558e(null, bundle);
        } catch (RemoteException e) {
            ca0.m1184p(e);
        }
    }
}
