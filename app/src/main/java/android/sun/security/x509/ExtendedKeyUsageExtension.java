package android.sun.security.x509;

import android.sun.security.util.DerOutputStream;
import android.sun.security.util.DerValue;
import android.sun.security.util.ObjectIdentifier;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import p000.AbstractC1308pu;
import p000.ca0;
import p000.jd0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class ExtendedKeyUsageExtension extends Extension implements CertAttrSet<String> {
    public static final String IDENT = "x509.info.extensions.ExtendedKeyUsage";
    public static final String NAME = "ExtendedKeyUsage";
    private static final int[] OCSPSigningOidData;
    public static final String USAGES = "usages";
    private static final int[] anyExtendedKeyUsageOidData;
    private static final int[] clientAuthOidData;
    private static final int[] codeSigningOidData;
    private static final int[] emailProtectionOidData;
    private static final int[] ipsecEndSystemOidData;
    private static final int[] ipsecTunnelOidData;
    private static final int[] ipsecUserOidData;
    private static final Map<ObjectIdentifier, String> map;
    private static final int[] serverAuthOidData;
    private static final int[] timeStampingOidData;
    private Vector<ObjectIdentifier> keyUsages;

    static {
        HashMap map2 = new HashMap();
        map = map2;
        int[] iArr = {2, 5, 29, 37, 0};
        anyExtendedKeyUsageOidData = iArr;
        int[] iArr2 = {1, 3, 6, 1, 5, 5, 7, 3, 1};
        serverAuthOidData = iArr2;
        int[] iArr3 = {1, 3, 6, 1, 5, 5, 7, 3, 2};
        clientAuthOidData = iArr3;
        int[] iArr4 = {1, 3, 6, 1, 5, 5, 7, 3, 3};
        codeSigningOidData = iArr4;
        int[] iArr5 = {1, 3, 6, 1, 5, 5, 7, 3, 4};
        emailProtectionOidData = iArr5;
        int[] iArr6 = {1, 3, 6, 1, 5, 5, 7, 3, 5};
        ipsecEndSystemOidData = iArr6;
        int[] iArr7 = {1, 3, 6, 1, 5, 5, 7, 3, 6};
        ipsecTunnelOidData = iArr7;
        int[] iArr8 = {1, 3, 6, 1, 5, 5, 7, 3, 7};
        ipsecUserOidData = iArr8;
        int[] iArr9 = {1, 3, 6, 1, 5, 5, 7, 3, 8};
        timeStampingOidData = iArr9;
        int[] iArr10 = {1, 3, 6, 1, 5, 5, 7, 3, 9};
        OCSPSigningOidData = iArr10;
        map2.put(ObjectIdentifier.newInternal(iArr), "anyExtendedKeyUsage");
        map2.put(ObjectIdentifier.newInternal(iArr2), "serverAuth");
        map2.put(ObjectIdentifier.newInternal(iArr3), "clientAuth");
        map2.put(ObjectIdentifier.newInternal(iArr4), "codeSigning");
        map2.put(ObjectIdentifier.newInternal(iArr5), "emailProtection");
        map2.put(ObjectIdentifier.newInternal(iArr6), "ipsecEndSystem");
        map2.put(ObjectIdentifier.newInternal(iArr7), "ipsecTunnel");
        map2.put(ObjectIdentifier.newInternal(iArr8), "ipsecUser");
        map2.put(ObjectIdentifier.newInternal(iArr9), "timeStamping");
        map2.put(ObjectIdentifier.newInternal(iArr10), "OCSPSigning");
    }

    public ExtendedKeyUsageExtension(Boolean bool, Object obj) throws IOException {
        this.extensionId = PKIXExtensions.ExtendedKeyUsage_Id;
        this.critical = bool.booleanValue();
        byte[] bArr = (byte[]) obj;
        this.extensionValue = bArr;
        DerValue derValue = new DerValue(bArr);
        if (derValue.tag != 48) {
            ca0.m1178j("Invalid encoding for ExtendedKeyUsageExtension.");
            throw null;
        }
        this.keyUsages = new Vector<>();
        while (derValue.data.available() != 0) {
            this.keyUsages.addElement(derValue.data.getDerValue().getOID());
        }
    }

    private void encodeThis() throws IOException {
        Vector<ObjectIdentifier> vector = this.keyUsages;
        if (vector == null || vector.isEmpty()) {
            this.extensionValue = null;
            return;
        }
        DerOutputStream derOutputStream = new DerOutputStream();
        DerOutputStream derOutputStream2 = new DerOutputStream();
        for (int i = 0; i < this.keyUsages.size(); i++) {
            derOutputStream2.putOID(this.keyUsages.elementAt(i));
        }
        derOutputStream.write((byte) 48, derOutputStream2);
        this.extensionValue = derOutputStream.toByteArray();
    }

    @Override // android.sun.security.x509.CertAttrSet
    public void delete(String str) throws IOException {
        if (!str.equalsIgnoreCase(USAGES)) {
            ca0.m1178j(jd0.m3615m("Attribute name [", str, "] not recognized by CertAttrSet:ExtendedKeyUsageExtension."));
        } else {
            this.keyUsages = null;
            encodeThis();
        }
    }

    @Override // android.sun.security.x509.Extension, android.sun.security.x509.CertAttrSet
    public void encode(OutputStream outputStream) throws IOException {
        DerOutputStream derOutputStream = new DerOutputStream();
        if (this.extensionValue == null) {
            this.extensionId = PKIXExtensions.ExtendedKeyUsage_Id;
            this.critical = false;
            encodeThis();
        }
        super.encode(derOutputStream);
        outputStream.write(derOutputStream.toByteArray());
    }

    @Override // android.sun.security.x509.CertAttrSet
    public Object get(String str) throws IOException {
        if (str.equalsIgnoreCase(USAGES)) {
            return this.keyUsages;
        }
        ca0.m1178j(jd0.m3615m("Attribute name [", str, "] not recognized by CertAttrSet:ExtendedKeyUsageExtension."));
        return null;
    }

    @Override // android.sun.security.x509.CertAttrSet
    public Enumeration<String> getElements() {
        return AbstractC1308pu.m5348o(USAGES);
    }

    public List<String> getExtendedKeyUsage() {
        ArrayList arrayList = new ArrayList(this.keyUsages.size());
        Iterator<ObjectIdentifier> it = this.keyUsages.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toString());
        }
        return arrayList;
    }

    @Override // android.sun.security.x509.CertAttrSet
    public String getName() {
        return NAME;
    }

    @Override // android.sun.security.x509.CertAttrSet
    public void set(String str, Object obj) throws IOException {
        if (!str.equalsIgnoreCase(USAGES)) {
            ca0.m1178j(jd0.m3615m("Attribute name [", str, "] not recognized by CertAttrSet:ExtendedKeyUsageExtension."));
        } else if (!(obj instanceof Vector)) {
            ca0.m1178j("Attribute value should be of type Vector.");
        } else {
            this.keyUsages = (Vector) obj;
            encodeThis();
        }
    }

    @Override // android.sun.security.x509.Extension, android.sun.security.x509.CertAttrSet
    public String toString() {
        Vector<ObjectIdentifier> vector = this.keyUsages;
        if (vector == null) {
            return "";
        }
        String string = "  ";
        boolean z = true;
        for (ObjectIdentifier objectIdentifier : vector) {
            if (!z) {
                string = string.concat("\n  ");
            }
            String str = map.get(objectIdentifier);
            if (str != null) {
                string = string.concat(str);
            } else {
                StringBuilder sbM5344k = AbstractC1308pu.m5344k(string);
                sbM5344k.append(objectIdentifier.toString());
                string = sbM5344k.toString();
            }
            z = false;
        }
        return super.toString() + "ExtendedKeyUsages [\n" + string + "\n]\n";
    }

    public ExtendedKeyUsageExtension(Boolean bool, Vector<ObjectIdentifier> vector) throws IOException {
        this.keyUsages = vector;
        this.extensionId = PKIXExtensions.ExtendedKeyUsage_Id;
        this.critical = bool.booleanValue();
        encodeThis();
    }

    public ExtendedKeyUsageExtension(Vector<ObjectIdentifier> vector) {
        this(Boolean.FALSE, vector);
    }
}
