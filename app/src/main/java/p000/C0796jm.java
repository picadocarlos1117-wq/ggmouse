package p000;

import com.example.ssmousepro.injection.TouchPipeline;
import java.util.ArrayList;

/* JADX INFO: renamed from: jm */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0796jm extends r92 {

    /* JADX INFO: renamed from: k */
    public final ArrayList f5452k;

    /* JADX INFO: renamed from: l */
    public int f5453l;

    public C0796jm(C1639ys c1639ys, int i) {
        C1639ys c1639ys2;
        super(c1639ys);
        ArrayList arrayList = new ArrayList();
        this.f5452k = arrayList;
        this.f9850f = i;
        C1639ys c1639ys3 = this.f9846b;
        C1639ys c1639ysM7133m = c1639ys3.m7133m(i);
        while (true) {
            c1639ys2 = c1639ys3;
            c1639ys3 = c1639ysM7133m;
            if (c1639ys3 == null) {
                break;
            } else {
                c1639ysM7133m = c1639ys3.m7133m(this.f9850f);
            }
        }
        this.f9846b = c1639ys2;
        int i2 = this.f9850f;
        arrayList.add(i2 == 0 ? c1639ys2.f13090d : i2 == 1 ? c1639ys2.f13092e : null);
        C1639ys c1639ysM7132l = c1639ys2.m7132l(this.f9850f);
        while (c1639ysM7132l != null) {
            int i3 = this.f9850f;
            arrayList.add(i3 == 0 ? c1639ysM7132l.f13090d : i3 == 1 ? c1639ysM7132l.f13092e : null);
            c1639ysM7132l = c1639ysM7132l.m7132l(this.f9850f);
        }
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            r92 r92Var = (r92) obj;
            int i5 = this.f9850f;
            if (i5 == 0) {
                r92Var.f9846b.f13086b = this;
            } else if (i5 == 1) {
                r92Var.f9846b.f13088c = this;
            }
        }
        if (this.f9850f == 0 && ((C1676zs) this.f9846b.f13077T).f13541v0 && arrayList.size() > 1) {
            this.f9846b = ((r92) arrayList.get(arrayList.size() - 1)).f9846b;
        }
        int i6 = this.f9850f;
        C1639ys c1639ys4 = this.f9846b;
        this.f5453l = i6 == 0 ? c1639ys4.f13101i0 : c1639ys4.f13103j0;
    }

    /* JADX WARN: Code duplicated, block: B:293:0x00e8 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:64:0x00da  */
    /* JADX WARN: Code duplicated, block: B:65:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e0 A[ADDED_TO_REGION] */
    @Override // p000.y10
    /* JADX INFO: renamed from: a */
    public final void mo50a(y10 y10Var) {
        int i;
        int i2;
        boolean z;
        float f;
        int i3;
        int i4;
        int i5;
        int i6;
        float f2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        float f3;
        a20 a20Var = this.f9852h;
        if (a20Var.f36j) {
            a20 a20Var2 = this.f9853i;
            if (a20Var2.f36j) {
                C1639ys c1639ys = this.f9846b.f13077T;
                boolean z2 = c1639ys instanceof C1676zs ? ((C1676zs) c1639ys).f13541v0 : false;
                int i13 = a20Var2.f33g - a20Var.f33g;
                ArrayList arrayList = this.f5452k;
                int size = arrayList.size();
                int i14 = 0;
                while (true) {
                    i = -1;
                    i2 = 8;
                    if (i14 >= size) {
                        i14 = -1;
                        break;
                    } else if (((r92) arrayList.get(i14)).f9846b.f13097g0 != 8) {
                        break;
                    } else {
                        i14++;
                    }
                }
                int i15 = size - 1;
                for (int i16 = i15; i16 >= 0; i16--) {
                    if (((r92) arrayList.get(i16)).f9846b.f13097g0 != 8) {
                        i = i16;
                        break;
                    }
                }
                int i17 = 0;
                while (true) {
                    if (i17 >= 2) {
                        z = z2;
                        f = 0.0f;
                        i3 = 0;
                        i4 = 0;
                        i5 = 0;
                        break;
                    }
                    f = 0.0f;
                    int i18 = 0;
                    i5 = 0;
                    int i19 = 0;
                    int i20 = 0;
                    while (i18 < size) {
                        r92 r92Var = (r92) arrayList.get(i18);
                        C1639ys c1639ys2 = r92Var.f9846b;
                        boolean z3 = z2;
                        if (c1639ys2.f13097g0 == i2) {
                            i11 = i17;
                        } else {
                            i20++;
                            if (i18 > 0 && i18 >= i14) {
                                i5 += r92Var.f9852h.f32f;
                            }
                            q20 q20Var = r92Var.f9849e;
                            int i21 = q20Var.f33g;
                            i11 = i17;
                            boolean z4 = r92Var.f9848d != 3;
                            if (z4) {
                                int i22 = this.f9850f;
                                if (i22 == 0 && !c1639ys2.f13090d.f9849e.f36j) {
                                    return;
                                }
                                if (i22 == 1 && !c1639ys2.f13092e.f9849e.f36j) {
                                    return;
                                }
                            } else {
                                if (r92Var.f9845a == 1 && i11 == 0) {
                                    i12 = q20Var.f9308m;
                                    i19++;
                                } else {
                                    if (q20Var.f36j) {
                                        i12 = i21;
                                    }
                                    if (z4) {
                                        i5 += i12;
                                    } else {
                                        i19++;
                                        f3 = c1639ys2.f13105k0[this.f9850f];
                                        if (f3 >= TouchPipeline.SIZE) {
                                            f += f3;
                                        }
                                    }
                                    if (i18 >= i15 && i18 < i) {
                                        i5 += -r92Var.f9853i.f32f;
                                    }
                                }
                                z4 = true;
                                if (z4) {
                                    i19++;
                                    f3 = c1639ys2.f13105k0[this.f9850f];
                                    if (f3 >= TouchPipeline.SIZE) {
                                        f += f3;
                                    }
                                } else {
                                    i5 += i12;
                                }
                                if (i18 >= i15) {
                                }
                            }
                            i12 = i21;
                            if (z4) {
                                i19++;
                                f3 = c1639ys2.f13105k0[this.f9850f];
                                if (f3 >= TouchPipeline.SIZE) {
                                    f += f3;
                                }
                            } else {
                                i5 += i12;
                            }
                            if (i18 >= i15) {
                            }
                        }
                        i18++;
                        z2 = z3;
                        i17 = i11;
                        i2 = 8;
                    }
                    z = z2;
                    int i23 = i17;
                    if (i5 < i13 || i19 == 0) {
                        i3 = i19;
                        i4 = i20;
                        break;
                    } else {
                        i17 = i23 + 1;
                        z2 = z;
                        i2 = 8;
                    }
                }
                int i24 = a20Var.f33g;
                if (z) {
                    i24 = a20Var2.f33g;
                }
                float f4 = 0.5f;
                if (i5 > i13) {
                    i24 = z ? i24 + ((int) (((i5 - i13) / 2.0f) + 0.5f)) : i24 - ((int) (((i5 - i13) / 2.0f) + 0.5f));
                }
                if (i3 > 0) {
                    float f5 = i13 - i5;
                    int i25 = (int) ((f5 / i3) + 0.5f);
                    int i26 = 0;
                    int i27 = 0;
                    while (i26 < size) {
                        float f6 = f4;
                        r92 r92Var2 = (r92) arrayList.get(i26);
                        int i28 = i24;
                        C1639ys c1639ys3 = r92Var2.f9846b;
                        int i29 = i3;
                        q20 q20Var2 = r92Var2.f9849e;
                        float f7 = f5;
                        int i30 = i25;
                        if (c1639ys3.f13097g0 != 8 && r92Var2.f9848d == 3 && !q20Var2.f36j) {
                            int i31 = f > TouchPipeline.SIZE ? (int) (((c1639ys3.f13105k0[this.f9850f] * f7) / f) + f6) : i30;
                            if (this.f9850f == 0) {
                                i9 = c1639ys3.f13121v;
                                i10 = c1639ys3.f13120u;
                            } else {
                                i9 = c1639ys3.f13124y;
                                i10 = c1639ys3.f13123x;
                            }
                            int iMax = Math.max(i10, r92Var2.f9845a == 1 ? Math.min(i31, q20Var2.f9308m) : i31);
                            if (i9 > 0) {
                                iMax = Math.min(i9, iMax);
                            }
                            if (iMax != i31) {
                                i27++;
                                i31 = iMax;
                            }
                            q20Var2.mo53d(i31);
                        }
                        i26++;
                        i24 = i28;
                        f4 = f6;
                        i3 = i29;
                        f5 = f7;
                        i25 = i30;
                    }
                    i6 = i24;
                    f2 = f4;
                    int i32 = i3;
                    if (i27 > 0) {
                        i3 = i32 - i27;
                        i5 = 0;
                        for (int i33 = 0; i33 < size; i33++) {
                            r92 r92Var3 = (r92) arrayList.get(i33);
                            if (r92Var3.f9846b.f13097g0 != 8) {
                                if (i33 > 0 && i33 >= i14) {
                                    i5 += r92Var3.f9852h.f32f;
                                }
                                i5 += r92Var3.f9849e.f33g;
                                if (i33 < i15 && i33 < i) {
                                    i5 += -r92Var3.f9853i.f32f;
                                }
                            }
                        }
                    } else {
                        i3 = i32;
                    }
                    i8 = 2;
                    if (this.f5453l == 2 && i27 == 0) {
                        i7 = 0;
                        this.f5453l = 0;
                    } else {
                        i7 = 0;
                    }
                } else {
                    i6 = i24;
                    f2 = 0.5f;
                    i7 = 0;
                    i8 = 2;
                }
                if (i5 > i13) {
                    this.f5453l = i8;
                }
                if (i4 > 0 && i3 == 0 && i14 == i) {
                    this.f5453l = i8;
                }
                int i34 = this.f5453l;
                if (i34 == 1) {
                    int i35 = i4 > 1 ? (i13 - i5) / (i4 - 1) : i4 == 1 ? (i13 - i5) / 2 : i7;
                    if (i3 > 0) {
                        i35 = i7;
                    }
                    int i36 = i6;
                    for (int i37 = i7; i37 < size; i37++) {
                        r92 r92Var4 = (r92) arrayList.get(z ? size - (i37 + 1) : i37);
                        C1639ys c1639ys4 = r92Var4.f9846b;
                        a20 a20Var3 = r92Var4.f9853i;
                        a20 a20Var4 = r92Var4.f9852h;
                        if (c1639ys4.f13097g0 == 8) {
                            a20Var4.mo53d(i36);
                            a20Var3.mo53d(i36);
                        } else {
                            if (i37 > 0) {
                                i36 = z ? i36 - i35 : i36 + i35;
                            }
                            if (i37 > 0 && i37 >= i14) {
                                i36 = z ? i36 - a20Var4.f32f : i36 + a20Var4.f32f;
                            }
                            if (z) {
                                a20Var3.mo53d(i36);
                            } else {
                                a20Var4.mo53d(i36);
                            }
                            q20 q20Var3 = r92Var4.f9849e;
                            int i38 = q20Var3.f33g;
                            if (r92Var4.f9848d == 3 && r92Var4.f9845a == 1) {
                                i38 = q20Var3.f9308m;
                            }
                            i36 = z ? i36 - i38 : i36 + i38;
                            if (z) {
                                a20Var4.mo53d(i36);
                            } else {
                                a20Var3.mo53d(i36);
                            }
                            r92Var4.f9851g = true;
                            if (i37 < i15 && i37 < i) {
                                i36 = z ? i36 - (-a20Var3.f32f) : i36 + (-a20Var3.f32f);
                            }
                        }
                    }
                    return;
                }
                if (i34 == 0) {
                    int i39 = (i13 - i5) / (i4 + 1);
                    if (i3 > 0) {
                        i39 = i7;
                    }
                    int i40 = i6;
                    for (int i41 = i7; i41 < size; i41++) {
                        r92 r92Var5 = (r92) arrayList.get(z ? size - (i41 + 1) : i41);
                        C1639ys c1639ys5 = r92Var5.f9846b;
                        a20 a20Var5 = r92Var5.f9853i;
                        a20 a20Var6 = r92Var5.f9852h;
                        if (c1639ys5.f13097g0 == 8) {
                            a20Var6.mo53d(i40);
                            a20Var5.mo53d(i40);
                        } else {
                            int i42 = z ? i40 - i39 : i40 + i39;
                            if (i41 > 0 && i41 >= i14) {
                                i42 = z ? i42 - a20Var6.f32f : i42 + a20Var6.f32f;
                            }
                            if (z) {
                                a20Var5.mo53d(i42);
                            } else {
                                a20Var6.mo53d(i42);
                            }
                            q20 q20Var4 = r92Var5.f9849e;
                            int iMin = q20Var4.f33g;
                            if (r92Var5.f9848d == 3 && r92Var5.f9845a == 1) {
                                iMin = Math.min(iMin, q20Var4.f9308m);
                            }
                            i40 = z ? i42 - iMin : i42 + iMin;
                            if (z) {
                                a20Var6.mo53d(i40);
                            } else {
                                a20Var5.mo53d(i40);
                            }
                            if (i41 < i15 && i41 < i) {
                                i40 = z ? i40 - (-a20Var5.f32f) : i40 + (-a20Var5.f32f);
                            }
                        }
                    }
                    return;
                }
                if (i34 == 2) {
                    int i43 = this.f9850f;
                    C1639ys c1639ys6 = this.f9846b;
                    float f8 = i43 == 0 ? c1639ys6.f13091d0 : c1639ys6.f13093e0;
                    if (z) {
                        f8 = 1.0f - f8;
                    }
                    int i44 = (int) (((i13 - i5) * f8) + f2);
                    if (i44 < 0 || i3 > 0) {
                        i44 = i7;
                    }
                    int i45 = z ? i6 - i44 : i6 + i44;
                    for (int i46 = i7; i46 < size; i46++) {
                        r92 r92Var6 = (r92) arrayList.get(z ? size - (i46 + 1) : i46);
                        C1639ys c1639ys7 = r92Var6.f9846b;
                        a20 a20Var7 = r92Var6.f9853i;
                        a20 a20Var8 = r92Var6.f9852h;
                        if (c1639ys7.f13097g0 == 8) {
                            a20Var8.mo53d(i45);
                            a20Var7.mo53d(i45);
                        } else {
                            if (i46 > 0 && i46 >= i14) {
                                i45 = z ? i45 - a20Var8.f32f : i45 + a20Var8.f32f;
                            }
                            if (z) {
                                a20Var7.mo53d(i45);
                            } else {
                                a20Var8.mo53d(i45);
                            }
                            q20 q20Var5 = r92Var6.f9849e;
                            int i47 = q20Var5.f33g;
                            if (r92Var6.f9848d == 3 && r92Var6.f9845a == 1) {
                                i47 = q20Var5.f9308m;
                            }
                            i45 = z ? i45 - i47 : i45 + i47;
                            if (z) {
                                a20Var8.mo53d(i45);
                            } else {
                                a20Var7.mo53d(i45);
                            }
                            if (i46 < i15 && i46 < i) {
                                i45 = z ? i45 - (-a20Var7.f32f) : i45 + (-a20Var7.f32f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // p000.r92
    /* JADX INFO: renamed from: d */
    public final void mo3001d() {
        ArrayList arrayList = this.f5452k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((r92) obj).mo3001d();
        }
        int size2 = arrayList.size();
        if (size2 < 1) {
            return;
        }
        C1639ys c1639ys = ((r92) arrayList.get(0)).f9846b;
        C1639ys c1639ys2 = ((r92) arrayList.get(size2 - 1)).f9846b;
        int i2 = this.f9850f;
        a20 a20Var = this.f9853i;
        a20 a20Var2 = this.f9852h;
        if (i2 == 0) {
            C1082ls c1082ls = c1639ys.f13066I;
            C1082ls c1082ls2 = c1639ys2.f13068K;
            a20 a20VarM5749i = r92.m5749i(c1082ls, 0);
            int iM4277e = c1082ls.m4277e();
            C1639ys c1639ysM3667m = m3667m();
            if (c1639ysM3667m != null) {
                iM4277e = c1639ysM3667m.f13066I.m4277e();
            }
            if (a20VarM5749i != null) {
                r92.m5747b(a20Var2, a20VarM5749i, iM4277e);
            }
            a20 a20VarM5749i2 = r92.m5749i(c1082ls2, 0);
            int iM4277e2 = c1082ls2.m4277e();
            C1639ys c1639ysM3668n = m3668n();
            if (c1639ysM3668n != null) {
                iM4277e2 = c1639ysM3668n.f13068K.m4277e();
            }
            if (a20VarM5749i2 != null) {
                r92.m5747b(a20Var, a20VarM5749i2, -iM4277e2);
            }
        } else {
            C1082ls c1082ls3 = c1639ys.f13067J;
            C1082ls c1082ls4 = c1639ys2.f13069L;
            a20 a20VarM5749i3 = r92.m5749i(c1082ls3, 1);
            int iM4277e3 = c1082ls3.m4277e();
            C1639ys c1639ysM3667m2 = m3667m();
            if (c1639ysM3667m2 != null) {
                iM4277e3 = c1639ysM3667m2.f13067J.m4277e();
            }
            if (a20VarM5749i3 != null) {
                r92.m5747b(a20Var2, a20VarM5749i3, iM4277e3);
            }
            a20 a20VarM5749i4 = r92.m5749i(c1082ls4, 1);
            int iM4277e4 = c1082ls4.m4277e();
            C1639ys c1639ysM3668n2 = m3668n();
            if (c1639ysM3668n2 != null) {
                iM4277e4 = c1639ysM3668n2.f13069L.m4277e();
            }
            if (a20VarM5749i4 != null) {
                r92.m5747b(a20Var, a20VarM5749i4, -iM4277e4);
            }
        }
        a20Var2.f27a = this;
        a20Var.f27a = this;
    }

    @Override // p000.r92
    /* JADX INFO: renamed from: e */
    public final void mo3002e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f5452k;
            if (i >= arrayList.size()) {
                return;
            }
            ((r92) arrayList.get(i)).mo3002e();
            i++;
        }
    }

    @Override // p000.r92
    /* JADX INFO: renamed from: f */
    public final void mo3003f() {
        this.f9847c = null;
        ArrayList arrayList = this.f5452k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((r92) obj).mo3003f();
        }
    }

    @Override // p000.r92
    /* JADX INFO: renamed from: j */
    public final long mo3666j() {
        ArrayList arrayList = this.f5452k;
        int size = arrayList.size();
        long jMo3666j = 0;
        for (int i = 0; i < size; i++) {
            r92 r92Var = (r92) arrayList.get(i);
            jMo3666j = ((long) r92Var.f9853i.f32f) + r92Var.mo3666j() + jMo3666j + ((long) r92Var.f9852h.f32f);
        }
        return jMo3666j;
    }

    @Override // p000.r92
    /* JADX INFO: renamed from: k */
    public final boolean mo3004k() {
        ArrayList arrayList = this.f5452k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((r92) arrayList.get(i)).mo3004k()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final C1639ys m3667m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f5452k;
            if (i >= arrayList.size()) {
                return null;
            }
            C1639ys c1639ys = ((r92) arrayList.get(i)).f9846b;
            if (c1639ys.f13097g0 != 8) {
                return c1639ys;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: n */
    public final C1639ys m3668n() {
        ArrayList arrayList = this.f5452k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C1639ys c1639ys = ((r92) arrayList.get(size)).f9846b;
            if (c1639ys.f13097g0 != 8) {
                return c1639ys;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f9850f == 0 ? "horizontal : " : "vertical : ");
        ArrayList arrayList = this.f5452k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            sb.append("<");
            sb.append((r92) obj);
            sb.append("> ");
        }
        return sb.toString();
    }
}
