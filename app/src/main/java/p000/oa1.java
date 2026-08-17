package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class oa1 implements ks0, InterfaceC0832kl {

    /* JADX INFO: renamed from: a */
    public final fs0 f7713a;

    /* JADX INFO: renamed from: b */
    public final ia1 f7714b;

    /* JADX INFO: renamed from: c */
    public pa1 f7715c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ra1 f7716d;

    public oa1(ra1 ra1Var, fs0 fs0Var, ia1 ia1Var) {
        ia1Var.getClass();
        this.f7716d = ra1Var;
        this.f7713a = fs0Var;
        this.f7714b = ia1Var;
        fs0Var.mo2848a(this);
    }

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
    @Override // p000.ks0
    /* JADX INFO: renamed from: c */
    public final void mo157c(ms0 ms0Var, ds0 ds0Var) {
        if (ds0Var != ds0.ON_START) {
            if (ds0Var != ds0.ON_STOP) {
                if (ds0Var == ds0.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                pa1 pa1Var = this.f7715c;
                if (pa1Var != null) {
                    pa1Var.cancel();
                    return;
                }
                return;
            }
        }
        ra1 ra1Var = this.f7716d;
        ra1Var.getClass();
        ia1 ia1Var = this.f7714b;
        ia1Var.getClass();
        ra1Var.f9858b.addLast(ia1Var);
        pa1 pa1Var2 = new pa1(ra1Var, ia1Var);
        ia1Var.addCancellable(pa1Var2);
        ra1Var.m5756d();
        ia1Var.setEnabledChangedCallback$activity_release(new qa1(0, ra1Var, ra1.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 1));
        this.f7715c = pa1Var2;
    }

    @Override // p000.InterfaceC0832kl
    public final void cancel() {
        this.f7713a.mo2849b(this);
        this.f7714b.removeCancellable(this);
        pa1 pa1Var = this.f7715c;
        if (pa1Var != null) {
            pa1Var.cancel();
        }
        this.f7715c = null;
    }
}
