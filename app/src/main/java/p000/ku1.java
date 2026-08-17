package p000;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.util.Log;
import com.example.ssmousepro.injection.TouchPipeline;
import io.github.muntashirakon.adb.PairingConnectionCtx;
import java.nio.Buffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ku1 implements GLSurfaceView.Renderer, gb1 {

    /* JADX INFO: renamed from: a */
    public final np1 f6025a;

    /* JADX INFO: renamed from: d */
    public final float[] f6028d;

    /* JADX INFO: renamed from: e */
    public final float[] f6029e;

    /* JADX INFO: renamed from: f */
    public final float[] f6030f;

    /* JADX INFO: renamed from: g */
    public float f6031g;

    /* JADX INFO: renamed from: m */
    public float f6032m;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ lu1 f6035p;

    /* JADX INFO: renamed from: b */
    public final float[] f6026b = new float[16];

    /* JADX INFO: renamed from: c */
    public final float[] f6027c = new float[16];

    /* JADX INFO: renamed from: n */
    public final float[] f6033n = new float[16];

    /* JADX INFO: renamed from: o */
    public final float[] f6034o = new float[16];

    public ku1(lu1 lu1Var, np1 np1Var) {
        this.f6035p = lu1Var;
        float[] fArr = new float[16];
        this.f6028d = fArr;
        float[] fArr2 = new float[16];
        this.f6029e = fArr2;
        float[] fArr3 = new float[16];
        this.f6030f = fArr3;
        this.f6025a = np1Var;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        this.f6032m = 3.1415927f;
    }

    @Override // p000.gb1
    /* JADX INFO: renamed from: a */
    public final synchronized void mo2951a(float[] fArr, float f) {
        float[] fArr2 = this.f6028d;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        float f2 = -f;
        this.f6032m = f2;
        Matrix.setRotateM(this.f6029e, 0, -this.f6031g, (float) Math.cos(f2), (float) Math.sin(this.f6032m), TouchPipeline.SIZE);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        float[] fArr;
        Object objM3154d;
        synchronized (this) {
            Matrix.multiplyMM(this.f6034o, 0, this.f6028d, 0, this.f6030f, 0);
            Matrix.multiplyMM(this.f6033n, 0, this.f6029e, 0, this.f6034o, 0);
        }
        Matrix.multiplyMM(this.f6027c, 0, this.f6026b, 0, this.f6033n, 0);
        np1 np1Var = this.f6025a;
        float[] fArr2 = this.f6027c;
        GLES20.glClear(PairingConnectionCtx.PairingPacketHeader.MAX_PAYLOAD_SIZE);
        try {
            p32.m5185p();
        } catch (ji0 e) {
            AbstractC1337qm.m5551n("SceneRenderer", "Failed to draw a frame", e);
        }
        if (np1Var.f7493a.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = np1Var.f7502o;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            try {
                p32.m5185p();
            } catch (ji0 e2) {
                AbstractC1337qm.m5551n("SceneRenderer", "Failed to draw a frame", e2);
            }
            if (np1Var.f7494b.compareAndSet(true, false)) {
                Matrix.setIdentityM(np1Var.f7499g, 0);
            }
            long timestamp = np1Var.f7502o.getTimestamp();
            C0716hj c0716hj = np1Var.f7497e;
            synchronized (c0716hj) {
                objM3154d = c0716hj.m3154d(timestamp, false);
            }
            Long l = (Long) objM3154d;
            if (l != null) {
                C1679zv c1679zv = np1Var.f7496d;
                float[] fArr3 = np1Var.f7499g;
                float[] fArr4 = (float[]) ((C0716hj) c1679zv.f13578e).m3156f(l.longValue());
                if (fArr4 != null) {
                    float[] fArr5 = (float[]) c1679zv.f13577d;
                    float f = fArr4[0];
                    float f2 = -fArr4[1];
                    float f3 = -fArr4[2];
                    float length = Matrix.length(f, f2, f3);
                    if (length != TouchPipeline.SIZE) {
                        Matrix.setRotateM(fArr5, 0, (float) Math.toDegrees(length), f / length, f2 / length, f3 / length);
                    } else {
                        Matrix.setIdentityM(fArr5, 0);
                    }
                    if (!c1679zv.f13575b) {
                        C1679zv.m7358g((float[]) c1679zv.f13576c, (float[]) c1679zv.f13577d);
                        c1679zv.f13575b = true;
                    }
                    Matrix.multiplyMM(fArr3, 0, (float[]) c1679zv.f13576c, 0, (float[]) c1679zv.f13577d, 0);
                }
            }
            bh1 bh1Var = (bh1) np1Var.f7498f.m3156f(timestamp);
            if (bh1Var != null) {
                ch1 ch1Var = np1Var.f7495c;
                ch1Var.getClass();
                if (ch1.m1218c(bh1Var)) {
                    ch1Var.f1806a = bh1Var.f1371c;
                    C0716hj c0716hj2 = bh1Var.f1369a.f233a[0];
                    C0716hj c0716hj3 = new C0716hj();
                    float[] fArr6 = (float[]) c0716hj2.f4586c;
                    c0716hj3.f4584a = fArr6.length / 3;
                    c0716hj3.f4586c = p32.m5143I(fArr6);
                    c0716hj3.f4587d = p32.m5143I((float[]) c0716hj2.f4587d);
                    int i = c0716hj2.f4585b;
                    if (i == 1) {
                        c0716hj3.f4585b = 5;
                    } else if (i != 2) {
                        c0716hj3.f4585b = 4;
                    } else {
                        c0716hj3.f4585b = 6;
                    }
                    ch1Var.f1812g = c0716hj3;
                    if (!bh1Var.f1372d) {
                        C0716hj c0716hj4 = bh1Var.f1370b.f233a[0];
                        float[] fArr7 = (float[]) c0716hj4.f4586c;
                        int length2 = fArr7.length;
                        p32.m5143I(fArr7);
                        p32.m5143I((float[]) c0716hj4.f4587d);
                    }
                }
            }
        }
        Matrix.multiplyMM(np1Var.f7500m, 0, fArr2, 0, np1Var.f7499g, 0);
        ch1 ch1Var2 = np1Var.f7495c;
        int i2 = np1Var.f7501n;
        float[] fArr8 = np1Var.f7500m;
        C0716hj c0716hj5 = (C0716hj) ch1Var2.f1812g;
        if (c0716hj5 == null) {
            return;
        }
        int i3 = ch1Var2.f1806a;
        if (i3 == 1) {
            fArr = ch1.f1804j;
        } else {
            fArr = i3 == 2 ? ch1.f1805k : ch1.f1803i;
        }
        GLES20.glUniformMatrix3fv(ch1Var2.f1808c, 1, false, fArr, 0);
        GLES20.glUniformMatrix4fv(ch1Var2.f1807b, 1, false, fArr8, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i2);
        GLES20.glUniform1i(ch1Var2.f1811f, 0);
        try {
            p32.m5185p();
        } catch (ji0 e3) {
            Log.e("ProjectionRenderer", "Failed to bind uniforms", e3);
        }
        GLES20.glVertexAttribPointer(ch1Var2.f1809d, 3, 5126, false, 12, (Buffer) c0716hj5.f4586c);
        try {
            p32.m5185p();
        } catch (ji0 e4) {
            Log.e("ProjectionRenderer", "Failed to load position data", e4);
        }
        GLES20.glVertexAttribPointer(ch1Var2.f1810e, 2, 5126, false, 8, (Buffer) c0716hj5.f4587d);
        try {
            p32.m5185p();
        } catch (ji0 e5) {
            Log.e("ProjectionRenderer", "Failed to load texture data", e5);
        }
        GLES20.glDrawArrays(c0716hj5.f4585b, 0, c0716hj5.f4584a);
        try {
            p32.m5185p();
        } catch (ji0 e6) {
            Log.e("ProjectionRenderer", "Failed to render", e6);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
        float f = i / i2;
        Matrix.perspectiveM(this.f6026b, 0, f > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f))) * 2.0d) : 90.0f, f, 0.1f, 100.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        lu1 lu1Var = this.f6035p;
        lu1Var.f6516e.post(new RunnableC1467u4(29, lu1Var, this.f6025a.m4588d()));
    }
}
