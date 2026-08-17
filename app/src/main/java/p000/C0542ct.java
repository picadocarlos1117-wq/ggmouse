package p000;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: ct */
/* JADX INFO: loaded from: classes3.dex */
public final class C0542ct extends InputStream {

    /* JADX INFO: renamed from: a */
    public final C0082b0 f2607a;

    /* JADX INFO: renamed from: b */
    public boolean f2608b = true;

    /* JADX INFO: renamed from: c */
    public InputStream f2609c;

    public C0542ct(C0082b0 c0082b0) {
        this.f2607a = c0082b0;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC1425t m2120c() throws IOException {
        C0082b0 c0082b0 = this.f2607a;
        int i = ((qs0) c0082b0.f1104c).read();
        InterfaceC0696h interfaceC0696hM807i = i < 0 ? null : c0082b0.m807i(i);
        if (interfaceC0696hM807i == null) {
            return null;
        }
        if (interfaceC0696hM807i instanceof InterfaceC1425t) {
            return (InterfaceC1425t) interfaceC0696hM807i;
        }
        lv1.m4305q(interfaceC0696hM807i.getClass(), "unknown object encountered: ");
        return null;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        InterfaceC1425t interfaceC1425tM2120c;
        int i3 = 0;
        if (this.f2609c == null) {
            if (!this.f2608b || (interfaceC1425tM2120c = m2120c()) == null) {
                return -1;
            }
            this.f2608b = false;
            this.f2609c = interfaceC1425tM2120c.mo2978a();
        }
        while (true) {
            int i4 = this.f2609c.read(bArr, i + i3, i2 - i3);
            if (i4 >= 0) {
                i3 += i4;
                if (i3 == i2) {
                    return i3;
                }
            } else {
                InterfaceC1425t interfaceC1425tM2120c2 = m2120c();
                if (interfaceC1425tM2120c2 == null) {
                    this.f2609c = null;
                    if (i3 < 1) {
                        return -1;
                    }
                    return i3;
                }
                this.f2609c = interfaceC1425tM2120c2.mo2978a();
            }
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        InterfaceC1425t interfaceC1425tM2120c;
        if (this.f2609c == null) {
            if (!this.f2608b || (interfaceC1425tM2120c = m2120c()) == null) {
                return -1;
            }
            this.f2608b = false;
            this.f2609c = interfaceC1425tM2120c.mo2978a();
        }
        while (true) {
            int i = this.f2609c.read();
            if (i >= 0) {
                return i;
            }
            InterfaceC1425t interfaceC1425tM2120c2 = m2120c();
            if (interfaceC1425tM2120c2 == null) {
                this.f2609c = null;
                return -1;
            }
            this.f2609c = interfaceC1425tM2120c2.mo2978a();
        }
    }
}
