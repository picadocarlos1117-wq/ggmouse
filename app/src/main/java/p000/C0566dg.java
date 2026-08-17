package p000;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: dg */
/* JADX INFO: loaded from: classes3.dex */
public final class C0566dg implements InterfaceC0622f {

    /* JADX INFO: renamed from: a */
    public final C0082b0 f2921a;

    /* JADX INFO: renamed from: b */
    public C0111bt f2922b;

    public C0566dg(C0082b0 c0082b0) {
        this.f2921a = c0082b0;
    }

    /* JADX INFO: renamed from: c */
    public static C0134cg m2349c(C0082b0 c0082b0) {
        C0111bt c0111bt = new C0111bt(c0082b0);
        return new C0134cg(o21.m4674o0(c0111bt), c0111bt.f1518c);
    }

    @Override // p000.InterfaceC0696h
    /* JADX INFO: renamed from: b */
    public final AbstractC1536w mo696b() {
        try {
            return m2349c(this.f2921a);
        } catch (IOException e) {
            throw new C1499v(jd0.m3611i(e, new StringBuilder("IOException converting stream to byte array: ")), e, 0);
        }
    }

    @Override // p000.InterfaceC0622f
    /* JADX INFO: renamed from: e */
    public final InputStream mo2350e() {
        C0111bt c0111bt = new C0111bt(this.f2921a);
        this.f2922b = c0111bt;
        return c0111bt;
    }

    @Override // p000.InterfaceC0622f
    /* JADX INFO: renamed from: f */
    public final int mo2351f() {
        return this.f2922b.f1518c;
    }

    @Override // p000.wm0
    /* JADX INFO: renamed from: h */
    public final AbstractC1536w mo735h() {
        return m2349c(this.f2921a);
    }
}
