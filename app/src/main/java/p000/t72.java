package p000;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class t72 extends ax0 {

    /* JADX INFO: renamed from: d */
    public static t72 f10797d;

    /* JADX INFO: renamed from: e */
    public static final pu0 f10798e = new pu0(16);

    /* JADX INFO: renamed from: c */
    public final Application f10799c;

    public t72(Application application) {
        super(16);
        this.f10799c = application;
    }

    @Override // p000.ax0, p000.u72
    /* JADX INFO: renamed from: a */
    public final r72 mo738a(Class cls) {
        Application application = this.f10799c;
        if (application != null) {
            return m6248s(cls, application);
        }
        C0694gy.m3079e("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        return null;
    }

    @Override // p000.ax0, p000.u72
    /* JADX INFO: renamed from: e */
    public final r72 mo742e(Class cls, a71 a71Var) {
        if (this.f10799c != null) {
            return mo738a(cls);
        }
        Application application = (Application) a71Var.f1067a.get(f10798e);
        if (application != null) {
            return m6248s(cls, application);
        }
        if (!AbstractC0556d6.class.isAssignableFrom(cls)) {
            return super.mo738a(cls);
        }
        f40.m2713i("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }

    /* JADX INFO: renamed from: s */
    public final r72 m6248s(Class cls, Application application) {
        if (!AbstractC0556d6.class.isAssignableFrom(cls)) {
            return super.mo738a(cls);
        }
        try {
            r72 r72Var = (r72) cls.getConstructor(Application.class).newInstance(application);
            r72Var.getClass();
            return r72Var;
        } catch (IllegalAccessException e) {
            l41.m4042k("Cannot create an instance of ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            l41.m4042k("Cannot create an instance of ", cls, e2);
            return null;
        } catch (NoSuchMethodException e3) {
            l41.m4042k("Cannot create an instance of ", cls, e3);
            return null;
        } catch (InvocationTargetException e4) {
            l41.m4042k("Cannot create an instance of ", cls, e4);
            return null;
        }
    }
}
