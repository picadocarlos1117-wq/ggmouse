package io.github.muntashirakon.adb;

import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.Certificate;
import javax.security.auth.DestroyFailedException;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
final class KeyPair {
    private final Certificate mCertificate;
    private final PrivateKey mPrivateKey;

    public KeyPair(PrivateKey privateKey, Certificate certificate) {
        this.mPrivateKey = privateKey;
        this.mCertificate = certificate;
    }

    public void destroy() throws DestroyFailedException {
        try {
            this.mPrivateKey.destroy();
        } catch (NoSuchMethodError unused) {
        }
    }

    public Certificate getCertificate() {
        return this.mCertificate;
    }

    public PrivateKey getPrivateKey() {
        return this.mPrivateKey;
    }

    public PublicKey getPublicKey() {
        return this.mCertificate.getPublicKey();
    }
}
