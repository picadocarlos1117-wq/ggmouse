package p000;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class fd1 extends HandlerThread implements Handler.Callback {

    /* JADX INFO: renamed from: a */
    public d50 f3760a;

    /* JADX INFO: renamed from: b */
    public Handler f3761b;

    /* JADX INFO: renamed from: c */
    public Error f3762c;

    /* JADX INFO: renamed from: d */
    public RuntimeException f3763d;

    /* JADX INFO: renamed from: e */
    public gd1 f3764e;

    /* JADX INFO: renamed from: a */
    public final void m2802a(int i) throws ji0 {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        this.f3760a.getClass();
        d50 d50Var = this.f3760a;
        int[] iArr = d50Var.f2795b;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        p32.m5186q("eglGetDisplay failed", eGLDisplayEglGetDisplay != null);
        int[] iArr2 = new int[2];
        p32.m5186q("eglInitialize failed", EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr2, 0, iArr2, 1));
        d50Var.f2796c = eGLDisplayEglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr3 = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, d50.f2793g, 0, eGLConfigArr, 0, 1, iArr3, 0);
        boolean z = zEglChooseConfig && iArr3[0] > 0 && eGLConfigArr[0] != null;
        Object[] objArr = {Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr3[0]), eGLConfigArr[0]};
        int i2 = z42.f13274a;
        p32.m5186q(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(d50Var.f2796c, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        p32.m5186q("eglCreateContext failed", eGLContextEglCreateContext != null);
        d50Var.f2797d = eGLContextEglCreateContext;
        EGLDisplay eGLDisplay = d50Var.f2796c;
        if (i == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            p32.m5186q("eglCreatePbufferSurface failed", eGLSurfaceEglCreatePbufferSurface != null);
        }
        p32.m5186q("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext));
        d50Var.f2798e = eGLSurfaceEglCreatePbufferSurface;
        GLES20.glGenTextures(1, iArr, 0);
        p32.m5185p();
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr[0]);
        d50Var.f2799f = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(d50Var);
        SurfaceTexture surfaceTexture2 = this.f3760a.f2799f;
        surfaceTexture2.getClass();
        this.f3764e = new gd1(this, surfaceTexture2, i != 0);
    }

    /* JADX INFO: renamed from: b */
    public final void m2803b() {
        this.f3760a.getClass();
        d50 d50Var = this.f3760a;
        d50Var.f2794a.removeCallbacks(d50Var);
        try {
            SurfaceTexture surfaceTexture = d50Var.f2799f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, d50Var.f2795b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = d50Var.f2796c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = d50Var.f2796c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = d50Var.f2798e;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(d50Var.f2796c, d50Var.f2798e);
            }
            EGLContext eGLContext = d50Var.f2797d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(d50Var.f2796c, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = d50Var.f2796c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(d50Var.f2796c);
            }
            d50Var.f2796c = null;
            d50Var.f2797d = null;
            d50Var.f2798e = null;
            d50Var.f2799f = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        try {
            if (i == 1) {
                try {
                    m2802a(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                    return true;
                } catch (Error e) {
                    AbstractC1337qm.m5551n("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                    this.f3762c = e;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e2) {
                    AbstractC1337qm.m5551n("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                    this.f3763d = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (ji0 e3) {
                    AbstractC1337qm.m5551n("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                    this.f3763d = new IllegalStateException(e3);
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i == 2) {
                try {
                    m2803b();
                    quit();
                    return true;
                } catch (Throwable th) {
                    try {
                        AbstractC1337qm.m5551n("PlaceholderSurface", "Failed to release placeholder surface", th);
                        return true;
                    } finally {
                        quit();
                    }
                }
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }
}
