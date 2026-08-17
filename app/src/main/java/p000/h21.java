package p000;

import android.content.Context;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class h21 {

    /* JADX INFO: renamed from: A */
    public boolean f4396A;

    /* JADX INFO: renamed from: a */
    public final Context f4397a;

    /* JADX INFO: renamed from: b */
    public final e00 f4398b;

    /* JADX INFO: renamed from: c */
    public final PlaybackSession f4399c;

    /* JADX INFO: renamed from: i */
    public String f4405i;

    /* JADX INFO: renamed from: j */
    public PlaybackMetrics.Builder f4406j;

    /* JADX INFO: renamed from: k */
    public int f4407k;

    /* JADX INFO: renamed from: n */
    public rd1 f4410n;

    /* JADX INFO: renamed from: o */
    public qo0 f4411o;

    /* JADX INFO: renamed from: p */
    public qo0 f4412p;

    /* JADX INFO: renamed from: q */
    public qo0 f4413q;

    /* JADX INFO: renamed from: r */
    public be0 f4414r;

    /* JADX INFO: renamed from: s */
    public be0 f4415s;

    /* JADX INFO: renamed from: t */
    public be0 f4416t;

    /* JADX INFO: renamed from: u */
    public boolean f4417u;

    /* JADX INFO: renamed from: v */
    public int f4418v;

    /* JADX INFO: renamed from: w */
    public boolean f4419w;

    /* JADX INFO: renamed from: x */
    public int f4420x;

    /* JADX INFO: renamed from: y */
    public int f4421y;

    /* JADX INFO: renamed from: z */
    public int f4422z;

    /* JADX INFO: renamed from: e */
    public final s02 f4401e = new s02();

    /* JADX INFO: renamed from: f */
    public final r02 f4402f = new r02();

    /* JADX INFO: renamed from: h */
    public final HashMap f4404h = new HashMap();

    /* JADX INFO: renamed from: g */
    public final HashMap f4403g = new HashMap();

    /* JADX INFO: renamed from: d */
    public final long f4400d = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: l */
    public int f4408l = 0;

    /* JADX INFO: renamed from: m */
    public int f4409m = 0;

    public h21(Context context, PlaybackSession playbackSession) {
        this.f4397a = context.getApplicationContext();
        this.f4399c = playbackSession;
        e00 e00Var = new e00();
        this.f4398b = e00Var;
        e00Var.f3095d = this;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m3090a(qo0 qo0Var) {
        String str;
        if (qo0Var == null) {
            return false;
        }
        String str2 = (String) qo0Var.f9549c;
        e00 e00Var = this.f4398b;
        synchronized (e00Var) {
            str = e00Var.f3097f;
        }
        return str2.equals(str);
    }

    /* JADX INFO: renamed from: b */
    public final void m3091b() {
        PlaybackMetrics.Builder builder = this.f4406j;
        if (builder != null && this.f4396A) {
            builder.setAudioUnderrunCount(this.f4422z);
            this.f4406j.setVideoFramesDropped(this.f4420x);
            this.f4406j.setVideoFramesPlayed(this.f4421y);
            Long l = (Long) this.f4403g.get(this.f4405i);
            this.f4406j.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = (Long) this.f4404h.get(this.f4405i);
            this.f4406j.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.f4406j.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            this.f4399c.reportPlaybackMetrics(this.f4406j.build());
        }
        this.f4406j = null;
        this.f4405i = null;
        this.f4422z = 0;
        this.f4420x = 0;
        this.f4421y = 0;
        this.f4414r = null;
        this.f4415s = null;
        this.f4416t = null;
        this.f4396A = false;
    }

    /* JADX INFO: renamed from: c */
    public final void m3092c(t02 t02Var, q21 q21Var) {
        int iMo1054b;
        PlaybackMetrics.Builder builder = this.f4406j;
        if (q21Var == null || (iMo1054b = t02Var.mo1054b(q21Var.f9309a)) == -1) {
            return;
        }
        r02 r02Var = this.f4402f;
        int i = 0;
        t02Var.mo1055f(iMo1054b, r02Var, false);
        int i2 = r02Var.f9651c;
        s02 s02Var = this.f4401e;
        t02Var.m6175n(i2, s02Var);
        w11 w11Var = s02Var.f10182b.f13231b;
        if (w11Var != null) {
            int iM7250x = z42.m7250x(w11Var.f11899a, w11Var.f11900b);
            if (iM7250x == 0) {
                i = 3;
            } else if (iM7250x != 1) {
                i = iM7250x != 2 ? 1 : 4;
            } else {
                i = 5;
            }
        }
        builder.setStreamType(i);
        if (s02Var.f10191k != -9223372036854775807L && !s02Var.f10189i && !s02Var.f10187g && !s02Var.m5932a()) {
            builder.setMediaDurationMillis(z42.m7226N(s02Var.f10191k));
        }
        builder.setPlaybackType(s02Var.m5932a() ? 2 : 1);
        this.f4396A = true;
    }

    /* JADX INFO: renamed from: d */
    public final void m3093d(C1542w5 c1542w5, String str) {
        q21 q21Var = c1542w5.f11973d;
        if ((q21Var == null || !q21Var.m5438b()) && str.equals(this.f4405i)) {
            m3091b();
        }
        this.f4403g.remove(str);
        this.f4404h.remove(str);
    }

    /* JADX INFO: renamed from: e */
    public final void m3094e(int i, long j, be0 be0Var) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = f21.m2683i(i).setTimeSinceCreatedMillis(j - this.f4400d);
        if (be0Var != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(2);
            String str = be0Var.f1340m;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = be0Var.f1341n;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = be0Var.f1338k;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i2 = be0Var.f1337j;
            if (i2 != -1) {
                timeSinceCreatedMillis.setBitrate(i2);
            }
            int i3 = be0Var.f1348u;
            if (i3 != -1) {
                timeSinceCreatedMillis.setWidth(i3);
            }
            int i4 = be0Var.f1349v;
            if (i4 != -1) {
                timeSinceCreatedMillis.setHeight(i4);
            }
            int i5 = be0Var.f1317C;
            if (i5 != -1) {
                timeSinceCreatedMillis.setChannelCount(i5);
            }
            int i6 = be0Var.f1318D;
            if (i6 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i6);
            }
            String str4 = be0Var.f1331d;
            if (str4 != null) {
                int i7 = z42.f13274a;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = be0Var.f1350w;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f4396A = true;
        this.f4399c.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }
}
