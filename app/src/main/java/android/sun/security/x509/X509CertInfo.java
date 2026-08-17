package android.sun.security.x509;

import android.sun.misc.HexDumpEncoder;
import android.sun.security.util.DerInputStream;
import android.sun.security.util.DerOutputStream;
import android.sun.security.util.DerValue;
import java.io.IOException;
import java.io.OutputStream;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateParsingException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import p000.AbstractC1308pu;
import p000.l41;
import p000.lv1;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class X509CertInfo implements CertAttrSet<String> {
    public static final String ALGORITHM_ID = "algorithmID";
    private static final int ATTR_ALGORITHM = 3;
    private static final int ATTR_EXTENSIONS = 10;
    private static final int ATTR_ISSUER = 4;
    private static final int ATTR_ISSUER_ID = 8;
    private static final int ATTR_KEY = 7;
    private static final int ATTR_SERIAL = 2;
    private static final int ATTR_SUBJECT = 6;
    private static final int ATTR_SUBJECT_ID = 9;
    private static final int ATTR_VALIDITY = 5;
    private static final int ATTR_VERSION = 1;
    public static final String EXTENSIONS = "extensions";
    public static final String IDENT = "x509.info";
    public static final String ISSUER = "issuer";
    public static final String ISSUER_ID = "issuerID";
    public static final String KEY = "key";
    public static final String NAME = "info";
    public static final String SERIAL_NUMBER = "serialNumber";
    public static final String SUBJECT = "subject";
    public static final String SUBJECT_ID = "subjectID";
    public static final String VALIDITY = "validity";
    public static final String VERSION = "version";
    private static final Map<String, Integer> map;
    protected CertificateVersion version = new CertificateVersion();
    protected CertificateSerialNumber serialNum = null;
    protected CertificateAlgorithmId algId = null;
    protected CertificateIssuerName issuer = null;
    protected CertificateValidity interval = null;
    protected CertificateSubjectName subject = null;
    protected CertificateX509Key pubKey = null;
    protected CertificateIssuerUniqueIdentity issuerUniqueId = null;
    protected CertificateSubjectUniqueIdentity subjectUniqueId = null;
    protected CertificateExtensions extensions = null;
    private byte[] rawCertInfo = null;

    static {
        HashMap map2 = new HashMap();
        map = map2;
        map2.put("version", 1);
        map2.put("serialNumber", 2);
        map2.put("algorithmID", 3);
        map2.put("issuer", 4);
        map2.put("validity", 5);
        map2.put("subject", 6);
        map2.put("key", 7);
        map2.put("issuerID", 8);
        map2.put("subjectID", 9);
        map2.put("extensions", 10);
    }

    public X509CertInfo(byte[] bArr) throws CertificateParsingException {
        try {
            parse(new DerValue(bArr));
        } catch (IOException e) {
            CertificateParsingException certificateParsingException = new CertificateParsingException(e.toString());
            certificateParsingException.initCause(e);
            throw certificateParsingException;
        }
    }

    private int attributeMap(String str) {
        Integer num = map.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    private void emit(DerOutputStream derOutputStream) throws CertificateParsingException, IOException {
        DerOutputStream derOutputStream2 = new DerOutputStream();
        this.version.encode(derOutputStream2);
        this.serialNum.encode(derOutputStream2);
        this.algId.encode(derOutputStream2);
        if (this.version.compare(0) == 0 && this.issuer.toString() == null) {
            throw new CertificateParsingException("Null issuer DN not allowed in v1 certificate");
        }
        this.issuer.encode(derOutputStream2);
        this.interval.encode(derOutputStream2);
        if (this.version.compare(0) == 0 && this.subject.toString() == null) {
            throw new CertificateParsingException("Null subject DN not allowed in v1 certificate");
        }
        this.subject.encode(derOutputStream2);
        this.pubKey.encode(derOutputStream2);
        CertificateIssuerUniqueIdentity certificateIssuerUniqueIdentity = this.issuerUniqueId;
        if (certificateIssuerUniqueIdentity != null) {
            certificateIssuerUniqueIdentity.encode(derOutputStream2);
        }
        CertificateSubjectUniqueIdentity certificateSubjectUniqueIdentity = this.subjectUniqueId;
        if (certificateSubjectUniqueIdentity != null) {
            certificateSubjectUniqueIdentity.encode(derOutputStream2);
        }
        CertificateExtensions certificateExtensions = this.extensions;
        if (certificateExtensions != null) {
            certificateExtensions.encode(derOutputStream2);
        }
        derOutputStream.write((byte) 48, derOutputStream2);
    }

    private void parse(DerValue derValue) throws CertificateParsingException {
        if (derValue.tag != 48) {
            throw new CertificateParsingException("signed fields invalid");
        }
        this.rawCertInfo = derValue.toByteArray();
        DerInputStream derInputStream = derValue.data;
        DerValue derValue2 = derInputStream.getDerValue();
        if (derValue2.isContextSpecific((byte) 0)) {
            this.version = new CertificateVersion(derValue2);
            derValue2 = derInputStream.getDerValue();
        }
        this.serialNum = new CertificateSerialNumber(derValue2);
        this.algId = new CertificateAlgorithmId(derInputStream);
        CertificateIssuerName certificateIssuerName = new CertificateIssuerName(derInputStream);
        this.issuer = certificateIssuerName;
        if (((X500Name) certificateIssuerName.get("dname")).isEmpty()) {
            throw new CertificateParsingException("Empty issuer DN not allowed in X509Certificates");
        }
        this.interval = new CertificateValidity(derInputStream);
        CertificateSubjectName certificateSubjectName = new CertificateSubjectName(derInputStream);
        this.subject = certificateSubjectName;
        X500Name x500Name = (X500Name) certificateSubjectName.get("dname");
        if (this.version.compare(0) == 0 && x500Name.isEmpty()) {
            throw new CertificateParsingException("Empty subject DN not allowed in v1 certificate");
        }
        this.pubKey = new CertificateX509Key(derInputStream);
        if (derInputStream.available() != 0) {
            if (this.version.compare(0) == 0) {
                throw new CertificateParsingException("no more data allowed for version 1 certificate");
            }
            DerValue derValue3 = derInputStream.getDerValue();
            if (derValue3.isContextSpecific((byte) 1)) {
                this.issuerUniqueId = new CertificateIssuerUniqueIdentity(derValue3);
                if (derInputStream.available() == 0) {
                    return;
                } else {
                    derValue3 = derInputStream.getDerValue();
                }
            }
            if (derValue3.isContextSpecific((byte) 2)) {
                this.subjectUniqueId = new CertificateSubjectUniqueIdentity(derValue3);
                if (derInputStream.available() == 0) {
                    return;
                } else {
                    derValue3 = derInputStream.getDerValue();
                }
            }
            if (this.version.compare(2) != 0) {
                throw new CertificateParsingException("Extensions not allowed in v2 certificate");
            }
            if (derValue3.isConstructed() && derValue3.isContextSpecific((byte) 3)) {
                this.extensions = new CertificateExtensions(derValue3.data);
            }
            verifyCert(this.subject, this.extensions);
        }
    }

    private void setAlgorithmId(Object obj) throws CertificateException {
        if (obj instanceof CertificateAlgorithmId) {
            this.algId = (CertificateAlgorithmId) obj;
        } else {
            lv1.m4299k("AlgorithmId class type invalid.");
        }
    }

    private void setExtensions(Object obj) throws CertificateException {
        if (this.version.compare(2) < 0) {
            lv1.m4299k("Invalid version");
        } else if (obj instanceof CertificateExtensions) {
            this.extensions = (CertificateExtensions) obj;
        } else {
            lv1.m4299k("Extensions class type invalid.");
        }
    }

    private void setIssuer(Object obj) throws CertificateException {
        if (obj instanceof CertificateIssuerName) {
            this.issuer = (CertificateIssuerName) obj;
        } else {
            lv1.m4299k("Issuer class type invalid.");
        }
    }

    private void setIssuerUniqueId(Object obj) throws CertificateException {
        if (this.version.compare(1) < 0) {
            lv1.m4299k("Invalid version");
        } else if (obj instanceof CertificateIssuerUniqueIdentity) {
            this.issuerUniqueId = (CertificateIssuerUniqueIdentity) obj;
        } else {
            lv1.m4299k("IssuerUniqueId class type invalid.");
        }
    }

    private void setKey(Object obj) throws CertificateException {
        if (obj instanceof CertificateX509Key) {
            this.pubKey = (CertificateX509Key) obj;
        } else {
            lv1.m4299k("Key class type invalid.");
        }
    }

    private void setSerialNumber(Object obj) throws CertificateException {
        if (obj instanceof CertificateSerialNumber) {
            this.serialNum = (CertificateSerialNumber) obj;
        } else {
            lv1.m4299k("SerialNumber class type invalid.");
        }
    }

    private void setSubject(Object obj) throws CertificateException {
        if (obj instanceof CertificateSubjectName) {
            this.subject = (CertificateSubjectName) obj;
        } else {
            lv1.m4299k("Subject class type invalid.");
        }
    }

    private void setSubjectUniqueId(Object obj) throws CertificateException {
        if (this.version.compare(1) < 0) {
            lv1.m4299k("Invalid version");
        } else if (obj instanceof CertificateSubjectUniqueIdentity) {
            this.subjectUniqueId = (CertificateSubjectUniqueIdentity) obj;
        } else {
            lv1.m4299k("SubjectUniqueId class type invalid.");
        }
    }

    private void setValidity(Object obj) throws CertificateException {
        if (obj instanceof CertificateValidity) {
            this.interval = (CertificateValidity) obj;
        } else {
            lv1.m4299k("CertificateValidity class type invalid.");
        }
    }

    private void setVersion(Object obj) throws CertificateException {
        if (obj instanceof CertificateVersion) {
            this.version = (CertificateVersion) obj;
        } else {
            lv1.m4299k("Version class type invalid.");
        }
    }

    private void verifyCert(CertificateSubjectName certificateSubjectName, CertificateExtensions certificateExtensions) throws CertificateParsingException {
        if (((X500Name) certificateSubjectName.get("dname")).isEmpty()) {
            if (certificateExtensions == null) {
                throw new CertificateParsingException("X.509 Certificate is incomplete: subject field is empty, and certificate has no extensions");
            }
            try {
                SubjectAlternativeNameExtension subjectAlternativeNameExtension = (SubjectAlternativeNameExtension) certificateExtensions.get(SubjectAlternativeNameExtension.NAME);
                GeneralNames generalNames = (GeneralNames) subjectAlternativeNameExtension.get(SubjectAlternativeNameExtension.SUBJECT_NAME);
                if (generalNames == null || generalNames.isEmpty()) {
                    throw new CertificateParsingException("X.509 Certificate is incomplete: subject field is empty, and SubjectAlternativeName extension is empty");
                }
                if (!subjectAlternativeNameExtension.isCritical()) {
                    throw new CertificateParsingException("X.509 Certificate is incomplete: SubjectAlternativeName extension MUST be marked critical when subject field is empty");
                }
            } catch (IOException unused) {
                throw new CertificateParsingException("X.509 Certificate is incomplete: subject field is empty, and SubjectAlternativeName extension is absent");
            }
        }
    }

    @Override // android.sun.security.x509.CertAttrSet
    public void delete(String str) {
        X509AttributeName x509AttributeName = new X509AttributeName(str);
        int iAttributeMap = attributeMap(x509AttributeName.getPrefix());
        if (iAttributeMap == 0) {
            throw new CertificateException(AbstractC1308pu.m5339f("Attribute name not recognized: ", str));
        }
        this.rawCertInfo = null;
        String suffix = x509AttributeName.getSuffix();
        switch (iAttributeMap) {
            case 1:
                if (suffix == null) {
                    this.version = null;
                    return;
                } else {
                    this.version.delete(suffix);
                    return;
                }
            case 2:
                if (suffix == null) {
                    this.serialNum = null;
                    return;
                } else {
                    this.serialNum.delete(suffix);
                    return;
                }
            case 3:
                if (suffix == null) {
                    this.algId = null;
                    return;
                } else {
                    this.algId.delete(suffix);
                    return;
                }
            case 4:
                if (suffix == null) {
                    this.issuer = null;
                    return;
                } else {
                    this.issuer.delete(suffix);
                    return;
                }
            case 5:
                if (suffix == null) {
                    this.interval = null;
                    return;
                } else {
                    this.interval.delete(suffix);
                    return;
                }
            case 6:
                if (suffix == null) {
                    this.subject = null;
                    return;
                } else {
                    this.subject.delete(suffix);
                    return;
                }
            case 7:
                if (suffix == null) {
                    this.pubKey = null;
                    return;
                } else {
                    this.pubKey.delete(suffix);
                    return;
                }
            case 8:
                if (suffix == null) {
                    this.issuerUniqueId = null;
                    return;
                } else {
                    this.issuerUniqueId.delete(suffix);
                    return;
                }
            case 9:
                if (suffix == null) {
                    this.subjectUniqueId = null;
                    return;
                } else {
                    this.subjectUniqueId.delete(suffix);
                    return;
                }
            case 10:
                if (suffix == null) {
                    this.extensions = null;
                    return;
                }
                CertificateExtensions certificateExtensions = this.extensions;
                if (certificateExtensions != null) {
                    certificateExtensions.delete(suffix);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // android.sun.security.x509.CertAttrSet
    public void encode(OutputStream outputStream) {
        if (this.rawCertInfo == null) {
            DerOutputStream derOutputStream = new DerOutputStream();
            emit(derOutputStream);
            this.rawCertInfo = derOutputStream.toByteArray();
        }
        outputStream.write((byte[]) this.rawCertInfo.clone());
    }

    public boolean equals(X509CertInfo x509CertInfo) {
        byte[] bArr;
        if (this == x509CertInfo) {
            return true;
        }
        byte[] bArr2 = this.rawCertInfo;
        if (bArr2 == null || (bArr = x509CertInfo.rawCertInfo) == null || bArr2.length != bArr.length) {
            return false;
        }
        int i = 0;
        while (true) {
            byte[] bArr3 = this.rawCertInfo;
            if (i >= bArr3.length) {
                return true;
            }
            if (bArr3[i] != x509CertInfo.rawCertInfo[i]) {
                return false;
            }
            i++;
        }
    }

    @Override // android.sun.security.x509.CertAttrSet
    public Object get(String str) throws CertificateParsingException {
        X509AttributeName x509AttributeName = new X509AttributeName(str);
        int iAttributeMap = attributeMap(x509AttributeName.getPrefix());
        if (iAttributeMap == 0) {
            throw new CertificateParsingException(AbstractC1308pu.m5339f("Attribute name not recognized: ", str));
        }
        String suffix = x509AttributeName.getSuffix();
        switch (iAttributeMap) {
            case 1:
                CertificateVersion certificateVersion = this.version;
                return suffix == null ? certificateVersion : certificateVersion.get(suffix);
            case 2:
                CertificateSerialNumber certificateSerialNumber = this.serialNum;
                return suffix == null ? certificateSerialNumber : certificateSerialNumber.get(suffix);
            case 3:
                CertificateAlgorithmId certificateAlgorithmId = this.algId;
                return suffix == null ? certificateAlgorithmId : certificateAlgorithmId.get(suffix);
            case 4:
                CertificateIssuerName certificateIssuerName = this.issuer;
                return suffix == null ? certificateIssuerName : certificateIssuerName.get(suffix);
            case 5:
                CertificateValidity certificateValidity = this.interval;
                return suffix == null ? certificateValidity : certificateValidity.get(suffix);
            case 6:
                CertificateSubjectName certificateSubjectName = this.subject;
                return suffix == null ? certificateSubjectName : certificateSubjectName.get(suffix);
            case 7:
                CertificateX509Key certificateX509Key = this.pubKey;
                return suffix == null ? certificateX509Key : certificateX509Key.get(suffix);
            case 8:
                CertificateIssuerUniqueIdentity certificateIssuerUniqueIdentity = this.issuerUniqueId;
                if (suffix == null) {
                    return certificateIssuerUniqueIdentity;
                }
                if (certificateIssuerUniqueIdentity == null) {
                    return null;
                }
                return certificateIssuerUniqueIdentity.get(suffix);
            case 9:
                CertificateSubjectUniqueIdentity certificateSubjectUniqueIdentity = this.subjectUniqueId;
                if (suffix == null) {
                    return certificateSubjectUniqueIdentity;
                }
                if (certificateSubjectUniqueIdentity == null) {
                    return null;
                }
                return certificateSubjectUniqueIdentity.get(suffix);
            case 10:
                CertificateExtensions certificateExtensions = this.extensions;
                if (suffix == null) {
                    return certificateExtensions;
                }
                if (certificateExtensions == null) {
                    return null;
                }
                return certificateExtensions.get(suffix);
            default:
                return null;
        }
    }

    @Override // android.sun.security.x509.CertAttrSet
    public Enumeration<String> getElements() {
        AttributeNameEnumeration attributeNameEnumeration = new AttributeNameEnumeration();
        attributeNameEnumeration.addElement("version");
        attributeNameEnumeration.addElement("serialNumber");
        attributeNameEnumeration.addElement("algorithmID");
        attributeNameEnumeration.addElement("issuer");
        attributeNameEnumeration.addElement("validity");
        attributeNameEnumeration.addElement("subject");
        attributeNameEnumeration.addElement("key");
        attributeNameEnumeration.addElement("issuerID");
        attributeNameEnumeration.addElement("subjectID");
        attributeNameEnumeration.addElement("extensions");
        return attributeNameEnumeration.elements();
    }

    public byte[] getEncodedInfo() throws CertificateEncodingException {
        try {
            if (this.rawCertInfo == null) {
                DerOutputStream derOutputStream = new DerOutputStream();
                emit(derOutputStream);
                this.rawCertInfo = derOutputStream.toByteArray();
            }
            return (byte[]) this.rawCertInfo.clone();
        } catch (IOException e) {
            throw new CertificateEncodingException(e.toString());
        } catch (CertificateException e2) {
            throw new CertificateEncodingException(e2.toString());
        }
    }

    @Override // android.sun.security.x509.CertAttrSet
    public String getName() {
        return "info";
    }

    public int hashCode() {
        int i = 0;
        int i2 = 1;
        while (true) {
            byte[] bArr = this.rawCertInfo;
            if (i2 >= bArr.length) {
                return i;
            }
            i += bArr[i2] * i2;
            i2++;
        }
    }

    @Override // android.sun.security.x509.CertAttrSet
    public void set(String str, Object obj) {
        X509AttributeName x509AttributeName = new X509AttributeName(str);
        int iAttributeMap = attributeMap(x509AttributeName.getPrefix());
        if (iAttributeMap == 0) {
            throw new CertificateException(AbstractC1308pu.m5339f("Attribute name not recognized: ", str));
        }
        this.rawCertInfo = null;
        String suffix = x509AttributeName.getSuffix();
        switch (iAttributeMap) {
            case 1:
                if (suffix == null) {
                    setVersion(obj);
                    return;
                } else {
                    this.version.set(suffix, obj);
                    return;
                }
            case 2:
                if (suffix == null) {
                    setSerialNumber(obj);
                    return;
                } else {
                    this.serialNum.set(suffix, obj);
                    return;
                }
            case 3:
                if (suffix == null) {
                    setAlgorithmId(obj);
                    return;
                } else {
                    this.algId.set(suffix, obj);
                    return;
                }
            case 4:
                if (suffix == null) {
                    setIssuer(obj);
                    return;
                } else {
                    this.issuer.set(suffix, obj);
                    return;
                }
            case 5:
                if (suffix == null) {
                    setValidity(obj);
                    return;
                } else {
                    this.interval.set(suffix, obj);
                    return;
                }
            case 6:
                if (suffix == null) {
                    setSubject(obj);
                    return;
                } else {
                    this.subject.set(suffix, obj);
                    return;
                }
            case 7:
                if (suffix == null) {
                    setKey(obj);
                    return;
                } else {
                    this.pubKey.set(suffix, obj);
                    return;
                }
            case 8:
                if (suffix == null) {
                    setIssuerUniqueId(obj);
                    return;
                } else {
                    this.issuerUniqueId.set(suffix, obj);
                    return;
                }
            case 9:
                if (suffix == null) {
                    setSubjectUniqueId(obj);
                    return;
                } else {
                    this.subjectUniqueId.set(suffix, obj);
                    return;
                }
            case 10:
                if (suffix == null) {
                    setExtensions(obj);
                    return;
                }
                if (this.extensions == null) {
                    this.extensions = new CertificateExtensions();
                }
                this.extensions.set(suffix, obj);
                return;
            default:
                return;
        }
    }

    @Override // android.sun.security.x509.CertAttrSet
    public String toString() {
        if (this.subject == null || this.pubKey == null || this.interval == null || this.issuer == null || this.algId == null || this.serialNum == null) {
            l41.m4051t("X.509 cert is incomplete");
            return null;
        }
        StringBuilder sb = new StringBuilder("[\n");
        sb.append("  " + this.version.toString() + "\n");
        sb.append("  Subject: " + this.subject.toString() + "\n");
        sb.append("  Signature Algorithm: " + this.algId.toString() + "\n");
        sb.append("  Key:  " + this.pubKey.toString() + "\n");
        sb.append("  " + this.interval.toString() + "\n");
        sb.append("  Issuer: " + this.issuer.toString() + "\n");
        sb.append("  " + this.serialNum.toString() + "\n");
        if (this.issuerUniqueId != null) {
            sb.append("  Issuer Id:\n" + this.issuerUniqueId.toString() + "\n");
        }
        if (this.subjectUniqueId != null) {
            sb.append("  Subject Id:\n" + this.subjectUniqueId.toString() + "\n");
        }
        CertificateExtensions certificateExtensions = this.extensions;
        if (certificateExtensions != null) {
            Object[] array = certificateExtensions.getAllExtensions().toArray();
            sb.append("\nCertificate Extensions: " + array.length);
            int i = 0;
            while (i < array.length) {
                StringBuilder sb2 = new StringBuilder("\n[");
                int i2 = i + 1;
                sb2.append(i2);
                sb2.append("]: ");
                sb.append(sb2.toString());
                Extension extension = (Extension) array[i];
                try {
                    if (OIDMap.getClass(extension.getExtensionId()) == null) {
                        sb.append(extension.toString());
                        byte[] extensionValue = extension.getExtensionValue();
                        if (extensionValue != null) {
                            DerOutputStream derOutputStream = new DerOutputStream();
                            derOutputStream.putOctetString(extensionValue);
                            byte[] byteArray = derOutputStream.toByteArray();
                            sb.append("Extension unknown: DER encoded OCTET string =\n" + new HexDumpEncoder().encodeBuffer(byteArray) + "\n");
                        }
                    } else {
                        sb.append(extension.toString());
                    }
                } catch (Exception unused) {
                    sb.append(", Error parsing this extension");
                }
                i = i2;
            }
            Map<String, Extension> unparseableExtensions = this.extensions.getUnparseableExtensions();
            if (!unparseableExtensions.isEmpty()) {
                sb.append("\nUnparseable certificate extensions: " + unparseableExtensions.size());
                int i3 = 1;
                for (Extension extension2 : unparseableExtensions.values()) {
                    sb.append("\n[" + i3 + "]: ");
                    sb.append(extension2);
                    i3++;
                }
            }
        }
        sb.append("\n]");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj instanceof X509CertInfo) {
            return equals((X509CertInfo) obj);
        }
        return false;
    }

    public X509CertInfo() {
    }

    public X509CertInfo(DerValue derValue) throws CertificateParsingException {
        try {
            parse(derValue);
        } catch (IOException e) {
            CertificateParsingException certificateParsingException = new CertificateParsingException(e.toString());
            certificateParsingException.initCause(e);
            throw certificateParsingException;
        }
    }
}
