package p000;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

/* JADX INFO: renamed from: zf */
/* JADX INFO: loaded from: classes3.dex */
public final class C1663zf implements Serializable {

    /* JADX INFO: renamed from: a */
    public final transient C0599ed f13382a;

    /* JADX INFO: renamed from: b */
    public final int f13383b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f13384c;

    /* JADX INFO: renamed from: d */
    public final int f13385d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f13386e;

    /* JADX INFO: renamed from: f */
    public final TreeMap f13387f;

    /* JADX INFO: renamed from: g */
    public final Stack f13388g;

    /* JADX INFO: renamed from: m */
    public final TreeMap f13389m;

    /* JADX INFO: renamed from: n */
    public int f13390n;

    /* JADX INFO: renamed from: o */
    public boolean f13391o;

    /* JADX INFO: renamed from: p */
    public transient int f13392p;

    public C1663zf(C1663zf c1663zf, C1351r c1351r) {
        this.f13382a = new C0599ed(new C0799jp(c1351r));
        this.f13383b = c1663zf.f13383b;
        this.f13385d = c1663zf.f13385d;
        ArrayList arrayList = new ArrayList();
        this.f13386e = arrayList;
        arrayList.addAll(c1663zf.f13386e);
        this.f13387f = new TreeMap();
        for (Integer num : c1663zf.f13387f.keySet()) {
            this.f13387f.put(num, (LinkedList) ((LinkedList) c1663zf.f13387f.get(num)).clone());
        }
        Stack stack = new Stack();
        this.f13388g = stack;
        stack.addAll(c1663zf.f13388g);
        this.f13384c = new ArrayList();
        Iterator it = c1663zf.f13384c.iterator();
        while (it.hasNext()) {
            this.f13384c.add(((C0098bg) it.next()).clone());
        }
        this.f13389m = new TreeMap((Map) c1663zf.f13389m);
        int i = c1663zf.f13390n;
        this.f13390n = i;
        this.f13392p = c1663zf.f13392p;
        this.f13391o = c1663zf.f13391o;
        if (this.f13386e == null) {
            f40.m2719o("authenticationPath == null");
            throw null;
        }
        if (this.f13387f == null) {
            f40.m2719o("retain == null");
            throw null;
        }
        if (this.f13388g == null) {
            f40.m2719o("stack == null");
            throw null;
        }
        if (this.f13384c == null) {
            f40.m2719o("treeHashInstances == null");
            throw null;
        }
        if (o21.m4649T(this.f13383b, i)) {
            return;
        }
        f40.m2719o("index in BDS state out of bounds");
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public final void m7304a(byte[] bArr, byte[] bArr2, h91 h91Var) {
        h91 h91Var2;
        int i;
        h91 h91Var3 = h91Var;
        long j = h91Var3.f12517b;
        int i2 = h91Var3.f12516a;
        int i3 = 0;
        lr0 lr0Var = new lr0(0);
        lr0Var.f12518c = i2;
        lr0Var.f12517b = j;
        mr0 mr0Var = new mr0(lr0Var);
        wj0 wj0Var = new wj0();
        wj0Var.f12518c = i2;
        wj0Var.f12517b = j;
        xj0 xj0Var = new xj0(wj0Var);
        int i4 = 0;
        while (true) {
            int i5 = this.f13383b;
            int i6 = 1 << i5;
            Stack stack = this.f13388g;
            if (i4 >= i6) {
                return;
            }
            lr0 lr0Var2 = new lr0(1);
            lr0Var2.f12518c = h91Var3.f12516a;
            lr0Var2.f12517b = h91Var3.f12517b;
            lr0Var2.f6495e = i4;
            lr0Var2.f6496f = h91Var3.f4477f;
            lr0Var2.f6497g = h91Var3.f4478g;
            lr0Var2.f12519d = h91Var3.f12519d;
            h91 h91Var4 = new h91(lr0Var2);
            C0599ed c0599ed = this.f13382a;
            c0599ed.m2571j(c0599ed.m2570i(bArr2, h91Var4), bArr);
            pn0 pn0VarM2569h = c0599ed.m2569h(h91Var4);
            lr0 lr0Var3 = new lr0(i3);
            lr0Var3.f12518c = mr0Var.f12516a;
            lr0Var3.f12517b = mr0Var.f12517b;
            lr0Var3.f6495e = i4;
            lr0Var3.f6496f = mr0Var.f7083f;
            lr0Var3.f6497g = mr0Var.f7084g;
            lr0Var3.f12519d = mr0Var.f12519d;
            mr0Var = new mr0(lr0Var3);
            gc2 gc2VarM3194C = hp0.m3194C(c0599ed, pn0VarM2569h, mr0Var);
            wj0 wj0Var2 = new wj0();
            wj0Var2.f12518c = xj0Var.f12516a;
            wj0Var2.f12517b = xj0Var.f12517b;
            wj0Var2.f12192f = i4;
            wj0Var2.f12519d = xj0Var.f12519d;
            xj0Var = new xj0(wj0Var2);
            while (!stack.isEmpty()) {
                int i7 = ((gc2) stack.peek()).f4144a;
                int i8 = gc2VarM3194C.f4144a;
                if (i7 != i8) {
                    break;
                }
                int i9 = i4 / (1 << i8);
                if (i9 == 1) {
                    this.f13386e.add(gc2VarM3194C);
                }
                int i10 = this.f13385d;
                if (i9 == 3) {
                    if (i8 < i5 - i10) {
                        C0098bg c0098bg = (C0098bg) this.f13384c.get(i8);
                        c0098bg.f1359a = gc2VarM3194C;
                        c0098bg.f1361c = i8;
                        h91Var2 = h91Var4;
                        if (i8 == c0098bg.f1360b) {
                            c0098bg.f1364f = true;
                        }
                    } else {
                        h91Var2 = h91Var4;
                    }
                    i = 3;
                } else {
                    h91Var2 = h91Var4;
                    i = 3;
                }
                if (i9 >= i && (i9 & 1) == 1 && i8 >= i5 - i10 && i8 <= i5 - 2) {
                    Integer numValueOf = Integer.valueOf(i8);
                    TreeMap treeMap = this.f13387f;
                    if (treeMap.get(numValueOf) == null) {
                        LinkedList linkedList = new LinkedList();
                        linkedList.add(gc2VarM3194C);
                        treeMap.put(Integer.valueOf(i8), linkedList);
                    } else {
                        ((LinkedList) treeMap.get(Integer.valueOf(i8))).add(gc2VarM3194C);
                    }
                }
                wj0 wj0Var3 = new wj0();
                wj0Var3.f12518c = xj0Var.f12516a;
                wj0Var3.f12517b = xj0Var.f12517b;
                wj0Var3.f12191e = xj0Var.f12621e;
                wj0Var3.f12192f = (xj0Var.f12622f - 1) / 2;
                wj0Var3.f12519d = xj0Var.f12519d;
                xj0 xj0Var2 = new xj0(wj0Var3);
                gc2 gc2VarM3201J = hp0.m3201J(c0599ed, (gc2) stack.pop(), gc2VarM3194C, xj0Var2);
                gc2VarM3194C = new gc2(gc2VarM3201J.f4144a + 1, o21.m4669m(gc2VarM3201J.f4145b));
                wj0 wj0Var4 = new wj0();
                wj0Var4.f12518c = xj0Var2.f12516a;
                wj0Var4.f12517b = xj0Var2.f12517b;
                wj0Var4.f12191e = xj0Var2.f12621e + 1;
                wj0Var4.f12192f = xj0Var2.f12622f;
                wj0Var4.f12519d = xj0Var2.f12519d;
                xj0Var = new xj0(wj0Var4);
                h91Var4 = h91Var2;
            }
            stack.push(gc2VarM3194C);
            i4++;
            h91Var3 = h91Var4;
            i3 = 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [int] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r5v19, types: [int] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15, types: [int] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX INFO: renamed from: b */
    public final void m7305b(byte[] bArr, byte[] bArr2, h91 h91Var) {
        int i;
        Object r9;
        h91 h91Var2;
        int i2;
        int i3;
        int i4;
        long j;
        Stack stack;
        int i5;
        int i6;
        int i7;
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        h91 h91Var3 = h91Var;
        long j2 = h91Var3.f12517b;
        int i8 = h91Var3.f12516a;
        if (this.f13391o) {
            f40.m2719o("index already used");
            return;
        }
        int i9 = this.f13390n;
        Object r10 = 1;
        if (i9 > this.f13392p - 1) {
            f40.m2719o("index out of bounds");
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            i = this.f13383b;
            if (i11 >= i) {
                i11 = 0;
                break;
            } else if (((i9 >> i11) & 1) == 0) {
                break;
            } else {
                i11++;
            }
        }
        int i12 = (this.f13390n >> (i11 + 1)) & 1;
        TreeMap treeMap = this.f13389m;
        ArrayList arrayList = this.f13386e;
        if (i12 == 0 && i11 < i - 1) {
            treeMap.put(Integer.valueOf(i11), arrayList.get(i11));
        }
        ArrayList arrayList2 = this.f13384c;
        int i13 = this.f13385d;
        C0599ed c0599ed = this.f13382a;
        if (i11 == 0) {
            lr0 lr0Var = new lr0(1);
            lr0Var.f12518c = i8;
            lr0Var.f12517b = j2;
            lr0Var.f6495e = this.f13390n;
            lr0Var.f6496f = h91Var3.f4477f;
            lr0Var.f6497g = h91Var3.f4478g;
            lr0Var.f12519d = h91Var3.f12519d;
            h91Var3 = new h91(lr0Var);
            c0599ed.m2571j(c0599ed.m2570i(bArr4, h91Var3), bArr3);
            pn0 pn0VarM2569h = c0599ed.m2569h(h91Var3);
            lr0 lr0Var2 = new lr0(0);
            lr0Var2.f12518c = i8;
            lr0Var2.f12517b = j2;
            lr0Var2.f6495e = this.f13390n;
            lr0Var2.f6496f = 0;
            lr0Var2.f6497g = 0;
            lr0Var2.f12519d = 0;
            arrayList.set(0, hp0.m3194C(c0599ed, pn0VarM2569h, new mr0(lr0Var2)));
        } else {
            Object r16 = 1;
            wj0 wj0Var = new wj0();
            wj0Var.f12518c = i8;
            wj0Var.f12517b = j2;
            int i14 = i11 - 1;
            wj0Var.f12191e = i14;
            wj0Var.f12192f = this.f13390n >> i11;
            wj0Var.f12519d = 0;
            xj0 xj0Var = new xj0(wj0Var);
            c0599ed.m2571j(c0599ed.m2570i(bArr4, h91Var3), bArr3);
            gc2 gc2VarM3201J = hp0.m3201J(c0599ed, (gc2) arrayList.get(i14), (gc2) treeMap.get(Integer.valueOf(i14)), xj0Var);
            arrayList.set(i11, new gc2(gc2VarM3201J.f4144a + 1, o21.m4669m(gc2VarM3201J.f4145b)));
            treeMap.remove(Integer.valueOf(i14));
            int i15 = 0;
            while (i15 < i11) {
                arrayList.set(i15, i15 < i - i13 ? ((C0098bg) arrayList2.get(i15)).f1359a : ((LinkedList) this.f13387f.get(Integer.valueOf(i15))).removeFirst());
                i15++;
            }
            int iMin = Math.min(i11, i - i13);
            int i16 = 0;
            while (i16 < iMin) {
                int i17 = ((r16 << i16) * 3) + this.f13390n + 1;
                if (i17 < (r16 << i)) {
                    C0098bg c0098bg = (C0098bg) arrayList2.get(i16);
                    c0098bg.f1359a = null;
                    c0098bg.f1361c = c0098bg.f1360b;
                    c0098bg.f1362d = i17;
                    r9 = r16;
                    c0098bg.f1363e = r9;
                    c0098bg.f1364f = false;
                } else {
                    r9 = r16;
                }
                i16++;
                r16 = r9;
            }
            r10 = r16;
        }
        C0098bg c0098bg2 = null;
        int i18 = 0;
        Object r11 = r10;
        while (i18 < ((i - i13) >> r11)) {
            int size = arrayList2.size();
            int i19 = i10;
            C0098bg c0098bg3 = c0098bg2;
            while (i19 < size) {
                Object obj = arrayList2.get(i19);
                i19++;
                C0098bg c0098bg4 = (C0098bg) obj;
                if (!c0098bg4.f1364f && c0098bg4.f1363e && (c0098bg3 == null || c0098bg4.m973b() < c0098bg3.m973b() || (c0098bg4.m973b() == c0098bg3.m973b() && c0098bg4.f1362d < c0098bg3.f1362d))) {
                    c0098bg3 = c0098bg4;
                }
            }
            if (c0098bg3 != null) {
                int i20 = c0098bg3.f1360b;
                if (c0098bg3.f1364f || !c0098bg3.f1363e) {
                    f40.m2719o("finished or not initialized");
                    return;
                }
                lr0 lr0Var3 = new lr0(1);
                lr0Var3.f12518c = h91Var3.f12516a;
                lr0Var3.f12517b = h91Var3.f12517b;
                int i21 = c0098bg3.f1362d;
                lr0Var3.f6495e = i21;
                lr0Var3.f6496f = h91Var3.f4477f;
                lr0Var3.f6497g = h91Var3.f4478g;
                lr0Var3.f12519d = h91Var3.f12519d;
                h91 h91Var4 = new h91(lr0Var3);
                h91 h91Var5 = h91Var3;
                int i22 = i18;
                long j3 = h91Var4.f12517b;
                h91Var2 = h91Var5;
                lr0 lr0Var4 = new lr0(i10);
                int i23 = h91Var4.f12516a;
                lr0Var4.f12518c = i23;
                lr0Var4.f12517b = j3;
                lr0Var4.f6495e = i21;
                i3 = i;
                mr0 mr0Var = new mr0(lr0Var4);
                wj0 wj0Var2 = new wj0();
                wj0Var2.f12518c = i23;
                wj0Var2.f12517b = j3;
                wj0Var2.f12192f = i21;
                xj0 xj0Var2 = new xj0(wj0Var2);
                c0599ed.m2571j(c0599ed.m2570i(bArr4, h91Var4), bArr3);
                gc2 gc2VarM3194C = hp0.m3194C(c0599ed, c0599ed.m2569h(h91Var4), mr0Var);
                while (true) {
                    i4 = xj0Var2.f12519d;
                    j = xj0Var2.f12517b;
                    stack = this.f13388g;
                    boolean zIsEmpty = stack.isEmpty();
                    i5 = xj0Var2.f12622f;
                    i6 = xj0Var2.f12621e;
                    i7 = xj0Var2.f12516a;
                    if (zIsEmpty || ((gc2) stack.peek()).f4144a != gc2VarM3194C.f4144a || ((gc2) stack.peek()).f4144a == i20) {
                        break;
                    }
                    wj0 wj0Var3 = new wj0();
                    wj0Var3.f12518c = i7;
                    wj0Var3.f12517b = j;
                    wj0Var3.f12191e = i6;
                    wj0Var3.f12192f = (i5 - 1) / 2;
                    wj0Var3.f12519d = i4;
                    xj0 xj0Var3 = new xj0(wj0Var3);
                    gc2 gc2VarM3201J2 = hp0.m3201J(c0599ed, (gc2) stack.pop(), gc2VarM3194C, xj0Var3);
                    gc2VarM3194C = new gc2(gc2VarM3201J2.f4144a + 1, o21.m4669m(gc2VarM3201J2.f4145b));
                    wj0 wj0Var4 = new wj0();
                    wj0Var4.f12518c = xj0Var3.f12516a;
                    wj0Var4.f12517b = xj0Var3.f12517b;
                    wj0Var4.f12191e = xj0Var3.f12621e + 1;
                    wj0Var4.f12192f = xj0Var3.f12622f;
                    wj0Var4.f12519d = xj0Var3.f12519d;
                    xj0Var2 = new xj0(wj0Var4);
                }
                gc2 gc2Var = c0098bg3.f1359a;
                if (gc2Var == null) {
                    c0098bg3.f1359a = gc2VarM3194C;
                    i2 = i22;
                } else {
                    i2 = i22;
                    if (gc2Var.f4144a == gc2VarM3194C.f4144a) {
                        wj0 wj0Var5 = new wj0();
                        wj0Var5.f12518c = i7;
                        wj0Var5.f12517b = j;
                        wj0Var5.f12191e = i6;
                        wj0Var5.f12192f = (i5 - 1) / 2;
                        wj0Var5.f12519d = i4;
                        gc2VarM3194C = new gc2(c0098bg3.f1359a.f4144a + 1, o21.m4669m(hp0.m3201J(c0599ed, gc2Var, gc2VarM3194C, new xj0(wj0Var5)).f4145b));
                        c0098bg3.f1359a = gc2VarM3194C;
                    } else {
                        stack.push(gc2VarM3194C);
                    }
                }
                if (c0098bg3.f1359a.f4144a == i20) {
                    c0098bg3.f1364f = true;
                } else {
                    c0098bg3.f1361c = gc2VarM3194C.f4144a;
                    c0098bg3.f1362d++;
                }
            } else {
                h91Var2 = h91Var3;
                i2 = i18;
                i3 = i;
            }
            i18 = i2 + 1;
            bArr3 = bArr;
            bArr4 = bArr2;
            h91Var3 = h91Var2;
            i = i3;
            i10 = 0;
            r11 = 1;
            c0098bg2 = null;
        }
        this.f13390n++;
    }

    public C1663zf(C1663zf c1663zf) {
        this.f13382a = new C0599ed((C0799jp) c1663zf.f13382a.f3313a);
        this.f13383b = c1663zf.f13383b;
        this.f13385d = c1663zf.f13385d;
        ArrayList arrayList = new ArrayList();
        this.f13386e = arrayList;
        arrayList.addAll(c1663zf.f13386e);
        this.f13387f = new TreeMap();
        for (Integer num : c1663zf.f13387f.keySet()) {
            this.f13387f.put(num, (LinkedList) ((LinkedList) c1663zf.f13387f.get(num)).clone());
        }
        Stack stack = new Stack();
        this.f13388g = stack;
        stack.addAll(c1663zf.f13388g);
        this.f13384c = new ArrayList();
        Iterator it = c1663zf.f13384c.iterator();
        while (it.hasNext()) {
            this.f13384c.add(((C0098bg) it.next()).clone());
        }
        this.f13389m = new TreeMap((Map) c1663zf.f13389m);
        this.f13390n = c1663zf.f13390n;
        this.f13392p = c1663zf.f13392p;
        this.f13391o = c1663zf.f13391o;
    }

    public C1663zf(C0599ed c0599ed, int i, int i2, int i3) {
        this.f13382a = c0599ed;
        this.f13383b = i;
        this.f13392p = i3;
        this.f13385d = i2;
        if (i2 <= i && i2 >= 2) {
            int i4 = i - i2;
            if (i4 % 2 == 0) {
                this.f13386e = new ArrayList();
                this.f13387f = new TreeMap();
                this.f13388g = new Stack();
                this.f13384c = new ArrayList();
                for (int i5 = 0; i5 < i4; i5++) {
                    this.f13384c.add(new C0098bg(i5));
                }
                this.f13389m = new TreeMap();
                this.f13390n = 0;
                this.f13391o = false;
                return;
            }
        }
        f40.m2713i("illegal value for BDS parameter k");
        throw null;
    }

    public C1663zf(C1663zf c1663zf, byte[] bArr, byte[] bArr2, h91 h91Var) {
        this.f13382a = new C0599ed((C0799jp) c1663zf.f13382a.f3313a);
        this.f13383b = c1663zf.f13383b;
        this.f13385d = c1663zf.f13385d;
        ArrayList arrayList = new ArrayList();
        this.f13386e = arrayList;
        arrayList.addAll(c1663zf.f13386e);
        this.f13387f = new TreeMap();
        for (Integer num : c1663zf.f13387f.keySet()) {
            this.f13387f.put(num, (LinkedList) ((LinkedList) c1663zf.f13387f.get(num)).clone());
        }
        Stack stack = new Stack();
        this.f13388g = stack;
        stack.addAll(c1663zf.f13388g);
        this.f13384c = new ArrayList();
        Iterator it = c1663zf.f13384c.iterator();
        while (it.hasNext()) {
            this.f13384c.add(((C0098bg) it.next()).clone());
        }
        this.f13389m = new TreeMap((Map) c1663zf.f13389m);
        this.f13390n = c1663zf.f13390n;
        this.f13392p = c1663zf.f13392p;
        this.f13391o = false;
        m7305b(bArr, bArr2, h91Var);
    }

    public C1663zf(hc2 hc2Var, byte[] bArr, byte[] bArr2, h91 h91Var) {
        C0599ed c0599ed = new C0599ed(hc2Var.f4532g);
        int i = hc2Var.f4527b;
        this(c0599ed, i, hc2Var.f4528c, (1 << i) - 1);
        m7304a(bArr, bArr2, h91Var);
    }
}
