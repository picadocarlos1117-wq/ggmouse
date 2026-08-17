package p000;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;

/* JADX INFO: renamed from: l9 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class C1063l9 {

    /* JADX INFO: renamed from: b */
    public static final Class[] f6265b = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: c */
    public static final int[] f6266c = {R.attr.onClick};

    /* JADX INFO: renamed from: d */
    public static final int[] f6267d = {R.attr.accessibilityHeading};

    /* JADX INFO: renamed from: e */
    public static final int[] f6268e = {R.attr.accessibilityPaneTitle};

    /* JADX INFO: renamed from: f */
    public static final int[] f6269f = {R.attr.screenReaderFocusable};

    /* JADX INFO: renamed from: g */
    public static final String[] f6270g = {"android.widget.", "android.view.", "android.webkit."};

    /* JADX INFO: renamed from: h */
    public static final zs1 f6271h = new zs1();

    /* JADX INFO: renamed from: a */
    public final Object[] f6272a = new Object[2];

    /* JADX INFO: renamed from: a */
    public C1506v6 mo1724a(Context context, AttributeSet attributeSet) {
        return new C1506v6(context, attributeSet);
    }

    /* JADX INFO: renamed from: b */
    public C1543w6 mo1725b(Context context, AttributeSet attributeSet) {
        return new C1543w6(context, attributeSet, com.sousasantoslogic.sspro.R.attr.buttonStyle);
    }

    /* JADX INFO: renamed from: c */
    public C1617y6 mo1726c(Context context, AttributeSet attributeSet) {
        return new C1617y6(context, attributeSet, com.sousasantoslogic.sspro.R.attr.checkboxStyle);
    }

    /* JADX INFO: renamed from: d */
    public C0594e8 mo1727d(Context context, AttributeSet attributeSet) {
        return new C0594e8(context, attributeSet);
    }

    /* JADX INFO: renamed from: e */
    public C0595e9 mo1728e(Context context, AttributeSet attributeSet) {
        return new C0595e9(context, attributeSet);
    }

    /* JADX INFO: renamed from: f */
    public final View m4147f(Context context, String str, String str2) {
        String strConcat;
        zs1 zs1Var = f6271h;
        Constructor constructor = (Constructor) zs1Var.getOrDefault(str, null);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    strConcat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                strConcat = str;
            }
            constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f6265b);
            zs1Var.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f6272a);
    }
}
