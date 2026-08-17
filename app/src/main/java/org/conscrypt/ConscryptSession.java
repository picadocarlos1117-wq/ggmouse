package org.conscrypt;

import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLSession;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes3.dex */
interface ConscryptSession extends SSLSession {
    String getApplicationProtocol();

    @Override // javax.net.ssl.SSLSession
    X509Certificate[] getPeerCertificates();

    byte[] getPeerSignedCertificateTimestamp();

    String getRequestedServerName();

    List<byte[]> getStatusResponses();
}
