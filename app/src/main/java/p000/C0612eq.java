package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: eq */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0612eq implements InterfaceC1456tu, Serializable {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1456tu f3411a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1382ru f3412b;

    public C0612eq(InterfaceC1456tu interfaceC1456tu, InterfaceC1382ru interfaceC1382ru) {
        interfaceC1456tu.getClass();
        interfaceC1382ru.getClass();
        this.f3411a = interfaceC1456tu;
        this.f3412b = interfaceC1382ru;
    }

    public final boolean equals(Object obj) {
        boolean zM3214e;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0612eq) {
            C0612eq c0612eq = (C0612eq) obj;
            int i = 2;
            C0612eq c0612eq2 = c0612eq;
            int i2 = 2;
            while (true) {
                InterfaceC1456tu interfaceC1456tu = c0612eq2.f3411a;
                c0612eq2 = interfaceC1456tu instanceof C0612eq ? (C0612eq) interfaceC1456tu : null;
                if (c0612eq2 == null) {
                    break;
                }
                i2++;
            }
            C0612eq c0612eq3 = this;
            while (true) {
                InterfaceC1456tu interfaceC1456tu2 = c0612eq3.f3411a;
                c0612eq3 = interfaceC1456tu2 instanceof C0612eq ? (C0612eq) interfaceC1456tu2 : null;
                if (c0612eq3 == null) {
                    break;
                }
                i++;
            }
            if (i2 == i) {
                while (true) {
                    InterfaceC1382ru interfaceC1382ru = this.f3412b;
                    if (!hp0.m3214e(c0612eq.get(interfaceC1382ru.getKey()), interfaceC1382ru)) {
                        zM3214e = false;
                        break;
                    }
                    InterfaceC1456tu interfaceC1456tu3 = this.f3411a;
                    if (!(interfaceC1456tu3 instanceof C0612eq)) {
                        interfaceC1456tu3.getClass();
                        InterfaceC1382ru interfaceC1382ru2 = (InterfaceC1382ru) interfaceC1456tu3;
                        zM3214e = hp0.m3214e(c0612eq.get(interfaceC1382ru2.getKey()), interfaceC1382ru2);
                        break;
                    }
                    this = (C0612eq) interfaceC1456tu3;
                }
                if (zM3214e) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p000.InterfaceC1456tu
    public final Object fold(Object obj, ch0 ch0Var) {
        ch0Var.getClass();
        return ch0Var.invoke(this.f3411a.fold(obj, ch0Var), this.f3412b);
    }

    @Override // p000.InterfaceC1456tu
    public final InterfaceC1382ru get(InterfaceC1419su interfaceC1419su) {
        interfaceC1419su.getClass();
        while (true) {
            InterfaceC1382ru interfaceC1382ru = this.f3412b.get(interfaceC1419su);
            if (interfaceC1382ru != null) {
                return interfaceC1382ru;
            }
            InterfaceC1456tu interfaceC1456tu = this.f3411a;
            if (!(interfaceC1456tu instanceof C0612eq)) {
                return interfaceC1456tu.get(interfaceC1419su);
            }
            this = (C0612eq) interfaceC1456tu;
        }
    }

    public final int hashCode() {
        return this.f3412b.hashCode() + this.f3411a.hashCode();
    }

    @Override // p000.InterfaceC1456tu
    public final InterfaceC1456tu minusKey(InterfaceC1419su interfaceC1419su) {
        interfaceC1419su.getClass();
        InterfaceC1382ru interfaceC1382ru = this.f3412b;
        InterfaceC1382ru interfaceC1382ru2 = interfaceC1382ru.get(interfaceC1419su);
        InterfaceC1456tu interfaceC1456tu = this.f3411a;
        if (interfaceC1382ru2 != null) {
            return interfaceC1456tu;
        }
        InterfaceC1456tu interfaceC1456tuMinusKey = interfaceC1456tu.minusKey(interfaceC1419su);
        if (interfaceC1456tuMinusKey == interfaceC1456tu) {
            return this;
        }
        return interfaceC1456tuMinusKey == k60.f5681a ? interfaceC1382ru : new C0612eq(interfaceC1456tuMinusKey, interfaceC1382ru);
    }

    @Override // p000.InterfaceC1456tu
    public final InterfaceC1456tu plus(InterfaceC1456tu interfaceC1456tu) {
        interfaceC1456tu.getClass();
        return interfaceC1456tu == k60.f5681a ? this : (InterfaceC1456tu) interfaceC1456tu.fold(this, new C0575dq(3));
    }

    public final String toString() {
        return "[" + ((String) fold("", new C0575dq(0))) + ']';
    }
}
