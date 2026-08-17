package p000;

import android.media.MediaCodecInfo;
import android.view.SurfaceControl;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class d11 {
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint m2180c() {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint m2181d(int i, int i2, int i3) {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(i, i2, i3);
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint m2182e(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ SurfaceControl.Transaction m2183f() {
        return new SurfaceControl.Transaction();
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ WindowInsets.Builder m2184g() {
        return new WindowInsets.Builder();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ WindowInsets.Builder m2185h(WindowInsets windowInsets) {
        return new WindowInsets.Builder(windowInsets);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m2188k() {
    }
}
