package p000;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class fl1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3848a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gl1 f3849b;

    public /* synthetic */ fl1(gl1 gl1Var, int i) {
        this.f3848a = i;
        this.f3849b = gl1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f3848a;
        int i2 = 0;
        gl1 gl1Var = this.f3849b;
        switch (i) {
            case 0:
                if (!gl1Var.f4233f) {
                    gl1Var.f4234g = null;
                } else {
                    long jM6141a = gl1Var.f4232e - gl1Var.f4231d.m6141a();
                    if (jM6141a <= 0) {
                        gl1Var.f4233f = false;
                        gl1Var.f4234g = null;
                        gl1Var.f4230c.run();
                    } else {
                        gl1Var.f4234g = gl1Var.f4228a.schedule(new fl1(gl1Var, 1), jM6141a, TimeUnit.NANOSECONDS);
                    }
                }
                break;
            default:
                gl1Var.f4229b.execute(new fl1(gl1Var, i2));
                break;
        }
    }
}
