package p000;

import android.os.Build;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class ya2 {

    /* JADX INFO: renamed from: b */
    public static final bb2 f12920b;

    /* JADX INFO: renamed from: a */
    public final bb2 f12921a;

    static {
        ra2 pa2Var;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            pa2Var = new qa2();
        } else {
            pa2Var = i >= 29 ? new pa2() : new oa2();
        }
        f12920b = pa2Var.mo4787b().f1285a.mo6480a().f1285a.mo6259b().f1285a.mo6260c();
    }

    public ya2(bb2 bb2Var) {
        this.f12921a = bb2Var;
    }

    /* JADX INFO: renamed from: a */
    public bb2 mo6480a() {
        return this.f12921a;
    }

    /* JADX INFO: renamed from: b */
    public bb2 mo6259b() {
        return this.f12921a;
    }

    /* JADX INFO: renamed from: c */
    public bb2 mo6260c() {
        return this.f12921a;
    }

    /* JADX INFO: renamed from: e */
    public v20 mo6481e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ya2)) {
            return false;
        }
        ya2 ya2Var = (ya2) obj;
        return mo6021n() == ya2Var.mo6021n() && mo6262m() == ya2Var.mo6262m() && i91.m3395a(mo6019j(), ya2Var.mo6019j()) && i91.m3395a(mo6261h(), ya2Var.mo6261h()) && i91.m3395a(mo6481e(), ya2Var.mo6481e());
    }

    /* JADX INFO: renamed from: f */
    public un0 mo6018f(int i) {
        return un0.f11367e;
    }

    /* JADX INFO: renamed from: g */
    public un0 mo6737g() {
        return mo6019j();
    }

    /* JADX INFO: renamed from: h */
    public un0 mo6261h() {
        return un0.f11367e;
    }

    public int hashCode() {
        return i91.m3396b(Boolean.valueOf(mo6021n()), Boolean.valueOf(mo6262m()), mo6019j(), mo6261h(), mo6481e());
    }

    /* JADX INFO: renamed from: i */
    public un0 mo6738i() {
        return mo6019j();
    }

    /* JADX INFO: renamed from: j */
    public un0 mo6019j() {
        return un0.f11367e;
    }

    /* JADX INFO: renamed from: k */
    public un0 mo6739k() {
        return mo6019j();
    }

    /* JADX INFO: renamed from: l */
    public bb2 mo6020l(int i, int i2, int i3, int i4) {
        return f12920b;
    }

    /* JADX INFO: renamed from: m */
    public boolean mo6262m() {
        return false;
    }

    /* JADX INFO: renamed from: n */
    public boolean mo6021n() {
        return false;
    }

    /* JADX INFO: renamed from: d */
    public void mo6017d(View view) {
    }

    /* JADX INFO: renamed from: o */
    public void mo6022o(un0[] un0VarArr) {
    }

    /* JADX INFO: renamed from: p */
    public void mo6023p(bb2 bb2Var) {
    }

    /* JADX INFO: renamed from: q */
    public void mo6263q(un0 un0Var) {
    }
}
