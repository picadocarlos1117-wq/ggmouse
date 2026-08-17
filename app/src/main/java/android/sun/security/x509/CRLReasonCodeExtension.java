package android.sun.security.x509;

import android.sun.security.util.DerOutputStream;
import android.sun.security.util.DerValue;
import java.io.IOException;
import java.io.OutputStream;
import java.security.cert.CRLReason;
import java.util.Enumeration;
import p000.AbstractC1308pu;
import p000.ca0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class CRLReasonCodeExtension extends Extension implements CertAttrSet<String> {
    public static final int AA_COMPROMISE = 10;
    public static final int AFFLIATION_CHANGED = 3;
    public static final int CA_COMPROMISE = 2;
    public static final int CERTIFICATE_HOLD = 6;
    public static final int CESSATION_OF_OPERATION = 5;
    public static final int KEY_COMPROMISE = 1;
    public static final String NAME = "CRLReasonCode";
    public static final int PRIVILEGE_WITHDRAWN = 9;
    public static final String REASON = "reason";
    public static final int REMOVE_FROM_CRL = 8;
    public static final int SUPERSEDED = 4;
    public static final int UNSPECIFIED = 0;
    private static CRLReason[] values = CRLReason.values();
    private int reasonCode;

    public CRLReasonCodeExtension(Boolean bool, Object obj) {
        this.reasonCode = 0;
        this.extensionId = PKIXExtensions.ReasonCode_Id;
        this.critical = bool.booleanValue();
        byte[] bArr = (byte[]) obj;
        this.extensionValue = bArr;
        this.reasonCode = new DerValue(bArr).getEnumerated();
    }

    private void encodeThis() throws IOException {
        if (this.reasonCode == 0) {
            this.extensionValue = null;
            return;
        }
        DerOutputStream derOutputStream = new DerOutputStream();
        derOutputStream.putEnumerated(this.reasonCode);
        this.extensionValue = derOutputStream.toByteArray();
    }

    @Override // android.sun.security.x509.CertAttrSet
    public void delete(String str) throws IOException {
        if (!str.equalsIgnoreCase(REASON)) {
            ca0.m1178j("Name not supported by CRLReasonCodeExtension");
        } else {
            this.reasonCode = 0;
            encodeThis();
        }
    }

    @Override // android.sun.security.x509.Extension, android.sun.security.x509.CertAttrSet
    public void encode(OutputStream outputStream) throws IOException {
        DerOutputStream derOutputStream = new DerOutputStream();
        if (this.extensionValue == null) {
            this.extensionId = PKIXExtensions.ReasonCode_Id;
            this.critical = false;
            encodeThis();
        }
        super.encode(derOutputStream);
        outputStream.write(derOutputStream.toByteArray());
    }

    @Override // android.sun.security.x509.CertAttrSet
    public Object get(String str) throws IOException {
        if (str.equalsIgnoreCase(REASON)) {
            return new Integer(this.reasonCode);
        }
        ca0.m1178j("Name not supported by CRLReasonCodeExtension");
        return null;
    }

    @Override // android.sun.security.x509.CertAttrSet
    public Enumeration<String> getElements() {
        return AbstractC1308pu.m5348o(REASON);
    }

    @Override // android.sun.security.x509.CertAttrSet
    public String getName() {
        return NAME;
    }

    public CRLReason getReasonCode() {
        int i = this.reasonCode;
        if (i > 0) {
            CRLReason[] cRLReasonArr = values;
            if (i < cRLReasonArr.length) {
                return cRLReasonArr[i];
            }
        }
        return CRLReason.UNSPECIFIED;
    }

    @Override // android.sun.security.x509.CertAttrSet
    public void set(String str, Object obj) throws IOException {
        if (!(obj instanceof Integer)) {
            ca0.m1178j("Attribute must be of type Integer.");
        } else if (!str.equalsIgnoreCase(REASON)) {
            ca0.m1178j("Name not supported by CRLReasonCodeExtension");
        } else {
            this.reasonCode = ((Integer) obj).intValue();
            encodeThis();
        }
    }

    @Override // android.sun.security.x509.Extension, android.sun.security.x509.CertAttrSet
    public String toString() {
        return super.toString() + "    Reason Code: " + values[this.reasonCode];
    }

    public CRLReasonCodeExtension(boolean z, int i) throws IOException {
        this.reasonCode = 0;
        this.extensionId = PKIXExtensions.ReasonCode_Id;
        this.critical = z;
        this.reasonCode = i;
        encodeThis();
    }

    public CRLReasonCodeExtension(int i) {
        this(false, i);
    }
}
