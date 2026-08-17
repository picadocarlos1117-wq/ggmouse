package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class t60 {

    /* JADX INFO: renamed from: a */
    public final String f10767a;

    public t60(String str) {
        if (str != null) {
            this.f10767a = str;
        } else {
            l41.m4051t("name is null");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t60)) {
            return false;
        }
        return this.f10767a.equals(((t60) obj).f10767a);
    }

    public final int hashCode() {
        return this.f10767a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return AbstractC1308pu.m5342i(new StringBuilder("Encoding{name=\""), this.f10767a, "\"}");
    }
}
