package org.conscrypt;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes3.dex */
abstract class PeerInfoProvider {
    private static final PeerInfoProvider NULL_PEER_INFO_PROVIDER = new PeerInfoProvider() { // from class: org.conscrypt.PeerInfoProvider.1
        @Override // org.conscrypt.PeerInfoProvider
        public String getHostname() {
            return null;
        }

        @Override // org.conscrypt.PeerInfoProvider
        public String getHostnameOrIP() {
            return null;
        }

        @Override // org.conscrypt.PeerInfoProvider
        public int getPort() {
            return -1;
        }
    };

    public static PeerInfoProvider forHostAndPort(final String str, final int i) {
        return new PeerInfoProvider() { // from class: org.conscrypt.PeerInfoProvider.2
            @Override // org.conscrypt.PeerInfoProvider
            public String getHostname() {
                return str;
            }

            @Override // org.conscrypt.PeerInfoProvider
            public String getHostnameOrIP() {
                return str;
            }

            @Override // org.conscrypt.PeerInfoProvider
            public int getPort() {
                return i;
            }
        };
    }

    public static PeerInfoProvider nullProvider() {
        return NULL_PEER_INFO_PROVIDER;
    }

    public abstract String getHostname();

    public abstract String getHostnameOrIP();

    public abstract int getPort();
}
