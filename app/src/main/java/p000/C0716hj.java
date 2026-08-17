package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: hj */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0716hj {

    /* JADX INFO: renamed from: a */
    public int f4584a;

    /* JADX INFO: renamed from: b */
    public int f4585b;

    /* JADX INFO: renamed from: c */
    public Object f4586c;

    /* JADX INFO: renamed from: d */
    public Object f4587d;

    public C0716hj(int i, float[] fArr, float[] fArr2, int i2) {
        this.f4584a = i;
        ki0.m3857c(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
        this.f4586c = fArr;
        this.f4587d = fArr2;
        this.f4585b = i2;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m3151a(long j, Object obj) {
        int i = this.f4585b;
        if (i > 0) {
            if (j <= ((long[]) this.f4586c)[((this.f4584a + i) - 1) % ((Object[]) this.f4587d).length]) {
                m3152b();
            }
        }
        m3153c();
        int i2 = this.f4584a;
        int i3 = this.f4585b;
        Object[] objArr = (Object[]) this.f4587d;
        int length = (i2 + i3) % objArr.length;
        ((long[]) this.f4586c)[length] = j;
        objArr[length] = obj;
        this.f4585b = i3 + 1;
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m3152b() {
        this.f4584a = 0;
        this.f4585b = 0;
        Arrays.fill((Object[]) this.f4587d, (Object) null);
    }

    /* JADX INFO: renamed from: c */
    public void m3153c() {
        int length = ((Object[]) this.f4587d).length;
        if (this.f4585b < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        Object[] objArr = new Object[i];
        int i2 = this.f4584a;
        int i3 = length - i2;
        System.arraycopy((long[]) this.f4586c, i2, jArr, 0, i3);
        System.arraycopy((Object[]) this.f4587d, this.f4584a, objArr, 0, i3);
        int i4 = this.f4584a;
        if (i4 > 0) {
            System.arraycopy((long[]) this.f4586c, 0, jArr, i3, i4);
            System.arraycopy((Object[]) this.f4587d, 0, objArr, i3, this.f4584a);
        }
        this.f4586c = jArr;
        this.f4587d = objArr;
        this.f4584a = 0;
    }

    /* JADX INFO: renamed from: d */
    public Object m3154d(long j, boolean z) {
        Object objM3157g = null;
        long j2 = Long.MAX_VALUE;
        while (this.f4585b > 0) {
            long j3 = j - ((long[]) this.f4586c)[this.f4584a];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            objM3157g = m3157g();
            j2 = j3;
        }
        return objM3157g;
    }

    /* JADX INFO: renamed from: e */
    public synchronized Object m3155e() {
        return this.f4585b == 0 ? null : m3157g();
    }

    /* JADX INFO: renamed from: f */
    public synchronized Object m3156f(long j) {
        return m3154d(j, true);
    }

    /* JADX INFO: renamed from: g */
    public Object m3157g() {
        ki0.m3864h(this.f4585b > 0);
        Object[] objArr = (Object[]) this.f4587d;
        int i = this.f4584a;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f4584a = (i + 1) % objArr.length;
        this.f4585b--;
        return obj;
    }

    /* JADX INFO: renamed from: h */
    public synchronized int m3158h() {
        return this.f4585b;
    }

    public C0716hj() {
        this.f4586c = new long[10];
        this.f4587d = new Object[10];
    }
}
