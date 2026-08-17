package p000;

import com.example.ssmousepro.injection.TouchPipeline;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class wx0 {

    /* JADX INFO: renamed from: a */
    public final ux0 f12351a;

    /* JADX INFO: renamed from: b */
    public final Map f12352b;

    /* JADX INFO: renamed from: c */
    public final Map f12353c;

    /* JADX INFO: renamed from: d */
    public final om1 f12354d;

    /* JADX INFO: renamed from: e */
    public final Object f12355e;

    /* JADX INFO: renamed from: f */
    public final Map f12356f;

    public wx0(ux0 ux0Var, HashMap map, HashMap map2, om1 om1Var, Object obj, Map map3) {
        this.f12351a = ux0Var;
        this.f12352b = Collections.unmodifiableMap(new HashMap(map));
        this.f12353c = Collections.unmodifiableMap(new HashMap(map2));
        this.f12354d = om1Var;
        this.f12355e = obj;
        this.f12356f = map3 != null ? Collections.unmodifiableMap(new HashMap(map3)) : null;
    }

    /* JADX INFO: renamed from: a */
    public static wx0 m6844a(Map map, boolean z, int i, int i2, Object obj) {
        om1 om1Var;
        Map mapM5563z;
        om1 om1Var2;
        if (z) {
            if (map == null || (mapM5563z = AbstractC1337qm.m5563z("retryThrottling", map)) == null) {
                om1Var2 = null;
            } else {
                float fFloatValue = AbstractC1337qm.m5561x("maxTokens", mapM5563z).floatValue();
                float fFloatValue2 = AbstractC1337qm.m5561x("tokenRatio", mapM5563z).floatValue();
                p32.m5193x(fFloatValue > TouchPipeline.SIZE, "maxToken should be greater than zero");
                p32.m5193x(fFloatValue2 > TouchPipeline.SIZE, "tokenRatio should be greater than zero");
                om1Var2 = new om1(fFloatValue, fFloatValue2);
            }
            om1Var = om1Var2;
        } else {
            om1Var = null;
        }
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        Map mapM5563z2 = map == null ? null : AbstractC1337qm.m5563z("healthCheckConfig", map);
        List<Map> listM5559v = AbstractC1337qm.m5559v("methodConfig", map);
        if (listM5559v == null) {
            listM5559v = null;
        } else {
            AbstractC1337qm.m5539h(listM5559v);
        }
        if (listM5559v == null) {
            return new wx0(null, map2, map3, om1Var, obj, mapM5563z2);
        }
        ux0 ux0Var = null;
        for (Map map4 : listM5559v) {
            ux0 ux0Var2 = new ux0(map4, z, i, i2);
            List<Map> listM5559v2 = AbstractC1337qm.m5559v(AppMeasurementSdk.ConditionalUserProperty.NAME, map4);
            if (listM5559v2 == null) {
                listM5559v2 = null;
            } else {
                AbstractC1337qm.m5539h(listM5559v2);
            }
            if (listM5559v2 != null && !listM5559v2.isEmpty()) {
                for (Map map5 : listM5559v2) {
                    String strM5506A = AbstractC1337qm.m5506A("service", map5);
                    String strM5506A2 = AbstractC1337qm.m5506A(FirebaseAnalytics.Param.METHOD, map5);
                    if (p32.m5152S(strM5506A)) {
                        p32.m5179m(p32.m5152S(strM5506A2), "missing service name for method %s", strM5506A2);
                        p32.m5179m(ux0Var == null, "Duplicate default method config in service config %s", map);
                        ux0Var = ux0Var2;
                    } else if (p32.m5152S(strM5506A2)) {
                        p32.m5179m(!map3.containsKey(strM5506A), "Duplicate service %s", strM5506A);
                        map3.put(strM5506A, ux0Var2);
                    } else {
                        String strM6385a = u51.m6385a(strM5506A, strM5506A2);
                        p32.m5179m(!map2.containsKey(strM6385a), "Duplicate method name %s", strM6385a);
                        map2.put(strM6385a, ux0Var2);
                    }
                }
            }
        }
        return new wx0(ux0Var, map2, map3, om1Var, obj, mapM5563z2);
    }

    /* JADX INFO: renamed from: b */
    public final vx0 m6845b() {
        if (this.f12353c.isEmpty() && this.f12352b.isEmpty() && this.f12351a == null) {
            return null;
        }
        return new vx0(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && wx0.class == obj.getClass()) {
            wx0 wx0Var = (wx0) obj;
            if (hr1.m3275k(this.f12351a, wx0Var.f12351a) && hr1.m3275k(this.f12352b, wx0Var.f12352b) && hr1.m3275k(this.f12353c, wx0Var.f12353c) && hr1.m3275k(this.f12354d, wx0Var.f12354d) && hr1.m3275k(this.f12355e, wx0Var.f12355e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12351a, this.f12352b, this.f12353c, this.f12354d, this.f12355e});
    }

    public final String toString() {
        C1679zv c1679zvM5176k0 = p32.m5176k0(this);
        c1679zvM5176k0.m7359a(this.f12351a, "defaultMethodConfig");
        c1679zvM5176k0.m7359a(this.f12352b, "serviceMethodMap");
        c1679zvM5176k0.m7359a(this.f12353c, "serviceMap");
        c1679zvM5176k0.m7359a(this.f12354d, "retryThrottling");
        c1679zvM5176k0.m7359a(this.f12355e, "loadBalancingConfig");
        return c1679zvM5176k0.toString();
    }
}
