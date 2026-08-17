package p000;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: renamed from: lb */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1065lb implements z01 {

    /* JADX INFO: renamed from: a */
    public final MediaCodec f6291a;

    /* JADX INFO: renamed from: b */
    public final C1176ob f6292b;

    /* JADX INFO: renamed from: c */
    public final C1139nb f6293c;

    /* JADX INFO: renamed from: d */
    public final C1174o9 f6294d;

    /* JADX INFO: renamed from: e */
    public boolean f6295e;

    /* JADX INFO: renamed from: f */
    public int f6296f = 0;

    public C1065lb(MediaCodec mediaCodec, HandlerThread handlerThread, C1139nb c1139nb, C1174o9 c1174o9) {
        this.f6291a = mediaCodec;
        this.f6292b = new C1176ob(handlerThread);
        this.f6293c = c1139nb;
        this.f6294d = c1174o9;
    }

    /* JADX INFO: renamed from: a */
    public static void m4166a(C1065lb c1065lb, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        C1174o9 c1174o9;
        LoudnessCodecController loudnessCodecController;
        C1176ob c1176ob = c1065lb.f6292b;
        MediaCodec mediaCodec = c1065lb.f6291a;
        HandlerThread handlerThread = c1176ob.f7724b;
        int i2 = 1;
        ki0.m3864h(c1176ob.f7725c == null);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(c1176ob, handler);
        c1176ob.f7725c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i);
        Trace.endSection();
        C1139nb c1139nb = c1065lb.f6293c;
        HandlerThread handlerThread2 = c1139nb.f7342b;
        if (!c1139nb.f7346f) {
            handlerThread2.start();
            c1139nb.f7343c = new HandlerC1170o5(c1139nb, handlerThread2.getLooper(), i2);
            c1139nb.f7346f = true;
        }
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (z42.f13274a >= 35 && (c1174o9 = c1065lb.f6294d) != null && ((loudnessCodecController = (LoudnessCodecController) c1174o9.f7701d) == null || loudnessCodecController.addMediaCodec(mediaCodec))) {
            ki0.m3864h(((HashSet) c1174o9.f7700c).add(mediaCodec));
        }
        c1065lb.f6296f = 1;
    }

    /* JADX INFO: renamed from: b */
    public static String m4167b(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // p000.z01
    /* JADX INFO: renamed from: d */
    public final void mo4168d(int i) {
        this.f6291a.releaseOutputBuffer(i, false);
    }

    @Override // p000.z01
    /* JADX INFO: renamed from: e */
    public final boolean mo4169e(pn0 pn0Var) {
        C1176ob c1176ob = this.f6292b;
        synchronized (c1176ob.f7723a) {
            c1176ob.f7737o = pn0Var;
        }
        return true;
    }

    @Override // p000.z01
    public final void flush() {
        this.f6293c.m4514a();
        this.f6291a.flush();
        C1176ob c1176ob = this.f6292b;
        synchronized (c1176ob.f7723a) {
            c1176ob.f7734l++;
            Handler handler = c1176ob.f7725c;
            int i = z42.f13274a;
            handler.post(new RunnableC1430t4(c1176ob, 4));
        }
        this.f6291a.start();
    }

    @Override // p000.z01
    /* JADX INFO: renamed from: g */
    public final MediaFormat mo4170g() {
        MediaFormat mediaFormat;
        C1176ob c1176ob = this.f6292b;
        synchronized (c1176ob.f7723a) {
            try {
                mediaFormat = c1176ob.f7730h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // p000.z01
    /* JADX INFO: renamed from: h */
    public final void mo4171h() {
        this.f6291a.detachOutputSurface();
    }

    @Override // p000.z01
    /* JADX INFO: renamed from: i */
    public final void mo4172i(Bundle bundle) {
        C1139nb c1139nb = this.f6293c;
        c1139nb.m4515c();
        HandlerC1170o5 handlerC1170o5 = c1139nb.f7343c;
        int i = z42.f13274a;
        handlerC1170o5.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // p000.z01
    /* JADX INFO: renamed from: j */
    public final void mo4173j(int i, long j) {
        this.f6291a.releaseOutputBuffer(i, j);
    }

    @Override // p000.z01
    /* JADX INFO: renamed from: k */
    public final int mo4174k() {
        this.f6293c.m4515c();
        C1176ob c1176ob = this.f6292b;
        synchronized (c1176ob.f7723a) {
            try {
                IllegalStateException illegalStateException = c1176ob.f7736n;
                if (illegalStateException != null) {
                    c1176ob.f7736n = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = c1176ob.f7732j;
                if (codecException != null) {
                    c1176ob.f7732j = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = c1176ob.f7733k;
                if (cryptoException != null) {
                    c1176ob.f7733k = null;
                    throw cryptoException;
                }
                int i = -1;
                if (c1176ob.f7734l > 0 || c1176ob.f7735m) {
                    return -1;
                }
                C1338qn c1338qn = c1176ob.f7726d;
                int i2 = c1338qn.f9542a;
                int i3 = c1338qn.f9543b;
                if (!(i2 == i3)) {
                    if (i2 == i3) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    i = c1338qn.f9544c[i2];
                    c1338qn.f9542a = (i2 + 1) & c1338qn.f9545d;
                }
                return i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.z01
    /* JADX INFO: renamed from: l */
    public final void mo4175l(o11 o11Var, Handler handler) {
        this.f6291a.setOnFrameRenderedListener(new C0784jb(this, o11Var, 0), handler);
    }

    @Override // p000.z01
    /* JADX INFO: renamed from: n */
    public final void mo4176n(int i, C0580dv c0580dv, long j, int i2) {
        C1139nb c1139nb = this.f6293c;
        c1139nb.m4515c();
        C1102mb c1102mbM4513b = C1139nb.m4513b();
        c1102mbM4513b.f6734a = i;
        c1102mbM4513b.f6735b = 0;
        c1102mbM4513b.f6737d = j;
        c1102mbM4513b.f6738e = i2;
        MediaCodec.CryptoInfo cryptoInfo = c1102mbM4513b.f6736c;
        cryptoInfo.numSubSamples = c0580dv.f3019f;
        int[] iArr = c0580dv.f3017d;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < iArr.length) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = c0580dv.f3018e;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < iArr2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, iArr2.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = c0580dv.f3015b;
        byte[] bArrCopyOf = cryptoInfo.key;
        if (bArr != null) {
            if (bArrCopyOf == null || bArrCopyOf.length < bArr.length) {
                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArrCopyOf, 0, bArr.length);
            }
        }
        bArrCopyOf.getClass();
        cryptoInfo.key = bArrCopyOf;
        byte[] bArr2 = c0580dv.f3014a;
        byte[] bArrCopyOf2 = cryptoInfo.iv;
        if (bArr2 != null) {
            if (bArrCopyOf2 == null || bArrCopyOf2.length < bArr2.length) {
                bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
            } else {
                System.arraycopy(bArr2, 0, bArrCopyOf2, 0, bArr2.length);
            }
        }
        bArrCopyOf2.getClass();
        cryptoInfo.iv = bArrCopyOf2;
        cryptoInfo.mode = c0580dv.f3016c;
        if (z42.f13274a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(c0580dv.f3020g, c0580dv.f3021h));
        }
        c1139nb.f7343c.obtainMessage(2, c1102mbM4513b).sendToTarget();
    }

    @Override // p000.z01
    /* JADX INFO: renamed from: o */
    public final int mo4177o(MediaCodec.BufferInfo bufferInfo) {
        this.f6293c.m4515c();
        C1176ob c1176ob = this.f6292b;
        synchronized (c1176ob.f7723a) {
            try {
                IllegalStateException illegalStateException = c1176ob.f7736n;
                if (illegalStateException != null) {
                    c1176ob.f7736n = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = c1176ob.f7732j;
                if (codecException != null) {
                    c1176ob.f7732j = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = c1176ob.f7733k;
                if (cryptoException != null) {
                    c1176ob.f7733k = null;
                    throw cryptoException;
                }
                if (c1176ob.f7734l > 0 || c1176ob.f7735m) {
                    return -1;
                }
                C1338qn c1338qn = c1176ob.f7727e;
                int i = c1338qn.f9542a;
                int i2 = c1338qn.f9543b;
                if (i == i2) {
                    return -1;
                }
                if (i == i2) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                int i3 = c1338qn.f9544c[i];
                c1338qn.f9542a = c1338qn.f9545d & (i + 1);
                if (i3 >= 0) {
                    ki0.m3866j(c1176ob.f7730h);
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) c1176ob.f7728f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (i3 == -2) {
                    c1176ob.f7730h = (MediaFormat) c1176ob.f7729g.remove();
                }
                return i3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.z01
    /* JADX INFO: renamed from: q */
    public final void mo4178q(int i) {
        this.f6291a.setVideoScalingMode(i);
    }

    @Override // p000.z01
    public final void release() {
        C1174o9 c1174o9;
        C1174o9 c1174o10;
        try {
            if (this.f6296f == 1) {
                C1139nb c1139nb = this.f6293c;
                if (c1139nb.f7346f) {
                    c1139nb.m4514a();
                    c1139nb.f7342b.quit();
                }
                c1139nb.f7346f = false;
                C1176ob c1176ob = this.f6292b;
                synchronized (c1176ob.f7723a) {
                    c1176ob.f7735m = true;
                    c1176ob.f7724b.quit();
                    c1176ob.m4790a();
                }
            }
            this.f6296f = 2;
            if (this.f6295e) {
                return;
            }
            try {
                int i = z42.f13274a;
                if (i >= 30 && i < 33) {
                    this.f6291a.stop();
                }
            } finally {
                if (z42.f13274a >= 35 && (c1174o10 = this.f6294d) != null) {
                    c1174o10.m4754W(this.f6291a);
                }
                this.f6291a.release();
                this.f6295e = true;
            }
        } catch (Throwable th) {
            if (!this.f6295e) {
                try {
                    int i2 = z42.f13274a;
                    if (i2 >= 30 && i2 < 33) {
                        this.f6291a.stop();
                    }
                } finally {
                    if (z42.f13274a >= 35 && (c1174o9 = this.f6294d) != null) {
                        c1174o9.m4754W(this.f6291a);
                    }
                    this.f6291a.release();
                    this.f6295e = true;
                }
            }
            throw th;
        }
    }

    @Override // p000.z01
    /* JADX INFO: renamed from: t */
    public final ByteBuffer mo4179t(int i) {
        return this.f6291a.getInputBuffer(i);
    }

    @Override // p000.z01
    /* JADX INFO: renamed from: u */
    public final void mo4180u(Surface surface) {
        this.f6291a.setOutputSurface(surface);
    }

    @Override // p000.z01
    /* JADX INFO: renamed from: w */
    public final ByteBuffer mo4181w(int i) {
        return this.f6291a.getOutputBuffer(i);
    }

    @Override // p000.z01
    /* JADX INFO: renamed from: z */
    public final void mo4182z(int i, int i2, long j, int i3) {
        C1139nb c1139nb = this.f6293c;
        c1139nb.m4515c();
        C1102mb c1102mbM4513b = C1139nb.m4513b();
        c1102mbM4513b.f6734a = i;
        c1102mbM4513b.f6735b = i2;
        c1102mbM4513b.f6737d = j;
        c1102mbM4513b.f6738e = i3;
        HandlerC1170o5 handlerC1170o5 = c1139nb.f7343c;
        int i4 = z42.f13274a;
        handlerC1170o5.obtainMessage(1, c1102mbM4513b).sendToTarget();
    }
}
