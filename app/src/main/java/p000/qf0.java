package p000;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qf0 {

    /* JADX INFO: renamed from: a */
    public static final vf0 f9494a = new vf0();

    /* JADX INFO: renamed from: b */
    public static final xf0 f9495b;

    static {
        xf0 xf0Var = null;
        try {
            xf0Var = (xf0) bg0.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f9495b = xf0Var;
    }

    /* JADX INFO: renamed from: a */
    public static void m5487a(int i, ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((View) arrayList.get(size)).setVisibility(i);
        }
    }
}
