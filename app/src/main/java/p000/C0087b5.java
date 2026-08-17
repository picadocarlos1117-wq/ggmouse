package p000;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: b5 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0087b5 implements n80 {

    /* JADX INFO: renamed from: a */
    public final y12 f1143a;

    /* JADX INFO: renamed from: b */
    public final int f1144b;

    /* JADX INFO: renamed from: c */
    public final int[] f1145c;

    /* JADX INFO: renamed from: d */
    public final be0[] f1146d;

    /* JADX INFO: renamed from: e */
    public int f1147e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f1148f;

    public C0087b5(int i, y12 y12Var, int[] iArr) {
        be0[] be0VarArr;
        this.f1148f = i;
        ki0.m3864h(iArr.length > 0);
        y12Var.getClass();
        be0[] be0VarArr2 = y12Var.f12805d;
        this.f1143a = y12Var;
        int length = iArr.length;
        this.f1144b = length;
        this.f1146d = new be0[length];
        int i2 = 0;
        while (true) {
            int length2 = iArr.length;
            be0VarArr = this.f1146d;
            if (i2 >= length2) {
                break;
            }
            be0VarArr[i2] = be0VarArr2[iArr[i2]];
            i2++;
        }
        Arrays.sort(be0VarArr, new C1473ua(1));
        this.f1145c = new int[this.f1144b];
        int i3 = 0;
        while (true) {
            int i4 = this.f1144b;
            if (i3 >= i4) {
                long[] jArr = new long[i4];
                return;
            }
            int[] iArr2 = this.f1145c;
            be0 be0Var = this.f1146d[i3];
            int i5 = 0;
            while (true) {
                if (i5 >= be0VarArr2.length) {
                    i5 = -1;
                    break;
                } else if (be0Var == be0VarArr2[i5]) {
                    break;
                } else {
                    i5++;
                }
            }
            iArr2[i3] = i5;
            i3++;
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m851m(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            nm0 nm0Var = (nm0) arrayList.get(i);
            if (nm0Var != null) {
                nm0Var.m3901a(new C0006a5(j, jArr[i]));
            }
        }
    }

    @Override // p000.n80
    /* JADX INFO: renamed from: a */
    public final y12 mo855a() {
        return this.f1143a;
    }

    @Override // p000.n80
    /* JADX INFO: renamed from: c */
    public final be0 mo857c(int i) {
        return this.f1146d[i];
    }

    @Override // p000.n80
    /* JADX INFO: renamed from: d */
    public void mo858d() {
        int i = this.f1148f;
    }

    @Override // p000.n80
    /* JADX INFO: renamed from: e */
    public final int mo859e(int i) {
        return this.f1145c[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C0087b5 c0087b5 = (C0087b5) obj;
            if (this.f1143a.equals(c0087b5.f1143a) && Arrays.equals(this.f1145c, c0087b5.f1145c)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.n80
    /* JADX INFO: renamed from: f */
    public void mo860f() {
        int i = this.f1148f;
    }

    @Override // p000.n80
    /* JADX INFO: renamed from: g */
    public final int mo861g() {
        return this.f1145c[0];
    }

    @Override // p000.n80
    /* JADX INFO: renamed from: h */
    public final be0 mo862h() {
        return this.f1146d[0];
    }

    public final int hashCode() {
        if (this.f1147e == 0) {
            this.f1147e = Arrays.hashCode(this.f1145c) + (System.identityHashCode(this.f1143a) * 31);
        }
        return this.f1147e;
    }

    @Override // p000.n80
    /* JADX INFO: renamed from: i */
    public void mo863i(float f) {
        int i = this.f1148f;
    }

    @Override // p000.n80
    /* JADX INFO: renamed from: l */
    public final int mo864l(int i) {
        for (int i2 = 0; i2 < this.f1144b; i2++) {
            if (this.f1145c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.n80
    public final int length() {
        return this.f1145c.length;
    }

    /* JADX INFO: renamed from: n */
    private final void m852n() {
    }

    /* JADX INFO: renamed from: p */
    private final void m853p() {
    }

    /* JADX INFO: renamed from: o */
    public final void m865o() {
    }

    /* JADX INFO: renamed from: q */
    public final void m866q() {
    }

    /* JADX INFO: renamed from: r */
    private final void m854r(float f) {
    }

    @Override // p000.n80
    /* JADX INFO: renamed from: b */
    public final void mo856b(boolean z) {
    }

    /* JADX INFO: renamed from: s */
    public final void m867s(float f) {
    }
}
