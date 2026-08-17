package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sousasantoslogic.sspro.R;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class li1 extends ConstraintLayout {

    /* JADX INFO: renamed from: x */
    public final RunnableC1430t4 f6357x;

    /* JADX INFO: renamed from: y */
    public int f6358y;

    /* JADX INFO: renamed from: z */
    public final zz0 f6359z;

    public li1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        zz0 zz0Var = new zz0();
        this.f6359z = zz0Var;
        rk1 rk1Var = new rk1(0.5f);
        or1 or1VarM5313e = zz0Var.f13626a.f13172a.m5313e();
        or1VarM5313e.f8429e = rk1Var;
        or1VarM5313e.f8430f = rk1Var;
        or1VarM5313e.f8431g = rk1Var;
        or1VarM5313e.f8432h = rk1Var;
        zz0Var.setShapeAppearanceModel(or1VarM5313e.m5050a());
        this.f6359z.m7399j(ColorStateList.valueOf(-1));
        zz0 zz0Var2 = this.f6359z;
        WeakHashMap weakHashMap = i72.f4849a;
        s62.m5996q(this, zz0Var2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ji1.f5411s, R.attr.materialClockStyle, 0);
        this.f6358y = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f6357x = new RunnableC1430t4(this, 27);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = i72.f4849a;
            view.setId(t62.m6237a());
        }
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC1430t4 runnableC1430t4 = this.f6357x;
            handler.removeCallbacks(runnableC1430t4);
            handler.post(runnableC1430t4);
        }
    }

    /* JADX INFO: renamed from: m */
    public abstract void mo1730m();

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        mo1730m();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC1430t4 runnableC1430t4 = this.f6357x;
            handler.removeCallbacks(runnableC1430t4);
            handler.post(runnableC1430t4);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.f6359z.m7399j(ColorStateList.valueOf(i));
    }
}
