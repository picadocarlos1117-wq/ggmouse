package p000;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class db1 extends xv1 {

    /* JADX INFO: renamed from: o */
    public static final byte[] f2871o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: p */
    public static final byte[] f2872p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* JADX INFO: renamed from: n */
    public boolean f2873n;

    /* JADX INFO: renamed from: e */
    public static boolean m2310e(dc1 dc1Var, byte[] bArr) {
        if (dc1Var.m2318a() < bArr.length) {
            return false;
        }
        int i = dc1Var.f2883b;
        byte[] bArr2 = new byte[bArr.length];
        dc1Var.m2322e(0, bArr.length, bArr2);
        dc1Var.m2316F(i);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // p000.xv1
    /* JADX INFO: renamed from: b */
    public final long mo1199b(dc1 dc1Var) {
        byte[] bArr = dc1Var.f2882a;
        return (((long) this.f12745i) * rc2.m5769L(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // p000.xv1
    /* JADX INFO: renamed from: c */
    public final boolean mo1200c(dc1 dc1Var, long j, qo0 qo0Var) {
        if (m2310e(dc1Var, f2871o)) {
            byte[] bArrCopyOf = Arrays.copyOf(dc1Var.f2882a, dc1Var.f2884c);
            int i = bArrCopyOf[9] & 255;
            ArrayList arrayListM5781e = rc2.m5781e(bArrCopyOf);
            if (((be0) qo0Var.f9548b) == null) {
                ae0 ae0Var = new ae0();
                ae0Var.f197m = v51.m6582l("audio/opus");
                ae0Var.f175B = i;
                ae0Var.f176C = 48000;
                ae0Var.f200p = arrayListM5781e;
                qo0Var.f9548b = new be0(ae0Var);
                return true;
            }
        } else {
            if (!m2310e(dc1Var, f2872p)) {
                ki0.m3866j((be0) qo0Var.f9548b);
                return false;
            }
            ki0.m3866j((be0) qo0Var.f9548b);
            if (!this.f2873n) {
                this.f2873n = true;
                dc1Var.m2317G(8);
                k51 k51VarM5783f0 = rc2.m5783f0(qm0.m5568p(rc2.m5788i0(dc1Var, false, false).f254b));
                if (k51VarM5783f0 != null) {
                    ae0 ae0VarM969a = ((be0) qo0Var.f9548b).m969a();
                    ae0VarM969a.f195k = k51VarM5783f0.m3803b(((be0) qo0Var.f9548b).f1339l);
                    qo0Var.f9548b = new be0(ae0VarM969a);
                    return true;
                }
            }
        }
        return true;
    }

    @Override // p000.xv1
    /* JADX INFO: renamed from: d */
    public final void mo1201d(boolean z) {
        super.mo1201d(z);
        if (z) {
            this.f2873n = false;
        }
    }
}
