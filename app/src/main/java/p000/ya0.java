package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ya0 implements InterfaceC0604ei {

    /* JADX INFO: renamed from: a */
    public final db0 f12917a;

    /* JADX INFO: renamed from: b */
    public final int f12918b;

    /* JADX INFO: renamed from: c */
    public final bb0 f12919c = new bb0();

    public ya0(db0 db0Var, int i) {
        this.f12917a = db0Var;
        this.f12918b = i;
    }

    /* JADX INFO: renamed from: a */
    public final long m7070a(y80 y80Var) {
        bb0 bb0Var;
        db0 db0Var;
        int iMo2415d;
        while (true) {
            long jMo2417f = y80Var.mo2417f();
            long jMo2420i = y80Var.mo2420i() - 6;
            bb0Var = this.f12919c;
            db0Var = this.f12917a;
            if (jMo2417f >= jMo2420i) {
                break;
            }
            long jMo2417f2 = y80Var.mo2417f();
            byte[] bArr = new byte[2];
            int i = 0;
            boolean zM5782f = false;
            y80Var.mo2413a(0, 2, bArr);
            int i2 = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
            int i3 = this.f12918b;
            if (i2 != i3) {
                y80Var.mo2422l();
                y80Var.mo2418g((int) (jMo2417f2 - y80Var.getPosition()));
            } else {
                dc1 dc1Var = new dc1(16);
                System.arraycopy(bArr, 0, dc1Var.f2882a, 0, 2);
                byte[] bArr2 = dc1Var.f2882a;
                while (i < 14 && (iMo2415d = y80Var.mo2415d(2 + i, 14 - i, bArr2)) != -1) {
                    i += iMo2415d;
                }
                dc1Var.m2315E(i);
                y80Var.mo2422l();
                y80Var.mo2418g((int) (jMo2417f2 - y80Var.getPosition()));
                zM5782f = rc2.m5782f(dc1Var, db0Var, i3, bb0Var);
            }
            if (zM5782f) {
                break;
            }
            y80Var.mo2418g(1);
        }
        if (y80Var.mo2417f() < y80Var.mo2420i() - 6) {
            return bb0Var.f1280a;
        }
        y80Var.mo2418g((int) (y80Var.mo2420i() - y80Var.mo2417f()));
        return db0Var.f2868j;
    }

    @Override // p000.InterfaceC0604ei
    /* JADX INFO: renamed from: c */
    public final C0568di mo802c(y80 y80Var, long j) {
        long position = y80Var.getPosition();
        long jM7070a = m7070a(y80Var);
        long jMo2417f = y80Var.mo2417f();
        y80Var.mo2418g(Math.max(6, this.f12917a.f2861c));
        long jM7070a2 = m7070a(y80Var);
        long jMo2417f2 = y80Var.mo2417f();
        if (jM7070a > j || jM7070a2 <= j) {
            return jM7070a2 <= j ? new C0568di(jM7070a2, jMo2417f2, -2) : new C0568di(jM7070a, position, -1);
        }
        return new C0568di(-9223372036854775807L, jMo2417f, 0);
    }
}
