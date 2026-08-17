package p000;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC0064c;
import androidx.recyclerview.widget.AbstractC0068g;
import com.sousasantoslogic.sspro.R;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ne1 extends AbstractC0064c {

    /* JADX INFO: renamed from: a */
    public final String[] f7390a;

    /* JADX INFO: renamed from: b */
    public final String[] f7391b;

    /* JADX INFO: renamed from: c */
    public final Drawable[] f7392c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ re1 f7393d;

    public ne1(re1 re1Var, String[] strArr, Drawable[] drawableArr) {
        this.f7393d = re1Var;
        this.f7390a = strArr;
        this.f7391b = new String[strArr.length];
        this.f7392c = drawableArr;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m4538a(int i) {
        re1 re1Var = this.f7393d;
        ee1 ee1Var = re1Var.f9986o0;
        if (ee1Var == null) {
            return false;
        }
        if (i != 0) {
            return i != 1 || (((f80) ee1Var).m2770r(30) && ((f80) re1Var.f9986o0).m2770r(29));
        }
        return ((f80) ee1Var).m2770r(13);
    }

    @Override // androidx.recyclerview.widget.AbstractC0064c
    public final int getItemCount() {
        return this.f7390a.length;
    }

    @Override // androidx.recyclerview.widget.AbstractC0064c
    public final long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.AbstractC0064c
    public final void onBindViewHolder(AbstractC0068g abstractC0068g, int i) {
        me1 me1Var = (me1) abstractC0068g;
        if (m4538a(i)) {
            me1Var.itemView.setLayoutParams(new mj1(-1, -2));
        } else {
            me1Var.itemView.setLayoutParams(new mj1(0, 0));
        }
        me1Var.f6781a.setText(this.f7390a[i]);
        String str = this.f7391b[i];
        TextView textView = me1Var.f6782b;
        if (str == null) {
            textView.setVisibility(8);
        } else {
            textView.setText(str);
        }
        Drawable drawable = this.f7392c[i];
        ImageView imageView = me1Var.f6783c;
        if (drawable == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setImageDrawable(drawable);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0064c
    public final AbstractC0068g onCreateViewHolder(ViewGroup viewGroup, int i) {
        re1 re1Var = this.f7393d;
        return new me1(re1Var, LayoutInflater.from(re1Var.getContext()).inflate(R.layout.exo_styled_settings_list_item, viewGroup, false));
    }
}
