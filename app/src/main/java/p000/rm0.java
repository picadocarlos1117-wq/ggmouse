package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes3.dex */
public final class rm0 {

    /* JADX INFO: renamed from: a */
    public final Object f10074a;

    /* JADX INFO: renamed from: b */
    public final Object f10075b;

    /* JADX INFO: renamed from: c */
    public final Object f10076c;

    public rm0(Object obj, Object obj2, Object obj3) {
        this.f10074a = obj;
        this.f10075b = obj2;
        this.f10076c = obj3;
    }

    /* JADX INFO: renamed from: a */
    public final IllegalArgumentException m5861a() {
        StringBuilder sb = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f10074a;
        sb.append(obj);
        sb.append("=");
        sb.append(this.f10075b);
        sb.append(" and ");
        sb.append(obj);
        sb.append("=");
        sb.append(this.f10076c);
        return new IllegalArgumentException(sb.toString());
    }
}
