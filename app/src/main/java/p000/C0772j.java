package p000;

import android.sun.security.util.DerValue;
import java.util.Arrays;

/* JADX INFO: renamed from: j */
/* JADX INFO: loaded from: classes3.dex */
public final class C0772j extends AbstractC1536w {

    /* JADX INFO: renamed from: b */
    public static final C0772j[] f5224b = new C0772j[12];

    /* JADX INFO: renamed from: a */
    public final byte[] f5225a;

    public C0772j(byte[] bArr, boolean z) {
        if (C1127n.m4491y(bArr)) {
            f40.m2713i("malformed enumerated");
            throw null;
        }
        int i = 0;
        if ((bArr[0] & DerValue.TAG_CONTEXT) != 0) {
            f40.m2713i("enumerated must be non-negative");
            throw null;
        }
        this.f5225a = z ? sc2.m6061e(bArr) : bArr;
        int length = bArr.length - 1;
        while (i < length) {
            byte b = bArr[i];
            i++;
            if (b != (bArr[i] >> 7)) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public static C0772j m3524u(byte[] bArr, boolean z) {
        if (bArr.length > 1) {
            return new C0772j(bArr, z);
        }
        if (bArr.length == 0) {
            f40.m2713i("ENUMERATED has zero length");
            return null;
        }
        int i = bArr[0] & 255;
        if (i >= 12) {
            return new C0772j(bArr, z);
        }
        C0772j[] c0772jArr = f5224b;
        C0772j c0772j = c0772jArr[i];
        if (c0772j != null) {
            return c0772j;
        }
        C0772j c0772j2 = new C0772j(bArr, z);
        c0772jArr[i] = c0772j2;
        return c0772j2;
    }

    @Override // p000.AbstractC1536w, p000.AbstractC1164o
    public final int hashCode() {
        return sc2.m6079w(this.f5225a);
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: j */
    public final boolean mo2j(AbstractC1536w abstractC1536w) {
        if (abstractC1536w instanceof C0772j) {
            return Arrays.equals(this.f5225a, ((C0772j) abstractC1536w).f5225a);
        }
        return false;
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: k */
    public final void mo1094k(C1462u c1462u, boolean z) {
        c1462u.m6367m(10, z, this.f5225a);
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: m */
    public final boolean mo3m() {
        return false;
    }

    @Override // p000.AbstractC1536w
    /* JADX INFO: renamed from: n */
    public final int mo1095n(boolean z) {
        return C1462u.m6358f(this.f5225a.length, z);
    }
}
