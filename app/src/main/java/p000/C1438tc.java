package p000;

/* JADX INFO: renamed from: tc */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1438tc extends Exception {

    /* JADX INFO: renamed from: a */
    public final int f10823a;

    /* JADX INFO: renamed from: b */
    public final boolean f10824b;

    /* JADX INFO: renamed from: c */
    public final be0 f10825c;

    public C1438tc(int i, be0 be0Var, boolean z) {
        super(jd0.m3609g(i, "AudioTrack write failed: "));
        this.f10824b = z;
        this.f10823a = i;
        this.f10825c = be0Var;
    }
}
