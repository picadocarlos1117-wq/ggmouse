package p000;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes3.dex */
public final class mn0 implements du1 {

    /* JADX INFO: renamed from: a */
    public final zi1 f7050a;

    /* JADX INFO: renamed from: b */
    public final Inflater f7051b;

    /* JADX INFO: renamed from: c */
    public int f7052c;

    /* JADX INFO: renamed from: d */
    public boolean f7053d;

    public mn0(zi1 zi1Var, Inflater inflater) {
        this.f7050a = zi1Var;
        this.f7051b = inflater;
    }

    @Override // p000.du1
    /* JADX INFO: renamed from: a */
    public final v02 mo154a() {
        return this.f7050a.f13425a.mo154a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f7053d) {
            return;
        }
        this.f7051b.end();
        this.f7053d = true;
        this.f7050a.close();
    }

    @Override // p000.du1
    /* JADX INFO: renamed from: n */
    public final long mo156n(long j, C1073lj c1073lj) throws IOException {
        long j2;
        c1073lj.getClass();
        while (j >= 0) {
            if (this.f7053d) {
                f40.m2719o("closed");
                return 0L;
            }
            zi1 zi1Var = this.f7050a;
            Inflater inflater = this.f7051b;
            if (j == 0) {
                j2 = 0;
            } else {
                try {
                    rq1 rq1VarM4189A = c1073lj.m4189A(1);
                    int iMin = (int) Math.min(j, 8192 - rq1VarM4189A.f10098c);
                    if (inflater.needsInput() && !zi1Var.m7310c()) {
                        rq1 rq1Var = zi1Var.f13426b.f6360a;
                        rq1Var.getClass();
                        int i = rq1Var.f10098c;
                        int i2 = rq1Var.f10097b;
                        int i3 = i - i2;
                        this.f7052c = i3;
                        inflater.setInput(rq1Var.f10096a, i2, i3);
                    }
                    int iInflate = inflater.inflate(rq1VarM4189A.f10096a, rq1VarM4189A.f10098c, iMin);
                    int i4 = this.f7052c;
                    if (i4 != 0) {
                        int remaining = i4 - inflater.getRemaining();
                        this.f7052c -= remaining;
                        zi1Var.skip(remaining);
                    }
                    if (iInflate > 0) {
                        rq1VarM4189A.f10098c += iInflate;
                        j2 = iInflate;
                        c1073lj.f6361b += j2;
                    } else {
                        if (rq1VarM4189A.f10097b == rq1VarM4189A.f10098c) {
                            c1073lj.f6360a = rq1VarM4189A.m5888a();
                            sq1.m6132a(rq1VarM4189A);
                        }
                        j2 = 0;
                    }
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            }
            if (j2 > 0) {
                return j2;
            }
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
            if (zi1Var.m7310c()) {
                throw new EOFException("source exhausted prematurely");
            }
        }
        f40.m2716l(jd0.m3612j("byteCount < 0: ", j));
        return 0L;
    }
}
