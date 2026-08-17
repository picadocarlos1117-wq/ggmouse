package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class lh1 {

    /* JADX INFO: renamed from: d */
    public static final ThreadLocal f6350d = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public final ec1 f6351a;

    /* JADX INFO: renamed from: b */
    public final y41 f6352b;

    /* JADX INFO: renamed from: c */
    public final int f6353c;

    public lh1(y41 y41Var) {
        p32.m5188s(y41Var, "defaultInstance cannot be null");
        this.f6352b = y41Var;
        this.f6351a = y41Var.getParserForType();
        this.f6353c = -1;
    }
}
