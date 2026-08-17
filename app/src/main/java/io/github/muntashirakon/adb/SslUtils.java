package io.github.muntashirakon.adb;

import android.os.Build;
import java.io.PrintStream;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.X509ExtendedKeyManager;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.OpenSSLProvider;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
final class SslUtils {
    private static boolean customConscrypt = false;
    private static SSLContext sslContext;

    private static X509TrustManager getAllAcceptingTrustManager() {
        return new X509TrustManager() { // from class: io.github.muntashirakon.adb.SslUtils.2
            @Override // javax.net.ssl.X509TrustManager
            public X509Certificate[] getAcceptedIssuers() {
                return new X509Certificate[0];
            }

            @Override // javax.net.ssl.X509TrustManager
            public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
            }

            @Override // javax.net.ssl.X509TrustManager
            public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
            }
        };
    }

    private static KeyManager getKeyManager(final KeyPair keyPair) {
        return new X509ExtendedKeyManager() { // from class: io.github.muntashirakon.adb.SslUtils.1
            private final String mAlias = "key";

            @Override // javax.net.ssl.X509KeyManager
            public String chooseClientAlias(String[] strArr, Principal[] principalArr, Socket socket) {
                for (String str : strArr) {
                    if (str.equals("RSA")) {
                        return "key";
                    }
                }
                return null;
            }

            @Override // javax.net.ssl.X509KeyManager
            public String chooseServerAlias(String str, Principal[] principalArr, Socket socket) {
                return null;
            }

            @Override // javax.net.ssl.X509KeyManager
            public X509Certificate[] getCertificateChain(String str) {
                if ("key".equals(str)) {
                    return new X509Certificate[]{(X509Certificate) keyPair.getCertificate()};
                }
                return null;
            }

            @Override // javax.net.ssl.X509KeyManager
            public String[] getClientAliases(String str, Principal[] principalArr) {
                return null;
            }

            @Override // javax.net.ssl.X509KeyManager
            public PrivateKey getPrivateKey(String str) {
                if ("key".equals(str)) {
                    return keyPair.getPrivateKey();
                }
                return null;
            }

            @Override // javax.net.ssl.X509KeyManager
            public String[] getServerAliases(String str, Principal[] principalArr) {
                return null;
            }
        };
    }

    public static SSLContext getSslContext(KeyPair keyPair) throws NoSuchAlgorithmException, KeyManagementException {
        SSLContext sSLContext = sslContext;
        if (sSLContext != null) {
            return sSLContext;
        }
        try {
            int i = OpenSSLProvider.f8445a;
            sslContext = SSLContext.getInstance("TLSv1.3", (Provider) OpenSSLProvider.class.getDeclaredConstructor(null).newInstance(null));
            customConscrypt = true;
        } catch (NoSuchAlgorithmException e) {
            throw e;
        } catch (Throwable unused) {
            if (Build.VERSION.SDK_INT < 29) {
                throw new NoSuchAlgorithmException("TLSv1.3 isn't supported on your platform. Use custom Conscrypt library instead.");
            }
            sslContext = SSLContext.getInstance("TLSv1.3");
            customConscrypt = false;
        }
        PrintStream printStream = System.out;
        StringBuilder sb = new StringBuilder("Using ");
        sb.append(customConscrypt ? "custom" : "default");
        sb.append(" TLSv1.3 provider...");
        printStream.println(sb.toString());
        sslContext.init(new KeyManager[]{getKeyManager(keyPair)}, new X509TrustManager[]{getAllAcceptingTrustManager()}, new SecureRandom());
        return sslContext;
    }

    public static boolean isCustomConscrypt() {
        return customConscrypt;
    }
}
