package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class r30 implements qh1 {

    /* JADX INFO: renamed from: c */
    public static final Object f9665c = new Object();

    /* JADX INFO: renamed from: a */
    public volatile b90 f9666a;

    /* JADX INFO: renamed from: b */
    public volatile Object f9667b;

    /* JADX INFO: renamed from: a */
    public static qh1 m5676a(b90 b90Var) {
        if (b90Var instanceof r30) {
            return b90Var;
        }
        r30 r30Var = new r30();
        r30Var.f9667b = f9665c;
        r30Var.f9666a = b90Var;
        return r30Var;
    }

    @Override // p000.qh1
    public final Object get() {
        Object obj;
        Object obj2 = this.f9667b;
        Object obj3 = f9665c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f9667b;
                if (obj == obj3) {
                    obj = this.f9666a.get();
                    Object obj4 = this.f9667b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f9667b = obj;
                    this.f9666a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
