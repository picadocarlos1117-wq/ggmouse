package com.example.ssmousepro.ads;

import com.example.ssmousepro.account.AccountConstants;
import java.util.List;
import p000.AbstractC1308pu;
import p000.AbstractC1414sp;
import p000.hp0;
import p000.jd0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class RewardedAdConstants {
    public static final long COOLDOWN_MS = 60000;
    public static final String CTA_SORTEIO = "Assista para ganhar de 1h a 24h (Prêmio Aleatório)";
    public static final int MAX_VIDEOS_PER_DAY = 6;
    public static final int PITY_TARGET = 24;
    public static final RewardedAdConstants INSTANCE = new RewardedAdConstants();
    public static final long PITY_BONUS_MS = 86400000;
    private static final List<PrizeTier> PRIZE_TIERS = AbstractC1414sp.m6124n0(new PrizeTier("1h", "1h", 3600000, 70), new PrizeTier("2h", "2h", 7200000, 18), new PrizeTier("6h", "6h", 21600000, 8), new PrizeTier("12h", "12h", AccountConstants.TRIAL_DURATION_MS, 3), new PrizeTier("24h", "24h", PITY_BONUS_MS, 1));

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static final class PrizeTier {
        private final long grantMs;

        /* JADX INFO: renamed from: id */
        private final String f1890id;
        private final String label;
        private final int weightPercent;

        public PrizeTier(String str, String str2, long j, int i) {
            str.getClass();
            str2.getClass();
            this.f1890id = str;
            this.label = str2;
            this.grantMs = j;
            this.weightPercent = i;
        }

        public static /* synthetic */ PrizeTier copy$default(PrizeTier prizeTier, String str, String str2, long j, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = prizeTier.f1890id;
            }
            if ((i2 & 2) != 0) {
                str2 = prizeTier.label;
            }
            if ((i2 & 4) != 0) {
                j = prizeTier.grantMs;
            }
            if ((i2 & 8) != 0) {
                i = prizeTier.weightPercent;
            }
            int i3 = i;
            return prizeTier.copy(str, str2, j, i3);
        }

        public final String component1() {
            return this.f1890id;
        }

        public final String component2() {
            return this.label;
        }

        public final long component3() {
            return this.grantMs;
        }

        public final int component4() {
            return this.weightPercent;
        }

        public final PrizeTier copy(String str, String str2, long j, int i) {
            str.getClass();
            str2.getClass();
            return new PrizeTier(str, str2, j, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PrizeTier)) {
                return false;
            }
            PrizeTier prizeTier = (PrizeTier) obj;
            return hp0.m3214e(this.f1890id, prizeTier.f1890id) && hp0.m3214e(this.label, prizeTier.label) && this.grantMs == prizeTier.grantMs && this.weightPercent == prizeTier.weightPercent;
        }

        public final long getGrantMs() {
            return this.grantMs;
        }

        public final String getId() {
            return this.f1890id;
        }

        public final String getLabel() {
            return this.label;
        }

        public final int getWeightPercent() {
            return this.weightPercent;
        }

        public int hashCode() {
            return Integer.hashCode(this.weightPercent) + ((Long.hashCode(this.grantMs) + AbstractC1308pu.m5336c(this.f1890id.hashCode() * 31, 31, this.label)) * 31);
        }

        public String toString() {
            String str = this.f1890id;
            String str2 = this.label;
            long j = this.grantMs;
            int i = this.weightPercent;
            StringBuilder sbM3618p = jd0.m3618p("PrizeTier(id=", str, ", label=", str2, ", grantMs=");
            sbM3618p.append(j);
            sbM3618p.append(", weightPercent=");
            sbM3618p.append(i);
            sbM3618p.append(")");
            return sbM3618p.toString();
        }
    }

    private RewardedAdConstants() {
    }

    public final List<PrizeTier> getPRIZE_TIERS() {
        return PRIZE_TIERS;
    }
}
