package p000;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class qk0 {

    /* JADX INFO: renamed from: a */
    public int f9519a;

    /* JADX INFO: renamed from: b */
    public int f9520b;

    /* JADX INFO: renamed from: c */
    public int f9521c;

    /* JADX INFO: renamed from: d */
    public final Object f9522d;

    /* JADX INFO: renamed from: e */
    public Serializable f9523e;

    public qk0(int i, int i2, int i3) {
        String str;
        if (i != Integer.MIN_VALUE) {
            str = i + "/";
        } else {
            str = "";
        }
        this.f9522d = str;
        this.f9519a = i2;
        this.f9520b = i3;
        this.f9521c = Integer.MIN_VALUE;
        this.f9523e = "";
    }

    /* JADX INFO: renamed from: a */
    public void m5498a() {
        int i = this.f9521c;
        this.f9521c = i == Integer.MIN_VALUE ? this.f9519a : i + this.f9520b;
        this.f9523e = ((String) this.f9522d) + this.f9521c;
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [java.io.Serializable, java.lang.Object, yj0[]] */
    /* JADX INFO: renamed from: b */
    public void m5499b(yj0 yj0Var) {
        int i;
        int i2 = yj0Var.f12997c;
        if (i2 > 4096) {
            Arrays.fill((yj0[]) this.f9523e, (Object) null);
            this.f9520b = ((yj0[]) this.f9523e).length - 1;
            this.f9519a = 0;
            this.f9521c = 0;
            return;
        }
        int i3 = (this.f9521c + i2) - 4096;
        if (i3 > 0) {
            int length = ((yj0[]) this.f9523e).length - 1;
            int i4 = 0;
            while (true) {
                i = this.f9520b;
                if (length < i || i3 <= 0) {
                    break;
                }
                int i5 = ((yj0[]) this.f9523e)[length].f12997c;
                i3 -= i5;
                this.f9521c -= i5;
                this.f9519a--;
                i4++;
                length--;
            }
            yj0[] yj0VarArr = (yj0[]) this.f9523e;
            int i6 = i + 1;
            System.arraycopy(yj0VarArr, i6, yj0VarArr, i6 + i4, this.f9519a);
            this.f9520b += i4;
        }
        int i7 = this.f9519a + 1;
        yj0[] yj0VarArr2 = (yj0[]) this.f9523e;
        if (i7 > yj0VarArr2.length) {
            Object r2 = new yj0[yj0VarArr2.length * 2];
            System.arraycopy(yj0VarArr2, 0, r2, yj0VarArr2.length, yj0VarArr2.length);
            this.f9520b = ((yj0[]) this.f9523e).length - 1;
            this.f9523e = r2;
        }
        int i8 = this.f9520b;
        this.f9520b = i8 - 1;
        ((yj0[]) this.f9523e)[i8] = yj0Var;
        this.f9519a++;
        this.f9521c += i2;
    }

    /* JADX INFO: renamed from: c */
    public void m5500c() {
        if (this.f9521c != Integer.MIN_VALUE) {
            return;
        }
        f40.m2719o("generateNewId() must be called before retrieving ids.");
    }

    /* JADX INFO: renamed from: d */
    public void m5501d(C0717hk c0717hk) {
        m5502e(c0717hk.mo3164d(), 127, 0);
        ((C1073lj) this.f9522d).m4190B(c0717hk);
    }

    /* JADX INFO: renamed from: e */
    public void m5502e(int i, int i2, int i3) {
        C1073lj c1073lj = (C1073lj) this.f9522d;
        if (i < i2) {
            c1073lj.m4192D(i | i3);
            return;
        }
        c1073lj.m4192D(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            c1073lj.m4192D(128 | (i4 & 127));
            i4 >>>= 7;
        }
        c1073lj.m4192D(i4);
    }

    public qk0(int i, int i2) {
        this(Integer.MIN_VALUE, i, i2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.Serializable, yj0[]] */
    public qk0(C1073lj c1073lj) {
        this.f9523e = new yj0[8];
        this.f9520b = 7;
        this.f9522d = c1073lj;
    }
}
