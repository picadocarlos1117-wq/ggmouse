package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class uy1 implements ur0, Serializable {

    /* JADX INFO: renamed from: a */
    public mg0 f11456a;

    /* JADX INFO: renamed from: b */
    public volatile Object f11457b;

    /* JADX INFO: renamed from: c */
    public final Object f11458c;

    public uy1(mg0 mg0Var) {
        mg0Var.getClass();
        this.f11456a = mg0Var;
        this.f11457b = k50.f5677n;
        this.f11458c = this;
    }

    /* JADX INFO: renamed from: a */
    public final Object m6544a() {
        Object objInvoke;
        Object obj = this.f11457b;
        k50 k50Var = k50.f5677n;
        if (obj != k50Var) {
            return obj;
        }
        synchronized (this.f11458c) {
            objInvoke = this.f11457b;
            if (objInvoke == k50Var) {
                mg0 mg0Var = this.f11456a;
                mg0Var.getClass();
                objInvoke = mg0Var.invoke();
                this.f11457b = objInvoke;
                this.f11456a = null;
            }
        }
        return objInvoke;
    }

    public final String toString() {
        return this.f11457b != k50.f5677n ? String.valueOf(m6544a()) : "Lazy value not initialized yet.";
    }
}
