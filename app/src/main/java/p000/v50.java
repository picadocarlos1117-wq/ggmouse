package p000;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class v50 extends p32 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ p32 f11549l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ ThreadPoolExecutor f11550m;

    public v50(p32 p32Var, ThreadPoolExecutor threadPoolExecutor) {
        this.f11549l = p32Var;
        this.f11550m = threadPoolExecutor;
    }

    @Override // p000.p32
    /* JADX INFO: renamed from: X */
    public final void mo4711X(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f11550m;
        try {
            this.f11549l.mo4711X(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // p000.p32
    /* JADX INFO: renamed from: Y */
    public final void mo4712Y(C0599ed c0599ed) {
        ThreadPoolExecutor threadPoolExecutor = this.f11550m;
        try {
            this.f11549l.mo4712Y(c0599ed);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
