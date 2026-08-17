package com.example.ssmousepro.injection;

import android.util.Log;
import com.example.ssmousepro.IAimStateListener;
import com.example.ssmousepro.ICursorPositionProvider;
import com.example.ssmousepro.IInjectionDaemon;
import com.example.ssmousepro.IVirtualCursorListener;
import p000.AbstractC1571wy;
import p000.C1165o0;
import p000.z32;
import p000.zv1;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class InjectionDaemon extends IInjectionDaemon.Stub {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "InjectionDaemon";
    private IAimStateListener aimListener;

    public InjectionDaemon() {
        DaemonSolo.INSTANCE.garantirInstanciaUnica();
        FpsDesacelSincronizador.INSTANCE.aplicarValoresDoCodigo();
        InputInjectionEngine inputInjectionEngine = InputInjectionEngine.INSTANCE;
        inputInjectionEngine.initialize();
        inputInjectionEngine.processarComando(InjectionProtocol.INPUT_STOP);
        inputInjectionEngine.setAimStateListener(new C1165o0(this, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z32 _init_$lambda$0(InjectionDaemon injectionDaemon, boolean z) {
        try {
            IAimStateListener iAimStateListener = injectionDaemon.aimListener;
            if (iAimStateListener != null) {
                iAimStateListener.onAimStateChanged(z);
            }
        } catch (Exception e) {
            Log.w(TAG, "Falha ao notificar listener mira", e);
        }
        return z32.f13265a;
    }

    @Override // com.example.ssmousepro.IInjectionDaemon
    public void destroy() {
        try {
            InputInjectionEngine.INSTANCE.shutdown();
        } catch (Exception e) {
            Log.w(TAG, "Falha ao desligar engine no destroy", e);
        }
        System.exit(0);
    }

    @Override // com.example.ssmousepro.IInjectionDaemon
    public boolean executarComando(String str) {
        String string = str != null ? zv1.m7383W0(str).toString() : null;
        if (string == null) {
            string = "";
        }
        if (string.length() == 0) {
            return false;
        }
        return InputInjectionEngine.INSTANCE.processarComando(string);
    }

    @Override // com.example.ssmousepro.IInjectionDaemon
    public String getFpsExteriorDebug() {
        return InputInjectionEngine.INSTANCE.snapshotExteriorDebug();
    }

    @Override // com.example.ssmousepro.IInjectionDaemon
    public long[] getPipelineMetrics() {
        return InputInjectionEngine.INSTANCE.snapshotPipelineMetrics();
    }

    @Override // com.example.ssmousepro.IInjectionDaemon
    public String getSocketName() {
        return "";
    }

    @Override // com.example.ssmousepro.IInjectionDaemon
    public boolean isSocketRunning() {
        return false;
    }

    @Override // com.example.ssmousepro.IInjectionDaemon
    public void registerAimListener(IAimStateListener iAimStateListener) {
        this.aimListener = iAimStateListener;
    }

    @Override // com.example.ssmousepro.IInjectionDaemon
    public void registerHandModeCallbacks(IVirtualCursorListener iVirtualCursorListener, ICursorPositionProvider iCursorPositionProvider) {
        InputInjectionEngine.INSTANCE.setHandModeCallbacks(iVirtualCursorListener, iCursorPositionProvider);
    }

    @Override // com.example.ssmousepro.IInjectionDaemon
    public void unregisterAimListener() {
        this.aimListener = null;
    }

    @Override // com.example.ssmousepro.IInjectionDaemon
    public void unregisterHandModeCallbacks() {
        InputInjectionEngine.INSTANCE.setHandModeCallbacks(null, null);
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
