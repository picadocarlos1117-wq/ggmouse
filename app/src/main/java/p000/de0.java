package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class de0 extends AbstractC0610eo {
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        C1679zv c1679zvM5176k0 = p32.m5176k0(this);
        c1679zvM5176k0.m7359a(delegate(), "delegate");
        return c1679zvM5176k0.toString();
    }

    @Override // p000.AbstractC0610eo
    public void cancel(String str, Throwable th) {
        delegate().cancel(str, th);
    }

    public abstract AbstractC0610eo delegate();

    @Override // p000.AbstractC0610eo
    public C1437tb getAttributes() {
        return delegate().getAttributes();
    }

    @Override // p000.AbstractC0610eo
    public void halfClose() {
        delegate().halfClose();
    }

    @Override // p000.AbstractC0610eo
    public boolean isReady() {
        return delegate().isReady();
    }

    @Override // p000.AbstractC0610eo
    public void request(int i) {
        delegate().request(i);
    }

    @Override // p000.AbstractC0610eo
    public void sendMessage(Object obj) {
        delegate().sendMessage(obj);
    }

    @Override // p000.AbstractC0610eo
    public void setMessageCompression(boolean z) {
        delegate().setMessageCompression(z);
    }

    @Override // p000.AbstractC0610eo
    public void start(AbstractC0143co abstractC0143co, j51 j51Var) {
        delegate().start(abstractC0143co, j51Var);
    }
}
