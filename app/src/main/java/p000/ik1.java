package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ik1 implements zv0 {

    /* JADX INFO: renamed from: b */
    public static final Logger f5057b = Logger.getLogger(ik1.class.getName());

    /* JADX INFO: renamed from: c */
    public static final Constructor f5058c;

    /* JADX INFO: renamed from: d */
    public static final Method f5059d;

    /* JADX INFO: renamed from: e */
    public static final RuntimeException f5060e;

    /* JADX INFO: renamed from: f */
    public static final Object[] f5061f;

    /* JADX INFO: renamed from: a */
    public final Object f5062a;

    static {
        Method method;
        Constructor<?> constructor;
        try {
            Class<?> cls = Class.forName("java.util.concurrent.atomic.LongAdder");
            method = cls.getMethod("add", Long.TYPE);
            try {
                cls.getMethod("sum", null);
                Constructor<?>[] constructors = cls.getConstructors();
                int length = constructors.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        constructor = null;
                        break;
                    }
                    constructor = constructors[i];
                    if (constructor.getParameterTypes().length == 0) {
                        break;
                    } else {
                        i++;
                    }
                }
                th = null;
            } catch (Throwable th) {
                th = th;
                f5057b.log(Level.FINE, "LongAdder can not be found via reflection, this is normal for JDK7 and below", th);
                constructor = null;
            }
        } catch (Throwable th2) {
            th = th2;
            method = null;
        }
        if (th != null || constructor == null) {
            f5058c = null;
            f5059d = null;
            f5060e = new RuntimeException(th);
        } else {
            f5058c = constructor;
            f5059d = method;
            f5060e = null;
        }
        f5061f = new Object[]{1L};
    }

    public ik1() {
        RuntimeException runtimeException = f5060e;
        if (runtimeException != null) {
            throw runtimeException;
        }
        try {
            this.f5062a = f5058c.newInstance(null);
        } catch (IllegalAccessException e) {
            ca0.m1184p(e);
            throw null;
        } catch (InstantiationException e2) {
            ca0.m1184p(e2);
            throw null;
        } catch (InvocationTargetException e3) {
            ca0.m1184p(e3);
            throw null;
        }
    }

    @Override // p000.zv0
    /* JADX INFO: renamed from: a */
    public final void mo3445a() {
        try {
            f5059d.invoke(this.f5062a, f5061f);
        } catch (IllegalAccessException e) {
            ca0.m1184p(e);
        } catch (InvocationTargetException e2) {
            ca0.m1184p(e2);
        }
    }
}
