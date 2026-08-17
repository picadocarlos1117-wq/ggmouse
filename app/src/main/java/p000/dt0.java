package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class dt0 extends ft0 {

    /* JADX INFO: renamed from: c */
    public static final Class f3011c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    /* JADX INFO: renamed from: d */
    public static List m2386d(Object obj, int i, long j) {
        List listMo2783d;
        List list = (List) k42.f5664c.m3556k(j, obj);
        if (list.isEmpty()) {
            if (list instanceof yr0) {
                listMo2783d = new xr0(i);
            } else {
                listMo2783d = ((list instanceof bg1) && (list instanceof mo0)) ? ((mo0) list).mo2783d(i) : new ArrayList(i);
            }
            k42.m3791p(obj, j, listMo2783d);
            return listMo2783d;
        }
        if (f3011c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            k42.m3791p(obj, j, arrayList);
            return arrayList;
        }
        if (list instanceof e42) {
            e42 e42Var = (e42) list;
            xr0 xr0Var = new xr0(e42Var.size() + i);
            xr0Var.addAll(e42Var);
            k42.m3791p(obj, j, xr0Var);
            return xr0Var;
        }
        if ((list instanceof bg1) && (list instanceof mo0)) {
            mo0 mo0Var = (mo0) list;
            if (!((AbstractC1316q1) mo0Var).f9289a) {
                mo0 mo0VarMo2783d = mo0Var.mo2783d(list.size() + i);
                k42.m3791p(obj, j, mo0VarMo2783d);
                return mo0VarMo2783d;
            }
        }
        return list;
    }

    @Override // p000.ft0
    /* JADX INFO: renamed from: a */
    public final void mo2387a(long j, Object obj) {
        Object objUnmodifiableList;
        List list = (List) k42.f5664c.m3556k(j, obj);
        if (list instanceof yr0) {
            objUnmodifiableList = ((yr0) list).mo2501o();
        } else {
            if (f3011c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof bg1) && (list instanceof mo0)) {
                AbstractC1316q1 abstractC1316q1 = (AbstractC1316q1) ((mo0) list);
                boolean z = abstractC1316q1.f9289a;
                if (z && z) {
                    abstractC1316q1.f9289a = false;
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        k42.m3791p(obj, j, objUnmodifiableList);
    }

    @Override // p000.ft0
    /* JADX INFO: renamed from: b */
    public final void mo2388b(Object obj, long j, Object obj2) {
        List list = (List) k42.f5664c.m3556k(j, obj2);
        List listM2386d = m2386d(obj, list.size(), j);
        int size = listM2386d.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listM2386d.addAll(list);
        }
        if (size > 0) {
            list = listM2386d;
        }
        k42.m3791p(obj, j, list);
    }

    @Override // p000.ft0
    /* JADX INFO: renamed from: c */
    public final List mo2389c(long j, Object obj) {
        return m2386d(obj, 10, j);
    }
}
