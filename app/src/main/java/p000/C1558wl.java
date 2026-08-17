package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: renamed from: wl */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1558wl implements b32 {

    /* JADX INFO: renamed from: b */
    public final ConnectivityManager f12212b;

    /* JADX INFO: renamed from: c */
    public final Context f12213c;

    /* JADX INFO: renamed from: e */
    public final ax0 f12215e;

    /* JADX INFO: renamed from: f */
    public final ax0 f12216f;

    /* JADX INFO: renamed from: a */
    public final DataEncoder f12211a = new JsonDataEncoderBuilder().configureWith(k50.f5670b).ignoreNullValues(true).build();

    /* JADX INFO: renamed from: d */
    public final URL f12214d = m6805b(C0831kk.f5889c);

    /* JADX INFO: renamed from: g */
    public final int f12217g = 130000;

    public C1558wl(Context context, ax0 ax0Var, ax0 ax0Var2) {
        this.f12213c = context;
        this.f12212b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f12215e = ax0Var2;
        this.f12216f = ax0Var;
    }

    /* JADX INFO: renamed from: b */
    public static URL m6805b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(AbstractC1308pu.m5339f("Invalid url: ", str), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:30:0x010b  */
    /* JADX INFO: renamed from: a */
    public final C1587xd m6806a(C1587xd c1587xd) {
        int type;
        int subtype;
        HashMap map;
        NetworkInfo activeNetworkInfo = this.f12212b.getActiveNetworkInfo();
        C1470u7 c1470u7M6919c = c1587xd.m6919c();
        int i = Build.VERSION.SDK_INT;
        HashMap map2 = (HashMap) c1470u7M6919c.f11146f;
        if (map2 == null) {
            f40.m2719o("Property \"autoMetadata\" has not been set");
            return null;
        }
        map2.put("sdk-version", String.valueOf(i));
        c1470u7M6919c.m6399a("model", Build.MODEL);
        c1470u7M6919c.m6399a("hardware", Build.HARDWARE);
        c1470u7M6919c.m6399a("device", Build.DEVICE);
        c1470u7M6919c.m6399a("product", Build.PRODUCT);
        c1470u7M6919c.m6399a("os-uild", Build.ID);
        c1470u7M6919c.m6399a("manufacturer", Build.MANUFACTURER);
        c1470u7M6919c.m6399a("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        HashMap map3 = (HashMap) c1470u7M6919c.f11146f;
        if (map3 == null) {
            f40.m2719o("Property \"autoMetadata\" has not been set");
            return null;
        }
        map3.put("tz-offset", String.valueOf(offset));
        int i2 = -1;
        if (activeNetworkInfo == null) {
            SparseArray sparseArray = i81.f4867a;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        HashMap map4 = (HashMap) c1470u7M6919c.f11146f;
        if (map4 == null) {
            f40.m2719o("Property \"autoMetadata\" has not been set");
            return null;
        }
        map4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray sparseArray2 = h81.f4472a;
                subtype = 100;
            } else if (((h81) h81.f4472a.get(subtype)) == null) {
            }
            map = (HashMap) c1470u7M6919c.f11146f;
            if (map != null) {
                f40.m2719o("Property \"autoMetadata\" has not been set");
                return null;
            }
            map.put("mobile-subtype", String.valueOf(subtype));
            c1470u7M6919c.m6399a("country", Locale.getDefault().getCountry());
            c1470u7M6919c.m6399a("locale", Locale.getDefault().getLanguage());
            Context context = this.f12213c;
            c1470u7M6919c.m6399a("mcc_mnc", ((TelephonyManager) context.getSystemService("phone")).getSimOperator());
            try {
                i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e) {
                hr1.m3274j(e, "CctTransportBackend", "Unable to find version code for package");
            }
            c1470u7M6919c.m6399a("application_build", Integer.toString(i2));
            return c1470u7M6919c.m6401d();
        }
        SparseArray sparseArray3 = h81.f4472a;
        subtype = 0;
        map = (HashMap) c1470u7M6919c.f11146f;
        if (map != null) {
            f40.m2719o("Property \"autoMetadata\" has not been set");
            return null;
        }
        map.put("mobile-subtype", String.valueOf(subtype));
        c1470u7M6919c.m6399a("country", Locale.getDefault().getCountry());
        c1470u7M6919c.m6399a("locale", Locale.getDefault().getLanguage());
        Context context2 = this.f12213c;
        c1470u7M6919c.m6399a("mcc_mnc", ((TelephonyManager) context2.getSystemService("phone")).getSimOperator());
        i2 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode;
        c1470u7M6919c.m6399a("application_build", Integer.toString(i2));
        return c1470u7M6919c.m6401d();
    }
}
