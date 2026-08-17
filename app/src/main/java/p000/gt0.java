package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.sousasantoslogic.sspro.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class gt0 extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    public int f4316a = -1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ht0 f4317b;

    public gt0(ht0 ht0Var) {
        this.f4317b = ht0Var;
        m3055a();
    }

    /* JADX INFO: renamed from: a */
    public final void m3055a() {
        i31 i31Var = this.f4317b.f4697c;
        r31 r31Var = i31Var.f4808v;
        if (r31Var != null) {
            i31Var.m3346i();
            ArrayList arrayList = i31Var.f4796j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((r31) arrayList.get(i)) == r31Var) {
                    this.f4316a = i;
                    return;
                }
            }
        }
        this.f4316a = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final r31 getItem(int i) {
        ht0 ht0Var = this.f4317b;
        i31 i31Var = ht0Var.f4697c;
        i31Var.m3346i();
        ArrayList arrayList = i31Var.f4796j;
        ht0Var.getClass();
        int i2 = this.f4316a;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (r31) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ht0 ht0Var = this.f4317b;
        i31 i31Var = ht0Var.f4697c;
        i31Var.m3346i();
        int size = i31Var.f4796j.size();
        ht0Var.getClass();
        return this.f4316a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f4317b.f4696b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((i41) view).mo205c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m3055a();
        super.notifyDataSetChanged();
    }
}
