package p000;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.Surface;
import com.example.ssmousepro.injection.TouchPipeline;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class f62 {

    /* JADX INFO: renamed from: a */
    public final xa0 f3627a;

    /* JADX INFO: renamed from: b */
    public final d62 f3628b;

    /* JADX INFO: renamed from: c */
    public final e62 f3629c;

    /* JADX INFO: renamed from: d */
    public boolean f3630d;

    /* JADX INFO: renamed from: e */
    public Surface f3631e;

    /* JADX INFO: renamed from: f */
    public float f3632f;

    /* JADX INFO: renamed from: g */
    public float f3633g;

    /* JADX INFO: renamed from: h */
    public float f3634h;

    /* JADX INFO: renamed from: i */
    public float f3635i;

    /* JADX INFO: renamed from: j */
    public int f3636j;

    /* JADX INFO: renamed from: k */
    public long f3637k;

    /* JADX INFO: renamed from: l */
    public long f3638l;

    /* JADX INFO: renamed from: m */
    public long f3639m;

    /* JADX INFO: renamed from: n */
    public long f3640n;

    /* JADX INFO: renamed from: o */
    public long f3641o;

    /* JADX INFO: renamed from: p */
    public long f3642p;

    /* JADX INFO: renamed from: q */
    public long f3643q;

    public f62(Context context) {
        DisplayManager displayManager;
        xa0 xa0Var = new xa0();
        xa0Var.f12507a = new wa0();
        xa0Var.f12508b = new wa0();
        xa0Var.f12510d = -9223372036854775807L;
        this.f3627a = xa0Var;
        d62 d62Var = (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : new d62(this, displayManager);
        this.f3628b = d62Var;
        this.f3629c = d62Var != null ? e62.f3220e : null;
        this.f3637k = -9223372036854775807L;
        this.f3638l = -9223372036854775807L;
        this.f3632f = -1.0f;
        this.f3635i = 1.0f;
        this.f3636j = 0;
    }

    /* JADX INFO: renamed from: a */
    public static void m2727a(f62 f62Var, Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            f62Var.f3637k = refreshRate;
            f62Var.f3638l = (refreshRate * 80) / 100;
        } else {
            AbstractC1337qm.m5542i0("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            f62Var.f3637k = -9223372036854775807L;
            f62Var.f3638l = -9223372036854775807L;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2728b() {
        Surface surface;
        if (z42.f13274a < 30 || (surface = this.f3631e) == null || this.f3636j == Integer.MIN_VALUE || this.f3634h == TouchPipeline.SIZE) {
            return;
        }
        this.f3634h = TouchPipeline.SIZE;
        try {
            surface.setFrameRate(TouchPipeline.SIZE, 0);
        } catch (IllegalStateException e) {
            AbstractC1337qm.m5551n("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0071  */
    /* JADX INFO: renamed from: c */
    public final void m2729c() {
        float f;
        float f2;
        if (z42.f13274a < 30 || this.f3631e == null) {
            return;
        }
        xa0 xa0Var = this.f3627a;
        if (!xa0Var.f12507a.m6734a()) {
            f = this.f3632f;
        } else if (xa0Var.f12507a.m6734a()) {
            wa0 wa0Var = xa0Var.f12507a;
            long j = wa0Var.f12038e;
            f = (float) (1.0E9d / (j != 0 ? wa0Var.f12039f / j : 0L));
        } else {
            f = -1.0f;
        }
        float f3 = this.f3633g;
        if (f == f3) {
            return;
        }
        if (f != -1.0f && f3 != -1.0f) {
            if (xa0Var.f12507a.m6734a()) {
                if ((xa0Var.f12507a.m6734a() ? xa0Var.f12507a.f12039f : -9223372036854775807L) >= 5000000000L) {
                    f2 = 0.02f;
                } else {
                    f2 = 1.0f;
                }
            } else {
                f2 = 1.0f;
            }
            if (Math.abs(f - this.f3633g) < f2) {
                return;
            }
        } else if (f == -1.0f && xa0Var.f12511e < 30) {
            return;
        }
        this.f3633g = f;
        m2730d(false);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0022  */
    /* JADX INFO: renamed from: d */
    public final void m2730d(boolean z) {
        Surface surface;
        float f;
        if (z42.f13274a < 30 || (surface = this.f3631e) == null || this.f3636j == Integer.MIN_VALUE) {
            return;
        }
        if (this.f3630d) {
            float f2 = this.f3633g;
            if (f2 != -1.0f) {
                f = f2 * this.f3635i;
            } else {
                f = 0.0f;
            }
        } else {
            f = 0.0f;
        }
        if (z || this.f3634h != f) {
            this.f3634h = f;
            try {
                surface.setFrameRate(f, f == TouchPipeline.SIZE ? 0 : 1);
            } catch (IllegalStateException e) {
                AbstractC1337qm.m5551n("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
            }
        }
    }
}
