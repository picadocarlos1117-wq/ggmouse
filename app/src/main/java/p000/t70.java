package p000;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.location.GeofenceStatusCodes;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class t70 extends rd1 {

    /* JADX INFO: renamed from: c */
    public final int f10771c;

    /* JADX INFO: renamed from: d */
    public final String f10772d;

    /* JADX INFO: renamed from: e */
    public final int f10773e;

    /* JADX INFO: renamed from: f */
    public final be0 f10774f;

    /* JADX INFO: renamed from: g */
    public final int f10775g;

    /* JADX INFO: renamed from: m */
    public final q21 f10776m;

    /* JADX INFO: renamed from: n */
    public final boolean f10777n;

    static {
        AbstractC1308pu.m5349p(1001, 1002, 1003, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION, GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT);
        z42.m7252z(1006);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public t70(int i, Exception exc, int i2, String str, int i3, be0 be0Var, int i4, boolean z) {
        String str2;
        int i5;
        be0 be0Var2;
        String string;
        String str3;
        if (i == 0) {
            str2 = str;
            i5 = i3;
            be0Var2 = be0Var;
            string = "Source error";
        } else if (i != 1) {
            string = i != 3 ? "Unexpected runtime error" : "Remote error";
            str2 = str;
            i5 = i3;
            be0Var2 = be0Var;
        } else {
            StringBuilder sb = new StringBuilder();
            str2 = str;
            sb.append(str2);
            sb.append(" error, index=");
            i5 = i3;
            sb.append(i5);
            sb.append(", format=");
            be0Var2 = be0Var;
            sb.append(be0Var2);
            sb.append(", format_supported=");
            int i6 = z42.f13274a;
            if (i4 == 0) {
                str3 = "NO";
            } else if (i4 == 1) {
                str3 = "NO_UNSUPPORTED_TYPE";
            } else if (i4 == 2) {
                str3 = "NO_UNSUPPORTED_DRM";
            } else if (i4 == 3) {
                str3 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i4 != 4) {
                    l41.m4046o();
                    throw null;
                }
                str3 = "YES";
            }
            sb.append(str3);
            string = sb.toString();
        }
        this(TextUtils.isEmpty(null) ? string : string.concat(": null"), exc, i2, i, str2, i5, be0Var2, i4, null, SystemClock.elapsedRealtime(), z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t70(String str, Throwable th, int i, int i2, String str2, int i3, be0 be0Var, int i4, q21 q21Var, long j, boolean z) {
        super(str, th, i, j);
        Bundle bundle = Bundle.EMPTY;
        ki0.m3857c(!z || i2 == 1);
        ki0.m3857c(th != null || i2 == 3);
        this.f10771c = i2;
        this.f10772d = str2;
        this.f10773e = i3;
        this.f10774f = be0Var;
        this.f10775g = i4;
        this.f10776m = q21Var;
        this.f10777n = z;
    }

    public t70(int i, Exception exc, int i2) {
        this(i, exc, i2, null, -1, null, 4, false);
    }
}
