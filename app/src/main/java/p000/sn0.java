package p000;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class sn0 implements View.OnTouchListener {

    /* JADX INFO: renamed from: a */
    public final Dialog f10443a;

    /* JADX INFO: renamed from: b */
    public final int f10444b;

    /* JADX INFO: renamed from: c */
    public final int f10445c;

    public sn0(Dialog dialog, Rect rect) {
        this.f10443a = dialog;
        this.f10444b = rect.left;
        this.f10445c = rect.top;
        ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = viewFindViewById.getLeft() + this.f10444b;
        int width = viewFindViewById.getWidth() + left;
        int top = viewFindViewById.getTop() + this.f10445c;
        if (new RectF(left, top, width, viewFindViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        view.performClick();
        return this.f10443a.onTouchEvent(motionEventObtain);
    }
}
