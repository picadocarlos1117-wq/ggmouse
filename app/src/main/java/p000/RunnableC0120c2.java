package p000;

import android.util.Log;
import androidx.recyclerview.widget.AbstractC0066e;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: c2 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0120c2 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1626a;

    /* JADX INFO: renamed from: b */
    public final int f1627b;

    /* JADX INFO: renamed from: c */
    public final Object f1628c;

    public RunnableC0120c2(List list, int i, Throwable th) {
        this.f1626a = 3;
        rc2.m5789j(list, "initCallbacks cannot be null");
        this.f1628c = new ArrayList(list);
        this.f1627b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1626a;
        boolean z = true;
        int i2 = 0;
        int i3 = this.f1627b;
        Object obj = this.f1628c;
        switch (i) {
            case 0:
                u91 u91Var = (u91) obj;
                try {
                    jc1.m3599c();
                    try {
                        vm0 vm0Var = jc1.f5363a;
                        vm0Var.getClass();
                        s41 s41Var = u91Var.f11199a;
                        s41Var.getClass();
                        if (i3 <= 0) {
                            z = false;
                        }
                        p32.m5177l(z, "numMessages must be > 0");
                        if (!s41Var.isClosed()) {
                            s41Var.f10229r += (long) i3;
                            s41Var.m5973c();
                            break;
                        }
                        vm0Var.getClass();
                        return;
                    } catch (Throwable th) {
                        try {
                            jc1.f5363a.getClass();
                            break;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    u91Var.m6417f(th3);
                    return;
                }
            case 1:
                AbstractC1337qm abstractC1337qm = (AbstractC1337qm) ((pn0) obj).f8968a;
                if (abstractC1337qm != null) {
                    abstractC1337qm.mo4487M(i3);
                    return;
                }
                return;
            case 2:
                ((kx0) obj).f6056f.request(i3);
                return;
            case 3:
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size();
                if (i3 != 1) {
                    while (i2 < size) {
                        ((r50) arrayList.get(i2)).getClass();
                        i2++;
                    }
                    return;
                } else {
                    while (i2 < size) {
                        ((r50) arrayList.get(i2)).mo2938a();
                        i2++;
                    }
                    return;
                }
            default:
                RecyclerView recyclerView = ((qz0) obj).f9628m;
                if (recyclerView.f877C) {
                    return;
                }
                AbstractC0066e abstractC0066e = recyclerView.f931s;
                if (abstractC0066e == null) {
                    Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                    return;
                } else {
                    abstractC0066e.mo544w0(recyclerView, i3);
                    return;
                }
        }
    }

    public /* synthetic */ RunnableC0120c2(int i, int i2, Object obj) {
        this.f1626a = i2;
        this.f1628c = obj;
        this.f1627b = i;
    }
}
