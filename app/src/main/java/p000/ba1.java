package p000;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class ba1 {

    /* JADX INFO: renamed from: b */
    public static final Logger f1263b;

    /* JADX INFO: renamed from: c */
    public static final ba1 f1264c;

    /* JADX INFO: renamed from: a */
    public final od1 f1265a;

    static {
        ba1 ba1Var;
        Logger logger = Logger.getLogger(ba1.class.getName());
        f1263b = logger;
        od1 od1Var = od1.f7763d;
        ClassLoader classLoader = ba1.class.getClassLoader();
        try {
            classLoader.loadClass("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (ClassNotFoundException e) {
            logger.log(Level.FINE, "Unable to find Conscrypt. Skipping", (Throwable) e);
            try {
                classLoader.loadClass("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            } catch (ClassNotFoundException e2) {
                logger.log(Level.FINE, "Unable to find any OpenSSLSocketImpl. Skipping", (Throwable) e2);
                ba1Var = new ba1(od1Var);
            }
        }
        ba1Var = new aa1(od1Var);
        f1264c = ba1Var;
    }

    public ba1(od1 od1Var) {
        p32.m5188s(od1Var, "platform");
        this.f1265a = od1Var;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m953c(String str) {
        if (str.contains("_")) {
            return false;
        }
        try {
            p32.m5179m(vi0.m6629a(str).getAuthority().indexOf(64) == -1, "Userinfo must not be present on authority: '%s'", str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo136a(SSLSocket sSLSocket, String str, List list) {
        this.f1265a.mo3819c(sSLSocket, str, list);
    }

    /* JADX INFO: renamed from: b */
    public String mo137b(SSLSocket sSLSocket) {
        return this.f1265a.mo3820d(sSLSocket);
    }

    /* JADX INFO: renamed from: d */
    public String mo138d(SSLSocket sSLSocket, String str, List list) {
        od1 od1Var = this.f1265a;
        if (list != null) {
            mo136a(sSLSocket, str, list);
        }
        try {
            sSLSocket.startHandshake();
            String strMo137b = mo137b(sSLSocket);
            if (strMo137b != null) {
                od1Var.mo4421a(sSLSocket);
                return strMo137b;
            }
            throw new RuntimeException("TLS ALPN negotiation failed with protocols: " + list);
        } catch (Throwable th) {
            od1Var.mo4421a(sSLSocket);
            throw th;
        }
    }
}
