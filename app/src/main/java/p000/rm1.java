package p000;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class rm1 extends AbstractC1337qm {

    /* JADX INFO: renamed from: h */
    public final AbstractC1337qm f10077h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ sm1 f10078i;

    public rm1(sm1 sm1Var, AbstractC1337qm abstractC1337qm) {
        this.f10078i = sm1Var;
        this.f10077h = abstractC1337qm;
    }

    @Override // p000.AbstractC1337qm
    /* JADX INFO: renamed from: L */
    public final void mo3310L(nv1 nv1Var) {
        this.f10077h.mo3310L(nv1Var);
        this.f10078i.f10440s.execute(new RunnableC1430t4(this, 28));
    }

    @Override // p000.AbstractC1337qm
    /* JADX INFO: renamed from: O */
    public final void mo3311O(w71 w71Var) {
        C1437tb c1437tb = w71Var.f12018b;
        C1400sb c1400sb = sm1.f10437t;
        if (c1437tb.f10817a.get(c1400sb) != null) {
            f40.m2719o("RetryingNameResolver can only be used once to wrap a NameResolver");
            return;
        }
        List list = Collections.EMPTY_LIST;
        C1437tb c1437tb2 = C1437tb.f10816b;
        List list2 = w71Var.f12017a;
        v71 v71Var = w71Var.f12019c;
        c1437tb.getClass();
        qm1 qm1Var = new qm1(this.f10078i);
        IdentityHashMap identityHashMap = new IdentityHashMap(1);
        identityHashMap.put(c1400sb, qm1Var);
        for (Map.Entry entry : c1437tb.f10817a.entrySet()) {
            if (!identityHashMap.containsKey(entry.getKey())) {
                identityHashMap.put((C1400sb) entry.getKey(), entry.getValue());
            }
        }
        this.f10077h.mo3311O(new w71(list2, new C1437tb(identityHashMap), v71Var));
    }
}
