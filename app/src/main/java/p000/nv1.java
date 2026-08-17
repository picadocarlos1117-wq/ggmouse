package p000;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class nv1 {

    /* JADX INFO: renamed from: d */
    public static final List f7549d;

    /* JADX INFO: renamed from: e */
    public static final nv1 f7550e;

    /* JADX INFO: renamed from: f */
    public static final nv1 f7551f;

    /* JADX INFO: renamed from: g */
    public static final nv1 f7552g;

    /* JADX INFO: renamed from: h */
    public static final nv1 f7553h;

    /* JADX INFO: renamed from: i */
    public static final nv1 f7554i;

    /* JADX INFO: renamed from: j */
    public static final nv1 f7555j;

    /* JADX INFO: renamed from: k */
    public static final nv1 f7556k;

    /* JADX INFO: renamed from: l */
    public static final nv1 f7557l;

    /* JADX INFO: renamed from: m */
    public static final nv1 f7558m;

    /* JADX INFO: renamed from: n */
    public static final nv1 f7559n;

    /* JADX INFO: renamed from: o */
    public static final h51 f7560o;

    /* JADX INFO: renamed from: p */
    public static final h51 f7561p;

    /* JADX INFO: renamed from: a */
    public final mv1 f7562a;

    /* JADX INFO: renamed from: b */
    public final String f7563b;

    /* JADX INFO: renamed from: c */
    public final Throwable f7564c;

    static {
        TreeMap treeMap = new TreeMap();
        for (mv1 mv1Var : mv1.values()) {
            nv1 nv1Var = (nv1) treeMap.put(Integer.valueOf(mv1Var.f7126a), new nv1(mv1Var, null, null));
            if (nv1Var != null) {
                lv1.m4301m("Code value duplication between ", nv1Var.f7562a.name(), " & ", mv1Var.name());
                return;
            }
        }
        f7549d = Collections.unmodifiableList(new ArrayList(treeMap.values()));
        f7550e = mv1.OK.m4462a();
        f7551f = mv1.CANCELLED.m4462a();
        f7552g = mv1.UNKNOWN.m4462a();
        mv1.INVALID_ARGUMENT.m4462a();
        f7553h = mv1.DEADLINE_EXCEEDED.m4462a();
        mv1.NOT_FOUND.m4462a();
        mv1.ALREADY_EXISTS.m4462a();
        f7554i = mv1.PERMISSION_DENIED.m4462a();
        f7555j = mv1.UNAUTHENTICATED.m4462a();
        f7556k = mv1.RESOURCE_EXHAUSTED.m4462a();
        f7557l = mv1.FAILED_PRECONDITION.m4462a();
        mv1.ABORTED.m4462a();
        mv1.OUT_OF_RANGE.m4462a();
        mv1.UNIMPLEMENTED.m4462a();
        f7558m = mv1.INTERNAL.m4462a();
        f7559n = mv1.UNAVAILABLE.m4462a();
        mv1.DATA_LOSS.m4462a();
        f7560o = new h51("grpc-status", false, new ax0(10));
        f7561p = new h51("grpc-message", false, new bz1(5));
    }

    public nv1(mv1 mv1Var, String str, Throwable th) {
        p32.m5188s(mv1Var, "code");
        this.f7562a = mv1Var;
        this.f7563b = str;
        this.f7564c = th;
    }

    /* JADX INFO: renamed from: b */
    public static String m4608b(nv1 nv1Var) {
        String str = nv1Var.f7563b;
        mv1 mv1Var = nv1Var.f7562a;
        if (str == null) {
            return mv1Var.toString();
        }
        return mv1Var + ": " + nv1Var.f7563b;
    }

    /* JADX INFO: renamed from: c */
    public static nv1 m4609c(int i) {
        if (i >= 0) {
            List list = f7549d;
            if (i < list.size()) {
                return (nv1) list.get(i);
            }
        }
        return f7552g.m4614g("Unknown code " + i);
    }

    /* JADX INFO: renamed from: d */
    public static nv1 m4610d(Throwable th) {
        p32.m5188s(th, "t");
        for (Throwable cause = th; cause != null; cause = cause.getCause()) {
            if (cause instanceof pv1) {
                return ((pv1) cause).f9179a;
            }
            if (cause instanceof qv1) {
                return ((qv1) cause).f9588a;
            }
        }
        return f7552g.m4613f(th);
    }

    /* JADX INFO: renamed from: a */
    public final nv1 m4611a(String str) {
        Throwable th = this.f7564c;
        String str2 = this.f7563b;
        mv1 mv1Var = this.f7562a;
        return str2 == null ? new nv1(mv1Var, str, th) : new nv1(mv1Var, AbstractC1308pu.m5340g(str2, "\n", str), th);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m4612e() {
        return mv1.OK == this.f7562a;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    /* JADX INFO: renamed from: f */
    public final nv1 m4613f(Throwable th) {
        return hr1.m3275k(this.f7564c, th) ? this : new nv1(this.f7562a, this.f7563b, th);
    }

    /* JADX INFO: renamed from: g */
    public final nv1 m4614g(String str) {
        return hr1.m3275k(this.f7563b, str) ? this : new nv1(this.f7562a, str, this.f7564c);
    }

    public final String toString() {
        C1679zv c1679zvM5176k0 = p32.m5176k0(this);
        c1679zvM5176k0.m7359a(this.f7562a.name(), "code");
        c1679zvM5176k0.m7359a(this.f7563b, "description");
        Throwable th = this.f7564c;
        Object string = th;
        if (th != null) {
            Object obj = k02.f5629a;
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            string = stringWriter.toString();
        }
        c1679zvM5176k0.m7359a(string, "cause");
        return c1679zvM5176k0.toString();
    }
}
