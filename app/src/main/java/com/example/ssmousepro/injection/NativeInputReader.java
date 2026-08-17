package com.example.ssmousepro.injection;

import android.util.Log;
import p000.AbstractC1571wy;
import p000.ch0;
import p000.fh0;
import p000.mg0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class NativeInputReader implements PhysicalInputSource {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "NativeInputReader";
    private final NativeInputReader$callback$1 callback;
    private final fh0 keyHandler;
    private final ch0 moveHandler;
    private final mg0 syncHandler;

    /* JADX WARN: Type inference failed for: r1v1, types: [com.example.ssmousepro.injection.NativeInputReader$callback$1] */
    public NativeInputReader(fh0 fh0Var, ch0 ch0Var, mg0 mg0Var) {
        fh0Var.getClass();
        ch0Var.getClass();
        mg0Var.getClass();
        this.keyHandler = fh0Var;
        this.moveHandler = ch0Var;
        this.syncHandler = mg0Var;
        this.callback = new SsproInputNative.Callback() { // from class: com.example.ssmousepro.injection.NativeInputReader$callback$1
            @Override // com.example.ssmousepro.injection.SsproInputNative.Callback
            public void onKey(int i, int i2, boolean z, boolean z2) {
                this.this$0.keyHandler.invoke(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z), Boolean.valueOf(z2));
            }

            @Override // com.example.ssmousepro.injection.SsproInputNative.Callback
            public void onMouseMove(int i, int i2) {
                this.this$0.moveHandler.invoke(Integer.valueOf(i), Integer.valueOf(i2));
            }

            @Override // com.example.ssmousepro.injection.SsproInputNative.Callback
            public void onSync() {
                this.this$0.syncHandler.invoke();
            }
        };
    }

    @Override // com.example.ssmousepro.injection.PhysicalInputSource
    public void definirGrabMouse(boolean z) {
        if (SsproInputNative.INSTANCE.getLoaded()) {
            SsproInputNative.nativeSetGrabMouse(z);
        }
    }

    @Override // com.example.ssmousepro.injection.PhysicalInputSource
    public boolean escanearDispositivosHotplug() {
        if (!SsproInputNative.INSTANCE.getLoaded()) {
            return false;
        }
        SsproInputNative.nativeRefreshDevices();
        return true;
    }

    @Override // com.example.ssmousepro.injection.PhysicalInputSource
    public boolean isRunning() {
        return SsproInputNative.INSTANCE.getLoaded() && SsproInputNative.nativeIsRunning();
    }

    @Override // com.example.ssmousepro.injection.PhysicalInputSource
    public void start() {
        if (SsproInputNative.INSTANCE.ensureLoaded() && !SsproInputNative.nativeStart(this.callback)) {
            Log.e(TAG, "nativeStart falhou");
        }
    }

    @Override // com.example.ssmousepro.injection.PhysicalInputSource
    public void stop() {
        if (SsproInputNative.INSTANCE.getLoaded()) {
            SsproInputNative.nativeStop();
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

    @Override // com.example.ssmousepro.injection.PhysicalInputSource
    public void definirGrabTeclado(boolean z) {
    }
}
