package p000;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: bt */
/* JADX INFO: loaded from: classes3.dex */
public final class C0111bt extends InputStream {

    /* JADX INFO: renamed from: a */
    public final C0082b0 f1516a;

    /* JADX INFO: renamed from: b */
    public boolean f1517b = true;

    /* JADX INFO: renamed from: c */
    public int f1518c = 0;

    /* JADX INFO: renamed from: d */
    public InterfaceC0622f f1519d;

    /* JADX INFO: renamed from: e */
    public InputStream f1520e;

    public C0111bt(C0082b0 c0082b0) {
        this.f1516a = c0082b0;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC0622f m1045c() throws IOException {
        C0082b0 c0082b0 = this.f1516a;
        int i = ((qs0) c0082b0.f1104c).read();
        InterfaceC0696h interfaceC0696hM807i = i < 0 ? null : c0082b0.m807i(i);
        if (interfaceC0696hM807i == null) {
            return null;
        }
        if (!(interfaceC0696hM807i instanceof InterfaceC0622f)) {
            lv1.m4305q(interfaceC0696hM807i.getClass(), "unknown object encountered: ");
            return null;
        }
        if (this.f1518c == 0) {
            return (InterfaceC0622f) interfaceC0696hM807i;
        }
        ca0.m1178j("only the last nested bitstring can have padding");
        return null;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        if (this.f1520e == null) {
            if (!this.f1517b) {
                return -1;
            }
            InterfaceC0622f interfaceC0622fM1045c = m1045c();
            this.f1519d = interfaceC0622fM1045c;
            if (interfaceC0622fM1045c == null) {
                return -1;
            }
            this.f1517b = false;
            this.f1520e = interfaceC0622fM1045c.mo2350e();
        }
        while (true) {
            int i4 = this.f1520e.read(bArr, i + i3, i2 - i3);
            if (i4 >= 0) {
                i3 += i4;
                if (i3 == i2) {
                    return i3;
                }
            } else {
                this.f1518c = this.f1519d.mo2351f();
                InterfaceC0622f interfaceC0622fM1045c2 = m1045c();
                this.f1519d = interfaceC0622fM1045c2;
                if (interfaceC0622fM1045c2 == null) {
                    this.f1520e = null;
                    if (i3 < 1) {
                        return -1;
                    }
                    return i3;
                }
                this.f1520e = interfaceC0622fM1045c2.mo2350e();
            }
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f1520e == null) {
            if (this.f1517b) {
                InterfaceC0622f interfaceC0622fM1045c = m1045c();
                this.f1519d = interfaceC0622fM1045c;
                if (interfaceC0622fM1045c != null) {
                    this.f1517b = false;
                    this.f1520e = interfaceC0622fM1045c.mo2350e();
                }
            }
            return -1;
        }
        while (true) {
            int i = this.f1520e.read();
            if (i >= 0) {
                return i;
            }
            this.f1518c = this.f1519d.mo2351f();
            InterfaceC0622f interfaceC0622fM1045c2 = m1045c();
            this.f1519d = interfaceC0622fM1045c2;
            if (interfaceC0622fM1045c2 == null) {
                this.f1520e = null;
                return -1;
            }
            this.f1520e = interfaceC0622fM1045c2.mo2350e();
        }
    }
}
