package p000;

import java.io.IOException;
import java.io.Serializable;

/* JADX INFO: renamed from: l0 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1054l0 implements gg0 {

    /* JADX INFO: renamed from: a */
    public boolean f6120a;

    /* JADX INFO: renamed from: b */
    public Object f6121b;

    /* JADX INFO: renamed from: c */
    public Object f6122c;

    /* JADX INFO: renamed from: d */
    public Serializable f6123d;

    /* JADX INFO: renamed from: e */
    public Object f6124e;

    /* JADX INFO: renamed from: b */
    public u51 m4017b() {
        return new u51((t51) this.f6123d, (String) this.f6124e, (lh1) this.f6121b, (lh1) this.f6122c, this.f6120a);
    }

    @Override // p000.gg0
    public void close() {
        this.f6120a = true;
        p32.m5193x(((byte[]) this.f6123d) != null, "Lack of request message. GET request is only supported for unary requests");
        ((v91) ((AbstractC1128n0) this.f6124e)).f11595m.m5293o((j51) this.f6121b, (byte[]) this.f6123d);
        this.f6123d = null;
        this.f6121b = null;
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [byte[], java.io.Serializable] */
    @Override // p000.gg0
    /* JADX INFO: renamed from: e */
    public void mo2982e(kh1 kh1Var) {
        kv1 kv1Var = (kv1) this.f6122c;
        p32.m5193x(((byte[]) this.f6123d) == null, "writePayload should not be called multiple times");
        try {
            this.f6123d = AbstractC0102bk.m999b(kh1Var);
            rc2[] rc2VarArr = kv1Var.f6043a;
            rc2[] rc2VarArr2 = kv1Var.f6043a;
            for (rc2 rc2Var : rc2VarArr) {
                rc2Var.mo4523b0(0);
            }
            byte[] bArr = (byte[]) this.f6123d;
            long length = bArr.length;
            long length2 = bArr.length;
            for (rc2 rc2Var2 : kv1Var.f6043a) {
                rc2Var2.mo4524c0(length, length2, 0);
            }
            long length3 = ((byte[]) this.f6123d).length;
            for (rc2 rc2Var3 : rc2VarArr2) {
                rc2Var3.mo4525d0(length3);
            }
            long length4 = ((byte[]) this.f6123d).length;
            for (rc2 rc2Var4 : rc2VarArr2) {
                rc2Var4.mo3181e0(length4);
            }
        } catch (IOException e) {
            ca0.m1184p(e);
        }
    }

    @Override // p000.gg0
    public boolean isClosed() {
        return this.f6120a;
    }

    @Override // p000.gg0
    public void flush() {
    }

    @Override // p000.gg0
    /* JADX INFO: renamed from: a */
    public gg0 mo2979a(boolean z) {
        return this;
    }

    @Override // p000.gg0
    /* JADX INFO: renamed from: c */
    public gg0 mo2980c(k50 k50Var) {
        return this;
    }

    @Override // p000.gg0
    /* JADX INFO: renamed from: d */
    public void mo2981d(int i) {
    }
}
