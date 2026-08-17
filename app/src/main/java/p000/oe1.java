package p000;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC0068g;
import com.sousasantoslogic.sspro.R;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class oe1 extends AbstractC0068g {

    /* JADX INFO: renamed from: a */
    public final TextView f7769a;

    /* JADX INFO: renamed from: b */
    public final View f7770b;

    public oe1(View view) {
        super(view);
        if (z42.f13274a < 26) {
            view.setFocusable(true);
        }
        this.f7769a = (TextView) view.findViewById(R.id.exo_text);
        this.f7770b = view.findViewById(R.id.exo_check);
    }
}
