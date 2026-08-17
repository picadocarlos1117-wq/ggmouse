package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class f31 extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    public final i31 f3598a;

    /* JADX INFO: renamed from: b */
    public int f3599b = -1;

    /* JADX INFO: renamed from: c */
    public boolean f3600c;

    /* JADX INFO: renamed from: d */
    public final boolean f3601d;

    /* JADX INFO: renamed from: e */
    public final LayoutInflater f3602e;

    /* JADX INFO: renamed from: f */
    public final int f3603f;

    public f31(i31 i31Var, LayoutInflater layoutInflater, boolean z, int i) {
        this.f3601d = z;
        this.f3602e = layoutInflater;
        this.f3598a = i31Var;
        this.f3603f = i;
        m2700a();
    }

    /* JADX INFO: renamed from: a */
    public final void m2700a() {
        i31 i31Var = this.f3598a;
        r31 r31Var = i31Var.f4808v;
        if (r31Var != null) {
            i31Var.m3346i();
            ArrayList arrayList = i31Var.f4796j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((r31) arrayList.get(i)) == r31Var) {
                    this.f3599b = i;
                    return;
                }
            }
        }
        this.f3599b = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final r31 getItem(int i) {
        ArrayList arrayListM3349l;
        boolean z = this.f3601d;
        i31 i31Var = this.f3598a;
        if (z) {
            i31Var.m3346i();
            arrayListM3349l = i31Var.f4796j;
        } else {
            arrayListM3349l = i31Var.m3349l();
        }
        int i2 = this.f3599b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (r31) arrayListM3349l.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListM3349l;
        boolean z = this.f3601d;
        i31 i31Var = this.f3598a;
        if (z) {
            i31Var.m3346i();
            arrayListM3349l = i31Var.f4796j;
        } else {
            arrayListM3349l = i31Var.m3349l();
        }
        return this.f3599b < 0 ? arrayListM3349l.size() : arrayListM3349l.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.f3602e.inflate(this.f3603f, viewGroup, false);
        }
        int i2 = getItem(i).f9672b;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).f9672b : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f3598a.mo3350m() && i2 != i4) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        i41 i41Var = (i41) view;
        if (this.f3600c) {
            listMenuItemView.setForceShowIcon(true);
        }
        i41Var.mo205c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m2700a();
        super.notifyDataSetChanged();
    }
}
