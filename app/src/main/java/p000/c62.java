package p000;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.SystemClock;
import com.example.ssmousepro.injection.TouchPipeline;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class c62 {

    /* JADX INFO: renamed from: a */
    public final p11 f1687a;

    /* JADX INFO: renamed from: b */
    public final f62 f1688b;

    /* JADX INFO: renamed from: c */
    public boolean f1689c;

    /* JADX INFO: renamed from: f */
    public long f1692f;

    /* JADX INFO: renamed from: i */
    public boolean f1695i;

    /* JADX INFO: renamed from: d */
    public int f1690d = 0;

    /* JADX INFO: renamed from: e */
    public long f1691e = -9223372036854775807L;

    /* JADX INFO: renamed from: g */
    public long f1693g = -9223372036854775807L;

    /* JADX INFO: renamed from: h */
    public long f1694h = -9223372036854775807L;

    /* JADX INFO: renamed from: j */
    public float f1696j = 1.0f;

    /* JADX INFO: renamed from: k */
    public xy1 f1697k = xy1.f12780a;

    public c62(Context context, p11 p11Var) {
        this.f1687a = p11Var;
        this.f1688b = new f62(context);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:67:0x012c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:68:0x012d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1, types: [int] */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX INFO: renamed from: a */
    public final int m1140a(long j, long j2, long j3, long j4, boolean z, b62 b62Var) {
        long j5;
        long j6;
        boolean z2;
        boolean z3;
        int i;
        int i2;
        Object r20;
        long j7;
        long j8;
        int i3;
        b62Var.f1229a = -9223372036854775807L;
        b62Var.f1230b = -9223372036854775807L;
        if (this.f1691e == -9223372036854775807L) {
            this.f1691e = j2;
        }
        if (this.f1693g != j) {
            f62 f62Var = this.f1688b;
            j5 = 1000;
            long j9 = f62Var.f3640n;
            if (j9 != -1) {
                f62Var.f3642p = j9;
                f62Var.f3643q = f62Var.f3641o;
            }
            f62Var.f3639m++;
            xa0 xa0Var = f62Var.f3627a;
            long j10 = j * 1000;
            xa0Var.f12507a.m6735b(j10);
            if (xa0Var.f12507a.m6734a()) {
                xa0Var.f12509c = false;
            } else {
                if (xa0Var.f12510d != -9223372036854775807L) {
                    if (xa0Var.f12509c) {
                        wa0 wa0Var = xa0Var.f12508b;
                        j6 = 0;
                        long j11 = wa0Var.f12037d;
                        if (j11 == 0 ? false : wa0Var.f12040g[(int) ((j11 - 1) % 15)]) {
                        }
                        xa0Var.f12509c = true;
                        xa0Var.f12508b.m6735b(j10);
                    } else {
                        j6 = 0;
                    }
                    xa0Var.f12508b.m6736c();
                    xa0Var.f12508b.m6735b(xa0Var.f12510d);
                    xa0Var.f12509c = true;
                    xa0Var.f12508b.m6735b(j10);
                }
                if (xa0Var.f12509c && xa0Var.f12508b.m6734a()) {
                    wa0 wa0Var2 = xa0Var.f12507a;
                    xa0Var.f12507a = xa0Var.f12508b;
                    xa0Var.f12508b = wa0Var2;
                    xa0Var.f12509c = false;
                }
                xa0Var.f12510d = j10;
                if (xa0Var.f12507a.m6734a()) {
                    i3 = 0;
                } else {
                    i3 = xa0Var.f12511e + 1;
                }
                xa0Var.f12511e = i3;
                f62Var.m2729c();
                this.f1693g = j;
            }
            j6 = 0;
            if (xa0Var.f12509c) {
                wa0 wa0Var3 = xa0Var.f12507a;
                xa0Var.f12507a = xa0Var.f12508b;
                xa0Var.f12508b = wa0Var3;
                xa0Var.f12509c = false;
            }
            xa0Var.f12510d = j10;
            if (xa0Var.f12507a.m6734a()) {
                i3 = 0;
            } else {
                i3 = xa0Var.f12511e + 1;
            }
            xa0Var.f12511e = i3;
            f62Var.m2729c();
            this.f1693g = j;
        } else {
            j5 = 1000;
            j6 = 0;
        }
        long jM7216D = (long) ((j - j2) / ((double) this.f1696j));
        if (this.f1689c) {
            this.f1697k.getClass();
            jM7216D -= z42.m7216D(SystemClock.elapsedRealtime()) - j3;
        }
        b62Var.f1229a = jM7216D;
        if (this.f1694h == -9223372036854775807L || this.f1695i) {
            int i4 = this.f1690d;
            if (i4 != 0) {
                if (i4 == 1) {
                    z2 = true;
                } else if (i4 == 2) {
                    z2 = true;
                    if (j2 >= j4) {
                    }
                } else {
                    if (i4 != 3) {
                        l41.m4046o();
                        return 0;
                    }
                    this.f1697k.getClass();
                    z2 = true;
                    long jM7216D2 = z42.m7216D(SystemClock.elapsedRealtime()) - this.f1692f;
                    if (!this.f1689c || jM7216D >= -30000 || jM7216D2 <= 100000) {
                    }
                }
                z3 = z2;
            } else {
                z2 = true;
                z3 = this.f1689c;
            }
            if (z3) {
                return 0;
            }
            if (!this.f1689c && j2 != this.f1691e) {
                this.f1697k.getClass();
                long jNanoTime = System.nanoTime();
                f62 f62Var2 = this.f1688b;
                long j12 = (b62Var.f1229a * j5) + jNanoTime;
                if (f62Var2.f3642p == r11 || !f62Var2.f3627a.f12507a.m6734a()) {
                    i = 3;
                    i2 = 2;
                    r20 = z2;
                } else {
                    xa0 xa0Var2 = f62Var2.f3627a;
                    if (xa0Var2.f12507a.m6734a()) {
                        wa0 wa0Var4 = xa0Var2.f12507a;
                        long j13 = wa0Var4.f12038e;
                        i = 3;
                        i2 = 2;
                        j8 = j13 == j6 ? j6 : wa0Var4.f12039f / j13;
                    } else {
                        i = 3;
                        i2 = 2;
                        j8 = -9223372036854775807L;
                    }
                    boolean z4 = z2;
                    long j14 = f62Var2.f3643q + ((long) (((f62Var2.f3639m - f62Var2.f3642p) * j8) / f62Var2.f3635i));
                    if (Math.abs(j12 - j14) <= 20000000) {
                        j12 = j14;
                        r20 = z4;
                    } else {
                        f62Var2.f3639m = j6;
                        f62Var2.f3642p = -1L;
                        f62Var2.f3640n = -1L;
                        r20 = z4;
                    }
                }
                f62Var2.f3640n = f62Var2.f3639m;
                f62Var2.f3641o = j12;
                e62 e62Var = f62Var2.f3629c;
                if (e62Var != null && f62Var2.f3637k != -9223372036854775807L) {
                    long j15 = e62Var.f3221a;
                    if (j15 != -9223372036854775807L) {
                        long j16 = f62Var2.f3637k;
                        long j17 = (((j12 - j15) / j16) * j16) + j15;
                        if (j12 <= j17) {
                            j7 = j17 - j16;
                        } else {
                            j7 = j17;
                            j17 = j16 + j17;
                        }
                        if (j17 - j12 >= j12 - j7) {
                            j17 = j7;
                        }
                        j12 = j17 - f62Var2.f3638l;
                    }
                }
                b62Var.f1230b = j12;
                long j18 = (j12 - jNanoTime) / j5;
                b62Var.f1229a = j18;
                Object r1 = (this.f1694h == -9223372036854775807L || this.f1695i) ? 0 : r20;
                p11 p11Var = this.f1687a;
                if (j18 < -500000 && !z) {
                    yo1 yo1Var = p11Var.f5814n;
                    yo1Var.getClass();
                    int iMo3799i = yo1Var.mo3799i(j2 - p11Var.f5816p);
                    if (iMo3799i != 0) {
                        C1422sx c1422sx = p11Var.f3954C0;
                        if (r1 != 0) {
                            c1422sx.f10573d += iMo3799i;
                            c1422sx.f10575f += p11Var.f8649d1;
                        } else {
                            c1422sx.f10579j++;
                            p11Var.m5114H0(iMo3799i, p11Var.f8649d1);
                        }
                        if (p11Var.m2895L()) {
                            p11Var.m2901V();
                        }
                        wd1 wd1Var = p11Var.f8637R0;
                        if (wd1Var == null) {
                            return 4;
                        }
                        wd1Var.m6750a(false);
                        return 4;
                    }
                }
                long j19 = b62Var.f1229a;
                if (j19 < -30000 && !z) {
                    return r1 != 0 ? i : i2;
                }
                if (j19 > 50000) {
                    return 5;
                }
                return r20;
            }
        }
        z2 = true;
        z3 = false;
        if (z3) {
            return 0;
        }
        return !this.f1689c ? 5 : 5;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1141b(boolean z) {
        if (z && this.f1690d == 3) {
            this.f1694h = -9223372036854775807L;
            return true;
        }
        if (this.f1694h == -9223372036854775807L) {
            return false;
        }
        this.f1697k.getClass();
        if (SystemClock.elapsedRealtime() < this.f1694h) {
            return true;
        }
        this.f1694h = -9223372036854775807L;
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final void m1142c(boolean z) {
        this.f1695i = z;
        this.f1697k.getClass();
        this.f1694h = SystemClock.elapsedRealtime() + 5000;
    }

    /* JADX INFO: renamed from: d */
    public final void m1143d(int i) {
        this.f1690d = Math.min(this.f1690d, i);
    }

    /* JADX INFO: renamed from: e */
    public final void m1144e() {
        this.f1689c = true;
        this.f1697k.getClass();
        this.f1692f = z42.m7216D(SystemClock.elapsedRealtime());
        f62 f62Var = this.f1688b;
        f62Var.f3630d = true;
        f62Var.f3639m = 0L;
        f62Var.f3642p = -1L;
        f62Var.f3640n = -1L;
        d62 d62Var = f62Var.f3628b;
        if (d62Var != null) {
            DisplayManager displayManager = d62Var.f2807a;
            e62 e62Var = f62Var.f3629c;
            e62Var.getClass();
            e62Var.f3222b.sendEmptyMessage(2);
            displayManager.registerDisplayListener(d62Var, z42.m7236j(null));
            f62.m2727a(d62Var.f2808b, displayManager.getDisplay(0));
        }
        f62Var.m2730d(false);
    }

    /* JADX INFO: renamed from: f */
    public final void m1145f() {
        this.f1689c = false;
        this.f1694h = -9223372036854775807L;
        f62 f62Var = this.f1688b;
        f62Var.f3630d = false;
        d62 d62Var = f62Var.f3628b;
        if (d62Var != null) {
            d62Var.f2807a.unregisterDisplayListener(d62Var);
            e62 e62Var = f62Var.f3629c;
            e62Var.getClass();
            e62Var.f3222b.sendEmptyMessage(3);
        }
        f62Var.m2728b();
    }

    /* JADX INFO: renamed from: g */
    public final void m1146g(float f) {
        f62 f62Var = this.f1688b;
        f62Var.f3632f = f;
        xa0 xa0Var = f62Var.f3627a;
        xa0Var.f12507a.m6736c();
        xa0Var.f12508b.m6736c();
        xa0Var.f12509c = false;
        xa0Var.f12510d = -9223372036854775807L;
        xa0Var.f12511e = 0;
        f62Var.m2729c();
    }

    /* JADX INFO: renamed from: h */
    public final void m1147h(float f) {
        ki0.m3857c(f > TouchPipeline.SIZE);
        if (f == this.f1696j) {
            return;
        }
        this.f1696j = f;
        f62 f62Var = this.f1688b;
        f62Var.f3635i = f;
        f62Var.f3639m = 0L;
        f62Var.f3642p = -1L;
        f62Var.f3640n = -1L;
        f62Var.m2730d(false);
    }
}
