package p000;

import java.io.Serializable;
import java.util.TreeMap;

/* JADX INFO: renamed from: ag */
/* JADX INFO: loaded from: classes3.dex */
public final class C0017ag implements Serializable {

    /* JADX INFO: renamed from: a */
    public final TreeMap f225a = new TreeMap();

    /* JADX INFO: renamed from: b */
    public final transient long f226b;

    /* JADX WARN: Code duplicated, block: B:33:0x0112  */
    public C0017ag(ac2 ac2Var, long j, byte[] bArr, byte[] bArr2) {
        TreeMap treeMap;
        TreeMap treeMap2;
        ac2 ac2Var2 = ac2Var;
        long j2 = 1;
        this.f226b = (1 << ac2Var2.f144c) - 1;
        long j3 = 0;
        while (j3 < j) {
            TreeMap treeMap3 = this.f225a;
            hc2 hc2Var = ac2Var2.f143b;
            int i = hc2Var.f4527b;
            long j4 = j2;
            long j5 = j3 >> i;
            long j6 = (j4 << i) - j4;
            int i2 = (int) (j3 & j6);
            lr0 lr0Var = new lr0(1);
            lr0Var.f12517b = j5;
            lr0Var.f6495e = i2;
            h91 h91Var = new h91(lr0Var);
            int i3 = 1 << i;
            int i4 = i3 - 1;
            if (i2 < i4) {
                if (((C1663zf) treeMap3.get(0)) == null || i2 == 0) {
                    treeMap3.put(0, new C1663zf(hc2Var, bArr, bArr2, h91Var));
                }
                TreeMap treeMap4 = this.f225a;
                C1663zf c1663zf = (C1663zf) treeMap4.get(0);
                c1663zf.getClass();
            }
            int i5 = 1;
            while (true) {
                long j7 = j5;
                if (i5 < ac2Var2.f145d) {
                    int i6 = (int) (j7 & j6);
                    long j8 = j3;
                    long j9 = j7 >> i;
                    lr0 lr0Var2 = new lr0(1);
                    lr0Var2.f12518c = i5;
                    lr0Var2.f12517b = j9;
                    lr0Var2.f6495e = i6;
                    h91 h91Var2 = new h91(lr0Var2);
                    if (treeMap3.get(Integer.valueOf(i5)) != null) {
                        if (j8 == 0) {
                            j5 = j9;
                            treeMap = treeMap3;
                        } else {
                            treeMap = treeMap3;
                            j5 = j9;
                            if (j8 % ((long) Math.pow(i3, i5 + 1)) == 0) {
                            }
                        }
                        if (i6 < i4 || j8 == 0) {
                            treeMap2 = treeMap;
                        } else {
                            treeMap2 = treeMap;
                            if ((j8 + j4) % ((long) Math.pow(i3, i5)) == 0) {
                                TreeMap treeMap5 = this.f225a;
                                Integer numValueOf = Integer.valueOf(i5);
                                C1663zf c1663zf2 = (C1663zf) treeMap5.get(Integer.valueOf(i5));
                                c1663zf2.getClass();
                            }
                        }
                        i5++;
                        treeMap3 = treeMap2;
                        j3 = j8;
                        ac2Var2 = ac2Var;
                    } else {
                        j5 = j9;
                        treeMap = treeMap3;
                    }
                    treeMap.put(Integer.valueOf(i5), new C1663zf(hc2Var, bArr, bArr2, h91Var2));
                    if (i6 < i4) {
                        treeMap2 = treeMap;
                    } else {
                        treeMap2 = treeMap;
                    }
                    i5++;
                    treeMap3 = treeMap2;
                    j3 = j8;
                    ac2Var2 = ac2Var;
                }
            }
            j3 += j4;
            ac2Var2 = ac2Var;
            j2 = j4;
        }
    }

    /* JADX INFO: renamed from: a */
    public final C0017ag m148a(C1351r c1351r) {
        C0017ag c0017ag = new C0017ag(this.f226b);
        TreeMap treeMap = this.f225a;
        for (Integer num : treeMap.keySet()) {
            C1663zf c1663zf = (C1663zf) treeMap.get(num);
            c1663zf.getClass();
            c0017ag.f225a.put(num, new C1663zf(c1663zf, c1351r));
        }
        return c0017ag;
    }

    public C0017ag(C0017ag c0017ag, long j) {
        for (Integer num : c0017ag.f225a.keySet()) {
            this.f225a.put(num, new C1663zf((C1663zf) c0017ag.f225a.get(num)));
        }
        this.f226b = j;
    }

    public C0017ag(long j) {
        this.f226b = j;
    }
}
