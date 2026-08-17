package p000;

import java.text.MessageFormat;
import java.util.logging.Level;

/* JADX INFO: renamed from: rm */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1374rm extends AbstractC1337qm {

    /* JADX INFO: renamed from: h */
    public final C1485um f10072h;

    /* JADX INFO: renamed from: i */
    public final bz1 f10073i;

    public C1374rm(C1485um c1485um, bz1 bz1Var) {
        this.f10072h = c1485um;
        p32.m5188s(bz1Var, "time");
        this.f10073i = bz1Var;
    }

    /* JADX INFO: renamed from: o0 */
    public static Level m5859o0(int i) {
        int iM5359z = AbstractC1308pu.m5359z(i);
        if (iM5359z != 1) {
            return (iM5359z == 2 || iM5359z == 3) ? Level.FINE : Level.FINEST;
        }
        return Level.FINER;
    }

    @Override // p000.AbstractC1337qm
    /* JADX INFO: renamed from: G */
    public final void mo2841G(int i, String str) {
        oo0 oo0Var;
        C1485um c1485um = this.f10072h;
        vo0 vo0Var = c1485um.f11359b;
        Level levelM5859o0 = m5859o0(i);
        if (C1485um.f11357c.isLoggable(levelM5859o0)) {
            C1485um.m6509a(vo0Var, levelM5859o0, str);
        }
        if (!m5860n0(i) || i == 1) {
            return;
        }
        int iM5359z = AbstractC1308pu.m5359z(i);
        if (iM5359z != 2) {
            oo0Var = iM5359z != 3 ? oo0.f8409a : oo0.f8411c;
        } else {
            oo0Var = oo0.f8410b;
        }
        oo0 oo0Var2 = oo0Var;
        long jM1083f = this.f10073i.m1083f();
        p32.m5188s(str, "description");
        new po0(str, oo0Var2, jM1083f, null);
        synchronized (c1485um.f11358a) {
        }
    }

    @Override // p000.AbstractC1337qm
    /* JADX INFO: renamed from: H */
    public final void mo2842H(int i, String str, Object... objArr) {
        mo2841G(i, (m5860n0(i) || C1485um.f11357c.isLoggable(m5859o0(i))) ? MessageFormat.format(str, objArr) : null);
    }

    /* JADX INFO: renamed from: n0 */
    public final boolean m5860n0(int i) {
        if (i == 1) {
            return false;
        }
        synchronized (this.f10072h.f11358a) {
        }
        return false;
    }
}
