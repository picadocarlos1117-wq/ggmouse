package p000;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.EOFException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class y91 implements InterfaceC0541cs {

    /* JADX INFO: renamed from: Q */
    public static final Map f12871Q;

    /* JADX INFO: renamed from: R */
    public static final Logger f12872R;

    /* JADX INFO: renamed from: A */
    public final SocketFactory f12873A;

    /* JADX INFO: renamed from: B */
    public final SSLSocketFactory f12874B;

    /* JADX INFO: renamed from: C */
    public Socket f12875C;

    /* JADX INFO: renamed from: D */
    public int f12876D;

    /* JADX INFO: renamed from: E */
    public final LinkedList f12877E;

    /* JADX INFO: renamed from: F */
    public final C0614es f12878F;

    /* JADX INFO: renamed from: G */
    public vq0 f12879G;

    /* JADX INFO: renamed from: H */
    public boolean f12880H;

    /* JADX INFO: renamed from: I */
    public long f12881I;

    /* JADX INFO: renamed from: J */
    public long f12882J;

    /* JADX INFO: renamed from: K */
    public final RunnableC1621ya f12883K;

    /* JADX INFO: renamed from: L */
    public final int f12884L;

    /* JADX INFO: renamed from: M */
    public final C0558d8 f12885M;

    /* JADX INFO: renamed from: N */
    public final yo0 f12886N;

    /* JADX INFO: renamed from: O */
    public final zk0 f12887O;

    /* JADX INFO: renamed from: P */
    public final int f12888P;

    /* JADX INFO: renamed from: a */
    public final InetSocketAddress f12889a;

    /* JADX INFO: renamed from: b */
    public final String f12890b;

    /* JADX INFO: renamed from: c */
    public final String f12891c;

    /* JADX INFO: renamed from: d */
    public final Random f12892d;

    /* JADX INFO: renamed from: e */
    public final ey1 f12893e;

    /* JADX INFO: renamed from: f */
    public final int f12894f;

    /* JADX INFO: renamed from: g */
    public final wk0 f12895g;

    /* JADX INFO: renamed from: h */
    public C1548wb f12896h;

    /* JADX INFO: renamed from: i */
    public f70 f12897i;

    /* JADX INFO: renamed from: j */
    public l81 f12898j;

    /* JADX INFO: renamed from: k */
    public final Object f12899k;

    /* JADX INFO: renamed from: l */
    public final vo0 f12900l;

    /* JADX INFO: renamed from: m */
    public int f12901m;

    /* JADX INFO: renamed from: n */
    public final HashMap f12902n;

    /* JADX INFO: renamed from: o */
    public final Executor f12903o;

    /* JADX INFO: renamed from: p */
    public final er1 f12904p;

    /* JADX INFO: renamed from: q */
    public final ScheduledExecutorService f12905q;

    /* JADX INFO: renamed from: r */
    public final int f12906r;

    /* JADX INFO: renamed from: s */
    public int f12907s;

    /* JADX INFO: renamed from: t */
    public x91 f12908t;

    /* JADX INFO: renamed from: u */
    public C1437tb f12909u;

    /* JADX INFO: renamed from: v */
    public nv1 f12910v;

    /* JADX INFO: renamed from: w */
    public boolean f12911w;

    /* JADX INFO: renamed from: x */
    public yk0 f12912x;

    /* JADX INFO: renamed from: y */
    public boolean f12913y;

    /* JADX INFO: renamed from: z */
    public boolean f12914z;

    static {
        EnumMap enumMap = new EnumMap(b70.class);
        nv1 nv1Var = nv1.f7558m;
        enumMap.put(b70.NO_ERROR, nv1Var.m4614g("No error: A GRPC status of OK should have been sent"));
        enumMap.put(b70.PROTOCOL_ERROR, nv1Var.m4614g("Protocol error"));
        enumMap.put(b70.INTERNAL_ERROR, nv1Var.m4614g("Internal error"));
        enumMap.put(b70.FLOW_CONTROL_ERROR, nv1Var.m4614g("Flow control error"));
        enumMap.put(b70.STREAM_CLOSED, nv1Var.m4614g("Stream closed"));
        enumMap.put(b70.FRAME_TOO_LARGE, nv1Var.m4614g("Frame too large"));
        enumMap.put(b70.REFUSED_STREAM, nv1.f7559n.m4614g("Refused stream"));
        enumMap.put(b70.CANCEL, nv1.f7551f.m4614g("Cancelled"));
        enumMap.put(b70.COMPRESSION_ERROR, nv1Var.m4614g("Compression error"));
        enumMap.put(b70.CONNECT_ERROR, nv1Var.m4614g("Connect error"));
        enumMap.put(b70.ENHANCE_YOUR_CALM, nv1.f7556k.m4614g("Enhance your calm"));
        enumMap.put(b70.INADEQUATE_SECURITY, nv1.f7554i.m4614g("Inadequate security"));
        f12871Q = Collections.unmodifiableMap(enumMap);
        f12872R = Logger.getLogger(y91.class.getName());
    }

    public y91(r91 r91Var, InetSocketAddress inetSocketAddress, String str, C1437tb c1437tb, zk0 zk0Var, RunnableC1621ya runnableC1621ya) {
        ti0 ti0Var = vi0.f11691r;
        wk0 wk0Var = new wk0();
        this.f12892d = new Random();
        Object obj = new Object();
        this.f12899k = obj;
        this.f12902n = new HashMap();
        this.f12876D = 0;
        this.f12877E = new LinkedList();
        this.f12886N = new yo0(this, 2);
        this.f12888P = 30000;
        p32.m5188s(inetSocketAddress, "address");
        this.f12889a = inetSocketAddress;
        this.f12890b = str;
        this.f12906r = r91Var.f9838m;
        this.f12894f = r91Var.f9842q;
        Executor executor = r91Var.f9832b;
        p32.m5188s(executor, "executor");
        this.f12903o = executor;
        this.f12904p = new er1(r91Var.f9832b);
        ScheduledExecutorService scheduledExecutorService = r91Var.f9834d;
        p32.m5188s(scheduledExecutorService, "scheduledExecutorService");
        this.f12905q = scheduledExecutorService;
        this.f12901m = 3;
        this.f12873A = SocketFactory.getDefault();
        this.f12874B = r91Var.f9836f;
        C0614es c0614es = r91Var.f9837g;
        p32.m5188s(c0614es, "connectionSpec");
        this.f12878F = c0614es;
        p32.m5188s(ti0Var, "stopwatchFactory");
        this.f12893e = ti0Var;
        this.f12895g = wk0Var;
        this.f12891c = "grpc-java-okhttp/1.62.2";
        this.f12887O = zk0Var;
        this.f12883K = runnableC1621ya;
        this.f12884L = r91Var.f9843r;
        r91Var.f9835e.getClass();
        this.f12885M = new C0558d8((byte) 0, 1);
        this.f12900l = vo0.m6645a(y91.class, inetSocketAddress.toString());
        C1437tb c1437tb2 = C1437tb.f10816b;
        C1400sb c1400sb = sc2.f10359c;
        IdentityHashMap identityHashMap = new IdentityHashMap(1);
        identityHashMap.put(c1400sb, c1437tb);
        for (Map.Entry entry : c1437tb2.f10817a.entrySet()) {
            if (!identityHashMap.containsKey(entry.getKey())) {
                identityHashMap.put((C1400sb) entry.getKey(), entry.getValue());
            }
        }
        this.f12909u = new C1437tb(identityHashMap);
        synchronized (obj) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m7052a(y91 y91Var, String str) {
        b70 b70Var = b70.PROTOCOL_ERROR;
        y91Var.m7065r(0, b70Var, m7055v(b70Var).m4611a(str));
    }

    /* JADX INFO: renamed from: e */
    public static Socket m7053e(y91 y91Var, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, String str, String str2) throws pv1 {
        Socket socket = null;
        try {
            InetAddress address = inetSocketAddress2.getAddress();
            SocketFactory socketFactory = y91Var.f12873A;
            Socket socketCreateSocket = address != null ? socketFactory.createSocket(inetSocketAddress2.getAddress(), inetSocketAddress2.getPort()) : socketFactory.createSocket(inetSocketAddress2.getHostName(), inetSocketAddress2.getPort());
            try {
                socketCreateSocket.setTcpNoDelay(true);
                socketCreateSocket.setSoTimeout(y91Var.f12888P);
                C0671gb c0671gbM5172i0 = p32.m5172i0(socketCreateSocket);
                yi1 yi1Var = new yi1(p32.m5170h0(socketCreateSocket));
                qo0 qo0VarM7056f = y91Var.m7056f(inetSocketAddress, str, str2);
                ak0 ak0Var = (ak0) qo0VarM7056f.f9549c;
                el0 el0Var = (el0) qo0VarM7056f.f9548b;
                Locale locale = Locale.US;
                yi1Var.mo4205h("CONNECT " + el0Var.f3380a + ":" + el0Var.f3381b + " HTTP/1.1");
                yi1Var.mo4205h("\r\n");
                String[] strArr = ak0Var.f254b;
                String[] strArr2 = ak0Var.f254b;
                int length = strArr.length / 2;
                for (int i = 0; i < length; i++) {
                    int i2 = i * 2;
                    yi1Var.mo4205h((i2 < 0 || i2 >= strArr2.length) ? null : strArr2[i2]);
                    yi1Var.mo4205h(": ");
                    int i3 = i2 + 1;
                    yi1Var.mo4205h((i3 < 0 || i3 >= strArr2.length) ? null : strArr2[i3]);
                    yi1Var.mo4205h("\r\n");
                }
                yi1Var.mo4205h("\r\n");
                yi1Var.flush();
                C0082b0 c0082b0M800m = C0082b0.m800m(m7054p(c0671gbM5172i0));
                int i4 = c0082b0M800m.f1103b;
                while (!m7054p(c0671gbM5172i0).equals("")) {
                }
                if (i4 >= 200 && i4 < 300) {
                    socketCreateSocket.setSoTimeout(0);
                    return socketCreateSocket;
                }
                C1073lj c1073lj = new C1073lj();
                try {
                    socketCreateSocket.shutdownOutput();
                    c0671gbM5172i0.mo156n(1024L, c1073lj);
                } catch (IOException e) {
                    c1073lj.m4197I("Unable to read body: " + e.toString());
                }
                try {
                    socketCreateSocket.close();
                } catch (IOException unused) {
                }
                Locale locale2 = Locale.US;
                throw new pv1(nv1.f7559n.m4614g("Response returned from proxy was not successful (expected 2xx, got " + i4 + " " + ((String) c0082b0M800m.f1105d) + "). Response body:\n" + c1073lj.m4217x()));
            } catch (IOException e2) {
                e = e2;
                socket = socketCreateSocket;
                if (socket != null) {
                    vi0.m6630b(socket);
                }
                throw new pv1(nv1.f7559n.m4614g("Failed trying to connect with proxy").m4613f(e));
            }
        } catch (IOException e3) {
            e = e3;
        }
    }

    /* JADX INFO: renamed from: p */
    public static String m7054p(C0671gb c0671gb) throws EOFException {
        long j;
        C1073lj c1073lj = new C1073lj();
        do {
            long jMo156n = c0671gb.mo156n(1L, c1073lj);
            j = c1073lj.f6361b;
            if (jMo156n == -1) {
                throw new EOFException("\\n not found: " + c1073lj.mo4199b(j).mo3165e());
            }
        } while (c1073lj.m4208l(j - 1) != 10);
        return c1073lj.mo4203f(Long.MAX_VALUE);
    }

    /* JADX INFO: renamed from: v */
    public static nv1 m7055v(b70 b70Var) {
        nv1 nv1Var = (nv1) f12871Q.get(b70Var);
        if (nv1Var != null) {
            return nv1Var;
        }
        return nv1.f7552g.m4614g("Unknown http2 error code: " + b70Var.f1246a);
    }

    @Override // p000.yx0
    /* JADX INFO: renamed from: b */
    public final void mo2577b(nv1 nv1Var) {
        mo2580h(nv1Var);
        synchronized (this.f12899k) {
            try {
                Iterator it = this.f12902n.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    it.remove();
                    ((v91) entry.getValue()).f11594l.m6423m(nv1Var, false, new j51());
                    m7062n((v91) entry.getValue());
                }
                for (v91 v91Var : this.f12877E) {
                    v91Var.f11594l.m6422l(nv1Var, EnumC1376ro.f10082d, true, new j51());
                    m7062n(v91Var);
                }
                this.f12877E.clear();
                m7068u();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.yx0
    /* JADX INFO: renamed from: c */
    public final Runnable mo2578c(xx0 xx0Var) {
        this.f12896h = (C1548wb) xx0Var;
        if (this.f12880H) {
            vq0 vq0Var = new vq0(new pn0(this), this.f12905q, this.f12881I, this.f12882J);
            this.f12879G = vq0Var;
            synchronized (vq0Var) {
            }
        }
        C0093bb c0093bb = new C0093bb(this.f12904p, this);
        wk0 wk0Var = this.f12895g;
        yi1 yi1Var = new yi1(c0093bb);
        wk0Var.getClass();
        C1658za c1658za = new C1658za(c0093bb, new vk0(yi1Var));
        synchronized (this.f12899k) {
            f70 f70Var = new f70(this, c1658za);
            this.f12897i = f70Var;
            this.f12898j = new l81(this, f70Var);
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f12904p.execute(new i10(this, countDownLatch, c0093bb, 4));
        try {
            m7064q();
            countDownLatch.countDown();
            this.f12904p.execute(new RunnableC1621ya(this, 20));
            return null;
        } catch (Throwable th) {
            countDownLatch.countDown();
            throw th;
        }
    }

    @Override // p000.InterfaceC1487uo
    /* JADX INFO: renamed from: d */
    public final InterfaceC1339qo mo2110d(u51 u51Var, j51 j51Var, C0022al c0022al, rc2[] rc2VarArr) {
        v91 v91Var;
        p32.m5188s(u51Var, FirebaseAnalytics.Param.METHOD);
        p32.m5188s(j51Var, "headers");
        C1437tb c1437tb = this.f12909u;
        kv1 kv1Var = new kv1(rc2VarArr);
        for (rc2 rc2Var : rc2VarArr) {
            rc2Var.mo4528r0(c1437tb, j51Var);
        }
        synchronized (this.f12899k) {
            v91Var = new v91(u51Var, j51Var, this.f12897i, this, this.f12898j, this.f12899k, this.f12906r, this.f12894f, this.f12890b, this.f12891c, kv1Var, this.f12885M, c0022al);
        }
        return v91Var;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x019c A[EDGE_INSN: B:106:0x019c->B:157:0x024a BREAK  A[LOOP:9: B:145:0x0228->B:156:0x0247], PHI: r16 r19
  0x019c: PHI (r16v3 qo0) = (r16v1 qo0), (r16v1 qo0), (r16v1 qo0), (r16v1 qo0), (r16v1 qo0), (r16v4 qo0) binds: [B:186:0x019c, B:231:0x019c, B:151:0x023a, B:233:0x019c, B:143:0x0225, B:105:0x019a] A[DONT_GENERATE, DONT_INLINE]
  0x019c: PHI (r19v3 java.lang.String) = 
  (r19v1 java.lang.String)
  (r19v1 java.lang.String)
  (r19v1 java.lang.String)
  (r19v1 java.lang.String)
  (r19v1 java.lang.String)
  (r19v6 java.lang.String)
 binds: [B:186:0x019c, B:231:0x019c, B:151:0x023a, B:233:0x019c, B:143:0x0225, B:105:0x019a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:107:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:109:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:112:0x01af  */
    /* JADX WARN: Code duplicated, block: B:114:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:121:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:126:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:133:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:136:0x0205  */
    /* JADX WARN: Code duplicated, block: B:199:0x0098 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x005d  */
    /* JADX WARN: Code duplicated, block: B:206:0x0158 A[EDGE_INSN: B:206:0x0158->B:92:0x0158 BREAK  A[LOOP:3: B:87:0x0142->B:91:0x0150], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x01c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x01e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x01e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x01d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x01d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0144  */
    /* JADX WARN: Code duplicated, block: B:91:0x0150 A[LOOP:3: B:87:0x0142->B:91:0x0150, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:94:0x015c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    /* JADX INFO: renamed from: f */
    public final qo0 m7056f(InetSocketAddress inetSocketAddress, String str, String str2) {
        String strSubstring;
        String str3;
        qo0 qo0Var;
        Object lowerCase;
        int i;
        int i2;
        InetAddress byAddress;
        byte[] address;
        int i3;
        int i4;
        int i5;
        int i6;
        C1073lj c1073lj;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int iM2598a;
        int i13;
        C0082b0 c0082b0 = new C0082b0();
        c0082b0.f1103b = -1;
        c0082b0.f1104c = "https";
        String hostName = inetSocketAddress.getHostName();
        String str4 = "host == null";
        if (hostName == null) {
            f40.m2713i("host == null");
            return null;
        }
        int length = hostName.length();
        int i14 = 0;
        int iCharCount = 0;
        while (true) {
            if (iCharCount >= length) {
                strSubstring = hostName.substring(0, length);
                break;
            }
            if (hostName.charAt(iCharCount) == '%') {
                C1073lj c1073lj2 = new C1073lj();
                c1073lj2.m4196H(0, iCharCount, hostName);
                while (iCharCount < length) {
                    int iCodePointAt = hostName.codePointAt(iCharCount);
                    if (iCodePointAt != 37 || (i13 = iCharCount + 2) >= length) {
                        c1073lj2.m4198J(iCodePointAt);
                    } else {
                        int iM2598a2 = el0.m2598a(hostName.charAt(iCharCount + 1));
                        int iM2598a3 = el0.m2598a(hostName.charAt(i13));
                        if (iM2598a2 == -1 || iM2598a3 == -1) {
                            c1073lj2.m4198J(iCodePointAt);
                        } else {
                            c1073lj2.m4192D((iM2598a2 << 4) + iM2598a3);
                            iCharCount = i13;
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt);
                }
                strSubstring = c1073lj2.m4217x();
                break;
            }
            iCharCount++;
        }
        if (!strSubstring.startsWith("[") || !strSubstring.endsWith("]")) {
            str3 = "host == null";
            qo0Var = null;
            try {
                lowerCase = IDN.toASCII(strSubstring).toLowerCase(Locale.US);
                if (!lowerCase.isEmpty()) {
                    while (i < lowerCase.length()) {
                        char cCharAt = lowerCase.charAt(i);
                        i = (cCharAt > 31 && cCharAt < 127 && " #%/:?@[\\]".indexOf(cCharAt) == -1) ? i + 1 : 0;
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            lowerCase = qo0Var;
            break;
        }
        int length2 = strSubstring.length() - 1;
        int i15 = 16;
        byte[] bArr = new byte[16];
        int i16 = -1;
        int i17 = -1;
        int i18 = 0;
        int i19 = 1;
        qo0Var = null;
        while (true) {
            try {
                if (i19 < length2) {
                    if (i18 != i15) {
                        int i20 = i19 + 2;
                        if (i20 > length2 || !strSubstring.regionMatches(i19, "::", i14, 2)) {
                            if (i18 == 0) {
                                str3 = str4;
                                i10 = i19;
                                i11 = 0;
                                while (i10 < length2) {
                                    iM2598a = el0.m2598a(strSubstring.charAt(i10));
                                    if (iM2598a == -1) {
                                        break;
                                        break;
                                    }
                                    i11 = (i11 << 4) + iM2598a;
                                    i10++;
                                }
                                i12 = i10 - i19;
                                if (i12 == 0) {
                                }
                            } else if (strSubstring.regionMatches(i19, ":", i14, 1)) {
                                i19++;
                                str3 = str4;
                                i10 = i19;
                                i11 = 0;
                                while (i10 < length2) {
                                    iM2598a = el0.m2598a(strSubstring.charAt(i10));
                                    if (iM2598a == -1) {
                                        break;
                                    }
                                    i11 = (i11 << 4) + iM2598a;
                                    i10++;
                                }
                                i12 = i10 - i19;
                                if (i12 == 0 && i12 <= 4) {
                                    int i21 = i18 + 1;
                                    bArr[i18] = (byte) ((i11 >>> 8) & 255);
                                    i18 += 2;
                                    bArr[i21] = (byte) (i11 & 255);
                                    i17 = i19;
                                    i14 = 0;
                                    i15 = 16;
                                    i19 = i10;
                                    str4 = str3;
                                }
                            } else if (strSubstring.regionMatches(i19, ".", i14, 1)) {
                                int i22 = i18 - 2;
                                int i23 = i22;
                                int i24 = i17;
                                while (true) {
                                    if (i24 < length2) {
                                        if (i23 != 16) {
                                            if (i23 != i22) {
                                                if (strSubstring.charAt(i24) == '.') {
                                                    i24++;
                                                }
                                            }
                                            int i25 = i24;
                                            int i26 = 0;
                                            while (true) {
                                                int i27 = i22;
                                                if (i25 < length2) {
                                                    char cCharAt2 = strSubstring.charAt(i25);
                                                    str3 = str4;
                                                    if (cCharAt2 >= '0' && cCharAt2 <= '9') {
                                                        if ((i26 != 0 || i24 == i25) && (i26 = ((i26 * 10) + cCharAt2) - 48) <= 255) {
                                                            i25++;
                                                            i22 = i27;
                                                            str4 = str3;
                                                        }
                                                    }
                                                } else {
                                                    str3 = str4;
                                                }
                                                if (i25 - i24 != 0) {
                                                    bArr[i23] = (byte) i26;
                                                    i23++;
                                                    i24 = i25;
                                                    i22 = i27;
                                                    str4 = str3;
                                                }
                                            }
                                        }
                                        str3 = str4;
                                    } else {
                                        str3 = str4;
                                        if (i23 == i18 + 2) {
                                            i18 += 2;
                                            i2 = 16;
                                        }
                                        if (byAddress == null) {
                                            lowerCase = qo0Var;
                                            break;
                                        }
                                        address = byAddress.getAddress();
                                        i3 = 16;
                                        if (address.length != 16) {
                                            throw new AssertionError();
                                        }
                                        i4 = 0;
                                        i5 = -1;
                                        i6 = 0;
                                        while (i4 < address.length) {
                                            i8 = i4;
                                            while (i8 < i3 && address[i8] == 0 && address[i8 + 1] == 0) {
                                                i8 += 2;
                                                i3 = 16;
                                            }
                                            i9 = i8 - i4;
                                            if (i9 > i6) {
                                                i5 = i4;
                                                i6 = i9;
                                            }
                                            i4 = i8 + 2;
                                            i3 = 16;
                                        }
                                        c1073lj = new C1073lj();
                                        i7 = 0;
                                        while (i7 < address.length) {
                                            if (i7 == i5) {
                                                c1073lj.m4192D(58);
                                                i7 += i6;
                                                if (i7 == 16) {
                                                    c1073lj.m4192D(58);
                                                }
                                            } else {
                                                if (i7 > 0) {
                                                    c1073lj.m4192D(58);
                                                }
                                                c1073lj.m4193E(((address[i7] & 255) << 8) | (address[i7 + 1] & 255));
                                                i7 += 2;
                                            }
                                        }
                                        lowerCase = c1073lj.m4217x();
                                    }
                                }
                            }
                        } else if (i16 == -1) {
                            i18 += 2;
                            str3 = str4;
                            if (i20 == length2) {
                                i16 = i18;
                                i2 = 16;
                            } else {
                                i19 = i20;
                                i16 = i18;
                                i10 = i19;
                                i11 = 0;
                                while (i10 < length2) {
                                    iM2598a = el0.m2598a(strSubstring.charAt(i10));
                                    if (iM2598a == -1) {
                                        break;
                                        break;
                                    }
                                    i11 = (i11 << 4) + iM2598a;
                                    i10++;
                                }
                                i12 = i10 - i19;
                                if (i12 == 0) {
                                }
                            }
                        }
                        byAddress = null;
                        if (byAddress == null) {
                            lowerCase = qo0Var;
                            break;
                        }
                        address = byAddress.getAddress();
                        i3 = 16;
                        if (address.length != 16) {
                            throw new AssertionError();
                        }
                        i4 = 0;
                        i5 = -1;
                        i6 = 0;
                        while (i4 < address.length) {
                            i8 = i4;
                            while (i8 < i3) {
                                i8 += 2;
                                i3 = 16;
                            }
                            i9 = i8 - i4;
                            if (i9 > i6) {
                                i5 = i4;
                                i6 = i9;
                            }
                            i4 = i8 + 2;
                            i3 = 16;
                        }
                        c1073lj = new C1073lj();
                        i7 = 0;
                        while (i7 < address.length) {
                            if (i7 == i5) {
                                c1073lj.m4192D(58);
                                i7 += i6;
                                if (i7 == 16) {
                                    c1073lj.m4192D(58);
                                }
                            } else {
                                if (i7 > 0) {
                                    c1073lj.m4192D(58);
                                }
                                c1073lj.m4193E(((address[i7] & 255) << 8) | (address[i7 + 1] & 255));
                                i7 += 2;
                            }
                        }
                        lowerCase = c1073lj.m4217x();
                    }
                    str3 = str4;
                    byAddress = null;
                    if (byAddress == null) {
                        lowerCase = qo0Var;
                        break;
                    }
                    address = byAddress.getAddress();
                    i3 = 16;
                    if (address.length != 16) {
                        throw new AssertionError();
                    }
                    i4 = 0;
                    i5 = -1;
                    i6 = 0;
                    while (i4 < address.length) {
                        i8 = i4;
                        while (i8 < i3) {
                            i8 += 2;
                            i3 = 16;
                        }
                        i9 = i8 - i4;
                        if (i9 > i6) {
                            i5 = i4;
                            i6 = i9;
                        }
                        i4 = i8 + 2;
                        i3 = 16;
                    }
                    c1073lj = new C1073lj();
                    i7 = 0;
                    while (i7 < address.length) {
                        if (i7 == i5) {
                            c1073lj.m4192D(58);
                            i7 += i6;
                            if (i7 == 16) {
                                c1073lj.m4192D(58);
                            }
                        } else {
                            if (i7 > 0) {
                                c1073lj.m4192D(58);
                            }
                            c1073lj.m4193E(((address[i7] & 255) << 8) | (address[i7 + 1] & 255));
                            i7 += 2;
                        }
                    }
                    lowerCase = c1073lj.m4217x();
                } else {
                    str3 = str4;
                    i2 = i15;
                }
                if (i18 != i2) {
                    if (i16 == -1) {
                        byAddress = null;
                    } else {
                        int i28 = i18 - i16;
                        System.arraycopy(bArr, i16, bArr, 16 - i28, i28);
                        Arrays.fill(bArr, i16, (16 - i18) + i16, (byte) 0);
                    }
                    if (byAddress == null) {
                        lowerCase = qo0Var;
                        break;
                    }
                    address = byAddress.getAddress();
                    i3 = 16;
                    if (address.length != 16) {
                        throw new AssertionError();
                    }
                    i4 = 0;
                    i5 = -1;
                    i6 = 0;
                    while (i4 < address.length) {
                        i8 = i4;
                        while (i8 < i3) {
                            i8 += 2;
                            i3 = 16;
                        }
                        i9 = i8 - i4;
                        if (i9 > i6) {
                            i5 = i4;
                            i6 = i9;
                        }
                        i4 = i8 + 2;
                        i3 = 16;
                    }
                    c1073lj = new C1073lj();
                    i7 = 0;
                    while (i7 < address.length) {
                        if (i7 == i5) {
                            c1073lj.m4192D(58);
                            i7 += i6;
                            if (i7 == 16) {
                                c1073lj.m4192D(58);
                            }
                        } else {
                            if (i7 > 0) {
                                c1073lj.m4192D(58);
                            }
                            c1073lj.m4193E(((address[i7] & 255) << 8) | (address[i7 + 1] & 255));
                            i7 += 2;
                        }
                    }
                    lowerCase = c1073lj.m4217x();
                }
                byAddress = InetAddress.getByAddress(bArr);
                if (byAddress == null) {
                    lowerCase = qo0Var;
                    break;
                }
                address = byAddress.getAddress();
                i3 = 16;
                if (address.length != 16) {
                    throw new AssertionError();
                }
                i4 = 0;
                i5 = -1;
                i6 = 0;
                while (i4 < address.length) {
                    i8 = i4;
                    while (i8 < i3) {
                        i8 += 2;
                        i3 = 16;
                    }
                    i9 = i8 - i4;
                    if (i9 > i6) {
                        i5 = i4;
                        i6 = i9;
                    }
                    i4 = i8 + 2;
                    i3 = 16;
                }
                c1073lj = new C1073lj();
                i7 = 0;
                while (i7 < address.length) {
                    if (i7 == i5) {
                        c1073lj.m4192D(58);
                        i7 += i6;
                        if (i7 == 16) {
                            c1073lj.m4192D(58);
                        }
                    } else {
                        if (i7 > 0) {
                            c1073lj.m4192D(58);
                        }
                        c1073lj.m4193E(((address[i7] & 255) << 8) | (address[i7 + 1] & 255));
                        i7 += 2;
                    }
                }
                lowerCase = c1073lj.m4217x();
            } catch (UnknownHostException unused2) {
                throw new AssertionError();
            }
        }
        if (lowerCase == 0) {
            f40.m2713i("unexpected host: ".concat(hostName));
            return qo0Var;
        }
        c0082b0.f1105d = lowerCase;
        int port = inetSocketAddress.getPort();
        if (port <= 0 || port > 65535) {
            f40.m2713i(jd0.m3609g(port, "unexpected port: "));
            return qo0Var;
        }
        c0082b0.f1103b = port;
        if (((String) c0082b0.f1105d) == null) {
            f40.m2719o(str3);
            return qo0Var;
        }
        el0 el0Var = new el0(c0082b0);
        qo0 qo0Var2 = new qo0(14, false);
        qo0Var2.f9549c = new zj0(0);
        qo0Var2.f9548b = el0Var;
        qo0Var2.m5587J("Host", el0Var.f3380a + ":" + el0Var.f3381b);
        qo0Var2.m5587J("User-Agent", this.f12891c);
        if (str != null && str2 != null) {
            try {
                qo0Var2.m5587J("Proxy-Authorization", "Basic " + C0717hk.m3161h((str + ":" + str2).getBytes("ISO-8859-1")).mo3162a());
            } catch (UnsupportedEncodingException unused3) {
                throw new AssertionError();
            }
        }
        if (((el0) qo0Var2.f9548b) != null) {
            return new qo0(qo0Var2);
        }
        f40.m2719o("url == null");
        return qo0Var;
    }

    @Override // p000.uo0
    /* JADX INFO: renamed from: g */
    public final vo0 mo2579g() {
        return this.f12900l;
    }

    @Override // p000.InterfaceC0541cs
    public final C1437tb getAttributes() {
        return this.f12909u;
    }

    @Override // p000.yx0
    /* JADX INFO: renamed from: h */
    public final void mo2580h(nv1 nv1Var) {
        synchronized (this.f12899k) {
            try {
                if (this.f12910v != null) {
                    return;
                }
                this.f12910v = nv1Var;
                this.f12896h.m6743d(nv1Var);
                m7068u();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m7057i(int i, nv1 nv1Var, EnumC1376ro enumC1376ro, boolean z, b70 b70Var, j51 j51Var) {
        synchronized (this.f12899k) {
            try {
                v91 v91Var = (v91) this.f12902n.remove(Integer.valueOf(i));
                if (v91Var != null) {
                    if (b70Var != null) {
                        this.f12897i.m2734g(i, b70.CANCEL);
                    }
                    if (nv1Var != null) {
                        u91 u91Var = v91Var.f11594l;
                        if (j51Var == null) {
                            j51Var = new j51();
                        }
                        u91Var.m6422l(nv1Var, enumC1376ro, z, j51Var);
                    }
                    if (!m7066s()) {
                        m7068u();
                        m7062n(v91Var);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final ib1[] m7058j() {
        ib1[] ib1VarArr;
        ib1 ib1Var;
        synchronized (this.f12899k) {
            ib1VarArr = new ib1[this.f12902n.size()];
            Iterator it = this.f12902n.values().iterator();
            int i = 0;
            while (it.hasNext()) {
                int i2 = i + 1;
                u91 u91Var = ((v91) it.next()).f11594l;
                synchronized (u91Var.f11220v) {
                    ib1Var = u91Var.f11196I;
                }
                ib1VarArr[i] = ib1Var;
                i = i2;
            }
        }
        return ib1VarArr;
    }

    /* JADX INFO: renamed from: k */
    public final int m7059k() {
        URI uriM6629a = vi0.m6629a(this.f12890b);
        return uriM6629a.getPort() != -1 ? uriM6629a.getPort() : this.f12889a.getPort();
    }

    /* JADX INFO: renamed from: l */
    public final pv1 m7060l() {
        synchronized (this.f12899k) {
            try {
                nv1 nv1Var = this.f12910v;
                if (nv1Var != null) {
                    return new pv1(nv1Var);
                }
                return new pv1(nv1.f7559n.m4614g("Connection closed"));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000c  */
    /* JADX INFO: renamed from: m */
    public final boolean m7061m(int i) {
        boolean z;
        synchronized (this.f12899k) {
            if (i < this.f12901m) {
                z = true;
                if ((i & 1) != 1) {
                    z = false;
                }
            } else {
                z = false;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: n */
    public final void m7062n(v91 v91Var) {
        if (this.f12914z && this.f12877E.isEmpty() && this.f12902n.isEmpty()) {
            this.f12914z = false;
            vq0 vq0Var = this.f12879G;
            if (vq0Var != null) {
                synchronized (vq0Var) {
                    int i = vq0Var.f11746d;
                    if (i == 2 || i == 3) {
                        vq0Var.f11746d = 1;
                    }
                    if (vq0Var.f11746d == 4) {
                        vq0Var.f11746d = 5;
                    }
                }
            }
        }
        if (v91Var.f7159c) {
            this.f12886N.m2155h(v91Var, false);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m7063o(Exception exc) {
        m7065r(0, b70.INTERNAL_ERROR, nv1.f7559n.m4613f(exc));
    }

    /* JADX INFO: renamed from: q */
    public final void m7064q() {
        synchronized (this.f12899k) {
            try {
                f70 f70Var = this.f12897i;
                f70Var.getClass();
                try {
                    f70Var.f3648b.m7269d();
                } catch (IOException e) {
                    f70Var.f3647a.m7063o(e);
                }
                C1296pi c1296pi = new C1296pi(4, false);
                c1296pi.m5263k(7, this.f12894f);
                f70 f70Var2 = this.f12897i;
                f70Var2.f3649c.m5594Q(2, c1296pi);
                try {
                    f70Var2.f3648b.m7273l(c1296pi);
                } catch (IOException e2) {
                    f70Var2.f3647a.m7063o(e2);
                }
                int i = this.f12894f;
                if (i > 65535) {
                    this.f12897i.m2735j(0, i - 65535);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m7065r(int i, b70 b70Var, nv1 nv1Var) {
        synchronized (this.f12899k) {
            try {
                if (this.f12910v == null) {
                    this.f12910v = nv1Var;
                    this.f12896h.m6743d(nv1Var);
                }
                if (b70Var != null && !this.f12911w) {
                    this.f12911w = true;
                    this.f12897i.m2732d(b70Var, new byte[0]);
                }
                Iterator it = this.f12902n.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((Integer) entry.getKey()).intValue() > i) {
                        it.remove();
                        ((v91) entry.getValue()).f11594l.m6422l(nv1Var, EnumC1376ro.f10080b, false, new j51());
                        m7062n((v91) entry.getValue());
                    }
                }
                for (v91 v91Var : this.f12877E) {
                    v91Var.f11594l.m6422l(nv1Var, EnumC1376ro.f10082d, true, new j51());
                    m7062n(v91Var);
                }
                this.f12877E.clear();
                m7068u();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final boolean m7066s() {
        boolean z = false;
        while (true) {
            LinkedList linkedList = this.f12877E;
            if (linkedList.isEmpty() || this.f12902n.size() >= this.f12876D) {
                break;
            }
            m7067t((v91) linkedList.poll());
            z = true;
        }
        return z;
    }

    /* JADX INFO: renamed from: t */
    public final void m7067t(v91 v91Var) {
        boolean zM6419i;
        p32.m5193x(v91Var.f11594l.f11197J == -1, "StreamId already assigned");
        this.f12902n.put(Integer.valueOf(this.f12901m), v91Var);
        if (!this.f12914z) {
            this.f12914z = true;
            vq0 vq0Var = this.f12879G;
            if (vq0Var != null) {
                vq0Var.m6652b();
            }
        }
        if (v91Var.f7159c) {
            this.f12886N.m2155h(v91Var, true);
        }
        u91 u91Var = v91Var.f11594l;
        int i = this.f12901m;
        if (!(u91Var.f11197J == -1)) {
            f40.m2719o(p32.m5153T("the stream has been started with id %s", Integer.valueOf(i)));
            return;
        }
        u91Var.f11197J = i;
        l81 l81Var = u91Var.f11192E;
        u91Var.f11196I = new ib1(l81Var, i, l81Var.f6260a, u91Var);
        u91 u91Var2 = u91Var.f11198K.f11594l;
        p32.m5192w(u91Var2.f11208j != null);
        synchronized (u91Var2.f11200b) {
            p32.m5193x(!u91Var2.f11204f, "Already allocated");
            u91Var2.f11204f = true;
        }
        synchronized (u91Var2.f11200b) {
            zM6419i = u91Var2.m6419i();
        }
        if (zM6419i) {
            u91Var2.f11208j.mo4768p();
        }
        C0558d8 c0558d8 = u91Var2.f11201c;
        c0558d8.getClass();
        ((bz1) c0558d8.f2821b).m1083f();
        if (u91Var.f11194G) {
            f70 f70Var = u91Var.f11191D;
            boolean z = u91Var.f11198K.f11597o;
            int i2 = u91Var.f11197J;
            ArrayList arrayList = u91Var.f11221w;
            f70Var.getClass();
            try {
                vk0 vk0Var = f70Var.f3648b.f13321a;
                synchronized (vk0Var) {
                    if (vk0Var.f11697e) {
                        throw new IOException("closed");
                    }
                    vk0Var.m6640d(i2, arrayList, z);
                }
            } catch (IOException e) {
                f70Var.f3647a.m7063o(e);
            }
            for (rc2 rc2Var : u91Var.f11198K.f11592j.f6043a) {
                rc2Var.mo4522a0();
            }
            u91Var.f11221w = null;
            C1073lj c1073lj = u91Var.f11222x;
            if (c1073lj.f6361b > 0) {
                u91Var.f11192E.m4142b(u91Var.f11223y, u91Var.f11196I, c1073lj, u91Var.f11224z);
            }
            u91Var.f11194G = false;
        }
        t51 t51Var = v91Var.f11590h.f11125a;
        if ((t51Var != t51.f10762a && t51Var != t51.f10763b) || v91Var.f11597o) {
            this.f12897i.flush();
        }
        int i3 = this.f12901m;
        if (i3 < 2147483645) {
            this.f12901m = i3 + 2;
        } else {
            this.f12901m = Integer.MAX_VALUE;
            m7065r(Integer.MAX_VALUE, b70.NO_ERROR, nv1.f7559n.m4614g("Stream ids exhausted"));
        }
    }

    public final String toString() {
        C1679zv c1679zvM5176k0 = p32.m5176k0(this);
        c1679zvM5176k0.m7360b("logId", this.f12900l.f11731c);
        c1679zvM5176k0.m7359a(this.f12889a, "address");
        return c1679zvM5176k0.toString();
    }

    /* JADX INFO: renamed from: u */
    public final void m7068u() {
        if (this.f12910v == null || !this.f12902n.isEmpty() || !this.f12877E.isEmpty() || this.f12913y) {
            return;
        }
        this.f12913y = true;
        vq0 vq0Var = this.f12879G;
        if (vq0Var != null) {
            synchronized (vq0Var) {
                try {
                    if (vq0Var.f11746d != 6) {
                        vq0Var.f11746d = 6;
                        ScheduledFuture scheduledFuture = vq0Var.f11747e;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(false);
                        }
                        ScheduledFuture scheduledFuture2 = vq0Var.f11748f;
                        if (scheduledFuture2 != null) {
                            scheduledFuture2.cancel(false);
                            vq0Var.f11748f = null;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        yk0 yk0Var = this.f12912x;
        if (yk0Var != null) {
            pv1 pv1VarM7060l = m7060l();
            synchronized (yk0Var) {
                try {
                    if (!yk0Var.f13004d) {
                        yk0Var.f13004d = true;
                        yk0Var.f13005e = pv1VarM7060l;
                        LinkedHashMap linkedHashMap = yk0Var.f13003c;
                        yk0Var.f13003c = null;
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            try {
                                ((Executor) entry.getValue()).execute(new xk0((uq0) entry.getKey(), pv1VarM7060l));
                            } catch (Throwable th2) {
                                yk0.f13000g.log(Level.SEVERE, "Failed to execute PingCallback", th2);
                            }
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            this.f12912x = null;
        }
        if (!this.f12911w) {
            this.f12911w = true;
            this.f12897i.m2732d(b70.NO_ERROR, new byte[0]);
        }
        this.f12897i.close();
    }
}
