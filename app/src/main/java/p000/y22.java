package p000;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class y22 extends t22 {

    /* JADX INFO: renamed from: E */
    public int f12814E;

    /* JADX INFO: renamed from: C */
    public ArrayList f12812C = new ArrayList();

    /* JADX INFO: renamed from: D */
    public boolean f12813D = true;

    /* JADX INFO: renamed from: F */
    public boolean f12815F = false;

    /* JADX INFO: renamed from: G */
    public int f12816G = 0;

    @Override // p000.t22
    /* JADX INFO: renamed from: A */
    public final void mo6197A(long j) {
        ArrayList arrayList;
        this.f10715c = j;
        if (j < 0 || (arrayList = this.f12812C) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((t22) this.f12812C.get(i)).mo6197A(j);
        }
    }

    @Override // p000.t22
    /* JADX INFO: renamed from: B */
    public final void mo6198B(sc2 sc2Var) {
        this.f10731x = sc2Var;
        this.f12816G |= 8;
        int size = this.f12812C.size();
        for (int i = 0; i < size; i++) {
            ((t22) this.f12812C.get(i)).mo6198B(sc2Var);
        }
    }

    @Override // p000.t22
    /* JADX INFO: renamed from: C */
    public final void mo6199C(TimeInterpolator timeInterpolator) {
        this.f12816G |= 1;
        ArrayList arrayList = this.f12812C;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((t22) this.f12812C.get(i)).mo6199C(timeInterpolator);
            }
        }
        this.f10716d = timeInterpolator;
    }

    @Override // p000.t22
    /* JADX INFO: renamed from: D */
    public final void mo6200D(pu0 pu0Var) {
        super.mo6200D(pu0Var);
        this.f12816G |= 4;
        if (this.f12812C != null) {
            for (int i = 0; i < this.f12812C.size(); i++) {
                ((t22) this.f12812C.get(i)).mo6200D(pu0Var);
            }
        }
    }

    @Override // p000.t22
    /* JADX INFO: renamed from: E */
    public final void mo6201E() {
        this.f12816G |= 2;
        int size = this.f12812C.size();
        for (int i = 0; i < size; i++) {
            ((t22) this.f12812C.get(i)).mo6201E();
        }
    }

    @Override // p000.t22
    /* JADX INFO: renamed from: F */
    public final void mo6202F(long j) {
        this.f10714b = j;
    }

    @Override // p000.t22
    /* JADX INFO: renamed from: H */
    public final String mo6204H(String str) {
        String strMo6204H = super.mo6204H(str);
        for (int i = 0; i < this.f12812C.size(); i++) {
            StringBuilder sbM5346m = AbstractC1308pu.m5346m(strMo6204H, "\n");
            sbM5346m.append(((t22) this.f12812C.get(i)).mo6204H(str.concat("  ")));
            strMo6204H = sbM5346m.toString();
        }
        return strMo6204H;
    }

    /* JADX INFO: renamed from: I */
    public final void m6996I(t22 t22Var) {
        this.f12812C.add(t22Var);
        t22Var.f10721n = this;
        long j = this.f10715c;
        if (j >= 0) {
            t22Var.mo6197A(j);
        }
        if ((this.f12816G & 1) != 0) {
            t22Var.mo6199C(this.f10716d);
        }
        if ((this.f12816G & 2) != 0) {
            t22Var.mo6201E();
        }
        if ((this.f12816G & 4) != 0) {
            t22Var.mo6200D(this.f10732y);
        }
        if ((this.f12816G & 8) != 0) {
            t22Var.mo6198B(this.f10731x);
        }
    }

    @Override // p000.t22
    /* JADX INFO: renamed from: b */
    public final void mo6206b(View view) {
        for (int i = 0; i < this.f12812C.size(); i++) {
            ((t22) this.f12812C.get(i)).mo6206b(view);
        }
        this.f10718f.add(view);
    }

    @Override // p000.t22
    /* JADX INFO: renamed from: d */
    public final void mo2558d(z22 z22Var) {
        View view = z22Var.f13248b;
        if (m6216t(view)) {
            ArrayList arrayList = this.f12812C;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                t22 t22Var = (t22) obj;
                if (t22Var.m6216t(view)) {
                    t22Var.mo2558d(z22Var);
                    z22Var.f13249c.add(t22Var);
                }
            }
        }
    }

    @Override // p000.t22
    /* JADX INFO: renamed from: f */
    public final void mo6208f(z22 z22Var) {
        int size = this.f12812C.size();
        for (int i = 0; i < size; i++) {
            ((t22) this.f12812C.get(i)).mo6208f(z22Var);
        }
    }

    @Override // p000.t22
    /* JADX INFO: renamed from: g */
    public final void mo2559g(z22 z22Var) {
        View view = z22Var.f13248b;
        if (m6216t(view)) {
            ArrayList arrayList = this.f12812C;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                t22 t22Var = (t22) obj;
                if (t22Var.m6216t(view)) {
                    t22Var.mo2559g(z22Var);
                    z22Var.f13249c.add(t22Var);
                }
            }
        }
    }

    @Override // p000.t22
    /* JADX INFO: renamed from: k */
    public final t22 clone() {
        y22 y22Var = (y22) super.clone();
        y22Var.f12812C = new ArrayList();
        int size = this.f12812C.size();
        for (int i = 0; i < size; i++) {
            t22 t22VarClone = ((t22) this.f12812C.get(i)).clone();
            y22Var.f12812C.add(t22VarClone);
            t22VarClone.f10721n = y22Var;
        }
        return y22Var;
    }

    @Override // p000.t22
    /* JADX INFO: renamed from: m */
    public final void mo6212m(ViewGroup viewGroup, C0599ed c0599ed, C0599ed c0599ed2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.f10714b;
        int size = this.f12812C.size();
        for (int i = 0; i < size; i++) {
            t22 t22Var = (t22) this.f12812C.get(i);
            if (j > 0 && (this.f12813D || i == 0)) {
                long j2 = t22Var.f10714b;
                if (j2 > 0) {
                    t22Var.mo6202F(j2 + j);
                } else {
                    t22Var.mo6202F(j);
                }
            }
            t22Var.mo6212m(viewGroup, c0599ed, c0599ed2, arrayList, arrayList2);
        }
    }

    @Override // p000.t22
    /* JADX INFO: renamed from: v */
    public final void mo6217v(View view) {
        super.mo6217v(view);
        int size = this.f12812C.size();
        for (int i = 0; i < size; i++) {
            ((t22) this.f12812C.get(i)).mo6217v(view);
        }
    }

    @Override // p000.t22
    /* JADX INFO: renamed from: x */
    public final void mo6219x(View view) {
        for (int i = 0; i < this.f12812C.size(); i++) {
            ((t22) this.f12812C.get(i)).mo6219x(view);
        }
        this.f10718f.remove(view);
    }

    @Override // p000.t22
    /* JADX INFO: renamed from: y */
    public final void mo6220y(View view) {
        super.mo6220y(view);
        int size = this.f12812C.size();
        for (int i = 0; i < size; i++) {
            ((t22) this.f12812C.get(i)).mo6220y(view);
        }
    }

    @Override // p000.t22
    /* JADX INFO: renamed from: z */
    public final void mo6221z() {
        ArrayList arrayList;
        if (this.f12812C.isEmpty()) {
            m6203G();
            m6213n();
            return;
        }
        c90 c90Var = new c90();
        c90Var.f1720b = this;
        ArrayList arrayList2 = this.f12812C;
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            ((t22) obj).m6205a(c90Var);
        }
        this.f12814E = this.f12812C.size();
        if (this.f12813D) {
            ArrayList arrayList3 = this.f12812C;
            int size2 = arrayList3.size();
            while (i < size2) {
                Object obj2 = arrayList3.get(i);
                i++;
                ((t22) obj2).mo6221z();
            }
            return;
        }
        int i3 = 1;
        int i4 = 1;
        while (true) {
            int size3 = this.f12812C.size();
            arrayList = this.f12812C;
            if (i4 >= size3) {
                break;
            }
            ((t22) arrayList.get(i4 - 1)).m6205a(new c90((t22) this.f12812C.get(i4), i3));
            i4++;
        }
        t22 t22Var = (t22) arrayList.get(0);
        if (t22Var != null) {
            t22Var.mo6221z();
        }
    }
}
