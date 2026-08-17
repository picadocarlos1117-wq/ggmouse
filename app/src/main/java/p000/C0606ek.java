package p000;

/* JADX INFO: renamed from: ek */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0606ek extends C0680gk {

    /* JADX INFO: renamed from: e */
    public final int f3374e;

    /* JADX INFO: renamed from: f */
    public final int f3375f;

    public C0606ek(byte[] bArr, int i, int i2) {
        super(bArr);
        AbstractC0753ik.m3440h(i, i + i2, bArr.length);
        this.f3374e = i;
        this.f3375f = i2;
    }

    @Override // p000.C0680gk
    /* JADX INFO: renamed from: A */
    public final int mo2591A() {
        return this.f3374e;
    }

    @Override // p000.C0680gk, p000.AbstractC0753ik
    /* JADX INFO: renamed from: e */
    public final byte mo2592e(int i) {
        AbstractC0753ik.m3439f(i, this.f3375f);
        return this.f4216d[this.f3374e + i];
    }

    @Override // p000.C0680gk, p000.AbstractC0753ik
    /* JADX INFO: renamed from: j */
    public final void mo2593j(int i, int i2, int i3, byte[] bArr) {
        System.arraycopy(this.f4216d, this.f3374e + i, bArr, i2, i3);
    }

    @Override // p000.C0680gk, p000.AbstractC0753ik
    /* JADX INFO: renamed from: m */
    public final byte mo2594m(int i) {
        return this.f4216d[this.f3374e + i];
    }

    @Override // p000.C0680gk, p000.AbstractC0753ik
    public final int size() {
        return this.f3375f;
    }
}
