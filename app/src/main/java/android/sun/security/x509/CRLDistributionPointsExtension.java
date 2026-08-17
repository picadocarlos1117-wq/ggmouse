package android.sun.security.x509;

import android.sun.security.util.DerOutputStream;
import android.sun.security.util.DerValue;
import android.sun.security.util.ObjectIdentifier;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import p000.AbstractC1308pu;
import p000.ca0;
import p000.jd0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class CRLDistributionPointsExtension extends Extension implements CertAttrSet<String> {
    public static final String IDENT = "x509.info.extensions.CRLDistributionPoints";
    public static final String NAME = "CRLDistributionPoints";
    public static final String POINTS = "points";
    private List<DistributionPoint> distributionPoints;
    private String extensionName;

    public CRLDistributionPointsExtension(ObjectIdentifier objectIdentifier, Boolean bool, Object obj, String str) throws IOException {
        this.extensionId = objectIdentifier;
        this.critical = bool.booleanValue();
        if (!(obj instanceof byte[])) {
            ca0.m1178j("Illegal argument type");
            throw null;
        }
        byte[] bArr = (byte[]) obj;
        this.extensionValue = bArr;
        DerValue derValue = new DerValue(bArr);
        if (derValue.tag != 48) {
            ca0.m1178j(jd0.m3615m("Invalid encoding for ", str, " extension."));
            throw null;
        }
        this.distributionPoints = new ArrayList();
        while (derValue.data.available() != 0) {
            this.distributionPoints.add(new DistributionPoint(derValue.data.getDerValue()));
        }
        this.extensionName = str;
    }

    private void encodeThis() throws IOException {
        if (this.distributionPoints.isEmpty()) {
            this.extensionValue = null;
            return;
        }
        DerOutputStream derOutputStream = new DerOutputStream();
        Iterator<DistributionPoint> it = this.distributionPoints.iterator();
        while (it.hasNext()) {
            it.next().encode(derOutputStream);
        }
        DerOutputStream derOutputStream2 = new DerOutputStream();
        derOutputStream2.write((byte) 48, derOutputStream);
        this.extensionValue = derOutputStream2.toByteArray();
    }

    @Override // android.sun.security.x509.CertAttrSet
    public void delete(String str) throws IOException {
        if (!str.equalsIgnoreCase(POINTS)) {
            ca0.m1178j(AbstractC1308pu.m5342i(AbstractC1308pu.m5347n("Attribute name [", str, "] not recognized by CertAttrSet:"), this.extensionName, "."));
        } else {
            this.distributionPoints = new ArrayList();
            encodeThis();
        }
    }

    public void encode(OutputStream outputStream, ObjectIdentifier objectIdentifier, boolean z) throws IOException {
        DerOutputStream derOutputStream = new DerOutputStream();
        if (this.extensionValue == null) {
            this.extensionId = objectIdentifier;
            this.critical = z;
            encodeThis();
        }
        super.encode(derOutputStream);
        outputStream.write(derOutputStream.toByteArray());
    }

    @Override // android.sun.security.x509.CertAttrSet
    public Object get(String str) throws IOException {
        if (str.equalsIgnoreCase(POINTS)) {
            return this.distributionPoints;
        }
        ca0.m1178j(AbstractC1308pu.m5342i(AbstractC1308pu.m5347n("Attribute name [", str, "] not recognized by CertAttrSet:"), this.extensionName, "."));
        return null;
    }

    @Override // android.sun.security.x509.CertAttrSet
    public Enumeration<String> getElements() {
        return AbstractC1308pu.m5348o(POINTS);
    }

    @Override // android.sun.security.x509.CertAttrSet
    public String getName() {
        return this.extensionName;
    }

    @Override // android.sun.security.x509.CertAttrSet
    public void set(String str, Object obj) throws IOException {
        if (!str.equalsIgnoreCase(POINTS)) {
            ca0.m1178j(AbstractC1308pu.m5342i(AbstractC1308pu.m5347n("Attribute name [", str, "] not recognized by CertAttrSet:"), this.extensionName, "."));
        } else if (!(obj instanceof List)) {
            ca0.m1178j("Attribute value should be of type List.");
        } else {
            this.distributionPoints = (List) obj;
            encodeThis();
        }
    }

    @Override // android.sun.security.x509.Extension, android.sun.security.x509.CertAttrSet
    public String toString() {
        return super.toString() + this.extensionName + " [\n  " + this.distributionPoints + "]\n";
    }

    @Override // android.sun.security.x509.Extension, android.sun.security.x509.CertAttrSet
    public void encode(OutputStream outputStream) throws IOException {
        encode(outputStream, PKIXExtensions.CRLDistributionPoints_Id, false);
    }

    public CRLDistributionPointsExtension(boolean z, List<DistributionPoint> list) {
        this(PKIXExtensions.CRLDistributionPoints_Id, z, list, NAME);
    }

    public CRLDistributionPointsExtension(ObjectIdentifier objectIdentifier, boolean z, List<DistributionPoint> list, String str) throws IOException {
        this.extensionId = objectIdentifier;
        this.critical = z;
        this.distributionPoints = list;
        encodeThis();
        this.extensionName = str;
    }

    public CRLDistributionPointsExtension(Boolean bool, Object obj) {
        this(PKIXExtensions.CRLDistributionPoints_Id, bool, obj, NAME);
    }

    public CRLDistributionPointsExtension(List<DistributionPoint> list) {
        this(false, list);
    }
}
