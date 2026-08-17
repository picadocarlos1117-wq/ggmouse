package com.example.ssmousepro.analytics;

import android.content.Context;
import android.os.Bundle;
import com.example.ssmousepro.analytics.AppAnalytics;
import com.google.firebase.analytics.FirebaseAnalytics;
import p000.C1171o6;
import p000.C1284p6;
import p000.og0;
import p000.z32;
import p000.zv1;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class AppAnalytics {
    public static final AppAnalytics INSTANCE = new AppAnalytics();
    private static volatile FirebaseAnalytics analytics;

    private AppAnalytics() {
    }

    private final void logEvent(String str, og0 og0Var) {
        FirebaseAnalytics firebaseAnalytics = analytics;
        if (firebaseAnalytics == null) {
            return;
        }
        Bundle bundle = new Bundle();
        og0Var.invoke(bundle);
        firebaseAnalytics.logEvent(str, bundle);
    }

    public static /* synthetic */ void logEvent$default(AppAnalytics appAnalytics, String str, og0 og0Var, int i, Object obj) {
        if ((i & 2) != 0) {
            og0Var = new C1284p6(0);
        }
        appAnalytics.logEvent(str, og0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 logEvent$lambda$0(Bundle bundle) {
        bundle.getClass();
        return z32.f13265a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 rewardedCooldownBlocked$lambda$2(int i, Bundle bundle) {
        bundle.getClass();
        bundle.putInt("remaining_sec", i);
        return z32.f13265a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 rewardedEarned$lambda$3(String str, long j, boolean z, Bundle bundle) {
        bundle.getClass();
        bundle.putString("prize_id", str);
        bundle.putLong("grant_ms", j);
        bundle.putInt("pity_bonus", z ? 1 : 0);
        return z32.f13265a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 rewardedError$lambda$4(String str, Bundle bundle) {
        bundle.getClass();
        bundle.putString("message", zv1.m7382V0(100, str));
        return z32.f13265a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 rewardedStatus$lambda$1(int i, int i2, boolean z, Bundle bundle) {
        bundle.getClass();
        bundle.putInt("videos_remaining", i);
        bundle.putInt("pity", i2);
        bundle.putInt("can_watch", z ? 1 : 0);
        return z32.f13265a;
    }

    public final void init(Context context) {
        context.getClass();
        if (analytics != null) {
            return;
        }
        analytics = FirebaseAnalytics.getInstance(context.getApplicationContext());
    }

    public final void rewardedCooldownBlocked(final int i) {
        logEvent("rewarded_cooldown_block", new og0() { // from class: r6
            @Override // p000.og0
            public final Object invoke(Object obj) {
                return AppAnalytics.rewardedCooldownBlocked$lambda$2(i, (Bundle) obj);
            }
        });
    }

    public final void rewardedDismissedIncomplete() {
        logEvent$default(this, "rewarded_ad_incomplete", null, 2, null);
    }

    public final void rewardedEarned(final String str, final long j, final boolean z) {
        str.getClass();
        logEvent("rewarded_ad_earned", new og0() { // from class: n6
            @Override // p000.og0
            public final Object invoke(Object obj) {
                return AppAnalytics.rewardedEarned$lambda$3(str, j, z, (Bundle) obj);
            }
        });
    }

    public final void rewardedError(String str) {
        str.getClass();
        logEvent("rewarded_ad_error", new C1171o6(str, 0));
    }

    public final void rewardedShown() {
        logEvent$default(this, "rewarded_ad_shown", null, 2, null);
    }

    public final void rewardedStatus(final int i, final int i2, final boolean z) {
        logEvent("rewarded_status", new og0() { // from class: q6
            @Override // p000.og0
            public final Object invoke(Object obj) {
                return AppAnalytics.rewardedStatus$lambda$1(i, i2, z, (Bundle) obj);
            }
        });
    }

    public final void setUserId(String str) {
        FirebaseAnalytics firebaseAnalytics = analytics;
        if (firebaseAnalytics != null) {
            firebaseAnalytics.setUserId(str);
        }
    }
}
