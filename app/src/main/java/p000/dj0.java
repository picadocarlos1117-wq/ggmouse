package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class dj0 {

    /* JADX INFO: renamed from: f */
    public static final byte[] f2948f = {0, 0, 1};

    /* JADX INFO: renamed from: a */
    public boolean f2949a;

    /* JADX INFO: renamed from: b */
    public int f2950b;

    /* JADX INFO: renamed from: c */
    public int f2951c;

    /* JADX INFO: renamed from: d */
    public int f2952d;

    /* JADX INFO: renamed from: e */
    public byte[] f2953e;

    /* JADX INFO: renamed from: a */
    public final void m2361a(int i, int i2, byte[] bArr) {
        if (this.f2949a) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f2953e;
            int length = bArr2.length;
            int i4 = this.f2951c + i3;
            if (length < i4) {
                this.f2953e = Arrays.copyOf(bArr2, i4 * 2);
            }
            System.arraycopy(bArr, i, this.f2953e, this.f2951c, i3);
            this.f2951c += i3;
        }
    }
}
