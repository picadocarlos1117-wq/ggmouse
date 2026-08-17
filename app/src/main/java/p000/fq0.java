package p000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class fq0 {

    /* JADX INFO: renamed from: a */
    public static final Logger f3881a = Logger.getLogger(fq0.class.getName());

    /* JADX INFO: renamed from: a */
    public static Object m2843a(gq0 gq0Var) throws IOException {
        String strM3045r;
        String str;
        double d;
        boolean zM3041j = gq0Var.m3041j();
        char[] cArr = gq0Var.f4286b;
        p32.m5193x(zM3041j, "unexpected end of JSON");
        int iM5359z = AbstractC1308pu.m5359z(gq0Var.m3047x());
        boolean z = false;
        if (iM5359z == 0) {
            int iM3038d = gq0Var.f4291g;
            if (iM3038d == 0) {
                iM3038d = gq0Var.m3038d();
            }
            if (iM3038d != 3) {
                ca0.m1187s("Expected BEGIN_ARRAY but was ", jd0.m3628z(gq0Var.m3047x()), gq0Var.m3043o());
                return null;
            }
            gq0Var.m3048y(1);
            gq0Var.f4298s[gq0Var.f4296q - 1] = 0;
            gq0Var.f4291g = 0;
            ArrayList arrayList = new ArrayList();
            while (gq0Var.m3041j()) {
                arrayList.add(m2843a(gq0Var));
            }
            p32.m5193x(gq0Var.m3047x() == 2, "Bad token: ".concat(gq0Var.m3040g()));
            int iM3038d2 = gq0Var.f4291g;
            if (iM3038d2 == 0) {
                iM3038d2 = gq0Var.m3038d();
            }
            if (iM3038d2 != 4) {
                ca0.m1187s("Expected END_ARRAY but was ", jd0.m3628z(gq0Var.m3047x()), gq0Var.m3043o());
                return null;
            }
            int i = gq0Var.f4296q;
            gq0Var.f4296q = i - 1;
            int[] iArr = gq0Var.f4298s;
            int i2 = i - 2;
            iArr[i2] = iArr[i2] + 1;
            gq0Var.f4291g = 0;
            return Collections.unmodifiableList(arrayList);
        }
        if (iM5359z == 2) {
            int iM3038d3 = gq0Var.f4291g;
            if (iM3038d3 == 0) {
                iM3038d3 = gq0Var.m3038d();
            }
            if (iM3038d3 != 1) {
                ca0.m1187s("Expected BEGIN_OBJECT but was ", jd0.m3628z(gq0Var.m3047x()), gq0Var.m3043o());
                return null;
            }
            gq0Var.m3048y(3);
            gq0Var.f4291g = 0;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (gq0Var.m3041j()) {
                int iM3038d4 = gq0Var.f4291g;
                if (iM3038d4 == 0) {
                    iM3038d4 = gq0Var.m3038d();
                }
                if (iM3038d4 == 14) {
                    strM3045r = gq0Var.m3046s();
                } else if (iM3038d4 == 12) {
                    strM3045r = gq0Var.m3045r('\'');
                } else {
                    if (iM3038d4 != 13) {
                        ca0.m1187s("Expected a name but was ", jd0.m3628z(gq0Var.m3047x()), gq0Var.m3043o());
                        return null;
                    }
                    strM3045r = gq0Var.m3045r('\"');
                }
                gq0Var.f4291g = 0;
                gq0Var.f4297r[gq0Var.f4296q - 1] = strM3045r;
                linkedHashMap.put(strM3045r, m2843a(gq0Var));
            }
            p32.m5193x(gq0Var.m3047x() == 4, "Bad token: ".concat(gq0Var.m3040g()));
            int iM3038d5 = gq0Var.f4291g;
            if (iM3038d5 == 0) {
                iM3038d5 = gq0Var.m3038d();
            }
            if (iM3038d5 != 2) {
                ca0.m1187s("Expected END_OBJECT but was ", jd0.m3628z(gq0Var.m3047x()), gq0Var.m3043o());
                return null;
            }
            int i3 = gq0Var.f4296q;
            int i4 = i3 - 1;
            gq0Var.f4296q = i4;
            gq0Var.f4297r[i4] = null;
            int[] iArr2 = gq0Var.f4298s;
            int i5 = i3 - 2;
            iArr2[i5] = iArr2[i5] + 1;
            gq0Var.f4291g = 0;
            return Collections.unmodifiableMap(linkedHashMap);
        }
        if (iM5359z == 5) {
            int iM3038d6 = gq0Var.f4291g;
            if (iM3038d6 == 0) {
                iM3038d6 = gq0Var.m3038d();
            }
            if (iM3038d6 == 10) {
                str = gq0Var.m3046s();
            } else if (iM3038d6 == 8) {
                str = gq0Var.m3045r('\'');
            } else if (iM3038d6 == 9) {
                str = gq0Var.m3045r('\"');
            } else if (iM3038d6 == 11) {
                str = gq0Var.f4294o;
                gq0Var.f4294o = null;
            } else if (iM3038d6 == 15) {
                str = Long.toString(gq0Var.f4292m);
            } else {
                if (iM3038d6 != 16) {
                    ca0.m1187s("Expected a string but was ", jd0.m3628z(gq0Var.m3047x()), gq0Var.m3043o());
                    return null;
                }
                str = new String(cArr, gq0Var.f4287c, gq0Var.f4293n);
                gq0Var.f4287c += gq0Var.f4293n;
            }
            gq0Var.f4291g = 0;
            int[] iArr3 = gq0Var.f4298s;
            int i6 = gq0Var.f4296q - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return str;
        }
        if (iM5359z != 6) {
            if (iM5359z != 7) {
                if (iM5359z != 8) {
                    f40.m2719o("Bad token: ".concat(gq0Var.m3040g()));
                    return null;
                }
                int iM3038d7 = gq0Var.f4291g;
                if (iM3038d7 == 0) {
                    iM3038d7 = gq0Var.m3038d();
                }
                if (iM3038d7 != 7) {
                    ca0.m1187s("Expected null but was ", jd0.m3628z(gq0Var.m3047x()), gq0Var.m3043o());
                    return null;
                }
                gq0Var.f4291g = 0;
                int[] iArr4 = gq0Var.f4298s;
                int i7 = gq0Var.f4296q - 1;
                iArr4[i7] = iArr4[i7] + 1;
                return null;
            }
            int iM3038d8 = gq0Var.f4291g;
            if (iM3038d8 == 0) {
                iM3038d8 = gq0Var.m3038d();
            }
            if (iM3038d8 == 5) {
                gq0Var.f4291g = 0;
                int[] iArr5 = gq0Var.f4298s;
                int i8 = gq0Var.f4296q - 1;
                iArr5[i8] = iArr5[i8] + 1;
                z = true;
            } else {
                if (iM3038d8 != 6) {
                    ca0.m1187s("Expected a boolean but was ", jd0.m3628z(gq0Var.m3047x()), gq0Var.m3043o());
                    return null;
                }
                gq0Var.f4291g = 0;
                int[] iArr6 = gq0Var.f4298s;
                int i9 = gq0Var.f4296q - 1;
                iArr6[i9] = iArr6[i9] + 1;
            }
            return Boolean.valueOf(z);
        }
        int iM3038d9 = gq0Var.f4291g;
        if (iM3038d9 == 0) {
            iM3038d9 = gq0Var.m3038d();
        }
        if (iM3038d9 == 15) {
            gq0Var.f4291g = 0;
            int[] iArr7 = gq0Var.f4298s;
            int i10 = gq0Var.f4296q - 1;
            iArr7[i10] = iArr7[i10] + 1;
            d = gq0Var.f4292m;
        } else {
            if (iM3038d9 == 16) {
                gq0Var.f4294o = new String(cArr, gq0Var.f4287c, gq0Var.f4293n);
                gq0Var.f4287c += gq0Var.f4293n;
            } else if (iM3038d9 == 8 || iM3038d9 == 9) {
                gq0Var.f4294o = gq0Var.m3045r(iM3038d9 == 8 ? '\'' : '\"');
            } else if (iM3038d9 == 10) {
                gq0Var.f4294o = gq0Var.m3046s();
            } else if (iM3038d9 != 11) {
                ca0.m1187s("Expected a double but was ", jd0.m3628z(gq0Var.m3047x()), gq0Var.m3043o());
                return null;
            }
            gq0Var.f4291g = 11;
            double d2 = Double.parseDouble(gq0Var.f4294o);
            if (Double.isNaN(d2) || Double.isInfinite(d2)) {
                throw new C1079lp("JSON forbids NaN and infinities: " + d2 + gq0Var.m3043o());
            }
            gq0Var.f4294o = null;
            gq0Var.f4291g = 0;
            int[] iArr8 = gq0Var.f4298s;
            int i11 = gq0Var.f4296q - 1;
            iArr8[i11] = iArr8[i11] + 1;
            d = d2;
        }
        return Double.valueOf(d);
    }
}
