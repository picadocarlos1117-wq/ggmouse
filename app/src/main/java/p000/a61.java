package p000;

import android.os.Build;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class a61 {

    /* JADX INFO: renamed from: a */
    public Method f70a;

    /* JADX INFO: renamed from: b */
    public Method f71b;

    /* JADX INFO: renamed from: c */
    public Method f72c;

    public a61(Method method, Method method2, Method method3) {
        this.f70a = method;
        this.f71b = method2;
        this.f72c = method3;
    }

    /* JADX INFO: renamed from: a */
    public static void m93a() {
        if (Build.VERSION.SDK_INT >= 29) {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }
}
