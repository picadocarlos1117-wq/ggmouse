package p000;

import android.view.View;
import com.sousasantoslogic.sspro.R;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c72 {
    /* JADX INFO: renamed from: a */
    public static void m1149a(View view, h72 h72Var) {
        zs1 zs1Var = (zs1) view.getTag(R.id.tag_unhandled_key_listeners);
        if (zs1Var == null) {
            zs1Var = new zs1();
            view.setTag(R.id.tag_unhandled_key_listeners, zs1Var);
        }
        Objects.requireNonNull(h72Var);
        View.OnUnhandledKeyEventListener b72Var = new b72();
        zs1Var.put(h72Var, b72Var);
        view.addOnUnhandledKeyEventListener(b72Var);
    }

    /* JADX INFO: renamed from: b */
    public static CharSequence m1150b(View view) {
        return view.getAccessibilityPaneTitle();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m1151c(View view) {
        return view.isAccessibilityHeading();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m1152d(View view) {
        return view.isScreenReaderFocusable();
    }

    /* JADX INFO: renamed from: e */
    public static void m1153e(View view, h72 h72Var) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        zs1 zs1Var = (zs1) view.getTag(R.id.tag_unhandled_key_listeners);
        if (zs1Var == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) zs1Var.getOrDefault(h72Var, null)) == null) {
            return;
        }
        view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    /* JADX INFO: renamed from: f */
    public static <T> T m1154f(View view, int i) {
        return (T) view.requireViewById(i);
    }

    /* JADX INFO: renamed from: g */
    public static void m1155g(View view, boolean z) {
        view.setAccessibilityHeading(z);
    }

    /* JADX INFO: renamed from: h */
    public static void m1156h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    /* JADX INFO: renamed from: i */
    public static void m1157i(View view, boolean z) {
        view.setScreenReaderFocusable(z);
    }
}
