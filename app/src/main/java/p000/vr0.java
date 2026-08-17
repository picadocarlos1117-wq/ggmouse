package p000;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes3.dex */
public final class vr0 implements Enumeration {

    /* JADX INFO: renamed from: a */
    public C1090m f11753a;

    /* JADX INFO: renamed from: b */
    public AbstractC1536w f11754b;

    /* JADX INFO: renamed from: a */
    public final AbstractC1536w m6654a() {
        try {
            return this.f11753a.m4339l();
        } catch (IOException e) {
            throw new C1499v("malformed ASN.1: " + e, e, 0);
        }
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.f11754b != null;
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        AbstractC1536w abstractC1536w = this.f11754b;
        if (abstractC1536w != null) {
            this.f11754b = m6654a();
            return abstractC1536w;
        }
        ca0.m1185q();
        return null;
    }
}
