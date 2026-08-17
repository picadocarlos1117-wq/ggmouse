package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class x10 implements vq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12409a;

    /* JADX INFO: renamed from: b */
    public final Object f12410b;

    /* JADX INFO: renamed from: c */
    public final Object f12411c;

    public x10(CharSequence charSequence, ch0 ch0Var) {
        this.f12409a = 0;
        charSequence.getClass();
        this.f12410b = charSequence;
        this.f12411c = ch0Var;
    }

    @Override // p000.vq1
    public final Iterator iterator() {
        switch (this.f12409a) {
            case 0:
                return new w10(this);
            case 1:
                vq1 vq1Var = (vq1) this.f12410b;
                ArrayList arrayList = new ArrayList();
                Iterator it = vq1Var.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
                Comparator comparator = (Comparator) this.f12411c;
                if (arrayList.size() > 1) {
                    Collections.sort(arrayList, comparator);
                }
                return arrayList.iterator();
            default:
                return new wm1(this);
        }
    }

    public /* synthetic */ x10(vq1 vq1Var, Object obj, int i) {
        this.f12409a = i;
        this.f12410b = vq1Var;
        this.f12411c = obj;
    }
}
