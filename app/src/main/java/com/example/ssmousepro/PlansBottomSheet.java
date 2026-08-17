package com.example.ssmousepro;

import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.example.ssmousepro.PlansBottomSheet;
import com.example.ssmousepro.account.AccountRepository;
import com.example.ssmousepro.account.BalanceChangeNotifier;
import com.example.ssmousepro.account.TimeBalanceFormatter;
import com.example.ssmousepro.ads.RewardLottery;
import com.example.ssmousepro.ads.RewardedAdConstants;
import com.example.ssmousepro.ads.RewardedAdProgressStore;
import com.example.ssmousepro.ads.RewardedAdService;
import com.example.ssmousepro.ads.RewardedVideoConfig;
import com.example.ssmousepro.ads.RewardedVideoCoordinator;
import com.example.ssmousepro.analytics.AppAnalytics;
import com.example.ssmousepro.billing.BillingManager;
import com.example.ssmousepro.billing.BillingProducts;
import com.example.ssmousepro.injection.LinuxInputConstants;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.auth.FirebaseUser;
import java.util.Arrays;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p000.AbstractActivityC1469u6;
import p000.AbstractC1308pu;
import p000.AbstractC1377rp;
import p000.AbstractDialogC1555wi;
import p000.C1452tq;
import p000.EnumC1530vu;
import p000.InterfaceC0579du;
import p000.InterfaceC1311px;
import p000.RunnableC1430t4;
import p000.RunnableC1467u4;
import p000.ch0;
import p000.f40;
import p000.hp0;
import p000.jd0;
import p000.ny1;
import p000.ob0;
import p000.og0;
import p000.p32;
import p000.rc2;
import p000.tl1;
import p000.ua0;
import p000.ul1;
import p000.z32;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class PlansBottomSheet extends AbstractDialogC1555wi {
    private final AbstractActivityC1469u6 activity;
    private MaterialButton btnAssistirVideo;
    private int cachedMaxDia;
    private int cachedPity;
    private int cachedPityTarget;
    private int cachedRestantes;
    private long cooldownEndsAtMs;
    private final PlansBottomSheet$cooldownTick$1 cooldownTick;
    private LinearLayout listaPlanos;
    private ProgressBar progressPityBar;
    private ProgressBar progressPlanos;
    private ProgressBar progressVideo;
    private TextView txtPityProgresso;
    private TextView txtPlanosErro;
    private TextView txtVideoRewardInfo;
    private TextView txtVideosRestantesHoje;
    private final Handler uiHandler;
    private boolean videoEmAndamento;

    /* JADX INFO: renamed from: com.example.ssmousepro.PlansBottomSheet$atualizarStatusVideo$1 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.PlansBottomSheet$atualizarStatusVideo$1", m5373f = "PlansBottomSheet.kt", m5374l = {245}, m5375m = "invokeSuspend")
    public static final class C01981 extends ny1 implements ch0 {
        int label;

        public C01981(InterfaceC0579du interfaceC0579du) {
            super(2, interfaceC0579du);
        }

        @Override // p000.AbstractC0018ah
        public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
            return PlansBottomSheet.this.new C01981(interfaceC0579du);
        }

        @Override // p000.ch0
        public final Object invoke(CoroutineScope coroutineScope, InterfaceC0579du interfaceC0579du) {
            return ((C01981) create(coroutineScope, interfaceC0579du)).invokeSuspend(z32.f13265a);
        }

        @Override // p000.AbstractC0018ah
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            try {
                if (i == 0) {
                    ua0.m6440Z(obj);
                    RewardedAdService rewardedAdService = RewardedAdService.INSTANCE;
                    this.label = 1;
                    obj = rewardedAdService.consultarStatus(this);
                    EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
                    if (obj == enumC1530vu) {
                        return enumC1530vu;
                    }
                } else {
                    if (i != 1) {
                        f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ua0.m6440Z(obj);
                }
                RewardedAdService.Status status = (RewardedAdService.Status) obj;
                PlansBottomSheet.renderStatus$default(PlansBottomSheet.this, status.getVideosToday(), status.getMaxVideosPerDay(), status.getVideosRemainingToday(), status.getPityProgress(), status.getPityTarget(), status.getCanWatch(), status.getCooldownRemainingMs(), false, 128, null);
            } catch (Exception unused) {
                PlansBottomSheet.this.aplicarSnapshotLocal();
            }
            return z32.f13265a;
        }
    }

    /* JADX INFO: renamed from: com.example.ssmousepro.PlansBottomSheet$carregarEExibirVideo$1 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.PlansBottomSheet$carregarEExibirVideo$1", m5373f = "PlansBottomSheet.kt", m5374l = {312}, m5375m = "invokeSuspend")
    public static final class C01991 extends ny1 implements ch0 {
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        public C01991(InterfaceC0579du interfaceC0579du) {
            super(2, interfaceC0579du);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$3(PlansBottomSheet plansBottomSheet, String str) {
            ProgressBar progressBar = plansBottomSheet.progressVideo;
            if (progressBar == null) {
                hp0.m3207Q("progressVideo");
                throw null;
            }
            progressBar.setVisibility(8);
            AppAnalytics.INSTANCE.rewardedShown();
            RewardedVideoCoordinator.INSTANCE.play(plansBottomSheet.activity, str, new C0242g(plansBottomSheet, 1));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final z32 invokeSuspend$lambda$3$lambda$2(PlansBottomSheet plansBottomSheet, boolean z) {
            if (z) {
                plansBottomSheet.creditarVideoAposAssistir();
            } else {
                plansBottomSheet.videoEmAndamento = false;
                AppAnalytics.INSTANCE.rewardedDismissedIncomplete();
                Toast.makeText(plansBottomSheet.activity, "Assista o vídeo até o fim para participar do sorteio.", 0).show();
                plansBottomSheet.atualizarStatusVideo();
            }
            return z32.f13265a;
        }

        @Override // p000.AbstractC0018ah
        public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
            C01991 c01991 = PlansBottomSheet.this.new C01991(interfaceC0579du);
            c01991.L$0 = obj;
            return c01991;
        }

        @Override // p000.ch0
        public final Object invoke(CoroutineScope coroutineScope, InterfaceC0579du interfaceC0579du) {
            return ((C01991) create(coroutineScope, interfaceC0579du)).invokeSuspend(z32.f13265a);
        }

        @Override // p000.AbstractC0018ah
        public final Object invokeSuspend(Object obj) {
            Object tl1Var;
            int i = this.label;
            try {
                if (i == 0) {
                    ua0.m6440Z(obj);
                    RewardedVideoConfig rewardedVideoConfig = RewardedVideoConfig.INSTANCE;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.I$0 = 0;
                    this.label = 1;
                    obj = rewardedVideoConfig.resolveUrl(this);
                    EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
                    if (obj == enumC1530vu) {
                        return enumC1530vu;
                    }
                } else {
                    if (i != 1) {
                        f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ua0.m6440Z(obj);
                }
                tl1Var = (String) obj;
            } catch (Throwable th) {
                tl1Var = new tl1(th);
            }
            if (ul1.m6508b(tl1Var) != null) {
                tl1Var = RewardedVideoConfig.DEFAULT_URL;
            }
            final String str = (String) tl1Var;
            AbstractActivityC1469u6 abstractActivityC1469u6 = PlansBottomSheet.this.activity;
            final PlansBottomSheet plansBottomSheet = PlansBottomSheet.this;
            abstractActivityC1469u6.runOnUiThread(new Runnable() { // from class: com.example.ssmousepro.i
                @Override // java.lang.Runnable
                public final void run() {
                    PlansBottomSheet.C01991.invokeSuspend$lambda$3(plansBottomSheet, str);
                }
            });
            return z32.f13265a;
        }
    }

    /* JADX INFO: renamed from: com.example.ssmousepro.PlansBottomSheet$creditarVideoAposAssistir$1 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.PlansBottomSheet$creditarVideoAposAssistir$1", m5373f = "PlansBottomSheet.kt", m5374l = {338}, m5375m = "invokeSuspend")
    public static final class C02001 extends ny1 implements ch0 {
        int label;

        public C02001(InterfaceC0579du interfaceC0579du) {
            super(2, interfaceC0579du);
        }

        @Override // p000.AbstractC0018ah
        public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
            return PlansBottomSheet.this.new C02001(interfaceC0579du);
        }

        @Override // p000.ch0
        public final Object invoke(CoroutineScope coroutineScope, InterfaceC0579du interfaceC0579du) {
            return ((C02001) create(coroutineScope, interfaceC0579du)).invokeSuspend(z32.f13265a);
        }

        @Override // p000.AbstractC0018ah
        public final Object invokeSuspend(Object obj) {
            Object objCreditarVideo;
            int i = this.label;
            try {
                if (i == 0) {
                    ua0.m6440Z(obj);
                    RewardedAdService rewardedAdService = RewardedAdService.INSTANCE;
                    this.label = 1;
                    objCreditarVideo = rewardedAdService.creditarVideo(this);
                    EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
                    if (objCreditarVideo == enumC1530vu) {
                        return enumC1530vu;
                    }
                } else {
                    if (i != 1) {
                        f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ua0.m6440Z(obj);
                    objCreditarVideo = obj;
                }
                RewardedAdService.CreditResult creditResult = (RewardedAdService.CreditResult) objCreditarVideo;
                AppAnalytics.INSTANCE.rewardedEarned(creditResult.getPrizeId(), creditResult.getGrantMs(), creditResult.getPityBonusGranted());
                BalanceChangeNotifier.INSTANCE.notifyChange();
                Toast.makeText(PlansBottomSheet.this.activity, RewardLottery.INSTANCE.formatarCreditoToast(creditResult.getPrizeLabel(), creditResult.getPityBonusGranted()) + " " + TimeBalanceFormatter.INSTANCE.formatCredito(creditResult.getAccessExpiresAt()), 1).show();
                ProgressBar progressBar = PlansBottomSheet.this.progressVideo;
                if (progressBar == null) {
                    hp0.m3207Q("progressVideo");
                    throw null;
                }
                progressBar.setVisibility(8);
                PlansBottomSheet.this.videoEmAndamento = false;
                PlansBottomSheet.this.cachedRestantes = creditResult.getVideosRemainingToday();
                PlansBottomSheet.this.cachedPity = creditResult.getPityProgress();
                RewardedAdProgressStore rewardedAdProgressStore = RewardedAdProgressStore.INSTANCE;
                FirebaseUser firebaseUserCurrentUser = AccountRepository.INSTANCE.currentUser();
                rewardedAdProgressStore.salvarStatusAsync(firebaseUserCurrentUser != null ? firebaseUserCurrentUser.getUid() : null, creditResult.getVideosToday(), creditResult.getPityProgress(), creditResult.getDayKey(), (64 & 16) != 0 ? 0L : 60000L, (64 & 32) != 0 ? null : new Long(creditResult.getAccessExpiresAt()), (64 & 64) != 0 ? null : null);
                PlansBottomSheet.renderStatus$default(PlansBottomSheet.this, creditResult.getVideosToday(), creditResult.getMaxVideosPerDay(), creditResult.getVideosRemainingToday(), creditResult.getPityProgress(), creditResult.getPityTarget(), false, 60000L, false, 128, null);
                return z32.f13265a;
            } catch (Exception e) {
                PlansBottomSheet.this.videoEmAndamento = false;
                AppAnalytics appAnalytics = AppAnalytics.INSTANCE;
                String message = e.getMessage();
                if (message == null) {
                    message = "credit_fail";
                }
                appAnalytics.rewardedError(message);
                PlansBottomSheet plansBottomSheet = PlansBottomSheet.this;
                String message2 = e.getMessage();
                if (message2 == null) {
                    message2 = "Não foi possível creditar o vídeo.";
                }
                plansBottomSheet.mostrarErro(message2);
                ProgressBar progressBar2 = PlansBottomSheet.this.progressVideo;
                if (progressBar2 == null) {
                    hp0.m3207Q("progressVideo");
                    throw null;
                }
                progressBar2.setVisibility(8);
                PlansBottomSheet.this.atualizarStatusVideo();
            }
        }
    }

    /* JADX INFO: renamed from: com.example.ssmousepro.PlansBottomSheet$iniciarVideoRecompensa$1 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.PlansBottomSheet$iniciarVideoRecompensa$1", m5373f = "PlansBottomSheet.kt", m5374l = {LinuxInputConstants.BTN_MOUSE}, m5375m = "invokeSuspend")
    public static final class C02011 extends ny1 implements ch0 {
        int label;

        public C02011(InterfaceC0579du interfaceC0579du) {
            super(2, interfaceC0579du);
        }

        @Override // p000.AbstractC0018ah
        public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
            return PlansBottomSheet.this.new C02011(interfaceC0579du);
        }

        @Override // p000.ch0
        public final Object invoke(CoroutineScope coroutineScope, InterfaceC0579du interfaceC0579du) {
            return ((C02011) create(coroutineScope, interfaceC0579du)).invokeSuspend(z32.f13265a);
        }

        @Override // p000.AbstractC0018ah
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            z32 z32Var = z32.f13265a;
            try {
                if (i == 0) {
                    ua0.m6440Z(obj);
                    RewardedAdService rewardedAdService = RewardedAdService.INSTANCE;
                    this.label = 1;
                    obj = rewardedAdService.consultarStatus(this);
                    EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
                    if (obj == enumC1530vu) {
                        return enumC1530vu;
                    }
                } else {
                    if (i != 1) {
                        f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ua0.m6440Z(obj);
                }
                RewardedAdService.Status status = (RewardedAdService.Status) obj;
                if (status.getVideosRemainingToday() <= 0) {
                    PlansBottomSheet.this.mostrarErro("Limite diário de vídeos atingido. Volte amanhã.");
                    PlansBottomSheet.this.atualizarStatusVideo();
                    return z32Var;
                }
                if (!status.getCanWatch() && status.getCooldownRemainingMs() > 0) {
                    PlansBottomSheet.this.iniciarContagemCooldown(status.getCooldownRemainingMs());
                    PlansBottomSheet.this.aplicarCooldownNaUi(status.getCooldownRemainingMs());
                    PlansBottomSheet plansBottomSheet = PlansBottomSheet.this;
                    plansBottomSheet.mostrarErro("Aguarde " + plansBottomSheet.formatCooldown(status.getCooldownRemainingMs()) + " para assistir outro vídeo.");
                    return z32Var;
                }
                PlansBottomSheet.this.activity.runOnUiThread(new RunnableC0204a(PlansBottomSheet.this, 7));
                return z32Var;
            } catch (Exception unused) {
                RewardedAdProgressStore rewardedAdProgressStore = RewardedAdProgressStore.INSTANCE;
                FirebaseUser firebaseUserCurrentUser = AccountRepository.INSTANCE.currentUser();
                RewardedAdProgressStore.Snapshot snapshotLer = rewardedAdProgressStore.ler(firebaseUserCurrentUser != null ? firebaseUserCurrentUser.getUid() : null);
                if (snapshotLer.getVideosRemainingToday() <= 0) {
                    PlansBottomSheet.this.mostrarErro("Limite diário de vídeos atingido. Volte amanhã.");
                    PlansBottomSheet.this.aplicarSnapshotLocal();
                    return z32Var;
                }
                if (snapshotLer.getCooldownRemainingMs() > 0) {
                    PlansBottomSheet.this.iniciarContagemCooldown(snapshotLer.getCooldownRemainingMs());
                    PlansBottomSheet.this.aplicarCooldownNaUi(snapshotLer.getCooldownRemainingMs());
                    PlansBottomSheet plansBottomSheet2 = PlansBottomSheet.this;
                    plansBottomSheet2.mostrarErro("Aguarde " + plansBottomSheet2.formatCooldown(snapshotLer.getCooldownRemainingMs()) + " para assistir outro vídeo.");
                    return z32Var;
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.example.ssmousepro.PlansBottomSheet$cooldownTick$1] */
    public PlansBottomSheet(AbstractActivityC1469u6 abstractActivityC1469u6) {
        super(abstractActivityC1469u6);
        abstractActivityC1469u6.getClass();
        this.activity = abstractActivityC1469u6;
        this.uiHandler = new Handler(Looper.getMainLooper());
        this.cachedRestantes = 6;
        this.cachedMaxDia = 6;
        this.cachedPityTarget = 24;
        this.cooldownTick = new Runnable() { // from class: com.example.ssmousepro.PlansBottomSheet$cooldownTick$1
            @Override // java.lang.Runnable
            public void run() {
                if (this.this$0.isShowing()) {
                    long jCurrentTimeMillis = this.this$0.cooldownEndsAtMs - System.currentTimeMillis();
                    if (jCurrentTimeMillis < 0) {
                        jCurrentTimeMillis = 0;
                    }
                    PlansBottomSheet plansBottomSheet = this.this$0;
                    if (jCurrentTimeMillis > 0) {
                        plansBottomSheet.aplicarCooldownNaUi(jCurrentTimeMillis);
                        this.this$0.uiHandler.postDelayed(this, 250L);
                        return;
                    }
                    plansBottomSheet.cooldownEndsAtMs = 0L;
                    if (!this.this$0.videoEmAndamento) {
                        MaterialButton materialButton = this.this$0.btnAssistirVideo;
                        if (materialButton == null) {
                            hp0.m3207Q("btnAssistirVideo");
                            throw null;
                        }
                        materialButton.setEnabled(this.this$0.cachedRestantes > 0);
                        MaterialButton materialButton2 = this.this$0.btnAssistirVideo;
                        if (materialButton2 == null) {
                            hp0.m3207Q("btnAssistirVideo");
                            throw null;
                        }
                        MaterialButton materialButton3 = this.this$0.btnAssistirVideo;
                        if (materialButton3 == null) {
                            hp0.m3207Q("btnAssistirVideo");
                            throw null;
                        }
                        materialButton2.setAlpha(materialButton3.isEnabled() ? 1.0f : 0.45f);
                        MaterialButton materialButton4 = this.this$0.btnAssistirVideo;
                        if (materialButton4 == null) {
                            hp0.m3207Q("btnAssistirVideo");
                            throw null;
                        }
                        materialButton4.setText(RewardedAdConstants.CTA_SORTEIO);
                        TextView textView = this.this$0.txtVideoRewardInfo;
                        if (textView == null) {
                            hp0.m3207Q("txtVideoRewardInfo");
                            throw null;
                        }
                        textView.setText(RewardedAdConstants.CTA_SORTEIO);
                    }
                    this.this$0.atualizarStatusVideo();
                }
            }
        };
        setContentView(C0203R.layout.bottom_sheet_plans);
        getBehavior().m1656H(3);
        final int i = 1;
        getBehavior().f1964J = true;
        View viewFindViewById = findViewById(C0203R.id.listaPlanos);
        viewFindViewById.getClass();
        this.listaPlanos = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(C0203R.id.progressPlanos);
        viewFindViewById2.getClass();
        this.progressPlanos = (ProgressBar) viewFindViewById2;
        View viewFindViewById3 = findViewById(C0203R.id.txtPlanosErro);
        viewFindViewById3.getClass();
        this.txtPlanosErro = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(C0203R.id.btnAssistirVideo);
        viewFindViewById4.getClass();
        this.btnAssistirVideo = (MaterialButton) viewFindViewById4;
        View viewFindViewById5 = findViewById(C0203R.id.txtVideoRewardInfo);
        viewFindViewById5.getClass();
        this.txtVideoRewardInfo = (TextView) viewFindViewById5;
        View viewFindViewById6 = findViewById(C0203R.id.txtVideosRestantesHoje);
        viewFindViewById6.getClass();
        this.txtVideosRestantesHoje = (TextView) viewFindViewById6;
        View viewFindViewById7 = findViewById(C0203R.id.txtPityProgresso);
        viewFindViewById7.getClass();
        this.txtPityProgresso = (TextView) viewFindViewById7;
        View viewFindViewById8 = findViewById(C0203R.id.progressPityBar);
        viewFindViewById8.getClass();
        this.progressPityBar = (ProgressBar) viewFindViewById8;
        View viewFindViewById9 = findViewById(C0203R.id.progressVideo);
        viewFindViewById9.getClass();
        this.progressVideo = (ProgressBar) viewFindViewById9;
        MaterialButton materialButton = (MaterialButton) findViewById(C0203R.id.btnFecharPlanos);
        final int i2 = 0;
        if (materialButton != null) {
            materialButton.setOnClickListener(new View.OnClickListener(this) { // from class: hd1

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ PlansBottomSheet f4552b;

                {
                    this.f4552b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i3 = i2;
                    PlansBottomSheet plansBottomSheet = this.f4552b;
                    switch (i3) {
                        case 0:
                            plansBottomSheet.dismiss();
                            break;
                        default:
                            plansBottomSheet.iniciarVideoRecompensa();
                            break;
                    }
                }
            });
        }
        RewardedAdProgressStore.INSTANCE.init(abstractActivityC1469u6);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(android.R.color.transparent);
        }
        View viewFindViewById10 = findViewById(com.sousasantoslogic.sspro.R.id.design_bottom_sheet);
        if (viewFindViewById10 != null) {
            viewFindViewById10.setBackgroundResource(android.R.color.transparent);
        }
        MaterialButton materialButton2 = this.btnAssistirVideo;
        if (materialButton2 == null) {
            hp0.m3207Q("btnAssistirVideo");
            throw null;
        }
        materialButton2.setText(RewardedAdConstants.CTA_SORTEIO);
        TextView textView = this.txtVideoRewardInfo;
        if (textView == null) {
            hp0.m3207Q("txtVideoRewardInfo");
            throw null;
        }
        textView.setText(RewardedAdConstants.CTA_SORTEIO);
        ProgressBar progressBar = this.progressPityBar;
        if (progressBar == null) {
            hp0.m3207Q("progressPityBar");
            throw null;
        }
        progressBar.setMax(24);
        MaterialButton materialButton3 = this.btnAssistirVideo;
        if (materialButton3 == null) {
            hp0.m3207Q("btnAssistirVideo");
            throw null;
        }
        materialButton3.setOnClickListener(new View.OnClickListener(this) { // from class: hd1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ PlansBottomSheet f4552b;

            {
                this.f4552b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                PlansBottomSheet plansBottomSheet = this.f4552b;
                switch (i3) {
                    case 0:
                        plansBottomSheet.dismiss();
                        break;
                    default:
                        plansBottomSheet.iniciarVideoRecompensa();
                        break;
                }
            }
        });
        aplicarSnapshotLocal();
        atualizarStatusVideo();
        BillingManager billingManager = BillingManager.INSTANCE;
        billingManager.setOnCatalogoCarregado(new C1452tq(this, 2));
        billingManager.setOnCompraFinalizada(new og0(this) { // from class: id1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ PlansBottomSheet f4987b;

            {
                this.f4987b = this;
            }

            @Override // p000.og0
            public final Object invoke(Object obj) {
                int i3 = i2;
                PlansBottomSheet plansBottomSheet = this.f4987b;
                switch (i3) {
                    case 0:
                        return PlansBottomSheet._init_$lambda$7(plansBottomSheet, (ul1) obj);
                    default:
                        return PlansBottomSheet._init_$lambda$9(plansBottomSheet, (String) obj);
                }
            }
        });
        billingManager.setOnErro(new og0(this) { // from class: id1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ PlansBottomSheet f4987b;

            {
                this.f4987b = this;
            }

            @Override // p000.og0
            public final Object invoke(Object obj) {
                int i3 = i;
                PlansBottomSheet plansBottomSheet = this.f4987b;
                switch (i3) {
                    case 0:
                        return PlansBottomSheet._init_$lambda$7(plansBottomSheet, (ul1) obj);
                    default:
                        return PlansBottomSheet._init_$lambda$9(plansBottomSheet, (String) obj);
                }
            }
        });
        if (!billingManager.estaPronto() || billingManager.idsCarregados().isEmpty()) {
            ProgressBar progressBar2 = this.progressPlanos;
            if (progressBar2 == null) {
                hp0.m3207Q("progressPlanos");
                throw null;
            }
            progressBar2.setVisibility(0);
        } else {
            montarPlanos();
        }
        if (billingManager.catalogoCompleto()) {
            return;
        }
        billingManager.recarregarCatalogo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 _init_$lambda$3(PlansBottomSheet plansBottomSheet) {
        plansBottomSheet.activity.runOnUiThread(new RunnableC1430t4(plansBottomSheet, 22));
        return z32.f13265a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 _init_$lambda$7(PlansBottomSheet plansBottomSheet, ul1 ul1Var) {
        plansBottomSheet.activity.runOnUiThread(new RunnableC1467u4(23, ul1Var, plansBottomSheet));
        return z32.f13265a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 _init_$lambda$9(PlansBottomSheet plansBottomSheet, String str) {
        str.getClass();
        plansBottomSheet.activity.runOnUiThread(new RunnableC1467u4(22, plansBottomSheet, str));
        return z32.f13265a;
    }

    public static final /* synthetic */ void access$carregarEExibirVideo(PlansBottomSheet plansBottomSheet) {
        plansBottomSheet.carregarEExibirVideo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void aplicarCooldownNaUi(long j) {
        String cooldown = formatCooldown(j);
        TextView textView = this.txtVideoRewardInfo;
        if (textView == null) {
            hp0.m3207Q("txtVideoRewardInfo");
            throw null;
        }
        textView.setText("Assista para ganhar de 1h a 24h (Prêmio Aleatório)\nPróximo vídeo em " + cooldown);
        if (this.videoEmAndamento) {
            return;
        }
        MaterialButton materialButton = this.btnAssistirVideo;
        if (materialButton == null) {
            hp0.m3207Q("btnAssistirVideo");
            throw null;
        }
        materialButton.setEnabled(false);
        MaterialButton materialButton2 = this.btnAssistirVideo;
        if (materialButton2 == null) {
            hp0.m3207Q("btnAssistirVideo");
            throw null;
        }
        materialButton2.setAlpha(0.45f);
        MaterialButton materialButton3 = this.btnAssistirVideo;
        if (materialButton3 == null) {
            hp0.m3207Q("btnAssistirVideo");
            throw null;
        }
        materialButton3.setText("Aguarde " + cooldown);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void aplicarSnapshotLocal() {
        RewardedAdProgressStore rewardedAdProgressStore = RewardedAdProgressStore.INSTANCE;
        FirebaseUser firebaseUserCurrentUser = AccountRepository.INSTANCE.currentUser();
        RewardedAdProgressStore.Snapshot snapshotLer = rewardedAdProgressStore.ler(firebaseUserCurrentUser != null ? firebaseUserCurrentUser.getUid() : null);
        renderStatus(snapshotLer.getVideosToday(), snapshotLer.getMaxVideosPerDay(), snapshotLer.getVideosRemainingToday(), snapshotLer.getPityProgress(), snapshotLer.getPityTarget(), snapshotLer.getCanWatch(), snapshotLer.getCooldownRemainingMs(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void atualizarStatusVideo() {
        BuildersKt__Builders_commonKt.launch$default(rc2.m5768K(this.activity), null, null, new C01981(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void carregarEExibirVideo() {
        this.videoEmAndamento = true;
        MaterialButton materialButton = this.btnAssistirVideo;
        if (materialButton == null) {
            hp0.m3207Q("btnAssistirVideo");
            throw null;
        }
        materialButton.setEnabled(false);
        ProgressBar progressBar = this.progressVideo;
        if (progressBar == null) {
            hp0.m3207Q("progressVideo");
            throw null;
        }
        progressBar.setVisibility(0);
        BuildersKt__Builders_commonKt.launch$default(rc2.m5768K(this.activity), null, null, new C01991(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void creditarVideoAposAssistir() {
        BuildersKt__Builders_commonKt.launch$default(rc2.m5768K(this.activity), null, null, new C02001(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String formatCooldown(long j) {
        int i = (int) ((j + 999) / 1000);
        if (i < 0) {
            i = 0;
        }
        return String.format("%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i / 60), Integer.valueOf(i % 60)}, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void iniciarContagemCooldown(long j) {
        if (j <= 0) {
            this.cooldownEndsAtMs = 0L;
            pararContagemCooldown();
        } else {
            this.cooldownEndsAtMs = System.currentTimeMillis() + j;
            pararContagemCooldown();
            this.uiHandler.post(this.cooldownTick);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void iniciarVideoRecompensa() {
        TextView textView = this.txtPlanosErro;
        if (textView == null) {
            hp0.m3207Q("txtPlanosErro");
            throw null;
        }
        textView.setVisibility(8);
        long jCurrentTimeMillis = this.cooldownEndsAtMs - System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            jCurrentTimeMillis = 0;
        }
        if (jCurrentTimeMillis <= 0) {
            BuildersKt__Builders_commonKt.launch$default(rc2.m5768K(this.activity), null, null, new C02011(null), 3, null);
            return;
        }
        AppAnalytics.INSTANCE.rewardedCooldownBlocked((int) ((999 + jCurrentTimeMillis) / 1000));
        mostrarErro(jd0.m3615m("Aguarde ", formatCooldown(jCurrentTimeMillis), " para assistir outro vídeo."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$7$lambda$6(ul1 ul1Var, PlansBottomSheet plansBottomSheet) {
        Object obj = ul1Var.f11356a;
        if (!(obj instanceof tl1)) {
            long jLongValue = ((Number) obj).longValue();
            BalanceChangeNotifier.INSTANCE.notifyChange();
            Toast.makeText(plansBottomSheet.activity, TimeBalanceFormatter.INSTANCE.formatCredito(jLongValue), 1).show();
            plansBottomSheet.dismiss();
        }
        Throwable thM6508b = ul1.m6508b(obj);
        if (thM6508b == null || (thM6508b instanceof BillingManager.CancelledException)) {
            return;
        }
        String message = thM6508b.getMessage();
        if (message == null) {
            message = "Falha na compra.";
        }
        plansBottomSheet.mostrarErro(message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void montarPlanos() {
        ProgressBar progressBar = this.progressPlanos;
        if (progressBar == null) {
            hp0.m3207Q("progressPlanos");
            throw null;
        }
        progressBar.setVisibility(8);
        LinearLayout linearLayout = this.listaPlanos;
        if (linearLayout == null) {
            hp0.m3207Q("listaPlanos");
            throw null;
        }
        linearLayout.removeAllViews();
        TextView textView = this.txtPlanosErro;
        if (textView == null) {
            hp0.m3207Q("txtPlanosErro");
            throw null;
        }
        textView.setVisibility(8);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        boolean z = false;
        for (BillingProducts.Plan plan : BillingProducts.INSTANCE.getPLANOS()) {
            String strPrecoFormatado = BillingManager.INSTANCE.precoFormatado(plan.getProductId());
            boolean z2 = strPrecoFormatado != null;
            if (z2) {
                z = true;
            }
            boolean zM3214e = hp0.m3214e(plan.getProductId(), "tempo_30d");
            int i = C0203R.layout.item_plano;
            LinearLayout linearLayout2 = this.listaPlanos;
            if (linearLayout2 == null) {
                hp0.m3207Q("listaPlanos");
                throw null;
            }
            View viewInflate = layoutInflaterFrom.inflate(i, (ViewGroup) linearLayout2, false);
            viewInflate.findViewById(C0203R.id.cardPlanoRoot).setBackgroundResource(zM3214e ? C0203R.drawable.bg_shop_plan_card_featured : C0203R.drawable.bg_shop_plan_card);
            TextView textView2 = (TextView) viewInflate.findViewById(C0203R.id.txtPlanoBadge);
            if (zM3214e) {
                textView2.setVisibility(0);
                textView2.setText("Popular");
            } else {
                textView2.setVisibility(4);
            }
            ((TextView) viewInflate.findViewById(C0203R.id.txtPlanoTitulo)).setText(plan.getTitulo());
            ((TextView) viewInflate.findViewById(C0203R.id.txtPlanoSubtitulo)).setText(z2 ? plan.getSubtitulo() : "Em breve na Play");
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(C0203R.id.btnComprarPlano);
            if (z2) {
                materialButton.setText(strPrecoFormatado);
                materialButton.setEnabled(true);
                materialButton.setAlpha(1.0f);
                materialButton.setOnClickListener(new ob0(3, this, plan));
            } else {
                materialButton.setText("Indisponível");
                materialButton.setEnabled(false);
                materialButton.setAlpha(0.45f);
            }
            LinearLayout linearLayout3 = this.listaPlanos;
            if (linearLayout3 == null) {
                hp0.m3207Q("listaPlanos");
                throw null;
            }
            linearLayout3.addView(viewInflate);
        }
        BillingManager billingManager = BillingManager.INSTANCE;
        List<String> listIdsFaltando = billingManager.idsFaltando();
        if (!z) {
            mostrarErro(jd0.m3615m("Nenhum plano ativo na Play Console. Crie produtos únicos (INAPP) com IDs: ", AbstractC1377rp.m5873t0(BillingProducts.INSTANCE.getIDS(), null, null, null, null, 63), "."));
            return;
        }
        if (listIdsFaltando.isEmpty()) {
            return;
        }
        TextView textView3 = this.txtPlanosErro;
        if (textView3 == null) {
            hp0.m3207Q("txtPlanosErro");
            throw null;
        }
        textView3.setTextColor(-997538);
        TextView textView4 = this.txtPlanosErro;
        if (textView4 == null) {
            hp0.m3207Q("txtPlanosErro");
            throw null;
        }
        int size = billingManager.idsCarregados().size();
        int size2 = BillingProducts.INSTANCE.getIDS().size();
        String strM5873t0 = AbstractC1377rp.m5873t0(listIdsFaltando, null, null, null, null, 63);
        StringBuilder sbM5345l = AbstractC1308pu.m5345l("Só ", size, " de ", size2, " planos com preço. Faltam: ");
        sbM5345l.append(strM5873t0);
        sbM5345l.append(".");
        textView4.setText(sbM5345l.toString());
        TextView textView5 = this.txtPlanosErro;
        if (textView5 == null) {
            hp0.m3207Q("txtPlanosErro");
            throw null;
        }
        textView5.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void montarPlanos$lambda$10(PlansBottomSheet plansBottomSheet, BillingProducts.Plan plan, View view) {
        TextView textView = plansBottomSheet.txtPlanosErro;
        if (textView == null) {
            hp0.m3207Q("txtPlanosErro");
            throw null;
        }
        textView.setVisibility(8);
        BillingManager.INSTANCE.iniciarCompra(plansBottomSheet.activity, plan.getProductId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void mostrarErro(String str) {
        TextView textView = this.txtPlanosErro;
        if (textView == null) {
            hp0.m3207Q("txtPlanosErro");
            throw null;
        }
        textView.setTextColor(-30080);
        TextView textView2 = this.txtPlanosErro;
        if (textView2 == null) {
            hp0.m3207Q("txtPlanosErro");
            throw null;
        }
        textView2.setText(str);
        TextView textView3 = this.txtPlanosErro;
        if (textView3 != null) {
            textView3.setVisibility(0);
        } else {
            hp0.m3207Q("txtPlanosErro");
            throw null;
        }
    }

    private final void pararContagemCooldown() {
        this.uiHandler.removeCallbacks(this.cooldownTick);
    }

    private final void renderStatus(int i, int i2, int i3, int i4, int i5, boolean z, long j, boolean z2) {
        boolean z3 = false;
        if (i3 < 0) {
            i3 = 0;
        }
        this.cachedRestantes = i3;
        this.cachedMaxDia = i2;
        this.cachedPity = i4;
        this.cachedPityTarget = i5;
        TextView textView = this.txtVideosRestantesHoje;
        if (textView == null) {
            hp0.m3207Q("txtVideosRestantesHoje");
            throw null;
        }
        textView.setText("Hoje: " + i3 + "/" + i2);
        TextView textView2 = this.txtPityProgresso;
        if (textView2 == null) {
            hp0.m3207Q("txtPityProgresso");
            throw null;
        }
        textView2.setText("Bônus: " + this.cachedPity + "/" + this.cachedPityTarget);
        ProgressBar progressBar = this.progressPityBar;
        if (progressBar == null) {
            hp0.m3207Q("progressPityBar");
            throw null;
        }
        progressBar.setMax(this.cachedPityTarget);
        ProgressBar progressBar2 = this.progressPityBar;
        if (progressBar2 == null) {
            hp0.m3207Q("progressPityBar");
            throw null;
        }
        progressBar2.setProgress(p32.m5140F(this.cachedPity, 0, this.cachedPityTarget));
        if (this.cachedRestantes <= 0) {
            pararContagemCooldown();
            this.cooldownEndsAtMs = 0L;
            TextView textView3 = this.txtVideoRewardInfo;
            if (textView3 == null) {
                hp0.m3207Q("txtVideoRewardInfo");
                throw null;
            }
            textView3.setText("Assista para ganhar de 1h a 24h (Prêmio Aleatório)\nLimite diário atingido.");
            MaterialButton materialButton = this.btnAssistirVideo;
            if (materialButton == null) {
                hp0.m3207Q("btnAssistirVideo");
                throw null;
            }
            materialButton.setText("Limite diário atingido");
            MaterialButton materialButton2 = this.btnAssistirVideo;
            if (materialButton2 == null) {
                hp0.m3207Q("btnAssistirVideo");
                throw null;
            }
            materialButton2.setEnabled(false);
            MaterialButton materialButton3 = this.btnAssistirVideo;
            if (materialButton3 == null) {
                hp0.m3207Q("btnAssistirVideo");
                throw null;
            }
            materialButton3.setAlpha(0.45f);
        } else if ((!z || z2) && j > 0) {
            iniciarContagemCooldown(j);
            aplicarCooldownNaUi(j);
        } else {
            pararContagemCooldown();
            this.cooldownEndsAtMs = 0L;
            TextView textView4 = this.txtVideoRewardInfo;
            if (textView4 == null) {
                hp0.m3207Q("txtVideoRewardInfo");
                throw null;
            }
            textView4.setText(RewardedAdConstants.CTA_SORTEIO);
            MaterialButton materialButton4 = this.btnAssistirVideo;
            if (materialButton4 == null) {
                hp0.m3207Q("btnAssistirVideo");
                throw null;
            }
            materialButton4.setText(RewardedAdConstants.CTA_SORTEIO);
            if (!this.videoEmAndamento) {
                MaterialButton materialButton5 = this.btnAssistirVideo;
                if (materialButton5 == null) {
                    hp0.m3207Q("btnAssistirVideo");
                    throw null;
                }
                materialButton5.setEnabled(true);
                MaterialButton materialButton6 = this.btnAssistirVideo;
                if (materialButton6 == null) {
                    hp0.m3207Q("btnAssistirVideo");
                    throw null;
                }
                materialButton6.setAlpha(1.0f);
            }
        }
        AppAnalytics appAnalytics = AppAnalytics.INSTANCE;
        int i6 = this.cachedRestantes;
        int i7 = this.cachedPity;
        if (i6 > 0 && j <= 0 && (z || z2)) {
            z3 = true;
        }
        appAnalytics.rewardedStatus(i6, i7, z3);
    }

    public static /* synthetic */ void renderStatus$default(PlansBottomSheet plansBottomSheet, int i, int i2, int i3, int i4, int i5, boolean z, long j, boolean z2, int i6, Object obj) {
        plansBottomSheet.renderStatus(i, i2, i3, i4, i5, z, j, (i6 & 128) != 0 ? false : z2);
    }

    @Override // p000.AbstractDialogC1433t7, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        pararContagemCooldown();
        BillingManager billingManager = BillingManager.INSTANCE;
        if (billingManager.getOnCatalogoCarregado() != null) {
            billingManager.setOnCatalogoCarregado(null);
        }
        billingManager.setOnCompraFinalizada(null);
        billingManager.setOnErro(null);
        super.dismiss();
    }
}
