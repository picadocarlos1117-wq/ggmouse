package com.example.ssmousepro.ads;

import android.content.Context;
import android.content.SharedPreferences;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import p000.AbstractC1308pu;
import p000.EnumC1530vu;
import p000.InterfaceC0579du;
import p000.InterfaceC1311px;
import p000.ch0;
import p000.f40;
import p000.hp0;
import p000.ny1;
import p000.p32;
import p000.ua0;
import p000.z32;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class RewardedAdProgressStore {
    private static final String KEY_ACCESS_EXPIRES = "access_expires_at";
    private static final String KEY_COOLDOWN_UNTIL = "cooldown_until_ms";
    private static final String KEY_DAY_KEY = "day_key";
    private static final String KEY_PITY = "pity_progress";
    private static final String KEY_UID = "uid";
    private static final String KEY_VIDEOS_TODAY = "videos_today";
    private static final String PREFS = "SSRewardedAdProgress";
    private static volatile SharedPreferences prefs;
    public static final RewardedAdProgressStore INSTANCE = new RewardedAdProgressStore();
    private static final DateTimeFormatter dayFmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private static final ZoneId zoneSp = ZoneId.of("America/Sao_Paulo");

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static final class Snapshot {
        private final long accessExpiresAt;
        private final boolean canWatch;
        private final long cooldownRemainingMs;
        private final String dayKey;
        private final int maxVideosPerDay;
        private final int pityProgress;
        private final int pityTarget;
        private final int videosRemainingToday;
        private final int videosToday;

        public Snapshot(int i, int i2, int i3, int i4, int i5, boolean z, long j, String str, long j2) {
            str.getClass();
            this.videosToday = i;
            this.maxVideosPerDay = i2;
            this.videosRemainingToday = i3;
            this.pityProgress = i4;
            this.pityTarget = i5;
            this.canWatch = z;
            this.cooldownRemainingMs = j;
            this.dayKey = str;
            this.accessExpiresAt = j2;
        }

        public static /* synthetic */ Snapshot copy$default(Snapshot snapshot, int i, int i2, int i3, int i4, int i5, boolean z, long j, String str, long j2, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                i = snapshot.videosToday;
            }
            if ((i6 & 2) != 0) {
                i2 = snapshot.maxVideosPerDay;
            }
            if ((i6 & 4) != 0) {
                i3 = snapshot.videosRemainingToday;
            }
            if ((i6 & 8) != 0) {
                i4 = snapshot.pityProgress;
            }
            if ((i6 & 16) != 0) {
                i5 = snapshot.pityTarget;
            }
            if ((i6 & 32) != 0) {
                z = snapshot.canWatch;
            }
            if ((i6 & 64) != 0) {
                j = snapshot.cooldownRemainingMs;
            }
            if ((i6 & 128) != 0) {
                str = snapshot.dayKey;
            }
            if ((i6 & 256) != 0) {
                j2 = snapshot.accessExpiresAt;
            }
            String str2 = str;
            long j3 = j;
            int i7 = i5;
            boolean z2 = z;
            int i8 = i3;
            int i9 = i4;
            return snapshot.copy(i, i2, i8, i9, i7, z2, j3, str2, j2);
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

        public final int component4() {
            return this.pityProgress;
        }

        public final int component5() {
            return this.pityTarget;
        }

        public final boolean component6() {
            return this.canWatch;
        }

        public final long component7() {
            return this.cooldownRemainingMs;
        }

        public final String component8() {
            return this.dayKey;
        }

        public final long component9() {
            return this.accessExpiresAt;
        }

        public final Snapshot copy(int i, int i2, int i3, int i4, int i5, boolean z, long j, String str, long j2) {
            str.getClass();
            return new Snapshot(i, i2, i3, i4, i5, z, j, str, j2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Snapshot)) {
                return false;
            }
            Snapshot snapshot = (Snapshot) obj;
            return this.videosToday == snapshot.videosToday && this.maxVideosPerDay == snapshot.maxVideosPerDay && this.videosRemainingToday == snapshot.videosRemainingToday && this.pityProgress == snapshot.pityProgress && this.pityTarget == snapshot.pityTarget && this.canWatch == snapshot.canWatch && this.cooldownRemainingMs == snapshot.cooldownRemainingMs && hp0.m3214e(this.dayKey, snapshot.dayKey) && this.accessExpiresAt == snapshot.accessExpiresAt;
        }

        public final long getAccessExpiresAt() {
            return this.accessExpiresAt;
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
            return Long.hashCode(this.accessExpiresAt) + AbstractC1308pu.m5336c((Long.hashCode(this.cooldownRemainingMs) + ((Boolean.hashCode(this.canWatch) + ((Integer.hashCode(this.pityTarget) + ((Integer.hashCode(this.pityProgress) + ((Integer.hashCode(this.videosRemainingToday) + ((Integer.hashCode(this.maxVideosPerDay) + (Integer.hashCode(this.videosToday) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.dayKey);
        }

        public String toString() {
            int i = this.videosToday;
            int i2 = this.maxVideosPerDay;
            int i3 = this.videosRemainingToday;
            int i4 = this.pityProgress;
            int i5 = this.pityTarget;
            boolean z = this.canWatch;
            long j = this.cooldownRemainingMs;
            String str = this.dayKey;
            long j2 = this.accessExpiresAt;
            StringBuilder sbM5345l = AbstractC1308pu.m5345l("Snapshot(videosToday=", i, ", maxVideosPerDay=", i2, ", videosRemainingToday=");
            AbstractC1308pu.m5356w(sbM5345l, i3, ", pityProgress=", i4, ", pityTarget=");
            sbM5345l.append(i5);
            sbM5345l.append(", canWatch=");
            sbM5345l.append(z);
            sbM5345l.append(", cooldownRemainingMs=");
            sbM5345l.append(j);
            sbM5345l.append(", dayKey=");
            sbM5345l.append(str);
            sbM5345l.append(", accessExpiresAt=");
            sbM5345l.append(j2);
            sbM5345l.append(")");
            return sbM5345l.toString();
        }
    }

    /* JADX INFO: renamed from: com.example.ssmousepro.ads.RewardedAdProgressStore$limparAsync$1 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.ads.RewardedAdProgressStore$limparAsync$1", m5373f = "RewardedAdProgressStore.kt", m5374l = {}, m5375m = "invokeSuspend")
    public static final class C02271 extends ny1 implements ch0 {
        int label;

        public C02271(InterfaceC0579du interfaceC0579du) {
            super(2, interfaceC0579du);
        }

        @Override // p000.AbstractC0018ah
        public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
            return new C02271(interfaceC0579du);
        }

        @Override // p000.ch0
        public final Object invoke(CoroutineScope coroutineScope, InterfaceC0579du interfaceC0579du) {
            return ((C02271) create(coroutineScope, interfaceC0579du)).invokeSuspend(z32.f13265a);
        }

        @Override // p000.AbstractC0018ah
        public final Object invokeSuspend(Object obj) {
            SharedPreferences.Editor editorEdit;
            SharedPreferences.Editor editorClear;
            if (this.label != 0) {
                f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ua0.m6440Z(obj);
            SharedPreferences sharedPreferences = RewardedAdProgressStore.prefs;
            if (sharedPreferences != null && (editorEdit = sharedPreferences.edit()) != null && (editorClear = editorEdit.clear()) != null) {
                editorClear.apply();
            }
            return z32.f13265a;
        }
    }

    /* JADX INFO: renamed from: com.example.ssmousepro.ads.RewardedAdProgressStore$salvarStatus$2 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.ads.RewardedAdProgressStore$salvarStatus$2", m5373f = "RewardedAdProgressStore.kt", m5374l = {}, m5375m = "invokeSuspend")
    public static final class C02282 extends ny1 implements ch0 {
        final /* synthetic */ Long $accessExpiresAt;
        final /* synthetic */ long $cooldownRemainingMs;
        final /* synthetic */ String $dayKey;
        final /* synthetic */ int $pityProgress;
        final /* synthetic */ String $uid;
        final /* synthetic */ int $videosToday;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02282(long j, String str, int i, String str2, int i2, Long l, InterfaceC0579du interfaceC0579du) {
            super(2, interfaceC0579du);
            this.$cooldownRemainingMs = j;
            this.$uid = str;
            this.$videosToday = i;
            this.$dayKey = str2;
            this.$pityProgress = i2;
            this.$accessExpiresAt = l;
        }

        @Override // p000.AbstractC0018ah
        public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
            return new C02282(this.$cooldownRemainingMs, this.$uid, this.$videosToday, this.$dayKey, this.$pityProgress, this.$accessExpiresAt, interfaceC0579du);
        }

        @Override // p000.ch0
        public final Object invoke(CoroutineScope coroutineScope, InterfaceC0579du interfaceC0579du) {
            return ((C02282) create(coroutineScope, interfaceC0579du)).invokeSuspend(z32.f13265a);
        }

        @Override // p000.AbstractC0018ah
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ua0.m6440Z(obj);
            SharedPreferences sharedPreferences = RewardedAdProgressStore.prefs;
            z32 z32Var = z32.f13265a;
            if (sharedPreferences == null) {
                return z32Var;
            }
            long jCurrentTimeMillis = 0;
            if (this.$cooldownRemainingMs > 0) {
                jCurrentTimeMillis = this.$cooldownRemainingMs + System.currentTimeMillis();
            }
            SharedPreferences.Editor editorPutLong = sharedPreferences.edit().putString(RewardedAdProgressStore.KEY_UID, this.$uid).putInt(RewardedAdProgressStore.KEY_VIDEOS_TODAY, p32.m5140F(this.$videosToday, 0, 6)).putString(RewardedAdProgressStore.KEY_DAY_KEY, this.$dayKey).putInt(RewardedAdProgressStore.KEY_PITY, p32.m5140F(this.$pityProgress, 0, 24)).putLong(RewardedAdProgressStore.KEY_COOLDOWN_UNTIL, jCurrentTimeMillis);
            Long l = this.$accessExpiresAt;
            if (l != null) {
                editorPutLong.putLong(RewardedAdProgressStore.KEY_ACCESS_EXPIRES, l.longValue());
            }
            editorPutLong.apply();
            return z32Var;
        }
    }

    /* JADX INFO: renamed from: com.example.ssmousepro.ads.RewardedAdProgressStore$salvarStatusAsync$1 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.ads.RewardedAdProgressStore$salvarStatusAsync$1", m5373f = "RewardedAdProgressStore.kt", m5374l = {106}, m5375m = "invokeSuspend")
    public static final class C02291 extends ny1 implements ch0 {
        final /* synthetic */ Long $accessExpiresAt;
        final /* synthetic */ long $cooldownRemainingMs;
        final /* synthetic */ String $dayKey;
        final /* synthetic */ int $pityProgress;
        final /* synthetic */ String $uid;
        final /* synthetic */ int $videosToday;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02291(String str, int i, int i2, String str2, long j, Long l, InterfaceC0579du interfaceC0579du) {
            super(2, interfaceC0579du);
            this.$uid = str;
            this.$videosToday = i;
            this.$pityProgress = i2;
            this.$dayKey = str2;
            this.$cooldownRemainingMs = j;
            this.$accessExpiresAt = l;
        }

        @Override // p000.AbstractC0018ah
        public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
            return new C02291(this.$uid, this.$videosToday, this.$pityProgress, this.$dayKey, this.$cooldownRemainingMs, this.$accessExpiresAt, interfaceC0579du);
        }

        @Override // p000.ch0
        public final Object invoke(CoroutineScope coroutineScope, InterfaceC0579du interfaceC0579du) {
            return ((C02291) create(coroutineScope, interfaceC0579du)).invokeSuspend(z32.f13265a);
        }

        @Override // p000.AbstractC0018ah
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                ua0.m6440Z(obj);
                RewardedAdProgressStore rewardedAdProgressStore = RewardedAdProgressStore.INSTANCE;
                String str = this.$uid;
                int i2 = this.$videosToday;
                int i3 = this.$pityProgress;
                String strDayKeyAgora = this.$dayKey;
                if (strDayKeyAgora == null) {
                    strDayKeyAgora = rewardedAdProgressStore.dayKeyAgora();
                }
                long j = this.$cooldownRemainingMs;
                Long l = this.$accessExpiresAt;
                this.label = 1;
                Object objSalvarStatus = rewardedAdProgressStore.salvarStatus(str, i2, i3, strDayKeyAgora, j, l, this);
                EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
                if (objSalvarStatus == enumC1530vu) {
                    return enumC1530vu;
                }
            } else {
                if (i != 1) {
                    f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ua0.m6440Z(obj);
            }
            return z32.f13265a;
        }
    }

    private RewardedAdProgressStore() {
    }

    public final String dayKeyAgora() {
        String str = ZonedDateTime.now(zoneSp).format(dayFmt);
        str.getClass();
        return str;
    }

    public final void init(Context context) {
        context.getClass();
        if (prefs != null) {
            return;
        }
        prefs = context.getApplicationContext().getSharedPreferences(PREFS, 0);
    }

    public final Snapshot ler(String str) {
        boolean z;
        SharedPreferences sharedPreferences = prefs;
        if (sharedPreferences == null) {
            return new Snapshot(0, 6, 6, 0, 24, true, 0L, dayKeyAgora(), 0L);
        }
        String strDayKeyAgora = dayKeyAgora();
        String string = sharedPreferences.getString(KEY_UID, null);
        int iM5140F = (hp0.m3214e(sharedPreferences.getString(KEY_DAY_KEY, null), strDayKeyAgora) && (str == null || string == null || string.equals(str))) ? p32.m5140F(sharedPreferences.getInt(KEY_VIDEOS_TODAY, 0), 0, 6) : 0;
        int iM5140F2 = p32.m5140F(sharedPreferences.getInt(KEY_PITY, 0), 0, 24);
        long j = sharedPreferences.getLong(KEY_COOLDOWN_UNTIL, 0L) - System.currentTimeMillis();
        long j2 = j < 0 ? 0L : j;
        int i = 6 - iM5140F;
        if (i < 0) {
            i = 0;
            z = false;
        } else {
            z = false;
        }
        if (i > 0 && j2 == 0) {
            z = true;
        }
        return new Snapshot(iM5140F, 6, i, iM5140F2, 24, z, j2, strDayKeyAgora, sharedPreferences.getLong(KEY_ACCESS_EXPIRES, 0L));
    }

    public final void limparAsync() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new C02271(null), 3, null);
    }

    public final Object salvarStatus(String str, int i, int i2, String str2, long j, Long l, InterfaceC0579du interfaceC0579du) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new C02282(j, str, i, str2, i2, l, null), interfaceC0579du);
        return objWithContext == EnumC1530vu.f11768a ? objWithContext : z32.f13265a;
    }

    public final void salvarStatusAsync(String str, int i, int i2, String str2, long j, Long l, CoroutineScope coroutineScope) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope == null ? CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()) : coroutineScope, Dispatchers.getIO(), null, new C02291(str, i, i2, str2, j, l, null), 2, null);
    }
}
