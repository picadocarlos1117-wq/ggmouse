package p000;

import android.view.View;
import androidx.recyclerview.widget.AbstractC0066e;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class lw0 {

    /* JADX INFO: renamed from: a */
    public int f6528a;

    /* JADX INFO: renamed from: b */
    public int f6529b;

    /* JADX INFO: renamed from: c */
    public int f6530c;

    /* JADX INFO: renamed from: d */
    public final int f6531d;

    /* JADX INFO: renamed from: e */
    public final Object f6532e;

    /* JADX INFO: renamed from: f */
    public final Object f6533f;

    public lw0(ch1 ch1Var) {
        this.f6532e = ch1Var;
        this.f6528a = ch1Var.f1806a;
        this.f6529b = ch1Var.f1811f;
        this.f6530c = ch1Var.f1807b;
        C0599ed c0599ed = (C0599ed) ch1Var.f1813h;
        this.f6533f = c0599ed;
        c0599ed.getClass();
        this.f6531d = 3;
    }

    /* JADX INFO: renamed from: i */
    public static int m4308i(C0082b0 c0082b0, int i, int i2, byte[] bArr, int i3) {
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            int i6 = i5 + 3;
            if (i6 > i3) {
                break;
            }
            short s = (short) (bArr[i5] & 255);
            short s2 = (short) (bArr[i5 + 1] & 255);
            short s3 = (short) ((s | (s2 << 8)) & 4095);
            short s4 = (short) (((((short) (bArr[i5 + 2] & 255)) << 4) | (s2 >> 4)) & 4095);
            if (s3 < 3329) {
                ((short[]) c0082b0.f1104c)[i + i4] = s3;
                i4++;
            }
            if (i4 < i2 && s4 < 3329) {
                ((short[]) c0082b0.f1104c)[i + i4] = s4;
                i4++;
            }
            i5 = i6;
        }
        return i4;
    }

    /* JADX INFO: renamed from: a */
    public void m4309a() {
        ArrayList arrayList = (ArrayList) this.f6532e;
        View view = (View) arrayList.get(arrayList.size() - 1);
        bv1 bv1Var = (bv1) view.getLayoutParams();
        this.f6529b = ((StaggeredGridLayoutManager) this.f6533f).f960r.mo2785b(view);
        bv1Var.getClass();
    }

    /* JADX INFO: renamed from: b */
    public void m4310b() {
        ((ArrayList) this.f6532e).clear();
        this.f6528a = Integer.MIN_VALUE;
        this.f6529b = Integer.MIN_VALUE;
        this.f6530c = 0;
    }

    /* JADX INFO: renamed from: c */
    public int m4311c() {
        boolean z = ((StaggeredGridLayoutManager) this.f6533f).f965w;
        ArrayList arrayList = (ArrayList) this.f6532e;
        return z ? m4313e(arrayList.size() - 1, -1) : m4313e(0, arrayList.size());
    }

    /* JADX INFO: renamed from: d */
    public int m4312d() {
        boolean z = ((StaggeredGridLayoutManager) this.f6533f).f965w;
        ArrayList arrayList = (ArrayList) this.f6532e;
        return z ? m4313e(0, arrayList.size()) : m4313e(arrayList.size() - 1, -1);
    }

    /* JADX INFO: renamed from: e */
    public int m4313e(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f6533f;
        int iMo2794k = staggeredGridLayoutManager.f960r.mo2794k();
        int iMo2790g = staggeredGridLayoutManager.f960r.mo2790g();
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View view = (View) ((ArrayList) this.f6532e).get(i);
            int iMo2788e = staggeredGridLayoutManager.f960r.mo2788e(view);
            int iMo2785b = staggeredGridLayoutManager.f960r.mo2785b(view);
            boolean z = iMo2788e <= iMo2790g;
            boolean z2 = iMo2785b >= iMo2794k;
            if (z && z2 && (iMo2788e < iMo2794k || iMo2785b > iMo2790g)) {
                return AbstractC0066e.m651F(view);
            }
            i += i3;
        }
        return -1;
    }

    /* JADX INFO: renamed from: f */
    public int m4314f(int i) {
        int i2 = this.f6529b;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (((ArrayList) this.f6532e).size() == 0) {
            return i;
        }
        m4309a();
        return this.f6529b;
    }

    /* JADX INFO: renamed from: g */
    public View m4315g(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f6533f;
        ArrayList arrayList = (ArrayList) this.f6532e;
        View view = null;
        if (i2 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f965w && AbstractC0066e.m651F(view2) >= i) || ((!staggeredGridLayoutManager.f965w && AbstractC0066e.m651F(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            View view3 = (View) arrayList.get(i3);
            if ((staggeredGridLayoutManager.f965w && AbstractC0066e.m651F(view3) <= i) || ((!staggeredGridLayoutManager.f965w && AbstractC0066e.m651F(view3) >= i) || !view3.hasFocusable())) {
                break;
            }
            i3++;
            view = view3;
        }
        return view;
    }

    /* JADX INFO: renamed from: h */
    public int m4316h(int i) {
        ArrayList arrayList = (ArrayList) this.f6532e;
        int i2 = this.f6528a;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (arrayList.size() == 0) {
            return i;
        }
        View view = (View) arrayList.get(0);
        bv1 bv1Var = (bv1) view.getLayoutParams();
        this.f6528a = ((StaggeredGridLayoutManager) this.f6533f).f960r.mo2788e(view);
        bv1Var.getClass();
        return this.f6528a;
    }

    public lw0(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f6533f = staggeredGridLayoutManager;
        this.f6532e = new ArrayList();
        this.f6528a = Integer.MIN_VALUE;
        this.f6529b = Integer.MIN_VALUE;
        this.f6530c = 0;
        this.f6531d = i;
    }
}
