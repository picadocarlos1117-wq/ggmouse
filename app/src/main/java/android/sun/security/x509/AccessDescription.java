package android.sun.security.x509;

import android.sun.security.util.DerInputStream;
import android.sun.security.util.DerOutputStream;
import android.sun.security.util.DerValue;
import android.sun.security.util.ObjectIdentifier;
import java.io.IOException;
import p000.AbstractC1308pu;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class AccessDescription {
    private GeneralName accessLocation;
    private ObjectIdentifier accessMethod;
    private int myhash = -1;
    public static final ObjectIdentifier Ad_OCSP_Id = ObjectIdentifier.newInternal(new int[]{1, 3, 6, 1, 5, 5, 7, 48, 1});
    public static final ObjectIdentifier Ad_CAISSUERS_Id = ObjectIdentifier.newInternal(new int[]{1, 3, 6, 1, 5, 5, 7, 48, 2});
    public static final ObjectIdentifier Ad_TIMESTAMPING_Id = ObjectIdentifier.newInternal(new int[]{1, 3, 6, 1, 5, 5, 7, 48, 3});
    public static final ObjectIdentifier Ad_CAREPOSITORY_Id = ObjectIdentifier.newInternal(new int[]{1, 3, 6, 1, 5, 5, 7, 48, 5});

    public AccessDescription(DerValue derValue) {
        DerInputStream data = derValue.getData();
        this.accessMethod = data.getOID();
        this.accessLocation = new GeneralName(data.getDerValue());
    }

    public void encode(DerOutputStream derOutputStream) throws IOException {
        DerOutputStream derOutputStream2 = new DerOutputStream();
        derOutputStream2.putOID(this.accessMethod);
        this.accessLocation.encode(derOutputStream2);
        derOutputStream.write((byte) 48, derOutputStream2);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof AccessDescription)) {
            AccessDescription accessDescription = (AccessDescription) obj;
            if (this == accessDescription) {
                return true;
            }
            if (this.accessMethod.equals(accessDescription.getAccessMethod()) && this.accessLocation.equals(accessDescription.getAccessLocation())) {
                return true;
            }
        }
        return false;
    }

    public GeneralName getAccessLocation() {
        return this.accessLocation;
    }

    public ObjectIdentifier getAccessMethod() {
        return this.accessMethod;
    }

    public int hashCode() {
        if (this.myhash == -1) {
            this.myhash = this.accessLocation.hashCode() + this.accessMethod.hashCode();
        }
        return this.myhash;
    }

    public String toString() {
        String string;
        if (this.accessMethod.equals(Ad_CAISSUERS_Id)) {
            string = "caIssuers";
        } else if (this.accessMethod.equals(Ad_CAREPOSITORY_Id)) {
            string = "caRepository";
        } else if (this.accessMethod.equals(Ad_TIMESTAMPING_Id)) {
            string = "timeStamping";
        } else {
            string = this.accessMethod.equals(Ad_OCSP_Id) ? "ocsp" : this.accessMethod.toString();
        }
        StringBuilder sbM5347n = AbstractC1308pu.m5347n("\n   accessMethod: ", string, "\n   accessLocation: ");
        sbM5347n.append(this.accessLocation.toString());
        sbM5347n.append("\n");
        return sbM5347n.toString();
    }

    public AccessDescription(ObjectIdentifier objectIdentifier, GeneralName generalName) {
        this.accessMethod = objectIdentifier;
        this.accessLocation = generalName;
    }
}
