package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import com.example.ssmousepro.ads.RewardedVideoCoordinator;
import com.google.firebase.components.DependencyException;
import com.google.firebase.firestore.core.FieldFilter;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l41 implements yg0, yl0, a90, InterfaceC0777j4, lo1, InterfaceC0578dt {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6176a;

    public /* synthetic */ l41(int i) {
        this.f6176a = i;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m4035b() {
        throw new ClassCastException();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m4036e(int i, String str) {
        throw new IllegalStateException(str + i);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m4037f(Object obj, Object obj2, Object obj3, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalStateException(sb.toString(), th);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m4038g(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m4039h(String str) throws InvalidKeyException {
        throw new InvalidKeyException(str);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m4040i(String str, FieldFilter.Operator operator, Object obj) {
        throw new IllegalArgumentException(str + ((Object) operator.toString()) + obj);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m4041j(String str, Object obj, Object obj2) {
        throw new DependencyException(str + obj + obj2);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m4042k(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m4043l(String str, Throwable th) {
        throw new RuntimeException(str, th);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m4044m(StringBuilder sb, Object obj) {
        sb.append(obj);
        throw new RuntimeException(sb.toString());
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m4045n(Throwable th) {
        throw new IllegalArgumentException(th);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m4046o() {
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m4047p(Object obj, String str) throws IOException {
        throw new IOException(str + obj);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m4048q(String str) {
        throw new RuntimeException(str);
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m4049r() {
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m4050s(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m4051t(String str) {
        throw new NullPointerException(str);
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m4052u(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m4053v(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    @Override // p000.a90
    /* JADX INFO: renamed from: a */
    public x80[] mo120a() {
        switch (this.f6176a) {
            case 8:
                return new x80[]{new n61(wx1.f12357k, 16)};
            case 11:
                return new x80[]{new k91()};
            default:
                return new x80[]{new vh1()};
        }
    }

    @Override // p000.InterfaceC0578dt
    public void accept(Object obj) {
        ((wo1) obj).f12244b.getClass();
    }

    @Override // p000.yg0
    public Object apply(Object obj) {
        switch (this.f6176a) {
            case 0:
                return Long.valueOf(((C1122mv) obj).f7104b);
            case 1:
                return Long.valueOf(((C1122mv) obj).f7105c);
            case 2:
                return qm0.m5567n(AbstractC1337qm.m5540h0(((j21) obj).mo3536m().f13238b, new lv1(5)));
            case 7:
                return (v12) obj;
            default:
                Cursor cursorRawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    ArrayList arrayList = new ArrayList();
                    while (cursorRawQuery.moveToNext()) {
                        C1174o9 c1174o9M2960a = C0674ge.m2960a();
                        c1174o9M2960a.m4756Y(cursorRawQuery.getString(1));
                        c1174o9M2960a.f7701d = eg1.m2587b(cursorRawQuery.getInt(2));
                        String string = cursorRawQuery.getString(3);
                        c1174o9M2960a.f7700c = string == null ? null : Base64.decode(string, 0);
                        arrayList.add(c1174o9M2960a.m4764j());
                        break;
                    }
                    return arrayList;
                } finally {
                    cursorRawQuery.close();
                }
        }
    }

    @Override // p000.yl0
    /* JADX INFO: renamed from: d */
    public boolean mo1190d(int i, int i2, int i3, int i4, int i5) {
        if (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) {
            return true;
        }
        if (i2 == 77 && i3 == 76 && i4 == 76) {
            return i5 == 84 || i == 2;
        }
        return false;
    }

    @Override // p000.InterfaceC0777j4
    public void onActivityResult(Object obj) {
        RewardedVideoCoordinator.register$lambda$0((C0738i4) obj);
    }
}
