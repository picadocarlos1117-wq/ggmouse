package p000;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class g22 {

    /* JADX INFO: renamed from: a */
    public int f4022a = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: b */
    public int f4023b = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: c */
    public int f4024c = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: d */
    public int f4025d = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: e */
    public int f4026e = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: f */
    public int f4027f = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: g */
    public boolean f4028g = true;

    /* JADX INFO: renamed from: h */
    public qm0 f4029h;

    /* JADX INFO: renamed from: i */
    public qm0 f4030i;

    /* JADX INFO: renamed from: j */
    public int f4031j;

    /* JADX INFO: renamed from: k */
    public int f4032k;

    /* JADX INFO: renamed from: l */
    public qm0 f4033l;

    /* JADX INFO: renamed from: m */
    public f22 f4034m;

    /* JADX INFO: renamed from: n */
    public qm0 f4035n;

    /* JADX INFO: renamed from: o */
    public int f4036o;

    /* JADX INFO: renamed from: p */
    public int f4037p;

    /* JADX INFO: renamed from: q */
    public HashMap f4038q;

    /* JADX INFO: renamed from: r */
    public HashSet f4039r;

    public g22() {
        om0 om0Var = qm0.f9540b;
        kk1 kk1Var = kk1.f5896e;
        this.f4029h = kk1Var;
        this.f4030i = kk1Var;
        this.f4031j = Integer.MAX_VALUE;
        this.f4032k = Integer.MAX_VALUE;
        this.f4033l = kk1Var;
        this.f4034m = f22.f3595a;
        this.f4035n = kk1Var;
        this.f4036o = 0;
        this.f4037p = 0;
        this.f4038q = new HashMap();
        this.f4039r = new HashSet();
    }

    /* JADX INFO: renamed from: a */
    public void m2922a(int i) {
        Iterator it = this.f4038q.values().iterator();
        while (it.hasNext()) {
            if (((e22) it.next()).f3180a.f12804c == i) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2923b(h22 h22Var) {
        this.f4022a = h22Var.f4423a;
        this.f4023b = h22Var.f4424b;
        this.f4024c = h22Var.f4425c;
        this.f4025d = h22Var.f4426d;
        this.f4026e = h22Var.f4427e;
        this.f4027f = h22Var.f4428f;
        this.f4028g = h22Var.f4429g;
        this.f4029h = h22Var.f4430h;
        this.f4030i = h22Var.f4431i;
        this.f4031j = h22Var.f4432j;
        this.f4032k = h22Var.f4433k;
        this.f4033l = h22Var.f4434l;
        this.f4034m = h22Var.f4435m;
        this.f4035n = h22Var.f4436n;
        this.f4036o = h22Var.f4437o;
        this.f4037p = h22Var.f4438p;
        this.f4039r = new HashSet(h22Var.f4440r);
        this.f4038q = new HashMap(h22Var.f4439q);
    }

    /* JADX INFO: renamed from: c */
    public g22 mo2924c(String... strArr) {
        nm0 nm0VarM5566m = qm0.m5566m();
        for (String str : strArr) {
            str.getClass();
            nm0VarM5566m.m3901a(z42.m7217E(str));
        }
        this.f4035n = nm0VarM5566m.m4561g();
        return this;
    }

    /* JADX INFO: renamed from: d */
    public g22 mo2925d(int i, int i2) {
        this.f4026e = i;
        this.f4027f = i2;
        this.f4028g = true;
        return this;
    }
}
