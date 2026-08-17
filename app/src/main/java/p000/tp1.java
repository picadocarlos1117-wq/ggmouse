package p000;

import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class tp1 {

    /* JADX INFO: renamed from: a */
    public static final Class f10919a;

    /* JADX INFO: renamed from: b */
    public static final b42 f10920b;

    /* JADX INFO: renamed from: c */
    public static final b42 f10921c;

    static {
        Class<?> cls;
        Class<?> cls2;
        b42 b42Var = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f10919a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                b42Var = (b42) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        f10920b = b42Var;
        f10921c = new b42();
    }

    /* JADX INFO: renamed from: a */
    public static int m6308a(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof yn0)) {
            int iM4582a = 0;
            while (i < size) {
                iM4582a += AbstractC1153np.m4582a(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM4582a;
        }
        yn0 yn0Var = (yn0) list;
        int iM4582a2 = 0;
        while (i < size) {
            yn0Var.m7100e(i);
            iM4582a2 += AbstractC1153np.m4582a(yn0Var.f13032b[i]);
            i++;
        }
        return iM4582a2;
    }

    /* JADX INFO: renamed from: b */
    public static int m6309b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC1153np.m4584c(i) + 4) * size;
    }

    /* JADX INFO: renamed from: c */
    public static int m6310c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC1153np.m4584c(i) + 8) * size;
    }

    /* JADX INFO: renamed from: d */
    public static int m6311d(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof yn0)) {
            int iM4582a = 0;
            while (i < size) {
                iM4582a += AbstractC1153np.m4582a(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM4582a;
        }
        yn0 yn0Var = (yn0) list;
        int iM4582a2 = 0;
        while (i < size) {
            yn0Var.m7100e(i);
            iM4582a2 += AbstractC1153np.m4582a(yn0Var.f13032b[i]);
            i++;
        }
        return iM4582a2;
    }

    /* JADX INFO: renamed from: e */
    public static int m6312e(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof yv0)) {
            int iM4586e = 0;
            while (i < size) {
                iM4586e += AbstractC1153np.m4586e(((Long) list.get(i)).longValue());
                i++;
            }
            return iM4586e;
        }
        yv0 yv0Var = (yv0) list;
        int iM4586e2 = 0;
        while (i < size) {
            yv0Var.m7152e(i);
            iM4586e2 += AbstractC1153np.m4586e(yv0Var.f13154b[i]);
            i++;
        }
        return iM4586e2;
    }

    /* JADX INFO: renamed from: f */
    public static int m6313f(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof yn0)) {
            int iM4585d = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iM4585d += AbstractC1153np.m4585d((iIntValue >> 31) ^ (iIntValue << 1));
                i++;
            }
            return iM4585d;
        }
        yn0 yn0Var = (yn0) list;
        int iM4585d2 = 0;
        while (i < size) {
            yn0Var.m7100e(i);
            int i2 = yn0Var.f13032b[i];
            iM4585d2 += AbstractC1153np.m4585d((i2 >> 31) ^ (i2 << 1));
            i++;
        }
        return iM4585d2;
    }

    /* JADX INFO: renamed from: g */
    public static int m6314g(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof yv0)) {
            int iM4586e = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iM4586e += AbstractC1153np.m4586e((jLongValue >> 63) ^ (jLongValue << 1));
                i++;
            }
            return iM4586e;
        }
        yv0 yv0Var = (yv0) list;
        int iM4586e2 = 0;
        while (i < size) {
            yv0Var.m7152e(i);
            long j = yv0Var.f13154b[i];
            iM4586e2 += AbstractC1153np.m4586e((j >> 63) ^ (j << 1));
            i++;
        }
        return iM4586e2;
    }

    /* JADX INFO: renamed from: h */
    public static int m6315h(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof yn0)) {
            int iM4585d = 0;
            while (i < size) {
                iM4585d += AbstractC1153np.m4585d(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM4585d;
        }
        yn0 yn0Var = (yn0) list;
        int iM4585d2 = 0;
        while (i < size) {
            yn0Var.m7100e(i);
            iM4585d2 += AbstractC1153np.m4585d(yn0Var.f13032b[i]);
            i++;
        }
        return iM4585d2;
    }

    /* JADX INFO: renamed from: i */
    public static int m6316i(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof yv0)) {
            int iM4586e = 0;
            while (i < size) {
                iM4586e += AbstractC1153np.m4586e(((Long) list.get(i)).longValue());
                i++;
            }
            return iM4586e;
        }
        yv0 yv0Var = (yv0) list;
        int iM4586e2 = 0;
        while (i < size) {
            yv0Var.m7152e(i);
            iM4586e2 += AbstractC1153np.m4586e(yv0Var.f13154b[i]);
            i++;
        }
        return iM4586e2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: j */
    public static void m6317j(b42 b42Var, Object obj, Object obj2) {
        b42Var.getClass();
        fi0 fi0Var = (fi0) obj;
        a42 a42VarM75e = fi0Var.unknownFields;
        a42 a42Var = ((fi0) obj2).unknownFields;
        a42 a42Var2 = a42.f44f;
        if (!a42Var2.equals(a42Var)) {
            if (a42Var2.equals(a42VarM75e)) {
                a42VarM75e = a42.m75e(a42VarM75e, a42Var);
            } else {
                a42VarM75e.getClass();
                if (!a42Var.equals(a42Var2)) {
                    a42VarM75e.m76a();
                    int i = a42VarM75e.f45a + a42Var.f45a;
                    a42VarM75e.m77b(i);
                    System.arraycopy(a42Var.f46b, 0, a42VarM75e.f46b, a42VarM75e.f45a, a42Var.f45a);
                    System.arraycopy(a42Var.f47c, 0, a42VarM75e.f47c, a42VarM75e.f45a, a42Var.f45a);
                    a42VarM75e.f45a = i;
                }
            }
        }
        fi0Var.unknownFields = a42VarM75e;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m6318k(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    public static void m6319l(int i, List list, ay0 ay0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC1153np abstractC1153np = (AbstractC1153np) ay0Var.f1096b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                abstractC1153np.mo3977h(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        abstractC1153np.mo3992w(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            Logger logger = AbstractC1153np.f7490b;
            i3++;
        }
        abstractC1153np.mo3994y(i3);
        while (i2 < list.size()) {
            abstractC1153np.mo3976g(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m6320m(int i, List list, ay0 ay0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC1153np abstractC1153np = (AbstractC1153np) ay0Var.f1096b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                double dDoubleValue = ((Double) list.get(i2)).doubleValue();
                abstractC1153np.getClass();
                abstractC1153np.mo3983n(i, Double.doubleToRawLongBits(dDoubleValue));
                i2++;
            }
            return;
        }
        abstractC1153np.mo3992w(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            Logger logger = AbstractC1153np.f7490b;
            i3 += 8;
        }
        abstractC1153np.mo3994y(i3);
        while (i2 < list.size()) {
            abstractC1153np.mo3984o(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m6321n(int i, List list, ay0 ay0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC1153np abstractC1153np = (AbstractC1153np) ay0Var.f1096b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                abstractC1153np.mo3985p(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        abstractC1153np.mo3992w(i, 2);
        int iM4582a = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM4582a += AbstractC1153np.m4582a(((Integer) list.get(i3)).intValue());
        }
        abstractC1153np.mo3994y(iM4582a);
        while (i2 < list.size()) {
            abstractC1153np.mo3986q(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m6322o(int i, List list, ay0 ay0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC1153np abstractC1153np = (AbstractC1153np) ay0Var.f1096b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                abstractC1153np.mo3981l(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        abstractC1153np.mo3992w(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = AbstractC1153np.f7490b;
            i3 += 4;
        }
        abstractC1153np.mo3994y(i3);
        while (i2 < list.size()) {
            abstractC1153np.mo3982m(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m6323p(int i, List list, ay0 ay0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC1153np abstractC1153np = (AbstractC1153np) ay0Var.f1096b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                abstractC1153np.mo3983n(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        abstractC1153np.mo3992w(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = AbstractC1153np.f7490b;
            i3 += 8;
        }
        abstractC1153np.mo3994y(i3);
        while (i2 < list.size()) {
            abstractC1153np.mo3984o(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m6324q(int i, List list, ay0 ay0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC1153np abstractC1153np = (AbstractC1153np) ay0Var.f1096b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                float fFloatValue = ((Float) list.get(i2)).floatValue();
                abstractC1153np.getClass();
                abstractC1153np.mo3981l(i, Float.floatToRawIntBits(fFloatValue));
                i2++;
            }
            return;
        }
        abstractC1153np.mo3992w(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            Logger logger = AbstractC1153np.f7490b;
            i3 += 4;
        }
        abstractC1153np.mo3994y(i3);
        while (i2 < list.size()) {
            abstractC1153np.mo3982m(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m6325r(int i, List list, ay0 ay0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC1153np abstractC1153np = (AbstractC1153np) ay0Var.f1096b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                abstractC1153np.mo3985p(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        abstractC1153np.mo3992w(i, 2);
        int iM4582a = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM4582a += AbstractC1153np.m4582a(((Integer) list.get(i3)).intValue());
        }
        abstractC1153np.mo3994y(iM4582a);
        while (i2 < list.size()) {
            abstractC1153np.mo3986q(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m6326s(int i, List list, ay0 ay0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC1153np abstractC1153np = (AbstractC1153np) ay0Var.f1096b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                abstractC1153np.mo3995z(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        abstractC1153np.mo3992w(i, 2);
        int iM4586e = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM4586e += AbstractC1153np.m4586e(((Long) list.get(i3)).longValue());
        }
        abstractC1153np.mo3994y(iM4586e);
        while (i2 < list.size()) {
            abstractC1153np.mo3973A(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m6327t(int i, List list, ay0 ay0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC1153np abstractC1153np = (AbstractC1153np) ay0Var.f1096b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                abstractC1153np.mo3981l(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        abstractC1153np.mo3992w(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = AbstractC1153np.f7490b;
            i3 += 4;
        }
        abstractC1153np.mo3994y(i3);
        while (i2 < list.size()) {
            abstractC1153np.mo3982m(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m6328u(int i, List list, ay0 ay0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC1153np abstractC1153np = (AbstractC1153np) ay0Var.f1096b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                abstractC1153np.mo3983n(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        abstractC1153np.mo3992w(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = AbstractC1153np.f7490b;
            i3 += 8;
        }
        abstractC1153np.mo3994y(i3);
        while (i2 < list.size()) {
            abstractC1153np.mo3984o(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m6329v(int i, List list, ay0 ay0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC1153np abstractC1153np = (AbstractC1153np) ay0Var.f1096b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                abstractC1153np.mo3993x(i, (iIntValue >> 31) ^ (iIntValue << 1));
                i2++;
            }
            return;
        }
        abstractC1153np.mo3992w(i, 2);
        int iM4585d = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int iIntValue2 = ((Integer) list.get(i3)).intValue();
            iM4585d += AbstractC1153np.m4585d((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        abstractC1153np.mo3994y(iM4585d);
        while (i2 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i2)).intValue();
            abstractC1153np.mo3994y((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i2++;
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m6330w(int i, List list, ay0 ay0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC1153np abstractC1153np = (AbstractC1153np) ay0Var.f1096b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                abstractC1153np.mo3995z(i, (jLongValue >> 63) ^ (jLongValue << 1));
                i2++;
            }
            return;
        }
        abstractC1153np.mo3992w(i, 2);
        int iM4586e = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iM4586e += AbstractC1153np.m4586e((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        abstractC1153np.mo3994y(iM4586e);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            abstractC1153np.mo3973A((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i2++;
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m6331x(int i, List list, ay0 ay0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC1153np abstractC1153np = (AbstractC1153np) ay0Var.f1096b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                abstractC1153np.mo3993x(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        abstractC1153np.mo3992w(i, 2);
        int iM4585d = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM4585d += AbstractC1153np.m4585d(((Integer) list.get(i3)).intValue());
        }
        abstractC1153np.mo3994y(iM4585d);
        while (i2 < list.size()) {
            abstractC1153np.mo3994y(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m6332y(int i, List list, ay0 ay0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC1153np abstractC1153np = (AbstractC1153np) ay0Var.f1096b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                abstractC1153np.mo3995z(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        abstractC1153np.mo3992w(i, 2);
        int iM4586e = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM4586e += AbstractC1153np.m4586e(((Long) list.get(i3)).longValue());
        }
        abstractC1153np.mo3994y(iM4586e);
        while (i2 < list.size()) {
            abstractC1153np.mo3973A(((Long) list.get(i2)).longValue());
            i2++;
        }
    }
}
