package p000;

import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class u91 {

    /* JADX INFO: renamed from: L */
    public static final h51 f11187L = wo0.m6815a(":status", new bz1(28));

    /* JADX INFO: renamed from: A */
    public boolean f11188A;

    /* JADX INFO: renamed from: B */
    public int f11189B;

    /* JADX INFO: renamed from: C */
    public int f11190C;

    /* JADX INFO: renamed from: D */
    public final f70 f11191D;

    /* JADX INFO: renamed from: E */
    public final l81 f11192E;

    /* JADX INFO: renamed from: F */
    public final y91 f11193F;

    /* JADX INFO: renamed from: G */
    public boolean f11194G;

    /* JADX INFO: renamed from: H */
    public final bz1 f11195H;

    /* JADX INFO: renamed from: I */
    public ib1 f11196I;

    /* JADX INFO: renamed from: J */
    public int f11197J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ v91 f11198K;

    /* JADX INFO: renamed from: a */
    public s41 f11199a;

    /* JADX INFO: renamed from: b */
    public final Object f11200b;

    /* JADX INFO: renamed from: c */
    public final C0558d8 f11201c;

    /* JADX INFO: renamed from: d */
    public final s41 f11202d;

    /* JADX INFO: renamed from: e */
    public int f11203e;

    /* JADX INFO: renamed from: f */
    public boolean f11204f;

    /* JADX INFO: renamed from: g */
    public boolean f11205g;

    /* JADX INFO: renamed from: h */
    public final kv1 f11206h;

    /* JADX INFO: renamed from: i */
    public boolean f11207i;

    /* JADX INFO: renamed from: j */
    public InterfaceC1413so f11208j;

    /* JADX INFO: renamed from: k */
    public C1681zx f11209k;

    /* JADX INFO: renamed from: l */
    public boolean f11210l;

    /* JADX INFO: renamed from: m */
    public RunnableC1091m0 f11211m;

    /* JADX INFO: renamed from: n */
    public volatile boolean f11212n;

    /* JADX INFO: renamed from: o */
    public boolean f11213o;

    /* JADX INFO: renamed from: p */
    public boolean f11214p;

    /* JADX INFO: renamed from: q */
    public nv1 f11215q;

    /* JADX INFO: renamed from: r */
    public j51 f11216r;

    /* JADX INFO: renamed from: s */
    public Charset f11217s;

    /* JADX INFO: renamed from: t */
    public boolean f11218t;

    /* JADX INFO: renamed from: u */
    public final int f11219u;

    /* JADX INFO: renamed from: v */
    public final Object f11220v;

    /* JADX INFO: renamed from: w */
    public ArrayList f11221w;

    /* JADX INFO: renamed from: x */
    public final C1073lj f11222x;

    /* JADX INFO: renamed from: y */
    public boolean f11223y;

    /* JADX INFO: renamed from: z */
    public boolean f11224z;

    public u91(v91 v91Var, int i, kv1 kv1Var, Object obj, f70 f70Var, l81 l81Var, y91 y91Var, int i2) {
        this.f11198K = v91Var;
        C0558d8 c0558d8 = v91Var.f7157a;
        this.f11200b = new Object();
        p32.m5188s(c0558d8, "transportTracer");
        this.f11201c = c0558d8;
        s41 s41Var = new s41(this, i, kv1Var, c0558d8);
        this.f11202d = s41Var;
        this.f11199a = s41Var;
        this.f11209k = C1681zx.f13596d;
        this.f11210l = false;
        this.f11206h = kv1Var;
        this.f11217s = AbstractC0646fn.f3856b;
        this.f11222x = new C1073lj();
        this.f11223y = false;
        this.f11224z = false;
        this.f11188A = false;
        this.f11194G = true;
        this.f11197J = -1;
        p32.m5188s(obj, "lock");
        this.f11220v = obj;
        this.f11191D = f70Var;
        this.f11192E = l81Var;
        this.f11193F = y91Var;
        this.f11189B = i2;
        this.f11190C = i2;
        this.f11219u = i2;
        jc1.f5363a.getClass();
        this.f11195H = vm0.f11713a;
    }

    /* JADX INFO: renamed from: a */
    public static void m6410a(u91 u91Var, j51 j51Var, String str) {
        v91 v91Var = u91Var.f11198K;
        String str2 = v91Var.f11593k;
        String str3 = v91Var.f11591i;
        boolean z = v91Var.f11597o;
        y91 y91Var = u91Var.f11193F;
        boolean z2 = y91Var.f12874B == null;
        yj0 yj0Var = bk0.f1391a;
        p32.m5188s(j51Var, "headers");
        p32.m5188s(str2, "authority");
        j51Var.m3561a(vi0.f11682i);
        j51Var.m3561a(vi0.f11683j);
        d51 d51Var = vi0.f11684k;
        j51Var.m3561a(d51Var);
        ArrayList arrayList = new ArrayList(j51Var.f5272b + 7);
        if (z2) {
            arrayList.add(bk0.f1392b);
        } else {
            arrayList.add(bk0.f1391a);
        }
        if (z) {
            arrayList.add(bk0.f1394d);
        } else {
            arrayList.add(bk0.f1393c);
        }
        arrayList.add(new yj0(yj0.f12994h, str2));
        arrayList.add(new yj0(yj0.f12992f, str));
        arrayList.add(new yj0(d51Var.f4066a, str3));
        arrayList.add(bk0.f1395e);
        arrayList.add(bk0.f1396f);
        Logger logger = c32.f1660a;
        Charset charset = wo0.f12241a;
        int i = j51Var.f5272b * 2;
        byte[][] bArr = new byte[i][];
        Object[] objArr = j51Var.f5271a;
        if (objArr instanceof byte[][]) {
            System.arraycopy(objArr, 0, bArr, 0, i);
        } else {
            for (int i2 = 0; i2 < j51Var.f5272b; i2++) {
                int i3 = i2 * 2;
                bArr[i3] = j51Var.m3565e(i2);
                int i4 = i3 + 1;
                Object obj = j51Var.f5271a[i4];
                if (!(obj instanceof byte[])) {
                    AbstractC1308pu.m5354u(obj);
                    throw null;
                }
                bArr[i4] = (byte[]) obj;
            }
        }
        int i5 = 0;
        for (int i6 = 0; i6 < i; i6 += 2) {
            byte[] bArr2 = bArr[i6];
            byte[] bArr3 = bArr[i6 + 1];
            if (c32.m1122a(bArr2, c32.f1661b)) {
                bArr[i5] = bArr2;
                bArr[i5 + 1] = wo0.f12242b.m2984c(bArr3).getBytes(AbstractC0646fn.f3855a);
            } else {
                int length = bArr3.length;
                int i7 = 0;
                while (true) {
                    if (i7 >= length) {
                        bArr[i5] = bArr2;
                        bArr[i5 + 1] = bArr3;
                    } else {
                        byte b = bArr3[i7];
                        if (b < 32 || b > 126) {
                            String str4 = new String(bArr2, AbstractC0646fn.f3855a);
                            Logger logger2 = c32.f1660a;
                            StringBuilder sbM5347n = AbstractC1308pu.m5347n("Metadata key=", str4, ", value=");
                            sbM5347n.append(Arrays.toString(bArr3));
                            sbM5347n.append(" contains invalid ASCII characters");
                            logger2.warning(sbM5347n.toString());
                        } else {
                            i7++;
                        }
                    }
                }
            }
            i5 += 2;
        }
        if (i5 != i) {
            bArr = (byte[][]) Arrays.copyOfRange(bArr, 0, i5);
        }
        for (int i8 = 0; i8 < bArr.length; i8 += 2) {
            C0717hk c0717hkM3161h = C0717hk.m3161h(bArr[i8]);
            byte[] bArr4 = c0717hkM3161h.f4608a;
            if (bArr4.length != 0 && bArr4[0] != 58) {
                arrayList.add(new yj0(c0717hkM3161h, C0717hk.m3161h(bArr[i8 + 1])));
            }
        }
        u91Var.f11221w = arrayList;
        nv1 nv1Var = y91Var.f12910v;
        if (nv1Var != null) {
            v91Var.f11594l.m6422l(nv1Var, EnumC1376ro.f10082d, true, new j51());
            return;
        }
        if (y91Var.f12902n.size() < y91Var.f12876D) {
            y91Var.m7067t(v91Var);
            return;
        }
        y91Var.f12877E.add(v91Var);
        if (!y91Var.f12914z) {
            y91Var.f12914z = true;
            vq0 vq0Var = y91Var.f12879G;
            if (vq0Var != null) {
                vq0Var.m6652b();
            }
        }
        if (v91Var.f7159c) {
            y91Var.f12886N.m2155h(v91Var, true);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m6411b(u91 u91Var, C1073lj c1073lj, boolean z, boolean z2) {
        if (u91Var.f11188A) {
            return;
        }
        if (!u91Var.f11194G) {
            p32.m5193x(u91Var.f11197J != -1, "streamId should be set");
            u91Var.f11192E.m4142b(z, u91Var.f11196I, c1073lj, z2);
        } else {
            u91Var.f11222x.mo956q((int) c1073lj.f6361b, c1073lj);
            u91Var.f11223y |= z;
            u91Var.f11224z |= z2;
        }
    }

    /* JADX INFO: renamed from: g */
    public static Charset m6412g(j51 j51Var) {
        String str = (String) j51Var.m3563c(vi0.f11682i);
        if (str != null) {
            String[] strArrSplit = str.split("charset=", 2);
            try {
                return Charset.forName(strArrSplit[strArrSplit.length - 1].trim());
            } catch (Exception unused) {
            }
        }
        return AbstractC0646fn.f3856b;
    }

    /* JADX INFO: renamed from: n */
    public static nv1 m6413n(j51 j51Var) {
        char cCharAt;
        Integer num = (Integer) j51Var.m3563c(f11187L);
        if (num == null) {
            return nv1.f7558m.m4614g("Missing HTTP status code");
        }
        String str = (String) j51Var.m3563c(vi0.f11682i);
        if (str != null && 16 <= str.length()) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (lowerCase.startsWith("application/grpc") && (lowerCase.length() == 16 || (cCharAt = lowerCase.charAt(16)) == '+' || cCharAt == ';')) {
                return null;
            }
        }
        return vi0.m6635g(num.intValue()).m4611a("invalid content-type: " + str);
    }

    /* JADX INFO: renamed from: c */
    public final void m6414c(int i) {
        int i2 = this.f11190C - i;
        this.f11190C = i2;
        float f = i2;
        int i3 = this.f11219u;
        if (f <= i3 * 0.5f) {
            int i4 = i3 - i2;
            this.f11189B += i4;
            this.f11190C = i2 + i4;
            this.f11191D.m2735j(this.f11197J, i4);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m6415d(nv1 nv1Var, boolean z, j51 j51Var) throws EOFException {
        if (this.f11188A) {
            return;
        }
        this.f11188A = true;
        boolean z2 = this.f11194G;
        y91 y91Var = this.f11193F;
        if (!z2) {
            y91Var.m7057i(this.f11197J, nv1Var, EnumC1376ro.f10079a, z, b70.CANCEL, j51Var);
            return;
        }
        LinkedList linkedList = y91Var.f12877E;
        v91 v91Var = this.f11198K;
        linkedList.remove(v91Var);
        y91Var.m7062n(v91Var);
        this.f11221w = null;
        this.f11222x.m4200c();
        this.f11194G = false;
        if (j51Var == null) {
            j51Var = new j51();
        }
        m6423m(nv1Var, true, j51Var);
    }

    /* JADX INFO: renamed from: e */
    public final void m6416e(nv1 nv1Var, EnumC1376ro enumC1376ro, j51 j51Var) {
        if (this.f11207i) {
            return;
        }
        this.f11207i = true;
        kv1 kv1Var = this.f11206h;
        if (kv1Var.f6044b.compareAndSet(false, true)) {
            for (rc2 rc2Var : kv1Var.f6043a) {
                rc2Var.mo4527q0(nv1Var);
            }
        }
        if (this.f11201c != null) {
            nv1Var.m4612e();
        }
        this.f11208j.mo4775x(nv1Var, enumC1376ro, j51Var);
    }

    /* JADX INFO: renamed from: f */
    public final void m6417f(Throwable th) {
        m6415d(nv1.m4610d(th), true, new j51());
    }

    /* JADX INFO: renamed from: h */
    public final void m6418h(j51 j51Var) {
        k50 k50Var = k50.f5671c;
        p32.m5193x(!this.f11213o, "Received headers on closed stream");
        for (rc2 rc2Var : this.f11206h.f6043a) {
            rc2Var.mo4516N();
        }
        String str = (String) j51Var.m3563c(vi0.f11677d);
        if (str != null) {
            C1644yx c1644yx = (C1644yx) this.f11209k.f13597a.get(str);
            k50 k50Var2 = c1644yx != null ? c1644yx.f13159a : null;
            if (k50Var2 == null) {
                m6417f(new qv1(nv1.f7558m.m4614g("Can't find decompressor for ".concat(str))));
                return;
            } else if (k50Var2 != k50Var) {
                s41 s41Var = this.f11199a;
                s41Var.getClass();
                p32.m5193x(true, "Already set full stream decompressor");
                s41Var.f10221e = k50Var2;
            }
        }
        this.f11208j.mo4761f(j51Var);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m6419i() {
        boolean z;
        synchronized (this.f11200b) {
            try {
                z = this.f11204f && this.f11203e < 32768 && !this.f11205g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: j */
    public final void m6420j(int i, C1073lj c1073lj, boolean z) throws Throwable {
        Throwable th;
        long j = c1073lj.f6361b;
        int i2 = this.f11189B - (((int) j) + i);
        this.f11189B = i2;
        this.f11190C -= i;
        if (i2 < 0) {
            this.f11191D.m2734g(this.f11197J, b70.FLOW_CONTROL_ERROR);
            this.f11193F.m7057i(this.f11197J, nv1.f7558m.m4614g("Received data size exceeded our receiving window size"), EnumC1376ro.f10079a, false, null, null);
            return;
        }
        ca1 ca1Var = new ca1(c1073lj);
        nv1 nv1Var = this.f11215q;
        boolean z2 = false;
        if (nv1Var != null) {
            Charset charset = this.f11217s;
            wi1 wi1Var = xi1.f12615a;
            p32.m5188s(charset, "charset");
            int i3 = (int) c1073lj.f6361b;
            byte[] bArr = new byte[i3];
            ca1Var.mo1192j(0, i3, bArr);
            this.f11215q = nv1Var.m4611a("DATA-----------------------------\n".concat(new String(bArr, charset)));
            ca1Var.close();
            if (this.f11215q.f7563b.length() > 1000 || z) {
                m6415d(this.f11215q, false, this.f11216r);
                return;
            }
            return;
        }
        if (!this.f11218t) {
            m6415d(nv1.f7558m.m4614g("headers not received before payload"), false, new j51());
            return;
        }
        int i4 = (int) j;
        boolean z3 = true;
        try {
            if (this.f11213o) {
                AbstractC1128n0.f7156g.log(Level.INFO, "Received data on closed stream");
                ca1Var.close();
            } else {
                try {
                    s41 s41Var = this.f11199a;
                    s41Var.getClass();
                    try {
                        if (s41Var.isClosed() || s41Var.f10233v) {
                            ca1Var.close();
                        } else {
                            s41Var.f10228q.m5894y(ca1Var);
                            try {
                                s41Var.m5973c();
                            } catch (Throwable th2) {
                                th = th2;
                                z3 = false;
                                if (z3) {
                                    ca1Var.close();
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Throwable th4) {
                    try {
                        m6417f(th4);
                    } catch (Throwable th5) {
                        th = th5;
                        if (!z2) {
                            throw th;
                        }
                        ca1Var.close();
                        throw th;
                    }
                }
            }
            if (z) {
                if (i4 > 0) {
                    this.f11215q = nv1.f7558m.m4614g("Received unexpected EOS on non-empty DATA frame from server");
                } else {
                    this.f11215q = nv1.f7558m.m4614g("Received unexpected EOS on empty DATA frame from server");
                }
                j51 j51Var = new j51();
                this.f11216r = j51Var;
                m6423m(this.f11215q, false, j51Var);
            }
        } catch (Throwable th6) {
            th = th6;
            z2 = true;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m6421k(ArrayList arrayList, boolean z) throws EOFException {
        nv1 nv1VarM4611a;
        h51 h51Var = f11187L;
        if (z) {
            byte[][] bArrM1134a = c52.m1134a(arrayList);
            int length = bArrM1134a.length / 2;
            j51 j51Var = new j51();
            j51Var.f5272b = length;
            j51Var.f5271a = bArrM1134a;
            if (this.f11215q == null && !this.f11218t) {
                nv1 nv1VarM6413n = m6413n(j51Var);
                this.f11215q = nv1VarM6413n;
                if (nv1VarM6413n != null) {
                    this.f11216r = j51Var;
                }
            }
            nv1 nv1Var = this.f11215q;
            if (nv1Var != null) {
                nv1 nv1VarM4611a2 = nv1Var.m4611a("trailers: " + j51Var);
                this.f11215q = nv1VarM4611a2;
                m6415d(nv1VarM4611a2, false, this.f11216r);
                return;
            }
            h51 h51Var2 = xo0.f12658b;
            nv1 nv1Var2 = (nv1) j51Var.m3563c(h51Var2);
            if (nv1Var2 != null) {
                nv1VarM4611a = nv1Var2.m4614g((String) j51Var.m3563c(xo0.f12657a));
            } else if (this.f11218t) {
                nv1VarM4611a = nv1.f7552g.m4614g("missing GRPC status in response");
            } else {
                Integer num = (Integer) j51Var.m3563c(h51Var);
                nv1VarM4611a = (num != null ? vi0.m6635g(num.intValue()) : nv1.f7558m.m4614g("missing HTTP status code")).m4611a("missing GRPC status, inferred error from HTTP status code");
            }
            j51Var.m3561a(h51Var);
            j51Var.m3561a(h51Var2);
            j51Var.m3561a(xo0.f12657a);
            if (this.f11213o) {
                AbstractC1128n0.f7156g.log(Level.INFO, "Received trailers on closed stream:\n {1}\n {2}", new Object[]{nv1VarM4611a, j51Var});
                return;
            }
            for (rc2 rc2Var : this.f11206h.f6043a) {
                rc2Var.mo4519Q(j51Var);
            }
            m6423m(nv1VarM4611a, false, j51Var);
            return;
        }
        byte[][] bArrM1134a2 = c52.m1134a(arrayList);
        int length2 = bArrM1134a2.length / 2;
        j51 j51Var2 = new j51();
        j51Var2.f5272b = length2;
        j51Var2.f5271a = bArrM1134a2;
        nv1 nv1Var3 = this.f11215q;
        if (nv1Var3 != null) {
            this.f11215q = nv1Var3.m4611a("headers: " + j51Var2);
            return;
        }
        try {
            if (this.f11218t) {
                nv1 nv1VarM4614g = nv1.f7558m.m4614g("Received headers twice");
                this.f11215q = nv1VarM4614g;
                this.f11215q = nv1VarM4614g.m4611a("headers: " + j51Var2);
                this.f11216r = j51Var2;
                this.f11217s = m6412g(j51Var2);
                return;
            }
            Integer num2 = (Integer) j51Var2.m3563c(h51Var);
            if (num2 != null && num2.intValue() >= 100 && num2.intValue() < 200) {
                nv1 nv1Var4 = this.f11215q;
                if (nv1Var4 != null) {
                    this.f11215q = nv1Var4.m4611a("headers: " + j51Var2);
                    this.f11216r = j51Var2;
                    this.f11217s = m6412g(j51Var2);
                    return;
                }
                return;
            }
            this.f11218t = true;
            nv1 nv1VarM6413n2 = m6413n(j51Var2);
            this.f11215q = nv1VarM6413n2;
            if (nv1VarM6413n2 != null) {
                this.f11215q = nv1VarM6413n2.m4611a("headers: " + j51Var2);
                this.f11216r = j51Var2;
                this.f11217s = m6412g(j51Var2);
                return;
            }
            j51Var2.m3561a(h51Var);
            j51Var2.m3561a(xo0.f12658b);
            j51Var2.m3561a(xo0.f12657a);
            m6418h(j51Var2);
            nv1 nv1Var5 = this.f11215q;
            if (nv1Var5 != null) {
                this.f11215q = nv1Var5.m4611a("headers: " + j51Var2);
                this.f11216r = j51Var2;
                this.f11217s = m6412g(j51Var2);
            }
        } catch (Throwable th) {
            nv1 nv1Var6 = this.f11215q;
            if (nv1Var6 != null) {
                this.f11215q = nv1Var6.m4611a("headers: " + j51Var2);
                this.f11216r = j51Var2;
                this.f11217s = m6412g(j51Var2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m6422l(nv1 nv1Var, EnumC1376ro enumC1376ro, boolean z, j51 j51Var) {
        p32.m5188s(nv1Var, "status");
        if (!this.f11213o || z) {
            this.f11213o = true;
            this.f11214p = nv1Var.m4612e();
            synchronized (this.f11200b) {
                this.f11205g = true;
            }
            if (this.f11210l) {
                this.f11211m = null;
                m6416e(nv1Var, enumC1376ro, j51Var);
                return;
            }
            this.f11211m = new RunnableC1091m0(this, nv1Var, enumC1376ro, j51Var, 0);
            s41 s41Var = this.f11199a;
            if (z) {
                s41Var.close();
            } else {
                if (s41Var.isClosed()) {
                    return;
                }
                if (s41Var.f10228q.f10110c == 0) {
                    s41Var.close();
                } else {
                    s41Var.f10233v = true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m6423m(nv1 nv1Var, boolean z, j51 j51Var) {
        m6422l(nv1Var, EnumC1376ro.f10079a, z, j51Var);
    }
}
