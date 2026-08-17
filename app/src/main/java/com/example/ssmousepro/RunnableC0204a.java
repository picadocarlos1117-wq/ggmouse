package com.example.ssmousepro;

import org.json.JSONException;

/* JADX INFO: renamed from: com.example.ssmousepro.a */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0204a implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1883a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f1884b;

    public /* synthetic */ RunnableC0204a(Object obj, int i) {
        this.f1883a = i;
        this.f1884b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        int i = this.f1883a;
        Object obj = this.f1884b;
        switch (i) {
            case 0:
                FloatingService.C01532.invokeSuspend$lambda$0((FloatingService) obj);
                break;
            case 1:
                FloatingService.C01532.invokeSuspend$lambda$1((FloatingService) obj);
                break;
            case 2:
                FloatingService.C01532.invokeSuspend$lambda$2((FloatingService) obj);
                break;
            case 3:
                FloatingService.C01651.invokeSuspend$lambda$0((FloatingService) obj);
                break;
            case 4:
                FloatingService.C01661.invokeSuspend$lambda$0((FloatingService) obj);
                break;
            case 5:
                FloatingService.C01671.invokeSuspend$lambda$0((FloatingService) obj);
                break;
            case 6:
                FloatingService.C01671.invokeSuspend$lambda$1((FloatingService) obj);
                break;
            default:
                PlansBottomSheet.access$carregarEExibirVideo((PlansBottomSheet) obj);
                break;
        }
    }
}
