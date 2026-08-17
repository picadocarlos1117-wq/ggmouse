package android.sun.security.provider;

import android.sun.security.pkcs12.PKCS12KeyStore;
import java.security.Provider;
import java.security.Security;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class JavaKeyStoreProvider extends Provider {
    public JavaKeyStoreProvider() {
        super("JKS", 1.0d, "Java KeyStore");
        put("KeyStore.JKS", JavaKeyStore.JKS.class.getName());
        put("KeyStore.CaseExactJKS", JavaKeyStore.CaseExactJKS.class.getName());
        put("KeyStore.PKCS12", PKCS12KeyStore.class.getName());
        Security.setProperty("keystore.type", "jks");
    }
}
