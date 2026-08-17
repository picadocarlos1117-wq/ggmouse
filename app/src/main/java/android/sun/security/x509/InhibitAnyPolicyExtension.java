package android.sun.security.x509;

import android.sun.security.util.Debug;
import android.sun.security.util.DerOutputStream;
import android.sun.security.util.DerValue;
import android.sun.security.util.ObjectIdentifier;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Enumeration;
import p000.AbstractC1308pu;
import p000.ca0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class InhibitAnyPolicyExtension extends Extension implements CertAttrSet<String> {
    public static ObjectIdentifier AnyPolicy_Id = null;
    public static final String IDENT = "x509.info.extensions.InhibitAnyPolicy";
    public static final String NAME = "InhibitAnyPolicy";
    public static final String SKIP_CERTS = "skip_certs";
    private static final Debug debug = Debug.getInstance("certpath");
    private int skipCerts;

    static {
        try {
            AnyPolicy_Id = new ObjectIdentifier("2.5.29.32.0");
        } catch (IOException unused) {
        }
    }

    public InhibitAnyPolicyExtension(Boolean bool, Object obj) throws IOException {
        this.skipCerts = Integer.MAX_VALUE;
        this.extensionId = PKIXExtensions.InhibitAnyPolicy_Id;
        if (!bool.booleanValue()) {
            ca0.m1178j("Criticality cannot be false for InhibitAnyPolicy");
            throw null;
        }
        this.critical = bool.booleanValue();
        byte[] bArr = (byte[]) obj;
        this.extensionValue = bArr;
        DerValue derValue = new DerValue(bArr);
        if (derValue.tag != 2) {
            ca0.m1178j("Invalid encoding of InhibitAnyPolicy: data not integer");
            throw null;
        }
        if (derValue.data == null) {
            ca0.m1178j("Invalid encoding of InhibitAnyPolicy: null data");
            throw null;
        }
        int integer = derValue.getInteger();
        if (integer < -1) {
            ca0.m1178j("Invalid value for skipCerts");
            throw null;
        }
        if (integer == -1) {
            this.skipCerts = Integer.MAX_VALUE;
        } else {
            this.skipCerts = integer;
        }
    }

    private void encodeThis() throws IOException {
        DerOutputStream derOutputStream = new DerOutputStream();
        derOutputStream.putInteger(this.skipCerts);
        this.extensionValue = derOutputStream.toByteArray();
    }

    @Override // android.sun.security.x509.CertAttrSet
    public void delete(String str) throws IOException {
        if (!str.equalsIgnoreCase(SKIP_CERTS)) {
            throw new IOException("Attribute name not recognized by CertAttrSet:InhibitAnyPolicy.");
        }
        throw new IOException("Attribute skip_certs may not be deleted.");
    }

    @Override // android.sun.security.x509.Extension, android.sun.security.x509.CertAttrSet
    public void encode(OutputStream outputStream) throws IOException {
        DerOutputStream derOutputStream = new DerOutputStream();
        if (this.extensionValue == null) {
            this.extensionId = PKIXExtensions.InhibitAnyPolicy_Id;
            this.critical = true;
            encodeThis();
        }
        super.encode(derOutputStream);
        outputStream.write(derOutputStream.toByteArray());
    }

    @Override // android.sun.security.x509.CertAttrSet
    public Object get(String str) throws IOException {
        if (str.equalsIgnoreCase(SKIP_CERTS)) {
            return new Integer(this.skipCerts);
        }
        ca0.m1178j("Attribute name not recognized by CertAttrSet:InhibitAnyPolicy.");
        return null;
    }

    @Override // android.sun.security.x509.CertAttrSet
    public Enumeration<String> getElements() {
        return AbstractC1308pu.m5348o(SKIP_CERTS);
    }

    @Override // android.sun.security.x509.CertAttrSet
    public String getName() {
        return NAME;
    }

    @Override // android.sun.security.x509.CertAttrSet
    public void set(String str, Object obj) throws IOException {
        if (!str.equalsIgnoreCase(SKIP_CERTS)) {
            ca0.m1178j("Attribute name not recognized by CertAttrSet:InhibitAnyPolicy.");
            return;
        }
        if (!(obj instanceof Integer)) {
            ca0.m1178j("Attribute value should be of type Integer.");
            return;
        }
        int iIntValue = ((Integer) obj).intValue();
        if (iIntValue < -1) {
            ca0.m1178j("Invalid value for skipCerts");
            return;
        }
        if (iIntValue == -1) {
            this.skipCerts = Integer.MAX_VALUE;
        } else {
            this.skipCerts = iIntValue;
        }
        encodeThis();
    }

    @Override // android.sun.security.x509.Extension, android.sun.security.x509.CertAttrSet
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("InhibitAnyPolicy: ");
        return AbstractC1308pu.m5341h(sb, this.skipCerts, "\n");
    }

    public InhibitAnyPolicyExtension(int i) throws IOException {
        this.skipCerts = Integer.MAX_VALUE;
        if (i >= -1) {
            if (i == -1) {
                this.skipCerts = Integer.MAX_VALUE;
            } else {
                this.skipCerts = i;
            }
            this.extensionId = PKIXExtensions.InhibitAnyPolicy_Id;
            this.critical = true;
            encodeThis();
            return;
        }
        ca0.m1178j("Invalid value for skipCerts");
        throw null;
    }
}
