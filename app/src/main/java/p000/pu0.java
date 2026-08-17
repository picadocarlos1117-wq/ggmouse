package p000;

import android.graphics.Path;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class pu0 implements k11, e51, cs1, lg1, o91, ut1 {

    /* JADX INFO: renamed from: b */
    public static pu0 f9163b;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9164a;

    public /* synthetic */ pu0(int i) {
        this.f9164a = i;
    }

    /* JADX INFO: renamed from: m */
    public static Path m5360m(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }

    @Override // p000.o91
    /* JADX INFO: renamed from: a */
    public long mo815a(y80 y80Var) {
        return -1L;
    }

    @Override // p000.k11
    /* JADX INFO: renamed from: b */
    public MediaCodecInfo mo3745b(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override // p000.e51
    /* JADX INFO: renamed from: c */
    public String mo2504c(Object obj) {
        return (String) obj;
    }

    @Override // p000.k11
    /* JADX INFO: renamed from: d */
    public boolean mo3746d(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // p000.cs1
    /* JADX INFO: renamed from: e */
    public Object mo1082e() {
        return Executors.newCachedThreadPool(vi0.m6633e("grpc-okhttp-%d"));
    }

    @Override // p000.o91
    /* JADX INFO: renamed from: g */
    public kq1 mo816g() {
        return new C0825ke(-9223372036854775807L);
    }

    @Override // p000.k11
    /* JADX INFO: renamed from: h */
    public boolean mo3747h(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // p000.k11
    /* JADX INFO: renamed from: i */
    public int mo3748i() {
        return MediaCodecList.getCodecCount();
    }

    @Override // p000.k11
    /* JADX INFO: renamed from: l */
    public boolean mo3749l() {
        return false;
    }

    /* JADX INFO: renamed from: n */
    public int m5361n(Object obj) {
        switch (this.f9164a) {
            case 0:
                ((ou0) obj).getClass();
                return 5;
            case 1:
                ((t91) ((sx0) obj)).getClass();
                try {
                    Class.forName("android.app.Application", false, t91.class.getClassLoader());
                    return 8;
                } catch (Exception unused) {
                    return 3;
                }
            default:
                ((x71) obj).getClass();
                return 5;
        }
    }

    @Override // p000.cs1
    /* JADX INFO: renamed from: s */
    public void mo1088s(Object obj) {
        ((ExecutorService) ((Executor) obj)).shutdown();
    }

    @Override // p000.e51
    /* JADX INFO: renamed from: j */
    public Object mo2505j(String str) {
        return str;
    }

    @Override // p000.o91
    /* JADX INFO: renamed from: k */
    public void mo817k(long j) {
    }

    @Override // p000.lg1
    /* JADX INFO: renamed from: f */
    public void mo743f(int i, Object obj) {
    }
}
