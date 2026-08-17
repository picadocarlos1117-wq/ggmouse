package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gh1 extends ih1 implements og0 {
    @Override // p000.AbstractC0139cl
    public iq0 computeReflected() {
        gk1.f4217a.getClass();
        return this;
    }

    public abstract Object get(Object obj);

    public Object getDelegate(Object obj) {
        return ((gh1) getReflected()).getDelegate(obj);
    }

    /* JADX INFO: renamed from: getGetter, reason: collision with other method in class */
    public oq0 m7441getGetter() {
        ((gh1) getReflected()).m7441getGetter();
        return null;
    }

    @Override // p000.og0
    public Object invoke(Object obj) {
        return get(obj);
    }

    public /* bridge */ /* synthetic */ mq0 getGetter() {
        m7441getGetter();
        return null;
    }
}
