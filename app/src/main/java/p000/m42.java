package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m42 implements ty1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6638a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ no1 f6639b;

    public /* synthetic */ m42(no1 no1Var, int i) {
        this.f6638a = i;
        this.f6639b = no1Var;
    }

    @Override // p000.ty1
    /* JADX INFO: renamed from: b */
    public final Object mo940b() {
        int i = this.f6638a;
        no1 no1Var = this.f6639b;
        switch (i) {
            case 0:
                no1Var.getClass();
                int i2 = C1302po.f8969e;
                C0599ed c0599ed = new C0599ed();
                c0599ed.f3313a = null;
                c0599ed.f3314b = new ArrayList();
                c0599ed.f3315c = null;
                c0599ed.f3316d = "";
                HashMap map = new HashMap();
                SQLiteDatabase sQLiteDatabaseM4577c = no1Var.m4577c();
                sQLiteDatabaseM4577c.beginTransaction();
                try {
                    C1302po c1302po = (C1302po) no1.m4576p(sQLiteDatabaseM4577c.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new g00(no1Var, map, c0599ed, 8));
                    sQLiteDatabaseM4577c.setTransactionSuccessful();
                    return c1302po;
                } finally {
                    sQLiteDatabaseM4577c.endTransaction();
                }
            default:
                long jM753r = no1Var.f7486b.m753r() - no1Var.f7488d.f12958d;
                SQLiteDatabase sQLiteDatabaseM4577c2 = no1Var.m4577c();
                sQLiteDatabaseM4577c2.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(jM753r)};
                    Cursor cursorRawQuery = sQLiteDatabaseM4577c2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (cursorRawQuery.moveToNext()) {
                        try {
                            no1Var.m4580j(cursorRawQuery.getInt(0), rv0.MESSAGE_TOO_OLD, cursorRawQuery.getString(1));
                        } catch (Throwable th) {
                            cursorRawQuery.close();
                            throw th;
                        }
                    }
                    cursorRawQuery.close();
                    int iDelete = sQLiteDatabaseM4577c2.delete("events", "timestamp_ms < ?", strArr);
                    sQLiteDatabaseM4577c2.setTransactionSuccessful();
                    sQLiteDatabaseM4577c2.endTransaction();
                    return Integer.valueOf(iDelete);
                } catch (Throwable th2) {
                    sQLiteDatabaseM4577c2.endTransaction();
                    throw th2;
                }
        }
    }
}
