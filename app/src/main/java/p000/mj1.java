package p000;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC0068g;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class mj1 extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a */
    public AbstractC0068g f7010a;

    /* JADX INFO: renamed from: b */
    public final Rect f7011b;

    /* JADX INFO: renamed from: c */
    public boolean f7012c;

    /* JADX INFO: renamed from: d */
    public boolean f7013d;

    public mj1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7011b = new Rect();
        this.f7012c = true;
        this.f7013d = false;
    }

    public mj1(int i, int i2) {
        super(i, i2);
        this.f7011b = new Rect();
        this.f7012c = true;
        this.f7013d = false;
    }

    public mj1(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f7011b = new Rect();
        this.f7012c = true;
        this.f7013d = false;
    }

    public mj1(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f7011b = new Rect();
        this.f7012c = true;
        this.f7013d = false;
    }

    public mj1(mj1 mj1Var) {
        super((ViewGroup.LayoutParams) mj1Var);
        this.f7011b = new Rect();
        this.f7012c = true;
        this.f7013d = false;
    }
}
