package com.example.ssmousepro.activation;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
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
@InterfaceC1311px(m5372c = "com.example.ssmousepro.activation.WifiAdbManager$conectarComTimeout$resultado$1", m5373f = "WifiAdbManager.kt", m5374l = {403}, m5375m = "invokeSuspend")
public final class WifiAdbManager$conectarComTimeout$resultado$1 extends ny1 implements ch0 {
    final /* synthetic */ Deferred<ul1> $tarefa;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WifiAdbManager$conectarComTimeout$resultado$1(Deferred<ul1> deferred, InterfaceC0579du interfaceC0579du) {
        super(2, interfaceC0579du);
        this.$tarefa = deferred;
    }

    @Override // p000.AbstractC0018ah
    public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
        return new WifiAdbManager$conectarComTimeout$resultado$1(this.$tarefa, interfaceC0579du);
    }

    @Override // p000.ch0
    public final Object invoke(CoroutineScope coroutineScope, InterfaceC0579du interfaceC0579du) {
        return ((WifiAdbManager$conectarComTimeout$resultado$1) create(coroutineScope, interfaceC0579du)).invokeSuspend(z32.f13265a);
    }

    @Override // p000.AbstractC0018ah
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ua0.m6440Z(obj);
                return obj;
            }
            f40.m2719o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ua0.m6440Z(obj);
        Deferred<ul1> deferred = this.$tarefa;
        this.label = 1;
        Object objAwait = deferred.await(this);
        EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
        return objAwait == enumC1530vu ? enumC1530vu : objAwait;
    }
}
