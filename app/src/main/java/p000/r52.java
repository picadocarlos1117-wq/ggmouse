package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r52 {

    /* JADX INFO: renamed from: a */
    public final C0633fa f9738a;

    /* JADX INFO: renamed from: b */
    public final C0633fa f9739b;

    /* JADX INFO: renamed from: c */
    public final C0633fa f9740c;

    public r52(C0633fa c0633fa, C0633fa c0633fa2, C0633fa c0633fa3) {
        this.f9738a = c0633fa;
        this.f9739b = c0633fa2;
        this.f9740c = c0633fa3;
    }

    /* JADX INFO: renamed from: a */
    public abstract s52 mo5704a();

    /* JADX INFO: renamed from: b */
    public final Class m5705b(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        C0633fa c0633fa = this.f9740c;
        Class cls2 = (Class) c0633fa.getOrDefault(name, null);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c0633fa.put(cls.getName(), cls3);
        return cls3;
    }

    /* JADX INFO: renamed from: c */
    public final Method m5706c(String str) throws NoSuchMethodException {
        C0633fa c0633fa = this.f9738a;
        Method method = (Method) c0633fa.getOrDefault(str, null);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, r52.class.getClassLoader()).getDeclaredMethod("read", r52.class);
        c0633fa.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: d */
    public final Method m5707d(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        C0633fa c0633fa = this.f9739b;
        Method method = (Method) c0633fa.getOrDefault(name, null);
        if (method != null) {
            return method;
        }
        Class clsM5705b = m5705b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsM5705b.getDeclaredMethod("write", cls, r52.class);
        c0633fa.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: e */
    public abstract boolean mo5708e(int i);

    /* JADX INFO: renamed from: f */
    public final int m5709f(int i, int i2) {
        return !mo5708e(i2) ? i : ((s52) this).f10239e.readInt();
    }

    /* JADX INFO: renamed from: g */
    public final Parcelable m5710g(Parcelable parcelable, int i) {
        if (!mo5708e(i)) {
            return parcelable;
        }
        return ((s52) this).f10239e.readParcelable(s52.class.getClassLoader());
    }

    /* JADX INFO: renamed from: h */
    public final t52 m5711h() {
        String string = ((s52) this).f10239e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (t52) m5706c(string).invoke(null, mo5704a());
        } catch (ClassNotFoundException e) {
            l41.m4043l("VersionedParcel encountered ClassNotFoundException", e);
            return null;
        } catch (IllegalAccessException e2) {
            l41.m4043l("VersionedParcel encountered IllegalAccessException", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            l41.m4043l("VersionedParcel encountered NoSuchMethodException", e3);
            return null;
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            l41.m4043l("VersionedParcel encountered InvocationTargetException", e4);
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo5712i(int i);

    /* JADX INFO: renamed from: j */
    public final void m5713j(int i, int i2) {
        mo5712i(i2);
        ((s52) this).f10239e.writeInt(i);
    }

    /* JADX INFO: renamed from: k */
    public final void m5714k(Parcelable parcelable, int i) {
        mo5712i(i);
        ((s52) this).f10239e.writeParcelable(parcelable, 0);
    }

    /* JADX INFO: renamed from: l */
    public final void m5715l(t52 t52Var) {
        if (t52Var == null) {
            ((s52) this).f10239e.writeString(null);
            return;
        }
        try {
            ((s52) this).f10239e.writeString(m5705b(t52Var.getClass()).getName());
            s52 s52VarMo5704a = mo5704a();
            try {
                m5707d(t52Var.getClass()).invoke(null, t52Var, s52VarMo5704a);
                Parcel parcel = s52VarMo5704a.f10239e;
                int i = s52VarMo5704a.f10243i;
                if (i >= 0) {
                    int i2 = s52VarMo5704a.f10238d.get(i);
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(iDataPosition - i2);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e) {
                l41.m4043l("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                l41.m4043l("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                l41.m4043l("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (e4.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e4.getCause());
                }
                l41.m4043l("VersionedParcel encountered InvocationTargetException", e4);
            }
        } catch (ClassNotFoundException e5) {
            l41.m4043l(t52Var.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
