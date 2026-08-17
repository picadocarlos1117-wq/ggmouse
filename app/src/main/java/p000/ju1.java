package p000;

import android.content.res.ColorStateList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ju1 implements Cloneable {

    /* JADX INFO: renamed from: d */
    public static final Object f5531d = new Object();

    /* JADX INFO: renamed from: a */
    public int[] f5532a;

    /* JADX INFO: renamed from: b */
    public Object[] f5533b;

    /* JADX INFO: renamed from: c */
    public int f5534c;

    public ju1() {
        int i;
        int i2 = 4;
        while (true) {
            i = 40;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (40 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 4;
        this.f5532a = new int[i4];
        this.f5533b = new Object[i4];
    }

    /* JADX INFO: renamed from: a */
    public final void m3710a(int i, ColorStateList colorStateList) {
        int i2 = this.f5534c;
        if (i2 != 0 && i <= this.f5532a[i2 - 1]) {
            m3712c(i, colorStateList);
            return;
        }
        if (i2 >= this.f5532a.length) {
            int i3 = (i2 + 1) * 4;
            for (int i4 = 4; i4 < 32; i4++) {
                int i5 = (1 << i4) - 12;
                if (i3 <= i5) {
                    i3 = i5;
                    break;
                }
            }
            int i6 = i3 / 4;
            int[] iArr = new int[i6];
            Object[] objArr = new Object[i6];
            int[] iArr2 = this.f5532a;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f5533b;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f5532a = iArr;
            this.f5533b = objArr;
        }
        this.f5532a[i2] = i;
        this.f5533b[i2] = colorStateList;
        this.f5534c = i2 + 1;
    }

    /* JADX INFO: renamed from: b */
    public final Object m3711b(int i) {
        Object obj;
        int iM5534e = AbstractC1337qm.m5534e(this.f5534c, i, this.f5532a);
        if (iM5534e < 0 || (obj = this.f5533b[iM5534e]) == f5531d) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: c */
    public final void m3712c(int i, Object obj) {
        int iM5534e = AbstractC1337qm.m5534e(this.f5534c, i, this.f5532a);
        if (iM5534e >= 0) {
            this.f5533b[iM5534e] = obj;
            return;
        }
        int i2 = ~iM5534e;
        int i3 = this.f5534c;
        if (i2 < i3) {
            Object[] objArr = this.f5533b;
            if (objArr[i2] == f5531d) {
                this.f5532a[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (i3 >= this.f5532a.length) {
            int i4 = (i3 + 1) * 4;
            for (int i5 = 4; i5 < 32; i5++) {
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
            }
            int i7 = i4 / 4;
            int[] iArr = new int[i7];
            Object[] objArr2 = new Object[i7];
            int[] iArr2 = this.f5532a;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f5533b;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f5532a = iArr;
            this.f5533b = objArr2;
        }
        int i8 = this.f5534c - i2;
        if (i8 != 0) {
            int[] iArr3 = this.f5532a;
            int i9 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i9, i8);
            Object[] objArr4 = this.f5533b;
            System.arraycopy(objArr4, i2, objArr4, i9, this.f5534c - i2);
        }
        this.f5532a[i2] = i;
        this.f5533b[i2] = obj;
        this.f5534c++;
    }

    public final Object clone() {
        try {
            ju1 ju1Var = (ju1) super.clone();
            ju1Var.f5532a = (int[]) this.f5532a.clone();
            ju1Var.f5533b = (Object[]) this.f5533b.clone();
            return ju1Var;
        } catch (CloneNotSupportedException e) {
            f40.m2711g(e);
            return null;
        }
    }

    public final String toString() {
        int i = this.f5534c;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f5534c; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(this.f5532a[i2]);
            sb.append('=');
            Object obj = this.f5533b[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
