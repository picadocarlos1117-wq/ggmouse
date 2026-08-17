package p000;

import com.google.android.gms.location.GeofenceStatusCodes;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class bl0 extends C1050kx {

    /* JADX INFO: renamed from: b */
    public final int f1400b;

    /* JADX WARN: Illegal instructions before constructor call */
    public bl0(IOException iOException, int i, int i2) {
        if (i == 2000 && i2 == 1) {
            i = 2001;
        }
        super(iOException, i);
        this.f1400b = i2;
    }

    /* JADX INFO: renamed from: a */
    public static bl0 m1000a(IOException iOException, int i) {
        int i2;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i2 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i2 = GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION;
        } else {
            i2 = (message == null || !ua0.m6444b0(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        }
        return i2 == 2007 ? new al0("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, 2007) : new bl0(iOException, i2, i);
    }

    public bl0() {
        super(2008);
        this.f1400b = 1;
    }

    public bl0(String str, IOException iOException, int i) {
        super(str, iOException, i == 2000 ? 2001 : i);
        this.f1400b = 1;
    }
}
