package p000;

import android.sun.security.util.DerValue;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: hm */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0719hm implements qx1 {

    /* JADX INFO: renamed from: a */
    public final List f4613a;

    public /* synthetic */ C0719hm(List list) {
        this.f4613a = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX INFO: renamed from: a */
    public List m3180a(C0082b0 c0082b0) {
        String str;
        int i;
        List listSingletonList;
        dc1 dc1Var = new dc1((byte[]) c0082b0.f1105d);
        ArrayList arrayList = this.f4613a;
        while (dc1Var.m2318a() > 0) {
            int iM2337t = dc1Var.m2337t();
            int iM2337t2 = dc1Var.f2883b + dc1Var.m2337t();
            if (iM2337t == 134) {
                arrayList = new ArrayList();
                int iM2337t3 = dc1Var.m2337t() & 31;
                for (int i2 = 0; i2 < iM2337t3; i2++) {
                    String strM2335r = dc1Var.m2335r(3, StandardCharsets.UTF_8);
                    int iM2337t4 = dc1Var.m2337t();
                    boolean z = (iM2337t4 & 128) != 0;
                    if (z) {
                        i = iM2337t4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bM2337t = (byte) dc1Var.m2337t();
                    dc1Var.m2317G(1);
                    if (z) {
                        boolean z2 = (bM2337t & DerValue.TAG_APPLICATION) != 0;
                        byte[] bArr = AbstractC0574dp.f2986a;
                        listSingletonList = Collections.singletonList(z2 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    ae0 ae0Var = new ae0();
                    ae0Var.f197m = v51.m6582l(str);
                    ae0Var.f188d = strM2335r;
                    ae0Var.f180G = i;
                    ae0Var.f200p = listSingletonList;
                    arrayList.add(new be0(ae0Var));
                }
            }
            dc1Var.m2316F(iM2337t2);
            arrayList = arrayList;
        }
        return arrayList;
    }

    @Override // p000.qx1
    /* JADX INFO: renamed from: c */
    public int mo2822c(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // p000.qx1
    /* JADX INFO: renamed from: d */
    public long mo2823d(int i) {
        ki0.m3857c(i == 0);
        return 0L;
    }

    @Override // p000.qx1
    /* JADX INFO: renamed from: e */
    public List mo2824e(long j) {
        return j >= 0 ? this.f4613a : Collections.EMPTY_LIST;
    }

    @Override // p000.qx1
    /* JADX INFO: renamed from: g */
    public int mo2825g() {
        return 1;
    }
}
