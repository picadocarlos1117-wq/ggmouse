package com.example.ssmousepro.ads;

import com.example.ssmousepro.account.AccountConstants;
import com.example.ssmousepro.account.AccountRepository;
import com.google.android.gms.tasks.Task;
import com.google.firebase.Firebase;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.functions.FirebaseFunctions;
import com.google.firebase.functions.FunctionsKt;
import com.google.firebase.functions.HttpsCallableResult;
import java.util.Iterator;
import java.util.Map;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.tasks.TasksKt;
import p000.AbstractC0616eu;
import p000.AbstractC1308pu;
import p000.AbstractC1377rp;
import p000.EnumC1530vu;
import p000.InterfaceC0579du;
import p000.InterfaceC1311px;
import p000.f40;
import p000.hp0;
import p000.o60;
import p000.ua0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class RewardedAdService {
    private static final String REGION = "southamerica-east1";
    public static final RewardedAdService INSTANCE = new RewardedAdService();
    private static final CoroutineScope ioScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getIO()));

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static final class CreditResult {
        private final long accessExpiresAt;
        private final String dayKey;
        private final long grantMs;
        private final int maxVideosPerDay;
        private final boolean pityBonusGranted;
        private final int pityProgress;
        private final int pityTarget;
        private final String prizeId;
        private final String prizeLabel;
        private final long totalGrantMs;
        private final int videosRemainingToday;
        private final int videosToday;

        public CreditResult(long j, long j2, long j3, String str, String str2, int i, int i2, boolean z, int i3, int i4, int i5, String str3) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            this.accessExpiresAt = j;
            this.grantMs = j2;
            this.totalGrantMs = j3;
            this.prizeId = str;
            this.prizeLabel = str2;
            this.pityProgress = i;
            this.pityTarget = i2;
            this.pityBonusGranted = z;
            this.videosToday = i3;
            this.maxVideosPerDay = i4;
            this.videosRemainingToday = i5;
            this.dayKey = str3;
        }

        public final long component1() {
            return this.accessExpiresAt;
        }

        public final int component10() {
            return this.maxVideosPerDay;
        }

        public final int component11() {
            return this.videosRemainingToday;
        }

        public final String component12() {
            return this.dayKey;
        }

        public final long component2() {
            return this.grantMs;
        }

        public final long component3() {
            return this.totalGrantMs;
        }

        public final String component4() {
            return this.prizeId;
        }

        public final String component5() {
            return this.prizeLabel;
        }

        public final int component6() {
            return this.pityProgress;
        }

        public final int component7() {
            return this.pityTarget;
        }

        public final boolean component8() {
            return this.pityBonusGranted;
        }

        public final int component9() {
            return this.videosToday;
        }

        public final CreditResult copy(long j, long j2, long j3, String str, String str2, int i, int i2, boolean z, int i3, int i4, int i5, String str3) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            return new CreditResult(j, j2, j3, str, str2, i, i2, z, i3, i4, i5, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CreditResult)) {
                return false;
            }
            CreditResult creditResult = (CreditResult) obj;
            return this.accessExpiresAt == creditResult.accessExpiresAt && this.grantMs == creditResult.grantMs && this.totalGrantMs == creditResult.totalGrantMs && hp0.m3214e(this.prizeId, creditResult.prizeId) && hp0.m3214e(this.prizeLabel, creditResult.prizeLabel) && this.pityProgress == creditResult.pityProgress && this.pityTarget == creditResult.pityTarget && this.pityBonusGranted == creditResult.pityBonusGranted && this.videosToday == creditResult.videosToday && this.maxVideosPerDay == creditResult.maxVideosPerDay && this.videosRemainingToday == creditResult.videosRemainingToday && hp0.m3214e(this.dayKey, creditResult.dayKey);
        }

        public final long getAccessExpiresAt() {
            return this.accessExpiresAt;
        }

        public final String getDayKey() {
            return this.dayKey;
        }

        public final long getGrantMs() {
            return this.grantMs;
        }

        public final int getMaxVideosPerDay() {
            return this.maxVideosPerDay;
        }

        public final boolean getPityBonusGranted() {
            return this.pityBonusGranted;
        }

        public final int getPityProgress() {
            return this.pityProgress;
        }

        public final int getPityTarget() {
            return this.pityTarget;
        }

        public final String getPrizeId() {
            return this.prizeId;
        }

        public final String getPrizeLabel() {
            return this.prizeLabel;
        }

        public final long getTotalGrantMs() {
            return this.totalGrantMs;
        }

        public final int getVideosRemainingToday() {
            return this.videosRemainingToday;
        }

        public final int getVideosToday() {
            return this.videosToday;
        }

        public int hashCode() {
            return this.dayKey.hashCode() + ((Integer.hashCode(this.videosRemainingToday) + ((Integer.hashCode(this.maxVideosPerDay) + ((Integer.hashCode(this.videosToday) + ((Boolean.hashCode(this.pityBonusGranted) + ((Integer.hashCode(this.pityTarget) + ((Integer.hashCode(this.pityProgress) + AbstractC1308pu.m5336c(AbstractC1308pu.m5336c((Long.hashCode(this.totalGrantMs) + ((Long.hashCode(this.grantMs) + (Long.hashCode(this.accessExpiresAt) * 31)) * 31)) * 31, 31, this.prizeId), 31, this.prizeLabel)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        }

        public String toString() {
            long j = this.accessExpiresAt;
            long j2 = this.grantMs;
            long j3 = this.totalGrantMs;
            String str = this.prizeId;
            String str2 = this.prizeLabel;
            int i = this.pityProgress;
            int i2 = this.pityTarget;
            boolean z = this.pityBonusGranted;
            int i3 = this.videosToday;
            int i4 = this.maxVideosPerDay;
            int i5 = this.videosRemainingToday;
            String str3 = this.dayKey;
            StringBuilder sb = new StringBuilder("CreditResult(accessExpiresAt=");
            sb.append(j);
            sb.append(", grantMs=");
            sb.append(j2);
            sb.append(", totalGrantMs=");
            sb.append(j3);
            sb.append(", prizeId=");
            sb.append(str);
            sb.append(", prizeLabel=");
            sb.append(str2);
            sb.append(", pityProgress=");
            AbstractC1308pu.m5356w(sb, i, ", pityTarget=", i2, ", pityBonusGranted=");
            sb.append(z);
            sb.append(", videosToday=");
            sb.append(i3);
            sb.append(", maxVideosPerDay=");
            AbstractC1308pu.m5356w(sb, i4, ", videosRemainingToday=", i5, ", dayKey=");
            return AbstractC1308pu.m5342i(sb, str3, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static final class Status {
        private final boolean canWatch;
        private final long cooldownRemainingMs;
        private final String dayKey;
        private final int maxVideosPerDay;
        private final int pityProgress;
        private final int pityTarget;
        private final int videosRemainingToday;
        private final int videosToday;

        public Status(int i, int i2, int i3, boolean z, long j, int i4, int i5, String str) {
            str.getClass();
            this.videosToday = i;
            this.maxVideosPerDay = i2;
            this.videosRemainingToday = i3;
            this.canWatch = z;
            this.cooldownRemainingMs = j;
            this.pityProgress = i4;
            this.pityTarget = i5;
            this.dayKey = str;
        }

        public static /* synthetic */ Status copy$default(Status status, int i, int i2, int i3, boolean z, long j, int i4, int i5, String str, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                i = status.videosToday;
            }
            if ((i6 & 2) != 0) {
                i2 = status.maxVideosPerDay;
            }
            if ((i6 & 4) != 0) {
                i3 = status.videosRemainingToday;
            }
            if ((i6 & 8) != 0) {
                z = status.canWatch;
            }
            if ((i6 & 16) != 0) {
                j = status.cooldownRemainingMs;
            }
            if ((i6 & 32) != 0) {
                i4 = status.pityProgress;
            }
            if ((i6 & 64) != 0) {
                i5 = status.pityTarget;
            }
            if ((i6 & 128) != 0) {
                str = status.dayKey;
            }
            String str2 = str;
            int i7 = i4;
            long j2 = j;
            int i8 = i3;
            boolean z2 = z;
            return status.copy(i, i2, i8, z2, j2, i7, i5, str2);
        }

        public final int component1() {
            return this.videosToday;
        }

        public final int component2() {
            return this.maxVideosPerDay;
        }

        public final int component3() {
            return this.videosRemainingToday;
        }

        public final boolean component4() {
            return this.canWatch;
        }

        public final long component5() {
            return this.cooldownRemainingMs;
        }

        public final int component6() {
            return this.pityProgress;
        }

        public final int component7() {
            return this.pityTarget;
        }

        public final String component8() {
            return this.dayKey;
        }

        public final Status copy(int i, int i2, int i3, boolean z, long j, int i4, int i5, String str) {
            str.getClass();
            return new Status(i, i2, i3, z, j, i4, i5, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Status)) {
                return false;
            }
            Status status = (Status) obj;
            return this.videosToday == status.videosToday && this.maxVideosPerDay == status.maxVideosPerDay && this.videosRemainingToday == status.videosRemainingToday && this.canWatch == status.canWatch && this.cooldownRemainingMs == status.cooldownRemainingMs && this.pityProgress == status.pityProgress && this.pityTarget == status.pityTarget && hp0.m3214e(this.dayKey, status.dayKey);
        }

        public final boolean getCanWatch() {
            return this.canWatch;
        }

        public final long getCooldownRemainingMs() {
            return this.cooldownRemainingMs;
        }

        public final String getDayKey() {
            return this.dayKey;
        }

        public final int getMaxVideosPerDay() {
            return this.maxVideosPerDay;
        }

        public final int getPityProgress() {
            return this.pityProgress;
        }

        public final int getPityTarget() {
            return this.pityTarget;
        }

        public final int getVideosRemainingToday() {
            return this.videosRemainingToday;
        }

        public final int getVideosToday() {
            return this.videosToday;
        }

        public int hashCode() {
            return this.dayKey.hashCode() + ((Integer.hashCode(this.pityTarget) + ((Integer.hashCode(this.pityProgress) + ((Long.hashCode(this.cooldownRemainingMs) + ((Boolean.hashCode(this.canWatch) + ((Integer.hashCode(this.videosRemainingToday) + ((Integer.hashCode(this.maxVideosPerDay) + (Integer.hashCode(this.videosToday) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        }

        public String toString() {
            int i = this.videosToday;
            int i2 = this.maxVideosPerDay;
            int i3 = this.videosRemainingToday;
            boolean z = this.canWatch;
            long j = this.cooldownRemainingMs;
            int i4 = this.pityProgress;
            int i5 = this.pityTarget;
            String str = this.dayKey;
            StringBuilder sbM5345l = AbstractC1308pu.m5345l("Status(videosToday=", i, ", maxVideosPerDay=", i2, ", videosRemainingToday=");
            sbM5345l.append(i3);
            sbM5345l.append(", canWatch=");
            sbM5345l.append(z);
            sbM5345l.append(", cooldownRemainingMs=");
            sbM5345l.append(j);
            sbM5345l.append(", pityProgress=");
            sbM5345l.append(i4);
            sbM5345l.append(", pityTarget=");
            sbM5345l.append(i5);
            sbM5345l.append(", dayKey=");
            sbM5345l.append(str);
            sbM5345l.append(")");
            return sbM5345l.toString();
        }
    }

    /* JADX INFO: renamed from: com.example.ssmousepro.ads.RewardedAdService$consultarStatus$1 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.ads.RewardedAdService", m5373f = "RewardedAdService.kt", m5374l = {52}, m5375m = "consultarStatus")
    public static final class C02301 extends AbstractC0616eu {
        int label;
        /* synthetic */ Object result;

        public C02301(InterfaceC0579du interfaceC0579du) {
            super(interfaceC0579du);
        }

        @Override // p000.AbstractC0018ah
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RewardedAdService.this.consultarStatus(this);
        }
    }

    /* JADX INFO: renamed from: com.example.ssmousepro.ads.RewardedAdService$creditarVideo$1 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.ads.RewardedAdService", m5373f = "RewardedAdService.kt", m5374l = {97}, m5375m = "creditarVideo")
    public static final class C02311 extends AbstractC0616eu {
        int label;
        /* synthetic */ Object result;

        public C02311(InterfaceC0579du interfaceC0579du) {
            super(interfaceC0579du);
        }

        @Override // p000.AbstractC0018ah
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RewardedAdService.this.creditarVideo(this);
        }
    }

    private RewardedAdService() {
    }

    private final String formatGrantLabel(long j) {
        Object next;
        StringBuilder sb;
        String str;
        Iterator<T> it = RewardedAdConstants.INSTANCE.getPRIZE_TIERS().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((RewardedAdConstants.PrizeTier) next).getGrantMs() != j);
        RewardedAdConstants.PrizeTier prizeTier = (RewardedAdConstants.PrizeTier) next;
        if (prizeTier != null) {
            return prizeTier.getLabel();
        }
        long j2 = j / 3600000;
        if (j2 >= 1) {
            sb = new StringBuilder();
            sb.append(j2);
            str = "h";
        } else {
            sb = new StringBuilder();
            sb.append(j / 60000);
            str = " min";
        }
        sb.append(str);
        return sb.toString();
    }

    private final FirebaseFunctions getFunctions() {
        return FunctionsKt.functions(Firebase.INSTANCE, REGION);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:92:0x013a  */
    public final Object consultarStatus(InterfaceC0579du interfaceC0579du) {
        C02301 c02301;
        RewardedAdService rewardedAdService;
        int iIntValue;
        boolean z;
        if (interfaceC0579du instanceof C02301) {
            c02301 = (C02301) interfaceC0579du;
            int i = c02301.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c02301.label = i - Integer.MIN_VALUE;
                rewardedAdService = this;
            } else {
                rewardedAdService = this;
                c02301 = rewardedAdService.new C02301(interfaceC0579du);
            }
        } else {
            rewardedAdService = this;
            c02301 = rewardedAdService.new C02301(interfaceC0579du);
        }
        Object objAwait = c02301.result;
        int i2 = c02301.label;
        boolean zBooleanValue = true;
        if (i2 == 0) {
            ua0.m6440Z(objAwait);
            Task<HttpsCallableResult> taskCall = rewardedAdService.getFunctions().getHttpsCallable("getRewardedAdStatus").call(o60.f7669a);
            c02301.label = 1;
            objAwait = TasksKt.await(taskCall, c02301);
            EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
            if (objAwait == enumC1530vu) {
                return enumC1530vu;
            }
        } else {
            if (i2 != 1) {
                f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ua0.m6440Z(objAwait);
        }
        Object data = ((HttpsCallableResult) objAwait).getData();
        Map map = data instanceof Map ? (Map) data : null;
        if (map == null) {
            f40.m2719o("Resposta inválida do servidor.");
            return null;
        }
        Object obj = map.get("videosToday");
        Number number = obj instanceof Number ? (Number) obj : null;
        int iIntValue2 = number != null ? number.intValue() : 0;
        Object obj2 = map.get("maxVideosPerDay");
        Number number2 = obj2 instanceof Number ? (Number) obj2 : null;
        int iIntValue3 = number2 != null ? number2.intValue() : 6;
        Object obj3 = map.get("videosRemainingToday");
        Number number3 = obj3 instanceof Number ? (Number) obj3 : null;
        if (number3 != null) {
            iIntValue = number3.intValue();
        } else {
            iIntValue = iIntValue3 - iIntValue2;
            if (iIntValue < 0) {
                iIntValue = 0;
            }
        }
        int i3 = iIntValue;
        Object obj4 = map.get("pityProgress");
        Number number4 = obj4 instanceof Number ? (Number) obj4 : null;
        int iIntValue4 = number4 != null ? number4.intValue() : 0;
        Object obj5 = map.get("pityTarget");
        Number number5 = obj5 instanceof Number ? (Number) obj5 : null;
        int iIntValue5 = number5 != null ? number5.intValue() : 24;
        Object obj6 = map.get("cooldownRemainingMs");
        Number number6 = obj6 instanceof Number ? (Number) obj6 : null;
        long jLongValue = number6 != null ? number6.longValue() : 0L;
        Object obj7 = map.get("dayKey");
        String strDayKeyAgora = obj7 instanceof String ? (String) obj7 : null;
        if (strDayKeyAgora == null) {
            strDayKeyAgora = RewardedAdProgressStore.INSTANCE.dayKeyAgora();
        }
        Object obj8 = map.get("canWatch");
        Boolean bool = obj8 instanceof Boolean ? (Boolean) obj8 : null;
        if (bool == null) {
            if (i3 <= 0 || jLongValue != 0) {
                z = false;
            }
            Status status = new Status(iIntValue2, iIntValue3, i3, z, jLongValue, iIntValue4, iIntValue5, strDayKeyAgora);
            RewardedAdProgressStore rewardedAdProgressStore = RewardedAdProgressStore.INSTANCE;
            FirebaseUser firebaseUserCurrentUser = AccountRepository.INSTANCE.currentUser();
            rewardedAdProgressStore.salvarStatusAsync(firebaseUserCurrentUser != null ? firebaseUserCurrentUser.getUid() : null, status.getVideosToday(), status.getPityProgress(), status.getDayKey(), (64 & 16) != 0 ? 0L : status.getCooldownRemainingMs(), (64 & 32) != 0 ? null : null, (64 & 64) != 0 ? null : ioScope);
            return status;
        }
        zBooleanValue = bool.booleanValue();
        z = zBooleanValue;
        Status status2 = new Status(iIntValue2, iIntValue3, i3, z, jLongValue, iIntValue4, iIntValue5, strDayKeyAgora);
        RewardedAdProgressStore rewardedAdProgressStore2 = RewardedAdProgressStore.INSTANCE;
        FirebaseUser firebaseUserCurrentUser2 = AccountRepository.INSTANCE.currentUser();
        rewardedAdProgressStore2.salvarStatusAsync(firebaseUserCurrentUser2 != null ? firebaseUserCurrentUser2.getUid() : null, status2.getVideosToday(), status2.getPityProgress(), status2.getDayKey(), (64 & 16) != 0 ? 0L : status2.getCooldownRemainingMs(), (64 & 32) != 0 ? null : null, (64 & 64) != 0 ? null : ioScope);
        return status2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object creditarVideo(InterfaceC0579du interfaceC0579du) {
        C02311 c02311;
        long jLongValue;
        int iIntValue;
        if (interfaceC0579du instanceof C02311) {
            c02311 = (C02311) interfaceC0579du;
            int i = c02311.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c02311.label = i - Integer.MIN_VALUE;
            } else {
                c02311 = new C02311(interfaceC0579du);
            }
        } else {
            c02311 = new C02311(interfaceC0579du);
        }
        Object objAwait = c02311.result;
        int i2 = c02311.label;
        if (i2 == 0) {
            ua0.m6440Z(objAwait);
            Task<HttpsCallableResult> taskCall = getFunctions().getHttpsCallable("creditRewardedAd").call(o60.f7669a);
            c02311.label = 1;
            objAwait = TasksKt.await(taskCall, c02311);
            EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
            if (objAwait == enumC1530vu) {
                return enumC1530vu;
            }
        } else {
            if (i2 != 1) {
                f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ua0.m6440Z(objAwait);
        }
        Object data = ((HttpsCallableResult) objAwait).getData();
        Map map = data instanceof Map ? (Map) data : null;
        if (map == null) {
            f40.m2719o("Resposta inválida do servidor.");
            return null;
        }
        Object obj = map.get(AccountConstants.FIELD_ACCESS_EXPIRES_AT);
        if (obj instanceof Number) {
            jLongValue = ((Number) obj).longValue();
        } else {
            Object obj2 = map.get(AccountConstants.FIELD_BALANCE_MS);
            if (!(obj2 instanceof Number)) {
                f40.m2719o("Vencimento não recebido.");
                return null;
            }
            jLongValue = ((Number) obj2).longValue() + System.currentTimeMillis();
        }
        long j = jLongValue;
        AccountRepository accountRepository = AccountRepository.INSTANCE;
        accountRepository.aplicarAcessoServidor(j);
        Object obj3 = map.get("grantMs");
        Number number = obj3 instanceof Number ? (Number) obj3 : null;
        long jLongValue2 = number != null ? number.longValue() : ((RewardedAdConstants.PrizeTier) AbstractC1377rp.m5870q0(RewardedAdConstants.INSTANCE.getPRIZE_TIERS())).getGrantMs();
        Object obj4 = map.get("prizeLabel");
        String grantLabel = obj4 instanceof String ? (String) obj4 : null;
        if (grantLabel == null) {
            grantLabel = formatGrantLabel(jLongValue2);
        }
        String str = grantLabel;
        Object obj5 = map.get("pityProgress");
        Number number2 = obj5 instanceof Number ? (Number) obj5 : null;
        int iIntValue2 = number2 != null ? number2.intValue() : 0;
        Object obj6 = map.get("videosToday");
        Number number3 = obj6 instanceof Number ? (Number) obj6 : null;
        int iIntValue3 = number3 != null ? number3.intValue() : 0;
        Object obj7 = map.get("maxVideosPerDay");
        Number number4 = obj7 instanceof Number ? (Number) obj7 : null;
        int iIntValue4 = number4 != null ? number4.intValue() : 6;
        Object obj8 = map.get("dayKey");
        String strDayKeyAgora = obj8 instanceof String ? (String) obj8 : null;
        if (strDayKeyAgora == null) {
            strDayKeyAgora = RewardedAdProgressStore.INSTANCE.dayKeyAgora();
        }
        String str2 = strDayKeyAgora;
        Object obj9 = map.get("totalGrantMs");
        Number number5 = obj9 instanceof Number ? (Number) obj9 : null;
        long jLongValue3 = number5 != null ? number5.longValue() : jLongValue2;
        Object obj10 = map.get("prizeId");
        String str3 = obj10 instanceof String ? (String) obj10 : null;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = str3;
        Object obj11 = map.get("pityTarget");
        Number number6 = obj11 instanceof Number ? (Number) obj11 : null;
        int iIntValue5 = number6 != null ? number6.intValue() : 24;
        Object obj12 = map.get("pityBonusGranted");
        Boolean bool = obj12 instanceof Boolean ? (Boolean) obj12 : null;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Object obj13 = map.get("videosRemainingToday");
        Number number7 = obj13 instanceof Number ? (Number) obj13 : null;
        if (number7 != null) {
            iIntValue = number7.intValue();
        } else {
            int i3 = iIntValue4 - iIntValue3;
            iIntValue = i3 >= 0 ? i3 : 0;
        }
        CreditResult creditResult = new CreditResult(j, jLongValue2, jLongValue3, str4, str, iIntValue2, iIntValue5, zBooleanValue, iIntValue3, iIntValue4, iIntValue, str2);
        RewardedAdProgressStore rewardedAdProgressStore = RewardedAdProgressStore.INSTANCE;
        FirebaseUser firebaseUserCurrentUser = accountRepository.currentUser();
        rewardedAdProgressStore.salvarStatusAsync(firebaseUserCurrentUser != null ? firebaseUserCurrentUser.getUid() : null, creditResult.getVideosToday(), creditResult.getPityProgress(), creditResult.getDayKey(), (64 & 16) != 0 ? 0L : 0L, (64 & 32) != 0 ? null : new Long(creditResult.getAccessExpiresAt()), (64 & 64) != 0 ? null : ioScope);
        return creditResult;
    }
}
