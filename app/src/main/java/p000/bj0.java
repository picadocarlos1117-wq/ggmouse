package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class bj0 {

    /* JADX INFO: renamed from: e */
    public static final byte[] f1384e = {0, 0, 1};

    /* JADX INFO: renamed from: a */
    public boolean f1385a;

    /* JADX INFO: renamed from: b */
    public int f1386b;

    /* JADX INFO: renamed from: c */
    public int f1387c;

    /* JADX INFO: renamed from: d */
    public Object f1388d;

    /* JADX INFO: renamed from: a */
    public void m997a(int i, int i2, byte[] bArr) {
        if (this.f1385a) {
            int i3 = i2 - i;
            byte[] bArr2 = (byte[]) this.f1388d;
            int length = bArr2.length;
            int i4 = this.f1386b + i3;
            if (length < i4) {
                this.f1388d = Arrays.copyOf(bArr2, i4 * 2);
            }
            System.arraycopy(bArr, i, (byte[]) this.f1388d, this.f1386b, i3);
            this.f1386b += i3;
        }
    }
}
