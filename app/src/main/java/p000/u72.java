package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public interface u72 {
    /* JADX INFO: renamed from: a */
    default r72 mo738a(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    /* JADX INFO: renamed from: e */
    default r72 mo742e(Class cls, a71 a71Var) {
        return mo738a(cls);
    }

    /* JADX INFO: renamed from: h */
    default r72 mo745h(C1412sn c1412sn, a71 a71Var) {
        Class clsMo5862a = c1412sn.mo5862a();
        clsMo5862a.getClass();
        return mo742e(clsMo5862a, a71Var);
    }
}
