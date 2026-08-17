package com.example.ssmousepro;

import android.os.Handler;
import com.example.ssmousepro.FloatingService;
import com.example.ssmousepro.FloatingService$listenerCursorVirtual$1;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class FloatingService$listenerCursorVirtual$1 extends IVirtualCursorListener.Stub {
    final /* synthetic */ FloatingService this$0;

    public FloatingService$listenerCursorVirtual$1(FloatingService floatingService) {
        this.this$0 = floatingService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPhysicalCapture$lambda$2(FloatingService floatingService, int i, boolean z, boolean z2) {
        if (floatingService.processarAtalhoApp(i, z)) {
            return;
        }
        floatingService.processarCapturaFisicaHud(i, z, z2);
    }

    @Override // com.example.ssmousepro.IVirtualCursorListener
    public void onMouseButton(final int i, final boolean z) {
        Handler handler = this.this$0.handlerMonitor;
        final FloatingService floatingService = this.this$0;
        handler.post(new Runnable() { // from class: fd0
            @Override // java.lang.Runnable
            public final void run() {
                FloatingService.access$repassarBotaoMouseEdicao(floatingService, i, z);
            }
        });
    }

    @Override // com.example.ssmousepro.IVirtualCursorListener
    public void onMouseDelta(int i, int i2) {
        boolean z;
        Object obj = this.this$0.cursorUiLock;
        FloatingService floatingService = this.this$0;
        synchronized (obj) {
            floatingService.cursorPendDx += i;
            floatingService.cursorPendDy += i2;
            z = true;
            floatingService.cursorEventosPendentes++;
            if (floatingService.cursorFlushAgendado) {
                z = false;
            } else {
                floatingService.cursorFlushAgendado = true;
            }
        }
        if (z) {
            this.this$0.handlerMonitor.post(this.this$0.flushCursorUi);
        }
    }

    @Override // com.example.ssmousepro.IVirtualCursorListener
    public void onPhysicalCapture(final int i, final boolean z, final boolean z2) {
        Handler handler = this.this$0.handlerMonitor;
        final FloatingService floatingService = this.this$0;
        handler.post(new Runnable() { // from class: gd0
            @Override // java.lang.Runnable
            public final void run() {
                FloatingService$listenerCursorVirtual$1.onPhysicalCapture$lambda$2(floatingService, i, z, z2);
            }
        });
    }
}
