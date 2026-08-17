package p000;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.SystemClock;
import com.example.ssmousepro.LoginActivity;
import java.lang.reflect.Method;
import java.math.RoundingMode;

/* JADX INFO: renamed from: xc */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1586xc {

    /* JADX INFO: renamed from: A */
    public long f12520A;

    /* JADX INFO: renamed from: B */
    public long f12521B;

    /* JADX INFO: renamed from: C */
    public long f12522C;

    /* JADX INFO: renamed from: D */
    public boolean f12523D;

    /* JADX INFO: renamed from: E */
    public long f12524E;

    /* JADX INFO: renamed from: F */
    public long f12525F;

    /* JADX INFO: renamed from: G */
    public boolean f12526G;

    /* JADX INFO: renamed from: H */
    public long f12527H;

    /* JADX INFO: renamed from: I */
    public xy1 f12528I;

    /* JADX INFO: renamed from: a */
    public final ay0 f12529a;

    /* JADX INFO: renamed from: b */
    public final long[] f12530b;

    /* JADX INFO: renamed from: c */
    public AudioTrack f12531c;

    /* JADX INFO: renamed from: d */
    public int f12532d;

    /* JADX INFO: renamed from: e */
    public C1549wc f12533e;

    /* JADX INFO: renamed from: f */
    public int f12534f;

    /* JADX INFO: renamed from: g */
    public boolean f12535g;

    /* JADX INFO: renamed from: h */
    public long f12536h;

    /* JADX INFO: renamed from: i */
    public float f12537i;

    /* JADX INFO: renamed from: j */
    public boolean f12538j;

    /* JADX INFO: renamed from: k */
    public long f12539k;

    /* JADX INFO: renamed from: l */
    public long f12540l;

    /* JADX INFO: renamed from: m */
    public Method f12541m;

    /* JADX INFO: renamed from: n */
    public long f12542n;

    /* JADX INFO: renamed from: o */
    public boolean f12543o;

    /* JADX INFO: renamed from: p */
    public boolean f12544p;

    /* JADX INFO: renamed from: q */
    public long f12545q;

    /* JADX INFO: renamed from: r */
    public long f12546r;

    /* JADX INFO: renamed from: s */
    public long f12547s;

    /* JADX INFO: renamed from: t */
    public long f12548t;

    /* JADX INFO: renamed from: u */
    public long f12549u;

    /* JADX INFO: renamed from: v */
    public int f12550v;

    /* JADX INFO: renamed from: w */
    public int f12551w;

    /* JADX INFO: renamed from: x */
    public long f12552x;

    /* JADX INFO: renamed from: y */
    public long f12553y;

    /* JADX INFO: renamed from: z */
    public long f12554z;

    public C1586xc(ay0 ay0Var) {
        this.f12529a = ay0Var;
        try {
            this.f12541m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f12530b = new long[10];
        this.f12528I = xy1.f12780a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0257  */
    /* JADX WARN: Code duplicated, block: B:70:0x0142  */
    /* JADX WARN: Code duplicated, block: B:71:0x0147 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x0149  */
    /* JADX WARN: Code duplicated, block: B:73:0x0150  */
    /* JADX WARN: Code duplicated, block: B:75:0x0157  */
    /* JADX WARN: Code duplicated, block: B:77:0x015d  */
    /* JADX WARN: Code duplicated, block: B:80:0x0176  */
    /* JADX WARN: Code duplicated, block: B:81:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:84:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:86:0x0203  */
    /* JADX WARN: Code duplicated, block: B:96:0x023c A[Catch: Exception -> 0x0252, TRY_LEAVE, TryCatch #0 {Exception -> 0x0252, blocks: (B:94:0x0217, B:96:0x023c), top: B:141:0x0217 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:80:0x0176, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:83:0x01c2, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:96:0x023c, please report this as an issue */
    /* JADX INFO: renamed from: a */
    public final long m6908a(boolean z) {
        float f;
        long jM7220H;
        C1290pc c1290pc;
        Handler handler;
        long j;
        long j2;
        boolean timestamp;
        long j3;
        long j4;
        long j5;
        long jM7220H2;
        Method method;
        long jMax;
        C1423sy c1423sy = (C1423sy) this.f12529a.f1096b;
        AudioTrack audioTrack = this.f12531c;
        audioTrack.getClass();
        long j6 = 1000;
        if (audioTrack.getPlayState() == 3) {
            this.f12528I.getClass();
            long jNanoTime = System.nanoTime() / 1000;
            if (jNanoTime - this.f12540l >= LoginActivity.AUTH_TIMEOUT_MS) {
                long jM7220H3 = z42.m7220H(this.f12534f, m6909b());
                if (jM7220H3 != 0) {
                    int i = this.f12550v;
                    f = 1.0f;
                    float f2 = this.f12537i;
                    if (f2 != 1.0f) {
                        jM7220H3 = Math.round(jM7220H3 / ((double) f2));
                    }
                    long[] jArr = this.f12530b;
                    jArr[i] = jM7220H3 - jNanoTime;
                    this.f12550v = (this.f12550v + 1) % 10;
                    int i2 = this.f12551w;
                    if (i2 < 10) {
                        this.f12551w = i2 + 1;
                    }
                    this.f12540l = jNanoTime;
                    this.f12539k = 0L;
                    int i3 = 0;
                    while (true) {
                        int i4 = this.f12551w;
                        if (i3 >= i4) {
                            break;
                        }
                        this.f12539k = (jArr[i3] / ((long) i4)) + this.f12539k;
                        i3++;
                    }
                } else {
                    j6 = 1000;
                    f = 1.0f;
                }
            } else {
                j6 = 1000;
                f = 1.0f;
            }
            if (!this.f12535g) {
                C1549wc c1549wc = this.f12533e;
                c1549wc.getClass();
                C1512vc c1512vc = c1549wc.f12053a;
                if (c1512vc != null) {
                    AudioTimestamp audioTimestamp = c1512vc.f11616b;
                    j2 = 500000;
                    j = 0;
                    if (jNanoTime - c1549wc.f12057e >= c1549wc.f12056d) {
                        c1549wc.f12057e = jNanoTime;
                        timestamp = c1512vc.f11615a.getTimestamp(audioTimestamp);
                        if (timestamp) {
                            long j7 = audioTimestamp.framePosition;
                            long j8 = c1512vc.f11618d;
                            if (j8 > j7) {
                                if (c1512vc.f11620f) {
                                    c1512vc.f11621g += j8;
                                    c1512vc.f11620f = false;
                                } else {
                                    c1512vc.f11617c++;
                                }
                            }
                            c1512vc.f11618d = j7;
                            c1512vc.f11619e = j7 + c1512vc.f11621g + (c1512vc.f11617c << 32);
                        }
                        int i5 = c1549wc.f12054b;
                        if (i5 != 0) {
                            if (i5 != 1) {
                                if (i5 != 2) {
                                    if (i5 != 3) {
                                        if (i5 != 4) {
                                            l41.m4046o();
                                            return 0L;
                                        }
                                    } else if (timestamp) {
                                        c1549wc.m6748a();
                                    }
                                } else if (!timestamp) {
                                    c1549wc.m6748a();
                                }
                            } else if (!timestamp) {
                                c1549wc.m6748a();
                            } else if (c1512vc.f11619e > c1549wc.f12058f) {
                                c1549wc.m6749b(2);
                            }
                        } else if (timestamp) {
                            if (audioTimestamp.nanoTime / j6 >= c1549wc.f12055c) {
                                c1549wc.f12058f = c1512vc.f11619e;
                                c1549wc.m6749b(1);
                            }
                        } else if (jNanoTime - c1549wc.f12055c > 500000) {
                            c1549wc.m6749b(3);
                        }
                    }
                    if (timestamp) {
                        if (c1512vc != null) {
                            j3 = c1512vc.f11616b.nanoTime / j6;
                        } else {
                            j3 = -9223372036854775807L;
                        }
                        if (c1512vc != null) {
                            j4 = c1512vc.f11619e;
                        } else {
                            j4 = -1;
                        }
                        j5 = 5000000;
                        jM7220H2 = z42.m7220H(this.f12534f, m6909b());
                        if (Math.abs(j3 - jNanoTime) > 5000000) {
                            AbstractC1337qm.m5542i0("DefaultAudioSink", "Spurious audio timestamp (system clock mismatch): " + j4 + ", " + j3 + ", " + jNanoTime + ", " + jM7220H2 + ", " + c1423sy.m6155j() + ", " + c1423sy.m6156k());
                            c1549wc.m6749b(4);
                        } else if (Math.abs(z42.m7220H(this.f12534f, j4) - jM7220H2) > 5000000) {
                            AbstractC1337qm.m5542i0("DefaultAudioSink", "Spurious audio timestamp (frame position mismatch): " + j4 + ", " + j3 + ", " + jNanoTime + ", " + jM7220H2 + ", " + c1423sy.m6155j() + ", " + c1423sy.m6156k());
                            c1549wc.m6749b(4);
                        } else if (c1549wc.f12054b == 4) {
                            c1549wc.m6748a();
                        }
                    } else {
                        j5 = 5000000;
                    }
                    if (this.f12544p && (method = this.f12541m) != null && jNanoTime - this.f12545q >= j2) {
                        try {
                            AudioTrack audioTrack2 = this.f12531c;
                            audioTrack2.getClass();
                            Integer num = (Integer) method.invoke(audioTrack2, null);
                            int i6 = z42.f13274a;
                            long jIntValue = (((long) num.intValue()) * j6) - this.f12536h;
                            this.f12542n = jIntValue;
                            jMax = Math.max(jIntValue, j);
                            this.f12542n = jMax;
                            if (jMax > j5) {
                                AbstractC1337qm.m5542i0("DefaultAudioSink", "Ignoring impossibly large audio latency: " + jMax);
                                this.f12542n = 0L;
                            }
                        } catch (Exception unused) {
                            this.f12541m = null;
                        }
                        this.f12545q = jNanoTime;
                    }
                } else {
                    j = 0;
                    j2 = 500000;
                }
                timestamp = false;
                if (timestamp) {
                    j5 = 5000000;
                } else {
                    if (c1512vc != null) {
                        j3 = c1512vc.f11616b.nanoTime / j6;
                    } else {
                        j3 = -9223372036854775807L;
                    }
                    if (c1512vc != null) {
                        j4 = c1512vc.f11619e;
                    } else {
                        j4 = -1;
                    }
                    j5 = 5000000;
                    jM7220H2 = z42.m7220H(this.f12534f, m6909b());
                    if (Math.abs(j3 - jNanoTime) > 5000000) {
                        AbstractC1337qm.m5542i0("DefaultAudioSink", "Spurious audio timestamp (system clock mismatch): " + j4 + ", " + j3 + ", " + jNanoTime + ", " + jM7220H2 + ", " + c1423sy.m6155j() + ", " + c1423sy.m6156k());
                        c1549wc.m6749b(4);
                    } else if (Math.abs(z42.m7220H(this.f12534f, j4) - jM7220H2) > 5000000) {
                        AbstractC1337qm.m5542i0("DefaultAudioSink", "Spurious audio timestamp (frame position mismatch): " + j4 + ", " + j3 + ", " + jNanoTime + ", " + jM7220H2 + ", " + c1423sy.m6155j() + ", " + c1423sy.m6156k());
                        c1549wc.m6749b(4);
                    } else if (c1549wc.f12054b == 4) {
                        c1549wc.m6748a();
                    }
                }
                if (this.f12544p) {
                    AudioTrack audioTrack3 = this.f12531c;
                    audioTrack3.getClass();
                    Integer num2 = (Integer) method.invoke(audioTrack3, null);
                    int i7 = z42.f13274a;
                    long jIntValue2 = (((long) num2.intValue()) * j6) - this.f12536h;
                    this.f12542n = jIntValue2;
                    jMax = Math.max(jIntValue2, j);
                    this.f12542n = jMax;
                    if (jMax > j5) {
                        AbstractC1337qm.m5542i0("DefaultAudioSink", "Ignoring impossibly large audio latency: " + jMax);
                        this.f12542n = 0L;
                    }
                    this.f12545q = jNanoTime;
                }
            }
        } else {
            j6 = 1000;
            f = 1.0f;
        }
        this.f12528I.getClass();
        long jNanoTime2 = System.nanoTime() / j6;
        C1549wc c1549wc2 = this.f12533e;
        c1549wc2.getClass();
        C1512vc c1512vc2 = c1549wc2.f12053a;
        boolean z2 = c1549wc2.f12054b == 2;
        if (z2) {
            jM7220H = z42.m7243q(jNanoTime2 - (c1512vc2 != null ? c1512vc2.f11616b.nanoTime / j6 : -9223372036854775807L), this.f12537i) + z42.m7220H(this.f12534f, c1512vc2 != null ? c1512vc2.f11619e : -1L);
        } else {
            jM7220H = this.f12551w == 0 ? z42.m7220H(this.f12534f, m6909b()) : z42.m7243q(this.f12539k + jNanoTime2, this.f12537i);
            if (!z) {
                jM7220H = Math.max(0L, jM7220H - this.f12542n);
            }
        }
        if (this.f12523D != z2) {
            this.f12525F = this.f12522C;
            this.f12524E = this.f12521B;
        }
        long j9 = jNanoTime2 - this.f12525F;
        if (j9 < 1000000) {
            long jM7243q = z42.m7243q(j9, this.f12537i) + this.f12524E;
            long j10 = (j9 * j6) / 1000000;
            jM7220H = (((j6 - j10) * jM7243q) + (jM7220H * j10)) / j6;
        }
        if (!this.f12538j) {
            long j11 = this.f12521B;
            if (jM7220H > j11) {
                this.f12538j = true;
                long jM7226N = z42.m7226N(jM7220H - j11);
                float f3 = this.f12537i;
                if (f3 != f) {
                    jM7226N = Math.round(jM7226N / ((double) f3));
                }
                this.f12528I.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis() - z42.m7226N(jM7226N);
                pn0 pn0Var = c1423sy.f10637r;
                if (pn0Var != null && (handler = (c1290pc = ((a11) pn0Var.f8968a).f11I0).f8839a) != null) {
                    handler.post(new RunnableC1140nc(c1290pc, jCurrentTimeMillis));
                }
            }
        }
        this.f12522C = jNanoTime2;
        this.f12521B = jM7220H;
        this.f12523D = z2;
        return jM7220H;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x009f  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ac  */
    /* JADX INFO: renamed from: b */
    public final long m6909b() {
        long j;
        this.f12528I.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f12552x != -9223372036854775807L) {
            AudioTrack audioTrack = this.f12531c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2) {
                return this.f12554z;
            }
            return Math.min(this.f12520A, this.f12554z + z42.m7222J(z42.m7243q(z42.m7216D(jElapsedRealtime) - this.f12552x, this.f12537i), this.f12534f, 1000000L, RoundingMode.UP));
        }
        if (jElapsedRealtime - this.f12546r >= 5) {
            AudioTrack audioTrack2 = this.f12531c;
            audioTrack2.getClass();
            int playState = audioTrack2.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = ((long) audioTrack2.getPlaybackHeadPosition()) & 4294967295L;
                if (this.f12535g) {
                    if (playState == 2 && playbackHeadPosition == 0) {
                        this.f12549u = this.f12547s;
                    }
                    playbackHeadPosition += this.f12549u;
                }
                if (z42.f13274a > 29) {
                    j = this.f12547s;
                    if (j > playbackHeadPosition) {
                        if (this.f12526G) {
                            this.f12527H += j;
                            this.f12526G = false;
                        } else {
                            this.f12548t++;
                        }
                    }
                    this.f12547s = playbackHeadPosition;
                } else if (playbackHeadPosition != 0 || this.f12547s <= 0 || playState != 3) {
                    this.f12553y = -9223372036854775807L;
                    j = this.f12547s;
                    if (j > playbackHeadPosition) {
                        if (this.f12526G) {
                            this.f12527H += j;
                            this.f12526G = false;
                        } else {
                            this.f12548t++;
                        }
                    }
                    this.f12547s = playbackHeadPosition;
                } else if (this.f12553y == -9223372036854775807L) {
                    this.f12553y = jElapsedRealtime;
                }
            }
            this.f12546r = jElapsedRealtime;
        }
        return this.f12547s + this.f12527H + (this.f12548t << 32);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m6910c(long j) {
        long jM6908a = m6908a(false);
        int i = this.f12534f;
        int i2 = z42.f13274a;
        if (j > z42.m7222J(jM6908a, i, 1000000L, RoundingMode.UP)) {
            return true;
        }
        if (this.f12535g) {
            AudioTrack audioTrack = this.f12531c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2 && m6909b() == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final void m6911d() {
        this.f12539k = 0L;
        this.f12551w = 0;
        this.f12550v = 0;
        this.f12540l = 0L;
        this.f12522C = 0L;
        this.f12525F = 0L;
        this.f12538j = false;
    }
}
