package p000;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ny0 extends fi0 implements z41 {
    private static final ny0 DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile ec1 PARSER;
    private iy0 fields_ = iy0.f5198b;

    static {
        ny0 ny0Var = new ny0();
        DEFAULT_INSTANCE = ny0Var;
        fi0.registerDefaultInstance(ny0.class, ny0Var);
    }

    /* JADX INFO: renamed from: f */
    public static iy0 m4622f(ny0 ny0Var) {
        iy0 iy0Var = ny0Var.fields_;
        if (!iy0Var.f5199a) {
            ny0Var.fields_ = iy0Var.m3499c();
        }
        return ny0Var.fields_;
    }

    /* JADX INFO: renamed from: g */
    public static ny0 m4623g() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static ly0 m4624l() {
        return (ly0) DEFAULT_INSTANCE.createBuilder();
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
                return fi0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"fields_", my0.f7143a});
            case 3:
                return new ny0();
            case 4:
                return new ly0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ec1 ec1Var = PARSER;
                if (ec1Var != null) {
                    return ec1Var;
                }
                synchronized (ny0.class) {
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

    /* JADX INFO: renamed from: h */
    public final int m4625h() {
        return this.fields_.size();
    }

    /* JADX INFO: renamed from: i */
    public final Map m4626i() {
        return Collections.unmodifiableMap(this.fields_);
    }

    /* JADX INFO: renamed from: j */
    public final e52 m4627j(String str) {
        str.getClass();
        iy0 iy0Var = this.fields_;
        if (iy0Var.containsKey(str)) {
            return (e52) iy0Var.get(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final e52 m4628k(String str) {
        str.getClass();
        iy0 iy0Var = this.fields_;
        if (iy0Var.containsKey(str)) {
            return (e52) iy0Var.get(str);
        }
        l41.m4049r();
        return null;
    }
}
