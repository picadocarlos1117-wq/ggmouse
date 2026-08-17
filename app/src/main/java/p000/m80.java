package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class m80 {

    /* JADX INFO: renamed from: a */
    public final y12 f6710a;

    /* JADX INFO: renamed from: b */
    public final int[] f6711b;

    public m80(int i, y12 y12Var, int[] iArr) {
        if (iArr.length == 0) {
            AbstractC1337qm.m5551n("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f6710a = y12Var;
        this.f6711b = iArr;
    }
}
