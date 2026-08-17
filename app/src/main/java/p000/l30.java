package p000;

import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentSet;
import com.google.firebase.firestore.util.Util;
import java.util.Comparator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l30 implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6160a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Comparator f6161b;

    public /* synthetic */ l30(Comparator comparator, int i) {
        this.f6160a = i;
        this.f6161b = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f6160a) {
            case 0:
                return DocumentSet.lambda$emptySet$0(this.f6161b, (Document) obj, (Document) obj2);
            default:
                return Util.lambda$firstNEntries$4(this.f6161b, (Map.Entry) obj, (Map.Entry) obj2);
        }
    }
}
