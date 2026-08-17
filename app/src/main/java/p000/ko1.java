package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.sun.security.x509.CRLReasonCodeExtension;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ko1 implements lo1, ty1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f5946a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f5947b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f5948c;

    public /* synthetic */ ko1(Object obj, Object obj2, long j) {
        this.f5947b = obj;
        this.f5948c = obj2;
        this.f5946a = j;
    }

    @Override // p000.lo1
    public Object apply(Object obj) {
        String str = (String) this.f5947b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i = ((rv0) this.f5948c).f10147a;
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
        try {
            boolean z = cursorRawQuery.getCount() > 0;
            cursorRawQuery.close();
            long j = this.f5946a;
            if (z) {
                sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put(CRLReasonCodeExtension.REASON, Integer.valueOf(i));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    @Override // p000.ty1
    /* JADX INFO: renamed from: b */
    public Object mo940b() {
        p42 p42Var = (p42) this.f5947b;
        C0674ge c0674ge = (C0674ge) this.f5948c;
        no1 no1Var = p42Var.f8718c;
        long jM753r = p42Var.f8722g.m753r() + this.f5946a;
        no1Var.getClass();
        no1Var.m4578e(new jo1(jM753r, c0674ge));
        return null;
    }
}
