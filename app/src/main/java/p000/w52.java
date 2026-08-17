package p000;

import android.content.Context;
import android.opengl.GLSurfaceView;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class w52 extends GLSurfaceView implements y52 {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f11985b = 0;

    /* JADX INFO: renamed from: a */
    public final v52 f11986a;

    public w52(Context context) {
        super(context, null);
        v52 v52Var = new v52(this);
        this.f11986a = v52Var;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(v52Var);
        setRenderMode(0);
    }

    public void setOutputBuffer(x52 x52Var) {
        v52 v52Var = this.f11986a;
        if (v52Var.f11560f.getAndSet(x52Var) == null) {
            v52Var.f11555a.requestRender();
        } else {
            l41.m4035b();
        }
    }

    @Deprecated
    public y52 getVideoDecoderOutputBufferRenderer() {
        return this;
    }
}
