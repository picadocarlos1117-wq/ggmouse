package p000;

import android.content.Context;

/* JADX INFO: renamed from: vd */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1513vd extends AbstractC1604xu {

    /* JADX INFO: renamed from: a */
    public final Context f11633a;

    /* JADX INFO: renamed from: b */
    public final ax0 f11634b;

    /* JADX INFO: renamed from: c */
    public final ax0 f11635c;

    /* JADX INFO: renamed from: d */
    public final String f11636d;

    public C1513vd(Context context, ax0 ax0Var, ax0 ax0Var2, String str) {
        if (context == null) {
            l41.m4051t("Null applicationContext");
            throw null;
        }
        this.f11633a = context;
        if (ax0Var == null) {
            l41.m4051t("Null wallClock");
            throw null;
        }
        this.f11634b = ax0Var;
        if (ax0Var2 == null) {
            l41.m4051t("Null monotonicClock");
            throw null;
        }
        this.f11635c = ax0Var2;
        if (str != null) {
            this.f11636d = str;
        } else {
            l41.m4051t("Null backendName");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1604xu) {
            C1513vd c1513vd = (C1513vd) ((AbstractC1604xu) obj);
            if (this.f11633a.equals(c1513vd.f11633a) && this.f11634b.equals(c1513vd.f11634b) && this.f11635c.equals(c1513vd.f11635c) && this.f11636d.equals(c1513vd.f11636d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f11636d.hashCode() ^ ((((((this.f11633a.hashCode() ^ 1000003) * 1000003) ^ this.f11634b.hashCode()) * 1000003) ^ this.f11635c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.f11633a);
        sb.append(", wallClock=");
        sb.append(this.f11634b);
        sb.append(", monotonicClock=");
        sb.append(this.f11635c);
        sb.append(", backendName=");
        return AbstractC1308pu.m5342i(sb, this.f11636d, "}");
    }
}
