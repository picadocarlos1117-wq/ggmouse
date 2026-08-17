package p000;

import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public abstract class qs0 extends InputStream {

    /* JADX INFO: renamed from: a */
    public final InputStream f9570a;

    /* JADX INFO: renamed from: b */
    public final int f9571b;

    public qs0(InputStream inputStream, int i) {
        this.f9570a = inputStream;
        this.f9571b = i;
    }

    /* JADX INFO: renamed from: c */
    public final void m5606c() {
        InputStream inputStream = this.f9570a;
        if (inputStream instanceof xm0) {
            xm0 xm0Var = (xm0) inputStream;
            xm0Var.f12644f = true;
            xm0Var.m6935d();
        }
    }
}
