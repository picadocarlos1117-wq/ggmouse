package p000;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: jy */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0808jy implements ce1, v21, d40 {

    /* JADX INFO: renamed from: a */
    public final xy1 f5588a;

    /* JADX INFO: renamed from: b */
    public final r02 f5589b;

    /* JADX INFO: renamed from: c */
    public final s02 f5590c;

    /* JADX INFO: renamed from: d */
    public final C1470u7 f5591d;

    /* JADX INFO: renamed from: e */
    public final SparseArray f5592e;

    /* JADX INFO: renamed from: f */
    public au0 f5593f;

    /* JADX INFO: renamed from: g */
    public ee1 f5594g;

    /* JADX INFO: renamed from: m */
    public zy1 f5595m;

    /* JADX INFO: renamed from: n */
    public boolean f5596n;

    public C0808jy(xy1 xy1Var) {
        xy1Var.getClass();
        this.f5588a = xy1Var;
        int i = z42.f13274a;
        Looper looperMyLooper = Looper.myLooper();
        this.f5593f = new au0(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, xy1Var, new C0583dy(14));
        r02 r02Var = new r02();
        this.f5589b = r02Var;
        this.f5590c = new s02();
        C1470u7 c1470u7 = new C1470u7();
        c1470u7.f11141a = r02Var;
        om0 om0Var = qm0.f9540b;
        c1470u7.f11142b = kk1.f5896e;
        c1470u7.f11143c = pk1.f8924g;
        this.f5591d = c1470u7;
        this.f5592e = new SparseArray();
    }

    @Override // p000.v21
    /* JADX INFO: renamed from: a */
    public final void mo63a(int i, q21 q21Var, b21 b21Var) {
        C1542w5 c1542w5M3722i = m3722i(i, q21Var);
        m3724k(c1542w5M3722i, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION, new C0702h5(3, c1542w5M3722i, b21Var));
    }

    @Override // p000.v21
    /* JADX INFO: renamed from: b */
    public final void mo64b(int i, q21 q21Var, su0 su0Var, b21 b21Var) {
        m3724k(m3722i(i, q21Var), 1000, new C0583dy(29));
    }

    @Override // p000.v21
    /* JADX INFO: renamed from: c */
    public final void mo65c(int i, q21 q21Var, su0 su0Var, b21 b21Var) {
        m3724k(m3722i(i, q21Var), 1002, new C0694gy(2));
    }

    @Override // p000.v21
    /* JADX INFO: renamed from: d */
    public final void mo66d(int i, q21 q21Var, su0 su0Var, b21 b21Var) {
        m3724k(m3722i(i, q21Var), 1001, new C0694gy(3));
    }

    @Override // p000.v21
    /* JADX INFO: renamed from: e */
    public final void mo67e(int i, q21 q21Var, su0 su0Var, b21 b21Var, IOException iOException, boolean z) {
        C1542w5 c1542w5M3722i = m3722i(i, q21Var);
        m3724k(c1542w5M3722i, 1003, new C0694gy(c1542w5M3722i, su0Var, b21Var, iOException, z));
    }

    /* JADX INFO: renamed from: f */
    public final C1542w5 m3719f() {
        return m3720g((q21) this.f5591d.f11144d);
    }

    /* JADX INFO: renamed from: g */
    public final C1542w5 m3720g(q21 q21Var) {
        this.f5594g.getClass();
        t02 t02Var = q21Var == null ? null : (t02) ((pk1) this.f5591d.f11143c).get(q21Var);
        if (q21Var != null && t02Var != null) {
            return m3721h(t02Var, t02Var.mo2973g(q21Var.f9309a, this.f5589b).f9651c, q21Var);
        }
        int iM2760g = ((f80) this.f5594g).m2760g();
        t02 t02VarM2763j = ((f80) this.f5594g).m2763j();
        if (iM2760g >= t02VarM2763j.mo1059o()) {
            t02VarM2763j = t02.f10690a;
        }
        return m3721h(t02VarM2763j, iM2760g, null);
    }

    /* JADX INFO: renamed from: h */
    public final C1542w5 m3721h(t02 t02Var, int i, q21 q21Var) {
        q21 q21Var2 = t02Var.m6176p() ? null : q21Var;
        this.f5588a.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = t02Var.equals(((f80) this.f5594g).m2763j()) && i == ((f80) this.f5594g).m2760g();
        long jM7226N = 0;
        if (q21Var2 == null || !q21Var2.m5438b()) {
            if (z) {
                f80 f80Var = (f80) this.f5594g;
                f80Var.m2753N();
                jM7226N = f80Var.m2757d(f80Var.f3697g0);
            } else if (!t02Var.m6176p()) {
                jM7226N = z42.m7226N(t02Var.mo1058m(i, this.f5590c, 0L).f10190j);
            }
        } else if (z && ((f80) this.f5594g).m2758e() == q21Var2.f9310b && ((f80) this.f5594g).m2759f() == q21Var2.f9311c) {
            jM7226N = ((f80) this.f5594g).m2761h();
        }
        long j = jM7226N;
        q21 q21Var3 = (q21) this.f5591d.f11144d;
        t02 t02VarM2763j = ((f80) this.f5594g).m2763j();
        int iM2760g = ((f80) this.f5594g).m2760g();
        long jM2761h = ((f80) this.f5594g).m2761h();
        f80 f80Var2 = (f80) this.f5594g;
        f80Var2.m2753N();
        return new C1542w5(jElapsedRealtime, t02Var, i, q21Var2, j, t02VarM2763j, iM2760g, q21Var3, jM2761h, z42.m7226N(f80Var2.f3697g0.f10388r));
    }

    /* JADX INFO: renamed from: i */
    public final C1542w5 m3722i(int i, q21 q21Var) {
        this.f5594g.getClass();
        if (q21Var != null) {
            return ((t02) ((pk1) this.f5591d.f11143c).get(q21Var)) != null ? m3720g(q21Var) : m3721h(t02.f10690a, i, q21Var);
        }
        t02 t02VarM2763j = ((f80) this.f5594g).m2763j();
        if (i >= t02VarM2763j.mo1059o()) {
            t02VarM2763j = t02.f10690a;
        }
        return m3721h(t02VarM2763j, i, null);
    }

    /* JADX INFO: renamed from: j */
    public final C1542w5 m3723j() {
        return m3720g((q21) this.f5591d.f11146f);
    }

    /* JADX INFO: renamed from: k */
    public final void m3724k(C1542w5 c1542w5, int i, xt0 xt0Var) {
        this.f5592e.put(i, c1542w5);
        this.f5593f.m714e(i, xt0Var);
    }

    /* JADX INFO: renamed from: l */
    public final void m3725l(f80 f80Var, Looper looper) {
        ki0.m3864h(this.f5594g == null || ((qm0) this.f5591d.f11142b).isEmpty());
        f80Var.getClass();
        this.f5594g = f80Var;
        this.f5595m = this.f5588a.m6981a(looper, null);
        au0 au0Var = this.f5593f;
        this.f5593f = new au0(au0Var.f1049d, looper, au0Var.f1046a, new C0702h5(2, this, f80Var), au0Var.f1054i);
    }

    @Override // p000.ce1
    public final void onAvailableCommandsChanged(ae1 ae1Var) {
        m3724k(m3719f(), 13, new C0694gy(13));
    }

    @Override // p000.ce1
    public final void onCues(C1048kv c1048kv) {
        m3724k(m3719f(), 27, new C0583dy(26));
    }

    @Override // p000.ce1
    public final void onIsLoadingChanged(boolean z) {
        m3724k(m3719f(), 3, new C0694gy(11));
    }

    @Override // p000.ce1
    public final void onIsPlayingChanged(boolean z) {
        m3724k(m3719f(), 7, new C0583dy(5));
    }

    @Override // p000.ce1
    public final void onMediaItemTransition(z11 z11Var, int i) {
        m3724k(m3719f(), 1, new C0583dy(0));
    }

    @Override // p000.ce1
    public final void onMediaMetadataChanged(d21 d21Var) {
        m3724k(m3719f(), 14, new C0694gy(4));
    }

    @Override // p000.ce1
    public final void onMetadata(k51 k51Var) {
        m3724k(m3719f(), 28, new C0583dy(3));
    }

    @Override // p000.ce1
    public final void onPlayWhenReadyChanged(boolean z, int i) {
        m3724k(m3719f(), 5, new C0583dy(12));
    }

    @Override // p000.ce1
    public final void onPlaybackParametersChanged(td1 td1Var) {
        m3724k(m3719f(), 12, new f40(29));
    }

    @Override // p000.ce1
    public final void onPlaybackStateChanged(int i) {
        m3724k(m3719f(), 4, new C0583dy(17));
    }

    @Override // p000.ce1
    public final void onPlaybackSuppressionReasonChanged(int i) {
        m3724k(m3719f(), 6, new C0583dy(7));
    }

    @Override // p000.ce1
    public final void onPlayerError(rd1 rd1Var) {
        q21 q21Var;
        C1542w5 c1542w5M3719f = (!(rd1Var instanceof t70) || (q21Var = ((t70) rd1Var).f10776m) == null) ? m3719f() : m3720g(q21Var);
        m3724k(c1542w5M3719f, 10, new C1521vl(c1542w5M3719f, (Object) rd1Var, 3));
    }

    @Override // p000.ce1
    public final void onPlayerErrorChanged(rd1 rd1Var) {
        q21 q21Var;
        m3724k((!(rd1Var instanceof t70) || (q21Var = ((t70) rd1Var).f10776m) == null) ? m3719f() : m3720g(q21Var), 10, new C0583dy(11));
    }

    @Override // p000.ce1
    public final void onPlayerStateChanged(boolean z, int i) {
        m3724k(m3719f(), -1, new C0583dy(2));
    }

    @Override // p000.ce1
    public final void onPositionDiscontinuity(de1 de1Var, de1 de1Var2, int i) {
        if (i == 1) {
            this.f5596n = false;
        }
        ee1 ee1Var = this.f5594g;
        ee1Var.getClass();
        C1470u7 c1470u7 = this.f5591d;
        c1470u7.f11144d = C1470u7.m6395f(ee1Var, (qm0) c1470u7.f11142b, (q21) c1470u7.f11145e, (r02) c1470u7.f11141a);
        C1542w5 c1542w5M3719f = m3719f();
        m3724k(c1542w5M3719f, 11, new C0657fy(c1542w5M3719f, i, de1Var, de1Var2));
    }

    @Override // p000.ce1
    public final void onRepeatModeChanged(int i) {
        m3724k(m3719f(), 8, new C0583dy(22));
    }

    @Override // p000.ce1
    public final void onShuffleModeEnabledChanged(boolean z) {
        m3724k(m3719f(), 9, new C0694gy(5));
    }

    @Override // p000.ce1
    public final void onSkipSilenceEnabledChanged(boolean z) {
        m3724k(m3723j(), 23, new C0694gy(7));
    }

    @Override // p000.ce1
    public final void onSurfaceSizeChanged(int i, int i2) {
        m3724k(m3723j(), 24, new C0583dy(27));
    }

    @Override // p000.ce1
    public final void onTimelineChanged(t02 t02Var, int i) {
        ee1 ee1Var = this.f5594g;
        ee1Var.getClass();
        C1470u7 c1470u7 = this.f5591d;
        c1470u7.f11144d = C1470u7.m6395f(ee1Var, (qm0) c1470u7.f11142b, (q21) c1470u7.f11145e, (r02) c1470u7.f11141a);
        c1470u7.m6403k(((f80) ee1Var).m2763j());
        m3724k(m3719f(), 0, new C0694gy(14));
    }

    @Override // p000.ce1
    public final void onTrackSelectionParametersChanged(h22 h22Var) {
        m3724k(m3719f(), 19, new C0694gy(6));
    }

    @Override // p000.ce1
    public final void onTracksChanged(l22 l22Var) {
        m3724k(m3719f(), 2, new C0583dy(9));
    }

    @Override // p000.ce1
    public final void onVideoSizeChanged(m62 m62Var) {
        C1542w5 c1542w5M3723j = m3723j();
        m3724k(c1542w5M3723j, 25, new C0731hy(c1542w5M3723j, m62Var));
    }

    @Override // p000.ce1
    public final void onCues(List list) {
        C1542w5 c1542w5M3719f = m3719f();
        m3724k(c1542w5M3719f, 27, new C0620ey(c1542w5M3719f, list));
    }

    @Override // p000.ce1
    public final void onRenderedFirstFrame() {
    }

    @Override // p000.ce1
    public final void onLoadingChanged(boolean z) {
    }

    @Override // p000.ce1
    public final void onEvents(ee1 ee1Var, be1 be1Var) {
    }

    @Override // p000.ce1
    public final void onPositionDiscontinuity(int i) {
    }
}
