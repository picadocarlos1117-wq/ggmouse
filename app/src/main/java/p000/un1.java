package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class un1 extends AbstractC1144ng {

    /* JADX INFO: renamed from: c */
    public final kk0 f11372c;

    public un1(sn1 sn1Var, byte[] bArr) {
        super((Object) sn1Var, false);
        int iM5228a = sn1Var.f10470a.m5228a();
        int i = iM5228a * 2;
        if (bArr.length == i) {
            this.f11372c = new kk0(sc2.m6067k(0, iM5228a, bArr), sc2.m6067k(iM5228a, i, bArr));
        } else {
            f40.m2713i("public key encoding does not match parameters");
            throw null;
        }
    }
}
