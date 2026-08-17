package p000;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class fv1 implements x01 {

    /* JADX INFO: renamed from: a */
    public final xy1 f3904a;

    /* JADX INFO: renamed from: b */
    public boolean f3905b;

    /* JADX INFO: renamed from: c */
    public long f3906c;

    /* JADX INFO: renamed from: d */
    public long f3907d;

    /* JADX INFO: renamed from: e */
    public td1 f3908e = td1.f10843d;

    public fv1(xy1 xy1Var) {
        this.f3904a = xy1Var;
    }

    @Override // p000.x01
    /* JADX INFO: renamed from: a */
    public final void mo23a(td1 td1Var) {
        if (this.f3905b) {
            m2857d(mo25b());
        }
        this.f3908e = td1Var;
    }

    @Override // p000.x01
    /* JADX INFO: renamed from: b */
    public final long mo25b() {
        long j = this.f3906c;
        if (!this.f3905b) {
            return j;
        }
        this.f3904a.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f3907d;
        td1 td1Var = this.f3908e;
        return (td1Var.f10844a == 1.0f ? z42.m7216D(jElapsedRealtime) : jElapsedRealtime * ((long) td1Var.f10846c)) + j;
    }

    /* JADX INFO: renamed from: d */
    public final void m2857d(long j) {
        this.f3906c = j;
        if (this.f3905b) {
            this.f3904a.getClass();
            this.f3907d = SystemClock.elapsedRealtime();
        }
    }

    @Override // p000.x01
    /* JADX INFO: renamed from: e */
    public final td1 mo30e() {
        return this.f3908e;
    }

    /* JADX INFO: renamed from: f */
    public final void m2858f() {
        if (this.f3905b) {
            return;
        }
        this.f3904a.getClass();
        this.f3907d = SystemClock.elapsedRealtime();
        this.f3905b = true;
    }
}
