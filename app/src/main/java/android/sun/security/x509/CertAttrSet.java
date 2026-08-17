package android.sun.security.x509;

import java.io.OutputStream;
import java.util.Enumeration;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public interface CertAttrSet<T> {
    void delete(String str);

    void encode(OutputStream outputStream);

    Object get(String str);

    Enumeration<T> getElements();

    String getName();

    void set(String str, Object obj);

    String toString();
}
