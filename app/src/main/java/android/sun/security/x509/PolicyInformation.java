package android.sun.security.x509;

import android.sun.security.util.DerOutputStream;
import android.sun.security.util.DerValue;
import java.io.IOException;
import java.security.cert.PolicyQualifierInfo;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p000.ca0;
import p000.jd0;
import p000.l41;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class PolicyInformation {

    /* JADX INFO: renamed from: ID */
    public static final String f295ID = "id";
    public static final String NAME = "PolicyInformation";
    public static final String QUALIFIERS = "qualifiers";
    private CertificatePolicyId policyIdentifier;
    private Set<PolicyQualifierInfo> policyQualifiers;

    public PolicyInformation(DerValue derValue) throws IOException {
        if (derValue.tag != 48) {
            ca0.m1178j("Invalid encoding of PolicyInformation");
            throw null;
        }
        this.policyIdentifier = new CertificatePolicyId(derValue.data.getDerValue());
        if (derValue.data.available() == 0) {
            this.policyQualifiers = Collections.EMPTY_SET;
            return;
        }
        this.policyQualifiers = new LinkedHashSet();
        DerValue derValue2 = derValue.data.getDerValue();
        if (derValue2.tag != 48) {
            ca0.m1178j("Invalid encoding of PolicyInformation");
            throw null;
        }
        if (derValue2.data.available() == 0) {
            ca0.m1178j("No data available in policyQualifiers");
            throw null;
        }
        while (derValue2.data.available() != 0) {
            this.policyQualifiers.add(new PolicyQualifierInfo(derValue2.data.getDerValue().toByteArray()));
        }
    }

    public void delete(String str) throws IOException {
        if (str.equalsIgnoreCase(QUALIFIERS)) {
            this.policyQualifiers = Collections.EMPTY_SET;
        } else if (str.equalsIgnoreCase("id")) {
            ca0.m1178j("Attribute ID may not be deleted from PolicyInformation.");
        } else {
            ca0.m1178j(jd0.m3615m("Attribute name [", str, "] not recognized by PolicyInformation."));
        }
    }

    public void encode(DerOutputStream derOutputStream) throws IOException {
        DerOutputStream derOutputStream2 = new DerOutputStream();
        this.policyIdentifier.encode(derOutputStream2);
        if (!this.policyQualifiers.isEmpty()) {
            DerOutputStream derOutputStream3 = new DerOutputStream();
            Iterator<PolicyQualifierInfo> it = this.policyQualifiers.iterator();
            while (it.hasNext()) {
                derOutputStream3.write(it.next().getEncoded());
            }
            derOutputStream2.write((byte) 48, derOutputStream3);
        }
        derOutputStream.write((byte) 48, derOutputStream2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PolicyInformation)) {
            return false;
        }
        PolicyInformation policyInformation = (PolicyInformation) obj;
        if (this.policyIdentifier.equals(policyInformation.getPolicyIdentifier())) {
            return this.policyQualifiers.equals(policyInformation.getPolicyQualifiers());
        }
        return false;
    }

    public Object get(String str) throws IOException {
        if (str.equalsIgnoreCase("id")) {
            return this.policyIdentifier;
        }
        if (str.equalsIgnoreCase(QUALIFIERS)) {
            return this.policyQualifiers;
        }
        ca0.m1178j(jd0.m3615m("Attribute name [", str, "] not recognized by PolicyInformation."));
        return null;
    }

    public Enumeration<String> getElements() {
        AttributeNameEnumeration attributeNameEnumeration = new AttributeNameEnumeration();
        attributeNameEnumeration.addElement("id");
        attributeNameEnumeration.addElement(QUALIFIERS);
        return attributeNameEnumeration.elements();
    }

    public String getName() {
        return NAME;
    }

    public CertificatePolicyId getPolicyIdentifier() {
        return this.policyIdentifier;
    }

    public Set<PolicyQualifierInfo> getPolicyQualifiers() {
        return this.policyQualifiers;
    }

    public int hashCode() {
        return this.policyQualifiers.hashCode() + ((this.policyIdentifier.hashCode() + 37) * 37);
    }

    public void set(String str, Object obj) throws IOException {
        if (str.equalsIgnoreCase("id")) {
            if (obj instanceof CertificatePolicyId) {
                this.policyIdentifier = (CertificatePolicyId) obj;
                return;
            } else {
                ca0.m1178j("Attribute value must be instance of CertificatePolicyId.");
                return;
            }
        }
        if (!str.equalsIgnoreCase(QUALIFIERS)) {
            ca0.m1178j(jd0.m3615m("Attribute name [", str, "] not recognized by PolicyInformation"));
            return;
        }
        if (this.policyIdentifier == null) {
            ca0.m1178j("Attribute must have a CertificatePolicyIdentifier value before PolicyQualifierInfo can be set.");
            return;
        }
        if (!(obj instanceof Set)) {
            ca0.m1178j("Attribute value must be of type Set.");
            return;
        }
        Set<PolicyQualifierInfo> set = (Set) obj;
        Iterator<PolicyQualifierInfo> it = set.iterator();
        while (it.hasNext()) {
            if (!(it.next() instanceof PolicyQualifierInfo)) {
                ca0.m1178j("Attribute value must be aSet of PolicyQualifierInfo objects.");
                return;
            }
        }
        this.policyQualifiers = set;
    }

    public String toString() {
        return ("  [" + this.policyIdentifier.toString()).concat(this.policyQualifiers + "  ]\n");
    }

    public PolicyInformation(CertificatePolicyId certificatePolicyId, Set<PolicyQualifierInfo> set) {
        if (set != null) {
            this.policyQualifiers = new LinkedHashSet(set);
            this.policyIdentifier = certificatePolicyId;
        } else {
            l41.m4051t("policyQualifiers is null");
            throw null;
        }
    }
}
