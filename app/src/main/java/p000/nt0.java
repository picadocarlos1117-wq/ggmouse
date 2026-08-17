package p000;

import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class nt0 implements View.OnTouchListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7534a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f7535b;

    public /* synthetic */ nt0(Object obj, int i) {
        this.f7534a = i;
        this.f7535b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = this.f7534a;
        Object obj = this.f7535b;
        switch (i) {
            case 0:
                ot0 ot0Var = (ot0) obj;
                lt0 lt0Var = ot0Var.f8488w;
                Handler handler = ot0Var.f8466A;
                C0126c8 c0126c8 = ot0Var.f8470E;
                int action = motionEvent.getAction();
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (action == 0 && c0126c8 != null && c0126c8.isShowing() && x >= 0 && x < c0126c8.getWidth() && y >= 0 && y < c0126c8.getHeight()) {
                    handler.postDelayed(lt0Var, 250L);
                } else if (action == 1) {
                    handler.removeCallbacks(lt0Var);
                }
                return false;
            default:
                if (((Checkable) view).isChecked()) {
                    return ((GestureDetector) obj).onTouchEvent(motionEvent);
                }
                return false;
        }
    }
}
