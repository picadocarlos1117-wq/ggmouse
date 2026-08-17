package p000;

import android.os.Bundle;
import android.os.IBinder;

/* JADX INFO: renamed from: vj */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1519vj {
    /* JADX INFO: renamed from: a */
    public static IBinder m6637a(Bundle bundle, String str) {
        return bundle.getBinder(str);
    }

    /* JADX INFO: renamed from: b */
    public static void m6638b(Bundle bundle, String str, IBinder iBinder) {
        bundle.putBinder(str, iBinder);
    }
}
