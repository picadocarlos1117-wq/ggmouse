package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class nh0 extends AbstractC0139cl implements mh0, lq0 {
    private final int arity;
    private final int flags;

    public nh0(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
        this.flags = 0;
    }

    @Override // p000.AbstractC0139cl
    public iq0 computeReflected() {
        gk1.f4217a.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nh0) {
            nh0 nh0Var = (nh0) obj;
            return getName().equals(nh0Var.getName()) && getSignature().equals(nh0Var.getSignature()) && this.flags == nh0Var.flags && this.arity == nh0Var.arity && hp0.m3214e(getBoundReceiver(), nh0Var.getBoundReceiver()) && hp0.m3214e(getOwner(), nh0Var.getOwner());
        }
        if (obj instanceof lq0) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // p000.mh0
    public int getArity() {
        return this.arity;
    }

    @Override // p000.AbstractC0139cl
    public lq0 getReflected() {
        iq0 iq0VarCompute = compute();
        if (iq0VarCompute != this) {
            return (lq0) iq0VarCompute;
        }
        throw new zq0("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // p000.lq0
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // p000.lq0
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // p000.lq0
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // p000.lq0
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // p000.AbstractC0139cl, p000.iq0
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        iq0 iq0VarCompute = compute();
        if (iq0VarCompute != this) {
            return iq0VarCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}
