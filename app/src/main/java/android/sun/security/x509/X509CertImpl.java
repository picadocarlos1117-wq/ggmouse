package android.sun.security.x509;

import android.sun.misc.BASE64Decoder;
import android.sun.misc.HexDumpEncoder;
import android.sun.security.provider.X509Factory;
import android.sun.security.util.DerEncoder;
import android.sun.security.util.DerInputStream;
import android.sun.security.util.DerOutputStream;
import android.sun.security.util.DerValue;
import android.sun.security.util.ObjectIdentifier;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import p000.ca0;
import p000.jd0;
import p000.l41;
import p000.lv1;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class X509CertImpl extends X509Certificate implements DerEncoder {
    public static final String ALG_ID = "algorithm";
    private static final String AUTH_INFO_ACCESS_OID = "1.3.6.1.5.5.7.1.1";
    private static final String BASIC_CONSTRAINT_OID = "2.5.29.19";
    private static final String DOT = ".";
    private static final String EXTENDED_KEY_USAGE_OID = "2.5.29.37";
    public static final String INFO = "info";
    private static final String ISSUER_ALT_NAME_OID = "2.5.29.18";
    public static final String ISSUER_DN = "x509.info.issuer.dname";
    private static final String KEY_USAGE_OID = "2.5.29.15";
    public static final String NAME = "x509";
    private static final int NUM_STANDARD_KEY_USAGE = 9;
    public static final String PUBLIC_KEY = "x509.info.key.value";
    public static final String SERIAL_ID = "x509.info.serialNumber.number";
    public static final String SIG = "x509.signature";
    public static final String SIGNATURE = "signature";
    public static final String SIGNED_CERT = "signed_cert";
    public static final String SIG_ALG = "x509.algorithm";
    private static final String SUBJECT_ALT_NAME_OID = "2.5.29.17";
    public static final String SUBJECT_DN = "x509.info.subject.dname";
    public static final String VERSION = "x509.info.version.number";
    private static final long serialVersionUID = -3457612960190864406L;
    protected AlgorithmId algId;
    private Set<AccessDescription> authInfoAccess;
    private List<String> extKeyUsage;
    protected X509CertInfo info;
    private Collection<List<?>> issuerAlternativeNames;
    private boolean readOnly;
    protected byte[] signature;
    private byte[] signedCert;
    private Collection<List<?>> subjectAlternativeNames;
    private boolean verificationResult;
    private String verifiedProvider;
    private PublicKey verifiedPublicKey;

    public X509CertImpl(InputStream inputStream) throws CertificateException {
        DerValue derValue;
        this.readOnly = false;
        this.signedCert = null;
        this.info = null;
        this.algId = null;
        this.signature = null;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            try {
                bufferedInputStream.mark(Integer.MAX_VALUE);
                derValue = readRFC1421Cert(bufferedInputStream);
            } catch (IOException unused) {
                bufferedInputStream.reset();
                derValue = new DerValue(bufferedInputStream);
            }
            try {
                parse(derValue);
            } catch (IOException e) {
                this.signedCert = null;
                CertificateException certificateException = new CertificateException("Unable to parse DER value of certificate, " + e);
                certificateException.initCause(e);
                throw certificateException;
            }
        } catch (IOException e2) {
            CertificateException certificateException2 = new CertificateException(jd0.m3611i(e2, new StringBuilder("Input stream must be either DER-encoded bytes or RFC1421 hex-encoded DER-encoded bytes: ")));
            certificateException2.initCause(e2);
            throw certificateException2;
        }
    }

    private static Collection<List<?>> cloneAltNames(Collection<List<?>> collection) {
        Iterator<List<?>> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (it.next().get(1) instanceof byte[]) {
                z = true;
            }
        }
        if (!z) {
            return collection;
        }
        HashSet hashSet = new HashSet();
        for (List<?> list : collection) {
            Object obj = list.get(1);
            if (obj instanceof byte[]) {
                ArrayList arrayList = new ArrayList(list);
                arrayList.set(1, ((byte[]) obj).clone());
                hashSet.add(Collections.unmodifiableList(arrayList));
            } else {
                hashSet.add(list);
            }
        }
        return Collections.unmodifiableCollection(hashSet);
    }

    public static byte[] getEncodedInternal(Certificate certificate) {
        return certificate instanceof X509CertImpl ? ((X509CertImpl) certificate).getEncodedInternal() : certificate.getEncoded();
    }

    public static List<String> getExtendedKeyUsage(X509Certificate x509Certificate) throws CertificateParsingException {
        try {
            byte[] extensionValue = x509Certificate.getExtensionValue(EXTENDED_KEY_USAGE_OID);
            if (extensionValue == null) {
                return null;
            }
            return Collections.unmodifiableList(new ExtendedKeyUsageExtension(Boolean.FALSE, new DerValue(extensionValue).getOctetString()).getExtendedKeyUsage());
        } catch (IOException e) {
            CertificateParsingException certificateParsingException = new CertificateParsingException();
            certificateParsingException.initCause(e);
            throw certificateParsingException;
        }
    }

    public static Collection<List<?>> getIssuerAlternativeNames(X509Certificate x509Certificate) throws CertificateParsingException {
        try {
            byte[] extensionValue = x509Certificate.getExtensionValue(ISSUER_ALT_NAME_OID);
            if (extensionValue == null) {
                return null;
            }
            try {
                return makeAltNames((GeneralNames) new IssuerAlternativeNameExtension(Boolean.FALSE, new DerValue(extensionValue).getOctetString()).get(IssuerAlternativeNameExtension.ISSUER_NAME));
            } catch (IOException unused) {
                return Collections.EMPTY_SET;
            }
        } catch (IOException e) {
            CertificateParsingException certificateParsingException = new CertificateParsingException();
            certificateParsingException.initCause(e);
            throw certificateParsingException;
        }
    }

    public static Collection<List<?>> getSubjectAlternativeNames(X509Certificate x509Certificate) throws CertificateParsingException {
        try {
            byte[] extensionValue = x509Certificate.getExtensionValue(SUBJECT_ALT_NAME_OID);
            if (extensionValue == null) {
                return null;
            }
            try {
                return makeAltNames((GeneralNames) new SubjectAlternativeNameExtension(Boolean.FALSE, new DerValue(extensionValue).getOctetString()).get(SubjectAlternativeNameExtension.SUBJECT_NAME));
            } catch (IOException unused) {
                return Collections.EMPTY_SET;
            }
        } catch (IOException e) {
            CertificateParsingException certificateParsingException = new CertificateParsingException();
            certificateParsingException.initCause(e);
            throw certificateParsingException;
        }
    }

    private static X500Principal getX500Principal(X509Certificate x509Certificate, boolean z) {
        DerInputStream derInputStream = new DerInputStream(x509Certificate.getEncoded()).getSequence(3)[0].data;
        if (derInputStream.getDerValue().isContextSpecific((byte) 0)) {
            derInputStream.getDerValue();
        }
        derInputStream.getDerValue();
        DerValue derValue = derInputStream.getDerValue();
        if (!z) {
            derInputStream.getDerValue();
            derValue = derInputStream.getDerValue();
        }
        return new X500Principal(derValue.toByteArray());
    }

    public static boolean isSelfIssued(X509Certificate x509Certificate) {
        return x509Certificate.getSubjectX500Principal().equals(x509Certificate.getIssuerX500Principal());
    }

    public static boolean isSelfSigned(X509Certificate x509Certificate, String str) {
        if (!isSelfIssued(x509Certificate)) {
            return false;
        }
        try {
            if (str == null) {
                x509Certificate.verify(x509Certificate.getPublicKey());
                return true;
            }
            x509Certificate.verify(x509Certificate.getPublicKey(), str);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static Collection<List<?>> makeAltNames(GeneralNames generalNames) {
        if (generalNames.isEmpty()) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet();
        Iterator<GeneralName> it = generalNames.names().iterator();
        while (it.hasNext()) {
            GeneralNameInterface name = it.next().getName();
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(Integer.valueOf(name.getType()));
            int type = name.getType();
            if (type == 1) {
                arrayList.add(((RFC822Name) name).getName());
            } else if (type == 2) {
                arrayList.add(((DNSName) name).getName());
            } else if (type == 4) {
                arrayList.add(((X500Name) name).getRFC2253Name());
            } else if (type == 6) {
                arrayList.add(((URIName) name).getName());
            } else if (type == 7) {
                try {
                    arrayList.add(((IPAddressName) name).getName());
                } catch (IOException e) {
                    l41.m4043l("IPAddress cannot be parsed", e);
                    return null;
                }
            } else if (type != 8) {
                DerOutputStream derOutputStream = new DerOutputStream();
                try {
                    name.encode(derOutputStream);
                    arrayList.add(derOutputStream.toByteArray());
                } catch (IOException e2) {
                    l41.m4043l("name cannot be encoded", e2);
                    return null;
                }
            } else {
                arrayList.add(((OIDName) name).getOID().toString());
            }
            hashSet.add(Collections.unmodifiableList(arrayList));
        }
        return Collections.unmodifiableCollection(hashSet);
    }

    private void parse(DerValue derValue) throws CertificateException {
        if (this.readOnly) {
            throw new CertificateParsingException("cannot over-write existing certificate");
        }
        if (derValue.data == null || derValue.tag != 48) {
            throw new CertificateParsingException("invalid DER-encoded certificate data");
        }
        this.signedCert = derValue.toByteArray();
        DerValue[] derValueArr = {derValue.data.getDerValue(), derValue.data.getDerValue(), derValue.data.getDerValue()};
        if (derValue.data.available() != 0) {
            throw new CertificateParsingException("signed overrun, bytes = " + derValue.data.available());
        }
        if (derValueArr[0].tag != 48) {
            throw new CertificateParsingException("signed fields invalid");
        }
        this.algId = AlgorithmId.parse(derValueArr[1]);
        this.signature = derValueArr[2].getBitString();
        if (derValueArr[1].data.available() != 0) {
            throw new CertificateParsingException("algid field overrun");
        }
        if (derValueArr[2].data.available() != 0) {
            throw new CertificateParsingException("signed fields overrun");
        }
        X509CertInfo x509CertInfo = new X509CertInfo(derValueArr[0]);
        this.info = x509CertInfo;
        if (this.algId.equals((AlgorithmId) x509CertInfo.get("algorithmID.algorithm"))) {
            this.readOnly = true;
        } else {
            lv1.m4299k("Signature algorithm mismatch");
        }
    }

    private DerValue readRFC1421Cert(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "ASCII"));
        try {
            if (!bufferedReader.readLine().equals(X509Factory.BEGIN_CERT)) {
                ca0.m1178j("InputStream is not RFC1421 hex-encoded DER bytes");
                return null;
            }
            BASE64Decoder bASE64Decoder = new BASE64Decoder();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        return null;
                    }
                    if (line.equals(X509Factory.END_CERT)) {
                        return new DerValue(byteArrayOutputStream.toByteArray());
                    }
                    byteArrayOutputStream.write(bASE64Decoder.decodeBuffer(line));
                } catch (IOException e) {
                    ca0.m1178j(jd0.m3611i(e, new StringBuilder("Unable to read InputStream: ")));
                    return null;
                }
            }
        } catch (IOException e2) {
            ca0.m1178j(jd0.m3611i(e2, new StringBuilder("Unable to read InputStream: ")));
            return null;
        }
    }

    public static X509CertImpl toImpl(X509Certificate x509Certificate) {
        return x509Certificate instanceof X509CertImpl ? (X509CertImpl) x509Certificate : X509Factory.intern(x509Certificate);
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity(Date date) throws CertificateNotYetValidException, CertificateExpiredException {
        try {
            CertificateValidity certificateValidity = (CertificateValidity) this.info.get("validity");
            if (certificateValidity == null) {
                throw new CertificateNotYetValidException("Null validity period");
            }
            certificateValidity.valid(date);
        } catch (Exception unused) {
            throw new CertificateNotYetValidException("Incorrect validity period");
        }
    }

    public void delete(String str) throws CertificateException {
        if (this.readOnly) {
            lv1.m4299k("cannot over-write existing certificate");
            return;
        }
        X509AttributeName x509AttributeName = new X509AttributeName(str);
        String prefix = x509AttributeName.getPrefix();
        if (!prefix.equalsIgnoreCase(NAME)) {
            throw new CertificateException("Invalid root of attribute name, expected [x509], received ".concat(prefix));
        }
        X509AttributeName x509AttributeName2 = new X509AttributeName(x509AttributeName.getSuffix());
        String prefix2 = x509AttributeName2.getPrefix();
        if (prefix2.equalsIgnoreCase("info")) {
            if (x509AttributeName2.getSuffix() != null) {
                this.info = null;
                return;
            } else {
                this.info.delete(x509AttributeName2.getSuffix());
                return;
            }
        }
        if (prefix2.equalsIgnoreCase("algorithm")) {
            this.algId = null;
        } else if (prefix2.equalsIgnoreCase(SIGNATURE)) {
            this.signature = null;
        } else {
            if (!prefix2.equalsIgnoreCase(SIGNED_CERT)) {
                throw new CertificateException("Attribute name not recognized or delete() not allowed for the same: ".concat(prefix2));
            }
            this.signedCert = null;
        }
    }

    @Override // android.sun.security.util.DerEncoder
    public void derEncode(OutputStream outputStream) throws IOException {
        byte[] bArr = this.signedCert;
        if (bArr != null) {
            outputStream.write((byte[]) bArr.clone());
        } else {
            ca0.m1178j("Null certificate to encode");
        }
    }

    public void encode(OutputStream outputStream) throws CertificateEncodingException {
        byte[] bArr = this.signedCert;
        if (bArr == null) {
            throw new CertificateEncodingException("Null certificate to encode");
        }
        try {
            outputStream.write((byte[]) bArr.clone());
        } catch (IOException e) {
            throw new CertificateEncodingException(e.toString());
        }
    }

    public Object get(String str) throws CertificateParsingException {
        X509AttributeName x509AttributeName = new X509AttributeName(str);
        String prefix = x509AttributeName.getPrefix();
        if (!prefix.equalsIgnoreCase(NAME)) {
            throw new CertificateParsingException(jd0.m3615m("Invalid root of attribute name, expected [x509], received [", prefix, "]"));
        }
        X509AttributeName x509AttributeName2 = new X509AttributeName(x509AttributeName.getSuffix());
        String prefix2 = x509AttributeName2.getPrefix();
        if (prefix2.equalsIgnoreCase("info")) {
            if (this.info == null) {
                return null;
            }
            String suffix = x509AttributeName2.getSuffix();
            X509CertInfo x509CertInfo = this.info;
            if (suffix == null) {
                return x509CertInfo;
            }
            try {
                return x509CertInfo.get(x509AttributeName2.getSuffix());
            } catch (IOException e) {
                throw new CertificateParsingException(e.toString());
            } catch (CertificateException e2) {
                throw new CertificateParsingException(e2.toString());
            }
        }
        if (prefix2.equalsIgnoreCase("algorithm")) {
            return this.algId;
        }
        if (prefix2.equalsIgnoreCase(SIGNATURE)) {
            byte[] bArr = this.signature;
            if (bArr != null) {
                return bArr.clone();
            }
            return null;
        }
        if (!prefix2.equalsIgnoreCase(SIGNED_CERT)) {
            throw new CertificateParsingException("Attribute name not recognized or get() not allowed for the same: ".concat(prefix2));
        }
        byte[] bArr2 = this.signedCert;
        if (bArr2 != null) {
            return bArr2.clone();
        }
        return null;
    }

    public AuthorityInfoAccessExtension getAuthorityInfoAccessExtension() {
        return (AuthorityInfoAccessExtension) getExtension(PKIXExtensions.AuthInfoAccess_Id);
    }

    public AuthorityKeyIdentifierExtension getAuthorityKeyIdentifierExtension() {
        return (AuthorityKeyIdentifierExtension) getExtension(PKIXExtensions.AuthorityKey_Id);
    }

    @Override // java.security.cert.X509Certificate
    public int getBasicConstraints() {
        BasicConstraintsExtension basicConstraintsExtension;
        try {
            String name = OIDMap.getName(PKIXExtensions.BasicConstraints_Id);
            if (name != null && (basicConstraintsExtension = (BasicConstraintsExtension) get(name)) != null && ((Boolean) basicConstraintsExtension.get(BasicConstraintsExtension.IS_CA)).booleanValue()) {
                return ((Integer) basicConstraintsExtension.get(BasicConstraintsExtension.PATH_LEN)).intValue();
            }
        } catch (Exception unused) {
        }
        return -1;
    }

    public BasicConstraintsExtension getBasicConstraintsExtension() {
        return (BasicConstraintsExtension) getExtension(PKIXExtensions.BasicConstraints_Id);
    }

    public CRLDistributionPointsExtension getCRLDistributionPointsExtension() {
        return (CRLDistributionPointsExtension) getExtension(PKIXExtensions.CRLDistributionPoints_Id);
    }

    public CertificatePoliciesExtension getCertificatePoliciesExtension() {
        return (CertificatePoliciesExtension) getExtension(PKIXExtensions.CertificatePolicies_Id);
    }

    @Override // java.security.cert.X509Extension
    public Set<String> getCriticalExtensionOIDs() {
        X509CertInfo x509CertInfo = this.info;
        if (x509CertInfo == null) {
            return null;
        }
        try {
            CertificateExtensions certificateExtensions = (CertificateExtensions) x509CertInfo.get("extensions");
            if (certificateExtensions == null) {
                return null;
            }
            HashSet hashSet = new HashSet();
            for (Extension extension : certificateExtensions.getAllExtensions()) {
                if (extension.isCritical()) {
                    hashSet.add(extension.getExtensionId().toString());
                }
            }
            return hashSet;
        } catch (Exception unused) {
            return null;
        }
    }

    public Enumeration<String> getElements() {
        AttributeNameEnumeration attributeNameEnumeration = new AttributeNameEnumeration();
        attributeNameEnumeration.addElement(X509CertInfo.IDENT);
        attributeNameEnumeration.addElement(SIG_ALG);
        attributeNameEnumeration.addElement(SIG);
        attributeNameEnumeration.addElement("x509.signed_cert");
        return attributeNameEnumeration.elements();
    }

    @Override // java.security.cert.Certificate
    public byte[] getEncoded() {
        return (byte[]) getEncodedInternal().clone();
    }

    public ExtendedKeyUsageExtension getExtendedKeyUsageExtension() {
        return (ExtendedKeyUsageExtension) getExtension(PKIXExtensions.ExtendedKeyUsage_Id);
    }

    public Extension getExtension(ObjectIdentifier objectIdentifier) {
        X509CertInfo x509CertInfo = this.info;
        if (x509CertInfo == null) {
            return null;
        }
        try {
            CertificateExtensions certificateExtensions = (CertificateExtensions) x509CertInfo.get("extensions");
            if (certificateExtensions == null) {
                return null;
            }
            for (Extension extension : certificateExtensions.getAllExtensions()) {
                if (extension.getExtensionId().equals(objectIdentifier)) {
                    return extension;
                }
            }
        } catch (IOException | CertificateException unused) {
        }
        return null;
    }

    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(String str) {
        Extension next;
        try {
            ObjectIdentifier objectIdentifier = new ObjectIdentifier(str);
            String name = OIDMap.getName(objectIdentifier);
            CertificateExtensions certificateExtensions = (CertificateExtensions) this.info.get("extensions");
            if (name != null) {
                try {
                    next = (Extension) get(name);
                } catch (CertificateException unused) {
                    next = null;
                    break;
                }
            } else if (certificateExtensions != null) {
                Iterator<Extension> it = certificateExtensions.getAllExtensions().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!next.getExtensionId().equals(objectIdentifier));
            } else {
                return null;
            }
            if (next == null) {
                if (certificateExtensions != null) {
                    next = certificateExtensions.getUnparseableExtensions().get(str);
                }
                if (next == null) {
                    return null;
                }
            }
            byte[] extensionValue = next.getExtensionValue();
            if (extensionValue == null) {
                return null;
            }
            DerOutputStream derOutputStream = new DerOutputStream();
            derOutputStream.putOctetString(extensionValue);
            return derOutputStream.toByteArray();
        } catch (Exception unused2) {
            return null;
        }
    }

    public IssuerAlternativeNameExtension getIssuerAlternativeNameExtension() {
        return (IssuerAlternativeNameExtension) getExtension(PKIXExtensions.IssuerAlternativeName_Id);
    }

    @Override // java.security.cert.X509Certificate
    public Principal getIssuerDN() {
        X509CertInfo x509CertInfo = this.info;
        if (x509CertInfo == null) {
            return null;
        }
        try {
            return (Principal) x509CertInfo.get("issuer.dname");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getIssuerUniqueID() {
        X509CertInfo x509CertInfo = this.info;
        if (x509CertInfo == null) {
            return null;
        }
        try {
            UniqueIdentity uniqueIdentity = (UniqueIdentity) x509CertInfo.get("issuerID.id");
            if (uniqueIdentity == null) {
                return null;
            }
            return uniqueIdentity.getId();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // java.security.cert.X509Certificate
    public X500Principal getIssuerX500Principal() {
        X509CertInfo x509CertInfo = this.info;
        if (x509CertInfo == null) {
            return null;
        }
        try {
            return (X500Principal) x509CertInfo.get("issuer.x500principal");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getKeyUsage() {
        KeyUsageExtension keyUsageExtension;
        try {
            String name = OIDMap.getName(PKIXExtensions.KeyUsage_Id);
            if (name == null || (keyUsageExtension = (KeyUsageExtension) get(name)) == null) {
                return null;
            }
            boolean[] bits = keyUsageExtension.getBits();
            if (bits.length >= 9) {
                return bits;
            }
            boolean[] zArr = new boolean[9];
            System.arraycopy(bits, 0, zArr, 0, bits.length);
            return zArr;
        } catch (Exception unused) {
            return null;
        }
    }

    public String getName() {
        return NAME;
    }

    public NameConstraintsExtension getNameConstraintsExtension() {
        return (NameConstraintsExtension) getExtension(PKIXExtensions.NameConstraints_Id);
    }

    @Override // java.security.cert.X509Extension
    public Set<String> getNonCriticalExtensionOIDs() {
        X509CertInfo x509CertInfo = this.info;
        if (x509CertInfo == null) {
            return null;
        }
        try {
            CertificateExtensions certificateExtensions = (CertificateExtensions) x509CertInfo.get("extensions");
            if (certificateExtensions == null) {
                return null;
            }
            HashSet hashSet = new HashSet();
            for (Extension extension : certificateExtensions.getAllExtensions()) {
                if (!extension.isCritical()) {
                    hashSet.add(extension.getExtensionId().toString());
                }
            }
            hashSet.addAll(certificateExtensions.getUnparseableExtensions().keySet());
            return hashSet;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // java.security.cert.X509Certificate
    public Date getNotAfter() {
        X509CertInfo x509CertInfo = this.info;
        if (x509CertInfo == null) {
            return null;
        }
        try {
            return (Date) x509CertInfo.get("validity.notAfter");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // java.security.cert.X509Certificate
    public Date getNotBefore() {
        X509CertInfo x509CertInfo = this.info;
        if (x509CertInfo == null) {
            return null;
        }
        try {
            return (Date) x509CertInfo.get("validity.notBefore");
        } catch (Exception unused) {
            return null;
        }
    }

    public PolicyConstraintsExtension getPolicyConstraintsExtension() {
        return (PolicyConstraintsExtension) getExtension(PKIXExtensions.PolicyConstraints_Id);
    }

    public PolicyMappingsExtension getPolicyMappingsExtension() {
        return (PolicyMappingsExtension) getExtension(PKIXExtensions.PolicyMappings_Id);
    }

    public PrivateKeyUsageExtension getPrivateKeyUsageExtension() {
        return (PrivateKeyUsageExtension) getExtension(PKIXExtensions.PrivateKeyUsage_Id);
    }

    @Override // java.security.cert.Certificate
    public PublicKey getPublicKey() {
        X509CertInfo x509CertInfo = this.info;
        if (x509CertInfo == null) {
            return null;
        }
        try {
            return (PublicKey) x509CertInfo.get("key.value");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // java.security.cert.X509Certificate
    public BigInteger getSerialNumber() {
        SerialNumber serialNumberObject = getSerialNumberObject();
        if (serialNumberObject != null) {
            return serialNumberObject.getNumber();
        }
        return null;
    }

    public SerialNumber getSerialNumberObject() {
        X509CertInfo x509CertInfo = this.info;
        if (x509CertInfo == null) {
            return null;
        }
        try {
            return (SerialNumber) x509CertInfo.get("serialNumber.number");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // java.security.cert.X509Certificate
    public String getSigAlgName() {
        AlgorithmId algorithmId = this.algId;
        if (algorithmId == null) {
            return null;
        }
        return algorithmId.getName();
    }

    @Override // java.security.cert.X509Certificate
    public String getSigAlgOID() {
        AlgorithmId algorithmId = this.algId;
        if (algorithmId == null) {
            return null;
        }
        return algorithmId.getOID().toString();
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getSigAlgParams() {
        AlgorithmId algorithmId = this.algId;
        if (algorithmId == null) {
            return null;
        }
        try {
            return algorithmId.getEncodedParams();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getSignature() {
        byte[] bArr = this.signature;
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public SubjectAlternativeNameExtension getSubjectAlternativeNameExtension() {
        return (SubjectAlternativeNameExtension) getExtension(PKIXExtensions.SubjectAlternativeName_Id);
    }

    @Override // java.security.cert.X509Certificate
    public Principal getSubjectDN() {
        X509CertInfo x509CertInfo = this.info;
        if (x509CertInfo == null) {
            return null;
        }
        try {
            return (Principal) x509CertInfo.get("subject.dname");
        } catch (Exception unused) {
            return null;
        }
    }

    public SubjectKeyIdentifierExtension getSubjectKeyIdentifierExtension() {
        return (SubjectKeyIdentifierExtension) getExtension(PKIXExtensions.SubjectKey_Id);
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getSubjectUniqueID() {
        X509CertInfo x509CertInfo = this.info;
        if (x509CertInfo == null) {
            return null;
        }
        try {
            UniqueIdentity uniqueIdentity = (UniqueIdentity) x509CertInfo.get("subjectID.id");
            if (uniqueIdentity == null) {
                return null;
            }
            return uniqueIdentity.getId();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // java.security.cert.X509Certificate
    public X500Principal getSubjectX500Principal() {
        X509CertInfo x509CertInfo = this.info;
        if (x509CertInfo == null) {
            return null;
        }
        try {
            return (X500Principal) x509CertInfo.get("subject.x500principal");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getTBSCertificate() throws CertificateEncodingException {
        X509CertInfo x509CertInfo = this.info;
        if (x509CertInfo != null) {
            return x509CertInfo.getEncodedInfo();
        }
        throw new CertificateEncodingException("Uninitialized certificate");
    }

    public Extension getUnparseableExtension(ObjectIdentifier objectIdentifier) {
        X509CertInfo x509CertInfo = this.info;
        if (x509CertInfo == null) {
            return null;
        }
        try {
            CertificateExtensions certificateExtensions = (CertificateExtensions) x509CertInfo.get("extensions");
            if (certificateExtensions == null) {
                return null;
            }
            return certificateExtensions.getUnparseableExtensions().get(objectIdentifier.toString());
        } catch (IOException | CertificateException unused) {
            return null;
        }
    }

    @Override // java.security.cert.X509Certificate
    public int getVersion() {
        X509CertInfo x509CertInfo = this.info;
        if (x509CertInfo == null) {
            return -1;
        }
        try {
            return ((Integer) x509CertInfo.get("version.number")).intValue() + 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        X509CertInfo x509CertInfo = this.info;
        if (x509CertInfo == null) {
            return false;
        }
        try {
            CertificateExtensions certificateExtensions = (CertificateExtensions) x509CertInfo.get("extensions");
            if (certificateExtensions == null) {
                return false;
            }
            return certificateExtensions.hasUnsupportedCriticalExtension();
        } catch (Exception unused) {
            return false;
        }
    }

    public void set(String str, Object obj) throws CertificateException {
        if (this.readOnly) {
            lv1.m4299k("cannot over-write existing certificate");
            return;
        }
        X509AttributeName x509AttributeName = new X509AttributeName(str);
        String prefix = x509AttributeName.getPrefix();
        if (!prefix.equalsIgnoreCase(NAME)) {
            throw new CertificateException("Invalid root of attribute name, expected [x509], received ".concat(prefix));
        }
        X509AttributeName x509AttributeName2 = new X509AttributeName(x509AttributeName.getSuffix());
        String prefix2 = x509AttributeName2.getPrefix();
        if (!prefix2.equalsIgnoreCase("info")) {
            throw new CertificateException("Attribute name not recognized or set() not allowed for the same: ".concat(prefix2));
        }
        if (x509AttributeName2.getSuffix() != null) {
            this.info.set(x509AttributeName2.getSuffix(), obj);
            this.signedCert = null;
        } else if (!(obj instanceof X509CertInfo)) {
            lv1.m4299k("Attribute value should be of type X509CertInfo.");
        } else {
            this.info = (X509CertInfo) obj;
            this.signedCert = null;
        }
    }

    public void sign(PrivateKey privateKey, String str, String str2) throws SignatureException, InvalidKeyException, CertificateEncodingException {
        try {
            if (this.readOnly) {
                throw new CertificateEncodingException("cannot over-write existing certificate");
            }
            Signature signature = (str2 == null || str2.length() == 0) ? Signature.getInstance(str) : Signature.getInstance(str, str2);
            signature.initSign(privateKey);
            this.algId = AlgorithmId.get(signature.getAlgorithm());
            DerOutputStream derOutputStream = new DerOutputStream();
            DerOutputStream derOutputStream2 = new DerOutputStream();
            this.info.encode(derOutputStream2);
            byte[] byteArray = derOutputStream2.toByteArray();
            this.algId.encode(derOutputStream2);
            signature.update(byteArray, 0, byteArray.length);
            byte[] bArrSign = signature.sign();
            this.signature = bArrSign;
            derOutputStream2.putBitString(bArrSign);
            derOutputStream.write((byte) 48, derOutputStream2);
            this.signedCert = derOutputStream.toByteArray();
            this.readOnly = true;
        } catch (IOException e) {
            throw new CertificateEncodingException(e.toString());
        }
    }

    @Override // java.security.cert.Certificate
    public String toString() {
        if (this.info == null || this.algId == null || this.signature == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder("[\n");
        sb.append(this.info.toString() + "\n");
        sb.append("  Algorithm: [" + this.algId.toString() + "]\n");
        sb.append("  Signature:\n" + new HexDumpEncoder().encodeBuffer(this.signature));
        sb.append("\n]");
        return sb.toString();
    }

    @Override // java.security.cert.Certificate
    public synchronized void verify(PublicKey publicKey, String str) {
        if (str == null) {
            str = "";
        }
        try {
            PublicKey publicKey2 = this.verifiedPublicKey;
            if (publicKey2 != null && publicKey2.equals(publicKey) && str.equals(this.verifiedProvider)) {
                if (!this.verificationResult) {
                    throw new SignatureException("Signature does not match.");
                }
                return;
            }
            if (this.signedCert == null) {
                throw new CertificateEncodingException("Uninitialized certificate");
            }
            int length = str.length();
            AlgorithmId algorithmId = this.algId;
            Signature signature = length == 0 ? Signature.getInstance(algorithmId.getName()) : Signature.getInstance(algorithmId.getName(), str);
            signature.initVerify(publicKey);
            byte[] encodedInfo = this.info.getEncodedInfo();
            signature.update(encodedInfo, 0, encodedInfo.length);
            boolean zVerify = signature.verify(this.signature);
            this.verificationResult = zVerify;
            this.verifiedPublicKey = publicKey;
            this.verifiedProvider = str;
            if (!zVerify) {
                throw new SignatureException("Signature does not match.");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static X500Principal getIssuerX500Principal(X509Certificate x509Certificate) {
        try {
            return getX500Principal(x509Certificate, true);
        } catch (Exception e) {
            l41.m4043l("Could not parse issuer", e);
            return null;
        }
    }

    public static X500Principal getSubjectX500Principal(X509Certificate x509Certificate) {
        try {
            return getX500Principal(x509Certificate, false);
        } catch (Exception e) {
            l41.m4043l("Could not parse subject", e);
            return null;
        }
    }

    public byte[] getEncodedInternal() throws CertificateEncodingException {
        byte[] bArr = this.signedCert;
        if (bArr != null) {
            return bArr;
        }
        throw new CertificateEncodingException("Null certificate to encode");
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity() throws CertificateNotYetValidException, CertificateExpiredException {
        checkValidity(new Date());
    }

    @Override // java.security.cert.X509Certificate
    public synchronized List<String> getExtendedKeyUsage() {
        List<String> list;
        if (this.readOnly && (list = this.extKeyUsage) != null) {
            return list;
        }
        ExtendedKeyUsageExtension extendedKeyUsageExtension = getExtendedKeyUsageExtension();
        if (extendedKeyUsageExtension == null) {
            return null;
        }
        List<String> listUnmodifiableList = Collections.unmodifiableList(extendedKeyUsageExtension.getExtendedKeyUsage());
        this.extKeyUsage = listUnmodifiableList;
        return listUnmodifiableList;
    }

    @Override // java.security.cert.X509Certificate
    public synchronized Collection<List<?>> getIssuerAlternativeNames() {
        Collection<List<?>> collection;
        if (this.readOnly && (collection = this.issuerAlternativeNames) != null) {
            return cloneAltNames(collection);
        }
        IssuerAlternativeNameExtension issuerAlternativeNameExtension = getIssuerAlternativeNameExtension();
        if (issuerAlternativeNameExtension == null) {
            return null;
        }
        try {
            Collection<List<?>> collectionMakeAltNames = makeAltNames((GeneralNames) issuerAlternativeNameExtension.get(IssuerAlternativeNameExtension.ISSUER_NAME));
            this.issuerAlternativeNames = collectionMakeAltNames;
            return collectionMakeAltNames;
        } catch (IOException unused) {
            return Collections.EMPTY_SET;
        }
    }

    @Override // java.security.cert.X509Certificate
    public synchronized Collection<List<?>> getSubjectAlternativeNames() {
        Collection<List<?>> collection;
        if (this.readOnly && (collection = this.subjectAlternativeNames) != null) {
            return cloneAltNames(collection);
        }
        SubjectAlternativeNameExtension subjectAlternativeNameExtension = getSubjectAlternativeNameExtension();
        if (subjectAlternativeNameExtension == null) {
            return null;
        }
        try {
            Collection<List<?>> collectionMakeAltNames = makeAltNames((GeneralNames) subjectAlternativeNameExtension.get(SubjectAlternativeNameExtension.SUBJECT_NAME));
            this.subjectAlternativeNames = collectionMakeAltNames;
            return collectionMakeAltNames;
        } catch (IOException unused) {
            return Collections.EMPTY_SET;
        }
    }

    public X509CertImpl(byte[] bArr) throws CertificateException {
        this.readOnly = false;
        this.signedCert = null;
        this.info = null;
        this.algId = null;
        this.signature = null;
        try {
            parse(new DerValue(bArr));
        } catch (IOException e) {
            this.signedCert = null;
            CertificateException certificateException = new CertificateException("Unable to initialize, " + e);
            certificateException.initCause(e);
            throw certificateException;
        }
    }

    public X509CertImpl() {
        this.readOnly = false;
        this.signedCert = null;
        this.info = null;
        this.algId = null;
        this.signature = null;
    }

    public X509CertImpl(X509CertInfo x509CertInfo) {
        this.readOnly = false;
        this.signedCert = null;
        this.algId = null;
        this.signature = null;
        this.info = x509CertInfo;
    }

    public void sign(PrivateKey privateKey, String str) throws SignatureException, InvalidKeyException, CertificateEncodingException {
        sign(privateKey, str, null);
    }

    public X509CertImpl(DerValue derValue) throws CertificateException {
        this.readOnly = false;
        this.signedCert = null;
        this.info = null;
        this.algId = null;
        this.signature = null;
        try {
            parse(derValue);
        } catch (IOException e) {
            this.signedCert = null;
            CertificateException certificateException = new CertificateException("Unable to initialize, " + e);
            certificateException.initCause(e);
            throw certificateException;
        }
    }

    @Override // java.security.cert.Certificate
    public void verify(PublicKey publicKey) {
        verify(publicKey, "");
    }
}
