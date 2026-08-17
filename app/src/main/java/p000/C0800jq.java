package p000;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: renamed from: jq */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0800jq implements Iterator {

    /* JADX INFO: renamed from: a */
    public int f5488a;

    /* JADX INFO: renamed from: b */
    public int f5489b;

    /* JADX INFO: renamed from: c */
    public int f5490c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1117mq f5491d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f5492e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1117mq f5493f;

    public C0800jq(C1117mq c1117mq, int i) {
        this.f5492e = i;
        this.f5493f = c1117mq;
        this.f5491d = c1117mq;
        this.f5488a = c1117mq.f7070e;
        this.f5489b = c1117mq.isEmpty() ? -1 : 0;
        this.f5490c = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5489b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object c1080lq;
        C1117mq c1117mq = this.f5491d;
        if (c1117mq.f7070e != this.f5488a) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            ca0.m1185q();
            return null;
        }
        int i = this.f5489b;
        this.f5490c = i;
        int i2 = this.f5492e;
        C1117mq c1117mq2 = this.f5493f;
        switch (i2) {
            case 0:
                c1080lq = c1117mq2.m4446i()[i];
                break;
            case 1:
                c1080lq = new C1080lq(c1117mq2, i);
                break;
            default:
                c1080lq = c1117mq2.m4447j()[i];
                break;
        }
        int i3 = this.f5489b + 1;
        if (i3 >= c1117mq.f7071f) {
            i3 = -1;
        }
        this.f5489b = i3;
        return c1080lq;
    }

    @Override // java.util.Iterator
    public final void remove() {
        C1117mq c1117mq = this.f5491d;
        if (c1117mq.f7070e != this.f5488a) {
            throw new ConcurrentModificationException();
        }
        p32.m5193x(this.f5490c >= 0, "no calls to next() since the last call to remove()");
        this.f5488a += 32;
        c1117mq.remove(c1117mq.m4446i()[this.f5490c]);
        this.f5489b--;
        this.f5490c = -1;
    }
}
