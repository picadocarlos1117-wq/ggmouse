package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import com.example.ssmousepro.OverlayDisplayBinder;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ht0 implements g41, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    public Context f4695a;

    /* JADX INFO: renamed from: b */
    public LayoutInflater f4696b;

    /* JADX INFO: renamed from: c */
    public i31 f4697c;

    /* JADX INFO: renamed from: d */
    public ExpandedMenuView f4698d;

    /* JADX INFO: renamed from: e */
    public f41 f4699e;

    /* JADX INFO: renamed from: f */
    public gt0 f4700f;

    public ht0(Context context) {
        this.f4695a = context;
        this.f4696b = LayoutInflater.from(context);
    }

    @Override // p000.g41
    /* JADX INFO: renamed from: a */
    public final void mo2928a(i31 i31Var, boolean z) {
        f41 f41Var = this.f4699e;
        if (f41Var != null) {
            f41Var.mo766a(i31Var, z);
        }
    }

    @Override // p000.g41
    /* JADX INFO: renamed from: c */
    public final boolean mo2929c(nx1 nx1Var) {
        boolean zHasVisibleItems = nx1Var.hasVisibleItems();
        Context context = nx1Var.f4787a;
        if (!zHasVisibleItems) {
            return false;
        }
        j31 j31Var = new j31();
        j31Var.f5251a = nx1Var;
        C1357r5 c1357r5 = new C1357r5(context);
        ht0 ht0Var = new ht0(c1357r5.getContext());
        j31Var.f5253c = ht0Var;
        ht0Var.f4699e = j31Var;
        nx1Var.m3339b(ht0Var, context);
        ht0 ht0Var2 = j31Var.f5253c;
        if (ht0Var2.f4700f == null) {
            ht0Var2.f4700f = new gt0(ht0Var2);
        }
        gt0 gt0Var = ht0Var2.f4700f;
        C1133n5 c1133n5 = c1357r5.f9726a;
        c1133n5.f7230o = gt0Var;
        c1133n5.f7231p = j31Var;
        View view = nx1Var.f4801o;
        if (view != null) {
            c1133n5.f7220e = view;
        } else {
            c1133n5.f7218c = nx1Var.f4800n;
            c1357r5.setTitle(nx1Var.f4799m);
        }
        c1133n5.f7228m = j31Var;
        DialogInterfaceC1394s5 dialogInterfaceC1394s5Create = c1357r5.create();
        j31Var.f5252b = dialogInterfaceC1394s5Create;
        dialogInterfaceC1394s5Create.setOnDismissListener(j31Var);
        WindowManager.LayoutParams attributes = j31Var.f5252b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= OverlayDisplayBinder.FLAG_EXTERNAL_DEX_HOSTING;
        j31Var.f5252b.show();
        f41 f41Var = this.f4699e;
        if (f41Var == null) {
            return true;
        }
        f41Var.mo782r(nx1Var);
        return true;
    }

    @Override // p000.g41
    /* JADX INFO: renamed from: d */
    public final boolean mo2930d() {
        return false;
    }

    @Override // p000.g41
    /* JADX INFO: renamed from: e */
    public final boolean mo2931e(r31 r31Var) {
        return false;
    }

    @Override // p000.g41
    /* JADX INFO: renamed from: f */
    public final void mo2932f(f41 f41Var) {
        throw null;
    }

    @Override // p000.g41
    /* JADX INFO: renamed from: h */
    public final boolean mo2933h(r31 r31Var) {
        return false;
    }

    @Override // p000.g41
    /* JADX INFO: renamed from: i */
    public final void mo2934i() {
        gt0 gt0Var = this.f4700f;
        if (gt0Var != null) {
            gt0Var.notifyDataSetChanged();
        }
    }

    @Override // p000.g41
    /* JADX INFO: renamed from: k */
    public final void mo2935k(Context context, i31 i31Var) {
        if (this.f4695a != null) {
            this.f4695a = context;
            if (this.f4696b == null) {
                this.f4696b = LayoutInflater.from(context);
            }
        }
        this.f4697c = i31Var;
        gt0 gt0Var = this.f4700f;
        if (gt0Var != null) {
            gt0Var.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f4697c.m3354q(this.f4700f.getItem(i), this, 0);
    }
}
