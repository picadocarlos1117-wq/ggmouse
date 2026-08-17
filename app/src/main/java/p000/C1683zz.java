package p000;

import android.net.Uri;
import com.example.ssmousepro.ads.RewardedVideoActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: zz */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1683zz implements p21 {

    /* JADX INFO: renamed from: a */
    public final C1088ly f13616a;

    /* JADX INFO: renamed from: b */
    public final C0558d8 f13617b;

    /* JADX INFO: renamed from: c */
    public final long f13618c;

    /* JADX INFO: renamed from: d */
    public final long f13619d;

    /* JADX INFO: renamed from: e */
    public final long f13620e;

    /* JADX INFO: renamed from: f */
    public final float f13621f;

    /* JADX INFO: renamed from: g */
    public final float f13622g;

    /* JADX INFO: renamed from: h */
    public boolean f13623h;

    public C1683zz(RewardedVideoActivity rewardedVideoActivity, C0621ez c0621ez) {
        C0558d8 c0558d8 = new C0558d8(rewardedVideoActivity, 15);
        this.f13617b = c0558d8;
        C1088ly c1088ly = new C1088ly(c0621ez, new k50((byte) 0, 20));
        this.f13616a = c1088ly;
        if (c0558d8 != ((C0558d8) c1088ly.f6550e)) {
            c1088ly.f6550e = c0558d8;
            ((HashMap) c1088ly.f6548c).clear();
            ((HashMap) c1088ly.f6549d).clear();
        }
        this.f13618c = -9223372036854775807L;
        this.f13619d = -9223372036854775807L;
        this.f13620e = -9223372036854775807L;
        this.f13621f = -3.4028235E38f;
        this.f13622g = -3.4028235E38f;
        this.f13623h = true;
    }

    /* JADX INFO: renamed from: d */
    public static p21 m7390d(Class cls, InterfaceC0769ix interfaceC0769ix) {
        try {
            return (p21) cls.getConstructor(InterfaceC0769ix.class).newInstance(interfaceC0769ix);
        } catch (Exception e) {
            lv1.m4302n(e);
            return null;
        }
    }

    @Override // p000.p21
    /* JADX INFO: renamed from: a */
    public final void mo5116a(boolean z) {
        this.f13623h = z;
        C1088ly c1088ly = this.f13616a;
        c1088ly.f6546a = z;
        C0621ez c0621ez = (C0621ez) c1088ly.f6547b;
        synchronized (c0621ez) {
            c0621ez.f3498b = z;
        }
        Iterator it = ((HashMap) c1088ly.f6549d).values().iterator();
        while (it.hasNext()) {
            ((p21) it.next()).mo5116a(z);
        }
    }

    @Override // p000.p21
    /* JADX INFO: renamed from: b */
    public final AbstractC0791jh mo5117b(z11 z11Var) {
        z11 z11Var2;
        List list;
        Uri uri;
        String str;
        long j;
        z11Var.f13231b.getClass();
        String scheme = z11Var.f13231b.f11899a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        boolean zEquals = Objects.equals(z11Var.f13231b.f11900b, "application/x-image-uri");
        w11 w11Var = z11Var.f13231b;
        if (zEquals) {
            long j2 = w11Var.f11903e;
            int i = z42.f13274a;
            throw null;
        }
        int iM7250x = z42.m7250x(w11Var.f11899a, w11Var.f11900b);
        if (z11Var.f13231b.f11903e != -9223372036854775807L) {
            C0621ez c0621ez = (C0621ez) this.f13616a.f6547b;
            synchronized (c0621ez) {
                c0621ez.f3500d = 1;
            }
        }
        try {
            C1088ly c1088ly = this.f13616a;
            HashMap map = (HashMap) c1088ly.f6549d;
            p21 p21Var = (p21) map.get(Integer.valueOf(iM7250x));
            if (p21Var == null) {
                p21Var = (p21) c1088ly.m4326a(iM7250x).get();
                p21Var.mo5118c((k50) c1088ly.f6551f);
                p21Var.mo5116a(c1088ly.f6546a);
                map.put(Integer.valueOf(iM7250x), p21Var);
            }
            u11 u11VarM6551a = z11Var.f13232c.m6551a();
            v11 v11Var = z11Var.f13232c;
            if (v11Var.f11479a == -9223372036854775807L) {
                u11VarM6551a.f11085a = this.f13618c;
            }
            if (v11Var.f11482d == -3.4028235E38f) {
                u11VarM6551a.f11088d = this.f13621f;
            }
            if (v11Var.f11483e == -3.4028235E38f) {
                u11VarM6551a.f11089e = this.f13622g;
            }
            if (v11Var.f11480b == -9223372036854775807L) {
                u11VarM6551a.f11086b = this.f13619d;
            }
            if (v11Var.f11481c == -9223372036854775807L) {
                u11VarM6551a.f11087c = this.f13620e;
            }
            v11 v11Var2 = new v11(u11VarM6551a);
            if (v11Var2.equals(z11Var.f13232c)) {
                z11Var2 = z11Var;
            } else {
                new ax0();
                List list2 = Collections.EMPTY_LIST;
                qm0 qm0Var = kk1.f5896e;
                x11 x11Var = x11.f12412a;
                t11 t11Var = z11Var.f13234e;
                bb0 bb0Var = new bb0();
                bb0Var.f1280a = t11Var.f10198a;
                String str2 = z11Var.f13230a;
                d21 d21Var = z11Var.f13233d;
                z11Var.f13232c.m6551a();
                x11 x11Var2 = z11Var.f13235f;
                w11 w11Var2 = z11Var.f13231b;
                if (w11Var2 != null) {
                    String str3 = w11Var2.f11900b;
                    Uri uri2 = w11Var2.f11899a;
                    List list3 = w11Var2.f11901c;
                    qm0Var = w11Var2.f11902d;
                    new ax0();
                    str = str3;
                    uri = uri2;
                    list = list3;
                    j = w11Var2.f11903e;
                } else {
                    list = list2;
                    uri = null;
                    str = null;
                    j = -9223372036854775807L;
                }
                qm0 qm0Var2 = qm0Var;
                u11 u11VarM6551a2 = v11Var2.m6551a();
                w11 w11Var3 = uri != null ? new w11(uri, str, null, list, qm0Var2, j) : null;
                if (str2 == null) {
                    str2 = "";
                }
                String str4 = str2;
                t11 t11Var2 = new t11(bb0Var);
                v11 v11Var3 = new v11(u11VarM6551a2);
                if (d21Var == null) {
                    d21Var = d21.f2726B;
                }
                z11Var2 = new z11(str4, t11Var2, w11Var3, v11Var3, d21Var, x11Var2);
            }
            AbstractC0791jh abstractC0791jhMo5117b = p21Var.mo5117b(z11Var2);
            qm0 qm0Var3 = z11Var2.f13231b.f11902d;
            if (!qm0Var3.isEmpty()) {
                AbstractC0791jh[] abstractC0791jhArr = new AbstractC0791jh[qm0Var3.size() + 1];
                abstractC0791jhArr[0] = abstractC0791jhMo5117b;
                if (qm0Var3.size() > 0) {
                    if (!this.f13623h) {
                        this.f13617b.getClass();
                        y11 y11Var = (y11) qm0Var3.get(0);
                        new ArrayList(1);
                        new HashSet(1);
                        new CopyOnWriteArrayList();
                        new CopyOnWriteArrayList();
                        om0 om0Var = qm0.f9540b;
                        kk1 kk1Var = kk1.f5896e;
                        List list4 = Collections.EMPTY_LIST;
                        kk1 kk1Var2 = kk1.f5896e;
                        x11 x11Var3 = x11.f12412a;
                        Uri uri3 = Uri.EMPTY;
                        y11Var.getClass();
                        throw null;
                    }
                    ae0 ae0Var = new ae0();
                    ((y11) qm0Var3.get(0)).getClass();
                    ArrayList arrayList = v51.f11551a;
                    ae0Var.f197m = null;
                    ((y11) qm0Var3.get(0)).getClass();
                    ae0Var.f188d = null;
                    ((y11) qm0Var3.get(0)).getClass();
                    ae0Var.f189e = 0;
                    ((y11) qm0Var3.get(0)).getClass();
                    ae0Var.f190f = 0;
                    ((y11) qm0Var3.get(0)).getClass();
                    ae0Var.f186b = null;
                    ((y11) qm0Var3.get(0)).getClass();
                    ae0Var.f185a = null;
                    new be0(ae0Var);
                    new C0080az(0);
                    ((y11) qm0Var3.get(0)).getClass();
                    throw null;
                }
                abstractC0791jhMo5117b = new q41(abstractC0791jhArr);
            }
            long j3 = z11Var2.f13234e.f10198a;
            if (j3 != Long.MIN_VALUE) {
                abstractC0791jhMo5117b = new C0107bp(abstractC0791jhMo5117b, j3, true);
            }
            z11Var2.f13231b.getClass();
            z11Var2.f13231b.getClass();
            return abstractC0791jhMo5117b;
        } catch (ClassNotFoundException e) {
            lv1.m4302n(e);
            return null;
        }
    }

    @Override // p000.p21
    /* JADX INFO: renamed from: c */
    public final void mo5118c(k50 k50Var) {
        C1088ly c1088ly = this.f13616a;
        c1088ly.f6551f = k50Var;
        C0621ez c0621ez = (C0621ez) c1088ly.f6547b;
        synchronized (c0621ez) {
            c0621ez.f3499c = k50Var;
        }
        Iterator it = ((HashMap) c1088ly.f6549d).values().iterator();
        while (it.hasNext()) {
            ((p21) it.next()).mo5118c(k50Var);
        }
    }
}
