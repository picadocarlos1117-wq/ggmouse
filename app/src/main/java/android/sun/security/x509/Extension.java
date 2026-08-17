package android.sun.security.x509;

import android.sun.security.util.DerInputStream;
import android.sun.security.util.DerOutputStream;
import android.sun.security.util.DerValue;
import android.sun.security.util.ObjectIdentifier;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import p000.ca0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class Extension {
    private static final int hashMagic = 31;
    protected boolean critical;
    protected ObjectIdentifier extensionId;
    protected byte[] extensionValue;

    public Extension(DerValue derValue) throws IOException {
        this.extensionId = null;
        this.critical = false;
        this.extensionValue = null;
        DerInputStream derInputStream = derValue.toDerInputStream();
        this.extensionId = derInputStream.getOID();
        DerValue derValue2 = derInputStream.getDerValue();
        if (derValue2.tag == 1) {
            this.critical = derValue2.getBoolean();
            this.extensionValue = derInputStream.getDerValue().getOctetString();
        } else {
            this.critical = false;
            this.extensionValue = derValue2.getOctetString();
        }
    }

    public static Extension newExtension(ObjectIdentifier objectIdentifier, boolean z, byte[] bArr) {
        Extension extension = new Extension();
        extension.extensionId = objectIdentifier;
        extension.critical = z;
        extension.extensionValue = bArr;
        return extension;
    }

    public void encode(DerOutputStream derOutputStream) throws IOException {
        if (this.extensionId == null) {
            ca0.m1178j("Null OID to encode for the extension!");
            return;
        }
        if (this.extensionValue == null) {
            ca0.m1178j("No value to encode for the extension!");
            return;
        }
        DerOutputStream derOutputStream2 = new DerOutputStream();
        derOutputStream2.putOID(this.extensionId);
        boolean z = this.critical;
        if (z) {
            derOutputStream2.putBoolean(z);
        }
        derOutputStream2.putOctetString(this.extensionValue);
        derOutputStream.write((byte) 48, derOutputStream2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Extension)) {
            return false;
        }
        Extension extension = (Extension) obj;
        if (this.critical == extension.critical && this.extensionId.equals(extension.extensionId)) {
            return Arrays.equals(this.extensionValue, extension.extensionValue);
        }
        return false;
    }

    public ObjectIdentifier getExtensionId() {
        return this.extensionId;
    }

    public byte[] getExtensionValue() {
        return this.extensionValue;
    }

    public String getId() {
        return this.extensionId.toString();
    }

    public byte[] getValue() {
        return (byte[]) this.extensionValue.clone();
    }

    public int hashCode() {
        byte[] bArr = this.extensionValue;
        int i = 0;
        if (bArr != null) {
            int length = bArr.length;
            while (length > 0) {
                int i2 = length - 1;
                i += length * bArr[i2];
                length = i2;
            }
        }
        return ((this.extensionId.hashCode() + (i * 31)) * 31) + (this.critical ? 1231 : 1237);
    }

    public boolean isCritical() {
        return this.critical;
    }

    public String toString() {
        String str = "ObjectId: " + this.extensionId.toString();
        return this.critical ? str.concat(" Criticality=true\n") : str.concat(" Criticality=false\n");
    }

    public void encode(OutputStream outputStream) throws IOException {
        outputStream.getClass();
        DerOutputStream derOutputStream = new DerOutputStream();
        DerOutputStream derOutputStream2 = new DerOutputStream();
        derOutputStream.putOID(this.extensionId);
        boolean z = this.critical;
        if (z) {
            derOutputStream.putBoolean(z);
        }
        derOutputStream.putOctetString(this.extensionValue);
        derOutputStream2.write((byte) 48, derOutputStream);
        outputStream.write(derOutputStream2.toByteArray());
    }

    public Extension() {
        this.extensionId = null;
        this.critical = false;
        this.extensionValue = null;
    }

    public Extension(ObjectIdentifier objectIdentifier, boolean z, byte[] bArr) {
        this.extensionValue = null;
        this.extensionId = objectIdentifier;
        this.critical = z;
        this.extensionValue = new DerValue(bArr).getOctetString();
    }

    public Extension(Extension extension) {
        this.extensionId = null;
        this.critical = false;
        this.extensionValue = null;
        this.extensionId = extension.extensionId;
        this.critical = extension.critical;
        this.extensionValue = extension.extensionValue;
    }
}
