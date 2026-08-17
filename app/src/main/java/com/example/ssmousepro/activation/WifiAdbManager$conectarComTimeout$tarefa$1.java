package com.example.ssmousepro.activation;

import kotlinx.coroutines.CoroutineScope;
import p000.InterfaceC0579du;
import p000.InterfaceC1311px;
import p000.ch0;
import p000.f40;
import p000.ny1;
import p000.tl1;
import p000.ua0;
import p000.ul1;
import p000.z32;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1311px(m5372c = "com.example.ssmousepro.activation.WifiAdbManager$conectarComTimeout$tarefa$1", m5373f = "WifiAdbManager.kt", m5374l = {}, m5375m = "invokeSuspend")
public final class WifiAdbManager$conectarComTimeout$tarefa$1 extends ny1 implements ch0 {
    final /* synthetic */ String $host;
    final /* synthetic */ SsproAdbConnectionManager $mgr;
    final /* synthetic */ int $porta;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WifiAdbManager$conectarComTimeout$tarefa$1(SsproAdbConnectionManager ssproAdbConnectionManager, String str, int i, InterfaceC0579du interfaceC0579du) {
        super(2, interfaceC0579du);
        this.$mgr = ssproAdbConnectionManager;
        this.$host = str;
        this.$porta = i;
    }

    @Override // p000.AbstractC0018ah
    public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
        WifiAdbManager$conectarComTimeout$tarefa$1 wifiAdbManager$conectarComTimeout$tarefa$1 = new WifiAdbManager$conectarComTimeout$tarefa$1(this.$mgr, this.$host, this.$porta, interfaceC0579du);
        wifiAdbManager$conectarComTimeout$tarefa$1.L$0 = obj;
        return wifiAdbManager$conectarComTimeout$tarefa$1;
    }

    @Override // p000.ch0
    public final Object invoke(CoroutineScope coroutineScope, InterfaceC0579du interfaceC0579du) {
        return ((WifiAdbManager$conectarComTimeout$tarefa$1) create(coroutineScope, interfaceC0579du)).invokeSuspend(z32.f13265a);
    }

    @Override // p000.AbstractC0018ah
    public final Object invokeSuspend(Object obj) {
        Object tl1Var;
        if (this.label != 0) {
            f40.m2719o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ua0.m6440Z(obj);
        try {
            tl1Var = Boolean.valueOf(this.$mgr.connect(this.$host, this.$porta));
        } catch (Throwable th) {
            tl1Var = new tl1(th);
        }
        return new ul1(tl1Var);
    }
}
