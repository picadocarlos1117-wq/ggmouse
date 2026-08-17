package p000;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g50 {

    /* JADX INFO: renamed from: a */
    public static final int f4063a = Color.argb(230, 255, 255, 255);

    /* JADX INFO: renamed from: b */
    public static final int f4064b = Color.argb(128, 27, 27, 27);

    /* JADX INFO: renamed from: a */
    public static void m2937a(AbstractActivityC1469u6 abstractActivityC1469u6) {
        vy1 vy1Var = vy1.f11865a;
        wy1 wy1Var = new wy1(0, 0, vy1Var);
        wy1 wy1Var2 = new wy1(f4063a, f4064b, vy1Var);
        View decorView = abstractActivityC1469u6.getWindow().getDecorView();
        decorView.getClass();
        Resources resources = decorView.getResources();
        resources.getClass();
        boolean zBooleanValue = ((Boolean) vy1Var.invoke(resources)).booleanValue();
        Resources resources2 = decorView.getResources();
        resources2.getClass();
        boolean zBooleanValue2 = ((Boolean) vy1Var.invoke(resources2)).booleanValue();
        j50 i50Var = Build.VERSION.SDK_INT >= 29 ? new i50() : new h50();
        Window window = abstractActivityC1469u6.getWindow();
        window.getClass();
        i50Var.mo3108a(wy1Var, wy1Var2, window, decorView, zBooleanValue, zBooleanValue2);
    }
}
