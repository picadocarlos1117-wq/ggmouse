package android.sun.security.x509;

import android.sun.security.util.Debug;
import android.sun.security.util.DerOutputStream;
import android.sun.security.util.DerValue;
import android.sun.security.util.ObjectIdentifier;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.Enumeration;
import p000.AbstractC1308pu;
import p000.ca0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class CRLNumberExtension extends Extension implements CertAttrSet<String> {
    private static final String LABEL = "CRL Number";
    public static final String NAME = "CRLNumber";
    public static final String NUMBER = "value";
    private BigInteger crlNumber;
    private String extensionLabel;
    private String extensionName;

    public CRLNumberExtension(ObjectIdentifier objectIdentifier, Boolean bool, Object obj, String str, String str2) {
        this.crlNumber = null;
        this.extensionId = objectIdentifier;
        this.critical = bool.booleanValue();
        byte[] bArr = (byte[]) obj;
        this.extensionValue = bArr;
        this.crlNumber = new DerValue(bArr).getBigInteger();
        this.extensionName = str;
        this.extensionLabel = str2;
    }

    private void encodeThis() throws IOException {
        if (this.crlNumber == null) {
            this.extensionValue = null;
            return;
        }
        DerOutputStream derOutputStream = new DerOutputStream();
        derOutputStream.putInteger(this.crlNumber);
        this.extensionValue = derOutputStream.toByteArray();
    }

    @Override // android.sun.security.x509.CertAttrSet
    public void delete(String str) throws IOException {
        if (!str.equalsIgnoreCase("value")) {
            ca0.m1178j(AbstractC1308pu.m5342i(new StringBuilder("Attribute name not recognized by CertAttrSet:"), this.extensionName, "."));
        } else {
            this.crlNumber = null;
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
        if (!str.equalsIgnoreCase("value")) {
            ca0.m1178j(AbstractC1308pu.m5342i(new StringBuilder("Attribute name not recognized by CertAttrSet:"), this.extensionName, "."));
            return null;
        }
        BigInteger bigInteger = this.crlNumber;
        if (bigInteger == null) {
            return null;
        }
        return bigInteger;
    }

    @Override // android.sun.security.x509.CertAttrSet
    public Enumeration<String> getElements() {
        return AbstractC1308pu.m5348o("value");
    }

    @Override // android.sun.security.x509.CertAttrSet
    public String getName() {
        return this.extensionName;
    }

    @Override // android.sun.security.x509.CertAttrSet
    public void set(String str, Object obj) throws IOException {
        if (!str.equalsIgnoreCase("value")) {
            ca0.m1178j(AbstractC1308pu.m5342i(new StringBuilder("Attribute name not recognized by CertAttrSet:"), this.extensionName, "."));
        } else if (!(obj instanceof BigInteger)) {
            ca0.m1178j("Attribute must be of type BigInteger.");
        } else {
            this.crlNumber = (BigInteger) obj;
            encodeThis();
        }
    }

    @Override // android.sun.security.x509.Extension, android.sun.security.x509.CertAttrSet
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(this.extensionLabel);
        sb.append(": ");
        BigInteger bigInteger = this.crlNumber;
        return AbstractC1308pu.m5342i(sb, bigInteger == null ? "" : Debug.toHexString(bigInteger), "\n");
    }

    @Override // android.sun.security.x509.Extension, android.sun.security.x509.CertAttrSet
    public void encode(OutputStream outputStream) throws IOException {
        new DerOutputStream();
        encode(outputStream, PKIXExtensions.CRLNumber_Id, true);
    }

    public CRLNumberExtension(BigInteger bigInteger) {
        this(PKIXExtensions.CRLNumber_Id, false, bigInteger, NAME, LABEL);
    }

    public CRLNumberExtension(ObjectIdentifier objectIdentifier, boolean z, BigInteger bigInteger, String str, String str2) throws IOException {
        this.extensionId = objectIdentifier;
        this.critical = z;
        this.crlNumber = bigInteger;
        this.extensionName = str;
        this.extensionLabel = str2;
        encodeThis();
    }

    public CRLNumberExtension(Boolean bool, Object obj) {
        this(PKIXExtensions.CRLNumber_Id, bool, obj, NAME, LABEL);
    }

    public CRLNumberExtension(int i) {
        this(PKIXExtensions.CRLNumber_Id, false, BigInteger.valueOf(i), NAME, LABEL);
    }
}
