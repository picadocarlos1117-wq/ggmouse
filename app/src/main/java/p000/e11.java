package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class e11 extends Exception {

    /* JADX INFO: renamed from: a */
    public final String f3153a;

    /* JADX INFO: renamed from: b */
    public final boolean f3154b;

    /* JADX INFO: renamed from: c */
    public final c11 f3155c;

    /* JADX INFO: renamed from: d */
    public final String f3156d;

    public e11(be0 be0Var, j11 j11Var, boolean z, int i) {
        this("Decoder init failed: [" + i + "], " + be0Var, j11Var, be0Var.f1341n, z, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i < 0 ? "neg_" : "") + Math.abs(i));
    }

    public e11(String str, Throwable th, String str2, boolean z, c11 c11Var, String str3) {
        super(str, th);
        this.f3153a = str2;
        this.f3154b = z;
        this.f3155c = c11Var;
        this.f3156d = str3;
    }
}
