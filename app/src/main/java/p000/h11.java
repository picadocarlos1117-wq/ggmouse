package p000;

import com.google.firebase.firestore.core.DocumentViewChange;
import com.google.firebase.firestore.core.View;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h11 implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4389a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f4390b;

    public /* synthetic */ h11(Object obj, int i) {
        this.f4389a = i;
        this.f4390b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.f4389a;
        Object obj3 = this.f4390b;
        switch (i) {
            case 0:
                l11 l11Var = (l11) obj3;
                return l11Var.mo1189b(obj2) - l11Var.mo1189b(obj);
            default:
                return ((View) obj3).lambda$applyChanges$0((DocumentViewChange) obj, (DocumentViewChange) obj2);
        }
    }
}
