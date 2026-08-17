package com.example.ssmousepro;

import android.widget.Toast;
import kotlinx.coroutines.CoroutineScope;
import p000.EnumC1530vu;
import p000.InterfaceC0579du;
import p000.InterfaceC1311px;
import p000.ch0;
import p000.f40;
import p000.ny1;
import p000.ua0;
import p000.z32;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1311px(m5372c = "com.example.ssmousepro.FloatingService$mostrarConfigResolucoes$btnReset$1$1", m5373f = "FloatingService.kt", m5374l = {6125}, m5375m = "invokeSuspend")
public final class FloatingService$mostrarConfigResolucoes$btnReset$1$1 extends ny1 implements ch0 {
    int label;
    final /* synthetic */ FloatingService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingService$mostrarConfigResolucoes$btnReset$1$1(FloatingService floatingService, InterfaceC0579du interfaceC0579du) {
        super(2, interfaceC0579du);
        this.this$0 = floatingService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(boolean z, FloatingService floatingService) {
        if (z) {
            Toast.makeText(floatingService, "Tela restaurada para o nativo.", 0).show();
        } else {
            Toast.makeText(floatingService, "Falha ao restaurar — verifique Shizuku ou Depuração Wi‑Fi", 1).show();
        }
        floatingService.mostrarConfigResolucoes();
    }

    @Override // p000.AbstractC0018ah
    public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
        return new FloatingService$mostrarConfigResolucoes$btnReset$1$1(this.this$0, interfaceC0579du);
    }

    @Override // p000.ch0
    public final Object invoke(CoroutineScope coroutineScope, InterfaceC0579du interfaceC0579du) {
        return ((FloatingService$mostrarConfigResolucoes$btnReset$1$1) create(coroutineScope, interfaceC0579du)).invokeSuspend(z32.f13265a);
    }

    @Override // p000.AbstractC0018ah
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            ua0.m6440Z(obj);
            FloatingService floatingService = this.this$0;
            this.label = 1;
            obj = floatingService.restaurarOverridesTelaVerificado(this);
            EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
            if (obj == enumC1530vu) {
                return enumC1530vu;
            }
        } else {
            if (i != 1) {
                f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ua0.m6440Z(obj);
        }
        this.this$0.handlerMonitor.post(new RunnableC0240e(this.this$0, ((Boolean) obj).booleanValue()));
        return z32.f13265a;
    }
}
