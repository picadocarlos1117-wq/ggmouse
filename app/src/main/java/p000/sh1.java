package p000;

import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class sh1 {

    /* JADX INFO: renamed from: d */
    public static final Logger f10404d = Logger.getLogger(sh1.class.getName());

    /* JADX INFO: renamed from: e */
    public static final pu0 f10405e = new pu0(8);

    /* JADX INFO: renamed from: f */
    public static final ti0 f10406f = new ti0(1);

    /* JADX INFO: renamed from: a */
    public final ey1 f10407a;

    /* JADX INFO: renamed from: b */
    public final pu0 f10408b;

    /* JADX INFO: renamed from: c */
    public final InetSocketAddress f10409c;

    public sh1() {
        String str = System.getenv("GRPC_PROXY_EXP");
        ti0 ti0Var = f10406f;
        ti0Var.getClass();
        this.f10407a = ti0Var;
        pu0 pu0Var = f10405e;
        pu0Var.getClass();
        this.f10408b = pu0Var;
        if (str == null) {
            this.f10409c = null;
            return;
        }
        String[] strArrSplit = str.split(":", 2);
        int i = strArrSplit.length > 1 ? Integer.parseInt(strArrSplit[1]) : 80;
        f10404d.warning("Detected GRPC_PROXY_EXP and will honor it, but this feature will be removed in a future release. Use the JVM flags \"-Dhttps.proxyHost=HOST -Dhttps.proxyPort=PORT\" to set the https proxy for this JVM.");
        this.f10409c = new InetSocketAddress(strArrSplit[0], i);
    }

    /* JADX INFO: renamed from: a */
    public final zk0 m6102a(InetSocketAddress inetSocketAddress) {
        URL url;
        zk0 zk0Var;
        if (inetSocketAddress != null) {
            InetSocketAddress inetSocketAddress2 = this.f10409c;
            if (inetSocketAddress2 != null) {
                return new zk0(inetSocketAddress2, inetSocketAddress, null, null);
            }
            Logger logger = f10404d;
            try {
                try {
                    URI uri = new URI("https", null, vi0.m6632d(inetSocketAddress), inetSocketAddress.getPort(), null, null, null);
                    ProxySelector proxySelector = (ProxySelector) this.f10407a.get();
                    if (proxySelector == null) {
                        logger.log(Level.FINE, "proxy selector is null, so continuing without proxy lookup");
                        return null;
                    }
                    List<Proxy> listSelect = proxySelector.select(uri);
                    if (listSelect.size() > 1) {
                        logger.warning("More than 1 proxy detected, gRPC will select the first one");
                    }
                    Proxy proxy = listSelect.get(0);
                    if (proxy.type() != Proxy.Type.DIRECT) {
                        InetSocketAddress inetSocketAddress3 = (InetSocketAddress) proxy.address();
                        String strM6632d = vi0.m6632d(inetSocketAddress3);
                        InetAddress address = inetSocketAddress3.getAddress();
                        int port = inetSocketAddress3.getPort();
                        this.f10408b.getClass();
                        try {
                            url = new URL("https", strM6632d, port, "");
                        } catch (MalformedURLException unused) {
                            logger.log(Level.WARNING, "failed to create URL for Authenticator: {0} {1}", new Object[]{"https", strM6632d});
                            url = null;
                        }
                        PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(strM6632d, address, port, "https", "", null, url, Authenticator.RequestorType.PROXY);
                        if (inetSocketAddress3.isUnresolved()) {
                            inetSocketAddress3 = new InetSocketAddress(InetAddress.getByName(inetSocketAddress3.getHostName()), inetSocketAddress3.getPort());
                        }
                        int i = zk0.f13447e;
                        if (passwordAuthenticationRequestPasswordAuthentication == null) {
                            zk0Var = new zk0(inetSocketAddress3, inetSocketAddress, null, null);
                        } else {
                            zk0Var = new zk0(inetSocketAddress3, inetSocketAddress, passwordAuthenticationRequestPasswordAuthentication.getUserName(), passwordAuthenticationRequestPasswordAuthentication.getPassword() != null ? new String(passwordAuthenticationRequestPasswordAuthentication.getPassword()) : null);
                        }
                        return zk0Var;
                    }
                } catch (URISyntaxException e) {
                    logger.log(Level.WARNING, "Failed to construct URI for proxy lookup, proceeding without proxy", (Throwable) e);
                    return null;
                }
            } catch (Throwable th) {
                logger.log(Level.WARNING, "Failed to get host for proxy lookup, proceeding without proxy", th);
                return null;
            }
        }
        return null;
    }
}
