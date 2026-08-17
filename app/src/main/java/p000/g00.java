package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.firestore.local.LocalStore;
import com.google.firebase.firestore.local.TargetData;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.remote.FirestoreChannel;
import com.google.firebase.firestore.remote.RemoteEvent;
import com.google.firebase.firestore.util.Supplier;
import com.google.firebase.functions.FirebaseContextProvider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g00 implements ty1, SuccessContinuation, OnCompleteListener, Supplier, lo1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3934a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3935b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f3936c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f3937d;

    public /* synthetic */ g00(no1 no1Var, Object obj, C0674ge c0674ge, int i) {
        this.f3934a = i;
        this.f3935b = no1Var;
        this.f3937d = obj;
        this.f3936c = c0674ge;
    }

    @Override // p000.lo1
    public Object apply(Object obj) throws Throwable {
        long jInsert;
        Cursor cursor;
        no1 no1Var;
        rv0 rv0Var;
        int i = this.f3934a;
        int i2 = 6;
        int i3 = 5;
        int i4 = 4;
        int i5 = 3;
        rv0 rv0Var2 = rv0.CACHE_FULL;
        int i6 = 2;
        int i7 = 1;
        Object obj2 = this.f3937d;
        Object obj3 = this.f3936c;
        Object obj4 = this.f3935b;
        int i8 = 0;
        switch (i) {
            case 6:
                no1 no1Var2 = (no1) obj4;
                C1587xd c1587xd = (C1587xd) obj2;
                s60 s60Var = c1587xd.f12578c;
                String str = c1587xd.f12576a;
                C0674ge c0674ge = (C0674ge) obj3;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                long jSimpleQueryForLong = no1Var2.m4577c().compileStatement("PRAGMA page_size").simpleQueryForLong() * no1Var2.m4577c().compileStatement("PRAGMA page_count").simpleQueryForLong();
                C1624yd c1624yd = no1Var2.f7488d;
                if (jSimpleQueryForLong >= c1624yd.f12955a) {
                    no1Var2.m4580j(1L, rv0Var2, str);
                    return -1L;
                }
                Long lM4574d = no1.m4574d(sQLiteDatabase, c0674ge);
                if (lM4574d != null) {
                    jInsert = lM4574d.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", c0674ge.f4155a);
                    contentValues.put("priority", Integer.valueOf(eg1.m2586a(c0674ge.f4157c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = c0674ge.f4156b;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int i9 = c1624yd.f12959e;
                byte[] bArr2 = s60Var.f10249b;
                boolean z = bArr2.length <= i9;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", str);
                contentValues2.put("timestamp_ms", Long.valueOf(c1587xd.f12579d));
                contentValues2.put("uptime_ms", Long.valueOf(c1587xd.f12580e));
                contentValues2.put("payload_encoding", s60Var.f10248a.f10767a);
                contentValues2.put("code", c1587xd.f12577b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z));
                contentValues2.put("payload", z ? bArr2 : new byte[0]);
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z) {
                    int iCeil = (int) Math.ceil(((double) bArr2.length) / ((double) i9));
                    for (int i10 = 1; i10 <= iCeil; i10++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, (i10 - 1) * i9, Math.min(i10 * i9, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i10));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(c1587xd.f12581f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put(AppMeasurementSdk.ConditionalUserProperty.NAME, (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            case 7:
                no1 no1Var3 = (no1) obj4;
                ArrayList arrayList = (ArrayList) obj2;
                C0674ge c0674ge2 = (C0674ge) obj3;
                Cursor cursor2 = (Cursor) obj;
                while (cursor2.moveToNext()) {
                    long j = cursor2.getLong(0);
                    int i11 = cursor2.getInt(7) != 0 ? i7 : 0;
                    C1470u7 c1470u7 = new C1470u7();
                    c1470u7.f11146f = new HashMap();
                    String string = cursor2.getString(i7);
                    if (string == null) {
                        l41.m4051t("Null transportName");
                        return null;
                    }
                    c1470u7.f11141a = string;
                    c1470u7.f11144d = Long.valueOf(cursor2.getLong(i6));
                    c1470u7.f11145e = Long.valueOf(cursor2.getLong(3));
                    if (i11 != 0) {
                        String string2 = cursor2.getString(4);
                        c1470u7.f11143c = new s60(string2 == null ? no1.f7484f : new t60(string2), cursor2.getBlob(5));
                        no1Var = no1Var3;
                    } else {
                        String string3 = cursor2.getString(4);
                        t60 t60Var = string3 == null ? no1.f7484f : new t60(string3);
                        Cursor cursorQuery = no1Var3.m4577c().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            int length = 0;
                            while (cursorQuery.moveToNext()) {
                                byte[] blob = cursorQuery.getBlob(0);
                                arrayList2.add(blob);
                                length += blob.length;
                            }
                            byte[] bArr3 = new byte[length];
                            int i12 = 0;
                            int length2 = 0;
                            while (i12 < arrayList2.size()) {
                                byte[] bArr4 = (byte[]) arrayList2.get(i12);
                                no1 no1Var4 = no1Var3;
                                cursor = cursorQuery;
                                try {
                                    System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
                                    length2 += bArr4.length;
                                    i12++;
                                    cursorQuery = cursor;
                                    no1Var3 = no1Var4;
                                } catch (Throwable th) {
                                    th = th;
                                    cursor.close();
                                    throw th;
                                }
                            }
                            no1Var = no1Var3;
                            cursorQuery.close();
                            c1470u7.f11143c = new s60(t60Var, bArr3);
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = cursorQuery;
                        }
                    }
                    if (!cursor2.isNull(6)) {
                        c1470u7.f11142b = Integer.valueOf(cursor2.getInt(6));
                    }
                    arrayList.add(new C0564de(j, c0674ge2, c1470u7.m6401d()));
                    no1Var3 = no1Var;
                    i6 = 2;
                    i7 = 1;
                }
                return null;
            default:
                no1 no1Var5 = (no1) obj4;
                HashMap map = (HashMap) obj3;
                C0599ed c0599ed = (C0599ed) obj2;
                ArrayList arrayList3 = (ArrayList) c0599ed.f3314b;
                Cursor cursor3 = (Cursor) obj;
                no1Var5.getClass();
                while (cursor3.moveToNext()) {
                    String string4 = cursor3.getString(i8);
                    int i13 = cursor3.getInt(1);
                    rv0 rv0Var3 = rv0.REASON_UNKNOWN;
                    if (i13 != 0) {
                        if (i13 == 1) {
                            rv0Var3 = rv0.MESSAGE_TOO_OLD;
                        } else if (i13 == 2) {
                            rv0Var = rv0Var2;
                        } else if (i13 == i5) {
                            rv0Var3 = rv0.PAYLOAD_TOO_BIG;
                        } else if (i13 == i4) {
                            rv0Var3 = rv0.MAX_RETRIES_REACHED;
                        } else if (i13 == i3) {
                            rv0Var3 = rv0.INVALID_PAYLOD;
                        } else if (i13 == i2) {
                            rv0Var3 = rv0.SERVER_ERROR;
                        } else {
                            hr1.m3272h("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i13));
                        }
                        rv0Var = rv0Var3;
                    } else {
                        rv0Var = rv0Var3;
                    }
                    long j2 = cursor3.getLong(2);
                    if (!map.containsKey(string4)) {
                        map.put(string4, new ArrayList());
                    }
                    ((List) map.get(string4)).add(new sv0(j2, rv0Var));
                    i2 = 6;
                    i3 = 5;
                    i4 = 4;
                    i5 = 3;
                    i8 = 0;
                }
                for (Map.Entry entry2 : map.entrySet()) {
                    int i14 = vv0.f11780c;
                    new ArrayList();
                    arrayList3.add(new vv0((String) entry2.getKey(), Collections.unmodifiableList((List) entry2.getValue())));
                }
                long jM753r = no1Var5.f7486b.m753r();
                SQLiteDatabase sQLiteDatabaseM4577c = no1Var5.m4577c();
                sQLiteDatabaseM4577c.beginTransaction();
                try {
                    Cursor cursorRawQuery = sQLiteDatabaseM4577c.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                    try {
                        cursorRawQuery.moveToNext();
                        p02 p02Var = new p02(cursorRawQuery.getLong(0), jM753r);
                        cursorRawQuery.close();
                        sQLiteDatabaseM4577c.setTransactionSuccessful();
                        sQLiteDatabaseM4577c.endTransaction();
                        c0599ed.f3313a = p02Var;
                        c0599ed.f3315c = new li0(new tv1(no1Var5.m4577c().compileStatement("PRAGMA page_size").simpleQueryForLong() * no1Var5.m4577c().compileStatement("PRAGMA page_count").simpleQueryForLong(), C1624yd.f12954f.f12955a));
                        c0599ed.f3316d = (String) no1Var5.f7489e.get();
                        return new C1302po((p02) c0599ed.f3313a, Collections.unmodifiableList(arrayList3), (li0) c0599ed.f3315c, (String) c0599ed.f3316d);
                    } catch (Throwable th3) {
                        cursorRawQuery.close();
                        throw th3;
                    }
                } catch (Throwable th4) {
                    sQLiteDatabaseM4577c.endTransaction();
                    throw th4;
                }
        }
    }

    @Override // p000.ty1
    /* JADX INFO: renamed from: b */
    public Object mo940b() {
        h00 h00Var = (h00) this.f3935b;
        C0674ge c0674ge = (C0674ge) this.f3936c;
        C1587xd c1587xd = (C1587xd) this.f3937d;
        no1 no1Var = h00Var.f4372d;
        no1Var.getClass();
        cg1 cg1Var = c0674ge.f4157c;
        if (Log.isLoggable("TRuntime.".concat("SQLiteEventStore"), 3)) {
            new StringBuilder("Storing event with priority=").append(cg1Var);
        }
        ((Long) no1Var.m4578e(new g00(no1Var, (Object) c1587xd, c0674ge, 6))).getClass();
        h00Var.f4369a.m4755X(c0674ge, 1, false);
        return null;
    }

    @Override // com.google.firebase.firestore.util.Supplier
    public Object get() {
        int i = this.f3934a;
        Object obj = this.f3937d;
        Object obj2 = this.f3936c;
        LocalStore localStore = (LocalStore) this.f3935b;
        switch (i) {
            case 4:
                return localStore.lambda$applyRemoteEvent$6((RemoteEvent) obj2, (SnapshotVersion) obj);
            default:
                return localStore.lambda$applyBundledDocuments$11((ImmutableSortedMap) obj2, (TargetData) obj);
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        int i = this.f3934a;
        Object obj = this.f3937d;
        Object obj2 = this.f3936c;
        FirestoreChannel firestoreChannel = (FirestoreChannel) this.f3935b;
        switch (i) {
            case 2:
                firestoreChannel.lambda$runRpc$2((TaskCompletionSource) obj2, obj, task);
                break;
            default:
                firestoreChannel.lambda$runStreamingResponseRpc$1((FirestoreChannel.StreamingListener) obj2, obj, task);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return FirebaseContextProvider.getContext$lambda$2((Task) this.f3935b, (FirebaseContextProvider) this.f3936c, (Task) this.f3937d, (Void) obj);
    }

    public /* synthetic */ g00(Object obj, Object obj2, Object obj3, int i) {
        this.f3934a = i;
        this.f3935b = obj;
        this.f3936c = obj2;
        this.f3937d = obj3;
    }
}
