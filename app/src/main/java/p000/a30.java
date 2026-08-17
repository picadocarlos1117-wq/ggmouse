package p000;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class a30 extends fi0 implements z41 {
    public static final int CREATE_TIME_FIELD_NUMBER = 3;
    private static final a30 DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile ec1 PARSER = null;
    public static final int UPDATE_TIME_FIELD_NUMBER = 4;
    private int bitField0_;
    private x02 createTime_;
    private iy0 fields_ = iy0.f5198b;
    private String name_ = "";
    private x02 updateTime_;

    static {
        a30 a30Var = new a30();
        DEFAULT_INSTANCE = a30Var;
        fi0.registerDefaultInstance(a30.class, a30Var);
    }

    /* JADX INFO: renamed from: f */
    public static void m55f(a30 a30Var, String str) {
        a30Var.getClass();
        str.getClass();
        a30Var.name_ = str;
    }

    /* JADX INFO: renamed from: g */
    public static iy0 m56g(a30 a30Var) {
        iy0 iy0Var = a30Var.fields_;
        if (!iy0Var.f5199a) {
            a30Var.fields_ = iy0Var.m3499c();
        }
        return a30Var.fields_;
    }

    /* JADX INFO: renamed from: h */
    public static void m57h(a30 a30Var, x02 x02Var) {
        a30Var.getClass();
        x02Var.getClass();
        a30Var.updateTime_ = x02Var;
        a30Var.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: i */
    public static a30 m58i() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static y20 m59l() {
        return (y20) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: m */
    public static y20 m60m(a30 a30Var) {
        return (y20) DEFAULT_INSTANCE.createBuilder(a30Var);
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
                return fi0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0001\u0000\u0000\u0001Ȉ\u00022\u0003ဉ\u0000\u0004ဉ\u0001", new Object[]{"bitField0_", "name_", "fields_", z20.f13240a, "createTime_", "updateTime_"});
            case 3:
                return new a30();
            case 4:
                return new y20(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ec1 ec1Var = PARSER;
                if (ec1Var != null) {
                    return ec1Var;
                }
                synchronized (a30.class) {
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

    public final String getName() {
        return this.name_;
    }

    /* JADX INFO: renamed from: j */
    public final Map m61j() {
        return Collections.unmodifiableMap(this.fields_);
    }

    /* JADX INFO: renamed from: k */
    public final x02 m62k() {
        x02 x02Var = this.updateTime_;
        return x02Var == null ? x02.m6857h() : x02Var;
    }
}
