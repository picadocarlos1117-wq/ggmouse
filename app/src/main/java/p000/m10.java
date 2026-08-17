package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class m10 extends AbstractC0143co {

    /* JADX INFO: renamed from: a */
    public final AbstractC0143co f6587a;

    /* JADX INFO: renamed from: b */
    public volatile boolean f6588b;

    /* JADX INFO: renamed from: c */
    public List f6589c = new ArrayList();

    public m10(AbstractC0143co abstractC0143co) {
        this.f6587a = abstractC0143co;
    }

    /* JADX INFO: renamed from: a */
    public final void m4347a(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.f6588b) {
                    runnable.run();
                } else {
                    this.f6589c.add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.AbstractC0143co
    public final void onClose(nv1 nv1Var, j51 j51Var) {
        m4347a(new i10(this, nv1Var, j51Var, 1));
    }

    @Override // p000.AbstractC0143co
    public final void onHeaders(j51 j51Var) {
        if (this.f6588b) {
            this.f6587a.onHeaders(j51Var);
        } else {
            m4347a(new RunnableC1466u3(9, this, j51Var));
        }
    }

    @Override // p000.AbstractC0143co
    public final void onMessage(Object obj) {
        if (this.f6588b) {
            this.f6587a.onMessage(obj);
        } else {
            m4347a(new RunnableC1466u3(10, this, obj));
        }
    }

    @Override // p000.AbstractC0143co
    public final void onReady() {
        if (this.f6588b) {
            this.f6587a.onReady();
        } else {
            m4347a(new RunnableC1621ya(this, 6));
        }
    }
}
