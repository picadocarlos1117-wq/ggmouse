package com.example.ssmousepro.account;

import p000.AbstractC0616eu;
import p000.EnumC1530vu;
import p000.InterfaceC0579du;
import p000.InterfaceC1311px;
import p000.ul1;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1311px(m5372c = "com.example.ssmousepro.account.AccountRepository", m5373f = "AccountRepository.kt", m5374l = {124}, m5375m = "refreshBalanceFromServer-IoAF18A")
public final class AccountRepository$refreshBalanceFromServer$1 extends AbstractC0616eu {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AccountRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountRepository$refreshBalanceFromServer$1(AccountRepository accountRepository, InterfaceC0579du interfaceC0579du) {
        super(interfaceC0579du);
        this.this$0 = accountRepository;
    }

    @Override // p000.AbstractC0018ah
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM7416refreshBalanceFromServerIoAF18A = this.this$0.m7416refreshBalanceFromServerIoAF18A(this);
        return objM7416refreshBalanceFromServerIoAF18A == EnumC1530vu.f11768a ? objM7416refreshBalanceFromServerIoAF18A : new ul1(objM7416refreshBalanceFromServerIoAF18A);
    }
}
