package p000;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/* JADX INFO: renamed from: w */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1536w extends AbstractC1164o {
    /* JADX INFO: renamed from: q */
    public static AbstractC1536w m6675q(byte[] bArr) throws IOException {
        C1090m c1090m = new C1090m(new ByteArrayInputStream(bArr), bArr.length, false);
        try {
            AbstractC1536w abstractC1536wM4339l = c1090m.m4339l();
            if (c1090m.available() == 0) {
                return abstractC1536wM4339l;
            }
            throw new IOException("Extra data detected in stream");
        } catch (ClassCastException unused) {
            ca0.m1178j("cannot recognise object in stream");
            return null;
        }
    }

    @Override // p000.AbstractC1164o, p000.InterfaceC0696h
    /* JADX INFO: renamed from: b */
    public final AbstractC1536w mo696b() {
        return this;
    }

    @Override // p000.AbstractC1164o
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC0696h) && mo2j(((InterfaceC0696h) obj).mo696b());
    }

    @Override // p000.AbstractC1164o
    public abstract int hashCode();

    /* JADX INFO: renamed from: j */
    public abstract boolean mo2j(AbstractC1536w abstractC1536w);

    /* JADX INFO: renamed from: k */
    public abstract void mo1094k(C1462u c1462u, boolean z);

    /* JADX INFO: renamed from: m */
    public abstract boolean mo3m();

    /* JADX INFO: renamed from: n */
    public abstract int mo1095n(boolean z);

    /* JADX INFO: renamed from: p */
    public final boolean m6676p(AbstractC1536w abstractC1536w) {
        return this == abstractC1536w || mo2j(abstractC1536w);
    }

    /* JADX INFO: renamed from: s */
    public AbstractC1536w mo4s() {
        return this;
    }

    /* JADX INFO: renamed from: t */
    public AbstractC1536w mo5t() {
        return this;
    }
}
