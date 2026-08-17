package p000;

import android.os.Build;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ez0 {

    /* JADX INFO: renamed from: a */
    public final bz0 f3501a;

    /* JADX INFO: renamed from: b */
    public final az0 f3502b;

    /* JADX INFO: renamed from: c */
    public final View f3503c;

    public ez0(az0 az0Var, View view) {
        int i = Build.VERSION.SDK_INT;
        this.f3501a = i >= 34 ? new dz0() : i >= 33 ? new bz0() : null;
        this.f3502b = az0Var;
        this.f3503c = view;
    }
}
