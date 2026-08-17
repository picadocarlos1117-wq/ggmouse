package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class fy1 implements ey1, Serializable {

    /* JADX INFO: renamed from: a */
    public final transient Object f3923a = new Object();

    /* JADX INFO: renamed from: b */
    public final ey1 f3924b;

    /* JADX INFO: renamed from: c */
    public volatile transient boolean f3925c;

    /* JADX INFO: renamed from: d */
    public transient Object f3926d;

    public fy1(ey1 ey1Var) {
        this.f3924b = ey1Var;
    }

    @Override // p000.ey1
    public final Object get() {
        if (!this.f3925c) {
            synchronized (this.f3923a) {
                try {
                    if (!this.f3925c) {
                        Object obj = this.f3924b.get();
                        this.f3926d = obj;
                        this.f3925c = true;
                        return obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f3926d;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (this.f3925c) {
            obj = "<supplier that returned " + this.f3926d + ">";
        } else {
            obj = this.f3924b;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
