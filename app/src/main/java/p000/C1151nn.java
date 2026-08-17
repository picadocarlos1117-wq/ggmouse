package p000;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* JADX INFO: renamed from: nn */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1151nn {

    /* JADX INFO: renamed from: a */
    public final c22 f7454a;

    /* JADX INFO: renamed from: b */
    public final int f7455b;

    /* JADX INFO: renamed from: c */
    public final int f7456c;

    /* JADX INFO: renamed from: d */
    public final long f7457d;

    /* JADX INFO: renamed from: e */
    public final int f7458e;

    /* JADX INFO: renamed from: f */
    public int f7459f;

    /* JADX INFO: renamed from: g */
    public int f7460g;

    /* JADX INFO: renamed from: h */
    public int f7461h;

    /* JADX INFO: renamed from: i */
    public int f7462i;

    /* JADX INFO: renamed from: j */
    public int f7463j;

    /* JADX INFO: renamed from: k */
    public long f7464k;

    /* JADX INFO: renamed from: l */
    public long[] f7465l;

    /* JADX INFO: renamed from: m */
    public int[] f7466m;

    public C1151nn(int i, int i2, long j, int i3, c22 c22Var) {
        boolean z = true;
        if (i2 != 1 && i2 != 2) {
            z = false;
        }
        ki0.m3857c(z);
        this.f7457d = j;
        this.f7458e = i3;
        this.f7454a = c22Var;
        int i4 = (((i % 10) + 48) << 8) | ((i / 10) + 48);
        this.f7455b = (i2 == 2 ? 1667497984 : 1651965952) | i4;
        this.f7456c = i2 == 2 ? i4 | 1650720768 : -1;
        this.f7464k = -1L;
        this.f7465l = new long[UserVerificationMethods.USER_VERIFY_NONE];
        this.f7466m = new int[UserVerificationMethods.USER_VERIFY_NONE];
    }

    /* JADX INFO: renamed from: a */
    public final mq1 m4562a(int i) {
        return new mq1((this.f7457d / ((long) this.f7458e)) * ((long) this.f7466m[i]), this.f7465l[i]);
    }

    /* JADX INFO: renamed from: b */
    public final jq1 m4563b(long j) {
        if (this.f7463j == 0) {
            mq1 mq1Var = new mq1(0L, this.f7464k);
            return new jq1(mq1Var, mq1Var);
        }
        int i = (int) (j / (this.f7457d / ((long) this.f7458e)));
        int iM7229c = z42.m7229c(this.f7466m, i, true, true);
        if (this.f7466m[iM7229c] == i) {
            mq1 mq1VarM4562a = m4562a(iM7229c);
            return new jq1(mq1VarM4562a, mq1VarM4562a);
        }
        mq1 mq1VarM4562a2 = m4562a(iM7229c);
        int i2 = iM7229c + 1;
        return i2 < this.f7465l.length ? new jq1(mq1VarM4562a2, m4562a(i2)) : new jq1(mq1VarM4562a2, mq1VarM4562a2);
    }
}
