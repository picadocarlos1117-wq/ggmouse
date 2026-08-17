package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ew0 implements Cloneable {

    /* JADX INFO: renamed from: e */
    public static final Object f3454e = new Object();

    /* JADX INFO: renamed from: a */
    public boolean f3455a = false;

    /* JADX INFO: renamed from: b */
    public long[] f3456b;

    /* JADX INFO: renamed from: c */
    public Object[] f3457c;

    /* JADX INFO: renamed from: d */
    public int f3458d;

    public ew0() {
        int i;
        int i2 = 4;
        while (true) {
            i = 80;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (80 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 8;
        this.f3456b = new long[i4];
        this.f3457c = new Object[i4];
    }

    /* JADX INFO: renamed from: a */
    public final void m2645a() {
        int i = this.f3458d;
        Object[] objArr = this.f3457c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f3458d = 0;
        this.f3455a = false;
    }

    /* JADX INFO: renamed from: b */
    public final void m2646b() {
        int i = this.f3458d;
        long[] jArr = this.f3456b;
        Object[] objArr = this.f3457c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f3454e) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f3455a = false;
        this.f3458d = i2;
    }

    /* JADX INFO: renamed from: c */
    public final Object m2647c(long j) {
        Object obj;
        int iM5536f = AbstractC1337qm.m5536f(this.f3458d, j, this.f3456b);
        if (iM5536f < 0 || (obj = this.f3457c[iM5536f]) == f3454e) {
            return null;
        }
        return obj;
    }

    public final Object clone() {
        try {
            ew0 ew0Var = (ew0) super.clone();
            ew0Var.f3456b = (long[]) this.f3456b.clone();
            ew0Var.f3457c = (Object[]) this.f3457c.clone();
            return ew0Var;
        } catch (CloneNotSupportedException e) {
            f40.m2711g(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2648d(long j, Object obj) {
        int iM5536f = AbstractC1337qm.m5536f(this.f3458d, j, this.f3456b);
        if (iM5536f >= 0) {
            this.f3457c[iM5536f] = obj;
            return;
        }
        int i = ~iM5536f;
        int i2 = this.f3458d;
        if (i < i2) {
            Object[] objArr = this.f3457c;
            if (objArr[i] == f3454e) {
                this.f3456b[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.f3455a && i2 >= this.f3456b.length) {
            m2646b();
            i = ~AbstractC1337qm.m5536f(this.f3458d, j, this.f3456b);
        }
        int i3 = this.f3458d;
        if (i3 >= this.f3456b.length) {
            int i4 = (i3 + 1) * 8;
            for (int i5 = 4; i5 < 32; i5++) {
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
            }
            int i7 = i4 / 8;
            long[] jArr = new long[i7];
            Object[] objArr2 = new Object[i7];
            long[] jArr2 = this.f3456b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f3457c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f3456b = jArr;
            this.f3457c = objArr2;
        }
        int i8 = this.f3458d - i;
        if (i8 != 0) {
            long[] jArr3 = this.f3456b;
            int i9 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i9, i8);
            Object[] objArr4 = this.f3457c;
            System.arraycopy(objArr4, i, objArr4, i9, this.f3458d - i);
        }
        this.f3456b[i] = j;
        this.f3457c[i] = obj;
        this.f3458d++;
    }

    /* JADX INFO: renamed from: e */
    public final int m2649e() {
        if (this.f3455a) {
            m2646b();
        }
        return this.f3458d;
    }

    /* JADX INFO: renamed from: f */
    public final Object m2650f(int i) {
        if (this.f3455a) {
            m2646b();
        }
        return this.f3457c[i];
    }

    public final String toString() {
        if (m2649e() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3458d * 28);
        sb.append('{');
        for (int i = 0; i < this.f3458d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            if (this.f3455a) {
                m2646b();
            }
            sb.append(this.f3456b[i]);
            sb.append('=');
            Object objM2650f = m2650f(i);
            if (objM2650f != this) {
                sb.append(objM2650f);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
