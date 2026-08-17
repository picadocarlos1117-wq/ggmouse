package p000;

import java.io.InputStream;
import java.util.logging.Logger;

/* JADX INFO: renamed from: fo */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0647fo extends AbstractRunnableC0012ab {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f3863c = 0;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1174o9 f3864d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f3865e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0647fo(C1174o9 c1174o9, j51 j51Var) {
        super(((C0798jo) c1174o9.f7701d).f5469e, 1);
        this.f3864d = c1174o9;
        this.f3865e = j51Var;
    }

    @Override // p000.AbstractRunnableC0012ab
    /* JADX INFO: renamed from: b */
    public final void mo141b() {
        switch (this.f3863c) {
            case 0:
                C1174o9 c1174o9 = this.f3864d;
                jc1.m3599c();
                try {
                    jc1.m3597a();
                    jc1.f5363a.getClass();
                    if (((nv1) c1174o9.f7700c) == null) {
                        try {
                            ((AbstractC0143co) c1174o9.f7699b).onHeaders((j51) this.f3865e);
                        } catch (Throwable th) {
                            nv1 nv1VarM4614g = nv1.f7551f.m4613f(th).m4614g("Failed to read headers");
                            c1174o9.f7700c = nv1VarM4614g;
                            ((C0798jo) c1174o9.f7701d).f5473i.mo1030f(nv1VarM4614g);
                        }
                        break;
                    }
                    jc1.f5363a.getClass();
                    return;
                } catch (Throwable th2) {
                    try {
                        jc1.f5363a.getClass();
                        break;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            default:
                jc1.m3599c();
                try {
                    jc1.m3597a();
                    vm0 vm0Var = jc1.f5363a;
                    vm0Var.getClass();
                    m2829c();
                    vm0Var.getClass();
                    return;
                } catch (Throwable th4) {
                    try {
                        jc1.f5363a.getClass();
                        break;
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m2829c() {
        pn0 pn0Var = (pn0) this.f3865e;
        C1174o9 c1174o9 = this.f3864d;
        C0798jo c0798jo = (C0798jo) c1174o9.f7701d;
        if (((nv1) c1174o9.f7700c) != null) {
            Logger logger = vi0.f11674a;
            while (true) {
                InputStream inputStreamM5289k = pn0Var.m5289k();
                if (inputStreamM5289k == null) {
                    return;
                } else {
                    vi0.m6630b(inputStreamM5289k);
                }
            }
        } else {
            while (true) {
                try {
                    InputStream inputStreamM5289k2 = pn0Var.m5289k();
                    if (inputStreamM5289k2 == null) {
                        return;
                    }
                    try {
                        ((AbstractC0143co) c1174o9.f7699b).onMessage(c0798jo.f5465a.m6387c(inputStreamM5289k2));
                        inputStreamM5289k2.close();
                    } catch (Throwable th) {
                        vi0.m6630b(inputStreamM5289k2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    Logger logger2 = vi0.f11674a;
                    while (true) {
                        InputStream inputStreamM5289k3 = pn0Var.m5289k();
                        if (inputStreamM5289k3 == null) {
                            nv1 nv1VarM4614g = nv1.f7551f.m4613f(th2).m4614g("Failed to read message.");
                            c1174o9.f7700c = nv1VarM4614g;
                            c0798jo.f5473i.mo1030f(nv1VarM4614g);
                            return;
                        }
                        vi0.m6630b(inputStreamM5289k3);
                    }
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0647fo(C1174o9 c1174o9, pn0 pn0Var) {
        super(((C0798jo) c1174o9.f7701d).f5469e, 1);
        this.f3864d = c1174o9;
        this.f3865e = pn0Var;
    }
}
