package com.example.ssmousepro;

import p000.InterfaceC0579du;
import p000.InterfaceC1311px;
import p000.ny1;
import p000.og0;
import p000.z32;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1311px(m5372c = "com.example.ssmousepro.FloatingService$forcarResetDisplayEstiloGg$2$ok$1", m5373f = "FloatingService.kt", m5374l = {6291, 6291}, m5375m = "invokeSuspend")
public final class FloatingService$forcarResetDisplayEstiloGg$2$ok$1 extends ny1 implements og0 {
    int label;
    final /* synthetic */ FloatingService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingService$forcarResetDisplayEstiloGg$2$ok$1(FloatingService floatingService, InterfaceC0579du interfaceC0579du) {
        super(1, interfaceC0579du);
        this.this$0 = floatingService;
    }

    @Override // p000.AbstractC0018ah
    public final InterfaceC0579du create(InterfaceC0579du interfaceC0579du) {
        return new FloatingService$forcarResetDisplayEstiloGg$2$ok$1(this.this$0, interfaceC0579du);
    }

    @Override // p000.og0
    public final Object invoke(InterfaceC0579du interfaceC0579du) {
        return ((FloatingService$forcarResetDisplayEstiloGg$2$ok$1) create(interfaceC0579du)).invokeSuspend(z32.f13265a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0045  */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        if (r5 == r3) goto L17;
     */
    @Override // p000.AbstractC0018ah
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.label
            r1 = 2
            r2 = 1
            vu r3 = p000.EnumC1530vu.f11768a
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            if (r0 != r1) goto L10
            p000.ua0.m6440Z(r5)
            goto L3c
        L10:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            p000.f40.m2719o(r4)
            r4 = 0
            return r4
        L17:
            p000.ua0.m6440Z(r5)
            goto L29
        L1b:
            p000.ua0.m6440Z(r5)
            com.example.ssmousepro.FloatingService r5 = r4.this$0
            r4.label = r2
            java.lang.Object r5 = com.example.ssmousepro.FloatingService.access$semOverrideDeTamanho(r5, r4)
            if (r5 != r3) goto L29
            goto L3b
        L29:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L45
            com.example.ssmousepro.FloatingService r5 = r4.this$0
            r4.label = r1
            java.lang.Object r5 = com.example.ssmousepro.FloatingService.access$semOverrideDeDensidade(r5, r4)
            if (r5 != r3) goto L3c
        L3b:
            return r3
        L3c:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r4 = r5.booleanValue()
            if (r4 == 0) goto L45
            goto L46
        L45:
            r2 = 0
        L46:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ssmousepro.FloatingService$forcarResetDisplayEstiloGg$2$ok$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
