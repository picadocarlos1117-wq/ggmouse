package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: es */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0614es {

    /* JADX INFO: renamed from: e */
    public static final C0614es f3428e;

    /* JADX INFO: renamed from: a */
    public final boolean f3429a;

    /* JADX INFO: renamed from: b */
    public final String[] f3430b;

    /* JADX INFO: renamed from: c */
    public final String[] f3431c;

    /* JADX INFO: renamed from: d */
    public final boolean f3432d;

    static {
        EnumC1301pn[] enumC1301pnArr = {EnumC1301pn.TLS_AES_128_GCM_SHA256, EnumC1301pn.TLS_AES_256_GCM_SHA384, EnumC1301pn.TLS_CHACHA20_POLY1305_SHA256, EnumC1301pn.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, EnumC1301pn.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, EnumC1301pn.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, EnumC1301pn.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, EnumC1301pn.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, EnumC1301pn.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, EnumC1301pn.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, EnumC1301pn.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, EnumC1301pn.TLS_RSA_WITH_AES_128_GCM_SHA256, EnumC1301pn.TLS_RSA_WITH_AES_256_GCM_SHA384, EnumC1301pn.TLS_RSA_WITH_AES_128_CBC_SHA, EnumC1301pn.TLS_RSA_WITH_AES_256_CBC_SHA, EnumC1301pn.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        C0577ds c0577ds = new C0577ds();
        c0577ds.f3003a = true;
        c0577ds.m2381a(enumC1301pnArr);
        d12 d12Var = d12.TLS_1_3;
        d12 d12Var2 = d12.TLS_1_2;
        c0577ds.m2382b(d12Var, d12Var2);
        c0577ds.f3004b = true;
        C0614es c0614es = new C0614es(c0577ds);
        f3428e = c0614es;
        d12[] d12VarArr = {d12Var, d12Var2, d12.TLS_1_1, d12.TLS_1_0};
        boolean z = c0614es.f3429a;
        if (!z) {
            f40.m2719o("no TLS versions for cleartext connections");
            return;
        }
        if (d12VarArr.length == 0) {
            f40.m2713i("At least one TlsVersion is required");
            return;
        }
        String[] strArr = new String[d12VarArr.length];
        for (int i = 0; i < d12VarArr.length; i++) {
            strArr[i] = d12VarArr[i].f2718a;
        }
        if (z) {
            return;
        }
        f40.m2719o("no TLS extensions for cleartext connections");
    }

    public C0614es(C0577ds c0577ds) {
        this.f3429a = c0577ds.f3003a;
        this.f3430b = (String[]) c0577ds.f3005c;
        this.f3431c = (String[]) c0577ds.f3006d;
        this.f3432d = c0577ds.f3004b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0614es)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C0614es c0614es = (C0614es) obj;
        boolean z = c0614es.f3429a;
        boolean z2 = this.f3429a;
        if (z2 != z) {
            return false;
        }
        if (z2) {
            return Arrays.equals(this.f3430b, c0614es.f3430b) && Arrays.equals(this.f3431c, c0614es.f3431c) && this.f3432d == c0614es.f3432d;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f3429a) {
            return ((((527 + Arrays.hashCode(this.f3430b)) * 31) + Arrays.hashCode(this.f3431c)) * 31) + (!this.f3432d ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        List listUnmodifiableList;
        d12 d12Var;
        if (!this.f3429a) {
            return "ConnectionSpec()";
        }
        String[] strArr = this.f3430b;
        if (strArr == null) {
            listUnmodifiableList = null;
        } else {
            EnumC1301pn[] enumC1301pnArr = new EnumC1301pn[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                String str = strArr[i];
                enumC1301pnArr[i] = str.startsWith("SSL_") ? EnumC1301pn.valueOf("TLS_".concat(str.substring(4))) : EnumC1301pn.valueOf(str);
            }
            String[] strArr2 = y42.f12842a;
            listUnmodifiableList = Collections.unmodifiableList(Arrays.asList((Object[]) enumC1301pnArr.clone()));
        }
        StringBuilder sbM5347n = AbstractC1308pu.m5347n("ConnectionSpec(cipherSuites=", listUnmodifiableList == null ? "[use default]" : listUnmodifiableList.toString(), ", tlsVersions=");
        String[] strArr3 = this.f3431c;
        d12[] d12VarArr = new d12[strArr3.length];
        for (int i2 = 0; i2 < strArr3.length; i2++) {
            String str2 = strArr3[i2];
            if ("TLSv1.3".equals(str2)) {
                d12Var = d12.TLS_1_3;
            } else if ("TLSv1.2".equals(str2)) {
                d12Var = d12.TLS_1_2;
            } else if ("TLSv1.1".equals(str2)) {
                d12Var = d12.TLS_1_1;
            } else if ("TLSv1".equals(str2)) {
                d12Var = d12.TLS_1_0;
            } else {
                if (!"SSLv3".equals(str2)) {
                    f40.m2713i(AbstractC1308pu.m5339f("Unexpected TLS version: ", str2));
                    return null;
                }
                d12Var = d12.SSL_3_0;
            }
            d12VarArr[i2] = d12Var;
        }
        String[] strArr4 = y42.f12842a;
        sbM5347n.append(Collections.unmodifiableList(Arrays.asList((Object[]) d12VarArr.clone())));
        sbM5347n.append(", supportsTlsExtensions=");
        sbM5347n.append(this.f3432d);
        sbM5347n.append(")");
        return sbM5347n.toString();
    }
}
