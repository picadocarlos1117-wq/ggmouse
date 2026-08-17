package android.sun.security.x509;

import android.sun.security.util.DerOutputStream;
import android.sun.security.util.DerValue;
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
public class CertificatePoliciesExtension extends Extension implements CertAttrSet<String> {
    public static final String IDENT = "x509.info.extensions.CertificatePolicies";
    public static final String NAME = "CertificatePolicies";
    public static final String POLICIES = "policies";
    private List<PolicyInformation> certPolicies;

    public CertificatePoliciesExtension(Boolean bool, Object obj) throws IOException {
        this.extensionId = PKIXExtensions.CertificatePolicies_Id;
        this.critical = bool.booleanValue();
        byte[] bArr = (byte[]) obj;
        this.extensionValue = bArr;
        DerValue derValue = new DerValue(bArr);
        if (derValue.tag != 48) {
            ca0.m1178j("Invalid encoding for CertificatePoliciesExtension.");
            throw null;
        }
        this.certPolicies = new ArrayList();
        while (derValue.data.available() != 0) {
            this.certPolicies.add(new PolicyInformation(derValue.data.getDerValue()));
        }
    }

    private void encodeThis() throws IOException {
        List<PolicyInformation> list = this.certPolicies;
        if (list == null || list.isEmpty()) {
            this.extensionValue = null;
            return;
        }
        DerOutputStream derOutputStream = new DerOutputStream();
        DerOutputStream derOutputStream2 = new DerOutputStream();
        Iterator<PolicyInformation> it = this.certPolicies.iterator();
        while (it.hasNext()) {
            it.next().encode(derOutputStream2);
        }
        derOutputStream.write((byte) 48, derOutputStream2);
        this.extensionValue = derOutputStream.toByteArray();
    }

    @Override // android.sun.security.x509.CertAttrSet
    public void delete(String str) throws IOException {
        if (!str.equalsIgnoreCase(POLICIES)) {
            ca0.m1178j(jd0.m3615m("Attribute name [", str, "] not recognized by CertAttrSet:CertificatePoliciesExtension."));
        } else {
            this.certPolicies = null;
            encodeThis();
        }
    }

    @Override // android.sun.security.x509.Extension, android.sun.security.x509.CertAttrSet
    public void encode(OutputStream outputStream) throws IOException {
        DerOutputStream derOutputStream = new DerOutputStream();
        if (this.extensionValue == null) {
            this.extensionId = PKIXExtensions.CertificatePolicies_Id;
            this.critical = false;
            encodeThis();
        }
        super.encode(derOutputStream);
        outputStream.write(derOutputStream.toByteArray());
    }

    @Override // android.sun.security.x509.CertAttrSet
    public Object get(String str) throws IOException {
        if (str.equalsIgnoreCase(POLICIES)) {
            return this.certPolicies;
        }
        ca0.m1178j(jd0.m3615m("Attribute name [", str, "] not recognized by CertAttrSet:CertificatePoliciesExtension."));
        return null;
    }

    @Override // android.sun.security.x509.CertAttrSet
    public Enumeration<String> getElements() {
        return AbstractC1308pu.m5348o(POLICIES);
    }

    @Override // android.sun.security.x509.CertAttrSet
    public String getName() {
        return NAME;
    }

    @Override // android.sun.security.x509.CertAttrSet
    public void set(String str, Object obj) throws IOException {
        if (!str.equalsIgnoreCase(POLICIES)) {
            ca0.m1178j(jd0.m3615m("Attribute name [", str, "] not recognized by CertAttrSet:CertificatePoliciesExtension."));
        } else if (!(obj instanceof List)) {
            ca0.m1178j("Attribute value should be of type List.");
        } else {
            this.certPolicies = (List) obj;
            encodeThis();
        }
    }

    @Override // android.sun.security.x509.Extension, android.sun.security.x509.CertAttrSet
    public String toString() {
        if (this.certPolicies == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("CertificatePolicies [\n");
        Iterator<PolicyInformation> it = this.certPolicies.iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
        }
        sb.append("]\n");
        return sb.toString();
    }

    public CertificatePoliciesExtension(Boolean bool, List<PolicyInformation> list) throws IOException {
        this.certPolicies = list;
        this.extensionId = PKIXExtensions.CertificatePolicies_Id;
        this.critical = bool.booleanValue();
        encodeThis();
    }

    public CertificatePoliciesExtension(List<PolicyInformation> list) {
        this(Boolean.FALSE, list);
    }
}
