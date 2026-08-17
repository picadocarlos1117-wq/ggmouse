package p000;

import java.math.BigInteger;

/* JADX INFO: renamed from: ww */
/* JADX INFO: loaded from: classes3.dex */
public final class C1569ww implements InterfaceC1230on {

    /* JADX INFO: renamed from: a */
    public BigInteger f12346a;

    /* JADX INFO: renamed from: b */
    public BigInteger f12347b;

    /* JADX INFO: renamed from: c */
    public BigInteger f12348c;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1569ww)) {
            return false;
        }
        C1569ww c1569ww = (C1569ww) obj;
        BigInteger bigInteger = this.f12348c;
        BigInteger bigInteger2 = c1569ww.f12348c;
        if (bigInteger != null) {
            if (!bigInteger.equals(bigInteger2)) {
                return false;
            }
        } else if (bigInteger2 != null) {
            return false;
        }
        return c1569ww.f12347b.equals(this.f12347b) && c1569ww.f12346a.equals(this.f12346a);
    }

    public final int hashCode() {
        int iHashCode = this.f12347b.hashCode() ^ this.f12346a.hashCode();
        BigInteger bigInteger = this.f12348c;
        return (bigInteger != null ? bigInteger.hashCode() : 0) ^ iHashCode;
    }
}
