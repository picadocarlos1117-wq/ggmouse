package p000;

import android.sun.security.util.DerValue;
import com.google.android.gms.location.LocationRequest;

/* JADX INFO: loaded from: classes3.dex */
public abstract class v32 {

    /* JADX INFO: renamed from: a */
    public static final short[] f11502a = new short[128];

    /* JADX INFO: renamed from: b */
    public static final byte[] f11503b;

    static {
        byte[] bArr = new byte[112];
        f11503b = bArr;
        byte[] bArr2 = new byte[128];
        m6562a(bArr2, 0, 15, (byte) 1);
        m6562a(bArr2, 16, 31, (byte) 2);
        m6562a(bArr2, 32, 63, (byte) 3);
        m6562a(bArr2, 64, 65, (byte) 0);
        m6562a(bArr2, 66, 95, (byte) 4);
        m6562a(bArr2, 96, 96, (byte) 5);
        m6562a(bArr2, 97, 108, (byte) 6);
        m6562a(bArr2, 109, 109, (byte) 7);
        m6562a(bArr2, 110, 111, (byte) 6);
        m6562a(bArr2, 112, 112, (byte) 8);
        m6562a(bArr2, 113, 115, (byte) 9);
        m6562a(bArr2, 116, 116, (byte) 10);
        m6562a(bArr2, 117, 127, (byte) 0);
        m6562a(bArr, 0, bArr.length - 1, (byte) -2);
        m6562a(bArr, 8, 11, (byte) -1);
        m6562a(bArr, 24, 27, (byte) 0);
        m6562a(bArr, 40, 43, (byte) 16);
        m6562a(bArr, 58, 59, (byte) 0);
        m6562a(bArr, 72, 73, (byte) 0);
        m6562a(bArr, 89, 91, (byte) 16);
        m6562a(bArr, LocationRequest.PRIORITY_LOW_POWER, LocationRequest.PRIORITY_LOW_POWER, (byte) 16);
        byte[] bArr3 = {0, 0, 0, 0, 31, 15, 15, 15, 7, 7, 7};
        byte[] bArr4 = {-2, -2, -2, -2, 0, 48, 16, DerValue.TAG_APPLICATION, 80, 32, 96};
        for (int i = 0; i < 128; i++) {
            byte b = bArr2[i];
            f11502a[i] = (short) (bArr4[b] | ((bArr3[b] & i) << 8));
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m6562a(byte[] bArr, int i, int i2, byte b) {
        while (i <= i2) {
            bArr[i] = b;
            i++;
        }
    }
}
