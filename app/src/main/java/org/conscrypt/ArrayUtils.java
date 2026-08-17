package org.conscrypt;

import p000.AbstractC1308pu;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes3.dex */
final class ArrayUtils {
    private ArrayUtils() {
    }

    public static void checkOffsetAndCount(int i, int i2, int i3) {
        if ((i2 | i3) < 0 || i2 > i || i - i2 < i3) {
            StringBuilder sbM5345l = AbstractC1308pu.m5345l("length=", i, "; regionStart=", i2, "; regionLength=");
            sbM5345l.append(i3);
            throw new ArrayIndexOutOfBoundsException(sbM5345l.toString());
        }
    }
}
