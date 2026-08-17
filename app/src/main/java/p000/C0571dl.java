package p000;

/* JADX INFO: renamed from: dl */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0571dl {

    /* JADX INFO: renamed from: a */
    public Object f2959a;

    /* JADX INFO: renamed from: b */
    public C0644fl f2960b;

    /* JADX INFO: renamed from: c */
    public hl1 f2961c;

    /* JADX INFO: renamed from: d */
    public boolean f2962d;

    public final void finalize() {
        hl1 hl1Var;
        C0644fl c0644fl = this.f2960b;
        if (c0644fl != null) {
            C0607el c0607el = c0644fl.f3845b;
            if (!c0607el.isDone()) {
                c0607el.setException(new C1464u1("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f2959a, 1));
            }
        }
        if (this.f2962d || (hl1Var = this.f2961c) == null) {
            return;
        }
        hl1Var.set(null);
    }
}
