package android.sun.security.x509;

import android.sun.security.util.DerInputStream;
import android.sun.security.util.DerOutputStream;
import android.sun.security.util.DerValue;
import java.io.IOException;
import p000.AbstractC1308pu;
import p000.C0694gy;
import p000.ca0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class EDIPartyName implements GeneralNameInterface {
    private static final byte TAG_ASSIGNER = 0;
    private static final byte TAG_PARTYNAME = 1;
    private String assigner;
    private int myhash;
    private String party;

    public EDIPartyName(DerValue derValue) throws IOException {
        this.assigner = null;
        this.party = null;
        this.myhash = -1;
        DerValue[] sequence = new DerInputStream(derValue.toByteArray()).getSequence(2);
        int length = sequence.length;
        if (length < 1 || length > 2) {
            ca0.m1178j("Invalid encoding of EDIPartyName");
            throw null;
        }
        for (int i = 0; i < length; i++) {
            DerValue derValue2 = sequence[i];
            if (derValue2.isContextSpecific((byte) 0) && !derValue2.isConstructed()) {
                if (this.assigner != null) {
                    ca0.m1178j("Duplicate nameAssigner found in EDIPartyName");
                    throw null;
                }
                derValue2 = derValue2.data.getDerValue();
                this.assigner = derValue2.getAsString();
            }
            if (derValue2.isContextSpecific((byte) 1) && !derValue2.isConstructed()) {
                if (this.party != null) {
                    ca0.m1178j("Duplicate partyName found in EDIPartyName");
                    throw null;
                }
                this.party = derValue2.data.getDerValue().getAsString();
            }
        }
    }

    @Override // android.sun.security.x509.GeneralNameInterface
    public int constrains(GeneralNameInterface generalNameInterface) {
        if (generalNameInterface == null || generalNameInterface.getType() != 5) {
            return -1;
        }
        C0694gy.m3079e("Narrowing, widening, and matching of names not supported for EDIPartyName");
        return 0;
    }

    @Override // android.sun.security.x509.GeneralNameInterface
    public void encode(DerOutputStream derOutputStream) throws IOException {
        DerOutputStream derOutputStream2 = new DerOutputStream();
        DerOutputStream derOutputStream3 = new DerOutputStream();
        if (this.assigner != null) {
            DerOutputStream derOutputStream4 = new DerOutputStream();
            derOutputStream4.putPrintableString(this.assigner);
            derOutputStream2.write(DerValue.createTag(DerValue.TAG_CONTEXT, false, (byte) 0), derOutputStream4);
        }
        String str = this.party;
        if (str == null) {
            ca0.m1178j("Cannot have null partyName");
            return;
        }
        derOutputStream3.putPrintableString(str);
        derOutputStream2.write(DerValue.createTag(DerValue.TAG_CONTEXT, false, (byte) 1), derOutputStream3);
        derOutputStream.write((byte) 48, derOutputStream2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof EDIPartyName)) {
            return false;
        }
        EDIPartyName eDIPartyName = (EDIPartyName) obj;
        String str = eDIPartyName.assigner;
        String str2 = this.assigner;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        String str3 = eDIPartyName.party;
        String str4 = this.party;
        if (str4 == null) {
            return str3 == null;
        }
        return str4.equals(str3);
    }

    public String getAssignerName() {
        return this.assigner;
    }

    public String getPartyName() {
        return this.party;
    }

    @Override // android.sun.security.x509.GeneralNameInterface
    public int getType() {
        return 5;
    }

    public int hashCode() {
        if (this.myhash == -1) {
            int iHashCode = this.party.hashCode() + 37;
            this.myhash = iHashCode;
            String str = this.assigner;
            if (str != null) {
                this.myhash = str.hashCode() + (iHashCode * 37);
            }
        }
        return this.myhash;
    }

    @Override // android.sun.security.x509.GeneralNameInterface
    public int subtreeDepth() {
        throw new UnsupportedOperationException("subtreeDepth() not supported for EDIPartyName");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("EDIPartyName: ");
        sb.append(this.assigner == null ? "" : AbstractC1308pu.m5342i(new StringBuilder("  nameAssigner = "), this.assigner, ","));
        sb.append("  partyName = ");
        sb.append(this.party);
        return sb.toString();
    }

    public EDIPartyName(String str) {
        this.assigner = null;
        this.myhash = -1;
        this.party = str;
    }

    public EDIPartyName(String str, String str2) {
        this.myhash = -1;
        this.assigner = str;
        this.party = str2;
    }
}
