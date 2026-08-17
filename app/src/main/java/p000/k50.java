package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.text.Editable;
import android.text.Selection;
import com.example.ssmousepro.injection.TouchPipeline;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class k50 implements Configurator, ut1, f41, InterfaceC0814k3, InterfaceC0136ci, InterfaceC0643fk, InterfaceC1305pr, wx1, yo1, z80, cs1, e51 {

    /* JADX INFO: renamed from: b */
    public static final k50 f5670b;

    /* JADX INFO: renamed from: c */
    public static final k50 f5671c;

    /* JADX INFO: renamed from: d */
    public static final k50 f5672d;

    /* JADX INFO: renamed from: e */
    public static final k50 f5673e;

    /* JADX INFO: renamed from: f */
    public static final k50 f5674f;

    /* JADX INFO: renamed from: g */
    public static final k50 f5675g;

    /* JADX INFO: renamed from: m */
    public static final k50 f5676m;

    /* JADX INFO: renamed from: n */
    public static final k50 f5677n;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5678a;

    static {
        byte b = 0;
        f5670b = new k50(b, 1);
        f5671c = new k50(b, 2);
        f5672d = new k50(b, 3);
        int i = 4;
        f5673e = new k50(b, i);
        f5674f = new k50(b, i);
        f5675g = new k50(b, 5);
        f5676m = new k50(b, 6);
        f5677n = new k50(b, 7);
    }

    public k50(int i) {
        int i2;
        this.f5678a = 10;
        HashMap map = new HashMap();
        int i3 = i - 2;
        int iNumberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(i3);
        int i4 = -i;
        int i5 = (2 - (i4 * i4)) * i4;
        int i6 = (2 - (i4 * i5)) * i5;
        int i7 = (2 - (i4 * i6)) * i6;
        int i8 = (2 - (i4 * i7)) * i7;
        for (int i9 = 1; i9 < iNumberOfLeadingZeros; i9++) {
            int i10 = 1 << (i9 - 1);
            if (i10 >= 64 && !map.containsKey(Integer.valueOf(i10))) {
                map.put(Integer.valueOf(i10), Integer.valueOf(m3794t(i, i8, i10)));
            }
            int i11 = 1 << i9;
            if ((i3 & i11) != 0 && (i2 = (i11 - 1) & i3) >= 64 && !map.containsKey(Integer.valueOf(i2))) {
                map.put(Integer.valueOf(i2), Integer.valueOf(m3794t(i, i8, i2)));
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public static int m3794t(int i, int i2, int i3) {
        int i4 = 1;
        while (i3 >= 32) {
            i4 = (int) ((((4294967295L & ((long) (i2 * i4))) * ((long) i)) + ((long) i4)) >>> 32);
            i3 -= 32;
        }
        if (i3 <= 0) {
            return i4;
        }
        return (int) ((((4294967295L & ((long) ((i2 * i4) & ((-1) >>> (-i3))))) * ((long) i)) + ((long) i4)) >>> i3);
    }

    /* JADX INFO: renamed from: u */
    public static int m3795u(int i) {
        if (i == 20) {
            return 63750;
        }
        if (i == 30) {
            return 2250000;
        }
        switch (i) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        l41.m4049r();
                        return 0;
                }
        }
    }

    /* JADX INFO: renamed from: w */
    public static boolean m3796w(y50 y50Var, Editable editable, int i, int i2, boolean z) {
        int iMin;
        if (editable != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z) {
                    int iMax = Math.max(i, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && iMax >= 0) {
                        loop0: while (true) {
                            boolean z2 = false;
                            while (true) {
                                if (iMax == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart < 0) {
                                    if (!z2) {
                                        selectionStart = 0;
                                        break loop0;
                                    }
                                    break loop0;
                                }
                                char cCharAt = editable.charAt(selectionStart);
                                if (z2) {
                                    if (Character.isHighSurrogate(cCharAt)) {
                                        iMax--;
                                    }
                                } else if (!Character.isSurrogate(cCharAt)) {
                                    iMax--;
                                } else if (!Character.isHighSurrogate(cCharAt)) {
                                    z2 = true;
                                }
                                selectionStart = -1;
                                break loop0;
                            }
                        }
                    }
                    selectionStart = -1;
                    break loop0;
                    int iMax2 = Math.max(i2, 0);
                    iMin = editable.length();
                    if (selectionEnd >= 0 && iMin >= selectionEnd && iMax2 >= 0) {
                        loop2: while (true) {
                            boolean z3 = false;
                            while (true) {
                                if (iMax2 != 0) {
                                    if (selectionEnd >= iMin) {
                                        if (!z3) {
                                            break loop2;
                                        }
                                        break loop2;
                                    }
                                    char cCharAt2 = editable.charAt(selectionEnd);
                                    if (z3) {
                                        if (Character.isLowSurrogate(cCharAt2)) {
                                            iMax2--;
                                            selectionEnd++;
                                        }
                                    } else if (!Character.isSurrogate(cCharAt2)) {
                                        iMax2--;
                                        selectionEnd++;
                                    } else if (!Character.isLowSurrogate(cCharAt2)) {
                                        selectionEnd++;
                                        z3 = true;
                                    }
                                    iMin = -1;
                                    break loop2;
                                }
                                iMin = selectionEnd;
                                break loop2;
                            }
                        }
                    }
                    iMin = -1;
                    break loop2;
                    if (selectionStart != -1 && iMin != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i, 0);
                    iMin = Math.min(selectionEnd + i2, editable.length());
                }
                u32[] u32VarArr = (u32[]) editable.getSpans(selectionStart, iMin, u32.class);
                if (u32VarArr != null && u32VarArr.length > 0) {
                    for (u32 u32Var : u32VarArr) {
                        int spanStart = editable.getSpanStart(u32Var);
                        int spanEnd = editable.getSpanEnd(u32Var);
                        selectionStart = Math.min(spanStart, selectionStart);
                        iMin = Math.max(spanEnd, iMin);
                    }
                    int iMax3 = Math.max(selectionStart, 0);
                    int iMin2 = Math.min(iMin, editable.length());
                    y50Var.beginBatchEdit();
                    editable.delete(iMax3, iMin2);
                    y50Var.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p000.yo1
    /* JADX INFO: renamed from: b */
    public boolean mo3797b() {
        return true;
    }

    @Override // p000.e51
    /* JADX INFO: renamed from: c */
    public String mo2504c(Object obj) {
        Long l = (Long) obj;
        if (l.longValue() < 0) {
            f40.m2713i("Timeout too small");
            return null;
        }
        if (l.longValue() < 100000000) {
            return l + "n";
        }
        if (l.longValue() < 100000000000L) {
            return (l.longValue() / 1000) + "u";
        }
        if (l.longValue() < 100000000000000L) {
            return (l.longValue() / 1000000) + "m";
        }
        if (l.longValue() < 100000000000000000L) {
            return (l.longValue() / 1000000000) + "S";
        }
        if (l.longValue() < 6000000000000000000L) {
            return (l.longValue() / 60000000000L) + "M";
        }
        return (l.longValue() / 3600000000000L) + "H";
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig encoderConfig) {
        C1660zc c1660zc = C1660zc.f13340a;
        encoderConfig.registerEncoder(AbstractC1517vh.class, c1660zc);
        encoderConfig.registerEncoder(C1439td.class, c1660zc);
        C0131cd c0131cd = C0131cd.f1767a;
        encoderConfig.registerEncoder(uv0.class, c0131cd);
        encoderConfig.registerEncoder(C0015ae.class, c0131cd);
        C0014ad c0014ad = C0014ad.f146a;
        encoderConfig.registerEncoder(AbstractC1152no.class, c0014ad);
        encoderConfig.registerEncoder(C1476ud.class, c0014ad);
        C1623yc c1623yc = C1623yc.f12935a;
        encoderConfig.registerEncoder(AbstractC0124c6.class, c1623yc);
        encoderConfig.registerEncoder(C1365rd.class, c1623yc);
        C0095bd c0095bd = C0095bd.f1302a;
        encoderConfig.registerEncoder(qv0.class, c0095bd);
        encoderConfig.registerEncoder(C1661zd.class, c0095bd);
        C0563dd c0563dd = C0563dd.f2892a;
        encoderConfig.registerEncoder(j81.class, c0563dd);
        encoderConfig.registerEncoder(C0132ce.class, c0563dd);
    }

    @Override // p000.InterfaceC0643fk
    /* JADX INFO: renamed from: d */
    public byte[] mo1081d(int i, int i2, byte[] bArr) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    @Override // p000.cs1
    /* JADX INFO: renamed from: e */
    public Object mo1082e() {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, vi0.m6633e("grpc-timer-%d"));
        try {
            scheduledExecutorServiceNewScheduledThreadPool.getClass().getMethod("setRemoveOnCancelPolicy", Boolean.TYPE).invoke(scheduledExecutorServiceNewScheduledThreadPool, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            ca0.m1184p(e2);
            return null;
        }
        return Executors.unconfigurableScheduledExecutorService(scheduledExecutorServiceNewScheduledThreadPool);
    }

    @Override // p000.wx1
    /* JADX INFO: renamed from: g */
    public boolean mo744g(be0 be0Var) {
        String str = be0Var.f1341n;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    @Override // p000.yo1
    /* JADX INFO: renamed from: i */
    public int mo3799i(long j) {
        return 0;
    }

    @Override // p000.e51
    /* JADX INFO: renamed from: j */
    public Object mo2505j(String str) {
        p32.m5177l(str.length() > 0, "empty timeout");
        p32.m5177l(str.length() <= 9, "bad timeout format");
        long j = Long.parseLong(str.substring(0, str.length() - 1));
        char cCharAt = str.charAt(str.length() - 1);
        if (cCharAt == 'H') {
            return Long.valueOf(TimeUnit.HOURS.toNanos(j));
        }
        if (cCharAt == 'M') {
            return Long.valueOf(TimeUnit.MINUTES.toNanos(j));
        }
        if (cCharAt == 'S') {
            return Long.valueOf(TimeUnit.SECONDS.toNanos(j));
        }
        if (cCharAt == 'u') {
            return Long.valueOf(TimeUnit.MICROSECONDS.toNanos(j));
        }
        if (cCharAt == 'm') {
            return Long.valueOf(TimeUnit.MILLISECONDS.toNanos(j));
        }
        if (cCharAt == 'n') {
            return Long.valueOf(j);
        }
        throw new IllegalArgumentException("Invalid timeout unit: " + cCharAt);
    }

    @Override // p000.z80
    /* JADX INFO: renamed from: k */
    public void mo748k() {
        throw new UnsupportedOperationException();
    }

    @Override // p000.wx1
    /* JADX INFO: renamed from: l */
    public yx1 mo749l(be0 be0Var) {
        String str = be0Var.f1341n;
        List list = be0Var.f1344q;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    b50 b50Var = new b50();
                    dc1 dc1Var = new dc1((byte[]) list.get(0));
                    int iM2343z = dc1Var.m2343z();
                    int iM2343z2 = dc1Var.m2343z();
                    Paint paint = new Paint();
                    b50Var.f1152a = paint;
                    paint.setStyle(Paint.Style.FILL_AND_STROKE);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
                    paint.setPathEffect(null);
                    Paint paint2 = new Paint();
                    b50Var.f1153b = paint2;
                    paint2.setStyle(Paint.Style.FILL);
                    paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
                    paint2.setPathEffect(null);
                    b50Var.f1154c = new Canvas();
                    b50Var.f1155d = new v40(719, 575, 0, 719, 0, 575);
                    b50Var.f1156e = new u40(0, new int[]{0, -1, -16777216, -8421505}, b50.m869b(), b50.m870c());
                    b50Var.f1157f = new a50(iM2343z, iM2343z2);
                    return b50Var;
                case "application/pgs":
                    return new C0599ed(8);
                case "application/x-mp4-vtt":
                    return new cm0(1);
                case "text/vtt":
                    return new qo0(29);
                case "application/x-quicktime-tx3g":
                    return new o32(list);
                case "text/x-ssa":
                    return new wu1(list);
                case "application/x-subrip":
                    return new px1();
                case "application/ttml+xml":
                    return new l32();
            }
        }
        f40.m2713i(AbstractC1308pu.m5339f("Unsupported MIME type: ", str));
        return null;
    }

    @Override // p000.yo1
    /* JADX INFO: renamed from: m */
    public int mo3800m(C0558d8 c0558d8, C1533vx c1533vx, int i) {
        c1533vx.f7542b = 4;
        return -4;
    }

    @Override // p000.z80
    /* JADX INFO: renamed from: n */
    public c22 mo750n(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.InterfaceC1342qr
    /* JADX INFO: renamed from: o */
    public int mo1087o(AbstractC1353r1 abstractC1353r1, int i, Object obj, int i2) {
        switch (this.f5678a) {
            case 15:
                abstractC1353r1.mo1197x(i);
                break;
            default:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                int iLimit = byteBuffer.limit();
                byteBuffer.limit(byteBuffer.position() + i);
                abstractC1353r1.mo1194o(byteBuffer);
                byteBuffer.limit(iLimit);
                break;
        }
        return 0;
    }

    @Override // p000.wx1
    /* JADX INFO: renamed from: p */
    public int mo751p(be0 be0Var) {
        String str = be0Var.f1341n;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        f40.m2713i(AbstractC1308pu.m5339f("Unsupported MIME type: ", str));
        return 0;
    }

    @Override // p000.z80
    /* JADX INFO: renamed from: q */
    public void mo752q(kq1 kq1Var) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.f41
    /* JADX INFO: renamed from: r */
    public boolean mo782r(i31 i31Var) {
        return false;
    }

    @Override // p000.cs1
    /* JADX INFO: renamed from: s */
    public void mo1088s(Object obj) {
        ((ScheduledExecutorService) obj).shutdown();
    }

    /* JADX INFO: renamed from: v */
    public String m3801v() {
        switch (this.f5678a) {
            case 2:
                return "identity";
            default:
                return "gzip";
        }
    }

    @Override // p000.yo1
    /* JADX INFO: renamed from: h */
    public void mo3798h() {
    }

    @Override // p000.InterfaceC0136ci
    /* JADX INFO: renamed from: f */
    public long mo1221f(long j) {
        return j;
    }

    @Override // p000.f41
    /* JADX INFO: renamed from: a */
    public void mo766a(i31 i31Var, boolean z) {
    }

    public /* synthetic */ k50(byte b, int i) {
        this.f5678a = i;
    }

    public k50(xq0 xq0Var, xq0 xq0Var2) {
        this.f5678a = 13;
        xq0Var.getClass();
        xq0Var2.getClass();
        if (TouchPipeline.SIZE <= TouchPipeline.SIZE) {
            return;
        }
        l41.m4049r();
        throw null;
    }
}
