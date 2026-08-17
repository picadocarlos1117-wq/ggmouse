package p000;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class vu1 {

    /* JADX INFO: renamed from: a */
    public int f11770a;

    /* JADX INFO: renamed from: b */
    public int f11771b;

    /* JADX INFO: renamed from: c */
    public int f11772c;

    /* JADX INFO: renamed from: d */
    public int f11773d;

    /* JADX INFO: renamed from: e */
    public int f11774e;

    /* JADX INFO: renamed from: b */
    public static vu1 m6660b(String str) {
        ki0.m3857c(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < strArrSplit.length; i5++) {
            String strM6444b0 = ua0.m6444b0(strArrSplit[i5].trim());
            strM6444b0.getClass();
            switch (strM6444b0) {
                case "end":
                    i2 = i5;
                    break;
                case "text":
                    i3 = i5;
                    break;
                case "start":
                    i = i5;
                    break;
                case "style":
                    i4 = i5;
                    break;
            }
        }
        if (i == -1 || i2 == -1 || i3 == -1) {
            return null;
        }
        int length = strArrSplit.length;
        vu1 vu1Var = new vu1();
        vu1Var.f11770a = i;
        vu1Var.f11771b = i2;
        vu1Var.f11772c = i4;
        vu1Var.f11773d = i3;
        vu1Var.f11774e = length;
        return vu1Var;
    }

    /* JADX INFO: renamed from: a */
    public boolean m6661a() {
        int i;
        int i2;
        int i3;
        int i4 = this.f11770a;
        int i5 = 2;
        if ((i4 & 7) != 0) {
            int i6 = this.f11773d;
            int i7 = this.f11771b;
            if (i6 > i7) {
                i3 = 1;
            } else {
                i3 = i6 == i7 ? 2 : 4;
            }
            if ((i3 & i4) == 0) {
                return false;
            }
        }
        if ((i4 & 112) != 0) {
            int i8 = this.f11773d;
            int i9 = this.f11772c;
            if (i8 > i9) {
                i2 = 1;
            } else {
                i2 = i8 == i9 ? 2 : 4;
            }
            if (((i2 << 4) & i4) == 0) {
                return false;
            }
        }
        if ((i4 & 1792) != 0) {
            int i10 = this.f11774e;
            int i11 = this.f11771b;
            if (i10 > i11) {
                i = 1;
            } else {
                i = i10 == i11 ? 2 : 4;
            }
            if (((i << 8) & i4) == 0) {
                return false;
            }
        }
        if ((i4 & 28672) != 0) {
            int i12 = this.f11774e;
            int i13 = this.f11772c;
            if (i12 > i13) {
                i5 = 1;
            } else if (i12 != i13) {
                i5 = 4;
            }
            if (((i5 << 12) & i4) == 0) {
                return false;
            }
        }
        return true;
    }
}
