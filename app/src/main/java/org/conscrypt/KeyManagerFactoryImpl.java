package org.conscrypt;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.CertificateException;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactorySpi;
import javax.net.ssl.ManagerFactoryParameters;
import org.conscrypt.p007io.IoUtils;
import p000.f40;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes3.dex */
public class KeyManagerFactoryImpl extends KeyManagerFactorySpi {
    private KeyStore keyStore;
    private char[] pwd;

    @Override // javax.net.ssl.KeyManagerFactorySpi
    public KeyManager[] engineGetKeyManagers() {
        if (this.keyStore != null) {
            return new KeyManager[]{new KeyManagerImpl(this.keyStore, this.pwd)};
        }
        f40.m2719o("KeyManagerFactory is not initialized");
        return null;
    }

    @Override // javax.net.ssl.KeyManagerFactorySpi
    public void engineInit(KeyStore keyStore, char[] cArr) throws Throwable {
        if (keyStore != null) {
            this.keyStore = keyStore;
            if (cArr != null) {
                this.pwd = (char[]) cArr.clone();
                return;
            } else {
                this.pwd = EmptyArray.CHAR;
                return;
            }
        }
        this.keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        String property = System.getProperty("javax.net.ssl.keyStore");
        FileInputStream fileInputStream = null;
        if (property == null || property.equalsIgnoreCase("NONE") || property.isEmpty()) {
            try {
                this.keyStore.load(null, null);
                return;
            } catch (IOException e) {
                throw new KeyStoreException(e);
            } catch (CertificateException e2) {
                throw new KeyStoreException(e2);
            }
        }
        String property2 = System.getProperty("javax.net.ssl.keyStorePassword");
        if (property2 == null) {
            this.pwd = EmptyArray.CHAR;
        } else {
            this.pwd = property2.toCharArray();
        }
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(new File(property));
                try {
                    this.keyStore.load(fileInputStream2, this.pwd);
                    IoUtils.closeQuietly(fileInputStream2);
                } catch (FileNotFoundException e3) {
                    e = e3;
                    throw new KeyStoreException(e);
                } catch (IOException e4) {
                    e = e4;
                    throw new KeyStoreException(e);
                } catch (CertificateException e5) {
                    e = e5;
                    throw new KeyStoreException(e);
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    IoUtils.closeQuietly(fileInputStream);
                    throw th;
                }
            } catch (FileNotFoundException e6) {
                e = e6;
            } catch (IOException e7) {
                e = e7;
            } catch (CertificateException e8) {
                e = e8;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // javax.net.ssl.KeyManagerFactorySpi
    public void engineInit(ManagerFactoryParameters managerFactoryParameters) throws InvalidAlgorithmParameterException {
        throw new InvalidAlgorithmParameterException("ManagerFactoryParameters not supported");
    }
}
