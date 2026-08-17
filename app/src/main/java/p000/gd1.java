package p000;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class gd1 extends Surface {

    /* JADX INFO: renamed from: d */
    public static int f4150d;

    /* JADX INFO: renamed from: e */
    public static boolean f4151e;

    /* JADX INFO: renamed from: a */
    public final boolean f4152a;

    /* JADX INFO: renamed from: b */
    public final fd1 f4153b;

    /* JADX INFO: renamed from: c */
    public boolean f4154c;

    public gd1(fd1 fd1Var, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.f4153b = fd1Var;
        this.f4152a = z;
    }

    /* JADX INFO: renamed from: a */
    public static synchronized boolean m2959a(Context context) {
        String strEglQueryString;
        int i;
        try {
            if (!f4151e) {
                int i2 = z42.f13274a;
                if (i2 >= 24 && ((i2 >= 26 || !("samsung".equals(z42.f13276c) || "XT1650".equals(z42.f13277d))) && ((i2 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_EXT_protected_content")))) {
                    String strEglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                    i = strEglQueryString2 != null && strEglQueryString2.contains("EGL_KHR_surfaceless_context") ? 1 : 2;
                } else {
                    i = 0;
                }
                f4150d = i;
                f4151e = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f4150d != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f4153b) {
            try {
                if (!this.f4154c) {
                    fd1 fd1Var = this.f4153b;
                    fd1Var.f3761b.getClass();
                    fd1Var.f3761b.sendEmptyMessage(2);
                    this.f4154c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
