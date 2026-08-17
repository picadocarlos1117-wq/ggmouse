package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import com.example.ssmousepro.account.AccountConstants;
import com.example.ssmousepro.ads.RewardedAdConstants;
import java.util.Calendar;

/* JADX INFO: renamed from: m7 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1098m7 extends AbstractC1172o7 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f6675c = 0;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ LayoutInflaterFactory2C1359r7 f6676d;

    /* JADX INFO: renamed from: e */
    public final Object f6677e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1098m7(LayoutInflaterFactory2C1359r7 layoutInflaterFactory2C1359r7, Context context) {
        super(layoutInflaterFactory2C1359r7);
        this.f6676d = layoutInflaterFactory2C1359r7;
        this.f6677e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // p000.AbstractC1172o7
    /* JADX INFO: renamed from: d */
    public final IntentFilter mo4386d() {
        switch (this.f6675c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003d  */
    @Override // p000.AbstractC1172o7
    /* JADX INFO: renamed from: e */
    public final int mo4387e() {
        Location lastKnownLocation;
        boolean z;
        long j;
        int i = this.f6675c;
        Object obj = this.f6677e;
        switch (i) {
            case 0:
                return ((PowerManager) obj).isPowerSaveMode() ? 2 : 1;
            default:
                C1174o9 c1174o9 = (C1174o9) obj;
                xx1 xx1Var = (xx1) c1174o9.f7700c;
                LocationManager locationManager = (LocationManager) c1174o9.f7699b;
                if (xx1Var.f12765b > System.currentTimeMillis()) {
                    z = xx1Var.f12764a;
                } else {
                    Context context = (Context) c1174o9.f7701d;
                    Location lastKnownLocation2 = null;
                    if (ki0.m3863g(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("network")) {
                                lastKnownLocation = locationManager.getLastKnownLocation("network");
                            } else {
                                lastKnownLocation = null;
                            }
                            break;
                        } catch (Exception unused) {
                        }
                    } else {
                        lastKnownLocation = null;
                    }
                    if (ki0.m3863g(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                lastKnownLocation2 = locationManager.getLastKnownLocation("gps");
                            }
                            break;
                        } catch (Exception unused2) {
                        }
                    }
                    if (lastKnownLocation2 == null || lastKnownLocation == null ? lastKnownLocation2 != null : lastKnownLocation2.getTime() > lastKnownLocation.getTime()) {
                        lastKnownLocation = lastKnownLocation2;
                    }
                    z = false;
                    if (lastKnownLocation != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (C0568di.f2933e == null) {
                            C0568di.f2933e = new C0568di();
                        }
                        C0568di c0568di = C0568di.f2933e;
                        c0568di.m2360a(jCurrentTimeMillis - RewardedAdConstants.PITY_BONUS_MS, lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude());
                        c0568di.m2360a(jCurrentTimeMillis, lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude());
                        z = c0568di.f2936c == 1;
                        long j2 = c0568di.f2935b;
                        long j3 = c0568di.f2934a;
                        c0568di.m2360a(jCurrentTimeMillis + RewardedAdConstants.PITY_BONUS_MS, lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude());
                        long j4 = c0568di.f2935b;
                        if (j2 == -1 || j3 == -1) {
                            j = jCurrentTimeMillis + AccountConstants.TRIAL_DURATION_MS;
                        } else {
                            if (jCurrentTimeMillis <= j3) {
                                j4 = jCurrentTimeMillis > j2 ? j3 : j2;
                            }
                            j = j4 + 60000;
                        }
                        xx1Var.f12764a = z;
                        xx1Var.f12765b = j;
                    } else {
                        int i2 = Calendar.getInstance().get(11);
                        if (i2 < 6 || i2 >= 22) {
                            z = true;
                        }
                    }
                }
                return z ? 2 : 1;
        }
    }

    @Override // p000.AbstractC1172o7
    /* JADX INFO: renamed from: g */
    public final void mo4388g() {
        int i = this.f6675c;
        LayoutInflaterFactory2C1359r7 layoutInflaterFactory2C1359r7 = this.f6676d;
        switch (i) {
            case 0:
                layoutInflaterFactory2C1359r7.m5729n(true, true);
                break;
            default:
                layoutInflaterFactory2C1359r7.m5729n(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1098m7(LayoutInflaterFactory2C1359r7 layoutInflaterFactory2C1359r7, C1174o9 c1174o9) {
        super(layoutInflaterFactory2C1359r7);
        this.f6676d = layoutInflaterFactory2C1359r7;
        this.f6677e = c1174o9;
    }
}
