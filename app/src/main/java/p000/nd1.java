package p000;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class nd1 implements InvocationHandler {

    /* JADX INFO: renamed from: a */
    public final ArrayList f7381a;

    /* JADX INFO: renamed from: b */
    public boolean f7382b;

    /* JADX INFO: renamed from: c */
    public String f7383c;

    public nd1(ArrayList arrayList) {
        this.f7381a = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (objArr == null) {
            objArr = y42.f12842a;
        }
        if (name.equals("supports") && Boolean.TYPE == returnType) {
            return Boolean.TRUE;
        }
        if (name.equals("unsupported") && Void.TYPE == returnType) {
            this.f7382b = true;
            return null;
        }
        boolean zEquals = name.equals("protocols");
        ArrayList arrayList = this.f7381a;
        if (zEquals && objArr.length == 0) {
            return arrayList;
        }
        if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                List list = (List) obj2;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    if (arrayList.contains(list.get(i))) {
                        String str = (String) list.get(i);
                        this.f7383c = str;
                        return str;
                    }
                }
                String str2 = (String) arrayList.get(0);
                this.f7383c = str2;
                return str2;
            }
        }
        if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
            return method.invoke(this, objArr);
        }
        this.f7383c = (String) objArr[0];
        return null;
    }
}
