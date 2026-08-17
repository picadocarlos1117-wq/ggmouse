package p000;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class sb1 extends ou0 {
    /* JADX INFO: renamed from: d */
    public static v71 m6026d(Map map) {
        lb1 lb1Var;
        lb1 lb1Var2;
        Integer num;
        Integer num2;
        Integer num3 = 5;
        Integer num4 = 100;
        Long lM5507B = AbstractC1337qm.m5507B("interval", map);
        Long lM5507B2 = AbstractC1337qm.m5507B("baseEjectionTime", map);
        Long lM5507B3 = AbstractC1337qm.m5507B("maxEjectionTime", map);
        Integer numM5562y = AbstractC1337qm.m5562y("maxEjectionPercentage", map);
        Long l = lM5507B != null ? lM5507B : 10000000000L;
        Long l2 = lM5507B2 != null ? lM5507B2 : 30000000000L;
        Long l3 = lM5507B3 != null ? lM5507B3 : 300000000000L;
        Integer num5 = numM5562y != null ? numM5562y : 10;
        Map mapM5563z = AbstractC1337qm.m5563z("successRateEjection", map);
        List list = null;
        if (mapM5563z != null) {
            Integer numM5562y2 = AbstractC1337qm.m5562y("stdevFactor", mapM5563z);
            Integer numM5562y3 = AbstractC1337qm.m5562y("enforcementPercentage", mapM5563z);
            Integer numM5562y4 = AbstractC1337qm.m5562y("minimumHosts", mapM5563z);
            Integer numM5562y5 = AbstractC1337qm.m5562y("requestVolume", mapM5563z);
            Integer num6 = numM5562y2 != null ? numM5562y2 : 1900;
            if (numM5562y3 != null) {
                p32.m5175k(numM5562y3.intValue() >= 0 && numM5562y3.intValue() <= 100);
                num = numM5562y3;
            } else {
                num = num4;
            }
            if (numM5562y4 != null) {
                p32.m5175k(numM5562y4.intValue() >= 0);
                num2 = numM5562y4;
            } else {
                num2 = num3;
            }
            if (numM5562y5 != null) {
                p32.m5175k(numM5562y5.intValue() >= 0);
            } else {
                numM5562y5 = num4;
            }
            lb1Var = new lb1(num6, num, num2, numM5562y5);
        } else {
            lb1Var = null;
        }
        Map mapM5563z2 = AbstractC1337qm.m5563z("failurePercentageEjection", map);
        if (mapM5563z2 != null) {
            Integer num7 = 85;
            Integer num8 = 50;
            Integer numM5562y6 = AbstractC1337qm.m5562y("threshold", mapM5563z2);
            Integer numM5562y7 = AbstractC1337qm.m5562y("enforcementPercentage", mapM5563z2);
            Integer numM5562y8 = AbstractC1337qm.m5562y("minimumHosts", mapM5563z2);
            Integer numM5562y9 = AbstractC1337qm.m5562y("requestVolume", mapM5563z2);
            if (numM5562y6 != null) {
                p32.m5175k(numM5562y6.intValue() >= 0 && numM5562y6.intValue() <= 100);
                num7 = numM5562y6;
            }
            if (numM5562y7 != null) {
                p32.m5175k(numM5562y7.intValue() >= 0 && numM5562y7.intValue() <= 100);
                num4 = numM5562y7;
            }
            if (numM5562y8 != null) {
                p32.m5175k(numM5562y8.intValue() >= 0);
                num3 = numM5562y8;
            }
            if (numM5562y9 != null) {
                p32.m5175k(numM5562y9.intValue() >= 0);
                num8 = numM5562y9;
            }
            lb1Var2 = new lb1(num7, num4, num3, num8);
        } else {
            lb1Var2 = null;
        }
        List listM5559v = AbstractC1337qm.m5559v("childPolicy", map);
        if (listM5559v != null) {
            AbstractC1337qm.m5539h(listM5559v);
            list = listM5559v;
        }
        List listM3264O = hr1.m3264O(list);
        if (listM3264O == null || listM3264O.isEmpty()) {
            return new v71(nv1.f7558m.m4614g("No child policy in outlier_detection_experimental LB policy: " + map));
        }
        v71 v71VarM3260K = hr1.m3260K(listM3264O, qu0.m5610a());
        if (v71VarM3260K.f11573a != null) {
            return v71VarM3260K;
        }
        gr1 gr1Var = (gr1) v71VarM3260K.f11574b;
        p32.m5192w(gr1Var != null);
        p32.m5192w(gr1Var != null);
        return new v71(new mb1(l, l2, l3, num5, lb1Var, lb1Var2, gr1Var));
    }

    @Override // p000.ou0
    /* JADX INFO: renamed from: a */
    public final String mo2844a() {
        return "outlier_detection_experimental";
    }

    @Override // p000.ou0
    /* JADX INFO: renamed from: b */
    public final nu0 mo2845b(hp0 hp0Var) {
        return new rb1(hp0Var);
    }

    @Override // p000.ou0
    /* JADX INFO: renamed from: c */
    public final v71 mo2846c(Map map) {
        try {
            return m6026d(map);
        } catch (RuntimeException e) {
            return new v71(nv1.f7559n.m4613f(e).m4614g("Failed parsing configuration for outlier_detection_experimental"));
        }
    }
}
