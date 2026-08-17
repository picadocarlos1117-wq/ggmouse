package p000;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes3.dex */
public final class yi1 implements InterfaceC1297pj {

    /* JADX INFO: renamed from: a */
    public final ft1 f12987a;

    /* JADX INFO: renamed from: b */
    public final C1073lj f12988b = new C1073lj();

    /* JADX INFO: renamed from: c */
    public boolean f12989c;

    public yi1(ft1 ft1Var) {
        this.f12987a = ft1Var;
    }

    @Override // p000.ft1
    /* JADX INFO: renamed from: a */
    public final v02 mo954a() {
        return this.f12987a.mo954a();
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC1297pj m7081c() {
        if (this.f12989c) {
            f40.m2719o("closed");
            return null;
        }
        C1073lj c1073lj = this.f12988b;
        long jM4201d = c1073lj.m4201d();
        if (jM4201d > 0) {
            this.f12987a.mo956q(jM4201d, c1073lj);
        }
        return this;
    }

    @Override // p000.ft1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        ft1 ft1Var = this.f12987a;
        if (this.f12989c) {
            return;
        }
        C1073lj c1073lj = this.f12988b;
        long j = c1073lj.f6361b;
        if (j > 0) {
            ft1Var.mo956q(j, c1073lj);
        }
        th = null;
        try {
            ft1Var.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.f12989c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // p000.InterfaceC1297pj, p000.ft1, java.io.Flushable
    public final void flush() {
        if (this.f12989c) {
            f40.m2719o("closed");
            return;
        }
        C1073lj c1073lj = this.f12988b;
        long j = c1073lj.f6361b;
        ft1 ft1Var = this.f12987a;
        if (j > 0) {
            ft1Var.mo956q(j, c1073lj);
        }
        ft1Var.flush();
    }

    @Override // p000.InterfaceC1297pj
    /* JADX INFO: renamed from: h */
    public final InterfaceC1297pj mo4205h(String str) {
        str.getClass();
        if (this.f12989c) {
            f40.m2719o("closed");
            return null;
        }
        this.f12988b.m4197I(str);
        m7081c();
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f12989c;
    }

    @Override // p000.InterfaceC1297pj
    /* JADX INFO: renamed from: k */
    public final InterfaceC1297pj mo4207k(long j) {
        if (this.f12989c) {
            f40.m2719o("closed");
            return null;
        }
        this.f12988b.m4193E(j);
        m7081c();
        return this;
    }

    @Override // p000.ft1
    /* JADX INFO: renamed from: q */
    public final void mo956q(long j, C1073lj c1073lj) {
        c1073lj.getClass();
        if (this.f12989c) {
            f40.m2719o("closed");
        } else {
            this.f12988b.mo956q(j, c1073lj);
            m7081c();
        }
    }

    public final String toString() {
        return "buffer(" + this.f12987a + ')';
    }

    @Override // p000.InterfaceC1297pj
    public final InterfaceC1297pj write(byte[] bArr) {
        bArr.getClass();
        if (this.f12989c) {
            f40.m2719o("closed");
            return null;
        }
        this.f12988b.write(bArr, 0, bArr.length);
        m7081c();
        return this;
    }

    @Override // p000.InterfaceC1297pj
    public final InterfaceC1297pj writeByte(int i) {
        if (this.f12989c) {
            f40.m2719o("closed");
            return null;
        }
        this.f12988b.m4192D(i);
        m7081c();
        return this;
    }

    @Override // p000.InterfaceC1297pj
    public final InterfaceC1297pj writeInt(int i) {
        if (this.f12989c) {
            f40.m2719o("closed");
            return null;
        }
        this.f12988b.m4194F(i);
        m7081c();
        return this;
    }

    @Override // p000.InterfaceC1297pj
    public final InterfaceC1297pj writeShort(int i) {
        if (this.f12989c) {
            f40.m2719o("closed");
            return null;
        }
        this.f12988b.m4195G(i);
        m7081c();
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        if (!this.f12989c) {
            int iWrite = this.f12988b.write(byteBuffer);
            m7081c();
            return iWrite;
        }
        f40.m2719o("closed");
        return 0;
    }
}
