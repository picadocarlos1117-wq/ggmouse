package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: u */
/* JADX INFO: loaded from: classes3.dex */
public class C1462u {

    /* JADX INFO: renamed from: a */
    public final ByteArrayOutputStream f11078a;

    public C1462u() {
        this.f11078a = new ByteArrayOutputStream();
    }

    /* JADX INFO: renamed from: e */
    public static int m6357e(int i) {
        if (i < 128) {
            return 1;
        }
        int i2 = 2;
        while (true) {
            i >>>= 8;
            if (i == 0) {
                return i2;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: f */
    public static int m6358f(int i, boolean z) {
        return m6357e(i) + (z ? 1 : 0) + i;
    }

    /* JADX INFO: renamed from: g */
    public static int m6359g(int i) {
        if (i < 31) {
            return 1;
        }
        int i2 = 2;
        while (true) {
            i >>>= 7;
            if (i == 0) {
                return i2;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m6360a(r60 r60Var) {
        try {
            this.f11078a.write(r60Var.getEncoded());
        } catch (Exception e) {
            l41.m4043l(e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m6361b(byte[] bArr) {
        try {
            this.f11078a.write(bArr);
        } catch (Exception e) {
            l41.m4043l(e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: c */
    public C1160nw mo4615c() {
        return new C1160nw(this.f11078a);
    }

    /* JADX INFO: renamed from: d */
    public C1680zw mo6362d() {
        return new C1680zw(this.f11078a);
    }

    /* JADX INFO: renamed from: h */
    public void m6363h(int i) {
        ByteArrayOutputStream byteArrayOutputStream = this.f11078a;
        byteArrayOutputStream.write((byte) (i >>> 24));
        byteArrayOutputStream.write((byte) (i >>> 16));
        byteArrayOutputStream.write((byte) (i >>> 8));
        byteArrayOutputStream.write((byte) i);
    }

    /* JADX INFO: renamed from: i */
    public void m6364i(int i) throws IOException {
        this.f11078a.write(i);
    }

    /* JADX INFO: renamed from: j */
    public void m6365j(byte[] bArr, int i, int i2) throws IOException {
        this.f11078a.write(bArr, i, i2);
    }

    /* JADX INFO: renamed from: k */
    public void m6366k(int i) throws IOException {
        if (i < 128) {
            m6364i(i);
            return;
        }
        int i2 = 5;
        byte[] bArr = new byte[5];
        while (true) {
            int i3 = i2 - 1;
            bArr[i3] = (byte) i;
            i >>>= 8;
            if (i == 0) {
                int i4 = i2 - 2;
                bArr[i4] = (byte) ((5 - i3) | 128);
                m6365j(bArr, i4, 6 - i3);
                return;
            }
            i2 = i3;
        }
    }

    /* JADX INFO: renamed from: l */
    public void mo4616l(InterfaceC0696h[] interfaceC0696hArr) {
        for (InterfaceC0696h interfaceC0696h : interfaceC0696hArr) {
            interfaceC0696h.mo696b().mo1094k(this, true);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m6367m(int i, boolean z, byte[] bArr) {
        m6370p(i, z);
        m6366k(bArr.length);
        m6365j(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: n */
    public void m6368n(boolean z, int i, InterfaceC0696h[] interfaceC0696hArr) throws IOException {
        m6370p(i, z);
        m6364i(128);
        mo4616l(interfaceC0696hArr);
        m6364i(0);
        m6364i(0);
    }

    /* JADX INFO: renamed from: o */
    public void m6369o(int i, int i2) throws IOException {
        if (i2 < 31) {
            m6364i(i | i2);
            return;
        }
        byte[] bArr = new byte[6];
        int i3 = 5;
        bArr[5] = (byte) (i2 & 127);
        while (i2 > 127) {
            i2 >>>= 7;
            i3--;
            bArr[i3] = (byte) ((i2 & 127) | 128);
        }
        int i4 = i3 - 1;
        bArr[i4] = (byte) (i | 31);
        m6365j(bArr, i4, 6 - i4);
    }

    /* JADX INFO: renamed from: p */
    public void m6370p(int i, boolean z) throws IOException {
        if (z) {
            m6364i(i);
        }
    }

    /* JADX INFO: renamed from: q */
    public void mo4617q(AbstractC1536w abstractC1536w) {
        abstractC1536w.mo1094k(this, true);
    }

    /* JADX INFO: renamed from: r */
    public void mo4618r(AbstractC1536w[] abstractC1536wArr) {
        for (AbstractC1536w abstractC1536w : abstractC1536wArr) {
            abstractC1536w.mo1094k(this, true);
        }
    }

    public C1462u(ByteArrayOutputStream byteArrayOutputStream) {
        this.f11078a = byteArrayOutputStream;
    }
}
