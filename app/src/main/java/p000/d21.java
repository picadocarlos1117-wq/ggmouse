package p000;

import com.example.ssmousepro.injection.InjectionMetrics;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class d21 {

    /* JADX INFO: renamed from: B */
    public static final d21 f2726B;

    /* JADX INFO: renamed from: A */
    public final qm0 f2727A;

    /* JADX INFO: renamed from: a */
    public final CharSequence f2728a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f2729b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f2730c;

    /* JADX INFO: renamed from: d */
    public final CharSequence f2731d;

    /* JADX INFO: renamed from: e */
    public final CharSequence f2732e;

    /* JADX INFO: renamed from: f */
    public final byte[] f2733f;

    /* JADX INFO: renamed from: g */
    public final Integer f2734g;

    /* JADX INFO: renamed from: h */
    public final Integer f2735h;

    /* JADX INFO: renamed from: i */
    public final Integer f2736i;

    /* JADX INFO: renamed from: j */
    public final Integer f2737j;

    /* JADX INFO: renamed from: k */
    public final Boolean f2738k;

    /* JADX INFO: renamed from: l */
    public final Integer f2739l;

    /* JADX INFO: renamed from: m */
    public final Integer f2740m;

    /* JADX INFO: renamed from: n */
    public final Integer f2741n;

    /* JADX INFO: renamed from: o */
    public final Integer f2742o;

    /* JADX INFO: renamed from: p */
    public final Integer f2743p;

    /* JADX INFO: renamed from: q */
    public final Integer f2744q;

    /* JADX INFO: renamed from: r */
    public final Integer f2745r;

    /* JADX INFO: renamed from: s */
    public final CharSequence f2746s;

    /* JADX INFO: renamed from: t */
    public final CharSequence f2747t;

    /* JADX INFO: renamed from: u */
    public final CharSequence f2748u;

    /* JADX INFO: renamed from: v */
    public final Integer f2749v;

    /* JADX INFO: renamed from: w */
    public final Integer f2750w;

    /* JADX INFO: renamed from: x */
    public final CharSequence f2751x;

    /* JADX INFO: renamed from: y */
    public final CharSequence f2752y;

    /* JADX INFO: renamed from: z */
    public final Integer f2753z;

    static {
        c21 c21Var = new c21();
        om0 om0Var = qm0.f9540b;
        c21Var.f1654z = kk1.f5896e;
        f2726B = new d21(c21Var);
        AbstractC1308pu.m5349p(0, 1, 2, 3, 4);
        AbstractC1308pu.m5349p(5, 6, 8, 9, 10);
        AbstractC1308pu.m5349p(11, 12, 13, 14, 15);
        AbstractC1308pu.m5349p(16, 17, 18, 19, 20);
        AbstractC1308pu.m5349p(21, 22, 23, 24, 25);
        AbstractC1308pu.m5349p(26, 27, 28, 29, 30);
        AbstractC1308pu.m5349p(31, 32, 33, 34, 1000);
    }

    public d21(c21 c21Var) {
        Boolean boolValueOf = c21Var.f1639k;
        Integer numValueOf = c21Var.f1638j;
        Integer numValueOf2 = c21Var.f1653y;
        int i = 1;
        int i2 = 0;
        int i3 = 0;
        if (boolValueOf != null) {
            if (!boolValueOf.booleanValue()) {
                numValueOf = -1;
            } else if (numValueOf == null || numValueOf.intValue() == -1) {
                if (numValueOf2 != null) {
                    switch (numValueOf2.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case InjectionMetrics.I_APPLY_DELTA /* 31 */:
                        case 32:
                        case InjectionMetrics.I_KEY_EVENTS /* 33 */:
                        case InjectionMetrics.I_TOQUES_ATIVOS /* 34 */:
                        case InjectionMetrics.SNAPSHOT_LEN /* 35 */:
                            break;
                        case 20:
                        case InjectionMetrics.I_MAX_ACTIVE_REJ /* 26 */:
                        case InjectionMetrics.I_TAP_ID_EXHAUST /* 27 */:
                        case InjectionMetrics.I_AIM_LOOP_TICKS /* 28 */:
                        case 29:
                        case 30:
                        default:
                            i = 0;
                            break;
                        case 21:
                            i = 2;
                            break;
                        case 22:
                            i = 3;
                            break;
                        case 23:
                            i = 4;
                            break;
                        case 24:
                            i = 5;
                            break;
                        case 25:
                            i = 6;
                            break;
                    }
                    i3 = i;
                }
                numValueOf = Integer.valueOf(i3);
            }
        } else if (numValueOf != null) {
            boolean z = numValueOf.intValue() != -1;
            boolValueOf = Boolean.valueOf(z);
            if (z && numValueOf2 == null) {
                switch (numValueOf.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i2 = 21;
                        break;
                    case 3:
                        i2 = 22;
                        break;
                    case 4:
                        i2 = 23;
                        break;
                    case 5:
                        i2 = 24;
                        break;
                    case 6:
                        i2 = 25;
                        break;
                    default:
                        i2 = 20;
                        break;
                }
                numValueOf2 = Integer.valueOf(i2);
            }
        }
        this.f2728a = c21Var.f1629a;
        this.f2729b = c21Var.f1630b;
        this.f2730c = c21Var.f1631c;
        this.f2731d = c21Var.f1632d;
        this.f2732e = c21Var.f1633e;
        this.f2733f = c21Var.f1634f;
        this.f2734g = c21Var.f1635g;
        this.f2735h = c21Var.f1636h;
        this.f2736i = c21Var.f1637i;
        this.f2737j = numValueOf;
        this.f2738k = boolValueOf;
        Integer num = c21Var.f1640l;
        this.f2739l = num;
        this.f2740m = num;
        this.f2741n = c21Var.f1641m;
        this.f2742o = c21Var.f1642n;
        this.f2743p = c21Var.f1643o;
        this.f2744q = c21Var.f1644p;
        this.f2745r = c21Var.f1645q;
        this.f2746s = c21Var.f1646r;
        this.f2747t = c21Var.f1647s;
        this.f2748u = c21Var.f1648t;
        this.f2749v = c21Var.f1649u;
        this.f2750w = c21Var.f1650v;
        this.f2751x = c21Var.f1651w;
        this.f2752y = c21Var.f1652x;
        this.f2753z = numValueOf2;
        this.f2727A = c21Var.f1654z;
    }

    /* JADX INFO: renamed from: a */
    public final c21 m2204a() {
        c21 c21Var = new c21();
        c21Var.f1629a = this.f2728a;
        c21Var.f1630b = this.f2729b;
        c21Var.f1631c = this.f2730c;
        c21Var.f1632d = this.f2731d;
        c21Var.f1633e = this.f2732e;
        c21Var.f1634f = this.f2733f;
        c21Var.f1635g = this.f2734g;
        c21Var.f1636h = this.f2735h;
        c21Var.f1637i = this.f2736i;
        c21Var.f1638j = this.f2737j;
        c21Var.f1639k = this.f2738k;
        c21Var.f1640l = this.f2740m;
        c21Var.f1641m = this.f2741n;
        c21Var.f1642n = this.f2742o;
        c21Var.f1643o = this.f2743p;
        c21Var.f1644p = this.f2744q;
        c21Var.f1645q = this.f2745r;
        c21Var.f1646r = this.f2746s;
        c21Var.f1647s = this.f2747t;
        c21Var.f1648t = this.f2748u;
        c21Var.f1649u = this.f2749v;
        c21Var.f1650v = this.f2750w;
        c21Var.f1651w = this.f2751x;
        c21Var.f1652x = this.f2752y;
        c21Var.f1653y = this.f2753z;
        c21Var.f1654z = this.f2727A;
        return c21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d21.class != obj.getClass()) {
            return false;
        }
        d21 d21Var = (d21) obj;
        CharSequence charSequence = d21Var.f2728a;
        int i = z42.f13274a;
        return Objects.equals(this.f2728a, charSequence) && Objects.equals(this.f2729b, d21Var.f2729b) && Objects.equals(this.f2730c, d21Var.f2730c) && Objects.equals(this.f2731d, d21Var.f2731d) && Objects.equals(this.f2732e, d21Var.f2732e) && Arrays.equals(this.f2733f, d21Var.f2733f) && Objects.equals(this.f2734g, d21Var.f2734g) && Objects.equals(this.f2735h, d21Var.f2735h) && Objects.equals(this.f2736i, d21Var.f2736i) && Objects.equals(this.f2737j, d21Var.f2737j) && Objects.equals(this.f2738k, d21Var.f2738k) && Objects.equals(this.f2740m, d21Var.f2740m) && Objects.equals(this.f2741n, d21Var.f2741n) && Objects.equals(this.f2742o, d21Var.f2742o) && Objects.equals(this.f2743p, d21Var.f2743p) && Objects.equals(this.f2744q, d21Var.f2744q) && Objects.equals(this.f2745r, d21Var.f2745r) && Objects.equals(this.f2746s, d21Var.f2746s) && Objects.equals(this.f2747t, d21Var.f2747t) && Objects.equals(this.f2748u, d21Var.f2748u) && Objects.equals(this.f2749v, d21Var.f2749v) && Objects.equals(this.f2750w, d21Var.f2750w) && Objects.equals(this.f2751x, d21Var.f2751x) && Objects.equals(this.f2752y, d21Var.f2752y) && Objects.equals(this.f2753z, d21Var.f2753z) && Objects.equals(this.f2727A, d21Var.f2727A);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2728a, this.f2729b, this.f2730c, this.f2731d, null, null, this.f2732e, null, null, null, Integer.valueOf(Arrays.hashCode(this.f2733f)), this.f2734g, null, this.f2735h, this.f2736i, this.f2737j, this.f2738k, null, this.f2740m, this.f2741n, this.f2742o, this.f2743p, this.f2744q, this.f2745r, this.f2746s, this.f2747t, this.f2748u, this.f2749v, this.f2750w, this.f2751x, null, this.f2752y, this.f2753z, true, this.f2727A});
    }
}
