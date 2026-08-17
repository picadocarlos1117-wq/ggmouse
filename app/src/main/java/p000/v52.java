package p000;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.Log;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class v52 implements GLSurfaceView.Renderer {

    /* JADX INFO: renamed from: m */
    public static final String[] f11553m = {"y_tex", "u_tex", "v_tex"};

    /* JADX INFO: renamed from: n */
    public static final FloatBuffer f11554n = p32.m5143I(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

    /* JADX INFO: renamed from: a */
    public final w52 f11555a;

    /* JADX INFO: renamed from: b */
    public final int[] f11556b = new int[3];

    /* JADX INFO: renamed from: c */
    public final int[] f11557c = new int[3];

    /* JADX INFO: renamed from: d */
    public final int[] f11558d = new int[3];

    /* JADX INFO: renamed from: e */
    public final int[] f11559e = new int[3];

    /* JADX INFO: renamed from: f */
    public final AtomicReference f11560f = new AtomicReference();

    /* JADX INFO: renamed from: g */
    public j22 f11561g;

    public v52(w52 w52Var) {
        this.f11555a = w52Var;
        for (int i = 0; i < 3; i++) {
            int[] iArr = this.f11558d;
            this.f11559e[i] = -1;
            iArr[i] = -1;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m6583a() {
        int[] iArr = this.f11556b;
        try {
            GLES20.glGenTextures(3, iArr, 0);
            for (int i = 0; i < 3; i++) {
                j22 j22Var = this.f11561g;
                GLES20.glUniform1i(GLES20.glGetUniformLocation(j22Var.f5241a, f11553m[i]), i);
                GLES20.glActiveTexture(33984 + i);
                p32.m5167g(3553, iArr[i]);
            }
            p32.m5185p();
        } catch (ji0 e) {
            Log.e("VideoDecoderGLSV", "Failed to set up the textures", e);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        if (this.f11560f.getAndSet(null) == null) {
            return;
        }
        l41.m4035b();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        int[] iArr = this.f11557c;
        try {
            j22 j22Var = new j22("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
            this.f11561g = j22Var;
            GLES20.glVertexAttribPointer(j22Var.m3538d("in_pos"), 2, 5126, false, 0, (Buffer) f11554n);
            iArr[0] = this.f11561g.m3538d("in_tc_y");
            iArr[1] = this.f11561g.m3538d("in_tc_u");
            iArr[2] = this.f11561g.m3538d("in_tc_v");
            GLES20.glGetUniformLocation(this.f11561g.f5241a, "mColorConversion");
            p32.m5185p();
            m6583a();
            p32.m5185p();
        } catch (ji0 e) {
            Log.e("VideoDecoderGLSV", "Failed to set up the textures and program", e);
        }
    }
}
