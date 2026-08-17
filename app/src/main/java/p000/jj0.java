package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class jj0 {

    /* JADX INFO: renamed from: a */
    public final c22 f5420a;

    /* JADX INFO: renamed from: b */
    public long f5421b;

    /* JADX INFO: renamed from: c */
    public boolean f5422c;

    /* JADX INFO: renamed from: d */
    public int f5423d;

    /* JADX INFO: renamed from: e */
    public long f5424e;

    /* JADX INFO: renamed from: f */
    public boolean f5425f;

    /* JADX INFO: renamed from: g */
    public boolean f5426g;

    /* JADX INFO: renamed from: h */
    public boolean f5427h;

    /* JADX INFO: renamed from: i */
    public boolean f5428i;

    /* JADX INFO: renamed from: j */
    public boolean f5429j;

    /* JADX INFO: renamed from: k */
    public long f5430k;

    /* JADX INFO: renamed from: l */
    public long f5431l;

    /* JADX INFO: renamed from: m */
    public boolean f5432m;

    public jj0(c22 c22Var) {
        this.f5420a = c22Var;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: a */
    public final void m3653a(int i) {
        long j = this.f5431l;
        if (j == -9223372036854775807L) {
            return;
        }
        boolean z = this.f5432m;
        this.f5420a.mo1114a(j, z ? 1 : 0, (int) (this.f5421b - this.f5430k), i, null);
    }
}
