package p000;

import android.os.Looper;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class hu0 {

    /* JADX INFO: renamed from: k */
    public static final Object f4704k = new Object();

    /* JADX INFO: renamed from: a */
    public final Object f4705a = new Object();

    /* JADX INFO: renamed from: b */
    public final to1 f4706b = new to1();

    /* JADX INFO: renamed from: c */
    public int f4707c = 0;

    /* JADX INFO: renamed from: d */
    public boolean f4708d;

    /* JADX INFO: renamed from: e */
    public volatile Object f4709e;

    /* JADX INFO: renamed from: f */
    public volatile Object f4710f;

    /* JADX INFO: renamed from: g */
    public int f4711g;

    /* JADX INFO: renamed from: h */
    public boolean f4712h;

    /* JADX INFO: renamed from: i */
    public boolean f4713i;

    /* JADX INFO: renamed from: j */
    public final RunnableC1621ya f4714j;

    public hu0() {
        Object obj = f4704k;
        this.f4710f = obj;
        this.f4714j = new RunnableC1621ya(this, 14);
        this.f4709e = obj;
        this.f4711g = -1;
    }

    /* JADX INFO: renamed from: a */
    public static void m3291a(String str) {
        C1509v9.m6610U().f11588s.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        f40.m2719o(jd0.m3615m("Cannot invoke ", str, " on a background thread"));
    }

    /* JADX INFO: renamed from: b */
    public final void m3292b(gu0 gu0Var) {
        if (gu0Var.f4323b) {
            if (!gu0Var.mo2644e()) {
                gu0Var.m3057a(false);
                return;
            }
            int i = gu0Var.f4324c;
            int i2 = this.f4711g;
            if (i >= i2) {
                return;
            }
            gu0Var.f4324c = i2;
            gu0Var.f4322a.mo777m(this.f4709e);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m3293c(gu0 gu0Var) {
        if (this.f4712h) {
            this.f4713i = true;
            return;
        }
        this.f4712h = true;
        do {
            this.f4713i = false;
            if (gu0Var != null) {
                m3292b(gu0Var);
                gu0Var = null;
            } else {
                to1 to1Var = this.f4706b;
                to1Var.getClass();
                ro1 ro1Var = new ro1(to1Var);
                to1Var.f10915c.put(ro1Var, Boolean.FALSE);
                while (ro1Var.hasNext()) {
                    m3292b((gu0) ((Map.Entry) ro1Var.next()).getValue());
                    if (this.f4713i) {
                        break;
                    }
                }
            }
        } while (this.f4713i);
        this.f4712h = false;
    }

    /* JADX INFO: renamed from: d */
    public final void m3294d(ms0 ms0Var, j91 j91Var) {
        Object obj;
        m3291a("observe");
        if (((os0) ms0Var.getLifecycle()).f8452d == es0.f3433a) {
            return;
        }
        fu0 fu0Var = new fu0(this, ms0Var, j91Var);
        to1 to1Var = this.f4706b;
        qo1 qo1VarMo5457a = to1Var.mo5457a(j91Var);
        if (qo1VarMo5457a != null) {
            obj = qo1VarMo5457a.f9551b;
        } else {
            qo1 qo1Var = new qo1(j91Var, fu0Var);
            to1Var.f10916d++;
            qo1 qo1Var2 = to1Var.f10914b;
            if (qo1Var2 == null) {
                to1Var.f10913a = qo1Var;
                to1Var.f10914b = qo1Var;
            } else {
                qo1Var2.f9552c = qo1Var;
                qo1Var.f9553d = qo1Var2;
                to1Var.f10914b = qo1Var;
            }
            obj = null;
        }
        gu0 gu0Var = (gu0) obj;
        if (gu0Var != null && !gu0Var.mo2851d(ms0Var)) {
            f40.m2713i("Cannot add the same observer with different lifecycles");
        } else {
            if (gu0Var != null) {
                return;
            }
            ms0Var.getLifecycle().mo2848a(fu0Var);
        }
    }

    /* JADX INFO: renamed from: g */
    public void mo1070g(j91 j91Var) {
        m3291a("removeObserver");
        gu0 gu0Var = (gu0) this.f4706b.mo5458b(j91Var);
        if (gu0Var == null) {
            return;
        }
        gu0Var.mo2850b();
        gu0Var.m3057a(false);
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo939h(Object obj);

    /* JADX INFO: renamed from: e */
    public void mo1068e() {
    }

    /* JADX INFO: renamed from: f */
    public void mo1069f() {
    }
}
