package p000;

import android.text.TextUtils;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v51 {

    /* JADX INFO: renamed from: a */
    public static final ArrayList f11551a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public static final Pattern f11552b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* JADX INFO: renamed from: a */
    public static boolean m6571a(String str, String str2) {
        String string = null;
        if (str != null) {
            String[] strArrM7225M = z42.m7225M(str);
            StringBuilder sb = new StringBuilder();
            for (String str3 : strArrM7225M) {
                if (str2.equals(m6573c(str3))) {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(str3);
                }
            }
            if (sb.length() > 0) {
                string = sb.toString();
            }
        }
        return string != null;
    }

    /* JADX INFO: renamed from: b */
    public static int m6572b(String str, String str2) {
        g21 g21VarM6575e;
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (g21VarM6575e = m6575e(str2)) == null) {
                    return 0;
                }
                return g21VarM6575e.m2920a();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/vnd.dts.uhd;profile=p2":
                return 30;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/opus":
                return 20;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m6573c(String str) {
        g21 g21VarM6575e;
        String strM6574d = null;
        if (str != null) {
            String strM6444b0 = ua0.m6444b0(str.trim());
            if (strM6444b0.startsWith("avc1") || strM6444b0.startsWith("avc3")) {
                return "video/avc";
            }
            if (strM6444b0.startsWith("hev1") || strM6444b0.startsWith("hvc1")) {
                return "video/hevc";
            }
            if (strM6444b0.startsWith("dvav") || strM6444b0.startsWith("dva1") || strM6444b0.startsWith("dvhe") || strM6444b0.startsWith("dvh1")) {
                return "video/dolby-vision";
            }
            if (strM6444b0.startsWith("av01")) {
                return "video/av01";
            }
            if (strM6444b0.startsWith("vp9") || strM6444b0.startsWith("vp09")) {
                return "video/x-vnd.on2.vp9";
            }
            if (strM6444b0.startsWith("vp8") || strM6444b0.startsWith("vp08")) {
                return "video/x-vnd.on2.vp8";
            }
            if (strM6444b0.startsWith("mp4a")) {
                if (strM6444b0.startsWith("mp4a.") && (g21VarM6575e = m6575e(strM6444b0)) != null) {
                    strM6574d = m6574d(g21VarM6575e.f4020a);
                }
                return strM6574d == null ? "audio/mp4a-latm" : strM6574d;
            }
            if (strM6444b0.startsWith("mha1")) {
                return "audio/mha1";
            }
            if (strM6444b0.startsWith("mhm1")) {
                return "audio/mhm1";
            }
            if (strM6444b0.startsWith("ac-3") || strM6444b0.startsWith("dac3")) {
                return "audio/ac3";
            }
            if (strM6444b0.startsWith("ec-3") || strM6444b0.startsWith("dec3")) {
                return "audio/eac3";
            }
            if (strM6444b0.startsWith("ec+3")) {
                return "audio/eac3-joc";
            }
            if (strM6444b0.startsWith("ac-4") || strM6444b0.startsWith("dac4")) {
                return "audio/ac4";
            }
            if (strM6444b0.startsWith("dtsc")) {
                return "audio/vnd.dts";
            }
            if (strM6444b0.startsWith("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (strM6444b0.startsWith("dtsh") || strM6444b0.startsWith("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (strM6444b0.startsWith("dtsx")) {
                return "audio/vnd.dts.uhd;profile=p2";
            }
            if (strM6444b0.startsWith("opus")) {
                return "audio/opus";
            }
            if (strM6444b0.startsWith("vorbis")) {
                return "audio/vorbis";
            }
            if (strM6444b0.startsWith("flac")) {
                return "audio/flac";
            }
            if (strM6444b0.startsWith("stpp")) {
                return "application/ttml+xml";
            }
            if (strM6444b0.startsWith("wvtt")) {
                return "text/vtt";
            }
            if (strM6444b0.contains("cea708")) {
                return "application/cea-708";
            }
            if (strM6444b0.contains("eia608") || strM6444b0.contains("cea608")) {
                return "application/cea-608";
            }
            ArrayList arrayList = f11551a;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                l41.m4035b();
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static String m6574d(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 221) {
            return "audio/vorbis";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY /* 102 */:
            case 103:
            case LocationRequest.PRIORITY_LOW_POWER /* 104 */:
                return "audio/mp4a-latm";
            case LocationRequest.PRIORITY_NO_POWER /* 105 */:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            case 108:
                return "image/jpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    /* JADX INFO: renamed from: e */
    public static g21 m6575e(String str) {
        Matcher matcher = f11552b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        try {
            return new g21(Integer.parseInt(strGroup, 16), strGroup2 != null ? Integer.parseInt(strGroup2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m6576f(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    /* JADX INFO: renamed from: g */
    public static int m6577g(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (m6578h(str)) {
            return 1;
        }
        if (m6581k(str)) {
            return 2;
        }
        if (m6580j(str)) {
            return 3;
        }
        if (m6579i(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = f11551a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        arrayList.get(0).getClass();
        l41.m4035b();
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m6578h(String str) {
        return "audio".equals(m6576f(str));
    }

    /* JADX INFO: renamed from: i */
    public static boolean m6579i(String str) {
        return "image".equals(m6576f(str)) || "application/x-image-uri".equals(str);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m6580j(String str) {
        return "text".equals(m6576f(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m6581k(String str) {
        return "video".equals(m6576f(str));
    }

    /* JADX INFO: renamed from: l */
    public static String m6582l(String str) {
        if (str == null) {
            return null;
        }
        String strM6444b0 = ua0.m6444b0(str);
        strM6444b0.getClass();
        switch (strM6444b0) {
            case "video/x-mvhevc":
                return "video/mv-hevc";
            case "audio/x-flac":
                return "audio/flac";
            case "application/x-mpegurl":
                return "application/x-mpegURL";
            case "audio/x-wav":
                return "audio/wav";
            case "audio/mpeg-l1":
                return "audio/mpeg-L1";
            case "audio/mpeg-l2":
                return "audio/mpeg-L2";
            case "audio/mp3":
                return "audio/mpeg";
            default:
                return strM6444b0;
        }
    }
}
