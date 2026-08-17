package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.io.File;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: au */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0075au {
    private static final String DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
    public static final int RECEIVER_EXPORTED = 2;
    public static final int RECEIVER_NOT_EXPORTED = 4;
    public static final int RECEIVER_VISIBLE_TO_INSTANT_APPS = 1;
    private static final String TAG = "ContextCompat";
    private static final Object sLock = new Object();
    private static final Object sSync = new Object();
    private static TypedValue sTempValue;

    public static int checkSelfPermission(Context context, String str) {
        if (str == null) {
            l41.m4051t("permission must be non-null");
            return 0;
        }
        if (AbstractC1408sj.m6104a() || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        return d91.m2290a(new e91(context).f3297a) ? 0 : -1;
    }

    public static Context createDeviceProtectedStorageContext(Context context) {
        return AbstractC1529vt.m6657a(context);
    }

    public static String getAttributionTag(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return AbstractC1640yt.m7148a(context);
        }
        return null;
    }

    public static File getCodeCacheDir(Context context) {
        return AbstractC1455tt.m6336a(context);
    }

    public static int getColor(Context context, int i) {
        return AbstractC1492ut.m6531a(context, i);
    }

    public static ColorStateList getColorStateList(Context context, int i) {
        ColorStateList colorStateListM1039a;
        ColorStateList colorStateList;
        ml1 ml1Var;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        nl1 nl1Var = new nl1(resources, theme);
        synchronized (pl1.f8934c) {
            try {
                SparseArray sparseArray = (SparseArray) pl1.f8933b.get(nl1Var);
                colorStateListM1039a = null;
                if (sparseArray == null || sparseArray.size() <= 0 || (ml1Var = (ml1) sparseArray.get(i)) == null) {
                    colorStateList = null;
                } else {
                    if (ml1Var.f7038b.equals(resources.getConfiguration())) {
                        if (theme != null || ml1Var.f7039c != 0) {
                            if (theme == null || ml1Var.f7039c != theme.hashCode()) {
                            }
                        }
                        colorStateList = ml1Var.f7037a;
                    }
                    sparseArray.remove(i);
                    colorStateList = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal threadLocal = pl1.f8932a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 < 28 || i2 > 31) {
            try {
                colorStateListM1039a = AbstractC0108bq.m1039a(resources, resources.getXml(i), theme);
            } catch (Exception e) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
            }
        }
        if (colorStateListM1039a == null) {
            return ll1.m4225b(resources, i, theme);
        }
        synchronized (pl1.f8934c) {
            try {
                WeakHashMap weakHashMap = pl1.f8933b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(nl1Var);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(nl1Var, sparseArray2);
                }
                sparseArray2.append(i, new ml1(colorStateListM1039a, nl1Var.f7446a.getConfiguration(), theme));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return colorStateListM1039a;
    }

    public static File getDataDir(Context context) {
        return AbstractC1529vt.m6658b(context);
    }

    public static Drawable getDrawable(Context context, int i) {
        return AbstractC1455tt.m6337b(context, i);
    }

    public static File[] getExternalCacheDirs(Context context) {
        return AbstractC1418st.m6138a(context);
    }

    public static File[] getExternalFilesDirs(Context context, String str) {
        return AbstractC1418st.m6139b(context, str);
    }

    public static Executor getMainExecutor(Context context) {
        return AbstractC1603xt.m6975a(context);
    }

    public static File getNoBackupFilesDir(Context context) {
        return AbstractC1455tt.m6338c(context);
    }

    public static File[] getObbDirs(Context context) {
        return AbstractC1418st.m6140c(context);
    }

    public static <T> T getSystemService(Context context, Class<T> cls) {
        return (T) AbstractC1492ut.m6532b(context, cls);
    }

    public static String getSystemServiceName(Context context, Class<?> cls) {
        return AbstractC1492ut.m6533c(context, cls);
    }

    public static boolean isDeviceProtectedStorage(Context context) {
        return AbstractC1529vt.m6659c(context);
    }

    public static String obtainAndCheckReceiverPermission(Context context) {
        String str = context.getPackageName() + DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX;
        if (ki0.m3863g(context, str) == 0) {
            return str;
        }
        l41.m4048q(jd0.m3615m("Permission ", str, " is required by your application to receive broadcasts, please add it to your manifest"));
        return null;
    }

    public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
        int i2 = i & 1;
        if (i2 != 0 && (i & 4) != 0) {
            f40.m2713i("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
            return null;
        }
        if (i2 != 0) {
            i |= 2;
        }
        int i3 = i;
        int i4 = i3 & 2;
        if (i4 == 0 && (i3 & 4) == 0) {
            f40.m2713i("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
            return null;
        }
        if (i4 == 0 || (i3 & 4) == 0) {
            return AbstractC1408sj.m6104a() ? AbstractC1677zt.m7353a(context, broadcastReceiver, intentFilter, str, handler, i3) : AbstractC1566wt.m6831a(context, broadcastReceiver, intentFilter, str, handler, i3);
        }
        f40.m2713i("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
        return null;
    }

    public static boolean startActivities(Context context, Intent[] intentArr) {
        return startActivities(context, intentArr, null);
    }

    public static void startActivity(Context context, Intent intent, Bundle bundle) {
        AbstractC1381rt.m5908b(context, intent, bundle);
    }

    public static void startForegroundService(Context context, Intent intent) {
        AbstractC1566wt.m6832b(context, intent);
    }

    public static boolean startActivities(Context context, Intent[] intentArr, Bundle bundle) {
        AbstractC1381rt.m5907a(context, intentArr, bundle);
        return true;
    }

    public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
        return registerReceiver(context, broadcastReceiver, intentFilter, null, null, i);
    }
}
