package android.sun.security.x509;

import android.sun.security.util.BitArray;
import android.sun.security.util.DerOutputStream;
import android.sun.security.util.DerValue;
import android.sun.security.util.ObjectIdentifier;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Vector;
import p000.AbstractC1308pu;
import p000.ca0;
import p000.jd0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class NetscapeCertTypeExtension extends Extension implements CertAttrSet<String> {
    private static final int[] CertType_data;
    public static final String IDENT = "x509.info.extensions.NetscapeCertType";
    public static final String NAME = "NetscapeCertType";
    public static ObjectIdentifier NetscapeCertType_Id = null;
    public static final String OBJECT_SIGNING = "object_signing";
    public static final String OBJECT_SIGNING_CA = "object_signing_ca";
    public static final String SSL_CA = "ssl_ca";
    public static final String SSL_CLIENT = "ssl_client";
    public static final String SSL_SERVER = "ssl_server";
    public static final String S_MIME = "s_mime";
    public static final String S_MIME_CA = "s_mime_ca";
    private static final Vector<String> mAttributeNames;
    private static MapEntry[] mMapData;
    private boolean[] bitString;

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static class MapEntry {
        String mName;
        int mPosition;

        public MapEntry(String str, int i) {
            this.mName = str;
            this.mPosition = i;
        }
    }

    static {
        int[] iArr = {2, 16, 840, 1, 113730, 1, 1};
        CertType_data = iArr;
        try {
            NetscapeCertType_Id = new ObjectIdentifier(iArr);
        } catch (IOException unused) {
        }
        mMapData = new MapEntry[]{new MapEntry(SSL_CLIENT, 0), new MapEntry(SSL_SERVER, 1), new MapEntry(S_MIME, 2), new MapEntry(OBJECT_SIGNING, 3), new MapEntry(SSL_CA, 5), new MapEntry(S_MIME_CA, 6), new MapEntry(OBJECT_SIGNING_CA, 7)};
        mAttributeNames = new Vector<>();
        for (MapEntry mapEntry : mMapData) {
            mAttributeNames.add(mapEntry.mName);
        }
    }

    public NetscapeCertTypeExtension(Boolean bool, Object obj) {
        this.extensionId = NetscapeCertType_Id;
        this.critical = bool.booleanValue();
        byte[] bArr = (byte[]) obj;
        this.extensionValue = bArr;
        this.bitString = new DerValue(bArr).getUnalignedBitString().toBooleanArray();
    }

    private void encodeThis() throws IOException {
        DerOutputStream derOutputStream = new DerOutputStream();
        derOutputStream.putTruncatedUnalignedBitString(new BitArray(this.bitString));
        this.extensionValue = derOutputStream.toByteArray();
    }

    private static int getPosition(String str) throws IOException {
        int i = 0;
        while (true) {
            MapEntry[] mapEntryArr = mMapData;
            if (i >= mapEntryArr.length) {
                ca0.m1178j(jd0.m3615m("Attribute name [", str, "] not recognized by CertAttrSet:NetscapeCertType."));
                return 0;
            }
            if (str.equalsIgnoreCase(mapEntryArr[i].mName)) {
                return mMapData[i].mPosition;
            }
            i++;
        }
    }

    private boolean isSet(int i) {
        return this.bitString[i];
    }

    @Override // android.sun.security.x509.CertAttrSet
    public void delete(String str) throws IOException {
        set(getPosition(str), false);
        encodeThis();
    }

    @Override // android.sun.security.x509.Extension, android.sun.security.x509.CertAttrSet
    public void encode(OutputStream outputStream) throws IOException {
        DerOutputStream derOutputStream = new DerOutputStream();
        if (this.extensionValue == null) {
            this.extensionId = NetscapeCertType_Id;
            this.critical = true;
            encodeThis();
        }
        super.encode(derOutputStream);
        outputStream.write(derOutputStream.toByteArray());
    }

    @Override // android.sun.security.x509.CertAttrSet
    public Object get(String str) {
        return Boolean.valueOf(isSet(getPosition(str)));
    }

    @Override // android.sun.security.x509.CertAttrSet
    public Enumeration<String> getElements() {
        return mAttributeNames.elements();
    }

    public boolean[] getKeyUsageMappedBits() {
        KeyUsageExtension keyUsageExtension = new KeyUsageExtension();
        Boolean bool = Boolean.TRUE;
        try {
            if (isSet(getPosition(SSL_CLIENT)) || isSet(getPosition(S_MIME)) || isSet(getPosition(OBJECT_SIGNING))) {
                keyUsageExtension.set(KeyUsageExtension.DIGITAL_SIGNATURE, bool);
            }
            if (isSet(getPosition(SSL_SERVER))) {
                keyUsageExtension.set(KeyUsageExtension.KEY_ENCIPHERMENT, bool);
            }
            if (isSet(getPosition(SSL_CA)) || isSet(getPosition(S_MIME_CA)) || isSet(getPosition(OBJECT_SIGNING_CA))) {
                keyUsageExtension.set(KeyUsageExtension.KEY_CERTSIGN, bool);
            }
        } catch (IOException unused) {
        }
        return keyUsageExtension.getBits();
    }

    @Override // android.sun.security.x509.CertAttrSet
    public String getName() {
        return NAME;
    }

    @Override // android.sun.security.x509.CertAttrSet
    public void set(String str, Object obj) throws IOException {
        if (!(obj instanceof Boolean)) {
            ca0.m1178j("Attribute must be of type Boolean.");
            return;
        }
        set(getPosition(str), ((Boolean) obj).booleanValue());
        encodeThis();
    }

    @Override // android.sun.security.x509.Extension, android.sun.security.x509.CertAttrSet
    public String toString() {
        String strM5342i = AbstractC1308pu.m5342i(new StringBuilder(), super.toString(), "NetscapeCertType [\n");
        try {
            if (isSet(getPosition(SSL_CLIENT))) {
                strM5342i = strM5342i.concat("   SSL client\n");
            }
            if (isSet(getPosition(SSL_SERVER))) {
                strM5342i = strM5342i.concat("   SSL server\n");
            }
            if (isSet(getPosition(S_MIME))) {
                strM5342i = strM5342i.concat("   S/MIME\n");
            }
            if (isSet(getPosition(OBJECT_SIGNING))) {
                strM5342i = strM5342i.concat("   Object Signing\n");
            }
            if (isSet(getPosition(SSL_CA))) {
                strM5342i = strM5342i.concat("   SSL CA\n");
            }
            if (isSet(getPosition(S_MIME_CA))) {
                strM5342i = strM5342i.concat("   S/MIME CA\n");
            }
            if (isSet(getPosition(OBJECT_SIGNING_CA))) {
                strM5342i = strM5342i.concat("   Object Signing CA");
            }
        } catch (Exception unused) {
        }
        return strM5342i.concat("]\n");
    }

    private void set(int i, boolean z) {
        boolean[] zArr = this.bitString;
        if (i >= zArr.length) {
            boolean[] zArr2 = new boolean[i + 1];
            System.arraycopy(zArr, 0, zArr2, 0, zArr.length);
            this.bitString = zArr2;
        }
        this.bitString[i] = z;
    }

    public NetscapeCertTypeExtension(boolean[] zArr) throws IOException {
        this.bitString = zArr;
        this.extensionId = NetscapeCertType_Id;
        this.critical = true;
        encodeThis();
    }

    public NetscapeCertTypeExtension(byte[] bArr) throws IOException {
        this.bitString = new BitArray(bArr.length * 8, bArr).toBooleanArray();
        this.extensionId = NetscapeCertType_Id;
        this.critical = true;
        encodeThis();
    }

    public NetscapeCertTypeExtension() {
        this.extensionId = NetscapeCertType_Id;
        this.critical = true;
        this.bitString = new boolean[0];
    }
}
