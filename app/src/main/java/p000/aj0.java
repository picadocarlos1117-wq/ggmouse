package p000;

import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes3.dex */
public final class aj0 implements du1 {

    /* JADX INFO: renamed from: a */
    public byte f246a;

    /* JADX INFO: renamed from: b */
    public final zi1 f247b;

    /* JADX INFO: renamed from: c */
    public final Inflater f248c;

    /* JADX INFO: renamed from: d */
    public final mn0 f249d;

    /* JADX INFO: renamed from: e */
    public final CRC32 f250e;

    public aj0(du1 du1Var) {
        du1Var.getClass();
        zi1 zi1Var = new zi1(du1Var);
        this.f247b = zi1Var;
        Inflater inflater = new Inflater(true);
        this.f248c = inflater;
        this.f249d = new mn0(zi1Var, inflater);
        this.f250e = new CRC32();
    }

    /* JADX INFO: renamed from: c */
    public static void m153c(int i, int i2, String str) throws IOException {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3)));
        }
    }

    @Override // p000.du1
    /* JADX INFO: renamed from: a */
    public final v02 mo154a() {
        return this.f247b.f13425a.mo154a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f249d.close();
    }

    /* JADX INFO: renamed from: d */
    public final void m155d(C1073lj c1073lj, long j, long j2) {
        rq1 rq1Var = c1073lj.f6360a;
        rq1Var.getClass();
        while (true) {
            int i = rq1Var.f10098c;
            int i2 = rq1Var.f10097b;
            if (j < i - i2) {
                break;
            }
            j -= (long) (i - i2);
            rq1Var = rq1Var.f10101f;
            rq1Var.getClass();
        }
        while (j2 > 0) {
            int i3 = (int) (((long) rq1Var.f10097b) + j);
            int iMin = (int) Math.min(rq1Var.f10098c - i3, j2);
            this.f250e.update(rq1Var.f10096a, i3, iMin);
            j2 -= (long) iMin;
            rq1Var = rq1Var.f10101f;
            rq1Var.getClass();
            j = 0;
        }
    }

    @Override // p000.du1
    /* JADX INFO: renamed from: n */
    public final long mo156n(long j, C1073lj c1073lj) throws IOException {
        long j2;
        aj0 aj0Var = this;
        c1073lj.getClass();
        long j3 = 0;
        if (j < 0) {
            f40.m2716l(jd0.m3612j("byteCount < 0: ", j));
            return 0L;
        }
        if (j == 0) {
            return 0L;
        }
        byte b = aj0Var.f246a;
        CRC32 crc32 = aj0Var.f250e;
        zi1 zi1Var = aj0Var.f247b;
        if (b == 0) {
            zi1Var.mo4214t(10L);
            C1073lj c1073lj2 = zi1Var.f13426b;
            byte bM4208l = c1073lj2.m4208l(3L);
            boolean z = ((bM4208l >> 1) & 1) == 1;
            if (z) {
                aj0Var.m155d(c1073lj2, 0L, 10L);
            }
            m153c(8075, zi1Var.readShort(), "ID1ID2");
            zi1Var.skip(8L);
            if (((bM4208l >> 2) & 1) == 1) {
                zi1Var.mo4214t(2L);
                if (z) {
                    m155d(c1073lj2, 0L, 2L);
                }
                short s = c1073lj2.readShort();
                long j4 = ((short) (((s & 255) << 8) | ((s & 65280) >>> 8))) & 65535;
                zi1Var.mo4214t(j4);
                if (z) {
                    m155d(c1073lj2, 0L, j4);
                }
                zi1Var.skip(j4);
            }
            if (((bM4208l >> 3) & 1) == 1) {
                long jM7311d = zi1Var.m7311d((byte) 0, 0L, Long.MAX_VALUE);
                if (jM7311d == -1) {
                    f40.m2708d();
                    return 0L;
                }
                if (z) {
                    j2 = 2;
                    m155d(c1073lj2, 0L, jM7311d + 1);
                } else {
                    j2 = 2;
                }
                zi1Var.skip(jM7311d + 1);
            } else {
                j3 = 0;
                j2 = 2;
            }
            if (((bM4208l >> 4) & 1) == 1) {
                long jM7311d2 = zi1Var.m7311d((byte) 0, 0L, Long.MAX_VALUE);
                if (jM7311d2 == -1) {
                    f40.m2708d();
                    return j3;
                }
                if (z) {
                    aj0Var = this;
                    aj0Var.m155d(c1073lj2, 0L, jM7311d2 + 1);
                } else {
                    aj0Var = this;
                }
                zi1Var.skip(jM7311d2 + 1);
            } else {
                aj0Var = this;
            }
            if (z) {
                zi1Var.mo4214t(j2);
                short s2 = c1073lj2.readShort();
                m153c((short) (((s2 & 255) << 8) | ((s2 & 65280) >>> 8)), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            aj0Var.f246a = (byte) 1;
        } else {
            j3 = 0;
        }
        if (aj0Var.f246a == 1) {
            long j5 = c1073lj.f6361b;
            long jMo156n = aj0Var.f249d.mo156n(j, c1073lj);
            if (jMo156n != -1) {
                aj0Var.m155d(c1073lj, j5, jMo156n);
                return jMo156n;
            }
            aj0Var.f246a = (byte) 2;
        }
        if (aj0Var.f246a == 2) {
            m153c(zi1Var.m7313g(), (int) crc32.getValue(), "CRC");
            m153c(zi1Var.m7313g(), (int) aj0Var.f248c.getBytesWritten(), "ISIZE");
            aj0Var.f246a = (byte) 3;
            if (!zi1Var.m7310c()) {
                ca0.m1178j("gzip finished without exhausting source");
                return j3;
            }
        }
        return -1L;
    }
}
