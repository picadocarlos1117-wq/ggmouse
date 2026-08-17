package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class c51 implements qp1 {

    /* JADX INFO: renamed from: a */
    public final y41 f1675a;

    /* JADX INFO: renamed from: b */
    public final b42 f1676b;

    /* JADX INFO: renamed from: c */
    public final v80 f1677c;

    public c51(b42 b42Var, v80 v80Var, y41 y41Var) {
        this.f1676b = b42Var;
        v80Var.getClass();
        this.f1677c = v80Var;
        this.f1675a = y41Var;
    }

    @Override // p000.qp1
    /* JADX INFO: renamed from: a */
    public final void mo900a(Object obj, Object obj2) {
        tp1.m6317j(this.f1676b, obj, obj2);
    }

    @Override // p000.qp1
    /* JADX INFO: renamed from: b */
    public final void mo901b(Object obj) {
        this.f1676b.getClass();
        a42 a42Var = ((fi0) obj).unknownFields;
        if (a42Var.f49e) {
            a42Var.f49e = false;
        }
        this.f1677c.getClass();
        AbstractC1308pu.m5354u(obj);
        throw null;
    }

    @Override // p000.qp1
    /* JADX INFO: renamed from: c */
    public final boolean mo902c(Object obj) {
        this.f1677c.getClass();
        AbstractC1308pu.m5354u(obj);
        throw null;
    }

    @Override // p000.qp1
    /* JADX INFO: renamed from: d */
    public final void mo903d(Object obj, ay0 ay0Var) {
        this.f1677c.getClass();
        AbstractC1308pu.m5354u(obj);
        throw null;
    }

    @Override // p000.qp1
    /* JADX INFO: renamed from: e */
    public final boolean mo904e(fi0 fi0Var, fi0 fi0Var2) {
        this.f1676b.getClass();
        return fi0Var.unknownFields.equals(fi0Var2.unknownFields);
    }

    @Override // p000.qp1
    /* JADX INFO: renamed from: f */
    public final void mo905f(Object obj, C0799jp c0799jp, u80 u80Var) {
        this.f1676b.getClass();
        b42.m849a(obj);
        this.f1677c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // p000.qp1
    /* JADX INFO: renamed from: g */
    public final int mo906g(fi0 fi0Var) {
        this.f1676b.getClass();
        return fi0Var.unknownFields.hashCode();
    }

    @Override // p000.qp1
    /* JADX INFO: renamed from: h */
    public final int mo907h(fi0 fi0Var) {
        this.f1676b.getClass();
        a42 a42Var = fi0Var.unknownFields;
        int i = a42Var.f48d;
        if (i != -1) {
            return i;
        }
        int iM4585d = 0;
        for (int i2 = 0; i2 < a42Var.f45a; i2++) {
            int i3 = a42Var.f46b[i2] >>> 3;
            AbstractC0753ik abstractC0753ik = (AbstractC0753ik) a42Var.f47c[i2];
            int iM4585d2 = AbstractC1153np.m4585d(i3) + AbstractC1153np.m4584c(2) + (AbstractC1153np.m4584c(1) * 2);
            int iM4584c = AbstractC1153np.m4584c(3);
            int size = abstractC0753ik.size();
            iM4585d += AbstractC1153np.m4585d(size) + size + iM4584c + iM4585d2;
        }
        a42Var.f48d = iM4585d;
        return iM4585d;
    }

    @Override // p000.qp1
    /* JADX INFO: renamed from: i */
    public final void mo908i(Object obj, byte[] bArr, int i, int i2, C1583x9 c1583x9) {
        fi0 fi0Var = (fi0) obj;
        if (fi0Var.unknownFields == a42.f44f) {
            fi0Var.unknownFields = new a42();
        }
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // p000.qp1
    /* JADX INFO: renamed from: j */
    public final Object mo909j() {
        y41 y41Var = this.f1675a;
        return y41Var instanceof fi0 ? ((fi0) y41Var).newMutableInstance() : y41Var.newBuilderForType().buildPartial();
    }
}
