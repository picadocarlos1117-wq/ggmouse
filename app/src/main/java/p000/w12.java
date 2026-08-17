package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class w12 {

    /* JADX INFO: renamed from: a */
    public final boolean f11904a;

    /* JADX INFO: renamed from: b */
    public final String f11905b;

    /* JADX INFO: renamed from: c */
    public final b22 f11906c;

    /* JADX INFO: renamed from: d */
    public final int f11907d;

    /* JADX INFO: renamed from: e */
    public final byte[] f11908e;

    public w12(boolean z, String str, int i, byte[] bArr, int i2, int i3, byte[] bArr2) {
        byte b = 0;
        int i4 = 1;
        ki0.m3857c((i == 0) ^ (bArr2 == null));
        this.f11904a = z;
        this.f11905b = str;
        this.f11907d = i;
        this.f11908e = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    if (!str.equals("cbc1")) {
                        b = -1;
                    }
                    break;
                case 3046671:
                    b = !str.equals("cbcs") ? (byte) -1 : (byte) 1;
                    break;
                case 3049879:
                    b = !str.equals("cenc") ? (byte) -1 : (byte) 2;
                    break;
                case 3049895:
                    b = !str.equals("cens") ? (byte) -1 : (byte) 3;
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                case 1:
                    i4 = 2;
                    break;
                case 2:
                case 3:
                    break;
                default:
                    AbstractC1337qm.m5542i0("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                    break;
            }
        }
        this.f11906c = new b22(i4, i2, i3, bArr);
    }
}
