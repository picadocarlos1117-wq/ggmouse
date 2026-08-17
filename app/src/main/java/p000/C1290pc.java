package p000;

import android.os.Handler;

/* JADX INFO: renamed from: pc */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1290pc {

    /* JADX INFO: renamed from: a */
    public final Handler f8839a;

    /* JADX INFO: renamed from: b */
    public final c80 f8840b;

    public /* synthetic */ C1290pc(Handler handler, c80 c80Var) {
        this.f8839a = handler;
        this.f8840b = c80Var;
    }

    /* JADX INFO: renamed from: a */
    public void m5249a(C1422sx c1422sx) {
        synchronized (c1422sx) {
        }
        Handler handler = this.f8839a;
        if (handler != null) {
            handler.post(new RunnableC1467u4(4, this, c1422sx));
        }
    }

    /* JADX INFO: renamed from: b */
    public void m5250b(m62 m62Var) {
        Handler handler = this.f8839a;
        if (handler != null) {
            handler.post(new i62(this, m62Var, 0));
        }
    }
}
