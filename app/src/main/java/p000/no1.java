package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class no1 implements Closeable {

    /* JADX INFO: renamed from: f */
    public static final t60 f7484f = new t60("proto");

    /* JADX INFO: renamed from: a */
    public final sp1 f7485a;

    /* JADX INFO: renamed from: b */
    public final ax0 f7486b;

    /* JADX INFO: renamed from: c */
    public final ax0 f7487c;

    /* JADX INFO: renamed from: d */
    public final C1624yd f7488d;

    /* JADX INFO: renamed from: e */
    public final qh1 f7489e;

    public no1(ax0 ax0Var, ax0 ax0Var2, C1624yd c1624yd, sp1 sp1Var, qh1 qh1Var) {
        this.f7485a = sp1Var;
        this.f7486b = ax0Var;
        this.f7487c = ax0Var2;
        this.f7488d = c1624yd;
        this.f7489e = qh1Var;
    }

    /* JADX INFO: renamed from: d */
    public static Long m4574d(SQLiteDatabase sQLiteDatabase, C0674ge c0674ge) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(c0674ge.f4155a, String.valueOf(eg1.m2586a(c0674ge.f4157c))));
        byte[] bArr = c0674ge.f4156b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    /* JADX INFO: renamed from: o */
    public static String m4575o(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((C0564de) it.next()).f2904a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: renamed from: p */
    public static Object m4576p(Cursor cursor, lo1 lo1Var) {
        try {
            return lo1Var.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    /* JADX INFO: renamed from: c */
    public final SQLiteDatabase m4577c() {
        sp1 sp1Var = this.f7485a;
        Objects.requireNonNull(sp1Var);
        ax0 ax0Var = this.f7487c;
        long jM753r = ax0Var.m753r();
        while (true) {
            try {
                return sp1Var.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (ax0Var.m753r() >= ((long) this.f7488d.f12957c) + jM753r) {
                    throw new sy1("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f7485a.close();
    }

    /* JADX INFO: renamed from: e */
    public final Object m4578e(lo1 lo1Var) {
        SQLiteDatabase sQLiteDatabaseM4577c = m4577c();
        sQLiteDatabaseM4577c.beginTransaction();
        try {
            Object objApply = lo1Var.apply(sQLiteDatabaseM4577c);
            sQLiteDatabaseM4577c.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseM4577c.endTransaction();
        }
    }

    /* JADX INFO: renamed from: g */
    public final ArrayList m4579g(SQLiteDatabase sQLiteDatabase, C0674ge c0674ge, int i) {
        ArrayList arrayList = new ArrayList();
        Long lM4574d = m4574d(sQLiteDatabase, c0674ge);
        if (lM4574d == null) {
            return arrayList;
        }
        m4576p(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{lM4574d.toString()}, null, null, null, String.valueOf(i)), new g00(this, (Object) arrayList, c0674ge, 7));
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public final void m4580j(long j, rv0 rv0Var, String str) {
        m4578e(new ko1(str, rv0Var, j));
    }

    /* JADX INFO: renamed from: l */
    public final Object m4581l(ty1 ty1Var) {
        SQLiteDatabase sQLiteDatabaseM4577c = m4577c();
        ax0 ax0Var = this.f7487c;
        long jM753r = ax0Var.m753r();
        while (true) {
            try {
                sQLiteDatabaseM4577c.beginTransaction();
                try {
                    Object objMo940b = ty1Var.mo940b();
                    sQLiteDatabaseM4577c.setTransactionSuccessful();
                    return objMo940b;
                } finally {
                    sQLiteDatabaseM4577c.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (ax0Var.m753r() >= ((long) this.f7488d.f12957c) + jM753r) {
                    throw new sy1("Timed out while trying to acquire the lock.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
