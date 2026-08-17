package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class eh1 extends ih1 implements mg0 {
    @Override // p000.AbstractC0139cl
    public iq0 computeReflected() {
        gk1.f4217a.getClass();
        return this;
    }

    public abstract Object get();

    public Object getDelegate() {
        return ((eh1) getReflected()).getDelegate();
    }

    /* JADX INFO: renamed from: getGetter, reason: collision with other method in class */
    public nq0 m7439getGetter() {
        ((eh1) getReflected()).m7439getGetter();
        return null;
    }

    @Override // p000.mg0
    public Object invoke() {
        return get();
    }

    public /* bridge */ /* synthetic */ mq0 getGetter() {
        m7439getGetter();
        return null;
    }
}
