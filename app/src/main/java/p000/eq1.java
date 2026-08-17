package p000;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class eq1 extends TouchDelegate {

    /* JADX INFO: renamed from: a */
    public final View f3414a;

    /* JADX INFO: renamed from: b */
    public final Rect f3415b;

    /* JADX INFO: renamed from: c */
    public final Rect f3416c;

    /* JADX INFO: renamed from: d */
    public final Rect f3417d;

    /* JADX INFO: renamed from: e */
    public final int f3418e;

    /* JADX INFO: renamed from: f */
    public boolean f3419f;

    public eq1(Rect rect, Rect rect2, View view) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f3418e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f3415b = rect3;
        Rect rect4 = new Rect();
        this.f3417d = rect4;
        Rect rect5 = new Rect();
        this.f3416c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i = -scaledTouchSlop;
        rect4.inset(i, i);
        rect5.set(rect2);
        this.f3414a = view;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003e  */
    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z3 = true;
        if (action != 0) {
            if (action == 1 || action == 2) {
                z2 = this.f3419f;
                if (z2 && !this.f3417d.contains(x, y)) {
                    z3 = z2;
                    z = false;
                }
            } else if (action != 3) {
                z = true;
                z3 = false;
            } else {
                z2 = this.f3419f;
                this.f3419f = false;
            }
            z3 = z2;
            z = true;
        } else if (this.f3415b.contains(x, y)) {
            this.f3419f = true;
            z = true;
        } else {
            z = true;
            z3 = false;
        }
        if (!z3) {
            return false;
        }
        Rect rect = this.f3416c;
        View view = this.f3414a;
        if (!z || rect.contains(x, y)) {
            motionEvent.setLocation(x - rect.left, y - rect.top);
        } else {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
