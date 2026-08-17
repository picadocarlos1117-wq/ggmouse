package com.example.ssmousepro;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.provider.Settings;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import com.example.ssmousepro.PreferencesActivity;
import com.example.ssmousepro.account.AccountRepository;
import com.example.ssmousepro.activation.ActivationModePrefs;
import com.example.ssmousepro.activation.ModoAtivacao;
import com.example.ssmousepro.activation.WifiAdbManager;
import com.example.ssmousepro.activation.WirelessActivationActivity;
import com.example.ssmousepro.injection.InjectionDaemonManager;
import com.google.firebase.auth.FirebaseUser;
import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Predicate;
import p000.AbstractActivityC1469u6;
import p000.AbstractC1308pu;
import p000.AbstractC1337qm;
import p000.AbstractC1571wy;
import p000.C0694gy;
import p000.C1133n5;
import p000.C1165o0;
import p000.C1357r5;
import p000.bd0;
import p000.g50;
import p000.hp0;
import p000.ia1;
import p000.jd0;
import p000.ks1;
import p000.ls1;
import p000.ms1;
import p000.ns1;
import p000.ob0;
import p000.ps1;
import p000.uf1;
import p000.wf1;
import p000.xf1;
import p000.y60;
import p000.yf1;
import p000.z32;
import p000.zf1;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class PreferencesActivity extends AbstractActivityC1469u6 {
    public static final Companion Companion = new Companion(null);
    private static final int SHIZUKU_REQUEST_CODE = 5050;
    private AtalhosPrefs.Acao acaoCapturando;
    private Button btnAtivarShizuku;
    private Button btnPermissaoSobreposicao;
    private Button btnPermissaoUso;
    private Button btnSairConta;
    private CardView cardStatusShizuku;
    private TextView chipAtalhoConfig;
    private TextView chipAtalhoDigitar;
    private TextView chipAtalhoEditarHud;
    private View painelAtalhosPrefs;
    private View painelMenuPrefs;
    private View painelPermissoesPrefs;
    private TextView txtContaEmail;
    private TextView txtStatusShizuku;
    private TextView txtStatusSobreposicao;
    private TextView txtStatusUso;
    private TextView txtTituloPrefs;
    private TelaPrefs telaAtual = TelaPrefs.MENU;
    private final ms1 shizukuBinderListener = new wf1(this);
    private final ls1 shizukuBinderDeadListener = new xf1(this);
    private final ns1 shizukuPermissionListener = new yf1(this);

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public enum TelaPrefs {
        MENU,
        PERMISSOES,
        ATALHOS;

        private static final /* synthetic */ y60 $ENTRIES = AbstractC1337qm.m5553p(values());

        public static y60 getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[ShizukuManager.StatusShizuku.values().length];
            try {
                iArr[ShizukuManager.StatusShizuku.NAO_INSTALADO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShizukuManager.StatusShizuku.NAO_RODANDO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ShizukuManager.StatusShizuku.SEM_PERMISSAO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ShizukuManager.StatusShizuku.PRONTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TelaPrefs.values().length];
            try {
                iArr2[TelaPrefs.MENU.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[TelaPrefs.PERMISSOES.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[TelaPrefs.ATALHOS.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[AtalhosPrefs.Acao.values().length];
            try {
                iArr3[AtalhosPrefs.Acao.EDITAR_HUD.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[AtalhosPrefs.Acao.DIGITAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[AtalhosPrefs.Acao.CONFIG.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[ModoAtivacao.values().length];
            try {
                iArr4[ModoAtivacao.SHIZUKU.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[ModoAtivacao.WIFI.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void abrirEscolhaModoAtivacao() {
        ActivationModePrefs activationModePrefs = ActivationModePrefs.INSTANCE;
        ModoAtivacao modoAtivacaoModo = activationModePrefs.modo(this);
        String strRotulo = activationModePrefs.rotulo(ModoAtivacao.SHIZUKU);
        ModoAtivacao modoAtivacao = ModoAtivacao.WIFI;
        String[] strArr = {strRotulo, activationModePrefs.rotulo(modoAtivacao)};
        int i = 0;
        int i2 = 1;
        int i3 = modoAtivacaoModo == modoAtivacao ? 1 : 0;
        C1357r5 title = new C1357r5(this).setTitle("Como ativar o mapeador");
        zf1 zf1Var = new zf1(this, i);
        C1133n5 c1133n5 = title.f9726a;
        c1133n5.f7229n = strArr;
        c1133n5.f7231p = zf1Var;
        c1133n5.f7234s = i3;
        c1133n5.f7233r = true;
        if (modoAtivacaoModo == modoAtivacao) {
            zf1 zf1Var2 = new zf1(this, i2);
            c1133n5.f7226k = "Tela Wi‑Fi";
            c1133n5.f7227l = zf1Var2;
        }
        c1133n5.f7224i = "Cancelar";
        c1133n5.f7225j = null;
        title.create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void abrirEscolhaModoAtivacao$lambda$20(PreferencesActivity preferencesActivity, DialogInterface dialogInterface, int i) {
        if (i == 0) {
            ActivationModePrefs.INSTANCE.definir(preferencesActivity, ModoAtivacao.SHIZUKU);
            preferencesActivity.atualizarResumoModoAtivacao();
            Toast.makeText(preferencesActivity, "Modo Shizuku (padrão)", 0).show();
            dialogInterface.dismiss();
            return;
        }
        if (i != 1) {
            return;
        }
        ActivationModePrefs.INSTANCE.definir(preferencesActivity, ModoAtivacao.WIFI);
        preferencesActivity.atualizarResumoModoAtivacao();
        dialogInterface.dismiss();
        preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) WirelessActivationActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void abrirEscolhaModoAtivacao$lambda$22$lambda$21(PreferencesActivity preferencesActivity, DialogInterface dialogInterface, int i) {
        preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) WirelessActivationActivity.class));
    }

    private final void atualizarChipsAtalhos() {
        AtalhosPrefs.Snapshot snapshotCarregar = AtalhosPrefs.INSTANCE.carregar(this);
        TextView textView = this.chipAtalhoEditarHud;
        if (textView == null) {
            hp0.m3207Q("chipAtalhoEditarHud");
            throw null;
        }
        textView.setText(snapshotCarregar.textoUi(AtalhosPrefs.Acao.EDITAR_HUD));
        TextView textView2 = this.chipAtalhoDigitar;
        if (textView2 == null) {
            hp0.m3207Q("chipAtalhoDigitar");
            throw null;
        }
        textView2.setText(snapshotCarregar.textoUi(AtalhosPrefs.Acao.DIGITAR));
        TextView textView3 = this.chipAtalhoConfig;
        if (textView3 != null) {
            textView3.setText(snapshotCarregar.textoUi(AtalhosPrefs.Acao.CONFIG));
        } else {
            hp0.m3207Q("chipAtalhoConfig");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void atualizarInterface() {
        atualizarStatusPermissoes();
        atualizarStatusShizuku();
        atualizarResumoModoAtivacao();
    }

    private final void atualizarResumoModoAtivacao() {
        String strRotulo;
        TextView textView = (TextView) findViewById(C0203R.id.txtModoAtivacaoResumo);
        if (textView == null) {
            return;
        }
        ActivationModePrefs activationModePrefs = ActivationModePrefs.INSTANCE;
        ModoAtivacao modoAtivacaoModo = activationModePrefs.modo(this);
        int i = WhenMappings.$EnumSwitchMapping$3[modoAtivacaoModo.ordinal()];
        if (i == 1) {
            strRotulo = activationModePrefs.rotulo(modoAtivacaoModo);
        } else {
            if (i != 2) {
                C0694gy.m3076b();
                return;
            }
            strRotulo = AbstractC1308pu.m5340g(activationModePrefs.rotulo(modoAtivacaoModo), " · ", WifiAdbManager.INSTANCE.statusResumo(this));
        }
        textView.setText(strRotulo);
    }

    private final void atualizarStatusPermissoes() {
        boolean zCanDrawOverlays = Settings.canDrawOverlays(this);
        TextView textView = this.txtStatusSobreposicao;
        if (zCanDrawOverlays) {
            if (textView == null) {
                hp0.m3207Q("txtStatusSobreposicao");
                throw null;
            }
            textView.setText("Autorizada ✅");
            TextView textView2 = this.txtStatusSobreposicao;
            if (textView2 == null) {
                hp0.m3207Q("txtStatusSobreposicao");
                throw null;
            }
            textView2.setTextColor(Color.parseColor("#2E7D32"));
            Button button = this.btnPermissaoSobreposicao;
            if (button == null) {
                hp0.m3207Q("btnPermissaoSobreposicao");
                throw null;
            }
            button.setText("Ativo");
            Button button2 = this.btnPermissaoSobreposicao;
            if (button2 == null) {
                hp0.m3207Q("btnPermissaoSobreposicao");
                throw null;
            }
            button2.setEnabled(false);
            Button button3 = this.btnPermissaoSobreposicao;
            if (button3 == null) {
                hp0.m3207Q("btnPermissaoSobreposicao");
                throw null;
            }
            button3.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#4CAF50")));
        } else {
            if (textView == null) {
                hp0.m3207Q("txtStatusSobreposicao");
                throw null;
            }
            textView.setText("Necessária para a bolinha flutuante ⚠️");
            TextView textView3 = this.txtStatusSobreposicao;
            if (textView3 == null) {
                hp0.m3207Q("txtStatusSobreposicao");
                throw null;
            }
            textView3.setTextColor(Color.parseColor("#EF6C00"));
            Button button4 = this.btnPermissaoSobreposicao;
            if (button4 == null) {
                hp0.m3207Q("btnPermissaoSobreposicao");
                throw null;
            }
            button4.setText("Configurar");
            Button button5 = this.btnPermissaoSobreposicao;
            if (button5 == null) {
                hp0.m3207Q("btnPermissaoSobreposicao");
                throw null;
            }
            button5.setEnabled(true);
            Button button6 = this.btnPermissaoSobreposicao;
            if (button6 == null) {
                hp0.m3207Q("btnPermissaoSobreposicao");
                throw null;
            }
            button6.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#5C6BC0")));
        }
        boolean zTemPermissaoUso = ForegroundAppDetector.INSTANCE.temPermissaoUso(this);
        TextView textView4 = this.txtStatusUso;
        if (zTemPermissaoUso) {
            if (textView4 == null) {
                hp0.m3207Q("txtStatusUso");
                throw null;
            }
            textView4.setText("Autorizada ✅");
            TextView textView5 = this.txtStatusUso;
            if (textView5 == null) {
                hp0.m3207Q("txtStatusUso");
                throw null;
            }
            textView5.setTextColor(Color.parseColor("#2E7D32"));
            Button button7 = this.btnPermissaoUso;
            if (button7 == null) {
                hp0.m3207Q("btnPermissaoUso");
                throw null;
            }
            button7.setText("Ativo");
            Button button8 = this.btnPermissaoUso;
            if (button8 == null) {
                hp0.m3207Q("btnPermissaoUso");
                throw null;
            }
            button8.setEnabled(false);
            Button button9 = this.btnPermissaoUso;
            if (button9 != null) {
                button9.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#4CAF50")));
                return;
            } else {
                hp0.m3207Q("btnPermissaoUso");
                throw null;
            }
        }
        if (textView4 == null) {
            hp0.m3207Q("txtStatusUso");
            throw null;
        }
        textView4.setText("Necessária para ocultar a bolinha fora do jogo ⚠️");
        TextView textView6 = this.txtStatusUso;
        if (textView6 == null) {
            hp0.m3207Q("txtStatusUso");
            throw null;
        }
        textView6.setTextColor(Color.parseColor("#EF6C00"));
        Button button10 = this.btnPermissaoUso;
        if (button10 == null) {
            hp0.m3207Q("btnPermissaoUso");
            throw null;
        }
        button10.setText("Configurar");
        Button button11 = this.btnPermissaoUso;
        if (button11 == null) {
            hp0.m3207Q("btnPermissaoUso");
            throw null;
        }
        button11.setEnabled(true);
        Button button12 = this.btnPermissaoUso;
        if (button12 != null) {
            button12.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#5C6BC0")));
        } else {
            hp0.m3207Q("btnPermissaoUso");
            throw null;
        }
    }

    private final void atualizarStatusShizuku() {
        int i = WhenMappings.$EnumSwitchMapping$0[ShizukuManager.INSTANCE.obterStatus(this).ordinal()];
        if (i == 1) {
            CardView cardView = this.cardStatusShizuku;
            if (cardView == null) {
                hp0.m3207Q("cardStatusShizuku");
                throw null;
            }
            cardView.setCardBackgroundColor(Color.parseColor("#FFEBEE"));
            TextView textView = this.txtStatusShizuku;
            if (textView == null) {
                hp0.m3207Q("txtStatusShizuku");
                throw null;
            }
            textView.setText("Shizuku OFF ❌");
            TextView textView2 = this.txtStatusShizuku;
            if (textView2 == null) {
                hp0.m3207Q("txtStatusShizuku");
                throw null;
            }
            textView2.setTextColor(Color.parseColor("#C62828"));
            configurarBotaoShizuku("Instalar", true, Color.parseColor("#E53935"));
            return;
        }
        if (i == 2) {
            CardView cardView2 = this.cardStatusShizuku;
            if (cardView2 == null) {
                hp0.m3207Q("cardStatusShizuku");
                throw null;
            }
            cardView2.setCardBackgroundColor(Color.parseColor("#E8EAF6"));
            TextView textView3 = this.txtStatusShizuku;
            if (textView3 == null) {
                hp0.m3207Q("txtStatusShizuku");
                throw null;
            }
            textView3.setText("Shizuku OFF ⚠️");
            TextView textView4 = this.txtStatusShizuku;
            if (textView4 == null) {
                hp0.m3207Q("txtStatusShizuku");
                throw null;
            }
            textView4.setTextColor(Color.parseColor("#3F51B5"));
            configurarBotaoShizuku("Iniciar", true, Color.parseColor("#5C6BC0"));
            return;
        }
        if (i == 3) {
            CardView cardView3 = this.cardStatusShizuku;
            if (cardView3 == null) {
                hp0.m3207Q("cardStatusShizuku");
                throw null;
            }
            cardView3.setCardBackgroundColor(Color.parseColor("#FFF3E0"));
            TextView textView5 = this.txtStatusShizuku;
            if (textView5 == null) {
                hp0.m3207Q("txtStatusShizuku");
                throw null;
            }
            textView5.setText("Shizuku OFF ⚠️");
            TextView textView6 = this.txtStatusShizuku;
            if (textView6 == null) {
                hp0.m3207Q("txtStatusShizuku");
                throw null;
            }
            textView6.setTextColor(Color.parseColor("#EF6C00"));
            configurarBotaoShizuku("Autorizar", true, Color.parseColor("#FB8C00"));
            return;
        }
        if (i != 4) {
            C0694gy.m3076b();
            return;
        }
        InjectionDaemonManager injectionDaemonManager = InjectionDaemonManager.INSTANCE;
        String packageName = getPackageName();
        packageName.getClass();
        injectionDaemonManager.vincularDaemon(packageName);
        boolean zIsSocketConectado = injectionDaemonManager.isSocketConectado();
        CardView cardView4 = this.cardStatusShizuku;
        if (cardView4 == null) {
            hp0.m3207Q("cardStatusShizuku");
            throw null;
        }
        cardView4.setCardBackgroundColor(Color.parseColor("#E8F5E9"));
        TextView textView7 = this.txtStatusShizuku;
        if (textView7 == null) {
            hp0.m3207Q("txtStatusShizuku");
            throw null;
        }
        textView7.setText(zIsSocketConectado ? "Shizuku ON ✅" : "Shizuku ON ⏳");
        TextView textView8 = this.txtStatusShizuku;
        if (textView8 == null) {
            hp0.m3207Q("txtStatusShizuku");
            throw null;
        }
        textView8.setTextColor(Color.parseColor("#2E7D32"));
        configurarBotaoShizuku("Ativo", false, Color.parseColor("#4CAF50"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelarCapturaAtalho() {
        this.acaoCapturando = null;
        atualizarChipsAtalhos();
    }

    private final TextView chipDaAcao(AtalhosPrefs.Acao acao) {
        int i = WhenMappings.$EnumSwitchMapping$2[acao.ordinal()];
        if (i == 1) {
            TextView textView = this.chipAtalhoEditarHud;
            if (textView != null) {
                return textView;
            }
            hp0.m3207Q("chipAtalhoEditarHud");
            throw null;
        }
        if (i == 2) {
            TextView textView2 = this.chipAtalhoDigitar;
            if (textView2 != null) {
                return textView2;
            }
            hp0.m3207Q("chipAtalhoDigitar");
            throw null;
        }
        if (i != 3) {
            C0694gy.m3076b();
            return null;
        }
        TextView textView3 = this.chipAtalhoConfig;
        if (textView3 != null) {
            return textView3;
        }
        hp0.m3207Q("chipAtalhoConfig");
        throw null;
    }

    private final void configurarBotaoShizuku(String str, boolean z, int i) {
        Button button = this.btnAtivarShizuku;
        if (button == null) {
            hp0.m3207Q("btnAtivarShizuku");
            throw null;
        }
        button.setText(str);
        Button button2 = this.btnAtivarShizuku;
        if (button2 == null) {
            hp0.m3207Q("btnAtivarShizuku");
            throw null;
        }
        button2.setEnabled(z);
        Button button3 = this.btnAtivarShizuku;
        if (button3 != null) {
            button3.setBackgroundTintList(ColorStateList.valueOf(i));
        } else {
            hp0.m3207Q("btnAtivarShizuku");
            throw null;
        }
    }

    private final void confirmarAtalho(String str) {
        AtalhosPrefs.Acao acao = this.acaoCapturando;
        if (acao == null) {
            return;
        }
        this.acaoCapturando = null;
        String strSalvar = AtalhosPrefs.INSTANCE.salvar(this, acao, str);
        if (strSalvar != null) {
            Toast.makeText(this, strSalvar, 0).show();
        } else {
            sincronizarAtalhosNoDaemonSeAtivo();
            Toast.makeText(this, "Atalho: " + str, 0).show();
        }
        atualizarChipsAtalhos();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void iniciarCapturaAtalho(AtalhosPrefs.Acao acao) {
        this.acaoCapturando = acao;
        TextView textViewChipDaAcao = chipDaAcao(acao);
        textViewChipDaAcao.setText("…");
        textViewChipDaAcao.requestFocus();
        Toast.makeText(this, "Pressione a tecla (Back cancela)", 0).show();
    }

    private final void mostrarTela(TelaPrefs telaPrefs) {
        String str;
        if (this.acaoCapturando != null && telaPrefs != TelaPrefs.ATALHOS) {
            cancelarCapturaAtalho();
        }
        this.telaAtual = telaPrefs;
        View view = this.painelMenuPrefs;
        if (view == null) {
            hp0.m3207Q("painelMenuPrefs");
            throw null;
        }
        view.setVisibility(telaPrefs == TelaPrefs.MENU ? 0 : 8);
        View view2 = this.painelPermissoesPrefs;
        if (view2 == null) {
            hp0.m3207Q("painelPermissoesPrefs");
            throw null;
        }
        view2.setVisibility(telaPrefs == TelaPrefs.PERMISSOES ? 0 : 8);
        View view3 = this.painelAtalhosPrefs;
        if (view3 == null) {
            hp0.m3207Q("painelAtalhosPrefs");
            throw null;
        }
        view3.setVisibility(telaPrefs == TelaPrefs.ATALHOS ? 0 : 8);
        TextView textView = this.txtTituloPrefs;
        if (textView == null) {
            hp0.m3207Q("txtTituloPrefs");
            throw null;
        }
        int i = WhenMappings.$EnumSwitchMapping$1[telaPrefs.ordinal()];
        if (i == 1) {
            str = "Configurações";
        } else if (i == 2) {
            str = "Permissões";
        } else {
            if (i != 3) {
                C0694gy.m3076b();
                return;
            }
            str = "Atalhos";
        }
        textView.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$12(PreferencesActivity preferencesActivity, View view) {
        preferencesActivity.startActivity(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + preferencesActivity.getPackageName())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$14(PreferencesActivity preferencesActivity, View view) {
        try {
            Intent intent = new Intent("android.settings.USAGE_ACCESS_SETTINGS");
            intent.setData(Uri.parse("package:" + preferencesActivity.getPackageName()));
            preferencesActivity.startActivity(intent);
        } catch (Exception unused) {
            preferencesActivity.startActivity(new Intent("android.settings.USAGE_ACCESS_SETTINGS"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$15(PreferencesActivity preferencesActivity, View view) {
        ShizukuManager shizukuManager = ShizukuManager.INSTANCE;
        int i = WhenMappings.$EnumSwitchMapping$0[shizukuManager.obterStatus(preferencesActivity).ordinal()];
        if (i == 1) {
            Toast.makeText(preferencesActivity, "Instale o app Shizuku pela Play Store ou GitHub.", 1).show();
            return;
        }
        if (i == 2) {
            Toast.makeText(preferencesActivity, "Abra o Shizuku e inicie via Depuração Sem Fio ou Root.", 1).show();
            return;
        }
        if (i == 3) {
            shizukuManager.solicitarPermissao(SHIZUKU_REQUEST_CODE);
            return;
        }
        if (i != 4) {
            C0694gy.m3076b();
            return;
        }
        InjectionDaemonManager injectionDaemonManager = InjectionDaemonManager.INSTANCE;
        String packageName = preferencesActivity.getPackageName();
        packageName.getClass();
        injectionDaemonManager.vincularDaemon(packageName);
        preferencesActivity.atualizarStatusShizuku();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$7(PreferencesActivity preferencesActivity, View view) {
        AccountRepository.INSTANCE.signOut();
        preferencesActivity.stopService(new Intent(preferencesActivity, (Class<?>) FloatingService.class));
        Intent intent = new Intent(preferencesActivity, (Class<?>) LoginActivity.class);
        intent.setFlags(268468224);
        preferencesActivity.startActivity(intent);
        preferencesActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$8(PreferencesActivity preferencesActivity, View view) {
        preferencesActivity.mostrarTela(TelaPrefs.PERMISSOES);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$9(PreferencesActivity preferencesActivity, View view) {
        preferencesActivity.mostrarTela(TelaPrefs.ATALHOS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 onResume$lambda$16(PreferencesActivity preferencesActivity, boolean z) {
        if (!preferencesActivity.isFinishing()) {
            preferencesActivity.atualizarResumoModoAtivacao();
        }
        return z32.f13265a;
    }

    private final String rotuloDeKeyEvent(KeyEvent keyEvent) {
        String strParaRotulo;
        int scanCode = keyEvent.getScanCode();
        if (scanCode > 0 && (strParaRotulo = LinuxKeyCodes.INSTANCE.paraRotulo(scanCode)) != null) {
            return strParaRotulo;
        }
        int keyCode = keyEvent.getKeyCode();
        if (29 <= keyCode && keyCode < 55) {
            return String.valueOf((char) (keyEvent.getKeyCode() + 36));
        }
        if (7 <= keyCode && keyCode < 17) {
            return String.valueOf((char) (keyEvent.getKeyCode() + 41));
        }
        if (131 <= keyCode && keyCode < 143) {
            return jd0.m3609g(keyEvent.getKeyCode() - 130, "F");
        }
        if (keyCode == 62) {
            return "Espaço";
        }
        if (keyCode == 66) {
            return "Enter";
        }
        if (keyCode == 61) {
            return "Tab";
        }
        if (keyCode == 111) {
            return "Esc";
        }
        if (keyCode == 124) {
            return "Insert";
        }
        if (keyCode == 112) {
            return "Delete";
        }
        if (keyCode == 122) {
            return "Home";
        }
        if (keyCode == 123) {
            return "End";
        }
        if (keyCode == 92) {
            return "PgUp";
        }
        if (keyCode == 93) {
            return "PgDn";
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void shizukuBinderDeadListener$lambda$3(PreferencesActivity preferencesActivity) {
        preferencesActivity.runOnUiThread(new uf1(preferencesActivity, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void shizukuBinderListener$lambda$1(PreferencesActivity preferencesActivity) {
        preferencesActivity.runOnUiThread(new uf1(preferencesActivity, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void shizukuPermissionListener$lambda$5(PreferencesActivity preferencesActivity, int i, int i2) {
        preferencesActivity.runOnUiThread(new uf1(preferencesActivity, 2));
    }

    private final void sincronizarAtalhosNoDaemonSeAtivo() {
        if (FloatingService.Companion.isRunning()) {
            InjectionDaemonManager injectionDaemonManager = InjectionDaemonManager.INSTANCE;
            if (injectionDaemonManager.isDaemonVinculado()) {
                injectionDaemonManager.enqueueComando(AtalhosPrefs.INSTANCE.carregar(this).comandoDaemon());
            }
        }
    }

    private final void vincularChipAtalho(TextView textView, AtalhosPrefs.Acao acao) {
        textView.setFocusable(true);
        textView.setFocusableInTouchMode(true);
        textView.setOnClickListener(new ob0(4, this, acao));
        textView.setOnLongClickListener(new bd0(2, this, acao));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean vincularChipAtalho$lambda$18(PreferencesActivity preferencesActivity, AtalhosPrefs.Acao acao, View view) {
        AtalhosPrefs.INSTANCE.limpar(preferencesActivity, acao);
        preferencesActivity.atualizarChipsAtalhos();
        preferencesActivity.sincronizarAtalhosNoDaemonSeAtivo();
        Toast.makeText(preferencesActivity, "Atalho removido", 0).show();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void voltar() {
        TelaPrefs telaPrefs = this.telaAtual;
        TelaPrefs telaPrefs2 = TelaPrefs.MENU;
        if (telaPrefs != telaPrefs2) {
            mostrarTela(telaPrefs2);
        } else {
            finish();
        }
    }

    @Override // p000.AbstractActivityC1469u6, p000.AbstractActivityC0576dr, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        if (this.acaoCapturando != null && keyEvent.getAction() == 0) {
            if (keyEvent.getKeyCode() == 4) {
                cancelarCapturaAtalho();
                return true;
            }
            String strRotuloDeKeyEvent = rotuloDeKeyEvent(keyEvent);
            if (strRotuloDeKeyEvent != null) {
                confirmarAtalho(strRotuloDeKeyEvent);
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.fragment.app.AbstractActivityC0053q, p000.AbstractActivityC0613er, p000.AbstractActivityC0576dr, android.app.Activity
    public void onCreate(Bundle bundle) {
        String email;
        g50.m2937a(this);
        super.onCreate(bundle);
        setContentView(C0203R.layout.activity_preferences);
        UiEdgeToEdgeKt.aplicarPaddingSistema(this);
        View viewFindViewById = findViewById(C0203R.id.txtTituloPrefs);
        viewFindViewById.getClass();
        this.txtTituloPrefs = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(C0203R.id.painelMenuPrefs);
        viewFindViewById2.getClass();
        this.painelMenuPrefs = viewFindViewById2;
        View viewFindViewById3 = findViewById(C0203R.id.painelPermissoesPrefs);
        viewFindViewById3.getClass();
        this.painelPermissoesPrefs = viewFindViewById3;
        View viewFindViewById4 = findViewById(C0203R.id.painelAtalhosPrefs);
        viewFindViewById4.getClass();
        this.painelAtalhosPrefs = viewFindViewById4;
        View viewFindViewById5 = findViewById(C0203R.id.cardStatusShizuku);
        viewFindViewById5.getClass();
        this.cardStatusShizuku = (CardView) viewFindViewById5;
        View viewFindViewById6 = findViewById(C0203R.id.txtStatusShizuku);
        viewFindViewById6.getClass();
        this.txtStatusShizuku = (TextView) viewFindViewById6;
        View viewFindViewById7 = findViewById(C0203R.id.btnAtivarShizuku);
        viewFindViewById7.getClass();
        this.btnAtivarShizuku = (Button) viewFindViewById7;
        View viewFindViewById8 = findViewById(C0203R.id.txtStatusSobreposicao);
        viewFindViewById8.getClass();
        this.txtStatusSobreposicao = (TextView) viewFindViewById8;
        View viewFindViewById9 = findViewById(C0203R.id.btnPermissaoSobreposicao);
        viewFindViewById9.getClass();
        this.btnPermissaoSobreposicao = (Button) viewFindViewById9;
        View viewFindViewById10 = findViewById(C0203R.id.txtStatusUso);
        viewFindViewById10.getClass();
        this.txtStatusUso = (TextView) viewFindViewById10;
        View viewFindViewById11 = findViewById(C0203R.id.btnPermissaoUso);
        viewFindViewById11.getClass();
        this.btnPermissaoUso = (Button) viewFindViewById11;
        View viewFindViewById12 = findViewById(C0203R.id.txtContaEmail);
        viewFindViewById12.getClass();
        this.txtContaEmail = (TextView) viewFindViewById12;
        View viewFindViewById13 = findViewById(C0203R.id.btnSairConta);
        viewFindViewById13.getClass();
        this.btnSairConta = (Button) viewFindViewById13;
        View viewFindViewById14 = findViewById(C0203R.id.chipAtalhoEditarHud);
        viewFindViewById14.getClass();
        this.chipAtalhoEditarHud = (TextView) viewFindViewById14;
        View viewFindViewById15 = findViewById(C0203R.id.chipAtalhoDigitar);
        viewFindViewById15.getClass();
        this.chipAtalhoDigitar = (TextView) viewFindViewById15;
        View viewFindViewById16 = findViewById(C0203R.id.chipAtalhoConfig);
        viewFindViewById16.getClass();
        this.chipAtalhoConfig = (TextView) viewFindViewById16;
        TextView textView = this.txtContaEmail;
        if (textView == null) {
            hp0.m3207Q("txtContaEmail");
            throw null;
        }
        FirebaseUser firebaseUserCurrentUser = AccountRepository.INSTANCE.currentUser();
        if (firebaseUserCurrentUser == null || (email = firebaseUserCurrentUser.getEmail()) == null) {
            email = "—";
        }
        textView.setText(email);
        Button button = this.btnSairConta;
        if (button == null) {
            hp0.m3207Q("btnSairConta");
            throw null;
        }
        final int i = 6;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: vf1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ PreferencesActivity f11651b;

            {
                this.f11651b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                PreferencesActivity preferencesActivity = this.f11651b;
                switch (i2) {
                    case 0:
                        PreferencesActivity.onCreate$lambda$9(preferencesActivity, view);
                        break;
                    case 1:
                        preferencesActivity.abrirEscolhaModoAtivacao();
                        break;
                    case 2:
                        preferencesActivity.voltar();
                        break;
                    case 3:
                        PreferencesActivity.onCreate$lambda$12(preferencesActivity, view);
                        break;
                    case 4:
                        PreferencesActivity.onCreate$lambda$14(preferencesActivity, view);
                        break;
                    case 5:
                        PreferencesActivity.onCreate$lambda$15(preferencesActivity, view);
                        break;
                    case 6:
                        PreferencesActivity.onCreate$lambda$7(preferencesActivity, view);
                        break;
                    default:
                        PreferencesActivity.onCreate$lambda$8(preferencesActivity, view);
                        break;
                }
            }
        });
        final int i2 = 7;
        ((CardView) findViewById(C0203R.id.cardMenuPermissoes)).setOnClickListener(new View.OnClickListener(this) { // from class: vf1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ PreferencesActivity f11651b;

            {
                this.f11651b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                PreferencesActivity preferencesActivity = this.f11651b;
                switch (i3) {
                    case 0:
                        PreferencesActivity.onCreate$lambda$9(preferencesActivity, view);
                        break;
                    case 1:
                        preferencesActivity.abrirEscolhaModoAtivacao();
                        break;
                    case 2:
                        preferencesActivity.voltar();
                        break;
                    case 3:
                        PreferencesActivity.onCreate$lambda$12(preferencesActivity, view);
                        break;
                    case 4:
                        PreferencesActivity.onCreate$lambda$14(preferencesActivity, view);
                        break;
                    case 5:
                        PreferencesActivity.onCreate$lambda$15(preferencesActivity, view);
                        break;
                    case 6:
                        PreferencesActivity.onCreate$lambda$7(preferencesActivity, view);
                        break;
                    default:
                        PreferencesActivity.onCreate$lambda$8(preferencesActivity, view);
                        break;
                }
            }
        });
        final int i3 = 0;
        ((CardView) findViewById(C0203R.id.cardMenuAtalhos)).setOnClickListener(new View.OnClickListener(this) { // from class: vf1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ PreferencesActivity f11651b;

            {
                this.f11651b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i3;
                PreferencesActivity preferencesActivity = this.f11651b;
                switch (i4) {
                    case 0:
                        PreferencesActivity.onCreate$lambda$9(preferencesActivity, view);
                        break;
                    case 1:
                        preferencesActivity.abrirEscolhaModoAtivacao();
                        break;
                    case 2:
                        preferencesActivity.voltar();
                        break;
                    case 3:
                        PreferencesActivity.onCreate$lambda$12(preferencesActivity, view);
                        break;
                    case 4:
                        PreferencesActivity.onCreate$lambda$14(preferencesActivity, view);
                        break;
                    case 5:
                        PreferencesActivity.onCreate$lambda$15(preferencesActivity, view);
                        break;
                    case 6:
                        PreferencesActivity.onCreate$lambda$7(preferencesActivity, view);
                        break;
                    default:
                        PreferencesActivity.onCreate$lambda$8(preferencesActivity, view);
                        break;
                }
            }
        });
        final int i4 = 1;
        ((CardView) findViewById(C0203R.id.cardMenuModoAtivacao)).setOnClickListener(new View.OnClickListener(this) { // from class: vf1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ PreferencesActivity f11651b;

            {
                this.f11651b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i5 = i4;
                PreferencesActivity preferencesActivity = this.f11651b;
                switch (i5) {
                    case 0:
                        PreferencesActivity.onCreate$lambda$9(preferencesActivity, view);
                        break;
                    case 1:
                        preferencesActivity.abrirEscolhaModoAtivacao();
                        break;
                    case 2:
                        preferencesActivity.voltar();
                        break;
                    case 3:
                        PreferencesActivity.onCreate$lambda$12(preferencesActivity, view);
                        break;
                    case 4:
                        PreferencesActivity.onCreate$lambda$14(preferencesActivity, view);
                        break;
                    case 5:
                        PreferencesActivity.onCreate$lambda$15(preferencesActivity, view);
                        break;
                    case 6:
                        PreferencesActivity.onCreate$lambda$7(preferencesActivity, view);
                        break;
                    default:
                        PreferencesActivity.onCreate$lambda$8(preferencesActivity, view);
                        break;
                }
            }
        });
        final int i5 = 2;
        ((ImageButton) findViewById(C0203R.id.btnVoltar)).setOnClickListener(new View.OnClickListener(this) { // from class: vf1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ PreferencesActivity f11651b;

            {
                this.f11651b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i6 = i5;
                PreferencesActivity preferencesActivity = this.f11651b;
                switch (i6) {
                    case 0:
                        PreferencesActivity.onCreate$lambda$9(preferencesActivity, view);
                        break;
                    case 1:
                        preferencesActivity.abrirEscolhaModoAtivacao();
                        break;
                    case 2:
                        preferencesActivity.voltar();
                        break;
                    case 3:
                        PreferencesActivity.onCreate$lambda$12(preferencesActivity, view);
                        break;
                    case 4:
                        PreferencesActivity.onCreate$lambda$14(preferencesActivity, view);
                        break;
                    case 5:
                        PreferencesActivity.onCreate$lambda$15(preferencesActivity, view);
                        break;
                    case 6:
                        PreferencesActivity.onCreate$lambda$7(preferencesActivity, view);
                        break;
                    default:
                        PreferencesActivity.onCreate$lambda$8(preferencesActivity, view);
                        break;
                }
            }
        });
        getOnBackPressedDispatcher().m5753a(this, new ia1() { // from class: com.example.ssmousepro.PreferencesActivity.onCreate.6
            {
                super(true);
            }

            @Override // p000.ia1
            public void handleOnBackPressed() {
                AtalhosPrefs.Acao acao = PreferencesActivity.this.acaoCapturando;
                PreferencesActivity preferencesActivity = PreferencesActivity.this;
                if (acao != null) {
                    preferencesActivity.cancelarCapturaAtalho();
                } else {
                    preferencesActivity.voltar();
                }
            }
        });
        mostrarTela(TelaPrefs.MENU);
        Button button2 = this.btnPermissaoSobreposicao;
        if (button2 == null) {
            hp0.m3207Q("btnPermissaoSobreposicao");
            throw null;
        }
        final int i6 = 3;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: vf1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ PreferencesActivity f11651b;

            {
                this.f11651b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i7 = i6;
                PreferencesActivity preferencesActivity = this.f11651b;
                switch (i7) {
                    case 0:
                        PreferencesActivity.onCreate$lambda$9(preferencesActivity, view);
                        break;
                    case 1:
                        preferencesActivity.abrirEscolhaModoAtivacao();
                        break;
                    case 2:
                        preferencesActivity.voltar();
                        break;
                    case 3:
                        PreferencesActivity.onCreate$lambda$12(preferencesActivity, view);
                        break;
                    case 4:
                        PreferencesActivity.onCreate$lambda$14(preferencesActivity, view);
                        break;
                    case 5:
                        PreferencesActivity.onCreate$lambda$15(preferencesActivity, view);
                        break;
                    case 6:
                        PreferencesActivity.onCreate$lambda$7(preferencesActivity, view);
                        break;
                    default:
                        PreferencesActivity.onCreate$lambda$8(preferencesActivity, view);
                        break;
                }
            }
        });
        Button button3 = this.btnPermissaoUso;
        if (button3 == null) {
            hp0.m3207Q("btnPermissaoUso");
            throw null;
        }
        final int i7 = 4;
        button3.setOnClickListener(new View.OnClickListener(this) { // from class: vf1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ PreferencesActivity f11651b;

            {
                this.f11651b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i8 = i7;
                PreferencesActivity preferencesActivity = this.f11651b;
                switch (i8) {
                    case 0:
                        PreferencesActivity.onCreate$lambda$9(preferencesActivity, view);
                        break;
                    case 1:
                        preferencesActivity.abrirEscolhaModoAtivacao();
                        break;
                    case 2:
                        preferencesActivity.voltar();
                        break;
                    case 3:
                        PreferencesActivity.onCreate$lambda$12(preferencesActivity, view);
                        break;
                    case 4:
                        PreferencesActivity.onCreate$lambda$14(preferencesActivity, view);
                        break;
                    case 5:
                        PreferencesActivity.onCreate$lambda$15(preferencesActivity, view);
                        break;
                    case 6:
                        PreferencesActivity.onCreate$lambda$7(preferencesActivity, view);
                        break;
                    default:
                        PreferencesActivity.onCreate$lambda$8(preferencesActivity, view);
                        break;
                }
            }
        });
        Button button4 = this.btnAtivarShizuku;
        if (button4 == null) {
            hp0.m3207Q("btnAtivarShizuku");
            throw null;
        }
        final int i8 = 5;
        button4.setOnClickListener(new View.OnClickListener(this) { // from class: vf1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ PreferencesActivity f11651b;

            {
                this.f11651b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i9 = i8;
                PreferencesActivity preferencesActivity = this.f11651b;
                switch (i9) {
                    case 0:
                        PreferencesActivity.onCreate$lambda$9(preferencesActivity, view);
                        break;
                    case 1:
                        preferencesActivity.abrirEscolhaModoAtivacao();
                        break;
                    case 2:
                        preferencesActivity.voltar();
                        break;
                    case 3:
                        PreferencesActivity.onCreate$lambda$12(preferencesActivity, view);
                        break;
                    case 4:
                        PreferencesActivity.onCreate$lambda$14(preferencesActivity, view);
                        break;
                    case 5:
                        PreferencesActivity.onCreate$lambda$15(preferencesActivity, view);
                        break;
                    case 6:
                        PreferencesActivity.onCreate$lambda$7(preferencesActivity, view);
                        break;
                    default:
                        PreferencesActivity.onCreate$lambda$8(preferencesActivity, view);
                        break;
                }
            }
        });
        TextView textView2 = this.chipAtalhoEditarHud;
        if (textView2 == null) {
            hp0.m3207Q("chipAtalhoEditarHud");
            throw null;
        }
        vincularChipAtalho(textView2, AtalhosPrefs.Acao.EDITAR_HUD);
        TextView textView3 = this.chipAtalhoDigitar;
        if (textView3 == null) {
            hp0.m3207Q("chipAtalhoDigitar");
            throw null;
        }
        vincularChipAtalho(textView3, AtalhosPrefs.Acao.DIGITAR);
        TextView textView4 = this.chipAtalhoConfig;
        if (textView4 == null) {
            hp0.m3207Q("chipAtalhoConfig");
            throw null;
        }
        vincularChipAtalho(textView4, AtalhosPrefs.Acao.CONFIG);
        atualizarChipsAtalhos();
        ms1 ms1Var = this.shizukuBinderListener;
        IBinder iBinder = ps1.f9128a;
        Objects.requireNonNull(ms1Var);
        ArrayList arrayList = ps1.f9135h;
        synchronized (arrayList) {
            arrayList.add(new ks1(ms1Var));
        }
        ls1 ls1Var = this.shizukuBinderDeadListener;
        synchronized (arrayList) {
            ps1.f9136i.add(new ks1(ls1Var));
        }
        ns1 ns1Var = this.shizukuPermissionListener;
        synchronized (arrayList) {
            ps1.f9137j.add(new ks1(ns1Var));
        }
    }

    @Override // p000.AbstractActivityC1469u6, androidx.fragment.app.AbstractActivityC0053q, android.app.Activity
    public void onDestroy() {
        final ms1 ms1Var = this.shizukuBinderListener;
        ArrayList arrayList = ps1.f9135h;
        synchronized (arrayList) {
            final int i = 2;
            arrayList.removeIf(new Predicate() { // from class: gs1
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    int i2 = i;
                    Object obj2 = ms1Var;
                    switch (i2) {
                        case 0:
                            return ((ks1) obj).f5997a == ((ls1) obj2);
                        case 1:
                            return ((ks1) obj).f5997a == ((ns1) obj2);
                        default:
                            return ((ks1) obj).f5997a == ((ms1) obj2);
                    }
                }
            });
        }
        final ls1 ls1Var = this.shizukuBinderDeadListener;
        synchronized (arrayList) {
            final int i2 = 0;
            ps1.f9136i.removeIf(new Predicate() { // from class: gs1
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    int i3 = i2;
                    Object obj2 = ls1Var;
                    switch (i3) {
                        case 0:
                            return ((ks1) obj).f5997a == ((ls1) obj2);
                        case 1:
                            return ((ks1) obj).f5997a == ((ns1) obj2);
                        default:
                            return ((ks1) obj).f5997a == ((ms1) obj2);
                    }
                }
            });
        }
        final ns1 ns1Var = this.shizukuPermissionListener;
        synchronized (arrayList) {
            final int i3 = 1;
            ps1.f9137j.removeIf(new Predicate() { // from class: gs1
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    int i4 = i3;
                    Object obj2 = ns1Var;
                    switch (i4) {
                        case 0:
                            return ((ks1) obj).f5997a == ((ls1) obj2);
                        case 1:
                            return ((ks1) obj).f5997a == ((ns1) obj2);
                        default:
                            return ((ks1) obj).f5997a == ((ms1) obj2);
                    }
                }
            });
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.AbstractActivityC0053q, android.app.Activity
    public void onResume() {
        super.onResume();
        atualizarInterface();
        atualizarChipsAtalhos();
        if (ActivationModePrefs.INSTANCE.modo(this) == ModoAtivacao.WIFI) {
            WifiAdbManager.INSTANCE.refreshPingAsync(new C1165o0(this, 5));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1571wy abstractC1571wy) {
            this();
        }

        private Companion() {
        }
    }
}
