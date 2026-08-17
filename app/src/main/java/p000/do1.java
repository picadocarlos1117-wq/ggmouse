package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class do1 extends AbstractC1144ng {

    /* JADX INFO: renamed from: c */
    public final kk0 f2985c;

    public do1(bo1 bo1Var, byte[] bArr) {
        super((Object) bo1Var, false);
        int iM5228a = bo1Var.f1497c.m5228a();
        int i = iM5228a * 2;
        if (bArr.length == i) {
            this.f2985c = new kk0(sc2.m6067k(0, iM5228a, bArr), sc2.m6067k(iM5228a, i, bArr));
        } else {
            f40.m2713i("public key encoding does not match parameters");
            throw null;
        }
    }
}
