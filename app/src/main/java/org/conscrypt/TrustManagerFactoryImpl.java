package org.conscrypt;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import javax.net.ssl.ManagerFactoryParameters;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactorySpi;
import p000.f40;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes3.dex */
public class TrustManagerFactoryImpl extends TrustManagerFactorySpi {
    private KeyStore keyStore;

    @Override // javax.net.ssl.TrustManagerFactorySpi
    public TrustManager[] engineGetTrustManagers() {
        if (this.keyStore != null) {
            return new TrustManager[]{new TrustManagerImpl(this.keyStore)};
        }
        f40.m2719o("TrustManagerFactory is not initialized");
        return null;
    }

    @Override // javax.net.ssl.TrustManagerFactorySpi
    public void engineInit(KeyStore keyStore) {
        if (keyStore != null) {
            this.keyStore = keyStore;
        } else {
            this.keyStore = Platform.getDefaultCertKeyStore();
        }
    }

    @Override // javax.net.ssl.TrustManagerFactorySpi
    public void engineInit(ManagerFactoryParameters managerFactoryParameters) throws InvalidAlgorithmParameterException {
        throw new InvalidAlgorithmParameterException("ManagerFactoryParameters not supported");
    }
}
