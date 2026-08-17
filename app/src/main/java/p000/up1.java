package p000;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class up1 extends AbstractC0550d0 {

    /* JADX INFO: renamed from: c */
    public long f11383c;

    /* JADX INFO: renamed from: d */
    public long[] f11384d;

    /* JADX INFO: renamed from: e */
    public long[] f11385e;

    /* JADX INFO: renamed from: i */
    public static Serializable m6519i(int i, dc1 dc1Var) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(dc1Var.m2331n()));
        }
        if (i == 1) {
            return Boolean.valueOf(dc1Var.m2337t() == 1);
        }
        if (i == 2) {
            return m6521k(dc1Var);
        }
        if (i != 3) {
            if (i == 8) {
                return m6520j(dc1Var);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(dc1Var.m2331n()));
                dc1Var.m2317G(2);
                return date;
            }
            int iM2341x = dc1Var.m2341x();
            ArrayList arrayList = new ArrayList(iM2341x);
            for (int i2 = 0; i2 < iM2341x; i2++) {
                Serializable serializableM6519i = m6519i(dc1Var.m2337t(), dc1Var);
                if (serializableM6519i != null) {
                    arrayList.add(serializableM6519i);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strM6521k = m6521k(dc1Var);
            int iM2337t = dc1Var.m2337t();
            if (iM2337t == 9) {
                return map;
            }
            Serializable serializableM6519i2 = m6519i(iM2337t, dc1Var);
            if (serializableM6519i2 != null) {
                map.put(strM6521k, serializableM6519i2);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static HashMap m6520j(dc1 dc1Var) {
        int iM2341x = dc1Var.m2341x();
        HashMap map = new HashMap(iM2341x);
        for (int i = 0; i < iM2341x; i++) {
            String strM6521k = m6521k(dc1Var);
            Serializable serializableM6519i = m6519i(dc1Var.m2337t(), dc1Var);
            if (serializableM6519i != null) {
                map.put(strM6521k, serializableM6519i);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: k */
    public static String m6521k(dc1 dc1Var) {
        int iM2343z = dc1Var.m2343z();
        int i = dc1Var.f2883b;
        dc1Var.m2317G(iM2343z);
        return new String(dc1Var.f2882a, i, iM2343z);
    }
}
