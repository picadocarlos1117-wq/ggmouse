package com.example.ssmousepro.billing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.AbstractC1308pu;
import p000.AbstractC1414sp;
import p000.AbstractC1451tp;
import p000.hp0;
import p000.jd0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class BillingProducts {
    private static final List<String> IDS;
    public static final BillingProducts INSTANCE = new BillingProducts();
    private static final long MS_DIA = 86400000;
    private static final long MS_HORA = 3600000;
    public static final String PACKAGE_NAME = "com.sousasantoslogic.sspro";
    private static final List<Plan> PLANOS;

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static final class Plan {
        private final long balanceMs;
        private final String productId;
        private final String subtitulo;
        private final String titulo;

        public Plan(String str, String str2, String str3, long j) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            this.productId = str;
            this.titulo = str2;
            this.subtitulo = str3;
            this.balanceMs = j;
        }

        public static /* synthetic */ Plan copy$default(Plan plan, String str, String str2, String str3, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                str = plan.productId;
            }
            if ((i & 2) != 0) {
                str2 = plan.titulo;
            }
            if ((i & 4) != 0) {
                str3 = plan.subtitulo;
            }
            if ((i & 8) != 0) {
                j = plan.balanceMs;
            }
            String str4 = str3;
            return plan.copy(str, str2, str4, j);
        }

        public final String component1() {
            return this.productId;
        }

        public final String component2() {
            return this.titulo;
        }

        public final String component3() {
            return this.subtitulo;
        }

        public final long component4() {
            return this.balanceMs;
        }

        public final Plan copy(String str, String str2, String str3, long j) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            return new Plan(str, str2, str3, j);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Plan)) {
                return false;
            }
            Plan plan = (Plan) obj;
            return hp0.m3214e(this.productId, plan.productId) && hp0.m3214e(this.titulo, plan.titulo) && hp0.m3214e(this.subtitulo, plan.subtitulo) && this.balanceMs == plan.balanceMs;
        }

        public final long getBalanceMs() {
            return this.balanceMs;
        }

        public final String getProductId() {
            return this.productId;
        }

        public final String getSubtitulo() {
            return this.subtitulo;
        }

        public final String getTitulo() {
            return this.titulo;
        }

        public int hashCode() {
            return Long.hashCode(this.balanceMs) + AbstractC1308pu.m5336c(AbstractC1308pu.m5336c(this.productId.hashCode() * 31, 31, this.titulo), 31, this.subtitulo);
        }

        public String toString() {
            String str = this.productId;
            String str2 = this.titulo;
            String str3 = this.subtitulo;
            long j = this.balanceMs;
            StringBuilder sbM3618p = jd0.m3618p("Plan(productId=", str, ", titulo=", str2, ", subtitulo=");
            sbM3618p.append(str3);
            sbM3618p.append(", balanceMs=");
            sbM3618p.append(j);
            sbM3618p.append(")");
            return sbM3618p.toString();
        }
    }

    static {
        List<Plan> listM6124n0 = AbstractC1414sp.m6124n0(new Plan("tempo_7d", "Semana", "7 dias de acesso", 604800000L), new Plan("tempo_30d", "Mês", "30 dias de acesso", 2592000000L), new Plan("tempo_90d", "Trimestre", "90 dias de acesso", 7776000000L), new Plan("tempo_365d", "Ano", "365 dias de acesso", 31536000000L));
        PLANOS = listM6124n0;
        List<Plan> list = listM6124n0;
        ArrayList arrayList = new ArrayList(AbstractC1451tp.m6307o0(list));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Plan) it.next()).getProductId());
        }
        IDS = arrayList;
    }

    private BillingProducts() {
    }

    public final List<String> getIDS() {
        return IDS;
    }

    public final List<Plan> getPLANOS() {
        return PLANOS;
    }

    public final Plan planoPorId(String str) {
        Object next;
        str.getClass();
        Iterator<T> it = PLANOS.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (hp0.m3214e(((Plan) next).getProductId(), str)) {
                return (Plan) next;
            }
        }
        next = null;
        return (Plan) next;
    }
}
