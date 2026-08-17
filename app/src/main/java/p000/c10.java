package p000;

import com.example.ssmousepro.injection.TouchPipeline;
import io.github.muntashirakon.adb.PairingConnectionCtx;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class c10 extends b10 {

    /* JADX INFO: renamed from: e */
    public final boolean f1599e;

    /* JADX INFO: renamed from: f */
    public final x00 f1600f;

    /* JADX INFO: renamed from: g */
    public final boolean f1601g;

    /* JADX INFO: renamed from: m */
    public final boolean f1602m;

    /* JADX INFO: renamed from: n */
    public final boolean f1603n;

    /* JADX INFO: renamed from: o */
    public final int f1604o;

    /* JADX INFO: renamed from: p */
    public final int f1605p;

    /* JADX INFO: renamed from: q */
    public final int f1606q;

    /* JADX INFO: renamed from: r */
    public final int f1607r;

    /* JADX INFO: renamed from: s */
    public final boolean f1608s;

    /* JADX INFO: renamed from: t */
    public final boolean f1609t;

    /* JADX INFO: renamed from: u */
    public final int f1610u;

    /* JADX INFO: renamed from: v */
    public final boolean f1611v;

    /* JADX INFO: renamed from: w */
    public final boolean f1612w;

    /* JADX INFO: renamed from: x */
    public final int f1613x;

    /* JADX WARN: Code duplicated, block: B:112:0x0138  */
    /* JADX WARN: Code duplicated, block: B:25:0x0042  */
    /* JADX WARN: Code duplicated, block: B:42:0x0068  */
    public c10(int i, y12 y12Var, int i2, x00 x00Var, int i3, int i4, boolean z) {
        boolean z2;
        boolean z3;
        int i5;
        int i6;
        be0 be0Var;
        int i7;
        int i8;
        int i9;
        be0 be0Var2;
        int i10;
        int i11;
        int i12;
        super(i, y12Var, i2);
        this.f1600f = x00Var;
        boolean z4 = x00Var.f12397t;
        qm0 qm0Var = x00Var.f4430h;
        int i13 = z4 ? 24 : 16;
        int i14 = 0;
        this.f1609t = false;
        if (!z || (((i10 = (be0Var2 = this.f1125d).f1348u) != -1 && i10 > x00Var.f4423a) || ((i11 = be0Var2.f1349v) != -1 && i11 > x00Var.f4424b))) {
            z2 = false;
        } else {
            float f = be0Var2.f1350w;
            if ((f == -1.0f || f <= x00Var.f4425c) && ((i12 = be0Var2.f1337j) == -1 || i12 <= x00Var.f4426d)) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        this.f1599e = z2;
        if (!z || (((i7 = (be0Var = this.f1125d).f1348u) != -1 && i7 < 0) || ((i8 = be0Var.f1349v) != -1 && i8 < 0))) {
            z3 = false;
        } else {
            float f2 = be0Var.f1350w;
            if ((f2 == -1.0f || f2 >= TouchPipeline.SIZE) && ((i9 = be0Var.f1337j) == -1 || i9 >= 0)) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        this.f1601g = z3;
        this.f1602m = AbstractC0828kh.m3829m(i3, false);
        be0 be0Var3 = this.f1125d;
        float f3 = be0Var3.f1350w;
        this.f1603n = f3 != -1.0f && f3 >= 10.0f;
        this.f1604o = be0Var3.f1337j;
        int i15 = be0Var3.f1348u;
        this.f1605p = (i15 == -1 || (i6 = be0Var3.f1349v) == -1) ? -1 : i15 * i6;
        int i16 = be0Var3.f1333f;
        eb1 eb1Var = d10.f2702j;
        int i17 = Integer.MAX_VALUE;
        this.f1607r = (i16 == 0 || i16 != 0) ? Integer.bitCount(0) : Integer.MAX_VALUE;
        int i18 = this.f1125d.f1333f;
        this.f1608s = i18 == 0 || (i18 & 1) != 0;
        for (int i19 = 0; i19 < qm0Var.size(); i19++) {
            String str = this.f1125d.f1341n;
            if (str != null && str.equals(qm0Var.get(i19))) {
                i17 = i19;
                break;
            }
        }
        this.f1606q = i17;
        this.f1611v = (i3 & 384) == 128;
        this.f1612w = (i3 & 64) == 64;
        be0 be0Var4 = this.f1125d;
        String str2 = be0Var4.f1341n;
        if (str2 != null) {
            i5 = 4;
            switch (str2) {
                case "video/dolby-vision":
                    i5 = 5;
                    break;
                case "video/av01":
                    break;
                case "video/hevc":
                    i5 = 3;
                    break;
                case "video/avc":
                    i5 = 1;
                    break;
                case "video/x-vnd.on2.vp9":
                    i5 = 2;
                    break;
                default:
                    i5 = 0;
                    break;
            }
        } else {
            i5 = 0;
        }
        this.f1613x = i5;
        boolean z5 = this.f1599e;
        x00 x00Var2 = this.f1600f;
        if ((be0Var4.f1333f & PairingConnectionCtx.PairingPacketHeader.MAX_PAYLOAD_SIZE) == 0 && AbstractC0828kh.m3829m(i3, x00Var2.f12401x) && (z5 || x00Var2.f12396s)) {
            i14 = (AbstractC0828kh.m3829m(i3, false) && this.f1601g && z5 && be0Var4.f1337j != -1 && (i13 & i3) != 0) ? 2 : 1;
        }
        this.f1610u = i14;
    }

    /* JADX INFO: renamed from: c */
    public static int m1104c(c10 c10Var, c10 c10Var2) {
        AbstractC1341qq abstractC1341qqMo5045b = AbstractC1341qq.f9556a.mo5046c(c10Var.f1602m, c10Var2.f1602m).mo5044a(c10Var.f1607r, c10Var2.f1607r).mo5046c(c10Var.f1608s, c10Var2.f1608s).mo5046c(c10Var.f1603n, c10Var2.f1603n).mo5046c(c10Var.f1599e, c10Var2.f1599e).mo5046c(c10Var.f1601g, c10Var2.f1601g).mo5045b(Integer.valueOf(c10Var.f1606q), Integer.valueOf(c10Var2.f1606q), z71.f13302c);
        boolean z = c10Var.f1611v;
        AbstractC1341qq abstractC1341qqMo5046c = abstractC1341qqMo5045b.mo5046c(z, c10Var2.f1611v);
        boolean z2 = c10Var.f1612w;
        AbstractC1341qq abstractC1341qqMo5046c2 = abstractC1341qqMo5046c.mo5046c(z2, c10Var2.f1612w);
        if (z && z2) {
            abstractC1341qqMo5046c2 = abstractC1341qqMo5046c2.mo5044a(c10Var.f1613x, c10Var2.f1613x);
        }
        return abstractC1341qqMo5046c2.mo5048e();
    }

    @Override // p000.b10
    /* JADX INFO: renamed from: a */
    public final int mo824a() {
        return this.f1610u;
    }

    @Override // p000.b10
    /* JADX INFO: renamed from: b */
    public final boolean mo825b(b10 b10Var) {
        c10 c10Var = (c10) b10Var;
        if (!this.f1609t && !Objects.equals(this.f1125d.f1341n, c10Var.f1125d.f1341n)) {
            return false;
        }
        this.f1600f.getClass();
        return this.f1611v == c10Var.f1611v && this.f1612w == c10Var.f1612w;
    }
}
