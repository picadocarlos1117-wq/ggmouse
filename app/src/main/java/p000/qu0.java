package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class qu0 {

    /* JADX INFO: renamed from: c */
    public static final Logger f9582c;

    /* JADX INFO: renamed from: d */
    public static qu0 f9583d;

    /* JADX INFO: renamed from: e */
    public static final List f9584e;

    /* JADX INFO: renamed from: a */
    public final LinkedHashSet f9585a = new LinkedHashSet();

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f9586b = new LinkedHashMap();

    static {
        Logger logger = Logger.getLogger(qu0.class.getName());
        f9582c = logger;
        ArrayList arrayList = new ArrayList();
        try {
            boolean z = xc1.f12560a;
            arrayList.add(xc1.class);
        } catch (ClassNotFoundException e) {
            logger.log(Level.WARNING, "Unable to find pick-first LoadBalancer", (Throwable) e);
        }
        try {
            arrayList.add(fq1.class);
        } catch (ClassNotFoundException e2) {
            logger.log(Level.FINE, "Unable to find round-robin LoadBalancer", (Throwable) e2);
        }
        f9584e = Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: a */
    public static synchronized qu0 m5610a() {
        try {
            if (f9583d == null) {
                List<ou0> listM5773W = rc2.m5773W(ou0.class, f9584e, ou0.class.getClassLoader(), new pu0(0));
                f9583d = new qu0();
                for (ou0 ou0Var : listM5773W) {
                    f9582c.fine("Service loader found " + ou0Var);
                    qu0 qu0Var = f9583d;
                    synchronized (qu0Var) {
                        ou0Var.getClass();
                        qu0Var.f9585a.add(ou0Var);
                    }
                }
                f9583d.m5612c();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f9583d;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized ou0 m5611b(String str) {
        LinkedHashMap linkedHashMap;
        linkedHashMap = this.f9586b;
        p32.m5188s(str, "policy");
        return (ou0) linkedHashMap.get(str);
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m5612c() {
        this.f9586b.clear();
        for (ou0 ou0Var : this.f9585a) {
            String strMo2844a = ou0Var.mo2844a();
            if (((ou0) this.f9586b.get(strMo2844a)) == null) {
                this.f9586b.put(strMo2844a, ou0Var);
            }
        }
    }
}
