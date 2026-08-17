package p000;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: vx */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class C1533vx extends nu0 {

    /* JADX INFO: renamed from: g */
    public be0 f11793g;

    /* JADX INFO: renamed from: m */
    public final C0580dv f11794m;

    /* JADX INFO: renamed from: n */
    public ByteBuffer f11795n;

    /* JADX INFO: renamed from: o */
    public boolean f11796o;

    /* JADX INFO: renamed from: p */
    public long f11797p;

    /* JADX INFO: renamed from: q */
    public ByteBuffer f11798q;

    /* JADX INFO: renamed from: r */
    public final int f11799r;

    static {
        a21.m54a("media3.decoder");
    }

    public C1533vx(int i) {
        super(1);
        this.f11794m = new C0580dv();
        this.f11799r = i;
    }

    /* JADX INFO: renamed from: r */
    public void mo5844r() {
        this.f7542b = 0;
        ByteBuffer byteBuffer = this.f11795n;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f11798q;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f11796o = false;
    }

    /* JADX INFO: renamed from: s */
    public final ByteBuffer m6663s(int i) {
        int i2 = this.f11799r;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f11795n;
        throw new C1496ux("Buffer too small (" + (byteBuffer == null ? 0 : byteBuffer.capacity()) + " < " + i + ")");
    }

    /* JADX INFO: renamed from: t */
    public final void m6664t(int i) {
        ByteBuffer byteBuffer = this.f11795n;
        if (byteBuffer == null) {
            this.f11795n = m6663s(i);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i2 = i + iPosition;
        if (iCapacity >= i2) {
            this.f11795n = byteBuffer;
            return;
        }
        ByteBuffer byteBufferM6663s = m6663s(i2);
        byteBufferM6663s.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferM6663s.put(byteBuffer);
        }
        this.f11795n = byteBufferM6663s;
    }

    /* JADX INFO: renamed from: u */
    public final void m6665u() {
        ByteBuffer byteBuffer = this.f11795n;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f11798q;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
