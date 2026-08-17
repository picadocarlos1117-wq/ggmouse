package p000;

import com.google.firebase.firestore.remote.GrpcCallProvider;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ri0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10053a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ GrpcCallProvider f10054b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ww0 f10055c;

    public /* synthetic */ ri0(GrpcCallProvider grpcCallProvider, ww0 ww0Var, int i) {
        this.f10053a = i;
        this.f10054b = grpcCallProvider;
        this.f10055c = ww0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f10053a;
        ww0 ww0Var = this.f10055c;
        GrpcCallProvider grpcCallProvider = this.f10054b;
        switch (i) {
            case 0:
                grpcCallProvider.lambda$onConnectivityStateChange$1(ww0Var);
                break;
            case 1:
                grpcCallProvider.lambda$onConnectivityStateChange$3(ww0Var);
                break;
            case 2:
                grpcCallProvider.lambda$onConnectivityStateChange$2(ww0Var);
                break;
            case 3:
                grpcCallProvider.lambda$resetChannel$4(ww0Var);
                break;
            default:
                grpcCallProvider.lambda$initChannelTask$5(ww0Var);
                break;
        }
    }
}
