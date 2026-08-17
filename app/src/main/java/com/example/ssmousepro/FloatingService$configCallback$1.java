package com.example.ssmousepro;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import p000.hb0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class FloatingService$configCallback$1 implements ComponentCallbacks {
    final /* synthetic */ FloatingService this$0;

    public FloatingService$configCallback$1(FloatingService floatingService) {
        this.this$0 = floatingService;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        if (this.this$0.hudEmModoJogo) {
            this.this$0.handlerMonitor.post(new hb0(this.this$0, 22));
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }
}
