package p000;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class z11 {

    /* JADX INFO: renamed from: a */
    public final String f13230a;

    /* JADX INFO: renamed from: b */
    public final w11 f13231b;

    /* JADX INFO: renamed from: c */
    public final v11 f13232c;

    /* JADX INFO: renamed from: d */
    public final d21 f13233d;

    /* JADX INFO: renamed from: e */
    public final t11 f13234e;

    /* JADX INFO: renamed from: f */
    public final x11 f13235f;

    static {
        bb0 bb0Var = new bb0();
        om0 om0Var = qm0.f9540b;
        kk1 kk1Var = kk1.f5896e;
        List list = Collections.EMPTY_LIST;
        kk1 kk1Var2 = kk1.f5896e;
        u11 u11Var = new u11();
        x11 x11Var = x11.f12412a;
        bb0Var.m957a();
        u11Var.m6371a();
        d21 d21Var = d21.f2726B;
        AbstractC1308pu.m5349p(0, 1, 2, 3, 4);
        z42.m7252z(5);
    }

    public z11(String str, t11 t11Var, w11 w11Var, v11 v11Var, d21 d21Var, x11 x11Var) {
        this.f13230a = str;
        this.f13231b = w11Var;
        this.f13232c = v11Var;
        this.f13233d = d21Var;
        this.f13234e = t11Var;
        this.f13235f = x11Var;
    }

    /* JADX INFO: renamed from: a */
    public static z11 m7183a(String str) {
        bb0 bb0Var = new bb0();
        om0 om0Var = qm0.f9540b;
        kk1 kk1Var = kk1.f5896e;
        List list = Collections.EMPTY_LIST;
        kk1 kk1Var2 = kk1.f5896e;
        u11 u11Var = new u11();
        x11 x11Var = x11.f12412a;
        Uri uri = str == null ? null : Uri.parse(str);
        return new z11("", new t11(bb0Var), uri != null ? new w11(uri, null, null, list, kk1Var2, -9223372036854775807L) : null, new v11(u11Var), d21.f2726B, x11Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z11)) {
            return false;
        }
        z11 z11Var = (z11) obj;
        String str = z11Var.f13230a;
        int i = z42.f13274a;
        return Objects.equals(this.f13230a, str) && this.f13234e.equals(z11Var.f13234e) && Objects.equals(this.f13231b, z11Var.f13231b) && this.f13232c.equals(z11Var.f13232c) && Objects.equals(this.f13233d, z11Var.f13233d) && Objects.equals(this.f13235f, z11Var.f13235f);
    }

    public final int hashCode() {
        int iHashCode = this.f13230a.hashCode() * 31;
        w11 w11Var = this.f13231b;
        int iHashCode2 = (this.f13233d.hashCode() + ((this.f13234e.hashCode() + ((this.f13232c.hashCode() + ((iHashCode + (w11Var != null ? w11Var.hashCode() : 0)) * 31)) * 31)) * 31)) * 31;
        this.f13235f.getClass();
        return iHashCode2;
    }
}
