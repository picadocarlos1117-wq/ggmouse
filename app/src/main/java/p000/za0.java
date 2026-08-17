package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class za0 {

    /* JADX INFO: renamed from: a */
    public final C0019ai f13323a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0604ei f13324b;

    /* JADX INFO: renamed from: c */
    public C0100bi f13325c;

    /* JADX INFO: renamed from: d */
    public final int f13326d;

    public za0(InterfaceC0136ci interfaceC0136ci, InterfaceC0604ei interfaceC0604ei, long j, long j2, long j3, long j4, long j5, int i) {
        this.f13324b = interfaceC0604ei;
        this.f13326d = i;
        this.f13323a = new C0019ai(interfaceC0136ci, j, j2, j3, j4, j5);
    }

    /* JADX INFO: renamed from: a */
    public static int m7275a(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* JADX INFO: renamed from: c */
    public static int m7276c(y80 y80Var, long j, bb0 bb0Var) {
        if (j == y80Var.getPosition()) {
            return 0;
        }
        bb0Var.f1280a = j;
        return 1;
    }

    /* JADX INFO: renamed from: b */
    public final int m7277b(y80 y80Var, bb0 bb0Var) {
        while (true) {
            C0100bi c0100bi = this.f13325c;
            ki0.m3866j(c0100bi);
            long j = c0100bi.f1378f;
            long j2 = c0100bi.f1379g;
            long j3 = c0100bi.f1380h;
            long j4 = j2 - j;
            long j5 = this.f13326d;
            InterfaceC0604ei interfaceC0604ei = this.f13324b;
            if (j4 <= j5) {
                this.f13325c = null;
                interfaceC0604ei.mo814y();
                return m7276c(y80Var, j, bb0Var);
            }
            long position = j3 - y80Var.getPosition();
            if (position < 0 || position > 262144) {
                return m7276c(y80Var, j3, bb0Var);
            }
            y80Var.mo2423m((int) position);
            y80Var.mo2422l();
            C0568di c0568diMo802c = interfaceC0604ei.mo802c(y80Var, c0100bi.f1374b);
            int i = c0568diMo802c.f2936c;
            long j6 = c0568diMo802c.f2934a;
            long j7 = c0568diMo802c.f2935b;
            if (i == -3) {
                this.f13325c = null;
                interfaceC0604ei.mo814y();
                return m7276c(y80Var, j3, bb0Var);
            }
            if (i == -2) {
                c0100bi.f1376d = j6;
                c0100bi.f1378f = j7;
                c0100bi.f1380h = C0100bi.m994a(c0100bi.f1374b, j6, c0100bi.f1377e, j7, c0100bi.f1379g, c0100bi.f1375c);
            } else {
                if (i != -1) {
                    if (i != 0) {
                        f40.m2719o("Invalid case");
                        return 0;
                    }
                    long position2 = j7 - y80Var.getPosition();
                    if (position2 >= 0 && position2 <= 262144) {
                        y80Var.mo2423m((int) position2);
                    }
                    this.f13325c = null;
                    interfaceC0604ei.mo814y();
                    return m7276c(y80Var, j7, bb0Var);
                }
                c0100bi.f1377e = j6;
                c0100bi.f1379g = j7;
                c0100bi.f1380h = C0100bi.m994a(c0100bi.f1374b, c0100bi.f1376d, j6, c0100bi.f1378f, j7, c0100bi.f1375c);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m7278d(long j) {
        C0100bi c0100bi = this.f13325c;
        if (c0100bi == null || c0100bi.f1373a != j) {
            C0019ai c0019ai = this.f13323a;
            this.f13325c = new C0100bi(j, c0019ai.f234a.mo1221f(j), c0019ai.f236c, c0019ai.f237d, c0019ai.f238e, c0019ai.f239f);
        }
    }
}
