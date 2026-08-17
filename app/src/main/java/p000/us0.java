package p000;

import android.view.View;
import androidx.recyclerview.widget.AbstractC0068g;
import androidx.recyclerview.widget.C0067f;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class us0 {

    /* JADX INFO: renamed from: a */
    public boolean f11408a;

    /* JADX INFO: renamed from: b */
    public int f11409b;

    /* JADX INFO: renamed from: c */
    public int f11410c;

    /* JADX INFO: renamed from: d */
    public int f11411d;

    /* JADX INFO: renamed from: e */
    public int f11412e;

    /* JADX INFO: renamed from: f */
    public int f11413f;

    /* JADX INFO: renamed from: g */
    public int f11414g;

    /* JADX INFO: renamed from: h */
    public int f11415h;

    /* JADX INFO: renamed from: i */
    public int f11416i;

    /* JADX INFO: renamed from: j */
    public int f11417j;

    /* JADX INFO: renamed from: k */
    public List f11418k;

    /* JADX INFO: renamed from: l */
    public boolean f11419l;

    /* JADX INFO: renamed from: a */
    public final void m6529a(View view) {
        int layoutPosition;
        int size = this.f11418k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((AbstractC0068g) this.f11418k.get(i2)).itemView;
            mj1 mj1Var = (mj1) view3.getLayoutParams();
            if (view3 != view && !mj1Var.f7010a.isRemoved() && (layoutPosition = (mj1Var.f7010a.getLayoutPosition() - this.f11411d) * this.f11412e) >= 0 && layoutPosition < i) {
                view2 = view3;
                if (layoutPosition == 0) {
                    break;
                } else {
                    i = layoutPosition;
                }
            }
        }
        if (view2 == null) {
            this.f11411d = -1;
        } else {
            this.f11411d = ((mj1) view2.getLayoutParams()).f7010a.getLayoutPosition();
        }
    }

    /* JADX INFO: renamed from: b */
    public final View m6530b(C0067f c0067f) {
        List list = this.f11418k;
        if (list == null) {
            View view = c0067f.m693k(this.f11411d, Long.MAX_VALUE).itemView;
            this.f11411d += this.f11412e;
            return view;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view2 = ((AbstractC0068g) this.f11418k.get(i)).itemView;
            mj1 mj1Var = (mj1) view2.getLayoutParams();
            if (!mj1Var.f7010a.isRemoved() && this.f11411d == mj1Var.f7010a.getLayoutPosition()) {
                m6529a(view2);
                return view2;
            }
        }
        return null;
    }
}
