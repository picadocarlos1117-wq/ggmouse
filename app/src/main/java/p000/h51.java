package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class h51 extends g51 {

    /* JADX INFO: renamed from: e */
    public final i51 f4453e;

    public h51(String str, boolean z, i51 i51Var) {
        super(z, str, i51Var);
        if (str.endsWith("-bin")) {
            f40.m2713i(p32.m5153T("ASCII header is named %s.  Only binary headers may end with %s", str, "-bin"));
            throw null;
        }
        this.f4453e = i51Var;
    }

    @Override // p000.g51
    /* JADX INFO: renamed from: a */
    public final Object mo2224a(byte[] bArr) {
        return this.f4453e.mo747j(bArr);
    }

    @Override // p000.g51
    /* JADX INFO: renamed from: b */
    public final byte[] mo2225b(Object obj) {
        byte[] bArrMo740c = this.f4453e.mo740c(obj);
        p32.m5188s(bArrMo740c, "null marshaller.toAsciiString()");
        return bArrMo740c;
    }
}
