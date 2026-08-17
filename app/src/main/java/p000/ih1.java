package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ih1 extends AbstractC0139cl implements pq0 {
    private final boolean syntheticJavaProperty;

    public ih1(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.syntheticJavaProperty = false;
    }

    @Override // p000.AbstractC0139cl
    public iq0 compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ih1) {
            ih1 ih1Var = (ih1) obj;
            return getOwner().equals(ih1Var.getOwner()) && getName().equals(ih1Var.getName()) && getSignature().equals(ih1Var.getSignature()) && hp0.m3214e(getBoundReceiver(), ih1Var.getBoundReceiver());
        }
        if (obj instanceof pq0) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // p000.AbstractC0139cl
    public pq0 getReflected() {
        if (this.syntheticJavaProperty) {
            C0694gy.m3079e("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
            return null;
        }
        iq0 iq0VarCompute = compute();
        if (iq0VarCompute != this) {
            return (pq0) iq0VarCompute;
        }
        throw new zq0("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    @Override // p000.pq0
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // p000.pq0
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        iq0 iq0VarCompute = compute();
        if (iq0VarCompute != this) {
            return iq0VarCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
