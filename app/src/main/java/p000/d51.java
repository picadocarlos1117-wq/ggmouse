package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class d51 extends g51 {

    /* JADX INFO: renamed from: e */
    public final e51 f2800e;

    public d51(String str, e51 e51Var) {
        super(false, str, e51Var);
        if (str.endsWith("-bin")) {
            f40.m2713i(p32.m5153T("ASCII header is named %s.  Only binary headers may end with %s", str, "-bin"));
            throw null;
        }
        p32.m5188s(e51Var, "marshaller");
        this.f2800e = e51Var;
    }

    @Override // p000.g51
    /* JADX INFO: renamed from: a */
    public final Object mo2224a(byte[] bArr) {
        return this.f2800e.mo2505j(new String(bArr, AbstractC0646fn.f3855a));
    }

    @Override // p000.g51
    /* JADX INFO: renamed from: b */
    public final byte[] mo2225b(Object obj) {
        String strMo2504c = this.f2800e.mo2504c(obj);
        p32.m5188s(strMo2504c, "null marshaller.toAsciiString()");
        return strMo2504c.getBytes(AbstractC0646fn.f3855a);
    }
}
