package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class km1 {

    /* JADX INFO: renamed from: a */
    public final boolean f5903a;

    /* JADX INFO: renamed from: b */
    public final List f5904b;

    /* JADX INFO: renamed from: c */
    public final Collection f5905c;

    /* JADX INFO: renamed from: d */
    public final Collection f5906d;

    /* JADX INFO: renamed from: e */
    public final int f5907e;

    /* JADX INFO: renamed from: f */
    public final nm1 f5908f;

    /* JADX INFO: renamed from: g */
    public final boolean f5909g;

    /* JADX INFO: renamed from: h */
    public final boolean f5910h;

    public km1(List list, Collection collection, Collection collection2, nm1 nm1Var, boolean z, boolean z2, boolean z3, int i) {
        this.f5904b = list;
        p32.m5188s(collection, "drainedSubstreams");
        this.f5905c = collection;
        this.f5908f = nm1Var;
        this.f5906d = collection2;
        this.f5909g = z;
        this.f5903a = z2;
        this.f5910h = z3;
        this.f5907e = i;
        p32.m5193x(!z2 || list == null, "passThrough should imply buffer is null");
        p32.m5193x((z2 && nm1Var == null) ? false : true, "passThrough should imply winningSubstream != null");
        p32.m5193x(!z2 || (collection.size() == 1 && collection.contains(nm1Var)) || (collection.size() == 0 && nm1Var.f7451b), "passThrough should imply winningSubstream is drained");
        p32.m5193x((z && nm1Var == null) ? false : true, "cancelled should imply committed");
    }

    /* JADX INFO: renamed from: a */
    public final km1 m3906a(nm1 nm1Var) {
        Collection collectionUnmodifiableCollection;
        p32.m5193x(!this.f5910h, "hedging frozen");
        p32.m5193x(this.f5908f == null, "already committed");
        Collection collection = this.f5906d;
        if (collection == null) {
            collectionUnmodifiableCollection = Collections.singleton(nm1Var);
        } else {
            ArrayList arrayList = new ArrayList(collection);
            arrayList.add(nm1Var);
            collectionUnmodifiableCollection = Collections.unmodifiableCollection(arrayList);
        }
        return new km1(this.f5904b, this.f5905c, collectionUnmodifiableCollection, this.f5908f, this.f5909g, this.f5903a, this.f5910h, this.f5907e + 1);
    }

    /* JADX INFO: renamed from: b */
    public final km1 m3907b(nm1 nm1Var) {
        ArrayList arrayList = new ArrayList(this.f5906d);
        arrayList.remove(nm1Var);
        return new km1(this.f5904b, this.f5905c, Collections.unmodifiableCollection(arrayList), this.f5908f, this.f5909g, this.f5903a, this.f5910h, this.f5907e);
    }

    /* JADX INFO: renamed from: c */
    public final km1 m3908c(nm1 nm1Var, nm1 nm1Var2) {
        ArrayList arrayList = new ArrayList(this.f5906d);
        arrayList.remove(nm1Var);
        arrayList.add(nm1Var2);
        return new km1(this.f5904b, this.f5905c, Collections.unmodifiableCollection(arrayList), this.f5908f, this.f5909g, this.f5903a, this.f5910h, this.f5907e);
    }

    /* JADX INFO: renamed from: d */
    public final km1 m3909d(nm1 nm1Var) {
        nm1Var.f7451b = true;
        Collection collection = this.f5905c;
        if (!collection.contains(nm1Var)) {
            return this;
        }
        ArrayList arrayList = new ArrayList(collection);
        arrayList.remove(nm1Var);
        return new km1(this.f5904b, Collections.unmodifiableCollection(arrayList), this.f5906d, this.f5908f, this.f5909g, this.f5903a, this.f5910h, this.f5907e);
    }

    /* JADX INFO: renamed from: e */
    public final km1 m3910e(nm1 nm1Var) {
        List list;
        p32.m5193x(!this.f5903a, "Already passThrough");
        boolean z = nm1Var.f7451b;
        Collection collectionUnmodifiableCollection = this.f5905c;
        if (!z) {
            if (collectionUnmodifiableCollection.isEmpty()) {
                collectionUnmodifiableCollection = Collections.singletonList(nm1Var);
            } else {
                ArrayList arrayList = new ArrayList(collectionUnmodifiableCollection);
                arrayList.add(nm1Var);
                collectionUnmodifiableCollection = Collections.unmodifiableCollection(arrayList);
            }
        }
        Collection collection = collectionUnmodifiableCollection;
        nm1 nm1Var2 = this.f5908f;
        boolean z2 = nm1Var2 != null;
        if (z2) {
            p32.m5193x(nm1Var2 == nm1Var, "Another RPC attempt has already committed");
            list = null;
        } else {
            list = this.f5904b;
        }
        return new km1(list, collection, this.f5906d, this.f5908f, this.f5909g, z2, this.f5910h, this.f5907e);
    }
}
