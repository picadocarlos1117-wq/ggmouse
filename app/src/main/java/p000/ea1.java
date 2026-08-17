package p000;

import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ea1 {

    /* JADX INFO: renamed from: a */
    public static final List f3303a = Collections.unmodifiableList(Arrays.asList(ph1.HTTP_2));

    /* JADX WARN: Type inference failed for: r5v8, types: [java.io.Serializable, java.lang.String[]] */
    /* JADX INFO: renamed from: a */
    public static SSLSocket m2563a(SSLSocketFactory sSLSocketFactory, Socket socket, String str, int i, C0614es c0614es) throws IOException {
        ph1 ph1Var;
        p32.m5188s(sSLSocketFactory, "sslSocketFactory");
        p32.m5188s(socket, "socket");
        p32.m5188s(c0614es, "spec");
        SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, str, i, true);
        String[] strArr = c0614es.f3430b;
        String[] strArr2 = strArr != null ? (String[]) y42.m6998a(strArr, sSLSocket.getEnabledCipherSuites()) : null;
        String[] strArr3 = (String[]) y42.m6998a(c0614es.f3431c, sSLSocket.getEnabledProtocols());
        C0577ds c0577ds = new C0577ds(c0614es);
        if (!c0577ds.f3003a) {
            f40.m2719o("no cipher suites for cleartext connections");
            return null;
        }
        if (strArr2 == null) {
            c0577ds.f3005c = null;
        } else {
            c0577ds.f3005c = (String[]) strArr2.clone();
        }
        if (!c0577ds.f3003a) {
            f40.m2719o("no TLS versions for cleartext connections");
            return null;
        }
        if (strArr3 == null) {
            c0577ds.f3006d = null;
        } else {
            c0577ds.f3006d = (String[]) strArr3.clone();
        }
        C0614es c0614es2 = new C0614es(c0577ds);
        sSLSocket.setEnabledProtocols(c0614es2.f3431c);
        String[] strArr4 = c0614es2.f3430b;
        if (strArr4 != null) {
            sSLSocket.setEnabledCipherSuites(strArr4);
        }
        ba1 ba1Var = ba1.f1264c;
        boolean z = c0614es.f3432d;
        List list = f3303a;
        String strMo138d = ba1Var.mo138d(sSLSocket, str, z ? list : null);
        if (strMo138d.equals("http/1.0")) {
            ph1Var = ph1.HTTP_1_0;
        } else if (strMo138d.equals("http/1.1")) {
            ph1Var = ph1.HTTP_1_1;
        } else if (strMo138d.equals("h2")) {
            ph1Var = ph1.HTTP_2;
        } else {
            if (!strMo138d.equals("spdy/3.1")) {
                ca0.m1178j("Unexpected protocol: ".concat(strMo138d));
                return null;
            }
            ph1Var = ph1.SPDY_3;
        }
        p32.m5194y(list.contains(ph1Var), "Only " + list + " are supported, but negotiated protocol is %s", strMo138d);
        if (p91.f8817a.verify((str.startsWith("[") && str.endsWith("]")) ? str.substring(1, str.length() - 1) : str, sSLSocket.getSession())) {
            return sSLSocket;
        }
        throw new SSLPeerUnverifiedException("Cannot verify hostname: ".concat(str));
    }
}
