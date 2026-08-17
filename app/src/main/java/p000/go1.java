package p000;

import android.database.Cursor;
import com.google.firebase.firestore.local.SQLiteDocumentOverlayCache;
import com.google.firebase.firestore.util.BackgroundQueue;
import com.google.firebase.firestore.util.Consumer;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class go1 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4249a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SQLiteDocumentOverlayCache f4250b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ BackgroundQueue f4251c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Map f4252d;

    public /* synthetic */ go1(SQLiteDocumentOverlayCache sQLiteDocumentOverlayCache, BackgroundQueue backgroundQueue, Map map, int i) {
        this.f4249a = i;
        this.f4250b = sQLiteDocumentOverlayCache;
        this.f4251c = backgroundQueue;
        this.f4252d = map;
    }

    @Override // com.google.firebase.firestore.util.Consumer
    public final void accept(Object obj) {
        int i = this.f4249a;
        Map map = this.f4252d;
        BackgroundQueue backgroundQueue = this.f4251c;
        SQLiteDocumentOverlayCache sQLiteDocumentOverlayCache = this.f4250b;
        switch (i) {
            case 0:
                sQLiteDocumentOverlayCache.lambda$getOverlays$2(backgroundQueue, (HashMap) map, (Cursor) obj);
                break;
            case 1:
                sQLiteDocumentOverlayCache.lambda$getOverlays$4(backgroundQueue, (HashMap) map, (Cursor) obj);
                break;
            default:
                sQLiteDocumentOverlayCache.lambda$processSingleCollection$1(backgroundQueue, map, (Cursor) obj);
                break;
        }
    }
}
