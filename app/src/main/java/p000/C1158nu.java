package p000;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: nu */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1158nu implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7536a;

    public /* synthetic */ C1158nu(int i) {
        this.f7536a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i;
        int top;
        int top2;
        switch (this.f7536a) {
            case 0:
                WeakHashMap weakHashMap = i72.f4849a;
                float fM7012m = y62.m7012m((View) obj);
                float fM7012m2 = y62.m7012m((View) obj2);
                if (fM7012m > fM7012m2) {
                    return -1;
                }
                return fM7012m < fM7012m2 ? 1 : 0;
            case 1:
                wh0 wh0Var = (wh0) obj;
                wh0 wh0Var2 = (wh0) obj2;
                RecyclerView recyclerView = wh0Var.f12183d;
                if ((recyclerView == null) == (wh0Var2.f12183d == null)) {
                    boolean z = wh0Var.f12180a;
                    if (z == wh0Var2.f12180a) {
                        int i2 = wh0Var2.f12181b - wh0Var.f12181b;
                        if (i2 != 0) {
                            return i2;
                        }
                        int i3 = wh0Var.f12182c - wh0Var2.f12182c;
                        if (i3 != 0) {
                            return i3;
                        }
                        return 0;
                    }
                    if (!z) {
                        return 1;
                    }
                } else if (recyclerView == null) {
                    return 1;
                }
                return -1;
            case 2:
                sx0 sx0Var = (sx0) obj2;
                ((t91) ((sx0) obj)).getClass();
                int i4 = 3;
                try {
                    Class.forName("android.app.Application", false, t91.class.getClassLoader());
                    i = 8;
                } catch (Exception unused) {
                    i = 3;
                }
                ((t91) sx0Var).getClass();
                try {
                    Class.forName("android.app.Application", false, t91.class.getClassLoader());
                    i4 = 8;
                } catch (Exception unused2) {
                }
                return i - i4;
            case 3:
                top = ((au1) obj).f1056b;
                top2 = ((au1) obj2).f1056b;
                break;
            default:
                top = ((View) obj).getTop();
                top2 = ((View) obj2).getTop();
                break;
        }
        return top - top2;
    }
}
