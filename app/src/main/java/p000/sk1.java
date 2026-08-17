package p000;

import android.app.RemoteInput;
import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class sk1 {
    /* JADX INFO: renamed from: a */
    public static void m6107a(Object obj, Intent intent, Bundle bundle) {
        RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
    }

    /* JADX INFO: renamed from: b */
    public static Bundle m6108b(Intent intent) {
        return RemoteInput.getResultsFromIntent(intent);
    }
}
