package p000;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class t90 {

    /* JADX INFO: renamed from: a */
    public final mt1 f10804a = new mt1(16);

    /* JADX INFO: renamed from: b */
    public boolean f10805b;

    static {
        new t90(0);
    }

    public t90(int i) {
        m6257b();
        m6257b();
    }

    /* JADX INFO: renamed from: a */
    public static int m6254a(hb2 hb2Var, int i, Object obj) {
        int size;
        int iM4585d;
        int iM4584c = AbstractC1153np.m4584c(i);
        if (hb2Var == hb2.f4514d) {
            iM4584c *= 2;
        }
        int iM4586e = 1;
        switch (hb2Var.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                Logger logger = AbstractC1153np.f7490b;
                iM4586e = 8;
                break;
            case 1:
                ((Float) obj).getClass();
                Logger logger2 = AbstractC1153np.f7490b;
                iM4586e = 4;
                break;
            case 2:
                iM4586e = AbstractC1153np.m4586e(((Long) obj).longValue());
                break;
            case 3:
                iM4586e = AbstractC1153np.m4586e(((Long) obj).longValue());
                break;
            case 4:
                iM4586e = AbstractC1153np.m4582a(((Integer) obj).intValue());
                break;
            case 5:
                ((Long) obj).getClass();
                Logger logger3 = AbstractC1153np.f7490b;
                iM4586e = 8;
                break;
            case 6:
                ((Integer) obj).getClass();
                Logger logger4 = AbstractC1153np.f7490b;
                iM4586e = 4;
                break;
            case 7:
                ((Boolean) obj).getClass();
                Logger logger5 = AbstractC1153np.f7490b;
                break;
            case 8:
                if (!(obj instanceof AbstractC0753ik)) {
                    iM4586e = AbstractC1153np.m4583b((String) obj);
                } else {
                    Logger logger6 = AbstractC1153np.f7490b;
                    size = ((AbstractC0753ik) obj).size();
                    iM4585d = AbstractC1153np.m4585d(size);
                    iM4586e = iM4585d + size;
                }
                break;
            case 9:
                Logger logger7 = AbstractC1153np.f7490b;
                iM4586e = ((y41) obj).getSerializedSize();
                break;
            case 10:
                Logger logger8 = AbstractC1153np.f7490b;
                size = ((y41) obj).getSerializedSize();
                iM4585d = AbstractC1153np.m4585d(size);
                iM4586e = iM4585d + size;
                break;
            case 11:
                if (obj instanceof AbstractC0753ik) {
                    Logger logger9 = AbstractC1153np.f7490b;
                    size = ((AbstractC0753ik) obj).size();
                    iM4585d = AbstractC1153np.m4585d(size);
                } else {
                    Logger logger10 = AbstractC1153np.f7490b;
                    size = ((byte[]) obj).length;
                    iM4585d = AbstractC1153np.m4585d(size);
                }
                iM4586e = iM4585d + size;
                break;
            case 12:
                iM4586e = AbstractC1153np.m4585d(((Integer) obj).intValue());
                break;
            case 13:
                iM4586e = !(obj instanceof ho0) ? AbstractC1153np.m4582a(((Integer) obj).intValue()) : AbstractC1153np.m4582a(((ho0) obj).getNumber());
                break;
            case 14:
                ((Integer) obj).getClass();
                Logger logger11 = AbstractC1153np.f7490b;
                iM4586e = 4;
                break;
            case 15:
                ((Long) obj).getClass();
                Logger logger12 = AbstractC1153np.f7490b;
                iM4586e = 8;
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                iM4586e = AbstractC1153np.m4585d((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                iM4586e = AbstractC1153np.m4586e((jLongValue >> 63) ^ (jLongValue << 1));
                break;
            default:
                l41.m4048q("There is no way to get here, but the compiler thinks otherwise.");
                iM4586e = 0;
                break;
        }
        return iM4586e + iM4584c;
    }

    /* JADX INFO: renamed from: d */
    public static void m6255d(ci0 ci0Var, Object obj) {
        hb2 hb2Var = ci0Var.f1815b;
        Charset charset = no0.f7481a;
        obj.getClass();
        boolean z = true;
        switch (hb2Var.f4517a) {
            case INT:
                z = obj instanceof Integer;
                break;
            case LONG:
                z = obj instanceof Long;
                break;
            case FLOAT:
                z = obj instanceof Float;
                break;
            case DOUBLE:
                z = obj instanceof Double;
                break;
            case BOOLEAN:
                z = obj instanceof Boolean;
                break;
            case STRING:
                z = obj instanceof String;
                break;
            case BYTE_STRING:
                if (!(obj instanceof AbstractC0753ik) && !(obj instanceof byte[])) {
                    z = false;
                }
                break;
            case ENUM:
                if (!(obj instanceof Integer) && !(obj instanceof ho0)) {
                    z = false;
                }
                break;
            case MESSAGE:
                if (!(obj instanceof y41)) {
                    z = false;
                }
                break;
            default:
                z = false;
                break;
        }
        if (z) {
            return;
        }
        ca0.m1183o("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(ci0Var.f1814a), ci0Var.f1815b.f4517a, obj.getClass().getName()});
    }

    /* JADX INFO: renamed from: e */
    public static void m6256e(AbstractC1153np abstractC1153np, hb2 hb2Var, int i, Object obj) {
        if (hb2Var == hb2.f4514d) {
            abstractC1153np.mo3992w(i, 3);
            ((y41) obj).writeTo(abstractC1153np);
            abstractC1153np.mo3992w(i, 4);
        }
        abstractC1153np.mo3992w(i, hb2Var.f4518b);
        switch (hb2Var.ordinal()) {
            case 0:
                abstractC1153np.mo3984o(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                abstractC1153np.mo3982m(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                abstractC1153np.mo3973A(((Long) obj).longValue());
                break;
            case 3:
                abstractC1153np.mo3973A(((Long) obj).longValue());
                break;
            case 4:
                abstractC1153np.mo3986q(((Integer) obj).intValue());
                break;
            case 5:
                abstractC1153np.mo3984o(((Long) obj).longValue());
                break;
            case 6:
                abstractC1153np.mo3982m(((Integer) obj).intValue());
                break;
            case 7:
                abstractC1153np.mo3976g(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof AbstractC0753ik)) {
                    abstractC1153np.mo3991v((String) obj);
                } else {
                    abstractC1153np.mo3980k((AbstractC0753ik) obj);
                }
                break;
            case 9:
                ((y41) obj).writeTo(abstractC1153np);
                break;
            case 10:
                abstractC1153np.mo3989t((y41) obj);
                break;
            case 11:
                if (!(obj instanceof AbstractC0753ik)) {
                    byte[] bArr = (byte[]) obj;
                    abstractC1153np.mo3978i(bArr.length, bArr);
                } else {
                    abstractC1153np.mo3980k((AbstractC0753ik) obj);
                }
                break;
            case 12:
                abstractC1153np.mo3994y(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof ho0)) {
                    abstractC1153np.mo3986q(((Integer) obj).intValue());
                } else {
                    abstractC1153np.mo3986q(((ho0) obj).getNumber());
                }
                break;
            case 14:
                abstractC1153np.mo3982m(((Integer) obj).intValue());
                break;
            case 15:
                abstractC1153np.mo3984o(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                abstractC1153np.mo3994y((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                abstractC1153np.mo3973A((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m6257b() {
        mt1 mt1Var;
        if (this.f10805b) {
            return;
        }
        int i = 0;
        while (true) {
            mt1Var = this.f10804a;
            if (i >= mt1Var.f7097b.size()) {
                break;
            }
            Map.Entry entryM4455c = mt1Var.m4455c(i);
            if (entryM4455c.getValue() instanceof fi0) {
                ((fi0) entryM4455c.getValue()).makeImmutable();
            }
            i++;
        }
        if (!mt1Var.f7099d) {
            for (int i2 = 0; i2 < mt1Var.f7097b.size(); i2++) {
                Map.Entry entryM4455c2 = mt1Var.m4455c(i2);
                if (((ci0) entryM4455c2.getKey()).f1816c) {
                    entryM4455c2.setValue(Collections.unmodifiableList((List) entryM4455c2.getValue()));
                }
            }
            for (Map.Entry entry : mt1Var.m4456d()) {
                if (((ci0) entry.getKey()).f1816c) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        if (!mt1Var.f7099d) {
            mt1Var.f7098c = mt1Var.f7098c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(mt1Var.f7098c);
            mt1Var.f7101f = mt1Var.f7101f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(mt1Var.f7101f);
            mt1Var.f7099d = true;
        }
        this.f10805b = true;
    }

    /* JADX INFO: renamed from: c */
    public final void m6258c(ci0 ci0Var, Object obj) {
        if (!ci0Var.f1816c) {
            m6255d(ci0Var, obj);
        } else {
            if (!(obj instanceof List)) {
                f40.m2713i("Wrong object type used with protocol message reflection.");
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                m6255d(ci0Var, obj2);
            }
            obj = arrayList;
        }
        this.f10804a.put(ci0Var, obj);
    }

    public final Object clone() {
        mt1 mt1Var;
        t90 t90Var = new t90();
        int i = 0;
        while (true) {
            mt1Var = this.f10804a;
            if (i >= mt1Var.f7097b.size()) {
                break;
            }
            Map.Entry entryM4455c = mt1Var.m4455c(i);
            t90Var.m6258c((ci0) entryM4455c.getKey(), entryM4455c.getValue());
            i++;
        }
        for (Map.Entry entry : mt1Var.m4456d()) {
            t90Var.m6258c((ci0) entry.getKey(), entry.getValue());
        }
        return t90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t90) {
            return this.f10804a.equals(((t90) obj).f10804a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10804a.hashCode();
    }

    public t90() {
    }
}
