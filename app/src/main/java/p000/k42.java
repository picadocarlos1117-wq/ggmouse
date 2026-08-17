package p000;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k42 {

    /* JADX INFO: renamed from: a */
    public static final Unsafe f5662a;

    /* JADX INFO: renamed from: b */
    public static final Class f5663b;

    /* JADX INFO: renamed from: c */
    public static final j42 f5664c;

    /* JADX INFO: renamed from: d */
    public static final boolean f5665d;

    /* JADX INFO: renamed from: e */
    public static final boolean f5666e;

    /* JADX INFO: renamed from: f */
    public static final long f5667f;

    /* JADX INFO: renamed from: g */
    public static final long f5668g;

    /* JADX INFO: renamed from: h */
    public static final boolean f5669h;

    static {
        Unsafe unsafeM3785j = m3785j();
        f5662a = unsafeM3785j;
        f5663b = AbstractC1579x5.f12452a;
        boolean zM3781f = m3781f(Long.TYPE);
        boolean zM3781f2 = m3781f(Integer.TYPE);
        boolean z = true;
        int i = 0;
        j42 i42Var = null;
        if (unsafeM3785j != null) {
            if (!AbstractC1579x5.m6867a()) {
                i42Var = new i42(unsafeM3785j);
            } else if (zM3781f) {
                i42Var = new h42(unsafeM3785j, z ? 1 : 0);
            } else if (zM3781f2) {
                i42Var = new h42(unsafeM3785j, i);
            }
        }
        f5664c = i42Var;
        f5665d = i42Var == null ? false : i42Var.mo3107u();
        f5666e = i42Var == null ? false : i42Var.mo3361t();
        f5667f = m3778c(byte[].class);
        m3778c(boolean[].class);
        m3779d(boolean[].class);
        m3778c(int[].class);
        m3779d(int[].class);
        m3778c(long[].class);
        m3779d(long[].class);
        m3778c(float[].class);
        m3779d(float[].class);
        m3778c(double[].class);
        m3779d(double[].class);
        m3778c(Object[].class);
        m3779d(Object[].class);
        Field fieldM3780e = m3780e();
        f5668g = (fieldM3780e == null || i42Var == null) ? -1L : i42Var.m3557l(fieldM3780e);
        f5669h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: a */
    public static void m3776a(Throwable th) {
        Logger.getLogger(k42.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    /* JADX INFO: renamed from: b */
    public static Object m3777b(Class cls) {
        try {
            return f5662a.allocateInstance(cls);
        } catch (InstantiationException e) {
            lv1.m4302n(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m3778c(Class cls) {
        if (f5666e) {
            return f5664c.m3552a(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public static void m3779d(Class cls) {
        if (f5666e) {
            f5664c.m3553b(cls);
        }
    }

    /* JADX INFO: renamed from: e */
    public static Field m3780e() {
        Field declaredField;
        Field declaredField2;
        if (AbstractC1579x5.m6867a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m3781f(Class cls) {
        if (!AbstractC1579x5.m6867a()) {
            return false;
        }
        try {
            Class cls2 = f5663b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    public static byte m3782g(long j, byte[] bArr) {
        return f5664c.mo3100f(f5667f + j, bArr);
    }

    /* JADX INFO: renamed from: h */
    public static byte m3783h(long j, Object obj) {
        return (byte) ((f5664c.m3554i((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    /* JADX INFO: renamed from: i */
    public static byte m3784i(long j, Object obj) {
        return (byte) ((f5664c.m3554i((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255);
    }

    /* JADX INFO: renamed from: j */
    public static Unsafe m3785j() {
        try {
            return (Unsafe) AccessController.doPrivileged(new g42());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m3786k(byte[] bArr, long j, byte b) {
        f5664c.mo3104n(bArr, f5667f + j, b);
    }

    /* JADX INFO: renamed from: l */
    public static void m3787l(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int iM3554i = f5664c.m3554i(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        m3789n(obj, ((255 & b) << i) | (iM3554i & (~(255 << i))), j2);
    }

    /* JADX INFO: renamed from: m */
    public static void m3788m(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m3789n(obj, ((255 & b) << i) | (f5664c.m3554i(j2, obj) & (~(255 << i))), j2);
    }

    /* JADX INFO: renamed from: n */
    public static void m3789n(Object obj, int i, long j) {
        f5664c.m3558q(obj, i, j);
    }

    /* JADX INFO: renamed from: o */
    public static void m3790o(Object obj, long j, long j2) {
        f5664c.m3559r(obj, j, j2);
    }

    /* JADX INFO: renamed from: p */
    public static void m3791p(Object obj, long j, Object obj2) {
        f5664c.m3560s(obj, j, obj2);
    }
}
