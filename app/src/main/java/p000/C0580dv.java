package p000;

import android.media.MediaCodec;

/* JADX INFO: renamed from: dv */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0580dv {

    /* JADX INFO: renamed from: a */
    public byte[] f3014a;

    /* JADX INFO: renamed from: b */
    public byte[] f3015b;

    /* JADX INFO: renamed from: c */
    public int f3016c;

    /* JADX INFO: renamed from: d */
    public int[] f3017d;

    /* JADX INFO: renamed from: e */
    public int[] f3018e;

    /* JADX INFO: renamed from: f */
    public int f3019f;

    /* JADX INFO: renamed from: g */
    public int f3020g;

    /* JADX INFO: renamed from: h */
    public int f3021h;

    /* JADX INFO: renamed from: i */
    public final MediaCodec.CryptoInfo f3022i;

    /* JADX INFO: renamed from: j */
    public final C0558d8 f3023j;

    public C0580dv() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f3022i = cryptoInfo;
        this.f3023j = z42.f13274a >= 24 ? new C0558d8(cryptoInfo) : null;
    }
}
