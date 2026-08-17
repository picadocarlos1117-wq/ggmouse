package com.example.ssmousepro.activation;

import p000.AbstractC0616eu;
import p000.EnumC1530vu;
import p000.InterfaceC0579du;
import p000.InterfaceC1311px;
import p000.ul1;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1311px(m5372c = "com.example.ssmousepro.activation.WifiAdbManager", m5373f = "WifiAdbManager.kt", m5374l = {146}, m5375m = "emparelhar-yxL6bBk")
public final class WifiAdbManager$emparelhar$1 extends AbstractC0616eu {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WifiAdbManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WifiAdbManager$emparelhar$1(WifiAdbManager wifiAdbManager, InterfaceC0579du interfaceC0579du) {
        super(interfaceC0579du);
        this.this$0 = wifiAdbManager;
    }

    @Override // p000.AbstractC0018ah
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM7422emparelharyxL6bBk = this.this$0.m7422emparelharyxL6bBk(null, null, null, null, this);
        return objM7422emparelharyxL6bBk == EnumC1530vu.f11768a ? objM7422emparelharyxL6bBk : new ul1(objM7422emparelharyxL6bBk);
    }
}
