package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class mm0 extends AbstractC0698h1 implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Object f7040a;

    /* JADX INFO: renamed from: b */
    public final Object f7041b;

    public mm0(Object obj, Object obj2) {
        this.f7040a = obj;
        this.f7041b = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f7040a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f7041b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
