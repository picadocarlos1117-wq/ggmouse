package android.sun.security.x509;

import android.sun.security.util.DerOutputStream;
import android.sun.security.util.DerValue;
import java.io.IOException;
import p000.ca0;
import p000.jd0;
import p000.l41;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class GeneralName {
    private GeneralNameInterface name;

    public GeneralName(DerValue derValue, boolean z) throws IOException {
        this.name = null;
        short s = (byte) (derValue.tag & 31);
        switch (s) {
            case 0:
                if (!derValue.isContextSpecific() || !derValue.isConstructed()) {
                    ca0.m1178j("Invalid encoding of Other-Name");
                    throw null;
                }
                derValue.resetTag((byte) 48);
                this.name = new OtherName(derValue);
                return;
            case 1:
                if (!derValue.isContextSpecific() || derValue.isConstructed()) {
                    ca0.m1178j("Invalid encoding of RFC822 name");
                    throw null;
                }
                derValue.resetTag(DerValue.tag_IA5String);
                this.name = new RFC822Name(derValue);
                return;
            case 2:
                if (!derValue.isContextSpecific() || derValue.isConstructed()) {
                    ca0.m1178j("Invalid encoding of DNS name");
                    throw null;
                }
                derValue.resetTag(DerValue.tag_IA5String);
                this.name = new DNSName(derValue);
                return;
            case 3:
            default:
                ca0.m1178j(jd0.m3610h(s, "Unrecognized GeneralName tag, (", ")"));
                throw null;
            case 4:
                if (derValue.isContextSpecific() && derValue.isConstructed()) {
                    this.name = new X500Name(derValue.getData());
                    return;
                } else {
                    ca0.m1178j("Invalid encoding of Directory name");
                    throw null;
                }
            case 5:
                if (!derValue.isContextSpecific() || !derValue.isConstructed()) {
                    ca0.m1178j("Invalid encoding of EDI name");
                    throw null;
                }
                derValue.resetTag((byte) 48);
                this.name = new EDIPartyName(derValue);
                return;
            case 6:
                if (!derValue.isContextSpecific() || derValue.isConstructed()) {
                    ca0.m1178j("Invalid encoding of URI");
                    throw null;
                }
                derValue.resetTag(DerValue.tag_IA5String);
                this.name = z ? URIName.nameConstraint(derValue) : new URIName(derValue);
                return;
            case 7:
                if (!derValue.isContextSpecific() || derValue.isConstructed()) {
                    ca0.m1178j("Invalid encoding of IP address");
                    throw null;
                }
                derValue.resetTag((byte) 4);
                this.name = new IPAddressName(derValue);
                return;
            case 8:
                if (!derValue.isContextSpecific() || derValue.isConstructed()) {
                    ca0.m1178j("Invalid encoding of OID name");
                    throw null;
                }
                derValue.resetTag((byte) 6);
                this.name = new OIDName(derValue);
                return;
        }
    }

    public void encode(DerOutputStream derOutputStream) {
        DerOutputStream derOutputStream2 = new DerOutputStream();
        this.name.encode(derOutputStream2);
        int type = this.name.getType();
        if (type == 0 || type == 3 || type == 5) {
            derOutputStream.writeImplicit(DerValue.createTag(DerValue.TAG_CONTEXT, true, (byte) type), derOutputStream2);
        } else if (type == 4) {
            derOutputStream.write(DerValue.createTag(DerValue.TAG_CONTEXT, true, (byte) type), derOutputStream2);
        } else {
            derOutputStream.writeImplicit(DerValue.createTag(DerValue.TAG_CONTEXT, false, (byte) type), derOutputStream2);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GeneralName)) {
            return false;
        }
        try {
            return this.name.constrains(((GeneralName) obj).name) == 0;
        } catch (UnsupportedOperationException unused) {
        }
    }

    public GeneralNameInterface getName() {
        return this.name;
    }

    public int getType() {
        return this.name.getType();
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public String toString() {
        return this.name.toString();
    }

    public GeneralName(DerValue derValue) {
        this(derValue, false);
    }

    public GeneralName(GeneralNameInterface generalNameInterface) {
        this.name = null;
        if (generalNameInterface != null) {
            this.name = generalNameInterface;
        } else {
            l41.m4051t("GeneralName must not be null");
            throw null;
        }
    }
}
