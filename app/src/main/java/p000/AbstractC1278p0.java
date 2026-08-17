package p000;

/* JADX INFO: renamed from: p0 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1278p0 implements InterfaceC1382ru {
    private final InterfaceC1419su key;

    public AbstractC1278p0(InterfaceC1419su interfaceC1419su) {
        interfaceC1419su.getClass();
        this.key = interfaceC1419su;
    }

    @Override // p000.InterfaceC1456tu
    public <R> R fold(R r, ch0 ch0Var) {
        ch0Var.getClass();
        return (R) ch0Var.invoke(r, this);
    }

    @Override // p000.InterfaceC1456tu
    public <E extends InterfaceC1382ru> E get(InterfaceC1419su interfaceC1419su) {
        return (E) p32.m5145K(this, interfaceC1419su);
    }

    @Override // p000.InterfaceC1382ru
    public InterfaceC1419su getKey() {
        return this.key;
    }

    @Override // p000.InterfaceC1456tu
    public InterfaceC1456tu minusKey(InterfaceC1419su interfaceC1419su) {
        return p32.m5155V(this, interfaceC1419su);
    }

    @Override // p000.InterfaceC1456tu
    public InterfaceC1456tu plus(InterfaceC1456tu interfaceC1456tu) {
        interfaceC1456tu.getClass();
        return interfaceC1456tu == k60.f5681a ? this : (InterfaceC1456tu) interfaceC1456tu.fold(this, new C0575dq(3));
    }
}
