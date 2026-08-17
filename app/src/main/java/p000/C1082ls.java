package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: ls */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1082ls {

    /* JADX INFO: renamed from: b */
    public int f6499b;

    /* JADX INFO: renamed from: c */
    public boolean f6500c;

    /* JADX INFO: renamed from: d */
    public final C1639ys f6501d;

    /* JADX INFO: renamed from: e */
    public final int f6502e;

    /* JADX INFO: renamed from: f */
    public C1082ls f6503f;

    /* JADX INFO: renamed from: i */
    public au1 f6506i;

    /* JADX INFO: renamed from: a */
    public HashSet f6498a = null;

    /* JADX INFO: renamed from: g */
    public int f6504g = 0;

    /* JADX INFO: renamed from: h */
    public int f6505h = Integer.MIN_VALUE;

    public C1082ls(C1639ys c1639ys, int i) {
        this.f6501d = c1639ys;
        this.f6502e = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m4273a(C1082ls c1082ls, int i) {
        m4274b(c1082ls, i, Integer.MIN_VALUE, false);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m4274b(C1082ls c1082ls, int i, int i2, boolean z) {
        if (c1082ls == null) {
            m4282j();
            return true;
        }
        if (!z && !m4281i(c1082ls)) {
            return false;
        }
        this.f6503f = c1082ls;
        if (c1082ls.f6498a == null) {
            c1082ls.f6498a = new HashSet();
        }
        HashSet hashSet = this.f6503f.f6498a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f6504g = i;
        this.f6505h = i2;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m4275c(int i, q92 q92Var, ArrayList arrayList) {
        HashSet hashSet = this.f6498a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                rc2.m5764F(((C1082ls) it.next()).f6501d, i, arrayList, q92Var);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m4276d() {
        if (this.f6500c) {
            return this.f6499b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public final int m4277e() {
        C1082ls c1082ls;
        if (this.f6501d.f13097g0 == 8) {
            return 0;
        }
        int i = this.f6505h;
        return (i == Integer.MIN_VALUE || (c1082ls = this.f6503f) == null || c1082ls.f6501d.f13097g0 != 8) ? this.f6504g : i;
    }

    /* JADX INFO: renamed from: f */
    public final C1082ls m4278f() {
        int i = this.f6502e;
        int iM5359z = AbstractC1308pu.m5359z(i);
        C1639ys c1639ys = this.f6501d;
        switch (iM5359z) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return c1639ys.f13068K;
            case 2:
                return c1639ys.f13069L;
            case 3:
                return c1639ys.f13066I;
            case 4:
                return c1639ys.f13067J;
            default:
                f40.m2711g(AbstractC1308pu.m5358y(i));
                return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m4279g() {
        HashSet hashSet = this.f6498a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C1082ls) it.next()).m4278f().m4280h()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m4280h() {
        return this.f6503f != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:46:0x0061 A[RETURN] */
    /* JADX INFO: renamed from: i */
    public final boolean m4281i(C1082ls c1082ls) {
        if (c1082ls != null) {
            C1639ys c1639ys = c1082ls.f6501d;
            int i = c1082ls.f6502e;
            int i2 = this.f6502e;
            if (i != i2) {
                switch (AbstractC1308pu.m5359z(i2)) {
                    case 0:
                    case 7:
                    case 8:
                        break;
                    case 1:
                    case 3:
                        boolean z = i == 2 || i == 4;
                        if (!(c1639ys instanceof xi0)) {
                            return z;
                        }
                        if (z || i == 8) {
                            return true;
                        }
                        break;
                    case 2:
                    case 4:
                        boolean z2 = i == 3 || i == 5;
                        if (!(c1639ys instanceof xi0)) {
                            return z2;
                        }
                        if (z2 || i == 9) {
                            return true;
                        }
                        break;
                    case 5:
                        if (i != 2 && i != 4) {
                            return true;
                        }
                        break;
                    case 6:
                        if (i != 6 && i != 8 && i != 9) {
                            return true;
                        }
                        break;
                    default:
                        f40.m2711g(AbstractC1308pu.m5358y(i2));
                        return false;
                }
            } else if (i2 != 6 || (c1639ys.f13062E && this.f6501d.f13062E)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final void m4282j() {
        HashSet hashSet;
        C1082ls c1082ls = this.f6503f;
        if (c1082ls != null && (hashSet = c1082ls.f6498a) != null) {
            hashSet.remove(this);
            if (this.f6503f.f6498a.size() == 0) {
                this.f6503f.f6498a = null;
            }
        }
        this.f6498a = null;
        this.f6503f = null;
        this.f6504g = 0;
        this.f6505h = Integer.MIN_VALUE;
        this.f6500c = false;
        this.f6499b = 0;
    }

    /* JADX INFO: renamed from: k */
    public final void m4283k() {
        au1 au1Var = this.f6506i;
        if (au1Var == null) {
            this.f6506i = new au1(1);
        } else {
            au1Var.m718c();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m4284l(int i) {
        this.f6499b = i;
        this.f6500c = true;
    }

    public final String toString() {
        return this.f6501d.f13099h0 + ":" + AbstractC1308pu.m5358y(this.f6502e);
    }
}
