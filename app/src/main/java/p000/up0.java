package p000;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class up0 extends InputStream {

    /* JADX INFO: renamed from: a */
    public Iterator f11374a;

    /* JADX INFO: renamed from: b */
    public ByteBuffer f11375b;

    /* JADX INFO: renamed from: c */
    public int f11376c;

    /* JADX INFO: renamed from: d */
    public int f11377d;

    /* JADX INFO: renamed from: e */
    public int f11378e;

    /* JADX INFO: renamed from: f */
    public boolean f11379f;

    /* JADX INFO: renamed from: g */
    public byte[] f11380g;

    /* JADX INFO: renamed from: m */
    public int f11381m;

    /* JADX INFO: renamed from: n */
    public long f11382n;

    /* JADX INFO: renamed from: c */
    public final boolean m6517c() {
        this.f11377d++;
        Iterator it = this.f11374a;
        if (!it.hasNext()) {
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer) it.next();
        this.f11375b = byteBuffer;
        this.f11378e = byteBuffer.position();
        if (this.f11375b.hasArray()) {
            this.f11379f = true;
            this.f11380g = this.f11375b.array();
            this.f11381m = this.f11375b.arrayOffset();
            return true;
        }
        this.f11379f = false;
        this.f11382n = k42.f5664c.m3555j(k42.f5668g, this.f11375b);
        this.f11380g = null;
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final void m6518d(int i) {
        int i2 = this.f11378e + i;
        this.f11378e = i2;
        if (i2 == this.f11375b.limit()) {
            m6517c();
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (this.f11377d == this.f11376c) {
            return -1;
        }
        int iLimit = this.f11375b.limit();
        int i3 = this.f11378e;
        int i4 = iLimit - i3;
        if (i2 > i4) {
            i2 = i4;
        }
        if (this.f11379f) {
            System.arraycopy(this.f11380g, i3 + this.f11381m, bArr, i, i2);
            m6518d(i2);
            return i2;
        }
        int iPosition = this.f11375b.position();
        this.f11375b.position(this.f11378e);
        this.f11375b.get(bArr, i, i2);
        this.f11375b.position(iPosition);
        m6518d(i2);
        return i2;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f11377d == this.f11376c) {
            return -1;
        }
        if (this.f11379f) {
            int i = this.f11380g[this.f11378e + this.f11381m] & 255;
            m6518d(1);
            return i;
        }
        int iMo3099e = k42.f5664c.mo3099e(((long) this.f11378e) + this.f11382n) & 255;
        m6518d(1);
        return iMo3099e;
    }
}
