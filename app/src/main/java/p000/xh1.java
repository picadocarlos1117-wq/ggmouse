package p000;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xh1 {

    /* JADX INFO: renamed from: a */
    public static final HashMap f12607a;

    static {
        HashMap map = new HashMap();
        f12607a = map;
        map.put(vb1.f11613g, new wh1(15));
        map.put(vb1.f11614h, new wh1(15));
        map.put(vb1.f11608b, new wh1(20));
        map.put(vb1.f11609c, new wh1(11));
        map.put(vb1.f11610d, new wh1(23));
        map.put(vb1.f11611e, new wh1(24));
        map.put(tp0.f10917a, new wh1(23));
        map.put(tp0.f10918b, new wh1(24));
        map.put(ub1.f11250a, new wh1(6));
        map.put(vb1.f11607a, new wh1(10));
        jd0.m3626x(map, InterfaceC1106mf.f6910g);
        jd0.m3626x(map, InterfaceC1106mf.f6914h);
        jd0.m3626x(map, InterfaceC1106mf.f6918i);
        jd0.m3626x(map, InterfaceC1106mf.f6922j);
        jd0.m3626x(map, InterfaceC1106mf.f6926k);
        jd0.m3626x(map, InterfaceC1106mf.f6930l);
        jd0.m3626x(map, InterfaceC1106mf.f6934m);
        jd0.m3626x(map, InterfaceC1106mf.f6938n);
        jd0.m3626x(map, InterfaceC1106mf.f6942o);
        jd0.m3626x(map, InterfaceC1106mf.f6946p);
        jd0.m3626x(map, InterfaceC1106mf.f6950q);
        jd0.m3626x(map, InterfaceC1106mf.f6954r);
        jd0.m3626x(map, InterfaceC1106mf.f6958s);
        jd0.m3626x(map, InterfaceC1106mf.f6962t);
        jd0.m3626x(map, InterfaceC1106mf.f6966u);
        jd0.m3626x(map, InterfaceC1106mf.f6970v);
        jd0.m3626x(map, InterfaceC1106mf.f6974w);
        jd0.m3626x(map, InterfaceC1106mf.f6978x);
        jd0.m3626x(map, InterfaceC1106mf.f6982y);
        jd0.m3626x(map, InterfaceC1106mf.f6797D);
        jd0.m3626x(map, InterfaceC1106mf.f6801E);
        jd0.m3626x(map, InterfaceC1106mf.f6821J);
        jd0.m3626x(map, InterfaceC1106mf.f6825K);
        jd0.m3626x(map, InterfaceC1106mf.f6845P);
        jd0.m3626x(map, InterfaceC1106mf.f6849Q);
        jd0.m3626x(map, InterfaceC1106mf.f6861T);
        jd0.m3626x(map, InterfaceC1106mf.f6857S);
        jd0.m3626x(map, InterfaceC1106mf.f6883Z);
        jd0.m3626x(map, InterfaceC1106mf.f6880Y);
        jd0.m3626x(map, InterfaceC1106mf.f6869V);
        jd0.m3626x(map, InterfaceC1106mf.f6865U);
        jd0.m3626x(map, InterfaceC1106mf.f6891b0);
        jd0.m3626x(map, InterfaceC1106mf.f6887a0);
        jd0.m3626x(map, InterfaceC1106mf.f6877X);
        jd0.m3626x(map, InterfaceC1106mf.f6873W);
        jd0.m3626x(map, InterfaceC1106mf.f6899d0);
        map.put(InterfaceC1106mf.f6895c0, new wh1(21));
        jd0.m3626x(map, new C1351r("1.3.9999.6.4.10"));
        map.put(InterfaceC1106mf.f6822J0, new wh1(1));
        map.put(InterfaceC1106mf.f6826K0, new wh1(1));
        map.put(InterfaceC1106mf.f6830L0, new wh1(1));
        map.put(InterfaceC1106mf.f6834M0, new wh1(1));
        map.put(InterfaceC1106mf.f6838N0, new wh1(1));
        map.put(InterfaceC1106mf.f6842O0, new wh1(1));
        map.put(InterfaceC1106mf.f6846P0, new wh1(1));
        map.put(InterfaceC1106mf.f6850Q0, new wh1(1));
        map.put(InterfaceC1106mf.f6854R0, new wh1(1));
        map.put(InterfaceC1106mf.f6858S0, new wh1(1));
        map.put(InterfaceC1106mf.f6866U0, new wh1(4));
        map.put(InterfaceC1106mf.f6870V0, new wh1(4));
        map.put(InterfaceC1106mf.f6874W0, new wh1(4));
        map.put(InterfaceC1106mf.f6878X0, new wh1(4));
        map.put(InterfaceC1106mf.f6881Y0, new wh1(4));
        map.put(InterfaceC1106mf.f6884Z0, new wh1(4));
        map.put(InterfaceC1106mf.f6892b1, new wh1(17));
        map.put(InterfaceC1106mf.f6896c1, new wh1(17));
        map.put(InterfaceC1106mf.f6900d1, new wh1(17));
        map.put(InterfaceC1106mf.f6904e1, new wh1(17));
        map.put(InterfaceC1106mf.f6908f1, new wh1(17));
        map.put(InterfaceC1106mf.f6912g1, new wh1(17));
        map.put(InterfaceC1106mf.f6916h1, new wh1(17));
        map.put(InterfaceC1106mf.f6920i1, new wh1(17));
        map.put(InterfaceC1106mf.f6924j1, new wh1(17));
        map.put(InterfaceC1106mf.f6928k1, new wh1(17));
        map.put(InterfaceC1106mf.f6932l1, new wh1(17));
        map.put(InterfaceC1106mf.f6936m1, new wh1(17));
        map.put(InterfaceC1106mf.f6940n1, new wh1(17));
        map.put(InterfaceC1106mf.f6944o1, new wh1(17));
        map.put(InterfaceC1106mf.f6948p1, new wh1(17));
        map.put(InterfaceC1106mf.f6952q1, new wh1(17));
        map.put(InterfaceC1106mf.f6956r1, new wh1(17));
        map.put(InterfaceC1106mf.f6960s1, new wh1(17));
        map.put(InterfaceC1106mf.f6911g0, new wh1(14));
        map.put(InterfaceC1106mf.f6915h0, new wh1(14));
        map.put(InterfaceC1106mf.f6919i0, new wh1(14));
        map.put(InterfaceC1106mf.f6923j0, new wh1(14));
        map.put(InterfaceC1106mf.f6927k0, new wh1(14));
        map.put(InterfaceC1106mf.f6931l0, new wh1(14));
        map.put(InterfaceC1106mf.f6935m0, new wh1(14));
        map.put(InterfaceC1106mf.f6939n0, new wh1(14));
        map.put(InterfaceC1106mf.f6943o0, new wh1(14));
        map.put(InterfaceC1106mf.f6947p0, new wh1(14));
        map.put(InterfaceC1106mf.f6951q0, new wh1(14));
        map.put(InterfaceC1106mf.f6955r0, new wh1(14));
        map.put(InterfaceC1106mf.f6968u1, new wh1(13));
        map.put(InterfaceC1106mf.f6972v1, new wh1(13));
        map.put(InterfaceC1106mf.f6976w1, new wh1(13));
        map.put(InterfaceC1106mf.f6984y1, new wh1(13));
        map.put(InterfaceC1106mf.f6980x1, new wh1(13));
        map.put(InterfaceC1106mf.f6988z1, new wh1(13));
        map.put(InterfaceC1106mf.f6959s0, new wh1(3));
        map.put(InterfaceC1106mf.f6963t0, new wh1(3));
        map.put(e71.f3249N, new wh1(8));
        map.put(e71.f3250O, new wh1(8));
        map.put(e71.f3251P, new wh1(8));
        map.put(InterfaceC1106mf.f6787A1, new wh1(8));
        map.put(InterfaceC1106mf.f6791B1, new wh1(8));
        map.put(InterfaceC1106mf.f6795C1, new wh1(8));
        map.put(InterfaceC1106mf.f6803E1, new wh1(12));
        map.put(InterfaceC1106mf.f6807F1, new wh1(12));
        map.put(InterfaceC1106mf.f6811G1, new wh1(12));
        map.put(InterfaceC1106mf.f6815H1, new wh1(12));
        map.put(InterfaceC1106mf.f6819I1, new wh1(12));
        map.put(InterfaceC1106mf.f6823J1, new wh1(12));
        map.put(InterfaceC1106mf.f6831L1, new wh1(19));
        map.put(InterfaceC1106mf.f6835M1, new wh1(19));
        map.put(InterfaceC1106mf.f6839N1, new wh1(19));
        map.put(InterfaceC1106mf.f6843O1, new wh1(19));
        map.put(InterfaceC1106mf.f6847P1, new wh1(19));
        map.put(InterfaceC1106mf.f6851Q1, new wh1(19));
        map.put(e71.f3261j, new wh1(7));
        map.put(e71.f3262k, new wh1(7));
        map.put(e71.f3263l, new wh1(7));
        map.put(e71.f3264m, new wh1(7));
        map.put(e71.f3265n, new wh1(7));
        map.put(e71.f3266o, new wh1(7));
        map.put(InterfaceC1106mf.f6967u0, new wh1(2));
        map.put(InterfaceC1106mf.f6971v0, new wh1(2));
        map.put(InterfaceC1106mf.f6975w0, new wh1(2));
        map.put(InterfaceC1106mf.f6979x0, new wh1(2));
        map.put(InterfaceC1106mf.f6983y0, new wh1(2));
        map.put(InterfaceC1106mf.f6987z0, new wh1(2));
        map.put(InterfaceC1106mf.f6859S1, new wh1(0));
        map.put(InterfaceC1106mf.f6863T1, new wh1(0));
        map.put(InterfaceC1106mf.f6867U1, new wh1(0));
        map.put(InterfaceC1106mf.f6875W1, new wh1(5));
        map.put(InterfaceC1106mf.f6879X1, new wh1(5));
        map.put(InterfaceC1106mf.f6882Y1, new wh1(5));
        map.put(InterfaceC1106mf.f6790B0, new wh1(16));
        map.put(InterfaceC1106mf.f6794C0, new wh1(16));
        map.put(InterfaceC1106mf.f6798D0, new wh1(16));
        map.put(InterfaceC1106mf.f6802E0, new wh1(16));
        map.put(InterfaceC1106mf.f6806F0, new wh1(16));
        map.put(InterfaceC1106mf.f6810G0, new wh1(16));
        jd0.m3624v(map, e71.f3267p);
        jd0.m3624v(map, e71.f3268q);
        jd0.m3624v(map, e71.f3269r);
        jd0.m3624v(map, e71.f3270s);
        jd0.m3624v(map, e71.f3271t);
        jd0.m3624v(map, e71.f3272u);
        jd0.m3624v(map, e71.f3273v);
        jd0.m3624v(map, e71.f3274w);
        jd0.m3624v(map, e71.f3275x);
        jd0.m3624v(map, e71.f3276y);
        jd0.m3624v(map, e71.f3277z);
        jd0.m3624v(map, e71.f3236A);
        jd0.m3624v(map, e71.f3237B);
        jd0.m3624v(map, e71.f3238C);
        jd0.m3624v(map, e71.f3239D);
        jd0.m3624v(map, e71.f3240E);
        jd0.m3624v(map, e71.f3241F);
        jd0.m3624v(map, e71.f3242G);
        jd0.m3624v(map, e71.f3243H);
        jd0.m3624v(map, e71.f3244I);
        jd0.m3624v(map, e71.f3245J);
        jd0.m3624v(map, e71.f3246K);
        jd0.m3624v(map, e71.f3247L);
        jd0.m3624v(map, e71.f3248M);
        map.put(InterfaceC1106mf.f6889a2, new wh1(9));
        map.put(InterfaceC1106mf.f6893b2, new wh1(9));
        map.put(InterfaceC1106mf.f6897c2, new wh1(9));
        map.put(InterfaceC1106mf.f6901d2, new wh1(9));
        jd0.m3627y(map, InterfaceC1106mf.f6913g2);
        jd0.m3627y(map, InterfaceC1106mf.f6909f2);
        jd0.m3627y(map, InterfaceC1106mf.f6921i2);
        jd0.m3627y(map, InterfaceC1106mf.f6917h2);
        jd0.m3627y(map, InterfaceC1106mf.f6929k2);
        jd0.m3627y(map, InterfaceC1106mf.f6925j2);
        jd0.m3627y(map, InterfaceC1106mf.f6937m2);
        jd0.m3627y(map, InterfaceC1106mf.f6933l2);
        jd0.m3627y(map, InterfaceC1106mf.f6945o2);
        jd0.m3627y(map, InterfaceC1106mf.f6941n2);
        jd0.m3627y(map, InterfaceC1106mf.f6953q2);
        jd0.m3627y(map, InterfaceC1106mf.f6949p2);
        jd0.m3627y(map, InterfaceC1106mf.f6961s2);
        jd0.m3627y(map, InterfaceC1106mf.f6957r2);
        jd0.m3627y(map, InterfaceC1106mf.f6969u2);
        jd0.m3627y(map, InterfaceC1106mf.f6965t2);
        jd0.m3627y(map, InterfaceC1106mf.f6977w2);
        jd0.m3627y(map, InterfaceC1106mf.f6973v2);
        jd0.m3627y(map, InterfaceC1106mf.f6985y2);
        jd0.m3627y(map, InterfaceC1106mf.f6981x2);
        jd0.m3627y(map, InterfaceC1106mf.f6788A2);
        jd0.m3627y(map, InterfaceC1106mf.f6989z2);
        jd0.m3627y(map, InterfaceC1106mf.f6796C2);
        jd0.m3627y(map, InterfaceC1106mf.f6792B2);
        jd0.m3627y(map, InterfaceC1106mf.f6804E2);
        jd0.m3627y(map, InterfaceC1106mf.f6800D2);
        jd0.m3627y(map, InterfaceC1106mf.f6812G2);
        jd0.m3627y(map, InterfaceC1106mf.f6808F2);
        jd0.m3627y(map, InterfaceC1106mf.f6820I2);
        jd0.m3627y(map, InterfaceC1106mf.f6816H2);
        jd0.m3627y(map, InterfaceC1106mf.f6828K2);
        jd0.m3627y(map, InterfaceC1106mf.f6824J2);
        jd0.m3627y(map, InterfaceC1106mf.f6836M2);
        jd0.m3627y(map, InterfaceC1106mf.f6832L2);
        jd0.m3627y(map, InterfaceC1106mf.f6844O2);
        jd0.m3627y(map, InterfaceC1106mf.f6840N2);
        jd0.m3627y(map, InterfaceC1106mf.f6852Q2);
        jd0.m3627y(map, InterfaceC1106mf.f6848P2);
        jd0.m3627y(map, InterfaceC1106mf.f6860S2);
        jd0.m3627y(map, InterfaceC1106mf.f6856R2);
        jd0.m3627y(map, InterfaceC1106mf.f6868U2);
        jd0.m3627y(map, InterfaceC1106mf.f6864T2);
        jd0.m3627y(map, InterfaceC1106mf.f6876W2);
        jd0.m3627y(map, InterfaceC1106mf.f6872V2);
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC1399sa m6929a(ox1 ox1Var) throws IOException {
        AbstractC1399sa c1331qg;
        int i;
        AbstractC1399sa c1331qg2;
        AbstractC1399sa abstractC1399saM6105a;
        abstractC1388sM5931u = null;
        AbstractC1388s abstractC1388sM5931u = null;
        if (ox1Var == null) {
            f40.m2713i("keyInfo argument null");
            return null;
        }
        C1431t5 c1431t5 = ox1Var.f8571a;
        wh1 wh1Var = (wh1) f12607a.get(c1431t5.f10750a);
        if (wh1Var == null) {
            lv1.m4305q(c1431t5.f10750a, "algorithm identifier in public key not recognised: ");
            return null;
        }
        switch (wh1Var.f12185a) {
            case 0:
                try {
                    c1331qg = new C1331qg((C1181og) b52.f1178E.get(ox1Var.f8571a.f10750a), AbstractC1388s.m5931u(ox1Var.m5087k()).f10174a);
                    return c1331qg;
                } catch (Exception unused) {
                    c1331qg2 = new C1331qg((C1181og) b52.f1178E.get(ox1Var.f8571a.f10750a), ox1Var.f8572b.m2436x());
                }
                break;
            case 1:
                try {
                    c1331qg = new C1335qk((C1111mk) b52.f1209q.get(ox1Var.f8571a.f10750a), sc2.m6061e(C1298pk.m5267j(ox1Var.m5087k()).f8915a));
                    return c1331qg;
                } catch (Exception unused2) {
                    c1331qg2 = new C1335qk((C1111mk) b52.f1209q.get(ox1Var.f8571a.f10750a), ox1Var.f8572b.m2436x());
                }
                break;
            case 2:
                return wh1.m6792a((n20) b52.f1176C.get(ox1Var.f8571a.f10750a), ox1Var.f8572b);
            case 3:
                byte[] bArrM2436x = ox1Var.f8572b.m2436x();
                c1331qg2 = new m90((i90) b52.f1215w.get(ox1Var.f8571a.f10750a), sc2.m6067k(1, bArrM2436x.length, bArrM2436x));
                return c1331qg2;
            case 4:
                byte[] bArr = AbstractC1388s.m5931u(ox1Var.m5087k()).f10174a;
                kg0 kg0Var = new kg0((ig0) b52.f1205m.get(ox1Var.f8571a.f10750a), false);
                kg0Var.f5796c = sc2.m6061e(bArr);
                c1331qg2 = kg0Var;
                return c1331qg2;
            case 5:
                try {
                    c1331qg = new qj0((oj0) b52.f1180G.get(ox1Var.f8571a.f10750a), AbstractC1388s.m5931u(ox1Var.m5087k()).f10174a);
                    return c1331qg;
                } catch (Exception unused3) {
                    c1331qg2 = new qj0((oj0) b52.f1180G.get(ox1Var.f8571a.f10750a), ox1Var.f8572b.m2436x());
                }
                break;
            case 6:
                byte[] bArrM2436x2 = ox1Var.f8572b.m2436x();
                AbstractC1388s abstractC1388s = (AbstractC1388s) b52.m927e(bArrM2436x2);
                abstractC1399saM6105a = abstractC1388s != null ? sj0.m6105a(abstractC1388s.f10174a) : sj0.m6105a(bArrM2436x2);
                return abstractC1399saM6105a;
            case 7:
                return wh1.m6793b((iw0) b52.f1186M.get(ox1Var.f8571a.f10750a), ox1Var.f8572b);
            case 8:
                c1331qg2 = new rw0((ow0) b52.f1184K.get(ox1Var.f8571a.f10750a), ox1Var.f8572b.m2436x());
                return c1331qg2;
            case 9:
                c1331qg2 = new j01((h01) b52.f1190Q.get(ox1Var.f8571a.f10750a), AbstractC1388s.m5931u(ox1Var.m5087k()).f10174a);
                return c1331qg2;
            case 10:
                AbstractC1536w abstractC1536wM5087k = ox1Var.m5087k();
                n01 n01Var = abstractC1536wM5087k != null ? new n01(AbstractC1647z.m7171w(abstractC1536wM5087k)) : null;
                int i2 = n01Var.f7164a;
                int i3 = n01Var.f7165b;
                uh0 uh0Var = n01Var.f7166c;
                o01 o01Var = new o01(false, b52.m925c(n01Var.f7167d.f10750a));
                o01Var.f7602c = i2;
                o01Var.f7603d = i3;
                uh0 uh0Var2 = new uh0();
                uh0Var2.f11292b = uh0Var.f11292b;
                uh0Var2.f11291a = uh0Var.f11291a;
                uh0Var2.f11294d = uh0Var.f11294d;
                int[][] iArr = uh0Var.f11293c;
                uh0Var2.f11293c = new int[iArr.length][];
                int i4 = 0;
                while (true) {
                    int[][] iArr2 = uh0Var2.f11293c;
                    if (i4 >= iArr2.length) {
                        o01Var.f7604e = uh0Var2;
                        abstractC1399saM6105a = o01Var;
                        return abstractC1399saM6105a;
                    }
                    int[] iArr3 = iArr[i4];
                    int[] iArr4 = new int[iArr3.length];
                    System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
                    iArr2[i4] = iArr4;
                    i4++;
                }
                break;
            case 11:
                return new d71(ox1Var.f8572b.m2435v());
            case 12:
                c1331qg2 = new h71((f71) b52.f1217y.get(ox1Var.f8571a.f10750a), AbstractC1388s.m5931u(ox1Var.m5087k()).f10174a);
                return c1331qg2;
            case 13:
                AbstractC0585e abstractC0585e = ox1Var.f8572b;
                C1431t5 c1431t6 = ox1Var.f8571a;
                byte[] bArrM2436x3 = abstractC0585e.m2436x();
                if (!b52.m926d(bArrM2436x3) && bArrM2436x3[0] == 4) {
                    abstractC1388sM5931u = AbstractC1388s.m5931u(bArrM2436x3);
                }
                if (abstractC1388sM5931u == null) {
                    return new k71((i71) b52.f1213u.get(c1431t6.f10750a), bArrM2436x3);
                }
                c1331qg2 = new k71((i71) b52.f1213u.get(c1431t6.f10750a), abstractC1388sM5931u.f10174a);
                return c1331qg2;
            case 14:
                c1331qg2 = new cd1((ad1) b52.f1203k.get(ox1Var.f8571a.f10750a), AbstractC1388s.m5931u(ox1Var.m5087k()).f10174a);
                return c1331qg2;
            case 15:
                int iIntValue = ((Integer) b52.f1201i.get(ox1Var.f8571a.f10750a)).intValue();
                byte[] bArrM2436x4 = ox1Var.f8572b.m2436x();
                zh1 zh1Var = new zh1(false);
                int length = bArrM2436x4.length;
                if (iIntValue == 5) {
                    i = 14880;
                } else {
                    if (iIntValue != 6) {
                        f40.m2713i(jd0.m3609g(iIntValue, "unknown security category: "));
                        return null;
                    }
                    i = 38432;
                }
                if (length != i) {
                    f40.m2713i("invalid key size for security category");
                    return null;
                }
                zh1Var.f13419b = iIntValue;
                zh1Var.f13420c = sc2.m6061e(bArrM2436x4);
                c1331qg2 = zh1Var;
                return c1331qg2;
            case 16:
                byte[] bArr2 = AbstractC1388s.m5931u(ox1Var.m5087k()).f10174a;
                ni1 ni1Var = (ni1) b52.f1182I.get(ox1Var.f8571a.f10750a);
                pi1 pi1Var = new pi1(false, ni1Var);
                int i5 = ni1Var.f7423c;
                int i6 = ni1Var.f7422b;
                int i7 = ni1Var.f7425e;
                int i8 = ni1Var.f7424d;
                int i9 = ni1Var.f7427g;
                Class cls = Short.TYPE;
                if (i9 == 1) {
                    pi1Var.f8903c = (short[][][]) Array.newInstance((Class<?>) cls, i7, i8, i8);
                    int i10 = 0;
                    for (int i11 = 0; i11 < i8; i11++) {
                        for (int i12 = 0; i12 < i8; i12++) {
                            for (int i13 = 0; i13 < i7; i13++) {
                                short[][][] sArr = pi1Var.f8903c;
                                if (i11 > i12) {
                                    sArr[i13][i11][i12] = 0;
                                } else {
                                    sArr[i13][i11][i12] = (short) (bArr2[i10] & 255);
                                    i10++;
                                }
                            }
                        }
                    }
                } else {
                    pi1Var.f8904d = sc2.m6067k(0, 32, bArr2);
                    short[][][] sArr2 = (short[][][]) Array.newInstance((Class<?>) cls, i6, ni1Var.f7421a, i5);
                    pi1Var.f8905e = sArr2;
                    short[][][] sArr3 = (short[][][]) Array.newInstance((Class<?>) cls, i6, i6, i6);
                    pi1Var.f8906f = sArr3;
                    short[][][] sArr4 = (short[][][]) Array.newInstance((Class<?>) cls, i6, i6, i5);
                    pi1Var.f8907g = sArr4;
                    short[][][] sArr5 = (short[][][]) Array.newInstance((Class<?>) cls, i6, i5, i5);
                    pi1Var.f8908m = sArr5;
                    short[][][] sArr6 = (short[][][]) Array.newInstance((Class<?>) cls, i5, i5, i5);
                    pi1Var.f8909n = sArr6;
                    int iM4652W = o21.m4652W(sArr2, bArr2, 32, false) + 32;
                    int iM4652W2 = o21.m4652W(sArr3, bArr2, iM4652W, true) + iM4652W;
                    int iM4652W3 = o21.m4652W(sArr4, bArr2, iM4652W2, false) + iM4652W2;
                    int iM4652W4 = o21.m4652W(sArr5, bArr2, iM4652W3, true) + iM4652W3;
                    if (o21.m4652W(sArr6, bArr2, iM4652W4, true) + iM4652W4 != bArr2.length) {
                        f40.m2713i("unparsed data in key encoding");
                        return null;
                    }
                }
                return pi1Var;
            case 17:
                c1331qg2 = new mn1((kn1) b52.f1207o.get(ox1Var.f8571a.f10750a), AbstractC1388s.m5931u(AbstractC1647z.m7171w(ox1Var.m5087k()).mo6823x(0)).f10174a);
                return c1331qg2;
            case 18:
                try {
                    byte[] bArr3 = AbstractC1388s.m5931u(ox1Var.m5087k()).f10174a;
                    c1331qg = new un1((sn1) b52.f1188O.get(ox1Var.f8571a.f10750a), sc2.m6067k(4, bArr3.length, bArr3));
                    return c1331qg;
                } catch (Exception unused4) {
                    c1331qg2 = new un1((sn1) b52.f1188O.get(ox1Var.f8571a.f10750a), ox1Var.f8572b.m2436x());
                }
                break;
            case 19:
                c1331qg2 = new xn1((vn1) b52.f1174A.get(ox1Var.f8571a.f10750a), AbstractC1388s.m5931u(ox1Var.m5087k()).f10174a);
                return c1331qg2;
            case 20:
                return new fo1(b52.m930h(yn1.m7101j(ox1Var.f8571a.f10751b)), ox1Var.f8572b.m2435v());
            case 21:
                try {
                    byte[] bArr4 = AbstractC1388s.m5931u(ox1Var.m5087k()).f10174a;
                    c1331qg = new do1((bo1) b52.f1211s.get(ox1Var.f8571a.f10750a), sc2.m6067k(4, bArr4.length, bArr4));
                    return c1331qg;
                } catch (Exception unused5) {
                    c1331qg2 = new do1((bo1) b52.f1211s.get(ox1Var.f8571a.f10750a), ox1Var.f8572b.m2436x());
                }
                break;
            case 22:
                c1331qg2 = new yt1((wt1) b52.f1192S.get(ox1Var.f8571a.f10750a), AbstractC1388s.m5931u(ox1Var.m5087k()).f10174a);
                return c1331qg2;
            case 23:
                yb2 yb2VarM7077j = yb2.m7077j(ox1Var.f8571a.f10751b);
                if (yb2VarM7077j == null) {
                    byte[] bArr5 = AbstractC1388s.m5931u(ox1Var.m5087k()).f10174a;
                    C0599ed c0599ed = new C0599ed((hc2) hc2.f4525h.get(Integer.valueOf(sc2.m6058b(0, bArr5))));
                    c0599ed.f3316d = o21.m4669m(bArr5);
                    abstractC1399saM6105a = new mc2(c0599ed);
                    return abstractC1399saM6105a;
                }
                C1351r c1351r = yb2VarM7077j.f12934c.f10750a;
                AbstractC1536w abstractC1536wM5087k2 = ox1Var.m5087k();
                lc2 lc2Var = abstractC1536wM5087k2 != null ? new lc2(AbstractC1647z.m7171w(abstractC1536wM5087k2)) : null;
                C0599ed c0599ed2 = new C0599ed(new hc2(yb2VarM7077j.f12933b, b52.m924b(c1351r)));
                c0599ed2.f3315c = o21.m4669m(sc2.m6061e(lc2Var.f6314a));
                c0599ed2.f3314b = o21.m4669m(sc2.m6061e(lc2Var.f6315b));
                return new mc2(c0599ed2);
            default:
                zb2 zb2VarM7301j = zb2.m7301j(ox1Var.f8571a.f10751b);
                if (zb2VarM7301j == null) {
                    byte[] bArr6 = AbstractC1388s.m5931u(ox1Var.m5087k()).f10174a;
                    C0599ed c0599ed3 = new C0599ed((ac2) ac2.f141e.get(Integer.valueOf(sc2.m6058b(0, bArr6))));
                    c0599ed3.f3316d = o21.m4669m(bArr6);
                    abstractC1399saM6105a = new fc2(c0599ed3);
                    return abstractC1399saM6105a;
                }
                C1351r c1351r2 = zb2VarM7301j.f13339d.f10750a;
                AbstractC1536w abstractC1536wM5087k3 = ox1Var.m5087k();
                lc2 lc2Var2 = abstractC1536wM5087k3 != null ? new lc2(AbstractC1647z.m7171w(abstractC1536wM5087k3)) : null;
                C0599ed c0599ed4 = new C0599ed(new ac2(zb2VarM7301j.f13337b, zb2VarM7301j.f13338c, b52.m924b(c1351r2)));
                c0599ed4.f3315c = o21.m4669m(sc2.m6061e(lc2Var2.f6314a));
                c0599ed4.f3314b = o21.m4669m(sc2.m6061e(lc2Var2.f6315b));
                return new fc2(c0599ed4);
        }
    }
}
