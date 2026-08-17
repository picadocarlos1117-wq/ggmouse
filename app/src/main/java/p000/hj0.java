package p000;

import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class hj0 {

    /* JADX INFO: renamed from: a */
    public final c22 f4588a;

    /* JADX INFO: renamed from: b */
    public final boolean f4589b;

    /* JADX INFO: renamed from: c */
    public final boolean f4590c;

    /* JADX INFO: renamed from: f */
    public final C0141cm f4593f;

    /* JADX INFO: renamed from: g */
    public byte[] f4594g;

    /* JADX INFO: renamed from: h */
    public int f4595h;

    /* JADX INFO: renamed from: i */
    public int f4596i;

    /* JADX INFO: renamed from: j */
    public long f4597j;

    /* JADX INFO: renamed from: l */
    public long f4599l;

    /* JADX INFO: renamed from: p */
    public long f4603p;

    /* JADX INFO: renamed from: q */
    public long f4604q;

    /* JADX INFO: renamed from: r */
    public boolean f4605r;

    /* JADX INFO: renamed from: s */
    public boolean f4606s;

    /* JADX INFO: renamed from: d */
    public final SparseArray f4591d = new SparseArray();

    /* JADX INFO: renamed from: e */
    public final SparseArray f4592e = new SparseArray();

    /* JADX INFO: renamed from: m */
    public gj0 f4600m = new gj0();

    /* JADX INFO: renamed from: n */
    public gj0 f4601n = new gj0();

    /* JADX INFO: renamed from: k */
    public boolean f4598k = false;

    /* JADX INFO: renamed from: o */
    public boolean f4602o = false;

    public hj0(c22 c22Var, boolean z, boolean z2) {
        this.f4588a = c22Var;
        this.f4589b = z;
        this.f4590c = z2;
        byte[] bArr = new byte[128];
        this.f4594g = bArr;
        this.f4593f = new C0141cm(bArr, 0, 0);
        gj0 gj0Var = this.f4601n;
        gj0Var.f4201b = false;
        gj0Var.f4200a = false;
    }

    /* JADX INFO: renamed from: a */
    public final void m3159a() {
        boolean z;
        int i;
        boolean z2 = false;
        if (this.f4589b) {
            gj0 gj0Var = this.f4601n;
            z = gj0Var.f4201b && ((i = gj0Var.f4204e) == 7 || i == 2);
        } else {
            z = this.f4606s;
        }
        boolean z3 = this.f4605r;
        int i2 = this.f4596i;
        if (i2 == 5 || (z && i2 == 1)) {
            z2 = true;
        }
        this.f4605r = z3 | z2;
    }
}
