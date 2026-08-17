package com.example.ssmousepro.ads;

import android.content.Context;
import android.content.Intent;
import android.media.Spatializer;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.p003ui.PlayerView;
import com.example.ssmousepro.C0203R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import p000.AbstractActivityC1469u6;
import p000.AbstractC0791jh;
import p000.AbstractC1337qm;
import p000.AbstractC1571wy;
import p000.C0672gc;
import p000.C0694gy;
import p000.C0808jy;
import p000.C1048kv;
import p000.C1474ub;
import p000.C1516vg;
import p000.C1534vy;
import p000.C1646yz;
import p000.C1679zv;
import p000.RunnableC1430t4;
import p000.a21;
import p000.ae1;
import p000.be1;
import p000.c20;
import p000.c31;
import p000.cb2;
import p000.ce1;
import p000.d10;
import p000.d21;
import p000.de1;
import p000.e80;
import p000.ee1;
import p000.f80;
import p000.gf1;
import p000.h22;
import p000.h80;
import p000.hp0;
import p000.i70;
import p000.ia1;
import p000.k51;
import p000.ki0;
import p000.kk1;
import p000.l22;
import p000.l80;
import p000.m62;
import p000.qm0;
import p000.rd1;
import p000.sd1;
import p000.t02;
import p000.td1;
import p000.u70;
import p000.vs1;
import p000.y00;
import p000.z11;
import p000.z42;
import p000.zv1;
import p000.zy1;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class RewardedVideoActivity extends AbstractActivityC1469u6 {
    public static final Companion Companion = new Companion(null);
    private static final String EXTRA_URL = "rewarded_video_url";
    public static final int RESULT_WATCHED = -1;
    private boolean concluido;
    private ExoPlayer player;
    private TextView txtTempoRestante;
    private final Handler handler = new Handler(Looper.getMainLooper());
    private final RewardedVideoActivity$tickContador$1 tickContador = new Runnable() { // from class: com.example.ssmousepro.ads.RewardedVideoActivity$tickContador$1
        @Override // java.lang.Runnable
        public void run() {
            if (this.this$0.concluido) {
                return;
            }
            this.this$0.atualizarContador();
            this.this$0.handler.postDelayed(this, 250L);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public final void atualizarContador() {
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer == null) {
            return;
        }
        f80 f80Var = (f80) exoPlayer;
        long jM2766m = f80Var.m2766m();
        if (jM2766m <= 0) {
            TextView textView = this.txtTempoRestante;
            if (textView != null) {
                textView.setText("Carregando...");
                return;
            } else {
                hp0.m3207Q("txtTempoRestante");
                throw null;
            }
        }
        long jM2761h = jM2766m - f80Var.m2761h();
        long j = jM2761h >= 0 ? jM2761h : 0L;
        TextView textView2 = this.txtTempoRestante;
        if (textView2 == null) {
            hp0.m3207Q("txtTempoRestante");
            throw null;
        }
        textView2.setText("Faltam " + formatarTempo(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelar() {
        if (this.concluido) {
            return;
        }
        this.handler.removeCallbacks(this.tickContador);
        setResult(0);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void concluir() {
        if (this.concluido) {
            return;
        }
        this.concluido = true;
        this.handler.removeCallbacks(this.tickContador);
        setResult(-1);
        finish();
    }

    private final void entrarFullscreen() {
        cb2 cb2Var;
        AbstractC1337qm.m5529b0(getWindow(), false);
        Window window = getWindow();
        View decorView = getWindow().getDecorView();
        if (Build.VERSION.SDK_INT >= 30) {
            cb2Var = new cb2(window.getInsetsController());
            cb2Var.f1743r = window;
        } else {
            cb2Var = new cb2(window, decorView);
        }
        cb2Var.mo1202F();
        cb2Var.mo1206a0();
        getWindow().getDecorView().setSystemUiVisibility(4102);
    }

    private final String formatarTempo(long j) {
        int i = (int) ((j + 999) / 1000);
        if (i < 0) {
            i = 0;
        }
        int i2 = i / 60;
        int i3 = i % 60;
        return i2 > 0 ? String.format("%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, 2)) : String.format("0:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i3)}, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void iniciarContador() {
        this.handler.removeCallbacks(this.tickContador);
        this.handler.post(this.tickContador);
    }

    @Override // androidx.fragment.app.AbstractActivityC0053q, p000.AbstractActivityC0613er, p000.AbstractActivityC0576dr, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0203R.layout.activity_rewarded_video);
        entrarFullscreen();
        View viewFindViewById = findViewById(C0203R.id.txtTempoRestante);
        viewFindViewById.getClass();
        this.txtTempoRestante = (TextView) viewFindViewById;
        String stringExtra = getIntent().getStringExtra(EXTRA_URL);
        if (stringExtra == null || zv1.m7371K0(stringExtra)) {
            cancelar();
            return;
        }
        getOnBackPressedDispatcher().m5753a(this, new ia1() { // from class: com.example.ssmousepro.ads.RewardedVideoActivity.onCreate.1
            {
                super(true);
            }

            @Override // p000.ia1
            public void handleOnBackPressed() {
                RewardedVideoActivity.this.cancelar();
            }
        });
        PlayerView playerView = (PlayerView) findViewById(C0203R.id.playerView);
        u70 u70Var = new u70(this);
        ki0.m3864h(!u70Var.f11166t);
        u70Var.f11166t = true;
        int i = z42.f13274a;
        f80 f80Var = new f80(u70Var);
        playerView.setPlayer(f80Var);
        kk1 kk1VarM5570t = qm0.m5570t(z11.m7183a(stringExtra));
        f80Var.m2753N();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < kk1VarM5570t.f5898d; i2++) {
            arrayList.add(f80Var.f3709q.mo5117b((z11) kk1VarM5570t.get(i2)));
        }
        f80Var.m2753N();
        f80Var.m2765l(f80Var.f3697g0);
        f80Var.m2761h();
        f80Var.f3665H++;
        ArrayList arrayList2 = f80Var.f3707o;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i3 = size - 1; i3 >= 0; i3--) {
                arrayList2.remove(i3);
            }
            vs1 vs1Var = f80Var.f3669L;
            int[] iArr = vs1Var.f11765b;
            int[] iArr2 = new int[iArr.length - size];
            int i4 = 0;
            for (int i5 = 0; i5 < iArr.length; i5++) {
                int i6 = iArr[i5];
                if (i6 < 0 || i6 >= size) {
                    int i7 = i5 - i4;
                    if (i6 >= 0) {
                        i6 -= size;
                    }
                    iArr2[i7] = i6;
                } else {
                    i4++;
                }
            }
            f80Var.f3669L = new vs1(iArr2, new Random(vs1Var.f11764a.nextLong()));
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            c31 c31Var = new c31((AbstractC0791jh) arrayList.get(i8), f80Var.f3708p);
            arrayList3.add(c31Var);
            arrayList2.add(i8, new e80(c31Var.f1656b, c31Var.f1655a));
        }
        f80Var.f3669L = f80Var.f3669L.m6656a(arrayList3.size());
        gf1 gf1Var = new gf1(arrayList2, f80Var.f3669L);
        boolean zM6176p = gf1Var.m6176p();
        int i9 = gf1Var.f4177d;
        if (!zM6176p && -1 >= i9) {
            throw new i70();
        }
        int iMo2970a = gf1Var.mo2970a(f80Var.f3664G);
        sd1 sd1VarM2773u = f80Var.m2773u(f80Var.f3697g0, gf1Var, f80Var.m2774v(gf1Var, iMo2970a, -9223372036854775807L));
        int i10 = sd1VarM2773u.f10375e;
        if (iMo2970a != -1 && i10 != 1) {
            i10 = (gf1Var.m6176p() || iMo2970a >= i9) ? 4 : 2;
        }
        sd1 sd1VarM6092g = sd1VarM2773u.m6092g(i10);
        f80Var.f3703k.f6246n.m7386a(17, new h80(arrayList3, f80Var.f3669L, iMo2970a, z42.m7216D(-9223372036854775807L))).m7164b();
        f80Var.m2751L(sd1VarM6092g, 0, (f80Var.f3697g0.f10372b.f9309a.equals(sd1VarM6092g.f10372b.f9309a) || f80Var.f3697g0.f10371a.m6176p()) ? false : true, 4, f80Var.m2762i(sd1VarM6092g), -1, false);
        f80Var.m2745F(true);
        f80Var.f3704l.m710a(new ce1() { // from class: com.example.ssmousepro.ads.RewardedVideoActivity$onCreate$2$1
            @Override // p000.ce1
            public void onPlaybackStateChanged(int i11) {
                if (i11 == 3) {
                    this.this$0.iniciarContador();
                }
                if (i11 == 4) {
                    TextView textView = this.this$0.txtTempoRestante;
                    if (textView == null) {
                        hp0.m3207Q("txtTempoRestante");
                        throw null;
                    }
                    textView.setText("0:00");
                    this.this$0.concluir();
                }
            }

            @Override // p000.ce1
            public void onPlayerError(rd1 rd1Var) {
                rd1Var.getClass();
                Toast.makeText(this.this$0, "Erro ao carregar o vídeo. Verifique a internet.", 0).show();
                this.this$0.cancelar();
            }

            @Override // p000.ce1
            @Deprecated
            public /* bridge */ /* synthetic */ void onCues(List list) {
            }

            @Override // p000.ce1
            public /* bridge */ /* synthetic */ void onPositionDiscontinuity(de1 de1Var, de1 de1Var2, int i11) {
            }

            @Override // p000.ce1
            public /* bridge */ /* synthetic */ void onRenderedFirstFrame() {
            }

            public /* bridge */ /* synthetic */ void onAudioAttributesChanged(C1474ub c1474ub) {
            }

            public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(int i11) {
            }

            @Override // p000.ce1
            public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(ae1 ae1Var) {
            }

            @Override // p000.ce1
            public /* bridge */ /* synthetic */ void onCues(C1048kv c1048kv) {
            }

            public /* bridge */ /* synthetic */ void onDeviceInfoChanged(c20 c20Var) {
            }

            @Override // p000.ce1
            public /* bridge */ /* synthetic */ void onIsLoadingChanged(boolean z) {
            }

            @Override // p000.ce1
            public /* bridge */ /* synthetic */ void onIsPlayingChanged(boolean z) {
            }

            @Override // p000.ce1
            @Deprecated
            public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z) {
            }

            public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j) {
            }

            @Override // p000.ce1
            public /* bridge */ /* synthetic */ void onMediaMetadataChanged(d21 d21Var) {
            }

            @Override // p000.ce1
            public /* bridge */ /* synthetic */ void onMetadata(k51 k51Var) {
            }

            @Override // p000.ce1
            public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(td1 td1Var) {
            }

            @Override // p000.ce1
            public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i11) {
            }

            @Override // p000.ce1
            public /* bridge */ /* synthetic */ void onPlayerErrorChanged(rd1 rd1Var) {
            }

            public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(d21 d21Var) {
            }

            @Override // p000.ce1
            @Deprecated
            public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i11) {
            }

            @Override // p000.ce1
            public /* bridge */ /* synthetic */ void onRepeatModeChanged(int i11) {
            }

            public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(long j) {
            }

            public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(long j) {
            }

            @Override // p000.ce1
            public /* bridge */ /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
            }

            @Override // p000.ce1
            public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
            }

            @Override // p000.ce1
            public /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(h22 h22Var) {
            }

            @Override // p000.ce1
            public /* bridge */ /* synthetic */ void onTracksChanged(l22 l22Var) {
            }

            @Override // p000.ce1
            public /* bridge */ /* synthetic */ void onVideoSizeChanged(m62 m62Var) {
            }

            public /* bridge */ /* synthetic */ void onVolumeChanged(float f) {
            }

            public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(int i11, boolean z) {
            }

            @Override // p000.ce1
            public /* bridge */ /* synthetic */ void onEvents(ee1 ee1Var, be1 be1Var) {
            }

            @Override // p000.ce1
            public /* bridge */ /* synthetic */ void onMediaItemTransition(z11 z11Var, int i11) {
            }

            @Override // p000.ce1
            public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i11) {
            }

            @Override // p000.ce1
            @Deprecated
            public /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z, int i11) {
            }

            @Override // p000.ce1
            public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(int i11, int i12) {
            }

            @Override // p000.ce1
            public /* bridge */ /* synthetic */ void onTimelineChanged(t02 t02Var, int i11) {
            }
        });
        f80Var.m2776x();
        this.player = f80Var;
    }

    @Override // p000.AbstractActivityC1469u6, androidx.fragment.app.AbstractActivityC0053q, android.app.Activity
    public void onDestroy() {
        String str;
        boolean z;
        C1679zv c1679zv;
        y00 y00Var;
        this.handler.removeCallbacks(this.tickContador);
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            f80 f80Var = (f80) exoPlayer;
            StringBuilder sb = new StringBuilder("Release ");
            sb.append(Integer.toHexString(System.identityHashCode(f80Var)));
            sb.append(" [AndroidXMedia3/1.5.1] [");
            sb.append(z42.f13278e);
            sb.append("] [");
            HashSet hashSet = a21.f39a;
            synchronized (a21.class) {
                str = a21.f40b;
            }
            sb.append(str);
            sb.append("]");
            AbstractC1337qm.m5508C(sb.toString());
            f80Var.m2753N();
            f80Var.f3658A.m6740a();
            f80Var.f3660C.getClass();
            f80Var.f3661D.getClass();
            C0672gc c0672gc = f80Var.f3659B;
            c0672gc.f4136c = null;
            c0672gc.m2952a();
            c0672gc.m2953b(0);
            l80 l80Var = f80Var.f3703k;
            synchronized (l80Var) {
                int i = 1;
                if (l80Var.f6218H || !l80Var.f6248p.getThread().isAlive()) {
                    z = true;
                } else {
                    l80Var.f6246n.m7389e(7);
                    l80Var.m4129n0(new C1646yz(l80Var, i), l80Var.f6211A);
                    z = l80Var.f6218H;
                }
            }
            int i2 = 10;
            if (!z) {
                f80Var.f3704l.m714e(10, new C0694gy(23));
            }
            f80Var.f3704l.m713d();
            f80Var.f3700i.f13615a.removeCallbacksAndMessages(null);
            C1534vy c1534vy = f80Var.f3712t;
            C0808jy c0808jy = f80Var.f3710r;
            CopyOnWriteArrayList<C1516vg> copyOnWriteArrayList = (CopyOnWriteArrayList) c1534vy.f11845b.f1096b;
            for (C1516vg c1516vg : copyOnWriteArrayList) {
                if (c1516vg.f11653b == c0808jy) {
                    c1516vg.f11654c = true;
                    copyOnWriteArrayList.remove(c1516vg);
                }
            }
            sd1 sd1Var = f80Var.f3697g0;
            if (sd1Var.f10386p) {
                f80Var.f3697g0 = sd1Var.m6086a();
            }
            sd1 sd1VarM6092g = f80Var.f3697g0.m6092g(1);
            f80Var.f3697g0 = sd1VarM6092g;
            sd1 sd1VarM6087b = sd1VarM6092g.m6087b(sd1VarM6092g.f10372b);
            f80Var.f3697g0 = sd1VarM6087b;
            sd1VarM6087b.f10387q = sd1VarM6087b.f10389s;
            f80Var.f3697g0.f10388r = 0L;
            C0808jy c0808jy2 = f80Var.f3710r;
            zy1 zy1Var = c0808jy2.f5595m;
            ki0.m3866j(zy1Var);
            zy1Var.m7387c(new RunnableC1430t4(c0808jy2, i2));
            d10 d10Var = f80Var.f3698h;
            synchronized (d10Var.f2705c) {
                try {
                    if (z42.f13274a >= 32 && (c1679zv = d10Var.f2710h) != null && (y00Var = (y00) c1679zv.f13578e) != null && ((Handler) c1679zv.f13577d) != null) {
                        ((Spatializer) c1679zv.f13576c).removeOnSpatializerStateChangedListener(y00Var);
                        ((Handler) c1679zv.f13577d).removeCallbacksAndMessages(null);
                        c1679zv.f13577d = null;
                        c1679zv.f13578e = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            d10Var.f2703a = null;
            d10Var.f2704b = null;
            f80Var.m2778z();
            Surface surface = f80Var.f3674Q;
            if (surface != null) {
                surface.release();
                f80Var.f3674Q = null;
            }
            f80Var.f3685a0 = C1048kv.f6036b;
        }
        this.player = null;
        super.onDestroy();
    }

    @Override // p000.AbstractActivityC1469u6, androidx.fragment.app.AbstractActivityC0053q, android.app.Activity
    public void onStop() {
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            ((f80) exoPlayer).m2745F(false);
        }
        this.handler.removeCallbacks(this.tickContador);
        super.onStop();
    }

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1571wy abstractC1571wy) {
            this();
        }

        public final Intent intent(Context context, String str) {
            context.getClass();
            str.getClass();
            Intent intentPutExtra = new Intent(context, (Class<?>) RewardedVideoActivity.class).putExtra(RewardedVideoActivity.EXTRA_URL, str);
            intentPutExtra.getClass();
            return intentPutExtra;
        }

        private Companion() {
        }
    }
}
