package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ad2 implements cd2 {

    /* JADX INFO: renamed from: c */
    public static final Object f165c = new Object();

    /* JADX INFO: renamed from: a */
    public volatile cd2 f166a;

    /* JADX INFO: renamed from: b */
    public volatile Object f167b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static ad2 m143b(bd2 bd2Var) {
        if (bd2Var instanceof ad2) {
            return (ad2) bd2Var;
        }
        ad2 ad2Var = new ad2();
        ad2Var.f167b = f165c;
        ad2Var.f166a = bd2Var;
        return ad2Var;
    }

    @Override // p000.cd2
    /* JADX INFO: renamed from: a */
    public final Object mo144a() {
        Object objMo144a;
        Object obj = this.f167b;
        Object obj2 = f165c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objMo144a = this.f167b;
                if (objMo144a == obj2) {
                    objMo144a = this.f166a.mo144a();
                    Object obj3 = this.f167b;
                    if (obj3 != obj2 && obj3 != objMo144a) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objMo144a + ". This is likely due to a circular dependency.");
                    }
                    this.f167b = objMo144a;
                    this.f166a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objMo144a;
    }
}
