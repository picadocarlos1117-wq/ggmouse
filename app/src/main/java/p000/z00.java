package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class z00 extends b10 implements Comparable {

    /* JADX INFO: renamed from: e */
    public final int f13212e;

    /* JADX INFO: renamed from: f */
    public final boolean f13213f;

    /* JADX INFO: renamed from: g */
    public final boolean f13214g;

    /* JADX INFO: renamed from: m */
    public final boolean f13215m;

    /* JADX INFO: renamed from: n */
    public final int f13216n;

    /* JADX INFO: renamed from: o */
    public final int f13217o;

    /* JADX INFO: renamed from: p */
    public final int f13218p;

    /* JADX INFO: renamed from: q */
    public final int f13219q;

    /* JADX INFO: renamed from: r */
    public final boolean f13220r;

    public z00(int i, y12 y12Var, int i2, x00 x00Var, int i3, String str) {
        int iM2168b;
        super(i, y12Var, i2);
        int i4 = 0;
        this.f13213f = AbstractC0828kh.m3829m(i3, false);
        int i5 = this.f1125d.f1332e;
        int i6 = x00Var.f4438p;
        qm0 qm0Var = x00Var.f4436n;
        int i7 = i5 & (~i6);
        this.f13214g = (i7 & 1) != 0;
        this.f13215m = (i7 & 2) != 0;
        qm0 qm0VarM5570t = qm0Var.isEmpty() ? qm0.m5570t("") : qm0Var;
        int i8 = 0;
        while (true) {
            if (i8 >= qm0VarM5570t.size()) {
                iM2168b = 0;
                i8 = Integer.MAX_VALUE;
                break;
            } else {
                iM2168b = d10.m2168b(this.f1125d, (String) qm0VarM5570t.get(i8), false);
                if (iM2168b > 0) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        this.f13216n = i8;
        this.f13217o = iM2168b;
        int i9 = this.f1125d.f1333f;
        int i10 = x00Var.f4437o;
        eb1 eb1Var = d10.f2702j;
        int iBitCount = (i9 == 0 || i9 != i10) ? Integer.bitCount(i9 & i10) : Integer.MAX_VALUE;
        this.f13218p = iBitCount;
        this.f13220r = (this.f1125d.f1333f & 1088) != 0;
        int iM2168b2 = d10.m2168b(this.f1125d, str, d10.m2169e(str) == null);
        this.f13219q = iM2168b2;
        boolean z = iM2168b > 0 || (qm0Var.isEmpty() && iBitCount > 0) || this.f13214g || (this.f13215m && iM2168b2 > 0);
        if (AbstractC0828kh.m3829m(i3, x00Var.f12401x) && z) {
            i4 = 1;
        }
        this.f13212e = i4;
    }

    @Override // p000.b10
    /* JADX INFO: renamed from: a */
    public final int mo824a() {
        return this.f13212e;
    }

    @Override // p000.b10
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo825b(b10 b10Var) {
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(z00 z00Var) {
        AbstractC1341qq abstractC1341qqMo5046c = AbstractC1341qq.f9556a.mo5046c(this.f13213f, z00Var.f13213f);
        Integer numValueOf = Integer.valueOf(this.f13216n);
        Integer numValueOf2 = Integer.valueOf(z00Var.f13216n);
        z71 z71Var = z71.f13301b;
        z71 z71Var2 = z71.f13302c;
        AbstractC1341qq abstractC1341qqMo5045b = abstractC1341qqMo5046c.mo5045b(numValueOf, numValueOf2, z71Var2);
        int i = z00Var.f13217o;
        int i2 = this.f13217o;
        AbstractC1341qq abstractC1341qqMo5044a = abstractC1341qqMo5045b.mo5044a(i2, i);
        int i3 = z00Var.f13218p;
        int i4 = this.f13218p;
        AbstractC1341qq abstractC1341qqMo5046c2 = abstractC1341qqMo5044a.mo5044a(i4, i3).mo5046c(this.f13214g, z00Var.f13214g);
        Boolean boolValueOf = Boolean.valueOf(this.f13215m);
        Boolean boolValueOf2 = Boolean.valueOf(z00Var.f13215m);
        if (i2 != 0) {
            z71Var = z71Var2;
        }
        AbstractC1341qq abstractC1341qqMo5044a2 = abstractC1341qqMo5046c2.mo5045b(boolValueOf, boolValueOf2, z71Var).mo5044a(this.f13219q, z00Var.f13219q);
        if (i4 == 0) {
            abstractC1341qqMo5044a2 = abstractC1341qqMo5044a2.mo5047d(this.f13220r, z00Var.f13220r);
        }
        return abstractC1341qqMo5044a2.mo5048e();
    }
}
