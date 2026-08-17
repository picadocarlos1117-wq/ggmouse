package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class if1 {

    /* JADX INFO: renamed from: a */
    public vh0 f5009a;

    /* JADX INFO: renamed from: b */
    public int f5010b;

    /* JADX INFO: renamed from: c */
    public int[] f5011c;

    public if1(vh0 vh0Var, int[] iArr) {
        int[] iArr2;
        this.f5009a = vh0Var;
        int iM3426b = m3426b(iArr);
        if (iM3426b == -1) {
            iArr2 = new int[1];
        } else {
            int i = iM3426b + 1;
            if (iArr.length == i) {
                iArr2 = new int[iArr.length];
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            } else {
                int[] iArr3 = new int[i];
                System.arraycopy(iArr, 0, iArr3, 0, i);
                iArr2 = iArr3;
            }
        }
        this.f5011c = iArr2;
        m3428c();
    }

    /* JADX INFO: renamed from: b */
    public static int m3426b(int[] iArr) {
        int length = iArr.length - 1;
        while (length >= 0 && iArr[length] == 0) {
            length--;
        }
        return length;
    }

    /* JADX INFO: renamed from: a */
    public final int[] m3427a(int[] iArr, int[] iArr2) {
        int[] iArr3;
        if (iArr.length < iArr2.length) {
            iArr3 = new int[iArr2.length];
            System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
        } else {
            iArr3 = new int[iArr.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            iArr = iArr2;
        }
        for (int length = iArr.length - 1; length >= 0; length--) {
            vh0 vh0Var = this.f5009a;
            int i = iArr3[length];
            int i2 = iArr[length];
            vh0Var.getClass();
            iArr3[length] = i ^ i2;
        }
        return iArr3;
    }

    /* JADX INFO: renamed from: c */
    public final void m3428c() {
        int length = this.f5011c.length;
        do {
            this.f5010b = length - 1;
            length = this.f5010b;
            if (length < 0) {
                return;
            }
        } while (this.f5011c[length] == 0);
    }

    /* JADX INFO: renamed from: d */
    public final int m3429d(int i) {
        if (i < 0 || i > this.f5010b) {
            return 0;
        }
        return this.f5011c[i];
    }

    /* JADX INFO: renamed from: e */
    public final int[] m3430e(int[] iArr, int i) {
        int iM3426b = m3426b(iArr);
        if (iM3426b == -1 || i == 0) {
            return new int[1];
        }
        if (i == 1) {
            int[] iArr2 = new int[iArr.length];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            return iArr2;
        }
        int[] iArr3 = new int[iM3426b + 1];
        while (iM3426b >= 0) {
            iArr3[iM3426b] = hp0.m3197F(iArr[iM3426b], i, this.f5009a.f11658b);
            iM3426b--;
        }
        return iArr3;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof if1)) {
            if1 if1Var = (if1) obj;
            if (this.f5009a.equals(if1Var.f5009a) && this.f5010b == if1Var.f5010b) {
                int[] iArr = this.f5011c;
                int[] iArr2 = if1Var.f5011c;
                int iM3426b = m3426b(iArr);
                if (iM3426b == m3426b(iArr2)) {
                    for (int i = 0; i <= iM3426b; i++) {
                        if (iArr[i] == iArr2[i]) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f5009a.f11658b;
        int i2 = 0;
        while (true) {
            int[] iArr = this.f5011c;
            if (i2 >= iArr.length) {
                return i;
            }
            i = (i * 31) + iArr[i2];
            i2++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(" Polynomial over ");
        vh0 vh0Var = this.f5009a;
        sb.append(vh0Var.toString());
        sb.append(": \n");
        String string = sb.toString();
        for (int i = 0; i < this.f5011c.length; i++) {
            StringBuilder sbM5344k = AbstractC1308pu.m5344k(string);
            int i2 = this.f5011c[i];
            String strConcat = "";
            for (int i3 = 0; i3 < vh0Var.f11657a; i3++) {
                strConcat = ((((byte) i2) & 1) == 0 ? "0" : "1").concat(strConcat);
                i2 >>>= 1;
            }
            sbM5344k.append(strConcat);
            sbM5344k.append("Y^");
            sbM5344k.append(i);
            sbM5344k.append("+");
            string = sbM5344k.toString();
        }
        return string.concat(";");
    }
}
