package com.example.ssmousepro;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Service;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.hardware.display.DisplayManager;
import android.hardware.input.InputManager;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.Editable;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import com.example.ssmousepro.FloatingService;
import com.example.ssmousepro.account.PlayTimeSessionManager;
import com.example.ssmousepro.activation.ActivationModePrefs;
import com.example.ssmousepro.activation.ModoAtivacao;
import com.example.ssmousepro.activation.PrivilegeGate;
import com.example.ssmousepro.activation.PrivilegeShell;
import com.example.ssmousepro.activation.WifiDaemonClient;
import com.example.ssmousepro.hud.AnalogStickHudView;
import com.example.ssmousepro.hud.FpsFfGraficoView;
import com.example.ssmousepro.hud.FpsViewHudView;
import com.example.ssmousepro.injection.AimGraphConfig;
import com.example.ssmousepro.injection.FpsAcelLimiarConfig;
import com.example.ssmousepro.injection.FpsAntiBlockModo;
import com.example.ssmousepro.injection.FpsDesacelSincronizador;
import com.example.ssmousepro.injection.FpsFfAntiAceleracaoConfig;
import com.example.ssmousepro.injection.FpsLowSpeedGainConfig;
import com.example.ssmousepro.injection.InjectionDaemonManager;
import com.example.ssmousepro.injection.InjectionProtocol;
import com.example.ssmousepro.injection.LinuxInputConstants;
import com.example.ssmousepro.injection.PipelineMonitorText;
import com.example.ssmousepro.injection.TouchPipeline;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.AbstractC0616eu;
import p000.AbstractC1308pu;
import p000.AbstractC1337qm;
import p000.AbstractC1377rp;
import p000.AbstractC1414sp;
import p000.AbstractC1451tp;
import p000.AbstractC1571wy;
import p000.C0543cu;
import p000.C0694gy;
import p000.C0720hn;
import p000.C1133n5;
import p000.C1284p6;
import p000.C1357r5;
import p000.DialogInterfaceC1394s5;
import p000.EnumC1530vu;
import p000.InterfaceC0579du;
import p000.InterfaceC1311px;
import p000.RunnableC1059l5;
import p000.RunnableC1430t4;
import p000.RunnableC1467u4;
import p000.ac0;
import p000.bc0;
import p000.bc1;
import p000.bd0;
import p000.bo0;
import p000.cc0;
import p000.ch0;
import p000.co0;
import p000.dc0;
import p000.ed0;
import p000.f40;
import p000.fw1;
import p000.gb0;
import p000.gc0;
import p000.gw1;
import p000.hb0;
import p000.hp0;
import p000.hw1;
import p000.ib0;
import p000.ic0;
import p000.jb0;
import p000.jc0;
import p000.jd0;
import p000.kb0;
import p000.kc0;
import p000.lb0;
import p000.lc0;
import p000.mc0;
import p000.mg0;
import p000.n40;
import p000.nb0;
import p000.nc0;
import p000.ny1;
import p000.ob0;
import p000.og0;
import p000.p32;
import p000.pb0;
import p000.pc0;
import p000.qo0;
import p000.rb0;
import p000.tb0;
import p000.ua0;
import p000.ub0;
import p000.uc0;
import p000.vc0;
import p000.wb0;
import p000.wc0;
import p000.wy0;
import p000.xb0;
import p000.xc0;
import p000.ys0;
import p000.z32;
import p000.zb0;
import p000.zf1;
import p000.zv1;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class FloatingService extends Service {
    private static final float BALL_OPACITY_MIN = 0.2f;
    private static final int BALL_SIZE_MAX = 110;
    private static final int BALL_SIZE_MIN = 40;
    private static final int BALL_SIZE_PADRAO = 65;
    private static final int CURSOR_FORA_TELA = -8000;
    private static final int CURSOR_NIVEL_MAX = 14;
    private static final int CURSOR_NIVEL_MIN = 1;
    private static final int CURSOR_NIVEL_PADRAO = 7;
    private static final int CURSOR_PONTA_X_DP = 5;
    private static final int CURSOR_PONTA_Y_DP = 5;
    private static final int CURSOR_SIZE_MAX = 64;
    private static final int CURSOR_SIZE_MIN = 16;
    private static final int CURSOR_SIZE_PADRAO = 28;
    private static final int DPI_MAX = 640;
    private static final int DPI_MIN = 120;
    private static final String KEY_AJUSTE_AUTO = "cfg_ajuste_tela_auto";
    private static final String KEY_AJUSTE_UMA_VEZ = "cfg_ajuste_tela_uma_vez";
    private static final String KEY_BALL_OPACITY = "cfg_ball_opacity";
    private static final String KEY_BALL_SIZE = "cfg_ball_size_dp";
    private static final String KEY_CURSOR_COLOR = "cfg_cursor_color";
    private static final String KEY_CURSOR_LEVEL = "cfg_cursor_level";
    private static final String KEY_CURSOR_SIZE = "cfg_cursor_size_dp";
    private static final String KEY_DPI_DESEJADA = "cfg_dpi_desejada";
    private static final String KEY_EXIBIR_HUD_LAST = "hud_exibir_jogo_last";
    private static final String KEY_EXTERIOR_GRAFICO_PARTIDA = "cfg_exterior_grafico_partida";
    private static final String KEY_HUD_PRESET_VER = "hud_preset_freefire_ver";
    private static final String KEY_MONITOR_CAMPOS = "cfg_monitor_campos";
    private static final String KEY_MONITOR_MAPEADOR = "cfg_monitor_mapeador";
    private static final String KEY_MOUSE_POLL_HZ = "cfg_mouse_poll_hz";
    private static final String KEY_MOUSE_SENSITIVITY = "mouse_sensitivity";
    private static final String KEY_RES_DESEJADA_H = "cfg_res_desejada_h";
    private static final String KEY_RES_DESEJADA_W = "cfg_res_desejada_w";
    private static final String KEY_RES_NATIVA_H = "cfg_res_nativa_h";
    private static final String KEY_RES_NATIVA_W = "cfg_res_nativa_w";
    private static final String KEY_SENS_XY_PADRAO_V3 = "fps_sens_xy_padrao_v3";
    private static final String KEY_SENS_X_UI_REF_V2 = "fps_sens_x_ui_ref_v2";
    private static final int MOUSE_POLL_NATIVE = 0;
    private static final int MOUSE_POLL_PADRAO = 250;
    private static final float OPACIDADE_JOGO_PADRAO = 0.3f;
    private static final String PREFIXO_MAPEAMENTO_HUD = "mapeamento_hud_";
    private static final String PREFS_NAME = "SSMousePrefs";
    private static final int RAPIDEZ_ANALOG_PADRAO = 200;
    private static final float SENSI_MAX = 3.0f;
    private static final float SENSI_MIN = 0.5f;
    private static final float SENSI_STEP = 0.1f;
    private static final float SENS_FPS_X_PADRAO = 1.0f;
    private static final float SENS_FPS_Y_PADRAO = 0.5f;
    private static final String SUFIXO_EXIBIR_HUD = "hud_exibir_jogo_";
    private static final String SUFIXO_OPACIDADE_HUD = "hud_opacidade_jogo_";
    private static final String TAG_HUD_LIFECYCLE = "HUD_LIFECYCLE";
    private static final int TAMANHO_ANALOG_MAX_DP = 200;
    private static final int TAMANHO_ANALOG_MIN_DP = 40;
    private static final int TAMANHO_ANALOG_PADRAO_DP = 120;
    private static final String TIPO_ANALOGICO = "ANALOGICO";
    private static final String TIPO_FPS = "FPS";
    private static final String TIPO_TOQUE = "TOQUE";
    private static final String TIPO_TOQUE_REP = "TOQUE_REP";
    private static final String TOQUE_MODO_PRESS = "press";
    private static final String TOQUE_MODO_TAP = "tap";
    private static final int TOQUE_REP_COUNT_LARGURA_DP = 28;
    private static final int TOQUE_REP_COUNT_MAX = 50;
    private static final int TOQUE_REP_COUNT_PADRAO = 5;
    private static final int TOQUE_REP_TAP_MS_PRESS = 80;
    private static final int TOQUE_TAP_MS_MAX = 500;
    private static final int TOQUE_TAP_MS_PADRAO = 1;
    private static volatile boolean isRunning;
    private boolean ajusteTelaAuto;
    private volatile int ajusteTelaGeracao;
    private boolean ajusteTelaUmaVez;
    private FrameLayout analogWrapperEmEdicao;
    private volatile boolean ativacaoDaemonEmCurso;
    private final Object ativacaoDaemonLock;
    private final FloatingService$atualizarDebugExteriorFps$1 atualizarDebugExteriorFps;
    private final FloatingService$atualizarMonitorMapeador$1 atualizarMonitorMapeador;
    private volatile long bloqueioReaplicarAjusteAteMs;
    private boolean bolinhaVisivel;
    private long capturaIgnorarMouseAteMs;
    private boolean carregandoPrefsHud;
    private final FloatingService$configCallback$1 configCallback;
    private LinearLayout configConteudoView;
    private View configPanelView;
    private TextView configTituloView;
    private int contadorForaDoJogo;
    private final int corPainelAccent;
    private final int corPainelCard;
    private final int corPainelFundo;
    private final int corPainelTexto;
    private final int corPainelTexto2;
    private float cursorAccX;
    private float cursorAccY;
    private int cursorEventosPendentes;
    private boolean cursorFlushAgendado;
    private int cursorMaoMargemX;
    private int cursorMaoMargemY;
    private boolean cursorMaoVisivel;
    private int cursorPendDx;
    private int cursorPendDy;
    private final Object cursorUiLock;
    private volatile boolean debugExteriorEmCurso;
    private DisplayManager.DisplayListener displayListener;
    private int dpiAplicada;
    private int dpiDesejada;
    private boolean editMousePressionado;
    private long editTouchDownTime;
    private volatile boolean encerramentoDisparado;
    private og0 escutaAnalogAoCapturar;
    private og0 escutaAoCapturar;
    private EditText escutaCampoAnalog;
    private TextView escutaConteudo;
    private og0 escutaFpsAoCapturar;
    private FpsViewHudView escutaFpsView;
    private FrameLayout escutaFpsWrapper;
    private boolean estaRecolhida;
    private final PipelineMonitorText.Estado estadoMonitorMapeador;
    private boolean estavaNoJogo;
    private final ExecutorService executorDebugExterior;
    private final ExecutorService executorMonitorMapeador;
    private View floatingView;
    private final Runnable flushCursorUi;
    private boolean fpsModoAtivo;
    private FrameLayout fpsWrapperEmEdicao;
    private View hudCursorVirtualMao;
    private boolean hudEmModoEdicao;
    private boolean hudEmModoJogo;
    private boolean hudJanelaNoTopo;
    private ViewGroup hudOrdemCacheRoot;
    private WindowManager.LayoutParams hudOverlayParams;
    private View hudOverlayView;
    private View hudPainelExteriorCurva;
    private View hudPainelSuperior;
    private View hudPanelConfigAnalogico;
    private View hudPanelConfigFps;
    private View hudPanelConfigToque;
    private View hudPanelConfigToqueRep;
    private boolean ignorarSwitchAjusteTela;
    private final long intervaloDebugExteriorMs;
    private final long intervaloMonitorMapeadorMs;
    private final FloatingService$listenerCursorVirtual$1 listenerCursorVirtual;
    private final FloatingService$listenerEstadoMira$1 listenerEstadoMira;
    private InputManager.InputDeviceListener listenerPerifericosHotplug;
    private volatile boolean matarAposEncerrar;
    private View menuView;
    private boolean modoDigitarAtivo;
    private boolean monitorMapeadorAtivo;
    private volatile boolean monitorMapeadorEmCurso;
    private Runnable monitorRunnable;
    private Context overlayContext;
    private int overlayDisplayId;
    private boolean overrideDpiAtivo;
    private boolean overrideResAtivo;
    private String pacoteDoJogo;
    private boolean painelConfigRecolhido;
    private final FloatingService$provedorPosicaoCursor$1 provedorPosicaoCursor;
    private int resAplicadaH;
    private int resAplicadaW;
    private int resDesejadaH;
    private int resDesejadaW;
    private boolean resNativaCapturada;
    private int resNativaH;
    private int resNativaW;
    private final CompletableJob serviceJob;
    private final CoroutineScope serviceScope;
    private boolean toqueRepAvancadoVisivel;
    private FrameLayout toqueRepWrapperEmEdicao;
    private FrameLayout toqueWrapperEmEdicao;
    private volatile String ultimaAssinaturaMapeamentoDaemon;
    private volatile long ultimaAtivacaoDaemonMs;
    private long ultimaEnsureRedeMs;
    private long ultimaVerificacaoSaudeMs;
    private long ultimoLogCursorBacklogMs;
    private WindowManager windowManager;
    public static final Companion Companion = new Companion(null);
    private static final List<bc1> MOUSE_POLL_OPCOES = AbstractC1414sp.m6124n0(new bc1("Nativo", 0), new bc1("125 Hz", 125), new bc1("250 Hz", 250), new bc1("500 Hz", 500), new bc1("1000 Hz", 1000));
    private static final List<bc1> CORES_CURSOR = AbstractC1414sp.m6124n0(new bc1("Branco", -1), new bc1("Preto", -16777216), new bc1("Vermelho", -1754827), new bc1("Verde", -12345273), new bc1("Azul", -14776091), new bc1("Amarelo", -141259), new bc1("Lilás", -6521888), new bc1("Rosa", -1294214));
    private static final Set<String> TECLAS_ANALOGICO = AbstractC1337qm.m5531c0("W", "A", "S", "D");
    private float opacidadeNoJogo = OPACIDADE_JOGO_PADRAO;
    private boolean exibirHudDuranteJogo = true;
    private float opacidadeDasTeclasGlobal = 0.8f;
    private float mouseSensitivity = 1.0f;
    private int tamanhoCursorDp = 28;
    private int nivelVelocidadeCursor = 7;
    private int corCursor = -1;
    private int tamanhoBolinhaDp = 65;
    private float opacidadeBolinha = 1.0f;
    private int mousePollHz = 250;
    private Set<String> monitorCamposVisiveis = AbstractC1377rp.m5868C0(PipelineMonitorText.INSTANCE.getIDS_TODOS());
    private final Mutex ajusteTelaMutex = MutexKt.Mutex$default(false, 1, null);
    private final Handler handlerMonitor = new Handler(Looper.getMainLooper());

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static final class DebugFfLive {
        private final float efetivo;
        private final float origem;
        private final float sens;
        private final float tela;

        /* JADX INFO: renamed from: x */
        private final float f1882x;

        public DebugFfLive(float f, float f2, float f3, float f4, float f5) {
            this.f1882x = f;
            this.origem = f2;
            this.efetivo = f3;
            this.sens = f4;
            this.tela = f5;
        }

        public static /* synthetic */ DebugFfLive copy$default(DebugFfLive debugFfLive, float f, float f2, float f3, float f4, float f5, int i, Object obj) {
            if ((i & 1) != 0) {
                f = debugFfLive.f1882x;
            }
            if ((i & 2) != 0) {
                f2 = debugFfLive.origem;
            }
            if ((i & 4) != 0) {
                f3 = debugFfLive.efetivo;
            }
            if ((i & 8) != 0) {
                f4 = debugFfLive.sens;
            }
            if ((i & 16) != 0) {
                f5 = debugFfLive.tela;
            }
            float f6 = f5;
            float f7 = f3;
            return debugFfLive.copy(f, f2, f7, f4, f6);
        }

        public final float component1() {
            return this.f1882x;
        }

        public final float component2() {
            return this.origem;
        }

        public final float component3() {
            return this.efetivo;
        }

        public final float component4() {
            return this.sens;
        }

        public final float component5() {
            return this.tela;
        }

        public final DebugFfLive copy(float f, float f2, float f3, float f4, float f5) {
            return new DebugFfLive(f, f2, f3, f4, f5);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DebugFfLive)) {
                return false;
            }
            DebugFfLive debugFfLive = (DebugFfLive) obj;
            return Float.compare(this.f1882x, debugFfLive.f1882x) == 0 && Float.compare(this.origem, debugFfLive.origem) == 0 && Float.compare(this.efetivo, debugFfLive.efetivo) == 0 && Float.compare(this.sens, debugFfLive.sens) == 0 && Float.compare(this.tela, debugFfLive.tela) == 0;
        }

        public final float getEfetivo() {
            return this.efetivo;
        }

        public final float getOrigem() {
            return this.origem;
        }

        public final float getSens() {
            return this.sens;
        }

        public final float getTela() {
            return this.tela;
        }

        public final float getX() {
            return this.f1882x;
        }

        public int hashCode() {
            return Float.hashCode(this.tela) + ((Float.hashCode(this.sens) + ((Float.hashCode(this.efetivo) + ((Float.hashCode(this.origem) + (Float.hashCode(this.f1882x) * 31)) * 31)) * 31)) * 31);
        }

        public String toString() {
            return "DebugFfLive(x=" + this.f1882x + ", origem=" + this.origem + ", efetivo=" + this.efetivo + ", sens=" + this.sens + ", tela=" + this.tela + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AtalhosPrefs.Acao.values().length];
            try {
                iArr[AtalhosPrefs.Acao.EDITAR_HUD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AtalhosPrefs.Acao.DIGITAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AtalhosPrefs.Acao.CONFIG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FpsAntiBlockModo.values().length];
            try {
                iArr2[FpsAntiBlockModo.SS_MOUSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[FpsAntiBlockModo.GG_MOUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[FpsAntiBlockModo.BLUESTACKS.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[FpsAntiBlockModo.SSPRO.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: renamed from: com.example.ssmousepro.FloatingService$ajustarDisplay$1 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.FloatingService", m5373f = "FloatingService.kt", m5374l = {6428, 6432, 6433, 6434, 6435, 6436, 6437}, m5375m = "ajustarDisplay")
    public static final class C01461 extends AbstractC0616eu {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C01461(InterfaceC0579du interfaceC0579du) {
            super(interfaceC0579du);
        }

        @Override // p000.AbstractC0018ah
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FloatingService.this.ajustarDisplay(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.example.ssmousepro.FloatingService$aplicarDpiOverride$1 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.FloatingService", m5373f = "FloatingService.kt", m5374l = {6485}, m5375m = "aplicarDpiOverride")
    public static final class C01481 extends AbstractC0616eu {
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C01481(InterfaceC0579du interfaceC0579du) {
            super(interfaceC0579du);
        }

        @Override // p000.AbstractC0018ah
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FloatingService.this.aplicarDpiOverride(false, this);
        }
    }

    /* JADX INFO: renamed from: com.example.ssmousepro.FloatingService$aplicarMousePollingRate$1 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.FloatingService$aplicarMousePollingRate$1", m5373f = "FloatingService.kt", m5374l = {5463}, m5375m = "invokeSuspend")
    public static final class C01491 extends ny1 implements ch0 {
        final /* synthetic */ int $hz;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01491(int i, InterfaceC0579du interfaceC0579du) {
            super(2, interfaceC0579du);
            this.$hz = i;
        }

        @Override // p000.AbstractC0018ah
        public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
            return new C01491(this.$hz, interfaceC0579du);
        }

        @Override // p000.ch0
        public final Object invoke(CoroutineScope coroutineScope, InterfaceC0579du interfaceC0579du) {
            return ((C01491) create(coroutineScope, interfaceC0579du)).invokeSuspend(z32.f13265a);
        }

        @Override // p000.AbstractC0018ah
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                ua0.m6440Z(obj);
                InjectionDaemonManager injectionDaemonManager = InjectionDaemonManager.INSTANCE;
                String strM3609g = jd0.m3609g(this.$hz, "MOUSE_POLL ");
                this.label = 1;
                Object objEnviarComando = injectionDaemonManager.enviarComando(strM3609g, this);
                EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
                if (objEnviarComando == enumC1530vu) {
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

    /* JADX INFO: renamed from: com.example.ssmousepro.FloatingService$aplicarOverridesTela$1 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.FloatingService", m5373f = "FloatingService.kt", m5374l = {7156, 6321, 6323}, m5375m = "aplicarOverridesTela")
    public static final class C01501 extends AbstractC0616eu {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C01501(InterfaceC0579du interfaceC0579du) {
            super(interfaceC0579du);
        }

        @Override // p000.AbstractC0018ah
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FloatingService.this.aplicarOverridesTela(this);
        }
    }

    /* JADX INFO: renamed from: com.example.ssmousepro.FloatingService$aplicarResolucaoOverride$1 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.FloatingService", m5373f = "FloatingService.kt", m5374l = {6450}, m5375m = "aplicarResolucaoOverride")
    public static final class C01511 extends AbstractC0616eu {
        int I$0;
        int I$1;
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C01511(InterfaceC0579du interfaceC0579du) {
            super(interfaceC0579du);
        }

        @Override // p000.AbstractC0018ah
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FloatingService.this.aplicarResolucaoOverride(false, this);
        }
    }

    /* JADX INFO: renamed from: com.example.ssmousepro.FloatingService$aplicarVelocidadePonteiroSistema$1 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.FloatingService$aplicarVelocidadePonteiroSistema$1", m5373f = "FloatingService.kt", m5374l = {5481}, m5375m = "invokeSuspend")
    public static final class C01521 extends ny1 implements ch0 {
        final /* synthetic */ int $nivel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01521(int i, InterfaceC0579du interfaceC0579du) {
            super(2, interfaceC0579du);
            this.$nivel = i;
        }

        @Override // p000.AbstractC0018ah
        public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
            return FloatingService.this.new C01521(this.$nivel, interfaceC0579du);
        }

        @Override // p000.ch0
        public final Object invoke(CoroutineScope coroutineScope, InterfaceC0579du interfaceC0579du) {
            return ((C01521) create(coroutineScope, interfaceC0579du)).invokeSuspend(z32.f13265a);
        }

        @Override // p000.AbstractC0018ah
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                ua0.m6440Z(obj);
                InjectionDaemonManager injectionDaemonManager = InjectionDaemonManager.INSTANCE;
                String strM3609g = jd0.m3609g(FloatingService.this.nivelParaPointerSpeed(this.$nivel), "POINTER_SPEED ");
                this.label = 1;
                Object objEnviarComando = injectionDaemonManager.enviarComando(strM3609g, this);
                EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
                if (objEnviarComando == enumC1530vu) {
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

    /* JADX INFO: renamed from: com.example.ssmousepro.FloatingService$ativarTecladoNoDaemon$2 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.FloatingService$ativarTecladoNoDaemon$2", m5373f = "FloatingService.kt", m5374l = {1851}, m5375m = "invokeSuspend")
    public static final class C01532 extends ny1 implements ch0 {
        final /* synthetic */ String $assinaturaMapeamento;
        final /* synthetic */ int $curH;
        final /* synthetic */ int $curW;
        final /* synthetic */ boolean $forcar;
        final /* synthetic */ String $json;
        int I$0;
        int I$1;
        int I$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01532(boolean z, String str, String str2, int i, int i2, InterfaceC0579du interfaceC0579du) {
            super(2, interfaceC0579du);
            this.$forcar = z;
            this.$assinaturaMapeamento = str;
            this.$json = str2;
            this.$curW = i;
            this.$curH = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(FloatingService floatingService) throws JSONException {
            floatingService.ativacaoDaemonEmCurso = false;
            floatingService.ativarTecladoNoDaemon(true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$1(FloatingService floatingService) {
            floatingService.registrarCallbacksDaemon();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$2(FloatingService floatingService) {
            floatingService.registrarCallbacksDaemon();
            floatingService.atualizarVisibilidadeGraficoMira();
        }

        @Override // p000.AbstractC0018ah
        public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
            return FloatingService.this.new C01532(this.$forcar, this.$assinaturaMapeamento, this.$json, this.$curW, this.$curH, interfaceC0579du);
        }

        @Override // p000.ch0
        public final Object invoke(CoroutineScope coroutineScope, InterfaceC0579du interfaceC0579du) {
            return ((C01532) create(coroutineScope, interfaceC0579du)).invokeSuspend(z32.f13265a);
        }

        /* JADX WARN: Code duplicated, block: B:43:0x0170  */
        @Override // p000.AbstractC0018ah
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i;
            int i2 = this.label;
            z32 z32Var = z32.f13265a;
            int i3 = 1;
            int i4 = 0;
            try {
                if (i2 == 0) {
                    ua0.m6440Z(obj);
                    try {
                        InjectionDaemonManager injectionDaemonManager = InjectionDaemonManager.INSTANCE;
                        if (injectionDaemonManager.isDaemonVinculado()) {
                            FpsDesacelSincronizador.INSTANCE.aplicarValoresDoCodigo();
                            if (this.$forcar || !hp0.m3214e(FloatingService.this.ultimaAssinaturaMapeamentoDaemon, this.$assinaturaMapeamento)) {
                                injectionDaemonManager.enqueueComando(InjectionProtocol.MAP_CLEAR);
                                bc1 bc1VarDimensaoTelaParaMapeamento = FloatingService.this.dimensaoTelaParaMapeamento();
                                int iIntValue = ((Number) bc1VarDimensaoTelaParaMapeamento.f1292a).intValue();
                                int iIntValue2 = ((Number) bc1VarDimensaoTelaParaMapeamento.f1293b).intValue();
                                injectionDaemonManager.enqueueComando("DISPLAY_ID " + FloatingService.this.overlayDisplayId);
                                injectionDaemonManager.enqueueComando("SCREEN " + iIntValue + " " + iIntValue2);
                                FloatingService floatingService = FloatingService.this;
                                String str = this.$json;
                                this.I$0 = 0;
                                this.I$1 = iIntValue;
                                this.I$2 = iIntValue2;
                                this.label = 1;
                                obj = floatingService.enviarBindingsDoJson(str, iIntValue, iIntValue2, this);
                                EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
                                if (obj == enumC1530vu) {
                                    return enumC1530vu;
                                }
                                i = 0;
                            } else {
                                injectionDaemonManager.enqueueComando(InjectionProtocol.INPUT_ENSURE);
                                injectionDaemonManager.enqueueComando("NAV_LOCK 0");
                                if (!DevToolsGate.INSTANCE.getLiberado()) {
                                    FloatingService.this.sincronizarFiltrosProdutoNoDaemon();
                                }
                                FloatingService.this.handlerMonitor.post(new RunnableC0204a(FloatingService.this, i3));
                            }
                            FloatingService.this.ultimaAtivacaoDaemonMs = System.currentTimeMillis();
                        } else {
                            Log.w(FloatingService.TAG_HUD_LIFECYCLE, "Daemon indisponível — tentando reativar mapeamento");
                            FloatingService.this.handlerMonitor.postDelayed(new RunnableC0204a(FloatingService.this, i4), 400L);
                        }
                        FloatingService.this.ativacaoDaemonEmCurso = false;
                        return z32Var;
                    } catch (Throwable th) {
                        th = th;
                        i3 = 0;
                        if (i3 != 0) {
                            FloatingService.this.ultimaAtivacaoDaemonMs = System.currentTimeMillis();
                        }
                        FloatingService.this.ativacaoDaemonEmCurso = false;
                        throw th;
                    }
                }
                if (i2 != 1) {
                    f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = this.I$0;
                try {
                    ua0.m6440Z(obj);
                } catch (Throwable th2) {
                    th = th2;
                    i3 = i;
                    if (i3 != 0) {
                        FloatingService.this.ultimaAtivacaoDaemonMs = System.currentTimeMillis();
                    }
                    FloatingService.this.ativacaoDaemonEmCurso = false;
                    throw th;
                }
                ((Number) obj).intValue();
                if (!DevToolsGate.INSTANCE.getLiberado()) {
                    FloatingService.this.sincronizarFiltrosProdutoNoDaemon();
                }
                InjectionDaemonManager injectionDaemonManager2 = InjectionDaemonManager.INSTANCE;
                injectionDaemonManager2.enqueueComando("MOUSE_SENS " + FloatingService.this.getMouseSensitivity());
                injectionDaemonManager2.enqueueComando("MOUSE_POLL " + FloatingService.this.mousePollHz);
                injectionDaemonManager2.enqueueComando(AtalhosPrefs.INSTANCE.carregar(FloatingService.this).comandoDaemon());
                FloatingService.this.enviarSincronizacaoDesacelFps();
                injectionDaemonManager2.enqueueComando(InjectionProtocol.INPUT_START);
                injectionDaemonManager2.enqueueComando("NAV_LOCK 0");
                FloatingService.this.ultimaAssinaturaMapeamentoDaemon = this.$assinaturaMapeamento;
                FloatingService.this.handlerMonitor.post(new RunnableC0204a(FloatingService.this, 2));
                FloatingService.this.ultimaAtivacaoDaemonMs = System.currentTimeMillis();
                FloatingService.this.ativacaoDaemonEmCurso = false;
                return z32Var;
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    /* JADX INFO: renamed from: com.example.ssmousepro.FloatingService$definirDpiDesejada$1 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.FloatingService$definirDpiDesejada$1", m5373f = "FloatingService.kt", m5374l = {6261}, m5375m = "invokeSuspend")
    public static final class C01591 extends ny1 implements ch0 {
        int label;

        public C01591(InterfaceC0579du interfaceC0579du) {
            super(2, interfaceC0579du);
        }

        @Override // p000.AbstractC0018ah
        public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
            return FloatingService.this.new C01591(interfaceC0579du);
        }

        @Override // p000.ch0
        public final Object invoke(CoroutineScope coroutineScope, InterfaceC0579du interfaceC0579du) {
            return ((C01591) create(coroutineScope, interfaceC0579du)).invokeSuspend(z32.f13265a);
        }

        @Override // p000.AbstractC0018ah
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                ua0.m6440Z(obj);
                FloatingService floatingService = FloatingService.this;
                this.label = 1;
                Object objAplicarDpiOverride$default = FloatingService.aplicarDpiOverride$default(floatingService, false, this, 1, null);
                EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
                if (objAplicarDpiOverride$default == enumC1530vu) {
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

    /* JADX INFO: renamed from: com.example.ssmousepro.FloatingService$definirResolucaoDesejada$1 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.FloatingService$definirResolucaoDesejada$1", m5373f = "FloatingService.kt", m5374l = {6233}, m5375m = "invokeSuspend")
    public static final class C01601 extends ny1 implements ch0 {
        int label;

        public C01601(InterfaceC0579du interfaceC0579du) {
            super(2, interfaceC0579du);
        }

        @Override // p000.AbstractC0018ah
        public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
            return FloatingService.this.new C01601(interfaceC0579du);
        }

        @Override // p000.ch0
        public final Object invoke(CoroutineScope coroutineScope, InterfaceC0579du interfaceC0579du) {
            return ((C01601) create(coroutineScope, interfaceC0579du)).invokeSuspend(z32.f13265a);
        }

        @Override // p000.AbstractC0018ah
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                ua0.m6440Z(obj);
                FloatingService floatingService = FloatingService.this;
                this.label = 1;
                Object objAplicarResolucaoOverride$default = FloatingService.aplicarResolucaoOverride$default(floatingService, false, this, 1, null);
                EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
                if (objAplicarResolucaoOverride$default == enumC1530vu) {
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

    /* JADX INFO: renamed from: com.example.ssmousepro.FloatingService$encerrarMapeadorCompleto$2 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.FloatingService$encerrarMapeadorCompleto$2", m5373f = "FloatingService.kt", m5374l = {5352, 5354, 5361, 5362, 5363}, m5375m = "invokeSuspend")
    public static final class C01612 extends ny1 implements ch0 {
        int label;

        /* JADX INFO: renamed from: com.example.ssmousepro.FloatingService$encerrarMapeadorCompleto$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
        @InterfaceC1311px(m5372c = "com.example.ssmousepro.FloatingService$encerrarMapeadorCompleto$2$1", m5373f = "FloatingService.kt", m5374l = {5355}, m5375m = "invokeSuspend")
        public static final class AnonymousClass1 extends ny1 implements ch0 {
            int label;

            public AnonymousClass1(InterfaceC0579du interfaceC0579du) {
                super(2, interfaceC0579du);
            }

            @Override // p000.AbstractC0018ah
            public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
                return new AnonymousClass1(interfaceC0579du);
            }

            @Override // p000.ch0
            public final Object invoke(CoroutineScope coroutineScope, InterfaceC0579du interfaceC0579du) {
                return ((AnonymousClass1) create(coroutineScope, interfaceC0579du)).invokeSuspend(z32.f13265a);
            }

            @Override // p000.AbstractC0018ah
            public final Object invokeSuspend(Object obj) {
                int i = this.label;
                if (i == 0) {
                    ua0.m6440Z(obj);
                    PlayTimeSessionManager playTimeSessionManager = PlayTimeSessionManager.INSTANCE;
                    this.label = 1;
                    Object objEncerrarAguardando = playTimeSessionManager.encerrarAguardando(this);
                    EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
                    if (objEncerrarAguardando == enumC1530vu) {
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

        public C01612(InterfaceC0579du interfaceC0579du) {
            super(2, interfaceC0579du);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0() {
            Process.killProcess(Process.myPid());
        }

        @Override // p000.AbstractC0018ah
        public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
            return FloatingService.this.new C01612(interfaceC0579du);
        }

        @Override // p000.ch0
        public final Object invoke(CoroutineScope coroutineScope, InterfaceC0579du interfaceC0579du) {
            return ((C01612) create(coroutineScope, interfaceC0579du)).invokeSuspend(z32.f13265a);
        }

        /* JADX WARN: Code duplicated, block: B:39:0x0077  */
        /* JADX WARN: Code duplicated, block: B:40:0x0078 A[Catch: all -> 0x001d, Exception -> 0x0020, TRY_LEAVE, TryCatch #0 {Exception -> 0x0020, blocks: (B:9:0x0018, B:17:0x0029, B:40:0x0078, B:18:0x002d, B:37:0x006b, B:34:0x005e, B:33:0x0059, B:24:0x0037, B:27:0x003e), top: B:57:0x000c, outer: #2 }] */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0056, code lost:
        
            if (kotlinx.coroutines.TimeoutKt.withTimeout(15000, r10, r9) == r8) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0080, code lost:
        
            if (r10.desvincularDaemon(r9) == r8) goto L42;
         */
        @Override // p000.AbstractC0018ah
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instruction units count: 205
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.example.ssmousepro.FloatingService.C01612.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.example.ssmousepro.FloatingService$enviarBindingsDoJson$1 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.FloatingService", m5373f = "FloatingService.kt", m5374l = {1994, 2034, 2059, 2086}, m5375m = "enviarBindingsDoJson")
    public static final class C01621 extends AbstractC0616eu {
        float F$0;
        float F$1;
        int I$0;
        int I$1;
        int I$10;
        int I$11;
        int I$12;
        int I$13;
        int I$14;
        int I$15;
        int I$16;
        int I$17;
        int I$18;
        int I$19;
        int I$2;
        int I$20;
        int I$21;
        int I$22;
        int I$3;
        int I$4;
        int I$5;
        int I$6;
        int I$7;
        int I$8;
        int I$9;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        /* synthetic */ Object result;

        public C01621(InterfaceC0579du interfaceC0579du) {
            super(interfaceC0579du);
        }

        @Override // p000.AbstractC0018ah
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FloatingService.this.enviarBindingsDoJson(null, 0, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.example.ssmousepro.FloatingService$forcarResetDisplayEstiloGg$1 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.FloatingService", m5373f = "FloatingService.kt", m5374l = {7156, 6290, 6295, 6298, 6305}, m5375m = "forcarResetDisplayEstiloGg")
    public static final class C01641 extends AbstractC0616eu {
        int I$0;
        int I$1;
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C01641(InterfaceC0579du interfaceC0579du) {
            super(interfaceC0579du);
        }

        @Override // p000.AbstractC0018ah
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FloatingService.this.forcarResetDisplayEstiloGg(this);
        }
    }

    /* JADX INFO: renamed from: com.example.ssmousepro.FloatingService$limparDpiDesejada$1 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.FloatingService$limparDpiDesejada$1", m5373f = "FloatingService.kt", m5374l = {6272}, m5375m = "invokeSuspend")
    public static final class C01651 extends ny1 implements ch0 {
        int label;

        /* JADX INFO: renamed from: com.example.ssmousepro.FloatingService$limparDpiDesejada$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
        @InterfaceC1311px(m5372c = "com.example.ssmousepro.FloatingService$limparDpiDesejada$1$1", m5373f = "FloatingService.kt", m5374l = {6273}, m5375m = "invokeSuspend")
        public static final class AnonymousClass1 extends ny1 implements og0 {
            int label;
            final /* synthetic */ FloatingService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(FloatingService floatingService, InterfaceC0579du interfaceC0579du) {
                super(1, interfaceC0579du);
                this.this$0 = floatingService;
            }

            @Override // p000.AbstractC0018ah
            public final InterfaceC0579du create(InterfaceC0579du interfaceC0579du) {
                return new AnonymousClass1(this.this$0, interfaceC0579du);
            }

            @Override // p000.og0
            public final Object invoke(InterfaceC0579du interfaceC0579du) {
                return ((AnonymousClass1) create(interfaceC0579du)).invokeSuspend(z32.f13265a);
            }

            @Override // p000.AbstractC0018ah
            public final Object invokeSuspend(Object obj) {
                int i = this.label;
                if (i != 0) {
                    if (i == 1) {
                        ua0.m6440Z(obj);
                        return obj;
                    }
                    f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ua0.m6440Z(obj);
                FloatingService floatingService = this.this$0;
                this.label = 1;
                Object objSemOverrideDeDensidade = floatingService.semOverrideDeDensidade(this);
                EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
                return objSemOverrideDeDensidade == enumC1530vu ? enumC1530vu : objSemOverrideDeDensidade;
            }
        }

        public C01651(InterfaceC0579du interfaceC0579du) {
            super(2, interfaceC0579du);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(FloatingService floatingService) throws JSONException {
            FloatingService.aguardarResolucaoEReconfigurar$default(floatingService, 0, 1, null);
        }

        @Override // p000.AbstractC0018ah
        public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
            return FloatingService.this.new C01651(interfaceC0579du);
        }

        @Override // p000.ch0
        public final Object invoke(CoroutineScope coroutineScope, InterfaceC0579du interfaceC0579du) {
            return ((C01651) create(coroutineScope, interfaceC0579du)).invokeSuspend(z32.f13265a);
        }

        @Override // p000.AbstractC0018ah
        public final Object invokeSuspend(Object obj) {
            C01651 c01651;
            int i = this.label;
            if (i == 0) {
                ua0.m6440Z(obj);
                FloatingService floatingService = FloatingService.this;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(floatingService, null);
                this.label = 1;
                c01651 = this;
                Object objAjustarDisplay = floatingService.ajustarDisplay("RESTORE density", "SET_DPI reset", "wm density reset", anonymousClass1, c01651);
                EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
                if (objAjustarDisplay == enumC1530vu) {
                    return enumC1530vu;
                }
            } else {
                if (i != 1) {
                    f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ua0.m6440Z(obj);
                c01651 = this;
            }
            FloatingService.this.handlerMonitor.post(new RunnableC0204a(FloatingService.this, 3));
            return z32.f13265a;
        }
    }

    /* JADX INFO: renamed from: com.example.ssmousepro.FloatingService$limparResolucaoDesejada$1 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.FloatingService$limparResolucaoDesejada$1", m5373f = "FloatingService.kt", m5374l = {6247}, m5375m = "invokeSuspend")
    public static final class C01661 extends ny1 implements ch0 {
        int label;

        /* JADX INFO: renamed from: com.example.ssmousepro.FloatingService$limparResolucaoDesejada$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
        @InterfaceC1311px(m5372c = "com.example.ssmousepro.FloatingService$limparResolucaoDesejada$1$1", m5373f = "FloatingService.kt", m5374l = {6248}, m5375m = "invokeSuspend")
        public static final class AnonymousClass1 extends ny1 implements og0 {
            int label;
            final /* synthetic */ FloatingService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(FloatingService floatingService, InterfaceC0579du interfaceC0579du) {
                super(1, interfaceC0579du);
                this.this$0 = floatingService;
            }

            @Override // p000.AbstractC0018ah
            public final InterfaceC0579du create(InterfaceC0579du interfaceC0579du) {
                return new AnonymousClass1(this.this$0, interfaceC0579du);
            }

            @Override // p000.og0
            public final Object invoke(InterfaceC0579du interfaceC0579du) {
                return ((AnonymousClass1) create(interfaceC0579du)).invokeSuspend(z32.f13265a);
            }

            @Override // p000.AbstractC0018ah
            public final Object invokeSuspend(Object obj) {
                int i = this.label;
                if (i != 0) {
                    if (i == 1) {
                        ua0.m6440Z(obj);
                        return obj;
                    }
                    f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ua0.m6440Z(obj);
                FloatingService floatingService = this.this$0;
                this.label = 1;
                Object objSemOverrideDeTamanho = floatingService.semOverrideDeTamanho(this);
                EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
                return objSemOverrideDeTamanho == enumC1530vu ? enumC1530vu : objSemOverrideDeTamanho;
            }
        }

        public C01661(InterfaceC0579du interfaceC0579du) {
            super(2, interfaceC0579du);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(FloatingService floatingService) throws JSONException {
            FloatingService.aguardarResolucaoEReconfigurar$default(floatingService, 0, 1, null);
        }

        @Override // p000.AbstractC0018ah
        public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
            return FloatingService.this.new C01661(interfaceC0579du);
        }

        @Override // p000.ch0
        public final Object invoke(CoroutineScope coroutineScope, InterfaceC0579du interfaceC0579du) {
            return ((C01661) create(coroutineScope, interfaceC0579du)).invokeSuspend(z32.f13265a);
        }

        @Override // p000.AbstractC0018ah
        public final Object invokeSuspend(Object obj) {
            C01661 c01661;
            int i = this.label;
            if (i == 0) {
                ua0.m6440Z(obj);
                FloatingService floatingService = FloatingService.this;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(floatingService, null);
                this.label = 1;
                c01661 = this;
                Object objAjustarDisplay = floatingService.ajustarDisplay("RESTORE size", "SET_RES reset", "wm size reset", anonymousClass1, c01661);
                EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
                if (objAjustarDisplay == enumC1530vu) {
                    return enumC1530vu;
                }
            } else {
                if (i != 1) {
                    f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ua0.m6440Z(obj);
                c01661 = this;
            }
            FloatingService.this.handlerMonitor.post(new RunnableC0204a(FloatingService.this, 4));
            return z32.f13265a;
        }
    }

    /* JADX INFO: renamed from: com.example.ssmousepro.FloatingService$notificarHotplugPeriferico$1 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.FloatingService$notificarHotplugPeriferico$1", m5373f = "FloatingService.kt", m5374l = {}, m5375m = "invokeSuspend")
    public static final class C01671 extends ny1 implements ch0 {
        final /* synthetic */ String $pacoteAlvo;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01671(String str, InterfaceC0579du interfaceC0579du) {
            super(2, interfaceC0579du);
            this.$pacoteAlvo = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(FloatingService floatingService) throws JSONException {
            FloatingService.garantirHudOverlayEmModoJogo$default(floatingService, false, 1, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$1(FloatingService floatingService) throws JSONException {
            FloatingService.ativarTecladoNoDaemon$default(floatingService, false, 1, null);
        }

        @Override // p000.AbstractC0018ah
        public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
            return FloatingService.this.new C01671(this.$pacoteAlvo, interfaceC0579du);
        }

        @Override // p000.ch0
        public final Object invoke(CoroutineScope coroutineScope, InterfaceC0579du interfaceC0579du) {
            return ((C01671) create(coroutineScope, interfaceC0579du)).invokeSuspend(z32.f13265a);
        }

        @Override // p000.AbstractC0018ah
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ua0.m6440Z(obj);
            boolean zJogoAlvoEmPrimeiroPlano = FloatingService.this.jogoAlvoEmPrimeiroPlano(this.$pacoteAlvo);
            z32 z32Var = z32.f13265a;
            if (!zJogoAlvoEmPrimeiroPlano) {
                return z32Var;
            }
            if (!FloatingService.this.hudEmModoJogo) {
                FloatingService.this.handlerMonitor.post(new RunnableC0204a(FloatingService.this, 5));
                return z32Var;
            }
            InjectionDaemonManager.INSTANCE.enqueueComando(InjectionProtocol.INPUT_RESCAN);
            FloatingService.this.handlerMonitor.post(new RunnableC0204a(FloatingService.this, 6));
            return z32Var;
        }
    }

    /* JADX INFO: renamed from: com.example.ssmousepro.FloatingService$restaurarDpiNativo$1 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.FloatingService", m5373f = "FloatingService.kt", m5374l = {6529}, m5375m = "restaurarDpiNativo")
    public static final class C01701 extends AbstractC0616eu {
        int label;
        /* synthetic */ Object result;

        public C01701(InterfaceC0579du interfaceC0579du) {
            super(interfaceC0579du);
        }

        @Override // p000.AbstractC0018ah
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FloatingService.this.restaurarDpiNativo(this);
        }
    }

    /* JADX INFO: renamed from: com.example.ssmousepro.FloatingService$restaurarOverridesTela$1 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.FloatingService$restaurarOverridesTela$1", m5373f = "FloatingService.kt", m5374l = {6331}, m5375m = "invokeSuspend")
    public static final class C01711 extends ny1 implements ch0 {
        int label;

        public C01711(InterfaceC0579du interfaceC0579du) {
            super(2, interfaceC0579du);
        }

        @Override // p000.AbstractC0018ah
        public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
            return FloatingService.this.new C01711(interfaceC0579du);
        }

        @Override // p000.ch0
        public final Object invoke(CoroutineScope coroutineScope, InterfaceC0579du interfaceC0579du) {
            return ((C01711) create(coroutineScope, interfaceC0579du)).invokeSuspend(z32.f13265a);
        }

        @Override // p000.AbstractC0018ah
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                ua0.m6440Z(obj);
                FloatingService floatingService = FloatingService.this;
                this.label = 1;
                Object objRestaurarOverridesTelaVerificado = floatingService.restaurarOverridesTelaVerificado(this);
                EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
                if (objRestaurarOverridesTelaVerificado == enumC1530vu) {
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

    /* JADX INFO: renamed from: com.example.ssmousepro.FloatingService$restaurarOverridesTelaVerificado$1 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.FloatingService", m5373f = "FloatingService.kt", m5374l = {7156, 6339, 6342}, m5375m = "restaurarOverridesTelaVerificado")
    public static final class C01721 extends AbstractC0616eu {
        int I$0;
        int I$1;
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C01721(InterfaceC0579du interfaceC0579du) {
            super(interfaceC0579du);
        }

        @Override // p000.AbstractC0018ah
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FloatingService.this.restaurarOverridesTelaVerificado(this);
        }
    }

    /* JADX INFO: renamed from: com.example.ssmousepro.FloatingService$restaurarResolucaoNativa$1 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.FloatingService", m5373f = "FloatingService.kt", m5374l = {6516}, m5375m = "restaurarResolucaoNativa")
    public static final class C01731 extends AbstractC0616eu {
        int label;
        /* synthetic */ Object result;

        public C01731(InterfaceC0579du interfaceC0579du) {
            super(interfaceC0579du);
        }

        @Override // p000.AbstractC0018ah
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FloatingService.this.restaurarResolucaoNativa(this);
        }
    }

    /* JADX INFO: renamed from: com.example.ssmousepro.FloatingService$semOverrideDeDensidade$1 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.FloatingService", m5373f = "FloatingService.kt", m5374l = {6412}, m5375m = "semOverrideDeDensidade")
    public static final class C01741 extends AbstractC0616eu {
        int label;
        /* synthetic */ Object result;

        public C01741(InterfaceC0579du interfaceC0579du) {
            super(interfaceC0579du);
        }

        @Override // p000.AbstractC0018ah
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FloatingService.this.semOverrideDeDensidade(this);
        }
    }

    /* JADX INFO: renamed from: com.example.ssmousepro.FloatingService$semOverrideDeTamanho$1 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.FloatingService", m5373f = "FloatingService.kt", m5374l = {6407}, m5375m = "semOverrideDeTamanho")
    public static final class C01751 extends AbstractC0616eu {
        int label;
        /* synthetic */ Object result;

        public C01751(InterfaceC0579du interfaceC0579du) {
            super(interfaceC0579du);
        }

        @Override // p000.AbstractC0018ah
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FloatingService.this.semOverrideDeTamanho(this);
        }
    }

    /* JADX INFO: renamed from: com.example.ssmousepro.FloatingService$wmDensityAtual$1 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.FloatingService", m5373f = "FloatingService.kt", m5374l = {6388, 6390, 6391}, m5375m = "wmDensityAtual")
    public static final class C01841 extends AbstractC0616eu {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C01841(InterfaceC0579du interfaceC0579du) {
            super(interfaceC0579du);
        }

        @Override // p000.AbstractC0018ah
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FloatingService.this.wmDensityAtual(this);
        }
    }

    /* JADX INFO: renamed from: com.example.ssmousepro.FloatingService$wmSizeAtual$1 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.FloatingService", m5373f = "FloatingService.kt", m5374l = {6379, 6381, 6382}, m5375m = "wmSizeAtual")
    public static final class C01851 extends AbstractC0616eu {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C01851(InterfaceC0579du interfaceC0579du) {
            super(interfaceC0579du);
        }

        @Override // p000.AbstractC0018ah
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FloatingService.this.wmSizeAtual(this);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.example.ssmousepro.FloatingService$atualizarMonitorMapeador$1] */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.example.ssmousepro.FloatingService$provedorPosicaoCursor$1] */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.example.ssmousepro.FloatingService$atualizarDebugExteriorFps$1] */
    public FloatingService() {
        CompletableJob completableJobSupervisorJob$default = SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null);
        this.serviceJob = completableJobSupervisorJob$default;
        this.serviceScope = CoroutineScopeKt.CoroutineScope(completableJobSupervisorJob$default.plus(Dispatchers.getMain().getImmediate()));
        this.bolinhaVisivel = true;
        this.cursorMaoMargemX = -1;
        this.cursorMaoMargemY = -1;
        this.ativacaoDaemonLock = new Object();
        this.listenerEstadoMira = new FloatingService$listenerEstadoMira$1(this);
        this.intervaloDebugExteriorMs = 120L;
        this.executorDebugExterior = Executors.newSingleThreadExecutor(new ac0(0));
        this.atualizarDebugExteriorFps = new Runnable() { // from class: com.example.ssmousepro.FloatingService$atualizarDebugExteriorFps$1
            @Override // java.lang.Runnable
            public void run() {
                boolean zPrecisaDebugExteriorCurva = this.this$0.precisaDebugExteriorCurva();
                FloatingService floatingService = this.this$0;
                if (!zPrecisaDebugExteriorCurva) {
                    floatingService.pararDebugExteriorFps();
                    return;
                }
                boolean z = floatingService.debugExteriorEmCurso;
                FloatingService floatingService2 = this.this$0;
                if (z) {
                    floatingService2.handlerMonitor.postDelayed(this, this.this$0.intervaloDebugExteriorMs);
                } else {
                    floatingService2.debugExteriorEmCurso = true;
                    BuildersKt__Builders_commonKt.launch$default(this.this$0.serviceScope, Dispatchers.getIO(), null, new FloatingService$atualizarDebugExteriorFps$1$run$1(this.this$0, this, false, null), 2, null);
                }
            }
        };
        this.intervaloMonitorMapeadorMs = 150L;
        this.executorMonitorMapeador = Executors.newSingleThreadExecutor(new ac0(1));
        this.estadoMonitorMapeador = new PipelineMonitorText.Estado(null, 0L, 0, 0.0d, 0, null, 63, null);
        this.atualizarMonitorMapeador = new Runnable() { // from class: com.example.ssmousepro.FloatingService$atualizarMonitorMapeador$1
            @Override // java.lang.Runnable
            public void run() {
                boolean zPrecisaMonitorMapeador = this.this$0.precisaMonitorMapeador();
                FloatingService floatingService = this.this$0;
                if (!zPrecisaMonitorMapeador) {
                    floatingService.pararMonitorMapeador();
                    return;
                }
                View view = floatingService.hudOverlayView;
                ScrollView scrollView = view != null ? (ScrollView) view.findViewById(C0203R.id.painelMonitorMapeadorScroll) : null;
                View view2 = this.this$0.hudOverlayView;
                TextView textView = view2 != null ? (TextView) view2.findViewById(C0203R.id.painelMonitorMapeador) : null;
                if (scrollView == null || textView == null) {
                    this.this$0.handlerMonitor.postDelayed(this, this.this$0.intervaloMonitorMapeadorMs);
                    return;
                }
                scrollView.setVisibility(0);
                boolean z = this.this$0.monitorMapeadorEmCurso;
                FloatingService floatingService2 = this.this$0;
                if (z) {
                    floatingService2.handlerMonitor.postDelayed(this, this.this$0.intervaloMonitorMapeadorMs);
                } else {
                    floatingService2.monitorMapeadorEmCurso = true;
                    BuildersKt__Builders_commonKt.launch$default(this.this$0.serviceScope, Dispatchers.getIO(), null, new FloatingService$atualizarMonitorMapeador$1$run$1(this.this$0, AbstractC1377rp.m5869D0(this.this$0.monitorCamposVisiveis), this, null), 2, null);
                }
            }
        };
        this.cursorUiLock = new Object();
        this.flushCursorUi = new Runnable() { // from class: com.example.ssmousepro.FloatingService$flushCursorUi$1
            @Override // java.lang.Runnable
            public void run() {
                int i;
                int i2;
                int i3;
                Object obj = this.this$0.cursorUiLock;
                FloatingService floatingService = this.this$0;
                synchronized (obj) {
                    i = floatingService.cursorPendDx;
                    i2 = floatingService.cursorPendDy;
                    i3 = floatingService.cursorEventosPendentes;
                    floatingService.cursorPendDx = 0;
                    floatingService.cursorPendDy = 0;
                    floatingService.cursorEventosPendentes = 0;
                    floatingService.cursorFlushAgendado = false;
                }
                if (DevToolsGate.INSTANCE.getLiberado() && i3 >= 12) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    if (jUptimeMillis - this.this$0.ultimoLogCursorBacklogMs >= 500) {
                        this.this$0.ultimoLogCursorBacklogMs = jUptimeMillis;
                        Log.w("MapperMonitor", "cursor UI coalesced=" + i3 + " eventos/frame");
                    }
                }
                if (i != 0 || i2 != 0) {
                    this.this$0.atualizarCursor(i, i2);
                }
                Object obj2 = this.this$0.cursorUiLock;
                FloatingService floatingService2 = this.this$0;
                synchronized (obj2) {
                    try {
                        if (floatingService2.cursorPendDx != 0 || floatingService2.cursorPendDy != 0) {
                            if (!floatingService2.cursorFlushAgendado) {
                                floatingService2.cursorFlushAgendado = true;
                                floatingService2.handlerMonitor.post(this);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        };
        this.listenerCursorVirtual = new FloatingService$listenerCursorVirtual$1(this);
        this.provedorPosicaoCursor = new ICursorPositionProvider.Stub() { // from class: com.example.ssmousepro.FloatingService$provedorPosicaoCursor$1
            @Override // com.example.ssmousepro.ICursorPositionProvider
            public int getCursorX() {
                return ((Number) this.this$0.obterPosicaoCursorParaInjecao().f1292a).intValue();
            }

            @Override // com.example.ssmousepro.ICursorPositionProvider
            public int getCursorY() {
                return ((Number) this.this$0.obterPosicaoCursorParaInjecao().f1293b).intValue();
            }
        };
        this.configCallback = new FloatingService$configCallback$1(this);
        this.corPainelFundo = -14607565;
        this.corPainelCard = -13884094;
        this.corPainelAccent = -6521888;
        this.corPainelTexto = -1;
        this.corPainelTexto2 = -3554592;
    }

    private final void abrirHudOverlay() {
        if (this.hudOverlayView == null) {
            if (!criarHudOverlayNoWindowManager()) {
                return;
            }
            carregarPreferenciasHud();
            carregarMapeamentoHudSalvo();
        }
        View view = this.hudOverlayView;
        if (view != null) {
            view.setVisibility(0);
        }
        entrarModoEdicaoHud();
    }

    private final void abrirMenuConfiguracoes() {
        TextView textView;
        TextView textView2;
        View viewFindViewById;
        View viewFindViewById2;
        WindowManager windowManager = this.windowManager;
        if (windowManager == null) {
            return;
        }
        View viewInflate = LayoutInflater.from(this).inflate(C0203R.layout.layout_menu_mapeamento, (ViewGroup) null);
        this.menuView = viewInflate;
        esconderPonteiroSistema(viewInflate);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -2, 2038, 40, -3);
        layoutParams.gravity = 8388659;
        int i = 0;
        layoutParams.x = 0;
        layoutParams.y = 0;
        View view = this.menuView;
        if (view != null && (viewFindViewById2 = view.findViewById(C0203R.id.btnMenuHud)) != null) {
            viewFindViewById2.setOnClickListener(new nb0(this, i));
        }
        View view2 = this.menuView;
        if (view2 != null && (viewFindViewById = view2.findViewById(C0203R.id.btnMenuConfig)) != null) {
            viewFindViewById.setOnClickListener(new nb0(this, 1));
        }
        View view3 = this.menuView;
        if (view3 != null && (textView2 = (TextView) view3.findViewById(C0203R.id.btnMenuDigitar)) != null) {
            atualizarVisualBotaoDigitar(textView2);
            textView2.setOnClickListener(new ob0(i, this, textView2));
        }
        View view4 = this.menuView;
        if (view4 != null && (textView = (TextView) view4.findViewById(C0203R.id.btnMenuFechar)) != null) {
            textView.setOnClickListener(new nb0(this, 2));
        }
        try {
            windowManager.addView(this.menuView, layoutParams);
            this.hudJanelaNoTopo = false;
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (this.cursorMaoVisivel) {
            reempilharHudAcimaDoMenu();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void abrirMenuConfiguracoes$lambda$36(FloatingService floatingService, View view) {
        View view2 = floatingService.menuView;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        floatingService.abrirHudOverlay();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void abrirPainelConfigAnalogico(final FrameLayout frameLayout) {
        View viewFindViewById;
        fecharPainelConfigFps();
        fecharPainelConfigToque();
        fecharPainelConfigToqueRep();
        View view = this.hudOverlayView;
        if (view == null || (viewFindViewById = view.findViewById(C0203R.id.panelConfigAnalogico)) == null) {
            return;
        }
        this.analogWrapperEmEdicao = frameLayout;
        viewFindViewById.setVisibility(0);
        EditText editText = (EditText) viewFindViewById.findViewById(C0203R.id.edtAnalogTeclaW);
        EditText editText2 = (EditText) viewFindViewById.findViewById(C0203R.id.edtAnalogTeclaS);
        EditText editText3 = (EditText) viewFindViewById.findViewById(C0203R.id.edtAnalogTeclaA);
        EditText editText4 = (EditText) viewFindViewById.findViewById(C0203R.id.edtAnalogTeclaD);
        final EditText editText5 = (EditText) viewFindViewById.findViewById(C0203R.id.edtAnalogRapidez);
        Switch r6 = (Switch) viewFindViewById.findViewById(C0203R.id.switchAnalogMostrarTeclas);
        if (editText != null) {
            editText.setText(obterTeclaAnalogTag(frameLayout, C0203R.id.tag_hud_analog_tecla_w, "W"));
        }
        if (editText2 != null) {
            editText2.setText(obterTeclaAnalogTag(frameLayout, C0203R.id.tag_hud_analog_tecla_s, "S"));
        }
        if (editText3 != null) {
            editText3.setText(obterTeclaAnalogTag(frameLayout, C0203R.id.tag_hud_analog_tecla_a, "A"));
        }
        if (editText4 != null) {
            editText4.setText(obterTeclaAnalogTag(frameLayout, C0203R.id.tag_hud_analog_tecla_d, "D"));
        }
        if (editText5 != null) {
            Object tag = frameLayout.getTag(C0203R.id.tag_hud_analog_rapidez);
            Integer num = tag instanceof Integer ? (Integer) tag : null;
            editText5.setText(String.valueOf(num != null ? num.intValue() : 200));
        }
        if (r6 != null) {
            r6.setChecked(obterMostrarTeclasAnalog(frameLayout));
        }
        atualizarPropriedadesPainelAnalog(frameLayout);
        if (editText != null) {
            editText.setOnClickListener(new kb0(this, editText, frameLayout, 4));
        }
        if (editText2 != null) {
            editText2.setOnClickListener(new kb0(this, editText2, frameLayout, 5));
        }
        int i = 6;
        if (editText3 != null) {
            editText3.setOnClickListener(new kb0(this, editText3, frameLayout, i));
        }
        int i2 = 7;
        if (editText4 != null) {
            editText4.setOnClickListener(new kb0(this, editText4, frameLayout, i2));
        }
        if (editText5 != null) {
            editText5.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: yc0
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view2, boolean z) throws JSONException {
                    FloatingService.abrirPainelConfigAnalogico$lambda$255(editText5, frameLayout, this, view2, z);
                }
            });
        }
        if (editText5 != null) {
            editText5.setOnClickListener(new kb0(this, editText5, frameLayout, 8));
        }
        View viewFindViewById2 = viewFindViewById.findViewById(C0203R.id.txtAnalogPropRaio);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(new ub0(i2, frameLayout, this));
        }
        if (r6 != null) {
            r6.setOnCheckedChangeListener(new jb0(3, frameLayout, this));
        }
        View viewFindViewById3 = viewFindViewById.findViewById(C0203R.id.btnFecharPainelAnalog);
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(new kb0(this, frameLayout, editText5, 9));
        }
        View viewFindViewById4 = viewFindViewById.findViewById(C0203R.id.panelConfigAnalogicoRoot);
        if (viewFindViewById4 != null) {
            viewFindViewById4.setOnClickListener(new kb0(this, frameLayout, editText5, 10));
        }
        View viewFindViewById5 = viewFindViewById.findViewById(C0203R.id.btnExcluirAnalogPainel);
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(new ub0(i, frameLayout, this));
        }
        atualizarOrdemPaineisHud();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void abrirPainelConfigAnalogico$lambda$248(FloatingService floatingService, EditText editText, FrameLayout frameLayout, View view) {
        floatingService.capturarTeclaAnalog(editText, new wb0(3, frameLayout, floatingService));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 abrirPainelConfigAnalogico$lambda$248$lambda$247(FrameLayout frameLayout, FloatingService floatingService, String str) throws JSONException {
        str.getClass();
        frameLayout.setTag(C0203R.id.tag_hud_analog_tecla_w, str);
        AnalogStickHudView analogStickHudViewObterAnalogViewWrapper = floatingService.obterAnalogViewWrapper(frameLayout);
        if (analogStickHudViewObterAnalogViewWrapper != null) {
            analogStickHudViewObterAnalogViewWrapper.setTeclaW(LinuxKeyCodes.INSTANCE.rotuloExibicaoHud(str));
        }
        floatingService.salvarMapeamentoHud();
        return z32.f13265a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void abrirPainelConfigAnalogico$lambda$250(FloatingService floatingService, EditText editText, FrameLayout frameLayout, View view) {
        floatingService.capturarTeclaAnalog(editText, new wb0(2, frameLayout, floatingService));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 abrirPainelConfigAnalogico$lambda$250$lambda$249(FrameLayout frameLayout, FloatingService floatingService, String str) throws JSONException {
        str.getClass();
        frameLayout.setTag(C0203R.id.tag_hud_analog_tecla_s, str);
        AnalogStickHudView analogStickHudViewObterAnalogViewWrapper = floatingService.obterAnalogViewWrapper(frameLayout);
        if (analogStickHudViewObterAnalogViewWrapper != null) {
            analogStickHudViewObterAnalogViewWrapper.setTeclaS(LinuxKeyCodes.INSTANCE.rotuloExibicaoHud(str));
        }
        floatingService.salvarMapeamentoHud();
        return z32.f13265a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void abrirPainelConfigAnalogico$lambda$252(FloatingService floatingService, EditText editText, FrameLayout frameLayout, View view) {
        floatingService.capturarTeclaAnalog(editText, new wb0(5, frameLayout, floatingService));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 abrirPainelConfigAnalogico$lambda$252$lambda$251(FrameLayout frameLayout, FloatingService floatingService, String str) throws JSONException {
        str.getClass();
        frameLayout.setTag(C0203R.id.tag_hud_analog_tecla_a, str);
        AnalogStickHudView analogStickHudViewObterAnalogViewWrapper = floatingService.obterAnalogViewWrapper(frameLayout);
        if (analogStickHudViewObterAnalogViewWrapper != null) {
            analogStickHudViewObterAnalogViewWrapper.setTeclaA(LinuxKeyCodes.INSTANCE.rotuloExibicaoHud(str));
        }
        floatingService.salvarMapeamentoHud();
        return z32.f13265a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void abrirPainelConfigAnalogico$lambda$254(FloatingService floatingService, EditText editText, FrameLayout frameLayout, View view) {
        floatingService.capturarTeclaAnalog(editText, new wb0(4, frameLayout, floatingService));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 abrirPainelConfigAnalogico$lambda$254$lambda$253(FrameLayout frameLayout, FloatingService floatingService, String str) throws JSONException {
        str.getClass();
        frameLayout.setTag(C0203R.id.tag_hud_analog_tecla_d, str);
        AnalogStickHudView analogStickHudViewObterAnalogViewWrapper = floatingService.obterAnalogViewWrapper(frameLayout);
        if (analogStickHudViewObterAnalogViewWrapper != null) {
            analogStickHudViewObterAnalogViewWrapper.setTeclaD(LinuxKeyCodes.INSTANCE.rotuloExibicaoHud(str));
        }
        floatingService.salvarMapeamentoHud();
        return z32.f13265a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void abrirPainelConfigAnalogico$lambda$255(EditText editText, FrameLayout frameLayout, FloatingService floatingService, View view, boolean z) throws JSONException {
        if (z) {
            return;
        }
        Integer numM3069z0 = gw1.m3069z0(editText.getText().toString());
        int iM5140F = numM3069z0 != null ? p32.m5140F(numM3069z0.intValue(), 50, 400) : 200;
        frameLayout.setTag(C0203R.id.tag_hud_analog_rapidez, Integer.valueOf(iM5140F));
        editText.setText(String.valueOf(iM5140F));
        floatingService.salvarMapeamentoHud();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void abrirPainelConfigAnalogico$lambda$258(FloatingService floatingService, EditText editText, FrameLayout frameLayout, View view) {
        Editable text = editText.getText();
        String string = text != null ? text.toString() : null;
        if (string == null) {
            string = "";
        }
        if (zv1.m7371K0(string)) {
            Object tag = frameLayout.getTag(C0203R.id.tag_hud_analog_rapidez);
            Integer num = tag instanceof Integer ? (Integer) tag : null;
            string = String.valueOf(num != null ? num.intValue() : 200);
        }
        floatingService.mostrarDialogoNumeroComp("Rapidez (50–400)", string, new gb0(frameLayout, editText, floatingService, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 abrirPainelConfigAnalogico$lambda$258$lambda$257(FrameLayout frameLayout, EditText editText, FloatingService floatingService, String str) throws JSONException {
        str.getClass();
        Integer numM3069z0 = gw1.m3069z0(str);
        z32 z32Var = z32.f13265a;
        if (numM3069z0 != null) {
            int iM5140F = p32.m5140F(numM3069z0.intValue(), 50, 400);
            frameLayout.setTag(C0203R.id.tag_hud_analog_rapidez, Integer.valueOf(iM5140F));
            editText.setText(String.valueOf(iM5140F));
            floatingService.salvarMapeamentoHud();
        }
        return z32Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void abrirPainelConfigAnalogico$lambda$261(final FloatingService floatingService, final FrameLayout frameLayout, View view) {
        AnalogStickHudView analogStickHudViewObterAnalogViewWrapper = floatingService.obterAnalogViewWrapper(frameLayout);
        if (analogStickHudViewObterAnalogViewWrapper == null) {
            return;
        }
        int width = analogStickHudViewObterAnalogViewWrapper.getWidth();
        Integer numValueOf = Integer.valueOf(width);
        if (width <= 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : analogStickHudViewObterAnalogViewWrapper.getLayoutParams().width;
        final int iDpParaPx = floatingService.dpParaPx(40) / 2;
        final int iDpParaPx2 = floatingService.dpParaPx(200) / 2;
        floatingService.mostrarDialogoNumeroComp("Raio do stick", String.valueOf(iIntValue / 2), new og0() { // from class: sc0
            @Override // p000.og0
            public final Object invoke(Object obj) {
                return FloatingService.abrirPainelConfigAnalogico$lambda$261$lambda$260(iDpParaPx, iDpParaPx2, floatingService, frameLayout, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 abrirPainelConfigAnalogico$lambda$261$lambda$260(int i, int i2, FloatingService floatingService, FrameLayout frameLayout, String str) throws JSONException {
        str.getClass();
        Float fM2862y0 = fw1.m2862y0(str);
        z32 z32Var = z32.f13265a;
        if (fM2862y0 != null) {
            floatingService.aplicarTamanhoAnalogMantendoCentro(frameLayout, p32.m5140F((int) fM2862y0.floatValue(), i, i2) * 2);
            floatingService.atualizarPropriedadesPainelAnalog(frameLayout);
            floatingService.salvarMapeamentoHud();
        }
        return z32Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void abrirPainelConfigAnalogico$lambda$262(FrameLayout frameLayout, FloatingService floatingService, CompoundButton compoundButton, boolean z) throws JSONException {
        compoundButton.getClass();
        frameLayout.setTag(C0203R.id.tag_hud_analog_mostrar_teclas, Boolean.valueOf(z));
        AnalogStickHudView analogStickHudViewObterAnalogViewWrapper = floatingService.obterAnalogViewWrapper(frameLayout);
        if (analogStickHudViewObterAnalogViewWrapper != null) {
            analogStickHudViewObterAnalogViewWrapper.setMostrarTeclas(z);
        }
        floatingService.salvarMapeamentoHud();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void abrirPainelConfigAnalogico$lambda$263(FloatingService floatingService, FrameLayout frameLayout, EditText editText, View view) {
        floatingService.salvarTagsAnalogDoPainel(frameLayout, editText);
        floatingService.fecharPainelConfigAnalogico();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void abrirPainelConfigAnalogico$lambda$264(FloatingService floatingService, FrameLayout frameLayout, EditText editText, View view) {
        floatingService.salvarTagsAnalogDoPainel(frameLayout, editText);
        floatingService.fecharPainelConfigAnalogico();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void abrirPainelConfigAnalogico$lambda$265(FloatingService floatingService, FrameLayout frameLayout, View view) {
        floatingService.fecharPainelConfigAnalogico();
        FrameLayout frameLayoutObterContainerHud = floatingService.obterContainerHud();
        if (frameLayoutObterContainerHud != null) {
            frameLayoutObterContainerHud.removeView(frameLayout);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void abrirPainelConfigFps(FrameLayout frameLayout) {
        View viewFindViewById;
        FloatingService floatingService;
        FrameLayout frameLayout2;
        String strRotuloExibicaoHud;
        fecharPainelConfigAnalogico();
        fecharPainelConfigToque();
        fecharPainelConfigToqueRep();
        View view = this.hudOverlayView;
        if (view == null || (viewFindViewById = view.findViewById(C0203R.id.panelConfigFps)) == null) {
            return;
        }
        this.fpsWrapperEmEdicao = frameLayout;
        final int i = 0;
        viewFindViewById.setVisibility(0);
        trazerCursorVirtualFrente();
        FpsViewHudView fpsViewHudViewObterFpsViewWrapper = obterFpsViewWrapper(frameLayout);
        if (fpsViewHudViewObterFpsViewWrapper == null) {
            return;
        }
        final View viewFindViewById2 = viewFindViewById.findViewById(C0203R.id.painelFpsPrincipal);
        final View viewFindViewById3 = viewFindViewById.findViewById(C0203R.id.painelFpsTweaks);
        final TextView textView = (TextView) viewFindViewById.findViewById(C0203R.id.txtTituloPainelFps);
        EditText editText = (EditText) viewFindViewById.findViewById(C0203R.id.edtFpsTecla);
        EditText editText2 = (EditText) viewFindViewById.findViewById(C0203R.id.edtFpsTeclaSuspender);
        EditText editText3 = (EditText) viewFindViewById.findViewById(C0203R.id.edtFpsSensX);
        EditText editText4 = (EditText) viewFindViewById.findViewById(C0203R.id.edtFpsSensY);
        abrirPainelConfigFps$mostrarTelaPrincipal(viewFindViewById2, viewFindViewById3, textView);
        int i2 = DevToolsGate.INSTANCE.getLiberado() ? 0 : 8;
        View viewFindViewById4 = viewFindViewById.findViewById(C0203R.id.grupoFpsAntiBlock);
        if (viewFindViewById4 != null) {
            viewFindViewById4.setVisibility(i2);
        }
        View viewFindViewById5 = viewFindViewById.findViewById(C0203R.id.txtExtrasFpsTitulo);
        if (viewFindViewById5 != null) {
            viewFindViewById5.setVisibility(i2);
        }
        View viewFindViewById6 = viewFindViewById.findViewById(C0203R.id.divExtrasFps);
        if (viewFindViewById6 != null) {
            viewFindViewById6.setVisibility(i2);
        }
        View viewFindViewById7 = viewFindViewById.findViewById(C0203R.id.btnAbrirTweaksFps);
        if (viewFindViewById7 != null) {
            viewFindViewById7.setVisibility(i2);
        }
        if (editText != null) {
            String teclaRotulo = fpsViewHudViewObterFpsViewWrapper.getTeclaRotulo();
            if (teclaRotulo == null) {
                teclaRotulo = "?";
            }
            editText.setText(teclaRotulo);
        }
        if (editText2 != null) {
            String strObterTeclaSuspenderFps = obterTeclaSuspenderFps(frameLayout);
            if (strObterTeclaSuspenderFps == null || (strRotuloExibicaoHud = LinuxKeyCodes.INSTANCE.rotuloExibicaoHud(strObterTeclaSuspenderFps)) == null) {
                strRotuloExibicaoHud = "—";
            }
            editText2.setText(strRotuloExibicaoHud);
        }
        if (editText3 != null) {
            editText3.setText(formatarSensFpsUi(obterSensFpsX(frameLayout)));
        }
        if (editText4 != null) {
            editText4.setText(formatarSensFpsUi(obterSensFpsY(frameLayout)));
        }
        if (editText != null) {
            floatingService = this;
            frameLayout2 = frameLayout;
            editText.setOnClickListener(new xc0(floatingService, frameLayout2, fpsViewHudViewObterFpsViewWrapper, editText, 0));
        } else {
            floatingService = this;
            frameLayout2 = frameLayout;
        }
        if (editText2 != null) {
            editText2.setOnClickListener(new kb0(floatingService, frameLayout2, editText2, 11));
        }
        if (editText2 != null) {
            editText2.setOnLongClickListener(new bd0(i, floatingService, frameLayout2));
        }
        if (editText3 != null) {
            editText3.setOnClickListener(new kb0(floatingService, frameLayout2, editText3, 12));
        }
        int i3 = 2;
        if (editText4 != null) {
            editText4.setOnClickListener(new kb0(floatingService, frameLayout2, editText4, i3));
        }
        View viewFindViewById8 = viewFindViewById.findViewById(C0203R.id.btnAbrirTweaksFps);
        if (viewFindViewById8 != null) {
            viewFindViewById8.setOnClickListener(new View.OnClickListener() { // from class: qb0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i) {
                        case 0:
                            FloatingService.abrirPainelConfigFps$mostrarTelaTweaks(viewFindViewById2, viewFindViewById3, textView);
                            break;
                        default:
                            FloatingService.abrirPainelConfigFps$mostrarTelaPrincipal(viewFindViewById2, viewFindViewById3, textView);
                            break;
                    }
                }
            });
        }
        View viewFindViewById9 = viewFindViewById.findViewById(C0203R.id.btnVoltarTweaksFps);
        if (viewFindViewById9 != null) {
            final int i4 = 1;
            viewFindViewById9.setOnClickListener(new View.OnClickListener() { // from class: qb0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i4) {
                        case 0:
                            FloatingService.abrirPainelConfigFps$mostrarTelaTweaks(viewFindViewById2, viewFindViewById3, textView);
                            break;
                        default:
                            FloatingService.abrirPainelConfigFps$mostrarTelaPrincipal(viewFindViewById2, viewFindViewById3, textView);
                            break;
                    }
                }
            });
        }
        floatingService.vincularUiLowSpeed(viewFindViewById, frameLayout2);
        floatingService.vincularUiAcelLimiar(viewFindViewById, frameLayout2);
        floatingService.vincularUiAntiBlock(viewFindViewById, frameLayout2);
        View viewFindViewById10 = viewFindViewById.findViewById(C0203R.id.btnFecharPainelFps);
        if (viewFindViewById10 != null) {
            viewFindViewById10.setOnClickListener(new nb0(floatingService, 3));
        }
        View viewFindViewById11 = viewFindViewById.findViewById(C0203R.id.panelConfigFpsRoot);
        if (viewFindViewById11 != null) {
            viewFindViewById11.setOnClickListener(new nb0(floatingService, 4));
        }
        View viewFindViewById12 = viewFindViewById.findViewById(C0203R.id.btnExcluirFpsPainel);
        if (viewFindViewById12 != null) {
            viewFindViewById12.setOnClickListener(new ub0(i3, frameLayout2, floatingService));
        }
        floatingService.atualizarOrdemPaineisHud();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void abrirPainelConfigFps$lambda$183(FloatingService floatingService, FrameLayout frameLayout, FpsViewHudView fpsViewHudView, EditText editText, View view) {
        floatingService.capturarTeclaFps(frameLayout, fpsViewHudView, new gc0(editText, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 abrirPainelConfigFps$lambda$183$lambda$182(EditText editText, String str) {
        str.getClass();
        editText.setText(str);
        return z32.f13265a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void abrirPainelConfigFps$lambda$185(FloatingService floatingService, FrameLayout frameLayout, EditText editText, View view) {
        floatingService.capturarTeclaSuspenderFps(frameLayout, new gc0(editText, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 abrirPainelConfigFps$lambda$185$lambda$184(EditText editText, String str) {
        str.getClass();
        editText.setText(str);
        return z32.f13265a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean abrirPainelConfigFps$lambda$186(FloatingService floatingService, FrameLayout frameLayout, View view) throws JSONException {
        floatingService.aplicarTeclaSuspenderFps(frameLayout, null);
        floatingService.salvarMapeamentoHud();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void abrirPainelConfigFps$lambda$188(FloatingService floatingService, FrameLayout frameLayout, EditText editText, View view) {
        floatingService.mostrarDialogoNumeroComp("Sensibilidade X", floatingService.formatarSensFpsUi(floatingService.obterSensFpsX(frameLayout)), new gb0(floatingService, frameLayout, editText, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 abrirPainelConfigFps$lambda$188$lambda$187(FloatingService floatingService, FrameLayout frameLayout, EditText editText, String str) {
        str.getClass();
        Float sensFpsDigitado = floatingService.parseSensFpsDigitado(str);
        z32 z32Var = z32.f13265a;
        if (sensFpsDigitado != null) {
            float fFloatValue = sensFpsDigitado.floatValue();
            floatingService.aplicarSensFpsNoWrapper(frameLayout, fFloatValue, floatingService.obterSensFpsY(frameLayout));
            editText.setText(floatingService.formatarSensFpsUi(fFloatValue));
        }
        return z32Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void abrirPainelConfigFps$lambda$190(FloatingService floatingService, FrameLayout frameLayout, EditText editText, View view) {
        floatingService.mostrarDialogoNumeroComp("Sensibilidade Y", floatingService.formatarSensFpsUi(floatingService.obterSensFpsY(frameLayout)), new gb0(floatingService, frameLayout, editText, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 abrirPainelConfigFps$lambda$190$lambda$189(FloatingService floatingService, FrameLayout frameLayout, EditText editText, String str) {
        str.getClass();
        Float sensFpsDigitado = floatingService.parseSensFpsDigitado(str);
        z32 z32Var = z32.f13265a;
        if (sensFpsDigitado != null) {
            float fFloatValue = sensFpsDigitado.floatValue();
            floatingService.aplicarSensFpsNoWrapper(frameLayout, floatingService.obterSensFpsX(frameLayout), fFloatValue);
            editText.setText(floatingService.formatarSensFpsUi(fFloatValue));
        }
        return z32Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void abrirPainelConfigFps$lambda$195(FloatingService floatingService, FrameLayout frameLayout, View view) {
        floatingService.fecharPainelConfigFps();
        FrameLayout frameLayoutObterContainerHud = floatingService.obterContainerHud();
        if (frameLayoutObterContainerHud != null) {
            frameLayoutObterContainerHud.removeView(frameLayout);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void abrirPainelConfigFps$mostrarTelaPrincipal(View view, View view2, TextView textView) {
        if (view != null) {
            view.setVisibility(0);
        }
        if (view2 != null) {
            view2.setVisibility(8);
        }
        if (textView != null) {
            textView.setText("Configurações da visão FPS");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void abrirPainelConfigFps$mostrarTelaTweaks(View view, View view2, TextView textView) {
        if (view != null) {
            view.setVisibility(8);
        }
        if (view2 != null) {
            view2.setVisibility(0);
        }
        if (textView != null) {
            textView.setText("Tweaks");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void abrirPainelConfigToque(FrameLayout frameLayout) {
        View viewFindViewById;
        String strObterTeclaSalva;
        FloatingService floatingService;
        FrameLayout frameLayout2;
        View view = this.hudOverlayView;
        if (view == null || (viewFindViewById = view.findViewById(C0203R.id.panelConfigToque)) == null) {
            return;
        }
        fecharPainelConfigAnalogico();
        fecharPainelConfigFps();
        fecharPainelConfigToqueRep();
        this.toqueWrapperEmEdicao = frameLayout;
        View viewObterViewConteudoWrapper = obterViewConteudoWrapper(frameLayout);
        TextView textView = viewObterViewConteudoWrapper instanceof TextView ? (TextView) viewObterViewConteudoWrapper : null;
        if (textView == null || (strObterTeclaSalva = obterTeclaSalva(textView, TIPO_TOQUE)) == null) {
            strObterTeclaSalva = "?";
        }
        EditText editText = (EditText) viewFindViewById.findViewById(C0203R.id.edtToqueTecla);
        TextView textView2 = (TextView) viewFindViewById.findViewById(C0203R.id.btnToqueModoPressionar);
        TextView textView3 = (TextView) viewFindViewById.findViewById(C0203R.id.btnToqueModoToque);
        View viewFindViewById2 = viewFindViewById.findViewById(C0203R.id.linhaToqueDuracao);
        TextView textView4 = (TextView) viewFindViewById.findViewById(C0203R.id.txtToqueTapMs);
        if (editText != null) {
            editText.setText(LinuxKeyCodes.INSTANCE.rotuloExibicaoHud(strObterTeclaSalva));
        }
        int i = 0;
        if (editText != null) {
            editText.setOnClickListener(new uc0(i, editText, textView, this));
        }
        if (textView2 != null) {
            floatingService = this;
            frameLayout2 = frameLayout;
            textView2.setOnClickListener(new vc0(frameLayout2, floatingService, textView2, textView3, viewFindViewById2, textView4, 0));
        } else {
            floatingService = this;
            frameLayout2 = frameLayout;
        }
        if (textView3 != null) {
            textView3.setOnClickListener(new vc0(frameLayout2, floatingService, textView2, textView3, viewFindViewById2, textView4, 1));
        }
        if (textView4 != null) {
            textView4.setOnClickListener(new lc0(1, frameLayout2, textView4, floatingService));
        }
        FloatingService floatingService2 = floatingService;
        abrirPainelConfigToque$atualizarUiModoToque(floatingService2, frameLayout2, textView2, textView3, viewFindViewById2, textView4);
        View viewFindViewById3 = viewFindViewById.findViewById(C0203R.id.btnFecharPainelToque);
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(new nb0(floatingService2, 13));
        }
        View viewFindViewById4 = viewFindViewById.findViewById(C0203R.id.panelConfigToqueRoot);
        if (viewFindViewById4 != null) {
            viewFindViewById4.setOnClickListener(new nb0(floatingService2, 14));
        }
        View viewFindViewById5 = viewFindViewById.findViewById(C0203R.id.btnExcluirToquePainel);
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(new ub0(5, frameLayout2, floatingService2));
        }
        viewFindViewById.setVisibility(0);
        floatingService2.atualizarOrdemPaineisHud();
        floatingService2.atualizarPropriedadesPainelToque(frameLayout2);
    }

    private static final void abrirPainelConfigToque$atualizarUiModoToque(FloatingService floatingService, FrameLayout frameLayout, TextView textView, TextView textView2, View view, TextView textView3) {
        boolean zM3214e = hp0.m3214e(floatingService.obterToqueModo(frameLayout), TOQUE_MODO_TAP);
        if (textView != null) {
            textView.setTextColor(!zM3214e ? Color.parseColor("#1A237E") : -1);
        }
        if (textView2 != null) {
            textView2.setTextColor(zM3214e ? Color.parseColor("#1A237E") : -1);
        }
        if (textView != null) {
            textView.setBackgroundColor(!zM3214e ? Color.parseColor("#E8EAF6") : Color.parseColor("#66402A75"));
        }
        if (textView2 != null) {
            textView2.setBackgroundColor(zM3214e ? Color.parseColor("#E8EAF6") : Color.parseColor("#66402A75"));
        }
        if (view != null) {
            view.setVisibility(zM3214e ? 0 : 8);
        }
        if (textView3 != null) {
            textView3.setText(String.valueOf(floatingService.obterToqueTapMs(frameLayout)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void abrirPainelConfigToque$lambda$221(TextView textView, FloatingService floatingService, EditText editText, View view) {
        if (textView == null) {
            return;
        }
        floatingService.ativarModoEscutaComponente(textView, new ib0(1, editText, textView, floatingService));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 abrirPainelConfigToque$lambda$221$lambda$220(FloatingService floatingService, TextView textView, EditText editText, String str) throws JSONException {
        str.getClass();
        floatingService.aplicarTeclaNoComponente(textView, str);
        editText.setText(LinuxKeyCodes.INSTANCE.rotuloExibicaoHud(str));
        floatingService.salvarMapeamentoHud();
        return z32.f13265a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void abrirPainelConfigToque$lambda$222(FrameLayout frameLayout, FloatingService floatingService, TextView textView, TextView textView2, View view, TextView textView3, View view2) throws JSONException {
        frameLayout.setTag(C0203R.id.tag_hud_toque_modo, TOQUE_MODO_PRESS);
        abrirPainelConfigToque$atualizarUiModoToque(floatingService, frameLayout, textView, textView2, view, textView3);
        floatingService.salvarMapeamentoHud();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void abrirPainelConfigToque$lambda$223(FrameLayout frameLayout, FloatingService floatingService, TextView textView, TextView textView2, View view, TextView textView3, View view2) throws JSONException {
        frameLayout.setTag(C0203R.id.tag_hud_toque_modo, TOQUE_MODO_TAP);
        if (frameLayout.getTag(C0203R.id.tag_hud_toque_tap_ms) == null) {
            frameLayout.setTag(C0203R.id.tag_hud_toque_tap_ms, 1);
        }
        abrirPainelConfigToque$atualizarUiModoToque(floatingService, frameLayout, textView, textView2, view, textView3);
        floatingService.salvarMapeamentoHud();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void abrirPainelConfigToque$lambda$225(FloatingService floatingService, FrameLayout frameLayout, TextView textView, View view) {
        floatingService.mostrarDialogoNumeroComp("Duração do toque (ms)", String.valueOf(floatingService.obterToqueTapMs(frameLayout)), new rb0(1, frameLayout, textView, floatingService));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 abrirPainelConfigToque$lambda$225$lambda$224(FrameLayout frameLayout, TextView textView, FloatingService floatingService, String str) throws JSONException {
        str.getClass();
        Float fM2862y0 = fw1.m2862y0(str);
        z32 z32Var = z32.f13265a;
        if (fM2862y0 != null) {
            int iM5140F = p32.m5140F((int) fM2862y0.floatValue(), 1, 500);
            frameLayout.setTag(C0203R.id.tag_hud_toque_tap_ms, Integer.valueOf(iM5140F));
            textView.setText(String.valueOf(iM5140F));
            floatingService.salvarMapeamentoHud();
        }
        return z32Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void abrirPainelConfigToque$lambda$228(FloatingService floatingService, FrameLayout frameLayout, View view) throws JSONException {
        floatingService.fecharPainelConfigToque();
        FrameLayout frameLayoutObterContainerHud = floatingService.obterContainerHud();
        if (frameLayoutObterContainerHud != null) {
            frameLayoutObterContainerHud.removeView(frameLayout);
        }
        floatingService.salvarMapeamentoHud();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void abrirPainelConfigToqueRep(final FrameLayout frameLayout) {
        View viewFindViewById;
        String strObterTeclaSalva;
        final TextView textView;
        final TextView textView2;
        TextView textView3;
        FloatingService floatingService;
        FrameLayout frameLayout2;
        View view;
        TextView textView4;
        TextView textView5;
        TextView textView6;
        View view2 = this.hudOverlayView;
        if (view2 == null || (viewFindViewById = view2.findViewById(C0203R.id.panelConfigToqueRep)) == null) {
            return;
        }
        fecharPainelConfigAnalogico();
        fecharPainelConfigFps();
        fecharPainelConfigToque();
        this.toqueRepWrapperEmEdicao = frameLayout;
        this.toqueRepAvancadoVisivel = false;
        View viewObterViewConteudoWrapper = obterViewConteudoWrapper(frameLayout);
        TextView textView7 = viewObterViewConteudoWrapper instanceof TextView ? (TextView) viewObterViewConteudoWrapper : null;
        if (textView7 == null || (strObterTeclaSalva = obterTeclaSalva(textView7, TIPO_TOQUE_REP)) == null) {
            strObterTeclaSalva = "?";
        }
        EditText editText = (EditText) viewFindViewById.findViewById(C0203R.id.edtToqueRepTecla);
        TextView textView8 = (TextView) viewFindViewById.findViewById(C0203R.id.btnToqueRepModoPressionar);
        TextView textView9 = (TextView) viewFindViewById.findViewById(C0203R.id.btnToqueRepModoToque);
        View viewFindViewById2 = viewFindViewById.findViewById(C0203R.id.blocoToqueRepAvancado);
        TextView textView10 = (TextView) viewFindViewById.findViewById(C0203R.id.btnToqueRepMaisOpcoes);
        TextView textView11 = (TextView) viewFindViewById.findViewById(C0203R.id.txtToqueRepContagem);
        TextView textView12 = (TextView) viewFindViewById.findViewById(C0203R.id.btnToqueRepAteChave);
        if (editText != null) {
            editText.setText(LinuxKeyCodes.INSTANCE.rotuloExibicaoHud(strObterTeclaSalva));
        }
        if (editText != null) {
            editText.setOnClickListener(new uc0(1, editText, textView7, this));
        }
        if (textView8 != null) {
            textView = textView8;
            final int i = 0;
            textView2 = textView9;
            textView.setOnClickListener(new View.OnClickListener() { // from class: zc0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) throws JSONException {
                    int i2 = i;
                    TextView textView13 = textView2;
                    TextView textView14 = textView;
                    FloatingService floatingService2 = this;
                    FrameLayout frameLayout3 = frameLayout;
                    switch (i2) {
                        case 0:
                            FloatingService.abrirPainelConfigToqueRep$lambda$232(frameLayout3, floatingService2, textView14, textView13, view3);
                            break;
                        default:
                            FloatingService.abrirPainelConfigToqueRep$lambda$233(frameLayout3, floatingService2, textView14, textView13, view3);
                            break;
                    }
                }
            });
        } else {
            textView = textView8;
            textView2 = textView9;
        }
        if (textView2 != null) {
            final int i2 = 1;
            textView3 = textView2;
            textView3.setOnClickListener(new View.OnClickListener() { // from class: zc0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) throws JSONException {
                    int i3 = i2;
                    TextView textView13 = textView2;
                    TextView textView14 = textView;
                    FloatingService floatingService2 = this;
                    FrameLayout frameLayout3 = frameLayout;
                    switch (i3) {
                        case 0:
                            FloatingService.abrirPainelConfigToqueRep$lambda$232(frameLayout3, floatingService2, textView14, textView13, view3);
                            break;
                        default:
                            FloatingService.abrirPainelConfigToqueRep$lambda$233(frameLayout3, floatingService2, textView14, textView13, view3);
                            break;
                    }
                }
            });
        } else {
            textView3 = textView2;
        }
        if (textView10 != null) {
            floatingService = this;
            textView4 = textView10;
            textView5 = textView11;
            textView6 = textView12;
            view = viewFindViewById2;
            frameLayout2 = frameLayout;
            textView4.setOnClickListener(new vc0(floatingService, viewFindViewById2, textView4, textView5, frameLayout, textView6));
        } else {
            floatingService = this;
            frameLayout2 = frameLayout;
            view = viewFindViewById2;
            textView4 = textView10;
            textView5 = textView11;
            textView6 = textView12;
        }
        if (textView5 != null) {
            textView5.setOnClickListener(new lc0(2, frameLayout2, textView5, floatingService));
        }
        if (textView6 != null) {
            TextView textView13 = textView4;
            View view3 = view;
            TextView textView14 = textView5;
            vc0 vc0Var = new vc0(floatingService, frameLayout2, view3, textView13, textView14, textView6);
            view = view3;
            textView4 = textView13;
            textView5 = textView14;
            textView6.setOnClickListener(vc0Var);
        }
        abrirPainelConfigToqueRep$atualizarUiModo(floatingService, frameLayout2, textView, textView3);
        TextView textView15 = textView5;
        FrameLayout frameLayout3 = frameLayout2;
        abrirPainelConfigToqueRep$atualizarUiAvancado(view, floatingService, textView4, textView15, frameLayout3, textView6);
        View viewFindViewById3 = viewFindViewById.findViewById(C0203R.id.btnFecharPainelToqueRep);
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(new nb0(floatingService, 17));
        }
        View viewFindViewById4 = viewFindViewById.findViewById(C0203R.id.panelConfigToqueRepRoot);
        if (viewFindViewById4 != null) {
            viewFindViewById4.setOnClickListener(new nb0(floatingService, 18));
        }
        View viewFindViewById5 = viewFindViewById.findViewById(C0203R.id.btnExcluirToqueRepPainel);
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(new ub0(8, frameLayout3, floatingService));
        }
        viewFindViewById.setVisibility(0);
        floatingService.atualizarOrdemPaineisHud();
    }

    private static final void abrirPainelConfigToqueRep$atualizarUiAvancado(View view, FloatingService floatingService, TextView textView, TextView textView2, FrameLayout frameLayout, TextView textView3) {
        if (view != null) {
            view.setVisibility(floatingService.toqueRepAvancadoVisivel ? 0 : 8);
        }
        if (textView != null) {
            textView.setText(floatingService.toqueRepAvancadoVisivel ? "Ocultar configurações" : "Mais configurações");
        }
        if (textView2 != null) {
            textView2.setText(String.valueOf(floatingService.obterToqueRepContagem(frameLayout)));
        }
        boolean zObterToqueRepAteChave = floatingService.obterToqueRepAteChave(frameLayout);
        if (textView3 != null) {
            textView3.setText(zObterToqueRepAteChave ? "TRUE" : "FALSE");
        }
        if (textView3 != null) {
            textView3.setTextColor(Color.parseColor(zObterToqueRepAteChave ? "#69F0AE" : "#FF8A80"));
        }
        floatingService.atualizarPropriedadesPainelToqueRep(frameLayout);
    }

    private static final void abrirPainelConfigToqueRep$atualizarUiModo(FloatingService floatingService, FrameLayout frameLayout, TextView textView, TextView textView2) {
        boolean zM3214e = hp0.m3214e(floatingService.obterToqueModo(frameLayout), TOQUE_MODO_TAP);
        if (textView != null) {
            textView.setTextColor(!zM3214e ? Color.parseColor("#1A237E") : -1);
        }
        if (textView2 != null) {
            textView2.setTextColor(zM3214e ? Color.parseColor("#1A237E") : -1);
        }
        if (textView != null) {
            textView.setBackgroundColor(!zM3214e ? Color.parseColor("#E8EAF6") : Color.parseColor("#66402A75"));
        }
        if (textView2 != null) {
            textView2.setBackgroundColor(zM3214e ? Color.parseColor("#E8EAF6") : Color.parseColor("#66402A75"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void abrirPainelConfigToqueRep$lambda$231(TextView textView, FloatingService floatingService, EditText editText, View view) {
        if (textView == null) {
            return;
        }
        floatingService.ativarModoEscutaComponente(textView, new ib0(0, editText, textView, floatingService));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 abrirPainelConfigToqueRep$lambda$231$lambda$230(FloatingService floatingService, TextView textView, EditText editText, String str) throws JSONException {
        str.getClass();
        floatingService.aplicarTeclaNoComponente(textView, str);
        editText.setText(LinuxKeyCodes.INSTANCE.rotuloExibicaoHud(str));
        floatingService.salvarMapeamentoHud();
        return z32.f13265a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void abrirPainelConfigToqueRep$lambda$232(FrameLayout frameLayout, FloatingService floatingService, TextView textView, TextView textView2, View view) throws JSONException {
        frameLayout.setTag(C0203R.id.tag_hud_toque_modo, TOQUE_MODO_PRESS);
        frameLayout.setTag(C0203R.id.tag_hud_toque_tap_ms, 80);
        abrirPainelConfigToqueRep$atualizarUiModo(floatingService, frameLayout, textView, textView2);
        floatingService.salvarMapeamentoHud();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void abrirPainelConfigToqueRep$lambda$233(FrameLayout frameLayout, FloatingService floatingService, TextView textView, TextView textView2, View view) throws JSONException {
        frameLayout.setTag(C0203R.id.tag_hud_toque_modo, TOQUE_MODO_TAP);
        frameLayout.setTag(C0203R.id.tag_hud_toque_tap_ms, 1);
        abrirPainelConfigToqueRep$atualizarUiModo(floatingService, frameLayout, textView, textView2);
        floatingService.salvarMapeamentoHud();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void abrirPainelConfigToqueRep$lambda$234(FloatingService floatingService, View view, TextView textView, TextView textView2, FrameLayout frameLayout, TextView textView3, View view2) {
        floatingService.toqueRepAvancadoVisivel = !floatingService.toqueRepAvancadoVisivel;
        abrirPainelConfigToqueRep$atualizarUiAvancado(view, floatingService, textView, textView2, frameLayout, textView3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void abrirPainelConfigToqueRep$lambda$236(FloatingService floatingService, FrameLayout frameLayout, TextView textView, View view) {
        floatingService.mostrarDialogoNumeroComp("Contagem", String.valueOf(floatingService.obterToqueRepContagem(frameLayout)), new rb0(textView, frameLayout, floatingService));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 abrirPainelConfigToqueRep$lambda$236$lambda$235(FrameLayout frameLayout, FloatingService floatingService, TextView textView, String str) throws JSONException {
        str.getClass();
        Float fM2862y0 = fw1.m2862y0(str);
        z32 z32Var = z32.f13265a;
        if (fM2862y0 != null) {
            int iM5140F = p32.m5140F((int) fM2862y0.floatValue(), 1, 50);
            frameLayout.setTag(C0203R.id.tag_hud_toque_rep_count, Integer.valueOf(iM5140F));
            floatingService.atualizarBadgeContagemToqueRep(frameLayout);
            textView.setText(String.valueOf(iM5140F));
            floatingService.salvarMapeamentoHud();
        }
        return z32Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void abrirPainelConfigToqueRep$lambda$237(FloatingService floatingService, FrameLayout frameLayout, View view, TextView textView, TextView textView2, TextView textView3, View view2) throws JSONException {
        frameLayout.setTag(C0203R.id.tag_hud_toque_rep_until, Boolean.valueOf(!floatingService.obterToqueRepAteChave(frameLayout)));
        abrirPainelConfigToqueRep$atualizarUiAvancado(view, floatingService, textView, textView2, frameLayout, textView3);
        floatingService.salvarMapeamentoHud();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void abrirPainelConfigToqueRep$lambda$240(FloatingService floatingService, FrameLayout frameLayout, View view) throws JSONException {
        floatingService.fecharPainelConfigToqueRep();
        FrameLayout frameLayoutObterContainerHud = floatingService.obterContainerHud();
        if (frameLayoutObterContainerHud != null) {
            frameLayoutObterContainerHud.removeView(frameLayout);
        }
        floatingService.salvarMapeamentoHud();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void abrirPainelConfiguracoes() {
        if (this.configPanelView != null) {
            fecharPainelConfiguracoes();
            return;
        }
        WindowManager windowManager = this.windowManager;
        if (windowManager == null) {
            return;
        }
        bc1 bc1VarObterTamanhoRealTela = obterTamanhoRealTela();
        int iIntValue = ((Number) bc1VarObterTamanhoRealTela.f1292a).intValue();
        int iIntValue2 = ((Number) bc1VarObterTamanhoRealTela.f1293b).intValue();
        int iMax = Math.max(iIntValue, iIntValue2);
        int iMin = Math.min(iIntValue, iIntValue2);
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setBackgroundColor(-2013265920);
        frameLayout.setClickable(true);
        frameLayout.setOnClickListener(new nb0(this, 15));
        if (this.cursorMaoVisivel) {
            esconderPonteiroSistema(frameLayout);
        } else {
            mostrarPonteiroSistema(frameLayout);
        }
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setBackground(fundoArredondado(this.corPainelFundo, 22));
        linearLayout.setElevation(dpParaPx(16));
        linearLayout.setClickable(true);
        int iDpParaPx = dpParaPx(16);
        linearLayout.setPadding(iDpParaPx, iDpParaPx, iDpParaPx, iDpParaPx);
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        TextView textView = new TextView(this);
        textView.setText("Configurações");
        textView.setTextColor(this.corPainelTexto);
        textView.setTextSize(18.0f);
        textView.setTypeface(textView.getTypeface(), 1);
        linearLayout2.addView(textView, new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView textView2 = new TextView(this);
        textView2.setText("X");
        textView2.setTextColor(this.corPainelTexto);
        textView2.setTextSize(18.0f);
        textView2.setGravity(17);
        textView2.setTypeface(textView2.getTypeface(), 1);
        int iDpParaPx2 = dpParaPx(36);
        textView2.setBackground(fundoArredondado(872415231, 18));
        textView2.setOnClickListener(new nb0(this, 16));
        linearLayout2.addView(textView2, new LinearLayout.LayoutParams(iDpParaPx2, iDpParaPx2));
        linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(-1, -2));
        View view = new View(this);
        view.setBackgroundColor(872415231);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, dpParaPx(1));
        layoutParams.topMargin = dpParaPx(10);
        layoutParams.bottomMargin = dpParaPx(6);
        linearLayout.addView(view, layoutParams);
        ScrollView scrollView = new ScrollView(this);
        scrollView.setFillViewport(true);
        LinearLayout linearLayout3 = new LinearLayout(this);
        linearLayout3.setOrientation(1);
        scrollView.addView(linearLayout3, new FrameLayout.LayoutParams(-1, -2));
        linearLayout.addView(scrollView, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        this.configTituloView = textView;
        this.configConteudoView = linearLayout3;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) (iMax * 0.6f), (int) (iMin * 0.78f));
        layoutParams2.gravity = 17;
        frameLayout.addView(linearLayout, layoutParams2);
        WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(-1, -1, 2038, 2, -3);
        layoutParams3.dimAmount = 0.45f;
        layoutParams3.softInputMode = 18;
        try {
            windowManager.addView(frameLayout, layoutParams3);
            this.hudJanelaNoTopo = false;
            this.configPanelView = frameLayout;
            mostrarMenuConfigPrincipal();
            if (this.hudOverlayView != null) {
                reempilharHudAcimaDoMenu();
            }
        } catch (Exception e) {
            e.printStackTrace();
            this.configPanelView = null;
        }
    }

    public static final /* synthetic */ void access$registrarCallbacksDaemon(FloatingService floatingService) {
        floatingService.registrarCallbacksDaemon();
    }

    public static final /* synthetic */ void access$repassarBotaoMouseEdicao(FloatingService floatingService, int i, boolean z) {
        floatingService.repassarBotaoMouseEdicao(i, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void adicionarAnalogico() {
        recolherBandeja();
        removerComponentesAnalogico();
        bc1 bc1VarCalcularPosicaoAnalogicoPadrao = calcularPosicaoAnalogicoPadrao();
        criarComponenteAnalogico$default(this, ((Number) bc1VarCalcularPosicaoAnalogicoPadrao.f1292a).intValue(), ((Number) bc1VarCalcularPosicaoAnalogicoPadrao.f1293b).intValue(), null, 4, null);
        Toast.makeText(this, "Analógico WASD criado — arraste sobre o joystick do jogo e Salvar", 1).show();
    }

    private final void adicionarTeclaMapeamento() {
        TextView textViewObterConteudoWrapper;
        recolherBandeja();
        bc1 bc1VarCalcularCentroTela = calcularCentroTela(dpParaPx(45), dpParaPx(45));
        int iIntValue = ((Number) bc1VarCalcularCentroTela.f1292a).intValue();
        int iIntValue2 = ((Number) bc1VarCalcularCentroTela.f1293b).intValue();
        FrameLayout frameLayoutObterContainerHud = obterContainerHud();
        if (frameLayoutObterContainerHud == null) {
            return;
        }
        int childCount = frameLayoutObterContainerHud.getChildCount();
        criarComponenteToque$default(this, iIntValue, iIntValue2, "?", null, 8, null);
        if (frameLayoutObterContainerHud.getChildCount() <= childCount) {
            return;
        }
        View childAt = frameLayoutObterContainerHud.getChildAt(frameLayoutObterContainerHud.getChildCount() - 1);
        FrameLayout frameLayout = childAt instanceof FrameLayout ? (FrameLayout) childAt : null;
        if (frameLayout == null || (textViewObterConteudoWrapper = obterConteudoWrapper(frameLayout)) == null) {
            return;
        }
        ativarModoEscutaComponente(textViewObterConteudoWrapper, new pb0(this, textViewObterConteudoWrapper, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 adicionarTeclaMapeamento$lambda$86(FloatingService floatingService, TextView textView, String str) {
        str.getClass();
        floatingService.aplicarTeclaNoComponente(textView, str);
        return z32.f13265a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void adicionarToqueRepetido() {
        recolherBandeja();
        int iDpParaPx = dpParaPx(28);
        int iDpParaPx2 = dpParaPx(45);
        int iDpParaPx3 = dpParaPx(18) / 2;
        bc1 bc1VarCalcularCentroTela = calcularCentroTela(iDpParaPx + iDpParaPx2 + iDpParaPx3, iDpParaPx2 + iDpParaPx3);
        criarComponenteToqueRep(((Number) bc1VarCalcularCentroTela.f1292a).intValue(), ((Number) bc1VarCalcularCentroTela.f1293b).intValue(), "?", null);
        Toast.makeText(this, "Toque repetido criado — defina a tecla e a contagem na engrenagem", 1).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void adicionarVisaoFps() {
        recolherBandeja();
        bc1 bc1VarCalcularCentroTela = calcularCentroTela(dpParaPx(136) + dpParaPx(18), dpParaPx(72) + dpParaPx(18));
        criarComponenteFps(((Number) bc1VarCalcularCentroTela.f1292a).intValue(), ((Number) bc1VarCalcularCentroTela.f1293b).intValue(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void agendarReavaliarDisplayOverlay() {
        this.handlerMonitor.post(new hb0(this, 19));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void agendarReavaliarDisplayOverlay$lambda$26(FloatingService floatingService) throws JSONException {
        try {
            OverlayDisplayBinder overlayDisplayBinder = OverlayDisplayBinder.INSTANCE;
            Context applicationContext = floatingService.getApplicationContext();
            applicationContext.getClass();
            if (overlayDisplayBinder.resolver(applicationContext).getDisplayId() == floatingService.overlayDisplayId) {
                sincronizarDisplayInjecao$default(floatingService, null, 1, null);
            } else {
                floatingService.recriarOverlaysNoDisplayAtual();
            }
        } catch (Exception unused) {
        }
    }

    private final void aguardarCanalInjecao(int i) {
        this.handlerMonitor.postDelayed(new jc0(this, i, 1), i == 0 ? 500L : 1500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void aguardarCanalInjecao$lambda$12(FloatingService floatingService, int i) throws JSONException {
        InjectionDaemonManager injectionDaemonManager = InjectionDaemonManager.INSTANCE;
        String packageName = floatingService.getPackageName();
        packageName.getClass();
        if (!injectionDaemonManager.garantirCanalOperacional(packageName)) {
            if (i < 12) {
                floatingService.aguardarCanalInjecao(i + 1);
                return;
            }
            return;
        }
        floatingService.registrarCallbacksDaemon();
        floatingService.aplicarVelocidadePonteiroSistema();
        if (floatingService.resDesejadaW <= 0 && !floatingService.overrideResAtivo) {
            injectionDaemonManager.enqueueComando("SET_RES reset");
        }
        if (floatingService.dpiDesejada <= 0 && !floatingService.overrideDpiAtivo) {
            injectionDaemonManager.enqueueComando("SET_DPI reset");
        }
        floatingService.handlerMonitor.postDelayed(new hb0(floatingService, 2), 400L);
        if (floatingService.hudEmModoJogo) {
            ativarTecladoNoDaemon$default(floatingService, false, 1, null);
        } else {
            injectionDaemonManager.enqueueComando(InjectionProtocol.INPUT_STOP);
        }
        if (floatingService.hudEmModoJogo) {
            floatingService.mostrarCursorVirtualMaoCentro();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void aguardarCanalInjecao$lambda$12$lambda$11(FloatingService floatingService) {
        floatingService.capturarResolucaoNativaSeNecessario();
        if (floatingService.ajusteTelaAuto || floatingService.ajusteTelaUmaVez) {
            if (floatingService.resDesejadaW > 0 || floatingService.dpiDesejada > 0) {
                BuildersKt__Builders_commonKt.launch$default(floatingService.serviceScope, Dispatchers.getIO(), null, new FloatingService$aguardarCanalInjecao$1$1$1(floatingService, null), 2, null);
            }
        }
    }

    private final void aguardarResolucaoEReconfigurar(int i) throws JSONException {
        boolean z = this.overrideResAtivo;
        int i2 = z ? this.resDesejadaW : this.resNativaW;
        int i3 = z ? this.resDesejadaH : this.resNativaH;
        bc1 bc1VarObterTamanhoRealTela = obterTamanhoRealTela();
        int iIntValue = ((Number) bc1VarObterTamanhoRealTela.f1292a).intValue();
        int iIntValue2 = ((Number) bc1VarObterTamanhoRealTela.f1293b).intValue();
        int iMax = Math.max(iIntValue, iIntValue2);
        int iMin = Math.min(iIntValue, iIntValue2);
        if (i2 <= 0 || i3 <= 0 ? i < 2 : (iMax != i2 || iMin != i3) && (iMax != i3 || iMin != i2)) {
            if (i < 12) {
                this.handlerMonitor.postDelayed(new jc0(this, i, 0), 150L);
                return;
            }
        }
        reconfigurarAposMudancaResolucao();
    }

    public static /* synthetic */ void aguardarResolucaoEReconfigurar$default(FloatingService floatingService, int i, int i2, Object obj) throws JSONException {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        floatingService.aguardarResolucaoEReconfigurar(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void aguardarResolucaoEReconfigurar$lambda$335(FloatingService floatingService, int i) throws JSONException {
        floatingService.aguardarResolucaoEReconfigurar(i + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:27:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:34:0x0105 A[PHI: r4 r5
  0x0105: PHI (r4v7 og0) = (r4v4 og0), (r4v9 og0) binds: [B:32:0x0102, B:17:0x007b] A[DONT_GENERATE, DONT_INLINE]
  0x0105: PHI (r5v13 java.lang.String) = (r5v10 java.lang.String), (r5v15 java.lang.String) binds: [B:32:0x0102, B:17:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x0117 A[PHI: r4 r5 r9
  0x0117: PHI (r4v10 og0) = (r4v7 og0), (r4v13 og0) binds: [B:35:0x0114, B:16:0x0066] A[DONT_GENERATE, DONT_INLINE]
  0x0117: PHI (r5v16 java.lang.String) = (r5v13 java.lang.String), (r5v19 java.lang.String) binds: [B:35:0x0114, B:16:0x0066] A[DONT_GENERATE, DONT_INLINE]
  0x0117: PHI (r9v6 java.lang.Object) = (r9v5 java.lang.Object), (r9v1 java.lang.Object) binds: [B:35:0x0114, B:16:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x011f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0122  */
    /* JADX WARN: Code duplicated, block: B:44:0x0136 A[PHI: r4
  0x0136: PHI (r4v14 og0) = (r4v10 og0), (r4v16 og0) binds: [B:42:0x0133, B:15:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x014a A[PHI: r4
  0x014a: PHI (r4v17 og0) = (r4v14 og0), (r4v20 og0) binds: [B:45:0x0147, B:14:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x015c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object ajustarDisplay(String str, String str2, String str3, og0 og0Var, InterfaceC0579du interfaceC0579du) {
        C01461 c01461;
        String str4;
        og0 og0Var2;
        PrivilegeShell privilegeShell;
        Object objInvoke;
        if (interfaceC0579du instanceof C01461) {
            c01461 = (C01461) interfaceC0579du;
            int i = c01461.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c01461.label = i - Integer.MIN_VALUE;
            } else {
                c01461 = new C01461(interfaceC0579du);
            }
        } else {
            c01461 = new C01461(interfaceC0579du);
        }
        Object objInvoke2 = c01461.result;
        int i2 = c01461.label;
        Object obj = EnumC1530vu.f11768a;
        switch (i2) {
            case 0:
                ua0.m6440Z(objInvoke2);
                c01461.L$0 = str;
                c01461.L$1 = str2;
                c01461.L$2 = str3;
                c01461.L$3 = og0Var;
                c01461.label = 1;
                objInvoke2 = og0Var.invoke(c01461);
                if (objInvoke2 != obj) {
                    if (((Boolean) objInvoke2).booleanValue()) {
                        return Boolean.TRUE;
                    }
                    c01461.L$0 = null;
                    c01461.L$1 = null;
                    c01461.L$2 = str3;
                    c01461.L$3 = og0Var;
                    c01461.label = 2;
                    if (enviarComandoInjecaoAwait(str2, c01461) != obj) {
                        str4 = str3;
                        og0Var2 = og0Var;
                        c01461.L$0 = null;
                        c01461.L$1 = null;
                        c01461.L$2 = str4;
                        c01461.L$3 = og0Var2;
                        c01461.label = 3;
                        if (DelayKt.delay(200L, c01461) != obj) {
                            c01461.L$0 = null;
                            c01461.L$1 = null;
                            c01461.L$2 = str4;
                            c01461.L$3 = og0Var2;
                            c01461.label = 4;
                            objInvoke2 = og0Var2.invoke(c01461);
                            if (objInvoke2 != obj) {
                                if (((Boolean) objInvoke2).booleanValue()) {
                                    return Boolean.TRUE;
                                }
                                privilegeShell = PrivilegeShell.INSTANCE;
                                c01461.L$0 = null;
                                c01461.L$1 = null;
                                c01461.L$2 = null;
                                c01461.L$3 = og0Var2;
                                c01461.label = 5;
                                if (privilegeShell.executar(str4, c01461) != obj) {
                                    c01461.L$0 = null;
                                    c01461.L$1 = null;
                                    c01461.L$2 = null;
                                    c01461.L$3 = og0Var2;
                                    c01461.label = 6;
                                    if (DelayKt.delay(250L, c01461) != obj) {
                                        c01461.L$0 = null;
                                        c01461.L$1 = null;
                                        c01461.L$2 = null;
                                        c01461.L$3 = null;
                                        c01461.label = 7;
                                        objInvoke = og0Var2.invoke(c01461);
                                        if (objInvoke == obj) {
                                            return objInvoke;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return obj;
            case 1:
                og0Var = (og0) c01461.L$3;
                str3 = (String) c01461.L$2;
                str2 = (String) c01461.L$1;
                ua0.m6440Z(objInvoke2);
                if (((Boolean) objInvoke2).booleanValue()) {
                    return Boolean.TRUE;
                }
                c01461.L$0 = null;
                c01461.L$1 = null;
                c01461.L$2 = str3;
                c01461.L$3 = og0Var;
                c01461.label = 2;
                if (enviarComandoInjecaoAwait(str2, c01461) != obj) {
                    str4 = str3;
                    og0Var2 = og0Var;
                    c01461.L$0 = null;
                    c01461.L$1 = null;
                    c01461.L$2 = str4;
                    c01461.L$3 = og0Var2;
                    c01461.label = 3;
                    if (DelayKt.delay(200L, c01461) != obj) {
                        c01461.L$0 = null;
                        c01461.L$1 = null;
                        c01461.L$2 = str4;
                        c01461.L$3 = og0Var2;
                        c01461.label = 4;
                        objInvoke2 = og0Var2.invoke(c01461);
                        if (objInvoke2 != obj) {
                            if (((Boolean) objInvoke2).booleanValue()) {
                                return Boolean.TRUE;
                            }
                            privilegeShell = PrivilegeShell.INSTANCE;
                            c01461.L$0 = null;
                            c01461.L$1 = null;
                            c01461.L$2 = null;
                            c01461.L$3 = og0Var2;
                            c01461.label = 5;
                            if (privilegeShell.executar(str4, c01461) != obj) {
                                c01461.L$0 = null;
                                c01461.L$1 = null;
                                c01461.L$2 = null;
                                c01461.L$3 = og0Var2;
                                c01461.label = 6;
                                if (DelayKt.delay(250L, c01461) != obj) {
                                    c01461.L$0 = null;
                                    c01461.L$1 = null;
                                    c01461.L$2 = null;
                                    c01461.L$3 = null;
                                    c01461.label = 7;
                                    objInvoke = og0Var2.invoke(c01461);
                                    if (objInvoke == obj) {
                                        return objInvoke;
                                    }
                                }
                            }
                        }
                    }
                }
                return obj;
            case 2:
                og0Var2 = (og0) c01461.L$3;
                str4 = (String) c01461.L$2;
                ua0.m6440Z(objInvoke2);
                c01461.L$0 = null;
                c01461.L$1 = null;
                c01461.L$2 = str4;
                c01461.L$3 = og0Var2;
                c01461.label = 3;
                if (DelayKt.delay(200L, c01461) != obj) {
                    c01461.L$0 = null;
                    c01461.L$1 = null;
                    c01461.L$2 = str4;
                    c01461.L$3 = og0Var2;
                    c01461.label = 4;
                    objInvoke2 = og0Var2.invoke(c01461);
                    if (objInvoke2 != obj) {
                        if (((Boolean) objInvoke2).booleanValue()) {
                            return Boolean.TRUE;
                        }
                        privilegeShell = PrivilegeShell.INSTANCE;
                        c01461.L$0 = null;
                        c01461.L$1 = null;
                        c01461.L$2 = null;
                        c01461.L$3 = og0Var2;
                        c01461.label = 5;
                        if (privilegeShell.executar(str4, c01461) != obj) {
                            c01461.L$0 = null;
                            c01461.L$1 = null;
                            c01461.L$2 = null;
                            c01461.L$3 = og0Var2;
                            c01461.label = 6;
                            if (DelayKt.delay(250L, c01461) != obj) {
                                c01461.L$0 = null;
                                c01461.L$1 = null;
                                c01461.L$2 = null;
                                c01461.L$3 = null;
                                c01461.label = 7;
                                objInvoke = og0Var2.invoke(c01461);
                                if (objInvoke == obj) {
                                    return objInvoke;
                                }
                            }
                        }
                    }
                }
                return obj;
            case 3:
                og0Var2 = (og0) c01461.L$3;
                str4 = (String) c01461.L$2;
                ua0.m6440Z(objInvoke2);
                c01461.L$0 = null;
                c01461.L$1 = null;
                c01461.L$2 = str4;
                c01461.L$3 = og0Var2;
                c01461.label = 4;
                objInvoke2 = og0Var2.invoke(c01461);
                if (objInvoke2 != obj) {
                    if (((Boolean) objInvoke2).booleanValue()) {
                        return Boolean.TRUE;
                    }
                    privilegeShell = PrivilegeShell.INSTANCE;
                    c01461.L$0 = null;
                    c01461.L$1 = null;
                    c01461.L$2 = null;
                    c01461.L$3 = og0Var2;
                    c01461.label = 5;
                    if (privilegeShell.executar(str4, c01461) != obj) {
                        c01461.L$0 = null;
                        c01461.L$1 = null;
                        c01461.L$2 = null;
                        c01461.L$3 = og0Var2;
                        c01461.label = 6;
                        if (DelayKt.delay(250L, c01461) != obj) {
                            c01461.L$0 = null;
                            c01461.L$1 = null;
                            c01461.L$2 = null;
                            c01461.L$3 = null;
                            c01461.label = 7;
                            objInvoke = og0Var2.invoke(c01461);
                            if (objInvoke == obj) {
                                return objInvoke;
                            }
                        }
                    }
                }
                return obj;
            case 4:
                og0Var2 = (og0) c01461.L$3;
                str4 = (String) c01461.L$2;
                ua0.m6440Z(objInvoke2);
                if (((Boolean) objInvoke2).booleanValue()) {
                    return Boolean.TRUE;
                }
                privilegeShell = PrivilegeShell.INSTANCE;
                c01461.L$0 = null;
                c01461.L$1 = null;
                c01461.L$2 = null;
                c01461.L$3 = og0Var2;
                c01461.label = 5;
                if (privilegeShell.executar(str4, c01461) != obj) {
                    c01461.L$0 = null;
                    c01461.L$1 = null;
                    c01461.L$2 = null;
                    c01461.L$3 = og0Var2;
                    c01461.label = 6;
                    if (DelayKt.delay(250L, c01461) != obj) {
                        c01461.L$0 = null;
                        c01461.L$1 = null;
                        c01461.L$2 = null;
                        c01461.L$3 = null;
                        c01461.label = 7;
                        objInvoke = og0Var2.invoke(c01461);
                        if (objInvoke == obj) {
                            return objInvoke;
                        }
                    }
                }
                return obj;
            case 5:
                og0Var2 = (og0) c01461.L$3;
                ua0.m6440Z(objInvoke2);
                c01461.L$0 = null;
                c01461.L$1 = null;
                c01461.L$2 = null;
                c01461.L$3 = og0Var2;
                c01461.label = 6;
                if (DelayKt.delay(250L, c01461) != obj) {
                    c01461.L$0 = null;
                    c01461.L$1 = null;
                    c01461.L$2 = null;
                    c01461.L$3 = null;
                    c01461.label = 7;
                    objInvoke = og0Var2.invoke(c01461);
                    if (objInvoke == obj) {
                        return objInvoke;
                    }
                }
                return obj;
            case 6:
                og0Var2 = (og0) c01461.L$3;
                ua0.m6440Z(objInvoke2);
                c01461.L$0 = null;
                c01461.L$1 = null;
                c01461.L$2 = null;
                c01461.L$3 = null;
                c01461.label = 7;
                objInvoke = og0Var2.invoke(c01461);
                if (objInvoke == obj) {
                    return obj;
                }
                return objInvoke;
            case 7:
                ua0.m6440Z(objInvoke2);
                return objInvoke2;
            default:
                f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void alternarBandeja() {
        View viewFindViewById;
        View view = this.hudOverlayView;
        if (view == null || (viewFindViewById = view.findViewById(C0203R.id.bandejaAvancada)) == null) {
            return;
        }
        viewFindViewById.setVisibility(viewFindViewById.getVisibility() == 0 ? 8 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void alternarMenuConfiguracoes() {
        if (this.menuView == null) {
            abrirMenuConfiguracoes();
        } else {
            fecharMenuConfiguracoes();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void alternarModoCursor(boolean z) {
        ImageView imageView;
        this.fpsModoAtivo = z;
        if (this.hudEmModoJogo) {
            if (z) {
                salvarPosicaoCursorAtual();
                definirPosicaoCursorAbsoluta(CURSOR_FORA_TELA, CURSOR_FORA_TELA);
                View view = this.hudOverlayView;
                if (view != null && (imageView = (ImageView) view.findViewById(C0203R.id.cursorVirtualMao)) != null) {
                    imageView.setVisibility(8);
                }
                this.cursorMaoVisivel = false;
            } else {
                mostrarCursorVirtualMaoCentro();
            }
            atualizarVisibilidadeAnalogHud();
            atualizarVisibilidadeGraficoMira();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void alternarModoDigitar(TextView textView) {
        boolean z = this.modoDigitarAtivo;
        final boolean z2 = !z;
        this.modoDigitarAtivo = z2;
        new Thread(new Runnable() { // from class: ec0
            @Override // java.lang.Runnable
            public final void run() {
                FloatingService.alternarModoDigitar$lambda$41(z2);
            }
        }).start();
        if (z) {
            Toast.makeText(this, "Digitar inativo ? teclado no HUD", 0).show();
        } else {
            Toast.makeText(this, "Digitar ATIVO ? teclado livre (mouse normal)", 0).show();
        }
        if (textView == null) {
            View view = this.menuView;
            textView = view != null ? (TextView) view.findViewById(C0203R.id.btnMenuDigitar) : null;
        }
        if (textView != null) {
            atualizarVisualBotaoDigitar(textView);
        }
    }

    public static /* synthetic */ void alternarModoDigitar$default(FloatingService floatingService, TextView textView, int i, Object obj) {
        if ((i & 1) != 0) {
            textView = null;
        }
        floatingService.alternarModoDigitar(textView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void alternarModoDigitar$lambda$41(boolean z) {
        InjectionDaemonManager.INSTANCE.enqueueComando(z ? "DIGITAR 1" : "DIGITAR 0");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void alternarPainelConfig() {
        this.painelConfigRecolhido = !this.painelConfigRecolhido;
        aplicarEstadoPainelConfig();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animarBolinhaInteligente(final WindowManager.LayoutParams layoutParams, final boolean z) {
        final WindowManager windowManager;
        final View view = this.floatingView;
        if (view == null || (windowManager = this.windowManager) == null) {
            return;
        }
        int i = getResources().getDisplayMetrics().widthPixels;
        int width = view.getWidth();
        int height = view.getHeight();
        int i2 = layoutParams.x;
        int i3 = layoutParams.y;
        int i4 = i - (i2 + width);
        int iPresidentialX = presidentialX(i2, i, width, z, i2, i4, i3);
        int iPresidentialY = presidentialY(i3, height, z, i2, i4, i3);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(layoutParams.x, iPresidentialX);
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(layoutParams.y, iPresidentialY);
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfInt2.setDuration(300L);
        valueAnimatorOfInt2.setInterpolator(new DecelerateInterpolator());
        final int i5 = 0;
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: vb0

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ FloatingService f11603b;

            {
                this.f11603b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i6 = i5;
                View view2 = view;
                WindowManager windowManager2 = windowManager;
                WindowManager.LayoutParams layoutParams2 = layoutParams;
                FloatingService floatingService = this.f11603b;
                switch (i6) {
                    case 0:
                        FloatingService.animarBolinhaInteligente$lambda$342(floatingService, layoutParams2, windowManager2, view2, valueAnimator);
                        break;
                    default:
                        FloatingService.animarBolinhaInteligente$lambda$343(floatingService, layoutParams2, windowManager2, view2, valueAnimator);
                        break;
                }
            }
        });
        final int i6 = 1;
        valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: vb0

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ FloatingService f11603b;

            {
                this.f11603b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i7 = i6;
                View view2 = view;
                WindowManager windowManager2 = windowManager;
                WindowManager.LayoutParams layoutParams2 = layoutParams;
                FloatingService floatingService = this.f11603b;
                switch (i7) {
                    case 0:
                        FloatingService.animarBolinhaInteligente$lambda$342(floatingService, layoutParams2, windowManager2, view2, valueAnimator);
                        break;
                    default:
                        FloatingService.animarBolinhaInteligente$lambda$343(floatingService, layoutParams2, windowManager2, view2, valueAnimator);
                        break;
                }
            }
        });
        valueAnimatorOfInt.addListener(new AnimatorListenerAdapter() { // from class: com.example.ssmousepro.FloatingService.animarBolinhaInteligente.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                animator.getClass();
                FloatingService.this.estaRecolhida = z;
            }
        });
        valueAnimatorOfInt.start();
        valueAnimatorOfInt2.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animarBolinhaInteligente$lambda$342(FloatingService floatingService, WindowManager.LayoutParams layoutParams, WindowManager windowManager, View view, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        if (floatingService.floatingView != null) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            animatedValue.getClass();
            layoutParams.x = ((Integer) animatedValue).intValue();
            try {
                windowManager.updateViewLayout(view, layoutParams);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animarBolinhaInteligente$lambda$343(FloatingService floatingService, WindowManager.LayoutParams layoutParams, WindowManager windowManager, View view, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        if (floatingService.floatingView != null) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            animatedValue.getClass();
            layoutParams.y = ((Integer) animatedValue).intValue();
            try {
                windowManager.updateViewLayout(view, layoutParams);
            } catch (Exception unused) {
            }
        }
    }

    private final void aplicarAntiBlockFps(FrameLayout frameLayout, FpsAntiBlockModo fpsAntiBlockModo) throws JSONException {
        if (DevToolsGate.INSTANCE.getLiberado()) {
            frameLayout.setTag(C0203R.id.tag_hud_fps_anti_block, fpsAntiBlockModo.getId());
            InjectionDaemonManager.INSTANCE.enqueueComando("FPS_ANTI_BLOCK " + fpsAntiBlockModo.getId());
            salvarMapeamentoHud();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object aplicarDpiOverride(boolean z, InterfaceC0579du interfaceC0579du) {
        C01481 c01481;
        FloatingService floatingService;
        if (interfaceC0579du instanceof C01481) {
            c01481 = (C01481) interfaceC0579du;
            int i = c01481.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c01481.label = i - Integer.MIN_VALUE;
            } else {
                c01481 = new C01481(interfaceC0579du);
            }
        } else {
            c01481 = new C01481(interfaceC0579du);
        }
        C01481 c01482 = c01481;
        Object objAjustarDisplay = c01482.result;
        int i2 = c01482.label;
        if (i2 == 0) {
            ua0.m6440Z(objAjustarDisplay);
            int i3 = this.dpiDesejada;
            if (i3 <= 0) {
                return Boolean.TRUE;
            }
            if (this.overrideDpiAtivo && this.dpiAplicada == i3) {
                return Boolean.TRUE;
            }
            String strValueOf = String.valueOf(i3);
            String strM5339f = AbstractC1308pu.m5339f("SET_DPI ", strValueOf);
            String strM5339f2 = AbstractC1308pu.m5339f("SET_DPI ", strValueOf);
            String strM5339f3 = AbstractC1308pu.m5339f("wm density ", strValueOf);
            FloatingService$aplicarDpiOverride$verificado$1 floatingService$aplicarDpiOverride$verificado$1 = new FloatingService$aplicarDpiOverride$verificado$1(this, strValueOf, null);
            c01482.L$0 = strValueOf;
            c01482.Z$0 = z;
            c01482.label = 1;
            floatingService = this;
            objAjustarDisplay = floatingService.ajustarDisplay(strM5339f, strM5339f2, strM5339f3, floatingService$aplicarDpiOverride$verificado$1, c01482);
            EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
            if (objAjustarDisplay == enumC1530vu) {
                return enumC1530vu;
            }
        } else {
            if (i2 != 1) {
                f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = c01482.Z$0;
            ua0.m6440Z(objAjustarDisplay);
            floatingService = this;
        }
        if (((Boolean) objAjustarDisplay).booleanValue()) {
            floatingService.overrideDpiAtivo = true;
            floatingService.dpiAplicada = floatingService.dpiDesejada;
            if (!z) {
                floatingService.handlerMonitor.post(new hb0(floatingService, 4));
            }
            floatingService.handlerMonitor.post(new hb0(floatingService, 5));
            return Boolean.TRUE;
        }
        Log.w(TAG_HUD_LIFECYCLE, "Falha ao aplicar DPI " + floatingService.dpiDesejada);
        if (!z) {
            floatingService.handlerMonitor.post(new hb0(floatingService, 6));
        }
        return Boolean.FALSE;
    }

    public static /* synthetic */ Object aplicarDpiOverride$default(FloatingService floatingService, boolean z, InterfaceC0579du interfaceC0579du, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return floatingService.aplicarDpiOverride(z, interfaceC0579du);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void aplicarDpiOverride$lambda$330(FloatingService floatingService) {
        Toast.makeText(floatingService, "DPI " + floatingService.dpiDesejada + " aplicado", 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void aplicarDpiOverride$lambda$332(FloatingService floatingService) {
        Toast.makeText(floatingService, "Falha ao mudar DPI — verifique Shizuku ou Depuração Wi‑Fi", 1).show();
    }

    private final void aplicarEstadoPainelConfig() {
        View view = this.hudOverlayView;
        View viewFindViewById = view != null ? view.findViewById(C0203R.id.painelConfigConteudo) : null;
        View view2 = this.hudOverlayView;
        TextView textView = view2 != null ? (TextView) view2.findViewById(C0203R.id.btnToggleConfig) : null;
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(this.painelConfigRecolhido ? 8 : 0);
        }
        if (textView != null) {
            textView.setText(this.painelConfigRecolhido ? "Configurações  ▼" : "Configurações  ▲");
        }
    }

    private final void aplicarLayoutHudRaiz() {
        WindowManager.LayoutParams layoutParams;
        View view;
        WindowManager windowManager = this.windowManager;
        if (windowManager == null || (layoutParams = this.hudOverlayParams) == null || (view = this.hudOverlayView) == null) {
            return;
        }
        try {
            windowManager.updateViewLayout(view, layoutParams);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00af  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f7  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void aplicarModoEdicao() {
        View viewObterViewConteudoWrapper;
        TextView textView;
        FloatingService floatingService;
        View viewObterBotaoConfigToque;
        View viewObterBadgeContagemToqueRep;
        TextView textView2;
        FrameLayout frameLayoutObterContainerHud = obterContainerHud();
        if (frameLayoutObterContainerHud == null) {
            return;
        }
        int childCount = frameLayoutObterContainerHud.getChildCount();
        int i = 0;
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = frameLayoutObterContainerHud.getChildAt(i2);
            FrameLayout frameLayout = childAt instanceof FrameLayout ? (FrameLayout) childAt : null;
            if (frameLayout == null) {
                floatingService = this;
            } else {
                Object tag = frameLayout.getTag(C0203R.id.tag_hud_tipo);
                String str = tag instanceof String ? (String) tag : null;
                if (str != null && (viewObterViewConteudoWrapper = this.obterViewConteudoWrapper(frameLayout)) != null) {
                    View viewObterBotaoExcluirWrapper = this.obterBotaoExcluirWrapper(frameLayout);
                    frameLayout.setVisibility(0);
                    frameLayout.setAlpha(1.0f);
                    viewObterViewConteudoWrapper.setAlpha(1.0f);
                    if (viewObterBotaoExcluirWrapper != null) {
                        viewObterBotaoExcluirWrapper.setVisibility(0);
                    }
                    int i3 = 1;
                    switch (str.hashCode()) {
                        case 69833:
                            if (!str.equals(TIPO_FPS)) {
                                textView = viewObterViewConteudoWrapper instanceof TextView ? (TextView) viewObterViewConteudoWrapper : null;
                                if (textView != null) {
                                    TextView textView3 = textView;
                                    View[] viewArr = {viewObterBotaoExcluirWrapper};
                                    mc0 mc0Var = new mc0(this, textView3, str, i3);
                                    floatingService = this;
                                    configurarArraste$default(floatingService, frameLayout, frameLayoutObterContainerHud, viewArr, null, mc0Var, 8, null);
                                } else {
                                    floatingService = this;
                                }
                            } else {
                                floatingService = this;
                                FpsViewHudView fpsViewHudView = viewObterViewConteudoWrapper instanceof FpsViewHudView ? (FpsViewHudView) viewObterViewConteudoWrapper : null;
                                if (fpsViewHudView != null) {
                                    fpsViewHudView.setModoEdicao(true);
                                    View viewObterBotaoConfigFps = floatingService.obterBotaoConfigFps(frameLayout);
                                    if (viewObterBotaoConfigFps != null) {
                                        viewObterBotaoConfigFps.setVisibility(0);
                                    }
                                    floatingService.vincularCallbacksFpsView(frameLayout, fpsViewHudView);
                                    configurarArraste$default(floatingService, frameLayout, frameLayoutObterContainerHud, new View[]{viewObterBotaoExcluirWrapper, floatingService.obterBotaoConfigFps(frameLayout)}, new kc0(fpsViewHudView, i3), null, 16, null);
                                }
                            }
                            break;
                        case 80009798:
                            if (!str.equals(TIPO_TOQUE)) {
                                if (viewObterViewConteudoWrapper instanceof TextView) {
                                }
                                if (textView != null) {
                                    TextView textView4 = textView;
                                    View[] viewArr2 = {viewObterBotaoExcluirWrapper};
                                    mc0 mc0Var2 = new mc0(this, textView4, str, i3);
                                    floatingService = this;
                                    configurarArraste$default(floatingService, frameLayout, frameLayoutObterContainerHud, viewArr2, null, mc0Var2, 8, null);
                                } else {
                                    floatingService = this;
                                }
                            } else {
                                viewObterBotaoConfigToque = this.obterBotaoConfigToque(frameLayout);
                                if (viewObterBotaoConfigToque != null) {
                                    viewObterBotaoConfigToque.setVisibility(0);
                                }
                                viewObterBadgeContagemToqueRep = this.obterBadgeContagemToqueRep(frameLayout);
                                if (viewObterBadgeContagemToqueRep != null) {
                                    viewObterBadgeContagemToqueRep.setAlpha(1.0f);
                                    viewObterBadgeContagemToqueRep.setClickable(true);
                                }
                                textView2 = viewObterViewConteudoWrapper instanceof TextView ? (TextView) viewObterViewConteudoWrapper : null;
                                if (textView2 == null) {
                                    View[] viewArr3 = {viewObterBotaoExcluirWrapper, this.obterBotaoConfigToque(frameLayout), this.obterBadgeContagemToqueRep(frameLayout)};
                                    mc0 mc0Var3 = new mc0(this, textView2, str, i);
                                    floatingService = this;
                                    configurarArraste$default(floatingService, frameLayout, frameLayoutObterContainerHud, viewArr3, null, mc0Var3, 8, null);
                                } else {
                                    floatingService = this;
                                }
                            }
                            break;
                        case 114209540:
                            if (!str.equals(TIPO_TOQUE_REP)) {
                                if (viewObterViewConteudoWrapper instanceof TextView) {
                                }
                                if (textView != null) {
                                    TextView textView5 = textView;
                                    View[] viewArr4 = {viewObterBotaoExcluirWrapper};
                                    mc0 mc0Var4 = new mc0(this, textView5, str, i3);
                                    floatingService = this;
                                    configurarArraste$default(floatingService, frameLayout, frameLayoutObterContainerHud, viewArr4, null, mc0Var4, 8, null);
                                } else {
                                    floatingService = this;
                                }
                            } else {
                                viewObterBotaoConfigToque = this.obterBotaoConfigToque(frameLayout);
                                if (viewObterBotaoConfigToque != null) {
                                    viewObterBotaoConfigToque.setVisibility(0);
                                }
                                viewObterBadgeContagemToqueRep = this.obterBadgeContagemToqueRep(frameLayout);
                                if (viewObterBadgeContagemToqueRep != null) {
                                    viewObterBadgeContagemToqueRep.setAlpha(1.0f);
                                    viewObterBadgeContagemToqueRep.setClickable(true);
                                }
                                if (viewObterViewConteudoWrapper instanceof TextView) {
                                }
                                if (textView2 == null) {
                                    View[] viewArr5 = {viewObterBotaoExcluirWrapper, this.obterBotaoConfigToque(frameLayout), this.obterBadgeContagemToqueRep(frameLayout)};
                                    mc0 mc0Var5 = new mc0(this, textView2, str, i);
                                    floatingService = this;
                                    configurarArraste$default(floatingService, frameLayout, frameLayoutObterContainerHud, viewArr5, null, mc0Var5, 8, null);
                                } else {
                                    floatingService = this;
                                }
                            }
                            break;
                        case 1083955077:
                            if (!str.equals(TIPO_ANALOGICO)) {
                                if (viewObterViewConteudoWrapper instanceof TextView) {
                                }
                                if (textView != null) {
                                    TextView textView6 = textView;
                                    View[] viewArr6 = {viewObterBotaoExcluirWrapper};
                                    mc0 mc0Var6 = new mc0(this, textView6, str, i3);
                                    floatingService = this;
                                    configurarArraste$default(floatingService, frameLayout, frameLayoutObterContainerHud, viewArr6, null, mc0Var6, 8, null);
                                } else {
                                    floatingService = this;
                                }
                            } else {
                                View viewObterBotaoConfigAnalog = this.obterBotaoConfigAnalog(frameLayout);
                                if (viewObterBotaoConfigAnalog != null) {
                                    viewObterBotaoConfigAnalog.setVisibility(0);
                                }
                                View viewObterBotaoResizeAnalog = this.obterBotaoResizeAnalog(frameLayout);
                                if (viewObterBotaoResizeAnalog != null) {
                                    viewObterBotaoResizeAnalog.setVisibility(0);
                                }
                                AnalogStickHudView analogStickHudViewObterAnalogViewWrapper = this.obterAnalogViewWrapper(frameLayout);
                                if (analogStickHudViewObterAnalogViewWrapper != null) {
                                    analogStickHudViewObterAnalogViewWrapper.setMostrarTeclas(this.obterMostrarTeclasAnalog(frameLayout));
                                }
                                floatingService = this;
                                configurarArraste$default(floatingService, frameLayout, frameLayoutObterContainerHud, new View[]{viewObterBotaoExcluirWrapper, this.obterBotaoConfigAnalog(frameLayout), this.obterBotaoResizeAnalog(frameLayout)}, null, null, 24, null);
                            }
                            break;
                        default:
                            if (viewObterViewConteudoWrapper instanceof TextView) {
                            }
                            if (textView != null) {
                                TextView textView7 = textView;
                                View[] viewArr7 = {viewObterBotaoExcluirWrapper};
                                mc0 mc0Var7 = new mc0(this, textView7, str, i3);
                                floatingService = this;
                                configurarArraste$default(floatingService, frameLayout, frameLayoutObterContainerHud, viewArr7, null, mc0Var7, 8, null);
                            } else {
                                floatingService = this;
                            }
                            break;
                    }
                } else {
                    floatingService = this;
                }
            }
            i2++;
            this = floatingService;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 aplicarModoEdicao$lambda$79(FpsViewHudView fpsViewHudView, float f, float f2) {
        int[] iArr = new int[2];
        fpsViewHudView.getLocationOnScreen(iArr);
        fpsViewHudView.tratarTapEdicao(f - iArr[0], f2 - iArr[1]);
        return z32.f13265a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 aplicarModoEdicao$lambda$81(FloatingService floatingService, TextView textView, String str) {
        mg0 mg0VarCriarAcaoCliqueSimples = floatingService.criarAcaoCliqueSimples(textView, str);
        if (mg0VarCriarAcaoCliqueSimples != null) {
            mg0VarCriarAcaoCliqueSimples.invoke();
        }
        return z32.f13265a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 aplicarModoEdicao$lambda$82(FloatingService floatingService, TextView textView, String str) {
        mg0 mg0VarCriarAcaoCliqueSimples = floatingService.criarAcaoCliqueSimples(textView, str);
        if (mg0VarCriarAcaoCliqueSimples != null) {
            mg0VarCriarAcaoCliqueSimples.invoke();
        }
        return z32.f13265a;
    }

    private final void aplicarModoJogo() {
        View viewObterViewConteudoWrapper;
        FrameLayout frameLayoutObterContainerHud = obterContainerHud();
        if (frameLayoutObterContainerHud == null) {
            return;
        }
        frameLayoutObterContainerHud.setVisibility(0);
        int childCount = frameLayoutObterContainerHud.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = frameLayoutObterContainerHud.getChildAt(i);
            FrameLayout frameLayout = childAt instanceof FrameLayout ? (FrameLayout) childAt : null;
            if (frameLayout != null) {
                Object tag = frameLayout.getTag(C0203R.id.tag_hud_tipo);
                String str = tag instanceof String ? (String) tag : null;
                if (str != null && (viewObterViewConteudoWrapper = obterViewConteudoWrapper(frameLayout)) != null) {
                    View viewObterBotaoExcluirWrapper = obterBotaoExcluirWrapper(frameLayout);
                    frameLayout.setOnTouchListener(null);
                    if (viewObterBotaoExcluirWrapper != null) {
                        viewObterBotaoExcluirWrapper.setVisibility(8);
                    }
                    View viewObterBotaoConfigAnalog = obterBotaoConfigAnalog(frameLayout);
                    if (viewObterBotaoConfigAnalog != null) {
                        viewObterBotaoConfigAnalog.setVisibility(8);
                    }
                    View viewObterBotaoResizeAnalog = obterBotaoResizeAnalog(frameLayout);
                    if (viewObterBotaoResizeAnalog != null) {
                        viewObterBotaoResizeAnalog.setVisibility(8);
                    }
                    View viewObterBotaoConfigFps = obterBotaoConfigFps(frameLayout);
                    if (viewObterBotaoConfigFps != null) {
                        viewObterBotaoConfigFps.setVisibility(8);
                    }
                    View viewObterBotaoConfigToque = obterBotaoConfigToque(frameLayout);
                    if (viewObterBotaoConfigToque != null) {
                        viewObterBotaoConfigToque.setVisibility(8);
                    }
                    FpsViewHudView fpsViewHudViewObterFpsViewWrapper = obterFpsViewWrapper(frameLayout);
                    if (fpsViewHudViewObterFpsViewWrapper != null) {
                        fpsViewHudViewObterFpsViewWrapper.setModoEdicao(false);
                    }
                    frameLayout.setVisibility(0);
                    if (this.exibirHudDuranteJogo) {
                        frameLayout.setAlpha(1.0f);
                        if (!str.equals(TIPO_ANALOGICO)) {
                            float fM5139E = p32.m5139E(this.opacidadeNoJogo, TouchPipeline.SIZE, 1.0f);
                            viewObterViewConteudoWrapper.setAlpha(fM5139E);
                            View viewObterBadgeContagemToqueRep = obterBadgeContagemToqueRep(frameLayout);
                            if (viewObterBadgeContagemToqueRep != null) {
                                viewObterBadgeContagemToqueRep.setAlpha(fM5139E);
                                viewObterBadgeContagemToqueRep.setClickable(false);
                            }
                        } else if (this.fpsModoAtivo) {
                            frameLayout.setAlpha(TouchPipeline.SIZE);
                            viewObterViewConteudoWrapper.setAlpha(TouchPipeline.SIZE);
                        } else {
                            AnalogStickHudView analogStickHudView = viewObterViewConteudoWrapper instanceof AnalogStickHudView ? (AnalogStickHudView) viewObterViewConteudoWrapper : null;
                            if (analogStickHudView != null) {
                                analogStickHudView.setMostrarTeclas(obterMostrarTeclasAnalog(frameLayout));
                            }
                            if (analogStickHudView != null) {
                                analogStickHudView.setAlpha(p32.m5139E(this.opacidadeNoJogo, TouchPipeline.SIZE, 1.0f));
                            }
                        }
                    } else {
                        frameLayout.setAlpha(TouchPipeline.SIZE);
                        viewObterViewConteudoWrapper.setAlpha(TouchPipeline.SIZE);
                        View viewObterBadgeContagemToqueRep2 = obterBadgeContagemToqueRep(frameLayout);
                        if (viewObterBadgeContagemToqueRep2 != null) {
                            viewObterBadgeContagemToqueRep2.setAlpha(TouchPipeline.SIZE);
                        }
                    }
                }
            }
        }
        atualizarVisibilidadeGraficoMira();
    }

    private final void aplicarMousePollingRate() {
        BuildersKt__Builders_commonKt.launch$default(this.serviceScope, Dispatchers.getIO(), null, new C01491(this.mousePollHz, null), 2, null);
    }

    private final void aplicarOverlayFullscreenCutout(WindowManager.LayoutParams layoutParams) {
        if (Build.VERSION.SDK_INT >= 30) {
            layoutParams.layoutInDisplayCutoutMode = 3;
        } else {
            layoutParams.layoutInDisplayCutoutMode = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:39:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a3 A[Catch: all -> 0x00e0, TRY_LEAVE, TryCatch #0 {all -> 0x00e0, blocks: (B:37:0x0098, B:40:0x00a3, B:30:0x007c, B:33:0x0083), top: B:66:0x007c }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:49:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:55:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object aplicarOverridesTela(InterfaceC0579du interfaceC0579du) throws Throwable {
        C01501 c01501;
        Mutex mutex;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Mutex mutex2;
        boolean zBooleanValue;
        Object objAplicarDpiOverride;
        boolean z;
        boolean z2;
        boolean z3;
        if (interfaceC0579du instanceof C01501) {
            c01501 = (C01501) interfaceC0579du;
            int i6 = c01501.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c01501.label = i6 - Integer.MIN_VALUE;
            } else {
                c01501 = new C01501(interfaceC0579du);
            }
        } else {
            c01501 = new C01501(interfaceC0579du);
        }
        Object obj = c01501.result;
        Object obj2 = EnumC1530vu.f11768a;
        int i7 = c01501.label;
        boolean z4 = false;
        try {
            if (i7 == 0) {
                ua0.m6440Z(obj);
                int i8 = this.ajusteTelaGeracao;
                mutex = this.ajusteTelaMutex;
                c01501.L$0 = mutex;
                c01501.I$0 = i8;
                c01501.I$1 = 0;
                c01501.label = 1;
                if (mutex.lock(null, c01501) != obj2) {
                    i = i8;
                    i2 = 0;
                }
                return obj2;
            }
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = c01501.Z$0;
                    mutex2 = (Mutex) c01501.L$0;
                    try {
                        ua0.m6440Z(obj);
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        if (this.resDesejadaW > 0 || z) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (this.dpiDesejada > 0 || zBooleanValue2) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z2 && z3) {
                            z4 = true;
                        }
                        Boolean boolValueOf = Boolean.valueOf(z4);
                        mutex2.unlock(null);
                        return boolValueOf;
                    } catch (Throwable th) {
                        th = th;
                        mutex2.unlock(null);
                        throw th;
                    }
                }
                int i9 = c01501.I$2;
                int i10 = c01501.I$1;
                int i11 = c01501.I$0;
                Mutex mutex3 = (Mutex) c01501.L$0;
                try {
                    ua0.m6440Z(obj);
                    i5 = i9;
                    mutex = mutex3;
                    i3 = i11;
                    i4 = i10;
                    zBooleanValue = ((Boolean) obj).booleanValue();
                    if (i3 != this.ajusteTelaGeracao) {
                        mutex2 = mutex;
                        Boolean boolValueOf2 = Boolean.valueOf(z4);
                        mutex2.unlock(null);
                        return boolValueOf2;
                    }
                    c01501.L$0 = mutex;
                    c01501.I$0 = i3;
                    c01501.I$1 = i4;
                    c01501.I$2 = i5;
                    c01501.Z$0 = zBooleanValue;
                    c01501.label = 3;
                    objAplicarDpiOverride = aplicarDpiOverride(true, c01501);
                    if (objAplicarDpiOverride != obj2) {
                        z = zBooleanValue;
                        obj = objAplicarDpiOverride;
                        mutex2 = mutex;
                        boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                        if (this.resDesejadaW > 0) {
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                        if (this.dpiDesejada > 0) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        if (z2) {
                            z4 = true;
                        }
                        Boolean boolValueOf3 = Boolean.valueOf(z4);
                        mutex2.unlock(null);
                        return boolValueOf3;
                    }
                    return obj2;
                } catch (Throwable th2) {
                    th = th2;
                    mutex2 = mutex3;
                    mutex2.unlock(null);
                    throw th;
                }
            }
            int i12 = c01501.I$1;
            i = c01501.I$0;
            Mutex mutex4 = (Mutex) c01501.L$0;
            ua0.m6440Z(obj);
            i2 = i12;
            mutex = mutex4;
            if (i == this.ajusteTelaGeracao) {
                c01501.L$0 = mutex;
                c01501.I$0 = i;
                c01501.I$1 = i2;
                c01501.I$2 = 0;
                c01501.label = 2;
                Object objAplicarResolucaoOverride = aplicarResolucaoOverride(true, c01501);
                if (objAplicarResolucaoOverride != obj2) {
                    i3 = i;
                    i4 = i2;
                    obj = objAplicarResolucaoOverride;
                    i5 = 0;
                    zBooleanValue = ((Boolean) obj).booleanValue();
                    if (i3 != this.ajusteTelaGeracao) {
                        mutex2 = mutex;
                    } else {
                        c01501.L$0 = mutex;
                        c01501.I$0 = i3;
                        c01501.I$1 = i4;
                        c01501.I$2 = i5;
                        c01501.Z$0 = zBooleanValue;
                        c01501.label = 3;
                        objAplicarDpiOverride = aplicarDpiOverride(true, c01501);
                        if (objAplicarDpiOverride != obj2) {
                            z = zBooleanValue;
                            obj = objAplicarDpiOverride;
                            mutex2 = mutex;
                            boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                            if (this.resDesejadaW > 0) {
                                z2 = true;
                            } else {
                                z2 = true;
                            }
                            if (this.dpiDesejada > 0) {
                                z3 = true;
                            } else {
                                z3 = true;
                            }
                            if (z2) {
                                z4 = true;
                            }
                        }
                    }
                }
                return obj2;
            }
            mutex2 = mutex;
            Boolean boolValueOf4 = Boolean.valueOf(z4);
            mutex2.unlock(null);
            return boolValueOf4;
        } catch (Throwable th3) {
            th = th3;
            mutex2 = mutex;
            mutex2.unlock(null);
            throw th;
        }
    }

    private final void aplicarPosCursorDoDaemon(int i, int i2) {
        if (!this.cursorMaoVisivel || this.fpsModoAtivo) {
            return;
        }
        if (this.hudEmModoJogo || this.hudEmModoEdicao) {
            definirPosicaoCursorAbsoluta(i - cursorPontaXpx(), i2 - cursorPontaYpx());
            if (this.hudEmModoEdicao && this.editMousePressionado) {
                repassarMoveOverlayEdicao();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object aplicarResolucaoOverride(boolean z, InterfaceC0579du interfaceC0579du) {
        C01511 c01511;
        int i;
        FloatingService floatingService;
        String str;
        if (interfaceC0579du instanceof C01511) {
            c01511 = (C01511) interfaceC0579du;
            int i2 = c01511.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c01511.label = i2 - Integer.MIN_VALUE;
            } else {
                c01511 = new C01511(interfaceC0579du);
            }
        } else {
            c01511 = new C01511(interfaceC0579du);
        }
        C01511 c01512 = c01511;
        Object objAjustarDisplay = c01512.result;
        int i3 = c01512.label;
        if (i3 == 0) {
            ua0.m6440Z(objAjustarDisplay);
            int i4 = this.resDesejadaW;
            if (i4 <= 0 || (i = this.resDesejadaH) <= 0) {
                return Boolean.TRUE;
            }
            if (this.overrideResAtivo && this.resAplicadaW == i4 && this.resAplicadaH == i) {
                return Boolean.TRUE;
            }
            int iMin = Math.min(i4, i);
            int iMax = Math.max(this.resDesejadaW, this.resDesejadaH);
            String str2 = iMin + "x" + iMax;
            String strConcat = "SET_RES ".concat(str2);
            String strM5338e = AbstractC1308pu.m5338e("SET_RES ", iMin, iMax, " ");
            String strConcat2 = "wm size ".concat(str2);
            FloatingService$aplicarResolucaoOverride$verificado$1 floatingService$aplicarResolucaoOverride$verificado$1 = new FloatingService$aplicarResolucaoOverride$verificado$1(this, str2, null);
            c01512.L$0 = str2;
            c01512.Z$0 = z;
            c01512.I$0 = iMin;
            c01512.I$1 = iMax;
            c01512.label = 1;
            floatingService = this;
            objAjustarDisplay = floatingService.ajustarDisplay(strConcat, strM5338e, strConcat2, floatingService$aplicarResolucaoOverride$verificado$1, c01512);
            EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
            if (objAjustarDisplay == enumC1530vu) {
                return enumC1530vu;
            }
            str = str2;
        } else {
            if (i3 != 1) {
                f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = c01512.Z$0;
            str = (String) c01512.L$0;
            ua0.m6440Z(objAjustarDisplay);
            floatingService = this;
        }
        if (!((Boolean) objAjustarDisplay).booleanValue()) {
            Log.w(TAG_HUD_LIFECYCLE, "Falha ao aplicar resolução " + str);
            if (!z) {
                floatingService.handlerMonitor.post(new hb0(floatingService, 15));
            }
            return Boolean.FALSE;
        }
        floatingService.overrideResAtivo = true;
        floatingService.resAplicadaW = floatingService.resDesejadaW;
        floatingService.resAplicadaH = floatingService.resDesejadaH;
        if (!z) {
            floatingService.handlerMonitor.post(new hb0(floatingService, 13));
        }
        floatingService.handlerMonitor.post(new hb0(floatingService, 14));
        return Boolean.TRUE;
    }

    public static /* synthetic */ Object aplicarResolucaoOverride$default(FloatingService floatingService, boolean z, InterfaceC0579du interfaceC0579du, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return floatingService.aplicarResolucaoOverride(z, interfaceC0579du);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void aplicarResolucaoOverride$lambda$327(FloatingService floatingService) {
        Toast.makeText(floatingService, "Resolução " + floatingService.resDesejadaW + "x" + floatingService.resDesejadaH + " aplicada", 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void aplicarResolucaoOverride$lambda$329(FloatingService floatingService) {
        Toast.makeText(floatingService, "Falha ao mudar resolução — verifique Shizuku ou Depuração Wi‑Fi", 1).show();
    }

    private final void aplicarSensFpsNoWrapper(FrameLayout frameLayout, float f, float f2) {
        float fM5139E = p32.m5139E(f, 0.1f, 20.0f);
        float fM5139E2 = p32.m5139E(f2, 0.1f, 20.0f);
        frameLayout.setTag(C0203R.id.tag_hud_fps_sens_x, Float.valueOf(fM5139E));
        frameLayout.setTag(C0203R.id.tag_hud_fps_sens_y, Float.valueOf(fM5139E2));
        FpsViewHudView fpsViewHudViewObterFpsViewWrapper = obterFpsViewWrapper(frameLayout);
        if (fpsViewHudViewObterFpsViewWrapper != null) {
            fpsViewHudViewObterFpsViewWrapper.setSensX(fM5139E);
            fpsViewHudViewObterFpsViewWrapper.setSensY(fM5139E2);
        }
    }

    private final void aplicarTamanhoAnalogMantendoCentro(FrameLayout frameLayout, int i) {
        AnalogStickHudView analogStickHudViewObterAnalogViewWrapper;
        FrameLayout frameLayoutObterContainerHud = obterContainerHud();
        if (frameLayoutObterContainerHud == null || (analogStickHudViewObterAnalogViewWrapper = obterAnalogViewWrapper(frameLayout)) == null) {
            return;
        }
        bc1 bc1VarCentroConteudoNoContainer = centroConteudoNoContainer(analogStickHudViewObterAnalogViewWrapper, frameLayoutObterContainerHud);
        int iIntValue = ((Number) bc1VarCentroConteudoNoContainer.f1292a).intValue();
        int iIntValue2 = ((Number) bc1VarCentroConteudoNoContainer.f1293b).intValue();
        int iM5140F = p32.m5140F(i, dpParaPx(40), dpParaPx(200));
        int iDpParaPx = (dpParaPx(4) * 2) + dpParaPx(28) + iM5140F;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iM5140F, iM5140F);
        layoutParams.gravity = 17;
        analogStickHudViewObterAnalogViewWrapper.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
        FrameLayout.LayoutParams layoutParams3 = layoutParams2 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams2 : null;
        if (layoutParams3 == null) {
            return;
        }
        layoutParams3.width = iDpParaPx;
        layoutParams3.height = iDpParaPx;
        int i2 = iDpParaPx / 2;
        layoutParams3.leftMargin = p32.m5140F(iIntValue - i2, 0, Math.max(0, frameLayoutObterContainerHud.getWidth() - iDpParaPx));
        layoutParams3.topMargin = p32.m5140F(iIntValue2 - i2, 0, Math.max(0, frameLayoutObterContainerHud.getHeight() - iDpParaPx));
        frameLayout.setLayoutParams(layoutParams3);
        frameLayout.requestLayout();
    }

    private final void aplicarTeclaFps(FrameLayout frameLayout, FpsViewHudView fpsViewHudView, String str) {
        EditText editText;
        frameLayout.setTag(C0203R.id.tag_hud_tecla, str);
        fpsViewHudView.setTeclaRotulo(LinuxKeyCodes.INSTANCE.rotuloExibicaoHud(str));
        fpsViewHudView.setModoEscuta(false);
        View view = this.hudOverlayView;
        if (view == null || (editText = (EditText) view.findViewById(C0203R.id.edtFpsTecla)) == null) {
            return;
        }
        editText.setText(fpsViewHudView.getTeclaRotulo());
    }

    private final void aplicarTeclaNoComponente(TextView textView, String str) {
        if (hp0.m3214e(str, "?")) {
            textView.setTag(C0203R.id.tag_hud_tecla, null);
            textView.setText("?");
            textView.setTextSize(16.0f);
            textView.setMaxLines(1);
            return;
        }
        textView.setTag(C0203R.id.tag_hud_tecla, str);
        LinuxKeyCodes linuxKeyCodes = LinuxKeyCodes.INSTANCE;
        textView.setText(linuxKeyCodes.rotuloExibicaoHud(str));
        if (linuxKeyCodes.ehRotuloMouse(str)) {
            textView.setTextSize(11.0f);
            textView.setMaxLines(2);
        } else {
            textView.setTextSize(16.0f);
            textView.setMaxLines(1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0047  */
    private final void aplicarTeclaSuspenderFps(FrameLayout frameLayout, String str) {
        EditText editText;
        String strRotuloExibicaoHud;
        if (str == null || zv1.m7371K0(str) || hp0.m3214e(str, "?")) {
            frameLayout.setTag(C0203R.id.tag_hud_fps_tecla_suspender, null);
        } else {
            frameLayout.setTag(C0203R.id.tag_hud_fps_tecla_suspender, str);
        }
        View view = this.hudOverlayView;
        if (view == null || (editText = (EditText) view.findViewById(C0203R.id.edtFpsTeclaSuspender)) == null) {
            return;
        }
        if (str == null) {
            strRotuloExibicaoHud = "—";
        } else {
            if (zv1.m7371K0(str) || str.equals("?")) {
                str = null;
            }
            if (str == null || (strRotuloExibicaoHud = LinuxKeyCodes.INSTANCE.rotuloExibicaoHud(str)) == null) {
                strRotuloExibicaoHud = "—";
            }
        }
        editText.setText(strRotuloExibicaoHud);
    }

    private final void aplicarTipoJanelaOverlay(Window window) {
        if (window != null) {
            window.setType(2038);
        }
    }

    private final void aplicarVelocidadePonteiroSistema() {
        BuildersKt__Builders_commonKt.launch$default(this.serviceScope, Dispatchers.getIO(), null, new C01521(this.nivelVelocidadeCursor, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void aplicarVisualBolinha() {
        View view = this.floatingView;
        if (view == null) {
            return;
        }
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        View childAt = viewGroup != null ? viewGroup.getChildAt(0) : null;
        CardView cardView = childAt instanceof CardView ? (CardView) childAt : null;
        if (cardView != null) {
            int iDpParaPx = dpParaPx(this.tamanhoBolinhaDp);
            ViewGroup.LayoutParams layoutParams = cardView.getLayoutParams();
            layoutParams.width = iDpParaPx;
            layoutParams.height = iDpParaPx;
            cardView.setLayoutParams(layoutParams);
            cardView.setRadius(iDpParaPx / 2.0f);
        }
        if (!this.estaRecolhida) {
            view.setAlpha(this.opacidadeBolinha);
        }
        try {
            WindowManager windowManager = this.windowManager;
            if (windowManager != null) {
                windowManager.updateViewLayout(view, view.getLayoutParams());
            }
        } catch (Exception unused) {
        }
    }

    private final void aplicarVisualCursor() {
        ImageView imageView;
        FrameLayout.LayoutParams layoutParams;
        int i;
        View view = this.hudOverlayView;
        if (view == null || (imageView = (ImageView) view.findViewById(C0203R.id.cursorVirtualMao)) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        Integer numValueOf = null;
        FrameLayout.LayoutParams layoutParams3 = layoutParams2 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams2 : null;
        int iCursorTamanhoPx = cursorTamanhoPx();
        if (layoutParams3 == null) {
            layoutParams = new FrameLayout.LayoutParams(iCursorTamanhoPx, iCursorTamanhoPx);
            layoutParams.gravity = 8388659;
            imageView.setLayoutParams(layoutParams);
        } else {
            layoutParams = layoutParams3;
        }
        int i2 = layoutParams.width;
        if (i2 <= 0) {
            i2 = iCursorTamanhoPx;
        }
        int i3 = layoutParams.height;
        if (i3 <= 0) {
            i3 = iCursorTamanhoPx;
        }
        int iDpParaPx = dpParaPx(28);
        if (iDpParaPx < 1) {
            iDpParaPx = 1;
        }
        float f = iDpParaPx;
        int iDpParaPx2 = (int) ((dpParaPx(5) * i2) / f);
        int iDpParaPx3 = (int) ((dpParaPx(5) * i3) / f);
        Integer numValueOf2 = (layoutParams3 == null || imageView.getVisibility() != 0 || (i = layoutParams3.leftMargin) <= -5000) ? null : Integer.valueOf(i + iDpParaPx2);
        if (layoutParams3 != null && numValueOf2 != null) {
            numValueOf = Integer.valueOf(layoutParams3.topMargin + iDpParaPx3);
        }
        layoutParams.width = iCursorTamanhoPx;
        layoutParams.height = iCursorTamanhoPx;
        if (numValueOf2 != null && numValueOf != null) {
            layoutParams.leftMargin = numValueOf2.intValue() - cursorPontaXpx();
            int iIntValue = numValueOf.intValue() - cursorPontaYpx();
            layoutParams.topMargin = iIntValue;
            this.cursorMaoMargemX = layoutParams.leftMargin;
            this.cursorMaoMargemY = iIntValue;
        }
        imageView.setLayoutParams(layoutParams);
        int i4 = this.corCursor;
        if (i4 == -1) {
            imageView.clearColorFilter();
        } else {
            imageView.setColorFilter(i4, PorterDuff.Mode.SRC_IN);
        }
        View view2 = this.hudOverlayView;
        if (view2 != null) {
            view2.requestLayout();
        }
    }

    private final void ativarCursorVirtualEdicao() {
        limparEstadoTouchEdicao();
        esconderPonteiroSistema(this.hudOverlayView);
        aplicarVisualCursor();
        View view = this.hudOverlayView;
        ImageView imageView = view != null ? (ImageView) view.findViewById(C0203R.id.cursorVirtualMao) : null;
        if (imageView == null || imageView.getVisibility() != 0) {
            bc1 bc1VarCalcularMargemCursorMaoCentro = calcularMargemCursorMaoCentro();
            definirPosicaoCursorAbsoluta(((Number) bc1VarCalcularMargemCursorMaoCentro.f1292a).intValue(), ((Number) bc1VarCalcularMargemCursorMaoCentro.f1293b).intValue());
        }
        if (imageView != null) {
            imageView.setVisibility(0);
            imageView.bringToFront();
        }
        this.cursorMaoVisivel = true;
        ativarEntradaEdicaoHud();
        new Thread(new RunnableC1430t4(obterPontaCursorVirtual(), 16)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ativarCursorVirtualEdicao$lambda$32(bc1 bc1Var) {
        InjectionDaemonManager.INSTANCE.enqueueComando("MAO_POS " + bc1Var.f1292a + " " + bc1Var.f1293b);
    }

    private final void ativarEntradaEdicaoHud() {
        new Thread(new hb0(this, 16)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ativarEntradaEdicaoHud$lambda$34(FloatingService floatingService) {
        InjectionDaemonManager injectionDaemonManager = InjectionDaemonManager.INSTANCE;
        if (injectionDaemonManager.isDaemonVinculado()) {
            injectionDaemonManager.enqueueComando("EDITAR_HUD 1");
            injectionDaemonManager.enqueueComando(InjectionProtocol.INPUT_ENSURE);
            floatingService.handlerMonitor.post(new hb0(floatingService, 0));
        }
    }

    private final void ativarModoEscutaAnalog(EditText editText, og0 og0Var) {
        sairModoEscuta();
        prepararEntradaModoEscuta();
        this.escutaCampoAnalog = editText;
        this.escutaAnalogAoCapturar = og0Var;
        iniciarCapturaFisicaDaemon();
        habilitarCapturaTecladoNoHud(true);
        View.OnKeyListener onKeyListenerCriarListenerCapturaTeclaHudAnalog = criarListenerCapturaTeclaHudAnalog();
        View view = this.hudOverlayView;
        if (view != null) {
            view.setOnKeyListener(onKeyListenerCriarListenerCapturaTeclaHudAnalog);
        }
        editText.setOnKeyListener(onKeyListenerCriarListenerCapturaTeclaHudAnalog);
    }

    private final void ativarModoEscutaComponente(TextView textView, og0 og0Var) {
        if (hp0.m3214e(this.escutaConteudo, textView)) {
            sairModoEscuta();
            return;
        }
        sairModoEscuta();
        prepararEntradaModoEscuta();
        this.escutaConteudo = textView;
        this.escutaAoCapturar = og0Var;
        textView.setBackgroundResource(C0203R.drawable.bg_tecla_mapeamento_escuta);
        int i = 1;
        Toast.makeText(this, "Pressione tecla ou botão do mouse (laterais: Lat1/Lat2 ou Voltar/Avançar)", 1).show();
        iniciarCapturaFisicaDaemon();
        habilitarCapturaTecladoNoHud(true);
        TextView textView2 = this.escutaConteudo;
        if (textView2 != null) {
            textView2.setFocusable(true);
        }
        TextView textView3 = this.escutaConteudo;
        if (textView3 != null) {
            textView3.setFocusableInTouchMode(true);
        }
        TextView textView4 = this.escutaConteudo;
        if (textView4 != null) {
            textView4.requestFocus();
        }
        View.OnKeyListener onKeyListenerCriarListenerCapturaTeclaHud = criarListenerCapturaTeclaHud();
        View view = this.hudOverlayView;
        if (view != null) {
            view.setOnKeyListener(onKeyListenerCriarListenerCapturaTeclaHud);
        }
        TextView textView5 = this.escutaConteudo;
        if (textView5 != null) {
            textView5.setOnKeyListener(onKeyListenerCriarListenerCapturaTeclaHud);
        }
        View.OnGenericMotionListener onGenericMotionListener = new View.OnGenericMotionListener() { // from class: cd0
            @Override // android.view.View.OnGenericMotionListener
            public final boolean onGenericMotion(View view2, MotionEvent motionEvent) {
                return FloatingService.ativarModoEscutaComponente$lambda$277(this.f1775a, view2, motionEvent);
            }
        };
        View view2 = this.hudOverlayView;
        if (view2 != null) {
            view2.setOnGenericMotionListener(onGenericMotionListener);
        }
        TextView textView6 = this.escutaConteudo;
        if (textView6 != null) {
            textView6.setOnGenericMotionListener(onGenericMotionListener);
        }
        n40 n40Var = new n40(this, i);
        View view3 = this.hudOverlayView;
        if (view3 != null) {
            view3.setOnTouchListener(n40Var);
        }
        TextView textView7 = this.escutaConteudo;
        if (textView7 != null) {
            textView7.setOnTouchListener(n40Var);
        }
        View.OnCapturedPointerListener onCapturedPointerListener = new View.OnCapturedPointerListener() { // from class: dd0
            @Override // android.view.View.OnCapturedPointerListener
            public final boolean onCapturedPointer(View view4, MotionEvent motionEvent) {
                return FloatingService.ativarModoEscutaComponente$lambda$281(this.f2895a, view4, motionEvent);
            }
        };
        View view4 = this.hudOverlayView;
        if (view4 != null) {
            view4.setOnCapturedPointerListener(onCapturedPointerListener);
        }
        TextView textView8 = this.escutaConteudo;
        if (textView8 != null) {
            textView8.setOnCapturedPointerListener(onCapturedPointerListener);
        }
        try {
            View view5 = this.hudOverlayView;
            if (view5 != null) {
                view5.requestPointerCapture();
            }
        } catch (Exception e) {
            Log.w(TAG_HUD_LIFECYCLE, "requestPointerCapture falhou", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ativarModoEscutaComponente$lambda$277(FloatingService floatingService, View view, MotionEvent motionEvent) {
        String strCapturarRotuloMouseMotion;
        if (floatingService.escutaConteudo == null || motionEvent.getActionMasked() != 11 || (strCapturarRotuloMouseMotion = floatingService.capturarRotuloMouseMotion(motionEvent)) == null) {
            return false;
        }
        floatingService.finalizarCapturaTecla(strCapturarRotuloMouseMotion);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ativarModoEscutaComponente$lambda$279(FloatingService floatingService, View view, MotionEvent motionEvent) {
        String strCapturarRotuloMouseMotion;
        if (floatingService.escutaConteudo == null) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked != 0 && actionMasked != 11) || (strCapturarRotuloMouseMotion = floatingService.capturarRotuloMouseMotion(motionEvent)) == null) {
            return false;
        }
        floatingService.finalizarCapturaTecla(strCapturarRotuloMouseMotion);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ativarModoEscutaComponente$lambda$281(FloatingService floatingService, View view, MotionEvent motionEvent) {
        z32 z32Var;
        if (floatingService.escutaConteudo != null && motionEvent.getActionMasked() == 11) {
            String strCapturarRotuloMouseMotion = floatingService.capturarRotuloMouseMotion(motionEvent);
            if (strCapturarRotuloMouseMotion != null) {
                floatingService.finalizarCapturaTecla(strCapturarRotuloMouseMotion);
                z32Var = z32.f13265a;
            } else {
                z32Var = null;
            }
            if (z32Var != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ativarTecladoNoDaemon(boolean z) throws JSONException {
        vincularOverlayAoDisplayAlvo(false);
        synchronized (this.ativacaoDaemonLock) {
            if (this.ativacaoDaemonEmCurso) {
                return;
            }
            if (z || System.currentTimeMillis() - this.ultimaAtivacaoDaemonMs >= 800) {
                this.ativacaoDaemonEmCurso = true;
                String string = getSharedPreferences("SSMousePrefs", 0).getString(chaveMapeamentoHud(), null);
                JSONArray jSONArrayMontarJsonHudAtual = montarJsonHudAtual();
                String string2 = jSONArrayMontarJsonHudAtual != null ? jSONArrayMontarJsonHudAtual.toString() : null;
                String str = string2 == null ? string : string2;
                if (str == null) {
                    this.ativacaoDaemonEmCurso = false;
                    return;
                }
                bc1 bc1VarDimensaoTelaParaMapeamento = dimensaoTelaParaMapeamento();
                int iIntValue = ((Number) bc1VarDimensaoTelaParaMapeamento.f1292a).intValue();
                int iIntValue2 = ((Number) bc1VarDimensaoTelaParaMapeamento.f1293b).intValue();
                BuildersKt__Builders_commonKt.launch$default(this.serviceScope, Dispatchers.getIO(), null, new C01532(z, this.overlayDisplayId + ":" + iIntValue + ":" + iIntValue2 + ":" + this.mouseSensitivity + ":" + this.mousePollHz + ":" + str.hashCode(), str, iIntValue, iIntValue2, null), 2, null).start();
            }
        }
    }

    public static /* synthetic */ void ativarTecladoNoDaemon$default(FloatingService floatingService, boolean z, int i, Object obj) throws JSONException {
        if ((i & 1) != 0) {
            z = false;
        }
        floatingService.ativarTecladoNoDaemon(z);
    }

    private final void atualizarBadgeContagemToqueRep(FrameLayout frameLayout) {
        View viewObterBadgeContagemToqueRep = obterBadgeContagemToqueRep(frameLayout);
        TextView textView = viewObterBadgeContagemToqueRep instanceof TextView ? (TextView) viewObterBadgeContagemToqueRep : null;
        if (textView == null) {
            return;
        }
        textView.setText(String.valueOf(obterToqueRepContagem(frameLayout)));
    }

    private final void atualizarFlagsRaizHud(boolean z) {
        View view;
        WindowManager.LayoutParams layoutParams;
        WindowManager windowManager = this.windowManager;
        if (windowManager == null || (view = this.hudOverlayView) == null || (layoutParams = this.hudOverlayParams) == null) {
            return;
        }
        layoutParams.flags = z ? 824 : 808;
        aplicarOverlayFullscreenCutout(layoutParams);
        view.setFocusable(false);
        view.setFocusableInTouchMode(false);
        try {
            windowManager.updateViewLayout(view, layoutParams);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private final void atualizarOrdemPaineisHud() {
        View view = this.hudOverlayView;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null) {
            return;
        }
        garantirCacheViewsOrdemHud(viewGroup);
        ArrayList arrayList = new ArrayList(7);
        atualizarOrdemPaineisHud$addSeVisivel(arrayList, this.hudPainelSuperior);
        atualizarOrdemPaineisHud$addSeVisivel(arrayList, this.hudPanelConfigAnalogico);
        atualizarOrdemPaineisHud$addSeVisivel(arrayList, this.hudPanelConfigFps);
        atualizarOrdemPaineisHud$addSeVisivel(arrayList, this.hudPanelConfigToque);
        atualizarOrdemPaineisHud$addSeVisivel(arrayList, this.hudPanelConfigToqueRep);
        atualizarOrdemPaineisHud$addSeVisivel(arrayList, this.hudPainelExteriorCurva);
        if (this.cursorMaoVisivel) {
            atualizarOrdemPaineisHud$addSeVisivel(arrayList, this.hudCursorVirtualMao);
        }
        if (arrayList.isEmpty() || pilhaPaineisHudJaNaOrdem(viewGroup, arrayList)) {
            return;
        }
        Iterator it = arrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            ((View) next).bringToFront();
        }
    }

    private static final void atualizarOrdemPaineisHud$addSeVisivel(ArrayList<View> arrayList, View view) {
        if (view == null || view.getVisibility() != 0) {
            return;
        }
        arrayList.add(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void atualizarPropriedadesPainelAnalog(FrameLayout frameLayout) {
        View viewFindViewById;
        FrameLayout frameLayoutObterContainerHud;
        AnalogStickHudView analogStickHudViewObterAnalogViewWrapper;
        View view = this.hudOverlayView;
        if (view == null || (viewFindViewById = view.findViewById(C0203R.id.panelConfigAnalogico)) == null || viewFindViewById.getVisibility() != 0 || !hp0.m3214e(this.analogWrapperEmEdicao, frameLayout) || (frameLayoutObterContainerHud = obterContainerHud()) == null || (analogStickHudViewObterAnalogViewWrapper = obterAnalogViewWrapper(frameLayout)) == null) {
            return;
        }
        bc1 bc1VarCentroConteudoNoContainer = centroConteudoNoContainer(analogStickHudViewObterAnalogViewWrapper, frameLayoutObterContainerHud);
        int iIntValue = ((Number) bc1VarCentroConteudoNoContainer.f1292a).intValue();
        int iIntValue2 = ((Number) bc1VarCentroConteudoNoContainer.f1293b).intValue();
        Integer numValueOf = Integer.valueOf(analogStickHudViewObterAnalogViewWrapper.getWidth());
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        int iIntValue3 = numValueOf != null ? numValueOf.intValue() : analogStickHudViewObterAnalogViewWrapper.getLayoutParams().width;
        Integer numValueOf2 = Integer.valueOf(analogStickHudViewObterAnalogViewWrapper.getHeight());
        Integer num = numValueOf2.intValue() > 0 ? numValueOf2 : null;
        int iMin = Math.min(iIntValue3, num != null ? num.intValue() : analogStickHudViewObterAnalogViewWrapper.getLayoutParams().height) / 2;
        TextView textView = (TextView) viewFindViewById.findViewById(C0203R.id.txtAnalogPropX);
        if (textView != null) {
            textView.setText(String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(iIntValue)}, 1)));
        }
        TextView textView2 = (TextView) viewFindViewById.findViewById(C0203R.id.txtAnalogPropY);
        if (textView2 != null) {
            textView2.setText(String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(iIntValue2)}, 1)));
        }
        TextView textView3 = (TextView) viewFindViewById.findViewById(C0203R.id.txtAnalogPropRaio);
        if (textView3 != null) {
            textView3.setText(String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(iMin)}, 1)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void atualizarPropriedadesPainelToque(FrameLayout frameLayout) {
        View viewFindViewById;
        FrameLayout frameLayoutObterContainerHud;
        View viewObterViewConteudoWrapper;
        View view = this.hudOverlayView;
        if (view == null || (viewFindViewById = view.findViewById(C0203R.id.panelConfigToque)) == null || viewFindViewById.getVisibility() != 0 || !hp0.m3214e(this.toqueWrapperEmEdicao, frameLayout) || (frameLayoutObterContainerHud = obterContainerHud()) == null || (viewObterViewConteudoWrapper = obterViewConteudoWrapper(frameLayout)) == null) {
            return;
        }
        bc1 bc1VarCentroConteudoNoContainer = centroConteudoNoContainer(viewObterViewConteudoWrapper, frameLayoutObterContainerHud);
        int iIntValue = ((Number) bc1VarCentroConteudoNoContainer.f1292a).intValue();
        int iIntValue2 = ((Number) bc1VarCentroConteudoNoContainer.f1293b).intValue();
        TextView textView = (TextView) viewFindViewById.findViewById(C0203R.id.txtToquePropX);
        if (textView != null) {
            textView.setText(String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(iIntValue)}, 1)));
        }
        TextView textView2 = (TextView) viewFindViewById.findViewById(C0203R.id.txtToquePropY);
        if (textView2 != null) {
            textView2.setText(String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(iIntValue2)}, 1)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void atualizarPropriedadesPainelToqueRep(FrameLayout frameLayout) {
        View viewFindViewById;
        FrameLayout frameLayoutObterContainerHud;
        View viewObterViewConteudoWrapper;
        View view = this.hudOverlayView;
        if (view == null || (viewFindViewById = view.findViewById(C0203R.id.panelConfigToqueRep)) == null || viewFindViewById.getVisibility() != 0 || !hp0.m3214e(this.toqueRepWrapperEmEdicao, frameLayout) || (frameLayoutObterContainerHud = obterContainerHud()) == null || (viewObterViewConteudoWrapper = obterViewConteudoWrapper(frameLayout)) == null) {
            return;
        }
        bc1 bc1VarCentroConteudoNoContainer = centroConteudoNoContainer(viewObterViewConteudoWrapper, frameLayoutObterContainerHud);
        int iIntValue = ((Number) bc1VarCentroConteudoNoContainer.f1292a).intValue();
        int iIntValue2 = ((Number) bc1VarCentroConteudoNoContainer.f1293b).intValue();
        TextView textView = (TextView) viewFindViewById.findViewById(C0203R.id.txtToqueRepPropX);
        if (textView != null) {
            textView.setText(String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(iIntValue)}, 1)));
        }
        TextView textView2 = (TextView) viewFindViewById.findViewById(C0203R.id.txtToqueRepPropY);
        if (textView2 != null) {
            textView2.setText(String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(iIntValue2)}, 1)));
        }
    }

    private final void atualizarVisibilidadeAnalogHud() {
        FrameLayout frameLayoutObterContainerHud = obterContainerHud();
        if (frameLayoutObterContainerHud == null) {
            return;
        }
        int childCount = frameLayoutObterContainerHud.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = frameLayoutObterContainerHud.getChildAt(i);
            FrameLayout frameLayout = childAt instanceof FrameLayout ? (FrameLayout) childAt : null;
            if (frameLayout != null && hp0.m3214e(frameLayout.getTag(C0203R.id.tag_hud_tipo), TIPO_ANALOGICO) && this.hudEmModoJogo && !this.hudEmModoEdicao) {
                frameLayout.setVisibility(0);
                if (!this.exibirHudDuranteJogo || this.fpsModoAtivo) {
                    frameLayout.setAlpha(TouchPipeline.SIZE);
                    AnalogStickHudView analogStickHudViewObterAnalogViewWrapper = obterAnalogViewWrapper(frameLayout);
                    if (analogStickHudViewObterAnalogViewWrapper != null) {
                        analogStickHudViewObterAnalogViewWrapper.setAlpha(TouchPipeline.SIZE);
                    }
                } else {
                    frameLayout.setAlpha(1.0f);
                    AnalogStickHudView analogStickHudViewObterAnalogViewWrapper2 = obterAnalogViewWrapper(frameLayout);
                    if (analogStickHudViewObterAnalogViewWrapper2 != null) {
                        analogStickHudViewObterAnalogViewWrapper2.setAlpha(p32.m5139E(this.opacidadeNoJogo, TouchPipeline.SIZE, 1.0f));
                    }
                }
            }
        }
    }

    private final void atualizarVisibilidadeEditorExteriorCurva() {
        View viewFindViewById;
        View view = this.hudOverlayView;
        if (view == null || (viewFindViewById = view.findViewById(C0203R.id.painelExteriorCurva)) == null) {
            return;
        }
        FpsFfGraficoView fpsFfGraficoView = (FpsFfGraficoView) viewFindViewById.findViewById(C0203R.id.fpsExteriorCurva);
        boolean z = AimGraphConfig.INSTANCE.getMostrarGraficoNaPartida() && this.hudEmModoJogo;
        viewFindViewById.setVisibility(z ? 0 : 8);
        View viewFindViewById2 = viewFindViewById.findViewById(C0203R.id.linhaCurvaOpcoes);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        View viewFindViewById3 = viewFindViewById.findViewById(C0203R.id.barraEditorCurva);
        if (viewFindViewById3 != null) {
            viewFindViewById3.setVisibility(z ? 8 : 0);
        }
        if (z) {
            viewFindViewById.bringToFront();
            float fObterLarguraTelaHud = obterLarguraTelaHud();
            if (fObterLarguraTelaHud < 200.0f) {
                fObterLarguraTelaHud = 200.0f;
            }
            if (fpsFfGraficoView != null) {
                fpsFfGraficoView.setLarguraTela(fObterLarguraTelaHud);
            }
            if (fpsFfGraficoView != null) {
                fpsFfGraficoView.invalidate();
            }
        } else {
            if (fpsFfGraficoView != null) {
                fpsFfGraficoView.setMouseX(null);
            }
            if (fpsFfGraficoView != null) {
                fpsFfGraficoView.setFatorEfetivoLive(null);
            }
        }
        sincronizarDebugExteriorCurva();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void atualizarVisibilidadeGraficoMira() {
        atualizarVisibilidadeEditorExteriorCurva();
        sincronizarMonitorMapeador();
    }

    private final void atualizarVisualBotaoDigitar(TextView textView) {
        textView.setBackgroundResource(this.modoDigitarAtivo ? C0203R.drawable.bg_digitar_on : C0203R.drawable.bg_digitar_off);
        textView.setText(this.modoDigitarAtivo ? "Digitar ?" : "Digitar");
    }

    private final bc1 calcularCentroTela(int i, int i2) {
        bc1 bc1VarObterDimensaoTelaAtual = obterDimensaoTelaAtual();
        return new bc1(Integer.valueOf((((Number) bc1VarObterDimensaoTelaAtual.f1292a).intValue() / 2) - (i / 2)), Integer.valueOf((((Number) bc1VarObterDimensaoTelaAtual.f1293b).intValue() / 2) - (i2 / 2)));
    }

    private final bc1 calcularMargemCursorMaoCentro() {
        bc1 bc1VarCalcularPontaMiraFf = calcularPontaMiraFf();
        int iIntValue = ((Number) bc1VarCalcularPontaMiraFf.f1292a).intValue();
        int iIntValue2 = ((Number) bc1VarCalcularPontaMiraFf.f1293b).intValue();
        return new bc1(Integer.valueOf(iIntValue - cursorPontaXpx()), Integer.valueOf(iIntValue2 - cursorPontaYpx()));
    }

    private final bc1 calcularPontaMiraFf() {
        bc1 bc1Var;
        bc1 bc1VarDimensaoTelaParaMapeamento = dimensaoTelaParaMapeamento();
        int iIntValue = ((Number) bc1VarDimensaoTelaParaMapeamento.f1292a).intValue();
        int iIntValue2 = ((Number) bc1VarDimensaoTelaParaMapeamento.f1293b).intValue();
        if (iIntValue <= 0 || iIntValue2 <= 0) {
            bc1 bc1VarObterTamanhoRealTela = obterTamanhoRealTela();
            bc1Var = new bc1(Integer.valueOf(((Number) bc1VarObterTamanhoRealTela.f1292a).intValue()), Integer.valueOf(((Number) bc1VarObterTamanhoRealTela.f1293b).intValue()));
        } else {
            bc1Var = new bc1(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
        }
        return new bc1(Integer.valueOf(((Number) bc1Var.f1292a).intValue() / 2), Integer.valueOf(((Number) bc1Var.f1293b).intValue() / 2));
    }

    private final bc1 calcularPosicaoAnalogicoPadrao() {
        int iDpParaPx = dpParaPx(LocationRequest.PRIORITY_NO_POWER) + dpParaPx(18);
        int iDpParaPx2 = dpParaPx(20);
        int iDpParaPx3 = (getResources().getDisplayMetrics().heightPixels - iDpParaPx) - dpParaPx(56);
        Integer numValueOf = Integer.valueOf(iDpParaPx2);
        int iDpParaPx4 = dpParaPx(72);
        if (iDpParaPx3 < iDpParaPx4) {
            iDpParaPx3 = iDpParaPx4;
        }
        return new bc1(numValueOf, Integer.valueOf(iDpParaPx3));
    }

    private final void capturarResolucaoNativaSeNecessario() {
        if (this.resNativaCapturada || this.overrideResAtivo) {
            return;
        }
        bc1 bc1VarObterTamanhoRealTela = obterTamanhoRealTela();
        int iIntValue = ((Number) bc1VarObterTamanhoRealTela.f1292a).intValue();
        int iIntValue2 = ((Number) bc1VarObterTamanhoRealTela.f1293b).intValue();
        int iMax = Math.max(iIntValue, iIntValue2);
        int iMin = Math.min(iIntValue, iIntValue2);
        if (iMax <= 0 || iMin <= 0) {
            return;
        }
        this.resNativaW = iMax;
        this.resNativaH = iMin;
        this.resNativaCapturada = true;
        getSharedPreferences("SSMousePrefs", 0).edit().putInt(KEY_RES_NATIVA_W, this.resNativaW).putInt(KEY_RES_NATIVA_H, this.resNativaH).apply();
    }

    private final String capturarRotuloMouseMotion(MotionEvent motionEvent) {
        LinuxKeyCodes linuxKeyCodes = LinuxKeyCodes.INSTANCE;
        String strRotuloMouseDeActionButton = linuxKeyCodes.rotuloMouseDeActionButton(motionEvent.getActionButton());
        return strRotuloMouseDeActionButton != null ? strRotuloMouseDeActionButton : linuxKeyCodes.rotuloMouseDeButtonState(motionEvent.getButtonState());
    }

    private final void capturarTeclaAnalog(EditText editText, og0 og0Var) {
        editText.setText("...");
        ativarModoEscutaAnalog(editText, new wc0(0, editText, og0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 capturarTeclaAnalog$lambda$269(EditText editText, og0 og0Var, String str) {
        str.getClass();
        editText.setText(LinuxKeyCodes.INSTANCE.rotuloExibicaoHud(str));
        og0Var.invoke(str);
        return z32.f13265a;
    }

    private final void capturarTeclaFps(FrameLayout frameLayout, FpsViewHudView fpsViewHudView, og0 og0Var) {
        sairModoEscuta();
        prepararEntradaModoEscuta();
        this.escutaFpsView = fpsViewHudView;
        this.escutaFpsWrapper = frameLayout;
        this.escutaFpsAoCapturar = new ed0(this, frameLayout, fpsViewHudView, og0Var, 2);
        fpsViewHudView.setModoEscuta(true);
        Toast.makeText(this, "Pressione tecla ou botão do mouse (laterais: Lat1/Lat2 ou Voltar/Avançar)", 1).show();
        iniciarCapturaFisicaDaemon();
        habilitarCapturaTecladoNoHud(true);
        View.OnKeyListener onKeyListenerCriarListenerCapturaTeclaHudFps = criarListenerCapturaTeclaHudFps();
        View view = this.hudOverlayView;
        if (view != null) {
            view.setOnKeyListener(onKeyListenerCriarListenerCapturaTeclaHudFps);
        }
    }

    public static /* synthetic */ void capturarTeclaFps$default(FloatingService floatingService, FrameLayout frameLayout, FpsViewHudView fpsViewHudView, og0 og0Var, int i, Object obj) {
        if ((i & 4) != 0) {
            og0Var = null;
        }
        floatingService.capturarTeclaFps(frameLayout, fpsViewHudView, og0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 capturarTeclaFps$lambda$241(FloatingService floatingService, FrameLayout frameLayout, FpsViewHudView fpsViewHudView, og0 og0Var, String str) {
        str.getClass();
        floatingService.aplicarTeclaFps(frameLayout, fpsViewHudView, str);
        if (og0Var != null) {
            og0Var.invoke(LinuxKeyCodes.INSTANCE.rotuloExibicaoHud(str));
        }
        return z32.f13265a;
    }

    private final void capturarTeclaSuspenderFps(FrameLayout frameLayout, og0 og0Var) {
        FpsViewHudView fpsViewHudViewObterFpsViewWrapper = obterFpsViewWrapper(frameLayout);
        if (fpsViewHudViewObterFpsViewWrapper == null) {
            return;
        }
        sairModoEscuta();
        prepararEntradaModoEscuta();
        this.escutaFpsView = fpsViewHudViewObterFpsViewWrapper;
        this.escutaFpsWrapper = frameLayout;
        this.escutaFpsAoCapturar = new zb0(this, frameLayout, og0Var, 0);
        fpsViewHudViewObterFpsViewWrapper.setModoEscuta(true);
        Toast.makeText(this, "Suspender: pressione a tecla (segurar no jogo = cursor)", 1).show();
        iniciarCapturaFisicaDaemon();
        habilitarCapturaTecladoNoHud(true);
        View.OnKeyListener onKeyListenerCriarListenerCapturaTeclaHudFps = criarListenerCapturaTeclaHudFps();
        View view = this.hudOverlayView;
        if (view != null) {
            view.setOnKeyListener(onKeyListenerCriarListenerCapturaTeclaHudFps);
        }
    }

    public static /* synthetic */ void capturarTeclaSuspenderFps$default(FloatingService floatingService, FrameLayout frameLayout, og0 og0Var, int i, Object obj) {
        if ((i & 2) != 0) {
            og0Var = null;
        }
        floatingService.capturarTeclaSuspenderFps(frameLayout, og0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 capturarTeclaSuspenderFps$lambda$242(FloatingService floatingService, FrameLayout frameLayout, og0 og0Var, String str) throws JSONException {
        str.getClass();
        floatingService.aplicarTeclaSuspenderFps(frameLayout, str);
        if (og0Var != null) {
            og0Var.invoke(LinuxKeyCodes.INSTANCE.rotuloExibicaoHud(str));
        }
        floatingService.salvarMapeamentoHud();
        return z32.f13265a;
    }

    private final void carregarConfigInterface() {
        SharedPreferences sharedPreferences = getSharedPreferences("SSMousePrefs", 0);
        this.tamanhoCursorDp = p32.m5140F(sharedPreferences.getInt(KEY_CURSOR_SIZE, 28), 16, 64);
        this.nivelVelocidadeCursor = p32.m5140F(sharedPreferences.getInt(KEY_CURSOR_LEVEL, 7), 1, 14);
        this.corCursor = sharedPreferences.getInt(KEY_CURSOR_COLOR, -1);
        this.tamanhoBolinhaDp = p32.m5140F(sharedPreferences.getInt(KEY_BALL_SIZE, 65), 40, BALL_SIZE_MAX);
        this.opacidadeBolinha = p32.m5139E(sharedPreferences.getFloat(KEY_BALL_OPACITY, 1.0f), BALL_OPACITY_MIN, 1.0f);
        this.mousePollHz = normalizarMousePollHz(sharedPreferences.getInt(KEY_MOUSE_POLL_HZ, 250));
        this.monitorCamposVisiveis = carregarMonitorCampos(sharedPreferences.getString(KEY_MONITOR_CAMPOS, null));
        if (DevToolsGate.INSTANCE.getLiberado()) {
            this.monitorMapeadorAtivo = sharedPreferences.getBoolean(KEY_MONITOR_MAPEADOR, true);
        } else {
            this.monitorMapeadorAtivo = false;
        }
        this.resDesejadaW = sharedPreferences.getInt(KEY_RES_DESEJADA_W, 0);
        this.resDesejadaH = sharedPreferences.getInt(KEY_RES_DESEJADA_H, 0);
        this.resNativaW = sharedPreferences.getInt(KEY_RES_NATIVA_W, 0);
        this.resNativaH = sharedPreferences.getInt(KEY_RES_NATIVA_H, 0);
        int i = sharedPreferences.getInt(KEY_DPI_DESEJADA, 0);
        this.dpiDesejada = i == 0 ? 0 : p32.m5140F(i, 120, DPI_MAX);
        this.ajusteTelaUmaVez = sharedPreferences.getBoolean(KEY_AJUSTE_UMA_VEZ, false);
        boolean z = sharedPreferences.getBoolean(KEY_AJUSTE_AUTO, false);
        this.ajusteTelaAuto = z;
        if (this.ajusteTelaUmaVez && z) {
            this.ajusteTelaUmaVez = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:129:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:130:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:132:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:147:? A[RETURN, SYNTHETIC] */
    public final void carregarMapeamentoHudSalvo() {
        boolean z;
        int i;
        String str;
        int i2;
        String str2;
        FloatingService floatingService = this;
        FrameLayout frameLayoutObterContainerHud = floatingService.obterContainerHud();
        if (frameLayoutObterContainerHud != null && ((frameLayoutObterContainerHud.getWidth() <= 0 || frameLayoutObterContainerHud.getHeight() <= 0) && frameLayoutObterContainerHud.isAttachedToWindow())) {
            frameLayoutObterContainerHud.post(new hb0(floatingService, 7));
            return;
        }
        SharedPreferences sharedPreferences = floatingService.getSharedPreferences("SSMousePrefs", 0);
        String string = sharedPreferences.getString(floatingService.chaveMapeamentoHud(), null);
        int i3 = sharedPreferences.getInt(KEY_HUD_PRESET_VER, 0);
        if (string == null || zv1.m7371K0(string) || (i3 < 3 && (zv1.m7371K0(string) || HudPresetFreefire.INSTANCE.parecePresetAntigo(string)))) {
            string = HudPresetFreefire.INSTANCE.jsonPadrao();
            sharedPreferences.edit().putString(floatingService.chaveMapeamentoHud(), string).putInt(KEY_HUD_PRESET_VER, 3).apply();
        } else if (i3 < 3) {
            sharedPreferences.edit().putInt(KEY_HUD_PRESET_VER, 3).apply();
        }
        try {
            JSONArray jSONArray = new JSONArray(string);
            boolean zMigrarSensXUiRefV2SePreciso = floatingService.migrarSensXUiRefV2SePreciso(jSONArray);
            boolean zMigrarSensXyPadraoV3SePreciso = floatingService.migrarSensXyPadraoV3SePreciso(jSONArray);
            JSONArray jSONArraySanitizarEntradasHud = floatingService.sanitizarEntradasHud(jSONArray);
            if (jSONArraySanitizarEntradasHud.length() != jSONArray.length() || zMigrarSensXUiRefV2SePreciso || zMigrarSensXyPadraoV3SePreciso) {
                sharedPreferences.edit().putString(floatingService.chaveMapeamentoHud(), jSONArraySanitizarEntradasHud.toString()).apply();
            }
            bc1 bc1VarObterDimensaoTelaAtual = floatingService.obterDimensaoTelaAtual();
            int iIntValue = ((Number) bc1VarObterDimensaoTelaAtual.f1292a).intValue();
            int iIntValue2 = ((Number) bc1VarObterDimensaoTelaAtual.f1293b).intValue();
            if (frameLayoutObterContainerHud != null) {
                frameLayoutObterContainerHud.removeAllViews();
            }
            int i4 = 0;
            for (int length = jSONArraySanitizarEntradasHud.length(); i4 < length; length = length) {
                JSONObject jSONObject = jSONArraySanitizarEntradasHud.getJSONObject(i4);
                String string2 = jSONObject.getString("tipo");
                int iOptInt = jSONObject.optInt("refW", iIntValue);
                if (iOptInt < 1) {
                    iOptInt = 1;
                }
                int iOptInt2 = jSONObject.optInt("refH", iIntValue2);
                if (iOptInt2 < 1) {
                    iOptInt2 = 1;
                }
                try {
                    boolean z2 = jSONObject.has("centroX") && jSONObject.has("centroY");
                    bc1 bc1Var = z2 ? new bc1(Integer.valueOf(jSONObject.getInt("centroX")), Integer.valueOf(jSONObject.getInt("centroY"))) : new bc1(Integer.valueOf(jSONObject.getInt("x")), Integer.valueOf(jSONObject.getInt("y")));
                    floatingService = this;
                    bc1 bc1VarEscalarCoordHud = floatingService.escalarCoordHud(((Number) bc1Var.f1292a).intValue(), ((Number) bc1Var.f1293b).intValue(), iOptInt, iOptInt2, iIntValue, iIntValue2);
                    int iIntValue3 = ((Number) bc1VarEscalarCoordHud.f1292a).intValue();
                    int iIntValue4 = ((Number) bc1VarEscalarCoordHud.f1293b).intValue();
                    String strOptString = jSONObject.optString("tecla", "");
                    String strOptString2 = jSONObject.optString("teclaTag", "");
                    strOptString2.getClass();
                    String string3 = zv1.m7383W0(strOptString2).toString();
                    if (zv1.m7371K0(string3)) {
                        string3 = null;
                    }
                    if (string2 != null) {
                        String str3 = string3;
                        switch (string2.hashCode()) {
                            case 69833:
                                z = false;
                                if (string2.equals(TIPO_FPS)) {
                                    bc1 bc1VarMargensWrapperParaCentro = z2 ? floatingService.margensWrapperParaCentro(TIPO_FPS, iIntValue3, iIntValue4, null) : new bc1(Integer.valueOf(iIntValue3), Integer.valueOf(iIntValue4));
                                    int iIntValue5 = ((Number) bc1VarMargensWrapperParaCentro.f1292a).intValue();
                                    int iIntValue6 = ((Number) bc1VarMargensWrapperParaCentro.f1293b).intValue();
                                    int iDpParaPx = floatingService.dpParaPx(24);
                                    bc1 bc1VarClamparMargemHud = floatingService.clamparMargemHud(iIntValue5, iIntValue6, floatingService.dpParaPx(136) + iDpParaPx, floatingService.dpParaPx(72) + iDpParaPx, iIntValue, iIntValue2);
                                    floatingService.criarComponenteFps(((Number) bc1VarClamparMargemHud.f1292a).intValue(), ((Number) bc1VarClamparMargemHud.f1293b).intValue(), jSONObject);
                                    continue;
                                }
                                break;
                            case 80009798:
                                z = false;
                                if (string2.equals(TIPO_TOQUE)) {
                                    if (str3 == null) {
                                        LinuxKeyCodes linuxKeyCodes = LinuxKeyCodes.INSTANCE;
                                        strOptString.getClass();
                                        i = iIntValue;
                                        String strResolverTeclaHud$default = LinuxKeyCodes.resolverTeclaHud$default(linuxKeyCodes, strOptString, null, 2, null);
                                        if (strResolverTeclaHud$default == null) {
                                            if (zv1.m7371K0(strOptString)) {
                                                strOptString = "?";
                                            }
                                            str = strOptString;
                                        } else {
                                            str = strResolverTeclaHud$default;
                                        }
                                    } else {
                                        i = iIntValue;
                                        str = str3;
                                    }
                                    int iDpParaPx2 = floatingService.dpParaPx(45);
                                    bc1 bc1VarMargensWrapperParaCentro2 = z2 ? floatingService.margensWrapperParaCentro(TIPO_TOQUE, iIntValue3, iIntValue4, Integer.valueOf(iDpParaPx2)) : new bc1(Integer.valueOf(iIntValue3), Integer.valueOf(iIntValue4));
                                    int iIntValue7 = ((Number) bc1VarMargensWrapperParaCentro2.f1292a).intValue();
                                    int iIntValue8 = ((Number) bc1VarMargensWrapperParaCentro2.f1293b).intValue();
                                    int iDpParaPx3 = iDpParaPx2 + (floatingService.dpParaPx(18) / 2);
                                    iIntValue = i;
                                    bc1 bc1VarClamparMargemHud2 = floatingService.clamparMargemHud(iIntValue7, iIntValue8, iDpParaPx3, iDpParaPx3, iIntValue, iIntValue2);
                                    floatingService.criarComponenteToque(((Number) bc1VarClamparMargemHud2.f1292a).intValue(), ((Number) bc1VarClamparMargemHud2.f1293b).intValue(), str, jSONObject);
                                } else {
                                    continue;
                                }
                                break;
                            case 114209540:
                                z = false;
                                if (string2.equals(TIPO_TOQUE_REP)) {
                                    if (str3 == null) {
                                        LinuxKeyCodes linuxKeyCodes2 = LinuxKeyCodes.INSTANCE;
                                        strOptString.getClass();
                                        i2 = iIntValue;
                                        String strResolverTeclaHud$default2 = LinuxKeyCodes.resolverTeclaHud$default(linuxKeyCodes2, strOptString, null, 2, null);
                                        if (strResolverTeclaHud$default2 == null) {
                                            if (zv1.m7371K0(strOptString)) {
                                                strOptString = "?";
                                            }
                                            str2 = strOptString;
                                        } else {
                                            str2 = strResolverTeclaHud$default2;
                                        }
                                    } else {
                                        i2 = iIntValue;
                                        str2 = str3;
                                    }
                                    int iDpParaPx4 = floatingService.dpParaPx(45);
                                    bc1 bc1VarMargensWrapperParaCentro3 = z2 ? floatingService.margensWrapperParaCentro(TIPO_TOQUE_REP, iIntValue3, iIntValue4, Integer.valueOf(iDpParaPx4)) : new bc1(Integer.valueOf(iIntValue3), Integer.valueOf(iIntValue4));
                                    int iIntValue9 = ((Number) bc1VarMargensWrapperParaCentro3.f1292a).intValue();
                                    int iIntValue10 = ((Number) bc1VarMargensWrapperParaCentro3.f1293b).intValue();
                                    int iDpParaPx5 = floatingService.dpParaPx(28);
                                    int iDpParaPx6 = floatingService.dpParaPx(18) / 2;
                                    int i5 = iDpParaPx5 + iDpParaPx4 + iDpParaPx6;
                                    int i6 = iDpParaPx4 + iDpParaPx6;
                                    iIntValue = i2;
                                    bc1 bc1VarClamparMargemHud3 = floatingService.clamparMargemHud(iIntValue9, iIntValue10, i5, i6, iIntValue, iIntValue2);
                                    floatingService.criarComponenteToqueRep(((Number) bc1VarClamparMargemHud3.f1292a).intValue(), ((Number) bc1VarClamparMargemHud3.f1293b).intValue(), str2, jSONObject);
                                } else {
                                    continue;
                                }
                                break;
                            case 1083955077:
                                if (string2.equals(TIPO_ANALOGICO)) {
                                    int iOptInt3 = jSONObject.optInt("tamanho", 0);
                                    Integer numValueOf = Integer.valueOf(iOptInt3);
                                    if (iOptInt3 <= 0) {
                                        numValueOf = null;
                                    }
                                    int iIntValue11 = numValueOf != null ? numValueOf.intValue() : floatingService.dpParaPx(120);
                                    bc1 bc1VarMargensWrapperParaCentro4 = z2 ? floatingService.margensWrapperParaCentro(TIPO_ANALOGICO, iIntValue3, iIntValue4, Integer.valueOf(iIntValue11)) : new bc1(Integer.valueOf(iIntValue3), Integer.valueOf(iIntValue4));
                                    int iIntValue12 = ((Number) bc1VarMargensWrapperParaCentro4.f1292a).intValue();
                                    int iIntValue13 = ((Number) bc1VarMargensWrapperParaCentro4.f1293b).intValue();
                                    int iDpParaPx7 = iIntValue11 + floatingService.dpParaPx(28) + (floatingService.dpParaPx(4) * 2);
                                    bc1 bc1VarClamparMargemHud4 = floatingService.clamparMargemHud(iIntValue12, iIntValue13, iDpParaPx7, iDpParaPx7, iIntValue, iIntValue2);
                                    floatingService.criarComponenteAnalogico(((Number) bc1VarClamparMargemHud4.f1292a).intValue(), ((Number) bc1VarClamparMargemHud4.f1293b).intValue(), jSONObject);
                                }
                                break;
                        }
                        z = false;
                    } else {
                        z = false;
                    }
                    i4++;
                } catch (Exception e) {
                    e = e;
                    floatingService = this;
                    e.printStackTrace();
                    if (floatingService.hudEmModoEdicao) {
                        floatingService.aplicarModoEdicao();
                    } else if (floatingService.hudEmModoJogo) {
                        floatingService.aplicarModoJogo();
                    }
                }
            }
        } catch (Exception e2) {
            e = e2;
        }
        if (floatingService.hudEmModoEdicao) {
            floatingService.aplicarModoEdicao();
        } else if (floatingService.hudEmModoJogo) {
            floatingService.aplicarModoJogo();
        }
    }

    private final Set<String> carregarMonitorCampos(String str) {
        if (str == null || zv1.m7371K0(str)) {
            return AbstractC1377rp.m5868C0(PipelineMonitorText.INSTANCE.getIDS_TODOS());
        }
        int i = 0;
        List listM7378R0 = zv1.m7378R0(str, new char[]{','});
        ArrayList arrayList = new ArrayList(AbstractC1451tp.m6307o0(listM7378R0));
        Iterator it = listM7378R0.iterator();
        while (it.hasNext()) {
            arrayList.add(zv1.m7383W0((String) it.next()).toString());
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        Set<String> setM5868C0 = AbstractC1377rp.m5868C0(arrayList2);
        PipelineMonitorText pipelineMonitorText = PipelineMonitorText.INSTANCE;
        setM5868C0.retainAll(pipelineMonitorText.getIDS_TODOS());
        return setM5868C0.isEmpty() ? AbstractC1377rp.m5868C0(pipelineMonitorText.getIDS_TODOS()) : setM5868C0;
    }

    private final void carregarPreferenciaGraficoPartida() {
        AimGraphConfig.INSTANCE.setMostrarGraficoNaPartida(getSharedPreferences("SSMousePrefs", 0).getBoolean(KEY_EXTERIOR_GRAFICO_PARTIDA, false));
    }

    private final void carregarPreferenciasHud() {
        boolean z;
        Switch r0;
        TextView textView;
        SeekBar seekBar;
        SharedPreferences sharedPreferences = getSharedPreferences("SSMousePrefs", 0);
        this.opacidadeNoJogo = p32.m5139E(sharedPreferences.getFloat(chaveOpacidadeHud(), OPACIDADE_JOGO_PADRAO), TouchPipeline.SIZE, 1.0f);
        String strChaveExibirHudJogo = chaveExibirHudJogo();
        if (sharedPreferences.contains(strChaveExibirHudJogo)) {
            z = sharedPreferences.getBoolean(strChaveExibirHudJogo, true);
        } else {
            z = sharedPreferences.contains(KEY_EXIBIR_HUD_LAST) ? sharedPreferences.getBoolean(KEY_EXIBIR_HUD_LAST, true) : sharedPreferences.getBoolean("hud_exibir_jogo_default", true);
        }
        this.exibirHudDuranteJogo = z;
        this.carregandoPrefsHud = true;
        try {
            int i = (int) (this.opacidadeNoJogo * 100.0f);
            View view = this.hudOverlayView;
            if (view != null && (seekBar = (SeekBar) view.findViewById(C0203R.id.seekBarOpacidadeJogo)) != null) {
                seekBar.setProgress(i);
            }
            View view2 = this.hudOverlayView;
            if (view2 != null && (textView = (TextView) view2.findViewById(C0203R.id.txtOpacidadeJogoPercent)) != null) {
                textView.setText(i + "%");
            }
            View view3 = this.hudOverlayView;
            if (view3 != null && (r0 = (Switch) view3.findViewById(C0203R.id.switchExibirHudJogo)) != null) {
                r0.setChecked(this.exibirHudDuranteJogo);
            }
        } finally {
            this.carregandoPrefsHud = false;
        }
    }

    private final void carregarSensibilidadeSalva() {
        this.mouseSensitivity = p32.m5139E(getSharedPreferences("SSMousePrefs", 0).getFloat(KEY_MOUSE_SENSITIVITY, 1.0f), 0.5f, SENSI_MAX);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006d, code lost:
    
        if (r2.equals(com.example.ssmousepro.FloatingService.TIPO_ANALOGICO) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c9, code lost:
    
        if (r2.equals(com.example.ssmousepro.FloatingService.TIPO_FPS) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d0, code lost:
    
        if (r0.getWidth() <= 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d2, code lost:
    
        r9 = r0.getWidth();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d7, code lost:
    
        r9 = r1.width;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00dd, code lost:
    
        if (r0.getHeight() <= 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00df, code lost:
    
        r10 = r0.getHeight();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00e4, code lost:
    
        r10 = r1.height;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00fb, code lost:
    
        return new p000.bc1(java.lang.Integer.valueOf((r9 / 2) + r1.leftMargin), java.lang.Integer.valueOf((r10 / 2) + r1.topMargin));
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final p000.bc1 centroConteudoNoContainer(android.view.View r10, android.view.View r11) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ssmousepro.FloatingService.centroConteudoNoContainer(android.view.View, android.view.View):bc1");
    }

    private final String chaveExibirHudJogo() {
        String str = this.pacoteDoJogo;
        if (str == null) {
            str = "default";
        }
        return SUFIXO_EXIBIR_HUD.concat(str);
    }

    private final String chaveMapeamentoHud() {
        String str = this.pacoteDoJogo;
        if (str == null) {
            str = "default";
        }
        return PREFIXO_MAPEAMENTO_HUD.concat(str);
    }

    private final String chaveOpacidadeHud() {
        String str = this.pacoteDoJogo;
        if (str == null) {
            str = "default";
        }
        return SUFIXO_OPACIDADE_HUD.concat(str);
    }

    private final bc1 clamparMargemHud(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i5 > 0 && i6 > 0) {
            return new bc1(Integer.valueOf(p32.m5140F(i, 0, Math.max(0, i5 - i3))), Integer.valueOf(p32.m5140F(i2, 0, Math.max(0, i6 - i4))));
        }
        if (i < 0) {
            i = 0;
        }
        Integer numValueOf = Integer.valueOf(i);
        if (i2 < 0) {
            i2 = 0;
        }
        return new bc1(numValueOf, Integer.valueOf(i2));
    }

    private final void configurarArraste(View view, final FrameLayout frameLayout, final View[] viewArr, final ch0 ch0Var, final mg0 mg0Var) {
        view.setOnTouchListener(new View.OnTouchListener() { // from class: com.example.ssmousepro.FloatingService.configurarArraste.1
            private boolean arrastando;
            private long clickStartTime;
            private int initialMarginX;
            private int initialMarginY;
            private float initialTouchX;
            private float initialTouchY;
            private final int maxClickDistance;
            private final long maxClickDuration = 250;

            {
                this.maxClickDistance = FloatingService.this.dpParaPx(8);
            }

            private final boolean toqueEmAreaIgnorada(MotionEvent motionEvent) {
                View[] viewArr2 = viewArr;
                FloatingService floatingService = FloatingService.this;
                for (View view2 : viewArr2) {
                    if (view2 != null && floatingService.toqueDentroDaView(motionEvent, view2)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view2, MotionEvent motionEvent) {
                view2.getClass();
                motionEvent.getClass();
                if (motionEvent.getAction() == 0 && toqueEmAreaIgnorada(motionEvent)) {
                    return false;
                }
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                layoutParams.getClass();
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                Integer numValueOf = Integer.valueOf(frameLayout.getWidth());
                if (numValueOf.intValue() <= 0) {
                    numValueOf = null;
                }
                int iIntValue = numValueOf != null ? numValueOf.intValue() : FloatingService.this.getResources().getDisplayMetrics().widthPixels;
                Integer numValueOf2 = Integer.valueOf(frameLayout.getHeight());
                if (numValueOf2.intValue() <= 0) {
                    numValueOf2 = null;
                }
                int iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : FloatingService.this.getResources().getDisplayMetrics().heightPixels;
                Integer numValueOf3 = Integer.valueOf(view2.getWidth());
                if (numValueOf3.intValue() <= 0) {
                    numValueOf3 = null;
                }
                int iIntValue3 = numValueOf3 != null ? numValueOf3.intValue() : layoutParams2.width;
                Integer numValueOf4 = Integer.valueOf(view2.getHeight());
                Integer num = numValueOf4.intValue() > 0 ? numValueOf4 : null;
                int iIntValue4 = num != null ? num.intValue() : layoutParams2.height;
                int action = motionEvent.getAction();
                if (action == 0) {
                    this.clickStartTime = System.currentTimeMillis();
                    this.arrastando = false;
                    this.initialTouchX = motionEvent.getRawX();
                    this.initialTouchY = motionEvent.getRawY();
                    this.initialMarginX = layoutParams2.leftMargin;
                    this.initialMarginY = layoutParams2.topMargin;
                    return true;
                }
                if (action != 1) {
                    if (action == 2) {
                        int rawX = (int) (motionEvent.getRawX() - this.initialTouchX);
                        int rawY = (int) (motionEvent.getRawY() - this.initialTouchY);
                        if (Math.abs(rawX) > this.maxClickDistance || Math.abs(rawY) > this.maxClickDistance) {
                            this.arrastando = true;
                        }
                        if (this.arrastando) {
                            layoutParams2.leftMargin = p32.m5140F(this.initialMarginX + rawX, 0, Math.max(0, iIntValue - iIntValue3));
                            layoutParams2.topMargin = p32.m5140F(this.initialMarginY + rawY, 0, Math.max(0, iIntValue2 - iIntValue4));
                            view2.setLayoutParams(layoutParams2);
                            Object tag = view2.getTag(C0203R.id.tag_hud_tipo);
                            if (hp0.m3214e(tag, FloatingService.TIPO_ANALOGICO)) {
                                FloatingService.this.atualizarPropriedadesPainelAnalog((FrameLayout) view2);
                            } else if (hp0.m3214e(tag, FloatingService.TIPO_TOQUE)) {
                                FloatingService.this.atualizarPropriedadesPainelToque((FrameLayout) view2);
                            } else if (hp0.m3214e(tag, FloatingService.TIPO_TOQUE_REP)) {
                                FloatingService.this.atualizarPropriedadesPainelToqueRep((FrameLayout) view2);
                            }
                        }
                        return true;
                    }
                    if (action != 3) {
                        return false;
                    }
                }
                long jCurrentTimeMillis = System.currentTimeMillis() - this.clickStartTime;
                float fAbs = Math.abs(motionEvent.getRawX() - this.initialTouchX);
                float fAbs2 = Math.abs(motionEvent.getRawY() - this.initialTouchY);
                if (!this.arrastando && jCurrentTimeMillis < this.maxClickDuration) {
                    int i = this.maxClickDistance;
                    if (fAbs < i && fAbs2 < i && !toqueEmAreaIgnorada(motionEvent)) {
                        mg0 mg0Var2 = mg0Var;
                        if (mg0Var2 != null) {
                            mg0Var2.invoke();
                        }
                        ch0 ch0Var2 = ch0Var;
                        if (ch0Var2 != null) {
                            ch0Var2.invoke(Float.valueOf(motionEvent.getRawX()), Float.valueOf(motionEvent.getRawY()));
                        }
                    }
                }
                return true;
            }
        });
    }

    public static /* synthetic */ void configurarArraste$default(FloatingService floatingService, View view, FrameLayout frameLayout, View[] viewArr, ch0 ch0Var, mg0 mg0Var, int i, Object obj) {
        if ((i & 8) != 0) {
            ch0Var = null;
        }
        if ((i & 16) != 0) {
            mg0Var = null;
        }
        floatingService.configurarArraste(view, frameLayout, viewArr, ch0Var, mg0Var);
    }

    private final void configurarControlesHud() {
        TextView textView;
        TextView textView2;
        TextView textView3;
        View viewFindViewById;
        View viewFindViewById2;
        View viewFindViewById3;
        TextView textView4;
        TextView textView5;
        View view = this.hudOverlayView;
        if (view != null && (textView5 = (TextView) view.findViewById(C0203R.id.btnAdicionarTecla)) != null) {
            textView5.setOnClickListener(new nb0(this, 5));
        }
        View view2 = this.hudOverlayView;
        if (view2 != null && (textView4 = (TextView) view2.findViewById(C0203R.id.btnBandeja)) != null) {
            textView4.setOnClickListener(new nb0(this, 6));
        }
        View view3 = this.hudOverlayView;
        if (view3 != null && (viewFindViewById3 = view3.findViewById(C0203R.id.btnAdicionarAnalogico)) != null) {
            viewFindViewById3.setOnClickListener(new nb0(this, 7));
        }
        View view4 = this.hudOverlayView;
        if (view4 != null && (viewFindViewById2 = view4.findViewById(C0203R.id.btnVisaoFps)) != null) {
            viewFindViewById2.setOnClickListener(new nb0(this, 8));
        }
        View view5 = this.hudOverlayView;
        if (view5 != null && (viewFindViewById = view5.findViewById(C0203R.id.btnToqueRepetido)) != null) {
            viewFindViewById.setOnClickListener(new nb0(this, 9));
        }
        View view6 = this.hudOverlayView;
        if (view6 != null && (textView3 = (TextView) view6.findViewById(C0203R.id.btnHudSalvar)) != null) {
            textView3.setOnClickListener(new nb0(this, 10));
        }
        View view7 = this.hudOverlayView;
        if (view7 != null && (textView2 = (TextView) view7.findViewById(C0203R.id.btnHudSair)) != null) {
            textView2.setOnClickListener(new nb0(this, 11));
        }
        View view8 = this.hudOverlayView;
        if (view8 != null && (textView = (TextView) view8.findViewById(C0203R.id.btnToggleConfig)) != null) {
            textView.setOnClickListener(new nb0(this, 12));
        }
        aplicarEstadoPainelConfig();
        View view9 = this.hudOverlayView;
        SeekBar seekBar = view9 != null ? (SeekBar) view9.findViewById(C0203R.id.seekBarOpacidadeJogo) : null;
        View view10 = this.hudOverlayView;
        final TextView textView6 = view10 != null ? (TextView) view10.findViewById(C0203R.id.txtOpacidadeJogoPercent) : null;
        View view11 = this.hudOverlayView;
        Switch r1 = view11 != null ? (Switch) view11.findViewById(C0203R.id.switchExibirHudJogo) : null;
        if (seekBar != null) {
            seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.example.ssmousepro.FloatingService.configurarControlesHud.9
                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onProgressChanged(SeekBar seekBar2, int i, boolean z) {
                    FloatingService.this.opacidadeNoJogo = i / 100.0f;
                    TextView textView7 = textView6;
                    if (textView7 != null) {
                        textView7.setText(i + "%");
                    }
                    if (z) {
                        FloatingService.this.salvarPreferenciasHud();
                    }
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onStopTrackingTouch(SeekBar seekBar2) {
                    FloatingService.this.salvarPreferenciasHud();
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onStartTrackingTouch(SeekBar seekBar2) {
                }
            });
        }
        if (r1 != null) {
            r1.setOnCheckedChangeListener(new ic0(this, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configurarControlesHud$lambda$70(FloatingService floatingService, View view) {
        floatingService.recolherBandeja();
        floatingService.adicionarTeclaMapeamento();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configurarControlesHud$lambda$78(FloatingService floatingService, CompoundButton compoundButton, boolean z) {
        compoundButton.getClass();
        if (floatingService.carregandoPrefsHud) {
            return;
        }
        floatingService.exibirHudDuranteJogo = z;
        floatingService.salvarPreferenciasHud();
        if (!floatingService.hudEmModoJogo || floatingService.hudEmModoEdicao) {
            return;
        }
        floatingService.aplicarModoJogo();
    }

    private final void configurarRedimensionamentoAnalog(final FrameLayout frameLayout, final AnalogStickHudView analogStickHudView, View view) {
        view.setOnTouchListener(new View.OnTouchListener() { // from class: com.example.ssmousepro.FloatingService.configurarRedimensionamentoAnalog.1
            private int tamanhoInicial;
            private float touchInicialX;
            private float touchInicialY;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view2, MotionEvent motionEvent) {
                view2.getClass();
                motionEvent.getClass();
                int action = motionEvent.getAction();
                if (action == 0) {
                    this.tamanhoInicial = analogStickHudView.getLayoutParams().width;
                    this.touchInicialX = motionEvent.getRawX();
                    this.touchInicialY = motionEvent.getRawY();
                    return true;
                }
                if (action != 2) {
                    return false;
                }
                this.redimensionarWrapperAnalog(frameLayout, analogStickHudView, p32.m5140F(this.tamanhoInicial + ((int) (((motionEvent.getRawY() - this.touchInicialY) + (motionEvent.getRawX() - this.touchInicialX)) / 2.0f)), this.dpParaPx(40), this.dpParaPx(200)));
                this.atualizarPropriedadesPainelAnalog(frameLayout);
                return true;
            }
        });
    }

    private final mg0 criarAcaoCliqueSimples(TextView textView, String str) {
        if (hp0.m3214e(str, TIPO_TOQUE) || hp0.m3214e(str, TIPO_TOQUE_REP)) {
            return new bc0(this, textView, 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 criarAcaoCliqueSimples$lambda$85(FloatingService floatingService, TextView textView) {
        floatingService.ativarModoEscutaComponente(textView, new pb0(floatingService, textView, 0));
        return z32.f13265a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 criarAcaoCliqueSimples$lambda$85$lambda$84(FloatingService floatingService, TextView textView, String str) {
        str.getClass();
        floatingService.aplicarTeclaNoComponente(textView, str);
        return z32.f13265a;
    }

    private final View criarBotaoAcaoConfig(String str, int i, mg0 mg0Var) {
        TextView textView = new TextView(this);
        textView.setText(str);
        textView.setTextColor(-1);
        textView.setTextSize(15.0f);
        textView.setGravity(17);
        textView.setTypeface(textView.getTypeface(), 1);
        textView.setPadding(dpParaPx(14), dpParaPx(12), dpParaPx(14), dpParaPx(12));
        textView.setBackground(fundoArredondado(i, 12));
        textView.setClickable(true);
        textView.setOnClickListener(new xb0(mg0Var, 2));
        textView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        return textView;
    }

    private final TextView criarBotaoIconeHud(String str) {
        TextView textView = new TextView(this);
        textView.setText(str);
        textView.setGravity(17);
        textView.setTextSize(13.0f);
        textView.setTextColor(-1);
        textView.setBackgroundResource(C0203R.drawable.bg_hud_icon_btn);
        textView.setClickable(true);
        textView.setFocusable(true);
        return textView;
    }

    private final View criarBotaoNavConfig(String str, String str2, mg0 mg0Var) {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setBackground(fundoArredondado(this.corPainelCard, 12));
        int iDpParaPx = dpParaPx(14);
        linearLayout.setPadding(iDpParaPx, iDpParaPx, iDpParaPx, iDpParaPx);
        linearLayout.setClickable(true);
        linearLayout.setOnClickListener(new xb0(mg0Var, 0));
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(1);
        TextView textView = new TextView(this);
        textView.setText(str);
        textView.setTextColor(this.corPainelTexto);
        textView.setTextSize(15.0f);
        textView.setTypeface(textView.getTypeface(), 1);
        linearLayout2.addView(textView);
        if (str2 != null) {
            TextView textView2 = new TextView(this);
            textView2.setText(str2);
            textView2.setTextColor(this.corPainelTexto2);
            textView2.setTextSize(12.0f);
            linearLayout2.addView(textView2);
        }
        linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView textView3 = new TextView(this);
        textView3.setText(">");
        textView3.setTextColor(this.corPainelTexto2);
        textView3.setTextSize(22.0f);
        linearLayout.addView(textView3);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = dpParaPx(8);
        linearLayout.setLayoutParams(layoutParams);
        return linearLayout;
    }

    private final View criarBotaoVoltarConfig(mg0 mg0Var) {
        TextView textView = new TextView(this);
        textView.setText("< Voltar");
        textView.setTextColor(this.corPainelAccent);
        textView.setTextSize(14.0f);
        textView.setTypeface(textView.getTypeface(), 1);
        int iDpParaPx = dpParaPx(6);
        textView.setPadding(0, iDpParaPx, 0, iDpParaPx);
        textView.setClickable(true);
        textView.setOnClickListener(new xb0(mg0Var, 1));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = dpParaPx(4);
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    private final EditText criarCampoNumeroConfig(String str) {
        EditText editText = new EditText(this);
        editText.setHint(str);
        editText.setHintTextColor(this.corPainelTexto2);
        editText.setTextColor(this.corPainelTexto);
        editText.setTextSize(15.0f);
        editText.setInputType(2);
        editText.setPadding(dpParaPx(12), dpParaPx(10), dpParaPx(12), dpParaPx(10));
        editText.setBackground(fundoArredondado(this.corPainelCard, 10));
        return editText;
    }

    private final void criarComponenteAnalogico(int i, int i2, JSONObject jSONObject) {
        String strOptString;
        String strOptString2;
        String strOptString3;
        String strOptString4;
        Integer num = null;
        if (jSONObject != null) {
            int iOptInt = jSONObject.optInt("tamanho", -1);
            Integer numValueOf = Integer.valueOf(iOptInt);
            if (iOptInt > 0) {
                num = numValueOf;
            }
        }
        int iIntValue = num != null ? num.intValue() : dpParaPx(120);
        String str = "W";
        if (jSONObject != null && (strOptString4 = jSONObject.optString("teclaW", "W")) != null && !zv1.m7371K0(strOptString4)) {
            str = strOptString4;
        }
        String str2 = str;
        String str3 = "S";
        if (jSONObject != null && (strOptString3 = jSONObject.optString("teclaS", "S")) != null && !zv1.m7371K0(strOptString3)) {
            str3 = strOptString3;
        }
        String str4 = str3;
        String str5 = "A";
        if (jSONObject != null && (strOptString2 = jSONObject.optString("teclaA", "A")) != null && !zv1.m7371K0(strOptString2)) {
            str5 = strOptString2;
        }
        String str6 = str5;
        String str7 = "D";
        if (jSONObject != null && (strOptString = jSONObject.optString("teclaD", "D")) != null && !zv1.m7371K0(strOptString)) {
            str7 = strOptString;
        }
        String str8 = str7;
        int iOptInt2 = jSONObject != null ? jSONObject.optInt("rapidez", 200) : 200;
        boolean zOptBoolean = jSONObject != null ? jSONObject.optBoolean("mostrarTeclas", true) : true;
        FrameLayout frameLayoutObterContainerHud = obterContainerHud();
        if (frameLayoutObterContainerHud == null) {
            return;
        }
        int iDpParaPx = dpParaPx(28);
        int iDpParaPx2 = dpParaPx(4);
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setTag(C0203R.id.tag_hud_tipo, TIPO_ANALOGICO);
        frameLayout.setTag(C0203R.id.tag_hud_analog_tecla_w, str2);
        frameLayout.setTag(C0203R.id.tag_hud_analog_tecla_s, str4);
        frameLayout.setTag(C0203R.id.tag_hud_analog_tecla_a, str6);
        frameLayout.setTag(C0203R.id.tag_hud_analog_tecla_d, str8);
        frameLayout.setTag(C0203R.id.tag_hud_analog_rapidez, Integer.valueOf(iOptInt2));
        frameLayout.setTag(C0203R.id.tag_hud_analog_mostrar_teclas, Boolean.valueOf(zOptBoolean));
        AnalogStickHudView analogStickHudView = new AnalogStickHudView(this, null, 0, 6, null);
        analogStickHudView.setMostrarTeclas(zOptBoolean);
        LinuxKeyCodes linuxKeyCodes = LinuxKeyCodes.INSTANCE;
        analogStickHudView.setTeclaW(linuxKeyCodes.rotuloExibicaoHud(str2));
        analogStickHudView.setTeclaS(linuxKeyCodes.rotuloExibicaoHud(str4));
        analogStickHudView.setTeclaA(linuxKeyCodes.rotuloExibicaoHud(str6));
        analogStickHudView.setTeclaD(linuxKeyCodes.rotuloExibicaoHud(str8));
        analogStickHudView.setClickable(false);
        analogStickHudView.setFocusable(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iIntValue, iIntValue);
        layoutParams.gravity = 17;
        analogStickHudView.setLayoutParams(layoutParams);
        View viewCriarBotaoIconeHud = criarBotaoIconeHud("✕");
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iDpParaPx, iDpParaPx);
        layoutParams2.gravity = 8388661;
        layoutParams2.topMargin = iDpParaPx2;
        layoutParams2.rightMargin = iDpParaPx2;
        viewCriarBotaoIconeHud.setLayoutParams(layoutParams2);
        View viewCriarBotaoIconeHud2 = criarBotaoIconeHud("⚙");
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(iDpParaPx, iDpParaPx);
        layoutParams3.gravity = 8388691;
        layoutParams3.bottomMargin = iDpParaPx2;
        layoutParams3.leftMargin = iDpParaPx2;
        viewCriarBotaoIconeHud2.setLayoutParams(layoutParams3);
        ImageView imageView = new ImageView(this);
        imageView.setImageResource(C0203R.drawable.ic_analog_resize);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setBackgroundResource(C0203R.drawable.bg_hud_icon_btn);
        imageView.setClickable(true);
        imageView.setFocusable(true);
        int iDpParaPx3 = dpParaPx(6);
        imageView.setPadding(iDpParaPx3, iDpParaPx3, iDpParaPx3, iDpParaPx3);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(iDpParaPx, iDpParaPx);
        layoutParams4.gravity = 8388693;
        layoutParams4.bottomMargin = iDpParaPx2;
        layoutParams4.rightMargin = iDpParaPx2;
        imageView.setLayoutParams(layoutParams4);
        frameLayout.addView(analogStickHudView);
        frameLayout.addView(viewCriarBotaoIconeHud);
        frameLayout.addView(viewCriarBotaoIconeHud2);
        frameLayout.addView(imageView);
        int i3 = (iDpParaPx2 * 2) + iIntValue + iDpParaPx;
        frameLayout.setLayoutParams(criarParamsPosicionados(i3, i3, i, i2));
        viewCriarBotaoIconeHud.setOnClickListener(new tb0(this, frameLayoutObterContainerHud, frameLayout, 2));
        viewCriarBotaoIconeHud2.setOnClickListener(new ub0(3, frameLayout, this));
        configurarRedimensionamentoAnalog(frameLayout, analogStickHudView, imageView);
        configurarArraste$default(this, frameLayout, frameLayoutObterContainerHud, new View[]{viewCriarBotaoIconeHud, viewCriarBotaoIconeHud2, imageView}, null, null, 24, null);
        frameLayoutObterContainerHud.addView(frameLayout);
    }

    public static /* synthetic */ void criarComponenteAnalogico$default(FloatingService floatingService, int i, int i2, JSONObject jSONObject, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            jSONObject = null;
        }
        floatingService.criarComponenteAnalogico(i, i2, jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void criarComponenteAnalogico$lambda$126(FloatingService floatingService, FrameLayout frameLayout, FrameLayout frameLayout2, View view) {
        floatingService.fecharPainelConfigAnalogico();
        frameLayout.removeView(frameLayout2);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0028  */
    /* JADX WARN: Code duplicated, block: B:21:0x0042  */
    /* JADX WARN: Code duplicated, block: B:23:0x0045  */
    /* JADX WARN: Code duplicated, block: B:34:0x006a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0092  */
    private final void criarComponenteFps(int i, int i2, JSONObject jSONObject) {
        String str;
        String strOptString;
        String string;
        String strResolverTeclaHud$default;
        String string2;
        String strOptString2;
        boolean zOptBoolean;
        String string3;
        String str2;
        int i3;
        boolean zOptBoolean2;
        int iM5140F;
        String string4;
        String string5;
        int i4;
        String str3;
        int i5;
        String str4;
        int i6;
        String strResolverTeclaHud$default2;
        boolean z;
        int i7;
        String str5;
        int i8;
        int i9;
        int i10;
        int i11;
        String strOptString3;
        String string6;
        String strOptString4;
        String strOptString5;
        String strOptString6;
        Object id;
        String strOptString7;
        String strOptString8;
        String str6 = null;
        if (jSONObject == null || (strOptString8 = jSONObject.optString("teclaTag", "")) == null || (strResolverTeclaHud$default = zv1.m7383W0(strOptString8).toString()) == null) {
            if (jSONObject != null && (strOptString = jSONObject.optString("tecla", "")) != null && (string = zv1.m7383W0(strOptString).toString()) != null) {
                if (zv1.m7371K0(string)) {
                    string = null;
                }
                if (string != null) {
                    strResolverTeclaHud$default = LinuxKeyCodes.resolverTeclaHud$default(LinuxKeyCodes.INSTANCE, string, null, 2, null);
                    str = strResolverTeclaHud$default;
                }
            }
            str = null;
        } else {
            if (zv1.m7371K0(strResolverTeclaHud$default)) {
                strResolverTeclaHud$default = null;
            }
            if (strResolverTeclaHud$default == null) {
                if (jSONObject != null) {
                    if (zv1.m7371K0(string)) {
                        string = null;
                    }
                    if (string != null) {
                        strResolverTeclaHud$default = LinuxKeyCodes.resolverTeclaHud$default(LinuxKeyCodes.INSTANCE, string, null, 2, null);
                        str = strResolverTeclaHud$default;
                    }
                }
                str = null;
            } else {
                str = strResolverTeclaHud$default;
            }
        }
        if (jSONObject != null && (strOptString7 = jSONObject.optString("teclaSuspenderTag", "")) != null && (string2 = zv1.m7383W0(strOptString7).toString()) != null) {
            if (zv1.m7371K0(string2)) {
                string2 = null;
            }
            if (string2 == null) {
                if (jSONObject != null) {
                    string2 = null;
                } else {
                    string2 = null;
                }
            }
        } else if (jSONObject != null || (strOptString2 = jSONObject.optString("teclaSuspender", "")) == null || (string2 = zv1.m7383W0(strOptString2).toString()) == null) {
            string2 = null;
        } else {
            if (zv1.m7371K0(string2)) {
                string2 = null;
            }
            if (string2 != null) {
                String strResolverTeclaHud$default3 = LinuxKeyCodes.resolverTeclaHud$default(LinuxKeyCodes.INSTANCE, string2, null, 2, null);
                if (strResolverTeclaHud$default3 != null) {
                    string2 = strResolverTeclaHud$default3;
                }
            } else {
                string2 = null;
            }
        }
        float fOptDouble = jSONObject != null ? (float) jSONObject.optDouble("sensX", 1.0d) : 1.0f;
        float fOptDouble2 = jSONObject != null ? (float) jSONObject.optDouble("sensY", 0.5d) : 0.5f;
        DevToolsGate devToolsGate = DevToolsGate.INSTANCE;
        int iM5140F2 = 150;
        if (devToolsGate.getLiberado()) {
            zOptBoolean = jSONObject != null ? jSONObject.optBoolean("acelLimiarAtivo", false) : false;
            int iM5140F3 = jSONObject != null ? p32.m5140F(jSONObject.optInt("acelLimiarLimX", 8), 0, 50) : 8;
            int iM5140F4 = jSONObject != null ? p32.m5140F(jSONObject.optInt("acelLimiarGainX", 150), BALL_SIZE_MAX, 300) : 150;
            int iM5140F5 = jSONObject != null ? p32.m5140F(jSONObject.optInt("acelLimiarLimY", 8), 0, 50) : 8;
            iM5140F2 = jSONObject != null ? p32.m5140F(jSONObject.optInt("acelLimiarGainY", 150), BALL_SIZE_MAX, 300) : 150;
            if (jSONObject == null || (strOptString6 = jSONObject.optString("acelLimiarTecla", "")) == null || (string3 = zv1.m7383W0(strOptString6).toString()) == null || zv1.m7371K0(string3)) {
                string3 = null;
            }
            if (string3 != null) {
                String strResolverTeclaHud$default4 = LinuxKeyCodes.resolverTeclaHud$default(LinuxKeyCodes.INSTANCE, string3, null, 2, null);
                if (strResolverTeclaHud$default4 != null) {
                    string3 = strResolverTeclaHud$default4;
                }
                str2 = string3;
            } else {
                str2 = null;
            }
            boolean zOptBoolean3 = jSONObject != null ? jSONObject.optBoolean("lowSpeedAtivoX", jSONObject.optBoolean("lowSpeedAtivo", true)) : true;
            if (jSONObject != null) {
                i3 = 0;
                zOptBoolean2 = jSONObject.optBoolean("lowSpeedAtivoY", jSONObject.optBoolean("lowSpeedAtivo", false));
            } else {
                i3 = 0;
                zOptBoolean2 = false;
            }
            int iM5140F6 = jSONObject != null ? p32.m5140F(jSONObject.optInt("lowSpeedLimX", 30), i3, 50) : 30;
            int iM5140F7 = jSONObject != null ? p32.m5140F(jSONObject.optInt("lowSpeedFatorX", 60), 10, 100) : 60;
            iM5140F = jSONObject != null ? p32.m5140F(jSONObject.optInt("lowSpeedLimY", 0), 0, 50) : 0;
            int iM5140F8 = jSONObject != null ? p32.m5140F(jSONObject.optInt("lowSpeedFatorY", 60), 10, 100) : 60;
            if (jSONObject == null || (strOptString5 = jSONObject.optString("lowSpeedTecla", "")) == null || (string4 = zv1.m7383W0(strOptString5).toString()) == null || zv1.m7371K0(string4)) {
                string4 = null;
            }
            if (jSONObject == null || (strOptString4 = jSONObject.optString("lowSpeedTeclaX", "")) == null || (string5 = zv1.m7383W0(strOptString4).toString()) == null) {
                string5 = null;
            } else if (zv1.m7371K0(string5)) {
                string5 = string4;
            }
            i4 = iM5140F8;
            if (jSONObject == null || (strOptString3 = jSONObject.optString("lowSpeedTeclaY", "")) == null || (string6 = zv1.m7383W0(strOptString3).toString()) == null) {
                str3 = null;
            } else {
                str3 = zv1.m7371K0(string6) ? string4 : string6;
            }
            if (string5 != null) {
                i5 = iM5140F4;
                str4 = null;
                i6 = 2;
                strResolverTeclaHud$default2 = LinuxKeyCodes.resolverTeclaHud$default(LinuxKeyCodes.INSTANCE, string5, null, 2, null);
                if (strResolverTeclaHud$default2 == null) {
                    strResolverTeclaHud$default2 = string5;
                }
            } else {
                i5 = iM5140F4;
                str4 = null;
                i6 = 2;
                strResolverTeclaHud$default2 = null;
            }
            if (str3 != null) {
                String strResolverTeclaHud$default5 = LinuxKeyCodes.resolverTeclaHud$default(LinuxKeyCodes.INSTANCE, str3, str4, i6, str4);
                if (strResolverTeclaHud$default5 != null) {
                    str3 = strResolverTeclaHud$default5;
                }
            } else {
                str3 = str4;
            }
            str6 = str3;
            z = zOptBoolean3;
            i7 = iM5140F7;
            str5 = str2;
            i8 = iM5140F3;
            i9 = iM5140F6;
            i10 = iM5140F5;
            i11 = iM5140F2;
            iM5140F2 = i5;
        } else {
            iM5140F = 0;
            zOptBoolean2 = false;
            zOptBoolean = false;
            strResolverTeclaHud$default2 = null;
            str5 = null;
            i8 = 8;
            i10 = 8;
            z = true;
            i9 = 30;
            i7 = 60;
            i4 = 60;
            i11 = 150;
        }
        FrameLayout frameLayoutObterContainerHud = obterContainerHud();
        if (frameLayoutObterContainerHud == null) {
            return;
        }
        int iDpParaPx = dpParaPx(24);
        boolean z2 = z;
        int iDpParaPx2 = dpParaPx(2);
        FrameLayout frameLayout = new FrameLayout(this);
        int i12 = i9;
        frameLayout.setTag(C0203R.id.tag_hud_tipo, TIPO_FPS);
        if (str != null && !zv1.m7371K0(str)) {
            frameLayout.setTag(C0203R.id.tag_hud_tecla, str);
        }
        if (string2 != null && !zv1.m7371K0(string2)) {
            frameLayout.setTag(C0203R.id.tag_hud_fps_tecla_suspender, string2);
        }
        frameLayout.setTag(C0203R.id.tag_hud_fps_sens_x, Float.valueOf(fOptDouble));
        frameLayout.setTag(C0203R.id.tag_hud_fps_sens_y, Float.valueOf(fOptDouble2));
        int i13 = C0203R.id.tag_hud_fps_anti_block;
        if (devToolsGate.getLiberado()) {
            FpsAntiBlockModo.Companion companion = FpsAntiBlockModo.Companion;
            id = companion.fromId(jSONObject != null ? jSONObject.optString("antiBlock", companion.getOFICIAL().getId()) : null).getId();
        } else {
            iM5140F = iM5140F;
            id = FpsAntiBlockModo.Companion.getOFICIAL().getId();
        }
        frameLayout.setTag(i13, id);
        frameLayout.setTag(C0203R.id.tag_hud_fps_acel_limiar_ativo, Boolean.valueOf(zOptBoolean));
        frameLayout.setTag(C0203R.id.tag_hud_fps_acel_limiar_lim_x, Integer.valueOf(i8));
        frameLayout.setTag(C0203R.id.tag_hud_fps_acel_limiar_gain_x, Integer.valueOf(iM5140F2));
        frameLayout.setTag(C0203R.id.tag_hud_fps_acel_limiar_lim_y, Integer.valueOf(i10));
        frameLayout.setTag(C0203R.id.tag_hud_fps_acel_limiar_gain_y, Integer.valueOf(i11));
        if (str5 != null && !zv1.m7371K0(str5)) {
            frameLayout.setTag(C0203R.id.tag_hud_fps_acel_limiar_tecla, str5);
        }
        frameLayout.setTag(C0203R.id.tag_hud_fps_low_speed_ativo_x, Boolean.valueOf(z2));
        frameLayout.setTag(C0203R.id.tag_hud_fps_low_speed_lim_x, Integer.valueOf(i12));
        frameLayout.setTag(C0203R.id.tag_hud_fps_low_speed_fator_x, Integer.valueOf(i7));
        if (strResolverTeclaHud$default2 != null && !zv1.m7371K0(strResolverTeclaHud$default2)) {
            frameLayout.setTag(C0203R.id.tag_hud_fps_low_speed_tecla_x, strResolverTeclaHud$default2);
        }
        frameLayout.setTag(C0203R.id.tag_hud_fps_low_speed_ativo_y, Boolean.valueOf(zOptBoolean2));
        frameLayout.setTag(C0203R.id.tag_hud_fps_low_speed_lim_y, Integer.valueOf(iM5140F));
        frameLayout.setTag(C0203R.id.tag_hud_fps_low_speed_fator_y, Integer.valueOf(i4));
        if (str6 != null && !zv1.m7371K0(str6)) {
            frameLayout.setTag(C0203R.id.tag_hud_fps_low_speed_tecla_y, str6);
        }
        int i14 = 0;
        FpsViewHudView fpsViewHudView = new FpsViewHudView(this, null, 0, 6, null);
        fpsViewHudView.setSensX(fOptDouble);
        fpsViewHudView.setSensY(fOptDouble2);
        fpsViewHudView.setTeclaRotulo(str != null ? LinuxKeyCodes.INSTANCE.rotuloExibicaoHud(str) : null);
        fpsViewHudView.setClickable(false);
        fpsViewHudView.setFocusable(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        fpsViewHudView.setLayoutParams(layoutParams);
        View viewCriarBotaoIconeHud = criarBotaoIconeHud("✕");
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iDpParaPx, iDpParaPx);
        layoutParams2.gravity = 8388661;
        layoutParams2.topMargin = iDpParaPx2;
        layoutParams2.rightMargin = iDpParaPx2;
        viewCriarBotaoIconeHud.setLayoutParams(layoutParams2);
        View viewCriarBotaoIconeHud2 = criarBotaoIconeHud("⚙");
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(iDpParaPx, iDpParaPx);
        layoutParams3.gravity = 81;
        layoutParams3.bottomMargin = iDpParaPx2;
        viewCriarBotaoIconeHud2.setLayoutParams(layoutParams3);
        frameLayout.addView(fpsViewHudView);
        frameLayout.addView(viewCriarBotaoIconeHud);
        frameLayout.addView(viewCriarBotaoIconeHud2);
        frameLayout.setLayoutParams(criarParamsPosicionados(dpParaPx(136) + iDpParaPx, dpParaPx(72) + iDpParaPx, i, i2));
        vincularCallbacksFpsView(frameLayout, fpsViewHudView);
        viewCriarBotaoIconeHud.setOnClickListener(new tb0(this, frameLayoutObterContainerHud, frameLayout, i14));
        viewCriarBotaoIconeHud2.setOnClickListener(new ub0(i14, frameLayout, this));
        configurarArraste$default(this, frameLayout, frameLayoutObterContainerHud, new View[]{viewCriarBotaoIconeHud, viewCriarBotaoIconeHud2}, null, null, 24, null);
        frameLayoutObterContainerHud.addView(frameLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void criarComponenteFps$lambda$148(FloatingService floatingService, FrameLayout frameLayout, FrameLayout frameLayout2, View view) {
        floatingService.fecharPainelConfigFps();
        frameLayout.removeView(frameLayout2);
    }

    private final void criarComponenteToque(int i, int i2, String str, JSONObject jSONObject) {
        String string;
        String strOptString;
        Object string2;
        String strOptString2;
        int iDpParaPx = dpParaPx(45);
        if (jSONObject == null || (strOptString2 = jSONObject.optString("interrompeTecla", "")) == null || (string = zv1.m7383W0(strOptString2).toString()) == null || zv1.m7371K0(string)) {
            string = null;
        }
        Object obj = TOQUE_MODO_PRESS;
        if (jSONObject != null && (strOptString = jSONObject.optString("modoToque", TOQUE_MODO_PRESS)) != null && (string2 = zv1.m7383W0(strOptString).toString()) != null) {
            Object obj2 = string2.equals(TOQUE_MODO_TAP) ? string2 : null;
            if (obj2 != null) {
                obj = obj2;
            }
        }
        int i3 = 1;
        int iM5140F = jSONObject != null ? p32.m5140F(jSONObject.optInt("tapMs", 1), 1, 500) : 1;
        FrameLayout frameLayoutObterContainerHud = obterContainerHud();
        if (frameLayoutObterContainerHud == null) {
            return;
        }
        int iDpParaPx2 = dpParaPx(18);
        int i4 = iDpParaPx2 / 2;
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setTag(C0203R.id.tag_hud_tipo, TIPO_TOQUE);
        if (string != null && !zv1.m7371K0(string)) {
            frameLayout.setTag(C0203R.id.tag_hud_toque_interrompe, string);
        }
        frameLayout.setTag(C0203R.id.tag_hud_toque_modo, obj);
        frameLayout.setTag(C0203R.id.tag_hud_toque_tap_ms, Integer.valueOf(iM5140F));
        TextView textView = new TextView(this);
        textView.setGravity(17);
        textView.setTextColor(-1);
        textView.setTypeface(textView.getTypeface(), 1);
        textView.setAlpha(1.0f);
        textView.setClickable(false);
        textView.setFocusable(false);
        aplicarTeclaNoComponente(textView, str);
        textView.setBackgroundResource(C0203R.drawable.bg_tecla_mapeamento);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iDpParaPx, iDpParaPx);
        layoutParams.gravity = 8388691;
        layoutParams.topMargin = i4;
        textView.setLayoutParams(layoutParams);
        TextView textView2 = new TextView(this);
        textView2.setText("X");
        textView2.setGravity(17);
        textView2.setTextSize(10.0f);
        textView2.setTextColor(-1);
        textView2.setTypeface(textView2.getTypeface(), 1);
        textView2.setBackgroundResource(C0203R.drawable.bg_btn_excluir_hud);
        textView2.setClickable(true);
        textView2.setFocusable(true);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iDpParaPx2, iDpParaPx2);
        layoutParams2.gravity = 8388661;
        textView2.setLayoutParams(layoutParams2);
        TextView textViewCriarBotaoIconeHud = criarBotaoIconeHud("⚙");
        textViewCriarBotaoIconeHud.setTextSize(11.0f);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(iDpParaPx2, iDpParaPx2);
        layoutParams3.gravity = 8388693;
        layoutParams3.bottomMargin = 0;
        layoutParams3.rightMargin = 0;
        textViewCriarBotaoIconeHud.setLayoutParams(layoutParams3);
        frameLayout.addView(textView);
        frameLayout.addView(textView2);
        frameLayout.addView(textViewCriarBotaoIconeHud);
        int i5 = iDpParaPx + i4;
        frameLayout.setLayoutParams(criarParamsPosicionados(i5, i5, i, i2));
        textView2.setOnClickListener(new tb0(this, frameLayoutObterContainerHud, frameLayout, i3));
        textViewCriarBotaoIconeHud.setOnClickListener(new ub0(i3, frameLayout, this));
        configurarArraste$default(this, frameLayout, frameLayoutObterContainerHud, new View[]{textView2, textViewCriarBotaoIconeHud}, null, new bc0(this, textView, 0), 8, null);
        frameLayoutObterContainerHud.addView(frameLayout);
    }

    public static /* synthetic */ void criarComponenteToque$default(FloatingService floatingService, int i, int i2, String str, JSONObject jSONObject, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            jSONObject = null;
        }
        floatingService.criarComponenteToque(i, i2, str, jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void criarComponenteToque$lambda$95(FloatingService floatingService, FrameLayout frameLayout, FrameLayout frameLayout2, View view) {
        floatingService.fecharPainelConfigToque();
        frameLayout.removeView(frameLayout2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 criarComponenteToque$lambda$98(FloatingService floatingService, TextView textView) {
        floatingService.ativarModoEscutaComponente(textView, new pb0(floatingService, textView, 1));
        return z32.f13265a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 criarComponenteToque$lambda$98$lambda$97(FloatingService floatingService, TextView textView, String str) {
        str.getClass();
        floatingService.aplicarTeclaNoComponente(textView, str);
        return z32.f13265a;
    }

    private final void criarComponenteToqueRep(int i, int i2, String str, JSONObject jSONObject) {
        String strOptString;
        Object string;
        int iDpParaPx = dpParaPx(45);
        int iDpParaPx2 = dpParaPx(28);
        Object obj = TOQUE_MODO_PRESS;
        if (jSONObject != null && (strOptString = jSONObject.optString("modoToque", TOQUE_MODO_PRESS)) != null && (string = zv1.m7383W0(strOptString).toString()) != null) {
            if (!string.equals(TOQUE_MODO_TAP)) {
                string = null;
            }
            if (string != null) {
                obj = string;
            }
        }
        int iM5140F = obj.equals(TOQUE_MODO_TAP) ? 1 : 80;
        if (jSONObject != null) {
            iM5140F = p32.m5140F(jSONObject.optInt("tapMs", iM5140F), 1, 500);
        }
        int iM5140F2 = jSONObject != null ? p32.m5140F(jSONObject.optInt("contagem", 5), 1, 50) : 5;
        boolean zOptBoolean = jSONObject != null ? jSONObject.optBoolean("repitaAteChave", false) : false;
        FrameLayout frameLayoutObterContainerHud = obterContainerHud();
        if (frameLayoutObterContainerHud == null) {
            return;
        }
        int iDpParaPx3 = dpParaPx(18);
        int i3 = iDpParaPx3 / 2;
        boolean z = zOptBoolean;
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setTag(C0203R.id.tag_hud_tipo, TIPO_TOQUE_REP);
        frameLayout.setTag(C0203R.id.tag_hud_toque_modo, obj);
        frameLayout.setTag(C0203R.id.tag_hud_toque_tap_ms, Integer.valueOf(iM5140F));
        frameLayout.setTag(C0203R.id.tag_hud_toque_rep_count, Integer.valueOf(iM5140F2));
        frameLayout.setTag(C0203R.id.tag_hud_toque_rep_until, Boolean.valueOf(z));
        TextView textView = new TextView(this);
        textView.setGravity(17);
        textView.setTextColor(-1);
        textView.setTypeface(textView.getTypeface(), 1);
        textView.setAlpha(1.0f);
        textView.setClickable(false);
        textView.setFocusable(false);
        aplicarTeclaNoComponente(textView, str);
        textView.setBackgroundResource(C0203R.drawable.bg_tecla_mapeamento);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iDpParaPx, iDpParaPx);
        layoutParams.gravity = 8388691;
        layoutParams.leftMargin = iDpParaPx2;
        layoutParams.topMargin = i3;
        textView.setLayoutParams(layoutParams);
        TextView textView2 = new TextView(this);
        textView2.setText("X");
        textView2.setGravity(17);
        textView2.setTextSize(10.0f);
        textView2.setTextColor(-1);
        textView2.setTypeface(textView2.getTypeface(), 1);
        textView2.setBackgroundResource(C0203R.drawable.bg_btn_excluir_hud);
        textView2.setClickable(true);
        textView2.setFocusable(true);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iDpParaPx3, iDpParaPx3);
        layoutParams2.gravity = 8388661;
        textView2.setLayoutParams(layoutParams2);
        TextView textViewCriarBotaoIconeHud = criarBotaoIconeHud("⚙");
        textViewCriarBotaoIconeHud.setTextSize(11.0f);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(iDpParaPx3, iDpParaPx3);
        layoutParams3.gravity = 8388693;
        textViewCriarBotaoIconeHud.setLayoutParams(layoutParams3);
        TextView textView3 = new TextView(this);
        textView3.setGravity(17);
        textView3.setText(String.valueOf(iM5140F2));
        textView3.setTextSize(11.0f);
        textView3.setTextColor(-1);
        textView3.setTypeface(textView3.getTypeface(), 1);
        textView3.setClickable(true);
        textView3.setFocusable(true);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(iDpParaPx2, iDpParaPx);
        layoutParams4.gravity = 8388691;
        layoutParams4.topMargin = i3;
        textView3.setLayoutParams(layoutParams4);
        frameLayout.addView(textView);
        frameLayout.addView(textView2);
        frameLayout.addView(textViewCriarBotaoIconeHud);
        frameLayout.addView(textView3);
        frameLayout.setLayoutParams(criarParamsPosicionados(iDpParaPx2 + iDpParaPx + i3, iDpParaPx + i3, i, i2));
        textView2.setOnClickListener(new tb0(this, frameLayoutObterContainerHud, frameLayout, 3));
        textViewCriarBotaoIconeHud.setOnClickListener(new ub0(4, frameLayout, this));
        textView3.setOnClickListener(new lc0(0, frameLayout, textView3, this));
        configurarArraste$default(this, frameLayout, frameLayoutObterContainerHud, new View[]{textView2, textViewCriarBotaoIconeHud, textView3}, null, new bc0(this, textView, 2), 8, null);
        frameLayoutObterContainerHud.addView(frameLayout);
    }

    public static /* synthetic */ void criarComponenteToqueRep$default(FloatingService floatingService, int i, int i2, String str, JSONObject jSONObject, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            jSONObject = null;
        }
        floatingService.criarComponenteToqueRep(i, i2, str, jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void criarComponenteToqueRep$lambda$108(FloatingService floatingService, FrameLayout frameLayout, FrameLayout frameLayout2, View view) {
        floatingService.fecharPainelConfigToqueRep();
        frameLayout.removeView(frameLayout2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void criarComponenteToqueRep$lambda$111(FloatingService floatingService, FrameLayout frameLayout, TextView textView, View view) {
        floatingService.mostrarDialogoNumeroComp("Contagem", String.valueOf(floatingService.obterToqueRepContagem(frameLayout)), new rb0(2, frameLayout, textView, floatingService));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 criarComponenteToqueRep$lambda$111$lambda$110(FrameLayout frameLayout, TextView textView, FloatingService floatingService, String str) throws JSONException {
        str.getClass();
        Float fM2862y0 = fw1.m2862y0(str);
        z32 z32Var = z32.f13265a;
        if (fM2862y0 != null) {
            int iM5140F = p32.m5140F((int) fM2862y0.floatValue(), 1, 50);
            frameLayout.setTag(C0203R.id.tag_hud_toque_rep_count, Integer.valueOf(iM5140F));
            textView.setText(String.valueOf(iM5140F));
            floatingService.salvarMapeamentoHud();
        }
        return z32Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 criarComponenteToqueRep$lambda$113(FloatingService floatingService, TextView textView) {
        floatingService.ativarModoEscutaComponente(textView, new pb0(floatingService, textView, 3));
        return z32.f13265a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 criarComponenteToqueRep$lambda$113$lambda$112(FloatingService floatingService, TextView textView, String str) {
        str.getClass();
        floatingService.aplicarTeclaNoComponente(textView, str);
        return z32.f13265a;
    }

    private final boolean criarHudOverlayNoWindowManager() {
        if (this.hudOverlayView != null) {
            return true;
        }
        vincularOverlayAoDisplayAlvo(false);
        WindowManager windowManager = this.windowManager;
        if (windowManager == null) {
            return false;
        }
        Context context = this.overlayContext;
        if (context == null) {
            context = this;
        }
        View viewInflate = LayoutInflater.from(context).inflate(C0203R.layout.layout_hud_overlay, (ViewGroup) null);
        this.hudOverlayView = viewInflate;
        esconderPonteiroSistema(viewInflate);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, 2038, 824, -3);
        layoutParams.gravity = 8388659;
        aplicarOverlayFullscreenCutout(layoutParams);
        this.hudOverlayParams = layoutParams;
        View view = this.hudOverlayView;
        if (view != null) {
            view.setClickable(false);
        }
        configurarControlesHud();
        View view2 = this.hudOverlayView;
        ViewGroup viewGroup = view2 instanceof ViewGroup ? (ViewGroup) view2 : null;
        if (viewGroup != null) {
            garantirCacheViewsOrdemHud(viewGroup);
        }
        try {
            windowManager.addView(this.hudOverlayView, layoutParams);
            this.hudJanelaNoTopo = true;
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            this.hudOverlayView = null;
            this.hudOverlayParams = null;
            limparCacheViewsOrdemHud();
            return false;
        }
    }

    private final View criarLinhaCoresCursor() {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        int iDpParaPx = dpParaPx(10);
        linearLayout.setPadding(iDpParaPx, iDpParaPx, iDpParaPx, iDpParaPx);
        linearLayout.setBackground(fundoArredondado(this.corPainelCard, 12));
        TextView textView = new TextView(this);
        textView.setText("Cor");
        textView.setTextColor(this.corPainelTexto);
        textView.setTextSize(14.0f);
        linearLayout.addView(textView);
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = dpParaPx(8);
        linearLayout2.setLayoutParams(layoutParams);
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<bc1> it = CORES_CURSOR.iterator();
        while (it.hasNext()) {
            final int iIntValue = ((Number) it.next().f1293b).intValue();
            View view = new View(this);
            int iDpParaPx2 = dpParaPx(30);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iDpParaPx2, iDpParaPx2);
            layoutParams2.rightMargin = dpParaPx(8);
            view.setLayoutParams(layoutParams2);
            view.setClickable(true);
            view.setOnClickListener(new View.OnClickListener() { // from class: hc0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    FloatingService.criarLinhaCoresCursor$lambda$338(this.f4522a, iIntValue, linkedHashMap, view2);
                }
            });
            linkedHashMap.put(Integer.valueOf(iIntValue), view);
            linearLayout2.addView(view);
        }
        criarLinhaCoresCursor$atualizarSelecao(linkedHashMap, this);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(this);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.addView(linearLayout2);
        linearLayout.addView(horizontalScrollView);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.bottomMargin = dpParaPx(8);
        linearLayout.setLayoutParams(layoutParams3);
        return linearLayout;
    }

    private static final void criarLinhaCoresCursor$atualizarSelecao(Map<Integer, View> map, FloatingService floatingService) {
        for (Map.Entry<Integer, View> entry : map.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            View value = entry.getValue();
            boolean z = iIntValue == floatingService.corCursor;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(iIntValue);
            gradientDrawable.setStroke(floatingService.dpParaPx(z ? 3 : 1), z ? floatingService.corPainelAccent : 1442840575);
            value.setBackground(gradientDrawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void criarLinhaCoresCursor$lambda$338(FloatingService floatingService, int i, Map map, View view) {
        floatingService.corCursor = i;
        floatingService.aplicarVisualCursor();
        criarLinhaCoresCursor$atualizarSelecao(map, floatingService);
    }

    private final View criarLinhaOpcoesDiscretasConfig(String str, String str2, List<bc1> list, int i, final og0 og0Var) {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        int iDpParaPx = dpParaPx(10);
        linearLayout.setPadding(iDpParaPx, iDpParaPx, iDpParaPx, iDpParaPx);
        linearLayout.setBackground(fundoArredondado(this.corPainelCard, 12));
        TextView textView = new TextView(this);
        textView.setText(str);
        textView.setTextColor(this.corPainelTexto);
        textView.setTextSize(14.0f);
        linearLayout.addView(textView);
        if (str2 != null) {
            TextView textView2 = new TextView(this);
            textView2.setText(str2);
            textView2.setTextColor(this.corPainelTexto2);
            textView2.setTextSize(11.0f);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.topMargin = dpParaPx(4);
            linearLayout.addView(textView2, layoutParams);
        }
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = dpParaPx(8);
        linearLayout2.setLayoutParams(layoutParams2);
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (bc1 bc1Var : list) {
            String str3 = (String) bc1Var.f1292a;
            final int iIntValue = ((Number) bc1Var.f1293b).intValue();
            TextView textView3 = new TextView(this);
            textView3.setText(str3);
            textView3.setTextSize(13.0f);
            textView3.setGravity(17);
            int iDpParaPx2 = dpParaPx(12);
            int iDpParaPx3 = dpParaPx(8);
            textView3.setPadding(iDpParaPx2, iDpParaPx3, iDpParaPx2, iDpParaPx3);
            textView3.setClickable(true);
            textView3.setOnClickListener(new View.OnClickListener() { // from class: ad0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FloatingService.criarLinhaOpcoesDiscretasConfig$lambda$340(og0Var, iIntValue, linkedHashMap, this, view);
                }
            });
            linkedHashMap.put(Integer.valueOf(iIntValue), textView3);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams3.rightMargin = dpParaPx(6);
            linearLayout2.addView(textView3, layoutParams3);
        }
        criarLinhaOpcoesDiscretasConfig$atualizarSelecao$339(linkedHashMap, this, i);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(this);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.addView(linearLayout2);
        linearLayout.addView(horizontalScrollView);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.bottomMargin = dpParaPx(8);
        linearLayout.setLayoutParams(layoutParams4);
        return linearLayout;
    }

    private static final void criarLinhaOpcoesDiscretasConfig$atualizarSelecao$339(Map<Integer, TextView> map, FloatingService floatingService, int i) {
        for (Map.Entry<Integer, TextView> entry : map.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            TextView value = entry.getValue();
            boolean z = iIntValue == i;
            value.setTextColor(z ? -1 : floatingService.corPainelTexto);
            value.setBackground(floatingService.fundoArredondado(z ? floatingService.corPainelAccent : 872415231, 10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void criarLinhaOpcoesDiscretasConfig$lambda$340(og0 og0Var, int i, Map map, FloatingService floatingService, View view) {
        og0Var.invoke(Integer.valueOf(i));
        criarLinhaOpcoesDiscretasConfig$atualizarSelecao$339(map, floatingService, i);
    }

    private final View criarLinhaSliderConfig(String str, float f, final float f2, final float f3, final og0 og0Var, final og0 og0Var2) {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        int iDpParaPx = dpParaPx(10);
        linearLayout.setPadding(iDpParaPx, iDpParaPx, iDpParaPx, iDpParaPx);
        linearLayout.setBackground(fundoArredondado(this.corPainelCard, 12));
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(0);
        TextView textView = new TextView(this);
        textView.setText(str);
        textView.setTextColor(this.corPainelTexto);
        textView.setTextSize(14.0f);
        linearLayout2.addView(textView, new LinearLayout.LayoutParams(0, -2, 1.0f));
        final TextView textView2 = new TextView(this);
        textView2.setText((CharSequence) og0Var.invoke(Float.valueOf(f)));
        textView2.setTextColor(this.corPainelAccent);
        textView2.setTextSize(14.0f);
        textView2.setTypeface(textView2.getTypeface(), 1);
        linearLayout2.addView(textView2);
        linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(-1, -2));
        SeekBar seekBar = new SeekBar(this);
        final int i = 1000;
        seekBar.setMax(1000);
        seekBar.setProgress(p32.m5140F((int) (((f - f2) / (f3 - f2)) * 1000.0f), 0, 1000));
        seekBar.setProgressTintList(ColorStateList.valueOf(this.corPainelAccent));
        seekBar.setThumbTintList(ColorStateList.valueOf(this.corPainelAccent));
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.example.ssmousepro.FloatingService.criarLinhaSliderConfig.1
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar2, int i2, boolean z) {
                float f4 = f2;
                float f5 = ((f3 - f4) * (i2 / i)) + f4;
                textView2.setText((CharSequence) og0Var.invoke(Float.valueOf(f5)));
                if (z) {
                    og0Var2.invoke(Float.valueOf(f5));
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar seekBar2) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar seekBar2) {
            }
        });
        linearLayout.addView(seekBar, new LinearLayout.LayoutParams(-1, -2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = dpParaPx(8);
        linearLayout.setLayoutParams(layoutParams);
        return linearLayout;
    }

    private final View criarLinhaSliderDiscretoConfig(String str, int i, final int i2, int i3, final og0 og0Var, final og0 og0Var2) {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        int iDpParaPx = dpParaPx(10);
        linearLayout.setPadding(iDpParaPx, iDpParaPx, iDpParaPx, iDpParaPx);
        linearLayout.setBackground(fundoArredondado(this.corPainelCard, 12));
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(0);
        TextView textView = new TextView(this);
        textView.setText(str);
        textView.setTextColor(this.corPainelTexto);
        textView.setTextSize(14.0f);
        linearLayout2.addView(textView, new LinearLayout.LayoutParams(0, -2, 1.0f));
        final TextView textView2 = new TextView(this);
        textView2.setText((CharSequence) og0Var.invoke(Integer.valueOf(i)));
        textView2.setTextColor(this.corPainelAccent);
        textView2.setTextSize(14.0f);
        textView2.setTypeface(textView2.getTypeface(), 1);
        linearLayout2.addView(textView2);
        linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(-1, -2));
        SeekBar seekBar = new SeekBar(this);
        seekBar.setMax(i3 - i2);
        seekBar.setProgress(p32.m5140F(i - i2, 0, seekBar.getMax()));
        seekBar.setProgressTintList(ColorStateList.valueOf(this.corPainelAccent));
        seekBar.setThumbTintList(ColorStateList.valueOf(this.corPainelAccent));
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.example.ssmousepro.FloatingService.criarLinhaSliderDiscretoConfig.1
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar2, int i4, boolean z) {
                int i5 = i2 + i4;
                textView2.setText((CharSequence) og0Var.invoke(Integer.valueOf(i5)));
                og0Var2.invoke(Integer.valueOf(i5));
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar seekBar2) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar seekBar2) {
            }
        });
        linearLayout.addView(seekBar, new LinearLayout.LayoutParams(-1, -2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = dpParaPx(8);
        linearLayout.setLayoutParams(layoutParams);
        return linearLayout;
    }

    private final View criarLinhaSwitchAjusteTela(String str, String str2, boolean z, og0 og0Var) {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setBackground(fundoArredondado(this.corPainelCard, 12));
        int iDpParaPx = dpParaPx(14);
        linearLayout.setPadding(iDpParaPx, iDpParaPx, iDpParaPx, iDpParaPx);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = dpParaPx(8);
        linearLayout.setLayoutParams(layoutParams);
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(1);
        TextView textView = new TextView(this);
        textView.setText(str);
        textView.setTextColor(this.corPainelTexto);
        textView.setTextSize(15.0f);
        textView.setTypeface(textView.getTypeface(), 1);
        linearLayout2.addView(textView);
        TextView textView2 = new TextView(this);
        textView2.setText(str2);
        textView2.setTextColor(this.corPainelTexto2);
        textView2.setTextSize(12.0f);
        linearLayout2.addView(textView2);
        linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(0, -2, 1.0f));
        Switch r7 = new Switch(this);
        r7.setChecked(z);
        r7.setOnCheckedChangeListener(new C0720hn(og0Var, 1));
        linearLayout.addView(r7);
        return linearLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void criarLinhaSwitchAjusteTela$lambda$321(og0 og0Var, CompoundButton compoundButton, boolean z) {
        compoundButton.getClass();
        og0Var.invoke(Boolean.valueOf(z));
    }

    private final View.OnKeyListener criarListenerCapturaTeclaHud() {
        return new nc0(this, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean criarListenerCapturaTeclaHud$lambda$286(FloatingService floatingService, View view, int i, KeyEvent keyEvent) {
        String strRotuloMouseDeKeyEvent;
        if (keyEvent.getAction() != 0 || floatingService.escutaConteudo == null) {
            return false;
        }
        int scanCode = keyEvent.getScanCode();
        LinuxKeyCodes linuxKeyCodes = LinuxKeyCodes.INSTANCE;
        if (linuxKeyCodes.ehBotaoMouse(scanCode)) {
            floatingService.finalizarCapturaTecla(linuxKeyCodes.rotuloMouse(scanCode));
            return true;
        }
        if ((keyEvent.isFromSource(8194) || keyEvent.isFromSource(1048584)) && (strRotuloMouseDeKeyEvent = floatingService.rotuloMouseDeKeyEvent(i, scanCode)) != null) {
            floatingService.finalizarCapturaTecla(strRotuloMouseDeKeyEvent);
            return true;
        }
        String strParaRotulo = linuxKeyCodes.paraRotulo(scanCode);
        if (strParaRotulo != null) {
            floatingService.finalizarCapturaTecla(strParaRotulo);
            return true;
        }
        floatingService.finalizarCapturaTecla(floatingService.obterRotuloTecla(i, keyEvent));
        return true;
    }

    private final View.OnKeyListener criarListenerCapturaTeclaHudAnalog() {
        return new nc0(this, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean criarListenerCapturaTeclaHudAnalog$lambda$272(FloatingService floatingService, View view, int i, KeyEvent keyEvent) {
        String strRotuloMouseDeKeyEvent;
        if (keyEvent.getAction() != 0 || floatingService.escutaCampoAnalog == null) {
            return false;
        }
        int scanCode = keyEvent.getScanCode();
        LinuxKeyCodes linuxKeyCodes = LinuxKeyCodes.INSTANCE;
        if (linuxKeyCodes.ehBotaoMouse(scanCode)) {
            floatingService.finalizarCapturaTeclaAnalog(linuxKeyCodes.rotuloMouse(scanCode));
            return true;
        }
        if ((keyEvent.isFromSource(8194) || keyEvent.isFromSource(1048584)) && (strRotuloMouseDeKeyEvent = floatingService.rotuloMouseDeKeyEvent(i, scanCode)) != null) {
            floatingService.finalizarCapturaTeclaAnalog(strRotuloMouseDeKeyEvent);
            return true;
        }
        String strParaRotulo = linuxKeyCodes.paraRotulo(scanCode);
        if (strParaRotulo != null) {
            floatingService.finalizarCapturaTeclaAnalog(strParaRotulo);
            return true;
        }
        floatingService.finalizarCapturaTeclaAnalog(floatingService.obterRotuloTecla(i, keyEvent));
        return true;
    }

    private final View.OnKeyListener criarListenerCapturaTeclaHudFps() {
        return new nc0(this, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean criarListenerCapturaTeclaHudFps$lambda$245(FloatingService floatingService, View view, int i, KeyEvent keyEvent) {
        String strRotuloMouseDeKeyEvent;
        if (keyEvent.getAction() != 0 || floatingService.escutaFpsView == null) {
            return false;
        }
        int scanCode = keyEvent.getScanCode();
        LinuxKeyCodes linuxKeyCodes = LinuxKeyCodes.INSTANCE;
        if (linuxKeyCodes.ehBotaoMouse(scanCode)) {
            floatingService.finalizarCapturaTeclaFps(linuxKeyCodes.rotuloMouse(scanCode));
            return true;
        }
        if ((keyEvent.isFromSource(8194) || keyEvent.isFromSource(1048584)) && (strRotuloMouseDeKeyEvent = floatingService.rotuloMouseDeKeyEvent(i, scanCode)) != null) {
            floatingService.finalizarCapturaTeclaFps(strRotuloMouseDeKeyEvent);
            return true;
        }
        String strParaRotulo = linuxKeyCodes.paraRotulo(scanCode);
        if (strParaRotulo != null) {
            floatingService.finalizarCapturaTeclaFps(strParaRotulo);
            return true;
        }
        floatingService.finalizarCapturaTeclaFps(floatingService.obterRotuloTecla(i, keyEvent));
        return true;
    }

    private final FrameLayout.LayoutParams criarParamsPosicionados(int i, int i2, int i3, int i4) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i2);
        layoutParams.gravity = 8388659;
        layoutParams.leftMargin = i3;
        layoutParams.topMargin = i4;
        return layoutParams;
    }

    private final TextView criarSecaoConfig(String str) {
        TextView textView = new TextView(this);
        String upperCase = str.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        textView.setText(upperCase);
        textView.setTextColor(this.corPainelAccent);
        textView.setTextSize(12.0f);
        textView.setTypeface(textView.getTypeface(), 1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = dpParaPx(12);
        layoutParams.bottomMargin = dpParaPx(4);
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void criarWrapperComponente(String str, int i, int i2, int i3, int i4, og0 og0Var, og0 og0Var2) {
        FrameLayout frameLayoutObterContainerHud = obterContainerHud();
        if (frameLayoutObterContainerHud == null) {
            return;
        }
        int iDpParaPx = dpParaPx(18);
        int i5 = iDpParaPx / 2;
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setTag(C0203R.id.tag_hud_tipo, str);
        TextView textView = new TextView(this);
        textView.setGravity(17);
        textView.setTextColor(-1);
        textView.setTypeface(textView.getTypeface(), 1);
        textView.setAlpha(1.0f);
        textView.setClickable(false);
        textView.setFocusable(false);
        og0Var.invoke(textView);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i2);
        layoutParams.gravity = 8388691;
        layoutParams.leftMargin = 0;
        layoutParams.topMargin = i5;
        textView.setLayoutParams(layoutParams);
        TextView textView2 = new TextView(this);
        textView2.setText("X");
        textView2.setGravity(17);
        textView2.setTextSize(10.0f);
        textView2.setTextColor(-1);
        textView2.setTypeface(textView2.getTypeface(), 1);
        textView2.setBackgroundResource(C0203R.drawable.bg_btn_excluir_hud);
        textView2.setClickable(true);
        textView2.setFocusable(true);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iDpParaPx, iDpParaPx);
        layoutParams2.gravity = 8388661;
        textView2.setLayoutParams(layoutParams2);
        frameLayout.addView(textView);
        frameLayout.addView(textView2);
        frameLayout.setLayoutParams(criarParamsPosicionados(i + i5, i2 + i5, i3, i4));
        textView2.setOnClickListener(new ob0(1, frameLayoutObterContainerHud, frameLayout));
        configurarArraste$default(this, frameLayout, frameLayoutObterContainerHud, new View[]{textView2}, null, new dc0(0, og0Var2, textView), 8, null);
        frameLayoutObterContainerHud.addView(frameLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 criarWrapperComponente$lambda$159(og0 og0Var, TextView textView) {
        if (og0Var != null) {
            og0Var.invoke(textView);
        }
        return z32.f13265a;
    }

    private final int cursorPontaXpx() {
        return (int) ((dpParaPx(5) * this.tamanhoCursorDp) / 28.0f);
    }

    private final int cursorPontaYpx() {
        return (int) ((dpParaPx(5) * this.tamanhoCursorDp) / 28.0f);
    }

    private final int cursorTamanhoPx() {
        return dpParaPx(this.tamanhoCursorDp);
    }

    private final void definirDpiDesejada(int i) {
        this.dpiDesejada = p32.m5140F(i, 120, DPI_MAX);
        getSharedPreferences("SSMousePrefs", 0).edit().putInt(KEY_DPI_DESEJADA, this.dpiDesejada).apply();
        this.overrideDpiAtivo = false;
        this.dpiAplicada = 0;
        BuildersKt__Builders_commonKt.launch$default(this.serviceScope, Dispatchers.getIO(), null, new C01591(null), 2, null);
    }

    private final void definirPosicaoCursorAbsoluta(int i, int i2) {
        View view;
        ImageView imageView;
        if ((!this.hudEmModoJogo && !this.hudEmModoEdicao) || (view = this.hudOverlayView) == null || (imageView = (ImageView) view.findViewById(C0203R.id.cursorVirtualMao)) == null) {
            return;
        }
        int iCursorTamanhoPx = cursorTamanhoPx();
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            layoutParams2 = new FrameLayout.LayoutParams(iCursorTamanhoPx, iCursorTamanhoPx);
        }
        layoutParams2.width = iCursorTamanhoPx;
        layoutParams2.height = iCursorTamanhoPx;
        layoutParams2.gravity = 8388659;
        layoutParams2.leftMargin = i;
        layoutParams2.topMargin = i2;
        imageView.setLayoutParams(layoutParams2);
        View view2 = this.hudOverlayView;
        if (view2 != null) {
            view2.requestLayout();
        }
        if (i < 0 || i2 < 0) {
            return;
        }
        this.cursorMaoMargemX = i;
        this.cursorMaoMargemY = i2;
    }

    private final void definirResolucaoDesejada(int i, int i2) {
        this.resDesejadaW = Math.max(i, i2);
        this.resDesejadaH = Math.min(i, i2);
        getSharedPreferences("SSMousePrefs", 0).edit().putInt(KEY_RES_DESEJADA_W, this.resDesejadaW).putInt(KEY_RES_DESEJADA_H, this.resDesejadaH).apply();
        this.overrideResAtivo = false;
        this.resAplicadaW = 0;
        this.resAplicadaH = 0;
        BuildersKt__Builders_commonKt.launch$default(this.serviceScope, Dispatchers.getIO(), null, new C01601(null), 2, null);
    }

    private final void desativarEntradaEdicaoHud() {
        limparEstadoTouchEdicao();
        new Thread(new RunnableC1059l5(3)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void desativarEntradaEdicaoHud$lambda$35() {
        InjectionDaemonManager.INSTANCE.enqueueComando("EDITAR_HUD 0");
    }

    private final void desativarTecladoNoDaemon(boolean z) {
        InjectionDaemonManager injectionDaemonManager = InjectionDaemonManager.INSTANCE;
        injectionDaemonManager.enqueueComando("NAV_LOCK 0");
        injectionDaemonManager.enqueueComando(InjectionProtocol.INPUT_STOP);
    }

    public static /* synthetic */ void desativarTecladoNoDaemon$default(FloatingService floatingService, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        floatingService.desativarTecladoNoDaemon(z);
    }

    private final void descartarAlteracoesHudNaoSalvas() {
        limparComponentesHud();
        carregarMapeamentoHudSalvo();
    }

    private final boolean deveMostrarOverlay(String str, String str2) {
        if (str2 == null || zv1.m7371K0(str2)) {
            return this.bolinhaVisivel;
        }
        ForegroundAppDetector foregroundAppDetector = ForegroundAppDetector.INSTANCE;
        if (!foregroundAppDetector.ehHomeOuRecentes(str2)) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
            if (!str2.equalsIgnoreCase(getPackageName()) && !hw1.m3309D0(str2, "com.android.systemui", false) && ((foregroundAppDetector.emDesktopSamsung(this) || foregroundAppDetector.ehShellDesktopOuDex(str2)) && foregroundAppDetector.jogoAindaVisivel(this, str))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bc1 dimensaoTelaParaMapeamento() {
        FrameLayout frameLayoutObterContainerHud = obterContainerHud();
        if (frameLayoutObterContainerHud != null && frameLayoutObterContainerHud.getWidth() > 0 && frameLayoutObterContainerHud.getHeight() > 0) {
            return new bc1(Integer.valueOf(frameLayoutObterContainerHud.getWidth()), Integer.valueOf(frameLayoutObterContainerHud.getHeight()));
        }
        bc1 bc1VarObterTamanhoRealTela = obterTamanhoRealTela();
        int iIntValue = ((Number) bc1VarObterTamanhoRealTela.f1292a).intValue();
        int iIntValue2 = ((Number) bc1VarObterTamanhoRealTela.f1293b).intValue();
        if (iIntValue > 0 && iIntValue2 > 0) {
            return new bc1(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
        }
        int i = this.resDesejadaW;
        return (i <= 0 || this.resDesejadaH <= 0) ? new bc1(0, 0) : new bc1(Integer.valueOf(i), Integer.valueOf(this.resDesejadaH));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public final int dpParaPx(int i) {
        Context context = this.overlayContext;
        Object r1 = this;
        if (context != null) {
            r1 = context;
        }
        return (int) (i * r1.getResources().getDisplayMetrics().density);
    }

    private final void encerrarMapeadorCompleto(boolean z) {
        WindowManager windowManager;
        if (z) {
            this.matarAposEncerrar = true;
        }
        if (this.encerramentoDisparado) {
            return;
        }
        this.encerramentoDisparado = true;
        isRunning = false;
        try {
            unregisterComponentCallbacks(this.configCallback);
        } catch (Exception unused) {
        }
        Runnable runnable = this.monitorRunnable;
        if (runnable != null) {
            Handler handler = this.handlerMonitor;
            if (runnable == null) {
                hp0.m3207Q("monitorRunnable");
                throw null;
            }
            handler.removeCallbacks(runnable);
        }
        removerListenerDisplays();
        this.overrideResAtivo = false;
        this.overrideDpiAtivo = false;
        this.resAplicadaW = 0;
        this.resAplicadaH = 0;
        this.dpiAplicada = 0;
        InjectionDaemonManager injectionDaemonManager = InjectionDaemonManager.INSTANCE;
        injectionDaemonManager.removerListenerMira();
        injectionDaemonManager.removerModoMao();
        removerListenerPerifericosHotplug();
        sairModoEscuta();
        fecharHudOverlay();
        removerMenuView();
        this.hudEmModoEdicao = false;
        this.hudEmModoJogo = false;
        this.bolinhaVisivel = false;
        this.estaRecolhida = false;
        View view = this.floatingView;
        if (view != null && (windowManager = this.windowManager) != null) {
            if (windowManager != null) {
                try {
                    windowManager.removeView(view);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            this.floatingView = null;
        }
        BuildersKt__Builders_commonKt.launch$default(this.serviceScope, Dispatchers.getIO(), null, new C01612(null), 2, null);
    }

    public static /* synthetic */ void encerrarMapeadorCompleto$default(FloatingService floatingService, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        floatingService.encerrarMapeadorCompleto(z);
    }

    private final void entrarModoEdicaoHud() {
        View viewFindViewById;
        this.hudEmModoJogo = false;
        this.hudEmModoEdicao = true;
        this.fpsModoAtivo = false;
        View view = this.hudOverlayView;
        if (view != null && (viewFindViewById = view.findViewById(C0203R.id.painelSuperiorHud)) != null) {
            viewFindViewById.setVisibility(0);
        }
        FrameLayout frameLayoutObterContainerHud = obterContainerHud();
        if (frameLayoutObterContainerHud != null) {
            frameLayoutObterContainerHud.setVisibility(0);
        }
        View view2 = this.menuView;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        atualizarFlagsRaizHud(false);
        aplicarModoEdicao();
        ativarCursorVirtualEdicao();
        atualizarVisibilidadeGraficoMira();
        atualizarOrdemPaineisHud();
    }

    private final void entrarModoJogoHud(boolean z) throws JSONException {
        View viewFindViewById;
        if (this.hudOverlayView == null) {
            return;
        }
        desativarEntradaEdicaoHud();
        sairModoEscuta();
        recolherBandeja();
        carregarPreferenciasHud();
        carregarSensibilidadeSalva();
        esconderPonteiroSistema(this.hudOverlayView);
        View view = this.hudOverlayView;
        if (view != null && (viewFindViewById = view.findViewById(C0203R.id.painelSuperiorHud)) != null) {
            viewFindViewById.setVisibility(8);
        }
        this.hudEmModoJogo = true;
        this.hudEmModoEdicao = false;
        aplicarModoJogo();
        View view2 = this.floatingView;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        this.bolinhaVisivel = true;
        atualizarFlagsRaizHud(true);
        if (z) {
            ativarTecladoNoDaemon$default(this, false, 1, null);
        }
        registrarListenerPerifericosHotplug();
        mostrarCursorVirtualMaoCentro();
        atualizarVisibilidadeGraficoMira();
        FrameLayout frameLayoutObterContainerHud = obterContainerHud();
        if (frameLayoutObterContainerHud != null) {
            frameLayoutObterContainerHud.getChildCount();
        }
    }

    public static /* synthetic */ void entrarModoJogoHud$default(FloatingService floatingService, boolean z, int i, Object obj) throws JSONException {
        if ((i & 1) != 0) {
            z = true;
        }
        floatingService.entrarModoJogoHud(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:105:0x0472  */
    /* JADX WARN: Code duplicated, block: B:109:0x0481  */
    /* JADX WARN: Code duplicated, block: B:384:0x0cfe  */
    /* JADX WARN: Code duplicated, block: B:49:0x0227  */
    /* JADX WARN: Code duplicated, block: B:52:0x0240  */
    /* JADX WARN: Code duplicated, block: B:55:0x024c  */
    /* JADX WARN: Code duplicated, block: B:58:0x026e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:121:0x04c7, B:124:0x04d5], limit reached: 429 */
    /* JADX WARN: Path cross not found for [B:58:0x026e, B:59:0x0270], limit reached: 429 */
    /* JADX WARN: Path cross not found for [B:64:0x02d1, B:67:0x02f8], limit reached: 429 */
    /* JADX WARN: Type inference failed for: r12v115 */
    /* JADX WARN: Type inference failed for: r12v116 */
    /* JADX WARN: Type inference failed for: r12v117 */
    /* JADX WARN: Type inference failed for: r12v118 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v41 */
    /* JADX WARN: Type inference failed for: r12v44 */
    /* JADX WARN: Type inference failed for: r14v15, types: [int] */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v33 */
    /* JADX WARN: Type inference failed for: r14v36 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v48 */
    /* JADX WARN: Type inference failed for: r15v50 */
    /* JADX WARN: Type inference failed for: r15v58 */
    /* JADX WARN: Type inference failed for: r15v75 */
    /* JADX WARN: Type inference failed for: r15v79 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v62 */
    /* JADX WARN: Type inference failed for: r7v7, types: [int] */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object enviarBindingsDoJson(java.lang.String r63, int r64, int r65, p000.InterfaceC0579du r66) {
        /*
            Method dump skipped, instruction units count: 3360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ssmousepro.FloatingService.enviarBindingsDoJson(java.lang.String, int, int, du):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object enviarComandoInjecaoAwait(String str, InterfaceC0579du interfaceC0579du) {
        return InjectionDaemonManager.INSTANCE.enviarComando(str, interfaceC0579du);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void enviarSincronizacaoDesacelFps() {
        Iterator<T> it = FpsDesacelSincronizador.INSTANCE.comandosSincronizar(getResources()).iterator();
        while (it.hasNext()) {
            InjectionDaemonManager.INSTANCE.enqueueComando((String) it.next());
        }
    }

    private final bc1 escalarCoordHud(int i, int i2, int i3, int i4, int i5, int i6) {
        boolean z = i3 > 0 && i4 > 0;
        boolean z2 = z && i3 == i5 && i4 == i6;
        boolean z3 = z && (i > i3 + 2 || i2 > i4 + 2);
        if (z && !z2 && !z3) {
            i = (int) ((i * i5) / i3);
        }
        if (z && !z2 && !z3) {
            i2 = (int) ((i2 * i6) / i4);
        }
        return new bc1(Integer.valueOf(p32.m5140F(i, 0, Math.max(0, i5 - 1))), Integer.valueOf(p32.m5140F(i2, 0, Math.max(0, i6 - 1))));
    }

    private final void esconderPonteiroSistema(View view) {
        if (view == null) {
            return;
        }
        try {
            view.setPointerIcon(PointerIcon.getSystemIcon(this, 0));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread executorDebugExterior$lambda$1(Runnable runnable) {
        Thread thread = new Thread(runnable, "FpsExteriorDebug");
        thread.setDaemon(true);
        return thread;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread executorMonitorMapeador$lambda$5(Runnable runnable) {
        Thread thread = new Thread(runnable, "MapperMonitor");
        thread.setDaemon(true);
        return thread;
    }

    private final void exibirBolinhaFlutuante() {
        vincularOverlayAoDisplayAlvo(false);
        Context context = this.overlayContext;
        if (context == null) {
            context = this;
        }
        View viewInflate = LayoutInflater.from(context).inflate(C0203R.layout.layout_floating_widget, (ViewGroup) null);
        this.floatingView = viewInflate;
        esconderPonteiroSistema(viewInflate);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 2038, 808, -3);
        layoutParams.gravity = 8388659;
        layoutParams.x = 100;
        layoutParams.y = 200;
        View view = this.floatingView;
        View viewFindViewById = view != null ? view.findViewById(C0203R.id.imgBolinhaFlutuante) : null;
        if (viewFindViewById != null) {
            viewFindViewById.setOnTouchListener(new View.OnTouchListener() { // from class: com.example.ssmousepro.FloatingService.exibirBolinhaFlutuante.1
                private long clickStartTime;
                private float initialTouchX;
                private float initialTouchY;
                private int initialX;
                private int initialY;
                private boolean mudouEstadoNoDown;
                private final int MAX_CLICK_DURATION = 200;
                private final int MAX_CLICK_DISTANCE = 10;

                /* JADX WARN: Code duplicated, block: B:42:0x00d8  */
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view2, MotionEvent motionEvent) {
                    view2.getClass();
                    motionEvent.getClass();
                    View view3 = FloatingService.this.floatingView;
                    ViewGroup.LayoutParams layoutParams2 = view3 != null ? view3.getLayoutParams() : null;
                    WindowManager.LayoutParams layoutParams3 = layoutParams2 instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams2 : null;
                    if (layoutParams3 == null) {
                        return false;
                    }
                    int i = FloatingService.this.getResources().getDisplayMetrics().widthPixels;
                    int i2 = FloatingService.this.getResources().getDisplayMetrics().heightPixels;
                    View view4 = FloatingService.this.floatingView;
                    int width = view4 != null ? view4.getWidth() : 0;
                    View view5 = FloatingService.this.floatingView;
                    int height = view5 != null ? view5.getHeight() : 0;
                    int action = motionEvent.getAction();
                    if (action == 0) {
                        this.clickStartTime = System.currentTimeMillis();
                        this.mudouEstadoNoDown = false;
                        if (FloatingService.this.estaRecolhida) {
                            FloatingService.this.estaRecolhida = false;
                            this.mudouEstadoNoDown = true;
                            View view6 = FloatingService.this.floatingView;
                            if (view6 != null) {
                                view6.setAlpha(FloatingService.this.opacidadeBolinha);
                            }
                            if (layoutParams3.y < 0) {
                                layoutParams3.y = 0;
                            }
                            int i3 = layoutParams3.x;
                            if (i3 < 0) {
                                layoutParams3.x = 0;
                            } else if (i3 + width > i) {
                                layoutParams3.x = i - width;
                            }
                            WindowManager windowManager = FloatingService.this.windowManager;
                            if (windowManager != null) {
                                windowManager.updateViewLayout(FloatingService.this.floatingView, layoutParams3);
                            }
                        }
                        this.initialX = layoutParams3.x;
                        this.initialY = layoutParams3.y;
                        this.initialTouchX = motionEvent.getRawX();
                        this.initialTouchY = motionEvent.getRawY();
                        return true;
                    }
                    if (action != 1) {
                        if (action == 2) {
                            int rawX = this.initialX + ((int) (motionEvent.getRawX() - this.initialTouchX));
                            int rawY = this.initialY + ((int) (motionEvent.getRawY() - this.initialTouchY));
                            layoutParams3.x = p32.m5140F(rawX, 0, i - width);
                            layoutParams3.y = p32.m5140F(rawY, 0, i2 - height);
                            WindowManager windowManager2 = FloatingService.this.windowManager;
                            if (windowManager2 != null) {
                                windowManager2.updateViewLayout(FloatingService.this.floatingView, layoutParams3);
                            }
                            return true;
                        }
                        if (action != 3) {
                            return false;
                        }
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.clickStartTime;
                    float fAbs = Math.abs(motionEvent.getRawX() - this.initialTouchX);
                    float fAbs2 = Math.abs(motionEvent.getRawY() - this.initialTouchY);
                    if (jCurrentTimeMillis < this.MAX_CLICK_DURATION) {
                        int i4 = this.MAX_CLICK_DISTANCE;
                        if (fAbs >= i4 || fAbs2 >= i4) {
                            FloatingService.this.animarBolinhaInteligente(layoutParams3, true);
                        } else {
                            boolean z = this.mudouEstadoNoDown;
                            FloatingService floatingService = FloatingService.this;
                            if (z) {
                                floatingService.animarBolinhaInteligente(layoutParams3, false);
                            } else {
                                floatingService.alternarMenuConfiguracoes();
                            }
                        }
                    } else {
                        FloatingService.this.animarBolinhaInteligente(layoutParams3, true);
                    }
                    return true;
                }
            });
        }
        WindowManager windowManager = this.windowManager;
        if (windowManager != null) {
            windowManager.addView(this.floatingView, layoutParams);
        }
    }

    private final void exibirHudAoRetornarAoJogo() throws JSONException {
        if (this.hudOverlayView == null || !this.hudEmModoJogo) {
            return;
        }
        carregarPreferenciasHud();
        aplicarModoJogo();
        View view = this.hudOverlayView;
        if (view != null) {
            view.setVisibility(0);
        }
        ativarTecladoNoDaemon$default(this, false, 1, null);
    }

    private final void fecharHudOverlay() {
        WindowManager windowManager;
        limparComponentesHud();
        this.hudEmModoJogo = false;
        View view = this.hudOverlayView;
        if (view == null || (windowManager = this.windowManager) == null) {
            return;
        }
        if (windowManager != null) {
            try {
                windowManager.removeView(view);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.hudOverlayView = null;
        this.hudOverlayParams = null;
        limparCacheViewsOrdemHud();
    }

    private final void fecharMenuApenas() {
        removerMenuView();
        View view = this.floatingView;
        if (view != null) {
            view.setVisibility(0);
        }
        this.bolinhaVisivel = true;
    }

    private final void fecharMenuConfiguracoes() {
        fecharMenuApenas();
    }

    private final void fecharPainelConfigAnalogico() {
        View viewFindViewById;
        View view = this.hudOverlayView;
        if (view != null && (viewFindViewById = view.findViewById(C0203R.id.panelConfigAnalogico)) != null) {
            viewFindViewById.setVisibility(8);
        }
        this.analogWrapperEmEdicao = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fecharPainelConfigFps() {
        View viewFindViewById;
        View view = this.hudOverlayView;
        if (view != null && (viewFindViewById = view.findViewById(C0203R.id.panelConfigFps)) != null) {
            viewFindViewById.setVisibility(8);
        }
        this.fpsWrapperEmEdicao = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fecharPainelConfigToque() {
        View viewFindViewById;
        View view = this.hudOverlayView;
        if (view != null && (viewFindViewById = view.findViewById(C0203R.id.panelConfigToque)) != null) {
            viewFindViewById.setVisibility(8);
        }
        this.toqueWrapperEmEdicao = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fecharPainelConfigToqueRep() {
        View viewFindViewById;
        View view = this.hudOverlayView;
        if (view != null && (viewFindViewById = view.findViewById(C0203R.id.panelConfigToqueRep)) != null) {
            viewFindViewById.setVisibility(8);
        }
        this.toqueRepWrapperEmEdicao = null;
        this.toqueRepAvancadoVisivel = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fecharPainelConfiguracoes() {
        salvarConfigInterface();
        WindowManager windowManager = this.windowManager;
        View view = this.configPanelView;
        if (view != null && windowManager != null) {
            try {
                windowManager.removeView(view);
            } catch (Exception unused) {
            }
        }
        this.configPanelView = null;
        this.configTituloView = null;
        this.configConteudoView = null;
    }

    private final void finalizarCapturaTecla(String str) {
        og0 og0Var = this.escutaAoCapturar;
        if (og0Var != null) {
            og0Var.invoke(str);
        }
        sairModoEscuta();
    }

    private final void finalizarCapturaTeclaAnalog(String str) {
        og0 og0Var = this.escutaAnalogAoCapturar;
        if (og0Var != null) {
            og0Var.invoke(str);
        }
        sairModoEscuta();
    }

    private final void finalizarCapturaTeclaFps(String str) {
        og0 og0Var = this.escutaFpsAoCapturar;
        if (og0Var != null) {
            og0Var.invoke(str);
        }
        sairModoEscuta();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:52:0x00d4 A[Catch: all -> 0x0116, TryCatch #2 {all -> 0x0116, blocks: (B:56:0x00f3, B:50:0x00cc, B:52:0x00d4, B:46:0x00ab), top: B:77:0x00ab }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:59:0x0113  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0134, code lost:
    
        if (r0.executar("wm reset", r6) == r7) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object forcarResetDisplayEstiloGg(p000.InterfaceC0579du r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ssmousepro.FloatingService.forcarResetDisplayEstiloGg(du):java.lang.Object");
    }

    private final String formatarSensFpsUi(float f) {
        return String.format(Locale.US, "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
    }

    private final String formatarSensibilidade(float f) {
        return String.format("%.1fx", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
    }

    private final GradientDrawable fundoArredondado(int i, int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(dpParaPx(i2));
        gradientDrawable.setColor(i);
        return gradientDrawable;
    }

    private final void garantirCacheViewsOrdemHud(ViewGroup viewGroup) {
        if (this.hudOrdemCacheRoot == viewGroup) {
            return;
        }
        this.hudPainelSuperior = viewGroup.findViewById(C0203R.id.painelSuperiorHud);
        this.hudPanelConfigAnalogico = viewGroup.findViewById(C0203R.id.panelConfigAnalogico);
        this.hudPanelConfigFps = viewGroup.findViewById(C0203R.id.panelConfigFps);
        this.hudPanelConfigToque = viewGroup.findViewById(C0203R.id.panelConfigToque);
        this.hudPanelConfigToqueRep = viewGroup.findViewById(C0203R.id.panelConfigToqueRep);
        this.hudPainelExteriorCurva = viewGroup.findViewById(C0203R.id.painelExteriorCurva);
        this.hudCursorVirtualMao = viewGroup.findViewById(C0203R.id.cursorVirtualMao);
        this.hudOrdemCacheRoot = viewGroup;
    }

    private final void garantirHudOverlayEmModoJogo(boolean z) throws JSONException {
        if (this.hudOverlayView == null) {
            if (!criarHudOverlayNoWindowManager()) {
                return;
            }
            carregarPreferenciasHud();
            carregarMapeamentoHudSalvo();
        }
        entrarModoJogoHud(z);
    }

    public static /* synthetic */ void garantirHudOverlayEmModoJogo$default(FloatingService floatingService, boolean z, int i, Object obj) throws JSONException {
        if ((i & 1) != 0) {
            z = true;
        }
        floatingService.garantirHudOverlayEmModoJogo(z);
    }

    private final void habilitarCapturaTecladoNoHud(boolean z) {
        WindowManager windowManager;
        View view;
        WindowManager.LayoutParams layoutParams = this.hudOverlayParams;
        if (layoutParams == null || (windowManager = this.windowManager) == null || (view = this.hudOverlayView) == null) {
            return;
        }
        if (!z) {
            atualizarFlagsRaizHud(this.hudEmModoJogo);
            view.clearFocus();
            return;
        }
        layoutParams.flags = 800;
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        try {
            windowManager.updateViewLayout(view, layoutParams);
            view.requestFocus();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private final String hintAntiBlock(FpsAntiBlockModo fpsAntiBlockModo) {
        int i = WhenMappings.$EnumSwitchMapping$1[fpsAntiBlockModo.ordinal()];
        if (i == 1) {
            return "Sem Anti-Block: aguarda 1º movimento; sem reordenar.";
        }
        if (i == 2) {
            return "No 1º movimento: solta o lado direito, planta a mira e reaplica o clique.";
        }
        if (i == 3) {
            return "Planta a mira na hora do F1 (não espera movimento).";
        }
        if (i == 4) {
            return "Oficial: planta no F1 + se atirar antes, a mira entra primeiro.";
        }
        C0694gy.m3076b();
        return null;
    }

    private final void iniciarCanalInjecao() {
        if (PrivilegeGate.INSTANCE.estaProntoParaInjecao(this)) {
            InjectionDaemonManager injectionDaemonManager = InjectionDaemonManager.INSTANCE;
            String packageName = getPackageName();
            packageName.getClass();
            injectionDaemonManager.vincularDaemon(packageName);
            aguardarCanalInjecao(0);
        }
    }

    private final void iniciarCapturaFisicaDaemon() {
        new Thread(new RunnableC1059l5(4)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void iniciarCapturaFisicaDaemon$lambda$283() {
        InjectionDaemonManager injectionDaemonManager = InjectionDaemonManager.INSTANCE;
        if (injectionDaemonManager.isDaemonVinculado()) {
            injectionDaemonManager.enqueueComando(InjectionProtocol.INPUT_ENSURE);
            injectionDaemonManager.enqueueComando("CAPTURA_FISICA 1");
        }
    }

    private final void iniciarDebugExteriorFps() {
        if (precisaDebugExteriorCurva()) {
            this.handlerMonitor.removeCallbacks(this.atualizarDebugExteriorFps);
            this.handlerMonitor.post(this.atualizarDebugExteriorFps);
        }
    }

    private final void iniciarMonitorMapeador() {
        if (precisaMonitorMapeador()) {
            this.handlerMonitor.removeCallbacks(this.atualizarMonitorMapeador);
            this.handlerMonitor.post(this.atualizarMonitorMapeador);
        }
    }

    private final void iniciarMonitoramentoDeTela() {
        Runnable runnable = this.monitorRunnable;
        if (runnable != null) {
            this.handlerMonitor.removeCallbacks(runnable);
        }
        hb0 hb0Var = new hb0(this, 11);
        this.monitorRunnable = hb0Var;
        this.handlerMonitor.post(hb0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void iniciarMonitoramentoDeTela$lambda$346(FloatingService floatingService) {
        String str = floatingService.pacoteDoJogo;
        if (str == null) {
            return;
        }
        new Thread(new RunnableC1467u4(13, floatingService, str)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void iniciarMonitoramentoDeTela$lambda$346$lambda$345(final FloatingService floatingService, String str) {
        final boolean z = floatingService.ajusteTelaAuto && (floatingService.overrideResAtivo || floatingService.overrideDpiAtivo);
        final String strObterFocoParaResetTela = z ? ForegroundAppDetector.INSTANCE.obterFocoParaResetTela(floatingService) : ForegroundAppDetector.INSTANCE.obterPacoteEmPrimeiroPlano(floatingService);
        final boolean zDeveMostrarOverlay = floatingService.deveMostrarOverlay(str, strObterFocoParaResetTela);
        floatingService.handlerMonitor.post(new Runnable() { // from class: tc0
            @Override // java.lang.Runnable
            public final void run() throws JSONException {
                FloatingService.iniciarMonitoramentoDeTela$lambda$346$lambda$345$lambda$344(z, strObterFocoParaResetTela, floatingService, zDeveMostrarOverlay);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void iniciarMonitoramentoDeTela$lambda$346$lambda$345$lambda$344(boolean z, String str, FloatingService floatingService, boolean z2) throws JSONException {
        if (z && ForegroundAppDetector.INSTANCE.ehHomeOuRecentes(str)) {
            BuildersKt__Builders_commonKt.launch$default(floatingService.serviceScope, Dispatchers.getIO(), null, new FloatingService$iniciarMonitoramentoDeTela$1$1$1$1(floatingService, str, null), 2, null);
        }
        if (z2) {
            floatingService.contadorForaDoJogo = 0;
            boolean z3 = floatingService.estavaNoJogo;
            floatingService.estavaNoJogo = true;
            PlayTimeSessionManager.INSTANCE.tick(1000L);
            if (!floatingService.bolinhaVisivel) {
                floatingService.bolinhaVisivel = true;
                View view = floatingService.floatingView;
                if (view != null) {
                    view.setVisibility(0);
                }
                if (floatingService.hudEmModoJogo) {
                    floatingService.exibirHudAoRetornarAoJogo();
                }
            }
            boolean z4 = SystemClock.uptimeMillis() < floatingService.bloqueioReaplicarAjusteAteMs;
            boolean z5 = !z4 && floatingService.ajusteTelaAuto && !z3 && (floatingService.resDesejadaW > 0 || floatingService.dpiDesejada > 0);
            boolean z6 = !z4 && floatingService.ajusteTelaUmaVez && ((floatingService.resDesejadaW > 0 && !floatingService.overrideResAtivo) || (floatingService.dpiDesejada > 0 && !floatingService.overrideDpiAtivo));
            if (z5 || z6) {
                BuildersKt__Builders_commonKt.launch$default(floatingService.serviceScope, Dispatchers.getIO(), null, new FloatingService$iniciarMonitoramentoDeTela$1$1$1$2(floatingService, null), 2, null);
            }
            if (!floatingService.hudEmModoEdicao && !floatingService.hudEmModoJogo) {
                floatingService.garantirHudOverlayEmModoJogo((z5 || z6) ? false : true);
            }
            floatingService.verificarSaudeCanalInjecao();
        } else {
            if (floatingService.estavaNoJogo) {
                PlayTimeSessionManager.INSTANCE.pausarESincronizar();
                floatingService.estavaNoJogo = false;
            }
            if (!floatingService.hudEmModoEdicao) {
                int i = floatingService.contadorForaDoJogo + 1;
                floatingService.contadorForaDoJogo = i;
                if (i >= 1 && floatingService.bolinhaVisivel) {
                    floatingService.bolinhaVisivel = false;
                    floatingService.removerMenuView();
                    View view2 = floatingService.floatingView;
                    if (view2 != null) {
                        view2.setVisibility(8);
                    }
                    floatingService.ocultarHudParaForaDoJogo();
                }
            }
        }
        Handler handler = floatingService.handlerMonitor;
        Runnable runnable = floatingService.monitorRunnable;
        if (runnable != null) {
            handler.postDelayed(runnable, 1000L);
        } else {
            hp0.m3207Q("monitorRunnable");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean jogoAlvoEmPrimeiroPlano(String str) {
        ForegroundAppDetector foregroundAppDetector = ForegroundAppDetector.INSTANCE;
        String strObterPacoteEmPrimeiroPlano = foregroundAppDetector.obterPacoteEmPrimeiroPlano(this);
        if (strObterPacoteEmPrimeiroPlano != null) {
            if (strObterPacoteEmPrimeiroPlano.equalsIgnoreCase(str)) {
                return true;
            }
            if (hw1.m3309D0(strObterPacoteEmPrimeiroPlano, "com.android.systemui", false)) {
                return this.estavaNoJogo;
            }
            if ((foregroundAppDetector.emDesktopSamsung(this) || foregroundAppDetector.ehShellDesktopOuDex(strObterPacoteEmPrimeiroPlano)) && foregroundAppDetector.jogoAindaVisivel(this, str)) {
                return true;
            }
        }
        return false;
    }

    private final void limparCacheViewsOrdemHud() {
        this.hudOrdemCacheRoot = null;
        this.hudPainelSuperior = null;
        this.hudPanelConfigAnalogico = null;
        this.hudPanelConfigFps = null;
        this.hudPanelConfigToque = null;
        this.hudPanelConfigToqueRep = null;
        this.hudPainelExteriorCurva = null;
        this.hudCursorVirtualMao = null;
        this.hudJanelaNoTopo = false;
    }

    private final void limparComponentesHud() {
        FrameLayout frameLayout;
        sairModoEscuta();
        recolherBandeja();
        View view = this.hudOverlayView;
        if (view == null || (frameLayout = (FrameLayout) view.findViewById(C0203R.id.hudTeclasContainer)) == null) {
            return;
        }
        frameLayout.removeAllViews();
    }

    private final void limparDpiDesejada() {
        this.dpiDesejada = 0;
        getSharedPreferences("SSMousePrefs", 0).edit().remove(KEY_DPI_DESEJADA).apply();
        this.overrideDpiAtivo = false;
        this.dpiAplicada = 0;
        BuildersKt__Builders_commonKt.launch$default(this.serviceScope, Dispatchers.getIO(), null, new C01651(null), 2, null);
    }

    private final void limparEstadoTouchEdicao() {
        this.editMousePressionado = false;
        this.editTouchDownTime = 0L;
    }

    private final void limparResolucaoDesejada() {
        this.resDesejadaW = 0;
        this.resDesejadaH = 0;
        getSharedPreferences("SSMousePrefs", 0).edit().remove(KEY_RES_DESEJADA_W).remove(KEY_RES_DESEJADA_H).apply();
        this.overrideResAtivo = false;
        this.resAplicadaW = 0;
        this.resAplicadaH = 0;
        BuildersKt__Builders_commonKt.launch$default(this.serviceScope, Dispatchers.getIO(), null, new C01661(null), 2, null);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final bc1 margensWrapperParaCentro(String str, int i, int i2, Integer num) {
        switch (str.hashCode()) {
            case 69833:
                if (str.equals(TIPO_FPS)) {
                    int iDpParaPx = dpParaPx(24);
                    return new bc1(Integer.valueOf(i - ((dpParaPx(136) + iDpParaPx) / 2)), Integer.valueOf(i2 - ((dpParaPx(72) + iDpParaPx) / 2)));
                }
                break;
            case 80009798:
                if (str.equals(TIPO_TOQUE)) {
                    int iIntValue = (num != null ? num.intValue() : dpParaPx(45)) / 2;
                    return new bc1(Integer.valueOf(i - iIntValue), Integer.valueOf((i2 - (dpParaPx(18) / 2)) - iIntValue));
                }
                break;
            case 114209540:
                if (str.equals(TIPO_TOQUE_REP)) {
                    int iIntValue2 = (num != null ? num.intValue() : dpParaPx(45)) / 2;
                    return new bc1(Integer.valueOf((i - dpParaPx(28)) - iIntValue2), Integer.valueOf((i2 - (dpParaPx(18) / 2)) - iIntValue2));
                }
                break;
            case 1083955077:
                if (str.equals(TIPO_ANALOGICO)) {
                    int iIntValue3 = num != null ? num.intValue() : dpParaPx(120);
                    int iDpParaPx2 = ((dpParaPx(4) * 2) + (iIntValue3 + dpParaPx(28))) / 2;
                    return new bc1(Integer.valueOf(i - iDpParaPx2), Integer.valueOf(i2 - iDpParaPx2));
                }
                break;
        }
        return new bc1(Integer.valueOf(i), Integer.valueOf(i2));
    }

    private final boolean migrarSensXUiRefV2SePreciso(JSONArray jSONArray) throws JSONException {
        SharedPreferences sharedPreferences = getSharedPreferences("SSMousePrefs", 0);
        if (sharedPreferences.getBoolean(KEY_SENS_X_UI_REF_V2, false)) {
            return false;
        }
        int length = jSONArray.length();
        boolean z = false;
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null && hp0.m3214e(jSONObjectOptJSONObject.optString("tipo"), TIPO_FPS) && jSONObjectOptJSONObject.has("sensX")) {
                double dOptDouble = jSONObjectOptJSONObject.optDouble("sensX", 1.0d);
                double dM5138D = p32.m5138D(dOptDouble / 2.0d, 0.10000000149011612d, 20.0d);
                if (Math.abs(dM5138D - dOptDouble) > 1.0E-4d) {
                    jSONObjectOptJSONObject.put("sensX", dM5138D);
                    z = true;
                }
            }
        }
        sharedPreferences.edit().putBoolean(KEY_SENS_X_UI_REF_V2, true).apply();
        return z;
    }

    private final boolean migrarSensXyPadraoV3SePreciso(JSONArray jSONArray) throws JSONException {
        SharedPreferences sharedPreferences = getSharedPreferences("SSMousePrefs", 0);
        if (sharedPreferences.getBoolean(KEY_SENS_XY_PADRAO_V3, false)) {
            return false;
        }
        int length = jSONArray.length();
        boolean z = false;
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null && hp0.m3214e(jSONObjectOptJSONObject.optString("tipo"), TIPO_FPS)) {
                double dOptDouble = jSONObjectOptJSONObject.optDouble("sensX", 1.0d);
                double dOptDouble2 = jSONObjectOptJSONObject.optDouble("sensY", 0.5d);
                if (Math.abs(dOptDouble - 0.5d) < 0.01d && Math.abs(dOptDouble2 - 1.0d) < 0.01d) {
                    jSONObjectOptJSONObject.put("sensX", 1.0d);
                    jSONObjectOptJSONObject.put("sensY", 0.5d);
                    z = true;
                }
            }
        }
        sharedPreferences.edit().putBoolean(KEY_SENS_XY_PADRAO_V3, true).apply();
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void minimizarMenuPrincipal() throws JSONException {
        garantirHudOverlayEmModoJogo$default(this, false, 1, null);
        View view = this.hudOverlayView;
        if (view != null) {
            view.setVisibility(0);
        }
        fecharMenuApenas();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v30, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r10v39 */
    /* JADX WARN: Type inference failed for: r10v40 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [android.widget.FrameLayout$LayoutParams] */
    /* JADX WARN: Type inference failed for: r11v36 */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v10 */
    /* JADX WARN: Type inference failed for: r22v11 */
    /* JADX WARN: Type inference failed for: r22v12 */
    /* JADX WARN: Type inference failed for: r22v13 */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r22v4 */
    /* JADX WARN: Type inference failed for: r22v5 */
    /* JADX WARN: Type inference failed for: r22v6 */
    /* JADX WARN: Type inference failed for: r22v7 */
    /* JADX WARN: Type inference failed for: r22v8 */
    /* JADX WARN: Type inference failed for: r22v9 */
    /* JADX WARN: Type inference failed for: r2v2, types: [org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r2v22, types: [org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Integer] */
    private final JSONArray montarJsonHudAtual() throws JSONException {
        Object r3;
        Object r11;
        FrameLayout frameLayout;
        Object r22;
        int i;
        int i2;
        int i3;
        int i4;
        Object r23;
        Object r10;
        Object r24;
        String str;
        Object r25;
        Object r2;
        Object r12;
        int iIntValue;
        Integer num;
        FrameLayout.LayoutParams layoutParams;
        FrameLayout frameLayoutObterContainerHud = obterContainerHud();
        FrameLayout frameLayout2 = null;
        if (frameLayoutObterContainerHud == null || frameLayoutObterContainerHud.getChildCount() == 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        bc1 bc1VarObterDimensaoTelaAtual = obterDimensaoTelaAtual();
        int iIntValue2 = ((Number) bc1VarObterDimensaoTelaAtual.f1292a).intValue();
        int iIntValue3 = ((Number) bc1VarObterDimensaoTelaAtual.f1293b).intValue();
        int childCount = frameLayoutObterContainerHud.getChildCount();
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = frameLayoutObterContainerHud.getChildAt(i5);
            FrameLayout frameLayout3 = childAt instanceof FrameLayout ? (FrameLayout) childAt : frameLayout2;
            if (frameLayout3 == null) {
                r3 = jSONArray;
                r3 = jSONArray;
                r3 = jSONArray;
                r3 = jSONArray;
                r11 = layoutParams;
                r3 = jSONArray;
                r11 = layoutParams;
                r3 = jSONArray;
                r3 = jSONArray;
                r2 = r3;
                i = iIntValue3;
                i2 = iIntValue2;
                i3 = childCount;
                i4 = i5;
            } else {
                r3 = jSONArray;
                Object tag = frameLayout3.getTag(C0203R.id.tag_hud_tipo);
                String str2 = tag instanceof String ? (String) tag : frameLayout2;
                if (str2 == null) {
                    r3 = jSONArray;
                    r3 = jSONArray;
                    r3 = jSONArray;
                    r3 = jSONArray;
                    r11 = layoutParams;
                    r3 = jSONArray;
                    r11 = layoutParams;
                    r3 = jSONArray;
                    r3 = jSONArray;
                    r2 = r3;
                    i = iIntValue3;
                    i2 = iIntValue2;
                    i3 = childCount;
                    i4 = i5;
                } else {
                    r3 = jSONArray;
                    ViewGroup.LayoutParams layoutParams2 = frameLayout3.getLayoutParams();
                    if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                        layoutParams = (FrameLayout.LayoutParams) layoutParams2;
                    } else {
                        r11 = frameLayout2;
                    }
                    if (r11 == 0) {
                        r3 = jSONArray;
                        r3 = jSONArray;
                        r3 = jSONArray;
                        r3 = jSONArray;
                        r11 = layoutParams;
                        r3 = jSONArray;
                        r11 = layoutParams;
                        r3 = jSONArray;
                        r3 = jSONArray;
                        r2 = r3;
                        i = iIntValue3;
                        i2 = iIntValue2;
                        i3 = childCount;
                        i4 = i5;
                    } else {
                        r3 = jSONArray;
                        View viewObterViewConteudoWrapper = obterViewConteudoWrapper(frameLayout3);
                        if (viewObterViewConteudoWrapper == null) {
                            r3 = jSONArray;
                            r3 = jSONArray;
                            r3 = jSONArray;
                            r3 = jSONArray;
                            r11 = layoutParams;
                            r3 = jSONArray;
                            r11 = layoutParams;
                            r3 = jSONArray;
                            r3 = jSONArray;
                            r2 = r3;
                            i = iIntValue3;
                            i2 = iIntValue2;
                            i3 = childCount;
                            i4 = i5;
                        } else {
                            Object jSONObject = new JSONObject();
                            jSONObject.put("tipo", str2);
                            jSONObject.put("x", ((FrameLayout.LayoutParams) r11).leftMargin);
                            jSONObject.put("y", ((FrameLayout.LayoutParams) r11).topMargin);
                            jSONObject.put("refW", iIntValue2);
                            jSONObject.put("refH", iIntValue3);
                            if (str2.equals(TIPO_ANALOGICO)) {
                                jSONObject.put("teclaW", obterTeclaAnalogTag(frameLayout3, C0203R.id.tag_hud_analog_tecla_w, "W"));
                                jSONObject.put("teclaS", obterTeclaAnalogTag(frameLayout3, C0203R.id.tag_hud_analog_tecla_s, "S"));
                                jSONObject.put("teclaA", obterTeclaAnalogTag(frameLayout3, C0203R.id.tag_hud_analog_tecla_a, "A"));
                                jSONObject.put("teclaD", obterTeclaAnalogTag(frameLayout3, C0203R.id.tag_hud_analog_tecla_d, "D"));
                                Object tag2 = frameLayout3.getTag(C0203R.id.tag_hud_analog_rapidez);
                                if (tag2 instanceof Integer) {
                                    num = (Integer) tag2;
                                } else {
                                    r12 = frameLayout2;
                                }
                                if (r12 != 0) {
                                    r3 = jSONArray;
                                    r11 = layoutParams;
                                    r3 = jSONArray;
                                    r11 = layoutParams;
                                    r12 = num;
                                    iIntValue = r12.intValue();
                                } else {
                                    r3 = jSONArray;
                                    r11 = layoutParams;
                                    r3 = jSONArray;
                                    r11 = layoutParams;
                                    r12 = num;
                                    iIntValue = 200;
                                }
                                jSONObject.put("rapidez", iIntValue);
                                jSONObject.put("mostrarTeclas", obterMostrarTeclasAnalog(frameLayout3));
                                Integer numValueOf = Integer.valueOf(viewObterViewConteudoWrapper.getWidth());
                                int iIntValue4 = numValueOf.intValue();
                                Object r9 = numValueOf;
                                if (iIntValue4 <= 0) {
                                    r9 = frameLayout2;
                                }
                                jSONObject.put("tamanho", r9 != 0 ? r9.intValue() : viewObterViewConteudoWrapper.getLayoutParams().width);
                                r25 = r3;
                                i = iIntValue3;
                                i2 = iIntValue2;
                                i3 = childCount;
                                i4 = i5;
                            } else {
                                if (str2.equals(TIPO_FPS)) {
                                    jSONObject.put("tecla", obterTeclaSalvaFps(frameLayout3));
                                    Object tag3 = frameLayout3.getTag(C0203R.id.tag_hud_tecla);
                                    if (tag3 instanceof String) {
                                        str = (String) tag3;
                                    } else {
                                        r10 = frameLayout2;
                                    }
                                    if (r10 != 0) {
                                        r3 = jSONArray;
                                        r11 = layoutParams;
                                        if (!zv1.m7371K0(r10)) {
                                            r3 = jSONArray;
                                            r11 = layoutParams;
                                            r10 = str;
                                            jSONObject.put("teclaTag", r10);
                                        }
                                    }
                                    r3 = jSONArray;
                                    r11 = layoutParams;
                                    r3 = jSONArray;
                                    r11 = layoutParams;
                                    r10 = str;
                                    r3 = jSONArray;
                                    r11 = layoutParams;
                                    r10 = str;
                                    String strObterTeclaSuspenderFps = obterTeclaSuspenderFps(frameLayout3);
                                    if (strObterTeclaSuspenderFps != null && !zv1.m7371K0(strObterTeclaSuspenderFps)) {
                                        jSONObject.put("teclaSuspender", strObterTeclaSuspenderFps);
                                        jSONObject.put("teclaSuspenderTag", strObterTeclaSuspenderFps);
                                    }
                                    jSONObject.put("sensX", Float.valueOf(obterSensFpsX(frameLayout3)));
                                    jSONObject.put("sensY", Float.valueOf(obterSensFpsY(frameLayout3)));
                                    DevToolsGate devToolsGate = DevToolsGate.INSTANCE;
                                    if (devToolsGate.getLiberado()) {
                                        jSONObject.put("antiBlock", obterAntiBlockFps(frameLayout3).getId());
                                    } else {
                                        jSONObject.put("antiBlock", FpsAntiBlockModo.Companion.getOFICIAL().getId());
                                    }
                                    i = iIntValue3;
                                    i2 = iIntValue2;
                                    i3 = childCount;
                                    i4 = i5;
                                    r24 = r3;
                                    if (devToolsGate.getLiberado()) {
                                        frameLayout = frameLayoutObterContainerHud;
                                        jSONObject.put("acelLimiarAtivo", obterAcelLimiarAtivo(frameLayout3));
                                        jSONObject.put("acelLimiarLimX", obterAcelLimiarLimX(frameLayout3));
                                        jSONObject.put("acelLimiarGainX", obterAcelLimiarGainX(frameLayout3));
                                        jSONObject.put("acelLimiarLimY", obterAcelLimiarLimY(frameLayout3));
                                        jSONObject.put("acelLimiarGainY", obterAcelLimiarGainY(frameLayout3));
                                        String strObterAcelLimiarTecla = obterAcelLimiarTecla(frameLayout3);
                                        if (strObterAcelLimiarTecla != null && !zv1.m7371K0(strObterAcelLimiarTecla)) {
                                            jSONObject.put("acelLimiarTecla", strObterAcelLimiarTecla);
                                        }
                                        jSONObject.put("lowSpeedAtivoX", obterLowSpeedAtivoX(frameLayout3));
                                        jSONObject.put("lowSpeedLimX", obterLowSpeedLimX(frameLayout3));
                                        jSONObject.put("lowSpeedFatorX", obterLowSpeedFatorX(frameLayout3));
                                        String strObterLowSpeedTeclaX = obterLowSpeedTeclaX(frameLayout3);
                                        if (strObterLowSpeedTeclaX != null && !zv1.m7371K0(strObterLowSpeedTeclaX)) {
                                            jSONObject.put("lowSpeedTeclaX", strObterLowSpeedTeclaX);
                                        }
                                        jSONObject.put("lowSpeedAtivoY", obterLowSpeedAtivoY(frameLayout3));
                                        jSONObject.put("lowSpeedLimY", obterLowSpeedLimY(frameLayout3));
                                        jSONObject.put("lowSpeedFatorY", obterLowSpeedFatorY(frameLayout3));
                                        String strObterLowSpeedTeclaY = obterLowSpeedTeclaY(frameLayout3);
                                        r23 = r24;
                                        if (strObterLowSpeedTeclaY != null && !zv1.m7371K0(strObterLowSpeedTeclaY)) {
                                            r23 = r24;
                                            jSONObject.put("lowSpeedTeclaY", strObterLowSpeedTeclaY);
                                            r23 = r24;
                                        }
                                    } else {
                                        frameLayout = frameLayoutObterContainerHud;
                                        jSONObject.put("acelLimiarAtivo", false);
                                        jSONObject.put("acelLimiarLimX", 8);
                                        jSONObject.put("acelLimiarGainX", 150);
                                        jSONObject.put("acelLimiarLimY", 8);
                                        jSONObject.put("acelLimiarGainY", 150);
                                        jSONObject.put("lowSpeedAtivoX", true);
                                        jSONObject.put("lowSpeedLimX", 30);
                                        jSONObject.put("lowSpeedFatorX", 60);
                                        jSONObject.put("lowSpeedAtivoY", false);
                                        jSONObject.put("lowSpeedLimY", 0);
                                        jSONObject.put("lowSpeedFatorY", 60);
                                        r23 = r24;
                                    }
                                } else {
                                    frameLayout = frameLayoutObterContainerHud;
                                    r22 = r3;
                                    i = iIntValue3;
                                    i2 = iIntValue2;
                                    i3 = childCount;
                                    i4 = i5;
                                    TextView textView = (TextView) viewObterViewConteudoWrapper;
                                    jSONObject.put("tecla", obterTeclaSalva(textView, str2));
                                    Object tag4 = textView.getTag(C0203R.id.tag_hud_tecla);
                                    String str3 = tag4 instanceof String ? (String) tag4 : null;
                                    if (str3 != null) {
                                        r3 = jSONArray;
                                        r11 = layoutParams;
                                        if (!zv1.m7371K0(str3)) {
                                            r3 = jSONArray;
                                            r11 = layoutParams;
                                            jSONObject.put("teclaTag", str3);
                                        }
                                    }
                                    r3 = jSONArray;
                                    r11 = layoutParams;
                                    r3 = jSONArray;
                                    r11 = layoutParams;
                                    r3 = jSONArray;
                                    r11 = layoutParams;
                                    if (str2.equals(TIPO_TOQUE)) {
                                        String strObterToqueInterrompe = obterToqueInterrompe(frameLayout3);
                                        if (strObterToqueInterrompe != null && !zv1.m7371K0(strObterToqueInterrompe)) {
                                            jSONObject.put("interrompeTecla", strObterToqueInterrompe);
                                        }
                                        jSONObject.put("modoToque", obterToqueModo(frameLayout3));
                                        r23 = r22;
                                        if (hp0.m3214e(obterToqueModo(frameLayout3), TOQUE_MODO_TAP)) {
                                            jSONObject.put("tapMs", obterToqueTapMs(frameLayout3));
                                            r23 = r22;
                                        }
                                    } else if (str2.equals(TIPO_TOQUE_REP)) {
                                        r23 = r22;
                                        jSONObject.put("modoToque", obterToqueModo(frameLayout3));
                                        jSONObject.put("tapMs", obterToqueTapMs(frameLayout3));
                                        jSONObject.put("contagem", obterToqueRepContagem(frameLayout3));
                                        jSONObject.put("repitaAteChave", obterToqueRepAteChave(frameLayout3));
                                        r23 = r22;
                                    }
                                }
                                r23 = r22;
                                r23 = r24;
                                frameLayoutObterContainerHud = frameLayout;
                                r25 = r23;
                            }
                            bc1 bc1VarCentroConteudoNoContainer = centroConteudoNoContainer(viewObterViewConteudoWrapper, frameLayoutObterContainerHud);
                            int iIntValue5 = ((Number) bc1VarCentroConteudoNoContainer.f1292a).intValue();
                            int iIntValue6 = ((Number) bc1VarCentroConteudoNoContainer.f1293b).intValue();
                            int width = viewObterViewConteudoWrapper.getWidth() > 0 ? viewObterViewConteudoWrapper.getWidth() : viewObterViewConteudoWrapper.getLayoutParams().width;
                            int height = viewObterViewConteudoWrapper.getHeight() > 0 ? viewObterViewConteudoWrapper.getHeight() : viewObterViewConteudoWrapper.getLayoutParams().height;
                            jSONObject.put("centroX", iIntValue5);
                            jSONObject.put("centroY", iIntValue6);
                            jSONObject.put("raio", Math.min(width, height) / 2);
                            r2 = r25;
                            r2.put(jSONObject);
                        }
                    }
                }
            }
            i5 = i4 + 1;
            r3 = r2;
            iIntValue3 = i;
            iIntValue2 = i2;
            childCount = i3;
            frameLayout2 = null;
        }
        r3 = jSONArray;
        return r3;
    }

    private final void mostrarConfigInterfaces() {
        LinearLayout linearLayout = this.configConteudoView;
        if (linearLayout == null) {
            return;
        }
        TextView textView = this.configTituloView;
        if (textView != null) {
            textView.setText("Interfaces");
        }
        linearLayout.removeAllViews();
        final int i = 3;
        linearLayout.addView(criarBotaoVoltarConfig(new cc0(this, i)));
        linearLayout.addView(criarSecaoConfig("Cursor"));
        final int i2 = 4;
        final int i3 = 0;
        linearLayout.addView(criarLinhaSliderConfig("Tamanho", this.tamanhoCursorDp, 16.0f, 64.0f, new C1284p6(i2), new og0(this) { // from class: fc0

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ FloatingService f3749b;

            {
                this.f3749b = this;
            }

            @Override // p000.og0
            public final Object invoke(Object obj) {
                int i4 = i3;
                FloatingService floatingService = this.f3749b;
                switch (i4) {
                    case 0:
                        return FloatingService.mostrarConfigInterfaces$lambda$306(floatingService, ((Float) obj).floatValue());
                    case 1:
                        return FloatingService.mostrarConfigInterfaces$lambda$308(floatingService, ((Integer) obj).intValue());
                    case 2:
                        return FloatingService.mostrarConfigInterfaces$lambda$309(floatingService, ((Integer) obj).intValue());
                    case 3:
                        return FloatingService.mostrarConfigInterfaces$lambda$311(floatingService, ((Float) obj).floatValue());
                    default:
                        return FloatingService.mostrarConfigInterfaces$lambda$313(floatingService, ((Float) obj).floatValue());
                }
            }
        }));
        final int i4 = 1;
        linearLayout.addView(criarLinhaSliderDiscretoConfig("Velocidade", this.nivelVelocidadeCursor, 1, 14, new C1284p6(5), new og0(this) { // from class: fc0

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ FloatingService f3749b;

            {
                this.f3749b = this;
            }

            @Override // p000.og0
            public final Object invoke(Object obj) {
                int i5 = i4;
                FloatingService floatingService = this.f3749b;
                switch (i5) {
                    case 0:
                        return FloatingService.mostrarConfigInterfaces$lambda$306(floatingService, ((Float) obj).floatValue());
                    case 1:
                        return FloatingService.mostrarConfigInterfaces$lambda$308(floatingService, ((Integer) obj).intValue());
                    case 2:
                        return FloatingService.mostrarConfigInterfaces$lambda$309(floatingService, ((Integer) obj).intValue());
                    case 3:
                        return FloatingService.mostrarConfigInterfaces$lambda$311(floatingService, ((Float) obj).floatValue());
                    default:
                        return FloatingService.mostrarConfigInterfaces$lambda$313(floatingService, ((Float) obj).floatValue());
                }
            }
        }));
        linearLayout.addView(criarLinhaCoresCursor());
        linearLayout.addView(criarSecaoConfig("Mouse"));
        List<bc1> list = MOUSE_POLL_OPCOES;
        int i5 = this.mousePollHz;
        final int i6 = 2;
        linearLayout.addView(criarLinhaOpcoesDiscretasConfig("Polling rate", "Nativo = taxa máxima do hardware (ex. 2000–4000 Hz). 125/500/1000 limitam só a injeção no jogo.", list, i5, new og0(this) { // from class: fc0

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ FloatingService f3749b;

            {
                this.f3749b = this;
            }

            @Override // p000.og0
            public final Object invoke(Object obj) {
                int i7 = i6;
                FloatingService floatingService = this.f3749b;
                switch (i7) {
                    case 0:
                        return FloatingService.mostrarConfigInterfaces$lambda$306(floatingService, ((Float) obj).floatValue());
                    case 1:
                        return FloatingService.mostrarConfigInterfaces$lambda$308(floatingService, ((Integer) obj).intValue());
                    case 2:
                        return FloatingService.mostrarConfigInterfaces$lambda$309(floatingService, ((Integer) obj).intValue());
                    case 3:
                        return FloatingService.mostrarConfigInterfaces$lambda$311(floatingService, ((Float) obj).floatValue());
                    default:
                        return FloatingService.mostrarConfigInterfaces$lambda$313(floatingService, ((Float) obj).floatValue());
                }
            }
        }));
        linearLayout.addView(criarSecaoConfig("Botão flutuante"));
        linearLayout.addView(criarLinhaSliderConfig("Tamanho", this.tamanhoBolinhaDp, 40.0f, 110.0f, new C1284p6(6), new og0(this) { // from class: fc0

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ FloatingService f3749b;

            {
                this.f3749b = this;
            }

            @Override // p000.og0
            public final Object invoke(Object obj) {
                int i7 = i;
                FloatingService floatingService = this.f3749b;
                switch (i7) {
                    case 0:
                        return FloatingService.mostrarConfigInterfaces$lambda$306(floatingService, ((Float) obj).floatValue());
                    case 1:
                        return FloatingService.mostrarConfigInterfaces$lambda$308(floatingService, ((Integer) obj).intValue());
                    case 2:
                        return FloatingService.mostrarConfigInterfaces$lambda$309(floatingService, ((Integer) obj).intValue());
                    case 3:
                        return FloatingService.mostrarConfigInterfaces$lambda$311(floatingService, ((Float) obj).floatValue());
                    default:
                        return FloatingService.mostrarConfigInterfaces$lambda$313(floatingService, ((Float) obj).floatValue());
                }
            }
        }));
        linearLayout.addView(criarLinhaSliderConfig("Opacidade", this.opacidadeBolinha, BALL_OPACITY_MIN, 1.0f, new C1284p6(7), new og0(this) { // from class: fc0

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ FloatingService f3749b;

            {
                this.f3749b = this;
            }

            @Override // p000.og0
            public final Object invoke(Object obj) {
                int i7 = i2;
                FloatingService floatingService = this.f3749b;
                switch (i7) {
                    case 0:
                        return FloatingService.mostrarConfigInterfaces$lambda$306(floatingService, ((Float) obj).floatValue());
                    case 1:
                        return FloatingService.mostrarConfigInterfaces$lambda$308(floatingService, ((Integer) obj).intValue());
                    case 2:
                        return FloatingService.mostrarConfigInterfaces$lambda$309(floatingService, ((Integer) obj).intValue());
                    case 3:
                        return FloatingService.mostrarConfigInterfaces$lambda$311(floatingService, ((Float) obj).floatValue());
                    default:
                        return FloatingService.mostrarConfigInterfaces$lambda$313(floatingService, ((Float) obj).floatValue());
                }
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 mostrarConfigInterfaces$lambda$304(FloatingService floatingService) {
        floatingService.mostrarMenuConfigPrincipal();
        return z32.f13265a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String mostrarConfigInterfaces$lambda$305(float f) {
        return ((int) f) + " dp";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 mostrarConfigInterfaces$lambda$306(FloatingService floatingService, float f) {
        floatingService.tamanhoCursorDp = p32.m5140F((int) f, 16, 64);
        floatingService.aplicarVisualCursor();
        return z32.f13265a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String mostrarConfigInterfaces$lambda$307(int i) {
        return jd0.m3609g(i, "Nível ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 mostrarConfigInterfaces$lambda$308(FloatingService floatingService, int i) {
        floatingService.nivelVelocidadeCursor = p32.m5140F(i, 1, 14);
        floatingService.aplicarVelocidadePonteiroSistema();
        return z32.f13265a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 mostrarConfigInterfaces$lambda$309(FloatingService floatingService, int i) {
        floatingService.mousePollHz = floatingService.normalizarMousePollHz(i);
        floatingService.aplicarMousePollingRate();
        return z32.f13265a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String mostrarConfigInterfaces$lambda$310(float f) {
        return ((int) f) + " dp";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 mostrarConfigInterfaces$lambda$311(FloatingService floatingService, float f) {
        floatingService.tamanhoBolinhaDp = p32.m5140F((int) f, 40, BALL_SIZE_MAX);
        floatingService.aplicarVisualBolinha();
        return z32.f13265a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String mostrarConfigInterfaces$lambda$312(float f) {
        return ((int) (f * 100.0f)) + "%";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 mostrarConfigInterfaces$lambda$313(FloatingService floatingService, float f) {
        floatingService.opacidadeBolinha = p32.m5139E(f, BALL_OPACITY_MIN, 1.0f);
        floatingService.aplicarVisualBolinha();
        return z32.f13265a;
    }

    private final void mostrarConfigMonitor() {
        LinearLayout linearLayout = this.configConteudoView;
        if (linearLayout == null) {
            return;
        }
        TextView textView = this.configTituloView;
        if (textView != null) {
            textView.setText("Monitor");
        }
        linearLayout.removeAllViews();
        linearLayout.addView(criarBotaoVoltarConfig(new cc0(this, 4)));
        TextView textView2 = new TextView(this);
        textView2.setText("Mostra no canto (modo jogo) taxas de mouse, coalesce, falhas de inject, latência de clique e alertas. Atualiza ~7×/s sem pesar a mira.");
        textView2.setTextColor(this.corPainelTexto2);
        textView2.setTextSize(12.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = dpParaPx(12);
        linearLayout.addView(textView2, layoutParams);
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.setBackground(fundoArredondado(this.corPainelCard, 12));
        int iDpParaPx = dpParaPx(14);
        linearLayout2.setPadding(iDpParaPx, iDpParaPx, iDpParaPx, iDpParaPx);
        LinearLayout linearLayout3 = new LinearLayout(this);
        linearLayout3.setOrientation(1);
        TextView textView3 = new TextView(this);
        textView3.setText("Monitor do mapeador");
        textView3.setTextColor(this.corPainelTexto);
        textView3.setTextSize(15.0f);
        textView3.setTypeface(textView3.getTypeface(), 1);
        linearLayout3.addView(textView3);
        TextView textView4 = new TextView(this);
        textView4.setText("Overlay no jogo com métricas ao vivo");
        textView4.setTextColor(this.corPainelTexto2);
        textView4.setTextSize(12.0f);
        linearLayout3.addView(textView4);
        linearLayout2.addView(linearLayout3, new LinearLayout.LayoutParams(0, -2, 1.0f));
        Switch r2 = new Switch(this);
        r2.setChecked(this.monitorMapeadorAtivo);
        r2.setOnCheckedChangeListener(new ic0(this, 1));
        linearLayout2.addView(r2);
        linearLayout.addView(linearLayout2);
        LinearLayout linearLayout4 = new LinearLayout(this);
        linearLayout4.setOrientation(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = dpParaPx(10);
        View viewCriarBotaoNavConfig = criarBotaoNavConfig("Todas", "Mostrar todas as métricas", new cc0(this, 5));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams3.setMarginEnd(dpParaPx(6));
        linearLayout4.addView(viewCriarBotaoNavConfig, layoutParams3);
        linearLayout4.addView(criarBotaoNavConfig("Essenciais", "poll, in/out, fail, clique…", new cc0(this, 6)), new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout.addView(linearLayout4, layoutParams2);
        TextView textView5 = new TextView(this);
        textView5.setText("Métricas no overlay (ALERTA sempre aparece)");
        textView5.setTextColor(this.corPainelTexto);
        textView5.setTextSize(13.0f);
        textView5.setTypeface(textView5.getTypeface(), 1);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = dpParaPx(14);
        layoutParams4.bottomMargin = dpParaPx(6);
        linearLayout.addView(textView5, layoutParams4);
        LinearLayout linearLayout5 = new LinearLayout(this);
        linearLayout5.setOrientation(1);
        linearLayout5.setBackground(fundoArredondado(this.corPainelCard, 12));
        int i = iDpParaPx / 2;
        linearLayout5.setPadding(iDpParaPx, i, iDpParaPx, i);
        for (PipelineMonitorText.Campo campo : PipelineMonitorText.INSTANCE.getCAMPOS()) {
            CheckBox checkBox = new CheckBox(this);
            checkBox.setText(campo.getRotulo());
            checkBox.setTextColor(this.corPainelTexto);
            checkBox.setTextSize(13.0f);
            checkBox.setChecked(this.monitorCamposVisiveis.contains(campo.getId()));
            checkBox.setOnCheckedChangeListener(new jb0(this, campo));
            linearLayout5.addView(checkBox);
        }
        linearLayout.addView(linearLayout5);
        TextView textView6 = new TextView(this);
        textView6.setText("Fonte 8sp no overlay para caber tudo. Marque só o que precisa se ainda ficar apertado. Título e ALERTA sempre aparecem (ALERTA cobre problemas das linhas ocultas).\n\nAtalhos: Todas · Essenciais (poll, in/out, coalesce, fail, clique, toques, aimLoop).");
        textView6.setTextColor(this.corPainelTexto2);
        textView6.setTextSize(11.0f);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams5.topMargin = dpParaPx(14);
        linearLayout.addView(textView6, layoutParams5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 mostrarConfigMonitor$lambda$298(FloatingService floatingService) {
        floatingService.mostrarMenuConfigPrincipal();
        return z32.f13265a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mostrarConfigMonitor$lambda$299(FloatingService floatingService, CompoundButton compoundButton, boolean z) {
        compoundButton.getClass();
        floatingService.monitorMapeadorAtivo = z;
        floatingService.salvarConfigInterface();
        floatingService.sincronizarMonitorMapeador();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 mostrarConfigMonitor$lambda$300(FloatingService floatingService) {
        floatingService.monitorCamposVisiveis = AbstractC1377rp.m5868C0(PipelineMonitorText.INSTANCE.getIDS_TODOS());
        floatingService.salvarConfigInterface();
        floatingService.mostrarConfigMonitor();
        return z32.f13265a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 mostrarConfigMonitor$lambda$302(FloatingService floatingService) {
        floatingService.monitorCamposVisiveis = AbstractC1377rp.m5868C0(PipelineMonitorText.INSTANCE.getIDS_ESSENCIAIS());
        floatingService.salvarConfigInterface();
        floatingService.mostrarConfigMonitor();
        return z32.f13265a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mostrarConfigMonitor$lambda$303(FloatingService floatingService, PipelineMonitorText.Campo campo, CompoundButton compoundButton, boolean z) {
        compoundButton.getClass();
        if (z) {
            floatingService.monitorCamposVisiveis.add(campo.getId());
        } else {
            floatingService.monitorCamposVisiveis.remove(campo.getId());
            if (floatingService.monitorCamposVisiveis.isEmpty()) {
                floatingService.monitorCamposVisiveis.addAll(PipelineMonitorText.INSTANCE.getIDS_ESSENCIAIS());
                floatingService.salvarConfigInterface();
                floatingService.mostrarConfigMonitor();
                return;
            }
        }
        floatingService.salvarConfigInterface();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void mostrarConfigResolucoes() {
        String str;
        LinearLayout linearLayout = this.configConteudoView;
        if (linearLayout == null) {
            return;
        }
        TextView textView = this.configTituloView;
        if (textView != null) {
            textView.setText("Ajuste de tela");
        }
        linearLayout.removeAllViews();
        linearLayout.addView(criarBotaoVoltarConfig(new cc0(this, 8)));
        int i = getResources().getDisplayMetrics().densityDpi;
        int i2 = this.resNativaW;
        if (i2 > 0) {
            str = i2 + "x" + this.resNativaH;
        } else {
            str = "?";
        }
        TextView textView2 = new TextView(this);
        textView2.setText("Nativa: " + str + "  •  DPI físico: " + i + "\nDigite o tamanho/DPI e ligue um dos modos abaixo.");
        textView2.setTextColor(this.corPainelTexto2);
        textView2.setTextSize(12.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = dpParaPx(10);
        linearLayout.addView(textView2, layoutParams);
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(1);
        int iDpParaPx = dpParaPx(12);
        linearLayout2.setPadding(iDpParaPx, iDpParaPx, iDpParaPx, iDpParaPx);
        linearLayout2.setBackground(fundoArredondado(this.corPainelCard, 12));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.bottomMargin = dpParaPx(8);
        linearLayout2.setLayoutParams(layoutParams2);
        TextView textView3 = new TextView(this);
        textView3.setText("Tamanho da tela");
        textView3.setTextColor(this.corPainelTexto);
        textView3.setTextSize(14.0f);
        linearLayout2.addView(textView3);
        LinearLayout linearLayout3 = new LinearLayout(this);
        linearLayout3.setOrientation(0);
        linearLayout3.setGravity(16);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = dpParaPx(6);
        linearLayout3.setLayoutParams(layoutParams3);
        EditText editTextCriarCampoNumeroConfig = criarCampoNumeroConfig("Largura");
        EditText editTextCriarCampoNumeroConfig2 = criarCampoNumeroConfig("Altura");
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = this.resDesejadaW;
        if (iMax <= 0 && (iMax = this.resNativaW) <= 0) {
            iMax = Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        int iMin = this.resDesejadaH;
        if (iMin <= 0 && (iMin = this.resNativaH) <= 0) {
            iMin = Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        editTextCriarCampoNumeroConfig.setText(String.valueOf(iMax));
        editTextCriarCampoNumeroConfig2.setText(String.valueOf(iMin));
        TextView textView4 = new TextView(this);
        textView4.setText("x");
        textView4.setTextColor(this.corPainelTexto);
        textView4.setTextSize(16.0f);
        textView4.setGravity(17);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(dpParaPx(24), -2);
        linearLayout3.addView(editTextCriarCampoNumeroConfig, new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout3.addView(textView4, layoutParams4);
        linearLayout3.addView(editTextCriarCampoNumeroConfig2, new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout2.addView(linearLayout3);
        TextView textView5 = new TextView(this);
        textView5.setText("Densidade (DPI)");
        textView5.setTextColor(this.corPainelTexto);
        textView5.setTextSize(14.0f);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams5.topMargin = dpParaPx(12);
        linearLayout2.addView(textView5, layoutParams5);
        EditText editTextCriarCampoNumeroConfig3 = criarCampoNumeroConfig("DPI");
        int i3 = this.dpiDesejada;
        if (i3 > 0) {
            i = i3;
        }
        editTextCriarCampoNumeroConfig3.setText(String.valueOf(i));
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams6.topMargin = dpParaPx(6);
        linearLayout2.addView(editTextCriarCampoNumeroConfig3, layoutParams6);
        linearLayout.addView(linearLayout2);
        linearLayout.addView(criarLinhaSwitchAjusteTela("Automático ao entrar/sair", "Aplica no jogo e restaura (wm reset) no Home/Recentes", this.ajusteTelaAuto, new ed0(this, editTextCriarCampoNumeroConfig, editTextCriarCampoNumeroConfig2, editTextCriarCampoNumeroConfig3, 0)));
        linearLayout.addView(criarLinhaSwitchAjusteTela("Aplicar uma vez", "Aplica agora e mantém até fechar o mapeador", this.ajusteTelaUmaVez, new ed0(this, editTextCriarCampoNumeroConfig, editTextCriarCampoNumeroConfig2, editTextCriarCampoNumeroConfig3, 1)));
        View viewCriarBotaoAcaoConfig = criarBotaoAcaoConfig("Restaurar nativo", -11186064, new cc0(this, 9));
        ViewGroup.LayoutParams layoutParams7 = viewCriarBotaoAcaoConfig.getLayoutParams();
        layoutParams7.getClass();
        LinearLayout.LayoutParams layoutParams8 = (LinearLayout.LayoutParams) layoutParams7;
        layoutParams8.topMargin = dpParaPx(12);
        viewCriarBotaoAcaoConfig.setLayoutParams(layoutParams8);
        linearLayout.addView(viewCriarBotaoAcaoConfig);
    }

    private static final void mostrarConfigResolucoes$aoDesligarModo(FloatingService floatingService) {
        Toast.makeText(floatingService, "Restaurando tela nativa…", 0).show();
        BuildersKt__Builders_commonKt.launch$default(floatingService.serviceScope, Dispatchers.getIO(), null, new FloatingService$mostrarConfigResolucoes$aoDesligarModo$1(floatingService, null), 2, null);
    }

    private static final void mostrarConfigResolucoes$aoLigarModo(FloatingService floatingService, EditText editText, EditText editText2, EditText editText3, boolean z) {
        if (!floatingService.salvarCamposAjusteTela(editText.getText().toString(), editText2.getText().toString(), editText3.getText().toString())) {
            if (z) {
                floatingService.ajusteTelaAuto = false;
            } else {
                floatingService.ajusteTelaUmaVez = false;
            }
            floatingService.salvarPrefsAjusteTela();
            floatingService.ignorarSwitchAjusteTela = true;
            floatingService.handlerMonitor.post(new hb0(floatingService, 20));
            return;
        }
        int i = floatingService.resDesejadaW;
        int i2 = floatingService.resDesejadaH;
        int i3 = floatingService.dpiDesejada;
        StringBuilder sbM5345l = AbstractC1308pu.m5345l("Aplicando ", i, "x", i2, " @ ");
        sbM5345l.append(i3);
        sbM5345l.append("dpi…");
        Toast.makeText(floatingService, sbM5345l.toString(), 0).show();
        BuildersKt__Builders_commonKt.launch$default(floatingService.serviceScope, Dispatchers.getIO(), null, new FloatingService$mostrarConfigResolucoes$aoLigarModo$2(floatingService, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mostrarConfigResolucoes$aoLigarModo$lambda$315(FloatingService floatingService) {
        floatingService.mostrarConfigResolucoes();
        floatingService.ignorarSwitchAjusteTela = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 mostrarConfigResolucoes$lambda$314(FloatingService floatingService) {
        floatingService.mostrarMenuConfigPrincipal();
        return z32.f13265a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 mostrarConfigResolucoes$lambda$317(FloatingService floatingService, EditText editText, EditText editText2, EditText editText3, boolean z) {
        boolean z2 = floatingService.ignorarSwitchAjusteTela;
        z32 z32Var = z32.f13265a;
        if (z2) {
            return z32Var;
        }
        if (z) {
            floatingService.ajusteTelaAuto = true;
            floatingService.ajusteTelaUmaVez = false;
            floatingService.salvarPrefsAjusteTela();
            mostrarConfigResolucoes$aoLigarModo(floatingService, editText, editText2, editText3, true);
            return z32Var;
        }
        floatingService.ajusteTelaAuto = false;
        floatingService.salvarPrefsAjusteTela();
        if (floatingService.overrideResAtivo || floatingService.overrideDpiAtivo) {
            mostrarConfigResolucoes$aoDesligarModo(floatingService);
            return z32Var;
        }
        floatingService.ignorarSwitchAjusteTela = true;
        floatingService.handlerMonitor.post(new hb0(floatingService, 3));
        return z32Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mostrarConfigResolucoes$lambda$317$lambda$316(FloatingService floatingService) {
        floatingService.mostrarConfigResolucoes();
        floatingService.ignorarSwitchAjusteTela = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 mostrarConfigResolucoes$lambda$319(FloatingService floatingService, EditText editText, EditText editText2, EditText editText3, boolean z) {
        boolean z2 = floatingService.ignorarSwitchAjusteTela;
        z32 z32Var = z32.f13265a;
        if (z2) {
            return z32Var;
        }
        int i = 1;
        if (z) {
            floatingService.ajusteTelaUmaVez = true;
            floatingService.ajusteTelaAuto = false;
            floatingService.salvarPrefsAjusteTela();
            mostrarConfigResolucoes$aoLigarModo(floatingService, editText, editText2, editText3, false);
            return z32Var;
        }
        floatingService.ajusteTelaUmaVez = false;
        floatingService.salvarPrefsAjusteTela();
        if (floatingService.overrideResAtivo || floatingService.overrideDpiAtivo) {
            mostrarConfigResolucoes$aoDesligarModo(floatingService);
            return z32Var;
        }
        floatingService.ignorarSwitchAjusteTela = true;
        floatingService.handlerMonitor.post(new hb0(floatingService, i));
        return z32Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mostrarConfigResolucoes$lambda$319$lambda$318(FloatingService floatingService) {
        floatingService.mostrarConfigResolucoes();
        floatingService.ignorarSwitchAjusteTela = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 mostrarConfigResolucoes$lambda$320(FloatingService floatingService) {
        floatingService.ajusteTelaUmaVez = false;
        floatingService.ajusteTelaAuto = false;
        floatingService.resDesejadaW = 0;
        floatingService.resDesejadaH = 0;
        floatingService.dpiDesejada = 0;
        floatingService.salvarPrefsAjusteTela();
        floatingService.getSharedPreferences("SSMousePrefs", 0).edit().remove(KEY_RES_DESEJADA_W).remove(KEY_RES_DESEJADA_H).remove(KEY_DPI_DESEJADA).putBoolean(KEY_AJUSTE_UMA_VEZ, false).putBoolean(KEY_AJUSTE_AUTO, false).apply();
        Toast.makeText(floatingService, "Restaurando tela nativa…", 0).show();
        BuildersKt__Builders_commonKt.launch$default(floatingService.serviceScope, Dispatchers.getIO(), null, new FloatingService$mostrarConfigResolucoes$btnReset$1$1(floatingService, null), 2, null);
        return z32.f13265a;
    }

    private final void mostrarCursorVirtualMaoCentro() {
        ImageView imageView;
        if (this.fpsModoAtivo) {
            return;
        }
        if (this.hudEmModoJogo || this.hudEmModoEdicao) {
            esconderPonteiroSistema(this.hudOverlayView);
            aplicarVisualCursor();
            bc1 bc1VarCalcularMargemCursorMaoCentro = calcularMargemCursorMaoCentro();
            definirPosicaoCursorAbsoluta(((Number) bc1VarCalcularMargemCursorMaoCentro.f1292a).intValue(), ((Number) bc1VarCalcularMargemCursorMaoCentro.f1293b).intValue());
            View view = this.hudOverlayView;
            if (view != null && (imageView = (ImageView) view.findViewById(C0203R.id.cursorVirtualMao)) != null) {
                imageView.setVisibility(0);
                imageView.bringToFront();
            }
            this.cursorMaoVisivel = true;
            bc1 bc1VarCalcularPontaMiraFf = calcularPontaMiraFf();
            final int iIntValue = ((Number) bc1VarCalcularPontaMiraFf.f1292a).intValue();
            final int iIntValue2 = ((Number) bc1VarCalcularPontaMiraFf.f1293b).intValue();
            new Thread(new Runnable() { // from class: sb0
                @Override // java.lang.Runnable
                public final void run() {
                    FloatingService.mostrarCursorVirtualMaoCentro$lambda$30(iIntValue, iIntValue2);
                }
            }).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mostrarCursorVirtualMaoCentro$lambda$30(int i, int i2) {
        InjectionDaemonManager.INSTANCE.enqueueComando("MAO_POS " + i + " " + i2);
    }

    private final void mostrarDialogoNumeroComp(String str, String str2, final og0 og0Var) {
        C0543cu c0543cu = new C0543cu(this, com.sousasantoslogic.sspro.R.style.Theme_AppCompat_Dialog);
        final EditText editText = new EditText(c0543cu);
        editText.setText(str2);
        editText.setInputType(8194);
        editText.setSelection(editText.getText().length());
        editText.setPadding(48, 32, 48, 16);
        C1357r5 view = new C1357r5(c0543cu).setTitle(str).setView(editText);
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: oc0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                FloatingService.mostrarDialogoNumeroComp$lambda$19(editText, og0Var, this, dialogInterface, i);
            }
        };
        C1133n5 c1133n5 = view.f9726a;
        c1133n5.f7222g = "OK";
        c1133n5.f7223h = onClickListener;
        pc0 pc0Var = new pc0(this, editText, 0);
        c1133n5.f7224i = "Cancelar";
        c1133n5.f7225j = pc0Var;
        final DialogInterfaceC1394s5 dialogInterfaceC1394s5Create = view.create();
        dialogInterfaceC1394s5Create.getClass();
        dialogInterfaceC1394s5Create.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: qc0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                FloatingService.mostrarDialogoNumeroComp$lambda$21(dialogInterfaceC1394s5Create, this, editText, dialogInterface);
            }
        });
        aplicarTipoJanelaOverlay(dialogInterfaceC1394s5Create.getWindow());
        Window window = dialogInterfaceC1394s5Create.getWindow();
        if (window != null) {
            window.setSoftInputMode(36);
        }
        dialogInterfaceC1394s5Create.setOnShowListener(new DialogInterface.OnShowListener(this) { // from class: rc0

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ FloatingService f9883b;

            {
                this.f9883b = this;
            }

            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                FloatingService.mostrarDialogoNumeroComp$lambda$23(editText, this.f9883b, dialogInterface);
            }
        });
        dialogInterfaceC1394s5Create.show();
    }

    private static final void mostrarDialogoNumeroComp$esconderTeclado(FloatingService floatingService, EditText editText) {
        try {
            Object systemService = floatingService.getSystemService("input_method");
            InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
            }
            editText.clearFocus();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mostrarDialogoNumeroComp$lambda$19(EditText editText, og0 og0Var, FloatingService floatingService, DialogInterface dialogInterface, int i) {
        mostrarDialogoNumeroComp$esconderTeclado(floatingService, editText);
        String string = zv1.m7383W0(editText.getText().toString()).toString();
        if (string.length() > 0) {
            og0Var.invoke(string);
        }
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mostrarDialogoNumeroComp$lambda$20(FloatingService floatingService, EditText editText, DialogInterface dialogInterface, int i) {
        mostrarDialogoNumeroComp$esconderTeclado(floatingService, editText);
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mostrarDialogoNumeroComp$lambda$21(DialogInterfaceC1394s5 dialogInterfaceC1394s5, FloatingService floatingService, EditText editText, DialogInterface dialogInterface) {
        mostrarDialogoNumeroComp$esconderTeclado(floatingService, editText);
        Window window = dialogInterfaceC1394s5.getWindow();
        if (window != null) {
            window.setSoftInputMode(3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mostrarDialogoNumeroComp$lambda$23(EditText editText, FloatingService floatingService, DialogInterface dialogInterface) {
        editText.requestFocus();
        editText.post(new RunnableC1467u4(14, floatingService, editText));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mostrarDialogoNumeroComp$lambda$23$lambda$22(FloatingService floatingService, EditText editText) {
        Object systemService = floatingService.getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(editText, 1);
        }
    }

    private final void mostrarDialogoOverlayConfirmacao(String str, String str2, String str3, mg0 mg0Var) {
        C1357r5 title = new C1357r5(new C0543cu(this, com.sousasantoslogic.sspro.R.style.Theme_AppCompat_Dialog)).setTitle(str);
        C1133n5 c1133n5 = title.f9726a;
        c1133n5.f7221f = str2;
        zf1 zf1Var = new zf1(mg0Var, 2);
        c1133n5.f7222g = str3;
        c1133n5.f7223h = zf1Var;
        DialogInterfaceC1394s5 dialogInterfaceC1394s5Create = title.setNegativeButton(android.R.string.cancel, null).create();
        dialogInterfaceC1394s5Create.getClass();
        aplicarTipoJanelaOverlay(dialogInterfaceC1394s5Create.getWindow());
        dialogInterfaceC1394s5Create.show();
    }

    private final void mostrarMenuConfigPrincipal() {
        LinearLayout linearLayout = this.configConteudoView;
        if (linearLayout == null) {
            return;
        }
        TextView textView = this.configTituloView;
        if (textView != null) {
            textView.setText("Configurações");
        }
        linearLayout.removeAllViews();
        linearLayout.addView(criarBotaoNavConfig("Interfaces", "Cursor e botão flutuante", new cc0(this, 0)));
        linearLayout.addView(criarBotaoNavConfig("Ajuste de tela", "Resolução e DPI", new cc0(this, 1)));
        if (DevToolsGate.INSTANCE.getLiberado()) {
            linearLayout.addView(criarBotaoNavConfig("Monitor", "Pipeline ao vivo (debug — não altera a mira)", new cc0(this, 2)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 mostrarMenuConfigPrincipal$lambda$295(FloatingService floatingService) {
        floatingService.mostrarConfigInterfaces();
        return z32.f13265a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 mostrarMenuConfigPrincipal$lambda$296(FloatingService floatingService) {
        floatingService.mostrarConfigResolucoes();
        return z32.f13265a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 mostrarMenuConfigPrincipal$lambda$297(FloatingService floatingService) {
        floatingService.mostrarConfigMonitor();
        return z32.f13265a;
    }

    private final void mostrarPonteiroSistema(View view) {
        if (view == null) {
            return;
        }
        try {
            view.setPointerIcon(PointerIcon.getSystemIcon(this, 1000));
        } catch (Exception unused) {
        }
    }

    private final float nivelParaMultiplicador(int i) {
        return i / 7.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int nivelParaPointerSpeed(int i) {
        return p32.m5140F(i - 7, -7, 7);
    }

    private final int normalizarMousePollHz(int i) {
        if (i == 0 || i == 125 || i == 250 || i == 500 || i == 1000) {
            return i;
        }
        return 250;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notificarHotplugPeriferico() {
        String str;
        if (this.hudEmModoEdicao || (str = this.pacoteDoJogo) == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(this.serviceScope, Dispatchers.getIO(), null, new C01671(str, null), 2, null);
    }

    private final boolean obterAcelLimiarAtivo(FrameLayout frameLayout) {
        Object tag = frameLayout.getTag(C0203R.id.tag_hud_fps_acel_limiar_ativo);
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private final int obterAcelLimiarGainX(FrameLayout frameLayout) {
        Object tag = frameLayout.getTag(C0203R.id.tag_hud_fps_acel_limiar_gain_x);
        Integer num = tag instanceof Integer ? (Integer) tag : null;
        if (num != null) {
            return p32.m5140F(num.intValue(), BALL_SIZE_MAX, 300);
        }
        return 150;
    }

    private final int obterAcelLimiarGainY(FrameLayout frameLayout) {
        Object tag = frameLayout.getTag(C0203R.id.tag_hud_fps_acel_limiar_gain_y);
        Integer num = tag instanceof Integer ? (Integer) tag : null;
        if (num != null) {
            return p32.m5140F(num.intValue(), BALL_SIZE_MAX, 300);
        }
        return 150;
    }

    private final int obterAcelLimiarLimX(FrameLayout frameLayout) {
        Object tag = frameLayout.getTag(C0203R.id.tag_hud_fps_acel_limiar_lim_x);
        Integer num = tag instanceof Integer ? (Integer) tag : null;
        if (num != null) {
            return p32.m5140F(num.intValue(), 0, 50);
        }
        return 8;
    }

    private final int obterAcelLimiarLimY(FrameLayout frameLayout) {
        Object tag = frameLayout.getTag(C0203R.id.tag_hud_fps_acel_limiar_lim_y);
        Integer num = tag instanceof Integer ? (Integer) tag : null;
        if (num != null) {
            return p32.m5140F(num.intValue(), 0, 50);
        }
        return 8;
    }

    private final String obterAcelLimiarTecla(FrameLayout frameLayout) {
        String string;
        Object tag = frameLayout.getTag(C0203R.id.tag_hud_fps_acel_limiar_tecla);
        String str = tag instanceof String ? (String) tag : null;
        if (str == null || (string = zv1.m7383W0(str).toString()) == null || zv1.m7371K0(string)) {
            return null;
        }
        return string;
    }

    private final AnalogStickHudView obterAnalogViewWrapper(FrameLayout frameLayout) {
        View viewObterViewConteudoWrapper = obterViewConteudoWrapper(frameLayout);
        if (viewObterViewConteudoWrapper instanceof AnalogStickHudView) {
            return (AnalogStickHudView) viewObterViewConteudoWrapper;
        }
        return null;
    }

    private final FpsAntiBlockModo obterAntiBlockFps(FrameLayout frameLayout) {
        if (!DevToolsGate.INSTANCE.getLiberado()) {
            return FpsAntiBlockModo.Companion.getOFICIAL();
        }
        Object tag = frameLayout.getTag(C0203R.id.tag_hud_fps_anti_block);
        return FpsAntiBlockModo.Companion.fromId(tag instanceof String ? (String) tag : null);
    }

    private final View obterBadgeContagemToqueRep(FrameLayout frameLayout) {
        if (!hp0.m3214e(frameLayout.getTag(C0203R.id.tag_hud_tipo), TIPO_TOQUE_REP) || frameLayout.getChildCount() <= 3) {
            return null;
        }
        return frameLayout.getChildAt(3);
    }

    private final View obterBotaoConfigAnalog(FrameLayout frameLayout) {
        if (!hp0.m3214e(frameLayout.getTag(C0203R.id.tag_hud_tipo), TIPO_ANALOGICO) || frameLayout.getChildCount() <= 2) {
            return null;
        }
        return frameLayout.getChildAt(2);
    }

    private final View obterBotaoConfigFps(FrameLayout frameLayout) {
        if (!hp0.m3214e(frameLayout.getTag(C0203R.id.tag_hud_tipo), TIPO_FPS) || frameLayout.getChildCount() <= 2) {
            return null;
        }
        return frameLayout.getChildAt(2);
    }

    private final View obterBotaoConfigToque(FrameLayout frameLayout) {
        Object tag = frameLayout.getTag(C0203R.id.tag_hud_tipo);
        if ((hp0.m3214e(tag, TIPO_TOQUE) || hp0.m3214e(tag, TIPO_TOQUE_REP)) && frameLayout.getChildCount() > 2) {
            return frameLayout.getChildAt(2);
        }
        return null;
    }

    private final View obterBotaoExcluirWrapper(FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            return frameLayout.getChildAt(1);
        }
        return null;
    }

    private final View obterBotaoResizeAnalog(FrameLayout frameLayout) {
        if (!hp0.m3214e(frameLayout.getTag(C0203R.id.tag_hud_tipo), TIPO_ANALOGICO) || frameLayout.getChildCount() <= 3) {
            return null;
        }
        return frameLayout.getChildAt(3);
    }

    private final FrameLayout obterContainerHud() {
        View view = this.hudOverlayView;
        if (view != null) {
            return (FrameLayout) view.findViewById(C0203R.id.hudTeclasContainer);
        }
        return null;
    }

    private final TextView obterConteudoWrapper(FrameLayout frameLayout) {
        View viewObterViewConteudoWrapper = obterViewConteudoWrapper(frameLayout);
        if (viewObterViewConteudoWrapper instanceof TextView) {
            return (TextView) viewObterViewConteudoWrapper;
        }
        return null;
    }

    private final bc1 obterDimensaoTelaAtual() {
        return dimensaoTelaParaMapeamento();
    }

    private final FpsViewHudView obterFpsViewWrapper(FrameLayout frameLayout) {
        if (hp0.m3214e(frameLayout.getTag(C0203R.id.tag_hud_tipo), TIPO_FPS)) {
            View viewObterViewConteudoWrapper = obterViewConteudoWrapper(frameLayout);
            if (viewObterViewConteudoWrapper instanceof FpsViewHudView) {
                return (FpsViewHudView) viewObterViewConteudoWrapper;
            }
        }
        return null;
    }

    private final int obterLarguraTelaHud() {
        View view = this.hudOverlayView;
        int width = view != null ? view.getWidth() : 0;
        if (width > 0) {
            return width;
        }
        int i = getResources().getDisplayMetrics().widthPixels;
        int i2 = getResources().getDisplayMetrics().heightPixels;
        return i < i2 ? i2 : i;
    }

    private final boolean obterLowSpeedAtivoX(FrameLayout frameLayout) {
        Object tag = frameLayout.getTag(C0203R.id.tag_hud_fps_low_speed_ativo_x);
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    private final boolean obterLowSpeedAtivoY(FrameLayout frameLayout) {
        Object tag = frameLayout.getTag(C0203R.id.tag_hud_fps_low_speed_ativo_y);
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private final int obterLowSpeedFatorX(FrameLayout frameLayout) {
        Object tag = frameLayout.getTag(C0203R.id.tag_hud_fps_low_speed_fator_x);
        Integer num = tag instanceof Integer ? (Integer) tag : null;
        if (num != null) {
            return p32.m5140F(num.intValue(), 10, 100);
        }
        return 60;
    }

    private final int obterLowSpeedFatorY(FrameLayout frameLayout) {
        Object tag = frameLayout.getTag(C0203R.id.tag_hud_fps_low_speed_fator_y);
        Integer num = tag instanceof Integer ? (Integer) tag : null;
        if (num != null) {
            return p32.m5140F(num.intValue(), 10, 100);
        }
        return 60;
    }

    private final int obterLowSpeedLimX(FrameLayout frameLayout) {
        Object tag = frameLayout.getTag(C0203R.id.tag_hud_fps_low_speed_lim_x);
        Integer num = tag instanceof Integer ? (Integer) tag : null;
        if (num != null) {
            return p32.m5140F(num.intValue(), 0, 50);
        }
        return 30;
    }

    private final int obterLowSpeedLimY(FrameLayout frameLayout) {
        Object tag = frameLayout.getTag(C0203R.id.tag_hud_fps_low_speed_lim_y);
        Integer num = tag instanceof Integer ? (Integer) tag : null;
        if (num != null) {
            return p32.m5140F(num.intValue(), 0, 50);
        }
        return 0;
    }

    private final String obterLowSpeedTeclaX(FrameLayout frameLayout) {
        String string;
        Object tag = frameLayout.getTag(C0203R.id.tag_hud_fps_low_speed_tecla_x);
        String str = tag instanceof String ? (String) tag : null;
        if (str == null || (string = zv1.m7383W0(str).toString()) == null || zv1.m7371K0(string)) {
            return null;
        }
        return string;
    }

    private final String obterLowSpeedTeclaY(FrameLayout frameLayout) {
        String string;
        Object tag = frameLayout.getTag(C0203R.id.tag_hud_fps_low_speed_tecla_y);
        String str = tag instanceof String ? (String) tag : null;
        if (str == null || (string = zv1.m7383W0(str).toString()) == null || zv1.m7371K0(string)) {
            return null;
        }
        return string;
    }

    private final boolean obterMostrarTeclasAnalog(FrameLayout frameLayout) {
        Object tag = frameLayout.getTag(C0203R.id.tag_hud_analog_mostrar_teclas);
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    private final bc1 obterPontaCursorVirtual() {
        View view = this.hudOverlayView;
        ImageView imageView = view != null ? (ImageView) view.findViewById(C0203R.id.cursorVirtualMao) : null;
        if (view == null || imageView == null || imageView.getVisibility() != 0) {
            return calcularPontaMiraFf();
        }
        int iCursorPontaXpx = cursorPontaXpx();
        int iCursorPontaYpx = cursorPontaYpx();
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            return new bc1(Integer.valueOf(iArr[0] + layoutParams2.leftMargin + iCursorPontaXpx), Integer.valueOf(iArr[1] + layoutParams2.topMargin + iCursorPontaYpx));
        }
        int[] iArr2 = new int[2];
        imageView.getLocationOnScreen(iArr2);
        return new bc1(Integer.valueOf(iArr2[0] + iCursorPontaXpx), Integer.valueOf(iArr2[1] + iCursorPontaYpx));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bc1 obterPosicaoCursorParaInjecao() {
        Integer numValueOf = Integer.valueOf(CURSOR_FORA_TELA);
        return (!this.fpsModoAtivo && this.cursorMaoVisivel && this.hudEmModoJogo) ? obterPontaCursorVirtual() : new bc1(numValueOf, numValueOf);
    }

    private final String obterRotuloTecla(int i, KeyEvent keyEvent) {
        if (29 <= i && i < 55) {
            return String.valueOf((char) (i + 36));
        }
        if (7 <= i && i < 17) {
            return String.valueOf((char) (i + 41));
        }
        if (131 <= i && i < 143) {
            return jd0.m3609g(i - 130, "F");
        }
        if (i == 62) {
            return "Espaço";
        }
        if (i == 66) {
            return "Enter";
        }
        if (i == 61) {
            return "Tab";
        }
        if (i == 59 || i == 60) {
            return "Shift";
        }
        if (i == 113 || i == 114) {
            return "Ctrl";
        }
        if (i == 57 || i == 58) {
            return "Alt";
        }
        int unicodeChar = keyEvent.getUnicodeChar();
        if (unicodeChar != 0) {
            char c = (char) unicodeChar;
            if (Character.isLetter(c)) {
                return String.valueOf(Character.toUpperCase(c));
            }
            if (Character.isDigit(c)) {
                return String.valueOf(c);
            }
        }
        String strKeyCodeToString = KeyEvent.keyCodeToString(i);
        strKeyCodeToString.getClass();
        String strReplace = zv1.m7376P0(strKeyCodeToString, "KEYCODE_").replace('_', ' ');
        strReplace.getClass();
        return strReplace;
    }

    private final float obterSensFpsX(FrameLayout frameLayout) {
        Object tag = frameLayout.getTag(C0203R.id.tag_hud_fps_sens_x);
        Float f = tag instanceof Float ? (Float) tag : null;
        if (f != null) {
            return f.floatValue();
        }
        FpsViewHudView fpsViewHudViewObterFpsViewWrapper = obterFpsViewWrapper(frameLayout);
        Float fValueOf = fpsViewHudViewObterFpsViewWrapper != null ? Float.valueOf(fpsViewHudViewObterFpsViewWrapper.getSensX()) : null;
        if (fValueOf != null) {
            return fValueOf.floatValue();
        }
        return 1.0f;
    }

    private final float obterSensFpsY(FrameLayout frameLayout) {
        Object tag = frameLayout.getTag(C0203R.id.tag_hud_fps_sens_y);
        Float f = tag instanceof Float ? (Float) tag : null;
        if (f != null) {
            return f.floatValue();
        }
        FpsViewHudView fpsViewHudViewObterFpsViewWrapper = obterFpsViewWrapper(frameLayout);
        Float fValueOf = fpsViewHudViewObterFpsViewWrapper != null ? Float.valueOf(fpsViewHudViewObterFpsViewWrapper.getSensY()) : null;
        if (fValueOf != null) {
            return fValueOf.floatValue();
        }
        return 0.5f;
    }

    private final float obterSensibilidadeMira() {
        return getSharedPreferences("SSMousePrefs", 0).getFloat("sensibilidade_mira", 1.5f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    private final bc1 obterTamanhoRealTela() {
        try {
            OverlayDisplayBinder overlayDisplayBinder = OverlayDisplayBinder.INSTANCE;
            Context applicationContext = getApplicationContext();
            applicationContext.getClass();
            DisplayMetrics displayMetricsMetrics = overlayDisplayBinder.resolver(applicationContext).metrics();
            int i = displayMetricsMetrics.widthPixels;
            if (i > 0 && displayMetricsMetrics.heightPixels > 0) {
                return new bc1(Integer.valueOf(i), Integer.valueOf(displayMetricsMetrics.heightPixels));
            }
        } catch (Exception unused) {
        }
        WindowManager windowManager = this.windowManager;
        if (windowManager != null) {
            try {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
                int i2 = displayMetrics.widthPixels;
                if (i2 > 0 && displayMetrics.heightPixels > 0) {
                    return new bc1(Integer.valueOf(i2), Integer.valueOf(displayMetrics.heightPixels));
                }
            } catch (Exception unused2) {
            }
        }
        Context context = this.overlayContext;
        Object r3 = this;
        if (context != null) {
            r3 = context;
        }
        DisplayMetrics displayMetrics2 = r3.getResources().getDisplayMetrics();
        return new bc1(Integer.valueOf(displayMetrics2.widthPixels), Integer.valueOf(displayMetrics2.heightPixels));
    }

    private final String obterTeclaAnalogTag(FrameLayout frameLayout, int i, String str) {
        Object tag = frameLayout.getTag(i);
        String str2 = tag instanceof String ? (String) tag : null;
        if (str2 != null) {
            if (zv1.m7371K0(str2)) {
                str2 = str;
            }
            if (str2 != null) {
                return str2;
            }
        }
        return str;
    }

    private final String obterTeclaSalva(TextView textView, String str) {
        if (!hp0.m3214e(str, TIPO_TOQUE) && !hp0.m3214e(str, TIPO_TOQUE_REP)) {
            return "";
        }
        Object tag = textView.getTag(C0203R.id.tag_hud_tecla);
        String str2 = tag instanceof String ? (String) tag : null;
        if (str2 != null) {
            if (zv1.m7371K0(str2)) {
                str2 = null;
            }
            if (str2 != null) {
                return str2;
            }
        }
        String string = textView.getText().toString();
        String str3 = hp0.m3214e(string, "?") ? null : string;
        return str3 == null ? "" : str3;
    }

    private final String obterTeclaSalvaFps(FrameLayout frameLayout) {
        Object tag = frameLayout.getTag(C0203R.id.tag_hud_tecla);
        String str = tag instanceof String ? (String) tag : null;
        if (str != null) {
            if (zv1.m7371K0(str)) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        FpsViewHudView fpsViewHudViewObterFpsViewWrapper = obterFpsViewWrapper(frameLayout);
        String teclaRotulo = fpsViewHudViewObterFpsViewWrapper != null ? fpsViewHudViewObterFpsViewWrapper.getTeclaRotulo() : null;
        return teclaRotulo == null ? "" : teclaRotulo;
    }

    private final String obterTeclaSuspenderFps(FrameLayout frameLayout) {
        String string;
        Object tag = frameLayout.getTag(C0203R.id.tag_hud_fps_tecla_suspender);
        String str = tag instanceof String ? (String) tag : null;
        if (str == null || (string = zv1.m7383W0(str).toString()) == null || zv1.m7371K0(string)) {
            return null;
        }
        return string;
    }

    private final String obterToqueInterrompe(FrameLayout frameLayout) {
        String string;
        Object tag = frameLayout.getTag(C0203R.id.tag_hud_toque_interrompe);
        String str = tag instanceof String ? (String) tag : null;
        if (str == null || (string = zv1.m7383W0(str).toString()) == null || zv1.m7371K0(string)) {
            return null;
        }
        return string;
    }

    private final String obterToqueModo(FrameLayout frameLayout) {
        Object tag = frameLayout.getTag(C0203R.id.tag_hud_toque_modo);
        String str = tag instanceof String ? (String) tag : null;
        if (str == null) {
            return TOQUE_MODO_PRESS;
        }
        String str2 = str.equals(TOQUE_MODO_TAP) ? str : null;
        return str2 == null ? TOQUE_MODO_PRESS : str2;
    }

    private final boolean obterToqueRepAteChave(FrameLayout frameLayout) {
        Object tag = frameLayout.getTag(C0203R.id.tag_hud_toque_rep_until);
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private final int obterToqueRepContagem(FrameLayout frameLayout) {
        Object tag = frameLayout.getTag(C0203R.id.tag_hud_toque_rep_count);
        Integer num = tag instanceof Integer ? (Integer) tag : null;
        if (num != null) {
            return p32.m5140F(num.intValue(), 1, 50);
        }
        return 5;
    }

    private final int obterToqueTapMs(FrameLayout frameLayout) {
        Object tag = frameLayout.getTag(C0203R.id.tag_hud_toque_tap_ms);
        Integer num = tag instanceof Integer ? (Integer) tag : null;
        if (num != null) {
            return p32.m5140F(num.intValue(), 1, 500);
        }
        return 1;
    }

    private final View obterViewConteudoWrapper(FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 0) {
            return frameLayout.getChildAt(0);
        }
        return null;
    }

    private final void ocultarHudParaForaDoJogo() {
        desativarTecladoNoDaemon$default(this, false, 1, null);
        View view = this.hudOverlayView;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 onStartCommand$lambda$10(FloatingService floatingService) {
        floatingService.handlerMonitor.post(new hb0(floatingService, 10));
        return z32.f13265a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onStartCommand$lambda$10$lambda$9(FloatingService floatingService) {
        Toast.makeText(floatingService, "Tempo esgotado! Recarregue para continuar.", 1).show();
        encerrarMapeadorCompleto$default(floatingService, false, 1, null);
        floatingService.stopSelf();
    }

    private final bc1 origemContainerNoDisplay(int i, int i2) {
        int i3 = 0;
        FrameLayout frameLayoutObterContainerHud = obterContainerHud();
        if (frameLayoutObterContainerHud == null) {
            return new bc1(0, 0);
        }
        if (frameLayoutObterContainerHud.getWidth() <= 0 || frameLayoutObterContainerHud.getHeight() <= 0) {
            return new bc1(0, 0);
        }
        int[] iArr = new int[2];
        try {
            frameLayoutObterContainerHud.getLocationOnScreen(iArr);
            int iMax = Math.max(i, 1);
            int iMax2 = Math.max(i2, 1);
            int i4 = iArr[0];
            if (i4 < 0 || i4 >= iMax) {
                i4 = 0;
            }
            int i5 = iArr[1];
            if (i5 >= 0 && i5 < iMax2) {
                i3 = i5;
            }
            return new bc1(Integer.valueOf(i4), Integer.valueOf(i3));
        } catch (Exception unused) {
            return new bc1(0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void pararDebugExteriorFps() {
        TextView textView;
        this.handlerMonitor.removeCallbacks(this.atualizarDebugExteriorFps);
        View view = this.hudOverlayView;
        if (view == null || (textView = (TextView) view.findViewById(C0203R.id.fpsExteriorDebugBox)) == null) {
            return;
        }
        textView.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void pararMonitorMapeador() {
        ScrollView scrollView;
        this.handlerMonitor.removeCallbacks(this.atualizarMonitorMapeador);
        View view = this.hudOverlayView;
        if (view != null && (scrollView = (ScrollView) view.findViewById(C0203R.id.painelMonitorMapeadorScroll)) != null) {
            scrollView.setVisibility(8);
        }
        this.estadoMonitorMapeador.setPrev(null);
        this.estadoMonitorMapeador.setPrevMonoNs(0L);
        this.estadoMonitorMapeador.setFilaSeguidas(0);
        this.estadoMonitorMapeador.setPrevFlushHz(0.0d);
        this.estadoMonitorMapeador.setStutterSeguidas(0);
        this.estadoMonitorMapeador.setUltimoAlertaLog("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DebugFfLive parseDebugFfAnti(String str) {
        Float debugFfAnti$pegar;
        if (zv1.m7371K0(str) || (debugFfAnti$pegar = parseDebugFfAnti$pegar(str, "x")) == null) {
            return null;
        }
        float fFloatValue = debugFfAnti$pegar.floatValue();
        Float debugFfAnti$pegar2 = parseDebugFfAnti$pegar(str, "origem");
        float fFloatValue2 = debugFfAnti$pegar2 != null ? debugFfAnti$pegar2.floatValue() : fFloatValue;
        Float debugFfAnti$pegar3 = parseDebugFfAnti$pegar(str, "efetivo");
        float fFloatValue3 = (debugFfAnti$pegar3 == null && (debugFfAnti$pegar3 = parseDebugFfAnti$pegar(str, "fator")) == null) ? 1.0f : debugFfAnti$pegar3.floatValue();
        Float debugFfAnti$pegar4 = parseDebugFfAnti$pegar(str, "sens");
        float fFloatValue4 = debugFfAnti$pegar4 != null ? debugFfAnti$pegar4.floatValue() : FpsFfAntiAceleracaoConfig.INSTANCE.getSensitivity();
        Float debugFfAnti$pegar5 = parseDebugFfAnti$pegar(str, "tela");
        return new DebugFfLive(fFloatValue, fFloatValue2, fFloatValue3, fFloatValue4, debugFfAnti$pegar5 != null ? debugFfAnti$pegar5.floatValue() : obterLarguraTelaHud());
    }

    private static final Float parseDebugFfAnti$pegar(String str, String str2) {
        String strSubstring;
        str.getClass();
        ys0 ys0Var = new ys0(str);
        do {
            if (!ys0Var.hasNext()) {
                strSubstring = null;
                break;
            }
            strSubstring = parseDebugFfAnti$pegar$lambda$2((String) ys0Var.next());
        } while (!hw1.m3309D0(strSubstring, str2 + ":", false));
        if (strSubstring != null) {
            int iIndexOf = strSubstring.indexOf(58, 0);
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1, strSubstring.length());
            }
            String string = zv1.m7383W0(strSubstring).toString();
            if (string != null) {
                return fw1.m2862y0(string);
            }
        }
        return null;
    }

    private static final String parseDebugFfAnti$pegar$lambda$2(String str) {
        str.getClass();
        return zv1.m7383W0(str).toString();
    }

    private final Float parseSensFpsDigitado(String str) {
        String string = zv1.m7383W0(str).toString();
        string.getClass();
        String strReplace = string.replace(',', '.');
        strReplace.getClass();
        Float fM2862y0 = fw1.m2862y0(strReplace);
        if (fM2862y0 != null) {
            return Float.valueOf(p32.m5139E(fM2862y0.floatValue(), 0.1f, 20.0f));
        }
        return null;
    }

    private final boolean pilhaPaineisHudJaNaOrdem(ViewGroup viewGroup, List<? extends View> list) {
        int size = list.size();
        int childCount = viewGroup.getChildCount();
        if (childCount < size) {
            return false;
        }
        int i = childCount - size;
        for (int i2 = 0; i2 < size; i2++) {
            if (viewGroup.getChildAt(i + i2) != list.get(i2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean precisaDebugExteriorCurva() {
        View view;
        View viewFindViewById;
        return this.hudEmModoJogo && AimGraphConfig.INSTANCE.getMostrarGraficoNaPartida() && (view = this.hudOverlayView) != null && (viewFindViewById = view.findViewById(C0203R.id.painelExteriorCurva)) != null && viewFindViewById.getVisibility() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean precisaMonitorMapeador() {
        return this.monitorMapeadorAtivo && this.hudEmModoJogo && this.hudOverlayView != null;
    }

    private final void prepararEntradaModoEscuta() {
        if (this.editMousePressionado) {
            try {
                repassarTouchOverlayEdicao(1);
            } catch (Exception unused) {
            }
        }
        limparEstadoTouchEdicao();
        this.capturaIgnorarMouseAteMs = SystemClock.uptimeMillis() + 400;
    }

    private final int presidentialX(int i, int i2, int i3, boolean z, int i4, int i5, int i6) {
        if (i6 < i4 && i6 < i5) {
            return i;
        }
        if (i4 >= i5) {
            return z ? i2 - (i3 / 2) : i2 - i3;
        }
        if (z) {
            return -(i3 / 2);
        }
        return 0;
    }

    private final int presidentialY(int i, int i2, boolean z, int i3, int i4, int i5) {
        if (i5 >= i3 || i5 >= i4) {
            if (i < 0) {
                return 0;
            }
            return i;
        }
        if (z) {
            return -(i2 / 2);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean processarAtalhoApp(int i, boolean z) throws JSONException {
        AtalhosPrefs.Acao acaoAcaoParaCodigo;
        if (!z || this.escutaConteudo != null || this.escutaFpsView != null || this.escutaCampoAnalog != null) {
            return false;
        }
        if ((!this.hudEmModoJogo && !this.hudEmModoEdicao) || (acaoAcaoParaCodigo = AtalhosPrefs.INSTANCE.carregar(this).acaoParaCodigo(i)) == null) {
            return false;
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[acaoAcaoParaCodigo.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    C0694gy.m3076b();
                    return false;
                }
                if (this.hudEmModoEdicao) {
                    Toast.makeText(this, "Saia da edição do HUD para Configurações", 0).show();
                } else {
                    abrirPainelConfiguracoes();
                }
            } else if (this.hudEmModoEdicao) {
                Toast.makeText(this, "Saia da edição do HUD para Digitar", 0).show();
            } else {
                alternarModoDigitar$default(this, null, 1, null);
            }
        } else if (this.hudEmModoEdicao) {
            sairModoEdicaoHud();
            View view = this.menuView;
            if (view != null) {
                view.setVisibility(0);
            }
        } else {
            fecharPainelConfiguracoes();
            removerMenuView();
            abrirHudOverlay();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processarCapturaFisicaHud(int i, boolean z, boolean z2) {
        if (z) {
            if (this.escutaConteudo == null && this.escutaFpsView == null && this.escutaCampoAnalog == null) {
                return;
            }
            if ((z2 || LinuxKeyCodes.INSTANCE.ehBotaoMouse(i)) && SystemClock.uptimeMillis() < this.capturaIgnorarMouseAteMs) {
                return;
            }
            LinuxKeyCodes linuxKeyCodes = LinuxKeyCodes.INSTANCE;
            String strRotuloParaCaptura = linuxKeyCodes.rotuloParaCaptura(i, z2);
            if (linuxKeyCodes.ehBotaoMouse(i) && i == 272) {
                Toast.makeText(this, "Detectado esquerdo (" + strRotuloParaCaptura + "). Se era lateral, o driver emula esquerdo neste aparelho.", 1).show();
            } else if (i == 158 || i == 159) {
                Toast.makeText(this, "Lateral USB: " + strRotuloParaCaptura + " (código " + i + ")", 0).show();
            } else if (linuxKeyCodes.ehBotaoMouse(i) && i >= 275) {
                Toast.makeText(this, jd0.m3617o("Botão mouse: ", linuxKeyCodes.nomeBotaoMouse(i), " (", strRotuloParaCaptura, ")"), 0).show();
            }
            if (this.escutaConteudo != null) {
                finalizarCapturaTecla(strRotuloParaCaptura);
            } else if (this.escutaFpsView != null) {
                finalizarCapturaTeclaFps(strRotuloParaCaptura);
            } else if (this.escutaCampoAnalog != null) {
                finalizarCapturaTeclaAnalog(strRotuloParaCaptura);
            }
        }
    }

    private final float progressoParaSensibilidade(int i) {
        return p32.m5139E((i * 0.1f) + 0.5f, 0.5f, SENSI_MAX);
    }

    private final void recolherBandeja() {
        View viewFindViewById;
        View view = this.hudOverlayView;
        if (view == null || (viewFindViewById = view.findViewById(C0203R.id.bandejaAvancada)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    private final void reconfigurarAposMudancaResolucao() throws JSONException {
        if (!this.hudEmModoJogo && !this.hudEmModoEdicao) {
            garantirHudOverlayEmModoJogo(false);
        }
        if (this.hudEmModoJogo) {
            limparComponentesHud();
            carregarMapeamentoHudSalvo();
            aplicarModoJogo();
            ativarTecladoNoDaemon(true);
            enviarSincronizacaoDesacelFps();
            mostrarCursorVirtualMaoCentro();
            atualizarVisibilidadeGraficoMira();
        }
    }

    private final void recriarOverlaysNoDisplayAtual() throws JSONException {
        boolean z = this.floatingView != null;
        View view = this.hudOverlayView;
        boolean z2 = view != null;
        boolean z3 = view != null && view.getVisibility() == 0;
        boolean z4 = this.hudEmModoJogo;
        boolean z5 = this.hudEmModoEdicao;
        View view2 = this.menuView;
        if (view2 != null) {
            try {
                WindowManager windowManager = this.windowManager;
                if (windowManager != null) {
                    windowManager.removeView(view2);
                }
            } catch (Exception unused) {
            }
            this.menuView = null;
        }
        View view3 = this.hudOverlayView;
        if (view3 != null) {
            try {
                WindowManager windowManager2 = this.windowManager;
                if (windowManager2 != null) {
                    windowManager2.removeView(view3);
                }
            } catch (Exception unused2) {
            }
            this.hudOverlayView = null;
            this.hudOverlayParams = null;
            limparCacheViewsOrdemHud();
        }
        View view4 = this.floatingView;
        if (view4 != null) {
            try {
                WindowManager windowManager3 = this.windowManager;
                if (windowManager3 != null) {
                    windowManager3.removeView(view4);
                }
            } catch (Exception unused3) {
            }
            this.floatingView = null;
        }
        vincularOverlayAoDisplayAlvo(true);
        if (z) {
            exibirBolinhaFlutuante();
            View view5 = this.floatingView;
            if (view5 != null) {
                view5.setVisibility(this.bolinhaVisivel ? 0 : 8);
            }
        }
        if (z2 && criarHudOverlayNoWindowManager()) {
            carregarPreferenciasHud();
            carregarMapeamentoHudSalvo();
            if (z5) {
                entrarModoEdicaoHud();
                return;
            }
            if (z4) {
                entrarModoJogoHud(true);
                View view6 = this.hudOverlayView;
                if (view6 != null) {
                    view6.setVisibility(z3 ? 0 : 8);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void redimensionarWrapperAnalog(FrameLayout frameLayout, AnalogStickHudView analogStickHudView, int i) {
        int iDpParaPx = dpParaPx(28);
        int iDpParaPx2 = dpParaPx(4);
        ViewGroup.LayoutParams layoutParams = analogStickHudView.getLayoutParams();
        layoutParams.getClass();
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.width = i;
        layoutParams2.height = i;
        analogStickHudView.setLayoutParams(layoutParams2);
        int i2 = (iDpParaPx2 * 2) + i + iDpParaPx;
        ViewGroup.LayoutParams layoutParams3 = frameLayout.getLayoutParams();
        layoutParams3.getClass();
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
        layoutParams4.width = i2;
        layoutParams4.height = i2;
        frameLayout.setLayoutParams(layoutParams4);
        frameLayout.requestLayout();
    }

    private final void reempilharHudAcimaDoMenu() {
        View view;
        WindowManager.LayoutParams layoutParams;
        WindowManager windowManager = this.windowManager;
        if (windowManager == null || (view = this.hudOverlayView) == null || (layoutParams = this.hudOverlayParams) == null) {
            return;
        }
        if (!this.hudJanelaNoTopo) {
            try {
                if (view.isAttachedToWindow()) {
                    windowManager.removeViewImmediate(view);
                }
                windowManager.addView(view, layoutParams);
                this.hudJanelaNoTopo = true;
            } catch (Exception unused) {
                this.hudJanelaNoTopo = false;
                return;
            }
        }
        atualizarOrdemPaineisHud();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registrarCallbacksDaemon() {
        InjectionDaemonManager injectionDaemonManager = InjectionDaemonManager.INSTANCE;
        injectionDaemonManager.registrarListenerMira(this.listenerEstadoMira);
        injectionDaemonManager.registrarModoMao(this.listenerCursorVirtual, this.provedorPosicaoCursor);
        if (ActivationModePrefs.INSTANCE.modo(this) == ModoAtivacao.WIFI) {
            WifiDaemonClient.INSTANCE.setOnPosAbsoluta(new kc0(this, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 registrarCallbacksDaemon$lambda$16(FloatingService floatingService, int i, int i2) {
        floatingService.aplicarPosCursorDoDaemon(i, i2);
        return z32.f13265a;
    }

    private final void registrarListenerDisplays() {
        if (this.displayListener != null) {
            return;
        }
        Object systemService = getSystemService("display");
        DisplayManager displayManager = systemService instanceof DisplayManager ? (DisplayManager) systemService : null;
        if (displayManager == null) {
            return;
        }
        DisplayManager.DisplayListener displayListener = new DisplayManager.DisplayListener() { // from class: com.example.ssmousepro.FloatingService.registrarListenerDisplays.1
            @Override // android.hardware.display.DisplayManager.DisplayListener
            public void onDisplayAdded(int i) {
                FloatingService.this.agendarReavaliarDisplayOverlay();
            }

            @Override // android.hardware.display.DisplayManager.DisplayListener
            public void onDisplayChanged(int i) {
                FloatingService.this.agendarReavaliarDisplayOverlay();
            }

            @Override // android.hardware.display.DisplayManager.DisplayListener
            public void onDisplayRemoved(int i) {
                FloatingService.this.agendarReavaliarDisplayOverlay();
            }
        };
        this.displayListener = displayListener;
        displayManager.registerDisplayListener(displayListener, this.handlerMonitor);
    }

    private final void registrarListenerPerifericosHotplug() {
        if (this.listenerPerifericosHotplug != null) {
            return;
        }
        Object systemService = getSystemService("input");
        systemService.getClass();
        InputManager.InputDeviceListener inputDeviceListener = new InputManager.InputDeviceListener() { // from class: com.example.ssmousepro.FloatingService.registrarListenerPerifericosHotplug.1
            @Override // android.hardware.input.InputManager.InputDeviceListener
            public void onInputDeviceAdded(int i) {
                FloatingService.this.notificarHotplugPeriferico();
            }

            @Override // android.hardware.input.InputManager.InputDeviceListener
            public void onInputDeviceChanged(int i) {
                FloatingService.this.notificarHotplugPeriferico();
            }

            @Override // android.hardware.input.InputManager.InputDeviceListener
            public void onInputDeviceRemoved(int i) {
                FloatingService.this.notificarHotplugPeriferico();
            }
        };
        this.listenerPerifericosHotplug = inputDeviceListener;
        ((InputManager) systemService).registerInputDeviceListener(inputDeviceListener, this.handlerMonitor);
    }

    private final void removerComponentesAnalogico() {
        FrameLayout frameLayoutObterContainerHud = obterContainerHud();
        if (frameLayoutObterContainerHud == null) {
            return;
        }
        int childCount = frameLayoutObterContainerHud.getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                return;
            }
            View childAt = frameLayoutObterContainerHud.getChildAt(childCount);
            FrameLayout frameLayout = childAt instanceof FrameLayout ? (FrameLayout) childAt : null;
            if (frameLayout != null && hp0.m3214e(frameLayout.getTag(C0203R.id.tag_hud_tipo), TIPO_ANALOGICO)) {
                frameLayoutObterContainerHud.removeViewAt(childCount);
            }
        }
    }

    private final void removerListenerDisplays() {
        DisplayManager.DisplayListener displayListener = this.displayListener;
        if (displayListener == null) {
            return;
        }
        Object systemService = getSystemService("display");
        DisplayManager displayManager = systemService instanceof DisplayManager ? (DisplayManager) systemService : null;
        if (displayManager != null) {
            try {
                displayManager.unregisterDisplayListener(displayListener);
            } catch (Exception unused) {
            }
        }
        this.displayListener = null;
    }

    private final void removerListenerPerifericosHotplug() {
        InputManager.InputDeviceListener inputDeviceListener = this.listenerPerifericosHotplug;
        if (inputDeviceListener == null) {
            return;
        }
        Object systemService = getSystemService("input");
        systemService.getClass();
        ((InputManager) systemService).unregisterInputDeviceListener(inputDeviceListener);
        this.listenerPerifericosHotplug = null;
    }

    private final void removerMenuView() {
        WindowManager windowManager;
        fecharPainelConfiguracoes();
        View view = this.menuView;
        if (view == null || (windowManager = this.windowManager) == null) {
            return;
        }
        if (windowManager != null) {
            try {
                windowManager.removeView(view);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.menuView = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void repassarBotaoMouseEdicao(int i, boolean z) {
        if (this.hudEmModoEdicao && i == 272) {
            int i2 = !z ? 1 : 0;
            if (z) {
                this.editMousePressionado = true;
                this.editTouchDownTime = SystemClock.uptimeMillis();
            } else {
                this.editMousePressionado = false;
            }
            repassarTouchOverlayEdicao(i2);
        }
    }

    private final void repassarMoveOverlayEdicao() {
        if (this.editMousePressionado) {
            repassarTouchOverlayEdicao(2);
        }
    }

    private final void repassarTouchOverlayEdicao(int i) {
        long jLongValue;
        View view = this.hudOverlayView;
        if (view == null) {
            return;
        }
        bc1 bc1VarObterPontaCursorVirtual = obterPontaCursorVirtual();
        int iIntValue = ((Number) bc1VarObterPontaCursorVirtual.f1292a).intValue();
        int iIntValue2 = ((Number) bc1VarObterPontaCursorVirtual.f1293b).intValue();
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (i != 0) {
            Long lValueOf = Long.valueOf(this.editTouchDownTime);
            if (lValueOf.longValue() <= 0) {
                lValueOf = null;
            }
            if (lValueOf != null) {
                jLongValue = lValueOf.longValue();
            }
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            MotionEvent motionEventObtain = MotionEvent.obtain(jLongValue, jUptimeMillis, i, iIntValue, iIntValue2, 0);
            motionEventObtain.offsetLocation(-iArr[0], -iArr[1]);
            motionEventObtain.setSource(TouchPipeline.SOURCE_TOUCHSCREEN);
            view.dispatchTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
        }
        this.editTouchDownTime = jUptimeMillis;
        jLongValue = jUptimeMillis;
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        MotionEvent motionEventObtain2 = MotionEvent.obtain(jLongValue, jUptimeMillis, i, iIntValue, iIntValue2, 0);
        motionEventObtain2.offsetLocation(-iArr2[0], -iArr2[1]);
        motionEventObtain2.setSource(TouchPipeline.SOURCE_TOUCHSCREEN);
        view.dispatchTouchEvent(motionEventObtain2);
        motionEventObtain2.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object restaurarDpiNativo(InterfaceC0579du interfaceC0579du) {
        C01701 c01701;
        FloatingService floatingService;
        if (interfaceC0579du instanceof C01701) {
            c01701 = (C01701) interfaceC0579du;
            int i = c01701.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c01701.label = i - Integer.MIN_VALUE;
            } else {
                c01701 = new C01701(interfaceC0579du);
            }
        } else {
            c01701 = new C01701(interfaceC0579du);
        }
        C01701 c01702 = c01701;
        Object objAjustarDisplay = c01702.result;
        int i2 = c01702.label;
        if (i2 == 0) {
            ua0.m6440Z(objAjustarDisplay);
            FloatingService$restaurarDpiNativo$ok$1 floatingService$restaurarDpiNativo$ok$1 = new FloatingService$restaurarDpiNativo$ok$1(this, null);
            c01702.label = 1;
            floatingService = this;
            objAjustarDisplay = floatingService.ajustarDisplay("RESTORE density", "SET_DPI reset", "wm density reset", floatingService$restaurarDpiNativo$ok$1, c01702);
            EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
            if (objAjustarDisplay == enumC1530vu) {
                return enumC1530vu;
            }
        } else {
            if (i2 != 1) {
                f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ua0.m6440Z(objAjustarDisplay);
            floatingService = this;
        }
        if (!((Boolean) objAjustarDisplay).booleanValue()) {
            Log.w(TAG_HUD_LIFECYCLE, "Falha ao restaurar DPI nativo");
        }
        floatingService.overrideDpiAtivo = false;
        floatingService.dpiAplicada = 0;
        floatingService.handlerMonitor.post(new hb0(floatingService, 18));
        return z32.f13265a;
    }

    private final void restaurarFundoComponente(TextView textView) {
        ViewParent parent = textView.getParent();
        FrameLayout frameLayout = parent instanceof FrameLayout ? (FrameLayout) parent : null;
        Object tag = frameLayout != null ? frameLayout.getTag(C0203R.id.tag_hud_tipo) : null;
        String str = tag instanceof String ? (String) tag : null;
        if (hp0.m3214e(str, TIPO_TOQUE) || hp0.m3214e(str, TIPO_TOQUE_REP)) {
            textView.setBackgroundResource(C0203R.drawable.bg_tecla_mapeamento);
        }
    }

    private final void restaurarOverridesTela() {
        BuildersKt__Builders_commonKt.launch$default(this.serviceScope, Dispatchers.getIO(), null, new C01711(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:38:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:43:0x00ec A[Catch: all -> 0x003e, TryCatch #2 {all -> 0x003e, blocks: (B:15:0x0039, B:39:0x00cb, B:42:0x00d5, B:44:0x010c, B:43:0x00ec), top: B:55:0x0039 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Instruction removed from duplicated block: B:43:0x00ec, please report this as an issue */
    public final Object restaurarOverridesTelaVerificado(InterfaceC0579du interfaceC0579du) throws Throwable {
        C01721 c01721;
        Mutex mutex;
        int i;
        int i2;
        int i3;
        Mutex mutex2;
        boolean zBooleanValue;
        boolean z;
        boolean zBooleanValue2;
        if (interfaceC0579du instanceof C01721) {
            c01721 = (C01721) interfaceC0579du;
            int i4 = c01721.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c01721.label = i4 - Integer.MIN_VALUE;
            } else {
                c01721 = new C01721(interfaceC0579du);
            }
        } else {
            c01721 = new C01721(interfaceC0579du);
        }
        C01721 c01722 = c01721;
        Object objAjustarDisplay = c01722.result;
        Object obj = EnumC1530vu.f11768a;
        int i5 = c01722.label;
        boolean z2 = true;
        try {
            if (i5 == 0) {
                ua0.m6440Z(objAjustarDisplay);
                this.ajusteTelaGeracao++;
                this.bloqueioReaplicarAjusteAteMs = SystemClock.uptimeMillis() + 3000;
                Mutex mutex3 = this.ajusteTelaMutex;
                c01722.L$0 = mutex3;
                c01722.I$0 = 0;
                c01722.label = 1;
                if (mutex3.lock(null, c01722) != obj) {
                    mutex = mutex3;
                    i = 0;
                }
                return obj;
            }
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = c01722.Z$0;
                    mutex2 = (Mutex) c01722.L$0;
                    try {
                        ua0.m6440Z(objAjustarDisplay);
                        zBooleanValue2 = ((Boolean) objAjustarDisplay).booleanValue();
                        if (z || !zBooleanValue2) {
                            Log.w(TAG_HUD_LIFECYCLE, "RESTORE nativo FALHOU size=" + z + " density=" + zBooleanValue2);
                            this.overrideResAtivo = z ^ true;
                            this.overrideDpiAtivo = zBooleanValue2 ^ true;
                            z2 = false;
                        } else {
                            this.overrideResAtivo = false;
                            this.overrideDpiAtivo = false;
                            this.resAplicadaW = 0;
                            this.resAplicadaH = 0;
                            this.dpiAplicada = 0;
                            this.handlerMonitor.post(new hb0(this, 21));
                        }
                        Boolean boolValueOf = Boolean.valueOf(z2);
                        mutex2.unlock(null);
                        return boolValueOf;
                    } catch (Throwable th) {
                        th = th;
                        mutex2.unlock(null);
                        throw th;
                    }
                }
                i2 = c01722.I$1;
                i3 = c01722.I$0;
                Mutex mutex4 = (Mutex) c01722.L$0;
                try {
                    ua0.m6440Z(objAjustarDisplay);
                    mutex = mutex4;
                    zBooleanValue = ((Boolean) objAjustarDisplay).booleanValue();
                    og0 floatingService$restaurarOverridesTelaVerificado$2$okDpi$1 = new FloatingService$restaurarOverridesTelaVerificado$2$okDpi$1(this, null);
                    c01722.L$0 = mutex;
                    c01722.I$0 = i3;
                    c01722.I$1 = i2;
                    c01722.Z$0 = zBooleanValue;
                    c01722.label = 3;
                    objAjustarDisplay = ajustarDisplay("RESTORE density", "SET_DPI reset", "wm density reset", floatingService$restaurarOverridesTelaVerificado$2$okDpi$1, c01722);
                    if (objAjustarDisplay != obj) {
                        mutex2 = mutex;
                        z = zBooleanValue;
                        zBooleanValue2 = ((Boolean) objAjustarDisplay).booleanValue();
                        if (z) {
                            Log.w(TAG_HUD_LIFECYCLE, "RESTORE nativo FALHOU size=" + z + " density=" + zBooleanValue2);
                            this.overrideResAtivo = z ^ true;
                            this.overrideDpiAtivo = zBooleanValue2 ^ true;
                            z2 = false;
                        } else {
                            Log.w(TAG_HUD_LIFECYCLE, "RESTORE nativo FALHOU size=" + z + " density=" + zBooleanValue2);
                            this.overrideResAtivo = z ^ true;
                            this.overrideDpiAtivo = zBooleanValue2 ^ true;
                            z2 = false;
                        }
                        Boolean boolValueOf2 = Boolean.valueOf(z2);
                        mutex2.unlock(null);
                        return boolValueOf2;
                    }
                    return obj;
                } catch (Throwable th2) {
                    th = th2;
                    mutex2 = mutex4;
                    mutex2.unlock(null);
                    throw th;
                }
            }
            int i6 = c01722.I$0;
            Mutex mutex5 = (Mutex) c01722.L$0;
            ua0.m6440Z(objAjustarDisplay);
            i = i6;
            mutex = mutex5;
            og0 floatingService$restaurarOverridesTelaVerificado$2$okRes$1 = new FloatingService$restaurarOverridesTelaVerificado$2$okRes$1(this, null);
            c01722.L$0 = mutex;
            c01722.I$0 = i;
            c01722.I$1 = 0;
            c01722.label = 2;
            objAjustarDisplay = ajustarDisplay("RESTORE size", "SET_RES reset", "wm size reset", floatingService$restaurarOverridesTelaVerificado$2$okRes$1, c01722);
            if (objAjustarDisplay != obj) {
                i2 = 0;
                i3 = i;
                zBooleanValue = ((Boolean) objAjustarDisplay).booleanValue();
                og0 floatingService$restaurarOverridesTelaVerificado$2$okDpi$2 = new FloatingService$restaurarOverridesTelaVerificado$2$okDpi$1(this, null);
                c01722.L$0 = mutex;
                c01722.I$0 = i3;
                c01722.I$1 = i2;
                c01722.Z$0 = zBooleanValue;
                c01722.label = 3;
                objAjustarDisplay = ajustarDisplay("RESTORE density", "SET_DPI reset", "wm density reset", floatingService$restaurarOverridesTelaVerificado$2$okDpi$2, c01722);
                if (objAjustarDisplay != obj) {
                    mutex2 = mutex;
                    z = zBooleanValue;
                    zBooleanValue2 = ((Boolean) objAjustarDisplay).booleanValue();
                    if (z) {
                        Log.w(TAG_HUD_LIFECYCLE, "RESTORE nativo FALHOU size=" + z + " density=" + zBooleanValue2);
                        this.overrideResAtivo = z ^ true;
                        this.overrideDpiAtivo = zBooleanValue2 ^ true;
                        z2 = false;
                    } else {
                        Log.w(TAG_HUD_LIFECYCLE, "RESTORE nativo FALHOU size=" + z + " density=" + zBooleanValue2);
                        this.overrideResAtivo = z ^ true;
                        this.overrideDpiAtivo = zBooleanValue2 ^ true;
                        z2 = false;
                    }
                    Boolean boolValueOf3 = Boolean.valueOf(z2);
                    mutex2.unlock(null);
                    return boolValueOf3;
                }
            }
            return obj;
        } catch (Throwable th3) {
            th = th3;
            mutex2 = mutex;
            mutex2.unlock(null);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object restaurarResolucaoNativa(InterfaceC0579du interfaceC0579du) {
        C01731 c01731;
        FloatingService floatingService;
        if (interfaceC0579du instanceof C01731) {
            c01731 = (C01731) interfaceC0579du;
            int i = c01731.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c01731.label = i - Integer.MIN_VALUE;
            } else {
                c01731 = new C01731(interfaceC0579du);
            }
        } else {
            c01731 = new C01731(interfaceC0579du);
        }
        C01731 c01732 = c01731;
        Object objAjustarDisplay = c01732.result;
        int i2 = c01732.label;
        if (i2 == 0) {
            ua0.m6440Z(objAjustarDisplay);
            FloatingService$restaurarResolucaoNativa$ok$1 floatingService$restaurarResolucaoNativa$ok$1 = new FloatingService$restaurarResolucaoNativa$ok$1(this, null);
            c01732.label = 1;
            floatingService = this;
            objAjustarDisplay = floatingService.ajustarDisplay("RESTORE size", "SET_RES reset", "wm size reset", floatingService$restaurarResolucaoNativa$ok$1, c01732);
            EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
            if (objAjustarDisplay == enumC1530vu) {
                return enumC1530vu;
            }
        } else {
            if (i2 != 1) {
                f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ua0.m6440Z(objAjustarDisplay);
            floatingService = this;
        }
        if (!((Boolean) objAjustarDisplay).booleanValue()) {
            Log.w(TAG_HUD_LIFECYCLE, "Falha ao restaurar resolução nativa");
        }
        floatingService.overrideResAtivo = false;
        floatingService.resAplicadaW = 0;
        floatingService.resAplicadaH = 0;
        floatingService.handlerMonitor.post(new hb0(floatingService, 12));
        return z32.f13265a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View rootExteriorCurva() {
        View view = this.hudOverlayView;
        if (view != null) {
            return view.findViewById(C0203R.id.painelExteriorCurva);
        }
        return null;
    }

    private final String rotuloMouseDeKeyEvent(int i, int i2) {
        LinuxKeyCodes linuxKeyCodes = LinuxKeyCodes.INSTANCE;
        if (linuxKeyCodes.ehBotaoMouse(i2)) {
            return linuxKeyCodes.rotuloMouse(i2);
        }
        if (i2 == 158) {
            return "Voltar";
        }
        if (i2 == 159) {
            return "Avançar";
        }
        if (i == 104) {
            return linuxKeyCodes.rotuloMouse(273);
        }
        if (i == 105) {
            return linuxKeyCodes.rotuloMouse(274);
        }
        if (i == 125) {
            return linuxKeyCodes.rotuloMouse(277);
        }
        switch (i) {
            case 188:
                return linuxKeyCodes.rotuloMouse(LinuxInputConstants.BTN_MOUSE);
            case 189:
                return linuxKeyCodes.rotuloMouse(273);
            case 190:
                return linuxKeyCodes.rotuloMouse(274);
            case 191:
                return linuxKeyCodes.rotuloMouse(275);
            case 192:
                return linuxKeyCodes.rotuloMouse(276);
            default:
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sairModoEdicaoHud() throws JSONException {
        descartarAlteracoesHudNaoSalvas();
        entrarModoJogoHud$default(this, false, 1, null);
        View view = this.menuView;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private final void sairModoEscuta() {
        sairModoEscutaAnalog();
        sairModoEscutaFps();
        try {
            View view = this.hudOverlayView;
            if (view != null) {
                view.releasePointerCapture();
            }
        } catch (Exception unused) {
        }
        View view2 = this.hudOverlayView;
        if (view2 != null) {
            view2.setOnCapturedPointerListener(null);
        }
        TextView textView = this.escutaConteudo;
        if (textView != null) {
            textView.setOnCapturedPointerListener(null);
        }
        TextView textView2 = this.escutaConteudo;
        if (textView2 != null) {
            textView2.setOnGenericMotionListener(null);
        }
        TextView textView3 = this.escutaConteudo;
        if (textView3 != null) {
            textView3.setOnTouchListener(null);
        }
        TextView textView4 = this.escutaConteudo;
        if (textView4 != null) {
            textView4.setOnKeyListener(null);
        }
        TextView textView5 = this.escutaConteudo;
        if (textView5 != null) {
            restaurarFundoComponente(textView5);
        }
        this.escutaConteudo = null;
        this.escutaAoCapturar = null;
        View view3 = this.hudOverlayView;
        if (view3 != null) {
            view3.setOnKeyListener(null);
        }
        View view4 = this.hudOverlayView;
        if (view4 != null) {
            view4.setOnGenericMotionListener(null);
        }
        View view5 = this.hudOverlayView;
        if (view5 != null) {
            view5.setOnTouchListener(null);
        }
        habilitarCapturaTecladoNoHud(false);
        this.capturaIgnorarMouseAteMs = 0L;
        new Thread(new RunnableC1059l5(1)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sairModoEscuta$lambda$288() {
        InjectionDaemonManager.INSTANCE.enqueueComando("CAPTURA_FISICA 0");
    }

    private final void sairModoEscutaAnalog() {
        EditText editText = this.escutaCampoAnalog;
        if (editText != null) {
            editText.setOnKeyListener(null);
        }
        this.escutaCampoAnalog = null;
        this.escutaAnalogAoCapturar = null;
        if (this.escutaConteudo == null) {
            View view = this.hudOverlayView;
            if (view != null) {
                view.setOnKeyListener(null);
            }
            habilitarCapturaTecladoNoHud(false);
        }
    }

    private final void sairModoEscutaFps() {
        FpsViewHudView fpsViewHudView = this.escutaFpsView;
        if (fpsViewHudView != null) {
            fpsViewHudView.setModoEscuta(false);
        }
        this.escutaFpsView = null;
        this.escutaFpsWrapper = null;
        this.escutaFpsAoCapturar = null;
        if (this.escutaConteudo == null && this.escutaCampoAnalog == null) {
            View view = this.hudOverlayView;
            if (view != null) {
                view.setOnKeyListener(null);
            }
            habilitarCapturaTecladoNoHud(false);
        }
    }

    private final boolean salvarCamposAjusteTela(String str, String str2, String str3) {
        Integer numM3069z0 = gw1.m3069z0(str);
        Integer numM3069z1 = gw1.m3069z0(str2);
        Integer numM3069z2 = gw1.m3069z0(str3);
        if (numM3069z0 == null || numM3069z1 == null || numM3069z0.intValue() < 320 || numM3069z1.intValue() < 320 || numM3069z0.intValue() > 4096 || numM3069z1.intValue() > 4096) {
            Toast.makeText(this, "Tamanho inválido (320–4096).", 0).show();
            return false;
        }
        if (numM3069z2 == null || numM3069z2.intValue() < 120 || numM3069z2.intValue() > DPI_MAX) {
            Toast.makeText(this, "DPI inválido (120–640).", 0).show();
            return false;
        }
        this.resDesejadaW = Math.max(numM3069z0.intValue(), numM3069z1.intValue());
        this.resDesejadaH = Math.min(numM3069z0.intValue(), numM3069z1.intValue());
        this.dpiDesejada = numM3069z2.intValue();
        this.overrideResAtivo = false;
        this.overrideDpiAtivo = false;
        this.resAplicadaW = 0;
        this.resAplicadaH = 0;
        this.dpiAplicada = 0;
        salvarPrefsAjusteTela();
        return true;
    }

    private final void salvarConfigInterface() {
        getSharedPreferences("SSMousePrefs", 0).edit().putInt(KEY_CURSOR_SIZE, this.tamanhoCursorDp).putInt(KEY_CURSOR_LEVEL, this.nivelVelocidadeCursor).putInt(KEY_CURSOR_COLOR, this.corCursor).putInt(KEY_BALL_SIZE, this.tamanhoBolinhaDp).putFloat(KEY_BALL_OPACITY, this.opacidadeBolinha).putInt(KEY_MOUSE_POLL_HZ, this.mousePollHz).putBoolean(KEY_MONITOR_MAPEADOR, this.monitorMapeadorAtivo).putString(KEY_MONITOR_CAMPOS, AbstractC1377rp.m5873t0(this.monitorCamposVisiveis, ",", null, null, null, 62)).apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void salvarMapeamentoHud() throws JSONException {
        JSONArray jSONArrayMontarJsonHudAtual = montarJsonHudAtual();
        if (jSONArrayMontarJsonHudAtual == null) {
            return;
        }
        getSharedPreferences("SSMousePrefs", 0).edit().putString(chaveMapeamentoHud(), jSONArrayMontarJsonHudAtual.toString()).apply();
        salvarPreferenciasHud();
        if (this.hudEmModoJogo) {
            ativarTecladoNoDaemon$default(this, false, 1, null);
        }
        Toast.makeText(this, "Mapeamento salvo!", 0).show();
    }

    private final void salvarPosicaoCursorAtual() {
        ImageView imageView;
        int i;
        int i2;
        View view = this.hudOverlayView;
        if (view == null || (imageView = (ImageView) view.findViewById(C0203R.id.cursorVirtualMao)) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null && (i = layoutParams2.leftMargin) >= 0 && (i2 = layoutParams2.topMargin) >= 0) {
            this.cursorMaoMargemX = i;
            this.cursorMaoMargemY = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void salvarPreferenciasHud() {
        getSharedPreferences("SSMousePrefs", 0).edit().putFloat(chaveOpacidadeHud(), this.opacidadeNoJogo).putBoolean(chaveExibirHudJogo(), this.exibirHudDuranteJogo).putBoolean(KEY_EXIBIR_HUD_LAST, this.exibirHudDuranteJogo).apply();
    }

    private final void salvarPrefsAjusteTela() {
        getSharedPreferences("SSMousePrefs", 0).edit().putBoolean(KEY_AJUSTE_UMA_VEZ, this.ajusteTelaUmaVez).putBoolean(KEY_AJUSTE_AUTO, this.ajusteTelaAuto).putInt(KEY_RES_DESEJADA_W, this.resDesejadaW).putInt(KEY_RES_DESEJADA_H, this.resDesejadaH).putInt(KEY_DPI_DESEJADA, this.dpiDesejada).apply();
    }

    private final void salvarSensibilidade() {
        getSharedPreferences("SSMousePrefs", 0).edit().putFloat(KEY_MOUSE_SENSITIVITY, this.mouseSensitivity).apply();
    }

    private final void salvarTagsAnalogDoPainel(FrameLayout frameLayout, EditText editText) {
        Editable text;
        String string;
        Integer numM3069z0;
        frameLayout.setTag(C0203R.id.tag_hud_analog_rapidez, Integer.valueOf((editText == null || (text = editText.getText()) == null || (string = text.toString()) == null || (numM3069z0 = gw1.m3069z0(string)) == null) ? 200 : p32.m5140F(numM3069z0.intValue(), 50, 400)));
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:49:0x0102  */
    /* JADX WARN: Code duplicated, block: B:51:0x0113  */
    /* JADX WARN: Code duplicated, block: B:72:0x0116 A[SYNTHETIC] */
    private final JSONArray sanitizarEntradasHud(JSONArray jSONArray) throws JSONException {
        String string;
        String str;
        String string2;
        String strResolverTeclaHud;
        Set<String> set;
        String upperCase;
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i2);
            jSONObject.getClass();
            arrayList.add(jSONObject);
        }
        co0 co0Var = new co0(0, arrayList.size() - 1, 1);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = co0Var.iterator();
        while (true) {
            bo0 bo0Var = (bo0) it;
            if (!bo0Var.f1456c) {
                break;
            }
            Object next = bo0Var.next();
            if (hp0.m3214e(((JSONObject) arrayList.get(((Number) next).intValue())).optString("tipo"), TIPO_ANALOGICO)) {
                arrayList2.add(next);
            }
        }
        if (!arrayList2.isEmpty()) {
            int iIntValue = ((Number) AbstractC1377rp.m5874u0(arrayList2)).intValue();
            ArrayList arrayList3 = new ArrayList();
            int size = arrayList.size();
            int i3 = 0;
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                int i5 = i3 + 1;
                if (i3 < 0) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                JSONObject jSONObject2 = (JSONObject) obj;
                String strOptString = jSONObject2.optString("tipo");
                if (strOptString == null) {
                    arrayList3.add(obj);
                } else {
                    int iHashCode = strOptString.hashCode();
                    if (iHashCode != 80009798) {
                        if (iHashCode != 114209540) {
                            if (iHashCode == 1083955077 && strOptString.equals(TIPO_ANALOGICO) && i3 != iIntValue) {
                            }
                        } else if (strOptString.equals(TIPO_TOQUE_REP)) {
                            String strOptString2 = jSONObject2.optString("teclaTag", "");
                            strOptString2.getClass();
                            string = zv1.m7383W0(strOptString2).toString();
                            str = null;
                            if (zv1.m7371K0(string)) {
                                string = null;
                            }
                            String strOptString3 = jSONObject2.optString("tecla", "");
                            strOptString3.getClass();
                            string2 = zv1.m7383W0(strOptString3).toString();
                            strResolverTeclaHud = LinuxKeyCodes.INSTANCE.resolverTeclaHud(string2, string);
                            if (strResolverTeclaHud == null) {
                                str = strResolverTeclaHud;
                            } else if (!zv1.m7371K0(string2) && !string2.equals("?")) {
                                str = string2;
                            }
                            if (str != null) {
                                set = TECLAS_ANALOGICO;
                                upperCase = str.toUpperCase(Locale.ROOT);
                                upperCase.getClass();
                                if (!set.contains(upperCase)) {
                                }
                            }
                        }
                        arrayList3.add(obj);
                    } else if (strOptString.equals(TIPO_TOQUE)) {
                        String strOptString4 = jSONObject2.optString("teclaTag", "");
                        strOptString4.getClass();
                        string = zv1.m7383W0(strOptString4).toString();
                        str = null;
                        if (zv1.m7371K0(string)) {
                            string = null;
                        }
                        String strOptString5 = jSONObject2.optString("tecla", "");
                        strOptString5.getClass();
                        string2 = zv1.m7383W0(strOptString5).toString();
                        strResolverTeclaHud = LinuxKeyCodes.INSTANCE.resolverTeclaHud(string2, string);
                        if (strResolverTeclaHud == null) {
                            str = strResolverTeclaHud;
                        } else if (!zv1.m7371K0(string2)) {
                            str = string2;
                        }
                        if (str != null) {
                            set = TECLAS_ANALOGICO;
                            upperCase = str.toUpperCase(Locale.ROOT);
                            upperCase.getClass();
                            if (!set.contains(upperCase)) {
                                arrayList3.add(obj);
                            }
                        } else {
                            arrayList3.add(obj);
                        }
                    } else {
                        arrayList3.add(obj);
                    }
                }
                i3 = i5;
            }
            if (arrayList3.size() != arrayList.size()) {
                arrayList.size();
                arrayList3.size();
                JSONArray jSONArray2 = new JSONArray();
                int size2 = arrayList3.size();
                while (i < size2) {
                    Object obj2 = arrayList3.get(i);
                    i++;
                    jSONArray2.put((JSONObject) obj2);
                }
                return jSONArray2;
            }
        }
        return jSONArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object semOverrideDeDensidade(InterfaceC0579du interfaceC0579du) {
        C01741 c01741;
        if (interfaceC0579du instanceof C01741) {
            c01741 = (C01741) interfaceC0579du;
            int i = c01741.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c01741.label = i - Integer.MIN_VALUE;
            } else {
                c01741 = new C01741(interfaceC0579du);
            }
        } else {
            c01741 = new C01741(interfaceC0579du);
        }
        Object objWmDensityAtual = c01741.result;
        int i2 = c01741.label;
        if (i2 == 0) {
            ua0.m6440Z(objWmDensityAtual);
            c01741.label = 1;
            objWmDensityAtual = wmDensityAtual(c01741);
            Object obj = EnumC1530vu.f11768a;
            if (objWmDensityAtual == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ua0.m6440Z(objWmDensityAtual);
        }
        String str = (String) objWmDensityAtual;
        return Boolean.valueOf((zv1.m7371K0(str) || zv1.m7365E0(str, "Override density", true)) ? false : true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object semOverrideDeTamanho(InterfaceC0579du interfaceC0579du) {
        C01751 c01751;
        if (interfaceC0579du instanceof C01751) {
            c01751 = (C01751) interfaceC0579du;
            int i = c01751.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c01751.label = i - Integer.MIN_VALUE;
            } else {
                c01751 = new C01751(interfaceC0579du);
            }
        } else {
            c01751 = new C01751(interfaceC0579du);
        }
        Object objWmSizeAtual = c01751.result;
        int i2 = c01751.label;
        if (i2 == 0) {
            ua0.m6440Z(objWmSizeAtual);
            c01751.label = 1;
            objWmSizeAtual = wmSizeAtual(c01751);
            Object obj = EnumC1530vu.f11768a;
            if (objWmSizeAtual == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ua0.m6440Z(objWmSizeAtual);
        }
        String str = (String) objWmSizeAtual;
        return Boolean.valueOf((zv1.m7371K0(str) || zv1.m7365E0(str, "Override size", true)) ? false : true);
    }

    private final int sensibilidadeParaProgresso(float f) {
        return (int) ((p32.m5139E(f, 0.5f, SENSI_MAX) - 0.5f) / 0.1f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sincronizarAcelLimiarNoDaemon(FrameLayout frameLayout) {
        Integer numParaEvdev;
        String strObterAcelLimiarTecla = obterAcelLimiarTecla(frameLayout);
        int iIntValue = (strObterAcelLimiarTecla == null || (numParaEvdev = LinuxKeyCodes.INSTANCE.paraEvdev(strObterAcelLimiarTecla)) == null) ? 0 : numParaEvdev.intValue();
        FpsAcelLimiarConfig fpsAcelLimiarConfig = FpsAcelLimiarConfig.INSTANCE;
        fpsAcelLimiarConfig.setAtivo(obterAcelLimiarAtivo(frameLayout));
        fpsAcelLimiarConfig.setThresholdX(obterAcelLimiarLimX(frameLayout));
        fpsAcelLimiarConfig.setGainXPermil(obterAcelLimiarGainX(frameLayout) * 10);
        fpsAcelLimiarConfig.setThresholdY(obterAcelLimiarLimY(frameLayout));
        fpsAcelLimiarConfig.setGainYPermil(obterAcelLimiarGainY(frameLayout) * 10);
        fpsAcelLimiarConfig.setHoldCode(iIntValue);
        new Thread(new RunnableC1059l5(2)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sincronizarAcelLimiarNoDaemon$lambda$218() {
        InjectionDaemonManager.INSTANCE.enqueueComando(FpsAcelLimiarConfig.INSTANCE.comandoSincronizar());
    }

    private final void sincronizarDebugExteriorCurva() {
        if (precisaDebugExteriorCurva()) {
            iniciarDebugExteriorFps();
        } else {
            pararDebugExteriorFps();
        }
    }

    private final void sincronizarDisplayInjecao(OverlayDisplayBinder.Alvo alvo) {
        new Thread(new RunnableC1467u4(15, alvo, alvo.metrics())).start();
    }

    public static /* synthetic */ void sincronizarDisplayInjecao$default(FloatingService floatingService, OverlayDisplayBinder.Alvo alvo, int i, Object obj) {
        if ((i & 1) != 0) {
            OverlayDisplayBinder overlayDisplayBinder = OverlayDisplayBinder.INSTANCE;
            Context applicationContext = floatingService.getApplicationContext();
            applicationContext.getClass();
            alvo = overlayDisplayBinder.resolver(applicationContext);
        }
        floatingService.sincronizarDisplayInjecao(alvo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sincronizarDisplayInjecao$lambda$25(OverlayDisplayBinder.Alvo alvo, DisplayMetrics displayMetrics) {
        int i;
        InjectionDaemonManager injectionDaemonManager = InjectionDaemonManager.INSTANCE;
        injectionDaemonManager.enqueueComando("DISPLAY_ID " + alvo.getDisplayId());
        int i2 = displayMetrics.widthPixels;
        if (i2 <= 0 || (i = displayMetrics.heightPixels) <= 0) {
            return;
        }
        injectionDaemonManager.enqueueComando("SCREEN " + i2 + " " + i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sincronizarFiltrosProdutoNoDaemon() {
        FpsLowSpeedGainConfig fpsLowSpeedGainConfig = FpsLowSpeedGainConfig.INSTANCE;
        fpsLowSpeedGainConfig.aplicarPadraoProduto();
        FpsAcelLimiarConfig fpsAcelLimiarConfig = FpsAcelLimiarConfig.INSTANCE;
        fpsAcelLimiarConfig.desligarProduto();
        InjectionDaemonManager injectionDaemonManager = InjectionDaemonManager.INSTANCE;
        injectionDaemonManager.enqueueComando(fpsLowSpeedGainConfig.comandoSincronizar());
        injectionDaemonManager.enqueueComando(fpsAcelLimiarConfig.comandoSincronizar());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sincronizarLowSpeedNoDaemon(FrameLayout frameLayout) {
        Integer numParaEvdev;
        Integer numParaEvdev2;
        String strObterLowSpeedTeclaX = obterLowSpeedTeclaX(frameLayout);
        String strObterLowSpeedTeclaY = obterLowSpeedTeclaY(frameLayout);
        FpsLowSpeedGainConfig fpsLowSpeedGainConfig = FpsLowSpeedGainConfig.INSTANCE;
        fpsLowSpeedGainConfig.setAtivoX(obterLowSpeedAtivoX(frameLayout));
        fpsLowSpeedGainConfig.setThresholdX(obterLowSpeedLimX(frameLayout));
        fpsLowSpeedGainConfig.setPrecisionXPermil(obterLowSpeedFatorX(frameLayout) * 10);
        int iIntValue = 0;
        fpsLowSpeedGainConfig.setHoldCodeX((strObterLowSpeedTeclaX == null || (numParaEvdev2 = LinuxKeyCodes.INSTANCE.paraEvdev(strObterLowSpeedTeclaX)) == null) ? 0 : numParaEvdev2.intValue());
        fpsLowSpeedGainConfig.setAtivoY(obterLowSpeedAtivoY(frameLayout));
        fpsLowSpeedGainConfig.setThresholdY(obterLowSpeedLimY(frameLayout));
        fpsLowSpeedGainConfig.setPrecisionYPermil(obterLowSpeedFatorY(frameLayout) * 10);
        if (strObterLowSpeedTeclaY != null && (numParaEvdev = LinuxKeyCodes.INSTANCE.paraEvdev(strObterLowSpeedTeclaY)) != null) {
            iIntValue = numParaEvdev.intValue();
        }
        fpsLowSpeedGainConfig.setHoldCodeY(iIntValue);
        new Thread(new RunnableC1059l5(5)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sincronizarLowSpeedNoDaemon$lambda$210() {
        InjectionDaemonManager.INSTANCE.enqueueComando(FpsLowSpeedGainConfig.INSTANCE.comandoSincronizar());
    }

    private final void sincronizarMonitorMapeador() {
        if (precisaMonitorMapeador()) {
            iniciarMonitorMapeador();
        } else {
            pararMonitorMapeador();
        }
    }

    private final void sincronizarPainelFpsSeAberto(FrameLayout frameLayout) {
        View view;
        View viewFindViewById;
        if (hp0.m3214e(this.fpsWrapperEmEdicao, frameLayout) && (view = this.hudOverlayView) != null && (viewFindViewById = view.findViewById(C0203R.id.panelConfigFps)) != null && viewFindViewById.getVisibility() == 0) {
            EditText editText = (EditText) viewFindViewById.findViewById(C0203R.id.edtFpsSensX);
            if (editText != null) {
                editText.setText(formatarSensFpsUi(obterSensFpsX(frameLayout)));
            }
            EditText editText2 = (EditText) viewFindViewById.findViewById(C0203R.id.edtFpsSensY);
            if (editText2 != null) {
                editText2.setText(formatarSensFpsUi(obterSensFpsY(frameLayout)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean toqueDentroDaView(MotionEvent motionEvent, View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int i = iArr[0];
        if (rawX >= i && rawX <= view.getWidth() + i) {
            int i2 = iArr[1];
            if (rawY >= i2 && rawY <= view.getHeight() + i2) {
                return true;
            }
        }
        return false;
    }

    private final void trazerCursorVirtualFrente() {
        View view;
        ImageView imageView;
        if (!this.cursorMaoVisivel || (view = this.hudOverlayView) == null || (imageView = (ImageView) view.findViewById(C0203R.id.cursorVirtualMao)) == null) {
            return;
        }
        imageView.bringToFront();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String valorEmVigor(String str, String str2) {
        if (!zv1.m7371K0(str)) {
            Pattern patternCompile = Pattern.compile("Override " + str2 + ":\\s*(\\S+)", 66);
            patternCompile.getClass();
            Matcher matcher = patternCompile.matcher(str);
            matcher.getClass();
            qo0 qo0Var = !matcher.find(0) ? null : new qo0(matcher, str);
            if (qo0Var != null) {
                return (String) ((wy0) qo0Var.m5586I()).get(1);
            }
            Pattern patternCompile2 = Pattern.compile("Physical " + str2 + ":\\s*(\\S+)", 66);
            patternCompile2.getClass();
            Matcher matcher2 = patternCompile2.matcher(str);
            matcher2.getClass();
            qo0 qo0Var2 = !matcher2.find(0) ? null : new qo0(matcher2, str);
            if (qo0Var2 != null) {
                return (String) ((wy0) qo0Var2.m5586I()).get(1);
            }
        }
        return null;
    }

    private final void verificarSaudeCanalInjecao() {
        if (this.hudEmModoJogo && PrivilegeGate.INSTANCE.estaProntoParaInjecao(this)) {
            final long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.ultimaVerificacaoSaudeMs < 15000) {
                return;
            }
            this.ultimaVerificacaoSaudeMs = jCurrentTimeMillis;
            new Thread(new Runnable() { // from class: yb0
                @Override // java.lang.Runnable
                public final void run() {
                    FloatingService.verificarSaudeCanalInjecao$lambda$15(this.f12926a, jCurrentTimeMillis);
                }
            }).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void verificarSaudeCanalInjecao$lambda$15(FloatingService floatingService, long j) {
        InjectionDaemonManager injectionDaemonManager = InjectionDaemonManager.INSTANCE;
        String packageName = floatingService.getPackageName();
        packageName.getClass();
        if (!injectionDaemonManager.garantirCanalOperacional(packageName)) {
            floatingService.handlerMonitor.post(new hb0(floatingService, 8));
            return;
        }
        if (j - floatingService.ultimaEnsureRedeMs >= 90000) {
            floatingService.ultimaEnsureRedeMs = j;
            injectionDaemonManager.enqueueComando(InjectionProtocol.INPUT_ENSURE);
        }
        floatingService.handlerMonitor.post(new hb0(floatingService, 9));
    }

    private final void vincularCallbacksFpsView(FrameLayout frameLayout, FpsViewHudView fpsViewHudView) {
        fpsViewHudView.setOnSensXChanged(new wb0(0, frameLayout, this));
        fpsViewHudView.setOnSensYChanged(new wb0(1, frameLayout, this));
        fpsViewHudView.setOnCentroClick(new mc0(this, frameLayout, fpsViewHudView, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 vincularCallbacksFpsView$lambda$150(FrameLayout frameLayout, FloatingService floatingService, float f) {
        frameLayout.setTag(C0203R.id.tag_hud_fps_sens_x, Float.valueOf(f));
        floatingService.sincronizarPainelFpsSeAberto(frameLayout);
        return z32.f13265a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 vincularCallbacksFpsView$lambda$151(FrameLayout frameLayout, FloatingService floatingService, float f) {
        frameLayout.setTag(C0203R.id.tag_hud_fps_sens_y, Float.valueOf(f));
        floatingService.sincronizarPainelFpsSeAberto(frameLayout);
        return z32.f13265a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 vincularCallbacksFpsView$lambda$152(FloatingService floatingService, FrameLayout frameLayout, FpsViewHudView fpsViewHudView) {
        if (floatingService.hudEmModoEdicao) {
            capturarTeclaFps$default(floatingService, frameLayout, fpsViewHudView, null, 4, null);
        }
        return z32.f13265a;
    }

    private final void vincularOverlayAoDisplayAlvo(boolean z) {
        try {
            OverlayDisplayBinder overlayDisplayBinder = OverlayDisplayBinder.INSTANCE;
            Context applicationContext = getApplicationContext();
            applicationContext.getClass();
            OverlayDisplayBinder.Alvo alvoResolver = overlayDisplayBinder.resolver(applicationContext);
            boolean z2 = this.overlayDisplayId != alvoResolver.getDisplayId() || this.windowManager == null;
            this.overlayContext = alvoResolver.getContext();
            this.windowManager = alvoResolver.getWindowManager();
            this.overlayDisplayId = alvoResolver.getDisplayId();
            sincronizarDisplayInjecao(alvoResolver);
            if (z2 || z) {
                alvoResolver.getDisplay().getName();
            }
            registrarListenerDisplays();
        } catch (Exception e) {
            Log.w(TAG_HUD_LIFECYCLE, "Falha ao resolver display overlay", e);
            Object systemService = getSystemService("window");
            systemService.getClass();
            this.windowManager = (WindowManager) systemService;
            this.overlayContext = this;
            this.overlayDisplayId = 0;
        }
    }

    private final void vincularUiAcelLimiar(View view, final FrameLayout frameLayout) {
        EditText editText;
        String strRotuloExibicaoHud;
        Switch r3 = (Switch) view.findViewById(C0203R.id.switchFpsAcelLimiar);
        SeekBar seekBar = (SeekBar) view.findViewById(C0203R.id.seekFpsAcelLimiarLimX);
        SeekBar seekBar2 = (SeekBar) view.findViewById(C0203R.id.seekFpsAcelLimiarGainX);
        final TextView textView = (TextView) view.findViewById(C0203R.id.txtFpsAcelLimiarLimX);
        final TextView textView2 = (TextView) view.findViewById(C0203R.id.txtFpsAcelLimiarGainX);
        SeekBar seekBar3 = (SeekBar) view.findViewById(C0203R.id.seekFpsAcelLimiarLimY);
        SeekBar seekBar4 = (SeekBar) view.findViewById(C0203R.id.seekFpsAcelLimiarGainY);
        final TextView textView3 = (TextView) view.findViewById(C0203R.id.txtFpsAcelLimiarLimY);
        final TextView textView4 = (TextView) view.findViewById(C0203R.id.txtFpsAcelLimiarGainY);
        EditText editText2 = (EditText) view.findViewById(C0203R.id.edtFpsAcelLimiarTecla);
        int iObterAcelLimiarLimX = obterAcelLimiarLimX(frameLayout);
        int iObterAcelLimiarGainX = obterAcelLimiarGainX(frameLayout);
        int iObterAcelLimiarLimY = obterAcelLimiarLimY(frameLayout);
        int iObterAcelLimiarGainY = obterAcelLimiarGainY(frameLayout);
        if (r3 != null) {
            r3.setOnCheckedChangeListener(null);
        }
        if (r3 != null) {
            r3.setChecked(obterAcelLimiarAtivo(frameLayout));
        }
        if (seekBar != null) {
            seekBar.setProgress(iObterAcelLimiarLimX);
        }
        if (seekBar2 != null) {
            seekBar2.setProgress(p32.m5140F(iObterAcelLimiarGainX - 110, 0, 190));
        }
        if (textView != null) {
            textView.setText(String.valueOf(iObterAcelLimiarLimX));
        }
        if (textView2 != null) {
            textView2.setText(String.format(Locale.US, "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(iObterAcelLimiarGainX / 100.0f)}, 1)));
        }
        if (seekBar3 != null) {
            seekBar3.setProgress(iObterAcelLimiarLimY);
        }
        if (seekBar4 != null) {
            seekBar4.setProgress(p32.m5140F(iObterAcelLimiarGainY - 110, 0, 190));
        }
        if (textView3 != null) {
            textView3.setText(String.valueOf(iObterAcelLimiarLimY));
        }
        if (textView4 != null) {
            textView4.setText(String.format(Locale.US, "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(iObterAcelLimiarGainY / 100.0f)}, 1)));
        }
        String strObterAcelLimiarTecla = obterAcelLimiarTecla(frameLayout);
        if (editText2 != null) {
            if (strObterAcelLimiarTecla == null || (strRotuloExibicaoHud = LinuxKeyCodes.INSTANCE.rotuloExibicaoHud(strObterAcelLimiarTecla)) == null) {
                strRotuloExibicaoHud = "—";
            }
            editText = editText2;
            editText.setText(strRotuloExibicaoHud);
        } else {
            editText = editText2;
        }
        int i = 2;
        if (r3 != null) {
            r3.setOnCheckedChangeListener(new jb0(i, frameLayout, this));
        }
        if (seekBar != 0) {
            seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.example.ssmousepro.FloatingService.vincularUiAcelLimiar.3
                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onProgressChanged(SeekBar seekBar5, int i2, boolean z) {
                    TextView textView5 = textView;
                    if (textView5 != null) {
                        textView5.setText(String.valueOf(i2));
                    }
                    if (z) {
                        frameLayout.setTag(C0203R.id.tag_hud_fps_acel_limiar_lim_x, Integer.valueOf(i2));
                    }
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onStopTrackingTouch(SeekBar seekBar5) throws JSONException {
                    frameLayout.setTag(C0203R.id.tag_hud_fps_acel_limiar_lim_x, Integer.valueOf(seekBar5 != null ? seekBar5.getProgress() : 0));
                    this.sincronizarAcelLimiarNoDaemon(frameLayout);
                    this.salvarMapeamentoHud();
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onStartTrackingTouch(SeekBar seekBar5) {
                }
            });
        }
        if (seekBar2 != null) {
            seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.example.ssmousepro.FloatingService.vincularUiAcelLimiar.4
                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onProgressChanged(SeekBar seekBar5, int i2, boolean z) {
                    int iM5140F = p32.m5140F(i2 + FloatingService.BALL_SIZE_MAX, FloatingService.BALL_SIZE_MAX, 300);
                    TextView textView5 = textView2;
                    if (textView5 != null) {
                        textView5.setText(String.format(Locale.US, "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(iM5140F / 100.0f)}, 1)));
                    }
                    if (z) {
                        frameLayout.setTag(C0203R.id.tag_hud_fps_acel_limiar_gain_x, Integer.valueOf(iM5140F));
                    }
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onStopTrackingTouch(SeekBar seekBar5) throws JSONException {
                    frameLayout.setTag(C0203R.id.tag_hud_fps_acel_limiar_gain_x, Integer.valueOf(p32.m5140F((seekBar5 != null ? seekBar5.getProgress() : 0) + FloatingService.BALL_SIZE_MAX, FloatingService.BALL_SIZE_MAX, 300)));
                    this.sincronizarAcelLimiarNoDaemon(frameLayout);
                    this.salvarMapeamentoHud();
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onStartTrackingTouch(SeekBar seekBar5) {
                }
            });
        }
        if (seekBar3 != null) {
            seekBar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.example.ssmousepro.FloatingService.vincularUiAcelLimiar.5
                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onProgressChanged(SeekBar seekBar5, int i2, boolean z) {
                    TextView textView5 = textView3;
                    if (textView5 != null) {
                        textView5.setText(String.valueOf(i2));
                    }
                    if (z) {
                        frameLayout.setTag(C0203R.id.tag_hud_fps_acel_limiar_lim_y, Integer.valueOf(i2));
                    }
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onStopTrackingTouch(SeekBar seekBar5) throws JSONException {
                    frameLayout.setTag(C0203R.id.tag_hud_fps_acel_limiar_lim_y, Integer.valueOf(seekBar5 != null ? seekBar5.getProgress() : 0));
                    this.sincronizarAcelLimiarNoDaemon(frameLayout);
                    this.salvarMapeamentoHud();
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onStartTrackingTouch(SeekBar seekBar5) {
                }
            });
        }
        if (seekBar4 != null) {
            seekBar4.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.example.ssmousepro.FloatingService.vincularUiAcelLimiar.6
                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onProgressChanged(SeekBar seekBar5, int i2, boolean z) {
                    int iM5140F = p32.m5140F(i2 + FloatingService.BALL_SIZE_MAX, FloatingService.BALL_SIZE_MAX, 300);
                    TextView textView5 = textView4;
                    if (textView5 != null) {
                        textView5.setText(String.format(Locale.US, "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(iM5140F / 100.0f)}, 1)));
                    }
                    if (z) {
                        frameLayout.setTag(C0203R.id.tag_hud_fps_acel_limiar_gain_y, Integer.valueOf(iM5140F));
                    }
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onStopTrackingTouch(SeekBar seekBar5) throws JSONException {
                    frameLayout.setTag(C0203R.id.tag_hud_fps_acel_limiar_gain_y, Integer.valueOf(p32.m5140F((seekBar5 != null ? seekBar5.getProgress() : 0) + FloatingService.BALL_SIZE_MAX, FloatingService.BALL_SIZE_MAX, 300)));
                    this.sincronizarAcelLimiarNoDaemon(frameLayout);
                    this.salvarMapeamentoHud();
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onStartTrackingTouch(SeekBar seekBar5) {
                }
            });
        }
        if (editText != null) {
            editText.setOnClickListener(new kb0(this, editText, frameLayout, 3));
        }
        if (editText != null) {
            editText.setOnLongClickListener(new lb0(frameLayout, editText, this, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void vincularUiAcelLimiar$lambda$212(FrameLayout frameLayout, FloatingService floatingService, CompoundButton compoundButton, boolean z) throws JSONException {
        compoundButton.getClass();
        frameLayout.setTag(C0203R.id.tag_hud_fps_acel_limiar_ativo, Boolean.valueOf(z));
        floatingService.sincronizarAcelLimiarNoDaemon(frameLayout);
        floatingService.salvarMapeamentoHud();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void vincularUiAcelLimiar$lambda$214(FloatingService floatingService, EditText editText, FrameLayout frameLayout, View view) {
        floatingService.capturarTeclaAnalog(editText, new gb0(frameLayout, editText, floatingService, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 vincularUiAcelLimiar$lambda$214$lambda$213(FrameLayout frameLayout, EditText editText, FloatingService floatingService, String str) throws JSONException {
        str.getClass();
        frameLayout.setTag(C0203R.id.tag_hud_fps_acel_limiar_tecla, str);
        editText.setText(LinuxKeyCodes.INSTANCE.rotuloExibicaoHud(str));
        floatingService.sincronizarAcelLimiarNoDaemon(frameLayout);
        floatingService.salvarMapeamentoHud();
        return z32.f13265a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean vincularUiAcelLimiar$lambda$215(FrameLayout frameLayout, EditText editText, FloatingService floatingService, View view) throws JSONException {
        frameLayout.setTag(C0203R.id.tag_hud_fps_acel_limiar_tecla, null);
        editText.setText("—");
        floatingService.sincronizarAcelLimiarNoDaemon(frameLayout);
        floatingService.salvarMapeamentoHud();
        Toast.makeText(floatingService, "Tecla de aceleração removida", 0).show();
        return true;
    }

    private final void vincularUiAntiBlock(View view, final FrameLayout frameLayout) {
        int i;
        View viewFindViewById = view.findViewById(C0203R.id.grupoFpsAntiBlock);
        if (!DevToolsGate.INSTANCE.getLiberado()) {
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(8);
                return;
            }
            return;
        }
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(0);
        }
        RadioGroup radioGroup = (RadioGroup) view.findViewById(C0203R.id.radioFpsAntiBlock);
        if (radioGroup == null) {
            return;
        }
        final TextView textView = (TextView) view.findViewById(C0203R.id.txtFpsAntiBlockHint);
        FpsAntiBlockModo fpsAntiBlockModoObterAntiBlockFps = obterAntiBlockFps(frameLayout);
        int i2 = WhenMappings.$EnumSwitchMapping$1[fpsAntiBlockModoObterAntiBlockFps.ordinal()];
        if (i2 == 1) {
            i = C0203R.id.radioAntiBlockSsMouse;
        } else if (i2 == 2) {
            i = C0203R.id.radioAntiBlockGgMouse;
        } else if (i2 == 3) {
            i = C0203R.id.radioAntiBlockBluestacks;
        } else {
            if (i2 != 4) {
                C0694gy.m3076b();
                return;
            }
            i = C0203R.id.radioAntiBlockSspro;
        }
        radioGroup.setOnCheckedChangeListener(null);
        radioGroup.check(i);
        if (textView != null) {
            textView.setText(hintAntiBlock(fpsAntiBlockModoObterAntiBlockFps));
        }
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: mb0
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup2, int i3) throws JSONException {
                FloatingService.vincularUiAntiBlock$lambda$175(textView, this, frameLayout, radioGroup2, i3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void vincularUiAntiBlock$lambda$175(TextView textView, FloatingService floatingService, FrameLayout frameLayout, RadioGroup radioGroup, int i) throws JSONException {
        FpsAntiBlockModo fpsAntiBlockModo;
        radioGroup.getClass();
        if (i == C0203R.id.radioAntiBlockGgMouse) {
            fpsAntiBlockModo = FpsAntiBlockModo.GG_MOUSE;
        } else if (i == C0203R.id.radioAntiBlockBluestacks) {
            fpsAntiBlockModo = FpsAntiBlockModo.BLUESTACKS;
        } else {
            fpsAntiBlockModo = i == C0203R.id.radioAntiBlockSsMouse ? FpsAntiBlockModo.SS_MOUSE : FpsAntiBlockModo.SSPRO;
        }
        if (textView != null) {
            textView.setText(floatingService.hintAntiBlock(fpsAntiBlockModo));
        }
        floatingService.aplicarAntiBlockFps(frameLayout, fpsAntiBlockModo);
    }

    private final void vincularUiLowSpeed(View view, final FrameLayout frameLayout) {
        final TextView textView;
        EditText editText;
        EditText editText2;
        int i;
        int i2;
        String strRotuloExibicaoHud;
        String strRotuloExibicaoHud2;
        Switch r3 = (Switch) view.findViewById(C0203R.id.switchFpsLowSpeedX);
        SeekBar seekBar = (SeekBar) view.findViewById(C0203R.id.seekFpsLowSpeedLimX);
        SeekBar seekBar2 = (SeekBar) view.findViewById(C0203R.id.seekFpsLowSpeedFatorX);
        final TextView textView2 = (TextView) view.findViewById(C0203R.id.txtFpsLowSpeedLimX);
        final TextView textView3 = (TextView) view.findViewById(C0203R.id.txtFpsLowSpeedFatorX);
        EditText editText3 = (EditText) view.findViewById(C0203R.id.edtFpsLowSpeedTeclaX);
        Switch r9 = (Switch) view.findViewById(C0203R.id.switchFpsLowSpeedY);
        SeekBar seekBar3 = (SeekBar) view.findViewById(C0203R.id.seekFpsLowSpeedLimY);
        SeekBar seekBar4 = (SeekBar) view.findViewById(C0203R.id.seekFpsLowSpeedFatorY);
        final TextView textView4 = (TextView) view.findViewById(C0203R.id.txtFpsLowSpeedLimY);
        TextView textView5 = (TextView) view.findViewById(C0203R.id.txtFpsLowSpeedFatorY);
        EditText editText4 = (EditText) view.findViewById(C0203R.id.edtFpsLowSpeedTeclaY);
        int iObterLowSpeedLimX = obterLowSpeedLimX(frameLayout);
        int iObterLowSpeedFatorX = obterLowSpeedFatorX(frameLayout);
        int iObterLowSpeedLimY = obterLowSpeedLimY(frameLayout);
        int iObterLowSpeedFatorY = obterLowSpeedFatorY(frameLayout);
        if (r3 != null) {
            r3.setOnCheckedChangeListener(null);
        }
        if (r9 != null) {
            r9.setOnCheckedChangeListener(null);
        }
        if (r3 != null) {
            r3.setChecked(obterLowSpeedAtivoX(frameLayout));
        }
        if (r9 != null) {
            r9.setChecked(obterLowSpeedAtivoY(frameLayout));
        }
        if (seekBar != null) {
            seekBar.setProgress(iObterLowSpeedLimX);
        }
        if (seekBar2 != null) {
            seekBar2.setProgress(p32.m5140F(iObterLowSpeedFatorX - 10, 0, 90));
        }
        if (textView2 != null) {
            textView2.setText(String.valueOf(iObterLowSpeedLimX));
        }
        if (textView3 != null) {
            textView3.setText(String.format(Locale.US, "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(iObterLowSpeedFatorX / 100.0f)}, 1)));
        }
        if (seekBar3 != null) {
            seekBar3.setProgress(iObterLowSpeedLimY);
        }
        if (seekBar4 != null) {
            seekBar4.setProgress(p32.m5140F(iObterLowSpeedFatorY - 10, 0, 90));
        }
        if (textView4 != null) {
            textView4.setText(String.valueOf(iObterLowSpeedLimY));
        }
        if (textView5 != null) {
            textView = textView5;
            textView.setText(String.format(Locale.US, "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(iObterLowSpeedFatorY / 100.0f)}, 1)));
        } else {
            textView = textView5;
        }
        String strObterLowSpeedTeclaX = obterLowSpeedTeclaX(frameLayout);
        String strObterLowSpeedTeclaY = obterLowSpeedTeclaY(frameLayout);
        String str = "—";
        if (editText3 != null) {
            if (strObterLowSpeedTeclaX == null || (strRotuloExibicaoHud2 = LinuxKeyCodes.INSTANCE.rotuloExibicaoHud(strObterLowSpeedTeclaX)) == null) {
                strRotuloExibicaoHud2 = "—";
            }
            editText = editText3;
            editText.setText(strRotuloExibicaoHud2);
        } else {
            editText = editText3;
        }
        if (editText4 != null) {
            if (strObterLowSpeedTeclaY != null && (strRotuloExibicaoHud = LinuxKeyCodes.INSTANCE.rotuloExibicaoHud(strObterLowSpeedTeclaY)) != null) {
                str = strRotuloExibicaoHud;
            }
            editText2 = editText4;
            editText2.setText(str);
        }
        if (r3 != null) {
            editText2 = editText4;
            r3.setOnCheckedChangeListener(new jb0(0, frameLayout, this));
        }
        if (r9 != null) {
            r9.setOnCheckedChangeListener(new jb0(1, frameLayout, this));
        }
        if (seekBar != 0) {
            seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.example.ssmousepro.FloatingService.vincularUiLowSpeed.5
                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onProgressChanged(SeekBar seekBar5, int i3, boolean z) {
                    TextView textView6 = textView2;
                    if (textView6 != null) {
                        textView6.setText(String.valueOf(i3));
                    }
                    if (z) {
                        frameLayout.setTag(C0203R.id.tag_hud_fps_low_speed_lim_x, Integer.valueOf(i3));
                    }
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onStopTrackingTouch(SeekBar seekBar5) throws JSONException {
                    frameLayout.setTag(C0203R.id.tag_hud_fps_low_speed_lim_x, Integer.valueOf(seekBar5 != null ? seekBar5.getProgress() : 0));
                    this.sincronizarLowSpeedNoDaemon(frameLayout);
                    this.salvarMapeamentoHud();
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onStartTrackingTouch(SeekBar seekBar5) {
                }
            });
        }
        if (seekBar2 != null) {
            seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.example.ssmousepro.FloatingService.vincularUiLowSpeed.6
                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onProgressChanged(SeekBar seekBar5, int i3, boolean z) {
                    int iM5140F = p32.m5140F(i3 + 10, 10, 100);
                    TextView textView6 = textView3;
                    if (textView6 != null) {
                        textView6.setText(String.format(Locale.US, "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(iM5140F / 100.0f)}, 1)));
                    }
                    if (z) {
                        frameLayout.setTag(C0203R.id.tag_hud_fps_low_speed_fator_x, Integer.valueOf(iM5140F));
                    }
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onStopTrackingTouch(SeekBar seekBar5) throws JSONException {
                    frameLayout.setTag(C0203R.id.tag_hud_fps_low_speed_fator_x, Integer.valueOf(p32.m5140F((seekBar5 != null ? seekBar5.getProgress() : 0) + 10, 10, 100)));
                    this.sincronizarLowSpeedNoDaemon(frameLayout);
                    this.salvarMapeamentoHud();
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onStartTrackingTouch(SeekBar seekBar5) {
                }
            });
        }
        if (seekBar3 != null) {
            seekBar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.example.ssmousepro.FloatingService.vincularUiLowSpeed.7
                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onProgressChanged(SeekBar seekBar5, int i3, boolean z) {
                    TextView textView6 = textView4;
                    if (textView6 != null) {
                        textView6.setText(String.valueOf(i3));
                    }
                    if (z) {
                        frameLayout.setTag(C0203R.id.tag_hud_fps_low_speed_lim_y, Integer.valueOf(i3));
                    }
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onStopTrackingTouch(SeekBar seekBar5) throws JSONException {
                    frameLayout.setTag(C0203R.id.tag_hud_fps_low_speed_lim_y, Integer.valueOf(seekBar5 != null ? seekBar5.getProgress() : 0));
                    this.sincronizarLowSpeedNoDaemon(frameLayout);
                    this.salvarMapeamentoHud();
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onStartTrackingTouch(SeekBar seekBar5) {
                }
            });
        }
        if (seekBar4 != null) {
            seekBar4.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.example.ssmousepro.FloatingService.vincularUiLowSpeed.8
                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onProgressChanged(SeekBar seekBar5, int i3, boolean z) {
                    int iM5140F = p32.m5140F(i3 + 10, 10, 100);
                    TextView textView6 = textView;
                    if (textView6 != null) {
                        textView6.setText(String.format(Locale.US, "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(iM5140F / 100.0f)}, 1)));
                    }
                    if (z) {
                        frameLayout.setTag(C0203R.id.tag_hud_fps_low_speed_fator_y, Integer.valueOf(iM5140F));
                    }
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onStopTrackingTouch(SeekBar seekBar5) throws JSONException {
                    frameLayout.setTag(C0203R.id.tag_hud_fps_low_speed_fator_y, Integer.valueOf(p32.m5140F((seekBar5 != null ? seekBar5.getProgress() : 0) + 10, 10, 100)));
                    this.sincronizarLowSpeedNoDaemon(frameLayout);
                    this.salvarMapeamentoHud();
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onStartTrackingTouch(SeekBar seekBar5) {
                }
            });
        }
        if (editText != null) {
            i = 0;
            editText.setOnClickListener(new kb0(this, editText, frameLayout, i));
        } else {
            i = 0;
        }
        if (editText != null) {
            editText.setOnLongClickListener(new lb0(frameLayout, editText, this, i));
        }
        if (editText2 != null) {
            i2 = 1;
            editText2.setOnClickListener(new kb0(this, editText2, frameLayout, i2));
        } else {
            i2 = 1;
        }
        if (editText2 != null) {
            editText2.setOnLongClickListener(new lb0(frameLayout, editText2, this, i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void vincularUiLowSpeed$lambda$198(FrameLayout frameLayout, FloatingService floatingService, CompoundButton compoundButton, boolean z) throws JSONException {
        compoundButton.getClass();
        frameLayout.setTag(C0203R.id.tag_hud_fps_low_speed_ativo_x, Boolean.valueOf(z));
        floatingService.sincronizarLowSpeedNoDaemon(frameLayout);
        floatingService.salvarMapeamentoHud();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void vincularUiLowSpeed$lambda$199(FrameLayout frameLayout, FloatingService floatingService, CompoundButton compoundButton, boolean z) throws JSONException {
        compoundButton.getClass();
        frameLayout.setTag(C0203R.id.tag_hud_fps_low_speed_ativo_y, Boolean.valueOf(z));
        floatingService.sincronizarLowSpeedNoDaemon(frameLayout);
        floatingService.salvarMapeamentoHud();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void vincularUiLowSpeed$lambda$201(FloatingService floatingService, EditText editText, FrameLayout frameLayout, View view) {
        floatingService.capturarTeclaAnalog(editText, new gb0(frameLayout, editText, floatingService, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 vincularUiLowSpeed$lambda$201$lambda$200(FrameLayout frameLayout, EditText editText, FloatingService floatingService, String str) throws JSONException {
        str.getClass();
        frameLayout.setTag(C0203R.id.tag_hud_fps_low_speed_tecla_x, str);
        editText.setText(LinuxKeyCodes.INSTANCE.rotuloExibicaoHud(str));
        floatingService.sincronizarLowSpeedNoDaemon(frameLayout);
        floatingService.salvarMapeamentoHud();
        return z32.f13265a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean vincularUiLowSpeed$lambda$202(FrameLayout frameLayout, EditText editText, FloatingService floatingService, View view) throws JSONException {
        frameLayout.setTag(C0203R.id.tag_hud_fps_low_speed_tecla_x, null);
        editText.setText("—");
        floatingService.sincronizarLowSpeedNoDaemon(frameLayout);
        floatingService.salvarMapeamentoHud();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void vincularUiLowSpeed$lambda$204(FloatingService floatingService, EditText editText, FrameLayout frameLayout, View view) {
        floatingService.capturarTeclaAnalog(editText, new gb0(frameLayout, editText, floatingService, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 vincularUiLowSpeed$lambda$204$lambda$203(FrameLayout frameLayout, EditText editText, FloatingService floatingService, String str) throws JSONException {
        str.getClass();
        frameLayout.setTag(C0203R.id.tag_hud_fps_low_speed_tecla_y, str);
        editText.setText(LinuxKeyCodes.INSTANCE.rotuloExibicaoHud(str));
        floatingService.sincronizarLowSpeedNoDaemon(frameLayout);
        floatingService.salvarMapeamentoHud();
        return z32.f13265a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean vincularUiLowSpeed$lambda$205(FrameLayout frameLayout, EditText editText, FloatingService floatingService, View view) throws JSONException {
        frameLayout.setTag(C0203R.id.tag_hud_fps_low_speed_tecla_y, null);
        editText.setText("—");
        floatingService.sincronizarLowSpeedNoDaemon(frameLayout);
        floatingService.salvarMapeamentoHud();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
    
        if (r8 == r7) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object wmDensityAtual(p000.InterfaceC0579du r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.example.ssmousepro.FloatingService.C01841
            if (r0 == 0) goto L13
            r0 = r9
            com.example.ssmousepro.FloatingService$wmDensityAtual$1 r0 = (com.example.ssmousepro.FloatingService.C01841) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.example.ssmousepro.FloatingService$wmDensityAtual$1 r0 = new com.example.ssmousepro.FloatingService$wmDensityAtual$1
            r0.<init>(r9)
        L18:
            java.lang.Object r8 = r0.result
            int r9 = r0.label
            r1 = 0
            java.lang.String r2 = ""
            java.lang.String r3 = "wm density"
            r4 = 3
            r5 = 2
            r6 = 1
            vu r7 = p000.EnumC1530vu.f11768a
            if (r9 == 0) goto L48
            if (r9 == r6) goto L44
            if (r9 == r5) goto L3c
            if (r9 != r4) goto L36
            java.lang.Object r9 = r0.L$0
            java.lang.String r9 = (java.lang.String) r9
            p000.ua0.m6440Z(r8)
            goto L83
        L36:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p000.f40.m2719o(r8)
            return r1
        L3c:
            java.lang.Object r9 = r0.L$0
            java.lang.String r9 = (java.lang.String) r9
            p000.ua0.m6440Z(r8)
            goto L76
        L44:
            p000.ua0.m6440Z(r8)
            goto L56
        L48:
            p000.ua0.m6440Z(r8)
            com.example.ssmousepro.activation.PrivilegeShell r8 = com.example.ssmousepro.activation.PrivilegeShell.INSTANCE
            r0.label = r6
            java.lang.Object r8 = r8.executarComSaida(r3, r0)
            if (r8 != r7) goto L56
            goto L82
        L56:
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L5b
            r8 = r2
        L5b:
            java.lang.CharSequence r8 = p000.zv1.m7383W0(r8)
            java.lang.String r8 = r8.toString()
            boolean r9 = p000.zv1.m7371K0(r8)
            if (r9 == 0) goto L91
            r0.L$0 = r1
            r0.label = r5
            r8 = 80
            java.lang.Object r8 = kotlinx.coroutines.DelayKt.delay(r8, r0)
            if (r8 != r7) goto L76
            goto L82
        L76:
            com.example.ssmousepro.activation.PrivilegeShell r8 = com.example.ssmousepro.activation.PrivilegeShell.INSTANCE
            r0.L$0 = r1
            r0.label = r4
            java.lang.Object r8 = r8.executarComSaida(r3, r0)
            if (r8 != r7) goto L83
        L82:
            return r7
        L83:
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L88
            goto L89
        L88:
            r2 = r8
        L89:
            java.lang.CharSequence r8 = p000.zv1.m7383W0(r2)
            java.lang.String r8 = r8.toString()
        L91:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ssmousepro.FloatingService.wmDensityAtual(du):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
    
        if (r8 == r7) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object wmSizeAtual(p000.InterfaceC0579du r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.example.ssmousepro.FloatingService.C01851
            if (r0 == 0) goto L13
            r0 = r9
            com.example.ssmousepro.FloatingService$wmSizeAtual$1 r0 = (com.example.ssmousepro.FloatingService.C01851) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.example.ssmousepro.FloatingService$wmSizeAtual$1 r0 = new com.example.ssmousepro.FloatingService$wmSizeAtual$1
            r0.<init>(r9)
        L18:
            java.lang.Object r8 = r0.result
            int r9 = r0.label
            r1 = 0
            java.lang.String r2 = ""
            java.lang.String r3 = "wm size"
            r4 = 3
            r5 = 2
            r6 = 1
            vu r7 = p000.EnumC1530vu.f11768a
            if (r9 == 0) goto L48
            if (r9 == r6) goto L44
            if (r9 == r5) goto L3c
            if (r9 != r4) goto L36
            java.lang.Object r9 = r0.L$0
            java.lang.String r9 = (java.lang.String) r9
            p000.ua0.m6440Z(r8)
            goto L83
        L36:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p000.f40.m2719o(r8)
            return r1
        L3c:
            java.lang.Object r9 = r0.L$0
            java.lang.String r9 = (java.lang.String) r9
            p000.ua0.m6440Z(r8)
            goto L76
        L44:
            p000.ua0.m6440Z(r8)
            goto L56
        L48:
            p000.ua0.m6440Z(r8)
            com.example.ssmousepro.activation.PrivilegeShell r8 = com.example.ssmousepro.activation.PrivilegeShell.INSTANCE
            r0.label = r6
            java.lang.Object r8 = r8.executarComSaida(r3, r0)
            if (r8 != r7) goto L56
            goto L82
        L56:
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L5b
            r8 = r2
        L5b:
            java.lang.CharSequence r8 = p000.zv1.m7383W0(r8)
            java.lang.String r8 = r8.toString()
            boolean r9 = p000.zv1.m7371K0(r8)
            if (r9 == 0) goto L91
            r0.L$0 = r1
            r0.label = r5
            r8 = 80
            java.lang.Object r8 = kotlinx.coroutines.DelayKt.delay(r8, r0)
            if (r8 != r7) goto L76
            goto L82
        L76:
            com.example.ssmousepro.activation.PrivilegeShell r8 = com.example.ssmousepro.activation.PrivilegeShell.INSTANCE
            r0.L$0 = r1
            r0.label = r4
            java.lang.Object r8 = r8.executarComSaida(r3, r0)
            if (r8 != r7) goto L83
        L82:
            return r7
        L83:
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L88
            goto L89
        L88:
            r2 = r8
        L89:
            java.lang.CharSequence r8 = p000.zv1.m7383W0(r2)
            java.lang.String r8 = r8.toString()
        L91:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ssmousepro.FloatingService.wmSizeAtual(du):java.lang.Object");
    }

    public final void atualizarCursor(int i, int i2) {
        View view;
        ImageView imageView;
        if (!this.cursorMaoVisivel || this.fpsModoAtivo) {
            return;
        }
        if ((!this.hudEmModoJogo && !this.hudEmModoEdicao) || (view = this.hudOverlayView) == null || (imageView = (ImageView) view.findViewById(C0203R.id.cursorVirtualMao)) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            return;
        }
        bc1 bc1VarObterTamanhoRealTela = obterTamanhoRealTela();
        int iIntValue = ((Number) bc1VarObterTamanhoRealTela.f1292a).intValue();
        int iIntValue2 = ((Number) bc1VarObterTamanhoRealTela.f1293b).intValue();
        int iCursorPontaXpx = cursorPontaXpx();
        int iCursorPontaYpx = cursorPontaYpx();
        float fNivelParaMultiplicador = nivelParaMultiplicador(this.nivelVelocidadeCursor);
        float f = (i * fNivelParaMultiplicador) + this.cursorAccX;
        float f2 = (i2 * fNivelParaMultiplicador) + this.cursorAccY;
        int i3 = (int) f;
        int i4 = (int) f2;
        this.cursorAccX = f - i3;
        this.cursorAccY = f2 - i4;
        definirPosicaoCursorAbsoluta(p32.m5140F(layoutParams2.leftMargin + i3, -iCursorPontaXpx, iIntValue - iCursorPontaXpx), p32.m5140F(layoutParams2.topMargin + i4, -iCursorPontaYpx, iIntValue2 - iCursorPontaYpx));
        if (this.hudEmModoEdicao && this.editMousePressionado) {
            repassarMoveOverlayEdicao();
        }
    }

    public final boolean enviarComandoInjecao(String str) {
        str.getClass();
        InjectionDaemonManager.INSTANCE.enqueueComando(str);
        return true;
    }

    public final boolean enviarMovimentoCamera(int i, int i2) {
        return enviarComandoInjecao("MOUSE_MOVE " + i + " " + i2);
    }

    public final boolean enviarToqueNaTela(int i, int i2) {
        return enviarComandoInjecao("TOUCH " + i + " " + i2);
    }

    public final float getMouseSensitivity() {
        return this.mouseSensitivity;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        encerrarMapeadorCompleto$default(this, false, 1, null);
        super.onDestroy();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003e  */
    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        String stringExtra;
        PrivilegeGate privilegeGate = PrivilegeGate.INSTANCE;
        if (!privilegeGate.estaProntoParaInjecao(this)) {
            String strMensagemBloqueioMapeador = privilegeGate.mensagemBloqueioMapeador(this);
            if (zv1.m7371K0(strMensagemBloqueioMapeador)) {
                strMensagemBloqueioMapeador = "Ative o mapeador em Configurações → Modo de ativação.";
            }
            Toast.makeText(this, strMensagemBloqueioMapeador, 1).show();
            if (this.floatingView == null) {
                isRunning = false;
                stopSelf();
                return 2;
            }
        }
        isRunning = true;
        if (intent == null || (stringExtra = intent.getStringExtra("PACOTE_ALVO")) == null) {
            stringExtra = this.pacoteDoJogo;
        } else {
            if (zv1.m7371K0(stringExtra)) {
                stringExtra = null;
            }
            if (stringExtra == null) {
                stringExtra = this.pacoteDoJogo;
            }
        }
        this.pacoteDoJogo = stringExtra;
        carregarPreferenciaGraficoPartida();
        carregarSensibilidadeSalva();
        carregarConfigInterface();
        iniciarCanalInjecao();
        if (this.floatingView == null) {
            exibirBolinhaFlutuante();
            View view = this.floatingView;
            if (view != null) {
                view.post(new hb0(this, 17));
            }
        }
        iniciarMonitoramentoDeTela();
        registrarListenerPerifericosHotplug();
        registerComponentCallbacks(this.configCallback);
        PlayTimeSessionManager.INSTANCE.setOnTempoEsgotado(new cc0(this, 7));
        return 2;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        encerrarMapeadorCompleto(true);
        stopSelf();
        super.onTaskRemoved(intent);
    }

    public final void setMouseSensitivity(float f) {
        this.mouseSensitivity = f;
    }

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1571wy abstractC1571wy) {
            this();
        }

        public final boolean isRunning() {
            return FloatingService.isRunning;
        }

        public final void setRunning(boolean z) {
            FloatingService.isRunning = z;
        }

        private Companion() {
        }
    }
}
