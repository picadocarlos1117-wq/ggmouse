package p000;

import java.math.BigInteger;

/* JADX INFO: renamed from: bx */
/* JADX INFO: loaded from: classes3.dex */
public final class C0115bx implements InterfaceC1230on {

    /* JADX INFO: renamed from: a */
    public final BigInteger f1562a;

    /* JADX INFO: renamed from: b */
    public final BigInteger f1563b;

    /* JADX INFO: renamed from: c */
    public final BigInteger f1564c;

    /* JADX INFO: renamed from: d */
    public final C0546cx f1565d;

    public C0115bx(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, C0546cx c0546cx) {
        this.f1562a = bigInteger3;
        this.f1564c = bigInteger;
        this.f1563b = bigInteger2;
        this.f1565d = c0546cx;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0115bx)) {
            return false;
        }
        C0115bx c0115bx = (C0115bx) obj;
        return c0115bx.f1564c.equals(this.f1564c) && c0115bx.f1563b.equals(this.f1563b) && c0115bx.f1562a.equals(this.f1562a);
    }

    public final int hashCode() {
        return this.f1562a.hashCode() ^ (this.f1564c.hashCode() ^ this.f1563b.hashCode());
    }
}
