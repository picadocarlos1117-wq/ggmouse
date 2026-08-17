package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: renamed from: rt */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1381rt {
    /* JADX INFO: renamed from: a */
    public static void m5907a(Context context, Intent[] intentArr, Bundle bundle) {
        context.startActivities(intentArr, bundle);
    }

    /* JADX INFO: renamed from: b */
    public static void m5908b(Context context, Intent intent, Bundle bundle) {
        context.startActivity(intent, bundle);
    }
}
