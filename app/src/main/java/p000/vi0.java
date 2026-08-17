package p000;

import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vi0 {

    /* JADX INFO: renamed from: a */
    public static final Logger f11674a = Logger.getLogger(vi0.class.getName());

    /* JADX INFO: renamed from: b */
    public static final Set f11675b = Collections.unmodifiableSet(EnumSet.of(mv1.OK, mv1.INVALID_ARGUMENT, mv1.NOT_FOUND, mv1.ALREADY_EXISTS, mv1.FAILED_PRECONDITION, mv1.ABORTED, mv1.OUT_OF_RANGE, mv1.DATA_LOSS));

    /* JADX INFO: renamed from: c */
    public static final d51 f11676c;

    /* JADX INFO: renamed from: d */
    public static final d51 f11677d;

    /* JADX INFO: renamed from: e */
    public static final h51 f11678e;

    /* JADX INFO: renamed from: f */
    public static final d51 f11679f;

    /* JADX INFO: renamed from: g */
    public static final h51 f11680g;

    /* JADX INFO: renamed from: h */
    public static final d51 f11681h;

    /* JADX INFO: renamed from: i */
    public static final d51 f11682i;

    /* JADX INFO: renamed from: j */
    public static final d51 f11683j;

    /* JADX INFO: renamed from: k */
    public static final d51 f11684k;

    /* JADX INFO: renamed from: l */
    public static final long f11685l;

    /* JADX INFO: renamed from: m */
    public static final sh1 f11686m;

    /* JADX INFO: renamed from: n */
    public static final C0101bj f11687n;

    /* JADX INFO: renamed from: o */
    public static final si0 f11688o;

    /* JADX INFO: renamed from: p */
    public static final bz1 f11689p;

    /* JADX INFO: renamed from: q */
    public static final k50 f11690q;

    /* JADX INFO: renamed from: r */
    public static final ti0 f11691r;

    static {
        Charset.forName("US-ASCII");
        byte b = 0;
        f11676c = new d51("grpc-timeout", new k50(b, 28));
        pu0 pu0Var = j51.f5269d;
        f11677d = new d51("grpc-encoding", pu0Var);
        int i = 27;
        f11678e = wo0.m6815a("grpc-accept-encoding", new bz1(i));
        f11679f = new d51("content-encoding", pu0Var);
        f11680g = wo0.m6815a("accept-encoding", new bz1(i));
        f11681h = new d51("content-length", pu0Var);
        f11682i = new d51("content-type", pu0Var);
        f11683j = new d51("te", pu0Var);
        f11684k = new d51("user-agent", pu0Var);
        C0105bn.f1435c.getClass();
        f11685l = 20000000000L;
        f11686m = new sh1();
        f11687n = new C0101bj("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER", 1);
        f11688o = new si0();
        f11689p = new bz1(26);
        f11690q = new k50(b, i);
        f11691r = new ti0(0);
    }

    /* JADX INFO: renamed from: a */
    public static URI m6629a(String str) {
        String str2;
        p32.m5188s(str, "authority");
        try {
            str2 = str;
            try {
                return new URI(null, str2, null, null, null);
            } catch (URISyntaxException e) {
                e = e;
                throw new IllegalArgumentException("Invalid authority: ".concat(str2), e);
            }
        } catch (URISyntaxException e2) {
            e = e2;
            str2 = str;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m6630b(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            f11674a.log(Level.WARNING, "exception caught in closeQuietly", (Throwable) e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static rc2[] m6631c(C0022al c0022al, j51 j51Var, int i, boolean z) {
        List list = c0022al.f262e;
        int size = list.size();
        rc2[] rc2VarArr = new rc2[size + 1];
        C0022al c0022al2 = C0022al.f257i;
        C0733i c0733i = new C0733i(c0022al, i, z);
        for (int i2 = 0; i2 < list.size(); i2++) {
            rc2VarArr[i2] = ((AbstractC1450to) list.get(i2)).mo2828a(c0733i, j51Var);
        }
        rc2VarArr[size] = f11688o;
        return rc2VarArr;
    }

    /* JADX INFO: renamed from: d */
    public static String m6632d(InetSocketAddress inetSocketAddress) {
        try {
            return (String) InetSocketAddress.class.getMethod("getHostString", null).invoke(inetSocketAddress, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return inetSocketAddress.getHostName();
        }
    }

    /* JADX INFO: renamed from: e */
    public static i02 m6633e(String str) {
        Boolean bool = Boolean.TRUE;
        String.format(Locale.ROOT, str, 0);
        return new i02(Executors.defaultThreadFactory(), str, new AtomicLong(0L), bool);
    }

    /* JADX INFO: renamed from: f */
    public static InterfaceC1487uo m6634f(ju0 ju0Var, boolean z) {
        cp0 cp0Var;
        o21 o21Var = ju0Var.f5527a;
        nv1 nv1Var = ju0Var.f5529c;
        if (o21Var == null) {
            cp0Var = null;
        } else {
            gp0 gp0Var = (gp0) o21Var.mo4185O();
            cp0Var = gp0Var.f4282v;
            if (cp0Var == null) {
                gp0Var.f4271k.execute(new zo0(gp0Var, 1));
                cp0Var = null;
            }
        }
        if (cp0Var != null) {
            AbstractC1450to abstractC1450to = ju0Var.f5528b;
            return abstractC1450to == null ? cp0Var : new g90(abstractC1450to, cp0Var);
        }
        if (!nv1Var.m4612e()) {
            if (ju0Var.f5530d) {
                return new g90(m6636h(nv1Var), EnumC1376ro.f10081c);
            }
            if (!z) {
                return new g90(m6636h(nv1Var), EnumC1376ro.f10079a);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0029  */
    /* JADX WARN: Code duplicated, block: B:25:0x0035  */
    /* JADX INFO: renamed from: g */
    public static nv1 m6635g(int i) {
        mv1 mv1Var;
        if ((i >= 100 && i < 200) || i == 400) {
            mv1Var = mv1.INTERNAL;
        } else if (i == 401) {
            mv1Var = mv1.UNAUTHENTICATED;
        } else if (i == 403) {
            mv1Var = mv1.PERMISSION_DENIED;
        } else if (i == 404) {
            mv1Var = mv1.UNIMPLEMENTED;
        } else if (i == 429) {
            mv1Var = mv1.UNAVAILABLE;
        } else if (i != 431) {
            switch (i) {
                case 502:
                case 503:
                case 504:
                    mv1Var = mv1.UNAVAILABLE;
                    break;
                default:
                    mv1Var = mv1.UNKNOWN;
                    break;
            }
        } else {
            mv1Var = mv1.INTERNAL;
        }
        return mv1Var.m4462a().m4614g("HTTP status code " + i);
    }

    /* JADX INFO: renamed from: h */
    public static nv1 m6636h(nv1 nv1Var) {
        p32.m5175k(nv1Var != null);
        if (!f11675b.contains(nv1Var.f7562a)) {
            return nv1Var;
        }
        return nv1.f7558m.m4614g("Inappropriate status code from control plane: " + nv1Var.f7562a + " " + nv1Var.f7563b).m4613f(nv1Var.f7564c);
    }
}
