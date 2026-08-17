package android.sun.security.x509;

import android.sun.security.util.DerOutputStream;
import android.sun.security.util.DerValue;
import java.io.IOException;
import p000.AbstractC1308pu;
import p000.ca0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class GeneralSubtree {
    private static final int MIN_DEFAULT = 0;
    private static final byte TAG_MAX = 1;
    private static final byte TAG_MIN = 0;
    private int maximum;
    private int minimum;
    private int myhash = -1;
    private GeneralName name;

    public GeneralSubtree(DerValue derValue) throws IOException {
        this.minimum = 0;
        this.maximum = -1;
        if (derValue.tag != 48) {
            ca0.m1178j("Invalid encoding for GeneralSubtree.");
            throw null;
        }
        this.name = new GeneralName(derValue.data.getDerValue(), true);
        while (derValue.data.available() != 0) {
            DerValue derValue2 = derValue.data.getDerValue();
            if (derValue2.isContextSpecific((byte) 0) && !derValue2.isConstructed()) {
                derValue2.resetTag((byte) 2);
                this.minimum = derValue2.getInteger();
            } else {
                if (!derValue2.isContextSpecific((byte) 1) || derValue2.isConstructed()) {
                    ca0.m1178j("Invalid encoding of GeneralSubtree.");
                    throw null;
                }
                derValue2.resetTag((byte) 2);
                this.maximum = derValue2.getInteger();
            }
        }
    }

    public void encode(DerOutputStream derOutputStream) throws IOException {
        DerOutputStream derOutputStream2 = new DerOutputStream();
        this.name.encode(derOutputStream2);
        if (this.minimum != 0) {
            DerOutputStream derOutputStream3 = new DerOutputStream();
            derOutputStream3.putInteger(this.minimum);
            derOutputStream2.writeImplicit(DerValue.createTag(DerValue.TAG_CONTEXT, false, (byte) 0), derOutputStream3);
        }
        if (this.maximum != -1) {
            DerOutputStream derOutputStream4 = new DerOutputStream();
            derOutputStream4.putInteger(this.maximum);
            derOutputStream2.writeImplicit(DerValue.createTag(DerValue.TAG_CONTEXT, false, (byte) 1), derOutputStream4);
        }
        derOutputStream.write((byte) 48, derOutputStream2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GeneralSubtree)) {
            return false;
        }
        GeneralSubtree generalSubtree = (GeneralSubtree) obj;
        GeneralName generalName = this.name;
        GeneralName generalName2 = generalSubtree.name;
        if (generalName == null) {
            if (generalName2 != null) {
                return false;
            }
        } else if (!generalName.equals(generalName2)) {
            return false;
        }
        return this.minimum == generalSubtree.minimum && this.maximum == generalSubtree.maximum;
    }

    public int getMaximum() {
        return this.maximum;
    }

    public int getMinimum() {
        return this.minimum;
    }

    public GeneralName getName() {
        return this.name;
    }

    public int hashCode() {
        if (this.myhash == -1) {
            this.myhash = 17;
            GeneralName generalName = this.name;
            if (generalName != null) {
                this.myhash = generalName.hashCode() + (17 * 37);
            }
            int i = this.minimum;
            if (i != 0) {
                this.myhash = (this.myhash * 37) + i;
            }
            int i2 = this.maximum;
            if (i2 != -1) {
                this.myhash = (this.myhash * 37) + i2;
            }
        }
        return this.myhash;
    }

    public String toString() {
        String string;
        StringBuilder sb = new StringBuilder("\n   GeneralSubtree: [\n    GeneralName: ");
        GeneralName generalName = this.name;
        sb.append(generalName == null ? "" : generalName.toString());
        sb.append("\n    Minimum: ");
        sb.append(this.minimum);
        String string2 = sb.toString();
        if (this.maximum == -1) {
            string = string2.concat("\t    Maximum: undefined");
        } else {
            StringBuilder sbM5346m = AbstractC1308pu.m5346m(string2, "\t    Maximum: ");
            sbM5346m.append(this.maximum);
            string = sbM5346m.toString();
        }
        return string.concat("    ]\n");
    }

    public GeneralSubtree(GeneralName generalName, int i, int i2) {
        this.name = generalName;
        this.minimum = i;
        this.maximum = i2;
    }
}
