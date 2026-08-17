package com.example.ssmousepro.injection;

import android.util.Log;
import com.example.ssmousepro.injection.IoctlHelper;
import java.io.FileDescriptor;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p000.AbstractC1064la;
import p000.AbstractC1377rp;
import p000.C0694gy;
import p000.C1110mj;
import p000.C1284p6;
import p000.C1348qx;
import p000.bc1;
import p000.eh0;
import p000.hp0;
import p000.hw1;
import p000.jd0;
import p000.ur0;
import p000.uy1;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class IoctlHelper {
    private static final String TAG = "IoctlHelper";
    public static final IoctlHelper INSTANCE = new IoctlHelper();
    private static final ur0 sistemaIo$delegate = new uy1(new C1348qx(7));
    private static final ur0 invocador$delegate = new uy1(new C1348qx(8));

    private IoctlHelper() {
    }

    private final Method achar(List<Method> list, Class<?>... clsArr) {
        Object next;
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Arrays.equals(((Method) next).getParameterTypes(), clsArr));
        Method method = (Method) next;
        if (method == null) {
            return null;
        }
        method.setAccessible(true);
        return method;
    }

    private final bc1 acharPorReferencia(List<Method> list) {
        Iterator<Method> it = list.iterator();
        while (it.hasNext()) {
            Method next = it.next();
            Class<?>[] parameterTypes = next.getParameterTypes();
            if (parameterTypes.length == 3 && hp0.m3214e(parameterTypes[0], FileDescriptor.class)) {
                Class<?> cls = parameterTypes[1];
                Class cls2 = Integer.TYPE;
                if (hp0.m3214e(cls, cls2) && !parameterTypes[2].isPrimitive()) {
                    try {
                        Constructor<?> constructor = parameterTypes[2].getConstructor(cls2);
                        next.setAccessible(true);
                        return new bc1(next, constructor);
                    } catch (Throwable unused) {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    private final eh0 descobrir() {
        final Object sistemaIo = getSistemaIo();
        if (sistemaIo == null) {
            return null;
        }
        Method[] methods = sistemaIo.getClass().getMethods();
        methods.getClass();
        ArrayList arrayList = new ArrayList();
        final int i = 0;
        for (Method method : methods) {
            String name = method.getName();
            name.getClass();
            if (hw1.m3309D0(name, "ioctl", false)) {
                arrayList.add(method);
            }
        }
        AbstractC1377rp.m5873t0(arrayList, null, null, null, new C1284p6(9), 31);
        bc1 bc1VarAcharPorReferencia = acharPorReferencia(arrayList);
        if (bc1VarAcharPorReferencia != null) {
            Method method2 = (Method) bc1VarAcharPorReferencia.f1292a;
            Constructor constructor = (Constructor) bc1VarAcharPorReferencia.f1293b;
            constructor.getDeclaringClass().getClass();
            return new C1110mj(method2, sistemaIo, constructor);
        }
        Class cls = Integer.TYPE;
        cls.getClass();
        final Method methodAchar = achar(arrayList, FileDescriptor.class, cls, cls);
        if (methodAchar != null) {
            return new eh0() { // from class: sp0
                @Override // p000.eh0
                public final Object invoke(Object obj, Object obj2, Object obj3) throws IllegalAccessException, InvocationTargetException {
                    int iDescobrir$lambda$9$lambda$8;
                    int i2 = i;
                    Object obj4 = sistemaIo;
                    Method method3 = methodAchar;
                    FileDescriptor fileDescriptor = (FileDescriptor) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    int iIntValue2 = ((Integer) obj3).intValue();
                    switch (i2) {
                        case 0:
                            iDescobrir$lambda$9$lambda$8 = IoctlHelper.descobrir$lambda$9$lambda$8(method3, obj4, fileDescriptor, iIntValue, iIntValue2);
                            break;
                        default:
                            iDescobrir$lambda$9$lambda$8 = IoctlHelper.descobrir$lambda$11$lambda$10(method3, obj4, fileDescriptor, iIntValue, iIntValue2);
                            break;
                    }
                    return Integer.valueOf(iDescobrir$lambda$9$lambda$8);
                }
            };
        }
        final Method methodAchar2 = achar(arrayList, FileDescriptor.class, cls);
        if (methodAchar2 == null) {
            Log.e(TAG, "Nenhuma assinatura de ioctl utilizável neste Android");
            return null;
        }
        Log.w(TAG, "ioctl só com fd+request — soltar o grab pode não funcionar");
        final int i2 = 1;
        return new eh0() { // from class: sp0
            @Override // p000.eh0
            public final Object invoke(Object obj, Object obj2, Object obj3) throws IllegalAccessException, InvocationTargetException {
                int iDescobrir$lambda$9$lambda$8;
                int i3 = i2;
                Object obj4 = sistemaIo;
                Method method3 = methodAchar2;
                FileDescriptor fileDescriptor = (FileDescriptor) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int iIntValue2 = ((Integer) obj3).intValue();
                switch (i3) {
                    case 0:
                        iDescobrir$lambda$9$lambda$8 = IoctlHelper.descobrir$lambda$9$lambda$8(method3, obj4, fileDescriptor, iIntValue, iIntValue2);
                        break;
                    default:
                        iDescobrir$lambda$9$lambda$8 = IoctlHelper.descobrir$lambda$11$lambda$10(method3, obj4, fileDescriptor, iIntValue, iIntValue2);
                        break;
                }
                return Integer.valueOf(iDescobrir$lambda$9$lambda$8);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int descobrir$lambda$11$lambda$10(Method method, Object obj, FileDescriptor fileDescriptor, int i, int i2) throws IllegalAccessException, InvocationTargetException {
        fileDescriptor.getClass();
        Object objInvoke = method.invoke(obj, fileDescriptor, Integer.valueOf(i));
        objInvoke.getClass();
        return ((Integer) objInvoke).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence descobrir$lambda$5(Method method) {
        String name = method.getName();
        Class<?>[] parameterTypes = method.getParameterTypes();
        parameterTypes.getClass();
        return jd0.m3614l(name, AbstractC1064la.m4158s0(parameterTypes, "(", ")", new C1284p6(8), 24));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int descobrir$lambda$7$lambda$6(Method method, Object obj, Constructor constructor, FileDescriptor fileDescriptor, int i, int i2) throws IllegalAccessException, InvocationTargetException {
        fileDescriptor.getClass();
        Object objInvoke = method.invoke(obj, fileDescriptor, Integer.valueOf(i), constructor.newInstance(Integer.valueOf(i2)));
        objInvoke.getClass();
        return ((Integer) objInvoke).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int descobrir$lambda$9$lambda$8(Method method, Object obj, FileDescriptor fileDescriptor, int i, int i2) throws IllegalAccessException, InvocationTargetException {
        fileDescriptor.getClass();
        Object objInvoke = method.invoke(obj, fileDescriptor, Integer.valueOf(i), Integer.valueOf(i2));
        objInvoke.getClass();
        return ((Integer) objInvoke).intValue();
    }

    private final eh0 getInvocador() {
        return (eh0) ((uy1) invocador$delegate).m6544a();
    }

    private final Object getSistemaIo() {
        return ((uy1) sistemaIo$delegate).m6544a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final eh0 invocador_delegate$lambda$2() {
        return INSTANCE.descobrir();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object sistemaIo_delegate$lambda$1() {
        try {
            Field declaredField = Class.forName("libcore.io.Libcore").getDeclaredField("os");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Throwable th) {
            Log.w(TAG, "libcore.io.Libcore.os indisponível: " + th.getMessage());
            return null;
        }
    }

    public final boolean getSuportado() {
        return getInvocador() != null;
    }

    public final int ioctl(FileDescriptor fileDescriptor, int i, int i2) {
        fileDescriptor.getClass();
        eh0 invocador = getInvocador();
        if (invocador != null) {
            return ((Number) invocador.invoke(fileDescriptor, Integer.valueOf(i), Integer.valueOf(i2))).intValue();
        }
        C0694gy.m3079e("Nenhuma assinatura ioctlInt disponível");
        return 0;
    }
}
