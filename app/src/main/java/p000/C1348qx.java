package p000;

import com.example.ssmousepro.activation.WifiDaemonClient;
import com.example.ssmousepro.injection.InputInjectionEngine;
import com.example.ssmousepro.injection.IoctlHelper;
import com.example.ssmousepro.injection.MouseCursorWarper;
import com.example.ssmousepro.injection.PrivilegedTouchInjector;
import com.example.ssmousepro.tools.InjectStressMain;
import kotlinx.coroutines.debug.internal.DebugProbesImpl;

/* JADX INFO: renamed from: qx */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1348qx implements mg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9596a;

    public /* synthetic */ C1348qx(int i) {
        this.f9596a = i;
    }

    @Override // p000.mg0
    public final Object invoke() {
        switch (this.f9596a) {
            case 0:
                return DebugProbesImpl.startWeakRefCleanerThread$lambda$2();
            case 1:
                return InjectStressMain.inputManager_delegate$lambda$0();
            case 2:
                return InjectStressMain.injectMethod_delegate$lambda$1();
            case 3:
                return z32.f13265a;
            case 4:
                return InputInjectionEngine.initialize$lambda$1();
            case 5:
                return InputInjectionEngine.initialize$lambda$2();
            case 6:
                return InputInjectionEngine.iniciarLeituraTeclado$lambda$9();
            case 7:
                return IoctlHelper.sistemaIo_delegate$lambda$1();
            case 8:
                return IoctlHelper.invocador_delegate$lambda$2();
            case 9:
                return MouseCursorWarper.inputManager_delegate$lambda$0();
            case 10:
                return PrivilegedTouchInjector.inputManager_delegate$lambda$2();
            case 11:
                return PrivilegedTouchInjector.injectMethod_delegate$lambda$3();
            case 12:
                return PrivilegedTouchInjector.setDisplayIdMethod_delegate$lambda$4();
            case 13:
                return Integer.valueOf(PrivilegedTouchInjector.deviceId_delegate$lambda$5());
            case 14:
                return z32.f13265a;
            case 15:
                return WifiDaemonClient.religarEventos$lambda$6();
            default:
                return WifiDaemonClient.fechar$lambda$5();
        }
    }
}
