package com.example.ssmousepro;

import p000.EnumC1530vu;
import p000.InterfaceC0579du;
import p000.InterfaceC1311px;
import p000.f40;
import p000.hp0;
import p000.ny1;
import p000.og0;
import p000.ua0;
import p000.z32;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1311px(m5372c = "com.example.ssmousepro.FloatingService$aplicarDpiOverride$verificado$1", m5373f = "FloatingService.kt", m5374l = {6489}, m5375m = "invokeSuspend")
public final class FloatingService$aplicarDpiOverride$verificado$1 extends ny1 implements og0 {
    final /* synthetic */ String $alvo;
    Object L$0;
    int label;
    final /* synthetic */ FloatingService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingService$aplicarDpiOverride$verificado$1(FloatingService floatingService, String str, InterfaceC0579du interfaceC0579du) {
        super(1, interfaceC0579du);
        this.this$0 = floatingService;
        this.$alvo = str;
    }

    @Override // p000.AbstractC0018ah
    public final InterfaceC0579du create(InterfaceC0579du interfaceC0579du) {
        return new FloatingService$aplicarDpiOverride$verificado$1(this.this$0, this.$alvo, interfaceC0579du);
    }

    @Override // p000.og0
    public final Object invoke(InterfaceC0579du interfaceC0579du) {
        return ((FloatingService$aplicarDpiOverride$verificado$1) create(interfaceC0579du)).invokeSuspend(z32.f13265a);
    }

    @Override // p000.AbstractC0018ah
    public final Object invokeSuspend(Object obj) {
        FloatingService floatingService;
        int i = this.label;
        if (i == 0) {
            ua0.m6440Z(obj);
            floatingService = this.this$0;
            this.L$0 = floatingService;
            this.label = 1;
            obj = floatingService.wmDensityAtual(this);
            EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
            if (obj == enumC1530vu) {
                return enumC1530vu;
            }
        } else {
            if (i != 1) {
                f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            floatingService = (FloatingService) this.L$0;
            ua0.m6440Z(obj);
        }
        return Boolean.valueOf(hp0.m3214e(floatingService.valorEmVigor((String) obj, "density"), this.$alvo));
    }
}
