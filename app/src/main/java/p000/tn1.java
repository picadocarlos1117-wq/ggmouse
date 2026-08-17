package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class tn1 extends AbstractC1144ng {

    /* JADX INFO: renamed from: c */
    public final kk0 f10908c;

    /* JADX INFO: renamed from: d */
    public final kk0 f10909d;

    public tn1(sn1 sn1Var, byte[] bArr) {
        super((Object) sn1Var, true);
        int iM5228a = sn1Var.f10470a.m5228a();
        int i = iM5228a * 4;
        if (bArr.length != i) {
            f40.m2713i("private key encoding does not match parameters");
            throw null;
        }
        int i2 = iM5228a * 2;
        this.f10908c = new kk0(sc2.m6067k(0, iM5228a, bArr), sc2.m6067k(iM5228a, i2, bArr));
        int i3 = iM5228a * 3;
        this.f10909d = new kk0(sc2.m6067k(i2, i3, bArr), sc2.m6067k(i3, i, bArr));
    }
}
