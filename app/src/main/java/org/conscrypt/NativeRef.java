package org.conscrypt;

import p000.l41;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes3.dex */
abstract class NativeRef {
    final long address;

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static final class EC_GROUP extends NativeRef {
        public EC_GROUP(long j) {
            super(j);
        }

        @Override // org.conscrypt.NativeRef
        public void doFree(long j) {
            NativeCrypto.EC_GROUP_clear_free(j);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static final class EC_POINT extends NativeRef {
        public EC_POINT(long j) {
            super(j);
        }

        @Override // org.conscrypt.NativeRef
        public void doFree(long j) {
            NativeCrypto.EC_POINT_clear_free(j);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static final class EVP_CIPHER_CTX extends NativeRef {
        public EVP_CIPHER_CTX(long j) {
            super(j);
        }

        @Override // org.conscrypt.NativeRef
        public void doFree(long j) {
            NativeCrypto.EVP_CIPHER_CTX_free(j);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static final class EVP_MD_CTX extends NativeRef {
        public EVP_MD_CTX(long j) {
            super(j);
        }

        @Override // org.conscrypt.NativeRef
        public void doFree(long j) {
            NativeCrypto.EVP_MD_CTX_destroy(j);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static final class EVP_PKEY extends NativeRef {
        public EVP_PKEY(long j) {
            super(j);
        }

        @Override // org.conscrypt.NativeRef
        public void doFree(long j) {
            NativeCrypto.EVP_PKEY_free(j);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static final class EVP_PKEY_CTX extends NativeRef {
        public EVP_PKEY_CTX(long j) {
            super(j);
        }

        @Override // org.conscrypt.NativeRef
        public void doFree(long j) {
            NativeCrypto.EVP_PKEY_CTX_free(j);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static final class HMAC_CTX extends NativeRef {
        public HMAC_CTX(long j) {
            super(j);
        }

        @Override // org.conscrypt.NativeRef
        public void doFree(long j) {
            NativeCrypto.HMAC_CTX_free(j);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static final class SSL_SESSION extends NativeRef {
        public SSL_SESSION(long j) {
            super(j);
        }

        @Override // org.conscrypt.NativeRef
        public void doFree(long j) {
            NativeCrypto.SSL_SESSION_free(j);
        }
    }

    public NativeRef(long j) {
        if (j != 0) {
            this.address = j;
        } else {
            l41.m4051t("address == 0");
            throw null;
        }
    }

    public abstract void doFree(long j);

    public boolean equals(Object obj) {
        return (obj instanceof NativeRef) && ((NativeRef) obj).address == this.address;
    }

    public void finalize() throws Throwable {
        try {
            long j = this.address;
            if (j != 0) {
                doFree(j);
            }
        } finally {
            super.finalize();
        }
    }

    public int hashCode() {
        long j = this.address;
        return (int) (j ^ (j >>> 32));
    }
}
