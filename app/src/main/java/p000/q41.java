package p000;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class q41 extends AbstractC1234or {

    /* JADX INFO: renamed from: s */
    public static final z11 f9342s;

    /* JADX INFO: renamed from: k */
    public final AbstractC0791jh[] f9343k;

    /* JADX INFO: renamed from: l */
    public final ArrayList f9344l;

    /* JADX INFO: renamed from: m */
    public final t02[] f9345m;

    /* JADX INFO: renamed from: n */
    public final ArrayList f9346n;

    /* JADX INFO: renamed from: o */
    public final k50 f9347o;

    /* JADX INFO: renamed from: p */
    public int f9348p;

    /* JADX INFO: renamed from: q */
    public long[][] f9349q;

    /* JADX INFO: renamed from: r */
    public C1079lp f9350r;

    static {
        bb0 bb0Var = new bb0();
        om0 om0Var = qm0.f9540b;
        kk1 kk1Var = kk1.f5896e;
        List list = Collections.EMPTY_LIST;
        kk1 kk1Var2 = kk1.f5896e;
        u11 u11Var = new u11();
        f9342s = new z11("MergingMediaSource", new t11(bb0Var), null, new v11(u11Var), d21.f2726B, x11.f12412a);
    }

    public q41(AbstractC0791jh... abstractC0791jhArr) {
        k50 k50Var = new k50((byte) 0, 19);
        this.f9343k = abstractC0791jhArr;
        this.f9347o = k50Var;
        this.f9346n = new ArrayList(Arrays.asList(abstractC0791jhArr));
        this.f9348p = -1;
        this.f9344l = new ArrayList(abstractC0791jhArr.length);
        for (int i = 0; i < abstractC0791jhArr.length; i++) {
            this.f9344l.add(new ArrayList());
        }
        this.f9345m = new t02[abstractC0791jhArr.length];
        this.f9349q = new long[0][];
        new HashMap();
        sc2.m6060d(8, "expectedKeys");
        sc2.m6060d(2, "expectedValuesPerKey");
        C1117mq c1117mqM4438a = C1117mq.m4438a();
        new x61();
        p32.m5175k(c1117mqM4438a.isEmpty());
    }

    @Override // p000.AbstractC0791jh
    /* JADX INFO: renamed from: a */
    public final j21 mo1020a(q21 q21Var, C0547cy c0547cy, long j) {
        AbstractC0791jh[] abstractC0791jhArr = this.f9343k;
        int length = abstractC0791jhArr.length;
        j21[] j21VarArr = new j21[length];
        t02[] t02VarArr = this.f9345m;
        int iMo1054b = t02VarArr[0].mo1054b(q21Var.f9309a);
        for (int i = 0; i < length; i++) {
            q21 q21VarM5437a = q21Var.m5437a(t02VarArr[i].mo1057l(iMo1054b));
            j21VarArr[i] = abstractC0791jhArr[i].mo1020a(q21VarM5437a, c0547cy, j - this.f9349q[iMo1054b][i]);
            ((List) this.f9344l.get(i)).add(new p41(q21VarM5437a, j21VarArr[i]));
        }
        return new o41(this.f9347o, this.f9349q[iMo1054b], j21VarArr);
    }

    @Override // p000.AbstractC0791jh
    /* JADX INFO: renamed from: g */
    public final z11 mo3634g() {
        AbstractC0791jh[] abstractC0791jhArr = this.f9343k;
        return abstractC0791jhArr.length > 0 ? abstractC0791jhArr[0].mo3634g() : f9342s;
    }

    @Override // p000.AbstractC1234or, p000.AbstractC0791jh
    /* JADX INFO: renamed from: i */
    public final void mo1021i() throws C1079lp {
        C1079lp c1079lp = this.f9350r;
        if (c1079lp != null) {
            throw c1079lp;
        }
        super.mo1021i();
    }

    @Override // p000.AbstractC0791jh
    /* JADX INFO: renamed from: k */
    public final void mo3637k(C1534vy c1534vy) {
        this.f8424j = c1534vy;
        this.f8423i = z42.m7236j(null);
        int i = 0;
        while (true) {
            AbstractC0791jh[] abstractC0791jhArr = this.f9343k;
            if (i >= abstractC0791jhArr.length) {
                return;
            }
            m5049w(Integer.valueOf(i), abstractC0791jhArr[i]);
            i++;
        }
    }

    @Override // p000.AbstractC0791jh
    /* JADX INFO: renamed from: m */
    public final void mo1022m(j21 j21Var) {
        o41 o41Var = (o41) j21Var;
        int i = 0;
        while (true) {
            AbstractC0791jh[] abstractC0791jhArr = this.f9343k;
            if (i >= abstractC0791jhArr.length) {
                return;
            }
            List list = (List) this.f9344l.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (((p41) list.get(i2)).f8715b.equals(j21Var)) {
                    list.remove(i2);
                    break;
                }
            }
            AbstractC0791jh abstractC0791jh = abstractC0791jhArr[i];
            j21 j21Var2 = o41Var.f7649a[i];
            if (j21Var2 instanceof m02) {
                j21Var2 = ((m02) j21Var2).f6584a;
            }
            abstractC0791jh.mo1022m(j21Var2);
            i++;
        }
    }

    @Override // p000.AbstractC1234or, p000.AbstractC0791jh
    /* JADX INFO: renamed from: o */
    public final void mo1023o() {
        super.mo1023o();
        Arrays.fill(this.f9345m, (Object) null);
        this.f9348p = -1;
        this.f9350r = null;
        ArrayList arrayList = this.f9346n;
        arrayList.clear();
        Collections.addAll(arrayList, this.f9343k);
    }

    @Override // p000.AbstractC0791jh
    /* JADX INFO: renamed from: r */
    public final void mo3642r(z11 z11Var) {
        this.f9343k[0].mo3642r(z11Var);
    }

    @Override // p000.AbstractC1234or
    /* JADX INFO: renamed from: s */
    public final q21 mo4413s(Object obj, q21 q21Var) {
        int iIntValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.f9344l;
        List list = (List) arrayList.get(iIntValue);
        for (int i = 0; i < list.size(); i++) {
            if (((p41) list.get(i)).f8714a.equals(q21Var)) {
                return ((p41) ((List) arrayList.get(0)).get(i)).f8714a;
            }
        }
        return null;
    }

    @Override // p000.AbstractC1234or
    /* JADX INFO: renamed from: v */
    public final void mo4416v(Object obj, AbstractC0791jh abstractC0791jh, t02 t02Var) {
        Integer num = (Integer) obj;
        if (this.f9350r != null) {
            return;
        }
        if (this.f9348p == -1) {
            this.f9348p = t02Var.mo1056h();
        } else if (t02Var.mo1056h() != this.f9348p) {
            this.f9350r = new C1079lp();
            return;
        }
        int length = this.f9349q.length;
        t02[] t02VarArr = this.f9345m;
        if (length == 0) {
            this.f9349q = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f9348p, t02VarArr.length);
        }
        ArrayList arrayList = this.f9346n;
        arrayList.remove(abstractC0791jh);
        t02VarArr[num.intValue()] = t02Var;
        if (arrayList.isEmpty()) {
            m3638l(t02VarArr[0]);
        }
    }
}
