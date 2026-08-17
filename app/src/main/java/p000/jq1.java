package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class jq1 {

    /* JADX INFO: renamed from: a */
    public final mq1 f5494a;

    /* JADX INFO: renamed from: b */
    public final mq1 f5495b;

    public jq1(mq1 mq1Var, mq1 mq1Var2) {
        this.f5494a = mq1Var;
        this.f5495b = mq1Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jq1.class == obj.getClass()) {
            jq1 jq1Var = (jq1) obj;
            if (this.f5494a.equals(jq1Var.f5494a) && this.f5495b.equals(jq1Var.f5495b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f5495b.hashCode() + (this.f5494a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[");
        mq1 mq1Var = this.f5494a;
        sb.append(mq1Var);
        mq1 mq1Var2 = this.f5495b;
        if (mq1Var.equals(mq1Var2)) {
            str = "";
        } else {
            str = ", " + mq1Var2;
        }
        return AbstractC1308pu.m5342i(sb, str, "]");
    }
}
