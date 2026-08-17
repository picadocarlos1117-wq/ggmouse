package p000;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.example.ssmousepro.injection.TouchPipeline;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class s12 extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, gb1 {

    /* JADX INFO: renamed from: c */
    public final ku1 f10201c;

    /* JADX INFO: renamed from: e */
    public final GestureDetector f10203e;

    /* JADX INFO: renamed from: a */
    public final PointF f10199a = new PointF();

    /* JADX INFO: renamed from: b */
    public final PointF f10200b = new PointF();

    /* JADX INFO: renamed from: d */
    public final float f10202d = 25.0f;

    /* JADX INFO: renamed from: f */
    public volatile float f10204f = 3.1415927f;

    public s12(Context context, ku1 ku1Var) {
        this.f10201c = ku1Var;
        this.f10203e = new GestureDetector(context, this);
    }

    @Override // p000.gb1
    /* JADX INFO: renamed from: a */
    public final void mo2951a(float[] fArr, float f) {
        this.f10204f = -f;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.f10199a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float x = (motionEvent2.getX() - this.f10199a.x) / this.f10202d;
        float y = motionEvent2.getY();
        PointF pointF = this.f10199a;
        float f3 = (y - pointF.y) / this.f10202d;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d = this.f10204f;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        PointF pointF2 = this.f10200b;
        pointF2.x -= (fCos * x) - (fSin * f3);
        float f4 = (fCos * f3) + (fSin * x) + pointF2.y;
        pointF2.y = f4;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f4));
        ku1 ku1Var = this.f10201c;
        PointF pointF3 = this.f10200b;
        synchronized (ku1Var) {
            float f5 = pointF3.y;
            ku1Var.f6031g = f5;
            Matrix.setRotateM(ku1Var.f6029e, 0, -f5, (float) Math.cos(ku1Var.f6032m), (float) Math.sin(ku1Var.f6032m), TouchPipeline.SIZE);
            Matrix.setRotateM(ku1Var.f6030f, 0, -pointF3.x, TouchPipeline.SIZE, 1.0f, TouchPipeline.SIZE);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f10201c.f6035p.performClick();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f10203e.onTouchEvent(motionEvent);
    }
}
