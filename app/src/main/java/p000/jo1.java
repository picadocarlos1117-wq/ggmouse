package p000;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jo1 implements lo1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f5480a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0674ge f5481b;

    public /* synthetic */ jo1(long j, C0674ge c0674ge) {
        this.f5480a = j;
        this.f5481b = c0674ge;
    }

    @Override // p000.lo1
    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f5480a));
        C0674ge c0674ge = this.f5481b;
        String str = c0674ge.f4155a;
        cg1 cg1Var = c0674ge.f4157c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(eg1.m2586a(cg1Var))}) < 1) {
            contentValues.put("backend_name", str);
            contentValues.put("priority", Integer.valueOf(eg1.m2586a(cg1Var)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }
}
