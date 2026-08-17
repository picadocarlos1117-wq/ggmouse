package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ux0 {

    /* JADX INFO: renamed from: g */
    public static final C0101bj f11442g = new C0101bj("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo", 1);

    /* JADX INFO: renamed from: a */
    public final Long f11443a;

    /* JADX INFO: renamed from: b */
    public final Boolean f11444b;

    /* JADX INFO: renamed from: c */
    public final Integer f11445c;

    /* JADX INFO: renamed from: d */
    public final Integer f11446d;

    /* JADX INFO: renamed from: e */
    public final pm1 f11447e;

    /* JADX INFO: renamed from: f */
    public final fk0 f11448f;

    public ux0(Map map, boolean z, int i, int i2) {
        long j;
        boolean z2;
        pm1 pm1Var;
        fk0 fk0Var;
        this.f11443a = AbstractC1337qm.m5507B("timeout", map);
        this.f11444b = AbstractC1337qm.m5557t("waitForReady", map);
        Integer numM5562y = AbstractC1337qm.m5562y("maxResponseMessageBytes", map);
        this.f11445c = numM5562y;
        if (numM5562y != null) {
            p32.m5179m(numM5562y.intValue() >= 0, "maxInboundMessageSize %s exceeds bounds", numM5562y);
        }
        Integer numM5562y2 = AbstractC1337qm.m5562y("maxRequestMessageBytes", map);
        this.f11446d = numM5562y2;
        if (numM5562y2 != null) {
            p32.m5179m(numM5562y2.intValue() >= 0, "maxOutboundMessageSize %s exceeds bounds", numM5562y2);
        }
        Map mapM5563z = z ? AbstractC1337qm.m5563z("retryPolicy", map) : null;
        if (mapM5563z == null) {
            j = 0;
            pm1Var = null;
            z2 = true;
        } else {
            Integer numM5562y3 = AbstractC1337qm.m5562y("maxAttempts", mapM5563z);
            p32.m5188s(numM5562y3, "maxAttempts cannot be empty");
            int iIntValue = numM5562y3.intValue();
            p32.m5171i("maxAttempts must be greater than 1: %s", iIntValue, iIntValue >= 2);
            int iMin = Math.min(iIntValue, i);
            Long lM5507B = AbstractC1337qm.m5507B("initialBackoff", mapM5563z);
            p32.m5188s(lM5507B, "initialBackoff cannot be empty");
            long jLongValue = lM5507B.longValue();
            p32.m5173j("initialBackoffNanos must be greater than 0: %s", jLongValue, jLongValue > 0);
            Long lM5507B2 = AbstractC1337qm.m5507B("maxBackoff", mapM5563z);
            p32.m5188s(lM5507B2, "maxBackoff cannot be empty");
            long jLongValue2 = lM5507B2.longValue();
            j = 0;
            z2 = true;
            p32.m5173j("maxBackoff must be greater than 0: %s", jLongValue2, jLongValue2 > 0);
            Double dM5561x = AbstractC1337qm.m5561x("backoffMultiplier", mapM5563z);
            p32.m5188s(dM5561x, "backoffMultiplier cannot be empty");
            double dDoubleValue = dM5561x.doubleValue();
            p32.m5179m(dDoubleValue > 0.0d, "backoffMultiplier must be greater than 0: %s", dM5561x);
            Long lM5507B3 = AbstractC1337qm.m5507B("perAttemptRecvTimeout", mapM5563z);
            p32.m5179m(lM5507B3 == null || lM5507B3.longValue() >= 0, "perAttemptRecvTimeout cannot be negative: %s", lM5507B3);
            Set setM3283s = hr1.m3283s("retryableStatusCodes", mapM5563z);
            ua0.m6448f0(setM3283s != null, "%s is required in retry policy", "retryableStatusCodes");
            ua0.m6448f0(!setM3283s.contains(mv1.OK), "%s must not contain OK", "retryableStatusCodes");
            p32.m5177l((lM5507B3 == null && setM3283s.isEmpty()) ? false : true, "retryableStatusCodes cannot be empty without perAttemptRecvTimeout");
            pm1Var = new pm1(iMin, jLongValue, jLongValue2, dDoubleValue, lM5507B3, setM3283s);
        }
        this.f11447e = pm1Var;
        Map mapM5563z2 = z ? AbstractC1337qm.m5563z("hedgingPolicy", map) : null;
        if (mapM5563z2 == null) {
            fk0Var = null;
        } else {
            Integer numM5562y4 = AbstractC1337qm.m5562y("maxAttempts", mapM5563z2);
            p32.m5188s(numM5562y4, "maxAttempts cannot be empty");
            int iIntValue2 = numM5562y4.intValue();
            p32.m5171i("maxAttempts must be greater than 1: %s", iIntValue2, iIntValue2 >= 2 ? z2 : false);
            int iMin2 = Math.min(iIntValue2, i2);
            Long lM5507B4 = AbstractC1337qm.m5507B("hedgingDelay", mapM5563z2);
            p32.m5188s(lM5507B4, "hedgingDelay cannot be empty");
            long jLongValue3 = lM5507B4.longValue();
            p32.m5173j("hedgingDelay must not be negative: %s", jLongValue3, jLongValue3 >= j ? z2 : false);
            Set setM3283s2 = hr1.m3283s("nonFatalStatusCodes", mapM5563z2);
            if (setM3283s2 == null) {
                setM3283s2 = Collections.unmodifiableSet(EnumSet.noneOf(mv1.class));
            } else {
                ua0.m6448f0(!setM3283s2.contains(mv1.OK), "%s must not contain OK", "nonFatalStatusCodes");
            }
            fk0Var = new fk0(iMin2, jLongValue3, setM3283s2);
        }
        this.f11448f = fk0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ux0)) {
            return false;
        }
        ux0 ux0Var = (ux0) obj;
        return hr1.m3275k(this.f11443a, ux0Var.f11443a) && hr1.m3275k(this.f11444b, ux0Var.f11444b) && hr1.m3275k(this.f11445c, ux0Var.f11445c) && hr1.m3275k(this.f11446d, ux0Var.f11446d) && hr1.m3275k(this.f11447e, ux0Var.f11447e) && hr1.m3275k(this.f11448f, ux0Var.f11448f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11443a, this.f11444b, this.f11445c, this.f11446d, this.f11447e, this.f11448f});
    }

    public final String toString() {
        C1679zv c1679zvM5176k0 = p32.m5176k0(this);
        c1679zvM5176k0.m7359a(this.f11443a, "timeoutNanos");
        c1679zvM5176k0.m7359a(this.f11444b, "waitForReady");
        c1679zvM5176k0.m7359a(this.f11445c, "maxInboundMessageSize");
        c1679zvM5176k0.m7359a(this.f11446d, "maxOutboundMessageSize");
        c1679zvM5176k0.m7359a(this.f11447e, "retryPolicy");
        c1679zvM5176k0.m7359a(this.f11448f, "hedgingPolicy");
        return c1679zvM5176k0.toString();
    }
}
