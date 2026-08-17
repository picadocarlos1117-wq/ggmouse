package p000;

/* JADX INFO: renamed from: m0 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1091m0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6571a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f6572b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f6573c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f6574d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f6575e;

    public /* synthetic */ RunnableC1091m0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f6571a = i;
        this.f6575e = obj;
        this.f6572b = obj2;
        this.f6573c = obj3;
        this.f6574d = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6571a) {
            case 0:
                ((u91) this.f6575e).m6416e((nv1) this.f6572b, (EnumC1376ro) this.f6573c, (j51) this.f6574d);
                return;
            case 1:
                ViewOnKeyListenerC1484ul viewOnKeyListenerC1484ul = (ViewOnKeyListenerC1484ul) ((ay0) this.f6575e).f1096b;
                r31 r31Var = (r31) this.f6573c;
                C1447tl c1447tl = (C1447tl) this.f6572b;
                if (c1447tl != null) {
                    viewOnKeyListenerC1484ul.f11330E = true;
                    c1447tl.f10902b.m3340c(false);
                    viewOnKeyListenerC1484ul.f11330E = false;
                }
                if (r31Var.isEnabled() && r31Var.hasSubMenu()) {
                    ((i31) this.f6574d).m3354q(r31Var, null, 4);
                    return;
                }
                return;
            case 2:
                ((s10) this.f6575e).f10195a.mo4775x((nv1) this.f6572b, (EnumC1376ro) this.f6573c, (j51) this.f6574d);
                return;
            case 3:
                dx0 dx0Var = (dx0) this.f6575e;
                dx0Var.f3071z = true;
                dx0Var.f3066u.mo4775x((nv1) this.f6572b, (EnumC1376ro) this.f6573c, (j51) this.f6574d);
                return;
            default:
                synchronized (((ds1) this.f6575e)) {
                    try {
                        if (((bs1) this.f6572b).f1514b == 0) {
                            try {
                                ((cs1) this.f6573c).mo1088s(this.f6574d);
                                ((ds1) this.f6575e).f3008a.remove((cs1) this.f6573c);
                                if (((ds1) this.f6575e).f3008a.isEmpty()) {
                                    ((ds1) this.f6575e).f3010c.shutdown();
                                    ((ds1) this.f6575e).f3010c = null;
                                }
                            } catch (Throwable th) {
                                ((ds1) this.f6575e).f3008a.remove((cs1) this.f6573c);
                                if (((ds1) this.f6575e).f3008a.isEmpty()) {
                                    ((ds1) this.f6575e).f3010c.shutdown();
                                    ((ds1) this.f6575e).f3010c = null;
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }
}
