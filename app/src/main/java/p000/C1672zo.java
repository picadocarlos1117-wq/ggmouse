package p000;

/* JADX INFO: renamed from: zo */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1672zo extends me0 {

    /* JADX INFO: renamed from: c */
    public final long f13500c;

    /* JADX INFO: renamed from: d */
    public final long f13501d;

    /* JADX INFO: renamed from: e */
    public final long f13502e;

    /* JADX INFO: renamed from: f */
    public final boolean f13503f;

    public C1672zo(t02 t02Var, long j, long j2) throws C0070ap {
        super(t02Var);
        boolean z = false;
        if (t02Var.mo1056h() != 1) {
            throw new C0070ap(0);
        }
        s02 s02VarMo1058m = t02Var.mo1058m(0, new s02(), 0L);
        long jMax = Math.max(0L, j);
        if (!s02VarMo1058m.f10189i && jMax != 0 && !s02VarMo1058m.f10186f) {
            throw new C0070ap(1);
        }
        long jMax2 = j2 == Long.MIN_VALUE ? s02VarMo1058m.f10191k : Math.max(0L, j2);
        long j3 = s02VarMo1058m.f10191k;
        if (j3 != -9223372036854775807L) {
            jMax2 = jMax2 > j3 ? j3 : jMax2;
            if (jMax > jMax2) {
                throw new C0070ap(jMax, jMax2, 2);
            }
        }
        this.f13500c = jMax;
        this.f13501d = jMax2;
        this.f13502e = jMax2 != -9223372036854775807L ? jMax2 - jMax : -9223372036854775807L;
        if (s02VarMo1058m.f10187g && (jMax2 == -9223372036854775807L || (j3 != -9223372036854775807L && jMax2 == j3))) {
            z = true;
        }
        this.f13503f = z;
    }

    @Override // p000.me0, p000.t02
    /* JADX INFO: renamed from: f */
    public final r02 mo1055f(int i, r02 r02Var, boolean z) {
        this.f6780b.mo1055f(0, r02Var, z);
        long j = r02Var.f9653e - this.f13500c;
        long j2 = this.f13502e;
        r02Var.m5651h(r02Var.f9649a, r02Var.f9650b, 0, j2 != -9223372036854775807L ? j2 - j : -9223372036854775807L, j, C1541w4.f11961c, false);
        return r02Var;
    }

    @Override // p000.me0, p000.t02
    /* JADX INFO: renamed from: m */
    public final s02 mo1058m(int i, s02 s02Var, long j) {
        this.f6780b.mo1058m(0, s02Var, 0L);
        long j2 = s02Var.f10194n;
        long j3 = this.f13500c;
        s02Var.f10194n = j2 + j3;
        s02Var.f10191k = this.f13502e;
        s02Var.f10187g = this.f13503f;
        long j4 = s02Var.f10190j;
        if (j4 != -9223372036854775807L) {
            long jMax = Math.max(j4, j3);
            s02Var.f10190j = jMax;
            long j5 = this.f13501d;
            if (j5 != -9223372036854775807L) {
                jMax = Math.min(jMax, j5);
            }
            s02Var.f10190j = jMax - j3;
        }
        long jM7226N = z42.m7226N(j3);
        long j6 = s02Var.f10183c;
        if (j6 != -9223372036854775807L) {
            s02Var.f10183c = j6 + jM7226N;
        }
        long j7 = s02Var.f10184d;
        if (j7 != -9223372036854775807L) {
            s02Var.f10184d = j7 + jM7226N;
        }
        return s02Var;
    }
}
