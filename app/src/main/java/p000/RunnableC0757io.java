package p000;

import java.util.Locale;

/* JADX INFO: renamed from: io */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0757io implements Runnable {

    /* JADX INFO: renamed from: a */
    public final long f5111a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0798jo f5112b;

    public RunnableC0757io(C0798jo c0798jo, long j) {
        this.f5112b = c0798jo;
        this.f5111a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zj0 zj0Var = new zj0(1);
        C0798jo c0798jo = this.f5112b;
        c0798jo.f5473i.mo1031g(zj0Var);
        long j = this.f5111a;
        long jAbs = Math.abs(j) / 1000000000;
        long jAbs2 = Math.abs(j) % 1000000000;
        StringBuilder sb = new StringBuilder("deadline exceeded after ");
        if (j < 0) {
            sb.append('-');
        }
        sb.append(jAbs);
        Locale locale = Locale.US;
        sb.append(String.format(locale, ".%09d", Long.valueOf(jAbs2)));
        sb.append("s. ");
        Long l = (Long) c0798jo.f5472h.m168a(rc2.f9888a);
        sb.append(String.format(locale, "Name resolution delay %.9f seconds. ", Double.valueOf(l == null ? 0.0d : l.longValue() / C0798jo.f5464q)));
        sb.append(zj0Var);
        c0798jo.f5473i.mo1030f(nv1.f7553h.m4611a(sb.toString()));
    }
}
