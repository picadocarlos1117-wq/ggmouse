package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.util.SparseArray;
import com.example.ssmousepro.injection.InjectionMetrics;
import com.example.ssmousepro.injection.TouchPipeline;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class b50 implements yx1 {

    /* JADX INFO: renamed from: m */
    public static final byte[] f1149m = {0, 7, 8, 15};

    /* JADX INFO: renamed from: n */
    public static final byte[] f1150n = {0, 119, -120, -1};

    /* JADX INFO: renamed from: o */
    public static final byte[] f1151o = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* JADX INFO: renamed from: a */
    public Object f1152a;

    /* JADX INFO: renamed from: b */
    public Object f1153b;

    /* JADX INFO: renamed from: c */
    public Object f1154c;

    /* JADX INFO: renamed from: d */
    public Object f1155d;

    /* JADX INFO: renamed from: e */
    public Object f1156e;

    /* JADX INFO: renamed from: f */
    public Object f1157f;

    /* JADX INFO: renamed from: g */
    public Object f1158g;

    /* JADX INFO: renamed from: a */
    public static byte[] m868a(int i, int i2, C0141cm c0141cm) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) c0141cm.m1238i(i2);
        }
        return bArr;
    }

    /* JADX INFO: renamed from: b */
    public static int[] m869b() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            if (i < 8) {
                iArr[i] = m871d(255, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                iArr[i] = m871d(255, (i & 1) != 0 ? 127 : 0, (i & 2) != 0 ? 127 : 0, (i & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: c */
    public static int[] m870c() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            if (i < 8) {
                iArr[i] = m871d(63, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) == 0 ? 0 : 255);
            } else {
                int i2 = i & 136;
                if (i2 == 0) {
                    iArr[i] = m871d(255, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 8) {
                    iArr[i] = m871d(127, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 128) {
                    iArr[i] = m871d(255, ((i & 1) != 0 ? 43 : 0) + 127 + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + 127 + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + 127 + ((i & 64) == 0 ? 0 : 85));
                } else if (i2 == 136) {
                    iArr[i] = m871d(255, ((i & 1) != 0 ? 43 : 0) + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + ((i & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: d */
    public static int m871d(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:119:0x0203 A[LOOP:3: B:87:0x0156->B:119:0x0203, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:133:0x01ff A[SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public static void m872e(byte[] bArr, int[] iArr, int i, int i2, int i3, Paint paint, Canvas canvas) {
        byte[] bArr2;
        char c;
        char c2;
        int iM1238i;
        int iM1238i2;
        boolean z;
        int iM1238i3;
        int iM1238i4;
        int iM1238i5;
        int i4;
        int i5;
        boolean z2;
        int iM1238i6;
        C0141cm c0141cm = new C0141cm(bArr, bArr.length);
        int i6 = i2;
        int i7 = i3;
        byte[] bArrM868a = null;
        byte[] bArrM868a2 = null;
        byte[] bArrM868a3 = null;
        while (c0141cm.m1231b() != 0) {
            int i8 = 8;
            int iM1238i7 = c0141cm.m1238i(8);
            if (iM1238i7 != 240) {
                int i9 = 3;
                int i10 = 2;
                int i11 = 4;
                switch (iM1238i7) {
                    case 16:
                        if (i == 3) {
                            bArr2 = bArrM868a == null ? f1150n : bArrM868a;
                        } else if (i == 2) {
                            bArr2 = bArrM868a3 == null ? f1149m : bArrM868a3;
                        } else {
                            bArr2 = null;
                        }
                        boolean z3 = false;
                        while (true) {
                            int iM1238i8 = c0141cm.m1238i(2);
                            if (iM1238i8 != 0) {
                                iM1238i = iM1238i8;
                                iM1238i2 = 1;
                            } else {
                                if (c0141cm.m1237h()) {
                                    int iM1238i9 = c0141cm.m1238i(3) + 3;
                                    iM1238i = c0141cm.m1238i(2);
                                    iM1238i2 = iM1238i9;
                                } else {
                                    if (c0141cm.m1237h()) {
                                        iM1238i2 = 1;
                                        c = '\b';
                                        c2 = 4;
                                    } else {
                                        int iM1238i10 = c0141cm.m1238i(2);
                                        if (iM1238i10 == 0) {
                                            c = '\b';
                                            c2 = 4;
                                            z3 = true;
                                        } else if (iM1238i10 == 1) {
                                            c = '\b';
                                            c2 = 4;
                                            iM1238i2 = 2;
                                        } else if (iM1238i10 == 2) {
                                            c = '\b';
                                            c2 = 4;
                                            iM1238i2 = c0141cm.m1238i(4) + 12;
                                            iM1238i = c0141cm.m1238i(2);
                                            z3 = z3;
                                        } else if (iM1238i10 != 3) {
                                            z3 = z3;
                                            c = '\b';
                                            c2 = 4;
                                        } else {
                                            c = '\b';
                                            int iM1238i11 = c0141cm.m1238i(8) + 29;
                                            iM1238i = c0141cm.m1238i(2);
                                            z3 = z3;
                                            iM1238i2 = iM1238i11;
                                            c2 = 4;
                                        }
                                        iM1238i = 0;
                                        iM1238i2 = 0;
                                    }
                                    iM1238i = 0;
                                }
                                if (iM1238i2 == 0 && paint != null) {
                                    if (bArr2 != 0) {
                                        iM1238i = bArr2[iM1238i];
                                    }
                                    paint.setColor(iArr[iM1238i]);
                                    canvas.drawRect(i6, i7, i6 + iM1238i2, i7 + 1, paint);
                                }
                                i6 += iM1238i2;
                                if (z3) {
                                    c0141cm.m1232c();
                                } else {
                                    paint = paint;
                                    z3 = z3;
                                }
                            }
                            c = '\b';
                            c2 = 4;
                            if (iM1238i2 == 0) {
                            }
                            i6 += iM1238i2;
                            if (z3) {
                                c0141cm.m1232c();
                            } else {
                                paint = paint;
                                z3 = z3;
                            }
                            break;
                        }
                        break;
                    case 17:
                        byte[] bArr3 = i == 3 ? bArrM868a2 == null ? f1151o : bArrM868a2 : null;
                        boolean z4 = false;
                        while (true) {
                            int iM1238i12 = c0141cm.m1238i(i11);
                            if (iM1238i12 != 0) {
                                z = z4;
                                iM1238i5 = iM1238i12;
                                iM1238i3 = 1;
                            } else if (c0141cm.m1237h()) {
                                if (c0141cm.m1237h()) {
                                    int iM1238i13 = c0141cm.m1238i(i10);
                                    if (iM1238i13 == 0) {
                                        z = z4;
                                        iM1238i3 = 1;
                                    } else if (iM1238i13 != 1) {
                                        if (iM1238i13 == i10) {
                                            iM1238i3 = c0141cm.m1238i(i11) + 9;
                                            iM1238i4 = c0141cm.m1238i(i11);
                                        } else if (iM1238i13 != i9) {
                                            z = z4;
                                            iM1238i3 = 0;
                                        } else {
                                            iM1238i3 = c0141cm.m1238i(i8) + 25;
                                            iM1238i4 = c0141cm.m1238i(i11);
                                        }
                                        iM1238i5 = iM1238i4;
                                    } else {
                                        z = z4;
                                        iM1238i3 = i10;
                                    }
                                    iM1238i5 = 0;
                                } else {
                                    iM1238i3 = c0141cm.m1238i(i10) + 4;
                                    iM1238i5 = c0141cm.m1238i(i11);
                                }
                                z = z4;
                            } else {
                                int iM1238i14 = c0141cm.m1238i(i9);
                                if (iM1238i14 != 0) {
                                    iM1238i3 = iM1238i14 + 2;
                                    z = z4;
                                } else {
                                    z = true;
                                    iM1238i3 = 0;
                                }
                                iM1238i5 = 0;
                            }
                            if (iM1238i3 == 0 || paint == 0) {
                                i4 = i9;
                                i5 = i10;
                            } else {
                                if (bArr3 != 0) {
                                    iM1238i5 = bArr3[iM1238i5];
                                }
                                paint.setColor(iArr[iM1238i5]);
                                i4 = i9;
                                i5 = 2;
                                canvas.drawRect(i6, i7, i6 + iM1238i3, i7 + 1, paint);
                            }
                            i6 += iM1238i3;
                            if (z) {
                                c0141cm.m1232c();
                            } else {
                                z4 = z;
                                i9 = i4;
                                i10 = i5;
                                i11 = 4;
                                i8 = 8;
                            }
                            break;
                        }
                        break;
                    case 18:
                        boolean z5 = false;
                        while (true) {
                            int iM1238i15 = c0141cm.m1238i(8);
                            if (iM1238i15 != 0) {
                                z2 = z5;
                                iM1238i6 = 1;
                            } else if (c0141cm.m1237h()) {
                                z2 = z5;
                                iM1238i6 = c0141cm.m1238i(7);
                                iM1238i15 = c0141cm.m1238i(8);
                            } else {
                                int iM1238i16 = c0141cm.m1238i(7);
                                if (iM1238i16 != 0) {
                                    z2 = z5;
                                    iM1238i6 = iM1238i16;
                                    iM1238i15 = 0;
                                } else {
                                    z2 = true;
                                    iM1238i15 = 0;
                                    iM1238i6 = 0;
                                }
                            }
                            if (iM1238i6 != 0 && paint != 0) {
                                paint.setColor(iArr[iM1238i15]);
                                canvas.drawRect(i6, i7, i6 + iM1238i6, i7 + 1, paint);
                            }
                            i6 += iM1238i6;
                            if (!z2) {
                                z5 = z2;
                            }
                            break;
                        }
                        break;
                    default:
                        switch (iM1238i7) {
                            case 32:
                                bArrM868a3 = m868a(4, 4, c0141cm);
                                break;
                            case InjectionMetrics.I_KEY_EVENTS /* 33 */:
                                bArrM868a = m868a(4, 8, c0141cm);
                                break;
                            case InjectionMetrics.I_TOQUES_ATIVOS /* 34 */:
                                bArrM868a2 = m868a(16, 8, c0141cm);
                                break;
                        }
                        break;
                }
            } else {
                i7 += 2;
                i6 = i2;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static u40 m873f(C0141cm c0141cm, int i) {
        int[] iArr;
        int iM1238i;
        int i2;
        int iM1238i2;
        int iM1238i3;
        int iM1238i4;
        int i3 = 8;
        int iM1238i5 = c0141cm.m1238i(8);
        c0141cm.m1249t(8);
        int i4 = 2;
        int i5 = i - 2;
        int i6 = 0;
        int[] iArr2 = {0, -1, -16777216, -8421505};
        int[] iArrM869b = m869b();
        int[] iArrM870c = m870c();
        while (i5 > 0) {
            int iM1238i6 = c0141cm.m1238i(i3);
            int iM1238i7 = c0141cm.m1238i(i3);
            if ((iM1238i7 & 128) != 0) {
                iArr = iArr2;
            } else {
                iArr = (iM1238i7 & 64) != 0 ? iArrM869b : iArrM870c;
            }
            if ((iM1238i7 & 1) != 0) {
                iM1238i3 = c0141cm.m1238i(i3);
                iM1238i4 = c0141cm.m1238i(i3);
                iM1238i = c0141cm.m1238i(i3);
                iM1238i2 = c0141cm.m1238i(i3);
                i2 = i5 - 6;
            } else {
                int iM1238i8 = c0141cm.m1238i(6) << i4;
                int iM1238i9 = c0141cm.m1238i(4) << 4;
                iM1238i = c0141cm.m1238i(4) << 4;
                i2 = i5 - 4;
                iM1238i2 = c0141cm.m1238i(i4) << 6;
                iM1238i3 = iM1238i8;
                iM1238i4 = iM1238i9;
            }
            if (iM1238i3 == 0) {
                iM1238i4 = i6;
                iM1238i = iM1238i4;
                iM1238i2 = 255;
            }
            double d = iM1238i3;
            double d2 = iM1238i4 - 128;
            double d3 = iM1238i - 128;
            iArr[iM1238i6] = m871d((byte) (255 - (iM1238i2 & 255)), z42.m7233g((int) ((1.402d * d2) + d), 0, 255), z42.m7233g((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255), z42.m7233g((int) ((d3 * 1.772d) + d), 0, 255));
            i5 = i2;
            i6 = 0;
            iM1238i5 = iM1238i5;
            iArrM870c = iArrM870c;
            i3 = 8;
            i4 = 2;
        }
        return new u40(iM1238i5, iArr2, iArrM869b, iArrM870c);
    }

    /* JADX INFO: renamed from: g */
    public static w40 m874g(C0141cm c0141cm) {
        byte[] bArr;
        int iM1238i = c0141cm.m1238i(16);
        c0141cm.m1249t(4);
        int iM1238i2 = c0141cm.m1238i(2);
        boolean zM1237h = c0141cm.m1237h();
        c0141cm.m1249t(1);
        byte[] bArr2 = z42.f13279f;
        if (iM1238i2 != 1) {
            if (iM1238i2 == 0) {
                int iM1238i3 = c0141cm.m1238i(16);
                int iM1238i4 = c0141cm.m1238i(16);
                if (iM1238i3 > 0) {
                    bArr2 = new byte[iM1238i3];
                    c0141cm.m1241l(iM1238i3, bArr2);
                }
                if (iM1238i4 > 0) {
                    bArr = new byte[iM1238i4];
                    c0141cm.m1241l(iM1238i4, bArr);
                }
            }
            return new w40(iM1238i, zM1237h, bArr2, bArr);
        }
        c0141cm.m1249t(c0141cm.m1238i(8) * 16);
        bArr = bArr2;
        return new w40(iM1238i, zM1237h, bArr2, bArr);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:103:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:106:0x0310  */
    /* JADX WARN: Code duplicated, block: B:108:0x0316  */
    /* JADX WARN: Code duplicated, block: B:110:0x0319  */
    /* JADX WARN: Code duplicated, block: B:111:0x031c  */
    /* JADX WARN: Code duplicated, block: B:113:0x0340  */
    /* JADX WARN: Code duplicated, block: B:117:0x036c  */
    /* JADX WARN: Code duplicated, block: B:119:0x0371  */
    /* JADX WARN: Code duplicated, block: B:120:0x0379  */
    /* JADX WARN: Code duplicated, block: B:122:0x037c  */
    /* JADX WARN: Code duplicated, block: B:123:0x0383  */
    /* JADX WARN: Code duplicated, block: B:125:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:86:0x0270  */
    /* JADX WARN: Code duplicated, block: B:94:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:96:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:99:0x02f3  */
    @Override // p000.yx1
    /* JADX INFO: renamed from: r */
    public void mo875r(byte[] bArr, int i, int i2, xx1 xx1Var, InterfaceC0578dt interfaceC0578dt) {
        int i3;
        ArrayList arrayList;
        SparseArray sparseArray;
        int i4;
        C1122mv c1122mv;
        y40 y40Var;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        u40 u40Var;
        SparseArray sparseArray2;
        int i11;
        y40 y40Var2;
        int i12;
        int i13;
        char c;
        char c2;
        int i14;
        int i15;
        char c3;
        int i16;
        int iKeyAt;
        z40 z40Var;
        w40 w40Var;
        w40 w40Var2;
        y40 y40Var3;
        int i17;
        int i18;
        int i19;
        Paint paint;
        int i20;
        int[] iArr;
        y40 y40Var4;
        int iM1238i;
        int iM1238i2;
        int i21;
        int iM1238i3;
        C0141cm c0141cm = new C0141cm(bArr, i + i2);
        c0141cm.m1246q(i);
        Paint paint2 = (Paint) this.f1153b;
        Canvas canvas = (Canvas) this.f1154c;
        a50 a50Var = (a50) this.f1157f;
        while (c0141cm.m1231b() >= 48 && c0141cm.m1238i(8) == 15) {
            int iM1238i4 = c0141cm.m1238i(8);
            int i22 = 16;
            int iM1238i5 = c0141cm.m1238i(16);
            int iM1238i6 = c0141cm.m1238i(16);
            int iM1235f = c0141cm.m1235f() + iM1238i6;
            if (iM1238i6 * 8 > c0141cm.m1231b()) {
                AbstractC1337qm.m5542i0("DvbParser", "Data field length exceeds limit");
                c0141cm.m1249t(c0141cm.m1231b());
            } else {
                int i23 = 4;
                switch (iM1238i4) {
                    case 16:
                        if (iM1238i5 == a50Var.f52a) {
                            l91 l91Var = a50Var.f60i;
                            int i24 = 8;
                            c0141cm.m1238i(8);
                            int iM1238i7 = c0141cm.m1238i(4);
                            int iM1238i8 = c0141cm.m1238i(2);
                            c0141cm.m1249t(2);
                            int i25 = iM1238i6 - 2;
                            SparseArray sparseArray3 = new SparseArray();
                            while (i25 > 0) {
                                int iM1238i9 = c0141cm.m1238i(i24);
                                c0141cm.m1249t(i24);
                                i25 -= 6;
                                sparseArray3.put(iM1238i9, new x40(c0141cm.m1238i(16), c0141cm.m1238i(16)));
                                i24 = 8;
                            }
                            l91 l91Var2 = new l91(iM1238i7, iM1238i8, sparseArray3);
                            if (iM1238i8 != 0) {
                                a50Var.f60i = l91Var2;
                                a50Var.f54c.clear();
                                a50Var.f55d.clear();
                                a50Var.f56e.clear();
                            } else if (l91Var != null && l91Var.f6278b != iM1238i7) {
                                a50Var.f60i = l91Var2;
                            }
                        }
                        break;
                    case 17:
                        l91 l91Var3 = a50Var.f60i;
                        SparseArray sparseArray4 = a50Var.f54c;
                        if (iM1238i5 == a50Var.f52a && l91Var3 != null) {
                            int iM1238i10 = c0141cm.m1238i(8);
                            c0141cm.m1249t(4);
                            boolean zM1237h = c0141cm.m1237h();
                            c0141cm.m1249t(3);
                            int iM1238i11 = c0141cm.m1238i(16);
                            int iM1238i12 = c0141cm.m1238i(16);
                            c0141cm.m1238i(3);
                            int iM1238i13 = c0141cm.m1238i(3);
                            c0141cm.m1249t(2);
                            int iM1238i14 = c0141cm.m1238i(8);
                            int iM1238i15 = c0141cm.m1238i(8);
                            int iM1238i16 = c0141cm.m1238i(4);
                            int iM1238i17 = c0141cm.m1238i(2);
                            c0141cm.m1249t(2);
                            int i26 = iM1238i6 - 10;
                            SparseArray sparseArray5 = new SparseArray();
                            while (i26 > 0) {
                                int iM1238i18 = c0141cm.m1238i(i22);
                                int iM1238i19 = c0141cm.m1238i(2);
                                c0141cm.m1238i(2);
                                int iM1238i20 = c0141cm.m1238i(12);
                                c0141cm.m1249t(i23);
                                int iM1238i21 = c0141cm.m1238i(12);
                                int i27 = i26 - 6;
                                if (iM1238i19 == 1 || iM1238i19 == 2) {
                                    c0141cm.m1238i(8);
                                    c0141cm.m1238i(8);
                                    i26 -= 8;
                                } else {
                                    i26 = i27;
                                }
                                sparseArray5.put(iM1238i18, new z40(iM1238i20, iM1238i21));
                                i23 = 4;
                                i22 = 16;
                            }
                            y40 y40Var5 = new y40(iM1238i10, zM1237h, iM1238i11, iM1238i12, iM1238i13, iM1238i14, iM1238i15, iM1238i16, iM1238i17, sparseArray5);
                            if (l91Var3.f6279c == 0 && (y40Var4 = (y40) sparseArray4.get(iM1238i10)) != null) {
                                SparseArray sparseArray6 = y40Var4.f12841j;
                                for (int i28 = 0; i28 < sparseArray6.size(); i28++) {
                                    y40Var5.f12841j.put(sparseArray6.keyAt(i28), (z40) sparseArray6.valueAt(i28));
                                }
                            }
                            sparseArray4.put(y40Var5.f12832a, y40Var5);
                        }
                        break;
                    case 18:
                        if (iM1238i5 == a50Var.f52a) {
                            u40 u40VarM873f = m873f(c0141cm, iM1238i6);
                            a50Var.f55d.put(u40VarM873f.f11116a, u40VarM873f);
                        } else if (iM1238i5 == a50Var.f53b) {
                            u40 u40VarM873f2 = m873f(c0141cm, iM1238i6);
                            a50Var.f57f.put(u40VarM873f2.f11116a, u40VarM873f2);
                        }
                        break;
                    case 19:
                        if (iM1238i5 == a50Var.f52a) {
                            w40 w40VarM874g = m874g(c0141cm);
                            a50Var.f56e.put(w40VarM874g.f11965a, w40VarM874g);
                        } else if (iM1238i5 == a50Var.f53b) {
                            w40 w40VarM874g2 = m874g(c0141cm);
                            a50Var.f58g.put(w40VarM874g2.f11965a, w40VarM874g2);
                        }
                        break;
                    case 20:
                        if (iM1238i5 == a50Var.f52a) {
                            c0141cm.m1249t(4);
                            boolean zM1237h2 = c0141cm.m1237h();
                            c0141cm.m1249t(3);
                            int iM1238i22 = c0141cm.m1238i(16);
                            int iM1238i23 = c0141cm.m1238i(16);
                            if (zM1237h2) {
                                int iM1238i24 = c0141cm.m1238i(16);
                                iM1238i = c0141cm.m1238i(16);
                                iM1238i3 = c0141cm.m1238i(16);
                                iM1238i2 = c0141cm.m1238i(16);
                                i21 = iM1238i24;
                            } else {
                                iM1238i = iM1238i22;
                                iM1238i2 = iM1238i23;
                                i21 = 0;
                                iM1238i3 = 0;
                            }
                            a50Var.f59h = new v40(iM1238i22, iM1238i23, i21, iM1238i, iM1238i3, iM1238i2);
                        }
                        break;
                }
                c0141cm.m1250u(iM1235f - c0141cm.m1235f());
            }
        }
        l91 l91Var4 = a50Var.f60i;
        if (l91Var4 == null) {
            om0 om0Var = qm0.f9540b;
            c1122mv = new C1122mv(kk1.f5896e, -9223372036854775807L, -9223372036854775807L);
        } else {
            v40 v40Var = a50Var.f59h;
            if (v40Var == null) {
                v40Var = (v40) this.f1155d;
            }
            Bitmap bitmap = (Bitmap) this.f1158g;
            if (bitmap != null) {
                i3 = 1;
                if (v40Var.f11510a + 1 != bitmap.getWidth() || v40Var.f11511b + 1 != ((Bitmap) this.f1158g).getHeight()) {
                }
                arrayList = new ArrayList();
                sparseArray = (SparseArray) l91Var4.f6280d;
                i4 = 0;
                while (i4 < sparseArray.size()) {
                    canvas.save();
                    x40 x40Var = (x40) sparseArray.valueAt(i4);
                    y40Var = (y40) a50Var.f54c.get(sparseArray.keyAt(i4));
                    i5 = x40Var.f12449a + v40Var.f11512c;
                    i6 = x40Var.f12450b + v40Var.f11514e;
                    i7 = y40Var.f12834c;
                    int i29 = y40Var.f12837f;
                    i8 = y40Var.f12835d;
                    i9 = i5 + i7;
                    i10 = i6 + i8;
                    SparseArray sparseArray7 = sparseArray;
                    canvas.clipRect(i5, i6, Math.min(i9, v40Var.f11513d), Math.min(i10, v40Var.f11515f));
                    u40Var = (u40) a50Var.f55d.get(i29);
                    if (u40Var == null && (u40Var = (u40) a50Var.f57f.get(i29)) == null) {
                        u40Var = (u40) this.f1156e;
                    }
                    sparseArray2 = y40Var.f12841j;
                    v40 v40Var2 = v40Var;
                    i11 = 0;
                    while (i11 < sparseArray2.size()) {
                        iKeyAt = sparseArray2.keyAt(i11);
                        int i30 = i4;
                        z40Var = (z40) sparseArray2.valueAt(i11);
                        SparseArray sparseArray8 = sparseArray2;
                        w40Var = (w40) a50Var.f56e.get(iKeyAt);
                        if (w40Var == null) {
                            w40Var = (w40) a50Var.f58g.get(iKeyAt);
                        }
                        w40Var2 = w40Var;
                        if (w40Var2 != null) {
                            if (w40Var2.f11966b) {
                                paint = null;
                            } else {
                                paint = (Paint) this.f1152a;
                            }
                            int i31 = i5;
                            i20 = y40Var.f12836e;
                            int i32 = i31 + z40Var.f13272a;
                            int i33 = z40Var.f13273b + i6;
                            if (i20 == 3) {
                                iArr = u40Var.f11119d;
                            } else if (i20 == 2) {
                                iArr = u40Var.f11118c;
                            } else {
                                iArr = u40Var.f11117b;
                            }
                            int i34 = i8;
                            Paint paint3 = paint;
                            y40 y40Var6 = y40Var;
                            int[] iArr2 = iArr;
                            y40Var3 = y40Var6;
                            i17 = i31;
                            i18 = i11;
                            i19 = i34;
                            m872e(w40Var2.f11967c, iArr2, i20, i32, i33, paint3, canvas);
                            m872e(w40Var2.f11968d, iArr2, i20, i32, i33 + 1, paint3, canvas);
                        } else {
                            y40Var3 = y40Var;
                            i17 = i5;
                            i18 = i11;
                            i19 = i8;
                        }
                        i11 = i18 + 1;
                        y40Var = y40Var3;
                        i5 = i17;
                        sparseArray2 = sparseArray8;
                        i4 = i30;
                        a50Var = a50Var;
                        i7 = i7;
                        i8 = i19;
                    }
                    a50 a50Var2 = a50Var;
                    int i35 = i4;
                    y40Var2 = y40Var;
                    i12 = i5;
                    int i36 = i7;
                    int i37 = i8;
                    if (y40Var2.f12833b) {
                        i15 = y40Var2.f12836e;
                        if (i15 == 3) {
                            i16 = u40Var.f11119d[y40Var2.f12838g];
                            c3 = 2;
                        } else {
                            c3 = 2;
                            if (i15 == 2) {
                                i16 = u40Var.f11118c[y40Var2.f12839h];
                            } else {
                                i16 = u40Var.f11117b[y40Var2.f12840i];
                            }
                        }
                        paint2.setColor(i16);
                        i13 = i12;
                        c2 = c3;
                        i14 = 0;
                        c = 3;
                        canvas.drawRect(i13, i6, i9, i10, paint2);
                    } else {
                        i13 = i12;
                        c = 3;
                        c2 = 2;
                        i14 = 0;
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap((Bitmap) this.f1158g, i13, i6, i36, i37);
                    float f = v40Var2.f11510a;
                    float f2 = i6;
                    float f3 = v40Var2.f11511b;
                    arrayList.add(new C0805jv(null, null, null, bitmapCreateBitmap, f2 / f3, 0, 0, i13 / f, 0, Integer.MIN_VALUE, -3.4028235E38f, i36 / f, i37 / f3, false, -16777216, Integer.MIN_VALUE, TouchPipeline.SIZE));
                    canvas.drawColor(i14, PorterDuff.Mode.CLEAR);
                    canvas.restore();
                    i4 = i35 + 1;
                    v40Var = v40Var2;
                    arrayList = arrayList;
                    sparseArray = sparseArray7;
                    a50Var = a50Var2;
                }
                c1122mv = new C1122mv(arrayList, -9223372036854775807L, -9223372036854775807L);
            } else {
                i3 = 1;
            }
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(v40Var.f11510a + i3, v40Var.f11511b + i3, Bitmap.Config.ARGB_8888);
            this.f1158g = bitmapCreateBitmap2;
            canvas.setBitmap(bitmapCreateBitmap2);
            arrayList = new ArrayList();
            sparseArray = (SparseArray) l91Var4.f6280d;
            i4 = 0;
            while (i4 < sparseArray.size()) {
                canvas.save();
                x40 x40Var2 = (x40) sparseArray.valueAt(i4);
                y40Var = (y40) a50Var.f54c.get(sparseArray.keyAt(i4));
                i5 = x40Var2.f12449a + v40Var.f11512c;
                i6 = x40Var2.f12450b + v40Var.f11514e;
                i7 = y40Var.f12834c;
                int i210 = y40Var.f12837f;
                i8 = y40Var.f12835d;
                i9 = i5 + i7;
                i10 = i6 + i8;
                SparseArray sparseArray9 = sparseArray;
                canvas.clipRect(i5, i6, Math.min(i9, v40Var.f11513d), Math.min(i10, v40Var.f11515f));
                u40Var = (u40) a50Var.f55d.get(i210);
                if (u40Var == null) {
                    u40Var = (u40) this.f1156e;
                }
                sparseArray2 = y40Var.f12841j;
                v40 v40Var3 = v40Var;
                i11 = 0;
                while (i11 < sparseArray2.size()) {
                    iKeyAt = sparseArray2.keyAt(i11);
                    int i38 = i4;
                    z40Var = (z40) sparseArray2.valueAt(i11);
                    SparseArray sparseArray10 = sparseArray2;
                    w40Var = (w40) a50Var.f56e.get(iKeyAt);
                    if (w40Var == null) {
                        w40Var = (w40) a50Var.f58g.get(iKeyAt);
                    }
                    w40Var2 = w40Var;
                    if (w40Var2 != null) {
                        if (w40Var2.f11966b) {
                            paint = null;
                        } else {
                            paint = (Paint) this.f1152a;
                        }
                        int i39 = i5;
                        i20 = y40Var.f12836e;
                        int i310 = i39 + z40Var.f13272a;
                        int i311 = z40Var.f13273b + i6;
                        if (i20 == 3) {
                            iArr = u40Var.f11119d;
                        } else if (i20 == 2) {
                            iArr = u40Var.f11118c;
                        } else {
                            iArr = u40Var.f11117b;
                        }
                        int i312 = i8;
                        Paint paint4 = paint;
                        y40 y40Var7 = y40Var;
                        int[] iArr3 = iArr;
                        y40Var3 = y40Var7;
                        i17 = i39;
                        i18 = i11;
                        i19 = i312;
                        m872e(w40Var2.f11967c, iArr3, i20, i310, i311, paint4, canvas);
                        m872e(w40Var2.f11968d, iArr3, i20, i310, i311 + 1, paint4, canvas);
                    } else {
                        y40Var3 = y40Var;
                        i17 = i5;
                        i18 = i11;
                        i19 = i8;
                    }
                    i11 = i18 + 1;
                    y40Var = y40Var3;
                    i5 = i17;
                    sparseArray2 = sparseArray10;
                    i4 = i38;
                    a50Var = a50Var;
                    i7 = i7;
                    i8 = i19;
                }
                a50 a50Var3 = a50Var;
                int i313 = i4;
                y40Var2 = y40Var;
                i12 = i5;
                int i314 = i7;
                int i315 = i8;
                if (y40Var2.f12833b) {
                    i15 = y40Var2.f12836e;
                    if (i15 == 3) {
                        i16 = u40Var.f11119d[y40Var2.f12838g];
                        c3 = 2;
                    } else {
                        c3 = 2;
                        if (i15 == 2) {
                            i16 = u40Var.f11118c[y40Var2.f12839h];
                        } else {
                            i16 = u40Var.f11117b[y40Var2.f12840i];
                        }
                    }
                    paint2.setColor(i16);
                    i13 = i12;
                    c2 = c3;
                    i14 = 0;
                    c = 3;
                    canvas.drawRect(i13, i6, i9, i10, paint2);
                } else {
                    i13 = i12;
                    c = 3;
                    c2 = 2;
                    i14 = 0;
                }
                Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap((Bitmap) this.f1158g, i13, i6, i314, i315);
                float f4 = v40Var3.f11510a;
                float f5 = i6;
                float f6 = v40Var3.f11511b;
                arrayList.add(new C0805jv(null, null, null, bitmapCreateBitmap3, f5 / f6, 0, 0, i13 / f4, 0, Integer.MIN_VALUE, -3.4028235E38f, i314 / f4, i315 / f6, false, -16777216, Integer.MIN_VALUE, TouchPipeline.SIZE));
                canvas.drawColor(i14, PorterDuff.Mode.CLEAR);
                canvas.restore();
                i4 = i313 + 1;
                v40Var = v40Var3;
                arrayList = arrayList;
                sparseArray = sparseArray9;
                a50Var = a50Var3;
            }
            c1122mv = new C1122mv(arrayList, -9223372036854775807L, -9223372036854775807L);
        }
        interfaceC0578dt.accept(c1122mv);
    }

    @Override // p000.yx1
    public void reset() {
        a50 a50Var = (a50) this.f1157f;
        a50Var.f54c.clear();
        a50Var.f55d.clear();
        a50Var.f56e.clear();
        a50Var.f57f.clear();
        a50Var.f58g.clear();
        a50Var.f59h = null;
        a50Var.f60i = null;
    }
}
