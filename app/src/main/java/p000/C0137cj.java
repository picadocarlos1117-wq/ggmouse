package p000;

import java.security.AccessController;
import java.security.Provider;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* JADX INFO: renamed from: cj */
/* JADX INFO: loaded from: classes3.dex */
public final class C0137cj extends Provider {

    /* JADX INFO: renamed from: b */
    public static final String f1818b;

    /* JADX INFO: renamed from: c */
    public static final HashMap f1819c;

    /* JADX INFO: renamed from: d */
    public static final Class f1820d;

    /* JADX INFO: renamed from: e */
    public static final String[] f1821e;

    /* JADX INFO: renamed from: f */
    public static final String[] f1822f;

    /* JADX INFO: renamed from: g */
    public static final C0101bj[] f1823g;

    /* JADX INFO: renamed from: m */
    public static final String[] f1824m;

    /* JADX INFO: renamed from: n */
    public static final String[] f1825n;

    /* JADX INFO: renamed from: o */
    public static final String[] f1826o;

    /* JADX INFO: renamed from: p */
    public static final String[] f1827p;

    /* JADX INFO: renamed from: q */
    public static final String[] f1828q;

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f1829a;

    static {
        Class<?> clsLoadClass;
        Logger.getLogger(C0137cj.class.getName());
        f1818b = "BouncyCastle Security Provider v1.81";
        new ThreadLocal();
        new ThreadLocal();
        new HashSet();
        new HashMap();
        f1819c = new HashMap();
        try {
            ClassLoader classLoader = C0137cj.class.getClassLoader();
            clsLoadClass = classLoader != null ? classLoader.loadClass("java.security.cert.PKIXRevocationChecker") : (Class) AccessController.doPrivileged(new C1629yi(1, "java.security.cert.PKIXRevocationChecker"));
        } catch (ClassNotFoundException unused) {
            clsLoadClass = null;
        }
        f1820d = clsLoadClass;
        f1821e = new String[]{"PBEPBKDF1", "PBEPBKDF2", "PBEPKCS12", "TLSKDF", "SCRYPT"};
        f1822f = new String[]{"SipHash", "SipHash128", "Poly1305"};
        int i = 0;
        int i2 = 0;
        f1823g = new C0101bj[]{new C0101bj("AES", i), new C0101bj("ARC4", i), new C0101bj("ARIA", i), new C0101bj("Blowfish", i), new C0101bj("Camellia", i), new C0101bj("CAST5", i), new C0101bj("CAST6", i), new C0101bj("ChaCha", i), new C0101bj("DES", i), new C0101bj("DESede", i), new C0101bj("GOST28147", i), new C0101bj("Grainv1", i), new C0101bj("Grain128", i), new C0101bj("HC128", i), new C0101bj("HC256", i), new C0101bj("IDEA", 0), new C0101bj("Noekeon", i2), new C0101bj("RC2", i2), new C0101bj("RC5", i2), new C0101bj("RC6", i2), new C0101bj("Rijndael", i2), new C0101bj("Salsa20", i2), new C0101bj("SEED", i2), new C0101bj("Serpent", i2), new C0101bj("Shacal2", i2), new C0101bj("Skipjack", i2), new C0101bj("SM4", i2), new C0101bj("TEA", i2), new C0101bj("Twofish", i2), new C0101bj("Threefish", i2), new C0101bj("VMPC", i2), new C0101bj("VMPCKSA3", i2), new C0101bj("XTEA", i2), new C0101bj("XSalsa20", i2), new C0101bj("OpenSSLPBKDF", i2), new C0101bj("DSTU7624", i2), new C0101bj("GOST3412_2015", i2), new C0101bj("Zuc", i2)};
        f1824m = new String[]{"X509", "IES", "COMPOSITE", "EXTERNAL", "CompositeSignatures", "NoSig"};
        f1825n = new String[]{"DSA", "DH", "EC", "RSA", "GOST", "ECGOST", "ElGamal", "DSTU4145", "GM", "EdEC", "LMS", "SPHINCSPlus", "Dilithium", "Falcon", "NTRU", "CONTEXT", "SLHDSA", "MLDSA", "MLKEM"};
        f1826o = new String[]{"GOST3411", "Keccak", "MD2", "MD4", "MD5", "SHA1", "RIPEMD128", "RIPEMD160", "RIPEMD256", "RIPEMD320", "SHA224", "SHA256", "SHA384", "SHA512", "SHA3", "Skein", "SM3", "Tiger", "Whirlpool", "Blake2b", "Blake2s", "DSTU7564", "Haraka", "Blake3"};
        f1827p = new String[]{"BC", "BCFKS", "PKCS12"};
        f1828q = new String[]{"DRBG"};
    }

    public C0137cj() {
        super("BC", 1.81d, f1818b);
        this.f1829a = new ConcurrentHashMap();
        AccessController.doPrivileged(new C1629yi(4, this));
    }

    /* JADX INFO: renamed from: c */
    public static void m1224c(C1351r c1351r, InterfaceC1362ra interfaceC1362ra) {
        HashMap map = f1819c;
        synchronized (map) {
            map.put(c1351r, interfaceC1362ra);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m1225d(String str, String[] strArr) {
        for (int i = 0; i != strArr.length; i++) {
            m1226e(str, strArr[i]);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m1226e(String str, String str2) {
        Class<?> clsLoadClass;
        String strM5340g = AbstractC1308pu.m5340g(str, str2, "$Mappings");
        try {
            ClassLoader classLoader = C0137cj.class.getClassLoader();
            clsLoadClass = classLoader != null ? classLoader.loadClass(strM5340g) : (Class) AccessController.doPrivileged(new C1629yi(1, strM5340g));
        } catch (ClassNotFoundException unused) {
            clsLoadClass = null;
        }
        if (clsLoadClass == null) {
            return;
        }
        try {
            if (clsLoadClass.newInstance() != null) {
                throw new ClassCastException();
            }
            throw null;
        } catch (Exception e) {
            throw new InternalError("cannot create instance of " + str + str2 + "$Mappings : " + e);
        }
    }

    @Override // java.security.Provider
    public final Provider.Service getService(String str, String str2) {
        Provider.Service service;
        String strM5340g = AbstractC1308pu.m5340g(str, ".", yv1.m7155c(str2));
        Provider.Service service2 = (Provider.Service) this.f1829a.get(strM5340g);
        if (service2 != null) {
            return service2;
        }
        synchronized (this) {
            try {
                service = (Provider.Service) (!this.f1829a.containsKey(strM5340g) ? AccessController.doPrivileged(new C0020aj(this, str, str2, strM5340g)) : this.f1829a.get(strM5340g));
            } catch (Throwable th) {
                throw th;
            }
        }
        return service;
    }
}
