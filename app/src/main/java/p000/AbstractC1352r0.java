package p000;

/* JADX INFO: renamed from: r0 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1352r0 extends AbstractC0570dk {

    /* JADX INFO: renamed from: b */
    public int f9642b;

    /* JADX INFO: renamed from: c */
    public Object f9643c;

    public AbstractC1352r0() {
        super(1);
        this.f9642b = 2;
    }

    /* JADX INFO: renamed from: b */
    public abstract Object mo3480b();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        p32.m5192w(this.f9642b != 4);
        int iM5359z = AbstractC1308pu.m5359z(this.f9642b);
        if (iM5359z == 0) {
            return true;
        }
        if (iM5359z != 2) {
            this.f9642b = 4;
            this.f9643c = mo3480b();
            if (this.f9642b != 3) {
                this.f9642b = 1;
                return true;
            }
        }
        return false;
    }

    @Override // p000.AbstractC0570dk, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            ca0.m1185q();
            return null;
        }
        this.f9642b = 2;
        Object obj = this.f9643c;
        this.f9643c = null;
        return obj;
    }
}
