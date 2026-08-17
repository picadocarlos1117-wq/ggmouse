package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class gy1 implements ey1 {

    /* JADX INFO: renamed from: d */
    public static final c00 f4361d = new c00(3);

    /* JADX INFO: renamed from: a */
    public final Object f4362a = new Object();

    /* JADX INFO: renamed from: b */
    public volatile ey1 f4363b;

    /* JADX INFO: renamed from: c */
    public Object f4364c;

    public gy1(ey1 ey1Var) {
        this.f4363b = ey1Var;
    }

    @Override // p000.ey1
    public final Object get() {
        ey1 ey1Var = this.f4363b;
        c00 c00Var = f4361d;
        if (ey1Var != c00Var) {
            synchronized (this.f4362a) {
                try {
                    if (this.f4363b != c00Var) {
                        Object obj = this.f4363b.get();
                        this.f4364c = obj;
                        this.f4363b = c00Var;
                        return obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f4364c;
    }

    public final String toString() {
        Object obj = this.f4363b;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == f4361d) {
            obj = "<supplier that returned " + this.f4364c + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
