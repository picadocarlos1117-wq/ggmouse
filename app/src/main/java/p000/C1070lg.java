package p000;

import java.io.IOException;

/* JADX INFO: renamed from: lg */
/* JADX INFO: loaded from: classes3.dex */
public class C1070lg implements InterfaceC0696h, wm0 {

    /* JADX INFO: renamed from: a */
    public final int f6344a;

    /* JADX INFO: renamed from: b */
    public final int f6345b;

    /* JADX INFO: renamed from: c */
    public final C0082b0 f6346c;

    public C1070lg(int i, int i2, C0082b0 c0082b0) {
        this.f6344a = i;
        this.f6345b = i2;
        this.f6346c = c0082b0;
    }

    @Override // p000.InterfaceC0696h
    /* JADX INFO: renamed from: b */
    public final AbstractC1536w mo696b() {
        try {
            return mo735h();
        } catch (IOException e) {
            throw new C1499v(e.getMessage(), 0);
        }
    }

    /* JADX INFO: renamed from: h */
    public AbstractC1536w mo735h() {
        return this.f6346c.m810l(this.f6344a, this.f6345b);
    }
}
