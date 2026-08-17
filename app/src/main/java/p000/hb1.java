package p000;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import com.example.ssmousepro.injection.TouchPipeline;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class hb1 implements SensorEventListener {

    /* JADX INFO: renamed from: a */
    public final float[] f4506a = new float[16];

    /* JADX INFO: renamed from: b */
    public final float[] f4507b = new float[16];

    /* JADX INFO: renamed from: c */
    public final float[] f4508c = new float[16];

    /* JADX INFO: renamed from: d */
    public final float[] f4509d = new float[3];

    /* JADX INFO: renamed from: e */
    public final Display f4510e;

    /* JADX INFO: renamed from: f */
    public final gb1[] f4511f;

    /* JADX INFO: renamed from: g */
    public boolean f4512g;

    public hb1(Display display, gb1... gb1VarArr) {
        this.f4510e = display;
        this.f4511f = gb1VarArr;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.f4506a;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f4510e.getRotation();
        float[] fArr3 = this.f4507b;
        if (rotation != 0) {
            int i2 = 129;
            if (rotation != 1) {
                i = 130;
                if (rotation != 2) {
                    if (rotation != 3) {
                        l41.m4046o();
                        return;
                    } else {
                        i2 = 130;
                        i = 1;
                    }
                }
            } else {
                i = 129;
                i2 = 2;
            }
            System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
            SensorManager.remapCoordinateSystem(fArr3, i2, i, fArr2);
        }
        SensorManager.remapCoordinateSystem(fArr2, 1, 131, fArr3);
        float[] fArr4 = this.f4509d;
        SensorManager.getOrientation(fArr3, fArr4);
        float f = fArr4[2];
        Matrix.rotateM(fArr2, 0, 90.0f, 1.0f, TouchPipeline.SIZE, TouchPipeline.SIZE);
        boolean z = this.f4512g;
        float[] fArr5 = this.f4508c;
        if (!z) {
            C1679zv.m7358g(fArr5, fArr2);
            this.f4512g = true;
        }
        System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
        Matrix.multiplyMM(fArr2, 0, fArr3, 0, fArr5, 0);
        for (int i3 = 0; i3 < 2; i3++) {
            this.f4511f[i3].mo2951a(fArr2, f);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
