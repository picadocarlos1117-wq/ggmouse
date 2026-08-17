package p000;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class xy0 extends ArrayAdapter {

    /* JADX INFO: renamed from: a */
    public ColorStateList f12777a;

    /* JADX INFO: renamed from: b */
    public ColorStateList f12778b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ yy0 f12779c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xy0(yy0 yy0Var, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.f12779c = yy0Var;
        m6980a();
    }

    /* JADX INFO: renamed from: a */
    public final void m6980a() {
        ColorStateList colorStateList;
        yy0 yy0Var = this.f12779c;
        ColorStateList colorStateList2 = yy0Var.f13168q;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.f12778b = colorStateList;
        if (yy0Var.f13167p != 0 && yy0Var.f13168q != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{AbstractC0539cq.m2113b(yy0Var.f13168q.getColorForState(iArr3, 0), yy0Var.f13167p), AbstractC0539cq.m2113b(yy0Var.f13168q.getColorForState(iArr2, 0), yy0Var.f13167p), yy0Var.f13167p});
        }
        this.f12777a = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            yy0 yy0Var = this.f12779c;
            Drawable rippleDrawable = null;
            if (yy0Var.getText().toString().contentEquals(textView.getText()) && yy0Var.f13167p != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(yy0Var.f13167p);
                if (this.f12778b != null) {
                    v30.m6560h(colorDrawable, this.f12777a);
                    rippleDrawable = new RippleDrawable(this.f12778b, colorDrawable, null);
                } else {
                    rippleDrawable = colorDrawable;
                }
            }
            WeakHashMap weakHashMap = i72.f4849a;
            s62.m5996q(textView, rippleDrawable);
        }
        return view2;
    }
}
