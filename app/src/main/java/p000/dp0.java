package p000;

import java.net.SocketAddress;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class dp0 {

    /* JADX INFO: renamed from: a */
    public List f2989a;

    /* JADX INFO: renamed from: b */
    public int f2990b;

    /* JADX INFO: renamed from: c */
    public int f2991c;

    /* JADX INFO: renamed from: a */
    public SocketAddress m2376a() {
        if (m2378c()) {
            return (SocketAddress) ((a70) this.f2989a.get(this.f2990b)).f81a.get(this.f2991c);
        }
        f40.m2719o("Index is past the end of the address group list");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public boolean m2377b() {
        if (m2378c()) {
            a70 a70Var = (a70) this.f2989a.get(this.f2990b);
            int i = this.f2991c + 1;
            this.f2991c = i;
            if (i >= a70Var.f81a.size()) {
                int i2 = this.f2990b + 1;
                this.f2990b = i2;
                this.f2991c = 0;
                if (i2 < this.f2989a.size()) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public boolean m2378c() {
        return this.f2990b < this.f2989a.size();
    }

    /* JADX INFO: renamed from: d */
    public void m2379d() {
        this.f2990b = 0;
        this.f2991c = 0;
    }

    /* JADX INFO: renamed from: e */
    public boolean m2380e(SocketAddress socketAddress) {
        for (int i = 0; i < this.f2989a.size(); i++) {
            int iIndexOf = ((a70) this.f2989a.get(i)).f81a.indexOf(socketAddress);
            if (iIndexOf != -1) {
                this.f2990b = i;
                this.f2991c = iIndexOf;
                return true;
            }
        }
        return false;
    }
}
