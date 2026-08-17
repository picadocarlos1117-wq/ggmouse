package p000;

import com.example.ssmousepro.LoginActivity;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class a00 implements kq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ b00 f4a;

    public a00(b00 b00Var) {
        this.f4a = b00Var;
    }

    @Override // p000.kq1
    /* JADX INFO: renamed from: c */
    public final boolean mo6c() {
        return true;
    }

    @Override // p000.kq1
    /* JADX INFO: renamed from: h */
    public final jq1 mo7h(long j) {
        b00 b00Var = this.f4a;
        long j2 = (((long) b00Var.f1109d.f12745i) * j) / 1000000;
        long j3 = b00Var.f1107b;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(j2);
        long j4 = b00Var.f1108c;
        mq1 mq1Var = new mq1(j, z42.m7234h((bigIntegerValueOf.multiply(BigInteger.valueOf(j4 - j3)).divide(BigInteger.valueOf(b00Var.f1111f)).longValue() + j3) - LoginActivity.AUTH_TIMEOUT_MS, b00Var.f1107b, j4 - 1));
        return new jq1(mq1Var, mq1Var);
    }

    @Override // p000.kq1
    /* JADX INFO: renamed from: j */
    public final long mo8j() {
        b00 b00Var = this.f4a;
        return (b00Var.f1111f * 1000000) / ((long) b00Var.f1109d.f12745i);
    }
}
