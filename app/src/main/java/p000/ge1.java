package p000;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.AbstractC0064c;
import androidx.recyclerview.widget.AbstractC0068g;
import com.sousasantoslogic.sspro.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ge1 extends AbstractC0064c {

    /* JADX INFO: renamed from: a */
    public List f4167a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ re1 f4168b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f4169c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ re1 f4170d;

    public ge1(re1 re1Var, int i) {
        this.f4169c = i;
        this.f4170d = re1Var;
        this.f4168b = re1Var;
    }

    /* JADX INFO: renamed from: a */
    public boolean m2966a(x00 x00Var) {
        for (int i = 0; i < this.f4167a.size(); i++) {
            if (x00Var.f4439q.containsKey(((pe1) this.f4167a.get(i)).f8868a.f5652b)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public void m2967b(List list) {
        re1 re1Var = this.f4170d;
        ImageView imageView = re1Var.f9937B;
        boolean z = false;
        for (int i = 0; i < ((kk1) list).f5898d; i++) {
            pe1 pe1Var = (pe1) ((kk1) list).get(i);
            if (pe1Var.f8868a.f5655e[pe1Var.f8869b]) {
                z = true;
                break;
            }
        }
        if (imageView != null) {
            imageView.setImageDrawable(z ? re1Var.f9975g0 : re1Var.f9976h0);
            imageView.setContentDescription(z ? re1Var.f9977i0 : re1Var.f9978j0);
        }
        this.f4167a = list;
    }

    /* JADX INFO: renamed from: c */
    public void m2968c(oe1 oe1Var, int i) {
        switch (this.f4169c) {
            case 1:
                m2969d(oe1Var, i);
                if (i > 0) {
                    pe1 pe1Var = (pe1) this.f4167a.get(i - 1);
                    oe1Var.f7770b.setVisibility(pe1Var.f8868a.f5655e[pe1Var.f8869b] ? 0 : 4);
                }
                break;
            default:
                m2969d(oe1Var, i);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003d  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a3  */
    /* JADX INFO: renamed from: d */
    public final void m2969d(oe1 oe1Var, int i) {
        ee1 ee1Var = this.f4168b.f9986o0;
        if (ee1Var == null) {
        }
        boolean z = true;
        if (i != 0) {
            pe1 pe1Var = (pe1) this.f4167a.get(i - 1);
            y12 y12Var = pe1Var.f8868a.f5652b;
            if (((f80) ee1Var).m2769q().f4439q.get(y12Var) != null) {
                z = pe1Var.f8868a.f5655e[pe1Var.f8869b];
            }
            oe1Var.f7769a.setText(pe1Var.f8870c);
            oe1Var.f7770b.setVisibility(z ? 0 : 4);
            oe1Var.itemView.setOnClickListener(new xc0(this, ee1Var, y12Var, pe1Var, 1));
            return;
        }
        switch (this.f4169c) {
            case 0:
                oe1Var.f7769a.setText(R.string.exo_track_selection_auto);
                ee1 ee1Var2 = this.f4170d.f9986o0;
                ee1Var2.getClass();
                oe1Var.f7770b.setVisibility(m2966a(((f80) ee1Var2).m2769q()) ? 4 : 0);
                oe1Var.itemView.setOnClickListener(new ViewOnClickListenerC1597xn(this, 5));
                break;
            default:
                oe1Var.f7769a.setText(R.string.exo_track_selection_none);
                for (int i2 = 0; i2 < this.f4167a.size(); i2++) {
                    pe1 pe1Var2 = (pe1) this.f4167a.get(i2);
                    if (pe1Var2.f8868a.f5655e[pe1Var2.f8869b]) {
                        z = false;
                        oe1Var.f7770b.setVisibility(z ? 0 : 4);
                        oe1Var.itemView.setOnClickListener(new ViewOnClickListenerC1597xn(this, 7));
                    }
                    break;
                }
                oe1Var.f7770b.setVisibility(z ? 0 : 4);
                oe1Var.itemView.setOnClickListener(new ViewOnClickListenerC1597xn(this, 7));
                break;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0064c
    public final int getItemCount() {
        if (this.f4167a.isEmpty()) {
            return 0;
        }
        return this.f4167a.size() + 1;
    }

    @Override // androidx.recyclerview.widget.AbstractC0064c
    public /* bridge */ /* synthetic */ void onBindViewHolder(AbstractC0068g abstractC0068g, int i) {
        switch (this.f4169c) {
            case 1:
                m2968c((oe1) abstractC0068g, i);
                break;
            default:
                m2968c((oe1) abstractC0068g, i);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0064c
    public final AbstractC0068g onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new oe1(LayoutInflater.from(this.f4168b.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
    }

    /* JADX INFO: renamed from: e */
    private final void m2965e(String str) {
    }
}
