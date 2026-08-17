package p000;

import java.security.AccessController;
import java.security.Provider;
import java.util.HashMap;

/* JADX INFO: renamed from: zi */
/* JADX INFO: loaded from: classes3.dex */
public final class C1666zi extends Provider {

    /* JADX INFO: renamed from: a */
    public static final String[] f13421a;

    static {
        new HashMap();
        f13421a = new String[]{"SPHINCS", "LMS", "NH", "XMSS", "SPHINCSPlus", "CMCE", "Frodo", "SABER", "Picnic", "NTRU", "Falcon", "Kyber", "Dilithium", "NTRUPrime", "BIKE", "HQC", "Rainbow", "Mayo", "Snova"};
    }

    public C1666zi() {
        super("BCPQC", 1.81d, "BouncyCastle Post-Quantum Security Provider v1.81");
        AccessController.doPrivileged(new C1592xi(this));
    }
}
