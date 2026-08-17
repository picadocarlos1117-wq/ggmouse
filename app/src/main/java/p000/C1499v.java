package p000;

/* JADX INFO: renamed from: v */
/* JADX INFO: loaded from: classes3.dex */
public final class C1499v extends IllegalStateException {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f11463a;

    /* JADX INFO: renamed from: b */
    public Exception f11464b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1499v(String str, Exception exc, int i) {
        super(str);
        this.f11463a = i;
        this.f11464b = exc;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        switch (this.f11463a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f11464b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1499v(String str, int i) {
        super(str);
        this.f11463a = i;
    }
}
