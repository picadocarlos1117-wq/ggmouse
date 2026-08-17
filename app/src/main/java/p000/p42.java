package p000;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class p42 {

    /* JADX INFO: renamed from: a */
    public final Context f8716a;

    /* JADX INFO: renamed from: b */
    public final m51 f8717b;

    /* JADX INFO: renamed from: c */
    public final no1 f8718c;

    /* JADX INFO: renamed from: d */
    public final C1174o9 f8719d;

    /* JADX INFO: renamed from: e */
    public final Executor f8720e;

    /* JADX INFO: renamed from: f */
    public final no1 f8721f;

    /* JADX INFO: renamed from: g */
    public final ax0 f8722g;

    /* JADX INFO: renamed from: h */
    public final ax0 f8723h;

    /* JADX INFO: renamed from: i */
    public final no1 f8724i;

    public p42(Context context, m51 m51Var, no1 no1Var, C1174o9 c1174o9, Executor executor, no1 no1Var2, ax0 ax0Var, ax0 ax0Var2, no1 no1Var3) {
        this.f8716a = context;
        this.f8717b = m51Var;
        this.f8718c = no1Var;
        this.f8719d = c1174o9;
        this.f8720e = executor;
        this.f8721f = no1Var2;
        this.f8722g = ax0Var;
        this.f8723h = ax0Var2;
        this.f8724i = no1Var3;
    }

    /* JADX INFO: renamed from: a */
    public final void m5202a(final C0674ge c0674ge, int i) {
        byte[] bArr;
        long j;
        C1402sd c1402sd;
        String str;
        C1402sd c1402sd2;
        int i2;
        C1583x9 c1583x9M6642d;
        Integer numValueOf;
        String str2;
        b50 b50Var;
        final p42 p42Var = this;
        final C0674ge c0674ge2 = c0674ge;
        byte[] bArr2 = c0674ge2.f4156b;
        b32 b32VarM4384a = p42Var.f8717b.m4384a(c0674ge2.f4155a);
        long jMax = 0;
        while (true) {
            final int i3 = 0;
            ty1 ty1Var = new ty1(p42Var) { // from class: n42

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ p42 f7214b;

                {
                    this.f7214b = p42Var;
                }

                @Override // p000.ty1
                /* JADX INFO: renamed from: b */
                public final Object mo940b() {
                    Boolean bool;
                    int i4 = i3;
                    C0674ge c0674ge3 = c0674ge2;
                    p42 p42Var2 = this.f7214b;
                    switch (i4) {
                        case 0:
                            no1 no1Var = p42Var2.f8718c;
                            SQLiteDatabase sQLiteDatabaseM4577c = no1Var.m4577c();
                            sQLiteDatabaseM4577c.beginTransaction();
                            try {
                                Long lM4574d = no1.m4574d(sQLiteDatabaseM4577c, c0674ge3);
                                if (lM4574d == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = no1Var.m4577c().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lM4574d.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th) {
                                        cursorRawQuery.close();
                                        throw th;
                                    }
                                }
                                sQLiteDatabaseM4577c.setTransactionSuccessful();
                                sQLiteDatabaseM4577c.endTransaction();
                                return bool;
                            } catch (Throwable th2) {
                                sQLiteDatabaseM4577c.endTransaction();
                                throw th2;
                            }
                        default:
                            no1 no1Var2 = p42Var2.f8718c;
                            no1Var2.getClass();
                            return (Iterable) no1Var2.m4578e(new C0702h5(12, no1Var2, c0674ge3));
                    }
                }
            };
            no1 no1Var = p42Var.f8721f;
            if (!((Boolean) no1Var.m4581l(ty1Var)).booleanValue()) {
                no1Var.m4581l(new ko1(p42Var, c0674ge2, jMax));
                return;
            }
            final int i4 = 1;
            final Iterable iterable = (Iterable) no1Var.m4581l(new ty1(p42Var) { // from class: n42

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ p42 f7214b;

                {
                    this.f7214b = p42Var;
                }

                @Override // p000.ty1
                /* JADX INFO: renamed from: b */
                public final Object mo940b() {
                    Boolean bool;
                    int i5 = i4;
                    C0674ge c0674ge3 = c0674ge2;
                    p42 p42Var2 = this.f7214b;
                    switch (i5) {
                        case 0:
                            no1 no1Var2 = p42Var2.f8718c;
                            SQLiteDatabase sQLiteDatabaseM4577c = no1Var2.m4577c();
                            sQLiteDatabaseM4577c.beginTransaction();
                            try {
                                Long lM4574d = no1.m4574d(sQLiteDatabaseM4577c, c0674ge3);
                                if (lM4574d == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = no1Var2.m4577c().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lM4574d.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th) {
                                        cursorRawQuery.close();
                                        throw th;
                                    }
                                }
                                sQLiteDatabaseM4577c.setTransactionSuccessful();
                                sQLiteDatabaseM4577c.endTransaction();
                                return bool;
                            } catch (Throwable th2) {
                                sQLiteDatabaseM4577c.endTransaction();
                                throw th2;
                            }
                        default:
                            no1 no1Var3 = p42Var2.f8718c;
                            no1Var3.getClass();
                            return (Iterable) no1Var3.m4578e(new C0702h5(12, no1Var3, c0674ge3));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (b32VarM4384a == null) {
                hr1.m3272h("Uploader", "Unknown backend for %s, deleting event batch for it...", c0674ge2);
                c1402sd2 = new C1402sd(3, -1L);
                bArr = bArr2;
                j = jMax;
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C0564de) it.next()).f2906c);
                }
                if (bArr2 != null) {
                    no1 no1Var2 = p42Var.f8724i;
                    Objects.requireNonNull(no1Var2);
                    C1302po c1302po = (C1302po) no1Var.m4581l(new m42(no1Var2, 0));
                    C1470u7 c1470u7 = new C1470u7();
                    c1470u7.f11146f = new HashMap();
                    c1470u7.f11144d = Long.valueOf(p42Var.f8722g.m753r());
                    c1470u7.f11145e = Long.valueOf(p42Var.f8723h.m753r());
                    c1470u7.f11141a = "GDT_CLIENT_METRICS";
                    t60 t60Var = new t60("proto");
                    c1302po.getClass();
                    c1470u7.f11143c = new s60(t60Var, jh1.f5389a.encode(c1302po));
                    arrayList.add(((C1558wl) b32VarM4384a).m6806a(c1470u7.m6401d()));
                }
                C1558wl c1558wl = (C1558wl) b32VarM4384a;
                HashMap map = new HashMap();
                int size = arrayList.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj = arrayList.get(i5);
                    i5++;
                    C1587xd c1587xd = (C1587xd) obj;
                    String str3 = c1587xd.f12576a;
                    if (map.containsKey(str3)) {
                        ((List) map.get(str3)).add(c1587xd);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(c1587xd);
                        map.put(str3, arrayList2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Map.Entry entry : map.entrySet()) {
                    C1587xd c1587xd2 = (C1587xd) ((List) entry.getValue()).get(0);
                    ai1 ai1Var = ai1.f240a;
                    long jM753r = c1558wl.f12216f.m753r();
                    long jM753r2 = c1558wl.f12215e.m753r();
                    C1476ud c1476ud = new C1476ud(new C1365rd(Integer.valueOf(c1587xd2.m6918b("sdk-version")), c1587xd2.m6917a("model"), c1587xd2.m6917a("hardware"), c1587xd2.m6917a("device"), c1587xd2.m6917a("product"), c1587xd2.m6917a("os-uild"), c1587xd2.m6917a("manufacturer"), c1587xd2.m6917a("fingerprint"), c1587xd2.m6917a("locale"), c1587xd2.m6917a("country"), c1587xd2.m6917a("mcc_mnc"), c1587xd2.m6917a("application_build")));
                    try {
                        str2 = null;
                        numValueOf = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                    } catch (NumberFormatException unused) {
                        numValueOf = null;
                        str2 = (String) entry.getKey();
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (C1587xd c1587xd3 : (List) entry.getValue()) {
                        byte[] bArr3 = bArr2;
                        s60 s60Var = c1587xd3.f12578c;
                        t60 t60Var2 = s60Var.f10248a;
                        byte[] bArr4 = s60Var.f10249b;
                        long j2 = jMax;
                        if (t60Var2.equals(new t60("proto"))) {
                            b50Var = new b50();
                            b50Var.f1155d = bArr4;
                        } else {
                            if (t60Var2.equals(new t60("json"))) {
                                String str4 = new String(bArr4, Charset.forName("UTF-8"));
                                b50 b50Var2 = new b50();
                                b50Var2.f1156e = str4;
                                b50Var = b50Var2;
                            } else {
                                String strConcat = "TRuntime.".concat("CctTransportBackend");
                                if (Log.isLoggable(strConcat, 5)) {
                                    Log.w(strConcat, "Received event of unsupported encoding " + t60Var2 + ". Skipping...");
                                }
                            }
                            bArr2 = bArr3;
                            jMax = j2;
                        }
                        b50Var.f1152a = Long.valueOf(c1587xd3.f12579d);
                        b50Var.f1154c = Long.valueOf(c1587xd3.f12580e);
                        String str5 = (String) c1587xd3.f12581f.get("tz-offset");
                        b50Var.f1157f = Long.valueOf(str5 == null ? 0L : Long.valueOf(str5).longValue());
                        b50Var.f1158g = new C0132ce((i81) i81.f4867a.get(c1587xd3.m6918b("net-type")), (h81) h81.f4472a.get(c1587xd3.m6918b("mobile-subtype")));
                        Integer num = c1587xd3.f12577b;
                        if (num != null) {
                            b50Var.f1153b = num;
                        }
                        String strConcat2 = ((Long) b50Var.f1152a) == null ? " eventTimeMs" : "";
                        if (((Long) b50Var.f1154c) == null) {
                            strConcat2 = strConcat2.concat(" eventUptimeMs");
                        }
                        if (((Long) b50Var.f1157f) == null) {
                            strConcat2 = strConcat2.concat(" timezoneOffsetSeconds");
                        }
                        if (!strConcat2.isEmpty()) {
                            f40.m2719o("Missing required properties:".concat(strConcat2));
                            return;
                        } else {
                            arrayList4.add(new C1661zd(((Long) b50Var.f1152a).longValue(), (Integer) b50Var.f1153b, ((Long) b50Var.f1154c).longValue(), (byte[]) b50Var.f1155d, (String) b50Var.f1156e, ((Long) b50Var.f1157f).longValue(), (C0132ce) b50Var.f1158g));
                            bArr2 = bArr3;
                            jMax = j2;
                        }
                    }
                    arrayList3.add(new C0015ae(jM753r, jM753r2, c1476ud, numValueOf, str2, arrayList4));
                    bArr2 = bArr2;
                }
                bArr = bArr2;
                j = jMax;
                C1439td c1439td = new C1439td(arrayList3);
                URL urlM6805b = c1558wl.f12214d;
                if (bArr != null) {
                    try {
                        C0831kk c0831kkM3894a = C0831kk.m3894a(bArr);
                        str = c0831kkM3894a.f5893b;
                        if (str == null) {
                            str = null;
                        }
                        urlM6805b = C1558wl.m6805b(c0831kkM3894a.f5892a);
                    } catch (IllegalArgumentException unused2) {
                        c1402sd = new C1402sd(3, -1L);
                    }
                } else {
                    str = null;
                }
                try {
                    C1174o9 c1174o9 = new C1174o9(urlM6805b, c1439td, str, 6);
                    C1521vl c1521vl = new C1521vl(c1558wl, 0);
                    int i6 = 5;
                    do {
                        c1583x9M6642d = c1521vl.m6642d(c1174o9);
                        URL url = (URL) c1583x9M6642d.f12496c;
                        if (url != null) {
                            hr1.m3272h("CctTransportBackend", "Following redirect to: %s", url);
                            c1174o9 = new C1174o9(url, (C1439td) c1174o9.f7700c, (String) c1174o9.f7701d, 6);
                        } else {
                            c1174o9 = null;
                        }
                        if (c1174o9 == null) {
                            break;
                        } else {
                            i6--;
                        }
                    } while (i6 >= 1);
                    int i7 = c1583x9M6642d.f12494a;
                    if (i7 == 200) {
                        c1402sd2 = new C1402sd(1, c1583x9M6642d.f12495b);
                    } else {
                        if (i7 >= 500 || i7 == 404) {
                            c1402sd = new C1402sd(2, -1L);
                        } else if (i7 == 400) {
                            try {
                                c1402sd = new C1402sd(4, -1L);
                            } catch (IOException e) {
                                e = e;
                                hr1.m3274j(e, "CctTransportBackend", "Could not make request to the backend");
                                i2 = 2;
                                c1402sd2 = new C1402sd(2, -1L);
                            }
                        } else {
                            c1402sd = new C1402sd(3, -1L);
                        }
                        c1402sd2 = c1402sd;
                    }
                } catch (IOException e2) {
                    e = e2;
                }
            }
            i2 = 2;
            int i8 = c1402sd2.f10364a;
            if (i8 == i2) {
                final long j3 = j;
                no1Var.m4581l(new ty1() { // from class: o42
                    @Override // p000.ty1
                    /* JADX INFO: renamed from: b */
                    public final Object mo940b() {
                        p42 p42Var2 = this.f7658a;
                        no1 no1Var3 = p42Var2.f8718c;
                        no1Var3.getClass();
                        Iterable iterable2 = iterable;
                        if (iterable2.iterator().hasNext()) {
                            String strConcat3 = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ".concat(no1.m4575o(iterable2));
                            SQLiteDatabase sQLiteDatabaseM4577c = no1Var3.m4577c();
                            sQLiteDatabaseM4577c.beginTransaction();
                            try {
                                sQLiteDatabaseM4577c.compileStatement(strConcat3).execute();
                                Cursor cursorRawQuery = sQLiteDatabaseM4577c.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                                while (cursorRawQuery.moveToNext()) {
                                    try {
                                        no1Var3.m4580j(cursorRawQuery.getInt(0), rv0.MAX_RETRIES_REACHED, cursorRawQuery.getString(1));
                                    } catch (Throwable th) {
                                        cursorRawQuery.close();
                                        throw th;
                                    }
                                }
                                cursorRawQuery.close();
                                sQLiteDatabaseM4577c.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                                sQLiteDatabaseM4577c.setTransactionSuccessful();
                                sQLiteDatabaseM4577c.endTransaction();
                            } catch (Throwable th2) {
                                sQLiteDatabaseM4577c.endTransaction();
                                throw th2;
                            }
                        }
                        no1Var3.m4578e(new jo1(p42Var2.f8722g.m753r() + j3, c0674ge));
                        return null;
                    }
                });
                this.f8719d.m4755X(c0674ge, i + 1, true);
                return;
            }
            p42Var = this;
            c0674ge2 = c0674ge;
            jMax = j;
            no1Var.m4581l(new C0702h5(15, p42Var, iterable));
            if (i8 == 1) {
                jMax = Math.max(jMax, c1402sd2.f10365b);
                if (bArr != null) {
                    no1Var.m4581l(new uq1(p42Var, 5));
                }
            } else if (i8 == 4) {
                HashMap map2 = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String str6 = ((C0564de) it2.next()).f2906c.f12576a;
                    if (map2.containsKey(str6)) {
                        map2.put(str6, Integer.valueOf(((Integer) map2.get(str6)).intValue() + 1));
                    } else {
                        map2.put(str6, 1);
                    }
                }
                no1Var.m4581l(new C0702h5(16, p42Var, map2));
            }
            bArr2 = bArr;
        }
    }
}
