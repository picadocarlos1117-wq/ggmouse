package p000;

import android.net.Uri;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class w11 {

    /* JADX INFO: renamed from: a */
    public final Uri f11899a;

    /* JADX INFO: renamed from: b */
    public final String f11900b;

    /* JADX INFO: renamed from: c */
    public final List f11901c;

    /* JADX INFO: renamed from: d */
    public final qm0 f11902d;

    /* JADX INFO: renamed from: e */
    public final long f11903e;

    static {
        AbstractC1308pu.m5349p(0, 1, 2, 3, 4);
        z42.m7252z(5);
        z42.m7252z(6);
        z42.m7252z(7);
    }

    public w11(Uri uri, String str, hp0 hp0Var, List list, qm0 qm0Var, long j) {
        this.f11899a = uri;
        this.f11900b = v51.m6582l(str);
        this.f11901c = list;
        this.f11902d = qm0Var;
        nm0 nm0VarM5566m = qm0.m5566m();
        for (int i = 0; i < qm0Var.size(); i++) {
            ((y11) qm0Var.get(i)).getClass();
            nm0VarM5566m.m3901a(new y11());
        }
        nm0VarM5566m.m4561g();
        this.f11903e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w11)) {
            return false;
        }
        w11 w11Var = (w11) obj;
        return this.f11899a.equals(w11Var.f11899a) && Objects.equals(this.f11900b, w11Var.f11900b) && Objects.equals(null, null) && this.f11901c.equals(w11Var.f11901c) && this.f11902d.equals(w11Var.f11902d) && Long.valueOf(this.f11903e).equals(Long.valueOf(w11Var.f11903e));
    }

    public final int hashCode() {
        int iHashCode = this.f11899a.hashCode() * 31;
        String str = this.f11900b;
        return (int) ((((long) ((this.f11902d.hashCode() + ((this.f11901c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 29791)) * 961)) * 31)) * 31) + this.f11903e);
    }
}
