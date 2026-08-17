package p000;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class h10 extends qs0 {

    /* JADX INFO: renamed from: e */
    public static final byte[] f4386e = new byte[0];

    /* JADX INFO: renamed from: c */
    public final int f4387c;

    /* JADX INFO: renamed from: d */
    public int f4388d;

    public h10(InputStream inputStream, int i, int i2) {
        super(inputStream, i2);
        if (i <= 0) {
            if (i < 0) {
                f40.m2713i("negative lengths not allowed");
                throw null;
            }
            m5606c();
        }
        this.f4387c = i;
        this.f4388d = i;
    }

    /* JADX INFO: renamed from: d */
    public final byte[] m3089d() {
        int i = this.f4388d;
        if (i == 0) {
            return f4386e;
        }
        int i2 = this.f9571b;
        if (i >= i2) {
            throw new IOException("corrupted stream - out of bounds length found: " + this.f4388d + " >= " + i2);
        }
        byte[] bArr = new byte[i];
        int iM4676p0 = i - o21.m4676p0(this.f9570a, bArr, i);
        this.f4388d = iM4676p0;
        if (iM4676p0 == 0) {
            m5606c();
            return bArr;
        }
        f40.m2709e(this.f4387c, this.f4388d);
        return null;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f4388d;
        if (i3 == 0) {
            return -1;
        }
        int i4 = this.f9570a.read(bArr, i, Math.min(i2, i3));
        if (i4 < 0) {
            f40.m2709e(this.f4387c, this.f4388d);
            return 0;
        }
        int i5 = this.f4388d - i4;
        this.f4388d = i5;
        if (i5 == 0) {
            m5606c();
        }
        return i4;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f4388d == 0) {
            return -1;
        }
        int i = this.f9570a.read();
        if (i < 0) {
            f40.m2709e(this.f4387c, this.f4388d);
            return 0;
        }
        int i2 = this.f4388d - 1;
        this.f4388d = i2;
        if (i2 == 0) {
            m5606c();
        }
        return i;
    }
}
