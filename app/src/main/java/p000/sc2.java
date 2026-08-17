package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.AssetManager;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.sun.security.util.DerValue;
import android.util.Log;
import com.example.ssmousepro.injection.InjectionMetrics;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.github.muntashirakon.adb.PairingConnectionCtx;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.Executor;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class sc2 {

    /* JADX INFO: renamed from: a */
    public static final Object[] f10357a = new Object[0];

    /* JADX INFO: renamed from: b */
    public static final C1400sb f10358b = new C1400sb("io.grpc.internal.GrpcAttributes.securityLevel");

    /* JADX INFO: renamed from: c */
    public static final C1400sb f10359c = new C1400sb("io.grpc.internal.GrpcAttributes.clientEagAttrs");

    /* JADX INFO: renamed from: d */
    public static final pu0 f10360d = new pu0(6);

    /* JADX INFO: renamed from: e */
    public static final String[] f10361e = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* JADX INFO: renamed from: f */
    public static final String[] f10362f = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* JADX INFO: renamed from: g */
    public static final String[] f10363g = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX INFO: renamed from: A */
    public static jr1 m6031A(Set set, tm0 tm0Var) {
        p32.m5188s(set, "set1");
        p32.m5188s(tm0Var, "set2");
        return new jr1(set, tm0Var, 1);
    }

    /* JADX INFO: renamed from: B */
    public static int m6032B(int i, byte[] bArr) {
        return (bArr[i + 3] << DerValue.tag_GeneralizedTime) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: C */
    public static long m6033C(int i, byte[] bArr) {
        return ((((long) m6032B(i + 4, bArr)) & 4294967295L) << 32) | (((long) m6032B(i, bArr)) & 4294967295L);
    }

    /* JADX INFO: renamed from: D */
    public static void m6034D(byte[] bArr, long j, int i) {
        m6081y((int) (j >>> 32), i, bArr);
        m6081y((int) (j & 4294967295L), i + 4, bArr);
    }

    /* JADX INFO: renamed from: E */
    public static void m6035E(byte[] bArr, long j, int i) {
        m6082z((int) (4294967295L & j), i, bArr);
        m6082z((int) (j >>> 32), i + 4, bArr);
    }

    /* JADX INFO: renamed from: F */
    public static int m6036F(long j) {
        return (int) ((j - (((long) ((int) (58728449 * j))) * 8380417)) >>> 32);
    }

    /* JADX INFO: renamed from: G */
    public static void m6037G(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: H */
    public static C1289pb m6038H(String str) throws XmlPullParserException, IOException {
        int i;
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!hr1.m3250A(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw fc1.m2799a(null, "Couldn't find xmp metadata");
        }
        om0 om0Var = qm0.f9540b;
        kk1 kk1VarM6039I = kk1.f5896e;
        long j = -9223372036854775807L;
        loop0: do {
            xmlPullParserNewPullParser.next();
            i = 2;
            if (hr1.m3250A(xmlPullParserNewPullParser, "rdf:Description")) {
                int i2 = 0;
                for (int i3 = 0; i3 < 4; i3++) {
                    String strM3281q = hr1.m3281q(xmlPullParserNewPullParser, f10361e[i3]);
                    if (strM3281q != null) {
                        if (Integer.parseInt(strM3281q) != 1) {
                            break loop0;
                        }
                        int i4 = 0;
                        while (true) {
                            if (i4 < 4) {
                                String strM3281q2 = hr1.m3281q(xmlPullParserNewPullParser, f10362f[i4]);
                                if (strM3281q2 != null) {
                                    j = Long.parseLong(strM3281q2);
                                    if (j != -1) {
                                        break;
                                    }
                                    break;
                                }
                                i4++;
                            }
                            j = -9223372036854775807L;
                            break;
                        }
                        while (true) {
                            if (i2 >= 2) {
                                om0 om0Var2 = qm0.f9540b;
                                kk1VarM6039I = kk1.f5896e;
                                break;
                            }
                            String strM3281q3 = hr1.m3281q(xmlPullParserNewPullParser, f10363g[i2]);
                            if (strM3281q3 != null) {
                                kk1VarM6039I = qm0.m5571u(new f61("image/jpeg", 0L, 0L), new f61("video/mp4", Long.parseLong(strM3281q3), 0L));
                                break;
                            }
                            i2++;
                        }
                    }
                }
                return null;
            }
            if (hr1.m3250A(xmlPullParserNewPullParser, "Container:Directory")) {
                kk1VarM6039I = m6039I(xmlPullParserNewPullParser, "Container", "Item");
            } else if (hr1.m3250A(xmlPullParserNewPullParser, "GContainer:Directory")) {
                kk1VarM6039I = m6039I(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!hr1.m3287y(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (kk1VarM6039I.isEmpty()) {
            break loop0;
        }
        return new C1289pb(kk1VarM6039I, i, j);
        return null;
    }

    /* JADX INFO: renamed from: I */
    public static kk1 m6039I(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        nm0 nm0VarM5566m = qm0.m5566m();
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (hr1.m3250A(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(":Length");
                String strConcat6 = str2.concat(":Padding");
                String strM3281q = hr1.m3281q(xmlPullParser, strConcat3);
                String strM3281q2 = hr1.m3281q(xmlPullParser, strConcat4);
                String strM3281q3 = hr1.m3281q(xmlPullParser, strConcat5);
                String strM3281q4 = hr1.m3281q(xmlPullParser, strConcat6);
                if (strM3281q == null || strM3281q2 == null) {
                    return kk1.f5896e;
                }
                nm0VarM5566m.m3901a(new f61(strM3281q, strM3281q3 != null ? Long.parseLong(strM3281q3) : 0L, strM3281q4 != null ? Long.parseLong(strM3281q4) : 0L));
            }
        } while (!hr1.m3287y(xmlPullParser, strConcat2));
        return nm0VarM5566m.m4561g();
    }

    /* JADX INFO: renamed from: J */
    public static k51 m6040J(y80 y80Var, boolean z) {
        ca0 ca0Var = z ? null : am0.f269r;
        dc1 dc1Var = new dc1(10);
        k51 k51VarM193f0 = null;
        int i = 0;
        while (true) {
            try {
                y80Var.mo2413a(0, 10, dc1Var.f2882a);
                dc1Var.m2316F(0);
                if (dc1Var.m2340w() != 4801587) {
                    break;
                }
                dc1Var.m2317G(3);
                int iM2336s = dc1Var.m2336s();
                int i2 = iM2336s + 10;
                if (k51VarM193f0 == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(dc1Var.f2882a, 0, bArr, 0, 10);
                    y80Var.mo2413a(10, iM2336s, bArr);
                    k51VarM193f0 = new am0(ca0Var).m193f0(i2, bArr);
                } else {
                    y80Var.mo2418g(iM2336s);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        y80Var.mo2422l();
        y80Var.mo2418g(i);
        if (k51VarM193f0 == null || k51VarM193f0.f5679a.length == 0) {
            return null;
        }
        return k51VarM193f0;
    }

    /* JADX INFO: renamed from: K */
    public static byte[] m6041K(int i, InputStream inputStream) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                f40.m2719o(jd0.m3609g(i, "Not enough bytes to read: "));
                return null;
            }
            i2 += i3;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: L */
    public static final byte[] m6042L(InputStream inputStream) throws IOException {
        inputStream.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(PairingConnectionCtx.PeerInfo.MAX_PEER_INFO_SIZE, inputStream.available()));
        m6068l(inputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArray.getClass();
        return byteArray;
    }

    /* JADX INFO: renamed from: M */
    public static byte[] m6043M(FileInputStream fileInputStream, int i, int i2) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int i4 = fileInputStream.read(bArr2);
                if (i4 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
                inflater.setInput(bArr2, 0, i4);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i2 - iInflate);
                    i3 += i4;
                } catch (DataFormatException e) {
                    throw new IllegalStateException(e.getMessage());
                }
            }
            if (i3 == i) {
                if (!inflater.finished()) {
                    throw new IllegalStateException("Inflater did not finish");
                }
                inflater.end();
                return bArr;
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }

    /* JADX INFO: renamed from: N */
    public static int m6044N(C0141cm c0141cm, int i, int i2, int i3) {
        ki0.m3857c(Math.max(Math.max(i, i2), i3) <= 31);
        int i4 = (1 << i) - 1;
        int i5 = (1 << i2) - 1;
        hp0.m3216g(hp0.m3216g(i4, i5), 1 << i3);
        if (c0141cm.m1231b() < i) {
            return -1;
        }
        int iM1238i = c0141cm.m1238i(i);
        if (iM1238i == i4) {
            if (c0141cm.m1231b() < i2) {
                return -1;
            }
            int iM1238i2 = c0141cm.m1238i(i2);
            iM1238i += iM1238i2;
            if (iM1238i2 == i5) {
                if (c0141cm.m1231b() < i3) {
                    return -1;
                }
                return c0141cm.m1238i(i3) + iM1238i;
            }
        }
        return iM1238i;
    }

    /* JADX INFO: renamed from: O */
    public static C0558d8 m6045O(dc1 dc1Var) {
        dc1Var.m2317G(1);
        int iM2340w = dc1Var.m2340w();
        long j = ((long) dc1Var.f2883b) + ((long) iM2340w);
        int i = iM2340w / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            long jM2331n = dc1Var.m2331n();
            if (jM2331n == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
                break;
            }
            jArrCopyOf[i2] = jM2331n;
            jArrCopyOf2[i2] = dc1Var.m2331n();
            dc1Var.m2317G(2);
        }
        dc1Var.m2317G((int) (j - ((long) dc1Var.f2883b)));
        return new C0558d8(23, jArrCopyOf, jArrCopyOf2);
    }

    /* JADX INFO: renamed from: P */
    public static long m6046P(int i, InputStream inputStream) {
        byte[] bArrM6041K = m6041K(i, inputStream);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += ((long) (bArrM6041K[i2] & 255)) << (i2 * 8);
        }
        return j;
    }

    /* JADX INFO: renamed from: R */
    public static final void m6047R(Object[] objArr, int i, int i2) {
        objArr.getClass();
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    /* JADX INFO: renamed from: S */
    public static void m6048S(C0141cm c0141cm) {
        c0141cm.m1249t(3);
        c0141cm.m1249t(8);
        boolean zM1237h = c0141cm.m1237h();
        boolean zM1237h2 = c0141cm.m1237h();
        if (zM1237h) {
            c0141cm.m1249t(5);
        }
        if (zM1237h2) {
            c0141cm.m1249t(6);
        }
    }

    /* JADX INFO: renamed from: T */
    public static void m6049T(C0141cm c0141cm) {
        int iM1238i;
        int iM1238i2 = c0141cm.m1238i(2);
        if (iM1238i2 == 0) {
            c0141cm.m1249t(6);
            return;
        }
        int iM6044N = m6044N(c0141cm, 5, 8, 16) + 1;
        if (iM1238i2 == 1) {
            c0141cm.m1249t(iM6044N * 7);
            return;
        }
        if (iM1238i2 == 2) {
            boolean zM1237h = c0141cm.m1237h();
            int i = zM1237h ? 1 : 5;
            int i2 = zM1237h ? 7 : 5;
            int i3 = zM1237h ? 8 : 6;
            int i4 = 0;
            while (i4 < iM6044N) {
                if (c0141cm.m1237h()) {
                    c0141cm.m1249t(7);
                    iM1238i = 0;
                } else {
                    if (c0141cm.m1238i(2) == 3 && c0141cm.m1238i(i2) * i != 0) {
                        c0141cm.m1248s();
                    }
                    iM1238i = c0141cm.m1238i(i3) * i;
                    if (iM1238i != 0 && iM1238i != 180) {
                        c0141cm.m1248s();
                    }
                    c0141cm.m1248s();
                }
                if (iM1238i != 0 && iM1238i != 180 && c0141cm.m1237h()) {
                    i4++;
                }
                i4++;
            }
        }
    }

    /* JADX INFO: renamed from: U */
    public static tu0 m6050U(int i, y80 y80Var, dc1 dc1Var) throws fc1 {
        tu0 tu0VarM6345a = tu0.m6345a(y80Var, dc1Var);
        while (true) {
            int i2 = tu0VarM6345a.f11017a;
            if (i2 == i) {
                return tu0VarM6345a;
            }
            jd0.m3621s(i2, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
            long j = tu0VarM6345a.f11018b;
            long j2 = 8 + j;
            if (j % 2 != 0) {
                j2 = 9 + j;
            }
            if (j2 > 2147483647L) {
                throw fc1.m2800b("Chunk is too large (~2GB+) to skip; id: " + i2);
            }
            y80Var.mo2423m((int) j2);
            tu0VarM6345a = tu0.m6345a(y80Var, dc1Var);
        }
    }

    /* JADX INFO: renamed from: V */
    public static void m6051V(List list, sf1 sf1Var, int i, int i2) {
        for (int size = list.size() - 1; size > i2; size--) {
            if (sf1Var.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            list.remove(i3);
        }
    }

    /* JADX INFO: renamed from: W */
    public static final Object[] m6052W(Collection collection) {
        int size = collection.size();
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArrCopyOf = new Object[size];
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    objArrCopyOf[i] = it.next();
                    if (i2 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            i3 = 2147483645;
                            if (i2 >= 2147483645) {
                                ca0.m1173e();
                                return null;
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                    } else if (!it.hasNext()) {
                        return Arrays.copyOf(objArrCopyOf, i2);
                    }
                    i = i2;
                }
            }
        }
        return f10357a;
    }

    /* JADX INFO: renamed from: X */
    public static final Object[] m6053X(Collection collection, Object[] objArr) {
        Object[] objArrCopyOf;
        int size = collection.size();
        int i = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArrCopyOf = objArr;
                } else {
                    Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    objNewInstance.getClass();
                    objArrCopyOf = (Object[]) objNewInstance;
                }
                while (true) {
                    int i2 = i + 1;
                    objArrCopyOf[i] = it.next();
                    if (i2 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            i3 = 2147483645;
                            if (i2 >= 2147483645) {
                                ca0.m1173e();
                                return null;
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                    } else if (!it.hasNext()) {
                        if (objArrCopyOf != objArr) {
                            return Arrays.copyOf(objArrCopyOf, i2);
                        }
                        objArr[i2] = null;
                        return objArr;
                    }
                    i = i2;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x01a2 A[Catch: all -> 0x01b0, TRY_LEAVE, TryCatch #10 {all -> 0x01b0, blocks: (B:124:0x0196, B:126:0x01a2, B:135:0x01b3), top: B:229:0x0196 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x01b3 A[Catch: all -> 0x01b0, TRY_ENTER, TRY_LEAVE, TryCatch #10 {all -> 0x01b0, blocks: (B:124:0x0196, B:126:0x01a2, B:135:0x01b3), top: B:229:0x0196 }] */
    /* JADX WARN: Code duplicated, block: B:146:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:150:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:151:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:159:0x01f6 A[Catch: all -> 0x0218, TRY_LEAVE, TryCatch #31 {all -> 0x0218, blocks: (B:156:0x01ee, B:157:0x01f0, B:159:0x01f6), top: B:243:0x01ee }] */
    /* JADX WARN: Code duplicated, block: B:200:0x0245  */
    /* JADX WARN: Code duplicated, block: B:203:0x024e  */
    /* JADX WARN: Code duplicated, block: B:208:0x0259 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:210:0x025d  */
    /* JADX WARN: Code duplicated, block: B:251:0x01e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:253:0x0191 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:257:0x01fb A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y */
    public static void m6054Y(Context context, Executor executor, lg1 lg1Var, boolean z) {
        char c;
        FileInputStream fileInputStreamM2450a;
        f20[] f20VarArrM5522W;
        lg1 lg1Var2;
        f20[] f20VarArr;
        byte[] bArr;
        byte[] bArr2;
        boolean z2;
        ByteArrayInputStream byteArrayInputStream;
        FileOutputStream fileOutputStream;
        Throwable th;
        byte[] bArr3;
        int i;
        ByteArrayOutputStream byteArrayOutputStream;
        int i2;
        e20 e20Var;
        boolean z3;
        boolean z4;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j = dataInputStream.readLong();
                            dataInputStream.close();
                            z4 = j == packageInfo.lastUpdateTime;
                            if (z4) {
                                lg1Var.mo743f(2, null);
                            }
                        } catch (Throwable th2) {
                            try {
                                dataInputStream.close();
                                throw th2;
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                                throw th2;
                            }
                        }
                    } catch (IOException unused) {
                        z4 = false;
                    }
                } else {
                    z4 = false;
                }
                if (z4) {
                    context.getPackageName();
                    qg1.m5492c(context, false);
                    return;
                }
            }
            context.getPackageName();
            byte[] bArr4 = AbstractC1337qm.f9537e;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            e20 e20Var2 = new e20(assets, executor, lg1Var, name, file2);
            byte[] bArr5 = e20Var2.f3174c;
            if (bArr5 == null) {
                e20Var2.m2451b(3, Integer.valueOf(Build.VERSION.SDK_INT));
            } else {
                try {
                    try {
                        if (file2.exists()) {
                            if (!file2.canWrite()) {
                                e20Var2.m2451b(4, null);
                            }
                            if (z2 || !z) {
                                z3 = 0;
                            } else {
                                z3 = c;
                            }
                            qg1.m5492c(context, z3);
                        }
                        try {
                            file2.createNewFile();
                        } catch (IOException unused2) {
                            c = 1;
                            e20Var2.m2451b(4, null);
                            z2 = false;
                        }
                        if (fileInputStreamM2450a != null) {
                            try {
                                if (!Arrays.equals(bArr4, m6041K(4, fileInputStreamM2450a))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                f20VarArrM5522W = AbstractC1337qm.m5522W(fileInputStreamM2450a, m6041K(4, fileInputStreamM2450a), e20Var2.f3176e);
                                try {
                                    fileInputStreamM2450a.close();
                                } catch (IOException e) {
                                    lg1Var.mo743f(7, e);
                                }
                                e20Var2.f3178g = f20VarArrM5522W;
                            } catch (IOException e2) {
                                lg1Var.mo743f(7, e2);
                                try {
                                    fileInputStreamM2450a.close();
                                } catch (IOException e3) {
                                    lg1Var.mo743f(7, e3);
                                }
                                f20VarArrM5522W = null;
                            } catch (IllegalStateException e4) {
                                lg1Var.mo743f(8, e4);
                                fileInputStreamM2450a.close();
                                f20VarArrM5522W = null;
                            }
                        }
                        f20[] f20VarArr2 = e20Var2.f3178g;
                        if (f20VarArr2 != null && (i2 = Build.VERSION.SDK_INT) <= 34) {
                            switch (i2) {
                                case InjectionMetrics.I_APPLY_DELTA /* 31 */:
                                case 32:
                                case InjectionMetrics.I_KEY_EVENTS /* 33 */:
                                case InjectionMetrics.I_TOQUES_ATIVOS /* 34 */:
                                    try {
                                        FileInputStream fileInputStreamM2450a2 = e20Var2.m2450a(assets, "dexopt/baseline.profm");
                                        if (fileInputStreamM2450a2 != null) {
                                            try {
                                                if (!Arrays.equals(AbstractC1337qm.f9538f, m6041K(4, fileInputStreamM2450a2))) {
                                                    throw new IllegalStateException("Invalid magic");
                                                }
                                                e20Var2.f3178g = AbstractC1337qm.m5518S(fileInputStreamM2450a2, m6041K(4, fileInputStreamM2450a2), bArr5, f20VarArr2);
                                                fileInputStreamM2450a2.close();
                                                e20Var = e20Var2;
                                            } catch (Throwable th4) {
                                                try {
                                                    fileInputStreamM2450a2.close();
                                                    throw th4;
                                                } catch (Throwable th5) {
                                                    th4.addSuppressed(th5);
                                                    throw th4;
                                                }
                                            }
                                        } else {
                                            if (fileInputStreamM2450a2 != null) {
                                                fileInputStreamM2450a2.close();
                                            }
                                            e20Var = null;
                                        }
                                    } catch (FileNotFoundException e5) {
                                        lg1Var.mo743f(9, e5);
                                    } catch (IOException e6) {
                                        lg1Var.mo743f(7, e6);
                                    } catch (IllegalStateException e7) {
                                        e20Var2.f3178g = null;
                                        lg1Var.mo743f(8, e7);
                                    }
                                    if (e20Var != null) {
                                        e20Var2 = e20Var;
                                        break;
                                    }
                                default:
                                    lg1Var2 = e20Var2.f3173b;
                                    f20VarArr = e20Var2.f3178g;
                                    bArr = e20Var2.f3174c;
                                    if (f20VarArr != null && bArr != null) {
                                        if (e20Var2.f3177f) {
                                            f40.m2719o("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                            return;
                                        }
                                        try {
                                            byteArrayOutputStream = new ByteArrayOutputStream();
                                            try {
                                                byteArrayOutputStream.write(bArr4);
                                                byteArrayOutputStream.write(bArr);
                                                if (AbstractC1337qm.m5538g0(byteArrayOutputStream, bArr, f20VarArr)) {
                                                    e20Var2.f3179h = byteArrayOutputStream.toByteArray();
                                                    byteArrayOutputStream.close();
                                                    e20Var2.f3178g = null;
                                                } else {
                                                    lg1Var2.mo743f(5, null);
                                                    e20Var2.f3178g = null;
                                                    byteArrayOutputStream.close();
                                                }
                                            } catch (Throwable th6) {
                                                try {
                                                    byteArrayOutputStream.close();
                                                    throw th6;
                                                } catch (Throwable th7) {
                                                    th6.addSuppressed(th7);
                                                    throw th6;
                                                }
                                            }
                                        } catch (IOException e8) {
                                            lg1Var2.mo743f(7, e8);
                                        } catch (IllegalStateException e9) {
                                            lg1Var2.mo743f(8, e9);
                                        }
                                    }
                                    bArr2 = e20Var2.f3179h;
                                    if (bArr2 != null) {
                                        z2 = false;
                                        c = 1;
                                    } else {
                                        try {
                                            if (e20Var2.f3177f) {
                                                f40.m2719o("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                                return;
                                            }
                                            try {
                                                try {
                                                    byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                                    try {
                                                        fileOutputStream = new FileOutputStream(e20Var2.f3175d);
                                                        try {
                                                            try {
                                                                bArr3 = new byte[UserVerificationMethods.USER_VERIFY_NONE];
                                                                while (true) {
                                                                    i = byteArrayInputStream.read(bArr3);
                                                                    if (i > 0) {
                                                                        fileOutputStream.write(bArr3, 0, i);
                                                                    } else {
                                                                        c = 1;
                                                                        try {
                                                                            e20Var2.m2451b(1, null);
                                                                            fileOutputStream.close();
                                                                            byteArrayInputStream.close();
                                                                            e20Var2.f3179h = null;
                                                                            e20Var2.f3178g = null;
                                                                            z2 = true;
                                                                        } catch (Throwable th8) {
                                                                            th = th8;
                                                                        }
                                                                    }
                                                                    th = th;
                                                                    try {
                                                                        fileOutputStream.close();
                                                                        throw th;
                                                                    } catch (Throwable th9) {
                                                                        th.addSuppressed(th9);
                                                                        throw th;
                                                                    }
                                                                }
                                                            } catch (Throwable th10) {
                                                                th = th10;
                                                            }
                                                        } catch (Throwable th11) {
                                                            th = th11;
                                                            Throwable th12 = th;
                                                            try {
                                                                byteArrayInputStream.close();
                                                                throw th12;
                                                            } catch (Throwable th13) {
                                                                th12.addSuppressed(th13);
                                                                throw th12;
                                                            }
                                                        }
                                                    } catch (Throwable th14) {
                                                        th = th14;
                                                    }
                                                } catch (FileNotFoundException e10) {
                                                    e = e10;
                                                    e20Var2.m2451b(6, e);
                                                    e20Var2.f3179h = null;
                                                    e20Var2.f3178g = null;
                                                    z2 = false;
                                                } catch (IOException e11) {
                                                    e = e11;
                                                    e20Var2.m2451b(7, e);
                                                    e20Var2.f3179h = null;
                                                    e20Var2.f3178g = null;
                                                    z2 = false;
                                                }
                                            } catch (FileNotFoundException e12) {
                                                e = e12;
                                                c = 1;
                                                e20Var2.m2451b(6, e);
                                                e20Var2.f3179h = null;
                                                e20Var2.f3178g = null;
                                                z2 = false;
                                            } catch (IOException e13) {
                                                e = e13;
                                                c = 1;
                                                e20Var2.m2451b(7, e);
                                                e20Var2.f3179h = null;
                                                e20Var2.f3178g = null;
                                                z2 = false;
                                            }
                                        } catch (Throwable th15) {
                                            e20Var2.f3179h = null;
                                            e20Var2.f3178g = null;
                                            throw th15;
                                        }
                                    }
                                    if (z2) {
                                        m6037G(packageInfo, filesDir);
                                    }
                                    if (z2) {
                                        z3 = 0;
                                    } else {
                                        z3 = 0;
                                    }
                                    qg1.m5492c(context, z3);
                            }
                        }
                        lg1Var2 = e20Var2.f3173b;
                        f20VarArr = e20Var2.f3178g;
                        bArr = e20Var2.f3174c;
                        if (f20VarArr != null) {
                            if (e20Var2.f3177f) {
                                f40.m2719o("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                return;
                            }
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            byteArrayOutputStream.write(bArr4);
                            byteArrayOutputStream.write(bArr);
                            if (AbstractC1337qm.m5538g0(byteArrayOutputStream, bArr, f20VarArr)) {
                                lg1Var2.mo743f(5, null);
                                e20Var2.f3178g = null;
                                byteArrayOutputStream.close();
                            } else {
                                e20Var2.f3179h = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                                e20Var2.f3178g = null;
                            }
                        }
                        bArr2 = e20Var2.f3179h;
                        if (bArr2 != null) {
                            if (e20Var2.f3177f) {
                                f40.m2719o("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                return;
                            }
                            byteArrayInputStream = new ByteArrayInputStream(bArr2);
                            fileOutputStream = new FileOutputStream(e20Var2.f3175d);
                            bArr3 = new byte[UserVerificationMethods.USER_VERIFY_NONE];
                            while (true) {
                                i = byteArrayInputStream.read(bArr3);
                                if (i > 0) {
                                    fileOutputStream.write(bArr3, 0, i);
                                } else {
                                    c = 1;
                                    e20Var2.m2451b(1, null);
                                    fileOutputStream.close();
                                    byteArrayInputStream.close();
                                    e20Var2.f3179h = null;
                                    e20Var2.f3178g = null;
                                    z2 = true;
                                }
                                th = th;
                                fileOutputStream.close();
                                throw th;
                            }
                        }
                        z2 = false;
                        c = 1;
                        if (z2) {
                            m6037G(packageInfo, filesDir);
                        }
                        if (z2) {
                            z3 = 0;
                        } else {
                            z3 = 0;
                        }
                        qg1.m5492c(context, z3);
                    } catch (Throwable th16) {
                        try {
                            fileInputStreamM2450a.close();
                            throw th16;
                        } catch (IOException e14) {
                            lg1Var.mo743f(7, e14);
                            throw th16;
                        }
                    }
                    fileInputStreamM2450a = e20Var2.m2450a(assets, "dexopt/baseline.prof");
                } catch (FileNotFoundException e15) {
                    lg1Var.mo743f(6, e15);
                    fileInputStreamM2450a = null;
                } catch (IOException e16) {
                    lg1Var.mo743f(7, e16);
                    fileInputStreamM2450a = null;
                }
                e20Var2.f3177f = true;
                c = '\b';
            }
            c = 1;
            z2 = false;
            if (z2) {
                z3 = 0;
            } else {
                z3 = 0;
            }
            qg1.m5492c(context, z3);
        } catch (PackageManager.NameNotFoundException e17) {
            lg1Var.mo743f(7, e17);
            qg1.m5492c(context, false);
        }
    }

    /* JADX INFO: renamed from: Z */
    public static void m6055Z(ByteArrayOutputStream byteArrayOutputStream, long j, int i) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX INFO: renamed from: a */
    public static final String m6056a(Object[] objArr, int i, int i2, AbstractC1092m1 abstractC1092m1) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == abstractC1092m1) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: a0 */
    public static void m6057a0(ByteArrayOutputStream byteArrayOutputStream, int i) {
        m6055Z(byteArrayOutputStream, i, 2);
    }

    /* JADX INFO: renamed from: b */
    public static int m6058b(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | (bArr[i] << DerValue.tag_GeneralizedTime) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m6059c(y80 y80Var) {
        dc1 dc1Var = new dc1(8);
        int i = tu0.m6345a(y80Var, dc1Var).f11017a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        y80Var.mo2413a(0, 4, dc1Var.f2882a);
        dc1Var.m2316F(0);
        int iM2324g = dc1Var.m2324g();
        if (iM2324g == 1463899717) {
            return true;
        }
        AbstractC1337qm.m5549m("WavHeaderReader", "Unsupported form type: " + iM2324g);
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static void m6060d(int i, String str) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    /* JADX INFO: renamed from: e */
    public static byte[] m6061e(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    /* JADX INFO: renamed from: f */
    public static short[] m6062f(short[] sArr) {
        if (sArr == null) {
            return null;
        }
        return (short[]) sArr.clone();
    }

    /* JADX INFO: renamed from: g */
    public static byte[] m6063g(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                try {
                    deflaterOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            deflater.end();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: h */
    public static byte[] m6064h(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return m6061e(bArr2);
        }
        if (bArr2 == null) {
            return m6061e(bArr);
        }
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    /* JADX INFO: renamed from: i */
    public static byte[] m6065i(byte[][] bArr) {
        int length = 0;
        for (int i = 0; i != bArr.length; i++) {
            length += bArr[i].length;
        }
        byte[] bArr2 = new byte[length];
        int length2 = 0;
        for (int i2 = 0; i2 != bArr.length; i2++) {
            byte[] bArr3 = bArr[i2];
            System.arraycopy(bArr3, 0, bArr2, length2, bArr3.length);
            length2 += bArr[i2].length;
        }
        return bArr2;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m6066j(byte[] bArr, byte[] bArr2) {
        if (bArr != null && bArr2 != null) {
            if (bArr == bArr2) {
                return true;
            }
            int length = bArr.length < bArr2.length ? bArr.length : bArr2.length;
            int length2 = bArr.length ^ bArr2.length;
            for (int i = 0; i != length; i++) {
                length2 |= bArr[i] ^ bArr2[i];
            }
            while (length < bArr2.length) {
                byte b = bArr2[length];
                length2 |= b ^ (~b);
                length++;
            }
            if (length2 == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public static byte[] m6067k(int i, int i2, byte[] bArr) {
        int iM6077u = m6077u(i, i2);
        byte[] bArr2 = new byte[iM6077u];
        System.arraycopy(bArr, i, bArr2, 0, Math.min(bArr.length - i, iM6077u));
        return bArr2;
    }

    /* JADX INFO: renamed from: l */
    public static void m6068l(InputStream inputStream, ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        inputStream.getClass();
        byte[] bArr = new byte[PairingConnectionCtx.PeerInfo.MAX_PEER_INFO_SIZE];
        int i = inputStream.read(bArr);
        while (i >= 0) {
            byteArrayOutputStream.write(bArr, 0, i);
            i = inputStream.read(bArr);
        }
    }

    /* JADX INFO: renamed from: m */
    public static od0 m6069m(Context context) {
        ProviderInfo providerInfo;
        hv0 hv0Var;
        ApplicationInfo applicationInfo;
        PackageManager packageManager = context.getPackageManager();
        rc2.m5789j(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            hv0Var = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArr = packageManager.getPackageInfo(str2, 64).signatures;
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArr) {
                    arrayList.add(signature.toByteArray());
                }
                hv0Var = new hv0(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
                hv0Var = null;
            }
        }
        if (hv0Var == null) {
            return null;
        }
        return new od0(new nd0(context, hv0Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public static AbstractC1399sa m6070n(hg1 hg1Var) throws IOException {
        l01 l01Var;
        int i;
        int[] iArr;
        int i2;
        int iM3429d;
        int[] iArr2;
        Object objM7171w;
        int i3;
        C1148nk c1148nk = null;
        abstractC1388sM5931u = null;
        AbstractC1388s abstractC1388sM5931u = null;
        abstractC1388sM5931u = null;
        AbstractC1388s abstractC1388sM5931u2 = null;
        if (hg1Var == null) {
            f40.m2713i("keyInfo array null");
            return null;
        }
        AbstractC1388s abstractC1388s = hg1Var.f4562c;
        AbstractC0585e abstractC0585e = hg1Var.f4564e;
        C1431t5 c1431t5 = hg1Var.f4561b;
        C1351r c1351r = c1431t5.f10750a;
        InterfaceC0696h interfaceC0696h = c1431t5.f10751b;
        int i4 = 1;
        boolean z = true;
        boolean z2 = true;
        boolean z3 = true;
        if (c1351r.m5637z(vb1.f11612f)) {
            AbstractC1388s abstractC1388sM5931u3 = AbstractC1388s.m5931u(hg1Var.m3144k());
            int iIntValue = ((Integer) b52.f1201i.get(c1431t5.f10750a)).intValue();
            byte[] bArr = abstractC1388sM5931u3.f10174a;
            yh1 yh1Var = new yh1(true);
            int length = bArr.length;
            if (iIntValue == 5) {
                i3 = 5224;
            } else {
                if (iIntValue != 6) {
                    f40.m2713i(jd0.m3609g(iIntValue, "unknown security category: "));
                    return null;
                }
                i3 = 12392;
            }
            if (length != i3) {
                f40.m2713i("invalid key size for security category");
                return null;
            }
            yh1Var.f12983b = iIntValue;
            yh1Var.f12984c = m6061e(bArr);
            return yh1Var;
        }
        if (c1351r.m6676p(vb1.f11608b)) {
            return new eo1(b52.m930h(yn1.m7101j(interfaceC0696h)), AbstractC1388s.m5931u(hg1Var.m3144k()).f10174a);
        }
        if (c1351r.m6676p(vb1.f11609c)) {
            byte[] bArr2 = AbstractC1388s.m5931u(hg1Var.m3144k()).f10174a;
            int length2 = bArr2.length / 2;
            short[] sArr = new short[length2];
            for (int i5 = 0; i5 != length2; i5++) {
                int i6 = i5 * 2;
                sArr[i5] = (short) (((bArr2[i6 + 1] & 255) << 8) | (bArr2[i6] & 255));
            }
            return new c71(sArr);
        }
        if (c1351r.m6676p(ub1.f11250a)) {
            byte[] bArr3 = abstractC1388s.f10174a;
            AbstractC1388s c1123mw = new C1123mw(bArr3);
            if (bArr3.length != 64) {
                if (!b52.m926d(bArr3) && bArr3[0] == 4) {
                    abstractC1388sM5931u = AbstractC1388s.m5931u(bArr3);
                }
                if (abstractC1388sM5931u != null) {
                    c1123mw = AbstractC1388s.m5931u(abstractC1388sM5931u);
                }
            }
            byte[] bArr4 = c1123mw.f10174a;
            if (abstractC0585e == null) {
                return rj0.m5855a(m6067k(4, bArr4.length, bArr4));
            }
            byte[] bArrM2436x = abstractC0585e.m2436x();
            rj0 rj0VarM5855a = rj0.m5855a(m6067k(4, bArr4.length, bArr4));
            sj0.m6105a(bArrM2436x);
            rj0VarM5855a.getClass();
            return rj0VarM5855a;
        }
        if (c1351r.m5637z(InterfaceC1106mf.f6910g) || c1351r.m5637z(InterfaceC1106mf.f6853R)) {
            bo1 bo1Var = (bo1) b52.f1211s.get(c1351r);
            AbstractC1536w abstractC1536wM3144k = hg1Var.m3144k();
            if (!(abstractC1536wM3144k instanceof AbstractC1647z)) {
                return new co1(bo1Var, AbstractC1388s.m5931u(abstractC1536wM3144k).f10174a);
            }
            zn1 zn1VarM7323j = zn1.m7323j((AbstractC1647z) abstractC1536wM3144k);
            ao1 ao1Var = zn1VarM7323j.f13499d;
            return new co1(bo1Var, m6061e(zn1VarM7323j.f13497b), m6061e(zn1VarM7323j.f13498c), m6061e(ao1Var.f1011a), m6061e(ao1Var.f1012b));
        }
        HashMap map = b52.f1188O;
        if (map.containsKey(c1351r)) {
            sn1 sn1Var = (sn1) map.get(c1351r);
            byte[] bArr5 = abstractC1388s.f10174a;
            AbstractC1388s c1123mw2 = new C1123mw(bArr5);
            if (bArr5.length != sn1Var.f10470a.m5228a() * 4) {
                if (!b52.m926d(bArr5) && bArr5[0] == 4) {
                    abstractC1388sM5931u2 = AbstractC1388s.m5931u(bArr5);
                }
                if (abstractC1388sM5931u2 != null) {
                    c1123mw2 = AbstractC1388s.m5931u(abstractC1388sM5931u2);
                }
            }
            return new tn1(sn1Var, c1123mw2.f10174a);
        }
        if (c1351r.m5637z(InterfaceC1106mf.f6903e0)) {
            return new bd1((ad1) b52.f1203k.get(c1351r), AbstractC1388s.m5931u(hg1Var.m3144k()).f10174a);
        }
        if (c1351r.m5637z(InterfaceC1106mf.f6818I0)) {
            AbstractC1536w abstractC1536wM3144k2 = hg1Var.m3144k();
            if (abstractC1536wM3144k2 != null) {
                AbstractC1647z abstractC1647zM7171w = AbstractC1647z.m7171w(abstractC1536wM3144k2);
                C1148nk c1148nk2 = new C1148nk();
                int iM4493x = C1127n.m4489u(abstractC1647zM7171w.mo6823x(0)).m4493x();
                c1148nk2.f7431a = iM4493x;
                if (iM4493x != 0) {
                    f40.m2713i("unrecognized version");
                    return null;
                }
                c1148nk2.f7432b = m6061e(AbstractC1388s.m5931u(abstractC1647zM7171w.mo6823x(1)).f10174a);
                c1148nk2.f7433c = m6061e(AbstractC1388s.m5931u(abstractC1647zM7171w.mo6823x(2)).f10174a);
                c1148nk2.f7434d = m6061e(AbstractC1388s.m5931u(abstractC1647zM7171w.mo6823x(3)).f10174a);
                c1148nk2.f7435e = m6061e(AbstractC1388s.m5931u(abstractC1647zM7171w.mo6823x(4)).f10174a);
                c1148nk2.f7436f = m6061e(AbstractC1388s.m5931u(abstractC1647zM7171w.mo6823x(5)).f10174a);
                if (abstractC1647zM7171w.size() == 7) {
                    c1148nk2.f7437g = C1298pk.m5267j(abstractC1647zM7171w.mo6823x(6));
                }
                c1148nk = c1148nk2;
            }
            return new C1185ok((C1111mk) b52.f1209q.get(c1351r), m6061e(c1148nk.f7432b), m6061e(c1148nk.f7433c), m6061e(c1148nk.f7434d), m6061e(c1148nk.f7435e), m6061e(c1148nk.f7436f));
        }
        if (c1351r.m5637z(InterfaceC1106mf.f6862T0)) {
            byte[] bArr6 = AbstractC1388s.m5931u(hg1Var.m3144k()).f10174a;
            jg0 jg0Var = new jg0((ig0) b52.f1205m.get(c1351r), z3 ? 1 : 0);
            jg0Var.f5381c = m6061e(bArr6);
            return jg0Var;
        }
        if (c1351r.m5637z(InterfaceC1106mf.f6888a1)) {
            byte[] bArr7 = AbstractC1388s.m5931u(hg1Var.m3144k()).f10174a;
            ln1 ln1Var = new ln1((kn1) b52.f1207o.get(c1351r), z2 ? 1 : 0);
            ln1Var.f6480c = m6061e(bArr7);
            return ln1Var;
        }
        if (c1351r.m5637z(InterfaceC1106mf.f6964t1)) {
            return new j71((i71) b52.f1213u.get(c1351r), AbstractC1388s.m5931u(hg1Var.m3144k()).f10174a);
        }
        if (c1351r.m6676p(e71.f3249N) || c1351r.m6676p(e71.f3250O) || c1351r.m6676p(e71.f3251P)) {
            byte[] bArr8 = abstractC1388s.f10174a;
            C1123mw c1123mw3 = new C1123mw(bArr8);
            Object objM7171w2 = c1123mw3;
            if (bArr8.length != 64) {
                AbstractC1536w abstractC1536wM927e = b52.m927e(bArr8);
                if (abstractC1536wM927e instanceof AbstractC1388s) {
                    objM7171w2 = AbstractC1388s.m5931u(abstractC1536wM927e);
                } else if (abstractC1536wM927e instanceof AbstractC1647z) {
                    objM7171w2 = c1123mw3;
                    objM7171w2 = AbstractC1647z.m7171w(abstractC1536wM927e);
                }
            }
            objM7171w2 = c1123mw3;
            ow0 ow0Var = (ow0) b52.f1184K.get(c1351r);
            rw0 rw0VarM6794c = abstractC0585e != null ? wh1.m6794c(ow0Var, abstractC0585e) : null;
            if (objM7171w2 instanceof AbstractC1388s) {
                return new pw0(ow0Var, ((AbstractC1388s) objM7171w2).f10174a, rw0VarM6794c);
            }
            if (!(objM7171w2 instanceof AbstractC1647z)) {
                f40.m2713i(AbstractC1308pu.m5342i(new StringBuilder("invalid "), ow0Var.f8501a, " private key"));
                return null;
            }
            AbstractC1647z abstractC1647z = (AbstractC1647z) objM7171w2;
            byte[] bArr9 = AbstractC1388s.m5931u(abstractC1647z.mo6823x(0)).f10174a;
            byte[] bArr10 = AbstractC1388s.m5931u(abstractC1647z.mo6823x(1)).f10174a;
            pw0 pw0Var = new pw0(ow0Var, bArr9, rw0VarM6794c);
            if (m6066j(pw0Var.getEncoded(), bArr10)) {
                return pw0Var;
            }
            f40.m2713i(AbstractC1308pu.m5342i(new StringBuilder("inconsistent "), ow0Var.f8501a, " private key"));
            return null;
        }
        if (c1351r.m5637z(InterfaceC1106mf.f6799D1)) {
            AbstractC1647z abstractC1647zM7171w2 = AbstractC1647z.m7171w(hg1Var.m3144k());
            return new g71((f71) b52.f1217y.get(c1351r), AbstractC1388s.m5931u(abstractC1647zM7171w2.mo6823x(0)).f10174a, AbstractC1388s.m5931u(abstractC1647zM7171w2.mo6823x(1)).f10174a, AbstractC1388s.m5931u(abstractC1647zM7171w2.mo6823x(2)).f10174a, AbstractC1388s.m5931u(abstractC1647zM7171w2.mo6823x(3)).f10174a);
        }
        if (c1351r.m5637z(InterfaceC1106mf.f6827K1)) {
            AbstractC1647z abstractC1647zM7171w3 = AbstractC1647z.m7171w(hg1Var.m3144k());
            return new wn1((vn1) b52.f1174A.get(c1351r), AbstractC1388s.m5931u(abstractC1647zM7171w3.mo6823x(0)).f10174a, AbstractC1388s.m5931u(abstractC1647zM7171w3.mo6823x(1)).f10174a, AbstractC1388s.m5931u(abstractC1647zM7171w3.mo6823x(2)).f10174a, AbstractC1388s.m5931u(abstractC1647zM7171w3.mo6823x(3)).f10174a, AbstractC1388s.m5931u(abstractC1647zM7171w3.mo6823x(4)).f10174a);
        }
        HashMap map2 = b52.f1186M;
        if (map2.containsKey(c1351r)) {
            byte[] bArr11 = abstractC1388s.f10174a;
            C1123mw c1123mw4 = new C1123mw(bArr11);
            if (bArr11.length != 32) {
                AbstractC1536w abstractC1536wM927e2 = b52.m927e(bArr11);
                if (abstractC1536wM927e2 instanceof AbstractC1388s) {
                    objM7171w = c1123mw4;
                    objM7171w = AbstractC1388s.m5931u(abstractC1536wM927e2);
                } else if (abstractC1536wM927e2 instanceof AbstractC1647z) {
                    objM7171w = c1123mw4;
                    objM7171w = c1123mw4;
                    objM7171w = AbstractC1647z.m7171w(abstractC1536wM927e2);
                }
            }
            objM7171w = c1123mw4;
            objM7171w = c1123mw4;
            objM7171w = c1123mw4;
            iw0 iw0Var = (iw0) map2.get(c1351r);
            kw0 kw0VarM6793b = abstractC0585e != null ? wh1.m6793b(iw0Var, abstractC0585e) : null;
            if (objM7171w instanceof AbstractC1388s) {
                return new jw0(iw0Var, ((AbstractC1388s) objM7171w).f10174a, kw0VarM6793b);
            }
            if (!(objM7171w instanceof AbstractC1647z)) {
                f40.m2713i(AbstractC1308pu.m5342i(new StringBuilder("invalid "), iw0Var.f5193b, " private key"));
                return null;
            }
            AbstractC1647z abstractC1647z2 = (AbstractC1647z) objM7171w;
            byte[] bArr12 = AbstractC1388s.m5931u(abstractC1647z2.mo6823x(0)).f10174a;
            byte[] bArr13 = AbstractC1388s.m5931u(abstractC1647z2.mo6823x(1)).f10174a;
            jw0 jw0Var = new jw0(iw0Var, bArr12, kw0VarM6793b);
            if (m6066j(jw0Var.getEncoded(), bArr13)) {
                return jw0Var;
            }
            f40.m2713i(AbstractC1308pu.m5342i(new StringBuilder("inconsistent "), iw0Var.f5193b, " private key"));
            return null;
        }
        if (c1351r.m6676p(InterfaceC1106mf.f6967u0) || c1351r.m6676p(InterfaceC1106mf.f6971v0) || c1351r.m6676p(InterfaceC1106mf.f6975w0)) {
            AbstractC1536w abstractC1536wM3144k3 = hg1Var.m3144k();
            n20 n20Var = (n20) b52.f1176C.get(c1351r);
            if (!(abstractC1536wM3144k3 instanceof AbstractC1647z)) {
                if (abstractC1536wM3144k3 instanceof C1123mw) {
                    byte[] bArr14 = AbstractC1388s.m5931u(abstractC1536wM3144k3).f10174a;
                    return abstractC0585e != null ? new o20(n20Var, bArr14, wh1.m6792a(n20Var, abstractC0585e)) : new o20(n20Var, bArr14, null);
                }
                ca0.m1178j("not supported");
                return null;
            }
            AbstractC1647z abstractC1647zM7171w4 = AbstractC1647z.m7171w(abstractC1536wM3144k3);
            int iM4493x2 = C1127n.m4489u(abstractC1647zM7171w4.mo6823x(0)).m4493x();
            if (iM4493x2 == 0) {
                return abstractC0585e != null ? new o20(n20Var, AbstractC0585e.m2434w(abstractC1647zM7171w4.mo6823x(1)).m2436x(), AbstractC0585e.m2434w(abstractC1647zM7171w4.mo6823x(2)).m2436x(), AbstractC0585e.m2434w(abstractC1647zM7171w4.mo6823x(3)).m2436x(), AbstractC0585e.m2434w(abstractC1647zM7171w4.mo6823x(4)).m2436x(), AbstractC0585e.m2434w(abstractC1647zM7171w4.mo6823x(5)).m2436x(), AbstractC0585e.m2434w(abstractC1647zM7171w4.mo6823x(6)).m2436x(), m6061e(wh1.m6792a(n20Var, abstractC0585e).f8669d)) : new o20(n20Var, AbstractC0585e.m2434w(abstractC1647zM7171w4.mo6823x(1)).m2436x(), AbstractC0585e.m2434w(abstractC1647zM7171w4.mo6823x(2)).m2436x(), AbstractC0585e.m2434w(abstractC1647zM7171w4.mo6823x(3)).m2436x(), AbstractC0585e.m2434w(abstractC1647zM7171w4.mo6823x(4)).m2436x(), AbstractC0585e.m2434w(abstractC1647zM7171w4.mo6823x(5)).m2436x(), AbstractC0585e.m2434w(abstractC1647zM7171w4.mo6823x(6)).m2436x(), null);
            }
            ca0.m1178j(jd0.m3609g(iM4493x2, "unknown private key version: "));
            return null;
        }
        if (c1351r.m6676p(InterfaceC1106mf.f6959s0) || c1351r.m6676p(InterfaceC1106mf.f6963t0)) {
            j90 j90VarM3578j = j90.m3578j(hg1Var.m3144k());
            return new k90((i90) b52.f1215w.get(c1351r), m6061e(j90VarM3578j.f5327b), m6061e(j90VarM3578j.f5328c), m6061e(j90VarM3578j.f5329d), j90VarM3578j.f5330e.f6273a);
        }
        if (c1351r.m5637z(InterfaceC1106mf.f6855R1)) {
            byte[] bArr15 = AbstractC1388s.m5931u(hg1Var.m3144k()).f10174a;
            C1181og c1181og = (C1181og) b52.f1178E.get(c1351r);
            int i7 = c1181og.f7789b;
            int i8 = c1181og.f7789b;
            byte[] bArrM6067k = m6067k(0, (i7 + 7) / 8, bArr15);
            byte[] bArrM6067k2 = m6067k((i8 + 7) / 8, ((i8 + 7) / 8) * 2, bArr15);
            byte[] bArrM6067k3 = m6067k(((i8 + 7) / 8) * 2, bArr15.length, bArr15);
            C1294pg c1294pg = new C1294pg(c1181og, z ? 1 : 0);
            c1294pg.f8888c = m6061e(bArrM6067k);
            c1294pg.f8889d = m6061e(bArrM6067k2);
            c1294pg.f8890e = m6061e(bArrM6067k3);
            return c1294pg;
        }
        if (c1351r.m5637z(InterfaceC1106mf.f6871V1)) {
            byte[] bArr16 = AbstractC1388s.m5931u(hg1Var.m3144k()).f10174a;
            pj0 pj0Var = new pj0((oj0) b52.f1180G.get(c1351r));
            pj0Var.f8910c = m6061e(bArr16);
            return pj0Var;
        }
        if (c1351r.m5637z(InterfaceC1106mf.f6786A0)) {
            return new oi1((ni1) b52.f1182I.get(c1351r), AbstractC1388s.m5931u(hg1Var.m3144k()).f10174a);
        }
        if (c1351r.m6676p(vb1.f11610d)) {
            yb2 yb2VarM7077j = yb2.m7077j(interfaceC0696h);
            C1351r c1351r2 = yb2VarM7077j.f12934c.f10750a;
            AbstractC1536w abstractC1536wM3144k4 = hg1Var.m3144k();
            ic2 ic2Var = abstractC1536wM3144k4 != null ? new ic2(AbstractC1647z.m7171w(abstractC1536wM3144k4)) : null;
            try {
                jc2 jc2Var = new jc2(new hc2(yb2VarM7077j.f12933b, b52.m924b(c1351r2)));
                int i9 = ic2Var.f4938b;
                byte[] bArr17 = ic2Var.f4944m;
                jc2Var.f5365b = i9;
                jc2Var.f5367d = o21.m4669m(m6061e(ic2Var.f4939c));
                jc2Var.f5368e = o21.m4669m(m6061e(ic2Var.f4940d));
                jc2Var.f5369f = o21.m4669m(m6061e(ic2Var.f4941e));
                jc2Var.f5370g = o21.m4669m(m6061e(ic2Var.f4942f));
                if (ic2Var.f4937a != 0) {
                    jc2Var.f5366c = ic2Var.f4943g;
                }
                if (m6061e(bArr17) != null) {
                    C1663zf c1663zf = (C1663zf) o21.m4686w(m6061e(bArr17), C1663zf.class);
                    c1663zf.getClass();
                    jc2Var.f5371h = new C1663zf(c1663zf, c1351r2);
                }
                return new kc2(jc2Var);
            } catch (ClassNotFoundException e) {
                lv1.m4305q(e.getMessage(), "ClassNotFoundException processing BDS state: ");
                return null;
            }
        }
        if (c1351r.m6676p(vb1.f11611e)) {
            zb2 zb2VarM7301j = zb2.m7301j(interfaceC0696h);
            C1351r c1351r3 = zb2VarM7301j.f13339d.f10750a;
            try {
                AbstractC1536w abstractC1536wM3144k5 = hg1Var.m3144k();
                bc2 bc2Var = abstractC1536wM3144k5 != null ? new bc2(AbstractC1647z.m7171w(abstractC1536wM3144k5)) : null;
                int i10 = zb2VarM7301j.f13337b;
                cc2 cc2Var = new cc2(new ac2(i10, zb2VarM7301j.f13338c, b52.m924b(c1351r3)));
                long j = bc2Var.f1295b;
                byte[] bArr18 = bc2Var.f1301m;
                cc2Var.f1760b = j;
                cc2Var.f1762d = o21.m4669m(m6061e(bc2Var.f1297d));
                cc2Var.f1763e = o21.m4669m(m6061e(bc2Var.f1298e));
                cc2Var.f1764f = o21.m4669m(m6061e(bc2Var.f1299f));
                cc2Var.f1765g = o21.m4669m(m6061e(bc2Var.f1300g));
                if (bc2Var.f1294a != 0) {
                    cc2Var.f1761c = bc2Var.f1296c;
                }
                if (m6061e(bArr18) != null) {
                    C0017ag c0017agM148a = ((C0017ag) o21.m4686w(m6061e(bArr18), C0017ag.class)).m148a(c1351r3);
                    if (c0017agM148a.f226b == 0) {
                        cc2Var.f1766h = new C0017ag(c0017agM148a, (1 << i10) - 1);
                    } else {
                        cc2Var.f1766h = c0017agM148a;
                    }
                }
                return new dc2(cc2Var);
            } catch (ClassNotFoundException e2) {
                lv1.m4305q(e2.getMessage(), "ClassNotFoundException processing BDS state: ");
                return null;
            }
        }
        if (!c1351r.m6676p(vb1.f11607a)) {
            if (c1351r.m5637z(InterfaceC1106mf.f6885Z1)) {
                return new i01((h01) b52.f1190Q.get(c1351r), AbstractC1388s.m5931u(hg1Var.m3144k()).f10174a);
            }
            if (c1351r.m5637z(InterfaceC1106mf.f6905e2)) {
                return new xt1((wt1) b52.f1192S.get(c1351r), AbstractC1388s.m5931u(hg1Var.m3144k()).f10174a);
            }
            l41.m4048q("algorithm identifier in private key not recognised");
            return null;
        }
        AbstractC1536w abstractC1536wM3144k6 = hg1Var.m3144k();
        if (abstractC1536wM3144k6 != null) {
            AbstractC1647z abstractC1647zM7171w5 = AbstractC1647z.m7171w(abstractC1536wM3144k6);
            l01Var = new l01();
            l01Var.f6129a = ((C1127n) abstractC1647zM7171w5.mo6823x(0)).m4493x();
            l01Var.f6130b = ((C1127n) abstractC1647zM7171w5.mo6823x(1)).m4493x();
            l01Var.f6131c = ((AbstractC1388s) abstractC1647zM7171w5.mo6823x(2)).f10174a;
            l01Var.f6132d = ((AbstractC1388s) abstractC1647zM7171w5.mo6823x(3)).f10174a;
            l01Var.f6133e = ((AbstractC1388s) abstractC1647zM7171w5.mo6823x(4)).f10174a;
            l01Var.f6134f = C1431t5.m6230j(abstractC1647zM7171w5.mo6823x(5));
        } else {
            l01Var = null;
        }
        int i11 = l01Var.f6129a;
        int i12 = l01Var.f6130b;
        vh0 vh0VarM4018j = l01Var.m4018j();
        vh0 vh0VarM4018j2 = l01Var.m4018j();
        byte[] bArr19 = l01Var.f6132d;
        if1 if1Var = new if1();
        if1Var.f5009a = vh0VarM4018j2;
        int i13 = 1;
        int i14 = 8;
        while (vh0VarM4018j2.f11657a > i14) {
            i13++;
            i14 += 8;
        }
        if (bArr19.length % i13 != 0) {
            f40.m2713i(" Error: byte array is not encoded polynomial over given finite field GF2m");
            return null;
        }
        if1Var.f5011c = new int[bArr19.length / i13];
        int i15 = 0;
        int i16 = 0;
        while (true) {
            int[] iArr3 = if1Var.f5011c;
            if (i15 >= iArr3.length) {
                if (iArr3.length != 1 && iArr3[iArr3.length - 1] == 0) {
                    f40.m2713i(" Error: byte array is not encoded polynomial over given finite field GF2m");
                    return null;
                }
                if1Var.m3428c();
                byte[] bArr20 = l01Var.f6133e;
                kc1 kc1Var = new kc1();
                if (bArr20.length <= 4) {
                    f40.m2713i("invalid encoding");
                    return null;
                }
                int iM6443b = ua0.m6443b(0, bArr20);
                int i17 = iM6443b - 1;
                int i18 = do0.f2984a;
                if (i17 == 0) {
                    i = 1;
                } else {
                    if (i17 < 0) {
                        i17 = -i17;
                    }
                    i = 0;
                    while (i17 > 0) {
                        i++;
                        i17 >>>= 8;
                    }
                }
                if (bArr20.length != (iM6443b * i) + 4) {
                    f40.m2713i("invalid encoding");
                    return null;
                }
                kc1Var.f5748a = new int[iM6443b];
                int i19 = 0;
                while (true) {
                    iArr = kc1Var.f5748a;
                    if (i19 >= iM6443b) {
                        break;
                    }
                    int i20 = (i19 * i) + 4;
                    int i21 = 0;
                    for (int i22 = i - 1; i22 >= 0; i22--) {
                        i21 |= (bArr20[i20 + i22] & 255) << (i22 * 8);
                    }
                    iArr[i19] = i21;
                    i19++;
                }
                int length3 = iArr.length;
                boolean[] zArr = new boolean[length3];
                for (int i23 : iArr) {
                    if (i23 < 0 || i23 >= length3 || zArr[i23]) {
                        f40.m2713i("invalid encoding");
                        return null;
                    }
                    zArr[i23] = true;
                }
                String strM925c = b52.m925c(l01Var.f6134f.f10750a);
                int i24 = vh0VarM4018j.f11657a;
                int i25 = vh0VarM4018j.f11658b;
                int i26 = 1 << i24;
                int[] iArr4 = if1Var.f5011c;
                int length4 = iArr4.length - 1;
                if (iArr4[length4] == 0) {
                    length4 = -1;
                }
                int i27 = 0;
                Class cls = Integer.TYPE;
                int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) cls, length4, i26);
                int[][] iArr6 = (int[][]) Array.newInstance((Class<?>) cls, length4, i26);
                int i28 = 0;
                while (i28 < i26) {
                    int[] iArr7 = iArr6[0];
                    int i29 = i4;
                    int[] iArr8 = if1Var.f5011c;
                    int i30 = if1Var.f5010b;
                    int i31 = i30 - 1;
                    int iM3197F = iArr8[i30];
                    while (i31 >= 0) {
                        iM3197F = hp0.m3197F(iM3197F, i28, if1Var.f5009a.f11658b) ^ if1Var.f5011c[i31];
                        i31--;
                        iArr6 = iArr6;
                    }
                    iArr7[i28] = vh0VarM4018j.m6625a(iM3197F);
                    i28++;
                    i4 = i29;
                }
                boolean z4 = i4;
                int[][] iArr9 = iArr6;
                while (i4 < length4) {
                    int i32 = 0;
                    while (i32 < i26) {
                        iArr9[i4][i32] = hp0.m3197F(iArr9[i4 - 1][i32], i32, i25);
                        i32++;
                        i4 = i4;
                    }
                    i4++;
                }
                int i33 = 0;
                while (i33 < length4) {
                    int i34 = 0;
                    while (i34 < i26) {
                        int i35 = 0;
                        while (i35 <= i33) {
                            int[] iArr10 = iArr5[i33];
                            int i36 = i33;
                            int i37 = i34;
                            iArr10[i37] = iArr10[i34] ^ hp0.m3197F(iArr9[i35][i34], if1Var.m3429d((length4 + i35) - i36), i25);
                            i35++;
                            i33 = i36;
                            i34 = i37;
                        }
                        i34++;
                    }
                    i33++;
                }
                int i38 = i26 + 31;
                int[] iArr11 = new int[2];
                iArr11[z4 ? 1 : 0] = i38 >>> 5;
                iArr11[0] = length4 * i24;
                int[][] iArr12 = (int[][]) Array.newInstance((Class<?>) cls, iArr11);
                int i39 = 0;
                while (i39 < i26) {
                    int i40 = i39 >>> 5;
                    int i41 = (z4 ? 1 : 0) << (i39 & 31);
                    int i42 = i26;
                    int i43 = 0;
                    while (i43 < length4) {
                        int i44 = iArr5[i43][i39];
                        int i45 = i43;
                        for (int i46 = 0; i46 < i24; i46++) {
                            if (((i44 >>> i46) & 1) != 0) {
                                int[] iArr13 = iArr12[(((i45 + 1) * i24) - i46) - 1];
                                iArr13[i40] = iArr13[i40] ^ i41;
                            }
                        }
                        i43 = i45 + 1;
                    }
                    i39++;
                    i26 = i42;
                }
                int i47 = i26;
                int[] iArr14 = iArr12[0];
                if (iArr14.length != (i38 >> 5)) {
                    throw new ArithmeticException("Int array does not match given number of columns.");
                }
                int length5 = iArr14.length;
                int i48 = i47 & 31;
                int i49 = i48 == 0 ? -1 : ((z4 ? 1 : 0) << i48) - 1;
                for (int[] iArr15 : iArr12) {
                    int i50 = length5 - 1;
                    iArr15[i50] = iArr15[i50] & i49;
                }
                m01 m01Var = new m01(z4, strM925c);
                m01Var.f6579c = i11;
                m01Var.f6580d = i12;
                m01Var.f6581e = vh0VarM4018j;
                m01Var.f6582f = if1Var;
                m01Var.f6583g = kc1Var;
                int[] iArr16 = if1Var.f5011c;
                int length6 = iArr16.length - (z4 ? 1 : 0);
                if (iArr16[length6] == 0) {
                    length6 = -1;
                }
                if1[] if1VarArr = new if1[length6];
                int i51 = 0;
                while (true) {
                    i2 = length6 >> 1;
                    if (i51 >= i2) {
                        break;
                    }
                    int i52 = i51 << 1;
                    int[] iArr17 = new int[i52 + 1];
                    iArr17[i52] = 1;
                    if1VarArr[i51] = new if1(vh0VarM4018j, iArr17);
                    i51++;
                }
                while (i2 < length6) {
                    int i53 = i2 << 1;
                    int[] iArr18 = new int[i53 + 1];
                    iArr18[i53] = 1;
                    if1 if1Var2 = new if1(vh0VarM4018j, iArr18);
                    int[] iArr19 = if1Var2.f5011c;
                    int[] iArr20 = if1Var.f5011c;
                    int iM3426b = if1.m3426b(iArr20);
                    int i54 = -1;
                    if (iM3426b == -1) {
                        throw new ArithmeticException("Division by zero");
                    }
                    int length7 = iArr19.length;
                    int[] iArrM3427a = new int[length7];
                    int iM3426b2 = if1.m3426b(iArr20);
                    int iM6625a = vh0VarM4018j.m6625a(iM3426b2 == -1 ? i27 : iArr20[iM3426b2]);
                    int i55 = i27;
                    System.arraycopy(iArr19, i55, iArrM3427a, i55, length7);
                    while (iM3426b <= if1.m3426b(iArrM3427a)) {
                        int iM3426b3 = if1.m3426b(iArrM3427a);
                        int iM3197F2 = hp0.m3197F(iM3426b3 == i54 ? 0 : iArrM3427a[iM3426b3], iM6625a, i25);
                        int iM3426b4 = if1.m3426b(iArrM3427a) - iM3426b;
                        int iM3426b5 = if1.m3426b(iArr20);
                        if (iM3426b5 == i54) {
                            iArr2 = new int[1];
                        } else {
                            int[] iArr21 = new int[iM3426b5 + iM3426b4 + 1];
                            System.arraycopy(iArr20, 0, iArr21, iM3426b4, iM3426b5 + 1);
                            iArr2 = iArr21;
                        }
                        iArrM3427a = if1Var2.m3427a(if1Var2.m3430e(iArr2, iM3197F2), iArrM3427a);
                        m01Var = m01Var;
                        i54 = -1;
                    }
                    if1VarArr[i2] = new if1(vh0VarM4018j, iArrM3427a);
                    i2++;
                    m01Var = m01Var;
                    i27 = 0;
                }
                m01 m01Var2 = m01Var;
                int[] iArr22 = if1Var.f5011c;
                int length8 = iArr22.length - 1;
                int i56 = iArr22[length8] == 0 ? -1 : length8;
                if1[] if1VarArr2 = new if1[i56];
                int i57 = i56 - 1;
                for (int i58 = i57; i58 >= 0; i58--) {
                    if1 if1Var3 = if1VarArr[i58];
                    if1 if1Var4 = new if1();
                    if1Var4.f5009a = if1Var3.f5009a;
                    if1Var4.f5010b = if1Var3.f5010b;
                    int[] iArr23 = if1Var3.f5011c;
                    int[] iArr24 = new int[iArr23.length];
                    System.arraycopy(iArr23, 0, iArr24, 0, iArr23.length);
                    if1Var4.f5011c = iArr24;
                    if1VarArr2[i58] = if1Var4;
                }
                if1[] if1VarArr3 = new if1[i56];
                while (i57 >= 0) {
                    if1 if1Var5 = new if1();
                    if1Var5.f5009a = vh0VarM4018j;
                    if1Var5.f5010b = i57;
                    int[] iArr25 = new int[i57 + 1];
                    if1Var5.f5011c = iArr25;
                    iArr25[i57] = 1;
                    if1VarArr3[i57] = if1Var5;
                    i57--;
                }
                for (int i59 = 0; i59 < i56; i59++) {
                    if (if1VarArr2[i59].m3429d(i59) == 0) {
                        int i60 = i59 + 1;
                        boolean z5 = false;
                        while (i60 < i56) {
                            if (if1VarArr2[i60].m3429d(i59) != 0) {
                                if1 if1Var6 = if1VarArr2[i59];
                                if1VarArr2[i59] = if1VarArr2[i60];
                                if1VarArr2[i60] = if1Var6;
                                o21.m4685v0(if1VarArr3, i59, i60);
                                i60 = i56;
                                z5 = true;
                            }
                            i60++;
                        }
                        if (!z5) {
                            throw new ArithmeticException("Squaring matrix is not invertible.");
                        }
                    }
                    int iM6625a2 = vh0VarM4018j.m6625a(if1VarArr2[i59].m3429d(i59));
                    if1 if1Var7 = if1VarArr2[i59];
                    if (!if1Var7.f5009a.m6626b(iM6625a2)) {
                        throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
                    }
                    if1Var7.f5011c = if1Var7.m3430e(if1Var7.f5011c, iM6625a2);
                    if1Var7.m3428c();
                    if1 if1Var8 = if1VarArr3[i59];
                    if (!if1Var8.f5009a.m6626b(iM6625a2)) {
                        throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
                    }
                    if1Var8.f5011c = if1Var8.m3430e(if1Var8.f5011c, iM6625a2);
                    if1Var8.m3428c();
                    for (int i61 = 0; i61 < i56; i61++) {
                        if (i61 != i59 && (iM3429d = if1VarArr2[i61].m3429d(i59)) != 0) {
                            if1 if1Var9 = if1VarArr2[i59];
                            vh0 vh0Var = if1Var9.f5009a;
                            if (!vh0Var.m6626b(iM3429d)) {
                                throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
                            }
                            if1 if1Var10 = new if1(vh0Var, if1Var9.m3430e(if1Var9.f5011c, iM3429d));
                            if1 if1Var11 = if1VarArr3[i59];
                            vh0 vh0Var2 = if1Var11.f5009a;
                            if (!vh0Var2.m6626b(iM3429d)) {
                                throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
                            }
                            if1 if1Var12 = new if1(vh0Var2, if1Var11.m3430e(if1Var11.f5011c, iM3429d));
                            if1 if1Var13 = if1VarArr2[i61];
                            if1Var13.f5011c = if1Var13.m3427a(if1Var13.f5011c, if1Var10.f5011c);
                            if1Var13.m3428c();
                            if1 if1Var14 = if1VarArr3[i61];
                            if1Var14.f5011c = if1Var14.m3427a(if1Var14.f5011c, if1Var12.f5011c);
                            if1Var14.m3428c();
                        }
                    }
                }
                return m01Var2;
            }
            int i62 = 0;
            while (i62 < i14) {
                int[] iArr26 = if1Var.f5011c;
                iArr26[i15] = iArr26[i15] ^ ((bArr19[i16] & 255) << i62);
                i62 += 8;
                i16++;
            }
            if (!if1Var.f5009a.m6626b(if1Var.f5011c[i15])) {
                f40.m2713i(" Error: byte array is not encoded polynomial over given finite field GF2m");
                return null;
            }
            i15++;
        }
    }

    /* JADX INFO: renamed from: o */
    public static ox1 m6071o(AbstractC1399sa abstractC1399sa) throws IOException {
        if (abstractC1399sa instanceof zh1) {
            zh1 zh1Var = (zh1) abstractC1399sa;
            return new ox1(b52.m928f(zh1Var.f13419b), m6061e(zh1Var.f13420c));
        }
        if (abstractC1399sa instanceof fo1) {
            fo1 fo1Var = (fo1) abstractC1399sa;
            return new ox1(new C1431t5(vb1.f11608b, new yn1(b52.m929g(fo1Var.f5628b))), m6061e(fo1Var.f3866c));
        }
        if (abstractC1399sa instanceof d71) {
            return new ox1(new C1431t5(vb1.f11609c), m6061e(((d71) abstractC1399sa).f2817b));
        }
        int i = 0;
        if (abstractC1399sa instanceof ir0) {
            ir0 ir0Var = (ir0) abstractC1399sa;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(1);
            try {
                byteArrayOutputStream.write(ir0Var.m3479b());
                return new ox1(new C1431t5(ub1.f11250a), byteArrayOutputStream.toByteArray());
            } catch (Exception e) {
                l41.m4043l(e.getMessage(), e);
                return null;
            }
        }
        if (abstractC1399sa instanceof sj0) {
            sj0 sj0Var = (sj0) abstractC1399sa;
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            int i2 = sj0Var.f10417b;
            byteArrayOutputStream2.write((byte) (i2 >>> 24));
            byteArrayOutputStream2.write((byte) (i2 >>> 16));
            byteArrayOutputStream2.write((byte) (i2 >>> 8));
            byteArrayOutputStream2.write((byte) i2);
            try {
                byteArrayOutputStream2.write(sj0Var.f10418c.m3479b());
                return new ox1(new C1431t5(ub1.f11250a), byteArrayOutputStream2.toByteArray());
            } catch (Exception e2) {
                l41.m4043l(e2.getMessage(), e2);
                return null;
            }
        }
        if (abstractC1399sa instanceof un1) {
            un1 un1Var = (un1) abstractC1399sa;
            kk0 kk0Var = un1Var.f11372c;
            return new ox1(new C1431t5((C1351r) b52.f1187N.get((sn1) un1Var.f7397b)), m6064h(kk0Var.f5894a, kk0Var.f5895b));
        }
        if (abstractC1399sa instanceof do1) {
            do1 do1Var = (do1) abstractC1399sa;
            kk0 kk0Var2 = do1Var.f2985c;
            return new ox1(new C1431t5((C1351r) b52.f1210r.get((bo1) do1Var.f7397b)), m6064h(kk0Var2.f5894a, kk0Var2.f5895b));
        }
        if (abstractC1399sa instanceof C1335qk) {
            C1335qk c1335qk = (C1335qk) abstractC1399sa;
            return new ox1(new C1431t5((C1351r) b52.f1208p.get((C1111mk) c1335qk.f7397b)), m6061e(c1335qk.f9518c));
        }
        if (abstractC1399sa instanceof mc2) {
            mc2 mc2Var = (mc2) abstractC1399sa;
            byte[] bArrM4669m = o21.m4669m(mc2Var.f6770f);
            byte[] bArrM4669m2 = o21.m4669m(mc2Var.f6769e);
            byte[] encoded = mc2Var.getEncoded();
            return encoded.length > bArrM4669m.length + bArrM4669m2.length ? new ox1(new C1431t5(tp0.f10917a), new C1123mw(encoded)) : new ox1(new C1431t5(vb1.f11610d, new yb2(mc2Var.f6767c.f4527b, b52.m931i(mc2Var.f5628b))), new lc2(bArrM4669m, bArrM4669m2));
        }
        if (abstractC1399sa instanceof fc2) {
            fc2 fc2Var = (fc2) abstractC1399sa;
            byte[] bArr = fc2Var.f3754e;
            byte[] bArr2 = fc2Var.f3755f;
            byte[] bArrM4669m3 = o21.m4669m(bArr2);
            byte[] bArrM4669m4 = o21.m4669m(bArr);
            byte[] bArrM2801a = fc2Var.m2801a();
            if (bArrM2801a.length > bArrM4669m3.length + bArrM4669m4.length) {
                return new ox1(new C1431t5(tp0.f10918b), new C1123mw(bArrM2801a));
            }
            C1351r c1351r = vb1.f11611e;
            ac2 ac2Var = fc2Var.f3752c;
            return new ox1(new C1431t5(c1351r, new zb2(ac2Var.f144c, ac2Var.f145d, b52.m931i(fc2Var.f5628b))), new ec2(o21.m4669m(bArr2), o21.m4669m(bArr)));
        }
        if (abstractC1399sa instanceof o01) {
            o01 o01Var = (o01) abstractC1399sa;
            return new ox1(new C1431t5(vb1.f11607a), new n01(o01Var.f7602c, o01Var.f7603d, o01Var.f7604e, b52.m923a(o01Var.f5628b)));
        }
        if (abstractC1399sa instanceof kg0) {
            kg0 kg0Var = (kg0) abstractC1399sa;
            return new ox1(new C1431t5((C1351r) b52.f1204l.get((ig0) kg0Var.f7397b)), new C1123mw(m6061e(kg0Var.f5796c)));
        }
        if (abstractC1399sa instanceof mn1) {
            mn1 mn1Var = (mn1) abstractC1399sa;
            byte[] bArrM6061e = m6061e(mn1Var.f7054c);
            C1431t5 c1431t5 = new C1431t5((C1351r) b52.f1206n.get((kn1) mn1Var.f7397b));
            C1310pw c1310pw = new C1310pw(new C1123mw(bArrM6061e), i);
            c1310pw.f9182d = -1;
            return new ox1(c1431t5, c1310pw);
        }
        if (abstractC1399sa instanceof cd1) {
            cd1 cd1Var = (cd1) abstractC1399sa;
            return new ox1(new C1431t5((C1351r) b52.f1202j.get((ad1) cd1Var.f7397b)), new C1123mw(m6061e(cd1Var.f1776c)));
        }
        if (abstractC1399sa instanceof k71) {
            k71 k71Var = (k71) abstractC1399sa;
            return new ox1(new C1431t5((C1351r) b52.f1212t.get((i71) k71Var.f7397b)), m6061e(k71Var.f5692c));
        }
        if (abstractC1399sa instanceof m90) {
            m90 m90Var = (m90) abstractC1399sa;
            i90 i90Var = (i90) m90Var.f7397b;
            byte[] bArrM6061e2 = m6061e(m90Var.f6716c);
            C1431t5 c1431t6 = new C1431t5((C1351r) b52.f1214v.get(i90Var));
            byte[] bArr3 = new byte[bArrM6061e2.length + 1];
            bArr3[0] = (byte) i90Var.f4884b;
            System.arraycopy(bArrM6061e2, 0, bArr3, 1, bArrM6061e2.length);
            return new ox1(c1431t6, bArr3);
        }
        if (abstractC1399sa instanceof rw0) {
            rw0 rw0Var = (rw0) abstractC1399sa;
            return new ox1(new C1431t5((C1351r) b52.f1183J.get((ow0) rw0Var.f7397b)), rw0Var.getEncoded());
        }
        if (abstractC1399sa instanceof h71) {
            h71 h71Var = (h71) abstractC1399sa;
            f71 f71Var = (f71) h71Var.f7397b;
            byte[] bArr4 = new byte[f71Var.f3656a];
            byte[] bArr5 = h71Var.f4465c;
            System.arraycopy(bArr5, 0, bArr4, 0, bArr5.length);
            byte[] bArr6 = h71Var.f4466d;
            System.arraycopy(bArr6, 0, bArr4, bArr5.length, bArr6.length);
            return new ox1(new C1431t5((C1351r) b52.f1216x.get(f71Var)), new C1123mw(bArr4));
        }
        if (abstractC1399sa instanceof xn1) {
            xn1 xn1Var = (xn1) abstractC1399sa;
            return new ox1(new C1431t5((C1351r) b52.f1218z.get((vn1) xn1Var.f7397b)), new C1123mw(m6061e(xn1Var.f12653c)));
        }
        if (abstractC1399sa instanceof p20) {
            p20 p20Var = (p20) abstractC1399sa;
            return new ox1(new C1431t5((C1351r) b52.f1175B.get((n20) p20Var.f7397b)), m6064h(p20Var.f8668c, p20Var.f8669d));
        }
        if (abstractC1399sa instanceof kw0) {
            kw0 kw0Var = (kw0) abstractC1399sa;
            return new ox1(new C1431t5((C1351r) b52.f1185L.get((iw0) kw0Var.f7397b)), m6064h(kw0Var.f6047c, kw0Var.f6048d));
        }
        if (abstractC1399sa instanceof C1331qg) {
            C1331qg c1331qg = (C1331qg) abstractC1399sa;
            return new ox1(new C1431t5((C1351r) b52.f1177D.get((C1181og) c1331qg.f7397b)), m6061e(c1331qg.f9496c));
        }
        if (abstractC1399sa instanceof qj0) {
            qj0 qj0Var = (qj0) abstractC1399sa;
            return new ox1(new C1431t5((C1351r) b52.f1179F.get((oj0) qj0Var.f7397b)), m6061e(qj0Var.f9514c));
        }
        if (abstractC1399sa instanceof pi1) {
            pi1 pi1Var = (pi1) abstractC1399sa;
            ni1 ni1Var = (ni1) pi1Var.f7397b;
            return new ox1(new C1431t5((C1351r) b52.f1181H.get(ni1Var)), new C1123mw(ni1Var.f7427g != 1 ? m6064h(m6064h(m6064h(m6064h(m6064h(pi1Var.f8904d, o21.m4643M(pi1Var.f8905e, false)), o21.m4643M(pi1Var.f8906f, true)), o21.m4643M(pi1Var.f8907g, false)), o21.m4643M(pi1Var.f8908m, true)), o21.m4643M(pi1Var.f8909n, true)) : o21.m4643M(pi1Var.f8903c, true)));
        }
        if (abstractC1399sa instanceof j01) {
            j01 j01Var = (j01) abstractC1399sa;
            return new ox1(new C1431t5((C1351r) b52.f1189P.get((h01) j01Var.f7397b)), new C1123mw(m6061e(j01Var.f5232c)));
        }
        if (!(abstractC1399sa instanceof yt1)) {
            ca0.m1178j("key parameters not recognized");
            return null;
        }
        yt1 yt1Var = (yt1) abstractC1399sa;
        return new ox1(new C1431t5((C1351r) b52.f1191R.get(yt1Var.f13146c)), new C1123mw(m6061e(yt1Var.f13145b)));
    }

    /* JADX INFO: renamed from: p */
    public static boolean m6072p(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            return set.size() == set2.size() && set.containsAll(set2);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: q */
    public static int m6073q(boolean z) {
        List supportedPerformancePoints;
        try {
            ae0 ae0Var = new ae0();
            ae0Var.f197m = v51.m6582l("video/avc");
            be0 be0Var = new be0(ae0Var);
            String str = be0Var.f1341n;
            if (str != null) {
                List listM4352e = m11.m4352e(str, z, false);
                String strM4349b = m11.m4349b(be0Var);
                Iterable iterableM4352e = strM4349b == null ? kk1.f5896e : m11.m4352e(strM4349b, z, false);
                nm0 nm0VarM5566m = qm0.m5566m();
                nm0VarM5566m.m3904d(listM4352e);
                nm0VarM5566m.m3904d(iterableM4352e);
                kk1 kk1VarM4561g = nm0VarM5566m.m4561g();
                for (int i = 0; i < kk1VarM4561g.f5898d; i++) {
                    if (((c11) kk1VarM4561g.get(i)).f1617d != null && ((c11) kk1VarM4561g.get(i)).f1617d.getVideoCapabilities() != null && (supportedPerformancePoints = ((c11) kk1VarM4561g.get(i)).f1617d.getVideoCapabilities().getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        d11.m2188k();
                        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePointM2180c = d11.m2180c();
                        for (int i2 = 0; i2 < supportedPerformancePoints.size(); i2++) {
                            if (d11.m2182e(supportedPerformancePoints.get(i2)).covers(performancePointM2180c)) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
            }
        } catch (j11 unused) {
        }
        return 0;
    }

    /* JADX INFO: renamed from: r */
    public static kr1 m6074r(Set set, sf1 sf1Var) {
        if (set instanceof SortedSet) {
            Set set2 = (SortedSet) set;
            if (!(set2 instanceof kr1)) {
                return new lr1(set2, sf1Var);
            }
            kr1 kr1Var = (kr1) set2;
            sf1 sf1Var2 = kr1Var.f5995b;
            sf1Var2.getClass();
            return new lr1((SortedSet) kr1Var.f5994a, new tf1(Arrays.asList(sf1Var2, sf1Var)));
        }
        if (!(set instanceof kr1)) {
            set.getClass();
            return new kr1(set, sf1Var);
        }
        kr1 kr1Var2 = (kr1) set;
        sf1 sf1Var3 = kr1Var2.f5995b;
        sf1Var3.getClass();
        return new kr1(kr1Var2.f5994a, new tf1(Arrays.asList(sf1Var3, sf1Var)));
    }

    /* JADX INFO: renamed from: s */
    public static C0101bj m6075s(r80 r80Var) {
        r80Var.mo3528g();
        return new C0101bj(r80Var.mo3527f(), 6);
    }

    /* JADX INFO: renamed from: t */
    public static Object m6076t(Iterable iterable) {
        Object next;
        if (!(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            return next;
        }
        List list = (List) iterable;
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        ca0.m1185q();
        return null;
    }

    /* JADX INFO: renamed from: u */
    public static int m6077u(int i, int i2) {
        int i3 = i2 - i;
        if (i3 >= 0) {
            return i3;
        }
        throw new IllegalArgumentException(i + " > " + i2);
    }

    /* JADX INFO: renamed from: v */
    public static int m6078v(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX INFO: renamed from: w */
    public static int m6079w(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int length = bArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ bArr[length];
        }
    }

    /* JADX INFO: renamed from: x */
    public static int m6080x(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    /* JADX INFO: renamed from: y */
    public static void m6081y(int i, int i2, byte[] bArr) {
        bArr[i2] = (byte) (i >>> 24);
        bArr[i2 + 1] = (byte) (i >>> 16);
        bArr[i2 + 2] = (byte) (i >>> 8);
        bArr[i2 + 3] = (byte) i;
    }

    /* JADX INFO: renamed from: z */
    public static void m6082z(int i, int i2, byte[] bArr) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    /* JADX INFO: renamed from: Q */
    public abstract int m6083Q();
}
