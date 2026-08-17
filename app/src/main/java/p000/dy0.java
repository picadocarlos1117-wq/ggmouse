package p000;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dy0 {

    /* JADX INFO: renamed from: a */
    public int f3073a;

    /* JADX INFO: renamed from: b */
    public int f3074b;

    /* JADX INFO: renamed from: c */
    public int f3075c;

    /* JADX INFO: renamed from: d */
    public Object f3076d;

    public dy0() {
        if (pu0.f9163b == null) {
            pu0.f9163b = new pu0(15);
        }
    }

    /* JADX INFO: renamed from: a */
    public int m2406a(int i) {
        if (i < this.f3075c) {
            return ((ByteBuffer) this.f3076d).getShort(this.f3074b + i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public void m2407b() {
        if (((ey0) this.f3076d).f3488m != this.f3075c) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract Object mo2408c(View view);

    /* JADX INFO: renamed from: d */
    public abstract void mo2409d(View view, Object obj);

    /* JADX INFO: renamed from: e */
    public void m2410e() {
        while (true) {
            int i = this.f3073a;
            ey0 ey0Var = (ey0) this.f3076d;
            if (i >= ey0Var.f3486f || ey0Var.f3483c[i] >= 0) {
                return;
            } else {
                this.f3073a = i + 1;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m2411f(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.f3074b) {
            mo2409d(view, obj);
            return;
        }
        C1056l2 c1056l2 = null;
        if (Build.VERSION.SDK_INT >= this.f3074b) {
            tag = mo2408c(view);
        } else {
            tag = view.getTag(this.f3073a);
            if (!((Class) this.f3076d).isInstance(tag)) {
                tag = null;
            }
        }
        if (mo2412g(tag, obj)) {
            View.AccessibilityDelegate accessibilityDelegateM3370b = i72.m3370b(view);
            if (accessibilityDelegateM3370b != null) {
                c1056l2 = accessibilityDelegateM3370b instanceof C0775j2 ? ((C0775j2) accessibilityDelegateM3370b).f5240a : new C1056l2(accessibilityDelegateM3370b);
            }
            if (c1056l2 == null) {
                c1056l2 = new C1056l2();
            }
            i72.m3378j(view, c1056l2);
            view.setTag(this.f3073a, obj);
            i72.m3373e(view, this.f3075c);
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract boolean mo2412g(Object obj, Object obj2);

    public boolean hasNext() {
        return this.f3073a < ((ey0) this.f3076d).f3486f;
    }

    public void remove() {
        ey0 ey0Var = (ey0) this.f3076d;
        m2407b();
        if (this.f3074b == -1) {
            f40.m2719o("Call next() before removing element from the iterator.");
            return;
        }
        ey0Var.m2652b();
        ey0Var.m2660j(this.f3074b);
        this.f3074b = -1;
        this.f3075c = ey0Var.f3488m;
    }
}
