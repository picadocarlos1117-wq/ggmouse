package p000;

/* JADX INFO: renamed from: ic */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0746ic {

    /* JADX INFO: renamed from: d */
    public static final C0746ic f4929d = new C0709hc().m3125a();

    /* JADX INFO: renamed from: a */
    public final boolean f4930a;

    /* JADX INFO: renamed from: b */
    public final boolean f4931b;

    /* JADX INFO: renamed from: c */
    public final boolean f4932c;

    public C0746ic(C0709hc c0709hc) {
        this.f4930a = c0709hc.f4519a;
        this.f4931b = c0709hc.f4520b;
        this.f4932c = c0709hc.f4521c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0746ic.class != obj.getClass()) {
            return false;
        }
        C0746ic c0746ic = (C0746ic) obj;
        return this.f4930a == c0746ic.f4930a && this.f4931b == c0746ic.f4931b && this.f4932c == c0746ic.f4932c;
    }

    public final int hashCode() {
        return ((this.f4930a ? 1 : 0) << 2) + ((this.f4931b ? 1 : 0) << 1) + (this.f4932c ? 1 : 0);
    }
}
