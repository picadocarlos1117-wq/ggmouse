package p000;

import java.security.spec.KeySpec;

/* JADX INFO: loaded from: classes3.dex */
public final class qw0 implements KeySpec {

    /* JADX INFO: renamed from: a */
    public final byte[] f9592a;

    /* JADX INFO: renamed from: b */
    public final byte[] f9593b;

    /* JADX INFO: renamed from: c */
    public final nw0 f9594c;

    /* JADX INFO: renamed from: d */
    public final boolean f9595d;

    public qw0(nw0 nw0Var, byte[] bArr) {
        if (bArr.length != 64) {
            f40.m2713i("incorrect length for seed");
            throw null;
        }
        this.f9595d = true;
        this.f9594c = nw0Var;
        this.f9592a = sc2.m6061e(bArr);
        this.f9593b = null;
    }

    public qw0(nw0 nw0Var, byte[] bArr, byte[] bArr2) {
        this.f9595d = false;
        this.f9594c = nw0Var;
        this.f9592a = sc2.m6061e(bArr);
        this.f9593b = sc2.m6061e(bArr2);
    }
}
