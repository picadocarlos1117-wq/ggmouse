package p000;

import com.google.android.gms.security.ProviderInstaller;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.security.AccessController;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivilegedActionException;
import java.security.Provider;
import java.security.Security;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class od1 {

    /* JADX INFO: renamed from: b */
    public static final Logger f7761b;

    /* JADX INFO: renamed from: c */
    public static final String[] f7762c;

    /* JADX INFO: renamed from: d */
    public static final od1 f7763d;

    /* JADX INFO: renamed from: a */
    public final Provider f7764a;

    static {
        Object obj;
        Provider provider;
        Provider provider2;
        od1 od1Var;
        int i;
        Logger logger = Logger.getLogger(od1.class.getName());
        f7761b = logger;
        f7762c = new String[]{"com.google.android.gms.org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLProvider", "org.apache.harmony.xnet.provider.jsse.OpenSSLProvider", "com.google.android.libraries.stitch.sslguard.SslGuardProvider"};
        Provider[] providers = Security.getProviders();
        int length = providers.length;
        int i2 = 0;
        loop0: while (true) {
            obj = null;
            if (i2 >= length) {
                logger.log(Level.WARNING, "Unable to find Conscrypt");
                provider = null;
                break;
            }
            Provider provider3 = providers[i2];
            for (String str : f7762c) {
                if (str.equals(provider3.getClass().getName())) {
                    logger.log(Level.FINE, "Found registered provider {0}", str);
                    provider = provider3;
                    break loop0;
                }
            }
            i2++;
        }
        int i3 = 2;
        if (provider != null) {
            int i4 = 19;
            C1174o9 c1174o9 = new C1174o9(obj, "setUseSessionTickets", new Class[]{Boolean.TYPE}, i4);
            C1174o9 c1174o10 = new C1174o9(obj, "setHostname", new Class[]{String.class}, i4);
            C1174o9 c1174o11 = new C1174o9(byte[].class, "getAlpnSelectedProtocol", new Class[0], i4);
            C1174o9 c1174o12 = new C1174o9(obj, "setAlpnProtocols", new Class[]{byte[].class}, i4);
            try {
                Class<?> cls = Class.forName("android.net.TrafficStats");
                cls.getMethod("tagSocket", Socket.class);
                cls.getMethod("untagSocket", Socket.class);
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
            }
            if (!provider.getName().equals(ProviderInstaller.PROVIDER_NAME) && !provider.getName().equals("Conscrypt") && !provider.getName().equals("Ssl_Guard")) {
                try {
                    od1.class.getClassLoader().loadClass("android.net.Network");
                } catch (ClassNotFoundException e) {
                    logger.log(Level.FINE, "Can't find class", (Throwable) e);
                    try {
                        od1.class.getClassLoader().loadClass("android.app.ActivityOptions");
                    } catch (ClassNotFoundException e2) {
                        logger.log(Level.FINE, "Can't find class", (Throwable) e2);
                        i3 = 3;
                    }
                    i = i3;
                }
            }
            i = 1;
            od1Var = new kd1(c1174o9, c1174o10, c1174o11, c1174o12, provider, i);
        } else {
            try {
                Provider provider4 = SSLContext.getDefault().getProvider();
                try {
                    try {
                        SSLContext sSLContext = SSLContext.getInstance("TLS", provider4);
                        sSLContext.init(null, null, null);
                        ((Method) AccessController.doPrivileged(new jd1(0))).invoke(sSLContext.createSSLEngine(), null);
                        od1Var = new ld1(provider4, (Method) AccessController.doPrivileged(new jd1(1)), (Method) AccessController.doPrivileged(new jd1(2)));
                    } catch (IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException unused2) {
                        Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                        try {
                            od1Var = new md1(cls2.getMethod("put", SSLSocket.class, Class.forName("org.eclipse.jetty.alpn.ALPN$Provider")), cls2.getMethod("get", SSLSocket.class), cls2.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"), provider4);
                        } catch (ClassNotFoundException | NoSuchMethodException unused3) {
                            provider2 = provider4;
                            od1Var = new od1(provider2);
                        }
                    }
                } catch (ClassNotFoundException | NoSuchMethodException unused4) {
                    provider2 = provider4;
                    od1Var = new od1(provider2);
                }
            } catch (NoSuchAlgorithmException e3) {
                ca0.m1184p(e3);
                return;
            }
        }
        f7763d = od1Var;
    }

    public od1(Provider provider) {
        this.f7764a = provider;
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m4797b(List list) {
        C1073lj c1073lj = new C1073lj();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ph1 ph1Var = (ph1) list.get(i);
            if (ph1Var != ph1.HTTP_1_0) {
                c1073lj.m4192D(ph1Var.f8900a.length());
                c1073lj.m4197I(ph1Var.f8900a);
            }
        }
        return c1073lj.m4211p(c1073lj.f6361b);
    }

    /* JADX INFO: renamed from: d */
    public String mo3820d(SSLSocket sSLSocket) {
        return null;
    }

    /* JADX INFO: renamed from: e */
    public int mo3821e() {
        return 3;
    }

    /* JADX INFO: renamed from: a */
    public void mo4421a(SSLSocket sSLSocket) {
    }

    /* JADX INFO: renamed from: c */
    public void mo3819c(SSLSocket sSLSocket, String str, List list) {
    }
}
