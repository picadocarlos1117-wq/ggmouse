package p000;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class o41 implements j21, i21 {

    /* JADX INFO: renamed from: a */
    public final j21[] f7649a;

    /* JADX INFO: renamed from: b */
    public final IdentityHashMap f7650b;

    /* JADX INFO: renamed from: c */
    public final k50 f7651c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f7652d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final HashMap f7653e = new HashMap();

    /* JADX INFO: renamed from: f */
    public i21 f7654f;

    /* JADX INFO: renamed from: g */
    public z12 f7655g;

    /* JADX INFO: renamed from: m */
    public j21[] f7656m;

    /* JADX INFO: renamed from: n */
    public C1453tr f7657n;

    public o41(k50 k50Var, long[] jArr, j21... j21VarArr) {
        this.f7651c = k50Var;
        this.f7649a = j21VarArr;
        k50Var.getClass();
        om0 om0Var = qm0.f9540b;
        kk1 kk1Var = kk1.f5896e;
        this.f7657n = new C1453tr(kk1Var, kk1Var);
        this.f7650b = new IdentityHashMap();
        this.f7656m = new j21[0];
        for (int i = 0; i < j21VarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.f7649a[i] = new m02(j21VarArr[i], j);
            }
        }
    }

    @Override // p000.i21
    /* JADX INFO: renamed from: a */
    public final void mo3331a(j21 j21Var) {
        ArrayList arrayList = this.f7652d;
        arrayList.remove(j21Var);
        if (arrayList.isEmpty()) {
            j21[] j21VarArr = this.f7649a;
            int i = 0;
            for (j21 j21Var2 : j21VarArr) {
                i += j21Var2.mo3536m().f13237a;
            }
            y12[] y12VarArr = new y12[i];
            int i2 = 0;
            for (int i3 = 0; i3 < j21VarArr.length; i3++) {
                z12 z12VarMo3536m = j21VarArr[i3].mo3536m();
                int i4 = z12VarMo3536m.f13237a;
                int i5 = 0;
                while (i5 < i4) {
                    y12 y12VarM7184a = z12VarMo3536m.m7184a(i5);
                    int i6 = y12VarM7184a.f12802a;
                    be0[] be0VarArr = new be0[i6];
                    for (int i7 = 0; i7 < i6; i7++) {
                        be0 be0Var = y12VarM7184a.f12805d[i7];
                        ae0 ae0VarM969a = be0Var.m969a();
                        StringBuilder sb = new StringBuilder();
                        sb.append(i3);
                        sb.append(":");
                        String str = be0Var.f1328a;
                        if (str == null) {
                            str = "";
                        }
                        sb.append(str);
                        ae0VarM969a.f185a = sb.toString();
                        be0VarArr[i7] = new be0(ae0VarM969a);
                    }
                    y12 y12Var = new y12(i3 + ":" + y12VarM7184a.f12803b, be0VarArr);
                    this.f7653e.put(y12Var, y12VarM7184a);
                    y12VarArr[i2] = y12Var;
                    i5++;
                    i2++;
                }
            }
            this.f7655g = new z12(y12VarArr);
            i21 i21Var = this.f7654f;
            i21Var.getClass();
            i21Var.mo3331a(this);
        }
    }

    @Override // p000.j21
    /* JADX INFO: renamed from: b */
    public final long mo3529b(n80[] n80VarArr, boolean[] zArr, yo1[] yo1VarArr, boolean[] zArr2, long j) {
        IdentityHashMap identityHashMap;
        int[] iArr = new int[n80VarArr.length];
        int[] iArr2 = new int[n80VarArr.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            int length = n80VarArr.length;
            identityHashMap = this.f7650b;
            if (i2 >= length) {
                break;
            }
            yo1 yo1Var = yo1VarArr[i2];
            Integer num = yo1Var == null ? null : (Integer) identityHashMap.get(yo1Var);
            iArr[i2] = num == null ? -1 : num.intValue();
            n80 n80Var = n80VarArr[i2];
            if (n80Var != null) {
                String str = n80Var.mo855a().f12803b;
                iArr2[i2] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i2] = -1;
            }
            i2++;
        }
        identityHashMap.clear();
        int length2 = n80VarArr.length;
        yo1[] yo1VarArr2 = new yo1[length2];
        yo1[] yo1VarArr3 = new yo1[n80VarArr.length];
        n80[] n80VarArr2 = new n80[n80VarArr.length];
        j21[] j21VarArr = this.f7649a;
        ArrayList arrayList = new ArrayList(j21VarArr.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < j21VarArr.length) {
            int i4 = i;
            while (i4 < n80VarArr.length) {
                yo1VarArr3[i4] = iArr[i4] == i3 ? yo1VarArr[i4] : null;
                if (iArr2[i4] == i3) {
                    n80 n80Var2 = n80VarArr[i4];
                    n80Var2.getClass();
                    y12 y12Var = (y12) this.f7653e.get(n80Var2.mo855a());
                    y12Var.getClass();
                    n80VarArr2[i4] = new n41(n80Var2, y12Var);
                } else {
                    n80VarArr2[i4] = null;
                }
                i4++;
                iArr = iArr;
            }
            int[] iArr3 = iArr;
            j21[] j21VarArr2 = j21VarArr;
            int i5 = i3;
            long jMo3529b = j21VarArr2[i3].mo3529b(n80VarArr2, zArr, yo1VarArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = jMo3529b;
            } else if (jMo3529b != j2) {
                f40.m2719o("Children enabled at different positions.");
                return 0L;
            }
            boolean z = false;
            for (int i6 = 0; i6 < n80VarArr.length; i6++) {
                if (iArr2[i6] == i5) {
                    yo1 yo1Var2 = yo1VarArr3[i6];
                    yo1Var2.getClass();
                    yo1VarArr2[i6] = yo1VarArr3[i6];
                    identityHashMap.put(yo1Var2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr3[i6] == i5) {
                    ki0.m3864h(yo1VarArr3[i6] == null);
                }
            }
            if (z) {
                arrayList.add(j21VarArr2[i5]);
            }
            i3 = i5 + 1;
            j21VarArr = j21VarArr2;
            iArr = iArr3;
            i = 0;
        }
        int i7 = i;
        System.arraycopy(yo1VarArr2, i7, yo1VarArr, i7, length2);
        this.f7656m = (j21[]) arrayList.toArray(new j21[i7]);
        AbstractList abstractListM5540h0 = AbstractC1337qm.m5540h0(arrayList, new l41(2));
        this.f7651c.getClass();
        this.f7657n = new C1453tr(arrayList, abstractListM5540h0);
        return j2;
    }

    @Override // p000.yq1
    /* JADX INFO: renamed from: c */
    public final long mo4342c() {
        return this.f7657n.mo4342c();
    }

    @Override // p000.j21
    /* JADX INFO: renamed from: d */
    public final long mo3530d(long j, lq1 lq1Var) {
        j21[] j21VarArr = this.f7656m;
        return (j21VarArr.length > 0 ? j21VarArr[0] : this.f7649a[0]).mo3530d(j, lq1Var);
    }

    @Override // p000.j21
    /* JADX INFO: renamed from: e */
    public final void mo3531e() {
        for (j21 j21Var : this.f7649a) {
            j21Var.mo3531e();
        }
    }

    @Override // p000.j21
    /* JADX INFO: renamed from: f */
    public final long mo3532f(long j) {
        long jMo3532f = this.f7656m[0].mo3532f(j);
        int i = 1;
        while (true) {
            j21[] j21VarArr = this.f7656m;
            if (i >= j21VarArr.length) {
                return jMo3532f;
            }
            if (j21VarArr[i].mo3532f(jMo3532f) != jMo3532f) {
                f40.m2719o("Unexpected child seekToUs result.");
                return 0L;
            }
            i++;
        }
    }

    @Override // p000.j21
    /* JADX INFO: renamed from: g */
    public final void mo3533g(long j) {
        for (j21 j21Var : this.f7656m) {
            j21Var.mo3533g(j);
        }
    }

    @Override // p000.yq1
    /* JADX INFO: renamed from: h */
    public final boolean mo4343h() {
        return this.f7657n.mo4343h();
    }

    @Override // p000.i21
    /* JADX INFO: renamed from: i */
    public final void mo3332i(yq1 yq1Var) {
        i21 i21Var = this.f7654f;
        i21Var.getClass();
        i21Var.mo3332i(this);
    }

    @Override // p000.j21
    /* JADX INFO: renamed from: j */
    public final long mo3534j() {
        long j;
        j21 j21Var;
        j21[] j21VarArr = this.f7656m;
        int length = j21VarArr.length;
        long j2 = -9223372036854775807L;
        long j3 = -9223372036854775807L;
        int i = 0;
        while (i < length) {
            j21 j21Var2 = j21VarArr[i];
            long jMo3534j = j21Var2.mo3534j();
            if (jMo3534j == j2) {
                j = j2;
                if (j3 != j && j21Var2.mo3532f(j3) != j3) {
                    f40.m2719o("Unexpected child seekToUs result.");
                    return 0L;
                }
            } else if (j3 == j2) {
                j21[] j21VarArr2 = this.f7656m;
                int length2 = j21VarArr2.length;
                int i2 = 0;
                while (true) {
                    j = j2;
                    if (i2 >= length2 || (j21Var = j21VarArr2[i2]) == j21Var2) {
                        break;
                    }
                    if (j21Var.mo3532f(jMo3534j) != jMo3534j) {
                        f40.m2719o("Unexpected child seekToUs result.");
                        return 0L;
                    }
                    i2++;
                    j2 = j;
                }
                j3 = jMo3534j;
            } else {
                j = j2;
                if (jMo3534j != j3) {
                    f40.m2719o("Conflicting discontinuities.");
                    return 0L;
                }
            }
            i++;
            j2 = j;
        }
        return j3;
    }

    @Override // p000.j21
    /* JADX INFO: renamed from: l */
    public final void mo3535l(i21 i21Var, long j) {
        this.f7654f = i21Var;
        ArrayList arrayList = this.f7652d;
        j21[] j21VarArr = this.f7649a;
        Collections.addAll(arrayList, j21VarArr);
        for (j21 j21Var : j21VarArr) {
            j21Var.mo3535l(this, j);
        }
    }

    @Override // p000.j21
    /* JADX INFO: renamed from: m */
    public final z12 mo3536m() {
        z12 z12Var = this.f7655g;
        z12Var.getClass();
        return z12Var;
    }

    @Override // p000.yq1
    /* JADX INFO: renamed from: o */
    public final boolean mo4344o(fv0 fv0Var) {
        ArrayList arrayList = this.f7652d;
        if (arrayList.isEmpty()) {
            return this.f7657n.mo4344o(fv0Var);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((j21) arrayList.get(i)).mo4344o(fv0Var);
        }
        return false;
    }

    @Override // p000.yq1
    /* JADX INFO: renamed from: p */
    public final long mo4345p() {
        return this.f7657n.mo4345p();
    }

    @Override // p000.yq1
    /* JADX INFO: renamed from: r */
    public final void mo4346r(long j) {
        this.f7657n.mo4346r(j);
    }
}
