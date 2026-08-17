package android.sun.security.x509;

import android.sun.security.util.DerOutputStream;
import android.sun.security.util.DerValue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.ca0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class GeneralNames {
    private final List<GeneralName> names;

    public GeneralNames(DerValue derValue) throws IOException {
        this();
        if (derValue.tag != 48) {
            ca0.m1178j("Invalid encoding for GeneralNames.");
            throw null;
        }
        if (derValue.data.available() == 0) {
            ca0.m1178j("No data available in passed DER encoded value.");
            throw null;
        }
        while (derValue.data.available() != 0) {
            add(new GeneralName(derValue.data.getDerValue()));
        }
    }

    public GeneralNames add(GeneralName generalName) {
        generalName.getClass();
        this.names.add(generalName);
        return this;
    }

    public void encode(DerOutputStream derOutputStream) throws IOException {
        if (isEmpty()) {
            return;
        }
        DerOutputStream derOutputStream2 = new DerOutputStream();
        Iterator<GeneralName> it = this.names.iterator();
        while (it.hasNext()) {
            it.next().encode(derOutputStream2);
        }
        derOutputStream.write((byte) 48, derOutputStream2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GeneralNames) {
            return this.names.equals(((GeneralNames) obj).names);
        }
        return false;
    }

    public GeneralName get(int i) {
        return this.names.get(i);
    }

    public int hashCode() {
        return this.names.hashCode();
    }

    public boolean isEmpty() {
        return this.names.isEmpty();
    }

    public Iterator<GeneralName> iterator() {
        return this.names.iterator();
    }

    public List<GeneralName> names() {
        return this.names;
    }

    public int size() {
        return this.names.size();
    }

    public String toString() {
        return this.names.toString();
    }

    public GeneralNames() {
        this.names = new ArrayList();
    }
}
