package p000;

/* JADX INFO: renamed from: q0 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1315q0 implements InterfaceC1419su {
    private final og0 safeCast;
    private final InterfaceC1419su topmostKey;

    public AbstractC1315q0(InterfaceC1419su interfaceC1419su, og0 og0Var) {
        interfaceC1419su.getClass();
        this.safeCast = og0Var;
        this.topmostKey = interfaceC1419su instanceof AbstractC1315q0 ? ((AbstractC1315q0) interfaceC1419su).topmostKey : interfaceC1419su;
    }

    public final boolean isSubKey$kotlin_stdlib(InterfaceC1419su interfaceC1419su) {
        interfaceC1419su.getClass();
        return interfaceC1419su == this || this.topmostKey == interfaceC1419su;
    }

    public final Object tryCast$kotlin_stdlib(InterfaceC1382ru interfaceC1382ru) {
        interfaceC1382ru.getClass();
        return (InterfaceC1382ru) this.safeCast.invoke(interfaceC1382ru);
    }
}
