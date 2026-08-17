package com.example.ssmousepro;

import com.example.ssmousepro.account.GoogleAuthService;
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
@InterfaceC1311px(m5372c = "com.example.ssmousepro.LoginActivity$googleLauncher$1$1$perfil$1", m5373f = "LoginActivity.kt", m5374l = {83}, m5375m = "invokeSuspend")
public final class LoginActivity$googleLauncher$1$1$perfil$1 extends ny1 implements ch0 {
    final /* synthetic */ String $idToken;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginActivity$googleLauncher$1$1$perfil$1(String str, InterfaceC0579du interfaceC0579du) {
        super(2, interfaceC0579du);
        this.$idToken = str;
    }

    @Override // p000.AbstractC0018ah
    public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
        return new LoginActivity$googleLauncher$1$1$perfil$1(this.$idToken, interfaceC0579du);
    }

    @Override // p000.ch0
    public final Object invoke(CoroutineScope coroutineScope, InterfaceC0579du interfaceC0579du) {
        return ((LoginActivity$googleLauncher$1$1$perfil$1) create(coroutineScope, interfaceC0579du)).invokeSuspend(z32.f13265a);
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
        GoogleAuthService googleAuthService = GoogleAuthService.INSTANCE;
        String str = this.$idToken;
        this.label = 1;
        Object objConcluirComIdToken = googleAuthService.concluirComIdToken(str, this);
        EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
        return objConcluirComIdToken == enumC1530vu ? enumC1530vu : objConcluirComIdToken;
    }
}
