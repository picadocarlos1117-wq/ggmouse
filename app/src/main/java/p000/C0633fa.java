package p000;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: fa */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0633fa extends zs1 implements Map {

    /* JADX INFO: renamed from: m */
    public C0092ba f3728m;

    /* JADX INFO: renamed from: n */
    public C0560da f3729n;

    /* JADX INFO: renamed from: o */
    public C1546w9 f3730o;

    public C0633fa(zs1 zs1Var) {
        int i = zs1Var.f13557c;
        m7345b(i);
        if (this.f13557c != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(zs1Var.m7350h(i2), zs1Var.m7352j(i2));
            }
        } else if (i > 0) {
            System.arraycopy(zs1Var.f13555a, 0, this.f13555a, 0, i);
            System.arraycopy(zs1Var.f13556b, 0, this.f13556b, 0, i << 1);
            this.f13557c = i;
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C0092ba c0092ba = this.f3728m;
        if (c0092ba != null) {
            return c0092ba;
        }
        C0092ba c0092ba2 = new C0092ba(0, this);
        this.f3728m = c0092ba2;
        return c0092ba2;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m2779k(Collection collection) {
        int i = this.f13557c;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(m7350h(i2))) {
                m7351i(i2);
            }
        }
        return i != this.f13557c;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C0560da c0560da = this.f3729n;
        if (c0560da != null) {
            return c0560da;
        }
        C0560da c0560da2 = new C0560da(this);
        this.f3729n = c0560da2;
        return c0560da2;
    }

    /* JADX INFO: renamed from: l */
    public final Object[] m2780l(int i, Object[] objArr) {
        int i2 = this.f13557c;
        if (objArr.length < i2) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i2);
        }
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = this.f13556b[(i3 << 1) + i];
        }
        if (objArr.length > i2) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        m7345b(map.size() + this.f13557c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        C1546w9 c1546w9 = this.f3730o;
        if (c1546w9 != null) {
            return c1546w9;
        }
        C1546w9 c1546w10 = new C1546w9(this);
        this.f3730o = c1546w10;
        return c1546w10;
    }

    public C0633fa(int i) {
        if (i == 0) {
            this.f13555a = AbstractC1337qm.f9534b;
            this.f13556b = AbstractC1337qm.f9535c;
        } else {
            m7344a(i);
        }
        this.f13557c = 0;
    }
}
