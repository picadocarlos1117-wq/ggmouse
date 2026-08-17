package p000;

/* JADX INFO: renamed from: eo */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0610eo {
    public abstract void cancel(String str, Throwable th);

    public C1437tb getAttributes() {
        return C1437tb.f10816b;
    }

    public abstract void halfClose();

    public boolean isReady() {
        return !(this instanceof AbstractC1231oo);
    }

    public abstract void request(int i);

    public abstract void sendMessage(Object obj);

    public abstract void start(AbstractC0143co abstractC0143co, j51 j51Var);

    public void setMessageCompression(boolean z) {
    }
}
