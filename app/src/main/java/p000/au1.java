package p000;

import com.example.ssmousepro.injection.TouchPipeline;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class au1 implements Comparable {

    /* JADX INFO: renamed from: a */
    public boolean f1055a;

    /* JADX INFO: renamed from: e */
    public float f1059e;

    /* JADX INFO: renamed from: q */
    public int f1066q;

    /* JADX INFO: renamed from: b */
    public int f1056b = -1;

    /* JADX INFO: renamed from: c */
    public int f1057c = -1;

    /* JADX INFO: renamed from: d */
    public int f1058d = 0;

    /* JADX INFO: renamed from: f */
    public boolean f1060f = false;

    /* JADX INFO: renamed from: g */
    public final float[] f1061g = new float[9];

    /* JADX INFO: renamed from: m */
    public final float[] f1062m = new float[9];

    /* JADX INFO: renamed from: n */
    public C0670ga[] f1063n = new C0670ga[16];

    /* JADX INFO: renamed from: o */
    public int f1064o = 0;

    /* JADX INFO: renamed from: p */
    public int f1065p = 0;

    public au1(int i) {
        this.f1066q = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m716a(C0670ga c0670ga) {
        int i = 0;
        while (true) {
            int i2 = this.f1064o;
            C0670ga[] c0670gaArr = this.f1063n;
            if (i >= i2) {
                if (i2 >= c0670gaArr.length) {
                    this.f1063n = (C0670ga[]) Arrays.copyOf(c0670gaArr, c0670gaArr.length * 2);
                }
                C0670ga[] c0670gaArr2 = this.f1063n;
                int i3 = this.f1064o;
                c0670gaArr2[i3] = c0670ga;
                this.f1064o = i3 + 1;
                return;
            }
            if (c0670gaArr[i] == c0670ga) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m717b(C0670ga c0670ga) {
        int i = this.f1064o;
        int i2 = 0;
        while (i2 < i) {
            if (this.f1063n[i2] == c0670ga) {
                while (i2 < i - 1) {
                    C0670ga[] c0670gaArr = this.f1063n;
                    int i3 = i2 + 1;
                    c0670gaArr[i2] = c0670gaArr[i3];
                    i2 = i3;
                }
                this.f1064o--;
                return;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m718c() {
        this.f1066q = 5;
        this.f1058d = 0;
        this.f1056b = -1;
        this.f1057c = -1;
        this.f1059e = TouchPipeline.SIZE;
        this.f1060f = false;
        int i = this.f1064o;
        for (int i2 = 0; i2 < i; i2++) {
            this.f1063n[i2] = null;
        }
        this.f1064o = 0;
        this.f1065p = 0;
        this.f1055a = false;
        Arrays.fill(this.f1062m, TouchPipeline.SIZE);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f1056b - ((au1) obj).f1056b;
    }

    /* JADX INFO: renamed from: d */
    public final void m719d(xs0 xs0Var, float f) {
        this.f1059e = f;
        this.f1060f = true;
        int i = this.f1064o;
        this.f1057c = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.f1063n[i2].m2950h(xs0Var, this, false);
        }
        this.f1064o = 0;
    }

    /* JADX INFO: renamed from: e */
    public final void m720e(xs0 xs0Var, C0670ga c0670ga) {
        int i = this.f1064o;
        for (int i2 = 0; i2 < i; i2++) {
            this.f1063n[i2].mo2354i(xs0Var, c0670ga, false);
        }
        this.f1064o = 0;
    }

    public final String toString() {
        return "" + this.f1056b;
    }
}
