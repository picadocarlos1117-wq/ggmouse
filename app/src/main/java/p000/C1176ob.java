package p000;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: ob */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1176ob extends MediaCodec.Callback {

    /* JADX INFO: renamed from: b */
    public final HandlerThread f7724b;

    /* JADX INFO: renamed from: c */
    public Handler f7725c;

    /* JADX INFO: renamed from: h */
    public MediaFormat f7730h;

    /* JADX INFO: renamed from: i */
    public MediaFormat f7731i;

    /* JADX INFO: renamed from: j */
    public MediaCodec.CodecException f7732j;

    /* JADX INFO: renamed from: k */
    public MediaCodec.CryptoException f7733k;

    /* JADX INFO: renamed from: l */
    public long f7734l;

    /* JADX INFO: renamed from: m */
    public boolean f7735m;

    /* JADX INFO: renamed from: n */
    public IllegalStateException f7736n;

    /* JADX INFO: renamed from: o */
    public pn0 f7737o;

    /* JADX INFO: renamed from: a */
    public final Object f7723a = new Object();

    /* JADX INFO: renamed from: d */
    public final C1338qn f7726d = new C1338qn();

    /* JADX INFO: renamed from: e */
    public final C1338qn f7727e = new C1338qn();

    /* JADX INFO: renamed from: f */
    public final ArrayDeque f7728f = new ArrayDeque();

    /* JADX INFO: renamed from: g */
    public final ArrayDeque f7729g = new ArrayDeque();

    public C1176ob(HandlerThread handlerThread) {
        this.f7724b = handlerThread;
    }

    /* JADX INFO: renamed from: a */
    public final void m4790a() {
        ArrayDeque arrayDeque = this.f7729g;
        if (!arrayDeque.isEmpty()) {
            this.f7731i = (MediaFormat) arrayDeque.getLast();
        }
        C1338qn c1338qn = this.f7726d;
        c1338qn.f9543b = c1338qn.f9542a;
        C1338qn c1338qn2 = this.f7727e;
        c1338qn2.f9543b = c1338qn2.f9542a;
        this.f7728f.clear();
        arrayDeque.clear();
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f7723a) {
            this.f7733k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f7723a) {
            this.f7732j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        g80 g80Var;
        synchronized (this.f7723a) {
            this.f7726d.m5573a(i);
            pn0 pn0Var = this.f7737o;
            if (pn0Var != null && (g80Var = ((g11) pn0Var.f8968a).f3965K) != null) {
                g80Var.m2941a();
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        g80 g80Var;
        synchronized (this.f7723a) {
            try {
                MediaFormat mediaFormat = this.f7731i;
                if (mediaFormat != null) {
                    this.f7727e.m5573a(-2);
                    this.f7729g.add(mediaFormat);
                    this.f7731i = null;
                }
                this.f7727e.m5573a(i);
                this.f7728f.add(bufferInfo);
                pn0 pn0Var = this.f7737o;
                if (pn0Var != null && (g80Var = ((g11) pn0Var.f8968a).f3965K) != null) {
                    g80Var.m2941a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f7723a) {
            this.f7727e.m5573a(-2);
            this.f7729g.add(mediaFormat);
            this.f7731i = null;
        }
    }
}
