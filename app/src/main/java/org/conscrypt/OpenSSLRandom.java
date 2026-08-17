package org.conscrypt;

import java.io.Serializable;
import java.security.SecureRandomSpi;
import p000.l41;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class OpenSSLRandom extends SecureRandomSpi implements Serializable {
    private static final long serialVersionUID = 8506210602917522861L;

    @Override // java.security.SecureRandomSpi
    public byte[] engineGenerateSeed(int i) {
        byte[] bArr = new byte[i];
        NativeCrypto.RAND_bytes(bArr);
        return bArr;
    }

    @Override // java.security.SecureRandomSpi
    public void engineNextBytes(byte[] bArr) {
        NativeCrypto.RAND_bytes(bArr);
    }

    @Override // java.security.SecureRandomSpi
    public void engineSetSeed(byte[] bArr) {
        if (bArr != null) {
            return;
        }
        l41.m4051t("seed == null");
    }
}
