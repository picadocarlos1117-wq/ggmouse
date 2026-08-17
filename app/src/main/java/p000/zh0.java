package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class zh0 implements w41 {

    /* JADX INFO: renamed from: b */
    public static final zh0 f13417b = new zh0(0);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f13418a;

    public /* synthetic */ zh0(int i) {
        this.f13418a = i;
    }

    @Override // p000.w41
    /* JADX INFO: renamed from: a */
    public final si1 mo6703a(Class cls) {
        switch (this.f13418a) {
            case 0:
                if (!fi0.class.isAssignableFrom(cls)) {
                    f40.m2713i("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (si1) fi0.getDefaultInstance(cls.asSubclass(fi0.class)).buildMessageInfo();
                } catch (Exception e) {
                    l41.m4043l("Unable to get message info for ".concat(cls.getName()), e);
                    return null;
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // p000.w41
    /* JADX INFO: renamed from: b */
    public final boolean mo6704b(Class cls) {
        switch (this.f13418a) {
            case 0:
                return fi0.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
