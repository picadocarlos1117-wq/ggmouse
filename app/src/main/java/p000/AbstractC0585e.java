package p000;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: e */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0585e extends AbstractC1536w implements InterfaceC0622f {

    /* JADX INFO: renamed from: b */
    public static final C0549d f3084b = new C0549d(AbstractC0585e.class, 0);

    /* JADX INFO: renamed from: c */
    public static final char[] f3085c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a */
    public final byte[] f3086a;

    public AbstractC0585e(byte[] bArr, int i) {
        if (bArr == null) {
            l41.m4051t("'data' cannot be null");
            throw null;
        }
        if (bArr.length == 0 && i != 0) {
            f40.m2713i("zero length data with non-zero pad bits");
            throw null;
        }
        if (i > 7 || i < 0) {
            f40.m2713i("pad bits cannot be greater than 7 or less than 0");
            throw null;
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length + 1];
        System.arraycopy(bArr, 0, bArr2, 1, length);
        bArr2[0] = (byte) i;
        this.f3086a = bArr2;
    }

    /* JADX INFO: renamed from: u */
    public static AbstractC0585e m2433u(byte[] bArr) {
        String str;
        int length = bArr.length;
        if (length >= 1) {
            int i = bArr[0] & 255;
            if (i > 0) {
                if (i > 7 || length < 2) {
                    str = "invalid pad bits detected";
                } else {
                    byte b = bArr[length - 1];
                    if (b != ((byte) ((255 << i) & b))) {
                        return new C0618ew(bArr, 1, (byte) 0);
                    }
                }
            }
            return new C0618ew(bArr, 0, (byte) 0);
        }
        str = "truncated BIT STRING detected";
        f40.m2713i(str);
        return null;
    }

    /* JADX INFO: renamed from: w */
    public static AbstractC0585e m2434w(Object obj) {
        String strM3611i;
        if (obj == null || (obj instanceof AbstractC0585e)) {
            return (AbstractC0585e) obj;
        }
        if (!(obj instanceof InterfaceC0696h)) {
            if (obj instanceof byte[]) {
                try {
                    return (AbstractC0585e) f3084b.m2151b((byte[]) obj);
                } catch (IOException e) {
                    strM3611i = jd0.m3611i(e, new StringBuilder("failed to construct BIT STRING from byte[]: "));
                }
            }
            f40.m2713i(strM3611i);
            return null;
        }
        AbstractC1536w abstractC1536wMo696b = ((InterfaceC0696h) obj).mo696b();
        if (abstractC1536wMo696b instanceof AbstractC0585e) {
            return (AbstractC0585e) abstractC1536wMo696b;
        }
        strM3611i = "illegal object in getInstance: ".concat(obj.getClass().getName());
        f40.m2713i(strM3611i);
        return null;
    }

    @Override // p000.InterfaceC0622f
    /* JADX INFO: renamed from: e */
    public final InputStream mo2350e() {
        byte[] bArr = this.f3086a;
        return new ByteArrayInputStream(bArr, 1, bArr.length - 1);
    }

    @Override // p000.InterfaceC0622f
    /* JADX INFO: renamed from: f */
    public final int mo2351f() {
        return this.f3086a[0] & 255;
    }

    @Override // p000.wm0
    /* JADX INFO: renamed from: h */
    public final AbstractC1536w mo735h() {
        return this;
    }

    @Override // p000.AbstractC1536w, p000.AbstractC1164o
    public final int hashCode() {
        byte[] bArr = this.f3086a;
        if (bArr.length < 2) {
            return 1;
        }
        int i = 0;
        int i2 = bArr[0] & 255;
        int length = bArr.length;
        int i3 = length - 1;
        byte b = (byte) ((255 << i2) & bArr[i3]);
        if (bArr != null) {
            i = length;
            while (true) {
                i3--;
                if (i3 < 0) {
                    break;
                }
                i = (i * 257) ^ bArr[i3];
            }
        }
        return (i * 257) ^ b;
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: j */
    public final boolean mo2j(AbstractC1536w abstractC1536w) {
        if (!(abstractC1536w instanceof AbstractC0585e)) {
            return false;
        }
        byte[] bArr = ((AbstractC0585e) abstractC1536w).f3086a;
        byte[] bArr2 = this.f3086a;
        int length = bArr2.length;
        if (bArr.length != length) {
            return false;
        }
        if (length == 1) {
            return true;
        }
        int i = length - 1;
        for (int i2 = 0; i2 < i; i2++) {
            if (bArr2[i2] != bArr[i2]) {
                return false;
            }
        }
        int i3 = 255 << (bArr2[0] & 255);
        return ((byte) (bArr2[i] & i3)) == ((byte) (bArr[i] & i3));
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: s */
    public AbstractC1536w mo4s() {
        return new C0618ew(this.f3086a, 0, (byte) 0);
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: t */
    public AbstractC1536w mo5t() {
        return new C0618ew(this.f3086a, 1, (byte) 0);
    }

    public final String toString() {
        try {
            byte[] encoded = getEncoded();
            StringBuffer stringBuffer = new StringBuffer((encoded.length * 2) + 1);
            stringBuffer.append('#');
            for (int i = 0; i != encoded.length; i++) {
                byte b = encoded[i];
                char[] cArr = f3085c;
                stringBuffer.append(cArr[(b >>> 4) & 15]);
                stringBuffer.append(cArr[b & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException e) {
            throw new C1499v(jd0.m3611i(e, new StringBuilder("Internal error encoding BitString: ")), e, 0);
        }
    }

    /* JADX INFO: renamed from: v */
    public final byte[] m2435v() {
        byte[] bArr = this.f3086a;
        if (bArr.length == 1) {
            return AbstractC1388s.f10173c;
        }
        int i = bArr[0] & 255;
        byte[] bArrM6067k = sc2.m6067k(1, bArr.length, bArr);
        int length = bArrM6067k.length - 1;
        bArrM6067k[length] = (byte) (((byte) (255 << i)) & bArrM6067k[length]);
        return bArrM6067k;
    }

    /* JADX INFO: renamed from: x */
    public final byte[] m2436x() {
        byte[] bArr = this.f3086a;
        if (bArr[0] == 0) {
            return sc2.m6067k(1, bArr.length, bArr);
        }
        f40.m2719o("attempt to get non-octet aligned data from BIT STRING");
        return null;
    }

    public AbstractC0585e(byte[] bArr) {
        this.f3086a = bArr;
    }
}
