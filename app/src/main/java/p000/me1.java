package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC0068g;
import com.sousasantoslogic.sspro.R;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class me1 extends AbstractC0068g {

    /* JADX INFO: renamed from: a */
    public final TextView f6781a;

    /* JADX INFO: renamed from: b */
    public final TextView f6782b;

    /* JADX INFO: renamed from: c */
    public final ImageView f6783c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ re1 f6784d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me1(re1 re1Var, View view) {
        super(view);
        this.f6784d = re1Var;
        if (z42.f13274a < 26) {
            view.setFocusable(true);
        }
        this.f6781a = (TextView) view.findViewById(R.id.exo_main_text);
        this.f6782b = (TextView) view.findViewById(R.id.exo_sub_text);
        this.f6783c = (ImageView) view.findViewById(R.id.exo_icon);
        view.setOnClickListener(new ViewOnClickListenerC1597xn(this, 6));
    }
}
