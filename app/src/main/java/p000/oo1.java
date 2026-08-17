package p000;

import android.database.Cursor;
import com.google.firebase.firestore.local.SQLiteOverlayMigrationManager;
import com.google.firebase.firestore.util.Consumer;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oo1 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8413a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f8414b;

    public /* synthetic */ oo1(Object obj, int i) {
        this.f8413a = i;
        this.f8414b = obj;
    }

    @Override // com.google.firebase.firestore.util.Consumer
    public final void accept(Object obj) {
        int i = this.f8413a;
        Object obj2 = this.f8414b;
        switch (i) {
            case 0:
                SQLiteOverlayMigrationManager.lambda$hasPendingOverlayMigration$2((Boolean[]) obj2, (Cursor) obj);
                break;
            default:
                SQLiteOverlayMigrationManager.lambda$getAllUserIds$1((HashSet) obj2, (Cursor) obj);
                break;
        }
    }
}
