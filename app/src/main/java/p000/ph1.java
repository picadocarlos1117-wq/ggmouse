package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public enum ph1 {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");


    /* JADX INFO: renamed from: a */
    public final String f8900a;

    ph1(String str) {
        this.f8900a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f8900a;
    }
}
