package p000;

import java.io.IOException;

/* JADX INFO: renamed from: ab */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC0012ab implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f122a;

    /* JADX INFO: renamed from: b */
    public final Object f123b;

    public /* synthetic */ AbstractRunnableC0012ab(Object obj, int i) {
        this.f122a = i;
        this.f123b = obj;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo140a();

    /* JADX INFO: renamed from: b */
    public abstract void mo141b();

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f122a;
        Object obj = this.f123b;
        switch (i) {
            case 0:
                C0093bb c0093bb = (C0093bb) obj;
                try {
                    if (c0093bb.f1275n == null) {
                        throw new IOException("Unable to perform write due to unavailable sink.");
                    }
                    mo140a();
                    return;
                } catch (Exception e) {
                    c0093bb.f1270d.m7063o(e);
                    return;
                }
            default:
                C1307pt c1307pt = (C1307pt) obj;
                C1307pt c1307ptM5326a = c1307pt.m5326a();
                try {
                    mo141b();
                    return;
                } finally {
                    c1307pt.m5327c(c1307ptM5326a);
                }
        }
    }
}
