package com.example.ssmousepro.injection;

import android.os.DeadObjectException;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;
import com.example.ssmousepro.ICursorPositionProvider;
import com.example.ssmousepro.IVirtualCursorListener;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.android.gms.common.ConnectionResult;
import com.google.firebase.iid.ServiceStarter;
import io.github.muntashirakon.adb.PairingConnectionCtx;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p000.AbstractC0609en;
import p000.AbstractC1337qm;
import p000.AbstractC1377rp;
import p000.AbstractC1414sp;
import p000.AbstractC1451tp;
import p000.AbstractC1571wy;
import p000.C0575dq;
import p000.C1348qx;
import p000.RunnableC1059l5;
import p000.bc1;
import p000.fw1;
import p000.gw1;
import p000.hp0;
import p000.hw1;
import p000.n60;
import p000.og0;
import p000.p32;
import p000.rn0;
import p000.z32;
import p000.zv1;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class InputInjectionEngine {
    private static final int ANALOG_ID = 1;
    private static final float CURSOR_MAO_OFFSET_ESQUERDA_FRAC = 0.06666667f;
    private static final float FPS_ASPECT_REF = 1.7777778f;
    private static final boolean FPS_IDLE_UP_ATIVO = false;
    private static final long FPS_IDLE_UP_MS = 700;
    private static final float FPS_RATIO_Y_BASE = 0.4f;
    private static final float FPS_SENS_Y_AJUSTE = 1.5f;
    private static final long JANELA_BURST_POS_CLIQUE_MS = 50;
    private static final int MAO_POINTER_ID = 19;
    private static final long RESYNC_ANALOG_APOS_TOGGLE_MS = 450;
    private static final String TAG = "InputInjectionEngine";
    private static final int TAP_ID_MAX = 18;
    private static final int TAP_ID_MIN = 3;
    private static final boolean USE_NATIVE_INPUT = true;
    private static volatile boolean aimAtivo;
    private static AimCfg aimCfg;
    private static volatile boolean aimDesejado;
    private static Thread aimLoop;
    private static volatile boolean aimLoopAtivo;
    private static og0 aimStateListener;
    private static volatile boolean aimSuspendido;
    private static int alturaTela;
    private static AnalogCfg analogCfg;
    private static volatile int atalhoConfig;
    private static volatile int atalhoDigitar;
    private static volatile int atalhoEditarHud;
    private static volatile boolean callbacksMaoVivos;
    private static volatile boolean capturaFisicaAtiva;
    private static ICursorPositionProvider cursorPositionProvider;
    private static volatile boolean editarHudAtivo;
    private static volatile boolean entradaAtiva;
    private static long ffLogUltimoNs;
    private static boolean inicializado;
    private static PhysicalInputSource inputReader;
    private static int larguraTela;
    private static boolean maoCursorSincronizado;
    private static float maoCursorX;
    private static float maoCursorY;
    private static float maoDxAcc;
    private static float maoDyAcc;
    private static volatile boolean maoToqueAtivo;
    private static String policyControlBackup;
    private static boolean resyncAnalogAposToggle;
    private static long resyncAnalogAteMs;
    private static volatile boolean tecladoPassthrough;
    private static long ultimoEventoMiraNs;
    private static long ultimoMouseDownParaAnalogMs;
    private static long ultimoToggleMiraMs;
    private static boolean usandoFallbackShell;
    private static IVirtualCursorListener virtualCursorListener;
    public static final InputInjectionEngine INSTANCE = new InputInjectionEngine();
    private static final HashMap<Integer, List<bc1>> bindings = new HashMap<>();
    private static final HashMap<Integer, Integer> bindingTapMs = new HashMap<>();
    private static final HashMap<Integer, RepeatCfg> bindingRepeat = new HashMap<>();
    private static final HashMap<Integer, Long> teclaTapUpPendente = new HashMap<>();
    private static final HashMap<Integer, Long> mouseTapUpPendente = new HashMap<>();
    private static final HashMap<Integer, RepeatState> repeatsAtivos = new HashMap<>();
    private static final LinkedHashSet<Integer> repeatsAguardandoPlantar = new LinkedHashSet<>();
    private static final HashMap<Integer, Integer> interruptPartner = new HashMap<>();
    private static final HashMap<Integer, List<Integer>> mouseBtnsAtivos = new HashMap<>();
    private static final HashMap<Integer, List<Integer>> teclasAtivas = new HashMap<>();
    private static int proximoTapId = 3;
    private static final LinkedHashSet<Integer> direcoesPressionadas = new LinkedHashSet<>();
    private static volatile FpsAntiBlockModo antiBlockModo = FpsAntiBlockModo.Companion.getOFICIAL();
    private static final List<Integer> antiBlockTeclasSuspensas = new ArrayList();
    private static final List<Integer> antiBlockMouseSuspensos = new ArrayList();
    private static final Object mouseLock = new Object();
    private static float maoSensibilidade = 1.0f;
    private static final HashMap<Integer, Long> keyUpAnalogPendente = new HashMap<>();
    private static final LinkedHashSet<Integer> mouseBtnsPendentesDown = new LinkedHashSet<>();
    private static final LinkedHashSet<Integer> burstAnalogPosClique = new LinkedHashSet<>();

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static final class AnalogCfg {

        /* JADX INFO: renamed from: cx */
        private final float f1911cx;

        /* JADX INFO: renamed from: cy */
        private final float f1912cy;
        private final int down;
        private final int left;
        private final float raio;
        private final int right;

        /* JADX INFO: renamed from: up */
        private final int f1913up;

        public AnalogCfg(int i, int i2, int i3, int i4, float f, float f2, float f3) {
            this.f1913up = i;
            this.down = i2;
            this.left = i3;
            this.right = i4;
            this.f1911cx = f;
            this.f1912cy = f2;
            this.raio = f3;
        }

        public final float getCx() {
            return this.f1911cx;
        }

        public final float getCy() {
            return this.f1912cy;
        }

        public final int getDown() {
            return this.down;
        }

        public final int getLeft() {
            return this.left;
        }

        public final float getRaio() {
            return this.raio;
        }

        public final int getRight() {
            return this.right;
        }

        public final int getUp() {
            return this.f1913up;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static final class RepeatCfg {
        private final int count;
        private final boolean holdPulse;
        private final int tapMs;
        private final boolean untilKey;

        public RepeatCfg(int i, int i2, boolean z, boolean z2) {
            this.tapMs = i;
            this.count = i2;
            this.untilKey = z;
            this.holdPulse = z2;
        }

        public final int getCount() {
            return this.count;
        }

        public final boolean getHoldPulse() {
            return this.holdPulse;
        }

        public final int getTapMs() {
            return this.tapMs;
        }

        public final boolean getUntilKey() {
            return this.untilKey;
        }
    }

    private InputInjectionEngine() {
    }

    private final int alocarTapId() {
        for (int i = 0; i < 16; i++) {
            int i2 = proximoTapId;
            proximoTapId = i2 >= 18 ? 3 : i2 + 1;
            if (!MultiTouchInjector.INSTANCE.estaAtivo(i2)) {
                return i2;
            }
        }
        InjectionMetrics.INSTANCE.onTapIdExhaust();
        Log.w(TAG, "Pool de tap IDs esgotado (3..18)");
        return -1;
    }

    private final void alternarMira(AimCfg aimCfg2, boolean z) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - ultimoToggleMiraMs < (z ? 80L : 35L)) {
            return;
        }
        ultimoToggleMiraMs = jCurrentTimeMillis;
        aimSuspendido = false;
        aimDesejado = !aimDesejado;
        sincronizarAimEfetivo(aimCfg2, z, true);
    }

    private final void antiBlockAntesPlantar() {
        List<Integer> listRemove;
        List<Integer> listRemove2;
        antiBlockTeclasSuspensas.clear();
        antiBlockMouseSuspensos.clear();
        if (antiBlockPrecisaReordenar()) {
            Set<Integer> setKeySet = teclasAtivas.keySet();
            setKeySet.getClass();
            Iterator it = AbstractC1377rp.m5879z0(setKeySet).iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                if (ehToqueLadoDireito(iIntValue) && (listRemove2 = teclasAtivas.remove(Integer.valueOf(iIntValue))) != null) {
                    Iterator<Integer> it2 = listRemove2.iterator();
                    while (it2.hasNext()) {
                        MultiTouchInjector.INSTANCE.m1584up(it2.next().intValue());
                    }
                    antiBlockTeclasSuspensas.add(Integer.valueOf(iIntValue));
                }
            }
            Set<Integer> setKeySet2 = mouseBtnsAtivos.keySet();
            setKeySet2.getClass();
            Iterator it3 = AbstractC1377rp.m5879z0(setKeySet2).iterator();
            while (it3.hasNext()) {
                int iIntValue2 = ((Number) it3.next()).intValue();
                if (ehToqueLadoDireito(iIntValue2) && (listRemove = mouseBtnsAtivos.remove(Integer.valueOf(iIntValue2))) != null) {
                    Iterator<Integer> it4 = listRemove.iterator();
                    while (it4.hasNext()) {
                        MultiTouchInjector.INSTANCE.m1584up(it4.next().intValue());
                    }
                    antiBlockMouseSuspensos.add(Integer.valueOf(iIntValue2));
                }
            }
            List<Integer> list = antiBlockTeclasSuspensas;
            if (list.isEmpty() && antiBlockMouseSuspensos.isEmpty()) {
                return;
            }
            antiBlockModo.getId();
            List<Integer> list2 = antiBlockMouseSuspensos;
            Objects.toString(list);
            Objects.toString(list2);
        }
    }

    private final void antiBlockDepoisPlantar() {
        if (antiBlockPrecisaReordenar()) {
            List<Integer> list = antiBlockTeclasSuspensas;
            List listM5879z0 = AbstractC1377rp.m5879z0(list);
            List<Integer> list2 = antiBlockMouseSuspensos;
            List listM5879z1 = AbstractC1377rp.m5879z0(list2);
            list.clear();
            list2.clear();
            Iterator it = listM5879z0.iterator();
            while (it.hasNext()) {
                pressionarTeclaMapeada(((Number) it.next()).intValue());
            }
            Iterator it2 = listM5879z1.iterator();
            while (it2.hasNext()) {
                pressionarBotaoMouse(((Number) it2.next()).intValue());
            }
            if (listM5879z0.isEmpty() && listM5879z1.isEmpty()) {
                return;
            }
            antiBlockModo.getId();
            listM5879z0.toString();
            listM5879z1.toString();
        }
    }

    private final void antiBlockGuardarAntesDoLadoDireito(int i) {
        if (antiBlockModo == FpsAntiBlockModo.SSPRO && aimAtivo) {
            AimTouchController aimTouchController = AimTouchController.INSTANCE;
            if (!aimTouchController.getDedoAtivo() && ehToqueLadoDireito(i)) {
                aimTouchController.forcarPlantarSeInativo();
            }
        }
    }

    private final boolean antiBlockPrecisaReordenar() {
        return antiBlockModo == FpsAntiBlockModo.GG_MOUSE || antiBlockModo == FpsAntiBlockModo.BLUESTACKS || antiBlockModo == FpsAntiBlockModo.SSPRO;
    }

    private final void aoEventoTecla(int i, int i2, boolean z, boolean z2) {
        if (entradaAtiva) {
            InjectionMetrics.INSTANCE.onKeyEvent();
            if (capturaFisicaAtiva && (i2 == 0 || i2 == 1)) {
                boolean z3 = z || ehBotaoMouse(i);
                if (i2 == 1) {
                    notificarCapturaFisica(i, true, z3);
                    return;
                } else {
                    if (editarHudAtivo && z && z3) {
                        notificarCursorVirtualClique(i, false);
                        return;
                    }
                    return;
                }
            }
            if (atualizarTweaksHold(i, i2)) {
                return;
            }
            if (i2 == 2) {
                if (!editarHudAtivo && z2 && ehDirecaoAnalogica(i)) {
                    aplicarAnalogTeclaDown(i);
                    return;
                }
                return;
            }
            if (i2 == 0 || i2 == 1) {
                if (!ehBotaoMouse(i) || z) {
                    if (z) {
                        if (ehBotaoMouse(i)) {
                            if (editarHudAtivo) {
                                notificarCursorVirtualClique(i, i2 == 1);
                                return;
                            }
                            AimCfg aimCfg2 = aimCfg;
                            if (aimCfg2 != null && aimCfg2.getSuspend() > 0 && i == aimCfg2.getSuspend() && i != aimCfg2.getToggle()) {
                                processarSuspendHold(i2 == 1, true);
                                return;
                            }
                            if (i2 != 1) {
                                InjectionDiag.INSTANCE.mouseBtn(i, false, aimAtivo);
                                if (!aimAtivo) {
                                    soltarMao(i);
                                    return;
                                } else {
                                    mouseBtnsPendentesDown.remove(Integer.valueOf(i));
                                    soltarBotaoMouse(i);
                                    return;
                                }
                            }
                            InjectionDiag.INSTANCE.mouseBtn(i, true, aimAtivo);
                            if (aimCfg2 != null && i == aimCfg2.getToggle()) {
                                alternarMira(aimCfg2, true);
                                return;
                            } else {
                                if (!aimAtivo) {
                                    pressionarMao(i);
                                    return;
                                }
                                ultimoMouseDownParaAnalogMs = System.currentTimeMillis();
                                burstAnalogPosClique.clear();
                                pressionarBotaoMouse(i);
                                return;
                            }
                        }
                        return;
                    }
                    if (z2) {
                        if (i2 == 1 && ehAtalhoApp(i)) {
                            notificarAtalhoApp(i);
                            return;
                        }
                        if (editarHudAtivo || tecladoPassthrough) {
                            return;
                        }
                        if (i2 != 0) {
                            if (i2 != 1) {
                                return;
                            }
                            AimCfg aimCfg3 = aimCfg;
                            if (aimCfg3 != null && aimCfg3.getSuspend() > 0 && i == aimCfg3.getSuspend() && i != aimCfg3.getToggle()) {
                                processarSuspendHold(true, false);
                                return;
                            }
                            if (aimCfg3 != null && i == aimCfg3.getToggle()) {
                                alternarMira(aimCfg3, false);
                                return;
                            }
                            if (ehDirecaoAnalogica(i)) {
                                aplicarAnalogTeclaDown(i);
                                return;
                            }
                            if (posicoesMapeadas(i).isEmpty()) {
                                return;
                            }
                            aplicarInterrupcaoMutua(i);
                            if (bindingRepeat.containsKey(Integer.valueOf(i))) {
                                iniciarRepeat(i);
                                return;
                            } else {
                                pressionarTeclaMapeada(i);
                                return;
                            }
                        }
                        AimCfg aimCfg4 = aimCfg;
                        if (aimCfg4 != null && aimCfg4.getSuspend() > 0 && i == aimCfg4.getSuspend() && i != aimCfg4.getToggle()) {
                            processarSuspendHold(false, false);
                            return;
                        }
                        if (ehDirecaoAnalogica(i)) {
                            LinkedHashSet<Integer> linkedHashSet = direcoesPressionadas;
                            if (linkedHashSet.contains(Integer.valueOf(i))) {
                                keyUpAnalogPendente.remove(Integer.valueOf(i));
                                linkedHashSet.remove(Integer.valueOf(i));
                                recalcularAnalogico();
                                return;
                            }
                            return;
                        }
                        if (posicoesMapeadas(i).isEmpty()) {
                            return;
                        }
                        if (bindingRepeat.containsKey(Integer.valueOf(i))) {
                            repeatsAguardandoPlantar.remove(Integer.valueOf(i));
                            if (aimAtivo) {
                                pararRepeat(i);
                                return;
                            }
                            return;
                        }
                        Integer num = bindingTapMs.get(Integer.valueOf(i));
                        if ((num != null ? num.intValue() : 0) > 0) {
                            return;
                        }
                        soltarTeclaMapeada(i);
                    }
                }
            }
        }
    }

    private final void aplicarAnalogTeclaDown(int i) {
        keyUpAnalogPendente.remove(Integer.valueOf(i));
        direcoesPressionadas.add(Integer.valueOf(i));
        long jCurrentTimeMillis = System.currentTimeMillis() - ultimoMouseDownParaAnalogMs;
        if (0 > jCurrentTimeMillis || jCurrentTimeMillis >= 51) {
            LinkedHashSet<Integer> linkedHashSet = burstAnalogPosClique;
            if (!linkedHashSet.isEmpty()) {
                linkedHashSet.clear();
            }
        } else {
            LinkedHashSet<Integer> linkedHashSet2 = burstAnalogPosClique;
            linkedHashSet2.add(Integer.valueOf(i));
            if (linkedHashSet2.size() >= 3) {
                InjectionDiag.INSTANCE.teclaFantasma(i, "BURST_POS_CLIQUE");
                Log.w(TAG, "Burst fantasma p�s-clique ignorado: " + linkedHashSet2);
                Iterator<Integer> it = linkedHashSet2.iterator();
                it.getClass();
                while (it.hasNext()) {
                    direcoesPressionadas.remove(Integer.valueOf(it.next().intValue()));
                }
                burstAnalogPosClique.clear();
                recalcularAnalogico();
                return;
            }
        }
        recalcularAnalogico();
        processarMouseBtnsPendentes();
    }

    private final void aplicarInterrupcaoMutua(int i) {
        int iIntValue;
        Integer num = interruptPartner.get(Integer.valueOf(i));
        if (num == null || (iIntValue = num.intValue()) == i) {
            return;
        }
        if (teclasAtivas.containsKey(num)) {
            soltarTeclaMapeada(iIntValue);
        }
        if (mouseBtnsAtivos.containsKey(num)) {
            soltarBotaoMouse(iIntValue);
        }
        if (iIntValue == 272 && maoToqueAtivo) {
            liberarMaoToque();
        }
    }

    private final void aplicarMovimentoMouseInterno(int i, int i2) {
        if (entradaAtiva) {
            if (aimAtivo && !editarHudAtivo) {
                InjectionDiag.INSTANCE.mouseRaw(i, i2, true);
                AimCfg aimCfg2 = aimCfg;
                if (aimCfg2 == null) {
                    return;
                }
                ultimoEventoMiraNs = System.nanoTime();
                AimTouchController.INSTANCE.aplicarDelta(i, i2, aimCfg2.getSensX(), aimCfg2.getSensY(), larguraTela, alturaTela);
                return;
            }
            float f = maoDxAcc;
            float f2 = maoSensibilidade;
            float f3 = (i * f2) + f;
            float f4 = (i2 * f2) + maoDyAcc;
            int i3 = (int) f3;
            int i4 = (int) f4;
            float f5 = i3;
            maoDxAcc = f3 - f5;
            float f6 = i4;
            maoDyAcc = f4 - f6;
            if (i3 == 0 && i4 == 0) {
                return;
            }
            if (!maoCursorSincronizado) {
                posicionarCursorMaoCentroComOffset();
            }
            float f7 = maoCursorX + f5;
            float f8 = larguraTela;
            if (f8 < 1.0f) {
                f8 = 1.0f;
            }
            maoCursorX = p32.m5139E(f7, TouchPipeline.SIZE, f8);
            float f9 = maoCursorY + f6;
            float f10 = alturaTela;
            maoCursorY = p32.m5139E(f9, TouchPipeline.SIZE, f10 >= 1.0f ? f10 : 1.0f);
            maoCursorSincronizado = true;
            notificarCursorVirtualUi(i3, i4);
            if (maoToqueAtivo) {
                bc1 bc1VarObterPosicaoCursorVirtual = obterPosicaoCursorVirtual();
                MultiTouchInjector.INSTANCE.mover(19, ((Number) bc1VarObterPosicaoCursorVirtual.f1292a).intValue(), ((Number) bc1VarObterPosicaoCursorVirtual.f1293b).intValue());
            }
        }
    }

    private final boolean aplicarNavLock(boolean z) {
        if (z) {
            if (policyControlBackup == null) {
                String strLerSettingsGlobal = lerSettingsGlobal("policy_control");
                if (strLerSettingsGlobal == null) {
                    strLerSettingsGlobal = "";
                }
                policyControlBackup = strLerSettingsGlobal;
            }
            executarShellWm(AbstractC1414sp.m6124n0("settings", "put", "global", "policy_control", "immersive.navigation=*"));
            return true;
        }
        String str = policyControlBackup;
        policyControlBackup = null;
        if (str == null || str.length() == 0) {
            executarShellWm(AbstractC1414sp.m6124n0("settings", "delete", "global", "policy_control"));
        } else {
            executarShellWm(AbstractC1414sp.m6124n0("settings", "put", "global", "policy_control", str));
        }
        return true;
    }

    private final void atualizarGrabMouse() {
        PhysicalInputSource physicalInputSource = inputReader;
        boolean z = physicalInputSource != null;
        if (physicalInputSource != null) {
            physicalInputSource.definirGrabMouse(z);
        }
    }

    private final boolean atualizarTweaksHold(int i, int i2) {
        boolean z;
        if ((i2 != 0 && i2 != 1 && i2 != 2) || i == 0) {
            return false;
        }
        boolean z2 = i2 == 1 || i2 == 2;
        FpsAcelLimiarConfig fpsAcelLimiarConfig = FpsAcelLimiarConfig.INSTANCE;
        if (i == fpsAcelLimiarConfig.getHoldCode()) {
            fpsAcelLimiarConfig.setHoldPressed(z2);
            z = true;
        } else {
            z = false;
        }
        FpsLowSpeedGainConfig fpsLowSpeedGainConfig = FpsLowSpeedGainConfig.INSTANCE;
        if (i == fpsLowSpeedGainConfig.getHoldCodeX()) {
            fpsLowSpeedGainConfig.setHoldPressedX(z2);
            z = true;
        }
        if (i == fpsLowSpeedGainConfig.getHoldCodeY()) {
            fpsLowSpeedGainConfig.setHoldPressedY(z2);
            z = true;
        }
        if (z) {
            return !ehBotaoMouse(i);
        }
        return false;
    }

    private final void definirEditarHud(boolean z) {
        if (editarHudAtivo == z) {
            return;
        }
        editarHudAtivo = z;
        if (z) {
            if (aimAtivo || aimDesejado || aimSuspendido) {
                aimDesejado = false;
                aimSuspendido = false;
                if (aimAtivo) {
                    aimAtivo = false;
                    AimTouchController.INSTANCE.desativar();
                    teleportarCursorSistemaModoMao();
                    try {
                        og0 og0Var = aimStateListener;
                        if (og0Var != null) {
                            og0Var.invoke(Boolean.FALSE);
                        }
                    } catch (Exception e) {
                        Log.w(TAG, "Falha ao notificar listener mira (editar HUD)", e);
                    }
                }
            }
            liberarMapaPonteiros(teclasAtivas);
            liberarMapaPonteiros(mouseBtnsAtivos);
            direcoesPressionadas.clear();
            keyUpAnalogPendente.clear();
            recalcularAnalogico();
            liberarMaoToque();
            maoDxAcc = TouchPipeline.SIZE;
            maoDyAcc = TouchPipeline.SIZE;
        }
        atualizarGrabMouse();
    }

    private final void definirMousePollHz(int i) {
        MouseDeltaCoalescer.INSTANCE.definirHz(i);
    }

    private final void definirTecladoPassthrough(boolean z) {
        if (tecladoPassthrough == z) {
            return;
        }
        tecladoPassthrough = z;
        if (z) {
            liberarMapaPonteiros(teclasAtivas);
            keyUpAnalogPendente.clear();
            direcoesPressionadas.clear();
            recalcularAnalogico();
        }
    }

    private final void dispararCliqueUnicoCursor(int i, RepeatCfg repeatCfg) {
        if (ehBotaoMouse(i) || teclasAtivas.containsKey(Integer.valueOf(i))) {
            return;
        }
        List<bc1> listPosicoesMapeadas = posicoesMapeadas(i);
        if (listPosicoesMapeadas.isEmpty()) {
            return;
        }
        InjectionDiag.teclaMapeada$default(InjectionDiag.INSTANCE, i, true, 0L, 4, null);
        ArrayList arrayList = new ArrayList();
        for (bc1 bc1Var : listPosicoesMapeadas) {
            int iIntValue = ((Number) bc1Var.f1292a).intValue();
            int iIntValue2 = ((Number) bc1Var.f1293b).intValue();
            int iAlocarTapId = alocarTapId();
            if (iAlocarTapId < 0) {
                break;
            }
            arrayList.add(Integer.valueOf(iAlocarTapId));
            MultiTouchInjector multiTouchInjector = MultiTouchInjector.INSTANCE;
            bc1 bc1VarJitterDown = multiTouchInjector.jitterDown(iIntValue, iIntValue2, 5);
            multiTouchInjector.down(iAlocarTapId, ((Number) bc1VarJitterDown.f1292a).floatValue(), ((Number) bc1VarJitterDown.f1293b).floatValue());
        }
        if (arrayList.isEmpty()) {
            return;
        }
        teclasAtivas.put(Integer.valueOf(i), arrayList);
        teclaTapUpPendente.put(Integer.valueOf(i), Long.valueOf(System.currentTimeMillis() + ((long) p32.m5140F(repeatCfg.getTapMs(), 1, ServiceStarter.ERROR_UNKNOWN))));
        arrayList.size();
    }

    private final boolean ehAtalhoApp(int i) {
        if (i <= 0) {
            return false;
        }
        return i == atalhoEditarHud || i == atalhoDigitar || i == atalhoConfig;
    }

    private final boolean ehBotaoMouse(int i) {
        return 272 <= i && i < 279;
    }

    private final boolean ehDirecaoAnalogica(int i) {
        AnalogCfg analogCfg2 = analogCfg;
        if (analogCfg2 == null) {
            return false;
        }
        return i == analogCfg2.getUp() || i == analogCfg2.getDown() || i == analogCfg2.getLeft() || i == analogCfg2.getRight();
    }

    private final boolean ehToqueLadoDireito(int i) {
        int i2 = larguraTela / 2;
        if (i2 <= 0) {
            return false;
        }
        List<bc1> listPosicoesMapeadas = posicoesMapeadas(i);
        if ((listPosicoesMapeadas instanceof Collection) && listPosicoesMapeadas.isEmpty()) {
            return false;
        }
        Iterator<T> it = listPosicoesMapeadas.iterator();
        while (it.hasNext()) {
            if (((Number) ((bc1) it.next()).f1292a).intValue() >= i2) {
                return true;
            }
        }
        return false;
    }

    private final boolean executarShellWm(List<String> list) {
        String strM5873t0 = AbstractC1377rp.m5873t0(list, " ", null, null, null, 62);
        try {
            Process processStart = new ProcessBuilder((List<String>) AbstractC1414sp.m6124n0("sh", "-c", strM5873t0)).redirectErrorStream(true).start();
            InputStream inputStream = processStart.getInputStream();
            inputStream.getClass();
            String strM5163c0 = p32.m5163c0(new BufferedReader(new InputStreamReader(inputStream, AbstractC0609en.f3387a), PairingConnectionCtx.PeerInfo.MAX_PEER_INFO_SIZE));
            int iWaitFor = processStart.waitFor();
            zv1.m7383W0(strM5163c0).toString();
            return iWaitFor == 0;
        } catch (Exception e) {
            Log.e(TAG, "Falha ao executar '" + strM5873t0 + "'", e);
            return false;
        }
    }

    private final void finalizarResyncAnalogSeExpirado() {
        if (resyncAnalogAposToggle && System.currentTimeMillis() >= resyncAnalogAteMs) {
            resyncAnalogAposToggle = false;
            Objects.toString(direcoesPressionadas);
            recalcularAnalogico();
        }
    }

    private final void flushMousePollPendente() {
        MouseDeltaCoalescer.INSTANCE.flushForcado();
    }

    private final void garantirEntradaAtiva() {
        PhysicalInputSource physicalInputSource = inputReader;
        boolean z = false;
        if (physicalInputSource != null && physicalInputSource.isRunning()) {
            z = true;
        }
        if (z && entradaAtiva) {
            PhysicalInputSource physicalInputSource2 = inputReader;
            if (physicalInputSource2 != null) {
                physicalInputSource2.escanearDispositivosHotplug();
                return;
            }
            return;
        }
        if (inputReader == null || z) {
            Log.w(TAG, "INPUT_ENSURE: reiniciando leitura /dev/input");
        } else {
            Log.w(TAG, "INPUT_ENSURE: reader morto (flag=" + entradaAtiva + ") — reiniciando /dev/input");
        }
        reiniciarLeituraTeclado();
    }

    private final float getFpsAncoraX() {
        return AimTouchController.INSTANCE.getAncoraX();
    }

    private final boolean getFpsDedoAtivo() {
        return AimTouchController.INSTANCE.getDedoAtivo();
    }

    private final float getFpsFfOrigemX() {
        return AimTouchController.INSTANCE.getOrigemCompensacaoX();
    }

    private final float getFpsVirtualX() {
        return AimTouchController.INSTANCE.getVirtualX();
    }

    private final float getFpsVirtualY() {
        return AimTouchController.INSTANCE.getVirtualY();
    }

    private final void iniciarLeituraTeclado() {
        sincronizarTelaDispositivo();
        rn0 rn0Var = new rn0();
        C0575dq c0575dq = new C0575dq(8);
        int i = 6;
        C1348qx c1348qx = new C1348qx(i);
        SsproInputNative ssproInputNative = SsproInputNative.INSTANCE;
        PhysicalInputSource nativeInputReader = ssproInputNative.ensureLoaded() ? new NativeInputReader(rn0Var, c0575dq, c1348qx) : new InputDeviceReader(rn0Var, c0575dq, c1348qx);
        nativeInputReader.start();
        inputReader = nativeInputReader;
        if (!nativeInputReader.isRunning() && ssproInputNative.getLoaded()) {
            Log.w(TAG, "nativeStart não ficou running — fallback Kotlin");
            PhysicalInputSource physicalInputSource = inputReader;
            if (physicalInputSource != null) {
                physicalInputSource.stop();
            }
            InputDeviceReader inputDeviceReader = new InputDeviceReader(rn0Var, c0575dq, c1348qx);
            inputDeviceReader.start();
            inputReader = inputDeviceReader;
        }
        aimLoopAtivo = true;
        Thread thread = new Thread(new RunnableC1059l5(i), "AimLoop");
        thread.setPriority(10);
        thread.start();
        aimLoop = thread;
        entradaAtiva = true;
        atualizarGrabMouse();
        liberarGrabTecladoLegado();
        if (!aimAtivo) {
            teleportarCursorSistemaModoMao();
        }
        totalMapeamentos();
        temMouseMapeado();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void iniciarLeituraTeclado$lambda$12() {
        try {
            Process.setThreadPriority(-8);
        } catch (Exception unused) {
        }
        INSTANCE.loopMira();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 iniciarLeituraTeclado$lambda$7(int i, int i2, boolean z, boolean z2) {
        INSTANCE.aoEventoTecla(i, i2, z, z2);
        return z32.f13265a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 iniciarLeituraTeclado$lambda$8(int i, int i2) {
        INSTANCE.notificarMovimentoMouse(i, i2);
        return z32.f13265a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 iniciarLeituraTeclado$lambda$9() {
        InjectionMetrics.INSTANCE.onReaderSyn();
        INSTANCE.processarMouseBtnsPendentes();
        return z32.f13265a;
    }

    private final void iniciarRepeat(int i) {
        RepeatCfg repeatCfg;
        HashMap<Integer, RepeatState> map = repeatsAtivos;
        if (map.containsKey(Integer.valueOf(i)) || (repeatCfg = bindingRepeat.get(Integer.valueOf(i))) == null || posicoesMapeadas(i).isEmpty()) {
            return;
        }
        if (!aimAtivo) {
            dispararCliqueUnicoCursor(i, repeatCfg);
            return;
        }
        if (!AimTouchController.INSTANCE.getDedoAtivo()) {
            repeatsAguardandoPlantar.add(Integer.valueOf(i));
            return;
        }
        repeatsAguardandoPlantar.remove(Integer.valueOf(i));
        InjectionDiag.teclaMapeada$default(InjectionDiag.INSTANCE, i, true, 0L, 4, null);
        map.put(Integer.valueOf(i), new RepeatState(repeatCfg.getUntilKey() ? -1 : repeatCfg.getCount(), repeatCfg.getTapMs(), repeatCfg.getHoldPulse(), true, 0L, null, 32, null));
        repeatCfg.getCount();
        repeatCfg.getUntilKey();
        repeatCfg.getTapMs();
    }

    private final void iniciarResyncAnalogAposToggle(long j) {
        if (analogCfg == null) {
            return;
        }
        LinkedHashSet<Integer> linkedHashSet = direcoesPressionadas;
        if (!linkedHashSet.isEmpty()) {
            resyncAnalogAposToggle = false;
            Objects.toString(linkedHashSet);
            return;
        }
        resyncAnalogAposToggle = true;
        resyncAnalogAteMs = j + RESYNC_ANALOG_APOS_TOGGLE_MS;
        linkedHashSet.clear();
        MultiTouchInjector multiTouchInjector = MultiTouchInjector.INSTANCE;
        if (multiTouchInjector.estaAtivo(1)) {
            multiTouchInjector.m1584up(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 initialize$lambda$0(int i, int i2) {
        INSTANCE.aplicarMovimentoMouseInterno(i, i2);
        return z32.f13265a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 initialize$lambda$1() {
        INSTANCE.antiBlockAntesPlantar();
        return z32.f13265a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 initialize$lambda$2() {
        InputInjectionEngine inputInjectionEngine = INSTANCE;
        inputInjectionEngine.antiBlockDepoisPlantar();
        inputInjectionEngine.liberarRepeatsAguardandoPlantar();
        return z32.f13265a;
    }

    private final boolean injetarTap(int i, int i2) {
        if (usandoFallbackShell) {
            return ShellInputFallback.INSTANCE.tap(i, i2);
        }
        int iAlocarTapId = alocarTapId();
        if (iAlocarTapId < 0) {
            return false;
        }
        MultiTouchInjector multiTouchInjector = MultiTouchInjector.INSTANCE;
        multiTouchInjector.down(iAlocarTapId, i, i2);
        multiTouchInjector.m1584up(iAlocarTapId);
        return true;
    }

    private final void invalidarCallbacksMaoSeMorto(Throwable th) {
        String message;
        if ((th instanceof DeadObjectException) || ((th instanceof RemoteException) && (message = th.getMessage()) != null && zv1.m7365E0(message, "DeadObject", true))) {
            virtualCursorListener = null;
            cursorPositionProvider = null;
            callbacksMaoVivos = false;
            Log.w(TAG, "Callbacks m�o inv�lidos ? re-registre via app se o cursor parar");
        }
    }

    private final String lerSettingsGlobal(String str) {
        try {
            Process processStart = new ProcessBuilder((List<String>) AbstractC1414sp.m6124n0("sh", "-c", "settings get global " + str)).redirectErrorStream(true).start();
            InputStream inputStream = processStart.getInputStream();
            inputStream.getClass();
            String string = zv1.m7383W0(p32.m5163c0(new BufferedReader(new InputStreamReader(inputStream, AbstractC0609en.f3387a), PairingConnectionCtx.PeerInfo.MAX_PEER_INFO_SIZE))).toString();
            processStart.waitFor();
            return (string.length() == 0 || string.equalsIgnoreCase("null")) ? "" : string;
        } catch (Exception e) {
            Log.w(TAG, "Falha ao ler settings global " + str, e);
            return null;
        }
    }

    private final void liberarGrabTecladoLegado() {
        PhysicalInputSource physicalInputSource = inputReader;
        if (physicalInputSource != null) {
            physicalInputSource.definirGrabTeclado(false);
        }
    }

    private final void liberarMaoToque() {
        if (maoToqueAtivo) {
            maoToqueAtivo = false;
            MultiTouchInjector.INSTANCE.m1584up(19);
        }
    }

    private final void liberarMapaPonteiros(HashMap<Integer, List<Integer>> map) {
        for (List<Integer> list : map.values()) {
            list.getClass();
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                MultiTouchInjector.INSTANCE.m1584up(it.next().intValue());
            }
        }
        map.clear();
    }

    private final void liberarRepeatsAguardandoPlantar() {
        LinkedHashSet<Integer> linkedHashSet = repeatsAguardandoPlantar;
        if (!linkedHashSet.isEmpty() && aimAtivo && AimTouchController.INSTANCE.getDedoAtivo()) {
            List listM5879z0 = AbstractC1377rp.m5879z0(linkedHashSet);
            linkedHashSet.clear();
            Iterator it = listM5879z0.iterator();
            while (it.hasNext()) {
                iniciarRepeat(((Number) it.next()).intValue());
            }
        }
    }

    private final void limparMapeamentos() {
        bindings.clear();
        bindingTapMs.clear();
        bindingRepeat.clear();
        teclaTapUpPendente.clear();
        mouseTapUpPendente.clear();
        limparRepeatsAtivos();
        interruptPartner.clear();
        analogCfg = null;
        direcoesPressionadas.clear();
        keyUpAnalogPendente.clear();
        if (!aimAtivo) {
            aimCfg = null;
        }
        liberarMapaPonteiros(mouseBtnsAtivos);
        liberarMapaPonteiros(teclasAtivas);
        liberarMaoToque();
        MultiTouchInjector multiTouchInjector = MultiTouchInjector.INSTANCE;
        multiTouchInjector.m1584up(1);
        if (aimAtivo) {
            multiTouchInjector.liberarExceto(2);
        } else {
            multiTouchInjector.liberarTudo();
            AimTouchController.INSTANCE.soltarDedo();
        }
        atualizarGrabMouse();
    }

    private final void limparRepeatsAtivos() {
        Iterator<Map.Entry<Integer, RepeatState>> it = repeatsAtivos.entrySet().iterator();
        while (it.hasNext()) {
            Iterator<Integer> it2 = it.next().getValue().getPointerIds().iterator();
            while (it2.hasNext()) {
                MultiTouchInjector.INSTANCE.m1584up(it2.next().intValue());
            }
        }
        repeatsAtivos.clear();
        repeatsAguardandoPlantar.clear();
    }

    private final void logFfAntiAcel(float f, float f2) {
        long jNanoTime = System.nanoTime();
        if (jNanoTime - ffLogUltimoNs < 120000000) {
            return;
        }
        ffLogUltimoNs = jNanoTime;
        float f3 = f == TouchPipeline.SIZE ? 1.0f : f2 / f;
        getFpsVirtualX();
        getFpsFfOrigemX();
        String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
        String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(f2)}, 1));
        String.format("%.3f", Arrays.copyOf(new Object[]{Float.valueOf(f3)}, 1));
        FpsFfAntiAceleracaoConfig fpsFfAntiAceleracaoConfig = FpsFfAntiAceleracaoConfig.INSTANCE;
        fpsFfAntiAceleracaoConfig.getDensidadeDpi();
        fpsFfAntiAceleracaoConfig.getSensitivity();
    }

    private final void loopMira() {
        long j;
        while (aimLoopAtivo) {
            MouseDeltaCoalescer mouseDeltaCoalescer = MouseDeltaCoalescer.INSTANCE;
            int iHzAtual = mouseDeltaCoalescer.hzAtual();
            boolean z = false;
            boolean z2 = iHzAtual > 0 && mouseDeltaCoalescer.temPendente();
            if (!keyUpAnalogPendente.isEmpty() || !teclaTapUpPendente.isEmpty() || !mouseTapUpPendente.isEmpty() || !repeatsAtivos.isEmpty() || resyncAnalogAposToggle || (aimAtivo && getFpsDedoAtivo())) {
                z = true;
            }
            if (z2 && iHzAtual >= 1000) {
                j = 1;
            } else if (!z2 || iHzAtual < 500) {
                j = (z2 || z) ? 4L : 16L;
            } else {
                j = 2;
            }
            try {
                Thread.sleep(j);
                InjectionMetrics.INSTANCE.onAimLoopTick();
                mouseDeltaCoalescer.tick();
                processarIdleUpMira();
                processarKeyUpAnalogPendente();
                processarTapUpPendente();
                processarRepeatsAtivos();
                finalizarResyncAnalogSeExpirado();
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    private final void notificarAtalhoApp(int i) {
        IVirtualCursorListener iVirtualCursorListener = virtualCursorListener;
        if (iVirtualCursorListener == null) {
            return;
        }
        try {
            iVirtualCursorListener.onPhysicalCapture(i, true, false);
        } catch (Exception e) {
            invalidarCallbacksMaoSeMorto(e);
            Log.w(TAG, "Falha ao repassar atalho app", e);
        }
    }

    private final void notificarCapturaFisica(int i, boolean z, boolean z2) {
        IVirtualCursorListener iVirtualCursorListener;
        if (capturaFisicaAtiva && z && (iVirtualCursorListener = virtualCursorListener) != null) {
            try {
                iVirtualCursorListener.onPhysicalCapture(i, z, z2);
            } catch (Exception e) {
                invalidarCallbacksMaoSeMorto(e);
                Log.w(TAG, "Falha ao repassar captura f�sica", e);
            }
        }
    }

    private final void notificarCursorVirtualClique(int i, boolean z) {
        IVirtualCursorListener iVirtualCursorListener;
        if (editarHudAtivo && (iVirtualCursorListener = virtualCursorListener) != null) {
            try {
                iVirtualCursorListener.onMouseButton(i, z);
            } catch (Exception e) {
                invalidarCallbacksMaoSeMorto(e);
                Log.w(TAG, "Falha ao repassar clique do cursor virtual", e);
            }
        }
    }

    private final void notificarCursorVirtualUi(int i, int i2) {
        IVirtualCursorListener iVirtualCursorListener;
        if ((i == 0 && i2 == 0) || !callbacksMaoVivos || (iVirtualCursorListener = virtualCursorListener) == null) {
            return;
        }
        try {
            iVirtualCursorListener.onMouseDelta(i, i2);
            callbacksMaoVivos = true;
        } catch (Exception e) {
            callbacksMaoVivos = false;
            invalidarCallbacksMaoSeMorto(e);
            Log.w(TAG, "Falha ao mover cursor virtual", e);
        }
    }

    private final void notificarMovimentoMouse(int i, int i2) {
        if (entradaAtiva) {
            MouseDeltaCoalescer.INSTANCE.offer(i, i2);
        }
    }

    private final bc1 obterPosicaoBotaoMouse(int i) {
        List<bc1> listPosicoesMapeadas = posicoesMapeadas(i);
        listPosicoesMapeadas.getClass();
        return listPosicoesMapeadas.isEmpty() ? null : listPosicoesMapeadas.get(0);
    }

    private final bc1 obterPosicaoCursorVirtual() {
        if (callbacksMaoVivos) {
            try {
                ICursorPositionProvider iCursorPositionProvider = cursorPositionProvider;
                if (iCursorPositionProvider != null) {
                    Integer numValueOf = Integer.valueOf(iCursorPositionProvider.getCursorX());
                    Integer numValueOf2 = Integer.valueOf(iCursorPositionProvider.getCursorY());
                    bc1 bc1Var = new bc1(numValueOf, numValueOf2);
                    if (posicaoCursorValida(bc1Var)) {
                        maoCursorX = numValueOf.intValue();
                        maoCursorY = numValueOf2.intValue();
                        maoCursorSincronizado = true;
                        return bc1Var;
                    }
                }
            } catch (Exception e) {
                invalidarCallbacksMaoSeMorto(e);
                Log.w(TAG, "Falha ao ler posi��o do cursor virtual", e);
            }
        }
        return (maoCursorSincronizado && posicaoCursorValida(new bc1(Integer.valueOf((int) maoCursorX), Integer.valueOf((int) maoCursorY)))) ? new bc1(Integer.valueOf((int) maoCursorX), Integer.valueOf((int) maoCursorY)) : posicaoPadraoMao();
    }

    private final void pararLeituraTeclado(boolean z) {
        entradaAtiva = false;
        PhysicalInputSource physicalInputSource = inputReader;
        if (physicalInputSource != null) {
            physicalInputSource.definirGrabMouse(false);
        }
        aimLoopAtivo = false;
        aimLoop = null;
        PhysicalInputSource physicalInputSource2 = inputReader;
        if (physicalInputSource2 != null) {
            physicalInputSource2.stop();
        }
        inputReader = null;
        direcoesPressionadas.clear();
        keyUpAnalogPendente.clear();
        MouseDeltaCoalescer.INSTANCE.limpar();
        liberarMapaPonteiros(mouseBtnsAtivos);
        liberarMapaPonteiros(teclasAtivas);
        liberarMaoToque();
        maoDxAcc = TouchPipeline.SIZE;
        maoDyAcc = TouchPipeline.SIZE;
        if (!z) {
            if (aimAtivo) {
                MultiTouchInjector.INSTANCE.m1584up(1);
                return;
            } else {
                MultiTouchInjector.INSTANCE.liberarTudo();
                AimTouchController.INSTANCE.soltarDedo();
                return;
            }
        }
        aimAtivo = false;
        aimDesejado = false;
        aimSuspendido = false;
        AimTouchController.INSTANCE.desativar();
        MultiTouchInjector.INSTANCE.liberarTudo();
        if (larguraTela <= 0 || alturaTela <= 0) {
            return;
        }
        MouseCursorWarper.INSTANCE.restaurarCentro(larguraTela, alturaTela);
    }

    public static /* synthetic */ void pararLeituraTeclado$default(InputInjectionEngine inputInjectionEngine, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        inputInjectionEngine.pararLeituraTeclado(z);
    }

    private final void pararRepeat(int i) {
        RepeatState repeatStateRemove = repeatsAtivos.remove(Integer.valueOf(i));
        if (repeatStateRemove == null) {
            return;
        }
        Iterator<Integer> it = repeatStateRemove.getPointerIds().iterator();
        while (it.hasNext()) {
            MultiTouchInjector.INSTANCE.m1584up(it.next().intValue());
        }
    }

    private final boolean posicaoCursorValida(bc1 bc1Var) {
        Object obj = bc1Var.f1292a;
        Object obj2 = bc1Var.f1293b;
        if (((Number) obj).intValue() < 0 || ((Number) obj2).intValue() < 0) {
            return false;
        }
        if (larguraTela <= 0 || ((Number) bc1Var.f1292a).intValue() <= larguraTela) {
            return alturaTela <= 0 || ((Number) obj2).intValue() <= alturaTela;
        }
        return false;
    }

    private final bc1 posicaoPadraoMao() {
        int i = larguraTela;
        return new bc1(Integer.valueOf((i / 2) - ((int) (i * CURSOR_MAO_OFFSET_ESQUERDA_FRAC))), Integer.valueOf(alturaTela / 2));
    }

    private final void posicionarCursorMaoCentroComOffset() {
        int i = larguraTela;
        maoCursorX = (i / 2.0f) - (i * CURSOR_MAO_OFFSET_ESQUERDA_FRAC);
        maoCursorY = alturaTela / 2.0f;
        maoCursorSincronizado = true;
    }

    private final List<bc1> posicoesMapeadas(int i) {
        List<bc1> list = bindings.get(Integer.valueOf(i));
        return list == null ? n60.f7259a : list;
    }

    private final void pressionarBotaoMouse(int i) {
        if (aimAtivo) {
            List<bc1> listPosicoesMapeadas = posicoesMapeadas(i);
            if (listPosicoesMapeadas.isEmpty()) {
                return;
            }
            if (bindingRepeat.containsKey(Integer.valueOf(i))) {
                aplicarInterrupcaoMutua(i);
                iniciarRepeat(i);
                return;
            }
            if (mouseBtnsAtivos.containsKey(Integer.valueOf(i))) {
                return;
            }
            antiBlockGuardarAntesDoLadoDireito(i);
            long jNanoTime = System.nanoTime();
            aplicarInterrupcaoMutua(i);
            ArrayList arrayList = new ArrayList();
            for (bc1 bc1Var : listPosicoesMapeadas) {
                int iIntValue = ((Number) bc1Var.f1292a).intValue();
                int iIntValue2 = ((Number) bc1Var.f1293b).intValue();
                int iAlocarTapId = alocarTapId();
                if (iAlocarTapId < 0) {
                    Log.w(TAG, "Sem slot de toque para mouse code=" + i);
                    break;
                }
                arrayList.add(Integer.valueOf(iAlocarTapId));
                MultiTouchInjector multiTouchInjector = MultiTouchInjector.INSTANCE;
                bc1 bc1VarJitterDown = multiTouchInjector.jitterDown(iIntValue, iIntValue2, 5);
                multiTouchInjector.down(iAlocarTapId, ((Number) bc1VarJitterDown.f1292a).floatValue(), ((Number) bc1VarJitterDown.f1293b).floatValue());
            }
            if (arrayList.isEmpty()) {
                return;
            }
            mouseBtnsAtivos.put(Integer.valueOf(i), arrayList);
            InjectionMetrics.INSTANCE.onClickLatency(System.nanoTime() - jNanoTime);
            Integer num = bindingTapMs.get(Integer.valueOf(i));
            int iIntValue3 = num != null ? num.intValue() : 0;
            if (iIntValue3 <= 0) {
                arrayList.size();
            } else {
                mouseTapUpPendente.put(Integer.valueOf(i), Long.valueOf(System.currentTimeMillis() + ((long) iIntValue3)));
                arrayList.size();
            }
        }
    }

    private final void pressionarMao(int i) {
        bc1 bc1VarObterPosicaoBotaoMouse;
        if (aimAtivo || maoToqueAtivo) {
            return;
        }
        aplicarInterrupcaoMutua(i);
        if (i == 272) {
            bc1VarObterPosicaoBotaoMouse = obterPosicaoCursorVirtual();
        } else {
            bc1VarObterPosicaoBotaoMouse = obterPosicaoBotaoMouse(i);
            if (bc1VarObterPosicaoBotaoMouse == null) {
                return;
            }
        }
        if (posicaoCursorValida(bc1VarObterPosicaoBotaoMouse)) {
            maoCursorX = ((Number) bc1VarObterPosicaoBotaoMouse.f1292a).intValue();
            maoCursorY = ((Number) bc1VarObterPosicaoBotaoMouse.f1293b).intValue();
            maoCursorSincronizado = true;
            maoToqueAtivo = true;
            MultiTouchInjector.INSTANCE.down(19, maoCursorX, maoCursorY);
            Object obj = bc1VarObterPosicaoBotaoMouse.f1292a;
            Object obj2 = bc1VarObterPosicaoBotaoMouse.f1293b;
            Objects.toString(obj);
            Objects.toString(obj2);
        }
    }

    private final void pressionarTeclaMapeada(int i) {
        if (ehBotaoMouse(i) || teclasAtivas.containsKey(Integer.valueOf(i))) {
            return;
        }
        List<bc1> listPosicoesMapeadas = posicoesMapeadas(i);
        if (listPosicoesMapeadas.isEmpty()) {
            return;
        }
        antiBlockGuardarAntesDoLadoDireito(i);
        InjectionDiag.teclaMapeada$default(InjectionDiag.INSTANCE, i, true, 0L, 4, null);
        ArrayList arrayList = new ArrayList();
        for (bc1 bc1Var : listPosicoesMapeadas) {
            int iIntValue = ((Number) bc1Var.f1292a).intValue();
            int iIntValue2 = ((Number) bc1Var.f1293b).intValue();
            int iAlocarTapId = alocarTapId();
            if (iAlocarTapId < 0) {
                Log.w(TAG, "Sem slot de toque para tecla code=" + i);
                break;
            }
            arrayList.add(Integer.valueOf(iAlocarTapId));
            MultiTouchInjector multiTouchInjector = MultiTouchInjector.INSTANCE;
            bc1 bc1VarJitterDown = multiTouchInjector.jitterDown(iIntValue, iIntValue2, 5);
            multiTouchInjector.down(iAlocarTapId, ((Number) bc1VarJitterDown.f1292a).floatValue(), ((Number) bc1VarJitterDown.f1293b).floatValue());
        }
        if (arrayList.isEmpty()) {
            return;
        }
        teclasAtivas.put(Integer.valueOf(i), arrayList);
        Integer num = bindingTapMs.get(Integer.valueOf(i));
        int iIntValue3 = num != null ? num.intValue() : 0;
        if (iIntValue3 <= 0) {
            arrayList.size();
        } else {
            teclaTapUpPendente.put(Integer.valueOf(i), Long.valueOf(System.currentTimeMillis() + ((long) iIntValue3)));
            arrayList.size();
        }
    }

    private final boolean processarAim(List<String> list) {
        Integer numM3069z0;
        int iIntValue;
        Integer numM3069z1;
        if (list.size() >= 6 && (numM3069z0 = gw1.m3069z0(list.get(1))) != null) {
            int iIntValue2 = numM3069z0.intValue();
            Float fM2862y0 = fw1.m2862y0(list.get(2));
            if (fM2862y0 != null) {
                float fFloatValue = fM2862y0.floatValue();
                Float fM2862y1 = fw1.m2862y0(list.get(3));
                if (fM2862y1 != null) {
                    float fFloatValue2 = fM2862y1.floatValue();
                    Float fM2862y2 = fw1.m2862y0(list.get(4));
                    if (fM2862y2 != null) {
                        float fFloatValue3 = fM2862y2.floatValue();
                        Float fM2862y3 = fw1.m2862y0(list.get(5));
                        if (fM2862y3 != null) {
                            float fFloatValue4 = fM2862y3.floatValue();
                            String str = (String) AbstractC1377rp.m5871r0(6, list);
                            if (str == null || (numM3069z1 = gw1.m3069z0(str)) == null || (iIntValue = numM3069z1.intValue()) < 0) {
                                iIntValue = 0;
                            }
                            aimCfg = new AimCfg(iIntValue2, fFloatValue, fFloatValue2, fFloatValue3, fFloatValue4, (iIntValue <= 0 || iIntValue != iIntValue2) ? iIntValue : 0);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private final boolean processarAnalog(List<String> list) {
        Integer numM3069z0;
        if (list.size() >= 8 && (numM3069z0 = gw1.m3069z0(list.get(1))) != null) {
            int iIntValue = numM3069z0.intValue();
            Integer numM3069z1 = gw1.m3069z0(list.get(2));
            if (numM3069z1 != null) {
                int iIntValue2 = numM3069z1.intValue();
                Integer numM3069z2 = gw1.m3069z0(list.get(3));
                if (numM3069z2 != null) {
                    int iIntValue3 = numM3069z2.intValue();
                    Integer numM3069z3 = gw1.m3069z0(list.get(4));
                    if (numM3069z3 != null) {
                        int iIntValue4 = numM3069z3.intValue();
                        Float fM2862y0 = fw1.m2862y0(list.get(5));
                        if (fM2862y0 != null) {
                            float fFloatValue = fM2862y0.floatValue();
                            Float fM2862y1 = fw1.m2862y0(list.get(6));
                            if (fM2862y1 != null) {
                                float fFloatValue2 = fM2862y1.floatValue();
                                Float fM2862y2 = fw1.m2862y0(list.get(7));
                                if (fM2862y2 != null) {
                                    analogCfg = new AnalogCfg(iIntValue, iIntValue2, iIntValue3, iIntValue4, fFloatValue, fFloatValue2, fM2862y2.floatValue());
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    private final boolean processarAtalhos(List<String> list) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int i = 0;
        if (list.size() < 4) {
            return false;
        }
        Integer numM3069z0 = gw1.m3069z0(list.get(1));
        if (numM3069z0 == null || (iIntValue = numM3069z0.intValue()) < 0) {
            iIntValue = 0;
        }
        atalhoEditarHud = iIntValue;
        Integer numM3069z1 = gw1.m3069z0(list.get(2));
        if (numM3069z1 == null || (iIntValue2 = numM3069z1.intValue()) < 0) {
            iIntValue2 = 0;
        }
        atalhoDigitar = iIntValue2;
        Integer numM3069z2 = gw1.m3069z0(list.get(3));
        if (numM3069z2 != null && (iIntValue3 = numM3069z2.intValue()) >= 0) {
            i = iIntValue3;
        }
        atalhoConfig = i;
        return true;
    }

    private final boolean processarDisplayId(List<String> list) {
        Integer numM3069z0;
        int iIntValue;
        if (list.size() < 2 || (numM3069z0 = gw1.m3069z0(list.get(1))) == null || (iIntValue = numM3069z0.intValue()) < 0) {
            return false;
        }
        PrivilegedTouchInjector.INSTANCE.definirDisplayId(iIntValue);
        if (larguraTela > 0 && alturaTela > 0) {
            MultiTouchInjector.INSTANCE.sincronizarTamanhoTela(larguraTela, alturaTela, "DISPLAY_ID " + iIntValue);
        } else if (iIntValue != 0) {
            MultiTouchInjector.INSTANCE.desativarUinput();
        }
        return true;
    }

    private final boolean processarFpsAcelLimiar(List<String> list) {
        int iIntValue;
        if (list.size() < 7) {
            return false;
        }
        Integer numM3069z0 = gw1.m3069z0(list.get(1));
        boolean z = (numM3069z0 != null ? numM3069z0.intValue() : 0) != 0;
        Integer numM3069z1 = gw1.m3069z0(list.get(2));
        int iM5140F = numM3069z1 != null ? p32.m5140F(numM3069z1.intValue(), 0, 50) : 8;
        Integer numM3069z2 = gw1.m3069z0(list.get(3));
        int iM5140F2 = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
        int iM5140F3 = numM3069z2 != null ? p32.m5140F(numM3069z2.intValue(), 1000, AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS) : 1500;
        Integer numM3069z3 = gw1.m3069z0(list.get(4));
        int iM5140F4 = numM3069z3 != null ? p32.m5140F(numM3069z3.intValue(), 0, 50) : 8;
        Integer numM3069z4 = gw1.m3069z0(list.get(5));
        if (numM3069z4 != null) {
            iM5140F2 = p32.m5140F(numM3069z4.intValue(), 1000, AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS);
        }
        Integer numM3069z5 = gw1.m3069z0(list.get(6));
        if (numM3069z5 == null || (iIntValue = numM3069z5.intValue()) < 0) {
            iIntValue = 0;
        }
        FpsAcelLimiarConfig fpsAcelLimiarConfig = FpsAcelLimiarConfig.INSTANCE;
        if (iIntValue != fpsAcelLimiarConfig.getHoldCode()) {
            fpsAcelLimiarConfig.setHoldPressed(false);
        }
        fpsAcelLimiarConfig.setAtivo(z);
        fpsAcelLimiarConfig.setThresholdX(iM5140F);
        fpsAcelLimiarConfig.setGainXPermil(iM5140F3);
        fpsAcelLimiarConfig.setThresholdY(iM5140F4);
        fpsAcelLimiarConfig.setGainYPermil(iM5140F2);
        fpsAcelLimiarConfig.setHoldCode(iIntValue);
        if (iIntValue == 0) {
            fpsAcelLimiarConfig.setHoldPressed(false);
        }
        return true;
    }

    private final boolean processarFpsAntiBlock(List<String> list) {
        if (list.size() < 2) {
            return false;
        }
        antiBlockModo = FpsAntiBlockModo.Companion.fromId(list.get(1));
        antiBlockModo.getId();
        return true;
    }

    private final boolean processarFpsDesacelModo(List<String> list) {
        ModoDesacelFps modoDesacelFps;
        if (list.size() < 2) {
            return false;
        }
        FpsDesacelModo fpsDesacelModo = FpsDesacelModo.INSTANCE;
        String upperCase = list.get(1).toUpperCase(Locale.ROOT);
        upperCase.getClass();
        if (upperCase.equals("OFF")) {
            modoDesacelFps = ModoDesacelFps.OFF;
        } else {
            if (!upperCase.equals("FF_ANTI_ACEL")) {
                return false;
            }
            modoDesacelFps = ModoDesacelFps.FF_ANTI_ACEL;
        }
        fpsDesacelModo.setModoAtivo(modoDesacelFps);
        ModoDesacelFps modoAtivo = fpsDesacelModo.getModoAtivo();
        fpsDesacelModo.getModoAtivo();
        ModoDesacelFps modoDesacelFps2 = ModoDesacelFps.OFF;
        Objects.toString(modoAtivo);
        return true;
    }

    private final boolean processarFpsFfAnti(List<String> list) {
        if (list.size() < 3) {
            return false;
        }
        FpsFfAntiAceleracaoConfig fpsFfAntiAceleracaoConfig = FpsFfAntiAceleracaoConfig.INSTANCE;
        Float fM2862y0 = fw1.m2862y0(list.get(1));
        if (fM2862y0 != null) {
            fpsFfAntiAceleracaoConfig.setSensitivity(p32.m5139E(fM2862y0.floatValue(), 0.1f, 5.0f));
            Float fM2862y1 = fw1.m2862y0(list.get(2));
            if (fM2862y1 != null) {
                float fFloatValue = fM2862y1.floatValue();
                if (fFloatValue < 120.0f) {
                    fFloatValue = 120.0f;
                }
                fpsFfAntiAceleracaoConfig.setDensidadeDpi(fFloatValue);
                fpsFfAntiAceleracaoConfig.getSensitivity();
                fpsFfAntiAceleracaoConfig.getDensidadeDpi();
                return true;
            }
        }
        return false;
    }

    private final boolean processarFpsLowSpeed(List<String> list) {
        int iM5140F;
        int iM5140F2;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        if (list.size() < 9) {
            if (list.size() < 7) {
                return false;
            }
            Integer numM3069z0 = gw1.m3069z0(list.get(1));
            boolean z = (numM3069z0 != null ? numM3069z0.intValue() : 0) != 0;
            Integer numM3069z1 = gw1.m3069z0(list.get(2));
            int iM5140F3 = numM3069z1 != null ? p32.m5140F(numM3069z1.intValue(), 0, 50) : 20;
            Integer numM3069z2 = gw1.m3069z0(list.get(3));
            int iM5140F4 = numM3069z2 != null ? p32.m5140F(numM3069z2.intValue(), 100, 1000) : 600;
            Integer numM3069z3 = gw1.m3069z0(list.get(4));
            iM5140F = numM3069z3 != null ? p32.m5140F(numM3069z3.intValue(), 0, 50) : 20;
            Integer numM3069z4 = gw1.m3069z0(list.get(5));
            iM5140F2 = numM3069z4 != null ? p32.m5140F(numM3069z4.intValue(), 100, 1000) : 600;
            Integer numM3069z5 = gw1.m3069z0(list.get(6));
            if (numM3069z5 == null || (iIntValue = numM3069z5.intValue()) < 0) {
                iIntValue = 0;
            }
            FpsLowSpeedGainConfig fpsLowSpeedGainConfig = FpsLowSpeedGainConfig.INSTANCE;
            if (iIntValue != fpsLowSpeedGainConfig.getHoldCodeX()) {
                fpsLowSpeedGainConfig.setHoldPressedX(false);
            }
            if (iIntValue != fpsLowSpeedGainConfig.getHoldCodeY()) {
                fpsLowSpeedGainConfig.setHoldPressedY(false);
            }
            fpsLowSpeedGainConfig.setAtivoX(z);
            fpsLowSpeedGainConfig.setThresholdX(iM5140F3);
            fpsLowSpeedGainConfig.setPrecisionXPermil(iM5140F4);
            fpsLowSpeedGainConfig.setHoldCodeX(iIntValue);
            fpsLowSpeedGainConfig.setAtivoY(z);
            fpsLowSpeedGainConfig.setThresholdY(iM5140F);
            fpsLowSpeedGainConfig.setPrecisionYPermil(iM5140F2);
            fpsLowSpeedGainConfig.setHoldCodeY(iIntValue);
            if (iIntValue == 0) {
                fpsLowSpeedGainConfig.setHoldPressedX(false);
                fpsLowSpeedGainConfig.setHoldPressedY(false);
            }
            return true;
        }
        Integer numM3069z6 = gw1.m3069z0(list.get(1));
        boolean z2 = (numM3069z6 != null ? numM3069z6.intValue() : 0) != 0;
        Integer numM3069z7 = gw1.m3069z0(list.get(2));
        int iM5140F5 = numM3069z7 != null ? p32.m5140F(numM3069z7.intValue(), 0, 50) : 20;
        Integer numM3069z8 = gw1.m3069z0(list.get(3));
        int iM5140F6 = numM3069z8 != null ? p32.m5140F(numM3069z8.intValue(), 100, 1000) : 600;
        Integer numM3069z9 = gw1.m3069z0(list.get(4));
        if (numM3069z9 == null || (iIntValue2 = numM3069z9.intValue()) < 0) {
            iIntValue2 = 0;
        }
        Integer numM3069z10 = gw1.m3069z0(list.get(5));
        boolean z3 = (numM3069z10 != null ? numM3069z10.intValue() : 0) != 0;
        Integer numM3069z11 = gw1.m3069z0(list.get(6));
        iM5140F = numM3069z11 != null ? p32.m5140F(numM3069z11.intValue(), 0, 50) : 20;
        Integer numM3069z12 = gw1.m3069z0(list.get(7));
        iM5140F2 = numM3069z12 != null ? p32.m5140F(numM3069z12.intValue(), 100, 1000) : 600;
        Integer numM3069z13 = gw1.m3069z0(list.get(8));
        if (numM3069z13 == null || (iIntValue3 = numM3069z13.intValue()) < 0) {
            iIntValue3 = 0;
        }
        FpsLowSpeedGainConfig fpsLowSpeedGainConfig2 = FpsLowSpeedGainConfig.INSTANCE;
        if (iIntValue2 != fpsLowSpeedGainConfig2.getHoldCodeX()) {
            fpsLowSpeedGainConfig2.setHoldPressedX(false);
        }
        if (iIntValue3 != fpsLowSpeedGainConfig2.getHoldCodeY()) {
            fpsLowSpeedGainConfig2.setHoldPressedY(false);
        }
        fpsLowSpeedGainConfig2.setAtivoX(z2);
        fpsLowSpeedGainConfig2.setThresholdX(iM5140F5);
        fpsLowSpeedGainConfig2.setPrecisionXPermil(iM5140F6);
        fpsLowSpeedGainConfig2.setHoldCodeX(iIntValue2);
        if (iIntValue2 == 0) {
            fpsLowSpeedGainConfig2.setHoldPressedX(false);
        }
        fpsLowSpeedGainConfig2.setAtivoY(z3);
        fpsLowSpeedGainConfig2.setThresholdY(iM5140F);
        fpsLowSpeedGainConfig2.setPrecisionYPermil(iM5140F2);
        fpsLowSpeedGainConfig2.setHoldCodeY(iIntValue3);
        if (iIntValue3 == 0) {
            fpsLowSpeedGainConfig2.setHoldPressedY(false);
        }
        return true;
    }

    private final boolean processarInterrupt(List<String> list) {
        Integer numM3069z0;
        Integer num;
        if (list.size() >= 3 && (numM3069z0 = gw1.m3069z0(list.get(1))) != null) {
            int iIntValue = numM3069z0.intValue();
            Integer numM3069z1 = gw1.m3069z0(list.get(2));
            if (numM3069z1 != null) {
                int iIntValue2 = numM3069z1.intValue();
                if (iIntValue <= 0) {
                    return false;
                }
                HashMap<Integer, Integer> map = interruptPartner;
                Integer numRemove = map.remove(numM3069z0);
                if (numRemove != null && (num = map.get(numRemove)) != null && num.intValue() == iIntValue) {
                    map.remove(numRemove);
                }
                if (iIntValue2 > 0 && iIntValue != iIntValue2) {
                    map.put(numM3069z0, numM3069z1);
                    map.put(numM3069z1, numM3069z0);
                }
                return true;
            }
        }
        return false;
    }

    private final void processarKeyUpAnalogPendente() {
        HashMap<Integer, Long> map = keyUpAnalogPendente;
        if (map.isEmpty()) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Set<Map.Entry<Integer, Long>> setEntrySet = map.entrySet();
        setEntrySet.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setEntrySet) {
            if (jCurrentTimeMillis >= ((Number) ((Map.Entry) obj).getValue()).longValue()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC1451tp.m6307o0(arrayList));
        int size = arrayList.size();
        boolean z = false;
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add((Integer) ((Map.Entry) obj2).getKey());
        }
        int size2 = arrayList2.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj3 = arrayList2.get(i2);
            i2++;
            int iIntValue = ((Number) obj3).intValue();
            keyUpAnalogPendente.remove(Integer.valueOf(iIntValue));
            if (direcoesPressionadas.remove(Integer.valueOf(iIntValue))) {
                z = true;
            }
        }
        if (z) {
            recalcularAnalogico();
        }
    }

    private final boolean processarMap(List<String> list) {
        Integer numM3069z0;
        Integer numM3069z1;
        Integer numM3069z2;
        Integer numM3069z3;
        Integer numM3069z4;
        int iIntValue = 0;
        if (list.size() < 4 || (numM3069z0 = gw1.m3069z0(list.get(1))) == null || (numM3069z1 = gw1.m3069z0(list.get(2))) == null || (numM3069z2 = gw1.m3069z0(list.get(3))) == null) {
            return false;
        }
        HashMap<Integer, List<bc1>> map = bindings;
        List<bc1> arrayList = map.get(numM3069z0);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            map.put(numM3069z0, arrayList);
        }
        arrayList.add(new bc1(numM3069z1, numM3069z2));
        String str = (String) AbstractC1377rp.m5871r0(4, list);
        if (str != null && (numM3069z4 = gw1.m3069z0(str)) != null) {
            iIntValue = numM3069z4.intValue();
        }
        if (iIntValue == 1) {
            String str2 = (String) AbstractC1377rp.m5871r0(5, list);
            bindingTapMs.put(numM3069z0, Integer.valueOf(p32.m5140F((str2 == null || (numM3069z3 = gw1.m3069z0(str2)) == null) ? 1 : numM3069z3.intValue(), 1, ServiceStarter.ERROR_UNKNOWN)));
            bindingRepeat.remove(numM3069z0);
        } else {
            bindingTapMs.remove(numM3069z0);
            bindingRepeat.remove(numM3069z0);
        }
        return true;
    }

    private final boolean processarMapRepeat(List<String> list) {
        Integer numM3069z0;
        Integer numM3069z1;
        Integer numM3069z2;
        Integer numM3069z3;
        Integer numM3069z4;
        boolean z = false;
        if (list.size() < 6 || (numM3069z0 = gw1.m3069z0(list.get(1))) == null || (numM3069z1 = gw1.m3069z0(list.get(2))) == null || (numM3069z2 = gw1.m3069z0(list.get(3))) == null) {
            return false;
        }
        Integer numM3069z5 = gw1.m3069z0(list.get(4));
        int iM5140F = p32.m5140F(numM3069z5 != null ? numM3069z5.intValue() : 1, 1, ServiceStarter.ERROR_UNKNOWN);
        Integer numM3069z6 = gw1.m3069z0(list.get(5));
        int iM5140F2 = p32.m5140F(numM3069z6 != null ? numM3069z6.intValue() : 1, 1, 50);
        String str = (String) AbstractC1377rp.m5871r0(6, list);
        boolean z2 = (str == null || (numM3069z4 = gw1.m3069z0(str)) == null || numM3069z4.intValue() != 1) ? false : true;
        String str2 = (String) AbstractC1377rp.m5871r0(7, list);
        if (str2 != null && (numM3069z3 = gw1.m3069z0(str2)) != null && numM3069z3.intValue() == 1) {
            z = true;
        }
        HashMap<Integer, List<bc1>> map = bindings;
        List<bc1> arrayList = map.get(numM3069z0);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            map.put(numM3069z0, arrayList);
        }
        arrayList.add(new bc1(numM3069z1, numM3069z2));
        bindingTapMs.remove(numM3069z0);
        bindingRepeat.put(numM3069z0, new RepeatCfg(iM5140F, iM5140F2, z2, z));
        return true;
    }

    private final void processarMouseBtnsPendentes() {
        LinkedHashSet<Integer> linkedHashSet = mouseBtnsPendentesDown;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        flushMousePollPendente();
        List listM5879z0 = AbstractC1377rp.m5879z0(linkedHashSet);
        linkedHashSet.clear();
        Iterator it = listM5879z0.iterator();
        while (it.hasNext()) {
            pressionarBotaoMouse(((Number) it.next()).intValue());
        }
        if (listM5879z0.isEmpty()) {
            return;
        }
        recalcularAnalogico();
    }

    private final boolean processarNavLock(List<String> list) {
        return aplicarNavLock(hp0.m3214e(AbstractC1377rp.m5871r0(1, list), "1"));
    }

    private final boolean processarPointerSpeed(List<String> list) {
        Integer numM3069z0;
        if (list.size() >= 2 && (numM3069z0 = gw1.m3069z0(list.get(1))) != null) {
            return executarShellWm(AbstractC1414sp.m6124n0("settings", "put", "system", "pointer_speed", String.valueOf(p32.m5140F(numM3069z0.intValue(), -7, 7))));
        }
        return false;
    }

    private final void processarRepeatsAtivos() {
        int i;
        HashMap<Integer, RepeatState> map = repeatsAtivos;
        if (map.isEmpty()) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<Integer, RepeatState>> it = map.entrySet().iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<Integer, RepeatState> next = it.next();
            int iIntValue = next.getKey().intValue();
            RepeatState value = next.getValue();
            if (jCurrentTimeMillis >= value.getNextAtMs()) {
                if (!value.getPhaseDown()) {
                    Iterator<Integer> it2 = value.getPointerIds().iterator();
                    while (it2.hasNext()) {
                        MultiTouchInjector.INSTANCE.m1584up(it2.next().intValue());
                    }
                    value.getPointerIds().clear();
                    value.setPhaseDown(true);
                    value.setNextAtMs((value.getHoldPulse() ? 40L : 16L) + jCurrentTimeMillis);
                    if (value.getRemaining() == 0) {
                        arrayList.add(Integer.valueOf(iIntValue));
                    }
                } else if (value.getRemaining() == 0) {
                    arrayList.add(Integer.valueOf(iIntValue));
                } else {
                    Iterator<Integer> it3 = value.getPointerIds().iterator();
                    while (it3.hasNext()) {
                        MultiTouchInjector.INSTANCE.m1584up(it3.next().intValue());
                    }
                    value.getPointerIds().clear();
                    List<bc1> listPosicoesMapeadas = posicoesMapeadas(iIntValue);
                    if (listPosicoesMapeadas.isEmpty()) {
                        arrayList.add(Integer.valueOf(iIntValue));
                    } else {
                        for (bc1 bc1Var : listPosicoesMapeadas) {
                            int iIntValue2 = ((Number) bc1Var.f1292a).intValue();
                            int iIntValue3 = ((Number) bc1Var.f1293b).intValue();
                            int iAlocarTapId = alocarTapId();
                            if (iAlocarTapId < 0) {
                                break;
                            }
                            value.getPointerIds().add(Integer.valueOf(iAlocarTapId));
                            MultiTouchInjector multiTouchInjector = MultiTouchInjector.INSTANCE;
                            bc1 bc1VarJitterDown = multiTouchInjector.jitterDown(iIntValue2, iIntValue3, 5);
                            multiTouchInjector.down(iAlocarTapId, ((Number) bc1VarJitterDown.f1292a).floatValue(), ((Number) bc1VarJitterDown.f1293b).floatValue());
                        }
                        if (value.getPointerIds().isEmpty()) {
                            arrayList.add(Integer.valueOf(iIntValue));
                        } else {
                            value.setPhaseDown(false);
                            value.setNextAtMs(((long) value.getTapMs()) + jCurrentTimeMillis);
                            if (value.getRemaining() > 0) {
                                value.setRemaining(value.getRemaining() - 1);
                            }
                        }
                    }
                }
            }
        }
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            pararRepeat(((Number) obj).intValue());
        }
    }

    private final boolean processarScreen(List<String> list) {
        Integer numM3069z0;
        if (list.size() >= 2 && hw1.m3307B0(list.get(1), "AUTO")) {
            sincronizarTelaDispositivo();
            return larguraTela > 0 && alturaTela > 0;
        }
        if (list.size() < 3 || (numM3069z0 = gw1.m3069z0(list.get(1))) == null) {
            return false;
        }
        int iIntValue = numM3069z0.intValue();
        Integer numM3069z1 = gw1.m3069z0(list.get(2));
        if (numM3069z1 == null) {
            return false;
        }
        int iIntValue2 = numM3069z1.intValue();
        if (iIntValue <= 0 || iIntValue2 <= 0) {
            return false;
        }
        larguraTela = iIntValue;
        alturaTela = iIntValue2;
        MultiTouchInjector.INSTANCE.sincronizarTamanhoTela(iIntValue, iIntValue2, InjectionProtocol.SCREEN);
        return true;
    }

    private final boolean processarSetDpi(List<String> list) {
        int iIntValue;
        if (list.size() < 2) {
            return false;
        }
        if (hw1.m3307B0(list.get(1), "reset")) {
            return executarShellWm(AbstractC1414sp.m6124n0("wm", "density", "reset"));
        }
        Integer numM3069z0 = gw1.m3069z0(list.get(1));
        if (numM3069z0 == null || (iIntValue = numM3069z0.intValue()) < 72 || iIntValue > 800) {
            return false;
        }
        return executarShellWm(AbstractC1414sp.m6124n0("wm", "density", String.valueOf(iIntValue)));
    }

    private final boolean processarSetRes(List<String> list) {
        Integer numM3069z0;
        if (list.size() >= 2 && hw1.m3307B0(list.get(1), "reset")) {
            return executarShellWm(AbstractC1414sp.m6124n0("wm", "size", "reset"));
        }
        if (list.size() < 3 || (numM3069z0 = gw1.m3069z0(list.get(1))) == null) {
            return false;
        }
        int iIntValue = numM3069z0.intValue();
        Integer numM3069z1 = gw1.m3069z0(list.get(2));
        if (numM3069z1 == null) {
            return false;
        }
        int iIntValue2 = numM3069z1.intValue();
        if (iIntValue <= 0 || iIntValue2 <= 0) {
            return false;
        }
        return executarShellWm(AbstractC1414sp.m6124n0("wm", "size", iIntValue + "x" + iIntValue2));
    }

    private final void processarSuspendHold(boolean z, boolean z2) {
        AimCfg aimCfg2 = aimCfg;
        if (aimCfg2 != null && aimCfg2.getSuspend() > 0) {
            if (!z) {
                if (aimSuspendido) {
                    aimSuspendido = false;
                    sincronizarAimEfetivo(aimCfg2, z2, true);
                    return;
                }
                return;
            }
            if (aimAtivo && !aimSuspendido) {
                aimSuspendido = true;
                sincronizarAimEfetivo(aimCfg2, z2, true);
            }
        }
    }

    private final void processarTapUpPendente() {
        HashMap<Integer, Long> map = teclaTapUpPendente;
        if (map.isEmpty() && mouseTapUpPendente.isEmpty()) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = 0;
        if (!map.isEmpty()) {
            Set<Map.Entry<Integer, Long>> setEntrySet = map.entrySet();
            setEntrySet.getClass();
            ArrayList arrayList = new ArrayList();
            for (Object obj : setEntrySet) {
                if (jCurrentTimeMillis >= ((Number) ((Map.Entry) obj).getValue()).longValue()) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC1451tp.m6307o0(arrayList));
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj2 = arrayList.get(i2);
                i2++;
                arrayList2.add((Integer) ((Map.Entry) obj2).getKey());
            }
            int size2 = arrayList2.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj3 = arrayList2.get(i3);
                i3++;
                int iIntValue = ((Number) obj3).intValue();
                teclaTapUpPendente.remove(Integer.valueOf(iIntValue));
                soltarTeclaMapeada(iIntValue);
            }
        }
        HashMap<Integer, Long> map2 = mouseTapUpPendente;
        if (map2.isEmpty()) {
            return;
        }
        Set<Map.Entry<Integer, Long>> setEntrySet2 = map2.entrySet();
        setEntrySet2.getClass();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj4 : setEntrySet2) {
            if (jCurrentTimeMillis >= ((Number) ((Map.Entry) obj4).getValue()).longValue()) {
                arrayList3.add(obj4);
            }
        }
        ArrayList arrayList4 = new ArrayList(AbstractC1451tp.m6307o0(arrayList3));
        int size3 = arrayList3.size();
        int i4 = 0;
        while (i4 < size3) {
            Object obj5 = arrayList3.get(i4);
            i4++;
            arrayList4.add((Integer) ((Map.Entry) obj5).getKey());
        }
        int size4 = arrayList4.size();
        while (i < size4) {
            Object obj6 = arrayList4.get(i);
            i++;
            int iIntValue2 = ((Number) obj6).intValue();
            mouseTapUpPendente.remove(Integer.valueOf(iIntValue2));
            List<Integer> listRemove = mouseBtnsAtivos.remove(Integer.valueOf(iIntValue2));
            if (listRemove != null) {
                Iterator<Integer> it = listRemove.iterator();
                while (it.hasNext()) {
                    MultiTouchInjector.INSTANCE.m1584up(it.next().intValue());
                }
                listRemove.size();
            }
        }
    }

    private final boolean processarToque(List<String> list) {
        Integer numM3069z0;
        if (list.size() >= 3 && (numM3069z0 = gw1.m3069z0(list.get(1))) != null) {
            int iIntValue = numM3069z0.intValue();
            Integer numM3069z1 = gw1.m3069z0(list.get(2));
            if (numM3069z1 != null) {
                return injetarTap(iIntValue, numM3069z1.intValue());
            }
        }
        return false;
    }

    private final boolean processarWmReset() {
        return executarShellWm(AbstractC1414sp.m6124n0("wm", "reset"));
    }

    private final float ratioYEfetivoFps() {
        int i;
        int i2 = larguraTela;
        if (i2 <= 0 || (i = alturaTela) <= 0) {
            return 0.6f;
        }
        return ((i2 / i) / FPS_ASPECT_REF) * 0.6f;
    }

    private final void recalcularAnalogico() {
        AnalogCfg analogCfg2 = analogCfg;
        if (analogCfg2 == null) {
            return;
        }
        float fResolverComponenteEixo = resolverComponenteEixo(analogCfg2.getLeft(), analogCfg2.getRight());
        float fResolverComponenteEixo2 = resolverComponenteEixo(analogCfg2.getUp(), analogCfg2.getDown());
        if (fResolverComponenteEixo == TouchPipeline.SIZE && fResolverComponenteEixo2 == TouchPipeline.SIZE) {
            MultiTouchInjector multiTouchInjector = MultiTouchInjector.INSTANCE;
            if (multiTouchInjector.estaAtivo(1)) {
                InjectionDiag.INSTANCE.analogRecalc(direcoesPressionadas, "UP");
                multiTouchInjector.m1584up(1);
                return;
            }
            return;
        }
        float fSqrt = (float) Math.sqrt((fResolverComponenteEixo2 * fResolverComponenteEixo2) + (fResolverComponenteEixo * fResolverComponenteEixo));
        float raio = analogCfg2.getRaio() * 0.9f;
        float cx = ((fResolverComponenteEixo / fSqrt) * raio) + analogCfg2.getCx();
        float cy = ((fResolverComponenteEixo2 / fSqrt) * raio) + analogCfg2.getCy();
        MultiTouchInjector multiTouchInjector2 = MultiTouchInjector.INSTANCE;
        if (multiTouchInjector2.estaAtivo(1)) {
            InjectionDiag.INSTANCE.analogRecalc(direcoesPressionadas, "MOVE");
            multiTouchInjector2.mover(1, cx, cy);
            return;
        }
        InjectionDiag.INSTANCE.analogRecalc(direcoesPressionadas, "DOWN");
        analogCfg2.getCx();
        analogCfg2.getCy();
        multiTouchInjector2.down(1, analogCfg2.getCx(), analogCfg2.getCy());
        multiTouchInjector2.mover(1, cx, cy);
    }

    private final void reiniciarLeituraTeclado() {
        synchronized (mouseLock) {
            boolean z = aimAtivo;
            InputInjectionEngine inputInjectionEngine = INSTANCE;
            float fpsVirtualX = inputInjectionEngine.getFpsVirtualX();
            float fpsVirtualY = inputInjectionEngine.getFpsVirtualY();
            inputInjectionEngine.pararLeituraTeclado(false);
            inputInjectionEngine.iniciarLeituraTeclado();
            inputInjectionEngine.restaurarMiraFpsAposReinicio(z, fpsVirtualX, fpsVirtualY);
        }
    }

    private final float resolverComponenteEixo(int i, int i2) {
        LinkedHashSet<Integer> linkedHashSet = direcoesPressionadas;
        boolean zContains = linkedHashSet.contains(Integer.valueOf(i));
        boolean zContains2 = linkedHashSet.contains(Integer.valueOf(i2));
        if (!zContains || !zContains2) {
            if (zContains) {
                return -1.0f;
            }
            if (zContains2) {
                return 1.0f;
            }
            return TouchPipeline.SIZE;
        }
        Iterator<Integer> it = linkedHashSet.iterator();
        it.getClass();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            if (iIntValue == i) {
                return -1.0f;
            }
            if (iIntValue == i2) {
                return 1.0f;
            }
        }
        return TouchPipeline.SIZE;
    }

    private final void restaurarMiraFpsAposReinicio(boolean z, float f, float f2) {
        if (!z || aimCfg == null) {
            return;
        }
        aimDesejado = true;
        aimSuspendido = false;
        aimAtivo = true;
        boolean zEstaAtivo = MultiTouchInjector.INSTANCE.estaAtivo(2);
        AimTouchController aimTouchController = AimTouchController.INSTANCE;
        AimCfg aimCfg2 = aimCfg;
        aimCfg2.getClass();
        aimTouchController.restaurarAposReinicio(f, f2, aimCfg2.getCx(), zEstaAtivo);
        MouseCursorWarper.INSTANCE.congelarModoFps(larguraTela, alturaTela);
        ultimoEventoMiraNs = 0L;
        try {
            og0 og0Var = aimStateListener;
            if (og0Var != null) {
                og0Var.invoke(Boolean.TRUE);
            }
        } catch (Exception e) {
            Log.w(TAG, "Falha ao notificar listener mira ap�s rein�cio", e);
        }
        getFpsVirtualX();
        getFpsVirtualY();
    }

    private final void sincronizarAimEfetivo(AimCfg aimCfg2, boolean z, boolean z2) {
        boolean z3 = aimDesejado && !aimSuspendido;
        if (z3 == aimAtivo) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!z2) {
            if (jCurrentTimeMillis - ultimoToggleMiraMs < (z ? 80L : 35L)) {
                return;
            } else {
                ultimoToggleMiraMs = jCurrentTimeMillis;
            }
        }
        keyUpAnalogPendente.clear();
        mouseBtnsPendentesDown.clear();
        iniciarResyncAnalogAposToggle(jCurrentTimeMillis);
        aimAtivo = z3;
        limparRepeatsAtivos();
        atualizarGrabMouse();
        if (aimAtivo) {
            maoCursorSincronizado = false;
            MouseCursorWarper.INSTANCE.congelarModoFps(larguraTela, alturaTela);
            AimTouchController.INSTANCE.ativar(aimCfg2.getCx(), aimCfg2.getCy());
            ultimoEventoMiraNs = 0L;
            MouseDeltaCoalescer.INSTANCE.limpar();
            aimCfg2.getCx();
            aimCfg2.getCy();
        } else {
            AimTouchController.INSTANCE.desativar();
            teleportarCursorSistemaModoMao();
            maoCursorSincronizado = false;
        }
        String.format("%.3f", Arrays.copyOf(new Object[]{Float.valueOf(ratioYEfetivoFps())}, 1));
        getFpsDedoAtivo();
        getFpsVirtualX();
        getFpsVirtualY();
        try {
            og0 og0Var = aimStateListener;
            if (og0Var != null) {
                og0Var.invoke(Boolean.valueOf(aimAtivo));
            }
        } catch (Exception e) {
            Log.w(TAG, "Falha ao notificar listener mira", e);
        }
        liberarMapaPonteiros(mouseBtnsAtivos);
        liberarMapaPonteiros(teclasAtivas);
        liberarMaoToque();
        if (aimAtivo && antiBlockModo.getFixacaoImediata()) {
            antiBlockModo.getId();
            AimTouchController.INSTANCE.forcarPlantarSeInativo();
        }
    }

    private final void sincronizarTelaDispositivo() {
        DisplayMetricsReader.TamanhoTela tamanhoTelaLerTamanhoTela = DisplayMetricsReader.INSTANCE.lerTamanhoTela();
        int largura = tamanhoTelaLerTamanhoTela.getLargura();
        int altura = tamanhoTelaLerTamanhoTela.getAltura();
        if (altura > largura) {
            largura = tamanhoTelaLerTamanhoTela.getAltura();
            altura = tamanhoTelaLerTamanhoTela.getLargura();
        }
        boolean z = (largura == larguraTela && altura == alturaTela) ? false : true;
        larguraTela = largura;
        alturaTela = altura;
        if (z || !MultiTouchInjector.INSTANCE.usandoUinput()) {
            MultiTouchInjector.INSTANCE.sincronizarTamanhoTela(largura, altura, "wm-sync");
        }
    }

    private final void soltarBotaoMouse(int i) {
        List<Integer> listRemove;
        if (bindingRepeat.containsKey(Integer.valueOf(i))) {
            repeatsAguardandoPlantar.remove(Integer.valueOf(i));
            pararRepeat(i);
            return;
        }
        Integer num = bindingTapMs.get(Integer.valueOf(i));
        if ((num != null ? num.intValue() : 0) <= 0 && (listRemove = mouseBtnsAtivos.remove(Integer.valueOf(i))) != null) {
            Iterator<Integer> it = listRemove.iterator();
            while (it.hasNext()) {
                MultiTouchInjector.INSTANCE.m1584up(it.next().intValue());
            }
            listRemove.size();
        }
    }

    private final void soltarMao(int i) {
        if (maoToqueAtivo) {
            liberarMaoToque();
        }
    }

    private final void soltarTeclaMapeada(int i) {
        List<Integer> listRemove = teclasAtivas.remove(Integer.valueOf(i));
        if (listRemove == null) {
            return;
        }
        Iterator<Integer> it = listRemove.iterator();
        while (it.hasNext()) {
            MultiTouchInjector.INSTANCE.m1584up(it.next().intValue());
        }
        listRemove.size();
    }

    private final void teleportarCursorSistemaModoMao() {
        if (larguraTela <= 0 || alturaTela <= 0) {
            return;
        }
        MouseCursorWarper.INSTANCE.teleportarModoMao(larguraTela, alturaTela);
    }

    private final boolean temMouseMapeado() {
        Set<Integer> setKeySet = bindings.keySet();
        setKeySet.getClass();
        if (setKeySet.isEmpty()) {
            return false;
        }
        for (Integer num : setKeySet) {
            InputInjectionEngine inputInjectionEngine = INSTANCE;
            num.getClass();
            if (inputInjectionEngine.ehBotaoMouse(num.intValue()) && !inputInjectionEngine.posicoesMapeadas(num.intValue()).isEmpty()) {
                return true;
            }
        }
        return false;
    }

    private final int totalMapeamentos() {
        Collection<List<bc1>> collectionValues = bindings.values();
        collectionValues.getClass();
        Iterator<T> it = collectionValues.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((List) it.next()).size();
        }
        return size;
    }

    public final void definirMaoCursor(int i, int i2) {
        float f = i;
        float f2 = TouchPipeline.SIZE;
        if (f < TouchPipeline.SIZE) {
            f = 0.0f;
        }
        maoCursorX = f;
        float f3 = i2;
        if (f3 >= TouchPipeline.SIZE) {
            f2 = f3;
        }
        maoCursorY = f2;
        int i3 = larguraTela;
        if (i3 > 0) {
            float f4 = i3;
            if (f > f4) {
                f = f4;
            }
            maoCursorX = f;
        }
        int i4 = alturaTela;
        if (i4 > 0) {
            float f5 = i4;
            if (f2 > f5) {
                f2 = f5;
            }
            maoCursorY = f2;
        }
        maoCursorSincronizado = true;
    }

    public final synchronized void initialize() {
        if (inicializado) {
            return;
        }
        inicializado = true;
        MouseDeltaCoalescer.INSTANCE.setOnFlush(new C0575dq(7));
        AimTouchController aimTouchController = AimTouchController.INSTANCE;
        aimTouchController.setOnAntesPlantar(new C1348qx(4));
        aimTouchController.setOnDepoisPlantar(new C1348qx(5));
        sincronizarTelaDispositivo();
        boolean zDisponivel = PrivilegedTouchInjector.INSTANCE.disponivel();
        usandoFallbackShell = !zDisponivel;
        if (!zDisponivel) {
            Log.w(TAG, "InputManager indisponível — fallback shell (input tap) ativo");
        }
    }

    public final boolean isUsandoFallbackShell() {
        return usandoFallbackShell;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final synchronized boolean processarComando(String str) {
        List<String> listM5511F;
        try {
            str.getClass();
            String string = zv1.m7383W0(str).toString();
            Pattern patternCompile = Pattern.compile("\\s+");
            patternCompile.getClass();
            string.getClass();
            Matcher matcher = patternCompile.matcher(string);
            boolean zProcessarScreen = false;
            if (matcher.find()) {
                ArrayList arrayList = new ArrayList(10);
                int iEnd = 0;
                do {
                    arrayList.add(string.subSequence(iEnd, matcher.start()).toString());
                    iEnd = matcher.end();
                } while (matcher.find());
                arrayList.add(string.subSequence(iEnd, string.length()).toString());
                listM5511F = arrayList;
            } else {
                listM5511F = AbstractC1337qm.m5511F(string.toString());
            }
            if (listM5511F.isEmpty()) {
                return false;
            }
            String upperCase = listM5511F.get(0).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            switch (upperCase.hashCode()) {
                case -1916503554:
                    if (upperCase.equals(InjectionProtocol.DIGITAR)) {
                        definirTecladoPassthrough(hp0.m3214e(AbstractC1377rp.m5871r0(1, listM5511F), "1"));
                        zProcessarScreen = true;
                    } else {
                        Log.w(TAG, "Comando desconhecido: ".concat(str));
                    }
                    return zProcessarScreen;
                case -1854360468:
                    if (upperCase.equals(InjectionProtocol.SCREEN)) {
                        zProcessarScreen = processarScreen(listM5511F);
                    } else {
                        Log.w(TAG, "Comando desconhecido: ".concat(str));
                    }
                    return zProcessarScreen;
                case -1610825205:
                    if (upperCase.equals(InjectionProtocol.FPS_FF_ANTI)) {
                        zProcessarScreen = processarFpsFfAnti(listM5511F);
                    } else {
                        Log.w(TAG, "Comando desconhecido: ".concat(str));
                    }
                    return zProcessarScreen;
                case -1590720576:
                    if (upperCase.equals(InjectionProtocol.SET_DPI)) {
                        zProcessarScreen = processarSetDpi(listM5511F);
                    } else {
                        Log.w(TAG, "Comando desconhecido: ".concat(str));
                    }
                    return zProcessarScreen;
                case -1590707453:
                    if (upperCase.equals(InjectionProtocol.SET_RES)) {
                        zProcessarScreen = processarSetRes(listM5511F);
                    } else {
                        Log.w(TAG, "Comando desconhecido: ".concat(str));
                    }
                    return zProcessarScreen;
                case -1470822829:
                    if (!upperCase.equals(InjectionProtocol.EDITAR_HUD)) {
                        Log.w(TAG, "Comando desconhecido: ".concat(str));
                        return zProcessarScreen;
                    }
                    definirEditarHud(hp0.m3214e(AbstractC1377rp.m5871r0(1, listM5511F), "1"));
                    zProcessarScreen = true;
                    return zProcessarScreen;
                case -1389366553:
                    if (upperCase.equals(InjectionProtocol.NAV_LOCK)) {
                        zProcessarScreen = processarNavLock(listM5511F);
                    } else {
                        Log.w(TAG, "Comando desconhecido: ".concat(str));
                    }
                    return zProcessarScreen;
                case -1189173395:
                    if (!upperCase.equals(InjectionProtocol.INPUT_START)) {
                        Log.w(TAG, "Comando desconhecido: ".concat(str));
                        return zProcessarScreen;
                    }
                    PhysicalInputSource physicalInputSource = inputReader;
                    if (physicalInputSource != null && physicalInputSource.isRunning() && entradaAtiva) {
                        PhysicalInputSource physicalInputSource2 = inputReader;
                        if (physicalInputSource2 != null) {
                            physicalInputSource2.escanearDispositivosHotplug();
                        }
                        atualizarGrabMouse();
                    } else if (aimAtivo) {
                        limparRepeatsAtivos();
                        liberarMapaPonteiros(mouseBtnsAtivos);
                        liberarMapaPonteiros(teclasAtivas);
                        liberarMaoToque();
                        MultiTouchInjector multiTouchInjector = MultiTouchInjector.INSTANCE;
                        multiTouchInjector.m1584up(1);
                        multiTouchInjector.liberarExceto(2);
                        reiniciarLeituraTeclado();
                    } else {
                        MultiTouchInjector.INSTANCE.liberarTudo();
                        reiniciarLeituraTeclado();
                    }
                    zProcessarScreen = true;
                    return zProcessarScreen;
                case -1005371837:
                    if (upperCase.equals(InjectionProtocol.INTERRUPT)) {
                        zProcessarScreen = processarInterrupt(listM5511F);
                    } else {
                        Log.w(TAG, "Comando desconhecido: ".concat(str));
                    }
                    return zProcessarScreen;
                case -953918978:
                    if (upperCase.equals(InjectionProtocol.MAP_REPEAT)) {
                        zProcessarScreen = processarMapRepeat(listM5511F);
                    } else {
                        Log.w(TAG, "Comando desconhecido: ".concat(str));
                    }
                    return zProcessarScreen;
                case -578381178:
                    if (upperCase.equals(InjectionProtocol.WM_RESET)) {
                        zProcessarScreen = processarWmReset();
                    } else {
                        Log.w(TAG, "Comando desconhecido: ".concat(str));
                    }
                    return zProcessarScreen;
                case -429396520:
                    if (upperCase.equals(InjectionProtocol.DISPLAY_ID)) {
                        zProcessarScreen = processarDisplayId(listM5511F);
                    } else {
                        Log.w(TAG, "Comando desconhecido: ".concat(str));
                    }
                    return zProcessarScreen;
                case 64805:
                    if (upperCase.equals(InjectionProtocol.AIM)) {
                        zProcessarScreen = processarAim(listM5511F);
                    } else {
                        Log.w(TAG, "Comando desconhecido: ".concat(str));
                    }
                    return zProcessarScreen;
                case 76092:
                    if (upperCase.equals(InjectionProtocol.MAP)) {
                        zProcessarScreen = processarMap(listM5511F);
                    } else {
                        Log.w(TAG, "Comando desconhecido: ".concat(str));
                    }
                    return zProcessarScreen;
                case 2455922:
                    if (upperCase.equals(InjectionProtocol.PING)) {
                        zProcessarScreen = true;
                    } else {
                        Log.w(TAG, "Comando desconhecido: ".concat(str));
                    }
                    return zProcessarScreen;
                case 25410510:
                    if (upperCase.equals(InjectionProtocol.ATALHOS)) {
                        zProcessarScreen = processarAtalhos(listM5511F);
                    } else {
                        Log.w(TAG, "Comando desconhecido: ".concat(str));
                    }
                    return zProcessarScreen;
                case 80013087:
                    if (upperCase.equals(InjectionProtocol.TOUCH)) {
                        zProcessarScreen = processarToque(listM5511F);
                    } else {
                        Log.w(TAG, "Comando desconhecido: ".concat(str));
                    }
                    return zProcessarScreen;
                case 107480116:
                    if (!upperCase.equals(InjectionProtocol.CAPTURA_FISICA)) {
                        Log.w(TAG, "Comando desconhecido: ".concat(str));
                        return zProcessarScreen;
                    }
                    capturaFisicaAtiva = hp0.m3214e(AbstractC1377rp.m5871r0(1, listM5511F), "1");
                    if (capturaFisicaAtiva) {
                        garantirEntradaAtiva();
                    }
                    zProcessarScreen = true;
                    return zProcessarScreen;
                case 143908874:
                    if (upperCase.equals(InjectionProtocol.FPS_ACEL_LIMIAR)) {
                        zProcessarScreen = processarFpsAcelLimiar(listM5511F);
                    } else {
                        Log.w(TAG, "Comando desconhecido: ".concat(str));
                    }
                    return zProcessarScreen;
                case 185822085:
                    if (upperCase.equals(InjectionProtocol.POINTER_SPEED)) {
                        zProcessarScreen = processarPointerSpeed(listM5511F);
                    } else {
                        Log.w(TAG, "Comando desconhecido: ".concat(str));
                    }
                    return zProcessarScreen;
                case 268007046:
                    if (upperCase.equals(InjectionProtocol.FPS_ANTI_BLOCK)) {
                        zProcessarScreen = processarFpsAntiBlock(listM5511F);
                    } else {
                        Log.w(TAG, "Comando desconhecido: ".concat(str));
                    }
                    return zProcessarScreen;
                case 648310122:
                    if (!upperCase.equals(InjectionProtocol.MAP_CLEAR)) {
                        Log.w(TAG, "Comando desconhecido: ".concat(str));
                        return zProcessarScreen;
                    }
                    limparMapeamentos();
                    zProcessarScreen = true;
                    return zProcessarScreen;
                case 1084079974:
                    if (upperCase.equals(InjectionProtocol.FPS_LOW_SPEED)) {
                        zProcessarScreen = processarFpsLowSpeed(listM5511F);
                    } else {
                        Log.w(TAG, "Comando desconhecido: ".concat(str));
                    }
                    return zProcessarScreen;
                case 1384520307:
                    if (!upperCase.equals(InjectionProtocol.INPUT_ENSURE)) {
                        Log.w(TAG, "Comando desconhecido: ".concat(str));
                        return zProcessarScreen;
                    }
                    garantirEntradaAtiva();
                    zProcessarScreen = true;
                    return zProcessarScreen;
                case 1522339641:
                    if (!upperCase.equals(InjectionProtocol.MOUSE_POLL)) {
                        Log.w(TAG, "Comando desconhecido: ".concat(str));
                        return zProcessarScreen;
                    }
                    if (listM5511F.size() < 2) {
                        return false;
                    }
                    Integer numM3069z0 = gw1.m3069z0(listM5511F.get(1));
                    definirMousePollHz(numM3069z0 != null ? numM3069z0.intValue() : 0);
                    zProcessarScreen = true;
                    return zProcessarScreen;
                case 1522419473:
                    if (!upperCase.equals(InjectionProtocol.MOUSE_SENS)) {
                        Log.w(TAG, "Comando desconhecido: ".concat(str));
                        return zProcessarScreen;
                    }
                    if (listM5511F.size() < 2) {
                        return false;
                    }
                    Float fM2862y0 = fw1.m2862y0(listM5511F.get(1));
                    maoSensibilidade = fM2862y0 != null ? p32.m5139E(fM2862y0.floatValue(), 0.1f, 10.0f) : 1.0f;
                    zProcessarScreen = true;
                    return zProcessarScreen;
                case 1555069232:
                    if (!upperCase.equals("MAO_POS")) {
                        Log.w(TAG, "Comando desconhecido: ".concat(str));
                        return zProcessarScreen;
                    }
                    if (listM5511F.size() < 3) {
                        return false;
                    }
                    Integer numM3069z1 = gw1.m3069z0(listM5511F.get(1));
                    if (numM3069z1 == null) {
                        return false;
                    }
                    int iIntValue = numM3069z1.intValue();
                    Integer numM3069z2 = gw1.m3069z0(listM5511F.get(2));
                    if (numM3069z2 == null) {
                        return false;
                    }
                    definirMaoCursor(iIntValue, numM3069z2.intValue());
                    zProcessarScreen = true;
                    return zProcessarScreen;
                case 1748369765:
                    if (!upperCase.equals(InjectionProtocol.INPUT_RESCAN)) {
                        Log.w(TAG, "Comando desconhecido: ".concat(str));
                        return zProcessarScreen;
                    }
                    PhysicalInputSource physicalInputSource3 = inputReader;
                    if (physicalInputSource3 == null || !physicalInputSource3.isRunning()) {
                        garantirEntradaAtiva();
                    } else {
                        PhysicalInputSource physicalInputSource4 = inputReader;
                        if (physicalInputSource4 != null) {
                            physicalInputSource4.escanearDispositivosHotplug();
                        }
                    }
                    zProcessarScreen = true;
                    return zProcessarScreen;
                case 1901302647:
                    if (!upperCase.equals(InjectionProtocol.INPUT_STOP)) {
                        Log.w(TAG, "Comando desconhecido: ".concat(str));
                        return zProcessarScreen;
                    }
                    aplicarNavLock(false);
                    pararLeituraTeclado(true);
                    zProcessarScreen = true;
                    return zProcessarScreen;
                case 1934941424:
                    if (upperCase.equals(InjectionProtocol.ANALOG)) {
                        zProcessarScreen = processarAnalog(listM5511F);
                    } else {
                        Log.w(TAG, "Comando desconhecido: ".concat(str));
                    }
                    return zProcessarScreen;
                case 2131464167:
                    if (upperCase.equals(InjectionProtocol.FPS_DESACEL_MODO)) {
                        zProcessarScreen = processarFpsDesacelModo(listM5511F);
                    } else {
                        Log.w(TAG, "Comando desconhecido: ".concat(str));
                    }
                    return zProcessarScreen;
                default:
                    Log.w(TAG, "Comando desconhecido: ".concat(str));
                    return zProcessarScreen;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void setAimStateListener(og0 og0Var) {
        aimStateListener = og0Var;
    }

    public final void setHandModeCallbacks(IVirtualCursorListener iVirtualCursorListener, ICursorPositionProvider iCursorPositionProvider) {
        virtualCursorListener = iVirtualCursorListener;
        cursorPositionProvider = iCursorPositionProvider;
        callbacksMaoVivos = (iVirtualCursorListener == null && iCursorPositionProvider == null) ? false : true;
    }

    public final synchronized void shutdown() {
        pararLeituraTeclado$default(this, false, 1, null);
        MultiTouchInjector multiTouchInjector = MultiTouchInjector.INSTANCE;
        multiTouchInjector.liberarTudo();
        multiTouchInjector.desativarUinput();
        inicializado = false;
        usandoFallbackShell = false;
    }

    public final String snapshotExteriorDebug() {
        if (larguraTela <= 0 || FpsDesacelModo.INSTANCE.getModoAtivo() != ModoDesacelFps.FF_ANTI_ACEL) {
            return "";
        }
        float f = getFpsVirtualX() >= getFpsFfOrigemX() ? 10.0f : -10.0f;
        FpsFfAntiAceleracao fpsFfAntiAceleracao = FpsFfAntiAceleracao.INSTANCE;
        float fpsFfOrigemX = getFpsFfOrigemX();
        float fpsVirtualX = getFpsVirtualX();
        FpsFfAntiAceleracaoConfig fpsFfAntiAceleracaoConfig = FpsFfAntiAceleracaoConfig.INSTANCE;
        float fFatorPassagemX = fpsFfAntiAceleracao.fatorPassagemX(fpsFfOrigemX, fpsVirtualX, f, fpsFfAntiAceleracaoConfig.getDensidadeDpi());
        float sensitivity = fpsFfAntiAceleracaoConfig.getSensitivity() * fFatorPassagemX;
        StringBuilder sb = new StringBuilder("rev:215\nmodo:FF_ANTI_ACEL\n");
        InputInjectionEngine inputInjectionEngine = INSTANCE;
        sb.append("x:" + ((int) inputInjectionEngine.getFpsVirtualX()));
        sb.append('\n');
        sb.append("y:" + ((int) inputInjectionEngine.getFpsVirtualY()));
        sb.append('\n');
        sb.append("origem:" + ((int) inputInjectionEngine.getFpsFfOrigemX()));
        sb.append('\n');
        sb.append("fator:".concat(String.format("%.4f", Arrays.copyOf(new Object[]{Float.valueOf(fFatorPassagemX)}, 1))));
        sb.append('\n');
        sb.append("efetivo:".concat(String.format("%.4f", Arrays.copyOf(new Object[]{Float.valueOf(sensitivity)}, 1))));
        sb.append('\n');
        sb.append("dpi:" + ((int) fpsFfAntiAceleracaoConfig.getDensidadeDpi()));
        sb.append('\n');
        sb.append("sens:" + fpsFfAntiAceleracaoConfig.getSensitivity());
        sb.append('\n');
        sb.append("tela:" + larguraTela);
        sb.append('\n');
        return sb.toString();
    }

    public final bc1 snapshotMaoCursor() {
        return new bc1(Integer.valueOf((int) maoCursorX), Integer.valueOf((int) maoCursorY));
    }

    public final long[] snapshotPipelineMetrics() {
        InjectionMetrics injectionMetrics = InjectionMetrics.INSTANCE;
        MouseDeltaCoalescer mouseDeltaCoalescer = MouseDeltaCoalescer.INSTANCE;
        return injectionMetrics.snapshot(mouseDeltaCoalescer.hzAtual(), mouseDeltaCoalescer.temPendente(), aimAtivo, getFpsDedoAtivo(), PrivilegedTouchInjector.INSTANCE.toquesAtivos());
    }

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static final class AimCfg {

        /* JADX INFO: renamed from: cx */
        private final float f1909cx;

        /* JADX INFO: renamed from: cy */
        private final float f1910cy;
        private final float sensX;
        private final float sensY;
        private final int suspend;
        private final int toggle;

        public AimCfg(int i, float f, float f2, float f3, float f4, int i2) {
            this.toggle = i;
            this.f1909cx = f;
            this.f1910cy = f2;
            this.sensX = f3;
            this.sensY = f4;
            this.suspend = i2;
        }

        public final float getCx() {
            return this.f1909cx;
        }

        public final float getCy() {
            return this.f1910cy;
        }

        public final float getSensX() {
            return this.sensX;
        }

        public final float getSensY() {
            return this.sensY;
        }

        public final int getSuspend() {
            return this.suspend;
        }

        public final int getToggle() {
            return this.toggle;
        }

        public /* synthetic */ AimCfg(int i, float f, float f2, float f3, float f4, int i2, int i3, AbstractC1571wy abstractC1571wy) {
            this(i, f, f2, f3, f4, (i3 & 32) != 0 ? 0 : i2);
        }
    }

    private final void processarIdleUpMira() {
    }

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static final class RepeatState {
        private final boolean holdPulse;
        private long nextAtMs;
        private boolean phaseDown;
        private List<Integer> pointerIds;
        private int remaining;
        private final int tapMs;

        public /* synthetic */ RepeatState(int i, int i2, boolean z, boolean z2, long j, List list, int i3, AbstractC1571wy abstractC1571wy) {
            this(i, i2, z, z2, j, (i3 & 32) != 0 ? new ArrayList() : list);
        }

        public final boolean getHoldPulse() {
            return this.holdPulse;
        }

        public final long getNextAtMs() {
            return this.nextAtMs;
        }

        public final boolean getPhaseDown() {
            return this.phaseDown;
        }

        public final List<Integer> getPointerIds() {
            return this.pointerIds;
        }

        public final int getRemaining() {
            return this.remaining;
        }

        public final int getTapMs() {
            return this.tapMs;
        }

        public final void setNextAtMs(long j) {
            this.nextAtMs = j;
        }

        public final void setPhaseDown(boolean z) {
            this.phaseDown = z;
        }

        public final void setPointerIds(List<Integer> list) {
            list.getClass();
            this.pointerIds = list;
        }

        public final void setRemaining(int i) {
            this.remaining = i;
        }

        public RepeatState(int i, int i2, boolean z, boolean z2, long j, List<Integer> list) {
            list.getClass();
            this.remaining = i;
            this.tapMs = i2;
            this.holdPulse = z;
            this.phaseDown = z2;
            this.nextAtMs = j;
            this.pointerIds = list;
        }
    }
}
