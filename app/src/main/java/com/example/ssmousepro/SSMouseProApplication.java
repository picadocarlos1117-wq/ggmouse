package com.example.ssmousepro;

import android.app.Application;
import android.util.Log;
import com.example.ssmousepro.account.AccountRepository;
import com.example.ssmousepro.account.PlayTimeSessionManager;
import com.example.ssmousepro.ads.RewardedAdProgressStore;
import com.example.ssmousepro.analytics.AppAnalytics;
import com.google.firebase.auth.FirebaseUser;
import p000.AbstractC1571wy;
import p000.hp0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes2.dex */
public class SSMouseProApplication extends Application {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "SSMouseProApp";
    private static SSMouseProApplication instance;

    @Override // android.app.Application
    public void onCreate() {
        String uid;
        super.onCreate();
        instance = this;
        try {
            AccountRepository accountRepository = AccountRepository.INSTANCE;
            accountRepository.init(this);
            PlayTimeSessionManager.INSTANCE.init(this);
            RewardedAdProgressStore.INSTANCE.init(this);
            AppAnalytics appAnalytics = AppAnalytics.INSTANCE;
            appAnalytics.init(this);
            FirebaseUser firebaseUserCurrentUser = accountRepository.currentUser();
            if (firebaseUserCurrentUser == null || (uid = firebaseUserCurrentUser.getUid()) == null) {
                return;
            }
            appAnalytics.setUserId(uid);
        } catch (Exception e) {
            Log.e(TAG, "Falha no boot do app", e);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    /* JADX INFO: loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1571wy abstractC1571wy) {
            this();
        }

        public final SSMouseProApplication getInstance() {
            SSMouseProApplication sSMouseProApplication = SSMouseProApplication.instance;
            if (sSMouseProApplication != null) {
                return sSMouseProApplication;
            }
            hp0.m3207Q("instance");
            throw null;
        }

        private Companion() {
        }
    }
}
