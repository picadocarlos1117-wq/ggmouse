package p000;

import java.util.HashMap;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class e00 {

    /* JADX INFO: renamed from: h */
    public static final c00 f3090h = new c00(0);

    /* JADX INFO: renamed from: i */
    public static final Random f3091i = new Random();

    /* JADX INFO: renamed from: d */
    public h21 f3095d;

    /* JADX INFO: renamed from: f */
    public String f3097f;

    /* JADX INFO: renamed from: a */
    public final s02 f3092a = new s02();

    /* JADX INFO: renamed from: b */
    public final r02 f3093b = new r02();

    /* JADX INFO: renamed from: c */
    public final HashMap f3094c = new HashMap();

    /* JADX INFO: renamed from: e */
    public t02 f3096e = t02.f10690a;

    /* JADX INFO: renamed from: g */
    public long f3098g = -1;

    /* JADX INFO: renamed from: a */
    public final void m2437a(d00 d00Var) {
        long j = d00Var.f2695c;
        if (j != -1) {
            this.f3098g = j;
        }
        this.f3097f = null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    /* JADX WARN: Code duplicated, block: B:54:0x009b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public final d00 m2438b(int i, q21 q21Var) {
        long j;
        long j2;
        long j3;
        HashMap map = this.f3094c;
        d00 d00Var = null;
        long j4 = Long.MAX_VALUE;
        for (d00 d00Var2 : map.values()) {
            long j5 = d00Var2.f2695c;
            q21 q21Var2 = d00Var2.f2696d;
            if (j5 == -1 && i == d00Var2.f2694b && q21Var != null) {
                long j6 = q21Var.f9312d;
                e00 e00Var = d00Var2.f2699g;
                j = -1;
                d00 d00Var3 = (d00) e00Var.f3094c.get(e00Var.f3097f);
                if (d00Var3 != null) {
                    j3 = d00Var3.f2695c;
                    if (j3 == -1) {
                        j3 = e00Var.f3098g + 1;
                    }
                } else {
                    j3 = e00Var.f3098g + 1;
                }
                if (j6 >= j3) {
                    d00Var2.f2695c = j6;
                }
            } else {
                j = -1;
            }
            if (q21Var != null) {
                long j7 = q21Var.f9312d;
                if (q21Var2 == null) {
                    if (!q21Var.m5438b() && j7 == d00Var2.f2695c) {
                        j2 = d00Var2.f2695c;
                        if (j2 != j) {
                        }
                        d00Var = d00Var2;
                        j4 = j2;
                    }
                } else if (j7 == q21Var2.f9312d && q21Var.f9310b == q21Var2.f9310b && q21Var.f9311c == q21Var2.f9311c) {
                    j2 = d00Var2.f2695c;
                    if (j2 != j) {
                    }
                    d00Var = d00Var2;
                    j4 = j2;
                }
            } else if (i == d00Var2.f2694b) {
                j2 = d00Var2.f2695c;
                if (j2 != j || j2 < j4) {
                    d00Var = d00Var2;
                    j4 = j2;
                } else if (j2 == j4) {
                    int i2 = z42.f13274a;
                    if (d00Var.f2696d != null && q21Var2 != null) {
                        d00Var = d00Var2;
                    }
                }
            }
        }
        if (d00Var != null) {
            return d00Var;
        }
        String str = (String) f3090h.get();
        d00 d00Var4 = new d00(this, str, i, q21Var);
        map.put(str, d00Var4);
        return d00Var4;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized String m2439c(t02 t02Var, q21 q21Var) {
        return m2438b(t02Var.mo2973g(q21Var.f9309a, this.f3093b).f9651c, q21Var).f2693a;
    }

    /* JADX INFO: renamed from: d */
    public final void m2440d(C1542w5 c1542w5) {
        q21 q21Var;
        t02 t02Var = c1542w5.f11971b;
        int i = c1542w5.f11972c;
        q21 q21Var2 = c1542w5.f11973d;
        boolean zM6176p = t02Var.m6176p();
        String str = this.f3097f;
        HashMap map = this.f3094c;
        if (zM6176p) {
            if (str != null) {
                d00 d00Var = (d00) map.get(str);
                d00Var.getClass();
                m2437a(d00Var);
                return;
            }
            return;
        }
        d00 d00Var2 = (d00) map.get(str);
        this.f3097f = m2438b(i, q21Var2).f2693a;
        m2441e(c1542w5);
        if (q21Var2 != null) {
            long j = q21Var2.f9312d;
            if (q21Var2.m5438b()) {
                if (d00Var2 != null && d00Var2.f2695c == j && (q21Var = d00Var2.f2696d) != null && q21Var.f9310b == q21Var2.f9310b && q21Var.f9311c == q21Var2.f9311c) {
                    return;
                }
                m2438b(i, new q21(j, q21Var2.f9309a));
                this.f3095d.getClass();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002b A[Catch: all -> 0x0050, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0010, B:9:0x0014, B:11:0x0024, B:20:0x0036, B:22:0x0042, B:24:0x0048, B:14:0x002b, B:30:0x0053, B:32:0x005f, B:33:0x0063, B:35:0x0068, B:37:0x006e, B:39:0x0085, B:40:0x00b2, B:42:0x00b6, B:43:0x00bd, B:45:0x00c7, B:47:0x00cb, B:49:0x00d8, B:52:0x00df), top: B:57:0x0001 }] */
    /* JADX INFO: renamed from: e */
    public final synchronized void m2441e(C1542w5 c1542w5) {
        long j;
        this.f3095d.getClass();
        if (c1542w5.f11971b.m6176p()) {
            return;
        }
        q21 q21Var = c1542w5.f11973d;
        if (q21Var != null) {
            long j2 = q21Var.f9312d;
            d00 d00Var = (d00) this.f3094c.get(this.f3097f);
            if (d00Var != null) {
                j = d00Var.f2695c;
                if (j == -1) {
                    j = this.f3098g + 1;
                }
            } else {
                j = this.f3098g + 1;
            }
            if (j2 < j) {
                return;
            }
            d00 d00Var2 = (d00) this.f3094c.get(this.f3097f);
            if (d00Var2 != null && d00Var2.f2695c == -1 && d00Var2.f2694b != c1542w5.f11972c) {
                return;
            }
        }
        d00 d00VarM2438b = m2438b(c1542w5.f11972c, c1542w5.f11973d);
        if (this.f3097f == null) {
            this.f3097f = d00VarM2438b.f2693a;
        }
        q21 q21Var2 = c1542w5.f11973d;
        if (q21Var2 != null && q21Var2.m5438b()) {
            q21 q21Var3 = c1542w5.f11973d;
            d00 d00VarM2438b2 = m2438b(c1542w5.f11972c, new q21(q21Var3.f9309a, q21Var3.f9310b, q21Var3.f9312d));
            if (!d00VarM2438b2.f2697e) {
                d00VarM2438b2.f2697e = true;
                c1542w5.f11971b.mo2973g(c1542w5.f11973d.f9309a, this.f3093b);
                this.f3093b.m5647d(c1542w5.f11973d.f9310b);
                Math.max(0L, z42.m7226N(0L) + z42.m7226N(this.f3093b.f9653e));
                this.f3095d.getClass();
            }
        }
        if (!d00VarM2438b.f2697e) {
            d00VarM2438b.f2697e = true;
            this.f3095d.getClass();
        }
        if (d00VarM2438b.f2693a.equals(this.f3097f) && !d00VarM2438b.f2698f) {
            d00VarM2438b.f2698f = true;
            h21 h21Var = this.f3095d;
            String str = d00VarM2438b.f2693a;
            h21Var.getClass();
            q21 q21Var4 = c1542w5.f11973d;
            if (q21Var4 == null || !q21Var4.m5438b()) {
                h21Var.m3091b();
                h21Var.f4405i = str;
                h21Var.f4406j = f21.m2681g().setPlayerName("AndroidXMedia3").setPlayerVersion("1.5.1");
                h21Var.m3092c(c1542w5.f11971b, c1542w5.f11973d);
            }
        }
    }
}
