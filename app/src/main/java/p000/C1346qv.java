package p000;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;

/* JADX INFO: renamed from: qv */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1346qv extends ContentObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ cy1 f9587a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1346qv(cy1 cy1Var) {
        super(new Handler());
        this.f9587a = cy1Var;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return true;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        Cursor cursor;
        cy1 cy1Var = this.f9587a;
        if (!cy1Var.f10557b || (cursor = cy1Var.f10558c) == null || cursor.isClosed()) {
            return;
        }
        cy1Var.f10556a = cy1Var.f10558c.requery();
    }
}
