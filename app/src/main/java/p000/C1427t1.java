package p000;

/* JADX INFO: renamed from: t1 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1427t1 {

    /* JADX INFO: renamed from: c */
    public static final C1427t1 f10691c;

    /* JADX INFO: renamed from: d */
    public static final C1427t1 f10692d;

    /* JADX INFO: renamed from: a */
    public final boolean f10693a;

    /* JADX INFO: renamed from: b */
    public final Throwable f10694b;

    static {
        if (AbstractC0084b2.GENERATE_CANCELLATION_CAUSES) {
            f10692d = null;
            f10691c = null;
        } else {
            f10692d = new C1427t1(false, null);
            f10691c = new C1427t1(true, null);
        }
    }

    public C1427t1(boolean z, Throwable th) {
        this.f10693a = z;
        this.f10694b = th;
    }
}
