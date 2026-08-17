package android.sun.security.x509;

import android.sun.security.util.DerInputStream;
import android.sun.security.util.DerOutputStream;
import android.sun.security.util.DerValue;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import p000.AbstractC1308pu;
import p000.ca0;
import p000.jd0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class CertificateVersion implements CertAttrSet<String> {
    public static final String IDENT = "x509.info.version";
    public static final String NAME = "version";

    /* JADX INFO: renamed from: V1 */
    public static final int f292V1 = 0;

    /* JADX INFO: renamed from: V2 */
    public static final int f293V2 = 1;

    /* JADX INFO: renamed from: V3 */
    public static final int f294V3 = 2;
    public static final String VERSION = "number";
    int version;

    public CertificateVersion(int i) throws IOException {
        this.version = 0;
        if (i == 0 || i == 1 || i == 2) {
            this.version = i;
        } else {
            ca0.m1178j(jd0.m3610h(i, "X.509 Certificate version ", " not supported.\n"));
            throw null;
        }
    }

    private void construct(DerValue derValue) throws IOException {
        if (derValue.isConstructed() && derValue.isContextSpecific()) {
            DerValue derValue2 = derValue.data.getDerValue();
            this.version = derValue2.getInteger();
            if (derValue2.data.available() == 0) {
                return;
            }
            ca0.m1178j("X.509 version, bad format");
        }
    }

    private int getVersion() {
        return this.version;
    }

    public int compare(int i) {
        return this.version - i;
    }

    @Override // android.sun.security.x509.CertAttrSet
    public void delete(String str) throws IOException {
        if (str.equalsIgnoreCase("number")) {
            this.version = 0;
        } else {
            ca0.m1178j("Attribute name not recognized by CertAttrSet: CertificateVersion.");
        }
    }

    @Override // android.sun.security.x509.CertAttrSet
    public void encode(OutputStream outputStream) throws IOException {
        if (this.version == 0) {
            return;
        }
        DerOutputStream derOutputStream = new DerOutputStream();
        derOutputStream.putInteger(this.version);
        DerOutputStream derOutputStream2 = new DerOutputStream();
        derOutputStream2.write(DerValue.createTag(DerValue.TAG_CONTEXT, true, (byte) 0), derOutputStream);
        outputStream.write(derOutputStream2.toByteArray());
    }

    @Override // android.sun.security.x509.CertAttrSet
    public Object get(String str) throws IOException {
        if (str.equalsIgnoreCase("number")) {
            return new Integer(getVersion());
        }
        ca0.m1178j("Attribute name not recognized by CertAttrSet: CertificateVersion.");
        return null;
    }

    @Override // android.sun.security.x509.CertAttrSet
    public Enumeration<String> getElements() {
        return AbstractC1308pu.m5348o("number");
    }

    @Override // android.sun.security.x509.CertAttrSet
    public String getName() {
        return "version";
    }

    @Override // android.sun.security.x509.CertAttrSet
    public void set(String str, Object obj) throws IOException {
        if (!(obj instanceof Integer)) {
            ca0.m1178j("Attribute must be of type Integer.");
        } else if (str.equalsIgnoreCase("number")) {
            this.version = ((Integer) obj).intValue();
        } else {
            ca0.m1178j("Attribute name not recognized by CertAttrSet: CertificateVersion.");
        }
    }

    @Override // android.sun.security.x509.CertAttrSet
    public String toString() {
        return "Version: V" + (this.version + 1);
    }

    public CertificateVersion() {
        this.version = 0;
    }

    public CertificateVersion(DerInputStream derInputStream) throws IOException {
        this.version = 0;
        construct(derInputStream.getDerValue());
    }

    public CertificateVersion(InputStream inputStream) throws IOException {
        this.version = 0;
        construct(new DerValue(inputStream));
    }

    public CertificateVersion(DerValue derValue) throws IOException {
        this.version = 0;
        construct(derValue);
    }
}
