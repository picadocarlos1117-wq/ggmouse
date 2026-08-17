package p000;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Path;
import android.os.Trace;
import android.sun.security.util.DerValue;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.example.ssmousepro.injection.TouchPipeline;
import com.google.android.material.appbar.MaterialToolbar;
import java.io.Closeable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rc2 {

    /* JADX INFO: renamed from: a */
    public static final C0101bj f9888a = new C0101bj("io.grpc.ClientStreamTracer.NAME_RESOLUTION_DELAYED", 1);

    /* JADX INFO: renamed from: b */
    public static final C1400sb f9889b = new C1400sb("io.grpc.Grpc.TRANSPORT_ATTR_REMOTE_ADDR");

    /* JADX INFO: renamed from: c */
    public static final C1400sb f9890c = new C1400sb("io.grpc.Grpc.TRANSPORT_ATTR_LOCAL_ADDR");

    /* JADX INFO: renamed from: d */
    public static final C1400sb f9891d = new C1400sb("io.grpc.Grpc.TRANSPORT_ATTR_SSL_SESSION");

    /* JADX INFO: renamed from: e */
    public static final boolean[] f9892e = new boolean[3];

    /* JADX INFO: renamed from: f */
    public static final C1158nu f9893f = new C1158nu(4);

    /* JADX INFO: renamed from: g */
    public static long f9894g;

    /* JADX INFO: renamed from: h */
    public static Method f9895h;

    /* JADX INFO: renamed from: A */
    public static int m5760A(int i, byte[] bArr, int i2, int i3, mo0 mo0Var, C1583x9 c1583x9) {
        yn0 yn0Var = (yn0) mo0Var;
        int iM5811z = m5811z(bArr, i2, c1583x9);
        yn0Var.m7099b(c1583x9.f12494a);
        while (iM5811z < i3) {
            int iM5811z2 = m5811z(bArr, iM5811z, c1583x9);
            if (i != c1583x9.f12494a) {
                break;
            }
            iM5811z = m5811z(bArr, iM5811z2, c1583x9);
            yn0Var.m7099b(c1583x9.f12494a);
        }
        return iM5811z;
    }

    /* JADX INFO: renamed from: B */
    public static int m5761B(byte[] bArr, int i, C1583x9 c1583x9) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            c1583x9.f12495b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & 127)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & 127)) << i4;
            b = b2;
            i3 = i5;
        }
        c1583x9.f12495b = j2;
        return i3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: C */
    public static long m5762C(long j, long j2, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j3 = j / j2;
        long j4 = j - (j2 * j3);
        if (j4 == 0) {
            return j3;
        }
        int i = ((int) ((j ^ j2) >> 63)) | 1;
        switch (cw0.f2651a[roundingMode.ordinal()]) {
            case 1:
                p32.m5191v(j4 == 0);
                return j3;
            case 2:
                return j3;
            case 3:
                if (i >= 0) {
                    return j3;
                }
                return j3 + ((long) i);
            case 4:
                return j3 + ((long) i);
            case 5:
                if (i <= 0) {
                    return j3;
                }
                return j3 + ((long) i);
            case 6:
            case 7:
            case 8:
                long jAbs = Math.abs(j4);
                long jAbs2 = jAbs - (Math.abs(j2) - jAbs);
                if (jAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j3) == 0)) {
                        return j3;
                    }
                } else if (jAbs2 <= 0) {
                    return j3;
                }
                return j3 + ((long) i);
            default:
                throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: D */
    public static final boolean m5763D(int i, int i2) {
        return (i & i2) == i2;
    }

    /* JADX INFO: renamed from: F */
    public static q92 m5764F(C1639ys c1639ys, int i, ArrayList arrayList, q92 q92Var) {
        int i2;
        int i3 = i == 0 ? c1639ys.f13111n0 : c1639ys.f13113o0;
        if (i3 != -1 && (q92Var == null || i3 != q92Var.f9450b)) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                q92 q92Var2 = (q92) arrayList.get(i4);
                if (q92Var2.f9450b == i3) {
                    if (q92Var != null) {
                        q92Var.m5461c(i, q92Var2);
                        arrayList.remove(q92Var);
                    }
                    q92Var = q92Var2;
                    break;
                }
            }
        } else if (i3 != -1) {
            return q92Var;
        }
        if (q92Var == null) {
            if (c1639ys instanceof hk0) {
                hk0 hk0Var = (hk0) c1639ys;
                int i5 = 0;
                while (true) {
                    if (i5 >= hk0Var.f4612r0) {
                        i2 = -1;
                        break;
                    }
                    C1639ys c1639ys2 = hk0Var.f4611q0[i5];
                    if ((i == 0 && (i2 = c1639ys2.f13111n0) != -1) || (i == 1 && (i2 = c1639ys2.f13113o0) != -1)) {
                        break;
                    }
                    i5++;
                }
                if (i2 != -1) {
                    for (int i6 = 0; i6 < arrayList.size(); i6++) {
                        q92 q92Var3 = (q92) arrayList.get(i6);
                        if (q92Var3.f9450b == i2) {
                            q92Var = q92Var3;
                            break;
                        }
                    }
                }
            }
            if (q92Var == null) {
                q92Var = new q92();
                q92Var.f9449a = new ArrayList();
                q92Var.f9452d = null;
                q92Var.f9453e = -1;
                int i7 = q92.f9448f;
                q92.f9448f = i7 + 1;
                q92Var.f9450b = i7;
                q92Var.f9451c = i;
            }
            arrayList.add(q92Var);
        }
        ArrayList arrayList2 = q92Var.f9449a;
        if (arrayList2.contains(c1639ys)) {
            return q92Var;
        }
        arrayList2.add(c1639ys);
        if (c1639ys instanceof xi0) {
            xi0 xi0Var = (xi0) c1639ys;
            xi0Var.f12612t0.m4275c(xi0Var.f12613u0 == 0 ? 1 : 0, q92Var, arrayList);
        }
        int i8 = q92Var.f9450b;
        if (i == 0) {
            c1639ys.f13111n0 = i8;
            c1639ys.f13066I.m4275c(i, q92Var, arrayList);
            c1639ys.f13068K.m4275c(i, q92Var, arrayList);
        } else {
            c1639ys.f13113o0 = i8;
            c1639ys.f13067J.m4275c(i, q92Var, arrayList);
            c1639ys.f13070M.m4275c(i, q92Var, arrayList);
            c1639ys.f13069L.m4275c(i, q92Var, arrayList);
        }
        c1639ys.f13073P.m4275c(i, q92Var, arrayList);
        return q92Var;
    }

    /* JADX INFO: renamed from: G */
    public static int m5765G(byte[] bArr) {
        boolean z = bArr.length >= 4;
        int length = bArr.length;
        if (!z) {
            f40.m2713i(p32.m5153T("array too small: %s < %s", Integer.valueOf(length), 4));
            return 0;
        }
        return (bArr[3] & 255) | (bArr[0] << DerValue.tag_GeneralizedTime) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
    }

    /* JADX INFO: renamed from: H */
    public static long m5766H(long j, long j2) {
        p32.m5187r("a", j);
        p32.m5187r("b", j2);
        if (j == 0) {
            return j2;
        }
        if (j2 == 0) {
            return j;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j);
        long jNumberOfTrailingZeros = j >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j2);
        long j3 = j2 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j3) {
            long j4 = jNumberOfTrailingZeros - j3;
            long j5 = (j4 >> 63) & j4;
            long j6 = (j4 - j5) - j5;
            j3 += j5;
            jNumberOfTrailingZeros = j6 >> Long.numberOfTrailingZeros(j6);
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    /* JADX INFO: renamed from: J */
    public static float m5767J(String[] strArr, int i) {
        float f = Float.parseFloat(strArr[i]);
        if (f >= TouchPipeline.SIZE && f <= 1.0f) {
            return f;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f);
    }

    /* JADX INFO: renamed from: K */
    public static final hs0 m5768K(ms0 ms0Var) {
        ms0Var.getClass();
        fs0 lifecycle = ms0Var.getLifecycle();
        lifecycle.getClass();
        AtomicReference atomicReference = lifecycle.f3891a;
        while (true) {
            hs0 hs0Var = (hs0) atomicReference.get();
            if (hs0Var != null) {
                return hs0Var;
            }
            hs0 hs0Var2 = new hs0(lifecycle, SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain().getImmediate()));
            do {
                if (atomicReference.compareAndSet(null, hs0Var2)) {
                    BuildersKt__Builders_commonKt.launch$default(hs0Var2, Dispatchers.getMain().getImmediate(), null, new gs0(hs0Var2, null), 2, null);
                    return hs0Var2;
                }
            } while (atomicReference.get() == null);
        }
    }

    /* JADX INFO: renamed from: L */
    public static long m5769L(byte b, byte b2) {
        int i;
        int i2;
        int i3 = b & 255;
        int i4 = b & 3;
        if (i4 != 0) {
            i = 2;
            if (i4 != 1 && i4 != 2) {
                i = b2 & 63;
            }
        } else {
            i = 1;
        }
        int i5 = i3 >> 3;
        int i6 = i5 & 3;
        if (i5 >= 16) {
            i2 = 2500 << i6;
        } else if (i5 >= 12) {
            i2 = 10000 << (i5 & 1);
        } else {
            i2 = i6 == 3 ? 60000 : 10000 << i6;
        }
        return ((long) i) * ((long) i2);
    }

    /* JADX INFO: renamed from: M */
    public static ArrayList m5770M(MaterialToolbar materialToolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < materialToolbar.getChildCount(); i++) {
            View childAt = materialToolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: T */
    public static boolean m5771T() {
        try {
            if (f9895h == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f9895h == null) {
                f9894g = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f9895h = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f9895h.invoke(null, Long.valueOf(f9894g))).booleanValue();
        } catch (Exception e) {
            if (!(e instanceof InvocationTargetException)) {
                return false;
            }
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            ca0.m1184p(cause);
            return false;
        }
    }

    /* JADX INFO: renamed from: U */
    public static boolean m5772U(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: W */
    public static List m5773W(Class cls, Iterable iterable, ClassLoader classLoader, pu0 pu0Var) {
        Object Load;
        try {
            Class.forName("android.app.Application", false, classLoader);
            Load = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                Class cls2 = (Class) it.next();
                Object objNewInstance = null;
                try {
                    objNewInstance = cls2.asSubclass(cls).getConstructor(null).newInstance(null);
                } catch (ClassCastException unused) {
                } catch (Throwable th) {
                    throw new ServiceConfigurationError(String.format("Provider %s could not be instantiated %s", cls2.getName(), th), th);
                }
                if (objNewInstance != null) {
                    Load.add(objNewInstance);
                }
            }
        } catch (Exception unused2) {
            ServiceLoader serviceLoaderLoad = ServiceLoader.load(cls, classLoader);
            Load = !serviceLoaderLoad.iterator().hasNext() ? ServiceLoader.load(cls) : serviceLoaderLoad;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : Load) {
            switch (pu0Var.f9164a) {
                case 0:
                    ((ou0) obj).getClass();
                    break;
                case 1:
                    ((sx0) obj).getClass();
                    break;
                default:
                    ((x71) obj).getClass();
                    break;
            }
            arrayList.add(obj);
        }
        Collections.sort(arrayList, Collections.reverseOrder(new jz0(pu0Var, 1)));
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: X */
    public static int m5774X(Object obj, qp1 qp1Var, byte[] bArr, int i, int i2, int i3, C1583x9 c1583x9) {
        int iM887G = ((b51) qp1Var).m887G(obj, bArr, i, i2, i3, c1583x9);
        c1583x9.f12496c = obj;
        return iM887G;
    }

    /* JADX INFO: renamed from: Y */
    public static int m5775Y(Object obj, qp1 qp1Var, byte[] bArr, int i, int i2, C1583x9 c1583x9) throws rp0 {
        int iM5810y = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iM5810y = m5810y(i3, bArr, iM5810y, c1583x9);
            i3 = c1583x9.f12494a;
        }
        int i4 = iM5810y;
        if (i3 < 0 || i3 > i2 - i4) {
            throw rp0.m5887h();
        }
        int i5 = i4 + i3;
        qp1Var.mo908i(obj, bArr, i4, i5, c1583x9);
        c1583x9.f12496c = obj;
        return i5;
    }

    /* JADX INFO: renamed from: Z */
    public static short m5776Z(int i) {
        return (short) ((i - (((short) (62209 * i)) * 3329)) >> 16);
    }

    /* JADX INFO: renamed from: a */
    public static final StackTraceElement m5777a(String str, Exception exc) {
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        return new StackTraceElement("_COROUTINE.".concat(str), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }

    /* JADX INFO: renamed from: b */
    public static void m5778b(StringBuilder sb, Object obj, og0 og0Var) {
        if (og0Var != null) {
            sb.append((CharSequence) og0Var.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    /* JADX INFO: renamed from: c */
    public static List m5779c(int... iArr) {
        return iArr.length == 0 ? Collections.EMPTY_LIST : new op0(0, iArr.length, iArr);
    }

    /* JADX INFO: renamed from: d */
    public static final Integer m5780d(int i) {
        return new Integer(i);
    }

    /* JADX INFO: renamed from: e */
    public static ArrayList m5781e(byte[] bArr) {
        long j = (((long) (((bArr[11] & 255) << 8) | (bArr[10] & 255))) * 1000000000) / 48000;
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m5782f(dc1 dc1Var, db0 db0Var, int i, bb0 bb0Var) {
        long jM2339v = dc1Var.m2339v();
        long j = jM2339v >>> 16;
        if (j != i) {
            return false;
        }
        boolean z = (j & 1) == 1;
        int i2 = (int) ((jM2339v >> 12) & 15);
        int i3 = (int) ((jM2339v >> 8) & 15);
        int i4 = (int) ((jM2339v >> 4) & 15);
        int i5 = (int) ((jM2339v >> 1) & 7);
        boolean z2 = (jM2339v & 1) == 1;
        if (i4 <= 7) {
            if (i4 != db0Var.f2865g - 1) {
                return false;
            }
        } else if (i4 > 10 || db0Var.f2865g != 2) {
            return false;
        }
        if (!(i5 == 0 || i5 == db0Var.f2867i) || z2) {
            return false;
        }
        try {
            long jM2311A = dc1Var.m2311A();
            if (!z) {
                jM2311A *= (long) db0Var.f2860b;
            }
            bb0Var.f1280a = jM2311A;
            int iM5786h0 = m5786h0(i2, dc1Var);
            if (iM5786h0 == -1 || iM5786h0 > db0Var.f2860b) {
                return false;
            }
            int i6 = db0Var.f2863e;
            if (i3 != 0) {
                if (i3 <= 11) {
                    if (i3 != db0Var.f2864f) {
                        return false;
                    }
                } else if (i3 != 12) {
                    if (i3 > 14) {
                        return false;
                    }
                    int iM2343z = dc1Var.m2343z();
                    if (i3 == 14) {
                        iM2343z *= 10;
                    }
                    if (iM2343z != i6) {
                        return false;
                    }
                } else if (dc1Var.m2337t() * 1000 != i6) {
                    return false;
                }
            }
            int iM2337t = dc1Var.m2337t();
            int i7 = dc1Var.f2883b;
            byte[] bArr = dc1Var.f2882a;
            int i8 = i7 - 1;
            int i9 = 0;
            for (int i10 = dc1Var.f2883b; i10 < i8; i10++) {
                i9 = z42.f13286m[i9 ^ (bArr[i10] & 255)];
            }
            int i11 = z42.f13274a;
            return iM2337t == i9;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static k51 m5783f0(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            int i2 = z42.f13274a;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                AbstractC1337qm.m5542i0("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(dd1.m2345a(new dc1(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e) {
                    AbstractC1337qm.m5544j0("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new s82(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new k51(arrayList);
    }

    /* JADX INFO: renamed from: g */
    public static void m5784g(boolean z, String str) {
        if (z) {
            return;
        }
        f40.m2713i(str);
    }

    /* JADX INFO: renamed from: h */
    public static void m5785h(int i) {
        if (i >= 0) {
            return;
        }
        l41.m4049r();
    }

    /* JADX INFO: renamed from: h0 */
    public static int m5786h0(int i, dc1 dc1Var) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return dc1Var.m2337t() + 1;
            case 7:
                return dc1Var.m2343z() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m5787i(C1676zs c1676zs, xs0 xs0Var, C1639ys c1639ys) {
        c1639ys.f13112o = -1;
        C1082ls c1082ls = c1639ys.f13070M;
        int[] iArr = c1639ys.f13115p0;
        C1082ls c1082ls2 = c1639ys.f13069L;
        C1082ls c1082ls3 = c1639ys.f13067J;
        C1082ls c1082ls4 = c1639ys.f13068K;
        C1082ls c1082ls5 = c1639ys.f13066I;
        c1639ys.f13114p = -1;
        int[] iArr2 = c1676zs.f13115p0;
        if (iArr2[0] != 2 && iArr[0] == 4) {
            int i = c1082ls5.f6504g;
            int iM7135q = c1676zs.m7135q() - c1082ls4.f6504g;
            c1082ls5.f6506i = xs0Var.m6966k(c1082ls5);
            c1082ls4.f6506i = xs0Var.m6966k(c1082ls4);
            xs0Var.m6959d(c1082ls5.f6506i, i);
            xs0Var.m6959d(c1082ls4.f6506i, iM7135q);
            c1639ys.f13112o = 2;
            c1639ys.f13082Y = i;
            int i2 = iM7135q - i;
            c1639ys.f13078U = i2;
            int i3 = c1639ys.f13087b0;
            if (i2 < i3) {
                c1639ys.f13078U = i3;
            }
        }
        if (iArr2[1] == 2 || iArr[1] != 4) {
            return;
        }
        int i4 = c1082ls3.f6504g;
        int iM7131k = c1676zs.m7131k() - c1082ls2.f6504g;
        c1082ls3.f6506i = xs0Var.m6966k(c1082ls3);
        c1082ls2.f6506i = xs0Var.m6966k(c1082ls2);
        xs0Var.m6959d(c1082ls3.f6506i, i4);
        xs0Var.m6959d(c1082ls2.f6506i, iM7131k);
        if (c1639ys.f13085a0 > 0 || c1639ys.f13097g0 == 8) {
            au1 au1VarM6966k = xs0Var.m6966k(c1082ls);
            c1082ls.f6506i = au1VarM6966k;
            xs0Var.m6959d(au1VarM6966k, c1639ys.f13085a0 + i4);
        }
        c1639ys.f13114p = 2;
        c1639ys.f13083Z = i4;
        int i5 = iM7131k - i4;
        c1639ys.f13079V = i5;
        int i6 = c1639ys.f13089c0;
        if (i5 < i6) {
            c1639ys.f13079V = i6;
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static ak0 m5788i0(dc1 dc1Var, boolean z, boolean z2) throws fc1 {
        if (z) {
            m5808v0(3, dc1Var, false);
        }
        dc1Var.m2335r((int) dc1Var.m2328k(), StandardCharsets.UTF_8);
        long jM2328k = dc1Var.m2328k();
        String[] strArr = new String[(int) jM2328k];
        for (int i = 0; i < jM2328k; i++) {
            strArr[i] = dc1Var.m2335r((int) dc1Var.m2328k(), StandardCharsets.UTF_8);
        }
        if (z2 && (dc1Var.m2337t() & 1) == 0) {
            throw fc1.m2799a(null, "framing bit expected to be set");
        }
        return new ak0(strArr);
    }

    /* JADX INFO: renamed from: j */
    public static void m5789j(Object obj, String str) {
        if (obj != null) {
            return;
        }
        l41.m4051t(str);
    }

    /* JADX INFO: renamed from: j0 */
    public static int m5790j0(Context context, int i, int i2) {
        TypedValue typedValueM3849T = ki0.m3849T(context, i);
        return (typedValueM3849T == null || typedValueM3849T.type != 16) ? i2 : typedValueM3849T.data;
    }

    /* JADX INFO: renamed from: k */
    public static long m5791k(long j, long j2) {
        long j3 = j + j2;
        if (((j ^ j2) < 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException("overflow: checkedAdd(" + j + ", " + j2 + ")");
    }

    /* JADX INFO: renamed from: k0 */
    public static TimeInterpolator m5792k0(Context context, int i, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        Path path = null;
        if (typedValue.type != 3) {
            f40.m2713i("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
            return null;
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!m5772U(strValueOf, "cubic-bezier") && !m5772U(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (m5772U(strValueOf, "cubic-bezier")) {
            String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(",");
            if (strArrSplit.length == 4) {
                return hc1.m3127b(m5767J(strArrSplit, 0), m5767J(strArrSplit, 1), m5767J(strArrSplit, 2), m5767J(strArrSplit, 3));
            }
            ca0.m1174f(strArrSplit.length, "Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ");
            return null;
        }
        if (!m5772U(strValueOf, "path")) {
            f40.m2713i("Invalid motion easing type: ".concat(strValueOf));
            return null;
        }
        String strSubstring = strValueOf.substring(5, strValueOf.length() - 1);
        Path path2 = new Path();
        ic1[] ic1VarArrM6456l = ua0.m6456l(strSubstring);
        if (ic1VarArrM6456l != null) {
            try {
                ic1.m3420b(ic1VarArrM6456l, path2);
                path = path2;
            } catch (RuntimeException e) {
                l41.m4043l("Error in parsing ".concat(strSubstring), e);
                return null;
            }
        }
        return hc1.m3128c(path);
    }

    /* JADX INFO: renamed from: l */
    public static int m5793l(long j) {
        int i = (int) j;
        p32.m5173j("Out of range: %s", j, ((long) i) == j);
        return i;
    }

    /* JADX INFO: renamed from: l0 */
    public static int m5794l0(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    /* JADX INFO: renamed from: m */
    public static int m5795m(int i, int i2, int i3) {
        if (i < i2) {
            return i2;
        }
        return i > i3 ? i3 : i;
    }

    /* JADX INFO: renamed from: m0 */
    public static long m5796m0(long j, long j2) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (iNumberOfLeadingZeros > 65) {
            return j * j2;
        }
        long j3 = ((j ^ j2) >>> 63) + Long.MAX_VALUE;
        if (!((iNumberOfLeadingZeros < 64) | ((j2 == Long.MIN_VALUE) & (j < 0)))) {
            long j4 = j * j2;
            if (j == 0 || j4 / j == j2) {
                return j4;
            }
        }
        return j3;
    }

    /* JADX INFO: renamed from: n */
    public static final void m5797n(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                ua0.m6445c(th, th2);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public static int m5798p(byte[] bArr, int i, C1583x9 c1583x9) throws rp0 {
        int iM5811z = m5811z(bArr, i, c1583x9);
        int i2 = c1583x9.f12494a;
        if (i2 < 0) {
            throw rp0.m5885f();
        }
        if (i2 > bArr.length - iM5811z) {
            throw rp0.m5887h();
        }
        if (i2 == 0) {
            c1583x9.f12496c = AbstractC0753ik.f5042b;
            return iM5811z;
        }
        c1583x9.f12496c = AbstractC0753ik.m3441i(iM5811z, i2, bArr);
        return iM5811z + i2;
    }

    /* JADX INFO: renamed from: p0 */
    public static int m5799p0(int i, byte[] bArr, int i2, int i3, C1583x9 c1583x9) throws rp0 {
        if ((i >>> 3) == 0) {
            throw rp0.m5881b();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return m5761B(bArr, i2, c1583x9);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return m5811z(bArr, i2, c1583x9) + c1583x9.f12494a;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            throw rp0.m5881b();
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = m5811z(bArr, i2, c1583x9);
            i6 = c1583x9.f12494a;
            if (i6 == i5) {
                break;
            }
            i2 = m5799p0(i6, bArr, i2, i3, c1583x9);
        }
        if (i2 > i3 || i6 != i5) {
            throw rp0.m5886g();
        }
        return i2;
    }

    /* JADX INFO: renamed from: q */
    public static int m5800q(int i, byte[] bArr) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: r */
    public static long m5801r(int i, byte[] bArr) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* JADX INFO: renamed from: s */
    public static int m5802s(qp1 qp1Var, byte[] bArr, int i, int i2, int i3, C1583x9 c1583x9) {
        Object objMo909j = qp1Var.mo909j();
        int iM5774X = m5774X(objMo909j, qp1Var, bArr, i, i2, i3, c1583x9);
        qp1Var.mo901b(objMo909j);
        c1583x9.f12496c = objMo909j;
        return iM5774X;
    }

    /* JADX INFO: renamed from: s0 */
    public static int[] m5803s0(Collection collection) {
        if (collection instanceof op0) {
            op0 op0Var = (op0) collection;
            return Arrays.copyOfRange(op0Var.f8415a, op0Var.f8416b, op0Var.f8417c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }

    /* JADX INFO: renamed from: t */
    public static int m5804t(qp1 qp1Var, int i, byte[] bArr, int i2, int i3, mo0 mo0Var, C1583x9 c1583x9) throws rp0 {
        Object objMo909j = qp1Var.mo909j();
        qp1 qp1Var2 = qp1Var;
        byte[] bArr2 = bArr;
        int i4 = i3;
        C1583x9 c1583x10 = c1583x9;
        int iM5775Y = m5775Y(objMo909j, qp1Var2, bArr2, i2, i4, c1583x10);
        qp1Var2.mo901b(objMo909j);
        c1583x10.f12496c = objMo909j;
        mo0Var.add(objMo909j);
        while (iM5775Y < i4) {
            C1583x9 c1583x11 = c1583x10;
            int i5 = i4;
            int iM5811z = m5811z(bArr2, iM5775Y, c1583x11);
            if (i != c1583x11.f12494a) {
                break;
            }
            byte[] bArr3 = bArr2;
            qp1 qp1Var3 = qp1Var2;
            Object objMo909j2 = qp1Var3.mo909j();
            iM5775Y = m5775Y(objMo909j2, qp1Var3, bArr3, iM5811z, i5, c1583x11);
            qp1Var2 = qp1Var3;
            bArr2 = bArr3;
            i4 = i5;
            c1583x10 = c1583x11;
            qp1Var2.mo901b(objMo909j2);
            c1583x10.f12496c = objMo909j2;
            mo0Var.add(objMo909j2);
        }
        return iM5775Y;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a  */
    /* JADX INFO: renamed from: t0 */
    public static Integer m5805t0(String str) {
        byte b;
        Long lValueOf;
        byte b2;
        str.getClass();
        if (!str.isEmpty()) {
            int i = str.charAt(0) == '-' ? 1 : 0;
            if (i != str.length()) {
                int i2 = i + 1;
                char cCharAt = str.charAt(i);
                if (cCharAt < 128) {
                    b = fw0.f3915a[cCharAt];
                } else {
                    byte[] bArr = fw0.f3915a;
                    b = -1;
                }
                if (b >= 0 && b < 10) {
                    long j = -b;
                    while (true) {
                        if (i2 >= str.length()) {
                            if (i == 0) {
                                if (j != Long.MIN_VALUE) {
                                    lValueOf = Long.valueOf(-j);
                                    break;
                                }
                                break;
                            }
                            lValueOf = Long.valueOf(j);
                            break;
                        }
                        int i3 = i2 + 1;
                        char cCharAt2 = str.charAt(i2);
                        if (cCharAt2 < 128) {
                            b2 = fw0.f3915a[cCharAt2];
                        } else {
                            byte[] bArr2 = fw0.f3915a;
                            b2 = -1;
                        }
                        if (b2 >= 0 && b2 < 10 && j >= -922337203685477580L) {
                            long j2 = j * 10;
                            long j3 = b2;
                            if (j2 >= Long.MIN_VALUE + j3) {
                                j = j2 - j3;
                                i2 = i3;
                            }
                        }
                        lValueOf = null;
                        break;
                    }
                }
                lValueOf = null;
                break;
            }
            lValueOf = null;
            break;
        }
        lValueOf = null;
        break;
        if (lValueOf == null || lValueOf.longValue() != lValueOf.intValue()) {
            return null;
        }
        return Integer.valueOf(lValueOf.intValue());
    }

    /* JADX INFO: renamed from: u */
    public static int m5806u(int i, byte[] bArr, int i2, int i3, a42 a42Var, C1583x9 c1583x9) throws rp0 {
        if ((i >>> 3) == 0) {
            throw rp0.m5881b();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iM5761B = m5761B(bArr, i2, c1583x9);
            a42Var.m80f(i, Long.valueOf(c1583x9.f12495b));
            return iM5761B;
        }
        if (i4 == 1) {
            a42Var.m80f(i, Long.valueOf(m5801r(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iM5811z = m5811z(bArr, i2, c1583x9);
            int i5 = c1583x9.f12494a;
            if (i5 < 0) {
                throw rp0.m5885f();
            }
            if (i5 > bArr.length - iM5811z) {
                throw rp0.m5887h();
            }
            if (i5 == 0) {
                a42Var.m80f(i, AbstractC0753ik.f5042b);
            } else {
                a42Var.m80f(i, AbstractC0753ik.m3441i(iM5811z, i5, bArr));
            }
            return iM5811z + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw rp0.m5881b();
            }
            a42Var.m80f(i, Integer.valueOf(m5800q(i2, bArr)));
            return i2 + 4;
        }
        a42 a42Var2 = new a42();
        int i6 = (i & (-8)) | 4;
        int i7 = 0;
        while (i2 < i3) {
            int iM5811z2 = m5811z(bArr, i2, c1583x9);
            i7 = c1583x9.f12494a;
            if (i7 == i6) {
                i2 = iM5811z2;
                break;
            }
            i2 = m5806u(i7, bArr, iM5811z2, i3, a42Var2, c1583x9);
        }
        if (i2 > i3 || i7 != i6) {
            throw rp0.m5886g();
        }
        a42Var.m80f(i, a42Var2);
        return i2;
    }

    /* JADX INFO: renamed from: u0 */
    public static boolean m5807u0(int i, int i2, int i3, int i4) {
        return (i3 == 1 || i3 == 2 || (i3 == 4 && i != 2)) || (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2));
    }

    /* JADX INFO: renamed from: v0 */
    public static boolean m5808v0(int i, dc1 dc1Var, boolean z) throws fc1 {
        if (dc1Var.m2318a() < 7) {
            if (z) {
                return false;
            }
            throw fc1.m2799a(null, "too short header: " + dc1Var.m2318a());
        }
        if (dc1Var.m2337t() != i) {
            if (z) {
                return false;
            }
            throw fc1.m2799a(null, "expected header type " + Integer.toHexString(i));
        }
        if (dc1Var.m2337t() == 118 && dc1Var.m2337t() == 111 && dc1Var.m2337t() == 114 && dc1Var.m2337t() == 98 && dc1Var.m2337t() == 105 && dc1Var.m2337t() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw fc1.m2799a(null, "expected characters 'vorbis'");
    }

    /* JADX INFO: renamed from: w */
    public static String m5809w(ByteBuffer byteBuffer, int i, int i2) throws rp0 {
        if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = byteBuffer.get(i);
            if (b < 0) {
                break;
            }
            i++;
            cArr[i4] = (char) b;
            i4++;
        }
        int i5 = i4;
        while (i < i3) {
            int i6 = i + 1;
            byte b2 = byteBuffer.get(i);
            if (b2 >= 0) {
                int i7 = i5 + 1;
                cArr[i5] = (char) b2;
                int i8 = i6;
                while (i8 < i3) {
                    byte b3 = byteBuffer.get(i8);
                    if (b3 < 0) {
                        break;
                    }
                    i8++;
                    cArr[i7] = (char) b3;
                    i7++;
                }
                i5 = i7;
                i = i8;
            } else if (b2 < -32) {
                if (i6 >= i3) {
                    throw rp0.m5882c();
                }
                i += 2;
                p32.m5162c(b2, byteBuffer.get(i6), cArr, i5);
                i5++;
            } else if (b2 < -16) {
                if (i6 >= i3 - 1) {
                    throw rp0.m5882c();
                }
                int i9 = i + 2;
                i += 3;
                p32.m5164d(b2, byteBuffer.get(i6), byteBuffer.get(i9), cArr, i5);
                i5++;
            } else {
                if (i6 >= i3 - 2) {
                    throw rp0.m5882c();
                }
                byte b4 = byteBuffer.get(i6);
                int i10 = i + 3;
                byte b5 = byteBuffer.get(i + 2);
                i += 4;
                p32.m5160b(b2, b4, b5, byteBuffer.get(i10), cArr, i5);
                i5 += 2;
            }
        }
        return new String(cArr, 0, i5);
    }

    /* JADX INFO: renamed from: y */
    public static int m5810y(int i, byte[] bArr, int i2, C1583x9 c1583x9) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            c1583x9.f12494a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            c1583x9.f12494a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            c1583x9.f12494a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            c1583x9.f12494a = i9 | (b4 << DerValue.tag_UniversalString);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                c1583x9.f12494a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* JADX INFO: renamed from: z */
    public static int m5811z(byte[] bArr, int i, C1583x9 c1583x9) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m5810y(b, bArr, i2, c1583x9);
        }
        c1583x9.f12494a = b;
        return i2;
    }

    /* JADX INFO: renamed from: E */
    public abstract int mo5812E(String str, byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: I */
    public abstract InputFilter[] mo2530I(InputFilter[] inputFilterArr);

    /* JADX INFO: renamed from: V */
    public boolean m5813V(int i, int i2, byte[] bArr) {
        return mo5814g0(0, i, i2, bArr) == 0;
    }

    /* JADX INFO: renamed from: g0 */
    public abstract int mo5814g0(int i, int i2, int i3, byte[] bArr);

    /* JADX INFO: renamed from: n0 */
    public abstract void mo2531n0(boolean z);

    /* JADX INFO: renamed from: o0 */
    public abstract void mo2532o0(boolean z);

    /* JADX INFO: renamed from: v */
    public abstract String mo5815v(int i, int i2, byte[] bArr);

    /* JADX INFO: renamed from: x */
    public abstract String mo5816x(ByteBuffer byteBuffer, int i, int i2);

    /* JADX INFO: renamed from: N */
    public void mo4516N() {
    }

    /* JADX INFO: renamed from: a0 */
    public void mo4522a0() {
    }

    /* JADX INFO: renamed from: o */
    public void mo4526o() {
    }

    /* JADX INFO: renamed from: O */
    public void mo4517O(int i) {
    }

    /* JADX INFO: renamed from: Q */
    public void mo4519Q(j51 j51Var) {
    }

    /* JADX INFO: renamed from: R */
    public void mo4520R(long j) {
    }

    /* JADX INFO: renamed from: S */
    public void mo4521S(long j) {
    }

    /* JADX INFO: renamed from: b0 */
    public void mo4523b0(int i) {
    }

    /* JADX INFO: renamed from: d0 */
    public void mo4525d0(long j) {
    }

    /* JADX INFO: renamed from: e0 */
    public void mo3181e0(long j) {
    }

    /* JADX INFO: renamed from: q0 */
    public void mo4527q0(nv1 nv1Var) {
    }

    /* JADX INFO: renamed from: P */
    public void mo4518P(int i, long j) {
    }

    /* JADX INFO: renamed from: r0 */
    public void mo4528r0(C1437tb c1437tb, j51 j51Var) {
    }

    /* JADX INFO: renamed from: c0 */
    public void mo4524c0(long j, long j2, int i) {
    }
}
