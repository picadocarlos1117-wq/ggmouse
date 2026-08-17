package p000;

import com.example.ssmousepro.injection.TouchPipeline;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class hq1 implements i32 {

    /* JADX INFO: renamed from: a */
    public final gq1 f4661a;

    /* JADX INFO: renamed from: b */
    public final dc1 f4662b = new dc1(32);

    /* JADX INFO: renamed from: c */
    public int f4663c;

    /* JADX INFO: renamed from: d */
    public int f4664d;

    /* JADX INFO: renamed from: e */
    public boolean f4665e;

    /* JADX INFO: renamed from: f */
    public boolean f4666f;

    public hq1(gq1 gq1Var) {
        this.f4661a = gq1Var;
    }

    @Override // p000.i32
    /* JADX INFO: renamed from: a */
    public final void mo3241a(int i, dc1 dc1Var) {
        int iM2337t;
        boolean z = (i & 1) != 0;
        if (z) {
            iM2337t = dc1Var.f2883b + dc1Var.m2337t();
        } else {
            iM2337t = -1;
        }
        if (this.f4666f) {
            if (!z) {
                return;
            }
            this.f4666f = false;
            dc1Var.m2316F(iM2337t);
            this.f4664d = 0;
        }
        while (dc1Var.m2318a() > 0) {
            int i2 = this.f4664d;
            dc1 dc1Var2 = this.f4662b;
            if (i2 < 3) {
                if (i2 == 0) {
                    int iM2337t2 = dc1Var.m2337t();
                    dc1Var.m2316F(dc1Var.f2883b - 1);
                    if (iM2337t2 == 255) {
                        this.f4666f = true;
                        return;
                    }
                }
                int iMin = Math.min(dc1Var.m2318a(), 3 - this.f4664d);
                dc1Var.m2322e(this.f4664d, iMin, dc1Var2.f2882a);
                int i3 = this.f4664d + iMin;
                this.f4664d = i3;
                if (i3 == 3) {
                    dc1Var2.m2316F(0);
                    dc1Var2.m2315E(3);
                    dc1Var2.m2317G(1);
                    int iM2337t3 = dc1Var2.m2337t();
                    int iM2337t4 = dc1Var2.m2337t();
                    this.f4665e = (iM2337t3 & 128) != 0;
                    int i4 = (((iM2337t3 & 15) << 8) | iM2337t4) + 3;
                    this.f4663c = i4;
                    byte[] bArr = dc1Var2.f2882a;
                    if (bArr.length < i4) {
                        dc1Var2.m2319b(Math.min(TouchPipeline.SOURCE_TOUCHSCREEN, Math.max(i4, bArr.length * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(dc1Var.m2318a(), this.f4663c - this.f4664d);
                dc1Var.m2322e(this.f4664d, iMin2, dc1Var2.f2882a);
                int i5 = this.f4664d + iMin2;
                this.f4664d = i5;
                int i6 = this.f4663c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (!this.f4665e) {
                        dc1Var2.m2315E(i6);
                    } else {
                        if (z42.m7235i(0, i6, -1, dc1Var2.f2882a) != 0) {
                            this.f4666f = true;
                            return;
                        }
                        dc1Var2.m2315E(this.f4663c - 4);
                    }
                    dc1Var2.m2316F(0);
                    this.f4661a.mo3050a(dc1Var2);
                    this.f4664d = 0;
                }
            }
        }
    }

    @Override // p000.i32
    /* JADX INFO: renamed from: b */
    public final void mo3242b(y02 y02Var, z80 z80Var, qk0 qk0Var) {
        this.f4661a.mo3051b(y02Var, z80Var, qk0Var);
        this.f4666f = true;
    }

    @Override // p000.i32
    /* JADX INFO: renamed from: c */
    public final void mo3243c() {
        this.f4666f = true;
    }
}
