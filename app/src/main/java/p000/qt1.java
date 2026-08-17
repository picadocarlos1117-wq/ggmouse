package p000;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class qt1 implements Iterator {

    /* JADX INFO: renamed from: a */
    public int f9576a = -1;

    /* JADX INFO: renamed from: b */
    public boolean f9577b;

    /* JADX INFO: renamed from: c */
    public Iterator f9578c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ mt1 f9579d;

    public qt1(mt1 mt1Var) {
        this.f9579d = mt1Var;
    }

    /* JADX INFO: renamed from: a */
    public final Iterator m5609a() {
        if (this.f9578c == null) {
            this.f9578c = this.f9579d.f7098c.entrySet().iterator();
        }
        return this.f9578c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f9576a + 1;
        mt1 mt1Var = this.f9579d;
        return i < mt1Var.f7097b.size() || (!mt1Var.f7098c.isEmpty() && m5609a().hasNext());
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f9577b = true;
        int i = this.f9576a + 1;
        this.f9576a = i;
        mt1 mt1Var = this.f9579d;
        return i < mt1Var.f7097b.size() ? (Map.Entry) mt1Var.f7097b.get(this.f9576a) : (Map.Entry) m5609a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f9577b) {
            f40.m2719o("remove() was called before next()");
            return;
        }
        this.f9577b = false;
        int i = mt1.f7095g;
        mt1 mt1Var = this.f9579d;
        mt1Var.m4454b();
        if (this.f9576a >= mt1Var.f7097b.size()) {
            m5609a().remove();
            return;
        }
        int i2 = this.f9576a;
        this.f9576a = i2 - 1;
        mt1Var.m4459g(i2);
    }
}
