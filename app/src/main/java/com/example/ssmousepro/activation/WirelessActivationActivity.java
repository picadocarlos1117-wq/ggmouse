package com.example.ssmousepro.activation;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import com.example.ssmousepro.C0203R;
import com.example.ssmousepro.UiEdgeToEdgeKt;
import com.example.ssmousepro.activation.WirelessActivationActivity;
import com.example.ssmousepro.injection.InjectionDaemonManager;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import p000.AbstractActivityC1469u6;
import p000.AbstractC0075au;
import p000.AbstractC1095m4;
import p000.C1058l4;
import p000.EnumC1530vu;
import p000.InterfaceC0579du;
import p000.InterfaceC1311px;
import p000.ch0;
import p000.f40;
import p000.g50;
import p000.hp0;
import p000.jb2;
import p000.ny1;
import p000.tl1;
import p000.ua0;
import p000.ul1;
import p000.uq1;
import p000.z32;
import p000.zv1;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class WirelessActivationActivity extends AbstractActivityC1469u6 {
    private boolean autoAtivarTentado;
    private Button btnAtivar;
    private Button btnEmparelhar;
    private TextView chkDev;
    private TextView chkUsb;
    private TextView chkWireless;
    private final WirelessActivationActivity$pairReceiver$1 pairReceiver;
    private final AbstractC1095m4 pedidoNotificacao;
    private final CoroutineScope scope = CoroutineScopeKt.CoroutineScope(JobKt__JobKt.Job$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain().getImmediate()));
    private TextView txtLog;
    private TextView txtStatus;

    /* JADX INFO: renamed from: com.example.ssmousepro.activation.WirelessActivationActivity$aoClicarAtivar$1 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.activation.WirelessActivationActivity$aoClicarAtivar$1", m5373f = "WirelessActivationActivity.kt", m5374l = {155}, m5375m = "invokeSuspend")
    public static final class C02231 extends ny1 implements ch0 {
        final /* synthetic */ boolean $manual;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02231(boolean z, InterfaceC0579du interfaceC0579du) {
            super(2, interfaceC0579du);
            this.$manual = z;
        }

        @Override // p000.AbstractC0018ah
        public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
            return WirelessActivationActivity.this.new C02231(this.$manual, interfaceC0579du);
        }

        @Override // p000.ch0
        public final Object invoke(CoroutineScope coroutineScope, InterfaceC0579du interfaceC0579du) {
            return ((C02231) create(coroutineScope, interfaceC0579du)).invokeSuspend(z32.f13265a);
        }

        @Override // p000.AbstractC0018ah
        public final Object invokeSuspend(Object obj) {
            String message;
            int i = this.label;
            Object obj2 = null;
            try {
                if (i == 0) {
                    ua0.m6440Z(obj);
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    WirelessActivationActivity$aoClicarAtivar$1$result$1 wirelessActivationActivity$aoClicarAtivar$1$result$1 = new WirelessActivationActivity$aoClicarAtivar$1$result$1(WirelessActivationActivity.this, null);
                    this.label = 1;
                    obj = BuildersKt.withContext(io2, wirelessActivationActivity$aoClicarAtivar$1$result$1, this);
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
                Object obj3 = ((ul1) obj).f11356a;
                if (obj3 instanceof tl1) {
                    Throwable thM6508b = ul1.m6508b(obj3);
                    if (thM6508b == null || (message = thM6508b.getMessage()) == null) {
                        message = "Falha ao ativar";
                    }
                    TextView textView = WirelessActivationActivity.this.txtLog;
                    if (textView == null) {
                        hp0.m3207Q("txtLog");
                        throw null;
                    }
                    textView.setText("✗ ".concat(message));
                    if (this.$manual || !zv1.m7365E0(message, "em curso", true)) {
                        Toast.makeText(WirelessActivationActivity.this, message, 1).show();
                    }
                } else {
                    TextView textView2 = WirelessActivationActivity.this.txtLog;
                    if (textView2 == null) {
                        hp0.m3207Q("txtLog");
                        throw null;
                    }
                    if (!(obj3 instanceof tl1)) {
                        obj2 = obj3;
                    }
                    textView2.setText("✓ " + obj2);
                    InjectionDaemonManager injectionDaemonManager = InjectionDaemonManager.INSTANCE;
                    String packageName = WirelessActivationActivity.this.getPackageName();
                    packageName.getClass();
                    injectionDaemonManager.vincularDaemon(packageName);
                    if (this.$manual) {
                        Toast.makeText(WirelessActivationActivity.this, "Wi‑Fi ativo", 0).show();
                    }
                }
                WirelessActivationActivity.this.refreshStatusUi();
                return z32.f13265a;
            } catch (Throwable th) {
                WirelessActivationActivity.this.refreshStatusUi();
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.example.ssmousepro.activation.WirelessActivationActivity$pairReceiver$1] */
    public WirelessActivationActivity() {
        AbstractC1095m4 abstractC1095m4RegisterForActivityResult = registerForActivityResult(new C1058l4(1), new uq1(this, 6));
        abstractC1095m4RegisterForActivityResult.getClass();
        this.pedidoNotificacao = abstractC1095m4RegisterForActivityResult;
        this.pairReceiver = new BroadcastReceiver() { // from class: com.example.ssmousepro.activation.WirelessActivationActivity$pairReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if (hp0.m3214e(intent != null ? intent.getAction() : null, AdbPairingService.ACTION_PAIR_RESULT)) {
                    boolean booleanExtra = intent.getBooleanExtra(AdbPairingService.EXTRA_OK, false);
                    boolean booleanExtra2 = intent.getBooleanExtra(AdbPairingService.EXTRA_ACTIVATED, false);
                    String stringExtra = intent.getStringExtra(AdbPairingService.EXTRA_MSG);
                    if (stringExtra == null) {
                        stringExtra = "";
                    }
                    TextView textView = this.this$0.txtLog;
                    if (textView == null) {
                        hp0.m3207Q("txtLog");
                        throw null;
                    }
                    textView.setText((booleanExtra ? "✓ " : "✗ ").concat(stringExtra));
                    if (booleanExtra2 || (booleanExtra && zv1.m7365E0(stringExtra, "ativa", true))) {
                        InjectionDaemonManager injectionDaemonManager = InjectionDaemonManager.INSTANCE;
                        String packageName = this.this$0.getPackageName();
                        packageName.getClass();
                        injectionDaemonManager.vincularDaemon(packageName);
                        Toast.makeText(this.this$0, "Wi‑Fi ativo ✅", 0).show();
                    }
                    this.this$0.refreshStatusUi();
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void aoClicarAtivar(boolean z) {
        Button button = this.btnAtivar;
        if (button == null) {
            hp0.m3207Q("btnAtivar");
            throw null;
        }
        button.setEnabled(false);
        if (z) {
            TextView textView = this.txtLog;
            if (textView == null) {
                hp0.m3207Q("txtLog");
                throw null;
            }
            textView.setText("Conectando…");
        }
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new C02231(z, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void aoClicarEmparelhar() {
        if (Build.VERSION.SDK_INT < 33 || AbstractC0075au.checkSelfPermission(this, "android.permission.POST_NOTIFICATIONS") == 0) {
            iniciarFluxoEmparelhar();
        } else {
            this.pedidoNotificacao.mo4381a("android.permission.POST_NOTIFICATIONS");
        }
    }

    private final void aplicarStatusNaUi(boolean z) {
        TextView textView = this.txtStatus;
        if (textView == null) {
            hp0.m3207Q("txtStatus");
            throw null;
        }
        textView.setText("Status: " + WifiAdbManager.INSTANCE.statusResumo(this));
        Button button = this.btnAtivar;
        if (button == null) {
            hp0.m3207Q("btnAtivar");
            throw null;
        }
        button.setText(z ? "Ativo ✅" : "Ativar");
        Button button2 = this.btnAtivar;
        if (button2 == null) {
            hp0.m3207Q("btnAtivar");
            throw null;
        }
        button2.setEnabled(!z);
        if (z) {
            TextView textView2 = this.chkWireless;
            if (textView2 != null) {
                marcar(textView2, true);
            } else {
                hp0.m3207Q("chkWireless");
                throw null;
            }
        }
    }

    private final void atualizarChecksHeuristica() {
        boolean z;
        boolean z2 = true;
        try {
            z = Settings.Global.getInt(getContentResolver(), "adb_enabled", 0) == 1;
        } catch (Exception unused) {
        }
        TextView textView = this.chkDev;
        if (textView == null) {
            hp0.m3207Q("chkDev");
            throw null;
        }
        marcar(textView, true);
        TextView textView2 = this.chkUsb;
        if (textView2 == null) {
            hp0.m3207Q("chkUsb");
            throw null;
        }
        marcar(textView2, z);
        TextView textView3 = this.chkWireless;
        if (textView3 == null) {
            hp0.m3207Q("chkWireless");
            throw null;
        }
        WifiAdbManager wifiAdbManager = WifiAdbManager.INSTANCE;
        if (!wifiAdbManager.estaPareado(this) && !wifiAdbManager.estaProntoParaInjecao()) {
            z2 = false;
        }
        marcar(textView3, z2);
    }

    private final void iniciarFluxoEmparelhar() {
        AdbPairingService.Companion.mostrar(this);
        TextView textView = this.txtLog;
        if (textView == null) {
            hp0.m3207Q("txtLog");
            throw null;
        }
        textView.setText("Notificação aberta — digite o código nela. O app ativa sozinho depois.");
        try {
            try {
                startActivity(new Intent("android.settings.APPLICATION_DEVELOPMENT_SETTINGS"));
            } catch (Exception unused) {
                Toast.makeText(this, "Abra Opções do desenvolvedor manualmente", 1).show();
            }
        } catch (Exception unused2) {
            startActivity(new Intent("android.settings.SETTINGS"));
        }
    }

    private final void marcar(TextView textView, boolean z) {
        textView.setText(z ? "✓" : "○");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 onResume$lambda$4(WirelessActivationActivity wirelessActivationActivity, boolean z) {
        boolean zIsFinishing = wirelessActivationActivity.isFinishing();
        z32 z32Var = z32.f13265a;
        if (zIsFinishing) {
            return z32Var;
        }
        wirelessActivationActivity.aplicarStatusNaUi(z);
        if (!z && WifiAdbManager.INSTANCE.estaPareado(wirelessActivationActivity) && !wirelessActivationActivity.autoAtivarTentado) {
            wirelessActivationActivity.autoAtivarTentado = true;
            TextView textView = wirelessActivationActivity.txtLog;
            if (textView == null) {
                hp0.m3207Q("txtLog");
                throw null;
            }
            textView.setText("Já emparelhado — ativando automaticamente…");
            wirelessActivationActivity.aoClicarAtivar(false);
        }
        return z32Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pedidoNotificacao$lambda$0(WirelessActivationActivity wirelessActivationActivity, Boolean bool) {
        if (bool.booleanValue()) {
            wirelessActivationActivity.iniciarFluxoEmparelhar();
        } else {
            Toast.makeText(wirelessActivationActivity, "Sem notificação não dá para digitar o código fora do app.", 1).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshStatusUi() {
        WifiAdbManager.INSTANCE.refreshPingAsync(new jb2(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 refreshStatusUi$lambda$6(WirelessActivationActivity wirelessActivationActivity, boolean z) {
        if (!wirelessActivationActivity.isFinishing()) {
            wirelessActivationActivity.aplicarStatusNaUi(z);
        }
        return z32.f13265a;
    }

    @Override // androidx.fragment.app.AbstractActivityC0053q, p000.AbstractActivityC0613er, p000.AbstractActivityC0576dr, android.app.Activity
    public void onCreate(Bundle bundle) {
        g50.m2937a(this);
        super.onCreate(bundle);
        setContentView(C0203R.layout.activity_wireless_activation);
        UiEdgeToEdgeKt.aplicarPaddingSistema(this);
        ActivationModePrefs.INSTANCE.definir(this, ModoAtivacao.WIFI);
        View viewFindViewById = findViewById(C0203R.id.txtWifiStatus);
        viewFindViewById.getClass();
        this.txtStatus = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(C0203R.id.txtWifiLog);
        viewFindViewById2.getClass();
        this.txtLog = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(C0203R.id.chkWifiDev);
        viewFindViewById3.getClass();
        this.chkDev = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(C0203R.id.chkWifiUsb);
        viewFindViewById4.getClass();
        this.chkUsb = (TextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(C0203R.id.chkWifiWireless);
        viewFindViewById5.getClass();
        this.chkWireless = (TextView) viewFindViewById5;
        View viewFindViewById6 = findViewById(C0203R.id.btnWifiEmparelhar);
        viewFindViewById6.getClass();
        this.btnEmparelhar = (Button) viewFindViewById6;
        View viewFindViewById7 = findViewById(C0203R.id.btnWifiAtivar);
        viewFindViewById7.getClass();
        this.btnAtivar = (Button) viewFindViewById7;
        final int i = 0;
        ((ImageButton) findViewById(C0203R.id.btnVoltarWifi)).setOnClickListener(new View.OnClickListener(this) { // from class: kb2

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ WirelessActivationActivity f5740b;

            {
                this.f5740b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                WirelessActivationActivity wirelessActivationActivity = this.f5740b;
                switch (i2) {
                    case 0:
                        wirelessActivationActivity.finish();
                        break;
                    case 1:
                        wirelessActivationActivity.aoClicarEmparelhar();
                        break;
                    default:
                        wirelessActivationActivity.aoClicarAtivar(true);
                        break;
                }
            }
        });
        Button button = this.btnEmparelhar;
        if (button == null) {
            hp0.m3207Q("btnEmparelhar");
            throw null;
        }
        final int i2 = 1;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: kb2

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ WirelessActivationActivity f5740b;

            {
                this.f5740b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                WirelessActivationActivity wirelessActivationActivity = this.f5740b;
                switch (i3) {
                    case 0:
                        wirelessActivationActivity.finish();
                        break;
                    case 1:
                        wirelessActivationActivity.aoClicarEmparelhar();
                        break;
                    default:
                        wirelessActivationActivity.aoClicarAtivar(true);
                        break;
                }
            }
        });
        Button button2 = this.btnAtivar;
        if (button2 == null) {
            hp0.m3207Q("btnAtivar");
            throw null;
        }
        final int i3 = 2;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: kb2

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ WirelessActivationActivity f5740b;

            {
                this.f5740b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i3;
                WirelessActivationActivity wirelessActivationActivity = this.f5740b;
                switch (i4) {
                    case 0:
                        wirelessActivationActivity.finish();
                        break;
                    case 1:
                        wirelessActivationActivity.aoClicarEmparelhar();
                        break;
                    default:
                        wirelessActivationActivity.aoClicarAtivar(true);
                        break;
                }
            }
        });
        AbstractC0075au.registerReceiver(this, this.pairReceiver, new IntentFilter(AdbPairingService.ACTION_PAIR_RESULT), 4);
        refreshStatusUi();
        atualizarChecksHeuristica();
    }

    @Override // p000.AbstractActivityC1469u6, androidx.fragment.app.AbstractActivityC0053q, android.app.Activity
    public void onDestroy() {
        try {
            unregisterReceiver(this.pairReceiver);
        } catch (Throwable unused) {
        }
        AdbPairingService.Companion.parar(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.AbstractActivityC0053q, android.app.Activity
    public void onResume() {
        super.onResume();
        atualizarChecksHeuristica();
        WifiAdbManager.INSTANCE.refreshPingAsync(new jb2(this, 1));
    }
}
