package android.sun.security.x509;

import android.sun.security.util.DerInputStream;
import android.sun.security.util.DerOutputStream;
import android.sun.security.util.DerValue;
import java.io.IOException;
import java.io.OutputStream;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.CertificateParsingException;
import java.util.Date;
import java.util.Enumeration;
import p000.AbstractC1308pu;
import p000.ca0;
import p000.lv1;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class PrivateKeyUsageExtension extends Extension implements CertAttrSet<String> {
    public static final String IDENT = "x509.info.extensions.PrivateKeyUsage";
    public static final String NAME = "PrivateKeyUsage";
    public static final String NOT_AFTER = "not_after";
    public static final String NOT_BEFORE = "not_before";
    private static final byte TAG_AFTER = 1;
    private static final byte TAG_BEFORE = 0;
    private Date notAfter;
    private Date notBefore;

    public PrivateKeyUsageExtension(Boolean bool, Object obj) throws CertificateParsingException, IOException {
        this.notBefore = null;
        this.notAfter = null;
        this.extensionId = PKIXExtensions.PrivateKeyUsage_Id;
        this.critical = bool.booleanValue();
        byte[] bArr = (byte[]) obj;
        this.extensionValue = bArr;
        for (DerValue derValue : new DerInputStream(bArr).getSequence(2)) {
            if (!derValue.isContextSpecific((byte) 0) || derValue.isConstructed()) {
                if (!derValue.isContextSpecific((byte) 1) || derValue.isConstructed()) {
                    ca0.m1178j("Invalid encoding of PrivateKeyUsageExtension");
                    throw null;
                }
                if (this.notAfter != null) {
                    throw new CertificateParsingException("Duplicate notAfter in PrivateKeyUsage.");
                }
                derValue.resetTag(DerValue.tag_GeneralizedTime);
                this.notAfter = new DerInputStream(derValue.toByteArray()).getGeneralizedTime();
            } else {
                if (this.notBefore != null) {
                    throw new CertificateParsingException("Duplicate notBefore in PrivateKeyUsage.");
                }
                derValue.resetTag(DerValue.tag_GeneralizedTime);
                this.notBefore = new DerInputStream(derValue.toByteArray()).getGeneralizedTime();
            }
        }
    }

    private void encodeThis() throws IOException {
        if (this.notBefore == null && this.notAfter == null) {
            this.extensionValue = null;
            return;
        }
        DerOutputStream derOutputStream = new DerOutputStream();
        DerOutputStream derOutputStream2 = new DerOutputStream();
        if (this.notBefore != null) {
            DerOutputStream derOutputStream3 = new DerOutputStream();
            derOutputStream3.putGeneralizedTime(this.notBefore);
            derOutputStream2.writeImplicit(DerValue.createTag(DerValue.TAG_CONTEXT, false, (byte) 0), derOutputStream3);
        }
        if (this.notAfter != null) {
            DerOutputStream derOutputStream4 = new DerOutputStream();
            derOutputStream4.putGeneralizedTime(this.notAfter);
            derOutputStream2.writeImplicit(DerValue.createTag(DerValue.TAG_CONTEXT, false, (byte) 1), derOutputStream4);
        }
        derOutputStream.write((byte) 48, derOutputStream2);
        this.extensionValue = derOutputStream.toByteArray();
    }

    @Override // android.sun.security.x509.CertAttrSet
    public void delete(String str) throws IOException, CertificateException {
        if (str.equalsIgnoreCase(NOT_BEFORE)) {
            this.notBefore = null;
        } else {
            if (!str.equalsIgnoreCase(NOT_AFTER)) {
                lv1.m4299k("Attribute name not recognized by CertAttrSet:PrivateKeyUsage.");
                return;
            }
            this.notAfter = null;
        }
        encodeThis();
    }

    @Override // android.sun.security.x509.Extension, android.sun.security.x509.CertAttrSet
    public void encode(OutputStream outputStream) throws IOException {
        DerOutputStream derOutputStream = new DerOutputStream();
        if (this.extensionValue == null) {
            this.extensionId = PKIXExtensions.PrivateKeyUsage_Id;
            this.critical = false;
            encodeThis();
        }
        super.encode(derOutputStream);
        outputStream.write(derOutputStream.toByteArray());
    }

    @Override // android.sun.security.x509.CertAttrSet
    public Object get(String str) throws CertificateException {
        if (str.equalsIgnoreCase(NOT_BEFORE)) {
            return new Date(this.notBefore.getTime());
        }
        if (str.equalsIgnoreCase(NOT_AFTER)) {
            return new Date(this.notAfter.getTime());
        }
        lv1.m4299k("Attribute name not recognized by CertAttrSet:PrivateKeyUsage.");
        return null;
    }

    @Override // android.sun.security.x509.CertAttrSet
    public Enumeration<String> getElements() {
        AttributeNameEnumeration attributeNameEnumeration = new AttributeNameEnumeration();
        attributeNameEnumeration.addElement(NOT_BEFORE);
        attributeNameEnumeration.addElement(NOT_AFTER);
        return attributeNameEnumeration.elements();
    }

    @Override // android.sun.security.x509.CertAttrSet
    public String getName() {
        return NAME;
    }

    @Override // android.sun.security.x509.CertAttrSet
    public void set(String str, Object obj) throws IOException, CertificateException {
        if (!(obj instanceof Date)) {
            lv1.m4299k("Attribute must be of type Date.");
            return;
        }
        if (str.equalsIgnoreCase(NOT_BEFORE)) {
            this.notBefore = (Date) obj;
        } else {
            if (!str.equalsIgnoreCase(NOT_AFTER)) {
                lv1.m4299k("Attribute name not recognized by CertAttrSet:PrivateKeyUsage.");
                return;
            }
            this.notAfter = (Date) obj;
        }
        encodeThis();
    }

    @Override // android.sun.security.x509.Extension, android.sun.security.x509.CertAttrSet
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("PrivateKeyUsage: [\n");
        String str2 = "";
        if (this.notBefore == null) {
            str = "";
        } else {
            str = "From: " + this.notBefore.toString() + ", ";
        }
        sb.append(str);
        if (this.notAfter != null) {
            str2 = "To: " + this.notAfter.toString();
        }
        return AbstractC1308pu.m5342i(sb, str2, "]\n");
    }

    public void valid(Date date) throws CertificateNotYetValidException, CertificateExpiredException {
        if (this.notBefore.after(date)) {
            throw new CertificateNotYetValidException("NotBefore: " + this.notBefore.toString());
        }
        if (this.notAfter.before(date)) {
            throw new CertificateExpiredException("NotAfter: " + this.notAfter.toString());
        }
    }

    public void valid() throws CertificateNotYetValidException, CertificateExpiredException {
        valid(new Date());
    }

    public PrivateKeyUsageExtension(Date date, Date date2) throws IOException {
        this.notBefore = date;
        this.notAfter = date2;
        this.extensionId = PKIXExtensions.PrivateKeyUsage_Id;
        this.critical = false;
        encodeThis();
    }
}
