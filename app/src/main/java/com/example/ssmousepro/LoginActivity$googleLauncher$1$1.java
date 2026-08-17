package com.example.ssmousepro;

import com.example.ssmousepro.account.AccountRepository;
import kotlinx.coroutines.CoroutineScope;
import p000.C0738i4;
import p000.EnumC1530vu;
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
@InterfaceC1311px(m5372c = "com.example.ssmousepro.LoginActivity$googleLauncher$1$1", m5373f = "LoginActivity.kt", m5374l = {82, 85}, m5375m = "invokeSuspend")
public final class LoginActivity$googleLauncher$1$1 extends ny1 implements ch0 {
    final /* synthetic */ C0738i4 $result;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ LoginActivity this$0;

    /* JADX INFO: renamed from: com.example.ssmousepro.LoginActivity$googleLauncher$1$1$1 */
    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    @InterfaceC1311px(m5372c = "com.example.ssmousepro.LoginActivity$googleLauncher$1$1$1", m5373f = "LoginActivity.kt", m5374l = {86}, m5375m = "invokeSuspend")
    public static final class C01901 extends ny1 implements ch0 {
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        public C01901(InterfaceC0579du interfaceC0579du) {
            super(2, interfaceC0579du);
        }

        @Override // p000.AbstractC0018ah
        public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
            C01901 c01901 = new C01901(interfaceC0579du);
            c01901.L$0 = obj;
            return c01901;
        }

        @Override // p000.ch0
        public final Object invoke(CoroutineScope coroutineScope, InterfaceC0579du interfaceC0579du) {
            return ((C01901) create(coroutineScope, interfaceC0579du)).invokeSuspend(z32.f13265a);
        }

        @Override // p000.AbstractC0018ah
        public final Object invokeSuspend(Object obj) {
            Object tl1Var;
            Object objM7417carregarPerfilIoAF18A;
            int i = this.label;
            try {
                if (i == 0) {
                    ua0.m6440Z(obj);
                    AccountRepository accountRepository = AccountRepository.INSTANCE;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.I$0 = 0;
                    this.label = 1;
                    objM7417carregarPerfilIoAF18A = accountRepository.m7417carregarPerfilIoAF18A(this);
                    EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
                    if (objM7417carregarPerfilIoAF18A == enumC1530vu) {
                        return enumC1530vu;
                    }
                } else {
                    if (i != 1) {
                        f40.m2719o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ua0.m6440Z(obj);
                    objM7417carregarPerfilIoAF18A = ((ul1) obj).f11356a;
                }
                tl1Var = new ul1(objM7417carregarPerfilIoAF18A);
            } catch (Throwable th) {
                tl1Var = new tl1(th);
            }
            return new ul1(tl1Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginActivity$googleLauncher$1$1(C0738i4 c0738i4, LoginActivity loginActivity, InterfaceC0579du interfaceC0579du) {
        super(2, interfaceC0579du);
        this.$result = c0738i4;
        this.this$0 = loginActivity;
    }

    @Override // p000.AbstractC0018ah
    public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
        return new LoginActivity$googleLauncher$1$1(this.$result, this.this$0, interfaceC0579du);
    }

    @Override // p000.ch0
    public final Object invoke(CoroutineScope coroutineScope, InterfaceC0579du interfaceC0579du) {
        return ((LoginActivity$googleLauncher$1$1) create(coroutineScope, interfaceC0579du)).invokeSuspend(z32.f13265a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0091, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r10, r7, r9) == r6) goto L24;
     */
    @Override // p000.AbstractC0018ah
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ssmousepro.LoginActivity$googleLauncher$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
