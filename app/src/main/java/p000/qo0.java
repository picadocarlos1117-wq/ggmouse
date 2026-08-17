package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC0068g;
import com.example.ssmousepro.injection.InjectionMetrics;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class qo0 implements InterfaceC1413so, InterfaceC0604ei, z01, gq1, ha1, yx1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9547a;

    /* JADX INFO: renamed from: b */
    public Object f9548b;

    /* JADX INFO: renamed from: c */
    public Object f9549c;

    public qo0(int i) {
        this.f9547a = i;
        switch (i) {
            case 11:
                this.f9548b = new AtomicLong();
                this.f9549c = new AtomicLong();
                break;
            case 20:
                this.f9548b = new rn1(128);
                this.f9549c = new rn1(256);
                break;
            case InjectionMetrics.I_TAP_ID_EXHAUST /* 27 */:
                this.f9548b = new zs1();
                this.f9549c = new ew0();
                break;
            case 29:
                this.f9548b = new dc1();
                this.f9549c = new h92();
                break;
            default:
                Level level = Level.FINE;
                Logger logger = Logger.getLogger(y91.class.getName());
                p32.m5188s(level, FirebaseAnalytics.Param.LEVEL);
                this.f9549c = level;
                p32.m5188s(logger, "logger");
                this.f9548b = logger;
                break;
        }
    }

    /* JADX INFO: renamed from: V */
    public static qo0 m5576V(char c) {
        return new qo0(17, new pn0(new C1633ym(c)), C0024an.f273b);
    }

    /* JADX INFO: renamed from: b0 */
    public static String m5577b0(C1073lj c1073lj) {
        long j = c1073lj.f6361b;
        if (j <= 64) {
            return c1073lj.m4218y().mo3165e();
        }
        return c1073lj.m4219z((int) Math.min(j, 64L)).mo3165e() + "...";
    }

    /* JADX INFO: renamed from: A */
    public void m5578A(AbstractC0068g abstractC0068g, g21 g21Var) {
        zs1 zs1Var = (zs1) this.f9548b;
        p72 p72VarM5229a = (p72) zs1Var.getOrDefault(abstractC0068g, null);
        if (p72VarM5229a == null) {
            p72VarM5229a = p72.m5229a();
            zs1Var.put(abstractC0068g, p72VarM5229a);
        }
        p72VarM5229a.f8790c = g21Var;
        p72VarM5229a.f8788a |= 8;
    }

    /* JADX INFO: renamed from: B */
    public void m5579B() {
        ((qy1) this.f9548b).f9607b = true;
        ((ScheduledFuture) this.f9549c).cancel(false);
    }

    /* JADX INFO: renamed from: C */
    public void m5580C() {
        int[] iArr = (int[]) this.f9548b;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f9549c = null;
    }

    /* JADX INFO: renamed from: D */
    public void m5581D(long j, dc1 dc1Var) {
        if (dc1Var.m2318a() < 9) {
            return;
        }
        int iM2324g = dc1Var.m2324g();
        int iM2324g2 = dc1Var.m2324g();
        int iM2337t = dc1Var.m2337t();
        if (iM2324g == 434 && iM2324g2 == 1195456820 && iM2337t == 3) {
            ki0.m3870p(j, dc1Var, (c22[]) this.f9549c);
        }
    }

    /* JADX INFO: renamed from: E */
    public void m5582E(z80 z80Var, qk0 qk0Var) {
        c22[] c22VarArr = (c22[]) this.f9549c;
        for (int i = 0; i < c22VarArr.length; i++) {
            qk0Var.m5498a();
            qk0Var.m5500c();
            c22 c22VarMo750n = z80Var.mo750n(qk0Var.f9521c, 3);
            be0 be0Var = (be0) ((List) this.f9548b).get(i);
            String str = be0Var.f1341n;
            ki0.m3859d("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: " + str);
            ae0 ae0Var = new ae0();
            qk0Var.m5500c();
            ae0Var.f185a = (String) qk0Var.f9523e;
            ae0Var.f197m = v51.m6582l(str);
            ae0Var.f189e = be0Var.f1332e;
            ae0Var.f188d = be0Var.f1331d;
            ae0Var.f180G = be0Var.f1322H;
            ae0Var.f200p = be0Var.f1344q;
            c22VarMo750n.mo1117d(new be0(ae0Var));
            c22VarArr[i] = c22VarMo750n;
        }
    }

    /* JADX INFO: renamed from: F */
    public void m5583F(int i) {
        int[] iArr = (int[]) this.f9548b;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.f9548b = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f9548b = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f9548b;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    /* JADX INFO: renamed from: G */
    public View m5584G(int i, int i2, int i3, int i4) {
        View viewM677u;
        vu1 vu1Var = (vu1) this.f9549c;
        kj1 kj1Var = (kj1) this.f9548b;
        int iM3893d = kj1Var.m3893d();
        int iM3892c = kj1Var.m3892c();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            switch (kj1Var.f5887a) {
                case 0:
                    viewM677u = kj1Var.f5888b.m677u(i);
                    break;
                default:
                    viewM677u = kj1Var.f5888b.m677u(i);
                    break;
            }
            int iM3891b = kj1Var.m3891b(viewM677u);
            int iM3890a = kj1Var.m3890a(viewM677u);
            vu1Var.f11771b = iM3893d;
            vu1Var.f11772c = iM3892c;
            vu1Var.f11773d = iM3891b;
            vu1Var.f11774e = iM3890a;
            if (i3 != 0) {
                vu1Var.f11770a = i3;
                if (vu1Var.m6661a()) {
                    return viewM677u;
                }
            }
            if (i4 != 0) {
                vu1Var.f11770a = i4;
                if (vu1Var.m6661a()) {
                    view = viewM677u;
                }
            }
            i += i5;
        }
        return view;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0046  */
    /* JADX WARN: Code duplicated, block: B:20:0x0059  */
    /* JADX INFO: renamed from: H */
    public CctBackendFactory m5585H(String str) {
        Bundle bundle;
        Map map;
        Object obj;
        if (((Map) this.f9549c) == null) {
            Context context = (Context) this.f9548b;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                } else {
                    ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                    if (serviceInfo == null) {
                        Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                    } else {
                        bundle = serviceInfo.metaData;
                    }
                    if (bundle == null) {
                        Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                        map = Collections.EMPTY_MAP;
                    } else {
                        HashMap map2 = new HashMap();
                        for (String str2 : bundle.keySet()) {
                            obj = bundle.get(str2);
                            if (!(obj instanceof String) && str2.startsWith("backend:")) {
                                for (String str3 : ((String) obj).split(",", -1)) {
                                    String strTrim = str3.trim();
                                    if (!strTrim.isEmpty()) {
                                        map2.put(strTrim, str2.substring(8));
                                    }
                                }
                            }
                        }
                        map = map2;
                    }
                    this.f9549c = map;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
            }
            bundle = null;
            if (bundle == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                map = Collections.EMPTY_MAP;
            } else {
                HashMap map3 = new HashMap();
                while (r6.hasNext()) {
                    obj = bundle.get(str2);
                    if (!(obj instanceof String)) {
                    }
                }
                map = map3;
            }
            this.f9549c = map;
        }
        String str4 = (String) ((Map) this.f9549c).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            Log.w("BackendRegistry", "Class " + str4 + " is not found.", e);
            return null;
        } catch (IllegalAccessException e2) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e2);
            return null;
        } catch (InstantiationException e3) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e3);
            return null;
        } catch (NoSuchMethodException e4) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e4);
            return null;
        } catch (InvocationTargetException e5) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e5);
            return null;
        }
    }

    /* JADX INFO: renamed from: I */
    public List m5586I() {
        if (((wy0) this.f9549c) == null) {
            this.f9549c = new wy0(this);
        }
        wy0 wy0Var = (wy0) this.f9549c;
        wy0Var.getClass();
        return wy0Var;
    }

    /* JADX INFO: renamed from: J */
    public void m5587J(String str, String str2) {
        ArrayList arrayList = ((zj0) this.f9549c).f13431b;
        if (str.isEmpty()) {
            f40.m2713i("name is empty");
            return;
        }
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt <= 31 || cCharAt >= 127) {
                f40.m2713i(String.format(Locale.US, "Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i2), str));
                return;
            }
        }
        if (str2 == null) {
            f40.m2713i("value == null");
            return;
        }
        int length2 = str2.length();
        for (int i3 = 0; i3 < length2; i3++) {
            char cCharAt2 = str2.charAt(i3);
            if (cCharAt2 <= 31 || cCharAt2 >= 127) {
                f40.m2713i(String.format(Locale.US, "Unexpected char %#04x at %d in header value: %s", Integer.valueOf(cCharAt2), Integer.valueOf(i3), str2));
                return;
            }
        }
        while (i < arrayList.size()) {
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
        arrayList.add(str);
        arrayList.add(str2.trim());
    }

    /* JADX INFO: renamed from: K */
    public boolean m5588K() {
        return ((Logger) this.f9548b).isLoggable((Level) this.f9549c);
    }

    /* JADX INFO: renamed from: L */
    public boolean m5589L(View view) {
        vu1 vu1Var = (vu1) this.f9549c;
        kj1 kj1Var = (kj1) this.f9548b;
        int iM3893d = kj1Var.m3893d();
        int iM3892c = kj1Var.m3892c();
        int iM3891b = kj1Var.m3891b(view);
        int iM3890a = kj1Var.m3890a(view);
        vu1Var.f11771b = iM3893d;
        vu1Var.f11772c = iM3892c;
        vu1Var.f11773d = iM3891b;
        vu1Var.f11774e = iM3890a;
        vu1Var.f11770a = 24579;
        return vu1Var.m6661a();
    }

    /* JADX INFO: renamed from: M */
    public void m5590M(int i, int i2, C1073lj c1073lj, int i3, boolean z) {
        if (m5588K()) {
            ((Logger) this.f9548b).log((Level) this.f9549c, jd0.m3601B(i) + " DATA: streamId=" + i2 + " endStream=" + z + " length=" + i3 + " bytes=" + m5577b0(c1073lj));
        }
    }

    /* JADX INFO: renamed from: N */
    public void m5591N(int i, int i2, b70 b70Var, C0717hk c0717hk) {
        if (m5588K()) {
            Logger logger = (Logger) this.f9548b;
            Level level = (Level) this.f9549c;
            StringBuilder sb = new StringBuilder();
            sb.append(jd0.m3601B(i));
            sb.append(" GO_AWAY: lastStreamId=");
            sb.append(i2);
            sb.append(" errorCode=");
            sb.append(b70Var);
            sb.append(" length=");
            sb.append(c0717hk.mo3164d());
            sb.append(" bytes=");
            C1073lj c1073lj = new C1073lj();
            c1073lj.m4190B(c0717hk);
            sb.append(m5577b0(c1073lj));
            logger.log(level, sb.toString());
        }
    }

    /* JADX INFO: renamed from: O */
    public void m5592O(int i, long j) {
        if (m5588K()) {
            ((Logger) this.f9548b).log((Level) this.f9549c, jd0.m3601B(i) + " PING: ack=false bytes=" + j);
        }
    }

    /* JADX INFO: renamed from: P */
    public void m5593P(int i, int i2, b70 b70Var) {
        if (m5588K()) {
            ((Logger) this.f9548b).log((Level) this.f9549c, jd0.m3601B(i) + " RST_STREAM: streamId=" + i2 + " errorCode=" + b70Var);
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m5594Q(int i, C1296pi c1296pi) {
        if (m5588K()) {
            Logger logger = (Logger) this.f9548b;
            Level level = (Level) this.f9549c;
            StringBuilder sb = new StringBuilder();
            sb.append(jd0.m3601B(i));
            sb.append(" SETTINGS: ack=false settings=");
            EnumMap enumMap = new EnumMap(z91.class);
            for (z91 z91Var : z91.values()) {
                if (c1296pi.m5261g(z91Var.f13320a)) {
                    enumMap.put(z91Var, Integer.valueOf(((int[]) c1296pi.f8902b)[z91Var.f13320a]));
                }
            }
            sb.append(enumMap.toString());
            logger.log(level, sb.toString());
        }
    }

    /* JADX INFO: renamed from: R */
    public void m5595R(int i, int i2, long j) {
        if (m5588K()) {
            ((Logger) this.f9548b).log((Level) this.f9549c, jd0.m3601B(i) + " WINDOW_UPDATE: streamId=" + i2 + " windowSizeIncrement=" + j);
        }
    }

    /* JADX INFO: renamed from: S */
    public void m5596S(byte[] bArr) {
        long[] jArr = ((long[][]) this.f9549c)[bArr[15] & 255];
        long j = jArr[0];
        long j2 = jArr[1];
        for (int i = 14; i >= 0; i--) {
            long[] jArr2 = ((long[][]) this.f9549c)[bArr[i] & 255];
            long j3 = j2 << 56;
            j2 = ((j2 >>> 8) | (j << 56)) ^ jArr2[1];
            j = (((((j >>> 8) ^ jArr2[0]) ^ j3) ^ (j3 >>> 1)) ^ (j3 >>> 2)) ^ (j3 >>> 7);
        }
        sc2.m6034D(bArr, j, 0);
        sc2.m6034D(bArr, j2, 8);
    }

    /* JADX INFO: renamed from: T */
    public void m5597T(int i, int i2) {
        int[] iArr = (int[]) this.f9548b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        m5583F(i3);
        int[] iArr2 = (int[]) this.f9548b;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill((int[]) this.f9548b, i, i3, -1);
        ArrayList arrayList = (ArrayList) this.f9549c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            cv1 cv1Var = (cv1) ((ArrayList) this.f9549c).get(size);
            int i4 = cv1Var.f2645a;
            if (i4 >= i) {
                cv1Var.f2645a = i4 + i2;
            }
        }
    }

    /* JADX INFO: renamed from: U */
    public void m5598U(int i, int i2) {
        int[] iArr = (int[]) this.f9548b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        m5583F(i3);
        int[] iArr2 = (int[]) this.f9548b;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = (int[]) this.f9548b;
        Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f9549c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            cv1 cv1Var = (cv1) ((ArrayList) this.f9549c).get(size);
            int i4 = cv1Var.f2645a;
            if (i4 >= i) {
                if (i4 < i3) {
                    ((ArrayList) this.f9549c).remove(size);
                } else {
                    cv1Var.f2645a = i4 - i2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: W */
    public g21 m5599W(AbstractC0068g abstractC0068g, int i) {
        p72 p72Var;
        g21 g21Var;
        zs1 zs1Var = (zs1) this.f9548b;
        int iM7347e = zs1Var.m7347e(abstractC0068g);
        if (iM7347e >= 0 && (p72Var = (p72) zs1Var.m7352j(iM7347e)) != null) {
            int i2 = p72Var.f8788a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                p72Var.f8788a = i3;
                if (i == 4) {
                    g21Var = p72Var.f8789b;
                } else if (i == 8) {
                    g21Var = p72Var.f8790c;
                } else {
                    f40.m2713i("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    zs1Var.m7351i(iM7347e);
                    p72Var.f8788a = 0;
                    p72Var.f8789b = null;
                    p72Var.f8790c = null;
                    p72.f8787d.mo3824c(p72Var);
                }
                return g21Var;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: X */
    public void m5600X(AbstractC0068g abstractC0068g) {
        p72 p72Var = (p72) ((zs1) this.f9548b).getOrDefault(abstractC0068g, null);
        if (p72Var == null) {
            return;
        }
        p72Var.f8788a &= -2;
    }

    /* JADX INFO: renamed from: Y */
    public void m5601Y(AbstractC0068g abstractC0068g) {
        ew0 ew0Var = (ew0) this.f9549c;
        for (int iM2649e = ew0Var.m2649e() - 1; iM2649e >= 0; iM2649e--) {
            if (abstractC0068g == ew0Var.m2650f(iM2649e)) {
                Object[] objArr = ew0Var.f3457c;
                Object obj = objArr[iM2649e];
                Object obj2 = ew0.f3454e;
                if (obj == obj2) {
                    break;
                }
                objArr[iM2649e] = obj2;
                ew0Var.f3455a = true;
                break;
            }
        }
        p72 p72Var = (p72) ((zs1) this.f9548b).remove(abstractC0068g);
        if (p72Var != null) {
            p72Var.f8788a = 0;
            p72Var.f8789b = null;
            p72Var.f8790c = null;
            p72.f8787d.mo3824c(p72Var);
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m5602Z(r81 r81Var) {
        if (((r81) this.f9548b) != r81Var) {
            this.f9548b = r81Var;
            if (r81Var.f9818j != this) {
                r81Var.f9818j = this;
                m5602Z(r81Var);
            }
        }
    }

    @Override // p000.gq1
    /* JADX INFO: renamed from: a */
    public void mo3050a(dc1 dc1Var) {
        g32 g32Var = (g32) this.f9549c;
        SparseArray sparseArray = g32Var.f4049g;
        C0141cm c0141cm = (C0141cm) this.f9548b;
        if (dc1Var.m2337t() == 0 && (dc1Var.m2337t() & 128) != 0) {
            dc1Var.m2317G(6);
            int iM2318a = dc1Var.m2318a() / 4;
            for (int i = 0; i < iM2318a; i++) {
                dc1Var.m2322e(0, 4, c0141cm.f1858b);
                c0141cm.m1246q(0);
                int iM1238i = c0141cm.m1238i(16);
                c0141cm.m1249t(3);
                if (iM1238i == 0) {
                    c0141cm.m1249t(13);
                } else {
                    int iM1238i2 = c0141cm.m1238i(13);
                    if (sparseArray.get(iM1238i2) == null) {
                        sparseArray.put(iM1238i2, new hq1(new j22(g32Var, iM1238i2)));
                        g32Var.f4055m++;
                    }
                }
            }
            sparseArray.remove(0);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public List m5603a0(CharSequence charSequence) {
        charSequence.getClass();
        uu1 uu1Var = new uu1((pn0) this.f9549c, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (uu1Var.hasNext()) {
            arrayList.add((String) uu1Var.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00ea  */
    @Override // p000.InterfaceC0604ei
    /* JADX INFO: renamed from: c */
    public C0568di mo802c(y80 y80Var, long j) {
        int iM7275a;
        long position = y80Var.getPosition();
        int iMin = (int) Math.min(20000L, y80Var.mo2420i() - position);
        dc1 dc1Var = (dc1) this.f9549c;
        dc1Var.m2313C(iMin);
        y80Var.mo2413a(0, iMin, dc1Var.f2882a);
        int i = -1;
        int i2 = -1;
        long j2 = -9223372036854775807L;
        while (dc1Var.m2318a() >= 4) {
            if (za0.m7275a(dc1Var.f2883b, dc1Var.f2882a) != 442) {
                dc1Var.m2317G(1);
            } else {
                dc1Var.m2317G(4);
                long jM6281c = th1.m6281c(dc1Var);
                if (jM6281c != -9223372036854775807L) {
                    long jM6984b = ((y02) this.f9548b).m6984b(jM6281c);
                    if (jM6984b > j) {
                        return j2 == -9223372036854775807L ? new C0568di(jM6984b, position, -1) : new C0568di(-9223372036854775807L, position + ((long) i2), 0);
                    }
                    long j3 = jM6984b + 100000;
                    int i3 = dc1Var.f2883b;
                    if (j3 > j) {
                        return new C0568di(-9223372036854775807L, position + ((long) i3), 0);
                    }
                    i2 = i3;
                    j2 = jM6984b;
                }
                int i4 = dc1Var.f2884c;
                if (dc1Var.m2318a() >= 10) {
                    dc1Var.m2317G(9);
                    int iM2337t = dc1Var.m2337t() & 7;
                    if (dc1Var.m2318a() >= iM2337t) {
                        dc1Var.m2317G(iM2337t);
                        if (dc1Var.m2318a() >= 4) {
                            if (za0.m7275a(dc1Var.f2883b, dc1Var.f2882a) != 443) {
                                while (dc1Var.m2318a() >= 4) {
                                    iM7275a = za0.m7275a(dc1Var.f2883b, dc1Var.f2882a);
                                    if (iM7275a == 442) {
                                        break;
                                    }
                                    break;
                                }
                            }
                            dc1Var.m2317G(4);
                            int iM2343z = dc1Var.m2343z();
                            if (dc1Var.m2318a() < iM2343z) {
                                dc1Var.m2316F(i4);
                            } else {
                                dc1Var.m2317G(iM2343z);
                                while (dc1Var.m2318a() >= 4) {
                                    iM7275a = za0.m7275a(dc1Var.f2883b, dc1Var.f2882a);
                                    if (iM7275a == 442 || iM7275a == 441 || (iM7275a >>> 8) != 1) {
                                        break;
                                    }
                                    dc1Var.m2317G(4);
                                    if (dc1Var.m2318a() < 2) {
                                        dc1Var.m2316F(i4);
                                        break;
                                    }
                                    dc1Var.m2316F(Math.min(dc1Var.f2884c, dc1Var.f2883b + dc1Var.m2343z()));
                                }
                            }
                        } else {
                            dc1Var.m2316F(i4);
                        }
                    } else {
                        dc1Var.m2316F(i4);
                    }
                } else {
                    dc1Var.m2316F(i4);
                }
                i = dc1Var.f2883b;
            }
        }
        return j2 != -9223372036854775807L ? new C0568di(j2, position + ((long) i), -2) : C0568di.f2932d;
    }

    @Override // p000.z01
    /* JADX INFO: renamed from: d */
    public void mo4168d(int i) {
        ((MediaCodec) this.f9548b).releaseOutputBuffer(i, false);
    }

    @Override // p000.InterfaceC1413so
    /* JADX INFO: renamed from: f */
    public void mo4761f(j51 j51Var) {
        int i;
        int i2;
        switch (this.f9547a) {
            case 2:
                ((InterfaceC1413so) this.f9548b).mo4761f(j51Var);
                break;
            default:
                if (((nm1) this.f9548b).f7453d > 0) {
                    d51 d51Var = dx0.f3038E;
                    j51Var.m3561a(d51Var);
                    j51Var.m3566f(d51Var, String.valueOf(((nm1) this.f9548b).f7453d));
                }
                dx0 dx0Var = (dx0) this.f9549c;
                nm1 nm1Var = (nm1) this.f9548b;
                d51 d51Var2 = dx0.f3038E;
                zl1 zl1VarM2394p = dx0Var.m2394p(nm1Var);
                if (zl1VarM2394p != null) {
                    dx0Var.f3047b.execute(zl1VarM2394p);
                }
                if (((dx0) this.f9549c).f3060o.f5908f == ((nm1) this.f9548b)) {
                    om1 om1Var = ((dx0) this.f9549c).f3058m;
                    if (om1Var != null) {
                        AtomicInteger atomicInteger = om1Var.f8407d;
                        do {
                            i = atomicInteger.get();
                            i2 = om1Var.f8404a;
                            if (i == i2) {
                            }
                        } while (!atomicInteger.compareAndSet(i, Math.min(om1Var.f8406c + i, i2)));
                    }
                    ((dx0) this.f9549c).f3048c.execute(new im1(1, this, j51Var));
                }
                break;
        }
    }

    @Override // p000.z01
    public void flush() {
        ((MediaCodec) this.f9548b).flush();
    }

    @Override // p000.z01
    /* JADX INFO: renamed from: g */
    public MediaFormat mo4170g() {
        return ((MediaCodec) this.f9548b).getOutputFormat();
    }

    @Override // p000.z01
    /* JADX INFO: renamed from: h */
    public void mo4171h() {
        ((MediaCodec) this.f9548b).detachOutputSurface();
    }

    @Override // p000.z01
    /* JADX INFO: renamed from: i */
    public void mo4172i(Bundle bundle) {
        ((MediaCodec) this.f9548b).setParameters(bundle);
    }

    @Override // p000.z01
    /* JADX INFO: renamed from: j */
    public void mo4173j(int i, long j) {
        ((MediaCodec) this.f9548b).releaseOutputBuffer(i, j);
    }

    @Override // p000.z01
    /* JADX INFO: renamed from: k */
    public int mo4174k() {
        return ((MediaCodec) this.f9548b).dequeueInputBuffer(0L);
    }

    @Override // p000.z01
    /* JADX INFO: renamed from: l */
    public void mo4175l(o11 o11Var, Handler handler) {
        ((MediaCodec) this.f9548b).setOnFrameRenderedListener(new C0784jb(this, o11Var, 1), handler);
    }

    @Override // p000.z01
    /* JADX INFO: renamed from: n */
    public void mo4176n(int i, C0580dv c0580dv, long j, int i2) {
        ((MediaCodec) this.f9548b).queueSecureInputBuffer(i, 0, c0580dv.f3022i, j, i2);
    }

    @Override // p000.z01
    /* JADX INFO: renamed from: o */
    public int mo4177o(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = ((MediaCodec) this.f9548b).dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // p000.InterfaceC1413so
    /* JADX INFO: renamed from: p */
    public void mo4768p() {
        switch (this.f9547a) {
            case 2:
                ((InterfaceC1413so) this.f9548b).mo4768p();
                break;
            default:
                dx0 dx0Var = (dx0) this.f9549c;
                if (dx0Var.mo1026b()) {
                    dx0Var.f3048c.execute(new mm1(this, 1));
                    break;
                }
                break;
        }
    }

    @Override // p000.z01
    /* JADX INFO: renamed from: q */
    public void mo4178q(int i) {
        ((MediaCodec) this.f9548b).setVideoScalingMode(i);
    }

    /* JADX WARN: Code duplicated, block: B:120:0x0232  */
    /* JADX WARN: Code duplicated, block: B:129:0x0253  */
    /* JADX WARN: Code duplicated, block: B:130:0x025e  */
    /* JADX WARN: Code duplicated, block: B:132:0x0267  */
    /* JADX WARN: Code duplicated, block: B:133:0x0271  */
    /* JADX WARN: Code duplicated, block: B:135:0x0279  */
    /* JADX WARN: Code duplicated, block: B:137:0x0281  */
    /* JADX WARN: Code duplicated, block: B:138:0x0285  */
    /* JADX WARN: Code duplicated, block: B:140:0x028d  */
    /* JADX WARN: Code duplicated, block: B:141:0x0294  */
    /* JADX WARN: Code duplicated, block: B:143:0x029c  */
    /* JADX WARN: Code duplicated, block: B:149:0x02af  */
    /* JADX WARN: Code duplicated, block: B:151:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:153:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:155:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:156:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:158:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:159:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:161:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:163:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:164:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:166:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:168:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:170:0x0302  */
    /* JADX WARN: Code duplicated, block: B:172:0x030a  */
    /* JADX WARN: Code duplicated, block: B:174:0x031a  */
    /* JADX WARN: Code duplicated, block: B:175:0x0334  */
    /* JADX WARN: Code duplicated, block: B:178:0x0345  */
    /* JADX WARN: Code duplicated, block: B:181:0x034e  */
    /* JADX WARN: Code duplicated, block: B:182:0x0350  */
    /* JADX WARN: Code duplicated, block: B:185:0x0359  */
    /* JADX WARN: Code duplicated, block: B:186:0x035b  */
    /* JADX WARN: Code duplicated, block: B:189:0x0364  */
    /* JADX WARN: Code duplicated, block: B:193:0x036c  */
    /* JADX WARN: Code duplicated, block: B:194:0x0371  */
    /* JADX WARN: Code duplicated, block: B:195:0x0376  */
    /* JADX WARN: Code duplicated, block: B:197:0x0389  */
    /* JADX WARN: Code duplicated, block: B:238:0x0368 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00ae  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Instruction removed from duplicated block: B:174:0x031a, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v16 */
    @Override // p000.yx1
    /* JADX INFO: renamed from: r */
    public void mo875r(byte[] bArr, int i, int i2, xx1 xx1Var, InterfaceC0578dt interfaceC0578dt) {
        j92 j92VarM4782d;
        String strTrim;
        int i3;
        String string;
        int i4;
        Matcher matcher;
        String strGroup;
        byte b;
        boolean z;
        qo0 qo0Var = this;
        dc1 dc1Var = (dc1) qo0Var.f9548b;
        dc1Var.m2314D(i + i2, bArr);
        dc1Var.m2316F(i);
        ArrayList arrayList = new ArrayList();
        try {
            p92.m5237c(dc1Var);
            while (!TextUtils.isEmpty(dc1Var.m2325h(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                boolean z2 = false;
                int i5 = -1;
                int i6 = 0;
                byte b2 = -1;
                while (true) {
                    int i7 = 1;
                    if (b2 == -1) {
                        i6 = dc1Var.f2883b;
                        String strM2325h = dc1Var.m2325h(StandardCharsets.UTF_8);
                        if (strM2325h == null) {
                            b2 = 0;
                        } else if ("STYLE".equals(strM2325h)) {
                            b2 = 2;
                        } else {
                            b2 = strM2325h.startsWith("NOTE") ? (byte) 1 : (byte) 3;
                        }
                    } else {
                        dc1Var.m2316F(i6);
                        if (b2 == 0) {
                            p32.m5174j0(new C1174o9(arrayList2), xx1Var, interfaceC0578dt);
                            return;
                        }
                        if (b2 == 1) {
                            while (!TextUtils.isEmpty(dc1Var.m2325h(StandardCharsets.UTF_8))) {
                            }
                        } else {
                            String str = null;
                            if (b2 == 2) {
                                if (!arrayList2.isEmpty()) {
                                    f40.m2713i("A style block was found after the first cue.");
                                    return;
                                }
                                dc1Var.m2325h(StandardCharsets.UTF_8);
                                h92 h92Var = (h92) qo0Var.f9549c;
                                dc1 dc1Var2 = h92Var.f4481a;
                                StringBuilder sb = h92Var.f4482b;
                                sb.setLength(0);
                                int i8 = dc1Var.f2883b;
                                while (!TextUtils.isEmpty(dc1Var.m2325h(StandardCharsets.UTF_8))) {
                                }
                                dc1Var2.m2314D(dc1Var.f2883b, dc1Var.f2882a);
                                dc1Var2.m2316F(i8);
                                ArrayList arrayList3 = new ArrayList();
                                while (true) {
                                    h92.m3116c(dc1Var2);
                                    if (dc1Var2.m2318a() >= 5 && "::cue".equals(dc1Var2.m2335r(5, StandardCharsets.UTF_8))) {
                                        int i9 = dc1Var2.f2883b;
                                        String strM3115b = h92.m3115b(dc1Var2, sb);
                                        if (strM3115b == null) {
                                            strTrim = str;
                                        } else if ("{".equals(strM3115b)) {
                                            dc1Var2.m2316F(i9);
                                            strTrim = "";
                                        } else {
                                            if ("(".equals(strM3115b)) {
                                                int i10 = dc1Var2.f2883b;
                                                int i11 = dc1Var2.f2884c;
                                                int i12 = z2 ? 1 : 0;
                                                while (i10 < i11 && i12 == 0) {
                                                    int i13 = i10 + 1;
                                                    i12 = ((char) dc1Var2.f2882a[i10]) == ')' ? i7 : z2 ? 1 : 0;
                                                    i10 = i13;
                                                }
                                                strTrim = dc1Var2.m2335r((i10 - 1) - dc1Var2.f2883b, StandardCharsets.UTF_8).trim();
                                            } else {
                                                strTrim = str;
                                            }
                                            if (!")".equals(h92.m3115b(dc1Var2, sb))) {
                                                strTrim = str;
                                            }
                                        }
                                    } else {
                                        strTrim = str;
                                    }
                                    if (strTrim != null && "{".equals(h92.m3115b(dc1Var2, sb))) {
                                        i92 i92Var = new i92();
                                        i92Var.f4885a = "";
                                        i92Var.f4886b = "";
                                        i92Var.f4887c = Collections.EMPTY_SET;
                                        i92Var.f4888d = "";
                                        i92Var.f4889e = str;
                                        i92Var.f4891g = z2;
                                        i92Var.f4893i = z2;
                                        i92Var.f4894j = i5;
                                        i92Var.f4895k = i5;
                                        i92Var.f4896l = i5;
                                        i92Var.f4897m = i5;
                                        i92Var.f4898n = i5;
                                        i92Var.f4900p = i5;
                                        i92Var.f4901q = z2;
                                        if (!"".equals(strTrim)) {
                                            int iIndexOf = strTrim.indexOf(91);
                                            if (iIndexOf != i5) {
                                                Matcher matcher2 = h92.f4479c.matcher(strTrim.substring(iIndexOf));
                                                if (matcher2.matches()) {
                                                    String strGroup2 = matcher2.group(i7);
                                                    strGroup2.getClass();
                                                    i92Var.f4888d = strGroup2;
                                                }
                                                strTrim = strTrim.substring(z2 ? 1 : 0, iIndexOf);
                                            }
                                            int i14 = z42.f13274a;
                                            String[] strArrSplit = strTrim.split("\\.", i5);
                                            String str2 = strArrSplit[z2 ? 1 : 0];
                                            int iIndexOf2 = str2.indexOf(35);
                                            if (iIndexOf2 != i5) {
                                                i92Var.f4886b = str2.substring(z2 ? 1 : 0, iIndexOf2);
                                                i92Var.f4885a = str2.substring(iIndexOf2 + 1);
                                            } else {
                                                i92Var.f4886b = str2;
                                            }
                                            if (strArrSplit.length > i7) {
                                                int length = strArrSplit.length;
                                                ki0.m3857c(length <= strArrSplit.length ? i7 : z2 ? 1 : 0);
                                                i92Var.f4887c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(strArrSplit, i7, length)));
                                            }
                                        }
                                        Object r7 = z2 ? 1 : 0;
                                        String strM3115b2 = null;
                                        while (r7 == 0) {
                                            int i15 = dc1Var2.f2883b;
                                            strM3115b2 = h92.m3115b(dc1Var2, sb);
                                            Object r14 = (strM3115b2 == null || "}".equals(strM3115b2)) ? i7 : z2;
                                            if (r14 == 0) {
                                                dc1Var2.m2316F(i15);
                                                h92.m3116c(dc1Var2);
                                                String strM3114a = h92.m3114a(dc1Var2, sb);
                                                if (!"".equals(strM3114a) && ":".equals(h92.m3115b(dc1Var2, sb))) {
                                                    h92.m3116c(dc1Var2);
                                                    StringBuilder sb2 = new StringBuilder();
                                                    boolean z3 = false;
                                                    while (true) {
                                                        if (z3) {
                                                            string = sb2.toString();
                                                        } else {
                                                            int i16 = dc1Var2.f2883b;
                                                            boolean z4 = z3;
                                                            String strM3115b3 = h92.m3115b(dc1Var2, sb);
                                                            if (strM3115b3 == null) {
                                                                string = null;
                                                            } else if ("}".equals(strM3115b3) || ";".equals(strM3115b3)) {
                                                                dc1Var2.m2316F(i16);
                                                                z3 = true;
                                                            } else {
                                                                sb2.append(strM3115b3);
                                                                z3 = z4;
                                                            }
                                                        }
                                                    }
                                                    if (string == null || "".equals(string)) {
                                                        i3 = 1;
                                                    } else {
                                                        int i17 = dc1Var2.f2883b;
                                                        String strM3115b4 = h92.m3115b(dc1Var2, sb);
                                                        if (";".equals(strM3115b4)) {
                                                            if ("color".equals(strM3114a)) {
                                                                i4 = 1;
                                                                i92Var.f4890f = AbstractC0071aq.m698a(string, true);
                                                                i92Var.f4891g = true;
                                                            } else {
                                                                i4 = 1;
                                                                if ("background-color".equals(strM3114a)) {
                                                                    i92Var.f4892h = AbstractC0071aq.m698a(string, true);
                                                                    i92Var.f4893i = true;
                                                                } else if ("ruby-position".equals(strM3114a)) {
                                                                    if ("text-combine-upright".equals(strM3114a)) {
                                                                        if ("all".equals(string)) {
                                                                            z = true;
                                                                        } else {
                                                                            z = true;
                                                                        }
                                                                        i92Var.f4901q = z;
                                                                    } else if ("text-decoration".equals(strM3114a)) {
                                                                        if ("underline".equals(string)) {
                                                                            i4 = 1;
                                                                            i92Var.f4895k = 1;
                                                                        }
                                                                    } else if ("font-family".equals(strM3114a)) {
                                                                        i92Var.f4889e = ua0.m6444b0(string);
                                                                    } else if ("font-weight".equals(strM3114a)) {
                                                                        i4 = 1;
                                                                        if ("font-style".equals(strM3114a)) {
                                                                            if ("italic".equals(string)) {
                                                                                i92Var.f4897m = 1;
                                                                            }
                                                                        } else if ("font-size".equals(strM3114a)) {
                                                                            matcher = h92.f4480d.matcher(ua0.m6444b0(string));
                                                                            if (matcher.matches()) {
                                                                                strGroup = matcher.group(2);
                                                                                strGroup.getClass();
                                                                                switch (strGroup.hashCode()) {
                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                                                                                        if (!strGroup.equals("%")) {
                                                                                            b = 0;
                                                                                        }
                                                                                        switch (b) {
                                                                                            case 0:
                                                                                                i3 = 1;
                                                                                                i92Var.f4898n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i3 = 1;
                                                                                                i92Var.f4898n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i3 = 1;
                                                                                                i92Var.f4898n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                l41.m4046o();
                                                                                                return;
                                                                                        }
                                                                                        String strGroup3 = matcher.group(i3);
                                                                                        strGroup3.getClass();
                                                                                        i92Var.f4899o = Float.parseFloat(strGroup3);
                                                                                        break;
                                                                                    case 3240:
                                                                                        if (!strGroup.equals("em")) {
                                                                                            b = 1;
                                                                                        }
                                                                                        switch (b) {
                                                                                            case 0:
                                                                                                i3 = 1;
                                                                                                i92Var.f4898n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i3 = 1;
                                                                                                i92Var.f4898n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i3 = 1;
                                                                                                i92Var.f4898n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                l41.m4046o();
                                                                                                return;
                                                                                        }
                                                                                        String strGroup4 = matcher.group(i3);
                                                                                        strGroup4.getClass();
                                                                                        i92Var.f4899o = Float.parseFloat(strGroup4);
                                                                                        break;
                                                                                    case 3592:
                                                                                        if (!strGroup.equals("px")) {
                                                                                            b = 2;
                                                                                        }
                                                                                        switch (b) {
                                                                                            case 0:
                                                                                                i3 = 1;
                                                                                                i92Var.f4898n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i3 = 1;
                                                                                                i92Var.f4898n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i3 = 1;
                                                                                                i92Var.f4898n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                l41.m4046o();
                                                                                                return;
                                                                                        }
                                                                                        String strGroup5 = matcher.group(i3);
                                                                                        strGroup5.getClass();
                                                                                        i92Var.f4899o = Float.parseFloat(strGroup5);
                                                                                        break;
                                                                                }
                                                                                b = -1;
                                                                                switch (b) {
                                                                                    case 0:
                                                                                        i3 = 1;
                                                                                        i92Var.f4898n = 3;
                                                                                        break;
                                                                                    case 1:
                                                                                        i3 = 1;
                                                                                        i92Var.f4898n = 2;
                                                                                        break;
                                                                                    case 2:
                                                                                        i3 = 1;
                                                                                        i92Var.f4898n = 1;
                                                                                        break;
                                                                                    default:
                                                                                        l41.m4046o();
                                                                                        return;
                                                                                }
                                                                                String strGroup6 = matcher.group(i3);
                                                                                strGroup6.getClass();
                                                                                i92Var.f4899o = Float.parseFloat(strGroup6);
                                                                            } else {
                                                                                AbstractC1337qm.m5542i0("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                                                            }
                                                                        }
                                                                    } else if ("bold".equals(string)) {
                                                                        i4 = 1;
                                                                        i92Var.f4896l = 1;
                                                                    }
                                                                    i3 = 1;
                                                                } else if ("over".equals(string)) {
                                                                    i92Var.f4900p = 1;
                                                                } else if ("under".equals(string)) {
                                                                    i92Var.f4900p = 2;
                                                                    i3 = 1;
                                                                } else {
                                                                    i3 = 1;
                                                                }
                                                            }
                                                            i3 = i4;
                                                        } else if ("}".equals(strM3115b4)) {
                                                            dc1Var2.m2316F(i17);
                                                            if ("color".equals(strM3114a)) {
                                                                i4 = 1;
                                                                i92Var.f4890f = AbstractC0071aq.m698a(string, true);
                                                                i92Var.f4891g = true;
                                                            } else {
                                                                i4 = 1;
                                                                if ("background-color".equals(strM3114a)) {
                                                                    i92Var.f4892h = AbstractC0071aq.m698a(string, true);
                                                                    i92Var.f4893i = true;
                                                                } else if ("ruby-position".equals(strM3114a)) {
                                                                    if ("text-combine-upright".equals(strM3114a)) {
                                                                        if ("all".equals(string) || string.startsWith("digits")) {
                                                                            z = true;
                                                                        } else {
                                                                            z = false;
                                                                        }
                                                                        i92Var.f4901q = z;
                                                                    } else if ("text-decoration".equals(strM3114a)) {
                                                                        if ("underline".equals(string)) {
                                                                            i4 = 1;
                                                                            i92Var.f4895k = 1;
                                                                        }
                                                                    } else if ("font-family".equals(strM3114a)) {
                                                                        i92Var.f4889e = ua0.m6444b0(string);
                                                                    } else if ("font-weight".equals(strM3114a)) {
                                                                        i4 = 1;
                                                                        if ("font-style".equals(strM3114a)) {
                                                                            if ("italic".equals(string)) {
                                                                                i92Var.f4897m = 1;
                                                                            }
                                                                        } else if ("font-size".equals(strM3114a)) {
                                                                            matcher = h92.f4480d.matcher(ua0.m6444b0(string));
                                                                            if (matcher.matches()) {
                                                                                AbstractC1337qm.m5542i0("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                                                            } else {
                                                                                strGroup = matcher.group(2);
                                                                                strGroup.getClass();
                                                                                switch (strGroup.hashCode()) {
                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                                                                                        if (!strGroup.equals("%")) {
                                                                                            b = 0;
                                                                                        }
                                                                                        switch (b) {
                                                                                            case 0:
                                                                                                i3 = 1;
                                                                                                i92Var.f4898n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i3 = 1;
                                                                                                i92Var.f4898n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i3 = 1;
                                                                                                i92Var.f4898n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                l41.m4046o();
                                                                                                return;
                                                                                        }
                                                                                        String strGroup7 = matcher.group(i3);
                                                                                        strGroup7.getClass();
                                                                                        i92Var.f4899o = Float.parseFloat(strGroup7);
                                                                                        break;
                                                                                    case 3240:
                                                                                        if (!strGroup.equals("em")) {
                                                                                            b = 1;
                                                                                        }
                                                                                        switch (b) {
                                                                                            case 0:
                                                                                                i3 = 1;
                                                                                                i92Var.f4898n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i3 = 1;
                                                                                                i92Var.f4898n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i3 = 1;
                                                                                                i92Var.f4898n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                l41.m4046o();
                                                                                                return;
                                                                                        }
                                                                                        String strGroup8 = matcher.group(i3);
                                                                                        strGroup8.getClass();
                                                                                        i92Var.f4899o = Float.parseFloat(strGroup8);
                                                                                        break;
                                                                                    case 3592:
                                                                                        if (!strGroup.equals("px")) {
                                                                                            b = 2;
                                                                                        }
                                                                                        switch (b) {
                                                                                            case 0:
                                                                                                i3 = 1;
                                                                                                i92Var.f4898n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i3 = 1;
                                                                                                i92Var.f4898n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i3 = 1;
                                                                                                i92Var.f4898n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                l41.m4046o();
                                                                                                return;
                                                                                        }
                                                                                        String strGroup9 = matcher.group(i3);
                                                                                        strGroup9.getClass();
                                                                                        i92Var.f4899o = Float.parseFloat(strGroup9);
                                                                                        break;
                                                                                }
                                                                                b = -1;
                                                                                switch (b) {
                                                                                    case 0:
                                                                                        i3 = 1;
                                                                                        i92Var.f4898n = 3;
                                                                                        break;
                                                                                    case 1:
                                                                                        i3 = 1;
                                                                                        i92Var.f4898n = 2;
                                                                                        break;
                                                                                    case 2:
                                                                                        i3 = 1;
                                                                                        i92Var.f4898n = 1;
                                                                                        break;
                                                                                    default:
                                                                                        l41.m4046o();
                                                                                        return;
                                                                                }
                                                                                String strGroup10 = matcher.group(i3);
                                                                                strGroup10.getClass();
                                                                                i92Var.f4899o = Float.parseFloat(strGroup10);
                                                                            }
                                                                        }
                                                                    } else if ("bold".equals(string)) {
                                                                        i4 = 1;
                                                                        i92Var.f4896l = 1;
                                                                    }
                                                                    i3 = 1;
                                                                } else if ("over".equals(string)) {
                                                                    i92Var.f4900p = 1;
                                                                } else if ("under".equals(string)) {
                                                                    i92Var.f4900p = 2;
                                                                    i3 = 1;
                                                                } else {
                                                                    i3 = 1;
                                                                }
                                                            }
                                                            i3 = i4;
                                                        } else {
                                                            i3 = 1;
                                                        }
                                                    }
                                                } else {
                                                    i3 = i7;
                                                }
                                            } else {
                                                i3 = i7;
                                            }
                                            i7 = i3;
                                            r7 = r14;
                                            z2 = false;
                                        }
                                        int i18 = i7;
                                        if ("}".equals(strM3115b2)) {
                                            arrayList3.add(i92Var);
                                        }
                                        i7 = i18;
                                        z2 = false;
                                        i5 = -1;
                                        str = null;
                                    }
                                }
                                arrayList.addAll(arrayList3);
                            } else if (b2 == 3) {
                                Pattern pattern = o92.f7703a;
                                Charset charset = StandardCharsets.UTF_8;
                                String strM2325h2 = dc1Var.m2325h(charset);
                                if (strM2325h2 == null) {
                                    j92VarM4782d = null;
                                } else {
                                    Pattern pattern2 = o92.f7703a;
                                    Matcher matcher3 = pattern2.matcher(strM2325h2);
                                    if (matcher3.matches()) {
                                        j92VarM4782d = o92.m4782d(null, matcher3, dc1Var, arrayList);
                                    } else {
                                        j92VarM4782d = null;
                                        String strM2325h3 = dc1Var.m2325h(charset);
                                        if (strM2325h3 != null) {
                                            Matcher matcher4 = pattern2.matcher(strM2325h3);
                                            if (matcher4.matches()) {
                                                j92VarM4782d = o92.m4782d(strM2325h2.trim(), matcher4, dc1Var, arrayList);
                                            }
                                        }
                                    }
                                }
                                if (j92VarM4782d != null) {
                                    arrayList2.add(j92VarM4782d);
                                }
                            }
                            qo0Var = this;
                        }
                    }
                }
            }
        } catch (fc1 e) {
            l41.m4045n(e);
        }
    }

    @Override // p000.z01
    public void release() {
        C1174o9 c1174o9 = (C1174o9) this.f9549c;
        MediaCodec mediaCodec = (MediaCodec) this.f9548b;
        try {
            int i = z42.f13274a;
            if (i >= 30 && i < 33) {
                mediaCodec.stop();
            }
        } finally {
            if (z42.f13274a >= 35 && c1174o9 != null) {
                c1174o9.m4754W(mediaCodec);
            }
            mediaCodec.release();
        }
    }

    @Override // p000.InterfaceC1413so
    /* JADX INFO: renamed from: s */
    public void mo4770s(pn0 pn0Var) {
        switch (this.f9547a) {
            case 2:
                ((InterfaceC1413so) this.f9548b).mo4770s(pn0Var);
                break;
            default:
                km1 km1Var = ((dx0) this.f9549c).f3060o;
                p32.m5193x(km1Var.f5908f != null, "Headers should be received prior to messages.");
                if (km1Var.f5908f == ((nm1) this.f9548b)) {
                    ((dx0) this.f9549c).f3048c.execute(new im1(2, this, pn0Var));
                } else {
                    Logger logger = vi0.f11674a;
                    while (true) {
                        InputStream inputStreamM5289k = pn0Var.m5289k();
                        if (inputStreamM5289k != null) {
                            vi0.m6630b(inputStreamM5289k);
                        }
                    }
                }
                break;
        }
    }

    @Override // p000.z01
    /* JADX INFO: renamed from: t */
    public ByteBuffer mo4179t(int i) {
        return ((MediaCodec) this.f9548b).getInputBuffer(i);
    }

    public String toString() {
        switch (this.f9547a) {
            case 2:
                C1679zv c1679zvM5176k0 = p32.m5176k0(this);
                c1679zvM5176k0.m7359a((InterfaceC1413so) this.f9548b, "delegate");
                return c1679zvM5176k0.toString();
            case 12:
                String string = "[ ";
                if (((au1) this.f9548b) != null) {
                    for (int i = 0; i < 9; i++) {
                        StringBuilder sbM5344k = AbstractC1308pu.m5344k(string);
                        sbM5344k.append(((au1) this.f9548b).f1062m[i]);
                        sbM5344k.append(" ");
                        string = sbM5344k.toString();
                    }
                }
                StringBuilder sbM5346m = AbstractC1308pu.m5346m(string, "] ");
                sbM5346m.append((au1) this.f9548b);
                return sbM5346m.toString();
            case 15:
                return "Request{url=" + ((el0) this.f9548b) + '}';
            default:
                return super.toString();
        }
    }

    @Override // p000.z01
    /* JADX INFO: renamed from: u */
    public void mo4180u(Surface surface) {
        ((MediaCodec) this.f9548b).setOutputSurface(surface);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0083  */
    @Override // p000.ha1
    /* JADX INFO: renamed from: v */
    public bb2 mo786v(View view, bb2 bb2Var) {
        boolean z;
        C1146ni c1146ni = (C1146ni) this.f9548b;
        C0699h2 c0699h2 = (C0699h2) this.f9549c;
        int i = c0699h2.f4392a;
        int i2 = c0699h2.f4393b;
        int i3 = c0699h2.f4394c;
        ya2 ya2Var = bb2Var.f1285a;
        un0 un0VarMo6018f = ya2Var.mo6018f(7);
        un0 un0VarMo6018f2 = ya2Var.mo6018f(32);
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) c1146ni.f7411b;
        int i4 = un0VarMo6018f.f11369b;
        int i5 = un0VarMo6018f.f11370c;
        int i6 = un0VarMo6018f.f11368a;
        bottomSheetBehavior.f2008w = i4;
        boolean zM3288z = hr1.m3288z(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z2 = bottomSheetBehavior.f2000o;
        if (z2) {
            int iM961a = bb2Var.m961a();
            bottomSheetBehavior.f2007v = iM961a;
            paddingBottom = iM961a + i3;
        }
        if (bottomSheetBehavior.f2001p) {
            paddingLeft = (zM3288z ? i2 : i) + i6;
        }
        if (bottomSheetBehavior.f2002q) {
            if (!zM3288z) {
                i = i2;
            }
            paddingRight = i + i5;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z3 = true;
        if (!bottomSheetBehavior.f2004s || marginLayoutParams.leftMargin == i6) {
            z = false;
        } else {
            marginLayoutParams.leftMargin = i6;
            z = true;
        }
        if (bottomSheetBehavior.f2005t && marginLayoutParams.rightMargin != i5) {
            marginLayoutParams.rightMargin = i5;
            z = true;
        }
        if (bottomSheetBehavior.f2006u) {
            int i7 = marginLayoutParams.topMargin;
            int i8 = un0VarMo6018f.f11369b;
            if (i7 != i8) {
                marginLayoutParams.topMargin = i8;
            } else {
                z3 = z;
            }
        } else {
            z3 = z;
        }
        if (z3) {
            view.setLayoutParams(marginLayoutParams);
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        boolean z4 = c1146ni.f7410a;
        if (z4) {
            bottomSheetBehavior.f1998m = un0VarMo6018f2.f11371d;
        }
        if (!z2 && !z4) {
            return bb2Var;
        }
        bottomSheetBehavior.m1663O();
        return bb2Var;
    }

    @Override // p000.z01
    /* JADX INFO: renamed from: w */
    public ByteBuffer mo4181w(int i) {
        return ((MediaCodec) this.f9548b).getOutputBuffer(i);
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0227  */
    @Override // p000.InterfaceC1413so
    /* JADX INFO: renamed from: x */
    public void mo4775x(nv1 nv1Var, EnumC1376ro enumC1376ro, j51 j51Var) {
        boolean z;
        xx1 xx1Var;
        dx0 dx0Var;
        C1548wb c1548wb;
        switch (this.f9547a) {
            case 2:
                C0599ed c0599ed = ((bp0) this.f9549c).f1507b.f2585b;
                if (nv1Var.m4612e()) {
                    ((zv0) c0599ed.f3315c).mo3445a();
                } else {
                    ((zv0) c0599ed.f3316d).mo3445a();
                }
                ((InterfaceC1413so) this.f9548b).mo4775x(nv1Var, enumC1376ro, j51Var);
                return;
            default:
                Integer numValueOf = -1;
                synchronized (((dx0) this.f9549c).f3054i) {
                    dx0 dx0Var2 = (dx0) this.f9549c;
                    dx0Var2.f3060o = dx0Var2.f3060o.m3909d((nm1) this.f9548b);
                    ((dx0) this.f9549c).f3059n.f13431b.add(String.valueOf(nv1Var.f7562a));
                    break;
                }
                int i = 0;
                if (((dx0) this.f9549c).f3063r.decrementAndGet() == Integer.MIN_VALUE) {
                    ((dx0) this.f9549c).f3048c.execute(new mm1(this, i));
                    return;
                }
                nm1 nm1Var = (nm1) this.f9548b;
                if (nm1Var.f7452c) {
                    dx0 dx0Var3 = (dx0) this.f9549c;
                    zl1 zl1VarM2394p = dx0Var3.m2394p(nm1Var);
                    if (zl1VarM2394p != null) {
                        dx0Var3.f3047b.execute(zl1VarM2394p);
                    }
                    if (((dx0) this.f9549c).f3060o.f5908f == ((nm1) this.f9548b)) {
                        ((dx0) this.f9549c).m2400v(nv1Var, enumC1376ro, j51Var);
                        return;
                    }
                    return;
                }
                EnumC1376ro enumC1376ro2 = EnumC1376ro.f10082d;
                if (enumC1376ro == enumC1376ro2 && ((dx0) this.f9549c).f3062q.incrementAndGet() > 1000) {
                    dx0 dx0Var4 = (dx0) this.f9549c;
                    zl1 zl1VarM2394p2 = dx0Var4.m2394p((nm1) this.f9548b);
                    if (zl1VarM2394p2 != null) {
                        dx0Var4.f3047b.execute(zl1VarM2394p2);
                    }
                    if (((dx0) this.f9549c).f3060o.f5908f == ((nm1) this.f9548b)) {
                        ((dx0) this.f9549c).m2400v(nv1.f7558m.m4614g("Too many transparent retries. Might be a bug in gRPC").m4613f(new qv1(nv1Var)), enumC1376ro, j51Var);
                        return;
                    }
                    return;
                }
                if (((dx0) this.f9549c).f3060o.f5908f == null) {
                    int i2 = 1;
                    if (enumC1376ro == enumC1376ro2 || (enumC1376ro == EnumC1376ro.f10080b && ((dx0) this.f9549c).f3061p.compareAndSet(false, true))) {
                        nm1 nm1VarM2395q = ((dx0) this.f9549c).m2395q(((nm1) this.f9548b).f7453d, true);
                        if (nm1VarM2395q == null) {
                            return;
                        }
                        dx0 dx0Var5 = (dx0) this.f9549c;
                        if (dx0Var5.f3053h) {
                            synchronized (dx0Var5.f3054i) {
                                dx0 dx0Var6 = (dx0) this.f9549c;
                                dx0Var6.f3060o = dx0Var6.f3060o.m3908c((nm1) this.f9548b, nm1VarM2395q);
                                break;
                            }
                        }
                        ((dx0) this.f9549c).f3047b.execute(new lm1(this, nm1VarM2395q, i2));
                        return;
                    }
                    EnumC1376ro enumC1376ro3 = EnumC1376ro.f10081c;
                    dx0 dx0Var7 = (dx0) this.f9549c;
                    if (enumC1376ro != enumC1376ro3) {
                        dx0Var7.f3061p.set(true);
                        dx0 dx0Var8 = (dx0) this.f9549c;
                        if (dx0Var8.f3053h) {
                            String str = (String) j51Var.m3563c(dx0.f3039F);
                            if (str != null) {
                                try {
                                    numValueOf = Integer.valueOf(str);
                                    break;
                                } catch (NumberFormatException unused) {
                                }
                            } else {
                                numValueOf = null;
                            }
                            dx0 dx0Var9 = (dx0) this.f9549c;
                            boolean zContains = dx0Var9.f3052g.f3842c.contains(nv1Var.f7562a);
                            boolean z2 = (dx0Var9.f3058m == null || (!zContains && (numValueOf == null || numValueOf.intValue() >= 0))) ? false : !dx0Var9.f3058m.m5042a();
                            if (zContains && !z2 && !nv1Var.m4612e() && numValueOf != null && numValueOf.intValue() > 0) {
                                numValueOf = 0;
                            }
                            if (zContains && !z2) {
                                i = 1;
                            }
                            if (i != 0) {
                                dx0.m2393o((dx0) this.f9549c, numValueOf);
                            }
                            synchronized (((dx0) this.f9549c).f3054i) {
                                try {
                                    dx0 dx0Var10 = (dx0) this.f9549c;
                                    dx0Var10.f3060o = dx0Var10.f3060o.m3907b((nm1) this.f9548b);
                                    if (i != 0) {
                                        dx0 dx0Var11 = (dx0) this.f9549c;
                                        if (!dx0Var11.m2399u(dx0Var11.f3060o)) {
                                            if (!((dx0) this.f9549c).f3060o.f5906d.isEmpty()) {
                                            }
                                        }
                                        return;
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        } else {
                            pm1 pm1Var = dx0Var8.f3051f;
                            long nanos = 0;
                            if (pm1Var == null) {
                                xx1Var = new xx1(0L, false);
                            } else {
                                boolean zContains2 = pm1Var.f8949f.contains(nv1Var.f7562a);
                                String str2 = (String) j51Var.m3563c(dx0.f3039F);
                                if (str2 != null) {
                                    try {
                                        numValueOf = Integer.valueOf(str2);
                                        break;
                                    } catch (NumberFormatException unused2) {
                                    }
                                } else {
                                    numValueOf = null;
                                }
                                boolean z3 = (dx0Var8.f3058m == null || (!zContains2 && (numValueOf == null || numValueOf.intValue() >= 0))) ? false : !dx0Var8.f3058m.m5042a();
                                if (dx0Var8.f3051f.f8944a <= ((nm1) this.f9548b).f7453d + 1 || z3) {
                                    z = false;
                                } else if (numValueOf == null) {
                                    if (zContains2) {
                                        nanos = (long) (dx0.f3041H.nextDouble() * dx0Var8.f3069x);
                                        double d = dx0Var8.f3069x;
                                        pm1 pm1Var2 = dx0Var8.f3051f;
                                        dx0Var8.f3069x = Math.min((long) (d * pm1Var2.f8947d), pm1Var2.f8946c);
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                } else if (numValueOf.intValue() >= 0) {
                                    nanos = TimeUnit.MILLISECONDS.toNanos(numValueOf.intValue());
                                    dx0Var8.f3069x = dx0Var8.f3051f.f8945b;
                                    z = true;
                                } else {
                                    z = false;
                                }
                                xx1Var = new xx1(nanos, z);
                            }
                            if (xx1Var.f12764a) {
                                nm1 nm1VarM2395q2 = ((dx0) this.f9549c).m2395q(((nm1) this.f9548b).f7453d + 1, false);
                                if (nm1VarM2395q2 == null) {
                                    return;
                                }
                                synchronized (((dx0) this.f9549c).f3054i) {
                                    dx0Var = (dx0) this.f9549c;
                                    c1548wb = new C1548wb(dx0Var.f3054i);
                                    dx0Var.f3067v = c1548wb;
                                    break;
                                }
                                c1548wb.m6741b(dx0Var.f3049d.schedule(new lm1(this, nm1VarM2395q2, i), xx1Var.f12765b, TimeUnit.NANOSECONDS));
                                return;
                            }
                        }
                    } else if (dx0Var7.f3053h) {
                        dx0Var7.m2398t();
                    }
                }
                dx0 dx0Var12 = (dx0) this.f9549c;
                zl1 zl1VarM2394p3 = dx0Var12.m2394p((nm1) this.f9548b);
                if (zl1VarM2394p3 != null) {
                    dx0Var12.f3047b.execute(zl1VarM2394p3);
                }
                if (((dx0) this.f9549c).f3060o.f5908f == ((nm1) this.f9548b)) {
                    ((dx0) this.f9549c).m2400v(nv1Var, enumC1376ro, j51Var);
                    return;
                }
                return;
        }
    }

    @Override // p000.InterfaceC0604ei
    /* JADX INFO: renamed from: y */
    public void mo814y() {
        dc1 dc1Var = (dc1) this.f9549c;
        byte[] bArr = z42.f13279f;
        dc1Var.getClass();
        dc1Var.m2314D(bArr.length, bArr);
    }

    @Override // p000.z01
    /* JADX INFO: renamed from: z */
    public void mo4182z(int i, int i2, long j, int i3) {
        ((MediaCodec) this.f9548b).queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // p000.gq1
    /* JADX INFO: renamed from: b */
    public void mo3051b(y02 y02Var, z80 z80Var, qk0 qk0Var) {
    }

    public /* synthetic */ qo0(int i, boolean z) {
        this.f9547a = i;
    }

    public /* synthetic */ qo0(Object obj, Object obj2, int i, boolean z) {
        this.f9547a = i;
        this.f9548b = obj;
        this.f9549c = obj2;
    }

    public qo0(qo0 qo0Var) {
        this.f9547a = 15;
        this.f9548b = (el0) qo0Var.f9548b;
        zj0 zj0Var = (zj0) qo0Var.f9549c;
        zj0Var.getClass();
        this.f9549c = new ak0(zj0Var);
    }

    public qo0(List list) {
        this.f9547a = 25;
        this.f9548b = list;
        this.f9549c = new c22[list.size()];
    }

    public /* synthetic */ qo0(int i, Object obj, Object obj2) {
        this.f9547a = i;
        this.f9549c = obj;
        this.f9548b = obj2;
    }

    public qo0(dg1 dg1Var) {
        this.f9547a = 12;
        this.f9549c = dg1Var;
    }

    public qo0(nv1 nv1Var, Object obj) {
        this.f9547a = 1;
        p32.m5188s(nv1Var, "status");
        this.f9548b = nv1Var;
        this.f9549c = obj;
    }

    public qo0(y02 y02Var) {
        this.f9547a = 13;
        this.f9548b = y02Var;
        this.f9549c = new dc1();
    }

    public qo0(Context context) {
        this.f9547a = 7;
        this.f9549c = null;
        this.f9548b = context;
    }

    public qo0(MediaCodec mediaCodec, C1174o9 c1174o9) {
        this.f9547a = 22;
        this.f9548b = mediaCodec;
        this.f9549c = c1174o9;
        if (z42.f13274a < 35 || c1174o9 == null) {
            return;
        }
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) c1174o9.f7701d;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            ki0.m3864h(((HashSet) c1174o9.f7700c).add(mediaCodec));
        }
    }

    public qo0(kj1 kj1Var) {
        this.f9547a = 26;
        this.f9548b = kj1Var;
        vu1 vu1Var = new vu1();
        vu1Var.f11770a = 0;
        this.f9549c = vu1Var;
    }

    public qo0(qy1 qy1Var, ScheduledFuture scheduledFuture) {
        this.f9547a = 21;
        this.f9548b = qy1Var;
        p32.m5188s(scheduledFuture, "future");
        this.f9549c = scheduledFuture;
    }

    public qo0(Matcher matcher, CharSequence charSequence) {
        this.f9547a = 5;
        charSequence.getClass();
        this.f9548b = matcher;
    }

    public qo0(g32 g32Var) {
        this.f9547a = 24;
        this.f9549c = g32Var;
        this.f9548b = new C0141cm(new byte[4], 4);
    }

    public qo0(SSLSession sSLSession) {
        this.f9547a = 0;
        sSLSession.getCipherSuite();
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        Certificate certificate = null;
        Certificate certificate2 = localCertificates != null ? localCertificates[0] : null;
        try {
            Certificate[] peerCertificates = sSLSession.getPeerCertificates();
            if (peerCertificates != null) {
                certificate = peerCertificates[0];
            }
        } catch (SSLPeerUnverifiedException e) {
            ro0.f10084d.log(Level.FINE, "Peer cert not available for peerHost=" + sSLSession.getPeerHost(), (Throwable) e);
        }
        this.f9548b = certificate2;
        this.f9549c = certificate;
    }
}
