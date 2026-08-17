package p000;

import android.os.Handler;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class zy1 {

    /* JADX INFO: renamed from: b */
    public static final ArrayList f13614b = new ArrayList(50);

    /* JADX INFO: renamed from: a */
    public final Handler f13615a;

    public zy1(Handler handler) {
        this.f13615a = handler;
    }

    /* JADX INFO: renamed from: b */
    public static yy1 m7385b() {
        yy1 yy1Var;
        ArrayList arrayList = f13614b;
        synchronized (arrayList) {
            try {
                yy1Var = arrayList.isEmpty() ? new yy1() : (yy1) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return yy1Var;
    }

    /* JADX INFO: renamed from: a */
    public final yy1 m7386a(int i, Object obj) {
        yy1 yy1VarM7385b = m7385b();
        yy1VarM7385b.f13169a = this.f13615a.obtainMessage(i, obj);
        return yy1VarM7385b;
    }

    /* JADX INFO: renamed from: c */
    public final void m7387c(Runnable runnable) {
        this.f13615a.post(runnable);
    }

    /* JADX INFO: renamed from: d */
    public final void m7388d(int i) {
        ki0.m3857c(i != 0);
        this.f13615a.removeMessages(i);
    }

    /* JADX INFO: renamed from: e */
    public final void m7389e(int i) {
        this.f13615a.sendEmptyMessage(i);
    }
}
