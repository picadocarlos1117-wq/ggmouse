package p000;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: jh */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0791jh {

    /* JADX INFO: renamed from: a */
    public final ArrayList f5382a = new ArrayList(1);

    /* JADX INFO: renamed from: b */
    public final HashSet f5383b = new HashSet(1);

    /* JADX INFO: renamed from: c */
    public final c40 f5384c = new c40(new CopyOnWriteArrayList(), 0, null);

    /* JADX INFO: renamed from: d */
    public final c40 f5385d = new c40(new CopyOnWriteArrayList(), 0, null);

    /* JADX INFO: renamed from: e */
    public Looper f5386e;

    /* JADX INFO: renamed from: f */
    public t02 f5387f;

    /* JADX INFO: renamed from: g */
    public ye1 f5388g;

    /* JADX INFO: renamed from: a */
    public abstract j21 mo1020a(q21 q21Var, C0547cy c0547cy, long j);

    /* JADX INFO: renamed from: b */
    public final void m3629b(r21 r21Var) {
        HashSet hashSet = this.f5383b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(r21Var);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        mo3630c();
    }

    /* JADX INFO: renamed from: d */
    public final void m3631d(r21 r21Var) {
        this.f5386e.getClass();
        HashSet hashSet = this.f5383b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(r21Var);
        if (zIsEmpty) {
            mo3632e();
        }
    }

    /* JADX INFO: renamed from: f */
    public t02 mo3633f() {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public abstract z11 mo3634g();

    /* JADX INFO: renamed from: h */
    public boolean mo3635h() {
        return true;
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo1021i();

    /* JADX INFO: renamed from: j */
    public final void m3636j(r21 r21Var, C1534vy c1534vy, ye1 ye1Var) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f5386e;
        ki0.m3857c(looper == null || looper == looperMyLooper);
        this.f5388g = ye1Var;
        t02 t02Var = this.f5387f;
        this.f5382a.add(r21Var);
        if (this.f5386e == null) {
            this.f5386e = looperMyLooper;
            this.f5383b.add(r21Var);
            mo3637k(c1534vy);
        } else if (t02Var != null) {
            m3631d(r21Var);
            r21Var.mo4272a(this, t02Var);
        }
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo3637k(C1534vy c1534vy);

    /* JADX INFO: renamed from: l */
    public final void m3638l(t02 t02Var) {
        this.f5387f = t02Var;
        ArrayList arrayList = this.f5382a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((r21) obj).mo4272a(this, t02Var);
        }
    }

    /* JADX INFO: renamed from: m */
    public abstract void mo1022m(j21 j21Var);

    /* JADX INFO: renamed from: n */
    public final void m3639n(r21 r21Var) {
        ArrayList arrayList = this.f5382a;
        arrayList.remove(r21Var);
        if (!arrayList.isEmpty()) {
            m3629b(r21Var);
            return;
        }
        this.f5386e = null;
        this.f5387f = null;
        this.f5388g = null;
        this.f5383b.clear();
        mo1023o();
    }

    /* JADX INFO: renamed from: o */
    public abstract void mo1023o();

    /* JADX INFO: renamed from: p */
    public final void m3640p(d40 d40Var) {
        CopyOnWriteArrayList<b40> copyOnWriteArrayList = this.f5385d.f1664c;
        for (b40 b40Var : copyOnWriteArrayList) {
            if (b40Var.f1142a == d40Var) {
                copyOnWriteArrayList.remove(b40Var);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m3641q(v21 v21Var) {
        CopyOnWriteArrayList<u21> copyOnWriteArrayList = this.f5384c.f1664c;
        for (u21 u21Var : copyOnWriteArrayList) {
            if (u21Var.f11104b == v21Var) {
                copyOnWriteArrayList.remove(u21Var);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public abstract void mo3642r(z11 z11Var);

    /* JADX INFO: renamed from: c */
    public void mo3630c() {
    }

    /* JADX INFO: renamed from: e */
    public void mo3632e() {
    }
}
