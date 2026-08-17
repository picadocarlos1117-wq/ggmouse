package android.sun.security.x509;

import android.sun.security.util.DerOutputStream;
import android.sun.security.util.DerValue;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import p000.AbstractC1308pu;
import p000.C0694gy;
import p000.ca0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class URIName implements GeneralNameInterface {
    private String host;
    private DNSName hostDNS;
    private IPAddressName hostIP;
    private URI uri;

    public URIName(String str) throws IOException {
        try {
            URI uri = new URI(str);
            this.uri = uri;
            if (uri.getScheme() == null) {
                ca0.m1178j(AbstractC1308pu.m5339f("URI name must include scheme:", str));
                throw null;
            }
            String host = this.uri.getHost();
            this.host = host;
            if (host != null) {
                if (host.charAt(0) == '[') {
                    String str2 = this.host;
                    try {
                        this.hostIP = new IPAddressName(str2.substring(1, str2.length() - 1));
                        return;
                    } catch (IOException unused) {
                        ca0.m1178j(AbstractC1308pu.m5339f("invalid URI name (host portion is not a valid IPv6 address):", str));
                        throw null;
                    }
                }
                try {
                    try {
                        this.hostDNS = new DNSName(this.host);
                    } catch (IOException unused2) {
                        this.hostIP = new IPAddressName(this.host);
                    }
                } catch (Exception unused3) {
                    ca0.m1178j(AbstractC1308pu.m5339f("invalid URI name (host portion is not a valid DNS name, IPv4 address, or IPv6 address):", str));
                    throw null;
                }
            }
        } catch (URISyntaxException e) {
            throw ((IOException) new IOException(AbstractC1308pu.m5339f("invalid URI name:", str)).initCause(e));
        }
    }

    public static URIName nameConstraint(DerValue derValue) throws IOException {
        String iA5String = derValue.getIA5String();
        try {
            URI uri = new URI(iA5String);
            if (uri.getScheme() != null) {
                ca0.m1178j(AbstractC1308pu.m5339f("invalid URI name constraint (should not include scheme):", iA5String));
                return null;
            }
            String schemeSpecificPart = uri.getSchemeSpecificPart();
            try {
                return new URIName(uri, schemeSpecificPart, schemeSpecificPart.charAt(0) == '.' ? new DNSName(schemeSpecificPart.substring(1)) : new DNSName(schemeSpecificPart));
            } catch (IOException e) {
                throw ((IOException) new IOException(AbstractC1308pu.m5339f("invalid URI name constraint:", iA5String)).initCause(e));
            }
        } catch (URISyntaxException e2) {
            throw ((IOException) new IOException(AbstractC1308pu.m5339f("invalid URI name constraint:", iA5String)).initCause(e2));
        }
    }

    @Override // android.sun.security.x509.GeneralNameInterface
    public int constrains(GeneralNameInterface generalNameInterface) {
        if (generalNameInterface == null || generalNameInterface.getType() != 6) {
            return -1;
        }
        URIName uRIName = (URIName) generalNameInterface;
        String host = uRIName.getHost();
        if (host.equalsIgnoreCase(this.host)) {
            return 0;
        }
        Object hostObject = uRIName.getHostObject();
        int i = 3;
        if (this.hostDNS != null && (hostObject instanceof DNSName)) {
            boolean z = this.host.charAt(0) == '.';
            boolean z2 = host.charAt(0) == '.';
            int iConstrains = this.hostDNS.constrains((DNSName) hostObject);
            if (z || z2 || (iConstrains != 2 && iConstrains != 1)) {
                i = iConstrains;
            }
            if (z != z2 && i == 0) {
                return z ? 2 : 1;
            }
        }
        return i;
    }

    @Override // android.sun.security.x509.GeneralNameInterface
    public void encode(DerOutputStream derOutputStream) throws IOException {
        derOutputStream.putIA5String(this.uri.toASCIIString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof URIName) {
            return this.uri.equals(((URIName) obj).getURI());
        }
        return false;
    }

    public String getHost() {
        return this.host;
    }

    public Object getHostObject() {
        IPAddressName iPAddressName = this.hostIP;
        return iPAddressName != null ? iPAddressName : this.hostDNS;
    }

    public String getName() {
        return this.uri.toString();
    }

    public String getScheme() {
        return this.uri.getScheme();
    }

    @Override // android.sun.security.x509.GeneralNameInterface
    public int getType() {
        return 6;
    }

    public URI getURI() {
        return this.uri;
    }

    public int hashCode() {
        return this.uri.hashCode();
    }

    @Override // android.sun.security.x509.GeneralNameInterface
    public int subtreeDepth() {
        try {
            return new DNSName(this.host).subtreeDepth();
        } catch (IOException e) {
            C0694gy.m3079e(e.getMessage());
            return 0;
        }
    }

    public String toString() {
        return "URIName: " + this.uri.toString();
    }

    public URIName(DerValue derValue) {
        this(derValue.getIA5String());
    }

    public URIName(URI uri, String str, DNSName dNSName) {
        this.uri = uri;
        this.host = str;
        this.hostDNS = dNSName;
    }
}
