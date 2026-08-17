package p000;

import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: o */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1164o implements InterfaceC0696h, r60 {
    @Override // p000.InterfaceC0696h
    /* JADX INFO: renamed from: b */
    public abstract AbstractC1536w mo696b();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InterfaceC0696h) {
            return mo696b().m6676p(((InterfaceC0696h) obj).mo696b());
        }
        return false;
    }

    @Override // p000.r60
    public final byte[] getEncoded() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        mo696b().mo1094k(new C1462u(byteArrayOutputStream), true);
        return byteArrayOutputStream.toByteArray();
    }

    public int hashCode() {
        return mo696b().hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final byte[] m4629i() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new C1160nw(byteArrayOutputStream).mo4617q(mo696b());
        return byteArrayOutputStream.toByteArray();
    }
}
