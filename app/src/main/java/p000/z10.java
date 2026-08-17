package p000;

import com.example.ssmousepro.injection.TouchPipeline;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class z10 {

    /* JADX INFO: renamed from: a */
    public C1676zs f13222a;

    /* JADX INFO: renamed from: b */
    public boolean f13223b;

    /* JADX INFO: renamed from: c */
    public boolean f13224c;

    /* JADX INFO: renamed from: d */
    public C1676zs f13225d;

    /* JADX INFO: renamed from: e */
    public ArrayList f13226e;

    /* JADX INFO: renamed from: f */
    public ch1 f13227f;

    /* JADX INFO: renamed from: g */
    public C1332qh f13228g;

    /* JADX INFO: renamed from: h */
    public ArrayList f13229h;

    /* JADX INFO: renamed from: a */
    public final void m7176a(a20 a20Var, int i, ArrayList arrayList, jn1 jn1Var) {
        r92 r92Var = a20Var.f30d;
        jn1 jn1Var2 = r92Var.f9847c;
        a20 a20Var2 = r92Var.f9853i;
        a20 a20Var3 = r92Var.f9852h;
        if (jn1Var2 == null) {
            C1676zs c1676zs = this.f13222a;
            if (r92Var == c1676zs.f13090d || r92Var == c1676zs.f13092e) {
                return;
            }
            if (jn1Var == null) {
                jn1Var = new jn1();
                jn1Var.f5461a = null;
                jn1Var.f5462b = new ArrayList();
                jn1Var.f5461a = r92Var;
                arrayList.add(jn1Var);
            }
            r92Var.f9847c = jn1Var;
            jn1Var.f5462b.add(r92Var);
            ArrayList arrayList2 = a20Var3.f37k;
            int size = arrayList2.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                y10 y10Var = (y10) obj;
                if (y10Var instanceof a20) {
                    m7176a((a20) y10Var, i, arrayList, jn1Var);
                }
            }
            ArrayList arrayList3 = a20Var2.f37k;
            int size2 = arrayList3.size();
            int i4 = 0;
            while (i4 < size2) {
                Object obj2 = arrayList3.get(i4);
                i4++;
                y10 y10Var2 = (y10) obj2;
                if (y10Var2 instanceof a20) {
                    m7176a((a20) y10Var2, i, arrayList, jn1Var);
                }
            }
            if (i == 1 && (r92Var instanceof u52)) {
                ArrayList arrayList4 = ((u52) r92Var).f11131k.f37k;
                int size3 = arrayList4.size();
                int i5 = 0;
                while (i5 < size3) {
                    Object obj3 = arrayList4.get(i5);
                    i5++;
                    y10 y10Var3 = (y10) obj3;
                    if (y10Var3 instanceof a20) {
                        m7176a((a20) y10Var3, i, arrayList, jn1Var);
                    }
                }
            }
            ArrayList arrayList5 = a20Var3.f38l;
            int size4 = arrayList5.size();
            int i6 = 0;
            while (i6 < size4) {
                Object obj4 = arrayList5.get(i6);
                i6++;
                m7176a((a20) obj4, i, arrayList, jn1Var);
            }
            ArrayList arrayList6 = a20Var2.f38l;
            int size5 = arrayList6.size();
            int i7 = 0;
            while (i7 < size5) {
                Object obj5 = arrayList6.get(i7);
                i7++;
                m7176a((a20) obj5, i, arrayList, jn1Var);
            }
            if (i == 1 && (r92Var instanceof u52)) {
                ArrayList arrayList7 = ((u52) r92Var).f11131k.f38l;
                int size6 = arrayList7.size();
                while (i2 < size6) {
                    Object obj6 = arrayList7.get(i2);
                    i2++;
                    m7176a((a20) obj6, i, arrayList, jn1Var);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:102:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:103:0x01bc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:107:0x01c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x01c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:112:0x01de  */
    /* JADX WARN: Code duplicated, block: B:114:0x0207  */
    /* JADX WARN: Code duplicated, block: B:116:0x020a  */
    /* JADX WARN: Code duplicated, block: B:117:0x021f  */
    /* JADX WARN: Code duplicated, block: B:119:0x0224  */
    /* JADX WARN: Code duplicated, block: B:121:0x0228  */
    /* JADX WARN: Code duplicated, block: B:126:0x025f  */
    /* JADX WARN: Code duplicated, block: B:128:0x0269  */
    /* JADX WARN: Code duplicated, block: B:134:0x029a  */
    /* JADX WARN: Code duplicated, block: B:136:0x02a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:138:0x02a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:148:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:149:0x0306  */
    /* JADX WARN: Code duplicated, block: B:152:0x0311  */
    /* JADX WARN: Code duplicated, block: B:155:0x0324  */
    /* JADX WARN: Code duplicated, block: B:156:0x0337  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d1 A[PHI: r0
  0x00d1: PHI (r0v22 int) = (r0v20 int), (r0v99 int) binds: [B:68:0x00c9, B:62:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:82:0x012c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0131  */
    /* JADX WARN: Code duplicated, block: B:85:0x0144  */
    /* JADX WARN: Code duplicated, block: B:87:0x0147  */
    /* JADX WARN: Code duplicated, block: B:89:0x014b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0182  */
    /* JADX WARN: Code duplicated, block: B:97:0x018c  */
    /* JADX INFO: renamed from: b */
    public final void m7177b(C1676zs c1676zs) {
        int i;
        int i2;
        int iM7135q;
        int iM7131k;
        int i3;
        int iM7131k2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f;
        int i16;
        int i17;
        ArrayList arrayList = c1676zs.f13536q0;
        int[] iArr = c1676zs.f13115p0;
        int size = arrayList.size();
        char c = 0;
        int i18 = 0;
        while (i18 < size) {
            Object obj = arrayList.get(i18);
            i18++;
            C1639ys c1639ys = (C1639ys) obj;
            int[] iArr2 = c1639ys.f13115p0;
            C1082ls[] c1082lsArr = c1639ys.f13074Q;
            C1082ls c1082ls = c1639ys.f13069L;
            C1082ls c1082ls2 = c1639ys.f13067J;
            C1082ls c1082ls3 = c1639ys.f13068K;
            C1082ls c1082ls4 = c1639ys.f13066I;
            int i19 = iArr2[c];
            int i20 = iArr2[1];
            c = c;
            if (c1639ys.f13097g0 == 8) {
                c1639ys.f13084a = true;
            } else {
                float f2 = c1639ys.f13122w;
                if (f2 < 1.0f && i19 == 3) {
                    c1639ys.f13117r = 2;
                }
                float f3 = c1639ys.f13125z;
                if (f3 < 1.0f && i20 == 3) {
                    c1639ys.f13118s = 2;
                }
                if (c1639ys.f13080W > TouchPipeline.SIZE) {
                    if (i19 == 3) {
                        i17 = 2;
                        if (i20 == 2 || i20 == 1) {
                            i = 3;
                            c1639ys.f13117r = 3;
                        } else {
                            i = 3;
                        }
                    } else {
                        i = 3;
                        i17 = 2;
                    }
                    if (i20 == i && (i19 == i17 || i19 == 1)) {
                        c1639ys.f13118s = i;
                    } else if (i19 == i && i20 == i) {
                        if (c1639ys.f13117r == 0) {
                            c1639ys.f13117r = i;
                        }
                        if (c1639ys.f13118s == 0) {
                            c1639ys.f13118s = i;
                        }
                    }
                } else {
                    i = 3;
                }
                if (i19 == i && c1639ys.f13117r == 1 && (c1082ls4.f6503f == null || c1082ls3.f6503f == null)) {
                    i19 = 2;
                }
                if (i20 == 3 && c1639ys.f13118s == 1 && (c1082ls2.f6503f == null || c1082ls.f6503f == null)) {
                    i20 = 2;
                }
                ok0 ok0Var = c1639ys.f13090d;
                ok0Var.f9848d = i19;
                int i21 = c1639ys.f13117r;
                ok0Var.f9845a = i21;
                u52 u52Var = c1639ys.f13092e;
                u52Var.f9848d = i20;
                ArrayList arrayList2 = arrayList;
                int i22 = c1639ys.f13118s;
                u52Var.f9845a = i22;
                if (i19 == 4 || i19 == 1) {
                    if (i20 == 4) {
                        i2 = 1;
                    } else if (i20 != 1) {
                        i4 = 2;
                        if (i20 == 2) {
                            i2 = 1;
                        } else {
                            if (i19 != 3) {
                                i5 = i4;
                                i6 = i20;
                                i7 = 1;
                            } else if (i20 == i4 && i20 != 1) {
                                i5 = i4;
                                i8 = 3;
                                i6 = i20;
                                i7 = 1;
                                if (i6 != i8) {
                                    if (i19 == i5 && i19 != i7) {
                                        i12 = i8;
                                        i9 = i19;
                                        i10 = i5;
                                    } else if (i22 == i8) {
                                        if (i19 == i5) {
                                            m7181f(i5, 0, i5, 0, c1639ys);
                                        }
                                        int iM7135q2 = c1639ys.m7135q();
                                        f = c1639ys.f13080W;
                                        if (c1639ys.f13081X == -1) {
                                            f = 1.0f / f;
                                        }
                                        m7181f(i7, iM7135q2, i7, (int) ((iM7135q2 * f) + 0.5f), c1639ys);
                                        c1639ys.f13090d.f9849e.mo53d(c1639ys.m7135q());
                                        c1639ys.f13092e.f9849e.mo53d(c1639ys.m7131k());
                                        c1639ys.f13084a = true;
                                    } else if (i22 == 1) {
                                        m7181f(i19, 0, i5, 0, c1639ys);
                                        c1639ys.f13092e.f9849e.f9308m = c1639ys.m7131k();
                                    } else {
                                        i13 = i5;
                                        i14 = i19;
                                        if (i22 == 2) {
                                            i15 = iArr[1];
                                            if (i15 != i7 || i15 == 4) {
                                                m7181f(i14, c1639ys.m7135q(), i7, (int) ((f3 * c1676zs.m7131k()) + 0.5f), c1639ys);
                                                c1639ys.f13090d.f9849e.mo53d(c1639ys.m7135q());
                                                c1639ys.f13092e.f9849e.mo53d(c1639ys.m7131k());
                                                c1639ys.f13084a = true;
                                            } else {
                                                i9 = i14;
                                                i10 = i13;
                                                i12 = 3;
                                            }
                                        } else {
                                            i9 = i14;
                                            if (c1082lsArr[2].f6503f != null || c1082lsArr[3].f6503f == null) {
                                                m7181f(i13, 0, i6, 0, c1639ys);
                                                c1639ys.f13090d.f9849e.mo53d(c1639ys.m7135q());
                                                c1639ys.f13092e.f9849e.mo53d(c1639ys.m7131k());
                                                c1639ys.f13084a = true;
                                            } else {
                                                i10 = i13;
                                            }
                                        }
                                    }
                                    i7 = i7;
                                    i11 = 1;
                                    if (i9 == i12 && i6 == i12) {
                                        if (i21 != i11 || i22 == i11) {
                                            m7181f(i10, 0, i10, 0, c1639ys);
                                            c1639ys.f13090d.f9849e.f9308m = c1639ys.m7135q();
                                            c1639ys.f13092e.f9849e.f9308m = c1639ys.m7131k();
                                        } else if (i22 == 2 && i21 == 2 && iArr[c] == i7 && iArr[i11] == i7) {
                                            m7181f(i7, (int) ((f2 * c1676zs.m7135q()) + 0.5f), i7, (int) ((f3 * c1676zs.m7131k()) + 0.5f), c1639ys);
                                            c1639ys.f13090d.f9849e.mo53d(c1639ys.m7135q());
                                            c1639ys.f13092e.f9849e.mo53d(c1639ys.m7131k());
                                            c1639ys.f13084a = true;
                                        }
                                    }
                                } else {
                                    i9 = i19;
                                    i10 = i5;
                                }
                                i11 = 1;
                                i12 = 3;
                                if (i9 == i12) {
                                    if (i21 != i11) {
                                        m7181f(i10, 0, i10, 0, c1639ys);
                                        c1639ys.f13090d.f9849e.f9308m = c1639ys.m7135q();
                                        c1639ys.f13092e.f9849e.f9308m = c1639ys.m7131k();
                                    } else {
                                        m7181f(i10, 0, i10, 0, c1639ys);
                                        c1639ys.f13090d.f9849e.f9308m = c1639ys.m7135q();
                                        c1639ys.f13092e.f9849e.f9308m = c1639ys.m7131k();
                                    }
                                }
                            } else if (i21 == 3) {
                                if (i20 == i4) {
                                    m7181f(i4, 0, i4, 0, c1639ys);
                                }
                                int iM7131k3 = c1639ys.m7131k();
                                m7181f(1, (int) ((iM7131k3 * c1639ys.f13080W) + 0.5f), 1, iM7131k3, c1639ys);
                                c1639ys.f13090d.f9849e.mo53d(c1639ys.m7135q());
                                c1639ys.f13092e.f9849e.mo53d(c1639ys.m7131k());
                                c1639ys.f13084a = true;
                            } else {
                                i5 = i4;
                                if (i21 == 1) {
                                    m7181f(i5, 0, i20, 0, c1639ys);
                                    c1639ys.f13090d.f9849e.f9308m = c1639ys.m7135q();
                                } else if (i21 == 2) {
                                    i16 = iArr[c];
                                    if (i16 != 1 || i16 == 4) {
                                        m7181f(1, (int) ((f2 * c1676zs.m7135q()) + 0.5f), i20, c1639ys.m7131k(), c1639ys);
                                        c1639ys.f13090d.f9849e.mo53d(c1639ys.m7135q());
                                        c1639ys.f13092e.f9849e.mo53d(c1639ys.m7131k());
                                        c1639ys.f13084a = true;
                                    } else {
                                        i6 = i20;
                                        i7 = 1;
                                    }
                                } else {
                                    i6 = i20;
                                    i7 = 1;
                                    if (c1082lsArr[c].f6503f != null || c1082lsArr[1].f6503f == null) {
                                        m7181f(i5, 0, i6, 0, c1639ys);
                                        c1639ys.f13090d.f9849e.mo53d(c1639ys.m7135q());
                                        c1639ys.f13092e.f9849e.mo53d(c1639ys.m7131k());
                                        c1639ys.f13084a = true;
                                    }
                                }
                            }
                            i8 = 3;
                            if (i6 != i8) {
                                i9 = i19;
                                i10 = i5;
                            } else if (i19 == i5) {
                                if (i22 == i8) {
                                    if (i19 == i5) {
                                        m7181f(i5, 0, i5, 0, c1639ys);
                                    }
                                    int iM7135q3 = c1639ys.m7135q();
                                    f = c1639ys.f13080W;
                                    if (c1639ys.f13081X == -1) {
                                        f = 1.0f / f;
                                    }
                                    m7181f(i7, iM7135q3, i7, (int) ((iM7135q3 * f) + 0.5f), c1639ys);
                                    c1639ys.f13090d.f9849e.mo53d(c1639ys.m7135q());
                                    c1639ys.f13092e.f9849e.mo53d(c1639ys.m7131k());
                                    c1639ys.f13084a = true;
                                } else if (i22 == 1) {
                                    m7181f(i19, 0, i5, 0, c1639ys);
                                    c1639ys.f13092e.f9849e.f9308m = c1639ys.m7131k();
                                } else {
                                    i13 = i5;
                                    i14 = i19;
                                    if (i22 == 2) {
                                        i15 = iArr[1];
                                        if (i15 != i7) {
                                        }
                                        m7181f(i14, c1639ys.m7135q(), i7, (int) ((f3 * c1676zs.m7131k()) + 0.5f), c1639ys);
                                        c1639ys.f13090d.f9849e.mo53d(c1639ys.m7135q());
                                        c1639ys.f13092e.f9849e.mo53d(c1639ys.m7131k());
                                        c1639ys.f13084a = true;
                                    } else {
                                        i9 = i14;
                                        if (c1082lsArr[2].f6503f != null) {
                                        }
                                        m7181f(i13, 0, i6, 0, c1639ys);
                                        c1639ys.f13090d.f9849e.mo53d(c1639ys.m7135q());
                                        c1639ys.f13092e.f9849e.mo53d(c1639ys.m7131k());
                                        c1639ys.f13084a = true;
                                    }
                                }
                            } else if (i22 == i8) {
                                if (i19 == i5) {
                                    m7181f(i5, 0, i5, 0, c1639ys);
                                }
                                int iM7135q4 = c1639ys.m7135q();
                                f = c1639ys.f13080W;
                                if (c1639ys.f13081X == -1) {
                                    f = 1.0f / f;
                                }
                                m7181f(i7, iM7135q4, i7, (int) ((iM7135q4 * f) + 0.5f), c1639ys);
                                c1639ys.f13090d.f9849e.mo53d(c1639ys.m7135q());
                                c1639ys.f13092e.f9849e.mo53d(c1639ys.m7131k());
                                c1639ys.f13084a = true;
                            } else if (i22 == 1) {
                                m7181f(i19, 0, i5, 0, c1639ys);
                                c1639ys.f13092e.f9849e.f9308m = c1639ys.m7131k();
                            } else {
                                i13 = i5;
                                i14 = i19;
                                if (i22 == 2) {
                                    i15 = iArr[1];
                                    if (i15 != i7) {
                                    }
                                    m7181f(i14, c1639ys.m7135q(), i7, (int) ((f3 * c1676zs.m7131k()) + 0.5f), c1639ys);
                                    c1639ys.f13090d.f9849e.mo53d(c1639ys.m7135q());
                                    c1639ys.f13092e.f9849e.mo53d(c1639ys.m7131k());
                                    c1639ys.f13084a = true;
                                } else {
                                    i9 = i14;
                                    if (c1082lsArr[2].f6503f != null) {
                                    }
                                    m7181f(i13, 0, i6, 0, c1639ys);
                                    c1639ys.f13090d.f9849e.mo53d(c1639ys.m7135q());
                                    c1639ys.f13092e.f9849e.mo53d(c1639ys.m7131k());
                                    c1639ys.f13084a = true;
                                }
                            }
                            i11 = 1;
                            i12 = 3;
                            if (i9 == i12) {
                                if (i21 != i11) {
                                    m7181f(i10, 0, i10, 0, c1639ys);
                                    c1639ys.f13090d.f9849e.f9308m = c1639ys.m7135q();
                                    c1639ys.f13092e.f9849e.f9308m = c1639ys.m7131k();
                                } else {
                                    m7181f(i10, 0, i10, 0, c1639ys);
                                    c1639ys.f13090d.f9849e.f9308m = c1639ys.m7135q();
                                    c1639ys.f13092e.f9849e.f9308m = c1639ys.m7131k();
                                }
                            }
                        }
                    } else {
                        i2 = 1;
                    }
                    iM7135q = c1639ys.m7135q();
                    if (i19 == 4) {
                        iM7135q = (c1676zs.m7135q() - c1082ls4.f6504g) - c1082ls3.f6504g;
                        i19 = i2;
                    }
                    iM7131k = c1639ys.m7131k();
                    if (i20 == 4) {
                        i3 = i2;
                        iM7131k2 = (c1676zs.m7131k() - c1082ls2.f6504g) - c1082ls.f6504g;
                    } else {
                        i3 = i20;
                        iM7131k2 = iM7131k;
                    }
                    m7181f(i19, iM7135q, i3, iM7131k2, c1639ys);
                    c1639ys.f13090d.f9849e.mo53d(c1639ys.m7135q());
                    c1639ys.f13092e.f9849e.mo53d(c1639ys.m7131k());
                    c1639ys.f13084a = true;
                } else {
                    i4 = 2;
                    if (i19 == 2) {
                        if (i20 == 4) {
                            i2 = 1;
                        } else if (i20 != 1) {
                            i4 = 2;
                            if (i20 == 2) {
                                i2 = 1;
                            } else {
                                if (i19 != 3) {
                                    if (i20 == i4) {
                                    }
                                    if (i21 == 3) {
                                        if (i20 == i4) {
                                            m7181f(i4, 0, i4, 0, c1639ys);
                                        }
                                        int iM7131k4 = c1639ys.m7131k();
                                        m7181f(1, (int) ((iM7131k4 * c1639ys.f13080W) + 0.5f), 1, iM7131k4, c1639ys);
                                        c1639ys.f13090d.f9849e.mo53d(c1639ys.m7135q());
                                        c1639ys.f13092e.f9849e.mo53d(c1639ys.m7131k());
                                        c1639ys.f13084a = true;
                                    } else {
                                        i5 = i4;
                                        if (i21 == 1) {
                                            m7181f(i5, 0, i20, 0, c1639ys);
                                            c1639ys.f13090d.f9849e.f9308m = c1639ys.m7135q();
                                        } else if (i21 == 2) {
                                            i16 = iArr[c];
                                            if (i16 != 1) {
                                            }
                                            m7181f(1, (int) ((f2 * c1676zs.m7135q()) + 0.5f), i20, c1639ys.m7131k(), c1639ys);
                                            c1639ys.f13090d.f9849e.mo53d(c1639ys.m7135q());
                                            c1639ys.f13092e.f9849e.mo53d(c1639ys.m7131k());
                                            c1639ys.f13084a = true;
                                        } else {
                                            i6 = i20;
                                            i7 = 1;
                                            if (c1082lsArr[c].f6503f != null) {
                                            }
                                            m7181f(i5, 0, i6, 0, c1639ys);
                                            c1639ys.f13090d.f9849e.mo53d(c1639ys.m7135q());
                                            c1639ys.f13092e.f9849e.mo53d(c1639ys.m7131k());
                                            c1639ys.f13084a = true;
                                        }
                                    }
                                } else {
                                    i5 = i4;
                                    i6 = i20;
                                    i7 = 1;
                                }
                                i8 = 3;
                                if (i6 != i8) {
                                    i9 = i19;
                                    i10 = i5;
                                } else if (i19 == i5) {
                                    if (i22 == i8) {
                                        if (i19 == i5) {
                                            m7181f(i5, 0, i5, 0, c1639ys);
                                        }
                                        int iM7135q5 = c1639ys.m7135q();
                                        f = c1639ys.f13080W;
                                        if (c1639ys.f13081X == -1) {
                                            f = 1.0f / f;
                                        }
                                        m7181f(i7, iM7135q5, i7, (int) ((iM7135q5 * f) + 0.5f), c1639ys);
                                        c1639ys.f13090d.f9849e.mo53d(c1639ys.m7135q());
                                        c1639ys.f13092e.f9849e.mo53d(c1639ys.m7131k());
                                        c1639ys.f13084a = true;
                                    } else if (i22 == 1) {
                                        m7181f(i19, 0, i5, 0, c1639ys);
                                        c1639ys.f13092e.f9849e.f9308m = c1639ys.m7131k();
                                    } else {
                                        i13 = i5;
                                        i14 = i19;
                                        if (i22 == 2) {
                                            i15 = iArr[1];
                                            if (i15 != i7) {
                                            }
                                            m7181f(i14, c1639ys.m7135q(), i7, (int) ((f3 * c1676zs.m7131k()) + 0.5f), c1639ys);
                                            c1639ys.f13090d.f9849e.mo53d(c1639ys.m7135q());
                                            c1639ys.f13092e.f9849e.mo53d(c1639ys.m7131k());
                                            c1639ys.f13084a = true;
                                        } else {
                                            i9 = i14;
                                            if (c1082lsArr[2].f6503f != null) {
                                            }
                                            m7181f(i13, 0, i6, 0, c1639ys);
                                            c1639ys.f13090d.f9849e.mo53d(c1639ys.m7135q());
                                            c1639ys.f13092e.f9849e.mo53d(c1639ys.m7131k());
                                            c1639ys.f13084a = true;
                                        }
                                    }
                                } else if (i22 == i8) {
                                    if (i19 == i5) {
                                        m7181f(i5, 0, i5, 0, c1639ys);
                                    }
                                    int iM7135q6 = c1639ys.m7135q();
                                    f = c1639ys.f13080W;
                                    if (c1639ys.f13081X == -1) {
                                        f = 1.0f / f;
                                    }
                                    m7181f(i7, iM7135q6, i7, (int) ((iM7135q6 * f) + 0.5f), c1639ys);
                                    c1639ys.f13090d.f9849e.mo53d(c1639ys.m7135q());
                                    c1639ys.f13092e.f9849e.mo53d(c1639ys.m7131k());
                                    c1639ys.f13084a = true;
                                } else if (i22 == 1) {
                                    m7181f(i19, 0, i5, 0, c1639ys);
                                    c1639ys.f13092e.f9849e.f9308m = c1639ys.m7131k();
                                } else {
                                    i13 = i5;
                                    i14 = i19;
                                    if (i22 == 2) {
                                        i15 = iArr[1];
                                        if (i15 != i7) {
                                        }
                                        m7181f(i14, c1639ys.m7135q(), i7, (int) ((f3 * c1676zs.m7131k()) + 0.5f), c1639ys);
                                        c1639ys.f13090d.f9849e.mo53d(c1639ys.m7135q());
                                        c1639ys.f13092e.f9849e.mo53d(c1639ys.m7131k());
                                        c1639ys.f13084a = true;
                                    } else {
                                        i9 = i14;
                                        if (c1082lsArr[2].f6503f != null) {
                                        }
                                        m7181f(i13, 0, i6, 0, c1639ys);
                                        c1639ys.f13090d.f9849e.mo53d(c1639ys.m7135q());
                                        c1639ys.f13092e.f9849e.mo53d(c1639ys.m7131k());
                                        c1639ys.f13084a = true;
                                    }
                                }
                                i11 = 1;
                                i12 = 3;
                                if (i9 == i12) {
                                    if (i21 != i11) {
                                        m7181f(i10, 0, i10, 0, c1639ys);
                                        c1639ys.f13090d.f9849e.f9308m = c1639ys.m7135q();
                                        c1639ys.f13092e.f9849e.f9308m = c1639ys.m7131k();
                                    } else {
                                        m7181f(i10, 0, i10, 0, c1639ys);
                                        c1639ys.f13090d.f9849e.f9308m = c1639ys.m7135q();
                                        c1639ys.f13092e.f9849e.f9308m = c1639ys.m7131k();
                                    }
                                }
                            }
                        } else {
                            i2 = 1;
                        }
                        iM7135q = c1639ys.m7135q();
                        if (i19 == 4) {
                            iM7135q = (c1676zs.m7135q() - c1082ls4.f6504g) - c1082ls3.f6504g;
                            i19 = i2;
                        }
                        iM7131k = c1639ys.m7131k();
                        if (i20 == 4) {
                            i3 = i2;
                            iM7131k2 = (c1676zs.m7131k() - c1082ls2.f6504g) - c1082ls.f6504g;
                        } else {
                            i3 = i20;
                            iM7131k2 = iM7131k;
                        }
                        m7181f(i19, iM7135q, i3, iM7131k2, c1639ys);
                        c1639ys.f13090d.f9849e.mo53d(c1639ys.m7135q());
                        c1639ys.f13092e.f9849e.mo53d(c1639ys.m7131k());
                        c1639ys.f13084a = true;
                    } else {
                        if (i19 != 3) {
                            if (i20 == i4) {
                            }
                            if (i21 == 3) {
                                if (i20 == i4) {
                                    m7181f(i4, 0, i4, 0, c1639ys);
                                }
                                int iM7131k5 = c1639ys.m7131k();
                                m7181f(1, (int) ((iM7131k5 * c1639ys.f13080W) + 0.5f), 1, iM7131k5, c1639ys);
                                c1639ys.f13090d.f9849e.mo53d(c1639ys.m7135q());
                                c1639ys.f13092e.f9849e.mo53d(c1639ys.m7131k());
                                c1639ys.f13084a = true;
                            } else {
                                i5 = i4;
                                if (i21 == 1) {
                                    m7181f(i5, 0, i20, 0, c1639ys);
                                    c1639ys.f13090d.f9849e.f9308m = c1639ys.m7135q();
                                } else if (i21 == 2) {
                                    i16 = iArr[c];
                                    if (i16 != 1) {
                                    }
                                    m7181f(1, (int) ((f2 * c1676zs.m7135q()) + 0.5f), i20, c1639ys.m7131k(), c1639ys);
                                    c1639ys.f13090d.f9849e.mo53d(c1639ys.m7135q());
                                    c1639ys.f13092e.f9849e.mo53d(c1639ys.m7131k());
                                    c1639ys.f13084a = true;
                                } else {
                                    i6 = i20;
                                    i7 = 1;
                                    if (c1082lsArr[c].f6503f != null) {
                                    }
                                    m7181f(i5, 0, i6, 0, c1639ys);
                                    c1639ys.f13090d.f9849e.mo53d(c1639ys.m7135q());
                                    c1639ys.f13092e.f9849e.mo53d(c1639ys.m7131k());
                                    c1639ys.f13084a = true;
                                }
                            }
                        } else {
                            i5 = i4;
                            i6 = i20;
                            i7 = 1;
                        }
                        i8 = 3;
                        if (i6 != i8) {
                            i9 = i19;
                            i10 = i5;
                        } else if (i19 == i5) {
                            if (i22 == i8) {
                                if (i19 == i5) {
                                    m7181f(i5, 0, i5, 0, c1639ys);
                                }
                                int iM7135q7 = c1639ys.m7135q();
                                f = c1639ys.f13080W;
                                if (c1639ys.f13081X == -1) {
                                    f = 1.0f / f;
                                }
                                m7181f(i7, iM7135q7, i7, (int) ((iM7135q7 * f) + 0.5f), c1639ys);
                                c1639ys.f13090d.f9849e.mo53d(c1639ys.m7135q());
                                c1639ys.f13092e.f9849e.mo53d(c1639ys.m7131k());
                                c1639ys.f13084a = true;
                            } else if (i22 == 1) {
                                m7181f(i19, 0, i5, 0, c1639ys);
                                c1639ys.f13092e.f9849e.f9308m = c1639ys.m7131k();
                            } else {
                                i13 = i5;
                                i14 = i19;
                                if (i22 == 2) {
                                    i15 = iArr[1];
                                    if (i15 != i7) {
                                    }
                                    m7181f(i14, c1639ys.m7135q(), i7, (int) ((f3 * c1676zs.m7131k()) + 0.5f), c1639ys);
                                    c1639ys.f13090d.f9849e.mo53d(c1639ys.m7135q());
                                    c1639ys.f13092e.f9849e.mo53d(c1639ys.m7131k());
                                    c1639ys.f13084a = true;
                                } else {
                                    i9 = i14;
                                    if (c1082lsArr[2].f6503f != null) {
                                    }
                                    m7181f(i13, 0, i6, 0, c1639ys);
                                    c1639ys.f13090d.f9849e.mo53d(c1639ys.m7135q());
                                    c1639ys.f13092e.f9849e.mo53d(c1639ys.m7131k());
                                    c1639ys.f13084a = true;
                                }
                            }
                        } else if (i22 == i8) {
                            if (i19 == i5) {
                                m7181f(i5, 0, i5, 0, c1639ys);
                            }
                            int iM7135q8 = c1639ys.m7135q();
                            f = c1639ys.f13080W;
                            if (c1639ys.f13081X == -1) {
                                f = 1.0f / f;
                            }
                            m7181f(i7, iM7135q8, i7, (int) ((iM7135q8 * f) + 0.5f), c1639ys);
                            c1639ys.f13090d.f9849e.mo53d(c1639ys.m7135q());
                            c1639ys.f13092e.f9849e.mo53d(c1639ys.m7131k());
                            c1639ys.f13084a = true;
                        } else if (i22 == 1) {
                            m7181f(i19, 0, i5, 0, c1639ys);
                            c1639ys.f13092e.f9849e.f9308m = c1639ys.m7131k();
                        } else {
                            i13 = i5;
                            i14 = i19;
                            if (i22 == 2) {
                                i15 = iArr[1];
                                if (i15 != i7) {
                                }
                                m7181f(i14, c1639ys.m7135q(), i7, (int) ((f3 * c1676zs.m7131k()) + 0.5f), c1639ys);
                                c1639ys.f13090d.f9849e.mo53d(c1639ys.m7135q());
                                c1639ys.f13092e.f9849e.mo53d(c1639ys.m7131k());
                                c1639ys.f13084a = true;
                            } else {
                                i9 = i14;
                                if (c1082lsArr[2].f6503f != null) {
                                }
                                m7181f(i13, 0, i6, 0, c1639ys);
                                c1639ys.f13090d.f9849e.mo53d(c1639ys.m7135q());
                                c1639ys.f13092e.f9849e.mo53d(c1639ys.m7131k());
                                c1639ys.f13084a = true;
                            }
                        }
                        i11 = 1;
                        i12 = 3;
                        if (i9 == i12) {
                            if (i21 != i11) {
                                m7181f(i10, 0, i10, 0, c1639ys);
                                c1639ys.f13090d.f9849e.f9308m = c1639ys.m7135q();
                                c1639ys.f13092e.f9849e.f9308m = c1639ys.m7131k();
                            } else {
                                m7181f(i10, 0, i10, 0, c1639ys);
                                c1639ys.f13090d.f9849e.f9308m = c1639ys.m7135q();
                                c1639ys.f13092e.f9849e.f9308m = c1639ys.m7131k();
                            }
                        }
                    }
                }
                arrayList = arrayList2;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m7178c() {
        C1676zs c1676zs = this.f13222a;
        ArrayList arrayList = this.f13229h;
        ArrayList arrayList2 = this.f13226e;
        arrayList2.clear();
        C1676zs c1676zs2 = this.f13225d;
        c1676zs2.f13090d.mo3003f();
        c1676zs2.f13092e.mo3003f();
        arrayList2.add(c1676zs2.f13090d);
        arrayList2.add(c1676zs2.f13092e);
        ArrayList arrayList3 = c1676zs2.f13536q0;
        int size = arrayList3.size();
        HashSet hashSet = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            C1639ys c1639ys = (C1639ys) obj;
            if (c1639ys instanceof xi0) {
                yi0 yi0Var = new yi0(c1639ys);
                c1639ys.f13090d.mo3003f();
                c1639ys.f13092e.mo3003f();
                yi0Var.f9850f = ((xi0) c1639ys).f12613u0;
                arrayList2.add(yi0Var);
            } else {
                if (c1639ys.m7142x()) {
                    if (c1639ys.f13086b == null) {
                        c1639ys.f13086b = new C0796jm(c1639ys, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c1639ys.f13086b);
                } else {
                    arrayList2.add(c1639ys.f13090d);
                }
                if (c1639ys.m7143y()) {
                    if (c1639ys.f13088c == null) {
                        c1639ys.f13088c = new C0796jm(c1639ys, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c1639ys.f13088c);
                } else {
                    arrayList2.add(c1639ys.f13092e);
                }
                if (c1639ys instanceof hk0) {
                    arrayList2.add(new gk0(c1639ys));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        int size2 = arrayList2.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            ((r92) obj2).mo3003f();
        }
        int size3 = arrayList2.size();
        int i3 = 0;
        while (i3 < size3) {
            Object obj3 = arrayList2.get(i3);
            i3++;
            r92 r92Var = (r92) obj3;
            if (r92Var.f9846b != c1676zs2) {
                r92Var.mo3001d();
            }
        }
        arrayList.clear();
        m7180e(c1676zs.f13090d, 0, arrayList);
        m7180e(c1676zs.f13092e, 1, arrayList);
        this.f13223b = false;
    }

    /* JADX INFO: renamed from: d */
    public final int m7179d(C1676zs c1676zs, int i) {
        ArrayList arrayList;
        int i2;
        long jMo3666j;
        float f;
        long j;
        ArrayList arrayList2 = this.f13229h;
        int size = arrayList2.size();
        long j2 = 0;
        int i3 = 0;
        long jMax = 0;
        while (i3 < size) {
            r92 r92Var = ((jn1) arrayList2.get(i3)).f5461a;
            if (!(r92Var instanceof C0796jm) ? !(i != 0 ? (r92Var instanceof u52) : (r92Var instanceof ok0)) : ((C0796jm) r92Var).f9850f != i) {
                a20 a20Var = (i == 0 ? c1676zs.f13090d : c1676zs.f13092e).f9852h;
                a20 a20Var2 = (i == 0 ? c1676zs.f13090d : c1676zs.f13092e).f9853i;
                a20 a20Var3 = r92Var.f9852h;
                a20 a20Var4 = r92Var.f9853i;
                boolean zContains = a20Var3.f38l.contains(a20Var);
                boolean zContains2 = a20Var4.f38l.contains(a20Var2);
                long jMo3666j2 = r92Var.mo3666j();
                if (zContains && zContains2) {
                    long jM3674b = jn1.m3674b(a20Var3, j2);
                    arrayList = arrayList2;
                    long jM3673a = jn1.m3673a(a20Var4, j2);
                    long j3 = jM3674b - jMo3666j2;
                    int i4 = a20Var4.f32f;
                    i2 = i3;
                    if (j3 >= (-i4)) {
                        j3 += (long) i4;
                    }
                    long j4 = a20Var3.f32f;
                    long j5 = ((-jM3673a) - jMo3666j2) - j4;
                    if (j5 >= j4) {
                        j5 -= j4;
                    }
                    C1639ys c1639ys = r92Var.f9846b;
                    if (i == 0) {
                        f = c1639ys.f13091d0;
                    } else if (i == 1) {
                        f = c1639ys.f13093e0;
                    } else {
                        c1639ys.getClass();
                        f = -1.0f;
                    }
                    if (f > TouchPipeline.SIZE) {
                        j = (long) ((j3 / (1.0f - f)) + (j5 / f));
                    } else {
                        j = 0;
                    }
                    float f2 = j;
                    jMo3666j = (((long) a20Var3.f32f) + ((((long) ((f2 * f) + 0.5f)) + jMo3666j2) + ((long) (((1.0f - f) * f2) + 0.5f)))) - ((long) a20Var4.f32f);
                } else {
                    arrayList = arrayList2;
                    i2 = i3;
                    if (zContains) {
                        jMo3666j = Math.max(jn1.m3674b(a20Var3, a20Var3.f32f), ((long) a20Var3.f32f) + jMo3666j2);
                    } else if (zContains2) {
                        jMo3666j = Math.max(-jn1.m3673a(a20Var4, a20Var4.f32f), ((long) (-a20Var4.f32f)) + jMo3666j2);
                    } else {
                        jMo3666j = (r92Var.mo3666j() + ((long) a20Var3.f32f)) - ((long) a20Var4.f32f);
                    }
                }
            } else {
                arrayList = arrayList2;
                jMo3666j = j2;
                i2 = i3;
            }
            jMax = Math.max(jMax, jMo3666j);
            i3 = i2 + 1;
            arrayList2 = arrayList;
            j2 = 0;
        }
        return (int) jMax;
    }

    /* JADX INFO: renamed from: e */
    public final void m7180e(r92 r92Var, int i, ArrayList arrayList) {
        a20 a20Var = r92Var.f9852h;
        a20 a20Var2 = r92Var.f9853i;
        ArrayList arrayList2 = a20Var.f37k;
        int size = arrayList2.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            y10 y10Var = (y10) obj;
            if (y10Var instanceof a20) {
                m7176a((a20) y10Var, i, arrayList, null);
            } else if (y10Var instanceof r92) {
                m7176a(((r92) y10Var).f9852h, i, arrayList, null);
            }
        }
        ArrayList arrayList3 = a20Var2.f37k;
        int size2 = arrayList3.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList3.get(i4);
            i4++;
            y10 y10Var2 = (y10) obj2;
            if (y10Var2 instanceof a20) {
                m7176a((a20) y10Var2, i, arrayList, null);
            } else if (y10Var2 instanceof r92) {
                m7176a(((r92) y10Var2).f9853i, i, arrayList, null);
            }
        }
        if (i == 1) {
            ArrayList arrayList4 = ((u52) r92Var).f11131k.f37k;
            int size3 = arrayList4.size();
            while (i2 < size3) {
                Object obj3 = arrayList4.get(i2);
                i2++;
                y10 y10Var3 = (y10) obj3;
                if (y10Var3 instanceof a20) {
                    m7176a((a20) y10Var3, i, arrayList, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m7181f(int i, int i2, int i3, int i4, C1639ys c1639ys) {
        C1332qh c1332qh = this.f13228g;
        c1332qh.f9500a = i;
        c1332qh.f9501b = i3;
        c1332qh.f9502c = i2;
        c1332qh.f9503d = i4;
        this.f13227f.m1220d(c1639ys, c1332qh);
        c1639ys.m7122O(c1332qh.f9504e);
        c1639ys.m7119L(c1332qh.f9505f);
        c1639ys.f13062E = c1332qh.f9507h;
        c1639ys.m7116I(c1332qh.f9506g);
    }

    /* JADX INFO: renamed from: g */
    public final void m7182g() {
        C1295ph c1295ph;
        z10 z10Var = this;
        ArrayList arrayList = z10Var.f13222a.f13536q0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            C1639ys c1639ys = (C1639ys) arrayList.get(i);
            if (!c1639ys.f13084a) {
                int[] iArr = c1639ys.f13115p0;
                int i3 = iArr[0];
                int i4 = iArr[1];
                int i5 = c1639ys.f13117r;
                int i6 = c1639ys.f13118s;
                boolean z = i3 == 2 || (i3 == 3 && i5 == 1);
                boolean z2 = i4 == 2 || (i4 == 3 && i6 == 1);
                q20 q20Var = c1639ys.f13090d.f9849e;
                boolean z3 = q20Var.f36j;
                q20 q20Var2 = c1639ys.f13092e.f9849e;
                boolean z4 = q20Var2.f36j;
                boolean z5 = z;
                if (z3 && z4) {
                    z10Var.m7181f(1, q20Var.f33g, 1, q20Var2.f33g, c1639ys);
                    c1639ys.f13084a = true;
                } else if (z3 && z2) {
                    m7181f(1, q20Var.f33g, 2, q20Var2.f33g, c1639ys);
                    u52 u52Var = c1639ys.f13092e;
                    if (i4 == 3) {
                        u52Var.f9849e.f9308m = c1639ys.m7131k();
                    } else {
                        u52Var.f9849e.mo53d(c1639ys.m7131k());
                        c1639ys.f13084a = true;
                    }
                } else if (z4 && z5) {
                    m7181f(2, q20Var.f33g, 1, q20Var2.f33g, c1639ys);
                    ok0 ok0Var = c1639ys.f13090d;
                    if (i3 == 3) {
                        ok0Var.f9849e.f9308m = c1639ys.m7135q();
                    } else {
                        ok0Var.f9849e.mo53d(c1639ys.m7135q());
                        c1639ys.f13084a = true;
                    }
                }
                if (c1639ys.f13084a && (c1295ph = c1639ys.f13092e.f11132l) != null) {
                    c1295ph.mo53d(c1639ys.f13085a0);
                }
                z10Var = this;
            }
            i = i2;
        }
    }
}
