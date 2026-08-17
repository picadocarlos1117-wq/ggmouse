package p000;

import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class pd2 {

    /* JADX INFO: renamed from: a */
    public final String f8863a;

    public pd2(String str) {
        this.f8863a = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat(str);
    }

    /* JADX INFO: renamed from: c */
    public static String m5252c(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return AbstractC1308pu.m5340g(str, " : ", str2);
    }

    /* JADX INFO: renamed from: a */
    public final void m5253a(RemoteException remoteException, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", m5252c(this.f8863a, str, objArr), remoteException);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5254b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            m5252c(this.f8863a, str, objArr);
        }
    }
}
