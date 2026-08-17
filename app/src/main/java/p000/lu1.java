package p000;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class lu1 extends GLSurfaceView {

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ int f6511q = 0;

    /* JADX INFO: renamed from: a */
    public final CopyOnWriteArrayList f6512a;

    /* JADX INFO: renamed from: b */
    public final SensorManager f6513b;

    /* JADX INFO: renamed from: c */
    public final Sensor f6514c;

    /* JADX INFO: renamed from: d */
    public final hb1 f6515d;

    /* JADX INFO: renamed from: e */
    public final Handler f6516e;

    /* JADX INFO: renamed from: f */
    public final np1 f6517f;

    /* JADX INFO: renamed from: g */
    public SurfaceTexture f6518g;

    /* JADX INFO: renamed from: m */
    public Surface f6519m;

    /* JADX INFO: renamed from: n */
    public boolean f6520n;

    /* JADX INFO: renamed from: o */
    public boolean f6521o;

    /* JADX INFO: renamed from: p */
    public boolean f6522p;

    public lu1(Context context) {
        super(context, null);
        this.f6512a = new CopyOnWriteArrayList();
        this.f6516e = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.f6513b = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        this.f6514c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        np1 np1Var = new np1();
        this.f6517f = np1Var;
        ku1 ku1Var = new ku1(this, np1Var);
        View.OnTouchListener s12Var = new s12(context, ku1Var);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.f6515d = new hb1(windowManager.getDefaultDisplay(), s12Var, ku1Var);
        this.f6520n = true;
        setEGLContextClientVersion(2);
        setRenderer(ku1Var);
        setOnTouchListener(s12Var);
    }

    /* JADX INFO: renamed from: a */
    public final void m4285a() {
        boolean z = this.f6520n && this.f6521o;
        Sensor sensor = this.f6514c;
        if (sensor == null || z == this.f6522p) {
            return;
        }
        hb1 hb1Var = this.f6515d;
        SensorManager sensorManager = this.f6513b;
        if (z) {
            sensorManager.registerListener(hb1Var, sensor, 0);
        } else {
            sensorManager.unregisterListener(hb1Var);
        }
        this.f6522p = z;
    }

    public InterfaceC0718hl getCameraMotionListener() {
        return this.f6517f;
    }

    public z52 getVideoFrameMetadataListener() {
        return this.f6517f;
    }

    public Surface getVideoSurface() {
        return this.f6519m;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f6516e.post(new fs1(this, 4));
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.f6521o = false;
        m4285a();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.f6521o = true;
        m4285a();
    }

    public void setDefaultStereoMode(int i) {
        this.f6517f.f7503p = i;
    }

    public void setUseSensorRotation(boolean z) {
        this.f6520n = z;
        m4285a();
    }
}
