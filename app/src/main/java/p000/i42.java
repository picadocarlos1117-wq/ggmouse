package p000;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class i42 extends j42 {
    @Override // p000.j42
    /* JADX INFO: renamed from: c */
    public final void mo3097c(long j, byte[] bArr, long j2, long j3) {
        this.f5267a.copyMemory((Object) null, j, bArr, k42.f5667f + j2, j3);
    }

    @Override // p000.j42
    /* JADX INFO: renamed from: d */
    public final boolean mo3098d(long j, Object obj) {
        return this.f5267a.getBoolean(obj, j);
    }

    @Override // p000.j42
    /* JADX INFO: renamed from: e */
    public final byte mo3099e(long j) {
        return this.f5267a.getByte(j);
    }

    @Override // p000.j42
    /* JADX INFO: renamed from: f */
    public final byte mo3100f(long j, Object obj) {
        return this.f5267a.getByte(obj, j);
    }

    @Override // p000.j42
    /* JADX INFO: renamed from: g */
    public final double mo3101g(long j, Object obj) {
        return this.f5267a.getDouble(obj, j);
    }

    @Override // p000.j42
    /* JADX INFO: renamed from: h */
    public final float mo3102h(long j, Object obj) {
        return this.f5267a.getFloat(obj, j);
    }

    @Override // p000.j42
    /* JADX INFO: renamed from: m */
    public final void mo3103m(Object obj, long j, boolean z) {
        this.f5267a.putBoolean(obj, j, z);
    }

    @Override // p000.j42
    /* JADX INFO: renamed from: n */
    public final void mo3104n(Object obj, long j, byte b) {
        this.f5267a.putByte(obj, j, b);
    }

    @Override // p000.j42
    /* JADX INFO: renamed from: o */
    public final void mo3105o(Object obj, long j, double d) {
        this.f5267a.putDouble(obj, j, d);
    }

    @Override // p000.j42
    /* JADX INFO: renamed from: p */
    public final void mo3106p(Object obj, long j, float f) {
        this.f5267a.putFloat(obj, j, f);
    }

    @Override // p000.j42
    /* JADX INFO: renamed from: t */
    public final boolean mo3361t() {
        if (!super.mo3361t()) {
            return false;
        }
        try {
            Class<?> cls = this.f5267a.getClass();
            Class cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            k42.m3776a(th);
            return false;
        }
    }

    @Override // p000.j42
    /* JADX INFO: renamed from: u */
    public final boolean mo3107u() {
        Unsafe unsafe = this.f5267a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (k42.m3780e() != null) {
                    try {
                        Class<?> cls3 = this.f5267a.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th) {
                        k42.m3776a(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                k42.m3776a(th2);
            }
        }
        return false;
    }
}
