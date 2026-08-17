package p000;

import android.sun.security.util.DerValue;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ej0 {

    /* JADX INFO: renamed from: a */
    public final c22 f3364a;

    /* JADX INFO: renamed from: b */
    public boolean f3365b;

    /* JADX INFO: renamed from: c */
    public boolean f3366c;

    /* JADX INFO: renamed from: d */
    public boolean f3367d;

    /* JADX INFO: renamed from: e */
    public int f3368e;

    /* JADX INFO: renamed from: f */
    public int f3369f;

    /* JADX INFO: renamed from: g */
    public long f3370g;

    /* JADX INFO: renamed from: h */
    public long f3371h;

    public ej0(c22 c22Var) {
        this.f3364a = c22Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m2589a(int i, int i2, byte[] bArr) {
        if (this.f3366c) {
            int i3 = this.f3369f;
            int i4 = (i + 1) - i3;
            if (i4 >= i2) {
                this.f3369f = (i2 - i) + i3;
            } else {
                this.f3367d = ((bArr[i4] & DerValue.TAG_PRIVATE) >> 6) == 0;
                this.f3366c = false;
            }
        }
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
    /* JADX INFO: renamed from: b */
    public final void m2590b(int i, boolean z, long j) {
        ki0.m3864h(this.f3371h != -9223372036854775807L);
        if (this.f3368e == 182 && z && this.f3365b) {
            this.f3364a.mo1114a(this.f3371h, this.f3367d ? 1 : 0, (int) (j - this.f3370g), i, null);
        }
        if (this.f3368e != 179) {
            this.f3370g = j;
        }
    }
}
