package p000;

import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class p80 {

    /* JADX INFO: renamed from: a */
    public Random f8793a;

    /* JADX INFO: renamed from: b */
    public long f8794b;

    /* JADX INFO: renamed from: c */
    public double f8795c;

    /* JADX INFO: renamed from: d */
    public double f8796d;

    /* JADX INFO: renamed from: e */
    public long f8797e;

    /* JADX INFO: renamed from: a */
    public final long m5230a() {
        long j = this.f8797e;
        double d = j;
        this.f8797e = Math.min((long) (this.f8795c * d), this.f8794b);
        double d2 = this.f8796d;
        double d3 = (-d2) * d;
        double d4 = d2 * d;
        p32.m5175k(d4 >= d3);
        return j + ((long) ((this.f8793a.nextDouble() * (d4 - d3)) + d3));
    }
}
