package p000;

import java.io.IOException;

/* JADX INFO: renamed from: ap */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0070ap extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    public C0070ap(long j, long j2, int i) {
        String str;
        if (i != 0) {
            if (i == 1) {
                str = "not seekable to start";
            } else if (i != 2) {
                str = "unknown";
            } else {
                ki0.m3864h((j == -9223372036854775807L || j2 == -9223372036854775807L) ? false : true);
                str = "start exceeds end. Start time: " + j + ", End time: " + j2;
            }
        } else {
            str = "invalid period count";
        }
        super("Illegal clipping: ".concat(str));
    }

    public C0070ap(int i) {
        this(-9223372036854775807L, -9223372036854775807L, i);
    }
}
