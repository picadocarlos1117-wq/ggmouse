package p000;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: gb */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0671gb implements du1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4127a;

    /* JADX INFO: renamed from: b */
    public final Object f4128b;

    /* JADX INFO: renamed from: c */
    public final Object f4129c;

    public /* synthetic */ C0671gb(int i, Object obj, Object obj2) {
        this.f4127a = i;
        this.f4128b = obj;
        this.f4129c = obj2;
    }

    @Override // p000.du1
    /* JADX INFO: renamed from: a */
    public final v02 mo154a() {
        switch (this.f4127a) {
            case 0:
                return (zt1) this.f4128b;
            default:
                return (v02) this.f4129c;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i = this.f4127a;
        Object obj = this.f4128b;
        switch (i) {
            case 0:
                zt1 zt1Var = (zt1) obj;
                C0671gb c0671gb = (C0671gb) this.f4129c;
                zt1Var.m3122h();
                try {
                    try {
                        c0671gb.close();
                        if (zt1Var.m3123i()) {
                            throw zt1Var.m7354k(null);
                        }
                        return;
                    } catch (IOException e) {
                        if (!zt1Var.m3123i()) {
                            throw e;
                        }
                        throw zt1Var.m7354k(e);
                    }
                } catch (Throwable th) {
                    zt1Var.m3123i();
                    throw th;
                }
            default:
                ((InputStream) obj).close();
                return;
        }
    }

    @Override // p000.du1
    /* JADX INFO: renamed from: n */
    public final long mo156n(long j, C1073lj c1073lj) {
        int i = this.f4127a;
        Object obj = this.f4128b;
        Object obj2 = this.f4129c;
        c1073lj.getClass();
        switch (i) {
            case 0:
                zt1 zt1Var = (zt1) obj;
                C0671gb c0671gb = (C0671gb) obj2;
                zt1Var.m3122h();
                try {
                    try {
                        long jMo156n = c0671gb.mo156n(j, c1073lj);
                        if (zt1Var.m3123i()) {
                            throw zt1Var.m7354k(null);
                        }
                        return jMo156n;
                    } catch (IOException e) {
                        if (zt1Var.m3123i()) {
                            throw zt1Var.m7354k(e);
                        }
                        throw e;
                    }
                } catch (Throwable th) {
                    zt1Var.m3123i();
                    throw th;
                }
            default:
                if (j == 0) {
                    return 0L;
                }
                if (j < 0) {
                    f40.m2716l(jd0.m3612j("byteCount < 0: ", j));
                    return 0L;
                }
                try {
                    ((v02) obj2).mo4536f();
                    rq1 rq1VarM4189A = c1073lj.m4189A(1);
                    int i2 = ((InputStream) obj).read(rq1VarM4189A.f10096a, rq1VarM4189A.f10098c, (int) Math.min(j, 8192 - rq1VarM4189A.f10098c));
                    if (i2 == -1) {
                        if (rq1VarM4189A.f10097b == rq1VarM4189A.f10098c) {
                            c1073lj.f6360a = rq1VarM4189A.m5888a();
                            sq1.m6132a(rq1VarM4189A);
                        }
                        return -1L;
                    }
                    rq1VarM4189A.f10098c += i2;
                    long j2 = i2;
                    c1073lj.f6361b += j2;
                    return j2;
                } catch (AssertionError e2) {
                    if (p32.m5149P(e2)) {
                        throw new IOException(e2);
                    }
                    throw e2;
                }
        }
    }

    public final String toString() {
        switch (this.f4127a) {
            case 0:
                return "AsyncTimeout.source(" + ((C0671gb) this.f4129c) + ')';
            default:
                return "source(" + ((InputStream) this.f4128b) + ')';
        }
    }
}
