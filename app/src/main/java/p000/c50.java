package p000;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class c50 implements m50 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1668a;

    /* JADX INFO: renamed from: b */
    public boolean f1669b;

    /* JADX INFO: renamed from: c */
    public long f1670c;

    /* JADX INFO: renamed from: d */
    public int f1671d;

    /* JADX INFO: renamed from: e */
    public int f1672e;

    /* JADX INFO: renamed from: f */
    public final Object f1673f;

    /* JADX INFO: renamed from: g */
    public Object f1674g;

    public c50(List list) {
        this.f1668a = 0;
        this.f1673f = list;
        this.f1674g = new c22[list.size()];
        this.f1670c = -9223372036854775807L;
    }

    @Override // p000.m50
    /* JADX INFO: renamed from: a */
    public final void mo1129a(dc1 dc1Var) {
        boolean z;
        boolean z2;
        switch (this.f1668a) {
            case 0:
                if (this.f1669b) {
                    if (this.f1671d == 2) {
                        if (dc1Var.m2318a() == 0) {
                            z2 = false;
                        } else {
                            if (dc1Var.m2337t() != 32) {
                                this.f1669b = false;
                            }
                            this.f1671d--;
                            z2 = this.f1669b;
                        }
                        if (!z2) {
                        }
                    }
                    if (this.f1671d == 1) {
                        if (dc1Var.m2318a() == 0) {
                            z = false;
                        } else {
                            if (dc1Var.m2337t() != 0) {
                                this.f1669b = false;
                            }
                            this.f1671d--;
                            z = this.f1669b;
                        }
                        if (!z) {
                        }
                    }
                    int i = dc1Var.f2883b;
                    int iM2318a = dc1Var.m2318a();
                    for (c22 c22Var : (c22[]) this.f1674g) {
                        dc1Var.m2316F(i);
                        c22Var.mo1115b(dc1Var, iM2318a, 0);
                    }
                    this.f1672e += iM2318a;
                }
                break;
            default:
                dc1 dc1Var2 = (dc1) this.f1673f;
                ki0.m3866j((c22) this.f1674g);
                if (this.f1669b) {
                    int iM2318a2 = dc1Var.m2318a();
                    int i2 = this.f1672e;
                    if (i2 < 10) {
                        int iMin = Math.min(iM2318a2, 10 - i2);
                        System.arraycopy(dc1Var.f2882a, dc1Var.f2883b, dc1Var2.f2882a, this.f1672e, iMin);
                        if (this.f1672e + iMin == 10) {
                            dc1Var2.m2316F(0);
                            if (73 == dc1Var2.m2337t() && 68 == dc1Var2.m2337t() && 51 == dc1Var2.m2337t()) {
                                dc1Var2.m2317G(3);
                                this.f1671d = dc1Var2.m2336s() + 10;
                            } else {
                                AbstractC1337qm.m5542i0("Id3Reader", "Discarding invalid ID3 tag");
                                this.f1669b = false;
                            }
                        }
                    }
                    int iMin2 = Math.min(iM2318a2, this.f1671d - this.f1672e);
                    ((c22) this.f1674g).mo1115b(dc1Var, iMin2, 0);
                    this.f1672e += iMin2;
                    break;
                }
                break;
        }
    }

    @Override // p000.m50
    /* JADX INFO: renamed from: c */
    public final void mo1130c() {
        switch (this.f1668a) {
            case 0:
                this.f1669b = false;
                this.f1670c = -9223372036854775807L;
                break;
            default:
                this.f1669b = false;
                this.f1670c = -9223372036854775807L;
                break;
        }
    }

    @Override // p000.m50
    /* JADX INFO: renamed from: d */
    public final void mo1131d(boolean z) {
        int i;
        switch (this.f1668a) {
            case 0:
                if (this.f1669b) {
                    ki0.m3864h(this.f1670c != -9223372036854775807L);
                    for (c22 c22Var : (c22[]) this.f1674g) {
                        c22Var.mo1114a(this.f1670c, 1, this.f1672e, 0, null);
                    }
                    this.f1669b = false;
                }
                break;
            default:
                ki0.m3866j((c22) this.f1674g);
                if (this.f1669b && (i = this.f1671d) != 0 && this.f1672e == i) {
                    ki0.m3864h(this.f1670c != -9223372036854775807L);
                    ((c22) this.f1674g).mo1114a(this.f1670c, 1, this.f1671d, 0, null);
                    this.f1669b = false;
                    break;
                }
                break;
        }
    }

    @Override // p000.m50
    /* JADX INFO: renamed from: e */
    public final void mo1132e(int i, long j) {
        switch (this.f1668a) {
            case 0:
                if ((i & 4) != 0) {
                    this.f1669b = true;
                    this.f1670c = j;
                    this.f1672e = 0;
                    this.f1671d = 2;
                    break;
                }
                break;
            default:
                if ((i & 4) != 0) {
                    this.f1669b = true;
                    this.f1670c = j;
                    this.f1671d = 0;
                    this.f1672e = 0;
                    break;
                }
                break;
        }
    }

    @Override // p000.m50
    /* JADX INFO: renamed from: f */
    public final void mo1133f(z80 z80Var, qk0 qk0Var) {
        switch (this.f1668a) {
            case 0:
                c22[] c22VarArr = (c22[]) this.f1674g;
                for (int i = 0; i < c22VarArr.length; i++) {
                    h32 h32Var = (h32) ((List) this.f1673f).get(i);
                    qk0Var.m5498a();
                    qk0Var.m5500c();
                    c22 c22VarMo750n = z80Var.mo750n(qk0Var.f9521c, 3);
                    ae0 ae0Var = new ae0();
                    qk0Var.m5500c();
                    ae0Var.f185a = (String) qk0Var.f9523e;
                    ae0Var.f197m = v51.m6582l("application/dvbsubs");
                    ae0Var.f200p = Collections.singletonList(h32Var.f4447b);
                    ae0Var.f188d = h32Var.f4446a;
                    c22VarMo750n.mo1117d(new be0(ae0Var));
                    c22VarArr[i] = c22VarMo750n;
                }
                break;
            default:
                qk0Var.m5498a();
                qk0Var.m5500c();
                c22 c22VarMo750n2 = z80Var.mo750n(qk0Var.f9521c, 5);
                this.f1674g = c22VarMo750n2;
                ae0 ae0Var2 = new ae0();
                qk0Var.m5500c();
                ae0Var2.f185a = (String) qk0Var.f9523e;
                ae0Var2.f197m = v51.m6582l("application/id3");
                c22VarMo750n2.mo1117d(new be0(ae0Var2));
                break;
        }
    }

    public c50() {
        this.f1668a = 1;
        this.f1673f = new dc1(10);
        this.f1670c = -9223372036854775807L;
    }
}
