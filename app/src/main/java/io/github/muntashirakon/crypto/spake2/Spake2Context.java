package io.github.muntashirakon.crypto.spake2;

import javax.security.auth.Destroyable;
import p000.AbstractC1308pu;
import p000.C0694gy;
import p000.f40;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes3.dex */
public class Spake2Context implements Destroyable {

    /* JADX INFO: renamed from: a */
    public final long f5113a;

    /* JADX INFO: renamed from: b */
    public final byte[] f5114b = new byte[32];

    /* JADX INFO: renamed from: c */
    public boolean f5115c;

    static {
        System.loadLibrary("spake2");
    }

    public Spake2Context(int i, byte[] bArr, byte[] bArr2) {
        long jAllocNewContext = allocNewContext(AbstractC1308pu.m5359z(i), bArr, bArr2);
        this.f5113a = jAllocNewContext;
        if (jAllocNewContext != 0) {
            return;
        }
        C0694gy.m3079e("Could not allocate native context");
        throw null;
    }

    private static native long allocNewContext(int i, byte[] bArr, byte[] bArr2);

    private static native void destroy(long j);

    private static native byte[] generateMessage(long j, byte[] bArr);

    private static native byte[] processMessage(long j, byte[] bArr);

    /* JADX INFO: renamed from: a */
    public final byte[] m3464a(byte[] bArr) {
        if (this.f5115c) {
            f40.m2719o("The context was destroyed.");
            return null;
        }
        byte[] bArrGenerateMessage = generateMessage(this.f5113a, bArr);
        if (bArrGenerateMessage != null) {
            System.arraycopy(bArrGenerateMessage, 0, this.f5114b, 0, 32);
            return bArrGenerateMessage;
        }
        f40.m2719o("Generated empty message");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m3465b(byte[] bArr) {
        if (this.f5115c) {
            f40.m2719o("The context was destroyed.");
            return null;
        }
        byte[] bArrProcessMessage = processMessage(this.f5113a, bArr);
        if (bArrProcessMessage != null) {
            return bArrProcessMessage;
        }
        f40.m2719o("No key was returned");
        return null;
    }

    @Override // javax.security.auth.Destroyable
    public final void destroy() {
        this.f5115c = true;
        destroy(this.f5113a);
    }

    @Override // javax.security.auth.Destroyable
    public final boolean isDestroyed() {
        return this.f5115c;
    }
}
