package p000;

import android.content.ComponentName;
import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class os1 {

    /* JADX INFO: renamed from: a */
    public final ComponentName f8459a;

    /* JADX INFO: renamed from: c */
    public String f8461c;

    /* JADX INFO: renamed from: d */
    public String f8462d;

    /* JADX INFO: renamed from: b */
    public int f8460b = 1;

    /* JADX INFO: renamed from: e */
    public boolean f8463e = true;

    public os1(ComponentName componentName) {
        this.f8459a = componentName;
    }

    /* JADX INFO: renamed from: a */
    public static Bundle m5056a(os1 os1Var) {
        os1Var.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("shizuku:user-service-arg-component", os1Var.f8459a);
        bundle.putBoolean("shizuku:user-service-arg-debuggable", false);
        bundle.putInt("shizuku:user-service-arg-version-code", os1Var.f8460b);
        bundle.putBoolean("shizuku:user-service-arg-daemon", os1Var.f8463e);
        bundle.putBoolean("shizuku:user-service-arg-use-32-bit-app-process", false);
        String str = os1Var.f8461c;
        Objects.requireNonNull(str, "process name suffix must not be null");
        bundle.putString("shizuku:user-service-arg-process-name", str);
        String str2 = os1Var.f8462d;
        if (str2 != null) {
            bundle.putString("shizuku:user-service-arg-tag", str2);
        }
        return bundle;
    }
}
