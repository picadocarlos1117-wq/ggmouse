package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ww1 extends fi0 implements z41 {
    private static final ww1 DEFAULT_INSTANCE;
    public static final int FILTERS_FIELD_NUMBER = 2;
    public static final int OP_FIELD_NUMBER = 1;
    private static volatile ec1 PARSER;
    private mo0 filters_ = fi0.emptyProtobufList();
    private int op_;

    static {
        ww1 ww1Var = new ww1();
        DEFAULT_INSTANCE = ww1Var;
        fi0.registerDefaultInstance(ww1.class, ww1Var);
    }

    /* JADX INFO: renamed from: f */
    public static void m6838f(ww1 ww1Var, vw1 vw1Var) {
        ww1Var.getClass();
        ww1Var.op_ = vw1Var.getNumber();
    }

    /* JADX INFO: renamed from: g */
    public static void m6839g(ww1 ww1Var, ArrayList arrayList) {
        mo0 mo0Var = ww1Var.filters_;
        if (!((AbstractC1316q1) mo0Var).f9289a) {
            ww1Var.filters_ = fi0.mutableCopy(mo0Var);
        }
        AbstractC0812k1.addAll((Iterable) arrayList, (List) ww1Var.filters_);
    }

    /* JADX INFO: renamed from: h */
    public static ww1 m6840h() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static uw1 m6841k() {
        return (uw1) DEFAULT_INSTANCE.createBuilder();
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
                return fi0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002\u001b", new Object[]{"op_", "filters_", fx1.class});
            case 3:
                return new ww1();
            case 4:
                return new uw1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ec1 ec1Var = PARSER;
                if (ec1Var != null) {
                    return ec1Var;
                }
                synchronized (ww1.class) {
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

    /* JADX INFO: renamed from: i */
    public final mo0 m6842i() {
        return this.filters_;
    }

    /* JADX INFO: renamed from: j */
    public final vw1 m6843j() {
        vw1 vw1Var;
        int i = this.op_;
        if (i == 0) {
            vw1Var = vw1.OPERATOR_UNSPECIFIED;
        } else if (i != 1) {
            vw1Var = i != 2 ? null : vw1.OR;
        } else {
            vw1Var = vw1.AND;
        }
        return vw1Var == null ? vw1.UNRECOGNIZED : vw1Var;
    }
}
