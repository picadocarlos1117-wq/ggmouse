package p000;

import android.media.Spatializer;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s00 implements sf1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ d10 f10176a;

    /* JADX WARN: Code duplicated, block: B:43:0x0065 A[Catch: all -> 0x0092, FALL_THROUGH, TryCatch #0 {all -> 0x0092, blocks: (B:4:0x0007, B:6:0x000e, B:8:0x0012, B:12:0x001a, B:37:0x0059, B:39:0x005d, B:41:0x0061, B:43:0x0065, B:45:0x0069, B:47:0x006d, B:49:0x0071, B:51:0x007b, B:53:0x0087, B:59:0x0095), top: B:63:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0094  */
    @Override // p000.sf1
    public final boolean apply(Object obj) {
        boolean z;
        C1679zv c1679zv;
        C1679zv c1679zv2;
        d10 d10Var = this.f10176a;
        be0 be0Var = (be0) obj;
        synchronized (d10Var.f2705c) {
            try {
                z = true;
                if (d10Var.f2709g.f12400w && !d10Var.f2708f) {
                    int i = be0Var.f1317C;
                    if (i != -1 && i > 2) {
                        String str = be0Var.f1341n;
                        if (str != null) {
                            switch (str) {
                                case "audio/eac3-joc":
                                case "audio/ac3":
                                case "audio/ac4":
                                case "audio/eac3":
                                    if (z42.f13274a >= 32 && (c1679zv2 = d10Var.f2710h) != null && c1679zv2.f13575b) {
                                    }
                                default:
                                    if (z42.f13274a < 32) {
                                        z = false;
                                        break;
                                    } else {
                                        z = false;
                                        break;
                                    }
                                    break;
                            }
                        } else if (z42.f13274a < 32 || (c1679zv = d10Var.f2710h) == null || !c1679zv.f13575b || !((Spatializer) c1679zv.f13576c).isAvailable() || !((Spatializer) d10Var.f2710h.f13576c).isEnabled() || !d10Var.f2710h.m7364f(d10Var.f2711i, be0Var)) {
                            z = false;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }
}
