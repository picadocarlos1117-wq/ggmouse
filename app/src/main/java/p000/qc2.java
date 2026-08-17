package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC0064c;
import androidx.recyclerview.widget.AbstractC0068g;
import com.sousasantoslogic.sspro.R;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class qc2 extends AbstractC0064c {

    /* JADX INFO: renamed from: a */
    public final qz0 f9483a;

    public qc2(qz0 qz0Var) {
        this.f9483a = qz0Var;
    }

    @Override // androidx.recyclerview.widget.AbstractC0064c
    public final int getItemCount() {
        return this.f9483a.f9623c.f10425f;
    }

    @Override // androidx.recyclerview.widget.AbstractC0064c
    public final void onBindViewHolder(AbstractC0068g abstractC0068g, int i) {
        pc2 pc2Var = (pc2) abstractC0068g;
        qz0 qz0Var = this.f9483a;
        int i2 = qz0Var.f9623c.f10420a.f1224c + i;
        pc2Var.f8847a.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i2)));
        TextView textView = pc2Var.f8847a;
        Context context = textView.getContext();
        textView.setContentDescription(t42.m6228b().get(1) == i2 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2)));
        C0558d8 c0558d8 = qz0Var.f9626f;
        if (t42.m6228b().get(1) == i2) {
            Object obj = c0558d8.f2822c;
        } else {
            Object obj2 = c0558d8.f2821b;
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.AbstractC0064c
    public final AbstractC0068g onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new pc2((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
