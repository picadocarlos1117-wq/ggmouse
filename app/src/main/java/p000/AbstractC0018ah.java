package p000;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: ah */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0018ah implements InterfaceC0579du, InterfaceC1567wu, Serializable {
    private final InterfaceC0579du completion;

    public AbstractC0018ah(InterfaceC0579du interfaceC0579du) {
        this.completion = interfaceC0579du;
    }

    public InterfaceC0579du create(InterfaceC0579du interfaceC0579du) {
        interfaceC0579du.getClass();
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // p000.InterfaceC1567wu
    public InterfaceC1567wu getCallerFrame() {
        InterfaceC0579du interfaceC0579du = this.completion;
        if (interfaceC0579du instanceof InterfaceC1567wu) {
            return (InterfaceC1567wu) interfaceC0579du;
        }
        return null;
    }

    public final InterfaceC0579du getCompletion() {
        return this.completion;
    }

    @Override // p000.InterfaceC1567wu
    public StackTraceElement getStackTraceElement() {
        int iIntValue;
        String strM5372c;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        InterfaceC1311px interfaceC1311px = (InterfaceC1311px) getClass().getAnnotation(InterfaceC1311px.class);
        String str = null;
        if (interfaceC1311px == null) {
            return null;
        }
        int iM5376v = interfaceC1311px.m5376v();
        if (iM5376v > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iM5376v + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i = iIntValue >= 0 ? interfaceC1311px.m5374l()[iIntValue] : -1;
        a61 a61Var = ki0.f5840l;
        a61 a61Var2 = ki0.f5841m;
        if (a61Var2 == null) {
            try {
                a61 a61Var3 = new a61(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod(AppMeasurementSdk.ConditionalUserProperty.NAME, null));
                ki0.f5841m = a61Var3;
                a61Var2 = a61Var3;
            } catch (Exception unused2) {
                ki0.f5841m = a61Var;
                a61Var2 = a61Var;
            }
        }
        if (a61Var2 != a61Var && (method = a61Var2.f70a) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = a61Var2.f71b) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = a61Var2.f72c;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strM5372c = interfaceC1311px.m5372c();
        } else {
            strM5372c = str + '/' + interfaceC1311px.m5372c();
        }
        return new StackTraceElement(strM5372c, interfaceC1311px.m5375m(), interfaceC1311px.m5373f(), i);
    }

    public abstract Object invokeSuspend(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // p000.InterfaceC0579du
    public final void resumeWith(Object obj) {
        Object r2 = this;
        while (true) {
            AbstractC0018ah abstractC0018ah = (AbstractC0018ah) r2;
            InterfaceC0579du interfaceC0579du = abstractC0018ah.completion;
            interfaceC0579du.getClass();
            try {
                obj = abstractC0018ah.invokeSuspend(obj);
                if (obj == EnumC1530vu.f11768a) {
                    return;
                }
            } catch (Throwable th) {
                obj = new tl1(th);
            }
            abstractC0018ah.releaseIntercepted();
            if (!(interfaceC0579du instanceof AbstractC0018ah)) {
                interfaceC0579du.resumeWith(obj);
                return;
            }
            r2 = interfaceC0579du;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
        interfaceC0579du.getClass();
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
