package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class hf1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4557a;

    /* JADX INFO: renamed from: b */
    public final C1174o9[] f4558b;

    public hf1(ch1 ch1Var, int i) {
        this.f4557a = i;
        int i2 = 0;
        switch (i) {
            case 1:
                int i3 = ch1Var.f1808c;
                this.f4558b = new C1174o9[i3];
                while (i2 < i3) {
                    this.f4558b[i2] = new C1174o9(ch1Var);
                    i2++;
                }
                break;
            default:
                int i4 = ch1Var.f1807b;
                this.f4558b = new C1174o9[i4];
                while (i2 < i4) {
                    this.f4558b[i2] = new C1174o9(ch1Var);
                    i2++;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m3135a() {
        int i = 0;
        while (true) {
            C1174o9[] c1174o9Arr = this.f4558b;
            if (i >= c1174o9Arr.length) {
                return;
            }
            C1174o9 c1174o9 = c1174o9Arr[i];
            for (int i2 = 0; i2 < 256; i2++) {
                int[] iArr = (int[]) c1174o9.f7699b;
                int i3 = iArr[i2];
                iArr[i2] = i3 + ((i3 >> 31) & 8380417);
            }
            c1174o9.getClass();
            i++;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m3136b() {
        int i;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            C1174o9[] c1174o9Arr = this.f4558b;
            if (i3 >= c1174o9Arr.length) {
                return;
            }
            C1174o9 c1174o9 = c1174o9Arr[i3];
            int[] iArr = (int[]) c1174o9.f7699b;
            int iM6077u = sc2.m6077u(i2, iArr.length);
            int[] iArr2 = new int[iM6077u];
            System.arraycopy(iArr, i2, iArr2, i2, Math.min(iArr.length, iM6077u));
            int i4 = 1;
            int i5 = 256;
            while (i4 < 256) {
                for (int i6 = i2; i6 < 256; i6 = i + i4) {
                    i5--;
                    int i7 = p32.f8692f[i5] * (-1);
                    i = i6;
                    while (i < i6 + i4) {
                        int i8 = iArr2[i];
                        int i9 = i + i4;
                        iArr2[i] = iArr2[i9] + i8;
                        int i10 = i8 - iArr2[i9];
                        iArr2[i9] = i10;
                        iArr2[i9] = sc2.m6036F(((long) i7) * ((long) i10));
                        i++;
                    }
                }
                i4 <<= 1;
                i2 = 0;
            }
            for (int i11 = 0; i11 < 256; i11++) {
                iArr2[i11] = sc2.m6036F(((long) iArr2[i11]) * 41978);
            }
            c1174o9.f7699b = iArr2;
            i3++;
            i2 = 0;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m3137c() {
        int i;
        int i2 = 0;
        while (true) {
            C1174o9[] c1174o9Arr = this.f4558b;
            if (i2 >= c1174o9Arr.length) {
                return;
            }
            C1174o9 c1174o9 = c1174o9Arr[i2];
            int[] iArr = (int[]) c1174o9.f7699b;
            int iM6077u = sc2.m6077u(0, iArr.length);
            int[] iArr2 = new int[iM6077u];
            System.arraycopy(iArr, 0, iArr2, 0, Math.min(iArr.length, iM6077u));
            int i3 = 0;
            for (int i4 = 128; i4 > 0; i4 >>>= 1) {
                for (int i5 = 0; i5 < 256; i5 = i + i4) {
                    i3++;
                    int i6 = p32.f8692f[i3];
                    i = i5;
                    while (i < i5 + i4) {
                        int i7 = i + i4;
                        int iM6036F = sc2.m6036F(((long) i6) * ((long) iArr2[i7]));
                        iArr2[i7] = iArr2[i] - iM6036F;
                        iArr2[i] = iArr2[i] + iM6036F;
                        i++;
                    }
                }
            }
            c1174o9.f7699b = iArr2;
            i2++;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m3138d(hf1 hf1Var) {
        int i = 0;
        while (true) {
            C1174o9[] c1174o9Arr = this.f4558b;
            if (i >= c1174o9Arr.length) {
                return;
            }
            C1174o9 c1174o9 = c1174o9Arr[i];
            C1174o9 c1174o10 = hf1Var.f4558b[i];
            for (int i2 = 0; i2 < 256; i2++) {
                int[] iArr = (int[]) c1174o9.f7699b;
                int i3 = iArr[i2];
                int i4 = (i3 + 4095) >> 13;
                int[] iArr2 = {i4, i3 - (i4 << 13)};
                iArr[i2] = iArr2[0];
                ((int[]) c1174o10.f7699b)[i2] = iArr2[1];
            }
            c1174o9.getClass();
            i++;
        }
    }

    /* JADX INFO: renamed from: e */
    public void m3139e() {
        int i = 0;
        while (true) {
            C1174o9[] c1174o9Arr = this.f4558b;
            if (i >= c1174o9Arr.length) {
                return;
            }
            C1174o9 c1174o9 = c1174o9Arr[i];
            for (int i2 = 0; i2 < 256; i2++) {
                int[] iArr = (int[]) c1174o9.f7699b;
                int i3 = iArr[i2];
                iArr[i2] = i3 - (((4194304 + i3) >> 23) * 8380417);
            }
            c1174o9.getClass();
            i++;
        }
    }

    public final String toString() {
        int i = this.f4557a;
        int i2 = 0;
        C1174o9[] c1174o9Arr = this.f4558b;
        switch (i) {
            case 0:
                String strConcat = "[";
                while (i2 < c1174o9Arr.length) {
                    strConcat = strConcat + i2 + " " + c1174o9Arr[i2].toString();
                    if (i2 != c1174o9Arr.length - 1) {
                        strConcat = strConcat.concat(",\n");
                    }
                    i2++;
                }
                return strConcat.concat("]");
            default:
                String strConcat2 = "\n[";
                while (i2 < c1174o9Arr.length) {
                    strConcat2 = strConcat2 + "Inner Matrix " + i2 + " " + c1174o9Arr[i2].toString();
                    if (i2 != c1174o9Arr.length - 1) {
                        strConcat2 = strConcat2.concat(",\n");
                    }
                    i2++;
                }
                return strConcat2.concat("]");
        }
    }
}
