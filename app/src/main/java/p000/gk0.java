package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class gk0 extends r92 {
    @Override // p000.y10
    /* JADX INFO: renamed from: a */
    public final void mo50a(y10 y10Var) {
        C1553wg c1553wg = (C1553wg) this.f9846b;
        int i = c1553wg.f12128s0;
        a20 a20Var = this.f9852h;
        ArrayList arrayList = a20Var.f38l;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = -1;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            int i5 = ((a20) obj).f33g;
            if (i3 == -1 || i5 < i3) {
                i3 = i5;
            }
            if (i2 < i5) {
                i2 = i5;
            }
        }
        if (i == 0 || i == 2) {
            a20Var.mo53d(i3 + c1553wg.f12130u0);
        } else {
            a20Var.mo53d(i2 + c1553wg.f12130u0);
        }
    }

    @Override // p000.r92
    /* JADX INFO: renamed from: d */
    public final void mo3001d() {
        C1639ys c1639ys = this.f9846b;
        if (c1639ys instanceof C1553wg) {
            a20 a20Var = this.f9852h;
            a20Var.f28b = true;
            ArrayList arrayList = a20Var.f38l;
            C1553wg c1553wg = (C1553wg) c1639ys;
            int i = c1553wg.f12128s0;
            boolean z = c1553wg.f12129t0;
            int i2 = 0;
            if (i == 0) {
                a20Var.f31e = 4;
                while (i2 < c1553wg.f4612r0) {
                    C1639ys c1639ys2 = c1553wg.f4611q0[i2];
                    if (z || c1639ys2.f13097g0 != 8) {
                        a20 a20Var2 = c1639ys2.f13090d.f9852h;
                        a20Var2.f37k.add(a20Var);
                        arrayList.add(a20Var2);
                    }
                    i2++;
                }
                m3005m(this.f9846b.f13090d.f9852h);
                m3005m(this.f9846b.f13090d.f9853i);
                return;
            }
            if (i == 1) {
                a20Var.f31e = 5;
                while (i2 < c1553wg.f4612r0) {
                    C1639ys c1639ys3 = c1553wg.f4611q0[i2];
                    if (z || c1639ys3.f13097g0 != 8) {
                        a20 a20Var3 = c1639ys3.f13090d.f9853i;
                        a20Var3.f37k.add(a20Var);
                        arrayList.add(a20Var3);
                    }
                    i2++;
                }
                m3005m(this.f9846b.f13090d.f9852h);
                m3005m(this.f9846b.f13090d.f9853i);
                return;
            }
            if (i == 2) {
                a20Var.f31e = 6;
                while (i2 < c1553wg.f4612r0) {
                    C1639ys c1639ys4 = c1553wg.f4611q0[i2];
                    if (z || c1639ys4.f13097g0 != 8) {
                        a20 a20Var4 = c1639ys4.f13092e.f9852h;
                        a20Var4.f37k.add(a20Var);
                        arrayList.add(a20Var4);
                    }
                    i2++;
                }
                m3005m(this.f9846b.f13092e.f9852h);
                m3005m(this.f9846b.f13092e.f9853i);
                return;
            }
            if (i != 3) {
                return;
            }
            a20Var.f31e = 7;
            while (i2 < c1553wg.f4612r0) {
                C1639ys c1639ys5 = c1553wg.f4611q0[i2];
                if (z || c1639ys5.f13097g0 != 8) {
                    a20 a20Var5 = c1639ys5.f13092e.f9853i;
                    a20Var5.f37k.add(a20Var);
                    arrayList.add(a20Var5);
                }
                i2++;
            }
            m3005m(this.f9846b.f13092e.f9852h);
            m3005m(this.f9846b.f13092e.f9853i);
        }
    }

    @Override // p000.r92
    /* JADX INFO: renamed from: e */
    public final void mo3002e() {
        C1639ys c1639ys = this.f9846b;
        if (c1639ys instanceof C1553wg) {
            int i = ((C1553wg) c1639ys).f12128s0;
            a20 a20Var = this.f9852h;
            if (i == 0 || i == 1) {
                c1639ys.f13082Y = a20Var.f33g;
            } else {
                c1639ys.f13083Z = a20Var.f33g;
            }
        }
    }

    @Override // p000.r92
    /* JADX INFO: renamed from: f */
    public final void mo3003f() {
        this.f9847c = null;
        this.f9852h.m52c();
    }

    @Override // p000.r92
    /* JADX INFO: renamed from: k */
    public final boolean mo3004k() {
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final void m3005m(a20 a20Var) {
        a20 a20Var2 = this.f9852h;
        a20Var2.f37k.add(a20Var);
        a20Var.f38l.add(a20Var2);
    }
}
