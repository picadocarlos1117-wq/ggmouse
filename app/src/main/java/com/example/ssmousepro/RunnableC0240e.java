package com.example.ssmousepro;

/* JADX INFO: renamed from: com.example.ssmousepro.e */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0240e implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1898a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FloatingService f1899b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f1900c;

    public /* synthetic */ RunnableC0240e(FloatingService floatingService, boolean z) {
        this.f1898a = 2;
        this.f1900c = z;
        this.f1899b = floatingService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1898a) {
            case 0:
                FloatingService$mostrarConfigResolucoes$aoDesligarModo$1.invokeSuspend$lambda$0(this.f1899b, this.f1900c);
                break;
            case 1:
                FloatingService$mostrarConfigResolucoes$aoLigarModo$2.invokeSuspend$lambda$0(this.f1899b, this.f1900c);
                break;
            default:
                FloatingService$mostrarConfigResolucoes$btnReset$1$1.invokeSuspend$lambda$0(this.f1900c, this.f1899b);
                break;
        }
    }

    public /* synthetic */ RunnableC0240e(FloatingService floatingService, int i, boolean z) {
        this.f1898a = i;
        this.f1899b = floatingService;
        this.f1900c = z;
    }
}
