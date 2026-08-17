package p000;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: xw */
/* JADX INFO: loaded from: classes3.dex */
public final class C1606xw implements InterfaceC0622f {

    /* JADX INFO: renamed from: a */
    public final h10 f12750a;

    /* JADX INFO: renamed from: b */
    public int f12751b = 0;

    public C1606xw(h10 h10Var) {
        this.f12750a = h10Var;
    }

    @Override // p000.InterfaceC0696h
    /* JADX INFO: renamed from: b */
    public final AbstractC1536w mo696b() {
        try {
            return mo735h();
        } catch (IOException e) {
            throw new C1499v(jd0.m3611i(e, new StringBuilder("IOException converting stream to byte array: ")), e, 0);
        }
    }

    @Override // p000.InterfaceC0622f
    /* JADX INFO: renamed from: e */
    public final InputStream mo2350e() throws IOException {
        String str;
        h10 h10Var = this.f12750a;
        int i = h10Var.f4388d;
        if (i >= 1) {
            int i2 = h10Var.read();
            this.f12751b = i2;
            if (i2 > 0) {
                if (i < 2) {
                    str = "zero length data with non-zero pad bits";
                } else if (i2 > 7) {
                    str = "pad bits cannot be greater than 7 or less than 0";
                }
            }
            return h10Var;
        }
        str = "content octets cannot be empty";
        f40.m2719o(str);
        return null;
    }

    @Override // p000.InterfaceC0622f
    /* JADX INFO: renamed from: f */
    public final int mo2351f() {
        return this.f12751b;
    }

    @Override // p000.wm0
    /* JADX INFO: renamed from: h */
    public final AbstractC1536w mo735h() {
        return AbstractC0585e.m2433u(this.f12750a.m3089d());
    }
}
