package p000;

import android.net.Uri;
import android.sun.security.util.DerValue;
import com.example.ssmousepro.injection.InjectionMetrics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: ez */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0621ez implements a90 {

    /* JADX INFO: renamed from: e */
    public static final int[] f3494e = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* JADX INFO: renamed from: f */
    public static final C0558d8 f3495f = new C0558d8(new C0694gy(15));

    /* JADX INFO: renamed from: g */
    public static final C0558d8 f3496g = new C0558d8(new C0694gy(16));

    /* JADX INFO: renamed from: a */
    public kk1 f3497a;

    /* JADX INFO: renamed from: b */
    public boolean f3498b;

    /* JADX INFO: renamed from: c */
    public k50 f3499c;

    /* JADX INFO: renamed from: d */
    public int f3500d;

    @Override // p000.a90
    /* JADX INFO: renamed from: a */
    public final synchronized x80[] mo120a() {
        return mo121c(Uri.EMPTY, new HashMap());
    }

    /* JADX INFO: renamed from: b */
    public final void m2661b(int i, ArrayList arrayList) {
        switch (i) {
            case 0:
                arrayList.add(new C0552d2());
                break;
            case 1:
                arrayList.add(new C0625f2());
                break;
            case 2:
                arrayList.add(new C0555d5());
                break;
            case 3:
                arrayList.add(new C1505v5());
                break;
            case 4:
                x80 x80VarM2284z = f3495f.m2284z(0);
                if (x80VarM2284z == null) {
                    arrayList.add(new ab0());
                } else {
                    arrayList.add(x80VarM2284z);
                }
                break;
            case 5:
                arrayList.add(new kd0());
                break;
            case 6:
                arrayList.add(new f01(this.f3499c, this.f3498b ? 0 : 2));
                break;
            case 7:
                arrayList.add(new j61());
                break;
            case 8:
                arrayList.add(new fg0(this.f3499c, this.f3498b ? 0 : 32));
                arrayList.add(new n61(this.f3499c, this.f3498b ? 0 : 16));
                break;
            case 9:
                arrayList.add(new k91());
                break;
            case 10:
                arrayList.add(new vh1());
                break;
            case 11:
                if (this.f3497a == null) {
                    om0 om0Var = qm0.f9540b;
                    this.f3497a = kk1.f5896e;
                }
                arrayList.add(new g32(!this.f3498b ? 1 : 0, this.f3499c, new y02(0L), new C0719hm(this.f3497a)));
                break;
            case 12:
                arrayList.add(new a92());
                break;
            case 14:
                arrayList.add(new C0792ji(this.f3500d));
                break;
            case 15:
                x80 x80VarM2284z2 = f3496g.m2284z(new Object[0]);
                if (x80VarM2284z2 != null) {
                    arrayList.add(x80VarM2284z2);
                }
                break;
            case 16:
                arrayList.add(new C1068le(!this.f3498b ? 1 : 0, this.f3499c));
                break;
            case 17:
                arrayList.add(new C0792ji((byte) 0, 1));
                break;
            case 18:
                arrayList.add(new C1179oe(2));
                break;
            case 19:
                arrayList.add(new C0792ji((byte) 0, 0));
                break;
            case 20:
                arrayList.add(new C1179oe(1));
                break;
            case 21:
                arrayList.add(new C1179oe(0));
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:169:0x0240 A[Catch: all -> 0x0244, TRY_ENTER, TryCatch #0 {all -> 0x0244, blocks: (B:4:0x0003, B:6:0x0019, B:9:0x0020, B:169:0x0240, B:172:0x0246, B:175:0x024e, B:177:0x0253, B:180:0x0259, B:181:0x025c, B:182:0x025f, B:14:0x002d), top: B:187:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:177:0x0253 A[Catch: all -> 0x0244, TryCatch #0 {all -> 0x0244, blocks: (B:4:0x0003, B:6:0x0019, B:9:0x0020, B:169:0x0240, B:172:0x0246, B:175:0x024e, B:177:0x0253, B:180:0x0259, B:181:0x025c, B:182:0x025f, B:14:0x002d), top: B:187:0x0003 }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p000.a90
    /* JADX INFO: renamed from: c */
    public final synchronized x80[] mo121c(Uri uri, Map map) {
        ArrayList arrayList;
        int i;
        byte b;
        int iM3285w;
        int i2;
        try {
            int[] iArr = f3494e;
            arrayList = new ArrayList(21);
            List list = (List) map.get("Content-Type");
            String str = (list == null || list.isEmpty()) ? null : (String) list.get(0);
            if (str != null) {
                String strM6582l = v51.m6582l(str);
                strM6582l.getClass();
                i = 20;
                switch (strM6582l.hashCode()) {
                    case -2123537834:
                        b = strM6582l.equals("audio/eac3-joc") ? (byte) 0 : (byte) -1;
                        break;
                    case -1662384011:
                        b = strM6582l.equals("video/mp2p") ? (byte) 1 : (byte) -1;
                        break;
                    case -1662384007:
                        b = strM6582l.equals("video/mp2t") ? (byte) 2 : (byte) -1;
                        break;
                    case -1662095187:
                        b = strM6582l.equals("video/webm") ? (byte) 3 : (byte) -1;
                        break;
                    case -1606874997:
                        b = strM6582l.equals("audio/amr-wb") ? (byte) 4 : (byte) -1;
                        break;
                    case -1487656890:
                        b = strM6582l.equals("image/avif") ? (byte) 5 : (byte) -1;
                        break;
                    case -1487464693:
                        b = strM6582l.equals("image/heic") ? (byte) 6 : (byte) -1;
                        break;
                    case -1487464690:
                        b = strM6582l.equals("image/heif") ? (byte) 7 : (byte) -1;
                        break;
                    case -1487394660:
                        b = strM6582l.equals("image/jpeg") ? (byte) 8 : (byte) -1;
                        break;
                    case -1487018032:
                        b = strM6582l.equals("image/webp") ? (byte) 9 : (byte) -1;
                        break;
                    case -1248337486:
                        b = strM6582l.equals("application/mp4") ? (byte) 10 : (byte) -1;
                        break;
                    case -1079884372:
                        b = strM6582l.equals("video/x-msvideo") ? (byte) 11 : (byte) -1;
                        break;
                    case -1004728940:
                        b = strM6582l.equals("text/vtt") ? (byte) 12 : (byte) -1;
                        break;
                    case -879272239:
                        b = strM6582l.equals("image/bmp") ? (byte) 13 : (byte) -1;
                        break;
                    case -879258763:
                        b = strM6582l.equals("image/png") ? (byte) 14 : (byte) -1;
                        break;
                    case -387023398:
                        b = strM6582l.equals("audio/x-matroska") ? (byte) 15 : (byte) -1;
                        break;
                    case -43467528:
                        b = strM6582l.equals("application/webm") ? (byte) 16 : (byte) -1;
                        break;
                    case 13915911:
                        b = strM6582l.equals("video/x-flv") ? (byte) 17 : (byte) -1;
                        break;
                    case 187078296:
                        b = strM6582l.equals("audio/ac3") ? (byte) 18 : (byte) -1;
                        break;
                    case 187078297:
                        b = strM6582l.equals("audio/ac4") ? (byte) 19 : (byte) -1;
                        break;
                    case 187078669:
                        b = strM6582l.equals("audio/amr") ? (byte) 20 : (byte) -1;
                        break;
                    case 187090232:
                        b = strM6582l.equals("audio/mp4") ? (byte) 21 : (byte) -1;
                        break;
                    case 187091926:
                        b = strM6582l.equals("audio/ogg") ? DerValue.tag_IA5String : (byte) -1;
                        break;
                    case 187099443:
                        b = strM6582l.equals("audio/wav") ? DerValue.tag_UtcTime : (byte) -1;
                        break;
                    case 1331848029:
                        b = strM6582l.equals("video/mp4") ? DerValue.tag_GeneralizedTime : (byte) -1;
                        break;
                    case 1503095341:
                        b = strM6582l.equals("audio/3gpp") ? (byte) 25 : (byte) -1;
                        break;
                    case 1504578661:
                        b = strM6582l.equals("audio/eac3") ? (byte) 26 : (byte) -1;
                        break;
                    case 1504619009:
                        b = strM6582l.equals("audio/flac") ? DerValue.tag_GeneralString : (byte) -1;
                        break;
                    case 1504824762:
                        b = strM6582l.equals("audio/midi") ? DerValue.tag_UniversalString : (byte) -1;
                        break;
                    case 1504831518:
                        b = strM6582l.equals("audio/mpeg") ? (byte) 29 : (byte) -1;
                        break;
                    case 1505118770:
                        b = strM6582l.equals("audio/webm") ? DerValue.tag_BMPString : (byte) -1;
                        break;
                    case 2039520277:
                        b = strM6582l.equals("video/x-matroska") ? (byte) 31 : (byte) -1;
                        break;
                    default:
                        b = -1;
                        break;
                }
                switch (b) {
                    case 0:
                    case 18:
                    case InjectionMetrics.I_MAX_ACTIVE_REJ /* 26 */:
                        i = 0;
                        break;
                    case 1:
                        i = 10;
                        break;
                    case 2:
                        i = 11;
                        break;
                    case 3:
                    case 15:
                    case 16:
                    case 30:
                    case InjectionMetrics.I_APPLY_DELTA /* 31 */:
                        i = 6;
                        break;
                    case 4:
                    case 20:
                    case 25:
                        i = 3;
                        break;
                    case 5:
                        i = 21;
                        break;
                    case 8:
                        i = 14;
                        break;
                    case 9:
                        i = 18;
                        break;
                    case 10:
                    case 21:
                    case 24:
                        i = 8;
                        break;
                    case 11:
                        i = 16;
                        break;
                    case 12:
                        i = 13;
                        break;
                    case 13:
                        i = 19;
                        break;
                    case 14:
                        i = 17;
                        break;
                    case 17:
                        i = 5;
                        break;
                    case 19:
                        i = 1;
                        break;
                    case 22:
                        i = 9;
                        break;
                    case 23:
                        i = 12;
                        break;
                    case InjectionMetrics.I_TAP_ID_EXHAUST /* 27 */:
                        i = 4;
                        break;
                    case InjectionMetrics.I_AIM_LOOP_TICKS /* 28 */:
                        i = 15;
                        break;
                    case 29:
                        i = 7;
                        break;
                }
                if (i != -1) {
                    m2661b(i, arrayList);
                }
                iM3285w = hr1.m3285w(uri);
                if (iM3285w != -1 && iM3285w != i) {
                    m2661b(iM3285w, arrayList);
                }
                for (int i3 = 0; i3 < 21; i3++) {
                    i2 = iArr[i3];
                    if (i2 == i && i2 != iM3285w) {
                        m2661b(i2, arrayList);
                    }
                }
            }
            i = -1;
            if (i != -1) {
                m2661b(i, arrayList);
            }
            iM3285w = hr1.m3285w(uri);
            if (iM3285w != -1) {
                m2661b(iM3285w, arrayList);
            }
            while (i3 < 21) {
                i2 = iArr[i3];
                if (i2 == i) {
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (x80[]) arrayList.toArray(new x80[arrayList.size()]);
    }
}
