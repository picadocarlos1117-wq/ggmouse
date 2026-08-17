package p000;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class t00 extends b10 implements Comparable {

    /* JADX INFO: renamed from: A */
    public final boolean f10666A;

    /* JADX INFO: renamed from: B */
    public final boolean f10667B;

    /* JADX INFO: renamed from: C */
    public final boolean f10668C;

    /* JADX INFO: renamed from: e */
    public final int f10669e;

    /* JADX INFO: renamed from: f */
    public final boolean f10670f;

    /* JADX INFO: renamed from: g */
    public final String f10671g;

    /* JADX INFO: renamed from: m */
    public final x00 f10672m;

    /* JADX INFO: renamed from: n */
    public final boolean f10673n;

    /* JADX INFO: renamed from: o */
    public final int f10674o;

    /* JADX INFO: renamed from: p */
    public final int f10675p;

    /* JADX INFO: renamed from: q */
    public final int f10676q;

    /* JADX INFO: renamed from: r */
    public final boolean f10677r;

    /* JADX INFO: renamed from: s */
    public final boolean f10678s;

    /* JADX INFO: renamed from: t */
    public final int f10679t;

    /* JADX INFO: renamed from: u */
    public final int f10680u;

    /* JADX INFO: renamed from: v */
    public final boolean f10681v;

    /* JADX INFO: renamed from: w */
    public final int f10682w;

    /* JADX INFO: renamed from: x */
    public final int f10683x;

    /* JADX INFO: renamed from: y */
    public final int f10684y;

    /* JADX INFO: renamed from: z */
    public final int f10685z;

    /* JADX WARN: Code duplicated, block: B:113:0x0186  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:89:0x0144  */
    /* JADX WARN: Code duplicated, block: B:90:0x0146  */
    /* JADX WARN: Code duplicated, block: B:93:0x014f  */
    /* JADX WARN: Code duplicated, block: B:94:0x0151  */
    public t00(int i, y12 y12Var, int i2, x00 x00Var, int i3, boolean z, s00 s00Var, int i4) {
        int i5;
        int iM2168b;
        boolean z2;
        int iM2168b2;
        boolean z3;
        boolean z4;
        boolean z5;
        f22 f22Var;
        super(i, y12Var, i2);
        this.f10672m = x00Var;
        boolean z6 = x00Var.f12399v;
        qm0 qm0Var = x00Var.f4434l;
        qm0 qm0Var2 = x00Var.f4431i;
        int i6 = z6 ? 24 : 16;
        int i7 = 0;
        this.f10677r = false;
        this.f10671g = d10.m2169e(this.f1125d.f1331d);
        this.f10673n = AbstractC0828kh.m3829m(i3, false);
        int i8 = 0;
        while (true) {
            i5 = Integer.MAX_VALUE;
            if (i8 >= qm0Var2.size()) {
                iM2168b = 0;
                i8 = Integer.MAX_VALUE;
                break;
            } else {
                iM2168b = d10.m2168b(this.f1125d, (String) qm0Var2.get(i8), false);
                if (iM2168b > 0) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        this.f10675p = i8;
        this.f10674o = iM2168b;
        int i9 = this.f1125d.f1333f;
        this.f10676q = (i9 == 0 || i9 != 0) ? Integer.bitCount(0) : Integer.MAX_VALUE;
        be0 be0Var = this.f1125d;
        int i10 = be0Var.f1333f;
        this.f10678s = i10 == 0 || (i10 & 1) != 0;
        this.f10681v = (be0Var.f1332e & 1) != 0;
        String str = be0Var.f1341n;
        if (str != null) {
            switch (str) {
                case "audio/eac3-joc":
                case "audio/ac4":
                case "audio/iamf":
                    z2 = true;
                    break;
                default:
                    z2 = false;
                    break;
            }
        } else {
            z2 = false;
        }
        this.f10668C = z2;
        int i11 = be0Var.f1317C;
        this.f10682w = i11;
        this.f10683x = be0Var.f1318D;
        int i12 = be0Var.f1337j;
        this.f10684y = i12;
        this.f10670f = (i12 == -1 || i12 <= x00Var.f4433k) && (i11 == -1 || i11 <= x00Var.f4432j) && s00Var.apply(be0Var);
        Configuration configuration = Resources.getSystem().getConfiguration();
        String[] strArrSplit = z42.f13274a >= 24 ? configuration.getLocales().toLanguageTags().split(",", -1) : new String[]{configuration.locale.toLanguageTag()};
        for (int i13 = 0; i13 < strArrSplit.length; i13++) {
            strArrSplit[i13] = z42.m7217E(strArrSplit[i13]);
        }
        int i14 = 0;
        while (true) {
            if (i14 < strArrSplit.length) {
                iM2168b2 = d10.m2168b(this.f1125d, strArrSplit[i14], false);
                if (iM2168b2 <= 0) {
                    i14++;
                }
            } else {
                iM2168b2 = 0;
                i14 = Integer.MAX_VALUE;
            }
        }
        this.f10679t = i14;
        this.f10680u = iM2168b2;
        for (int i15 = 0; i15 < qm0Var.size(); i15++) {
            String str2 = this.f1125d.f1341n;
            if (str2 != null && str2.equals(qm0Var.get(i15))) {
                i5 = i15;
                this.f10685z = i5;
                if ((i3 & 384) == 128) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.f10666A = z3;
                if ((i3 & 64) == 64) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.f10667B = z4;
                boolean z7 = this.f10670f;
                x00 x00Var2 = this.f10672m;
                z5 = x00Var2.f12401x;
                f22Var = x00Var2.f4435m;
                if (AbstractC0828kh.m3829m(i3, z5) && (z7 || x00Var2.f12398u)) {
                    f22Var.getClass();
                    if (AbstractC0828kh.m3829m(i3, false) || !z7 || this.f1125d.f1337j == -1 || ((!x00Var2.f12402y && z) || (i6 & i3) == 0)) {
                        i7 = 1;
                    } else {
                        i7 = 2;
                    }
                }
                this.f10669e = i7;
            }
        }
        this.f10685z = i5;
        if ((i3 & 384) == 128) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f10666A = z3;
        if ((i3 & 64) == 64) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f10667B = z4;
        boolean z8 = this.f10670f;
        x00 x00Var3 = this.f10672m;
        z5 = x00Var3.f12401x;
        f22Var = x00Var3.f4435m;
        if (AbstractC0828kh.m3829m(i3, z5)) {
            f22Var.getClass();
            if (AbstractC0828kh.m3829m(i3, false)) {
                i7 = 1;
            } else {
                i7 = 1;
            }
        }
        this.f10669e = i7;
    }

    @Override // p000.b10
    /* JADX INFO: renamed from: a */
    public final int mo824a() {
        return this.f10669e;
    }

    @Override // p000.b10
    /* JADX INFO: renamed from: b */
    public final boolean mo825b(b10 b10Var) {
        int i;
        String str;
        t00 t00Var = (t00) b10Var;
        be0 be0Var = t00Var.f1125d;
        this.f10672m.getClass();
        be0 be0Var2 = this.f1125d;
        int i2 = be0Var2.f1317C;
        if (i2 == -1 || i2 != be0Var.f1317C) {
            return false;
        }
        return (this.f10677r || ((str = be0Var2.f1341n) != null && TextUtils.equals(str, be0Var.f1341n))) && (i = be0Var2.f1318D) != -1 && i == be0Var.f1318D && this.f10666A == t00Var.f10666A && this.f10667B == t00Var.f10667B;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(t00 t00Var) {
        boolean z = this.f10673n;
        boolean z2 = this.f10670f;
        eb1 eb1VarMo2565a = (z2 && z) ? d10.f2702j : d10.f2702j.mo2565a();
        boolean z3 = t00Var.f10673n;
        int i = t00Var.f10684y;
        AbstractC1341qq abstractC1341qqMo5046c = AbstractC1341qq.f9556a.mo5046c(z, z3);
        Integer numValueOf = Integer.valueOf(this.f10675p);
        Integer numValueOf2 = Integer.valueOf(t00Var.f10675p);
        z71 z71Var = z71.f13302c;
        AbstractC1341qq abstractC1341qqMo5045b = abstractC1341qqMo5046c.mo5045b(numValueOf, numValueOf2, z71Var).mo5044a(this.f10674o, t00Var.f10674o).mo5044a(this.f10676q, t00Var.f10676q).mo5046c(this.f10681v, t00Var.f10681v).mo5046c(this.f10678s, t00Var.f10678s).mo5045b(Integer.valueOf(this.f10679t), Integer.valueOf(t00Var.f10679t), z71Var).mo5044a(this.f10680u, t00Var.f10680u).mo5046c(z2, t00Var.f10670f).mo5045b(Integer.valueOf(this.f10685z), Integer.valueOf(t00Var.f10685z), z71Var);
        this.f10672m.getClass();
        AbstractC1341qq abstractC1341qqMo5045b2 = abstractC1341qqMo5045b.mo5046c(this.f10666A, t00Var.f10666A).mo5046c(this.f10667B, t00Var.f10667B).mo5046c(this.f10668C, t00Var.f10668C).mo5045b(Integer.valueOf(this.f10682w), Integer.valueOf(t00Var.f10682w), eb1VarMo2565a).mo5045b(Integer.valueOf(this.f10683x), Integer.valueOf(t00Var.f10683x), eb1VarMo2565a);
        if (Objects.equals(this.f10671g, t00Var.f10671g)) {
            abstractC1341qqMo5045b2 = abstractC1341qqMo5045b2.mo5045b(Integer.valueOf(this.f10684y), Integer.valueOf(i), eb1VarMo2565a);
        }
        return abstractC1341qqMo5045b2.mo5048e();
    }
}
