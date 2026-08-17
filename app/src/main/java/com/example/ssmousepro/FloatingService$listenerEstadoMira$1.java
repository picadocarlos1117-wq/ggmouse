package com.example.ssmousepro;

import p000.RunnableC1177oc;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class FloatingService$listenerEstadoMira$1 extends IAimStateListener.Stub {
    final /* synthetic */ FloatingService this$0;

    public FloatingService$listenerEstadoMira$1(FloatingService floatingService) {
        this.this$0 = floatingService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAimStateChanged$lambda$0(FloatingService floatingService, boolean z) {
        floatingService.alternarModoCursor(z);
        floatingService.registrarCallbacksDaemon();
    }

    @Override // com.example.ssmousepro.IAimStateListener
    public void onAimStateChanged(boolean z) {
        this.this$0.handlerMonitor.post(new RunnableC1177oc(z, 2, this.this$0));
    }
}
