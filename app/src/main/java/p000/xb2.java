package p000;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xb2 {

    /* JADX INFO: renamed from: a */
    public final int f12516a;

    /* JADX INFO: renamed from: b */
    public long f12517b;

    /* JADX INFO: renamed from: c */
    public int f12518c;

    /* JADX INFO: renamed from: d */
    public int f12519d;

    public xb2(xb2 xb2Var) {
        this.f12516a = xb2Var.f12518c;
        this.f12517b = xb2Var.f12517b;
        this.f12518c = xb2Var.f12516a;
        this.f12519d = xb2Var.f12519d;
    }

    /* JADX INFO: renamed from: a */
    public byte[] mo3113a() {
        byte[] bArr = new byte[32];
        sc2.m6081y(this.f12516a, 0, bArr);
        sc2.m6034D(bArr, this.f12517b, 4);
        sc2.m6081y(this.f12518c, 12, bArr);
        sc2.m6081y(this.f12519d, 28, bArr);
        return bArr;
    }

    public xb2(int i) {
        this.f12518c = 0;
        this.f12517b = 0L;
        this.f12519d = 0;
        this.f12516a = i;
    }
}
