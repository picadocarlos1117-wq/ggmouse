package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: e7 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0593e7 {

    /* JADX INFO: renamed from: a */
    public static final ExecutorC1361r9 f3225a = new ExecutorC1361r9(new ExecutorC1398s9());

    /* JADX INFO: renamed from: b */
    public static final int f3226b = -100;

    /* JADX INFO: renamed from: c */
    public static ov0 f3227c = null;

    /* JADX INFO: renamed from: d */
    public static ov0 f3228d = null;

    /* JADX INFO: renamed from: e */
    public static Boolean f3229e = null;

    /* JADX INFO: renamed from: f */
    public static boolean f3230f = false;

    /* JADX INFO: renamed from: g */
    public static final C0707ha f3231g = new C0707ha(0);

    /* JADX INFO: renamed from: m */
    public static final Object f3232m = new Object();

    /* JADX INFO: renamed from: n */
    public static final Object f3233n = new Object();

    /* JADX INFO: renamed from: b */
    public static boolean m2534b(Context context) {
        if (f3229e == null) {
            try {
                int i = AbstractServiceC1324q9.f9445a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AbstractServiceC1324q9.class), AbstractC1287p9.m5231a() | 128).metaData;
                if (bundle != null) {
                    f3229e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                f3229e = Boolean.FALSE;
            }
        }
        return f3229e.booleanValue();
    }

    /* JADX INFO: renamed from: f */
    public static void m2535f(LayoutInflaterFactory2C1359r7 layoutInflaterFactory2C1359r7) {
        synchronized (f3232m) {
            try {
                C0707ha c0707ha = f3231g;
                c0707ha.getClass();
                C0128ca c0128ca = new C0128ca(c0707ha);
                while (c0128ca.hasNext()) {
                    AbstractC0593e7 abstractC0593e7 = (AbstractC0593e7) ((WeakReference) c0128ca.next()).get();
                    if (abstractC0593e7 == layoutInflaterFactory2C1359r7 || abstractC0593e7 == null) {
                        c0128ca.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo2536a();

    /* JADX INFO: renamed from: c */
    public abstract void mo2537c();

    /* JADX INFO: renamed from: e */
    public abstract void mo2538e();

    /* JADX INFO: renamed from: g */
    public abstract boolean mo2539g(int i);

    /* JADX INFO: renamed from: h */
    public abstract void mo2540h(int i);

    /* JADX INFO: renamed from: i */
    public abstract void mo2541i(View view);

    /* JADX INFO: renamed from: k */
    public abstract void mo2542k(View view, ViewGroup.LayoutParams layoutParams);

    /* JADX INFO: renamed from: l */
    public abstract void mo2543l(CharSequence charSequence);

    /* JADX INFO: renamed from: m */
    public abstract AbstractC0086b4 mo2544m(InterfaceC0005a4 interfaceC0005a4);
}
