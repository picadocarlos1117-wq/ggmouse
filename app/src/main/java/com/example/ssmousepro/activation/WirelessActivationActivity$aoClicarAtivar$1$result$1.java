package com.example.ssmousepro.activation;

import kotlinx.coroutines.CoroutineScope;
import p000.EnumC1530vu;
import p000.InterfaceC0579du;
import p000.InterfaceC1311px;
import p000.ch0;
import p000.f40;
import p000.ny1;
import p000.ua0;
import p000.ul1;
import p000.z32;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1311px(m5372c = "com.example.ssmousepro.activation.WirelessActivationActivity$aoClicarAtivar$1$result$1", m5373f = "WirelessActivationActivity.kt", m5374l = {156}, m5375m = "invokeSuspend")
public final class WirelessActivationActivity$aoClicarAtivar$1$result$1 extends ny1 implements ch0 {
    int label;
    final /* synthetic */ WirelessActivationActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WirelessActivationActivity$aoClicarAtivar$1$result$1(WirelessActivationActivity wirelessActivationActivity, InterfaceC0579du interfaceC0579du) {
        super(2, interfaceC0579du);
        this.this$0 = wirelessActivationActivity;
    }

    @Override // p000.AbstractC0018ah
    public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
        return new WirelessActivationActivity$aoClicarAtivar$1$result$1(this.this$0, interfaceC0579du);
    }

    @Override // p000.ch0
    public final Object invoke(CoroutineScope coroutineScope, InterfaceC0579du interfaceC0579du) {
        return ((WirelessActivationActivity$aoClicarAtivar$1$result$1) create(coroutineScope, interfaceC0579du)).invokeSuspend(z32.f13265a);
    }

    @Override // p000.AbstractC0018ah
    public final Object invokeSuspend(Object obj) {
        Object objM7421conectarEAtivargIAlus;
        int i = this.label;
        if (i == 0) {
            ua0.m6440Z(obj);
            WifiAdbManager wifiAdbManager = WifiAdbManager.INSTANCE;
            WirelessActivationActivity wirelessActivationActivity = this.this$0;
            this.label = 1;
            objM7421conectarEAtivargIAlus = wifiAdbManager.m7421conectarEAtivargIAlus(wirelessActivationActivity, this);
            EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
            if (objM7421conectarEAtivargIAlus == enumC1530vu) {
                return enumC1530vu;
            }
        } else {
            if (i != 1) {
                f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ua0.m6440Z(obj);
            objM7421conectarEAtivargIAlus = ((ul1) obj).f11356a;
        }
        return new ul1(objM7421conectarEAtivargIAlus);
    }
}
