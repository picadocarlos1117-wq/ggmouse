package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class or0 implements mh0, Serializable {
    private final int arity;

    public or0(int i) {
        this.arity = i;
    }

    @Override // p000.mh0
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        gk1.f4217a.getClass();
        return hk1.m3176a(this);
    }
}
