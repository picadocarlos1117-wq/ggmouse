package p000;

import io.github.muntashirakon.adb.PairingConnectionCtx;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class y12 {

    /* JADX INFO: renamed from: a */
    public final int f12802a;

    /* JADX INFO: renamed from: b */
    public final String f12803b;

    /* JADX INFO: renamed from: c */
    public final int f12804c;

    /* JADX INFO: renamed from: d */
    public final be0[] f12805d;

    /* JADX INFO: renamed from: e */
    public int f12806e;

    static {
        z42.m7252z(0);
        z42.m7252z(1);
    }

    public y12(String str, be0... be0VarArr) {
        ki0.m3857c(be0VarArr.length > 0);
        this.f12803b = str;
        this.f12805d = be0VarArr;
        this.f12802a = be0VarArr.length;
        int iM6577g = v51.m6577g(be0VarArr[0].f1341n);
        this.f12804c = iM6577g == -1 ? v51.m6577g(be0VarArr[0].f1340m) : iM6577g;
        String str2 = be0VarArr[0].f1331d;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i = be0VarArr[0].f1333f | PairingConnectionCtx.PairingPacketHeader.MAX_PAYLOAD_SIZE;
        for (int i2 = 1; i2 < be0VarArr.length; i2++) {
            String str3 = be0VarArr[i2].f1331d;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                m6988a(i2, "languages", be0VarArr[0].f1331d, be0VarArr[i2].f1331d);
                return;
            } else {
                if (i != (be0VarArr[i2].f1333f | PairingConnectionCtx.PairingPacketHeader.MAX_PAYLOAD_SIZE)) {
                    m6988a(i2, "role flags", Integer.toBinaryString(be0VarArr[0].f1333f), Integer.toBinaryString(be0VarArr[i2].f1333f));
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m6988a(int i, String str, String str2, String str3) {
        StringBuilder sbM3618p = jd0.m3618p("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        sbM3618p.append(str3);
        sbM3618p.append("' (track ");
        sbM3618p.append(i);
        sbM3618p.append(")");
        AbstractC1337qm.m5551n("TrackGroup", "", new IllegalStateException(sbM3618p.toString()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y12.class == obj.getClass()) {
            y12 y12Var = (y12) obj;
            if (this.f12803b.equals(y12Var.f12803b) && Arrays.equals(this.f12805d, y12Var.f12805d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f12806e == 0) {
            this.f12806e = Arrays.hashCode(this.f12805d) + AbstractC1308pu.m5336c(527, 31, this.f12803b);
        }
        return this.f12806e;
    }
}
