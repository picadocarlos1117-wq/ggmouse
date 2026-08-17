package p000;

import android.sun.security.util.DerValue;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: dm */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0572dm extends AbstractC0682gm {

    /* JADX INFO: renamed from: h */
    public final dc1 f2965h = new dc1();

    /* JADX INFO: renamed from: i */
    public final C0141cm f2966i = new C0141cm();

    /* JADX INFO: renamed from: j */
    public int f2967j = -1;

    /* JADX INFO: renamed from: k */
    public final int f2968k;

    /* JADX INFO: renamed from: l */
    public final C0104bm[] f2969l;

    /* JADX INFO: renamed from: m */
    public C0104bm f2970m;

    /* JADX INFO: renamed from: n */
    public List f2971n;

    /* JADX INFO: renamed from: o */
    public List f2972o;

    /* JADX INFO: renamed from: p */
    public C0141cm f2973p;

    /* JADX INFO: renamed from: q */
    public int f2974q;

    public C0572dm(int i, List list) {
        this.f2968k = i == -1 ? 1 : i;
        if (list != null) {
            byte[] bArr = AbstractC0574dp.f2986a;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b = ((byte[]) list.get(0))[0];
            }
        }
        this.f2969l = new C0104bm[8];
        int i2 = 0;
        while (true) {
            C0104bm[] c0104bmArr = this.f2969l;
            if (i2 >= 8) {
                this.f2970m = c0104bmArr[0];
                return;
            } else {
                c0104bmArr[i2] = new C0104bm();
                i2++;
            }
        }
    }

    @Override // p000.AbstractC0682gm
    /* JADX INFO: renamed from: f */
    public final C0719hm mo2367f() {
        List list = this.f2971n;
        this.f2972o = list;
        list.getClass();
        return new C0719hm(list);
    }

    @Override // p000.AbstractC0682gm, p000.InterfaceC1385rx
    public final void flush() {
        super.flush();
        this.f2971n = null;
        this.f2972o = null;
        this.f2974q = 0;
        this.f2970m = this.f2969l[0];
        m2372l();
        this.f2973p = null;
    }

    @Override // p000.AbstractC0682gm
    /* JADX INFO: renamed from: g */
    public final void mo2368g(C0608em c0608em) {
        ByteBuffer byteBuffer = c0608em.f11795n;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        dc1 dc1Var = this.f2965h;
        dc1Var.m2314D(iLimit, bArrArray);
        while (dc1Var.m2318a() >= 3) {
            int iM2337t = dc1Var.m2337t();
            int i = iM2337t & 3;
            boolean z = (iM2337t & 4) == 4;
            byte bM2337t = (byte) dc1Var.m2337t();
            byte bM2337t2 = (byte) dc1Var.m2337t();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        m2370j();
                        int i2 = (bM2337t & DerValue.TAG_PRIVATE) >> 6;
                        int i3 = this.f2967j;
                        if (i3 != -1 && i2 != (i3 + 1) % 4) {
                            m2372l();
                            AbstractC1337qm.m5542i0("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f2967j + " current=" + i2);
                        }
                        this.f2967j = i2;
                        int i4 = bM2337t & 63;
                        if (i4 == 0) {
                            i4 = 64;
                        }
                        C0141cm c0141cm = new C0141cm(i2, i4);
                        this.f2973p = c0141cm;
                        byte[] bArr = c0141cm.f1858b;
                        c0141cm.f1861e = 1;
                        bArr[0] = bM2337t2;
                    } else {
                        ki0.m3857c(i == 2);
                        C0141cm c0141cm2 = this.f2973p;
                        if (c0141cm2 == null) {
                            AbstractC1337qm.m5549m("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = c0141cm2.f1858b;
                            int i5 = c0141cm2.f1861e;
                            int i6 = i5 + 1;
                            c0141cm2.f1861e = i6;
                            bArr2[i5] = bM2337t;
                            c0141cm2.f1861e = i5 + 2;
                            bArr2[i6] = bM2337t2;
                        }
                    }
                    C0141cm c0141cm3 = this.f2973p;
                    if (c0141cm3.f1861e == (c0141cm3.f1860d * 2) - 1) {
                        m2370j();
                    }
                }
            }
        }
    }

    @Override // p000.AbstractC0682gm
    /* JADX INFO: renamed from: i */
    public final boolean mo2369i() {
        return this.f2971n != this.f2972o;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:228:0x053d  */
    /* JADX INFO: renamed from: j */
    public final void m2370j() {
        char c;
        boolean z;
        C0141cm c0141cm = this.f2973p;
        if (c0141cm == null) {
            return;
        }
        int i = 2;
        if (c0141cm.f1861e != (c0141cm.f1860d * 2) - 1) {
            AbstractC1337qm.m5547l("DtvCcPacket ended prematurely; size is " + ((this.f2973p.f1860d * 2) - 1) + ", but current index is " + this.f2973p.f1861e + " (sequence number " + this.f2973p.f1859c + ");");
        }
        C0141cm c0141cm2 = this.f2973p;
        byte[] bArr = c0141cm2.f1858b;
        int i2 = c0141cm2.f1861e;
        C0141cm c0141cm3 = this.f2966i;
        c0141cm3.m1244o(i2, bArr);
        boolean z2 = false;
        while (c0141cm3.m1231b() > 0) {
            int i3 = 3;
            int iM1238i = c0141cm3.m1238i(3);
            int iM1238i2 = c0141cm3.m1238i(5);
            if (iM1238i == 7) {
                c0141cm3.m1249t(i);
                iM1238i = c0141cm3.m1238i(6);
                if (iM1238i < 7) {
                    jd0.m3621s(iM1238i, "Invalid extended service number: ", "Cea708Decoder");
                }
            }
            if (iM1238i2 == 0) {
                if (iM1238i != 0) {
                    AbstractC1337qm.m5542i0("Cea708Decoder", "serviceNumber is non-zero (" + iM1238i + ") when blockSize is 0");
                }
                if (z2) {
                    this.f2971n = m2371k();
                }
                this.f2973p = null;
            }
            if (iM1238i != this.f2968k) {
                c0141cm3.m1250u(iM1238i2);
            } else {
                int iM1236g = (iM1238i2 * 8) + c0141cm3.m1236g();
                while (c0141cm3.m1236g() < iM1236g) {
                    int iM1238i3 = c0141cm3.m1238i(8);
                    if (iM1238i3 != 16) {
                        if (iM1238i3 <= 31) {
                            if (iM1238i3 != 0) {
                                if (iM1238i3 == i3) {
                                    this.f2971n = m2371k();
                                } else if (iM1238i3 != 8) {
                                    switch (iM1238i3) {
                                        case 12:
                                            m2372l();
                                            break;
                                        case 13:
                                            this.f2970m.m1002a('\n');
                                            break;
                                        case 14:
                                            break;
                                        default:
                                            if (iM1238i3 >= 17 && iM1238i3 <= 23) {
                                                AbstractC1337qm.m5542i0("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + iM1238i3);
                                                c0141cm3.m1249t(8);
                                            } else if (iM1238i3 < 24 || iM1238i3 > 31) {
                                                jd0.m3621s(iM1238i3, "Invalid C0 command: ", "Cea708Decoder");
                                            } else {
                                                AbstractC1337qm.m5542i0("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + iM1238i3);
                                                c0141cm3.m1249t(16);
                                            }
                                            break;
                                    }
                                } else {
                                    SpannableStringBuilder spannableStringBuilder = this.f2970m.f1412b;
                                    int length = spannableStringBuilder.length();
                                    if (length > 0) {
                                        spannableStringBuilder.delete(length - 1, length);
                                    }
                                }
                            }
                        } else if (iM1238i3 <= 127) {
                            C0104bm c0104bm = this.f2970m;
                            if (iM1238i3 == 127) {
                                c0104bm.m1002a((char) 9835);
                            } else {
                                c0104bm.m1002a((char) (iM1238i3 & 255));
                            }
                            z2 = true;
                        } else {
                            if (iM1238i3 <= 159) {
                                C0104bm[] c0104bmArr = this.f2969l;
                                switch (iM1238i3) {
                                    case 128:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case 132:
                                    case 133:
                                    case 134:
                                    case 135:
                                        z = true;
                                        int i4 = iM1238i3 - 128;
                                        if (this.f2974q != i4) {
                                            this.f2974q = i4;
                                            this.f2970m = c0104bmArr[i4];
                                        }
                                        break;
                                    case 136:
                                        z = true;
                                        for (int i5 = 1; i5 <= 8; i5++) {
                                            if (c0141cm3.m1237h()) {
                                                C0104bm c0104bm2 = c0104bmArr[8 - i5];
                                                c0104bm2.f1411a.clear();
                                                c0104bm2.f1412b.clear();
                                                c0104bm2.f1425o = -1;
                                                c0104bm2.f1426p = -1;
                                                c0104bm2.f1427q = -1;
                                                c0104bm2.f1429s = -1;
                                                c0104bm2.f1431u = 0;
                                            }
                                        }
                                        break;
                                    case 137:
                                        for (int i6 = 1; i6 <= 8; i6++) {
                                            if (c0141cm3.m1237h()) {
                                                c0104bmArr[8 - i6].f1414d = true;
                                            }
                                        }
                                        z = true;
                                        break;
                                    case 138:
                                        for (int i7 = 1; i7 <= 8; i7++) {
                                            if (c0141cm3.m1237h()) {
                                                c0104bmArr[8 - i7].f1414d = false;
                                            }
                                        }
                                        z = true;
                                        break;
                                    case 139:
                                        for (int i8 = 1; i8 <= 8; i8++) {
                                            if (c0141cm3.m1237h()) {
                                                C0104bm c0104bm3 = c0104bmArr[8 - i8];
                                                c0104bm3.f1414d = !c0104bm3.f1414d;
                                            }
                                        }
                                        z = true;
                                        break;
                                    case 140:
                                        for (int i9 = 1; i9 <= 8; i9++) {
                                            if (c0141cm3.m1237h()) {
                                                c0104bmArr[8 - i9].m1004d();
                                            }
                                        }
                                        z = true;
                                        break;
                                    case 141:
                                        c0141cm3.m1249t(8);
                                        z = true;
                                        break;
                                    case 142:
                                        z = true;
                                        break;
                                    case 143:
                                        m2372l();
                                        z = true;
                                        break;
                                    case 144:
                                        int i10 = i;
                                        if (this.f2970m.f1413c) {
                                            c0141cm3.m1238i(4);
                                            c0141cm3.m1238i(i10);
                                            c0141cm3.m1238i(i10);
                                            boolean zM1237h = c0141cm3.m1237h();
                                            boolean zM1237h2 = c0141cm3.m1237h();
                                            i3 = 3;
                                            c0141cm3.m1238i(3);
                                            c0141cm3.m1238i(3);
                                            this.f2970m.m1005e(zM1237h, zM1237h2);
                                            z = true;
                                        } else {
                                            c0141cm3.m1249t(16);
                                            z = true;
                                            i3 = 3;
                                        }
                                        break;
                                    case 145:
                                        if (this.f2970m.f1413c) {
                                            int iM1001c = C0104bm.m1001c(c0141cm3.m1238i(2), c0141cm3.m1238i(2), c0141cm3.m1238i(2), c0141cm3.m1238i(2));
                                            int iM1001c2 = C0104bm.m1001c(c0141cm3.m1238i(2), c0141cm3.m1238i(2), c0141cm3.m1238i(2), c0141cm3.m1238i(2));
                                            c0141cm3.m1249t(2);
                                            C0104bm.m1001c(c0141cm3.m1238i(2), c0141cm3.m1238i(2), c0141cm3.m1238i(2), 0);
                                            this.f2970m.m1006f(iM1001c, iM1001c2);
                                        } else {
                                            c0141cm3.m1249t(24);
                                        }
                                        z = true;
                                        i3 = 3;
                                        break;
                                    case 146:
                                        if (this.f2970m.f1413c) {
                                            c0141cm3.m1249t(4);
                                            int iM1238i4 = c0141cm3.m1238i(4);
                                            c0141cm3.m1249t(2);
                                            c0141cm3.m1238i(6);
                                            C0104bm c0104bm4 = this.f2970m;
                                            if (c0104bm4.f1431u != iM1238i4) {
                                                c0104bm4.m1002a('\n');
                                            }
                                            c0104bm4.f1431u = iM1238i4;
                                        } else {
                                            c0141cm3.m1249t(16);
                                        }
                                        z = true;
                                        i3 = 3;
                                        break;
                                    case 147:
                                    case 148:
                                    case 149:
                                    case 150:
                                    default:
                                        jd0.m3621s(iM1238i3, "Invalid C1 command: ", "Cea708Decoder");
                                        z = true;
                                        break;
                                    case 151:
                                        if (this.f2970m.f1413c) {
                                            int iM1001c3 = C0104bm.m1001c(c0141cm3.m1238i(2), c0141cm3.m1238i(2), c0141cm3.m1238i(2), c0141cm3.m1238i(2));
                                            c0141cm3.m1238i(2);
                                            C0104bm.m1001c(c0141cm3.m1238i(2), c0141cm3.m1238i(2), c0141cm3.m1238i(2), 0);
                                            c0141cm3.m1237h();
                                            c0141cm3.m1237h();
                                            c0141cm3.m1238i(2);
                                            c0141cm3.m1238i(2);
                                            int iM1238i5 = c0141cm3.m1238i(2);
                                            c0141cm3.m1249t(8);
                                            C0104bm c0104bm5 = this.f2970m;
                                            c0104bm5.f1424n = iM1001c3;
                                            c0104bm5.f1421k = iM1238i5;
                                        } else {
                                            c0141cm3.m1249t(32);
                                        }
                                        z = true;
                                        i3 = 3;
                                        break;
                                    case 152:
                                    case 153:
                                    case 154:
                                    case 155:
                                    case 156:
                                    case 157:
                                    case 158:
                                    case 159:
                                        int i11 = iM1238i3 - 152;
                                        C0104bm c0104bm6 = c0104bmArr[i11];
                                        c0141cm3.m1249t(i);
                                        boolean zM1237h3 = c0141cm3.m1237h();
                                        c0141cm3.m1249t(i);
                                        int iM1238i6 = c0141cm3.m1238i(i3);
                                        boolean zM1237h4 = c0141cm3.m1237h();
                                        int iM1238i7 = c0141cm3.m1238i(7);
                                        int iM1238i8 = c0141cm3.m1238i(8);
                                        int iM1238i9 = c0141cm3.m1238i(4);
                                        int iM1238i10 = c0141cm3.m1238i(4);
                                        c0141cm3.m1249t(i);
                                        c0141cm3.m1249t(6);
                                        c0141cm3.m1249t(i);
                                        int iM1238i11 = c0141cm3.m1238i(3);
                                        int iM1238i12 = c0141cm3.m1238i(3);
                                        ArrayList arrayList = c0104bm6.f1411a;
                                        c0104bm6.f1413c = true;
                                        c0104bm6.f1414d = zM1237h3;
                                        c0104bm6.f1415e = iM1238i6;
                                        c0104bm6.f1416f = zM1237h4;
                                        c0104bm6.f1417g = iM1238i7;
                                        c0104bm6.f1418h = iM1238i8;
                                        c0104bm6.f1419i = iM1238i9;
                                        int i12 = iM1238i10 + 1;
                                        if (c0104bm6.f1420j != i12) {
                                            c0104bm6.f1420j = i12;
                                            while (true) {
                                                if (arrayList.size() >= c0104bm6.f1420j || arrayList.size() >= 15) {
                                                    arrayList.remove(0);
                                                }
                                            }
                                        }
                                        if (iM1238i11 != 0 && c0104bm6.f1422l != iM1238i11) {
                                            c0104bm6.f1422l = iM1238i11;
                                            int i13 = iM1238i11 - 1;
                                            int i14 = C0104bm.f1402B[i13];
                                            boolean z3 = C0104bm.f1401A[i13];
                                            int i15 = C0104bm.f1409y[i13];
                                            int i16 = C0104bm.f1410z[i13];
                                            int i17 = C0104bm.f1408x[i13];
                                            c0104bm6.f1424n = i14;
                                            c0104bm6.f1421k = i17;
                                        }
                                        if (iM1238i12 != 0 && c0104bm6.f1423m != iM1238i12) {
                                            c0104bm6.f1423m = iM1238i12;
                                            int i18 = iM1238i12 - 1;
                                            int i19 = C0104bm.f1404D[i18];
                                            int i20 = C0104bm.f1403C[i18];
                                            c0104bm6.m1005e(false, false);
                                            c0104bm6.m1006f(C0104bm.f1406v, C0104bm.f1405E[i18]);
                                        }
                                        if (this.f2974q != i11) {
                                            this.f2974q = i11;
                                            this.f2970m = c0104bmArr[i11];
                                        }
                                        z = true;
                                        i3 = 3;
                                        break;
                                }
                            } else {
                                z = true;
                                if (iM1238i3 <= 255) {
                                    this.f2970m.m1002a((char) (iM1238i3 & 255));
                                } else {
                                    jd0.m3621s(iM1238i3, "Invalid base command: ", "Cea708Decoder");
                                }
                                i = 2;
                                c = 7;
                            }
                            z2 = z;
                            i = 2;
                            c = 7;
                        }
                        c = 7;
                    } else {
                        int iM1238i13 = c0141cm3.m1238i(8);
                        if (iM1238i13 <= 31) {
                            c = 7;
                            if (iM1238i13 > 7) {
                                if (iM1238i13 <= 15) {
                                    c0141cm3.m1249t(8);
                                } else if (iM1238i13 <= 23) {
                                    c0141cm3.m1249t(16);
                                } else if (iM1238i13 <= 31) {
                                    c0141cm3.m1249t(24);
                                }
                            }
                        } else {
                            c = 7;
                            if (iM1238i13 <= 127) {
                                if (iM1238i13 == 32) {
                                    this.f2970m.m1002a(' ');
                                } else if (iM1238i13 == 33) {
                                    this.f2970m.m1002a((char) 160);
                                } else if (iM1238i13 == 37) {
                                    this.f2970m.m1002a((char) 8230);
                                } else if (iM1238i13 == 42) {
                                    this.f2970m.m1002a((char) 352);
                                } else if (iM1238i13 == 44) {
                                    this.f2970m.m1002a((char) 338);
                                } else if (iM1238i13 == 63) {
                                    this.f2970m.m1002a((char) 376);
                                } else if (iM1238i13 == 57) {
                                    this.f2970m.m1002a((char) 8482);
                                } else if (iM1238i13 == 58) {
                                    this.f2970m.m1002a((char) 353);
                                } else if (iM1238i13 == 60) {
                                    this.f2970m.m1002a((char) 339);
                                } else if (iM1238i13 != 61) {
                                    switch (iM1238i13) {
                                        case 48:
                                            this.f2970m.m1002a((char) 9608);
                                            break;
                                        case 49:
                                            this.f2970m.m1002a((char) 8216);
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            this.f2970m.m1002a((char) 8217);
                                            break;
                                        case 51:
                                            this.f2970m.m1002a((char) 8220);
                                            break;
                                        case 52:
                                            this.f2970m.m1002a((char) 8221);
                                            break;
                                        case 53:
                                            this.f2970m.m1002a((char) 8226);
                                            break;
                                        default:
                                            switch (iM1238i13) {
                                                case 118:
                                                    this.f2970m.m1002a((char) 8539);
                                                    break;
                                                case 119:
                                                    this.f2970m.m1002a((char) 8540);
                                                    break;
                                                case 120:
                                                    this.f2970m.m1002a((char) 8541);
                                                    break;
                                                case 121:
                                                    this.f2970m.m1002a((char) 8542);
                                                    break;
                                                case 122:
                                                    this.f2970m.m1002a((char) 9474);
                                                    break;
                                                case 123:
                                                    this.f2970m.m1002a((char) 9488);
                                                    break;
                                                case 124:
                                                    this.f2970m.m1002a((char) 9492);
                                                    break;
                                                case 125:
                                                    this.f2970m.m1002a((char) 9472);
                                                    break;
                                                case 126:
                                                    this.f2970m.m1002a((char) 9496);
                                                    break;
                                                case 127:
                                                    this.f2970m.m1002a((char) 9484);
                                                    break;
                                                default:
                                                    jd0.m3621s(iM1238i13, "Invalid G2 character: ", "Cea708Decoder");
                                                    break;
                                            }
                                            break;
                                    }
                                } else {
                                    this.f2970m.m1002a((char) 8480);
                                }
                                i = 2;
                                z2 = true;
                            } else if (iM1238i13 > 159) {
                                i = 2;
                                if (iM1238i13 <= 255) {
                                    if (iM1238i13 == 160) {
                                        this.f2970m.m1002a((char) 13252);
                                    } else {
                                        jd0.m3621s(iM1238i13, "Invalid G3 character: ", "Cea708Decoder");
                                        this.f2970m.m1002a('_');
                                    }
                                    z2 = true;
                                } else {
                                    jd0.m3621s(iM1238i13, "Invalid extended command: ", "Cea708Decoder");
                                }
                            } else if (iM1238i13 <= 135) {
                                c0141cm3.m1249t(32);
                            } else if (iM1238i13 <= 143) {
                                c0141cm3.m1249t(40);
                            } else if (iM1238i13 <= 159) {
                                i = 2;
                                c0141cm3.m1249t(2);
                                c0141cm3.m1249t(c0141cm3.m1238i(6) * 8);
                            }
                        }
                        i = 2;
                    }
                    i = i;
                }
            }
        }
        if (z2) {
            this.f2971n = m2371k();
        }
        this.f2973p = null;
    }

    /* JADX INFO: renamed from: k */
    public final List m2371k() {
        Layout.Alignment alignment;
        float f;
        float f2;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            C0104bm[] c0104bmArr = this.f2969l;
            C0104bm c0104bm = c0104bmArr[i];
            if (c0104bm.f1413c && (!c0104bm.f1411a.isEmpty() || c0104bm.f1412b.length() != 0)) {
                C0104bm c0104bm2 = c0104bmArr[i];
                if (c0104bm2.f1414d) {
                    ArrayList arrayList2 = c0104bm2.f1411a;
                    C0023am c0023am = null;
                    if (c0104bm2.f1413c && (!arrayList2.isEmpty() || c0104bm2.f1412b.length() != 0)) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                            spannableStringBuilder.append((CharSequence) arrayList2.get(i2));
                            spannableStringBuilder.append('\n');
                        }
                        spannableStringBuilder.append((CharSequence) c0104bm2.m1003b());
                        int i3 = c0104bm2.f1421k;
                        if (i3 == 0) {
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        } else if (i3 == 1) {
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                        } else if (i3 != 2) {
                            if (i3 != 3) {
                                ca0.m1174f(c0104bm2.f1421k, "Unexpected justification value: ");
                                return null;
                            }
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        } else {
                            alignment = Layout.Alignment.ALIGN_CENTER;
                        }
                        Layout.Alignment alignment2 = alignment;
                        boolean z = c0104bm2.f1416f;
                        int i4 = c0104bm2.f1418h;
                        int i5 = c0104bm2.f1417g;
                        if (z) {
                            f = i4 / 99.0f;
                            f2 = i5 / 99.0f;
                        } else {
                            f = i4 / 209.0f;
                            f2 = i5 / 74.0f;
                        }
                        float f3 = (f * 0.9f) + 0.05f;
                        float f4 = (f2 * 0.9f) + 0.05f;
                        int i6 = c0104bm2.f1419i;
                        int i7 = i6 / 3;
                        int i8 = i7 == 0 ? 0 : i7 == 1 ? 1 : 2;
                        int i9 = i6 % 3;
                        int i10 = i9 == 0 ? 0 : i9 == 1 ? 1 : 2;
                        int i11 = c0104bm2.f1424n;
                        c0023am = new C0023am(spannableStringBuilder, alignment2, f4, i8, f3, i10, i11 != C0104bm.f1407w, i11, c0104bm2.f1415e);
                    }
                    if (c0023am != null) {
                        arrayList.add(c0023am);
                    }
                } else {
                    continue;
                }
            }
        }
        Collections.sort(arrayList, C0023am.f266c);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            arrayList3.add(((C0023am) arrayList.get(i12)).f267a);
        }
        return Collections.unmodifiableList(arrayList3);
    }

    /* JADX INFO: renamed from: l */
    public final void m2372l() {
        for (int i = 0; i < 8; i++) {
            this.f2969l[i].m1004d();
        }
    }
}
