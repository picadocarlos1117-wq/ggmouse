package p000;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j42 {

    /* JADX INFO: renamed from: a */
    public final Unsafe f5267a;

    public j42(Unsafe unsafe) {
        this.f5267a = unsafe;
    }

    /* JADX INFO: renamed from: a */
    public final int m3552a(Class cls) {
        return this.f5267a.arrayBaseOffset(cls);
    }

    /* JADX INFO: renamed from: b */
    public final int m3553b(Class cls) {
        return this.f5267a.arrayIndexScale(cls);
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo3097c(long j, byte[] bArr, long j2, long j3);

    /* JADX INFO: renamed from: d */
    public abstract boolean mo3098d(long j, Object obj);

    /* JADX INFO: renamed from: e */
    public abstract byte mo3099e(long j);

    /* JADX INFO: renamed from: f */
    public abstract byte mo3100f(long j, Object obj);

    /* JADX INFO: renamed from: g */
    public abstract double mo3101g(long j, Object obj);

    /* JADX INFO: renamed from: h */
    public abstract float mo3102h(long j, Object obj);

    /* JADX INFO: renamed from: i */
    public final int m3554i(long j, Object obj) {
        return this.f5267a.getInt(obj, j);
    }

    /* JADX INFO: renamed from: j */
    public final long m3555j(long j, Object obj) {
        return this.f5267a.getLong(obj, j);
    }

    /* JADX INFO: renamed from: k */
    public final Object m3556k(long j, Object obj) {
        return this.f5267a.getObject(obj, j);
    }

    /* JADX INFO: renamed from: l */
    public final long m3557l(Field field) {
        return this.f5267a.objectFieldOffset(field);
    }

    /* JADX INFO: renamed from: m */
    public abstract void mo3103m(Object obj, long j, boolean z);

    /* JADX INFO: renamed from: n */
    public abstract void mo3104n(Object obj, long j, byte b);

    /* JADX INFO: renamed from: o */
    public abstract void mo3105o(Object obj, long j, double d);

    /* JADX INFO: renamed from: p */
    public abstract void mo3106p(Object obj, long j, float f);

    /* JADX INFO: renamed from: q */
    public final void m3558q(Object obj, int i, long j) {
        this.f5267a.putInt(obj, j, i);
    }

    /* JADX INFO: renamed from: r */
    public final void m3559r(Object obj, long j, long j2) {
        this.f5267a.putLong(obj, j, j2);
    }

    /* JADX INFO: renamed from: s */
    public final void m3560s(Object obj, long j, Object obj2) {
        this.f5267a.putObject(obj, j, obj2);
    }

    /* JADX INFO: renamed from: t */
    public boolean mo3361t() {
        Unsafe unsafe = this.f5267a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            k42.m3776a(th);
            return false;
        }
    }

    /* JADX INFO: renamed from: u */
    public abstract boolean mo3107u();
}
