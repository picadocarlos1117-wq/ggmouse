package org.conscrypt;

import java.io.IOException;
import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;
import p000.C0694gy;
import p000.ca0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes3.dex */
public class IvParameters extends AlgorithmParametersSpi {

    /* JADX INFO: renamed from: iv */
    private byte[] f8443iv;

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static class AES extends IvParameters {
    }

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static class ChaCha20 extends IvParameters {
    }

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static class DESEDE extends IvParameters {
    }

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded(String str) throws IOException {
        if (str == null || str.equals("ASN.1")) {
            return engineGetEncoded();
        }
        if (str.equals("RAW")) {
            return (byte[]) this.f8443iv.clone();
        }
        ca0.m1178j("Unsupported format: ".concat(str));
        return null;
    }

    @Override // java.security.AlgorithmParametersSpi
    public <T extends AlgorithmParameterSpec> T engineGetParameterSpec(Class<T> cls) throws InvalidParameterSpecException {
        if (cls == IvParameterSpec.class) {
            return new IvParameterSpec(this.f8443iv);
        }
        C0694gy.m3078d(cls, "Incompatible AlgorithmParametersSpec class: ");
        return null;
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr, String str) throws Throwable {
        if (str == null || str.equals("ASN.1")) {
            engineInit(bArr);
        } else if (str.equals("RAW")) {
            this.f8443iv = (byte[]) bArr.clone();
        } else {
            ca0.m1178j("Unsupported format: ".concat(str));
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public String engineToString() {
        return "Conscrypt IV AlgorithmParameters";
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr) throws Throwable {
        long jAsn1_read_init;
        try {
            jAsn1_read_init = NativeCrypto.asn1_read_init(bArr);
            try {
                byte[] bArrAsn1_read_octetstring = NativeCrypto.asn1_read_octetstring(jAsn1_read_init);
                if (NativeCrypto.asn1_read_is_empty(jAsn1_read_init)) {
                    this.f8443iv = bArrAsn1_read_octetstring;
                    NativeCrypto.asn1_read_free(jAsn1_read_init);
                    return;
                }
                throw new IOException("Error reading ASN.1 encoding");
            } catch (Throwable th) {
                th = th;
                NativeCrypto.asn1_read_free(jAsn1_read_init);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            jAsn1_read_init = 0;
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded() {
        long jAsn1_write_init = 0;
        try {
            try {
                jAsn1_write_init = NativeCrypto.asn1_write_init();
                NativeCrypto.asn1_write_octetstring(jAsn1_write_init, this.f8443iv);
                byte[] bArrAsn1_write_finish = NativeCrypto.asn1_write_finish(jAsn1_write_init);
                NativeCrypto.asn1_write_free(jAsn1_write_init);
                return bArrAsn1_write_finish;
            } catch (IOException e) {
                NativeCrypto.asn1_write_cleanup(jAsn1_write_init);
                throw e;
            }
        } catch (Throwable th) {
            NativeCrypto.asn1_write_free(jAsn1_write_init);
            throw th;
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        if (algorithmParameterSpec instanceof IvParameterSpec) {
            this.f8443iv = (byte[]) ((IvParameterSpec) algorithmParameterSpec).getIV().clone();
            return;
        }
        throw new InvalidParameterSpecException("Only IvParameterSpec is supported");
    }
}
