package p000;

import java.io.Serializable;
import java.security.PrivilegedAction;
import java.security.Security;

/* JADX INFO: renamed from: yi */
/* JADX INFO: loaded from: classes3.dex */
public final class C1629yi implements PrivilegedAction {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12985a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Serializable f12986b;

    public /* synthetic */ C1629yi(int i, Serializable serializable) {
        this.f12985a = i;
        this.f12986b = serializable;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        String str;
        String str2;
        String str3;
        int i = this.f12985a;
        Serializable serializable = this.f12986b;
        switch (i) {
            case 0:
                try {
                    return Class.forName((String) serializable);
                } catch (Exception unused) {
                    return null;
                }
            case 1:
                try {
                    return ClassLoader.getSystemClassLoader().loadClass((String) serializable);
                } catch (Exception unused2) {
                    return null;
                }
            case 2:
                return Security.getProperty((String) serializable);
            case 3:
                return System.getProperty((String) serializable);
            default:
                C0137cj c0137cj = (C0137cj) serializable;
                C0137cj.m1225d("org.bouncycastle.jcajce.provider.digest.", C0137cj.f1826o);
                C0137cj.m1225d("org.bouncycastle.jcajce.provider.symmetric.", C0137cj.f1821e);
                C0137cj.m1225d("org.bouncycastle.jcajce.provider.symmetric.", C0137cj.f1822f);
                C0101bj[] c0101bjArr = C0137cj.f1823g;
                int i2 = 0;
                for (int i3 = 0; i3 != c0101bjArr.length; i3++) {
                    C0101bj c0101bj = c0101bjArr[i3];
                    AbstractC0728hv.m3295a();
                    switch (c0101bj.f1382a) {
                        case 0:
                            str3 = c0101bj.f1383b;
                            break;
                        case 5:
                            str3 = c0101bj.f1383b;
                            break;
                        default:
                            str3 = c0101bj.f1383b;
                            break;
                    }
                    C0137cj.m1226e("org.bouncycastle.jcajce.provider.symmetric.", str3);
                }
                C0137cj.m1225d("org.bouncycastle.jcajce.provider.asymmetric.", C0137cj.f1824m);
                C0137cj.m1225d("org.bouncycastle.jcajce.provider.asymmetric.", C0137cj.f1825n);
                C0137cj.m1225d("org.bouncycastle.jcajce.provider.keystore.", C0137cj.f1827p);
                C0137cj.m1225d("org.bouncycastle.jcajce.provider.drbg.", C0137cj.f1828q);
                AbstractC1308pu.m5357x(InterfaceC1106mf.f6910g);
                AbstractC1308pu.m5357x(InterfaceC1106mf.f6914h);
                AbstractC1308pu.m5357x(InterfaceC1106mf.f6918i);
                AbstractC1308pu.m5357x(InterfaceC1106mf.f6922j);
                AbstractC1308pu.m5357x(InterfaceC1106mf.f6926k);
                AbstractC1308pu.m5357x(InterfaceC1106mf.f6930l);
                AbstractC1308pu.m5357x(InterfaceC1106mf.f6934m);
                AbstractC1308pu.m5357x(InterfaceC1106mf.f6938n);
                AbstractC1308pu.m5357x(InterfaceC1106mf.f6942o);
                AbstractC1308pu.m5357x(InterfaceC1106mf.f6946p);
                AbstractC1308pu.m5357x(InterfaceC1106mf.f6950q);
                AbstractC1308pu.m5357x(InterfaceC1106mf.f6954r);
                AbstractC1308pu.m5357x(InterfaceC1106mf.f6958s);
                AbstractC1308pu.m5357x(InterfaceC1106mf.f6962t);
                AbstractC1308pu.m5357x(InterfaceC1106mf.f6966u);
                AbstractC1308pu.m5357x(InterfaceC1106mf.f6970v);
                AbstractC1308pu.m5357x(InterfaceC1106mf.f6974w);
                AbstractC1308pu.m5357x(InterfaceC1106mf.f6978x);
                AbstractC1308pu.m5357x(InterfaceC1106mf.f6982y);
                AbstractC1308pu.m5357x(InterfaceC1106mf.f6986z);
                AbstractC1308pu.m5357x(InterfaceC1106mf.f6785A);
                AbstractC1308pu.m5357x(InterfaceC1106mf.f6789B);
                AbstractC1308pu.m5357x(InterfaceC1106mf.f6793C);
                AbstractC1308pu.m5357x(InterfaceC1106mf.f6797D);
                AbstractC1308pu.m5357x(InterfaceC1106mf.f6801E);
                AbstractC1308pu.m5357x(InterfaceC1106mf.f6805F);
                AbstractC1308pu.m5357x(InterfaceC1106mf.f6809G);
                AbstractC1308pu.m5357x(InterfaceC1106mf.f6813H);
                AbstractC1308pu.m5357x(InterfaceC1106mf.f6817I);
                AbstractC1308pu.m5357x(InterfaceC1106mf.f6821J);
                AbstractC1308pu.m5357x(InterfaceC1106mf.f6825K);
                AbstractC1308pu.m5357x(InterfaceC1106mf.f6829L);
                AbstractC1308pu.m5357x(InterfaceC1106mf.f6833M);
                AbstractC1308pu.m5357x(InterfaceC1106mf.f6837N);
                AbstractC1308pu.m5357x(InterfaceC1106mf.f6841O);
                AbstractC1308pu.m5357x(InterfaceC1106mf.f6845P);
                AbstractC1308pu.m5357x(InterfaceC1106mf.f6849Q);
                AbstractC1308pu.m5357x(InterfaceC1106mf.f6861T);
                AbstractC1308pu.m5357x(InterfaceC1106mf.f6869V);
                C0137cj.m1224c(InterfaceC1106mf.f6877X, new C1107mg(6));
                AbstractC1308pu.m5357x(new C1351r("1.3.9999.6.4.10"));
                AbstractC1308pu.m5357x(InterfaceC1106mf.f6880Y);
                AbstractC1308pu.m5357x(InterfaceC1106mf.f6887a0);
                AbstractC1308pu.m5357x(InterfaceC1106mf.f6895c0);
                C0137cj.m1224c(vb1.f11608b, new C1107mg(7));
                C0137cj.m1224c(vb1.f11609c, new C1107mg(3));
                int i4 = 8;
                C0137cj.m1224c(vb1.f11610d, new C1107mg(i4));
                C0137cj.m1224c(tp0.f10917a, new C1107mg(i4));
                int i5 = 9;
                C0137cj.m1224c(vb1.f11611e, new C1107mg(i5));
                C0137cj.m1224c(tp0.f10918b, new C1107mg(i5));
                C0137cj.m1224c(ub1.f11250a, new C1107mg(2));
                C0137cj.m1224c(InterfaceC1106mf.f6907f0, new C1107mg(5));
                C0137cj.m1224c(InterfaceC1106mf.f6959s0, new h90());
                C0137cj.m1224c(InterfaceC1106mf.f6963t0, new h90());
                C0137cj.m1224c(e71.f3249N, new mw0());
                C0137cj.m1224c(e71.f3250O, new mw0());
                C0137cj.m1224c(e71.f3251P, new mw0());
                C0137cj.m1224c(InterfaceC1106mf.f6967u0, new m20());
                C0137cj.m1224c(InterfaceC1106mf.f6971v0, new m20());
                C0137cj.m1224c(InterfaceC1106mf.f6975w0, new m20());
                C0137cj.m1224c(InterfaceC1106mf.f6979x0, new m20());
                C0137cj.m1224c(InterfaceC1106mf.f6983y0, new m20());
                C0137cj.m1224c(InterfaceC1106mf.f6987z0, new m20());
                int i6 = 1;
                C0137cj.m1224c(InterfaceC1106mf.f6822J0, new C1107mg(i6));
                C0137cj.m1224c(InterfaceC1106mf.f6830L0, new C1107mg(i6));
                C0137cj.m1224c(InterfaceC1106mf.f6838N0, new C1107mg(i6));
                C0137cj.m1224c(InterfaceC1106mf.f6846P0, new C1107mg(i6));
                C0137cj.m1224c(InterfaceC1106mf.f6854R0, new C1107mg(i6));
                C0137cj.m1224c(InterfaceC1106mf.f6859S1, new C1107mg(i2));
                C0137cj.m1224c(InterfaceC1106mf.f6863T1, new C1107mg(i2));
                C0137cj.m1224c(InterfaceC1106mf.f6867U1, new C1107mg(i2));
                C0137cj.m1224c(InterfaceC1106mf.f6875W1, new nj0());
                C0137cj.m1224c(InterfaceC1106mf.f6879X1, new nj0());
                C0137cj.m1224c(InterfaceC1106mf.f6882Y1, new nj0());
                C0137cj.m1224c(InterfaceC1106mf.f6787A1, new br0());
                C0137cj.m1224c(InterfaceC1106mf.f6791B1, new br0());
                C0137cj.m1224c(InterfaceC1106mf.f6795C1, new br0());
                int i7 = 4;
                C0137cj.m1224c(InterfaceC1106mf.f6968u1, new C1107mg(i7));
                C0137cj.m1224c(InterfaceC1106mf.f6972v1, new C1107mg(i7));
                C0137cj.m1224c(InterfaceC1106mf.f6976w1, new C1107mg(i7));
                C0137cj.m1224c(InterfaceC1106mf.f6980x1, new C1107mg(i7));
                C0137cj.m1224c(InterfaceC1106mf.f6889a2, new g01());
                C0137cj.m1224c(InterfaceC1106mf.f6893b2, new g01());
                C0137cj.m1224c(InterfaceC1106mf.f6897c2, new g01());
                C0137cj.m1224c(InterfaceC1106mf.f6901d2, new g01());
                AbstractC1308pu.m5352s(InterfaceC1106mf.f6909f2);
                AbstractC1308pu.m5352s(InterfaceC1106mf.f6913g2);
                AbstractC1308pu.m5352s(InterfaceC1106mf.f6917h2);
                AbstractC1308pu.m5352s(InterfaceC1106mf.f6921i2);
                AbstractC1308pu.m5352s(InterfaceC1106mf.f6925j2);
                AbstractC1308pu.m5352s(InterfaceC1106mf.f6929k2);
                AbstractC1308pu.m5352s(InterfaceC1106mf.f6933l2);
                AbstractC1308pu.m5352s(InterfaceC1106mf.f6937m2);
                AbstractC1308pu.m5352s(InterfaceC1106mf.f6941n2);
                AbstractC1308pu.m5352s(InterfaceC1106mf.f6945o2);
                AbstractC1308pu.m5352s(InterfaceC1106mf.f6949p2);
                AbstractC1308pu.m5352s(InterfaceC1106mf.f6953q2);
                AbstractC1308pu.m5352s(InterfaceC1106mf.f6973v2);
                AbstractC1308pu.m5352s(InterfaceC1106mf.f6977w2);
                AbstractC1308pu.m5352s(InterfaceC1106mf.f6981x2);
                AbstractC1308pu.m5352s(InterfaceC1106mf.f6985y2);
                AbstractC1308pu.m5352s(InterfaceC1106mf.f6989z2);
                AbstractC1308pu.m5352s(InterfaceC1106mf.f6788A2);
                AbstractC1308pu.m5352s(InterfaceC1106mf.f6792B2);
                AbstractC1308pu.m5352s(InterfaceC1106mf.f6796C2);
                AbstractC1308pu.m5352s(InterfaceC1106mf.f6800D2);
                AbstractC1308pu.m5352s(InterfaceC1106mf.f6804E2);
                AbstractC1308pu.m5352s(InterfaceC1106mf.f6808F2);
                AbstractC1308pu.m5352s(InterfaceC1106mf.f6812G2);
                AbstractC1308pu.m5352s(InterfaceC1106mf.f6816H2);
                AbstractC1308pu.m5352s(InterfaceC1106mf.f6820I2);
                AbstractC1308pu.m5352s(InterfaceC1106mf.f6824J2);
                AbstractC1308pu.m5352s(InterfaceC1106mf.f6828K2);
                AbstractC1308pu.m5352s(InterfaceC1106mf.f6832L2);
                AbstractC1308pu.m5352s(InterfaceC1106mf.f6836M2);
                AbstractC1308pu.m5352s(InterfaceC1106mf.f6840N2);
                AbstractC1308pu.m5352s(InterfaceC1106mf.f6844O2);
                AbstractC1308pu.m5352s(InterfaceC1106mf.f6848P2);
                AbstractC1308pu.m5352s(InterfaceC1106mf.f6852Q2);
                AbstractC1308pu.m5352s(InterfaceC1106mf.f6856R2);
                AbstractC1308pu.m5352s(InterfaceC1106mf.f6860S2);
                AbstractC1308pu.m5352s(InterfaceC1106mf.f6864T2);
                AbstractC1308pu.m5352s(InterfaceC1106mf.f6868U2);
                AbstractC1308pu.m5352s(InterfaceC1106mf.f6872V2);
                C0137cj.m1224c(InterfaceC1106mf.f6876W2, new vt1());
                c0137cj.put("X509Store.CERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertCollection");
                c0137cj.put("X509Store.ATTRIBUTECERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreAttrCertCollection");
                c0137cj.put("X509Store.CRL/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCRLCollection");
                c0137cj.put("X509Store.CERTIFICATEPAIR/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertPairCollection");
                c0137cj.put("X509Store.CERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCerts");
                c0137cj.put("X509Store.CRL/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCRLs");
                c0137cj.put("X509Store.ATTRIBUTECERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPAttrCerts");
                c0137cj.put("X509Store.CERTIFICATEPAIR/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCertPairs");
                c0137cj.put("X509StreamParser.CERTIFICATE", "org.bouncycastle.jce.provider.X509CertParser");
                c0137cj.put("X509StreamParser.ATTRIBUTECERTIFICATE", "org.bouncycastle.jce.provider.X509AttrCertParser");
                c0137cj.put("X509StreamParser.CRL", "org.bouncycastle.jce.provider.X509CRLParser");
                c0137cj.put("X509StreamParser.CERTIFICATEPAIR", "org.bouncycastle.jce.provider.X509CertPairParser");
                c0137cj.put("Cipher.BROKENPBEWITHMD5ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithMD5AndDES");
                c0137cj.put("Cipher.BROKENPBEWITHSHA1ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithSHA1AndDES");
                c0137cj.put("Cipher.OLDPBEWITHSHAANDTWOFISH-CBC", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$OldPBEWithSHAAndTwofish");
                Class cls = C0137cj.f1820d;
                c0137cj.put("CertPathValidator.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathValidatorSpi");
                c0137cj.put("CertPathBuilder.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathBuilderSpi");
                if (cls != null) {
                    str = "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi_8";
                    c0137cj.put("CertPathValidator.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi_8");
                    str2 = "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi_8";
                } else {
                    str = "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi";
                    c0137cj.put("CertPathValidator.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi");
                    str2 = "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi";
                }
                c0137cj.put("CertPathBuilder.RFC3280", str2);
                c0137cj.put("CertPathValidator.PKIX", str);
                c0137cj.put("CertPathBuilder.PKIX", str2);
                c0137cj.put("CertStore.Collection", "org.bouncycastle.jce.provider.CertStoreCollectionSpi");
                c0137cj.put("CertStore.LDAP", "org.bouncycastle.jce.provider.X509LDAPCertStoreSpi");
                c0137cj.put("CertStore.Multi", "org.bouncycastle.jce.provider.MultiCertStoreSpi");
                c0137cj.put("Alg.Alias.CertStore.X509LDAP", "LDAP");
                return null;
        }
    }
}
