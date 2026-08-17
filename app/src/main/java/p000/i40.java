package p000;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i40 {

    /* JADX INFO: renamed from: a */
    public static final Method f4813a;

    /* JADX INFO: renamed from: b */
    public static final Method f4814b;

    /* JADX INFO: renamed from: c */
    public static final Method f4815c;

    /* JADX INFO: renamed from: d */
    public static final boolean f4816d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Class cls3 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
            f4813a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f4814b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f4815c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f4816d = true;
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
