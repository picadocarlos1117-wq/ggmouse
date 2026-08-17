package p000;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import com.example.ssmousepro.ads.RewardedVideoActivity;
import java.util.Objects;

/* JADX INFO: renamed from: cc */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0130cc {

    /* JADX INFO: renamed from: a */
    public final Context f1745a;

    /* JADX INFO: renamed from: b */
    public final C1521vl f1746b;

    /* JADX INFO: renamed from: c */
    public final Handler f1747c;

    /* JADX INFO: renamed from: d */
    public final C0013ac f1748d;

    /* JADX INFO: renamed from: e */
    public final C1135n7 f1749e;

    /* JADX INFO: renamed from: f */
    public final C0094bc f1750f;

    /* JADX INFO: renamed from: g */
    public C1659zb f1751g;

    /* JADX INFO: renamed from: h */
    public ay0 f1752h;

    /* JADX INFO: renamed from: i */
    public C1474ub f1753i;

    /* JADX INFO: renamed from: j */
    public boolean f1754j;

    public C0130cc(RewardedVideoActivity rewardedVideoActivity, C1521vl c1521vl, C1474ub c1474ub, ay0 ay0Var) {
        Context applicationContext = rewardedVideoActivity.getApplicationContext();
        this.f1745a = applicationContext;
        this.f1746b = c1521vl;
        this.f1753i = c1474ub;
        this.f1752h = ay0Var;
        int i = z42.f13274a;
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, null);
        this.f1747c = handler;
        this.f1748d = z42.f13274a >= 23 ? new C0013ac(this) : null;
        this.f1749e = new C1135n7(this, 1);
        C1659zb c1659zb = C1659zb.f13327c;
        String str = z42.f13276c;
        Uri uriFor = ("Amazon".equals(str) || "Xiaomi".equals(str)) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.f1750f = uriFor != null ? new C0094bc(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    /* JADX INFO: renamed from: a */
    public final void m1209a(C1659zb c1659zb) {
        d10 d10Var;
        if (!this.f1754j || c1659zb.equals(this.f1751g)) {
            return;
        }
        this.f1751g = c1659zb;
        C1423sy c1423sy = (C1423sy) this.f1746b.f11701b;
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = c1423sy.f10622f0;
        if (looper != looperMyLooper) {
            f40.m2719o(jd0.m3617o("Current looper (", looperMyLooper == null ? "null" : looperMyLooper.getThread().getName(), ") is not the playback looper (", looper == null ? "null" : looper.getThread().getName(), ")"));
            return;
        }
        if (c1659zb.equals(c1423sy.f10642w)) {
            return;
        }
        c1423sy.f10642w = c1659zb;
        pn0 pn0Var = c1423sy.f10637r;
        if (pn0Var != null) {
            a11 a11Var = (a11) pn0Var.f8968a;
            synchronized (a11Var.f5806a) {
                d10Var = a11Var.f5822v;
            }
            if (d10Var != null) {
                synchronized (d10Var.f2705c) {
                    d10Var.f2709g.getClass();
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1210b(AudioDeviceInfo audioDeviceInfo) {
        ay0 ay0Var = this.f1752h;
        AudioDeviceInfo audioDeviceInfo2 = ay0Var == null ? null : (AudioDeviceInfo) ay0Var.f1096b;
        int i = z42.f13274a;
        if (Objects.equals(audioDeviceInfo, audioDeviceInfo2)) {
            return;
        }
        ay0 ay0Var2 = audioDeviceInfo != null ? new ay0(audioDeviceInfo, 7) : null;
        this.f1752h = ay0Var2;
        m1209a(C1659zb.m7296b(this.f1745a, this.f1753i, ay0Var2));
    }
}
