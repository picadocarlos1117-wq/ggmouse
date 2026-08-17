package p000;

import android.view.ViewGroup;
import com.sousasantoslogic.sspro.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x22 {

    /* JADX INFO: renamed from: a */
    public static final C1328qd f12433a;

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal f12434b;

    /* JADX INFO: renamed from: c */
    public static final ArrayList f12435c;

    static {
        C1328qd c1328qd = new C1328qd();
        c1328qd.f12813D = false;
        c1328qd.m6996I(new e90(2));
        c1328qd.m6996I(new C1300pm());
        c1328qd.m6996I(new e90(1));
        f12433a = c1328qd;
        f12434b = new ThreadLocal();
        f12435c = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public static void m6862a(ViewGroup viewGroup, t22 t22Var) {
        ArrayList arrayList = f12435c;
        if (arrayList.contains(viewGroup)) {
            return;
        }
        WeakHashMap weakHashMap = i72.f4849a;
        if (v62.m6587c(viewGroup)) {
            arrayList.add(viewGroup);
            if (t22Var == null) {
                t22Var = f12433a;
            }
            t22 t22VarClone = t22Var.clone();
            ArrayList arrayList2 = (ArrayList) m6863b().getOrDefault(viewGroup, null);
            if (arrayList2 != null && arrayList2.size() > 0) {
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    ((t22) obj).mo6217v(viewGroup);
                }
            }
            if (t22VarClone != null) {
                t22VarClone.m6209h(viewGroup, true);
            }
            if (viewGroup.getTag(R.id.transition_current_scene) != null) {
                l41.m4035b();
                return;
            }
            viewGroup.setTag(R.id.transition_current_scene, null);
            if (t22VarClone != null) {
                w22 w22Var = new w22();
                w22Var.f11935a = t22VarClone;
                w22Var.f11936b = viewGroup;
                viewGroup.addOnAttachStateChangeListener(w22Var);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(w22Var);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static C0633fa m6863b() {
        C0633fa c0633fa;
        ThreadLocal threadLocal = f12434b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (c0633fa = (C0633fa) weakReference.get()) != null) {
            return c0633fa;
        }
        C0633fa c0633fa2 = new C0633fa();
        threadLocal.set(new WeakReference(c0633fa2));
        return c0633fa2;
    }
}
