package p000;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: kq */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1043kq extends AbstractSet {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5984a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1117mq f5985b;

    public /* synthetic */ C1043kq(C1117mq c1117mq, int i) {
        this.f5984a = i;
        this.f5985b = c1117mq;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.f5984a;
        C1117mq c1117mq = this.f5985b;
        switch (i) {
            case 0:
                c1117mq.clear();
                break;
            default:
                c1117mq.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.f5984a;
        C1117mq c1117mq = this.f5985b;
        switch (i) {
            case 0:
                Map mapM4439b = c1117mq.m4439b();
                if (mapM4439b != null) {
                    return mapM4439b.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int iM4441d = c1117mq.m4441d(entry.getKey());
                    if (iM4441d != -1 && hr1.m3275k(c1117mq.m4447j()[iM4441d], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return c1117mq.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.f5984a;
        C1117mq c1117mq = this.f5985b;
        switch (i) {
            case 0:
                Map mapM4439b = c1117mq.m4439b();
                return mapM4439b != null ? mapM4439b.entrySet().iterator() : new C0800jq(c1117mq, 1);
            default:
                Map mapM4439b2 = c1117mq.m4439b();
                return mapM4439b2 != null ? mapM4439b2.keySet().iterator() : new C0800jq(c1117mq, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.f5984a;
        C1117mq c1117mq = this.f5985b;
        switch (i) {
            case 0:
                Map mapM4439b = c1117mq.m4439b();
                if (mapM4439b != null) {
                    return mapM4439b.entrySet().remove(obj);
                }
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (c1117mq.m4443f()) {
                    return false;
                }
                int iM4440c = c1117mq.m4440c();
                Object key = entry.getKey();
                Object value = entry.getValue();
                Object obj2 = c1117mq.f7066a;
                Objects.requireNonNull(obj2);
                int iM6430M = ua0.m6430M(key, value, iM4440c, obj2, c1117mq.m4445h(), c1117mq.m4446i(), c1117mq.m4447j());
                if (iM6430M == -1) {
                    return false;
                }
                c1117mq.m4442e(iM6430M, iM4440c);
                c1117mq.f7071f--;
                c1117mq.f7070e += 32;
                return true;
            default:
                Map mapM4439b2 = c1117mq.m4439b();
                if (mapM4439b2 != null) {
                    return mapM4439b2.keySet().remove(obj);
                }
                return c1117mq.m4444g(obj) != C1117mq.f7065o;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.f5984a;
        C1117mq c1117mq = this.f5985b;
        switch (i) {
            case 0:
                break;
        }
        return c1117mq.size();
    }
}
