package p000;

import android.media.AudioManager;
import com.example.ssmousepro.ads.RewardedVideoActivity;

/* JADX INFO: renamed from: dc */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0562dc implements ey1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2874a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ RewardedVideoActivity f2875b;

    public /* synthetic */ C0562dc(RewardedVideoActivity rewardedVideoActivity, int i) {
        this.f2874a = i;
        this.f2875b = rewardedVideoActivity;
    }

    @Override // p000.ey1
    public final Object get() {
        C1534vy c1534vy;
        int i = this.f2874a;
        RewardedVideoActivity rewardedVideoActivity = this.f2875b;
        switch (i) {
            case 0:
                AudioManager audioManager = (AudioManager) rewardedVideoActivity.getApplicationContext().getSystemService("audio");
                audioManager.getClass();
                return audioManager;
            case 1:
                return new C0558d8(rewardedVideoActivity, 17);
            case 2:
                C0621ez c0621ez = new C0621ez();
                c0621ez.f3499c = new k50((byte) 0, 20);
                c0621ez.f3498b = true;
                return new C1683zz(rewardedVideoActivity, c0621ez);
            case 3:
                return new d10(rewardedVideoActivity);
            default:
                kk1 kk1Var = C1534vy.f11837n;
                synchronized (C1534vy.class) {
                    try {
                        if (C1534vy.f11843t == null) {
                            C1497uy c1497uy = new C1497uy(rewardedVideoActivity);
                            C1534vy.f11843t = new C1534vy(c1497uy.f11450a, c1497uy.f11451b, c1497uy.f11452c, c1497uy.f11453d, c1497uy.f11454e);
                        }
                        c1534vy = C1534vy.f11843t;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return c1534vy;
        }
    }
}
