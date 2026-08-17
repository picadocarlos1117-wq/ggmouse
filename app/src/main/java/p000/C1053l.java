package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: l */
/* JADX INFO: loaded from: classes3.dex */
public class C1053l extends AbstractC1536w {

    /* JADX INFO: renamed from: a */
    public final byte[] f6119a;

    public C1053l(byte[] bArr) {
        if (bArr.length < 4) {
            f40.m2713i("GeneralizedTime string too short");
            throw null;
        }
        this.f6119a = bArr;
        if (m4016u(0) && m4016u(1) && m4016u(2) && m4016u(3)) {
            return;
        }
        f40.m2713i("illegal characters in GeneralizedTime string");
        throw null;
    }

    @Override // p000.AbstractC1536w, p000.AbstractC1164o
    public final int hashCode() {
        return sc2.m6079w(this.f6119a);
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: j */
    public final boolean mo2j(AbstractC1536w abstractC1536w) {
        if (!(abstractC1536w instanceof C1053l)) {
            return false;
        }
        return Arrays.equals(this.f6119a, ((C1053l) abstractC1536w).f6119a);
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: k */
    public void mo1094k(C1462u c1462u, boolean z) {
        c1462u.m6367m(24, z, this.f6119a);
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: m */
    public final boolean mo3m() {
        return false;
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: n */
    public int mo1095n(boolean z) {
        return C1462u.m6358f(this.f6119a.length, z);
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: s */
    public AbstractC1536w mo4s() {
        return new C0729hw(this.f6119a);
    }

    /* JADX INFO: renamed from: u */
    public final boolean m4016u(int i) {
        byte b;
        byte[] bArr = this.f6119a;
        return bArr.length > i && (b = bArr[i]) >= 48 && b <= 57;
    }
}
