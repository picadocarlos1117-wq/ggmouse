package p000;

import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class lt0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6507a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ot0 f6508b;

    public /* synthetic */ lt0(ot0 ot0Var, int i) {
        this.f6507a = i;
        this.f6508b = ot0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f6507a;
        ot0 ot0Var = this.f6508b;
        switch (i) {
            case 0:
                m40 m40Var = ot0Var.f8473c;
                if (m40Var != null) {
                    m40Var.setListSelectionHidden(true);
                    m40Var.requestLayout();
                }
                break;
            default:
                m40 m40Var2 = ot0Var.f8473c;
                if (m40Var2 != null) {
                    WeakHashMap weakHashMap = i72.f4849a;
                    if (v62.m6586b(m40Var2) && ot0Var.f8473c.getCount() > ot0Var.f8473c.getChildCount() && ot0Var.f8473c.getChildCount() <= ot0Var.f8483r) {
                        ot0Var.f8470E.setInputMethodMode(2);
                        ot0Var.mo3059g();
                        break;
                    }
                }
                break;
        }
    }
}
