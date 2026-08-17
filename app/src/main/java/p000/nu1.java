package p000;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class nu1 extends ki0 {

    /* JADX INFO: renamed from: q */
    public final dc1 f7543q = new dc1();

    /* JADX INFO: renamed from: r */
    public final C0141cm f7544r = new C0141cm();

    /* JADX INFO: renamed from: s */
    public y02 f7545s;

    /* JADX WARN: Code duplicated, block: B:14:0x001a  */
    @Override // p000.ki0
    /* JADX INFO: renamed from: t */
    public final k51 mo194t(o51 o51Var, ByteBuffer byteBuffer) {
        f51 qu1Var;
        dc1 dc1Var;
        long j;
        boolean z;
        boolean z2;
        boolean z3;
        int iM2343z;
        int iM2337t;
        int iM2337t2;
        long j2;
        long j3;
        boolean z4;
        long jM2339v;
        List list;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        int i;
        int i2;
        int iM2337t3;
        long j4;
        long j5;
        long j6;
        boolean z9;
        long j7;
        dc1 dc1Var2 = this.f7543q;
        C0141cm c0141cm = this.f7544r;
        y02 y02Var = this.f7545s;
        if (y02Var != null) {
            long j8 = o51Var.f7665s;
            synchronized (y02Var) {
                j7 = y02Var.f12797b;
            }
            if (j8 != j7) {
                y02 y02Var2 = new y02(o51Var.f11797p);
                this.f7545s = y02Var2;
                y02Var2.m6983a(o51Var.f11797p - o51Var.f7665s);
            }
        } else {
            y02 y02Var3 = new y02(o51Var.f11797p);
            this.f7545s = y02Var3;
            y02Var3.m6983a(o51Var.f11797p - o51Var.f7665s);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        dc1Var2.m2314D(iLimit, bArrArray);
        c0141cm.m1244o(iLimit, bArrArray);
        c0141cm.m1249t(39);
        boolean z10 = true;
        long jM1238i = (((long) c0141cm.m1238i(1)) << 32) | ((long) c0141cm.m1238i(32));
        c0141cm.m1249t(20);
        int iM1238i = c0141cm.m1238i(12);
        int iM1238i2 = c0141cm.m1238i(8);
        dc1Var2.m2317G(14);
        if (iM1238i2 == 0) {
            qu1Var = new qu1();
        } else if (iM1238i2 != 255) {
            long j9 = 1;
            long jM2339v2 = -9223372036854775807L;
            if (iM1238i2 == 4) {
                int iM2337t4 = dc1Var2.m2337t();
                ArrayList arrayList = new ArrayList(iM2337t4);
                int i3 = 0;
                while (i3 < iM2337t4) {
                    long jM2339v3 = dc1Var2.m2339v();
                    boolean z11 = (dc1Var2.m2337t() & 128) != 0 ? z10 : false;
                    ArrayList arrayList2 = new ArrayList();
                    if (z11) {
                        dc1Var = dc1Var2;
                        j = j9;
                        z = false;
                        z2 = false;
                        z3 = false;
                        iM2343z = 0;
                        iM2337t = 0;
                        iM2337t2 = 0;
                        j2 = -9223372036854775807L;
                        j3 = -9223372036854775807L;
                    } else {
                        int iM2337t5 = dc1Var2.m2337t();
                        boolean z12 = (iM2337t5 & 128) != 0 ? z10 : false;
                        boolean z13 = (iM2337t5 & 64) != 0 ? z10 : false;
                        boolean z14 = (iM2337t5 & 32) != 0 ? z10 : false;
                        long jM2339v4 = z13 ? dc1Var2.m2339v() : -9223372036854775807L;
                        if (!z13) {
                            int iM2337t6 = dc1Var2.m2337t();
                            ArrayList arrayList3 = new ArrayList(iM2337t6);
                            int i4 = 0;
                            while (i4 < iM2337t6) {
                                dc1 dc1Var3 = dc1Var2;
                                arrayList3.add(new ru1(dc1Var2.m2337t(), dc1Var3.m2339v()));
                                i4++;
                                dc1Var2 = dc1Var3;
                                j9 = j9;
                            }
                            arrayList2 = arrayList3;
                        }
                        dc1Var = dc1Var2;
                        j = j9;
                        if (z14) {
                            long jM2337t = dc1Var.m2337t();
                            z4 = (jM2337t & 128) != 0;
                            jM2339v = ((((jM2337t & j) << 32) | dc1Var.m2339v()) * 1000) / 90;
                        } else {
                            z4 = false;
                            jM2339v = -9223372036854775807L;
                        }
                        j3 = jM2339v;
                        z3 = z4;
                        z = z12;
                        z2 = z13;
                        j2 = jM2339v4;
                        iM2343z = dc1Var.m2343z();
                        iM2337t = dc1Var.m2337t();
                        iM2337t2 = dc1Var.m2337t();
                    }
                    arrayList.add(new su1(jM2339v3, z11, z, z2, arrayList2, j2, z3, j3, iM2343z, iM2337t, iM2337t2));
                    i3++;
                    dc1Var2 = dc1Var;
                    j9 = j;
                    z10 = true;
                }
                qu1Var = new tu1(arrayList);
            } else if (iM1238i2 == 5) {
                y02 y02Var4 = this.f7545s;
                long jM2339v5 = dc1Var2.m2339v();
                boolean z15 = (dc1Var2.m2337t() & 128) != 0;
                List list2 = Collections.EMPTY_LIST;
                if (z15) {
                    list = list2;
                    z5 = false;
                    z6 = false;
                    z7 = false;
                    z8 = false;
                    i = 0;
                    i2 = 0;
                    iM2337t3 = 0;
                    j4 = -9223372036854775807L;
                    j5 = -9223372036854775807L;
                } else {
                    int iM2337t7 = dc1Var2.m2337t();
                    boolean z16 = (iM2337t7 & 128) != 0;
                    boolean z17 = (iM2337t7 & 64) != 0;
                    boolean z18 = (iM2337t7 & 32) != 0;
                    boolean z19 = (iM2337t7 & 16) != 0;
                    long jM4496a = (!z17 || z19) ? -9223372036854775807L : n02.m4496a(jM1238i, dc1Var2);
                    if (z17) {
                        j6 = 90;
                    } else {
                        int iM2337t8 = dc1Var2.m2337t();
                        ArrayList arrayList4 = new ArrayList(iM2337t8);
                        j6 = 90;
                        for (int i5 = 0; i5 < iM2337t8; i5++) {
                            int iM2337t9 = dc1Var2.m2337t();
                            long jM4496a2 = !z19 ? n02.m4496a(jM1238i, dc1Var2) : -9223372036854775807L;
                            arrayList4.add(new ou1(jM4496a2, y02Var4.m6984b(jM4496a2), iM2337t9));
                        }
                        list2 = arrayList4;
                    }
                    if (z18) {
                        long jM2337t2 = dc1Var2.m2337t();
                        z9 = (jM2337t2 & 128) != 0;
                        jM2339v2 = ((((jM2337t2 & 1) << 32) | dc1Var2.m2339v()) * 1000) / j6;
                    } else {
                        z9 = false;
                    }
                    int iM2343z2 = dc1Var2.m2343z();
                    int iM2337t10 = dc1Var2.m2337t();
                    iM2337t3 = dc1Var2.m2337t();
                    list = list2;
                    z7 = z19;
                    z8 = z9;
                    i = iM2343z2;
                    i2 = iM2337t10;
                    j5 = jM2339v2;
                    j4 = jM4496a;
                    z5 = z16;
                    z6 = z17;
                }
                qu1Var = new pu1(jM2339v5, z15, z5, z6, z7, j4, y02Var4.m6984b(j4), list, z8, j5, i, i2, iM2337t3);
            } else if (iM1238i2 != 6) {
                qu1Var = null;
            } else {
                y02 y02Var5 = this.f7545s;
                long jM4496a3 = n02.m4496a(jM1238i, dc1Var2);
                qu1Var = new n02(jM4496a3, y02Var5.m6984b(jM4496a3));
            }
        } else {
            long jM2339v6 = dc1Var2.m2339v();
            int i6 = iM1238i - 4;
            byte[] bArr = new byte[i6];
            dc1Var2.m2322e(0, i6, bArr);
            qu1Var = new gg1(jM2339v6, bArr, jM1238i);
        }
        return qu1Var == null ? new k51(new f51[0]) : new k51(qu1Var);
    }
}
