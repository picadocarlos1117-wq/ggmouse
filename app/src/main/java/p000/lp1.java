package p000;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class lp1 {

    /* JADX INFO: renamed from: a */
    public static final List f6485a = AbstractC1414sp.m6124n0(Application.class, zo1.class);

    /* JADX INFO: renamed from: b */
    public static final List f6486b = AbstractC1337qm.m5511F(zo1.class);

    /* JADX INFO: renamed from: a */
    public static final Constructor m4269a(Class cls, List list) {
        list.getClass();
        Constructor<?>[] constructors = cls.getConstructors();
        constructors.getClass();
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            parameterTypes.getClass();
            List listM4161v0 = AbstractC1064la.m4161v0(parameterTypes);
            if (list.equals(listM4161v0)) {
                return constructor;
            }
            if (list.size() == listM4161v0.size() && listM4161v0.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final r72 m4270b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (r72) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            l41.m4042k("Failed to access ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            l41.m4043l("An exception happened in constructor of " + cls, e3.getCause());
            return null;
        }
    }
}
