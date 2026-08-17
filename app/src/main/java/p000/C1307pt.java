package p000;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: pt */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class C1307pt {

    /* JADX INFO: renamed from: a */
    public static final Logger f9139a = Logger.getLogger(C1307pt.class.getName());

    /* JADX INFO: renamed from: b */
    public static final C1307pt f9140b = new C1307pt();

    /* JADX INFO: renamed from: b */
    public static C1307pt m5325b() {
        ((j02) AbstractC1157nt.f7533a).getClass();
        C1307pt c1307pt = (C1307pt) j02.f5234b.get();
        C1307pt c1307pt2 = f9140b;
        if (c1307pt == null) {
            c1307pt = c1307pt2;
        }
        return c1307pt == null ? c1307pt2 : c1307pt;
    }

    /* JADX INFO: renamed from: a */
    public final C1307pt m5326a() {
        ((j02) AbstractC1157nt.f7533a).getClass();
        ThreadLocal threadLocal = j02.f5234b;
        C1307pt c1307pt = (C1307pt) threadLocal.get();
        C1307pt c1307pt2 = f9140b;
        if (c1307pt == null) {
            c1307pt = c1307pt2;
        }
        threadLocal.set(this);
        return c1307pt == null ? c1307pt2 : c1307pt;
    }

    /* JADX INFO: renamed from: c */
    public final void m5327c(C1307pt c1307pt) {
        if (c1307pt == null) {
            l41.m4051t("toAttach");
            return;
        }
        j02 j02Var = (j02) AbstractC1157nt.f7533a;
        ThreadLocal threadLocal = j02.f5234b;
        j02Var.getClass();
        C1307pt c1307pt2 = (C1307pt) threadLocal.get();
        C1307pt c1307pt3 = f9140b;
        if (c1307pt2 == null) {
            c1307pt2 = c1307pt3;
        }
        if (c1307pt2 != this) {
            j02.f5233a.log(Level.SEVERE, "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (c1307pt != c1307pt3) {
            threadLocal.set(c1307pt);
        } else {
            threadLocal.set(null);
        }
    }
}
