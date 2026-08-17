package rikka.shizuku;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import moe.shizuku.api.BinderContainer;
import p000.az1;
import p000.f40;
import p000.ps1;
import p000.ua0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class ShizukuProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.multiprocess) {
            f40.m2719o("android:multiprocess must be false");
        } else {
            if (providerInfo.exported) {
                return;
            }
            f40.m2719o("android:exported must be true");
        }
    }

    @Override // android.content.ContentProvider
    public final Bundle call(String str, String str2, Bundle bundle) {
        BinderContainer binderContainer;
        IBinder iBinder;
        if (ua0.f11244p) {
            Log.w("ShizukuProvider", "Provider called when Sui is available. Are you using Shizuku and Sui at the same time?");
            return new Bundle();
        }
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(BinderContainer.class.getClassLoader());
        Bundle bundle2 = new Bundle();
        str.getClass();
        if (str.equals("sendBinder")) {
            IBinder iBinder2 = ps1.f9128a;
            if ((iBinder2 == null || !iBinder2.pingBinder()) && (binderContainer = (BinderContainer) bundle.getParcelable("moe.shizuku.privileged.api.intent.extra.BINDER")) != null && (iBinder = binderContainer.f7059a) != null) {
                ps1.m5321e(iBinder, getContext().getPackageName());
            }
        } else if (str.equals("getBinder")) {
            IBinder iBinder3 = ps1.f9128a;
            if (iBinder3 == null || !iBinder3.pingBinder()) {
                return null;
            }
            BinderContainer binderContainer2 = new BinderContainer();
            binderContainer2.f7059a = iBinder3;
            bundle2.putParcelable("moe.shizuku.privileged.api.intent.extra.BINDER", binderContainer2);
            return bundle2;
        }
        return bundle2;
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        if (!ua0.f11244p) {
            String packageName = getContext().getPackageName();
            HashMap map = az1.f1099a;
            IBinder iBinder = (IBinder) map.get("activity");
            IBinder iBinder2 = null;
            if (iBinder == null) {
                try {
                    iBinder = (IBinder) az1.f1100b.invoke(null, "activity");
                } catch (IllegalAccessException | InvocationTargetException e) {
                    Log.w("SystemServiceHelper", Log.getStackTraceString(e));
                }
                map.put("activity", iBinder);
            }
            if (iBinder != null) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.app.IActivityManager");
                    parcelObtain.writeInt(2);
                    iBinder.transact(1599296841, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    IBinder strongBinder = parcelObtain2.readStrongBinder();
                    if (strongBinder != null) {
                        parcelObtain.recycle();
                        parcelObtain2.recycle();
                        iBinder2 = strongBinder;
                    } else {
                        parcelObtain.recycle();
                        parcelObtain2.recycle();
                    }
                } catch (Throwable th) {
                    try {
                        th.printStackTrace();
                    } catch (Throwable th2) {
                        parcelObtain.recycle();
                        parcelObtain2.recycle();
                        throw th2;
                    }
                }
            }
            if (iBinder2 != null) {
                ps1.m5321e(iBinder2, packageName);
                ua0.f11244p = true;
            } else {
                ua0.f11244p = false;
            }
        }
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
