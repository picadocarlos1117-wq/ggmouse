package p000;

import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Display;
import android.view.WindowManager;
import android.view.accessibility.CaptioningManager;
import com.example.ssmousepro.ads.RewardedVideoActivity;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class w00 extends g22 {

    /* JADX INFO: renamed from: A */
    public final SparseBooleanArray f11880A;

    /* JADX INFO: renamed from: s */
    public boolean f11881s;

    /* JADX INFO: renamed from: t */
    public boolean f11882t;

    /* JADX INFO: renamed from: u */
    public boolean f11883u;

    /* JADX INFO: renamed from: v */
    public boolean f11884v;

    /* JADX INFO: renamed from: w */
    public boolean f11885w;

    /* JADX INFO: renamed from: x */
    public boolean f11886x;

    /* JADX INFO: renamed from: y */
    public boolean f11887y;

    /* JADX INFO: renamed from: z */
    public final SparseArray f11888z;

    /* JADX WARN: Code duplicated, block: B:47:0x00de  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f6  */
    public w00(RewardedVideoActivity rewardedVideoActivity) {
        CaptioningManager captioningManager;
        Point point;
        Point point2;
        int i = z42.f13274a;
        if ((i >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) rewardedVideoActivity.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            this.f4036o = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.f4035n = qm0.m5570t(locale.toLanguageTag());
            }
        }
        DisplayManager displayManager = (DisplayManager) rewardedVideoActivity.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            WindowManager windowManager = (WindowManager) rewardedVideoActivity.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && z42.m7215C(rewardedVideoActivity)) {
            String strM7247u = i < 28 ? z42.m7247u("sys.display-size") : z42.m7247u("vendor.display-size");
            if (!TextUtils.isEmpty(strM7247u)) {
                try {
                    String[] strArrSplit = strM7247u.trim().split("x", -1);
                    if (strArrSplit.length == 2) {
                        int i2 = Integer.parseInt(strArrSplit[0]);
                        int i3 = Integer.parseInt(strArrSplit[1]);
                        if (i2 > 0 && i3 > 0) {
                            point2 = new Point(i2, i3);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                AbstractC1337qm.m5549m("Util", "Invalid display size: " + strM7247u);
            }
            if ("Sony".equals(z42.f13276c) && z42.f13277d.startsWith("BRAVIA") && rewardedVideoActivity.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                point = new Point(3840, 2160);
            } else {
                point = new Point();
                if (i >= 23) {
                    Display.Mode mode = display.getMode();
                    point.x = mode.getPhysicalWidth();
                    point.y = mode.getPhysicalHeight();
                } else {
                    display.getRealSize(point);
                }
            }
            point2 = point;
        } else {
            point = new Point();
            if (i >= 23) {
                Display.Mode mode2 = display.getMode();
                point.x = mode2.getPhysicalWidth();
                point.y = mode2.getPhysicalHeight();
            } else {
                display.getRealSize(point);
            }
            point2 = point;
        }
        mo2925d(point2.x, point2.y);
        this.f11888z = new SparseArray();
        this.f11880A = new SparseBooleanArray();
        m6677e();
    }

    @Override // p000.g22
    /* JADX INFO: renamed from: c */
    public final g22 mo2924c(String[] strArr) {
        super.mo2924c(strArr);
        return this;
    }

    @Override // p000.g22
    /* JADX INFO: renamed from: d */
    public final g22 mo2925d(int i, int i2) {
        super.mo2925d(i, i2);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final void m6677e() {
        this.f11881s = true;
        this.f11882t = true;
        this.f11883u = true;
        this.f11884v = true;
        this.f11885w = true;
        this.f11886x = true;
        this.f11887y = true;
    }

    /* JADX INFO: renamed from: f */
    public final void m6678f(int i) {
        this.f4039r.remove(Integer.valueOf(i));
    }

    public w00(x00 x00Var) {
        m2923b(x00Var);
        this.f11881s = x00Var.f12396s;
        this.f11882t = x00Var.f12397t;
        this.f11883u = x00Var.f12398u;
        this.f11884v = x00Var.f12399v;
        this.f11885w = x00Var.f12400w;
        this.f11886x = x00Var.f12401x;
        this.f11887y = x00Var.f12402y;
        SparseArray sparseArray = x00Var.f12403z;
        SparseArray sparseArray2 = new SparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), new HashMap((Map) sparseArray.valueAt(i)));
        }
        this.f11888z = sparseArray2;
        this.f11880A = x00Var.f12395A.clone();
    }

    public w00() {
        this.f11888z = new SparseArray();
        this.f11880A = new SparseBooleanArray();
        m6677e();
    }
}
