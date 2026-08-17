package android.sun.security.x509;

import android.sun.security.util.BitArray;
import android.sun.security.util.DerInputStream;
import android.sun.security.util.DerOutputStream;
import android.sun.security.util.DerValue;
import java.io.IOException;
import java.util.Arrays;
import p000.ca0;
import p000.f40;
import p000.jd0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class DistributionPoint {
    public static final int AA_COMPROMISE = 8;
    public static final int AFFILIATION_CHANGED = 3;
    public static final int CA_COMPROMISE = 2;
    public static final int CERTIFICATE_HOLD = 6;
    public static final int CESSATION_OF_OPERATION = 5;
    public static final int KEY_COMPROMISE = 1;
    public static final int PRIVILEGE_WITHDRAWN = 7;
    private static final String[] REASON_STRINGS = {null, "key compromise", "CA compromise", "affiliation changed", ReasonFlags.SUPERSEDED, "cessation of operation", "certificate hold", "privilege withdrawn", "AA compromise"};
    public static final int SUPERSEDED = 4;
    private static final byte TAG_DIST_PT = 0;
    private static final byte TAG_FULL_NAME = 0;
    private static final byte TAG_ISSUER = 2;
    private static final byte TAG_REASONS = 1;
    private static final byte TAG_REL_NAME = 1;
    private GeneralNames crlIssuer;
    private GeneralNames fullName;
    private volatile int hashCode;
    private boolean[] reasonFlags;
    private RDN relativeName;

    public DistributionPoint(DerValue derValue) throws IOException {
        if (derValue.tag != 48) {
            ca0.m1178j("Invalid encoding of DistributionPoint.");
            throw null;
        }
        while (true) {
            DerInputStream derInputStream = derValue.data;
            if (derInputStream == null || derInputStream.available() == 0) {
                break;
            }
            DerValue derValue2 = derValue.data.getDerValue();
            if (derValue2.isContextSpecific((byte) 0) && derValue2.isConstructed()) {
                if (this.fullName != null || this.relativeName != null) {
                    ca0.m1178j("Duplicate DistributionPointName in DistributionPoint.");
                    throw null;
                }
                DerValue derValue3 = derValue2.data.getDerValue();
                if (derValue3.isContextSpecific((byte) 0) && derValue3.isConstructed()) {
                    derValue3.resetTag((byte) 48);
                    this.fullName = new GeneralNames(derValue3);
                } else {
                    if (!derValue3.isContextSpecific((byte) 1) || !derValue3.isConstructed()) {
                        ca0.m1178j("Invalid DistributionPointName in DistributionPoint");
                        throw null;
                    }
                    derValue3.resetTag((byte) 49);
                    this.relativeName = new RDN(derValue3);
                }
            } else if (!derValue2.isContextSpecific((byte) 1) || derValue2.isConstructed()) {
                if (!derValue2.isContextSpecific((byte) 2) || !derValue2.isConstructed()) {
                    ca0.m1178j("Invalid encoding of DistributionPoint.");
                    throw null;
                }
                if (this.crlIssuer != null) {
                    ca0.m1178j("Duplicate CRLIssuer in DistributionPoint.");
                    throw null;
                }
                derValue2.resetTag((byte) 48);
                this.crlIssuer = new GeneralNames(derValue2);
            } else {
                if (this.reasonFlags != null) {
                    ca0.m1178j("Duplicate Reasons in DistributionPoint.");
                    throw null;
                }
                derValue2.resetTag((byte) 3);
                this.reasonFlags = derValue2.getUnalignedBitString().toBooleanArray();
            }
        }
        if (this.crlIssuer == null && this.fullName == null && this.relativeName == null) {
            ca0.m1178j("One of fullName, relativeName,  and crlIssuer has to be set");
            throw null;
        }
    }

    private static String reasonToString(int i) {
        if (i > 0) {
            String[] strArr = REASON_STRINGS;
            if (i < strArr.length) {
                return strArr[i];
            }
        }
        return jd0.m3609g(i, "Unknown reason ");
    }

    public void encode(DerOutputStream derOutputStream) throws IOException {
        DerOutputStream derOutputStream2 = new DerOutputStream();
        if (this.fullName != null || this.relativeName != null) {
            DerOutputStream derOutputStream3 = new DerOutputStream();
            if (this.fullName != null) {
                DerOutputStream derOutputStream4 = new DerOutputStream();
                this.fullName.encode(derOutputStream4);
                derOutputStream3.writeImplicit(DerValue.createTag(DerValue.TAG_CONTEXT, true, (byte) 0), derOutputStream4);
            } else if (this.relativeName != null) {
                DerOutputStream derOutputStream5 = new DerOutputStream();
                this.relativeName.encode(derOutputStream5);
                derOutputStream3.writeImplicit(DerValue.createTag(DerValue.TAG_CONTEXT, true, (byte) 1), derOutputStream5);
            }
            derOutputStream2.write(DerValue.createTag(DerValue.TAG_CONTEXT, true, (byte) 0), derOutputStream3);
        }
        if (this.reasonFlags != null) {
            DerOutputStream derOutputStream6 = new DerOutputStream();
            derOutputStream6.putTruncatedUnalignedBitString(new BitArray(this.reasonFlags));
            derOutputStream2.writeImplicit(DerValue.createTag(DerValue.TAG_CONTEXT, false, (byte) 1), derOutputStream6);
        }
        if (this.crlIssuer != null) {
            DerOutputStream derOutputStream7 = new DerOutputStream();
            this.crlIssuer.encode(derOutputStream7);
            derOutputStream2.writeImplicit(DerValue.createTag(DerValue.TAG_CONTEXT, true, (byte) 2), derOutputStream7);
        }
        derOutputStream.write((byte) 48, derOutputStream2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DistributionPoint)) {
            return false;
        }
        DistributionPoint distributionPoint = (DistributionPoint) obj;
        return equals(this.fullName, distributionPoint.fullName) && equals(this.relativeName, distributionPoint.relativeName) && equals(this.crlIssuer, distributionPoint.crlIssuer) && Arrays.equals(this.reasonFlags, distributionPoint.reasonFlags);
    }

    public GeneralNames getCRLIssuer() {
        return this.crlIssuer;
    }

    public GeneralNames getFullName() {
        return this.fullName;
    }

    public boolean[] getReasonFlags() {
        return this.reasonFlags;
    }

    public RDN getRelativeName() {
        return this.relativeName;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        GeneralNames generalNames = this.fullName;
        int iHashCode = generalNames != null ? 1 + generalNames.hashCode() : 1;
        RDN rdn = this.relativeName;
        if (rdn != null) {
            iHashCode += rdn.hashCode();
        }
        GeneralNames generalNames2 = this.crlIssuer;
        if (generalNames2 != null) {
            iHashCode += generalNames2.hashCode();
        }
        if (this.reasonFlags != null) {
            int i2 = 0;
            while (true) {
                boolean[] zArr = this.reasonFlags;
                if (i2 >= zArr.length) {
                    break;
                }
                if (zArr[i2]) {
                    iHashCode += i2;
                }
                i2++;
            }
        }
        this.hashCode = iHashCode;
        return iHashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.fullName != null) {
            sb.append("DistributionPoint:\n     " + this.fullName + "\n");
        }
        if (this.relativeName != null) {
            sb.append("DistributionPoint:\n     " + this.relativeName + "\n");
        }
        if (this.reasonFlags != null) {
            sb.append("   ReasonFlags:\n");
            int i = 0;
            while (true) {
                boolean[] zArr = this.reasonFlags;
                if (i >= zArr.length) {
                    break;
                }
                if (zArr[i]) {
                    sb.append("    " + reasonToString(i) + "\n");
                }
                i++;
            }
        }
        if (this.crlIssuer != null) {
            sb.append("   CRLIssuer:" + this.crlIssuer + "\n");
        }
        return sb.toString();
    }

    private static boolean equals(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public DistributionPoint(RDN rdn, boolean[] zArr, GeneralNames generalNames) {
        if (rdn == null && generalNames == null) {
            f40.m2713i("relativeName and crlIssuer may not both be null");
            throw null;
        }
        this.relativeName = rdn;
        this.reasonFlags = zArr;
        this.crlIssuer = generalNames;
    }

    public DistributionPoint(GeneralNames generalNames, boolean[] zArr, GeneralNames generalNames2) {
        if (generalNames == null && generalNames2 == null) {
            f40.m2713i("fullName and crlIssuer may not both be null");
            throw null;
        }
        this.fullName = generalNames;
        this.reasonFlags = zArr;
        this.crlIssuer = generalNames2;
    }
}
