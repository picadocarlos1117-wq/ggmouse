package android.sun.security.x509;

import android.sun.security.util.DerOutputStream;
import android.sun.security.util.DerValue;
import java.io.IOException;
import p000.ca0;
import p000.f40;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class DistributionPointName {
    private static final byte TAG_FULL_NAME = 0;
    private static final byte TAG_RELATIVE_NAME = 1;
    private GeneralNames fullName;
    private volatile int hashCode;
    private RDN relativeName;

    public DistributionPointName(DerValue derValue) throws IOException {
        this.fullName = null;
        this.relativeName = null;
        if (derValue.isContextSpecific((byte) 0) && derValue.isConstructed()) {
            derValue.resetTag((byte) 48);
            this.fullName = new GeneralNames(derValue);
        } else {
            if (!derValue.isContextSpecific((byte) 1) || !derValue.isConstructed()) {
                ca0.m1178j("Invalid encoding for DistributionPointName");
                throw null;
            }
            derValue.resetTag((byte) 49);
            this.relativeName = new RDN(derValue);
        }
    }

    public void encode(DerOutputStream derOutputStream) throws IOException {
        DerOutputStream derOutputStream2 = new DerOutputStream();
        GeneralNames generalNames = this.fullName;
        if (generalNames != null) {
            generalNames.encode(derOutputStream2);
            derOutputStream.writeImplicit(DerValue.createTag(DerValue.TAG_CONTEXT, true, (byte) 0), derOutputStream2);
        } else {
            this.relativeName.encode(derOutputStream2);
            derOutputStream.writeImplicit(DerValue.createTag(DerValue.TAG_CONTEXT, true, (byte) 1), derOutputStream2);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DistributionPointName)) {
            return false;
        }
        DistributionPointName distributionPointName = (DistributionPointName) obj;
        return equals(this.fullName, distributionPointName.fullName) && equals(this.relativeName, distributionPointName.relativeName);
    }

    public GeneralNames getFullName() {
        return this.fullName;
    }

    public RDN getRelativeName() {
        return this.relativeName;
    }

    public int hashCode() {
        int iHashCode = this.hashCode;
        if (iHashCode == 0) {
            GeneralNames generalNames = this.fullName;
            iHashCode = (generalNames != null ? generalNames.hashCode() : this.relativeName.hashCode()) + 1;
            this.hashCode = iHashCode;
        }
        return iHashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.fullName != null) {
            sb.append("DistributionPointName:\n     " + this.fullName + "\n");
        } else {
            sb.append("DistributionPointName:\n     " + this.relativeName + "\n");
        }
        return sb.toString();
    }

    private static boolean equals(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public DistributionPointName(RDN rdn) {
        this.fullName = null;
        this.relativeName = null;
        if (rdn != null) {
            this.relativeName = rdn;
        } else {
            f40.m2713i("relativeName must not be null");
            throw null;
        }
    }

    public DistributionPointName(GeneralNames generalNames) {
        this.fullName = null;
        this.relativeName = null;
        if (generalNames != null) {
            this.fullName = generalNames;
        } else {
            f40.m2713i("fullName must not be null");
            throw null;
        }
    }
}
