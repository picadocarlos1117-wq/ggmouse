package p000;

import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class k21 {

    /* JADX INFO: renamed from: a */
    public final j21 f5635a;

    /* JADX INFO: renamed from: b */
    public final Object f5636b;

    /* JADX INFO: renamed from: c */
    public final yo1[] f5637c;

    /* JADX INFO: renamed from: d */
    public boolean f5638d;

    /* JADX INFO: renamed from: e */
    public boolean f5639e;

    /* JADX INFO: renamed from: f */
    public boolean f5640f;

    /* JADX INFO: renamed from: g */
    public l21 f5641g;

    /* JADX INFO: renamed from: h */
    public boolean f5642h;

    /* JADX INFO: renamed from: i */
    public final boolean[] f5643i;

    /* JADX INFO: renamed from: j */
    public final AbstractC0828kh[] f5644j;

    /* JADX INFO: renamed from: k */
    public final d10 f5645k;

    /* JADX INFO: renamed from: l */
    public final d31 f5646l;

    /* JADX INFO: renamed from: m */
    public k21 f5647m;

    /* JADX INFO: renamed from: n */
    public z12 f5648n;

    /* JADX INFO: renamed from: o */
    public j22 f5649o;

    /* JADX INFO: renamed from: p */
    public long f5650p;

    public k21(AbstractC0828kh[] abstractC0828khArr, long j, d10 d10Var, C0547cy c0547cy, d31 d31Var, l21 l21Var, j22 j22Var) {
        this.f5644j = abstractC0828khArr;
        this.f5650p = j;
        this.f5645k = d10Var;
        this.f5646l = d31Var;
        q21 q21Var = l21Var.f6147a;
        this.f5636b = q21Var.f9309a;
        this.f5641g = l21Var;
        this.f5648n = z12.f13236d;
        this.f5649o = j22Var;
        this.f5637c = new yo1[abstractC0828khArr.length];
        this.f5643i = new boolean[abstractC0828khArr.length];
        long j2 = l21Var.f6148b;
        long j3 = l21Var.f6150d;
        d31Var.getClass();
        Object obj = q21Var.f9309a;
        int i = gf1.f4174k;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        q21 q21VarM5437a = q21Var.m5437a(pair.second);
        c31 c31Var = (c31) ((HashMap) d31Var.f2766e).get(obj2);
        c31Var.getClass();
        ((HashSet) d31Var.f2769h).add(c31Var);
        b31 b31Var = (b31) ((HashMap) d31Var.f2767f).get(c31Var);
        if (b31Var != null) {
            b31Var.f1137a.m3631d(b31Var.f1138b);
        }
        c31Var.f1657c.add(q21VarM5437a);
        j21 j21VarMo1020a = c31Var.f1655a.mo1020a(q21VarM5437a, c0547cy, j2);
        ((IdentityHashMap) d31Var.f2765d).put(j21VarMo1020a, c31Var);
        d31Var.m2210d();
        this.f5635a = j3 != -9223372036854775807L ? new C1635yo(j21VarMo1020a, true, 0L, j3) : j21VarMo1020a;
    }

    /* JADX INFO: renamed from: a */
    public final long m3754a(j22 j22Var, long j, boolean z, boolean[] zArr) {
        AbstractC0828kh[] abstractC0828khArr;
        yo1[] yo1VarArr;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= j22Var.f5241a) {
                break;
            }
            if (z || !j22Var.m3539e(this.f5649o, i)) {
                z2 = false;
            }
            this.f5643i[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            abstractC0828khArr = this.f5644j;
            int length = abstractC0828khArr.length;
            yo1VarArr = this.f5637c;
            if (i2 >= length) {
                break;
            }
            if (abstractC0828khArr[i2].f5807b == -2) {
                yo1VarArr[i2] = null;
            }
            i2++;
        }
        m3755b();
        this.f5649o = j22Var;
        m3756c();
        long jMo3529b = this.f5635a.mo3529b((n80[]) j22Var.f5243c, this.f5643i, this.f5637c, zArr, j);
        for (int i3 = 0; i3 < abstractC0828khArr.length; i3++) {
            if (abstractC0828khArr[i3].f5807b == -2 && this.f5649o.m3540f(i3)) {
                yo1VarArr[i3] = new k50((byte) 0, 22);
            }
        }
        this.f5640f = false;
        for (int i4 = 0; i4 < yo1VarArr.length; i4++) {
            if (yo1VarArr[i4] != null) {
                ki0.m3864h(j22Var.m3540f(i4));
                if (abstractC0828khArr[i4].f5807b != -2) {
                    this.f5640f = true;
                }
            } else {
                ki0.m3864h(((n80[]) j22Var.f5243c)[i4] == null);
            }
        }
        return jMo3529b;
    }

    /* JADX INFO: renamed from: b */
    public final void m3755b() {
        if (this.f5647m != null) {
            return;
        }
        int i = 0;
        while (true) {
            j22 j22Var = this.f5649o;
            if (i >= j22Var.f5241a) {
                return;
            }
            boolean zM3540f = j22Var.m3540f(i);
            n80 n80Var = ((n80[]) this.f5649o.f5243c)[i];
            if (zM3540f && n80Var != null) {
                n80Var.mo860f();
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m3756c() {
        if (this.f5647m != null) {
            return;
        }
        int i = 0;
        while (true) {
            j22 j22Var = this.f5649o;
            if (i >= j22Var.f5241a) {
                return;
            }
            boolean zM3540f = j22Var.m3540f(i);
            n80 n80Var = ((n80[]) this.f5649o.f5243c)[i];
            if (zM3540f && n80Var != null) {
                n80Var.mo858d();
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: d */
    public final long m3757d() {
        if (!this.f5639e) {
            return this.f5641g.f6148b;
        }
        long jMo4345p = this.f5640f ? this.f5635a.mo4345p() : Long.MIN_VALUE;
        return jMo4345p == Long.MIN_VALUE ? this.f5641g.f6151e : jMo4345p;
    }

    /* JADX INFO: renamed from: e */
    public final long m3758e() {
        return this.f5641g.f6148b + this.f5650p;
    }

    /* JADX INFO: renamed from: f */
    public final void m3759f(float f, t02 t02Var, boolean z) {
        this.f5639e = true;
        this.f5648n = this.f5635a.mo3536m();
        j22 j22VarM3763j = m3763j(f, t02Var, z);
        l21 l21Var = this.f5641g;
        long jMax = l21Var.f6148b;
        long j = l21Var.f6151e;
        if (j != -9223372036854775807L && jMax >= j) {
            jMax = Math.max(0L, j - 1);
        }
        long jM3754a = m3754a(j22VarM3763j, jMax, false, new boolean[this.f5644j.length]);
        long j2 = this.f5650p;
        l21 l21Var2 = this.f5641g;
        this.f5650p = (l21Var2.f6148b - jM3754a) + j2;
        this.f5641g = l21Var2.m4022b(jM3754a);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m3760g() {
        if (this.f5639e) {
            return !this.f5640f || this.f5635a.mo4345p() == Long.MIN_VALUE;
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m3761h() {
        if (this.f5639e) {
            return m3760g() || m3757d() - this.f5641g.f6148b >= -9223372036854775807L;
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final void m3762i() {
        m3755b();
        j21 j21Var = this.f5635a;
        try {
            boolean z = j21Var instanceof C1635yo;
            d31 d31Var = this.f5646l;
            if (z) {
                d31Var.m2214h(((C1635yo) j21Var).f13036a);
            } else {
                d31Var.m2214h(j21Var);
            }
        } catch (RuntimeException e) {
            AbstractC1337qm.m5551n("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:141:0x033a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v17, types: [m80] */
    /* JADX WARN: Type inference failed for: r21v10 */
    /* JADX WARN: Type inference failed for: r21v11 */
    /* JADX WARN: Type inference failed for: r21v12 */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r2v71 */
    /* JADX WARN: Type inference failed for: r2v72, types: [v00] */
    /* JADX WARN: Type inference failed for: r2v74 */
    /* JADX WARN: Type inference failed for: r2v75 */
    /* JADX WARN: Type inference failed for: r2v85 */
    /* JADX WARN: Type inference failed for: r5v4, types: [m80[]] */
    /* JADX WARN: Type inference failed for: r6v41, types: [m80] */
    /* JADX WARN: Type inference failed for: r6v55, types: [m80] */
    /* JADX WARN: Type inference failed for: r8v56, types: [y12] */
    /* JADX WARN: Type inference failed for: r8v57 */
    /* JADX WARN: Type inference failed for: r8v59 */
    /* JADX WARN: Type inference failed for: r8v60 */
    /* JADX WARN: Type inference failed for: r8v62 */
    /* JADX WARN: Type inference failed for: r8v76 */
    /* JADX WARN: Type inference failed for: r8v77 */
    /* JADX WARN: Type inference failed for: r8v78 */
    /* JADX WARN: Type inference failed for: r8v79 */
    /* JADX INFO: renamed from: j */
    public final j22 m3763j(float f, t02 t02Var, boolean z) {
        int i;
        final x00 x00Var;
        j22 j22Var;
        Pair pairM2170f;
        final boolean z2;
        Object obj;
        kk1 kk1VarM4561g;
        boolean z3;
        kk1 kk1VarM5570t;
        C0087b5 c0087b5;
        int i2;
        long[][] jArr;
        j22 j22Var2;
        Object m80Var;
        int i3;
        int[] iArr;
        y12 y12Var;
        int[] iArr2;
        Object r8;
        C1679zv c1679zv;
        int[] iArr3;
        final d10 d10Var = this.f5645k;
        AbstractC0828kh[] abstractC0828khArr = this.f5644j;
        z12 z12Var = this.f5648n;
        d10Var.getClass();
        int i4 = 1;
        int[] iArr4 = new int[abstractC0828khArr.length + 1];
        int length = abstractC0828khArr.length + 1;
        y12[][] y12VarArr = new y12[length][];
        int[][][] iArr5 = new int[abstractC0828khArr.length + 1][][];
        for (int i5 = 0; i5 < length; i5++) {
            int i6 = z12Var.f13237a;
            y12VarArr[i5] = new y12[i6];
            iArr5[i5] = new int[i6][];
        }
        int length2 = abstractC0828khArr.length;
        final int[] iArr6 = new int[length2];
        for (int i7 = 0; i7 < length2; i7++) {
            iArr6[i7] = abstractC0828khArr[i7].mo2887C();
        }
        int i8 = 0;
        while (true) {
            i = 5;
            if (i8 >= z12Var.f13237a) {
                break;
            }
            y12 y12VarM7184a = z12Var.m7184a(i8);
            int i9 = y12VarM7184a.f12804c == 5 ? i4 : 0;
            int length3 = abstractC0828khArr.length;
            int i10 = i4;
            int i11 = 0;
            int i12 = 0;
            while (i12 < abstractC0828khArr.length) {
                AbstractC0828kh abstractC0828kh = abstractC0828khArr[i12];
                z12 z12Var2 = z12Var;
                int[] iArr7 = iArr4;
                int i13 = i4;
                int iMax = 0;
                for (int i14 = 0; i14 < y12VarM7184a.f12802a; i14++) {
                    iMax = Math.max(iMax, abstractC0828kh.mo2886B(y12VarM7184a.f12805d[i14]) & 7);
                }
                int i15 = iArr7[i12] == 0 ? i13 : 0;
                if (iMax > i11 || (iMax == i11 && i9 != 0 && i10 == 0 && i15 != 0)) {
                    i11 = iMax;
                    i10 = i15;
                    length3 = i12;
                }
                i12++;
                i4 = i13;
                z12Var = z12Var2;
                iArr4 = iArr7;
            }
            z12 z12Var3 = z12Var;
            int[] iArr8 = iArr4;
            int i16 = i4;
            if (length3 == abstractC0828khArr.length) {
                iArr3 = new int[y12VarM7184a.f12802a];
            } else {
                AbstractC0828kh abstractC0828kh2 = abstractC0828khArr[length3];
                int[] iArr9 = new int[y12VarM7184a.f12802a];
                for (int i17 = 0; i17 < y12VarM7184a.f12802a; i17++) {
                    iArr9[i17] = abstractC0828kh2.mo2886B(y12VarM7184a.f12805d[i17]);
                }
                iArr3 = iArr9;
            }
            int i18 = iArr8[length3];
            y12VarArr[length3][i18] = y12VarM7184a;
            iArr5[length3][i18] = iArr3;
            iArr8[length3] = i18 + 1;
            i8++;
            i4 = i16;
            z12Var = z12Var3;
            iArr4 = iArr8;
        }
        int[] iArr10 = iArr4;
        int i19 = i4;
        int i20 = 0;
        z12[] z12VarArr = new z12[abstractC0828khArr.length];
        String[] strArr = new String[abstractC0828khArr.length];
        int[] iArr11 = new int[abstractC0828khArr.length];
        for (int i21 = 0; i21 < abstractC0828khArr.length; i21++) {
            int i22 = iArr10[i21];
            z12VarArr[i21] = new z12((y12[]) z42.m7218F(i22, y12VarArr[i21]));
            iArr5[i21] = (int[][]) z42.m7218F(i22, iArr5[i21]);
            strArr[i21] = abstractC0828khArr[i21].mo34j();
            iArr11[i21] = abstractC0828khArr[i21].f5807b;
        }
        oy0 oy0Var = new oy0(iArr11, z12VarArr, iArr6, iArr5, new z12((y12[]) z42.m7218F(iArr10[abstractC0828khArr.length], y12VarArr[abstractC0828khArr.length])));
        synchronized (d10Var.f2705c) {
            try {
                x00Var = d10Var.f2709g;
                if (x00Var.f12400w && z42.f13274a >= 32 && (c1679zv = d10Var.f2710h) != null) {
                    Looper looperMyLooper = Looper.myLooper();
                    ki0.m3866j(looperMyLooper);
                    if (((y00) c1679zv.f13578e) == null && ((Handler) c1679zv.f13577d) == null) {
                        c1679zv.f13578e = new y00(d10Var);
                        Handler handler = new Handler(looperMyLooper);
                        c1679zv.f13577d = handler;
                        ((Spatializer) c1679zv.f13576c).addOnSpatializerStateChangedListener(new ExecutorC1349qy(handler, i19), (y00) c1679zv.f13578e);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int i23 = oy0Var.f8574a;
        Object r5 = new m80[i23];
        x00Var.f4435m.getClass();
        int i24 = 4;
        int i25 = 2;
        Pair pairM2170f2 = d10.m2170f(2, oy0Var, iArr5, new C0702h5(i24, x00Var, iArr6), new C1473ua(6));
        if (pairM2170f2 == null) {
            j22Var = null;
            pairM2170f = d10.m2170f(4, oy0Var, iArr5, new C1521vl(x00Var, 7), new C1473ua(4));
        } else {
            j22Var = null;
            pairM2170f = null;
        }
        if (pairM2170f != null) {
            r5[((Integer) pairM2170f.second).intValue()] = (m80) pairM2170f.first;
        } else if (pairM2170f2 != null) {
            r5[((Integer) pairM2170f2.second).intValue()] = (m80) pairM2170f2.first;
        }
        int i26 = 0;
        while (true) {
            if (i26 >= oy0Var.f8574a) {
                z2 = false;
                break;
            }
            if (2 == iArr11[i26] && z12VarArr[i26].f13237a > 0) {
                z2 = true;
                break;
            }
            i26++;
        }
        Pair pairM2170f3 = d10.m2170f(1, oy0Var, iArr5, new a10() { // from class: r00
            @Override // p000.a10
            /* JADX INFO: renamed from: c */
            public final kk1 mo14c(int i27, y12 y12Var2, int[] iArr12) {
                d10 d10Var2 = d10Var;
                d10Var2.getClass();
                s00 s00Var = new s00(d10Var2);
                int i28 = iArr6[i27];
                nm0 nm0VarM5566m = qm0.m5566m();
                for (int i29 = 0; i29 < y12Var2.f12802a; i29++) {
                    nm0VarM5566m.m3901a(new t00(i27, y12Var2, i29, x00Var, iArr12[i29], z2, s00Var, i28));
                }
                return nm0VarM5566m.m4561g();
            }
        }, new C1473ua(5));
        if (pairM2170f3 != null) {
            r5[((Integer) pairM2170f3.second).intValue()] = (m80) pairM2170f3.first;
        }
        if (pairM2170f3 == null) {
            obj = j22Var;
        } else {
            m80 m80Var2 = (m80) pairM2170f3.first;
            obj = m80Var2.f6710a.f12805d[m80Var2.f6711b[0]].f1331d;
        }
        int i27 = 3;
        Pair pairM2170f4 = d10.m2170f(3, oy0Var, iArr5, new C0702h5(i, x00Var, obj), new C1473ua(7));
        if (pairM2170f4 != null) {
            r5[((Integer) pairM2170f4.second).intValue()] = (m80) pairM2170f4.first;
        }
        int i28 = 0;
        while (i28 < i23) {
            int i29 = iArr11[i28];
            if (i29 == i25 || i29 == 1 || i29 == i27 || i29 == i24) {
                i3 = i28;
                iArr = iArr11;
            } else {
                z12 z12Var4 = z12VarArr[i28];
                int[][] iArr12 = iArr5[i28];
                j22 j22Var3 = j22Var;
                Object r21 = j22Var3;
                int i30 = i20;
                int i31 = i30;
                Object r9 = j22Var3;
                while (i30 < z12Var4.f13237a) {
                    y12 y12VarM7184a2 = z12Var4.m7184a(i30);
                    int[] iArr13 = iArr12[i30];
                    int i32 = i28;
                    z12 z12Var5 = z12Var4;
                    int i33 = i20;
                    Object r2 = r21;
                    Object r10 = r9;
                    while (i33 < y12VarM7184a2.f12802a) {
                        Object r25 = r10;
                        if (AbstractC0828kh.m3829m(iArr13[i33], x00Var.f12401x)) {
                            y12Var = y12VarM7184a2;
                            v00 v00Var = new v00(y12VarM7184a2.f12805d[i33], iArr13[i33]);
                            if (r2 != 0) {
                                iArr2 = iArr11;
                                if (AbstractC1341qq.f9556a.mo5046c(v00Var.f11471b, r2.f11471b).mo5046c(v00Var.f11470a, r2.f11470a).mo5048e() > 0) {
                                }
                                i33++;
                                y12VarM7184a2 = y12Var;
                                iArr11 = iArr2;
                                r2 = r2;
                                r10 = r8;
                            } else {
                                iArr2 = iArr11;
                            }
                            r2 = v00Var;
                            i31 = i33;
                            r8 = y12Var;
                            i33++;
                            y12VarM7184a2 = y12Var;
                            iArr11 = iArr2;
                            r2 = r2;
                            r10 = r8;
                        } else {
                            y12Var = y12VarM7184a2;
                            iArr2 = iArr11;
                        }
                        r8 = r25;
                        i33++;
                        y12VarM7184a2 = y12Var;
                        iArr11 = iArr2;
                        r2 = r2;
                        r10 = r8;
                    }
                    i30++;
                    r21 = r2;
                    i28 = i32;
                    z12Var4 = z12Var5;
                    r9 = r10;
                }
                i3 = i28;
                iArr = iArr11;
                r5[i3] = r9 == 0 ? j22Var : new m80(i20, r9, new int[]{i31});
            }
            i28 = i3 + 1;
            iArr11 = iArr;
            i24 = 4;
            i27 = 3;
            i25 = 2;
            i20 = 0;
        }
        int i34 = oy0Var.f8574a;
        z12[] z12VarArr2 = oy0Var.f8576c;
        HashMap map = new HashMap();
        for (int i35 = 0; i35 < i34; i35++) {
            d10.m2167a(z12VarArr2[i35], x00Var, map);
        }
        d10.m2167a(oy0Var.f8579f, x00Var, map);
        for (int i36 = 0; i36 < i34; i36++) {
            e22 e22Var = (e22) map.get(Integer.valueOf(oy0Var.f8575b[i36]));
            if (e22Var != null) {
                y12 y12Var2 = e22Var.f3180a;
                qm0 qm0Var = e22Var.f3181b;
                if (qm0Var.isEmpty()) {
                    m80Var = j22Var;
                } else {
                    int iIndexOf = z12VarArr2[i36].f13238b.indexOf(y12Var2);
                    if (iIndexOf < 0) {
                        iIndexOf = -1;
                    }
                    if (iIndexOf != -1) {
                        m80Var = new m80(0, y12Var2, rc2.m5803s0(qm0Var));
                    } else {
                        m80Var = j22Var;
                    }
                }
                r5[i36] = m80Var;
            }
        }
        int i37 = oy0Var.f8574a;
        for (int i38 = 0; i38 < i37; i38++) {
            z12 z12Var6 = oy0Var.f8576c[i38];
            Map map2 = (Map) x00Var.f12403z.get(i38);
            if (map2 != null && map2.containsKey(z12Var6)) {
                Map map3 = (Map) x00Var.f12403z.get(i38);
                if (map3 != null && map3.get(z12Var6) != null) {
                    l41.m4035b();
                    return j22Var;
                }
                r5[i38] = j22Var;
            }
        }
        for (int i39 = 0; i39 < i23; i39++) {
            int i40 = oy0Var.f8575b[i39];
            if (x00Var.f12395A.get(i39) || x00Var.f4440r.contains(Integer.valueOf(i40))) {
                r5[i39] = j22Var;
            }
        }
        bz1 bz1Var = d10Var.f2707e;
        ki0.m3866j(d10Var.f2704b);
        bz1Var.getClass();
        ArrayList arrayList = new ArrayList();
        int i41 = 0;
        while (i41 < r5.length) {
            Object r6 = r5[i41];
            if (r6 == 0 || r6.f6711b.length <= 1) {
                j22Var2 = j22Var;
                arrayList.add(j22Var2);
            } else {
                nm0 nm0VarM5566m = qm0.m5566m();
                nm0VarM5566m.m3901a(new C0006a5(0L, 0L));
                arrayList.add(nm0VarM5566m);
                j22Var2 = j22Var;
            }
            i41++;
            j22Var = j22Var2;
        }
        int length4 = r5.length;
        long[][] jArr2 = new long[length4][];
        for (int i42 = 0; i42 < r5.length; i42++) {
            Object r13 = r5[i42];
            if (r13 == 0) {
                jArr2[i42] = new long[0];
            } else {
                int[] iArr14 = r13.f6711b;
                jArr2[i42] = new long[iArr14.length];
                for (int i43 = 0; i43 < iArr14.length; i43++) {
                    long j = r13.f6710a.f12805d[iArr14[i43]].f1337j;
                    long[] jArr3 = jArr2[i42];
                    if (j == -1) {
                        j = 0;
                    }
                    jArr3[i43] = j;
                }
                Arrays.sort(jArr2[i42]);
            }
        }
        int[] iArr15 = new int[length4];
        long[] jArr4 = new long[length4];
        for (int i44 = 0; i44 < length4; i44++) {
            long[] jArr5 = jArr2[i44];
            jArr4[i44] = jArr5.length == 0 ? 0L : jArr5[0];
        }
        C0087b5.m851m(arrayList, jArr4);
        sc2.m6060d(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap(z71.f13301b);
        x61 x61Var = new x61();
        y61 y61Var = new y61();
        p32.m5175k(treeMap.isEmpty());
        y61Var.f12852d = treeMap;
        y61Var.f12854f = x61Var;
        int i45 = 0;
        loop19: while (true) {
            if (i45 >= length4) {
                int[] iArr16 = iArr15;
                long[][] jArr6 = jArr2;
                Collection c1055l1 = y61Var.f2365b;
                if (c1055l1 == null) {
                    c1055l1 = new C1055l1(0, y61Var);
                    y61Var.f2365b = c1055l1;
                }
                qm0 qm0VarM5567n = qm0.m5567n(c1055l1);
                for (int i46 = 0; i46 < qm0VarM5567n.size(); i46++) {
                    int iIntValue = ((Integer) qm0VarM5567n.get(i46)).intValue();
                    int i47 = iArr16[iIntValue] + 1;
                    iArr16[iIntValue] = i47;
                    jArr4[iIntValue] = jArr6[iIntValue][i47];
                    C0087b5.m851m(arrayList, jArr4);
                }
                for (int i48 = 0; i48 < r5.length; i48++) {
                    if (arrayList.get(i48) != null) {
                        jArr4[i48] = jArr4[i48] * 2;
                    }
                }
                C0087b5.m851m(arrayList, jArr4);
                nm0 nm0VarM5566m2 = qm0.m5566m();
                for (int i49 = 0; i49 < arrayList.size(); i49++) {
                    nm0 nm0Var = (nm0) arrayList.get(i49);
                    nm0VarM5566m2.m3901a(nm0Var == null ? kk1.f5896e : nm0Var.m4561g());
                }
                kk1VarM4561g = nm0VarM5566m2.m4561g();
                break;
            }
            long[] jArr7 = jArr2[i45];
            if (jArr7.length <= 1) {
                i2 = length4;
                jArr = jArr2;
            } else {
                int length5 = jArr7.length;
                double[] dArr = new double[length5];
                int i50 = 0;
                while (true) {
                    long[] jArr8 = jArr2[i45];
                    i2 = length4;
                    double dLog = 0.0d;
                    if (i50 >= jArr8.length) {
                        break;
                    }
                    long[][] jArr9 = jArr2;
                    long j2 = jArr8[i50];
                    if (j2 != -1) {
                        dLog = Math.log(j2);
                    }
                    dArr[i50] = dLog;
                    i50++;
                    jArr2 = jArr9;
                    length4 = i2;
                }
                long[][] jArr10 = jArr2;
                int i51 = length5 - 1;
                double d = dArr[i51] - dArr[0];
                int i52 = 0;
                while (i52 < i51) {
                    double d2 = dArr[i52];
                    i52++;
                    long[][] jArr11 = jArr10;
                    Double dValueOf = Double.valueOf(d == 0.0d ? 1.0d : (((d2 + dArr[i52]) * 0.5d) - dArr[0]) / d);
                    int[] iArr17 = iArr15;
                    Integer numValueOf = Integer.valueOf(i45);
                    int i53 = i45;
                    Map map4 = y61Var.f12852d;
                    double d3 = d;
                    Collection collection = (Collection) map4.get(dValueOf);
                    if (collection == null) {
                        List list = (List) y61Var.f12854f.get();
                        if (!list.add(numValueOf)) {
                            f40.m2711g("New Collection violated the Collection spec");
                            kk1VarM4561g = null;
                            break loop19;
                        }
                        y61Var.f12853e++;
                        map4.put(dValueOf, list);
                    } else if (collection.add(numValueOf)) {
                        y61Var.f12853e++;
                    }
                    jArr10 = jArr11;
                    iArr15 = iArr17;
                    i45 = i53;
                    d = d3;
                }
                jArr = jArr10;
            }
            i45++;
            length4 = i2;
            jArr2 = jArr;
            iArr15 = iArr15;
        }
        n80[] n80VarArr = new n80[r5.length];
        for (int i54 = 0; i54 < r5.length; i54++) {
            Object r7 = r5[i54];
            if (r7 != 0) {
                int[] iArr18 = r7.f6711b;
                if (iArr18.length != 0) {
                    int length6 = iArr18.length;
                    y12 y12Var3 = r7.f6710a;
                    if (length6 == 1) {
                        c0087b5 = new C0087b5(1, y12Var3, new int[]{iArr18[0]});
                    } else {
                        qm0 qm0Var2 = (qm0) kk1VarM4561g.get(i54);
                        C0087b5 c0087b6 = new C0087b5(0, y12Var3, iArr18);
                        qm0.m5567n(qm0Var2);
                        c0087b5 = c0087b6;
                    }
                    n80VarArr[i54] = c0087b5;
                }
            }
        }
        xk1[] xk1VarArr = new xk1[i23];
        for (int i55 = 0; i55 < i23; i55++) {
            xk1VarArr[i55] = (x00Var.f12395A.get(i55) || x00Var.f4440r.contains(Integer.valueOf(oy0Var.f8575b[i55])) || (oy0Var.f8575b[i55] != -2 && n80VarArr[i55] == null)) ? null : xk1.f12632c;
        }
        x00Var.f4435m.getClass();
        Pair pairCreate = Pair.create(xk1VarArr, n80VarArr);
        n80[] n80VarArr2 = (n80[]) pairCreate.second;
        List[] listArr = new List[n80VarArr2.length];
        for (int i56 = 0; i56 < n80VarArr2.length; i56++) {
            n80 n80Var = n80VarArr2[i56];
            if (n80Var != null) {
                kk1VarM5570t = qm0.m5570t(n80Var);
            } else {
                om0 om0Var = qm0.f9540b;
                kk1VarM5570t = kk1.f5896e;
            }
            listArr[i56] = kk1VarM5570t;
        }
        nm0 nm0Var2 = new nm0(4);
        int i57 = 0;
        while (true) {
            int i58 = oy0Var.f8574a;
            z12[] z12VarArr3 = oy0Var.f8576c;
            if (i57 >= i58) {
                break;
            }
            z12 z12Var7 = z12VarArr3[i57];
            List list2 = listArr[i57];
            int i59 = 0;
            while (i59 < z12Var7.f13237a) {
                y12 y12VarM7184a3 = z12Var7.m7184a(i59);
                int i60 = z12VarArr3[i57].m7184a(i59).f12802a;
                int[] iArr19 = new int[i60];
                int i61 = 0;
                int i62 = 0;
                while (i61 < i60) {
                    List[] listArr2 = listArr;
                    if ((oy0Var.f8578e[i57][i59][i61] & 7) == 4) {
                        iArr19[i62] = i61;
                        i62++;
                    }
                    i61++;
                    listArr = listArr2;
                }
                List[] listArr3 = listArr;
                int[] iArrCopyOf = Arrays.copyOf(iArr19, i62);
                z12 z12Var8 = z12Var7;
                int iMin = 16;
                String str = null;
                int i63 = 0;
                boolean z4 = false;
                int i64 = 0;
                while (i63 < iArrCopyOf.length) {
                    String str2 = z12VarArr3[i57].m7184a(i59).f12805d[iArrCopyOf[i63]].f1341n;
                    int i65 = i64 + 1;
                    if (i64 == 0) {
                        str = str2;
                    } else {
                        z4 = (!Objects.equals(str, str2)) | z4;
                    }
                    iMin = Math.min(iMin, oy0Var.f8578e[i57][i59][i63] & 24);
                    i63++;
                    i64 = i65;
                }
                if (z4) {
                    iMin = Math.min(iMin, oy0Var.f8577d[i57]);
                }
                boolean z5 = iMin != 0;
                int i66 = y12VarM7184a3.f12802a;
                int[] iArr20 = new int[i66];
                boolean[] zArr = new boolean[i66];
                for (int i67 = 0; i67 < y12VarM7184a3.f12802a; i67++) {
                    iArr20[i67] = oy0Var.f8578e[i57][i59][i67] & 7;
                    int i68 = 0;
                    while (true) {
                        if (i68 >= list2.size()) {
                            z3 = false;
                            break;
                        }
                        n80 n80Var2 = (n80) list2.get(i68);
                        if (n80Var2.mo855a().equals(y12VarM7184a3) && n80Var2.mo864l(i67) != -1) {
                            z3 = true;
                            break;
                        }
                        i68++;
                    }
                    zArr[i67] = z3;
                }
                nm0Var2.m3901a(new k22(y12VarM7184a3, z5, iArr20, zArr));
                i59++;
                listArr = listArr3;
                z12Var7 = z12Var8;
            }
            i57++;
        }
        z12 z12Var9 = oy0Var.f8579f;
        for (int i69 = 0; i69 < z12Var9.f13237a; i69++) {
            y12 y12VarM7184a4 = z12Var9.m7184a(i69);
            int[] iArr21 = new int[y12VarM7184a4.f12802a];
            Arrays.fill(iArr21, 0);
            nm0Var2.m3901a(new k22(y12VarM7184a4, false, iArr21, new boolean[y12VarM7184a4.f12802a]));
        }
        j22 j22Var4 = new j22((xk1[]) pairCreate.first, (n80[]) pairCreate.second, new l22(nm0Var2.m4561g()), oy0Var);
        for (int i70 = 0; i70 < j22Var4.f5241a; i70++) {
            boolean zM3540f = j22Var4.m3540f(i70);
            n80[] n80VarArr3 = (n80[]) j22Var4.f5243c;
            if (zM3540f) {
                ki0.m3864h(n80VarArr3[i70] != null || this.f5644j[i70].f5807b == -2);
            } else {
                ki0.m3864h(n80VarArr3[i70] == null);
            }
        }
        for (n80 n80Var3 : (n80[]) j22Var4.f5243c) {
            if (n80Var3 != null) {
                n80Var3.mo863i(f);
                n80Var3.mo856b(z);
            }
        }
        return j22Var4;
    }

    /* JADX INFO: renamed from: k */
    public final void m3764k() {
        j21 j21Var = this.f5635a;
        if (j21Var instanceof C1635yo) {
            long j = this.f5641g.f6150d;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            C1635yo c1635yo = (C1635yo) j21Var;
            c1635yo.f13040e = 0L;
            c1635yo.f13041f = j;
        }
    }
}
