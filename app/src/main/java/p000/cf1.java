package p000;

import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import androidx.media3.p003ui.PlayerView;
import androidx.media3.p003ui.SubtitleView;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class cf1 implements ce1, View.OnClickListener, qe1, ie1 {

    /* JADX INFO: renamed from: a */
    public final r02 f1782a = new r02();

    /* JADX INFO: renamed from: b */
    public Object f1783b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ PlayerView f1784c;

    public cf1(PlayerView playerView) {
        this.f1784c = playerView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = PlayerView.f788L;
        this.f1784c.m453i();
    }

    @Override // p000.ce1
    public final void onCues(C1048kv c1048kv) {
        SubtitleView subtitleView = this.f1784c.f808n;
        if (subtitleView != null) {
            subtitleView.setCues(c1048kv.f6037a);
        }
    }

    @Override // p000.ce1
    public final void onPlayWhenReadyChanged(boolean z, int i) {
        int i2 = PlayerView.f788L;
        PlayerView playerView = this.f1784c;
        playerView.m455k();
        if (!playerView.m448d() || !playerView.f797I) {
            playerView.m449e(false);
            return;
        }
        re1 re1Var = playerView.f811q;
        if (re1Var != null) {
            re1Var.m5822f();
        }
    }

    @Override // p000.ce1
    public final void onPlaybackStateChanged(int i) {
        int i2 = PlayerView.f788L;
        PlayerView playerView = this.f1784c;
        playerView.m455k();
        playerView.m457m();
        if (!playerView.m448d() || !playerView.f797I) {
            playerView.m449e(false);
            return;
        }
        re1 re1Var = playerView.f811q;
        if (re1Var != null) {
            re1Var.m5822f();
        }
    }

    @Override // p000.ce1
    public final void onPositionDiscontinuity(de1 de1Var, de1 de1Var2, int i) {
        re1 re1Var;
        int i2 = PlayerView.f788L;
        PlayerView playerView = this.f1784c;
        if (playerView.m448d() && playerView.f797I && (re1Var = playerView.f811q) != null) {
            re1Var.m5822f();
        }
    }

    @Override // p000.ce1
    public final void onRenderedFirstFrame() {
        PlayerView playerView = this.f1784c;
        View view = playerView.f802c;
        if (view != null) {
            view.setVisibility(4);
            if (!playerView.m446b()) {
                playerView.m447c();
                return;
            }
            ImageView imageView = playerView.f806g;
            if (imageView != null) {
                imageView.setVisibility(4);
            }
        }
    }

    @Override // p000.ce1
    public final void onSurfaceSizeChanged(int i, int i2) {
        PlayerView playerView = this.f1784c;
        View view = playerView.f803d;
        if (z42.f13274a == 34 && (view instanceof SurfaceView) && playerView.f799K) {
            pn0 pn0Var = playerView.f805f;
            pn0Var.getClass();
            playerView.f814t.post(new RunnableC1436ta(pn0Var, (SurfaceView) view, new RunnableC1430t4(playerView, 25), 10));
        }
    }

    @Override // p000.ce1
    public final void onTracksChanged(l22 l22Var) {
        int iMo1054b;
        PlayerView playerView = this.f1784c;
        ee1 ee1Var = playerView.f818x;
        ee1Var.getClass();
        f80 f80Var = (f80) ee1Var;
        t02 t02VarM2763j = f80Var.m2770r(17) ? f80Var.m2763j() : t02.f10690a;
        if (t02VarM2763j.m6176p()) {
            this.f1783b = null;
        } else {
            boolean zM2770r = f80Var.m2770r(30);
            r02 r02Var = this.f1782a;
            if (!zM2770r || f80Var.m2764k().f6157a.isEmpty()) {
                Object obj = this.f1783b;
                if (obj != null) {
                    int iMo1054b2 = t02VarM2763j.mo1054b(obj);
                    if (iMo1054b2 != -1) {
                        if (f80Var.m2760g() == t02VarM2763j.mo1055f(iMo1054b2, r02Var, false).f9651c) {
                            return;
                        }
                    }
                    this.f1783b = null;
                }
            } else {
                f80Var.m2753N();
                if (f80Var.f3697g0.f10371a.m6176p()) {
                    iMo1054b = 0;
                } else {
                    sd1 sd1Var = f80Var.f3697g0;
                    iMo1054b = sd1Var.f10371a.mo1054b(sd1Var.f10372b.f9309a);
                }
                this.f1783b = t02VarM2763j.mo1055f(iMo1054b, r02Var, true).f9650b;
            }
        }
        playerView.m458n(false);
    }

    @Override // p000.ce1
    public final void onVideoSizeChanged(m62 m62Var) {
        PlayerView playerView;
        ee1 ee1Var;
        if (m62Var.equals(m62.f6671d) || (ee1Var = (playerView = this.f1784c).f818x) == null || ((f80) ee1Var).m2768o() == 1) {
            return;
        }
        playerView.m454j();
    }
}
