package p000;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: gg */
/* JADX INFO: loaded from: classes3.dex */
public final class C0676gg implements InterfaceC1425t {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4184a = 1;

    /* JADX INFO: renamed from: b */
    public Object f4185b;

    public C0676gg(C0082b0 c0082b0) {
        this.f4185b = c0082b0;
    }

    /* JADX INFO: renamed from: c */
    public static C0639fg m2977c(C0082b0 c0082b0) {
        return new C0639fg(o21.m4674o0(new C0542ct(c0082b0)), null);
    }

    @Override // p000.InterfaceC1425t
    /* JADX INFO: renamed from: a */
    public final InputStream mo2978a() {
        switch (this.f4184a) {
            case 0:
                return new C0542ct((C0082b0) this.f4185b);
            default:
                return (h10) this.f4185b;
        }
    }

    @Override // p000.InterfaceC0696h
    /* JADX INFO: renamed from: b */
    public final AbstractC1536w mo696b() {
        switch (this.f4184a) {
            case 0:
                try {
                    return m2977c((C0082b0) this.f4185b);
                } catch (IOException e) {
                    throw new C1499v(jd0.m3611i(e, new StringBuilder("IOException converting stream to byte array: ")), e, 0);
                }
            default:
                try {
                    return mo735h();
                } catch (IOException e2) {
                    throw new C1499v(jd0.m3611i(e2, new StringBuilder("IOException converting stream to byte array: ")), e2, 0);
                }
        }
    }

    @Override // p000.wm0
    /* JADX INFO: renamed from: h */
    public final AbstractC1536w mo735h() {
        switch (this.f4184a) {
            case 0:
                return m2977c((C0082b0) this.f4185b);
            default:
                return new C1123mw(((h10) this.f4185b).m3089d());
        }
    }

    public /* synthetic */ C0676gg() {
    }
}
