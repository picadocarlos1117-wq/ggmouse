package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;

/* JADX INFO: renamed from: o7 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1172o7 {

    /* JADX INFO: renamed from: a */
    public Object f7672a;

    /* JADX INFO: renamed from: b */
    public Object f7673b;

    public AbstractC1172o7(Context context) {
        this.f7672a = context;
    }

    /* JADX INFO: renamed from: c */
    public void m4714c() {
        C1135n7 c1135n7 = (C1135n7) this.f7672a;
        if (c1135n7 != null) {
            try {
                ((LayoutInflaterFactory2C1359r7) this.f7673b).f9792p.unregisterReceiver(c1135n7);
            } catch (IllegalArgumentException unused) {
            }
            this.f7672a = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract IntentFilter mo4386d();

    /* JADX INFO: renamed from: e */
    public abstract int mo4387e();

    /* JADX INFO: renamed from: f */
    public MenuItem m4715f(MenuItem menuItem) {
        if (!(menuItem instanceof my1)) {
            return menuItem;
        }
        my1 my1Var = (my1) menuItem;
        if (((zs1) this.f7673b) == null) {
            this.f7673b = new zs1();
        }
        MenuItem menuItem2 = (MenuItem) ((zs1) this.f7673b).getOrDefault(my1Var, null);
        if (menuItem2 != null) {
            return menuItem2;
        }
        v31 v31Var = new v31((Context) this.f7672a, my1Var);
        ((zs1) this.f7673b).put(my1Var, v31Var);
        return v31Var;
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo4388g();

    /* JADX INFO: renamed from: h */
    public void m4716h() {
        m4714c();
        IntentFilter intentFilterMo4386d = mo4386d();
        if (intentFilterMo4386d.countActions() == 0) {
            return;
        }
        if (((C1135n7) this.f7672a) == null) {
            this.f7672a = new C1135n7(this, 0);
        }
        ((LayoutInflaterFactory2C1359r7) this.f7673b).f9792p.registerReceiver((C1135n7) this.f7672a, intentFilterMo4386d);
    }

    public AbstractC1172o7(LayoutInflaterFactory2C1359r7 layoutInflaterFactory2C1359r7) {
        this.f7673b = layoutInflaterFactory2C1359r7;
    }
}
