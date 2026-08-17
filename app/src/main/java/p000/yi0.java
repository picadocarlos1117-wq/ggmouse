package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class yi0 extends r92 {
    @Override // p000.y10
    /* JADX INFO: renamed from: a */
    public final void mo50a(y10 y10Var) {
        a20 a20Var = this.f9852h;
        if (a20Var.f29c && !a20Var.f36j) {
            a20Var.mo53d((int) ((((a20) a20Var.f38l.get(0)).f33g * ((xi0) this.f9846b).f12609q0) + 0.5f));
        }
    }

    @Override // p000.r92
    /* JADX INFO: renamed from: d */
    public final void mo3001d() {
        C1639ys c1639ys = this.f9846b;
        xi0 xi0Var = (xi0) c1639ys;
        int i = xi0Var.f12610r0;
        int i2 = xi0Var.f12611s0;
        int i3 = xi0Var.f12613u0;
        a20 a20Var = this.f9852h;
        if (i3 == 1) {
            if (i != -1) {
                a20Var.f38l.add(c1639ys.f13077T.f13090d.f9852h);
                this.f9846b.f13077T.f13090d.f9852h.f37k.add(a20Var);
                a20Var.f32f = i;
            } else if (i2 != -1) {
                a20Var.f38l.add(c1639ys.f13077T.f13090d.f9853i);
                this.f9846b.f13077T.f13090d.f9853i.f37k.add(a20Var);
                a20Var.f32f = -i2;
            } else {
                a20Var.f28b = true;
                a20Var.f38l.add(c1639ys.f13077T.f13090d.f9853i);
                this.f9846b.f13077T.f13090d.f9853i.f37k.add(a20Var);
            }
            m7080m(this.f9846b.f13090d.f9852h);
            m7080m(this.f9846b.f13090d.f9853i);
            return;
        }
        if (i != -1) {
            a20Var.f38l.add(c1639ys.f13077T.f13092e.f9852h);
            this.f9846b.f13077T.f13092e.f9852h.f37k.add(a20Var);
            a20Var.f32f = i;
        } else if (i2 != -1) {
            a20Var.f38l.add(c1639ys.f13077T.f13092e.f9853i);
            this.f9846b.f13077T.f13092e.f9853i.f37k.add(a20Var);
            a20Var.f32f = -i2;
        } else {
            a20Var.f28b = true;
            a20Var.f38l.add(c1639ys.f13077T.f13092e.f9853i);
            this.f9846b.f13077T.f13092e.f9853i.f37k.add(a20Var);
        }
        m7080m(this.f9846b.f13092e.f9852h);
        m7080m(this.f9846b.f13092e.f9853i);
    }

    @Override // p000.r92
    /* JADX INFO: renamed from: e */
    public final void mo3002e() {
        C1639ys c1639ys = this.f9846b;
        int i = ((xi0) c1639ys).f12613u0;
        a20 a20Var = this.f9852h;
        if (i == 1) {
            c1639ys.f13082Y = a20Var.f33g;
        } else {
            c1639ys.f13083Z = a20Var.f33g;
        }
    }

    @Override // p000.r92
    /* JADX INFO: renamed from: f */
    public final void mo3003f() {
        this.f9852h.m52c();
    }

    @Override // p000.r92
    /* JADX INFO: renamed from: k */
    public final boolean mo3004k() {
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final void m7080m(a20 a20Var) {
        a20 a20Var2 = this.f9852h;
        a20Var2.f37k.add(a20Var);
        a20Var.f38l.add(a20Var2);
    }
}
