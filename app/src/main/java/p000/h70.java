package p000;

import com.example.ssmousepro.LoginActivity;
import com.example.ssmousepro.ads.RewardedAdConstants;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class h70 implements b90 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4464a;

    public /* synthetic */ h70(int i) {
        this.f4464a = i;
    }

    @Override // p000.qh1
    public final Object get() {
        switch (this.f4464a) {
            case 0:
                return new uo1(Executors.newSingleThreadExecutor());
            default:
                ax0 ax0Var = new ax0(17);
                HashMap map = new HashMap();
                Set set = Collections.EMPTY_SET;
                if (set == null) {
                    l41.m4051t("Null flags");
                    return null;
                }
                map.put(cg1.f1791a, new C0637fe(LoginActivity.AUTH_TIMEOUT_MS, RewardedAdConstants.PITY_BONUS_MS, set));
                if (set == null) {
                    l41.m4051t("Null flags");
                    return null;
                }
                map.put(cg1.f1793c, new C0637fe(1000L, RewardedAdConstants.PITY_BONUS_MS, set));
                if (set == null) {
                    l41.m4051t("Null flags");
                    return null;
                }
                Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(op1.f8419b)));
                if (setUnmodifiableSet == null) {
                    l41.m4051t("Null flags");
                    return null;
                }
                map.put(cg1.f1792b, new C0637fe(RewardedAdConstants.PITY_BONUS_MS, RewardedAdConstants.PITY_BONUS_MS, setUnmodifiableSet));
                if (map.keySet().size() >= cg1.values().length) {
                    new HashMap();
                    return new C0600ee(ax0Var, map);
                }
                f40.m2719o("Not all priorities have been configured");
                return null;
        }
    }
}
