package p000;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes.dex */
public abstract class th0 {

    /* JADX INFO: renamed from: a */
    public static final byte[][] f10881a = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 256, 256);

    /* JADX INFO: renamed from: b */
    public static final byte[] f10882b = new byte[256];

    static {
        long j;
        int i = 1;
        long j2 = 72340172838076673L;
        while (true) {
            j = 506097522914230528L;
            if (i > 255) {
                break;
            }
            for (int i2 = 0; i2 < 256; i2 += 8) {
                sc2.m6035E(f10881a[i], m6278b(j2, j), i2);
                j += 578721382704613384L;
            }
            j2 += 72340172838076673L;
            i++;
        }
        for (int i3 = 0; i3 < 256; i3 += 8) {
            long jM6279c = m6279c(j);
            long jM6279c2 = m6279c(jM6279c);
            long jM6278b = m6278b(m6278b(jM6279c2, jM6279c), m6279c(jM6279c2));
            sc2.m6035E(f10882b, m6278b(jM6279c, m6279c(m6278b(m6279c(m6279c(m6279c(jM6278b))), jM6278b))), i3);
            j += 578721382704613384L;
        }
    }

    /* JADX INFO: renamed from: a */
    public static long m6277a(long j, long j2) {
        long j3 = j & j2;
        long j4 = (((((j << 1) & j2) ^ ((j2 << 1) & j)) & (-6148914691236517206L)) ^ j3) ^ ((j3 & (-6148914691236517206L)) >>> 1);
        long j5 = 3689348814741910323L & j4;
        long j6 = ((j ^ (j << 2)) & (-3689348814741910324L)) ^ ((j4 & (-3689348814741910324L)) >>> 2);
        long j7 = ((j2 ^ (j2 << 2)) & (-3689348814741910324L)) ^ 2459565876494606882L;
        long j8 = (((j6 << 1) & j7) ^ ((j7 << 1) & j6)) & (-6148914691236517206L);
        long j9 = j6 & j7;
        return ((((j9 & (-6148914691236517206L)) >>> 1) ^ (j9 ^ j8)) ^ (j5 << 2)) ^ j5;
    }

    /* JADX INFO: renamed from: b */
    public static long m6278b(long j, long j2) {
        long jM6277a = m6277a(j, j2);
        long j3 = 1085102592571150095L & jM6277a;
        return (m6277a(((j ^ (j << 4)) & (-1085102592571150096L)) ^ ((jM6277a & (-1085102592571150096L)) >>> 4), ((j2 ^ (j2 << 4)) & (-1085102592571150096L)) ^ 578721382704613384L) ^ (j3 << 4)) ^ j3;
    }

    /* JADX INFO: renamed from: c */
    public static long m6279c(long j) {
        long j2 = j ^ ((j & (-6148914691236517206L)) >>> 1);
        long j3 = (-8608480567731124088L) & j2;
        long j4 = j2 ^ (((((4919131752989213764L & j2) << 1) ^ j3) ^ (j3 >>> 1)) >>> 2);
        long j5 = (-4557430888798830400L) & j4;
        long j6 = j5 >>> 2;
        long j7 = (((3472328296227680304L & j4) << 2) ^ j5) ^ j6;
        long j8 = (-6148914691236517206L) & j7;
        return j4 ^ ((((j8 >>> 1) ^ (((6148914691236517205L & j7) << 1) ^ j8)) ^ j6) >>> 4);
    }
}
