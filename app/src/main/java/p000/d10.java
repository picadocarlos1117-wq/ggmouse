package p000;

import android.content.Context;
import android.media.AudioManager;
import android.text.TextUtils;
import android.util.Pair;
import com.example.ssmousepro.ads.RewardedVideoActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class d10 {

    /* JADX INFO: renamed from: j */
    public static final eb1 f2702j = new C1154nq(new C1473ua(3));

    /* JADX INFO: renamed from: a */
    public l80 f2703a;

    /* JADX INFO: renamed from: b */
    public C1534vy f2704b;

    /* JADX INFO: renamed from: c */
    public final Object f2705c;

    /* JADX INFO: renamed from: d */
    public final Context f2706d;

    /* JADX INFO: renamed from: e */
    public final bz1 f2707e;

    /* JADX INFO: renamed from: f */
    public final boolean f2708f;

    /* JADX INFO: renamed from: g */
    public x00 f2709g;

    /* JADX INFO: renamed from: h */
    public final C1679zv f2710h;

    /* JADX INFO: renamed from: i */
    public C1474ub f2711i;

    public d10(RewardedVideoActivity rewardedVideoActivity) {
        bz1 bz1Var = new bz1(8);
        int i = x00.f12394B;
        x00 x00Var = new x00(new w00(rewardedVideoActivity));
        this.f2705c = new Object();
        this.f2706d = rewardedVideoActivity.getApplicationContext();
        this.f2707e = bz1Var;
        this.f2709g = x00Var;
        this.f2711i = C1474ub.f11245b;
        boolean zM7215C = z42.m7215C(rewardedVideoActivity);
        this.f2708f = zM7215C;
        if (!zM7215C && z42.f13274a >= 32) {
            AudioManager audioManager = (AudioManager) rewardedVideoActivity.getSystemService("audio");
            this.f2710h = audioManager == null ? null : new C1679zv(audioManager.getSpatializer());
        }
        boolean z = this.f2709g.f12400w;
    }

    /* JADX INFO: renamed from: a */
    public static void m2167a(z12 z12Var, x00 x00Var, HashMap map) {
        for (int i = 0; i < z12Var.f13237a; i++) {
            e22 e22Var = (e22) x00Var.f4439q.get(z12Var.m7184a(i));
            if (e22Var != null) {
                y12 y12Var = e22Var.f3180a;
                e22 e22Var2 = (e22) map.get(Integer.valueOf(y12Var.f12804c));
                if (e22Var2 == null || (e22Var2.f3181b.isEmpty() && !e22Var.f3181b.isEmpty())) {
                    map.put(Integer.valueOf(y12Var.f12804c), e22Var);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m2168b(be0 be0Var, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(be0Var.f1331d)) {
            return 4;
        }
        String strM2169e = m2169e(str);
        String strM2169e2 = m2169e(be0Var.f1331d);
        if (strM2169e2 == null || strM2169e == null) {
            return (z && strM2169e2 == null) ? 1 : 0;
        }
        if (strM2169e2.startsWith(strM2169e) || strM2169e.startsWith(strM2169e2)) {
            return 3;
        }
        int i = z42.f13274a;
        return strM2169e2.split("-", 2)[0].equals(strM2169e.split("-", 2)[0]) ? 2 : 0;
    }

    /* JADX INFO: renamed from: e */
    public static String m2169e(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* JADX INFO: renamed from: f */
    public static Pair m2170f(int i, oy0 oy0Var, int[][][] iArr, a10 a10Var, Comparator comparator) {
        int i2;
        RandomAccess randomAccessM5570t;
        oy0 oy0Var2 = oy0Var;
        ArrayList arrayList = new ArrayList();
        int i3 = oy0Var2.f8574a;
        int i4 = 0;
        while (i4 < i3) {
            if (i == oy0Var2.f8575b[i4]) {
                z12 z12Var = oy0Var2.f8576c[i4];
                for (int i5 = 0; i5 < z12Var.f13237a; i5++) {
                    y12 y12VarM7184a = z12Var.m7184a(i5);
                    kk1 kk1VarMo14c = a10Var.mo14c(i4, y12VarM7184a, iArr[i4][i5]);
                    int i6 = y12VarM7184a.f12802a;
                    boolean[] zArr = new boolean[i6];
                    int i7 = 0;
                    while (i7 < i6) {
                        b10 b10Var = (b10) kk1VarMo14c.get(i7);
                        int iMo824a = b10Var.mo824a();
                        if (zArr[i7] || iMo824a == 0) {
                            i2 = i3;
                        } else {
                            if (iMo824a == 1) {
                                randomAccessM5570t = qm0.m5570t(b10Var);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(b10Var);
                                int i8 = i7 + 1;
                                while (i8 < i6) {
                                    b10 b10Var2 = (b10) kk1VarMo14c.get(i8);
                                    int i9 = i3;
                                    if (b10Var2.mo824a() == 2 && b10Var.mo825b(b10Var2)) {
                                        arrayList2.add(b10Var2);
                                        zArr[i8] = true;
                                    }
                                    i8++;
                                    i3 = i9;
                                }
                                randomAccessM5570t = arrayList2;
                            }
                            i2 = i3;
                            arrayList.add(randomAccessM5570t);
                        }
                        i7++;
                        i3 = i2;
                    }
                }
            }
            i4++;
            oy0Var2 = oy0Var;
            i3 = i3;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            iArr2[i10] = ((b10) list.get(i10)).f1124c;
        }
        b10 b10Var3 = (b10) list.get(0);
        return Pair.create(new m80(0, b10Var3.f1123b, iArr2), Integer.valueOf(b10Var3.f1122a));
    }

    /* JADX INFO: renamed from: c */
    public final x00 m2171c() {
        x00 x00Var;
        synchronized (this.f2705c) {
            x00Var = this.f2709g;
        }
        return x00Var;
    }

    /* JADX INFO: renamed from: d */
    public final void m2172d() {
        boolean z;
        l80 l80Var;
        C1679zv c1679zv;
        synchronized (this.f2705c) {
            try {
                z = this.f2709g.f12400w && !this.f2708f && z42.f13274a >= 32 && (c1679zv = this.f2710h) != null && c1679zv.f13575b;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z || (l80Var = this.f2703a) == null) {
            return;
        }
        l80Var.f6246n.m7389e(10);
    }

    /* JADX INFO: renamed from: g */
    public final void m2173g(x00 x00Var) {
        boolean zEquals;
        x00Var.getClass();
        synchronized (this.f2705c) {
            zEquals = this.f2709g.equals(x00Var);
            this.f2709g = x00Var;
        }
        if (zEquals) {
            return;
        }
        if (x00Var.f12400w && this.f2706d == null) {
            AbstractC1337qm.m5542i0("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        l80 l80Var = this.f2703a;
        if (l80Var != null) {
            l80Var.f6246n.m7389e(10);
        }
    }
}
