package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ap0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1013a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ nv1 f1014b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gp0 f1015c;

    public /* synthetic */ ap0(gp0 gp0Var, nv1 nv1Var, int i) {
        this.f1013a = i;
        this.f1015c = gp0Var;
        this.f1014b = nv1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1013a) {
            case 0:
                EnumC0651fs enumC0651fs = this.f1015c.f4283w.f4304a;
                EnumC0651fs enumC0651fs2 = EnumC0651fs.f3889e;
                if (enumC0651fs != enumC0651fs2) {
                    gp0 gp0Var = this.f1015c;
                    gp0Var.f4284x = this.f1014b;
                    cp0 cp0Var = gp0Var.f4282v;
                    gp0 gp0Var2 = this.f1015c;
                    cp0 cp0Var2 = gp0Var2.f4281u;
                    gp0Var2.f4282v = null;
                    gp0 gp0Var3 = this.f1015c;
                    gp0Var3.f4281u = null;
                    gp0.m3031a(gp0Var3, enumC0651fs2);
                    this.f1015c.f4272l.m2379d();
                    if (this.f1015c.f4279s.isEmpty()) {
                        gp0 gp0Var4 = this.f1015c;
                        gp0Var4.f4271k.execute(new zo0(gp0Var4, 2));
                    }
                    gp0 gp0Var5 = this.f1015c;
                    gp0Var5.f4271k.m5930d();
                    qo0 qo0Var = gp0Var5.f4276p;
                    if (qo0Var != null) {
                        qo0Var.m5579B();
                        gp0Var5.f4276p = null;
                        gp0Var5.f4274n = null;
                    }
                    qo0 qo0Var2 = this.f1015c.f4277q;
                    if (qo0Var2 != null) {
                        qo0Var2.m5579B();
                        this.f1015c.f4278r.mo2580h(this.f1014b);
                        gp0 gp0Var6 = this.f1015c;
                        gp0Var6.f4277q = null;
                        gp0Var6.f4278r = null;
                    }
                    if (cp0Var != null) {
                        cp0Var.mo2580h(this.f1014b);
                    }
                    if (cp0Var2 != null) {
                        cp0Var2.mo2580h(this.f1014b);
                    }
                    break;
                }
                break;
            default:
                ArrayList arrayList = new ArrayList(this.f1015c.f4279s);
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((yx0) obj).mo2577b(this.f1014b);
                }
                break;
        }
    }
}
