package p000;

/* JADX INFO: renamed from: rc */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1364rc extends Exception {

    /* JADX INFO: renamed from: a */
    public final int f9880a;

    /* JADX INFO: renamed from: b */
    public final boolean f9881b;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1364rc(int i, int i2, int i3, int i4, be0 be0Var, boolean z, RuntimeException runtimeException) {
        StringBuilder sbM5345l = AbstractC1308pu.m5345l("AudioTrack init failed ", i, " Config(", i2, ", ");
        AbstractC1308pu.m5356w(sbM5345l, i3, ", ", i4, ") ");
        sbM5345l.append(be0Var);
        sbM5345l.append(z ? " (recoverable)" : "");
        super(sbM5345l.toString(), runtimeException);
        this.f9880a = i;
        this.f9881b = z;
    }
}
