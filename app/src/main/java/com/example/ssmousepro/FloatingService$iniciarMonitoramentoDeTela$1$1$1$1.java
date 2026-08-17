package com.example.ssmousepro;

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
@InterfaceC1311px(m5372c = "com.example.ssmousepro.FloatingService$iniciarMonitoramentoDeTela$1$1$1$1", m5373f = "FloatingService.kt", m5374l = {7043}, m5375m = "invokeSuspend")
public final class FloatingService$iniciarMonitoramentoDeTela$1$1$1$1 extends ny1 implements ch0 {
    final /* synthetic */ String $pacoteAtual;
    int label;
    final /* synthetic */ FloatingService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingService$iniciarMonitoramentoDeTela$1$1$1$1(FloatingService floatingService, String str, InterfaceC0579du interfaceC0579du) {
        super(2, interfaceC0579du);
        this.this$0 = floatingService;
        this.$pacoteAtual = str;
    }

    @Override // p000.AbstractC0018ah
    public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
        return new FloatingService$iniciarMonitoramentoDeTela$1$1$1$1(this.this$0, this.$pacoteAtual, interfaceC0579du);
    }

    @Override // p000.ch0
    public final Object invoke(CoroutineScope coroutineScope, InterfaceC0579du interfaceC0579du) {
        return ((FloatingService$iniciarMonitoramentoDeTela$1$1$1$1) create(coroutineScope, interfaceC0579du)).invokeSuspend(z32.f13265a);
    }

    @Override // p000.AbstractC0018ah
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            ua0.m6440Z(obj);
            FloatingService floatingService = this.this$0;
            this.label = 1;
            Object objForcarResetDisplayEstiloGg = floatingService.forcarResetDisplayEstiloGg(this);
            EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
            if (objForcarResetDisplayEstiloGg == enumC1530vu) {
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
