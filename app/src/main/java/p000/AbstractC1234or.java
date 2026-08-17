package p000;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: or */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1234or extends AbstractC0791jh {

    /* JADX INFO: renamed from: h */
    public final HashMap f8422h = new HashMap();

    /* JADX INFO: renamed from: i */
    public Handler f8423i;

    /* JADX INFO: renamed from: j */
    public C1534vy f8424j;

    @Override // p000.AbstractC0791jh
    /* JADX INFO: renamed from: c */
    public final void mo3630c() {
        for (C1155nr c1155nr : this.f8422h.values()) {
            c1155nr.f7507a.m3629b(c1155nr.f7508b);
        }
    }

    @Override // p000.AbstractC0791jh
    /* JADX INFO: renamed from: e */
    public final void mo3632e() {
        for (C1155nr c1155nr : this.f8422h.values()) {
            c1155nr.f7507a.m3631d(c1155nr.f7508b);
        }
    }

    @Override // p000.AbstractC0791jh
    /* JADX INFO: renamed from: i */
    public void mo1021i() {
        Iterator it = this.f8422h.values().iterator();
        while (it.hasNext()) {
            ((C1155nr) it.next()).f7507a.mo1021i();
        }
    }

    @Override // p000.AbstractC0791jh
    /* JADX INFO: renamed from: o */
    public void mo1023o() {
        HashMap map = this.f8422h;
        for (C1155nr c1155nr : map.values()) {
            AbstractC0791jh abstractC0791jh = c1155nr.f7507a;
            C1118mr c1118mr = c1155nr.f7509c;
            abstractC0791jh.m3639n(c1155nr.f7508b);
            abstractC0791jh.m3641q(c1118mr);
            abstractC0791jh.m3640p(c1118mr);
        }
        map.clear();
    }

    /* JADX INFO: renamed from: s */
    public abstract q21 mo4413s(Object obj, q21 q21Var);

    /* JADX INFO: renamed from: v */
    public abstract void mo4416v(Object obj, AbstractC0791jh abstractC0791jh, t02 t02Var);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [lr, r21] */
    /* JADX INFO: renamed from: w */
    public final void m5049w(final Object obj, AbstractC0791jh abstractC0791jh) {
        HashMap map = this.f8422h;
        ki0.m3857c(!map.containsKey(obj));
        Object r1 = new r21() { // from class: lr
            @Override // p000.r21
            /* JADX INFO: renamed from: a */
            public final void mo4272a(AbstractC0791jh abstractC0791jh2, t02 t02Var) {
                this.f6493a.mo4416v(obj, abstractC0791jh2, t02Var);
            }
        };
        C1118mr c1118mr = new C1118mr(this, obj);
        map.put(obj, new C1155nr(abstractC0791jh, r1, c1118mr));
        Handler handler = this.f8423i;
        handler.getClass();
        abstractC0791jh.getClass();
        c40 c40Var = abstractC0791jh.f5384c;
        c40Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = c40Var.f1664c;
        u21 u21Var = new u21();
        u21Var.f11103a = handler;
        u21Var.f11104b = c1118mr;
        copyOnWriteArrayList.add(u21Var);
        this.f8423i.getClass();
        c40 c40Var2 = abstractC0791jh.f5385d;
        c40Var2.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = c40Var2.f1664c;
        b40 b40Var = new b40();
        b40Var.f1142a = c1118mr;
        copyOnWriteArrayList2.add(b40Var);
        C1534vy c1534vy = this.f8424j;
        ye1 ye1Var = this.f5388g;
        ki0.m3866j(ye1Var);
        abstractC0791jh.m3636j(r1, c1534vy, ye1Var);
        if (this.f5383b.isEmpty()) {
            abstractC0791jh.m3629b(r1);
        }
    }

    /* JADX INFO: renamed from: t */
    public long mo4414t(long j, Object obj) {
        return j;
    }

    /* JADX INFO: renamed from: u */
    public int mo4415u(int i, Object obj) {
        return i;
    }
}
