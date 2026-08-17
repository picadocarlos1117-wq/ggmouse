package p000;

import android.view.View;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a72 {
    /* JADX INFO: renamed from: a */
    public static void m97a(View view, Collection<View> collection, int i) {
        view.addKeyboardNavigationClusters(collection, i);
    }

    /* JADX INFO: renamed from: b */
    public static int m98b(View view) {
        return view.getImportantForAutofill();
    }

    /* JADX INFO: renamed from: c */
    public static int m99c(View view) {
        return view.getNextClusterForwardId();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m100d(View view) {
        return view.hasExplicitFocusable();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m101e(View view) {
        return view.isFocusedByDefault();
    }

    /* JADX INFO: renamed from: f */
    public static boolean m102f(View view) {
        return view.isImportantForAutofill();
    }

    /* JADX INFO: renamed from: g */
    public static boolean m103g(View view) {
        return view.isKeyboardNavigationCluster();
    }

    /* JADX INFO: renamed from: h */
    public static View m104h(View view, View view2, int i) {
        return view.keyboardNavigationClusterSearch(view2, i);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m105i(View view) {
        return view.restoreDefaultFocus();
    }

    /* JADX INFO: renamed from: j */
    public static void m106j(View view, String... strArr) {
        view.setAutofillHints(strArr);
    }

    /* JADX INFO: renamed from: k */
    public static void m107k(View view, boolean z) {
        view.setFocusedByDefault(z);
    }

    /* JADX INFO: renamed from: l */
    public static void m108l(View view, int i) {
        view.setImportantForAutofill(i);
    }

    /* JADX INFO: renamed from: m */
    public static void m109m(View view, boolean z) {
        view.setKeyboardNavigationCluster(z);
    }

    /* JADX INFO: renamed from: n */
    public static void m110n(View view, int i) {
        view.setNextClusterForwardId(i);
    }

    /* JADX INFO: renamed from: o */
    public static void m111o(View view, CharSequence charSequence) {
        view.setTooltipText(charSequence);
    }
}
