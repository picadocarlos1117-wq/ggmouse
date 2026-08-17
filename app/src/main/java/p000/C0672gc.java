package p000;

import android.media.AudioManager;
import android.os.Handler;
import com.example.ssmousepro.ads.RewardedVideoActivity;

/* JADX INFO: renamed from: gc */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0672gc {

    /* JADX INFO: renamed from: a */
    public final ey1 f4134a;

    /* JADX INFO: renamed from: b */
    public final C0635fc f4135b;

    /* JADX INFO: renamed from: c */
    public c80 f4136c;

    /* JADX INFO: renamed from: e */
    public float f4138e = 1.0f;

    /* JADX INFO: renamed from: d */
    public int f4137d = 0;

    public C0672gc(RewardedVideoActivity rewardedVideoActivity, Handler handler, c80 c80Var) {
        this.f4134a = ki0.m3843J(new C0562dc(rewardedVideoActivity, 0));
        this.f4136c = c80Var;
        this.f4135b = new C0635fc(this, handler);
    }

    /* JADX INFO: renamed from: a */
    public final void m2952a() {
        int i = this.f4137d;
        if (i == 1 || i == 0 || z42.f13274a >= 26) {
            return;
        }
        ((AudioManager) this.f4134a.get()).abandonAudioFocus(this.f4135b);
    }

    /* JADX INFO: renamed from: b */
    public final void m2953b(int i) {
        if (this.f4137d == i) {
            return;
        }
        this.f4137d = i;
        float f = i == 4 ? 0.2f : 1.0f;
        if (this.f4138e == f) {
            return;
        }
        this.f4138e = f;
        c80 c80Var = this.f4136c;
        if (c80Var != null) {
            f80 f80Var = c80Var.f1699a;
            f80Var.m2743D(1, 2, Float.valueOf(f80Var.f3682Y * f80Var.f3659B.f4138e));
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m2954c(int i, boolean z) {
        m2952a();
        m2953b(0);
        return 1;
    }
}
