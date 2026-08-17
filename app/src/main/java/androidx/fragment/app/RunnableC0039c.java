package androidx.fragment.app;

import java.util.ArrayList;
import p000.jd0;

/* JADX INFO: renamed from: androidx.fragment.app.c */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0039c implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f674a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0061y f675b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f676c;

    public RunnableC0039c(C0042f c0042f, ArrayList arrayList, C0061y c0061y) {
        this.f676c = arrayList;
        this.f675b = c0061y;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f674a;
        C0061y c0061y = this.f675b;
        Object obj = this.f676c;
        switch (i) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList.contains(c0061y)) {
                    arrayList.remove(c0061y);
                    jd0.m3603a(c0061y.f769c.mView, c0061y.f767a);
                }
                break;
            default:
                if (((C0042f) obj).f683b.contains(c0061y)) {
                    jd0.m3603a(c0061y.f769c.mView, c0061y.f767a);
                }
                break;
        }
    }

    public RunnableC0039c(C0042f c0042f, C0061y c0061y) {
        this.f676c = c0042f;
        this.f675b = c0061y;
    }
}
