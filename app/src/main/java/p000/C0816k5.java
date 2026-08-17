package p000;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: k5 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0816k5 extends fi0 implements z41 {
    public static final int AGGREGATE_FIELDS_FIELD_NUMBER = 2;
    private static final C0816k5 DEFAULT_INSTANCE;
    private static volatile ec1 PARSER;
    private iy0 aggregateFields_ = iy0.f5198b;

    static {
        C0816k5 c0816k5 = new C0816k5();
        DEFAULT_INSTANCE = c0816k5;
        fi0.registerDefaultInstance(C0816k5.class, c0816k5);
    }

    /* JADX INFO: renamed from: g */
    public static C0816k5 m3792g() {
        return DEFAULT_INSTANCE;
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
                return fi0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"aggregateFields_", AbstractC0739i5.f4817a});
            case 3:
                return new C0816k5();
            case 4:
                return new C0778j5(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ec1 ec1Var = PARSER;
                if (ec1Var != null) {
                    return ec1Var;
                }
                synchronized (C0816k5.class) {
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

    /* JADX INFO: renamed from: f */
    public final Map m3793f() {
        return Collections.unmodifiableMap(this.aggregateFields_);
    }
}
