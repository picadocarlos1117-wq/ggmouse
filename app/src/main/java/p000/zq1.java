package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class zq1 extends ar1 {
    /* JADX INFO: renamed from: P */
    public static y90 m7332P(vq1 vq1Var, og0 og0Var) {
        return new y90(vq1Var, true, og0Var);
    }

    /* JADX INFO: renamed from: Q */
    public static y90 m7333Q(x10 x10Var, og0 og0Var) {
        return new y90(new x10(x10Var, og0Var, 2), false, new C1284p6(11));
    }

    /* JADX INFO: renamed from: R */
    public static List m7334R(vq1 vq1Var) {
        vq1Var.getClass();
        Iterator it = vq1Var.iterator();
        if (!it.hasNext()) {
            return n60.f7259a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC1337qm.m5511F(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
