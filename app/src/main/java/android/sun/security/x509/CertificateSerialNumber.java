package android.sun.security.x509;

import android.sun.security.util.DerInputStream;
import android.sun.security.util.DerOutputStream;
import android.sun.security.util.DerValue;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.Enumeration;
import p000.AbstractC1308pu;
import p000.ca0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class CertificateSerialNumber implements CertAttrSet<String> {
    public static final String IDENT = "x509.info.serialNumber";
    public static final String NAME = "serialNumber";
    public static final String NUMBER = "number";
    private SerialNumber serial;

    public CertificateSerialNumber(BigInteger bigInteger) {
        this.serial = new SerialNumber(bigInteger);
    }

    @Override // android.sun.security.x509.CertAttrSet
    public void delete(String str) throws IOException {
        if (str.equalsIgnoreCase("number")) {
            this.serial = null;
        } else {
            ca0.m1178j("Attribute name not recognized by CertAttrSet:CertificateSerialNumber.");
        }
    }

    @Override // android.sun.security.x509.CertAttrSet
    public void encode(OutputStream outputStream) throws IOException {
        DerOutputStream derOutputStream = new DerOutputStream();
        this.serial.encode(derOutputStream);
        outputStream.write(derOutputStream.toByteArray());
    }

    @Override // android.sun.security.x509.CertAttrSet
    public Object get(String str) throws IOException {
        if (str.equalsIgnoreCase("number")) {
            return this.serial;
        }
        ca0.m1178j("Attribute name not recognized by CertAttrSet:CertificateSerialNumber.");
        return null;
    }

    @Override // android.sun.security.x509.CertAttrSet
    public Enumeration<String> getElements() {
        return AbstractC1308pu.m5348o("number");
    }

    @Override // android.sun.security.x509.CertAttrSet
    public String getName() {
        return "serialNumber";
    }

    @Override // android.sun.security.x509.CertAttrSet
    public void set(String str, Object obj) throws IOException {
        if (!(obj instanceof SerialNumber)) {
            ca0.m1178j("Attribute must be of type SerialNumber.");
        } else if (str.equalsIgnoreCase("number")) {
            this.serial = (SerialNumber) obj;
        } else {
            ca0.m1178j("Attribute name not recognized by CertAttrSet:CertificateSerialNumber.");
        }
    }

    @Override // android.sun.security.x509.CertAttrSet
    public String toString() {
        SerialNumber serialNumber = this.serial;
        return serialNumber == null ? "" : serialNumber.toString();
    }

    public CertificateSerialNumber(int i) {
        this.serial = new SerialNumber(i);
    }

    public CertificateSerialNumber(DerInputStream derInputStream) {
        this.serial = new SerialNumber(derInputStream);
    }

    public CertificateSerialNumber(InputStream inputStream) {
        this.serial = new SerialNumber(inputStream);
    }

    public CertificateSerialNumber(DerValue derValue) {
        this.serial = new SerialNumber(derValue);
    }
}
