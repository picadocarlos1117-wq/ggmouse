package p000;

import com.example.ssmousepro.injection.TouchPipeline;

/* JADX INFO: renamed from: pd */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1291pd {

    /* JADX INFO: renamed from: a */
    public int f8848a;

    /* JADX INFO: renamed from: b */
    public int f8849b;

    /* JADX INFO: renamed from: c */
    public float f8850c;

    /* JADX INFO: renamed from: d */
    public float f8851d;

    /* JADX INFO: renamed from: e */
    public long f8852e;

    /* JADX INFO: renamed from: f */
    public long f8853f;

    /* JADX INFO: renamed from: g */
    public long f8854g;

    /* JADX INFO: renamed from: h */
    public float f8855h;

    /* JADX INFO: renamed from: i */
    public int f8856i;

    /* JADX INFO: renamed from: a */
    public final float m5251a(long j) {
        long j2 = this.f8852e;
        if (j < j2) {
            return TouchPipeline.SIZE;
        }
        long j3 = this.f8854g;
        if (j3 < 0 || j < j3) {
            return pt0.m5328b((j - j2) / this.f8848a, TouchPipeline.SIZE, 1.0f) * 0.5f;
        }
        float f = this.f8855h;
        return (pt0.m5328b((j - j3) / this.f8856i, TouchPipeline.SIZE, 1.0f) * f) + (1.0f - f);
    }
}
