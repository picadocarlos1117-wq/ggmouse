package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class jn1 {

    /* JADX INFO: renamed from: a */
    public r92 f5461a;

    /* JADX INFO: renamed from: b */
    public ArrayList f5462b;

    /* JADX INFO: renamed from: a */
    public static long m3673a(a20 a20Var, long j) {
        r92 r92Var = a20Var.f30d;
        ArrayList arrayList = a20Var.f37k;
        if (r92Var instanceof gk0) {
            return j;
        }
        int size = arrayList.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            y10 y10Var = (y10) arrayList.get(i);
            if (y10Var instanceof a20) {
                a20 a20Var2 = (a20) y10Var;
                if (a20Var2.f30d != r92Var) {
                    jMin = Math.min(jMin, m3673a(a20Var2, ((long) a20Var2.f32f) + j));
                }
            }
        }
        a20 a20Var3 = r92Var.f9853i;
        a20 a20Var4 = r92Var.f9852h;
        if (a20Var != a20Var3) {
            return jMin;
        }
        long jMo3666j = j - r92Var.mo3666j();
        return Math.min(Math.min(jMin, m3673a(a20Var4, jMo3666j)), jMo3666j - ((long) a20Var4.f32f));
    }

    /* JADX INFO: renamed from: b */
    public static long m3674b(a20 a20Var, long j) {
        r92 r92Var = a20Var.f30d;
        ArrayList arrayList = a20Var.f37k;
        if (r92Var instanceof gk0) {
            return j;
        }
        int size = arrayList.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            y10 y10Var = (y10) arrayList.get(i);
            if (y10Var instanceof a20) {
                a20 a20Var2 = (a20) y10Var;
                if (a20Var2.f30d != r92Var) {
                    jMax = Math.max(jMax, m3674b(a20Var2, ((long) a20Var2.f32f) + j));
                }
            }
        }
        a20 a20Var3 = r92Var.f9852h;
        a20 a20Var4 = r92Var.f9853i;
        if (a20Var != a20Var3) {
            return jMax;
        }
        long jMo3666j = r92Var.mo3666j() + j;
        return Math.max(Math.max(jMax, m3674b(a20Var4, jMo3666j)), jMo3666j - ((long) a20Var4.f32f));
    }
}
