package android.sun.security.x509;

import android.sun.misc.HexDumpEncoder;
import android.sun.security.util.DerOutputStream;
import android.sun.security.util.DerValue;
import android.sun.security.util.ObjectIdentifier;
import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.CRLException;
import java.security.cert.CRLReason;
import java.security.cert.X509CRLEntry;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import p000.f40;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class X509CRLEntryImpl extends X509CRLEntry {
    private static final long YR_2050 = 2524636800000L;
    private static final boolean isExplicit = false;
    private X500Principal certIssuer;
    private CRLExtensions extensions;
    private Date revocationDate;
    private byte[] revokedCert;
    private SerialNumber serialNumber;

    public X509CRLEntryImpl(byte[] bArr) throws CRLException {
        this.serialNumber = null;
        this.revocationDate = null;
        this.extensions = null;
        this.revokedCert = null;
        try {
            parse(new DerValue(bArr));
        } catch (IOException e) {
            this.revokedCert = null;
            f40.m2717m(e, "Parsing error: ");
            throw null;
        }
    }

    public static CRLReason getRevocationReason(X509CRLEntry x509CRLEntry) {
        try {
            byte[] extensionValue = x509CRLEntry.getExtensionValue("2.5.29.21");
            if (extensionValue == null) {
                return null;
            }
            return new CRLReasonCodeExtension(Boolean.FALSE, new DerValue(extensionValue).getOctetString()).getReasonCode();
        } catch (IOException unused) {
            return null;
        }
    }

    private void parse(DerValue derValue) throws CRLException {
        if (derValue.tag != 48) {
            throw new CRLException("Invalid encoded RevokedCertificate, starting sequence tag missing.");
        }
        if (derValue.data.available() == 0) {
            throw new CRLException("No data encoded for RevokedCertificates");
        }
        this.revokedCert = derValue.toByteArray();
        this.serialNumber = new SerialNumber(derValue.toDerInputStream().getDerValue());
        byte bPeekByte = (byte) derValue.data.peekByte();
        if (bPeekByte == 23) {
            this.revocationDate = derValue.data.getUTCTime();
        } else {
            if (bPeekByte != 24) {
                throw new CRLException("Invalid encoding for revocation date");
            }
            this.revocationDate = derValue.data.getGeneralizedTime();
        }
        if (derValue.data.available() == 0) {
            return;
        }
        this.extensions = new CRLExtensions(derValue.toDerInputStream());
    }

    public static X509CRLEntryImpl toImpl(X509CRLEntry x509CRLEntry) {
        return x509CRLEntry instanceof X509CRLEntryImpl ? (X509CRLEntryImpl) x509CRLEntry : new X509CRLEntryImpl(x509CRLEntry.getEncoded());
    }

    public void encode(DerOutputStream derOutputStream) {
        try {
            if (this.revokedCert == null) {
                DerOutputStream derOutputStream2 = new DerOutputStream();
                this.serialNumber.encode(derOutputStream2);
                long time = this.revocationDate.getTime();
                Date date = this.revocationDate;
                if (time < YR_2050) {
                    derOutputStream2.putUTCTime(date);
                } else {
                    derOutputStream2.putGeneralizedTime(date);
                }
                CRLExtensions cRLExtensions = this.extensions;
                if (cRLExtensions != null) {
                    cRLExtensions.encode(derOutputStream2, false);
                }
                DerOutputStream derOutputStream3 = new DerOutputStream();
                derOutputStream3.write((byte) 48, derOutputStream2);
                this.revokedCert = derOutputStream3.toByteArray();
            }
            derOutputStream.write(this.revokedCert);
        } catch (IOException e) {
            f40.m2717m(e, "Encoding error: ");
        }
    }

    @Override // java.security.cert.X509CRLEntry
    public X500Principal getCertificateIssuer() {
        return this.certIssuer;
    }

    public CertificateIssuerExtension getCertificateIssuerExtension() {
        return (CertificateIssuerExtension) getExtension(PKIXExtensions.CertificateIssuer_Id);
    }

    @Override // java.security.cert.X509Extension
    public Set<String> getCriticalExtensionOIDs() {
        if (this.extensions == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        for (Extension extension : this.extensions.getAllExtensions()) {
            if (extension.isCritical()) {
                hashSet.add(extension.getExtensionId().toString());
            }
        }
        return hashSet;
    }

    @Override // java.security.cert.X509CRLEntry
    public byte[] getEncoded() {
        if (this.revokedCert == null) {
            encode(new DerOutputStream());
        }
        return (byte[]) this.revokedCert.clone();
    }

    public Extension getExtension(ObjectIdentifier objectIdentifier) {
        CRLExtensions cRLExtensions = this.extensions;
        if (cRLExtensions == null) {
            return null;
        }
        return cRLExtensions.get(OIDMap.getName(objectIdentifier));
    }

    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(String str) {
        Extension extensionNextElement;
        byte[] extensionValue;
        if (this.extensions == null) {
            return null;
        }
        try {
            String name = OIDMap.getName(new ObjectIdentifier(str));
            if (name == null) {
                ObjectIdentifier objectIdentifier = new ObjectIdentifier(str);
                Enumeration<Extension> elements = this.extensions.getElements();
                do {
                    if (!elements.hasMoreElements()) {
                        extensionNextElement = null;
                        break;
                    }
                    extensionNextElement = elements.nextElement();
                } while (!extensionNextElement.getExtensionId().equals(objectIdentifier));
            } else {
                extensionNextElement = this.extensions.get(name);
            }
            if (extensionNextElement == null || (extensionValue = extensionNextElement.getExtensionValue()) == null) {
                return null;
            }
            DerOutputStream derOutputStream = new DerOutputStream();
            derOutputStream.putOctetString(extensionValue);
            return derOutputStream.toByteArray();
        } catch (Exception unused) {
            return null;
        }
    }

    public Map<String, Extension> getExtensions() {
        Collection<Extension> allExtensions = this.extensions.getAllExtensions();
        HashMap map = new HashMap(allExtensions.size());
        for (Extension extension : allExtensions) {
            map.put(extension.getId(), extension);
        }
        return map;
    }

    @Override // java.security.cert.X509Extension
    public Set<String> getNonCriticalExtensionOIDs() {
        if (this.extensions == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        for (Extension extension : this.extensions.getAllExtensions()) {
            if (!extension.isCritical()) {
                hashSet.add(extension.getExtensionId().toString());
            }
        }
        return hashSet;
    }

    public Integer getReasonCode() {
        Extension extension = getExtension(PKIXExtensions.ReasonCode_Id);
        if (extension == null) {
            return null;
        }
        return (Integer) ((CRLReasonCodeExtension) extension).get(CRLReasonCodeExtension.REASON);
    }

    @Override // java.security.cert.X509CRLEntry
    public Date getRevocationDate() {
        return new Date(this.revocationDate.getTime());
    }

    @Override // java.security.cert.X509CRLEntry
    public BigInteger getSerialNumber() {
        return this.serialNumber.getNumber();
    }

    @Override // java.security.cert.X509CRLEntry
    public boolean hasExtensions() {
        return this.extensions != null;
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        CRLExtensions cRLExtensions = this.extensions;
        if (cRLExtensions == null) {
            return false;
        }
        return cRLExtensions.hasUnsupportedCriticalExtension();
    }

    public void setCertificateIssuer(X500Principal x500Principal, X500Principal x500Principal2) {
        if (x500Principal.equals(x500Principal2)) {
            this.certIssuer = null;
        } else {
            this.certIssuer = x500Principal2;
        }
    }

    @Override // java.security.cert.X509CRLEntry
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.serialNumber.toString());
        sb.append("  On: " + this.revocationDate.toString());
        if (this.certIssuer != null) {
            sb.append("\n    Certificate issuer: " + this.certIssuer);
        }
        CRLExtensions cRLExtensions = this.extensions;
        if (cRLExtensions != null) {
            Object[] array = cRLExtensions.getAllExtensions().toArray();
            sb.append("\n    CRL Entry Extensions: " + array.length);
            int i = 0;
            while (i < array.length) {
                StringBuilder sb2 = new StringBuilder("\n    [");
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
        }
        sb.append("\n");
        return sb.toString();
    }

    public X509CRLEntryImpl(BigInteger bigInteger, Date date, CRLExtensions cRLExtensions) {
        this.serialNumber = null;
        this.revocationDate = null;
        this.extensions = null;
        this.revokedCert = null;
        this.serialNumber = new SerialNumber(bigInteger);
        this.revocationDate = date;
        this.extensions = cRLExtensions;
    }

    @Override // java.security.cert.X509CRLEntry
    public CRLReason getRevocationReason() {
        Extension extension = getExtension(PKIXExtensions.ReasonCode_Id);
        if (extension == null) {
            return null;
        }
        return ((CRLReasonCodeExtension) extension).getReasonCode();
    }

    public X509CRLEntryImpl(BigInteger bigInteger, Date date) {
        this.serialNumber = null;
        this.revocationDate = null;
        this.extensions = null;
        this.revokedCert = null;
        this.serialNumber = new SerialNumber(bigInteger);
        this.revocationDate = date;
    }

    public X509CRLEntryImpl(DerValue derValue) throws CRLException {
        this.serialNumber = null;
        this.revocationDate = null;
        this.extensions = null;
        this.revokedCert = null;
        try {
            parse(derValue);
        } catch (IOException e) {
            this.revokedCert = null;
            f40.m2717m(e, "Parsing error: ");
            throw null;
        }
    }
}
