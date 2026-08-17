package android.sun.security.x509;

import android.sun.security.util.DerOutputStream;
import android.sun.security.util.DerValue;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;
import java.util.Enumeration;
import p000.AbstractC1308pu;
import p000.ca0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class InvalidityDateExtension extends Extension implements CertAttrSet<String> {
    public static final String DATE = "date";
    public static final String NAME = "InvalidityDate";
    private Date date;

    public InvalidityDateExtension(Boolean bool, Object obj) {
        this.extensionId = PKIXExtensions.InvalidityDate_Id;
        this.critical = bool.booleanValue();
        byte[] bArr = (byte[]) obj;
        this.extensionValue = bArr;
        this.date = new DerValue(bArr).getGeneralizedTime();
    }

    private void encodeThis() throws IOException {
        if (this.date == null) {
            this.extensionValue = null;
            return;
        }
        DerOutputStream derOutputStream = new DerOutputStream();
        derOutputStream.putGeneralizedTime(this.date);
        this.extensionValue = derOutputStream.toByteArray();
    }

    public static InvalidityDateExtension toImpl(Extension extension) {
        return extension instanceof InvalidityDateExtension ? (InvalidityDateExtension) extension : new InvalidityDateExtension(Boolean.valueOf(extension.isCritical()), extension.getValue());
    }

    @Override // android.sun.security.x509.CertAttrSet
    public void delete(String str) throws IOException {
        if (!str.equalsIgnoreCase(DATE)) {
            ca0.m1178j("Name not supported by InvalidityDateExtension");
        } else {
            this.date = null;
            encodeThis();
        }
    }

    @Override // android.sun.security.x509.Extension, android.sun.security.x509.CertAttrSet
    public void encode(OutputStream outputStream) throws IOException {
        DerOutputStream derOutputStream = new DerOutputStream();
        if (this.extensionValue == null) {
            this.extensionId = PKIXExtensions.InvalidityDate_Id;
            this.critical = false;
            encodeThis();
        }
        super.encode(derOutputStream);
        outputStream.write(derOutputStream.toByteArray());
    }

    @Override // android.sun.security.x509.CertAttrSet
    public Object get(String str) throws IOException {
        if (!str.equalsIgnoreCase(DATE)) {
            ca0.m1178j("Name not supported by InvalidityDateExtension");
            return null;
        }
        if (this.date == null) {
            return null;
        }
        return new Date(this.date.getTime());
    }

    @Override // android.sun.security.x509.CertAttrSet
    public Enumeration<String> getElements() {
        return AbstractC1308pu.m5348o(DATE);
    }

    @Override // android.sun.security.x509.CertAttrSet
    public String getName() {
        return NAME;
    }

    @Override // android.sun.security.x509.CertAttrSet
    public void set(String str, Object obj) throws IOException {
        if (!(obj instanceof Date)) {
            ca0.m1178j("Attribute must be of type Date.");
        } else if (!str.equalsIgnoreCase(DATE)) {
            ca0.m1178j("Name not supported by InvalidityDateExtension");
        } else {
            this.date = (Date) obj;
            encodeThis();
        }
    }

    @Override // android.sun.security.x509.Extension, android.sun.security.x509.CertAttrSet
    public String toString() {
        return super.toString() + "    Invalidity Date: " + String.valueOf(this.date);
    }

    public InvalidityDateExtension(boolean z, Date date) throws IOException {
        this.extensionId = PKIXExtensions.InvalidityDate_Id;
        this.critical = z;
        this.date = date;
        encodeThis();
    }

    public InvalidityDateExtension(Date date) {
        this(false, date);
    }
}
