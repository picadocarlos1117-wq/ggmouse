package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class fa1 {

    /* JADX INFO: renamed from: a */
    public final C1073lj f3733a;

    /* JADX INFO: renamed from: b */
    public int f3734b;

    /* JADX INFO: renamed from: c */
    public int f3735c;

    public fa1(C1073lj c1073lj, int i) {
        this.f3733a = c1073lj;
        this.f3734b = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m2781a(byte[] bArr, int i, int i2) {
        this.f3733a.write(bArr, i, i2);
        this.f3734b -= i2;
        this.f3735c += i2;
    }
}
