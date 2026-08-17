package org.conscrypt;

import java.util.Collections;
import java.util.List;
import javax.net.ssl.SNIHostName;
import javax.net.ssl.SNIServerName;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes3.dex */
class Java8ExtendedSSLSession extends Java7ExtendedSSLSession {
    public Java8ExtendedSSLSession(ExternalSession externalSession) {
        super(externalSession);
    }

    @Override // javax.net.ssl.ExtendedSSLSession
    public final List<SNIServerName> getRequestedServerNames() {
        String requestedServerName = this.delegate.getRequestedServerName();
        return requestedServerName == null ? Collections.EMPTY_LIST : Collections.singletonList(new SNIHostName(requestedServerName));
    }
}
