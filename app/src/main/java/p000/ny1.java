package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ny1 extends AbstractC0616eu implements mh0 {
    private final int arity;

    public ny1(int i, InterfaceC0579du interfaceC0579du) {
        super(interfaceC0579du);
        this.arity = i;
    }

    @Override // p000.mh0
    public int getArity() {
        return this.arity;
    }

    @Override // p000.AbstractC0018ah
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        gk1.f4217a.getClass();
        return hk1.m3176a(this);
    }
}
