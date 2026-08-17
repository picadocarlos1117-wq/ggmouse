package p000;

import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: le */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1068le implements x80 {

    /* JADX INFO: renamed from: a */
    public final dc1 f6326a;

    /* JADX INFO: renamed from: b */
    public final C0699h2 f6327b;

    /* JADX INFO: renamed from: c */
    public final boolean f6328c;

    /* JADX INFO: renamed from: d */
    public final wx1 f6329d;

    /* JADX INFO: renamed from: e */
    public int f6330e;

    /* JADX INFO: renamed from: f */
    public z80 f6331f;

    /* JADX INFO: renamed from: g */
    public C1105me f6332g;

    /* JADX INFO: renamed from: h */
    public long f6333h;

    /* JADX INFO: renamed from: i */
    public C1151nn[] f6334i;

    /* JADX INFO: renamed from: j */
    public long f6335j;

    /* JADX INFO: renamed from: k */
    public C1151nn f6336k;

    /* JADX INFO: renamed from: l */
    public int f6337l;

    /* JADX INFO: renamed from: m */
    public long f6338m;

    /* JADX INFO: renamed from: n */
    public long f6339n;

    /* JADX INFO: renamed from: o */
    public int f6340o;

    /* JADX INFO: renamed from: p */
    public boolean f6341p;

    public C1068le(int i, k50 k50Var) {
        this.f6329d = k50Var;
        this.f6328c = (i & 1) == 0;
        this.f6326a = new dc1(12);
        this.f6327b = new C0699h2();
        this.f6331f = new ax0(4);
        this.f6334i = new C1151nn[0];
        this.f6338m = -1L;
        this.f6339n = -1L;
        this.f6337l = -1;
        this.f6333h = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:167:0x0381  */
    /* JADX WARN: Code duplicated, block: B:65:0x0107  */
    /* JADX WARN: Code duplicated, block: B:67:0x0110  */
    @Override // p000.x80
    /* JADX INFO: renamed from: b */
    public final int mo124b(y80 y80Var, bb0 bb0Var) throws fc1 {
        boolean z;
        ArrayList arrayList;
        C1151nn c1151nn;
        C1151nn c1151nn2;
        if (this.f6335j != -1) {
            long position = y80Var.getPosition();
            long j = this.f6335j;
            if (j < position || j > 262144 + position) {
                bb0Var.f1280a = j;
                z = true;
            } else {
                y80Var.mo2423m((int) (j - position));
                z = false;
            }
        } else {
            z = false;
        }
        this.f6335j = -1L;
        if (z) {
            return 1;
        }
        int i = this.f6330e;
        C1151nn c1151nn3 = null;
        C0699h2 c0699h2 = this.f6327b;
        int i2 = 2;
        dc1 dc1Var = this.f6326a;
        switch (i) {
            case 0:
                if (!mo125e(y80Var)) {
                    throw fc1.m2799a(null, "AVI Header List not found");
                }
                y80Var.mo2423m(12);
                this.f6330e = 1;
                return 0;
            case 1:
                y80Var.readFully(dc1Var.f2882a, 0, 12);
                dc1Var.m2316F(0);
                c0699h2.getClass();
                c0699h2.f4392a = dc1Var.m2326i();
                c0699h2.f4393b = dc1Var.m2326i();
                c0699h2.f4394c = 0;
                if (c0699h2.f4392a != 1414744396) {
                    throw fc1.m2799a(null, "LIST expected, found: " + c0699h2.f4392a);
                }
                int iM2326i = dc1Var.m2326i();
                c0699h2.f4394c = iM2326i;
                if (iM2326i == 1819436136) {
                    this.f6337l = c0699h2.f4393b;
                    this.f6330e = 2;
                    return 0;
                }
                throw fc1.m2799a(null, "hdrl expected, found: " + c0699h2.f4394c);
            case 2:
                int i3 = this.f6337l - 4;
                dc1 dc1Var2 = new dc1(i3);
                y80Var.readFully(dc1Var2.f2882a, 0, i3);
                ct0 ct0VarM2121b = ct0.m2121b(1819436136, dc1Var2);
                int i4 = ct0VarM2121b.f2611b;
                if (i4 != 1819436136) {
                    throw fc1.m2799a(null, "Unexpected header list type " + i4);
                }
                C1105me c1105me = (C1105me) ct0VarM2121b.m2122a(C1105me.class);
                if (c1105me == null) {
                    throw fc1.m2799a(null, "AviHeader not found");
                }
                this.f6332g = c1105me;
                this.f6333h = ((long) c1105me.f6779c) * ((long) c1105me.f6777a);
                ArrayList arrayList2 = new ArrayList();
                om0 om0VarListIterator = ct0VarM2121b.f2610a.listIterator(0);
                int i5 = 0;
                while (om0VarListIterator.hasNext()) {
                    InterfaceC0787je interfaceC0787je = (InterfaceC0787je) om0VarListIterator.next();
                    if (interfaceC0787je.getType() == 1819440243) {
                        ct0 ct0Var = (ct0) interfaceC0787je;
                        int i6 = i5 + 1;
                        C1142ne c1142ne = (C1142ne) ct0Var.m2122a(C1142ne.class);
                        vv1 vv1Var = (vv1) ct0Var.m2122a(vv1.class);
                        if (c1142ne == null) {
                            AbstractC1337qm.m5542i0("AviExtractor", "Missing Stream Header");
                        } else {
                            if (vv1Var == null) {
                                AbstractC1337qm.m5542i0("AviExtractor", "Missing Stream Format");
                            } else {
                                long j2 = c1142ne.f7387d;
                                long j3 = ((long) c1142ne.f7385b) * 1000000;
                                arrayList = arrayList2;
                                long j4 = c1142ne.f7386c;
                                int i7 = z42.f13274a;
                                long jM7222J = z42.m7222J(j2, j3, j4, RoundingMode.DOWN);
                                be0 be0Var = vv1Var.f11783a;
                                ae0 ae0VarM969a = be0Var.m969a();
                                ae0VarM969a.f185a = Integer.toString(i5);
                                int i8 = c1142ne.f7388e;
                                if (i8 != 0) {
                                    ae0VarM969a.f198n = i8;
                                }
                                wv1 wv1Var = (wv1) ct0Var.m2122a(wv1.class);
                                if (wv1Var != null) {
                                    ae0VarM969a.f186b = wv1Var.f12345a;
                                }
                                int iM6577g = v51.m6577g(be0Var.f1341n);
                                if (iM6577g == 1 || iM6577g == i2) {
                                    c22 c22VarMo750n = this.f6331f.mo750n(i5, iM6577g);
                                    c22VarMo750n.mo1117d(new be0(ae0VarM969a));
                                    c1151nn = new C1151nn(i5, iM6577g, jM7222J, c1142ne.f7387d, c22VarMo750n);
                                    this.f6333h = Math.max(this.f6333h, jM7222J);
                                } else {
                                    c1151nn = null;
                                }
                            }
                            arrayList2 = arrayList;
                            if (c1151nn != null) {
                                arrayList2.add(c1151nn);
                            }
                            i5 = i6;
                        }
                        arrayList = arrayList2;
                        c1151nn = null;
                        arrayList2 = arrayList;
                        if (c1151nn != null) {
                            arrayList2.add(c1151nn);
                        }
                        i5 = i6;
                    }
                    i2 = 2;
                }
                this.f6334i = (C1151nn[]) arrayList2.toArray(new C1151nn[0]);
                this.f6331f.mo748k();
                this.f6330e = 3;
                return 0;
            case 3:
                if (this.f6338m != -1) {
                    long position2 = y80Var.getPosition();
                    long j5 = this.f6338m;
                    if (position2 != j5) {
                        this.f6335j = j5;
                        return 0;
                    }
                }
                y80Var.mo2413a(0, 12, dc1Var.f2882a);
                y80Var.mo2422l();
                dc1Var.m2316F(0);
                c0699h2.getClass();
                c0699h2.f4392a = dc1Var.m2326i();
                c0699h2.f4393b = dc1Var.m2326i();
                c0699h2.f4394c = 0;
                int iM2326i2 = dc1Var.m2326i();
                int i9 = c0699h2.f4392a;
                if (i9 == 1179011410) {
                    y80Var.mo2423m(12);
                    return 0;
                }
                if (i9 != 1414744396 || iM2326i2 != 1769369453) {
                    this.f6335j = y80Var.getPosition() + ((long) c0699h2.f4393b) + 8;
                    return 0;
                }
                long position3 = y80Var.getPosition();
                this.f6338m = position3;
                this.f6339n = position3 + ((long) c0699h2.f4393b) + 8;
                if (!this.f6341p) {
                    C1105me c1105me2 = this.f6332g;
                    c1105me2.getClass();
                    if ((c1105me2.f6778b & 16) == 16) {
                        this.f6330e = 4;
                        this.f6335j = this.f6339n;
                        return 0;
                    }
                    this.f6331f.mo752q(new C0825ke(this.f6333h));
                    this.f6341p = true;
                }
                this.f6335j = y80Var.getPosition() + 12;
                this.f6330e = 6;
                return 0;
            case 4:
                y80Var.readFully(dc1Var.f2882a, 0, 8);
                dc1Var.m2316F(0);
                int iM2326i3 = dc1Var.m2326i();
                int iM2326i4 = dc1Var.m2326i();
                if (iM2326i3 != 829973609) {
                    this.f6335j = y80Var.getPosition() + ((long) iM2326i4);
                    return 0;
                }
                this.f6330e = 5;
                this.f6340o = iM2326i4;
                return 0;
            case 5:
                dc1 dc1Var3 = new dc1(this.f6340o);
                y80Var.readFully(dc1Var3.f2882a, 0, this.f6340o);
                long j6 = 0;
                if (dc1Var3.m2318a() >= 16) {
                    int i10 = dc1Var3.f2883b;
                    dc1Var3.m2317G(8);
                    long jM2326i = dc1Var3.m2326i();
                    long j7 = this.f6338m;
                    j6 = jM2326i <= j7 ? j7 + 8 : 0L;
                    dc1Var3.m2316F(i10);
                }
                while (dc1Var3.m2318a() >= 16) {
                    int iM2326i5 = dc1Var3.m2326i();
                    int iM2326i6 = dc1Var3.m2326i();
                    long jM2326i2 = ((long) dc1Var3.m2326i()) + j6;
                    dc1Var3.m2326i();
                    C1151nn[] c1151nnArr = this.f6334i;
                    int length = c1151nnArr.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 < length) {
                            c1151nn2 = c1151nnArr[i11];
                            if (c1151nn2.f7455b != iM2326i5 && c1151nn2.f7456c != iM2326i5) {
                                i11++;
                            }
                        } else {
                            c1151nn2 = null;
                        }
                    }
                    if (c1151nn2 != null) {
                        boolean z2 = (iM2326i6 & 16) == 16;
                        if (c1151nn2.f7464k == -1) {
                            c1151nn2.f7464k = jM2326i2;
                        }
                        if (z2) {
                            if (c1151nn2.f7463j == c1151nn2.f7466m.length) {
                                long[] jArr = c1151nn2.f7465l;
                                c1151nn2.f7465l = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                                int[] iArr = c1151nn2.f7466m;
                                c1151nn2.f7466m = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
                            }
                            long[] jArr2 = c1151nn2.f7465l;
                            int i12 = c1151nn2.f7463j;
                            jArr2[i12] = jM2326i2;
                            c1151nn2.f7466m[i12] = c1151nn2.f7462i;
                            c1151nn2.f7463j = i12 + 1;
                        }
                        c1151nn2.f7462i++;
                    }
                }
                for (C1151nn c1151nn4 : this.f6334i) {
                    c1151nn4.f7465l = Arrays.copyOf(c1151nn4.f7465l, c1151nn4.f7463j);
                    c1151nn4.f7466m = Arrays.copyOf(c1151nn4.f7466m, c1151nn4.f7463j);
                }
                this.f6341p = true;
                this.f6331f.mo752q(new C0825ke(this, 0, this.f6333h));
                this.f6330e = 6;
                this.f6335j = this.f6338m;
                return 0;
            case 6:
                if (y80Var.getPosition() >= this.f6339n) {
                    return -1;
                }
                C1151nn c1151nn5 = this.f6336k;
                if (c1151nn5 != null) {
                    int i13 = c1151nn5.f7460g;
                    int iMo1116c = i13 - c1151nn5.f7454a.mo1116c(y80Var, i13, false);
                    c1151nn5.f7460g = iMo1116c;
                    boolean z3 = iMo1116c == 0;
                    if (z3) {
                        if (c1151nn5.f7459f > 0) {
                            c22 c22Var = c1151nn5.f7454a;
                            int i14 = c1151nn5.f7461h;
                            c22Var.mo1114a((c1151nn5.f7457d * ((long) i14)) / ((long) c1151nn5.f7458e), Arrays.binarySearch(c1151nn5.f7466m, i14) >= 0 ? 1 : 0, c1151nn5.f7459f, 0, null);
                        }
                        c1151nn5.f7461h++;
                    }
                    if (z3) {
                        this.f6336k = null;
                    }
                    return 0;
                }
                if ((y80Var.getPosition() & 1) == 1) {
                    y80Var.mo2423m(1);
                }
                y80Var.mo2413a(0, 12, dc1Var.f2882a);
                dc1Var.m2316F(0);
                int iM2326i7 = dc1Var.m2326i();
                if (iM2326i7 == 1414744396) {
                    dc1Var.m2316F(8);
                    y80Var.mo2423m(dc1Var.m2326i() == 1769369453 ? 12 : 8);
                    y80Var.mo2422l();
                    return 0;
                }
                int iM2326i8 = dc1Var.m2326i();
                if (iM2326i7 == 1263424842) {
                    this.f6335j = y80Var.getPosition() + ((long) iM2326i8) + 8;
                    return 0;
                }
                y80Var.mo2423m(8);
                y80Var.mo2422l();
                for (C1151nn c1151nn6 : this.f6334i) {
                    if (c1151nn6.f7455b == iM2326i7 || c1151nn6.f7456c == iM2326i7) {
                        c1151nn3 = c1151nn6;
                        if (c1151nn3 == null) {
                            this.f6335j = y80Var.getPosition() + ((long) iM2326i8);
                            return 0;
                        }
                        c1151nn3.f7459f = iM2326i8;
                        c1151nn3.f7460g = iM2326i8;
                        this.f6336k = c1151nn3;
                        return 0;
                    }
                }
                if (c1151nn3 == null) {
                    this.f6335j = y80Var.getPosition() + ((long) iM2326i8);
                    return 0;
                }
                c1151nn3.f7459f = iM2326i8;
                c1151nn3.f7460g = iM2326i8;
                this.f6336k = c1151nn3;
                return 0;
            default:
                throw new AssertionError();
        }
    }

    @Override // p000.x80
    /* JADX INFO: renamed from: e */
    public final boolean mo125e(y80 y80Var) {
        dc1 dc1Var = this.f6326a;
        y80Var.mo2413a(0, 12, dc1Var.f2882a);
        dc1Var.m2316F(0);
        if (dc1Var.m2326i() == 1179011410) {
            dc1Var.m2317G(4);
            if (dc1Var.m2326i() == 541677121) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.x80
    /* JADX INFO: renamed from: f */
    public final void mo126f(long j, long j2) {
        this.f6335j = -1L;
        this.f6336k = null;
        for (C1151nn c1151nn : this.f6334i) {
            if (c1151nn.f7463j == 0) {
                c1151nn.f7461h = 0;
            } else {
                c1151nn.f7461h = c1151nn.f7466m[z42.m7230d(c1151nn.f7465l, j, true)];
            }
        }
        if (j != 0) {
            this.f6330e = 6;
        } else if (this.f6334i.length == 0) {
            this.f6330e = 0;
        } else {
            this.f6330e = 3;
        }
    }

    @Override // p000.x80
    /* JADX INFO: renamed from: k */
    public final void mo127k(z80 z80Var) {
        this.f6330e = 0;
        if (this.f6328c) {
            z80Var = new C1174o9(z80Var, this.f6329d);
        }
        this.f6331f = z80Var;
        this.f6335j = -1L;
    }

    @Override // p000.x80
    public final void release() {
    }
}
