package p000;

import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class nw0 implements AlgorithmParameterSpec {

    /* JADX INFO: renamed from: b */
    public static final HashMap f7565b;

    /* JADX INFO: renamed from: a */
    public final String f7566a;

    static {
        nw0 nw0Var = new nw0("ML-KEM-512");
        nw0 nw0Var2 = new nw0("ML-KEM-768");
        nw0 nw0Var3 = new nw0("ML-KEM-1024");
        HashMap map = new HashMap();
        f7565b = map;
        map.put("ml-kem-512", nw0Var);
        map.put("ml-kem-768", nw0Var2);
        map.put("ml-kem-1024", nw0Var3);
        map.put("kyber512", nw0Var);
        map.put("kyber768", nw0Var2);
        map.put("kyber1024", nw0Var3);
    }

    public nw0(String str) {
        this.f7566a = str;
    }

    /* JADX INFO: renamed from: a */
    public static nw0 m4619a(String str) {
        if (str == null) {
            l41.m4051t("name cannot be null");
            return null;
        }
        nw0 nw0Var = (nw0) f7565b.get(yv1.m7154b(str));
        if (nw0Var != null) {
            return nw0Var;
        }
        f40.m2713i("unknown parameter name: ".concat(str));
        return null;
    }
}
