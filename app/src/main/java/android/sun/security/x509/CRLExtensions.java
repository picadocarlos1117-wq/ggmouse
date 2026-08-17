package android.sun.security.x509;

import android.sun.security.util.DerInputStream;
import android.sun.security.util.DerOutputStream;
import android.sun.security.util.DerValue;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.security.cert.CRLException;
import java.security.cert.CertificateException;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import p000.f40;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class CRLExtensions {
    private static final Class[] PARAMS = {Boolean.class, Object.class};
    private Hashtable<String, Extension> map = new Hashtable<>();
    private boolean unsupportedCritExt = false;

    public CRLExtensions(DerInputStream derInputStream) throws CRLException {
        init(derInputStream);
    }

    private void init(DerInputStream derInputStream) throws CRLException {
        try {
            byte bPeekByte = (byte) derInputStream.peekByte();
            if ((bPeekByte & DerValue.TAG_PRIVATE) == 128 && (bPeekByte & 31) == 0) {
                derInputStream = derInputStream.getDerValue().data;
            }
            for (DerValue derValue : derInputStream.getSequence(5)) {
                parseExtension(new Extension(derValue));
            }
        } catch (IOException e) {
            f40.m2717m(e, "Parsing error: ");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void parseExtension(Extension extension) throws CRLException {
        try {
            Class cls = OIDMap.getClass(extension.getExtensionId());
            if (cls != null) {
                CertAttrSet certAttrSet = (CertAttrSet) cls.getConstructor(PARAMS).newInstance(Boolean.valueOf(extension.isCritical()), extension.getExtensionValue());
                if (this.map.put(certAttrSet.getName(), (Extension) certAttrSet) != null) {
                    throw new CRLException("Duplicate extensions not allowed");
                }
            } else {
                if (extension.isCritical()) {
                    this.unsupportedCritExt = true;
                }
                if (this.map.put(extension.getExtensionId().toString(), extension) != null) {
                    throw new CRLException("Duplicate extensions not allowed");
                }
            }
        } catch (InvocationTargetException e) {
            throw new CRLException(e.getTargetException().getMessage());
        } catch (Exception e2) {
            throw new CRLException(e2.toString());
        }
    }

    public void delete(String str) {
        this.map.remove(str);
    }

    public void encode(OutputStream outputStream, boolean z) throws CRLException {
        try {
            DerOutputStream derOutputStream = new DerOutputStream();
            for (Object obj : this.map.values().toArray()) {
                if (obj instanceof CertAttrSet) {
                    ((CertAttrSet) obj).encode(derOutputStream);
                } else {
                    if (!(obj instanceof Extension)) {
                        throw new CRLException("Illegal extension object");
                    }
                    ((Extension) obj).encode(derOutputStream);
                }
            }
            DerOutputStream derOutputStream2 = new DerOutputStream();
            derOutputStream2.write((byte) 48, derOutputStream);
            DerOutputStream derOutputStream3 = new DerOutputStream();
            if (z) {
                derOutputStream3.write(DerValue.createTag(DerValue.TAG_CONTEXT, true, (byte) 0), derOutputStream2);
                derOutputStream2 = derOutputStream3;
            }
            outputStream.write(derOutputStream2.toByteArray());
        } catch (IOException e) {
            f40.m2717m(e, "Encoding error: ");
        } catch (CertificateException e2) {
            f40.m2717m(e2, "Encoding error: ");
        }
    }

    public boolean equals(Object obj) {
        Object[] array;
        int length;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CRLExtensions) || (length = (array = ((CRLExtensions) obj).getAllExtensions().toArray()).length) != this.map.size()) {
            return false;
        }
        String string = null;
        for (int i = 0; i < length; i++) {
            Object obj2 = array[i];
            if (obj2 instanceof CertAttrSet) {
                string = ((CertAttrSet) obj2).getName();
            }
            Extension extension = (Extension) array[i];
            if (string == null) {
                string = extension.getExtensionId().toString();
            }
            Extension extension2 = this.map.get(string);
            if (extension2 == null || !extension2.equals(extension)) {
                return false;
            }
        }
        return true;
    }

    public Extension get(String str) {
        if (new X509AttributeName(str).getPrefix().equalsIgnoreCase(X509CertImpl.NAME)) {
            str = str.substring(str.lastIndexOf(".") + 1);
        }
        return this.map.get(str);
    }

    public Collection<Extension> getAllExtensions() {
        return this.map.values();
    }

    public Enumeration<Extension> getElements() {
        return this.map.elements();
    }

    public boolean hasUnsupportedCriticalExtension() {
        return this.unsupportedCritExt;
    }

    public int hashCode() {
        return this.map.hashCode();
    }

    public void set(String str, Object obj) {
        this.map.put(str, (Extension) obj);
    }

    public String toString() {
        return this.map.toString();
    }

    public CRLExtensions() {
    }
}
