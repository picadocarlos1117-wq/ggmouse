package p000;

import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class q92 {

    /* JADX INFO: renamed from: f */
    public static int f9448f;

    /* JADX INFO: renamed from: a */
    public ArrayList f9449a;

    /* JADX INFO: renamed from: b */
    public int f9450b;

    /* JADX INFO: renamed from: c */
    public int f9451c;

    /* JADX INFO: renamed from: d */
    public ArrayList f9452d;

    /* JADX INFO: renamed from: e */
    public int f9453e;

    /* JADX INFO: renamed from: a */
    public final void m5459a(ArrayList arrayList) {
        int size = this.f9449a.size();
        if (this.f9453e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                q92 q92Var = (q92) arrayList.get(i);
                if (this.f9453e == q92Var.f9450b) {
                    m5461c(this.f9451c, q92Var);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m5460b(xs0 xs0Var, int i) {
        int iM6955n;
        int iM6955n2;
        ArrayList arrayList = this.f9449a;
        if (arrayList.size() == 0) {
            return 0;
        }
        C1676zs c1676zs = (C1676zs) ((C1639ys) arrayList.get(0)).f13077T;
        xs0Var.m6974t();
        c1676zs.mo3424b(xs0Var, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((C1639ys) arrayList.get(i2)).mo3424b(xs0Var, false);
        }
        if (i == 0 && c1676zs.f13545z0 > 0) {
            hp0.m3213d(c1676zs, xs0Var, arrayList, 0);
        }
        if (i == 1 && c1676zs.f13524A0 > 0) {
            hp0.m3213d(c1676zs, xs0Var, arrayList, 1);
        }
        try {
            xs0Var.m6970p();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f9452d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C1639ys c1639ys = (C1639ys) arrayList.get(i3);
            pu0 pu0Var = new pu0(18);
            new WeakReference(c1639ys);
            xs0.m6955n(c1639ys.f13066I);
            xs0.m6955n(c1639ys.f13067J);
            xs0.m6955n(c1639ys.f13068K);
            xs0.m6955n(c1639ys.f13069L);
            xs0.m6955n(c1639ys.f13070M);
            this.f9452d.add(pu0Var);
        }
        if (i == 0) {
            iM6955n = xs0.m6955n(c1676zs.f13066I);
            iM6955n2 = xs0.m6955n(c1676zs.f13068K);
            xs0Var.m6974t();
        } else {
            iM6955n = xs0.m6955n(c1676zs.f13067J);
            iM6955n2 = xs0.m6955n(c1676zs.f13069L);
            xs0Var.m6974t();
        }
        return iM6955n2 - iM6955n;
    }

    /* JADX INFO: renamed from: c */
    public final void m5461c(int i, q92 q92Var) {
        int i2 = q92Var.f9450b;
        ArrayList arrayList = this.f9449a;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            C1639ys c1639ys = (C1639ys) obj;
            ArrayList arrayList2 = q92Var.f9449a;
            if (!arrayList2.contains(c1639ys)) {
                arrayList2.add(c1639ys);
            }
            if (i == 0) {
                c1639ys.f13111n0 = i2;
            } else {
                c1639ys.f13113o0 = i2;
            }
        }
        this.f9453e = i2;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        int i = this.f9451c;
        if (i == 0) {
            str = "Horizontal";
        } else if (i == 1) {
            str = "Vertical";
        } else {
            str = i == 2 ? "Both" : "Unknown";
        }
        sb.append(str);
        sb.append(" [");
        String strM5341h = AbstractC1308pu.m5341h(sb, this.f9450b, "] <");
        ArrayList arrayList = this.f9449a;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            StringBuilder sbM5346m = AbstractC1308pu.m5346m(strM5341h, " ");
            sbM5346m.append(((C1639ys) obj).f13099h0);
            strM5341h = sbM5346m.toString();
        }
        return strM5341h.concat(" >");
    }
}
