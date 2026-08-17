package p000;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class sk0 implements du1 {

    /* JADX INFO: renamed from: a */
    public final zi1 f10427a;

    /* JADX INFO: renamed from: b */
    public int f10428b;

    /* JADX INFO: renamed from: c */
    public byte f10429c;

    /* JADX INFO: renamed from: d */
    public int f10430d;

    /* JADX INFO: renamed from: e */
    public int f10431e;

    /* JADX INFO: renamed from: f */
    public short f10432f;

    public sk0(zi1 zi1Var) {
        this.f10427a = zi1Var;
    }

    @Override // p000.du1
    /* JADX INFO: renamed from: a */
    public final v02 mo154a() {
        return this.f10427a.f13425a.mo154a();
    }

    @Override // p000.du1
    /* JADX INFO: renamed from: n */
    public final long mo156n(long j, C1073lj c1073lj) throws IOException {
        int i;
        int i2;
        do {
            int i3 = this.f10431e;
            zi1 zi1Var = this.f10427a;
            if (i3 == 0) {
                zi1Var.skip(this.f10432f);
                this.f10432f = (short) 0;
                if ((this.f10429c & 4) == 0) {
                    i = this.f10430d;
                    int iM6802a = wk0.m6802a(zi1Var);
                    this.f10431e = iM6802a;
                    this.f10428b = iM6802a;
                    byte b = (byte) (zi1Var.readByte() & 255);
                    this.f10429c = (byte) (zi1Var.readByte() & 255);
                    Logger logger = wk0.f12207a;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(tk0.m6284a(true, this.f10430d, this.f10428b, b, this.f10429c));
                    }
                    i2 = zi1Var.readInt() & Integer.MAX_VALUE;
                    this.f10430d = i2;
                    if (b != 9) {
                        wk0.m6804c("%s != TYPE_CONTINUATION", Byte.valueOf(b));
                        throw null;
                    }
                }
            } else {
                long jMo156n = zi1Var.mo156n(Math.min(j, i3), c1073lj);
                if (jMo156n != -1) {
                    this.f10431e -= (int) jMo156n;
                    return jMo156n;
                }
            }
            return -1L;
        } while (i2 == i);
        wk0.m6804c("TYPE_CONTINUATION streamId changed", new Object[0]);
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
