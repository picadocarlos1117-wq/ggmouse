package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class cv0 extends r72 {

    /* JADX INFO: renamed from: d */
    public static final jf0 f2642d = new jf0(1);

    /* JADX INFO: renamed from: b */
    public final ju1 f2643b = new ju1();

    /* JADX INFO: renamed from: c */
    public boolean f2644c = false;

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.r72
    /* JADX INFO: renamed from: b */
    public final void mo415b() {
        ju1 ju1Var = this.f2643b;
        int i = ju1Var.f5534c;
        for (int i2 = 0; i2 < i; i2++) {
            bv0 bv0Var = (bv0) ju1Var.f5533b[i2];
            yu0 yu0Var = bv0Var.f1557l;
            yu0Var.cancelLoad();
            yu0Var.abandon();
            C1548wb c1548wb = bv0Var.f1559n;
            if (c1548wb != null) {
                bv0Var.mo1070g(c1548wb);
                if (c1548wb.f12046b) {
                    ((zu0) c1548wb.f12048d).onLoaderReset((yu0) c1548wb.f12047c);
                }
            }
            yu0Var.unregisterListener(bv0Var);
            if (c1548wb != null) {
                boolean z = c1548wb.f12046b;
            }
            yu0Var.reset();
        }
        int i3 = ju1Var.f5534c;
        Object[] objArr = ju1Var.f5533b;
        for (int i4 = 0; i4 < i3; i4++) {
            objArr[i4] = null;
        }
        ju1Var.f5534c = 0;
    }
}
