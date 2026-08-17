package org.conscrypt.p006ct;

import java.security.cert.X509Certificate;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes3.dex */
public interface CTPolicy {
    boolean doesResultConformToPolicy(CTVerificationResult cTVerificationResult, String str, X509Certificate[] x509CertificateArr);
}
