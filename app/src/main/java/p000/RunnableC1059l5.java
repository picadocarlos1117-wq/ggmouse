package p000;

import com.example.ssmousepro.FloatingService;
import com.example.ssmousepro.activation.WifiAdbDaemonMain;
import com.example.ssmousepro.activation.WifiDaemonClient;
import com.example.ssmousepro.injection.InputInjectionEngine;
import com.example.ssmousepro.injection.PrivilegedTouchInjector;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;

/* JADX INFO: renamed from: l5 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1059l5 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6177a;

    public /* synthetic */ RunnableC1059l5(int i) {
        this.f6177a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6177a) {
            case 0:
                int i = AlarmManagerSchedulerBroadcastReceiver.f1923a;
                break;
            case 1:
                FloatingService.sairModoEscuta$lambda$288();
                break;
            case 2:
                FloatingService.sincronizarAcelLimiarNoDaemon$lambda$218();
                break;
            case 3:
                FloatingService.desativarEntradaEdicaoHud$lambda$35();
                break;
            case 4:
                FloatingService.iniciarCapturaFisicaDaemon$lambda$283();
                break;
            case 5:
                FloatingService.sincronizarLowSpeedNoDaemon$lambda$210();
                break;
            case 6:
                InputInjectionEngine.iniciarLeituraTeclado$lambda$12();
                break;
            case 7:
                break;
            case 8:
                PrivilegedTouchInjector.iniciarPollDiagnostico$lambda$6();
                break;
            case 9:
                WifiAdbDaemonMain.main$lambda$3();
                break;
            case 10:
                WifiAdbDaemonMain.main$lambda$5();
                break;
            case 11:
                WifiAdbDaemonMain.atenderComandos$lambda$23();
                break;
            case 12:
                WifiDaemonClient.registrarListeners$lambda$4();
                break;
            default:
                WifiDaemonClient.garantirEvt$lambda$7();
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m4054a() {
    }
}
