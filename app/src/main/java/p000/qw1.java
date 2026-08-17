package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class qw1 extends fi0 implements z41 {
    public static final int AGGREGATIONS_FIELD_NUMBER = 3;
    private static final qw1 DEFAULT_INSTANCE;
    private static volatile ec1 PARSER = null;
    public static final int STRUCTURED_QUERY_FIELD_NUMBER = 1;
    private Object queryType_;
    private int queryTypeCase_ = 0;
    private mo0 aggregations_ = fi0.emptyProtobufList();

    static {
        qw1 qw1Var = new qw1();
        DEFAULT_INSTANCE = qw1Var;
        fi0.registerDefaultInstance(qw1.class, qw1Var);
    }

    /* JADX INFO: renamed from: f */
    public static void m5615f(qw1 qw1Var, mx1 mx1Var) {
        qw1Var.getClass();
        mx1Var.getClass();
        qw1Var.queryType_ = mx1Var;
        qw1Var.queryTypeCase_ = 1;
    }

    /* JADX INFO: renamed from: g */
    public static void m5616g(qw1 qw1Var, ArrayList arrayList) {
        mo0 mo0Var = qw1Var.aggregations_;
        if (!((AbstractC1316q1) mo0Var).f9289a) {
            qw1Var.aggregations_ = fi0.mutableCopy(mo0Var);
        }
        AbstractC0812k1.addAll((Iterable) arrayList, (List) qw1Var.aggregations_);
    }

    /* JADX INFO: renamed from: h */
    public static pw1 m5617h() {
        return (pw1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // p000.fi0
    public final Object dynamicMethod(ei0 ei0Var, Object obj, Object obj2) {
        ec1 bi0Var;
        switch (ei0Var.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return fi0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0003\u0002\u0000\u0001\u0000\u0001<\u0000\u0003\u001b", new Object[]{"queryType_", "queryTypeCase_", mx1.class, "aggregations_", ow1.class});
            case 3:
                return new qw1();
            case 4:
                return new pw1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ec1 ec1Var = PARSER;
                if (ec1Var != null) {
                    return ec1Var;
                }
                synchronized (qw1.class) {
                    try {
                        bi0Var = PARSER;
                        if (bi0Var == null) {
                            bi0Var = new bi0(DEFAULT_INSTANCE);
                            PARSER = bi0Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return bi0Var;
            default:
                lv1.m4291b();
                return null;
        }
    }
}
