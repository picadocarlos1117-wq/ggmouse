package p000;

/* JADX INFO: renamed from: ck */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0138ck extends AbstractC0570dk {

    /* JADX INFO: renamed from: b */
    public int f1848b;

    /* JADX INFO: renamed from: c */
    public final int f1849c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC0753ik f1850d;

    public C0138ck(AbstractC0753ik abstractC0753ik) {
        super(0);
        this.f1850d = abstractC0753ik;
        this.f1848b = 0;
        this.f1849c = abstractC0753ik.size();
    }

    @Override // p000.AbstractC0570dk
    /* JADX INFO: renamed from: a */
    public final byte mo1227a() {
        int i = this.f1848b;
        if (i < this.f1849c) {
            this.f1848b = i + 1;
            return this.f1850d.mo2594m(i);
        }
        ca0.m1185q();
        return (byte) 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1848b < this.f1849c;
    }
}
