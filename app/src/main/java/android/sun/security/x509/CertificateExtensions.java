package android.sun.security.x509;

import android.sun.misc.HexDumpEncoder;
import android.sun.security.util.Debug;
import android.sun.security.util.DerInputStream;
import android.sun.security.util.DerOutputStream;
import android.sun.security.util.DerValue;
import android.sun.security.util.ObjectIdentifier;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import p000.AbstractC1308pu;
import p000.ca0;
import p000.lv1;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class CertificateExtensions implements CertAttrSet<Extension> {
    public static final String IDENT = "x509.info.extensions";
    public static final String NAME = "extensions";
    private Map<String, Extension> unparseableExtensions;
    private static final Debug debug = Debug.getInstance(X509CertImpl.NAME);
    private static Class[] PARAMS = {Boolean.class, Object.class};
    private Hashtable<String, Extension> map = new Hashtable<>();
    private boolean unsupportedCritExt = false;

    public CertificateExtensions(DerInputStream derInputStream) throws IOException {
        init(derInputStream);
    }

    private void init(DerInputStream derInputStream) throws IOException {
        for (DerValue derValue : derInputStream.getSequence(5)) {
            parseExtension(new Extension(derValue));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void parseExtension(Extension extension) throws IOException {
        try {
            Class cls = OIDMap.getClass(extension.getExtensionId());
            if (cls != null) {
                CertAttrSet certAttrSet = (CertAttrSet) cls.getConstructor(PARAMS).newInstance(Boolean.valueOf(extension.isCritical()), extension.getExtensionValue());
                if (this.map.put(certAttrSet.getName(), (Extension) certAttrSet) != null) {
                    throw new IOException("Duplicate extensions not allowed");
                }
            } else {
                if (extension.isCritical()) {
                    this.unsupportedCritExt = true;
                }
                if (this.map.put(extension.getExtensionId().toString(), extension) != null) {
                    throw new IOException("Duplicate extensions not allowed");
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (InvocationTargetException e2) {
            Throwable targetException = e2.getTargetException();
            if (extension.isCritical()) {
                if (!(targetException instanceof IOException)) {
                    throw ((IOException) new IOException(targetException.toString()).initCause(targetException));
                }
                throw ((IOException) targetException);
            }
            if (this.unparseableExtensions == null) {
                this.unparseableExtensions = new HashMap();
            }
            this.unparseableExtensions.put(extension.getExtensionId().toString(), new UnparseableExtension(extension, targetException));
            Debug debug2 = debug;
            if (debug2 != null) {
                debug2.println("Error parsing extension: " + extension);
                targetException.printStackTrace();
                System.err.println(new HexDumpEncoder().encodeBuffer(extension.getExtensionValue()));
            }
        } catch (Exception e3) {
            throw ((IOException) new IOException(e3.toString()).initCause(e3));
        }
    }

    @Override // android.sun.security.x509.CertAttrSet
    public void delete(String str) throws IOException {
        if (this.map.get(str) != null) {
            this.map.remove(str);
        } else {
            ca0.m1178j(AbstractC1308pu.m5339f("No extension found with name ", str));
        }
    }

    public void encode(OutputStream outputStream, boolean z) {
        DerOutputStream derOutputStream = new DerOutputStream();
        for (Object obj : this.map.values().toArray()) {
            if (obj instanceof CertAttrSet) {
                ((CertAttrSet) obj).encode(derOutputStream);
            } else {
                if (!(obj instanceof Extension)) {
                    lv1.m4299k("Illegal extension object");
                    return;
                }
                ((Extension) obj).encode(derOutputStream);
            }
        }
        DerOutputStream derOutputStream2 = new DerOutputStream();
        derOutputStream2.write((byte) 48, derOutputStream);
        if (!z) {
            DerOutputStream derOutputStream3 = new DerOutputStream();
            derOutputStream3.write(DerValue.createTag(DerValue.TAG_CONTEXT, true, (byte) 3), derOutputStream2);
            derOutputStream2 = derOutputStream3;
        }
        outputStream.write(derOutputStream2.toByteArray());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CertificateExtensions)) {
            return false;
        }
        CertificateExtensions certificateExtensions = (CertificateExtensions) obj;
        Object[] array = certificateExtensions.getAllExtensions().toArray();
        int length = array.length;
        if (length != this.map.size()) {
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
        return getUnparseableExtensions().equals(certificateExtensions.getUnparseableExtensions());
    }

    @Override // android.sun.security.x509.CertAttrSet
    public Object get(String str) throws IOException {
        Extension extension = this.map.get(str);
        if (extension != null) {
            return extension;
        }
        ca0.m1178j(AbstractC1308pu.m5339f("No extension found with name ", str));
        return null;
    }

    public Collection<Extension> getAllExtensions() {
        return this.map.values();
    }

    @Override // android.sun.security.x509.CertAttrSet
    public Enumeration<Extension> getElements() {
        return this.map.elements();
    }

    @Override // android.sun.security.x509.CertAttrSet
    public String getName() {
        return "extensions";
    }

    public String getNameByOid(ObjectIdentifier objectIdentifier) {
        for (String str : this.map.keySet()) {
            if (this.map.get(str).getExtensionId().equals(objectIdentifier)) {
                return str;
            }
        }
        return null;
    }

    public Map<String, Extension> getUnparseableExtensions() {
        Map<String, Extension> map = this.unparseableExtensions;
        return map == null ? Collections.EMPTY_MAP : map;
    }

    public boolean hasUnsupportedCriticalExtension() {
        return this.unsupportedCritExt;
    }

    public int hashCode() {
        return getUnparseableExtensions().hashCode() + this.map.hashCode();
    }

    @Override // android.sun.security.x509.CertAttrSet
    public void set(String str, Object obj) throws IOException {
        if (obj instanceof Extension) {
            this.map.put(str, (Extension) obj);
        } else {
            ca0.m1178j("Unknown extension type.");
        }
    }

    @Override // android.sun.security.x509.CertAttrSet
    public String toString() {
        return this.map.toString();
    }

    public CertificateExtensions() {
    }

    @Override // android.sun.security.x509.CertAttrSet
    public void encode(OutputStream outputStream) {
        encode(outputStream, false);
    }
}
