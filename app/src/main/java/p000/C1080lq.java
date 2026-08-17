package p000;

import java.util.Map;

/* JADX INFO: renamed from: lq */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1080lq extends AbstractC0698h1 {

    /* JADX INFO: renamed from: a */
    public final Object f6487a;

    /* JADX INFO: renamed from: b */
    public int f6488b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1117mq f6489c;

    public C1080lq(C1117mq c1117mq, int i) {
        this.f6489c = c1117mq;
        Object obj = C1117mq.f7065o;
        this.f6487a = c1117mq.m4446i()[i];
        this.f6488b = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m4271a() {
        int i = this.f6488b;
        Object obj = this.f6487a;
        C1117mq c1117mq = this.f6489c;
        if (i != -1 && i < c1117mq.size()) {
            if (hr1.m3275k(obj, c1117mq.m4446i()[this.f6488b])) {
                return;
            }
        }
        Object obj2 = C1117mq.f7065o;
        this.f6488b = c1117mq.m4441d(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f6487a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        C1117mq c1117mq = this.f6489c;
        Map mapM4439b = c1117mq.m4439b();
        if (mapM4439b != null) {
            return mapM4439b.get(this.f6487a);
        }
        m4271a();
        int i = this.f6488b;
        if (i == -1) {
            return null;
        }
        return c1117mq.m4447j()[i];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        C1117mq c1117mq = this.f6489c;
        Map mapM4439b = c1117mq.m4439b();
        Object obj2 = this.f6487a;
        if (mapM4439b != null) {
            return mapM4439b.put(obj2, obj);
        }
        m4271a();
        int i = this.f6488b;
        if (i == -1) {
            c1117mq.put(obj2, obj);
            return null;
        }
        Object obj3 = c1117mq.m4447j()[i];
        c1117mq.m4447j()[this.f6488b] = obj;
        return obj3;
    }
}
