package p000;

import android.media.AudioTrack;

/* JADX INFO: renamed from: wc */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1549wc {

    /* JADX INFO: renamed from: a */
    public final C1512vc f12053a;

    /* JADX INFO: renamed from: b */
    public int f12054b;

    /* JADX INFO: renamed from: c */
    public long f12055c;

    /* JADX INFO: renamed from: d */
    public long f12056d;

    /* JADX INFO: renamed from: e */
    public long f12057e;

    /* JADX INFO: renamed from: f */
    public long f12058f;

    public C1549wc(AudioTrack audioTrack) {
        this.f12053a = new C1512vc(audioTrack);
        m6748a();
    }

    /* JADX INFO: renamed from: a */
    public final void m6748a() {
        if (this.f12053a != null) {
            m6749b(0);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m6749b(int i) {
        this.f12054b = i;
        if (i == 0) {
            this.f12057e = 0L;
            this.f12058f = -1L;
            this.f12055c = System.nanoTime() / 1000;
            this.f12056d = 10000L;
            return;
        }
        if (i == 1) {
            this.f12056d = 10000L;
            return;
        }
        if (i == 2 || i == 3) {
            this.f12056d = 10000000L;
        } else if (i == 4) {
            this.f12056d = 500000L;
        } else {
            l41.m4046o();
        }
    }
}
