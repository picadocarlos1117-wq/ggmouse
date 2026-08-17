package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC0064c;
import androidx.recyclerview.widget.AbstractC0068g;
import com.sousasantoslogic.sspro.R;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ke1 extends AbstractC0064c {

    /* JADX INFO: renamed from: a */
    public final String[] f5783a;

    /* JADX INFO: renamed from: b */
    public final float[] f5784b;

    /* JADX INFO: renamed from: c */
    public int f5785c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ re1 f5786d;

    public ke1(re1 re1Var, String[] strArr, float[] fArr) {
        this.f5786d = re1Var;
        this.f5783a = strArr;
        this.f5784b = fArr;
    }

    @Override // androidx.recyclerview.widget.AbstractC0064c
    public final int getItemCount() {
        return this.f5783a.length;
    }

    @Override // androidx.recyclerview.widget.AbstractC0064c
    public final void onBindViewHolder(AbstractC0068g abstractC0068g, final int i) {
        oe1 oe1Var = (oe1) abstractC0068g;
        String[] strArr = this.f5783a;
        if (i < strArr.length) {
            oe1Var.f7769a.setText(strArr[i]);
        }
        if (i == this.f5785c) {
            oe1Var.itemView.setSelected(true);
            oe1Var.f7770b.setVisibility(0);
        } else {
            oe1Var.itemView.setSelected(false);
            oe1Var.f7770b.setVisibility(4);
        }
        oe1Var.itemView.setOnClickListener(new View.OnClickListener() { // from class: je1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ke1 ke1Var = this.f5376a;
                re1 re1Var = ke1Var.f5786d;
                int i2 = ke1Var.f5785c;
                int i3 = i;
                if (i3 != i2) {
                    re1Var.setPlaybackSpeed(ke1Var.f5784b[i3]);
                }
                re1Var.f9987p.dismiss();
            }
        });
    }

    @Override // androidx.recyclerview.widget.AbstractC0064c
    public final AbstractC0068g onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new oe1(LayoutInflater.from(this.f5786d.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
    }
}
