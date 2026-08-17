package p000;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class c80 implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ f80 f1699a;

    public c80(f80 f80Var) {
        this.f1699a = f80Var;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Surface surface = new Surface(surfaceTexture);
        f80 f80Var = this.f1699a;
        f80Var.m2748I(surface);
        f80Var.f3674Q = surface;
        f80Var.m2775w(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        f80 f80Var = this.f1699a;
        f80Var.m2748I(null);
        f80Var.m2775w(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f1699a.m2775w(i, i2);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.f1699a.m2775w(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        f80 f80Var = this.f1699a;
        if (f80Var.f3677T) {
            f80Var.m2748I(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        f80 f80Var = this.f1699a;
        if (f80Var.f3677T) {
            f80Var.m2748I(null);
        }
        f80Var.m2775w(0, 0);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
