package p000;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class x61 implements ey1, Serializable {

    /* JADX INFO: renamed from: a */
    public final int f12464a;

    public x61() {
        sc2.m6060d(2, "expectedValuesPerKey");
        this.f12464a = 2;
    }

    @Override // p000.ey1
    public final Object get() {
        return new ArrayList(this.f12464a);
    }
}
