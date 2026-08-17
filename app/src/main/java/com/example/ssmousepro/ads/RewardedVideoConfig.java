package com.example.ssmousepro.ads;

import com.example.ssmousepro.account.AccountConstants;
import com.google.firebase.FirebaseApp;
import com.google.firebase.firestore.FirebaseFirestore;
import kotlinx.coroutines.TimeoutKt;
import p000.AbstractC0616eu;
import p000.EnumC1530vu;
import p000.InterfaceC0579du;
import p000.InterfaceC1311px;
import p000.f40;
import p000.tl1;
import p000.ua0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class RewardedVideoConfig {
    private static final String COL_CONFIG = "config";
    public static final String DEFAULT_URL = "https://firebasestorage.googleapis.com/v0/b/ss-keymouse-pro-app.firebasestorage.app/o/75fe26e3b9020f9c2ec2ced763098c07.mp4?alt=media&token=37507a7a-b2ff-414a-8dd7-216f35a240c7";
    private static final String DOC_REWARDED = "rewarded_video";
    private static final String FIELD_URL = "url";
    public static final RewardedVideoConfig INSTANCE = new RewardedVideoConfig();
    private static final long TIMEOUT_MS = 8000;

    /* JADX INFO: renamed from: com.example.ssmousepro.ads.RewardedVideoConfig$resolveUrl$1 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.ads.RewardedVideoConfig", m5373f = "RewardedVideoConfig.kt", m5374l = {29}, m5375m = "resolveUrl")
    public static final class C02331 extends AbstractC0616eu {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C02331(InterfaceC0579du interfaceC0579du) {
            super(interfaceC0579du);
        }

        @Override // p000.AbstractC0018ah
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RewardedVideoConfig.this.resolveUrl(this);
        }
    }

    private RewardedVideoConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FirebaseFirestore getDb() {
        FirebaseFirestore firebaseFirestore = FirebaseFirestore.getInstance(FirebaseApp.getInstance(), AccountConstants.FIRESTORE_DATABASE_ID);
        firebaseFirestore.getClass();
        return firebaseFirestore;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object resolveUrl(InterfaceC0579du interfaceC0579du) {
        C02331 c02331;
        Object tl1Var;
        if (interfaceC0579du instanceof C02331) {
            c02331 = (C02331) interfaceC0579du;
            int i = c02331.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c02331.label = i - Integer.MIN_VALUE;
            } else {
                c02331 = new C02331(interfaceC0579du);
            }
        } else {
            c02331 = new C02331(interfaceC0579du);
        }
        Object objWithTimeout = c02331.result;
        int i2 = c02331.label;
        try {
            if (i2 == 0) {
                ua0.m6440Z(objWithTimeout);
                RewardedVideoConfig$resolveUrl$2$1 rewardedVideoConfig$resolveUrl$2$1 = new RewardedVideoConfig$resolveUrl$2$1(this, null);
                c02331.L$0 = null;
                c02331.I$0 = 0;
                c02331.label = 1;
                objWithTimeout = TimeoutKt.withTimeout(TIMEOUT_MS, rewardedVideoConfig$resolveUrl$2$1, c02331);
                EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
                if (objWithTimeout == enumC1530vu) {
                    return enumC1530vu;
                }
            } else {
                if (i2 != 1) {
                    f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ua0.m6440Z(objWithTimeout);
            }
            tl1Var = (String) objWithTimeout;
        } catch (Throwable th) {
            tl1Var = new tl1(th);
        }
        String str = (String) (tl1Var instanceof tl1 ? null : tl1Var);
        return str == null ? DEFAULT_URL : str;
    }
}
