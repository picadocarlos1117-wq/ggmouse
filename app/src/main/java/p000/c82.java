package p000;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class c82 {

    /* JADX INFO: renamed from: c */
    public Interpolator f1702c;

    /* JADX INFO: renamed from: d */
    public d82 f1703d;

    /* JADX INFO: renamed from: e */
    public boolean f1704e;

    /* JADX INFO: renamed from: b */
    public long f1701b = -1;

    /* JADX INFO: renamed from: f */
    public final p12 f1705f = new p12(this);

    /* JADX INFO: renamed from: a */
    public final ArrayList f1700a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final void m1158a() {
        if (this.f1704e) {
            ArrayList arrayList = this.f1700a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((b82) obj).m943b();
            }
            this.f1704e = false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1159b() {
        View view;
        if (this.f1704e) {
            return;
        }
        ArrayList arrayList = this.f1700a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            b82 b82Var = (b82) obj;
            long j = this.f1701b;
            if (j >= 0) {
                b82Var.m944c(j);
            }
            Interpolator interpolator = this.f1702c;
            if (interpolator != null && (view = (View) b82Var.f1254a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f1703d != null) {
                b82Var.m945d(this.f1705f);
            }
            View view2 = (View) b82Var.f1254a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f1704e = true;
    }
}
