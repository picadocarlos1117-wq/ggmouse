package p000;

import android.media.MediaCodecInfo;
import android.sun.security.util.DerValue;
import android.util.Pair;
import com.example.ssmousepro.OverlayDisplayBinder;
import com.example.ssmousepro.injection.InjectionMetrics;
import com.example.ssmousepro.injection.LinuxInputConstants;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import io.github.muntashirakon.adb.AdbProtocol;
import io.github.muntashirakon.adb.PairingConnectionCtx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m11 {

    /* JADX INFO: renamed from: a */
    public static final HashMap f6590a = new HashMap();

    /* JADX INFO: renamed from: a */
    public static void m4348a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (z42.f13274a < 26 && z42.f13275b.equals("R9") && arrayList.size() == 1 && ((c11) arrayList.get(0)).f1614a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(c11.m1106h("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, false));
            }
            Collections.sort(arrayList, new h11(new ca0(29), 0));
        }
        if (z42.f13274a >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((c11) arrayList.get(0)).f1614a)) {
            return;
        }
        arrayList.add((c11) arrayList.remove(0));
    }

    /* JADX INFO: renamed from: b */
    public static String m4349b(be0 be0Var) {
        Pair pairM4351d;
        String str = be0Var.f1341n;
        String str2 = be0Var.f1341n;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str2) && (pairM4351d = m4351d(be0Var)) != null) {
            int iIntValue = ((Integer) pairM4351d.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return "video/hevc";
            }
            if (iIntValue == 512) {
                return "video/avc";
            }
            if (iIntValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str2)) {
            return "video/hevc";
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static String m4350c(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("video/mv-hevc")) {
            if ("c2.qti.mvhevc.decoder".equals(str)) {
                return "video/x-mvhevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x0199  */
    /* JADX WARN: Code duplicated, block: B:101:0x019d  */
    /* JADX WARN: Code duplicated, block: B:104:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:105:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:108:0x01af  */
    /* JADX WARN: Code duplicated, block: B:109:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:112:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:113:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:116:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:117:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:120:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:121:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:124:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:125:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:128:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:129:0x01df  */
    /* JADX WARN: Code duplicated, block: B:132:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:133:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:136:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:137:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:140:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:143:0x0202  */
    /* JADX WARN: Code duplicated, block: B:144:0x0207  */
    /* JADX WARN: Code duplicated, block: B:145:0x020c  */
    /* JADX WARN: Code duplicated, block: B:146:0x020f  */
    /* JADX WARN: Code duplicated, block: B:147:0x0212  */
    /* JADX WARN: Code duplicated, block: B:148:0x0215  */
    /* JADX WARN: Code duplicated, block: B:149:0x0218  */
    /* JADX WARN: Code duplicated, block: B:150:0x021b  */
    /* JADX WARN: Code duplicated, block: B:151:0x021e  */
    /* JADX WARN: Code duplicated, block: B:152:0x0220  */
    /* JADX WARN: Code duplicated, block: B:153:0x0223  */
    /* JADX WARN: Code duplicated, block: B:154:0x0226  */
    /* JADX WARN: Code duplicated, block: B:156:0x022a  */
    /* JADX WARN: Code duplicated, block: B:158:0x0230  */
    /* JADX WARN: Code duplicated, block: B:162:0x0248  */
    /* JADX WARN: Code duplicated, block: B:81:0x015e  */
    /* JADX WARN: Code duplicated, block: B:83:0x0164  */
    /* JADX WARN: Code duplicated, block: B:85:0x0168  */
    /* JADX WARN: Code duplicated, block: B:86:0x016c  */
    /* JADX WARN: Code duplicated, block: B:88:0x0173  */
    /* JADX WARN: Code duplicated, block: B:89:0x0176  */
    /* JADX WARN: Code duplicated, block: B:92:0x017f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0183  */
    /* JADX WARN: Code duplicated, block: B:96:0x018c  */
    /* JADX WARN: Code duplicated, block: B:97:0x0190  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: d */
    public static Pair m4351d(be0 be0Var) {
        byte b;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Integer num;
        byte b2;
        Integer num2;
        String str;
        byte b3;
        byte[] bArr = AbstractC0574dp.f2986a;
        Integer num3 = 1;
        String str2 = be0Var.f1338k;
        C1673zp c1673zp = be0Var.f1316B;
        if (str2 == null) {
            return null;
        }
        String[] strArrSplit = str2.split("\\.");
        int i10 = 16;
        if (!"video/dolby-vision".equals(be0Var.f1341n)) {
            String str3 = strArrSplit[0];
            str3.getClass();
            switch (str3) {
                case "av01":
                    b = 0;
                    break;
                case "avc1":
                    b = 1;
                    break;
                case "avc2":
                    b = 2;
                    break;
                case "hev1":
                    b = 3;
                    break;
                case "hvc1":
                    b = 4;
                    break;
                case "mp4a":
                    b = 5;
                    break;
                case "s263":
                    b = 6;
                    break;
                case "vp09":
                    b = 7;
                    break;
                default:
                    b = -1;
                    break;
            }
            int i11 = PairingConnectionCtx.PairingPacketHeader.MAX_PAYLOAD_SIZE;
            switch (b) {
                case 0:
                    if (strArrSplit.length < 4) {
                        AbstractC1308pu.m5355v("Ignoring malformed AV1 codec string: ", str2, "CodecSpecificDataUtil");
                        return null;
                    }
                    try {
                        int i12 = Integer.parseInt(strArrSplit[1]);
                        int i13 = Integer.parseInt(strArrSplit[2].substring(0, 2));
                        int i14 = Integer.parseInt(strArrSplit[3]);
                        if (i12 != 0) {
                            jd0.m3621s(i12, "Unknown AV1 profile: ", "CodecSpecificDataUtil");
                            return null;
                        }
                        if (i14 != 8 && i14 != 10) {
                            jd0.m3621s(i14, "Unknown AV1 bit depth: ", "CodecSpecificDataUtil");
                            return null;
                        }
                        int i15 = i14 == 8 ? 1 : (c1673zp == null || !(c1673zp.f13516d != null || (i = c1673zp.f13515c) == 7 || i == 6)) ? 2 : 4096;
                        switch (i13) {
                            case 0:
                                i11 = 1;
                                i2 = -1;
                                break;
                            case 1:
                                i11 = 2;
                                i2 = -1;
                                break;
                            case 2:
                                i11 = 4;
                                i2 = -1;
                                break;
                            case 3:
                                i11 = 8;
                                i2 = -1;
                                break;
                            case 4:
                                i11 = 16;
                                i2 = -1;
                                break;
                            case 5:
                                i11 = 32;
                                i2 = -1;
                                break;
                            case 6:
                                i11 = 64;
                                i2 = -1;
                                break;
                            case 7:
                                i11 = 128;
                                i2 = -1;
                                break;
                            case 8:
                                i11 = 256;
                                i2 = -1;
                                break;
                            case 9:
                                i11 = 512;
                                i2 = -1;
                                break;
                            case 10:
                                i11 = 1024;
                                i2 = -1;
                                break;
                            case 11:
                                i11 = 2048;
                                i2 = -1;
                                break;
                            case 12:
                                i11 = 4096;
                                i2 = -1;
                                break;
                            case 13:
                                i11 = 8192;
                                i2 = -1;
                                break;
                            case 14:
                                i2 = -1;
                                break;
                            case 15:
                                i11 = 32768;
                                i2 = -1;
                                break;
                            case 16:
                                i11 = 65536;
                                i2 = -1;
                                break;
                            case 17:
                                i11 = OverlayDisplayBinder.FLAG_EXTERNAL_DEX_HOSTING;
                                i2 = -1;
                                break;
                            case 18:
                                i11 = AdbProtocol.MAX_PAYLOAD_V2;
                                i2 = -1;
                                break;
                            case 19:
                                i11 = 524288;
                                i2 = -1;
                                break;
                            case 20:
                                i11 = AdbProtocol.MAX_PAYLOAD_V3;
                                i2 = -1;
                                break;
                            case 21:
                                i11 = 2097152;
                                i2 = -1;
                                break;
                            case 22:
                                i11 = 4194304;
                                i2 = -1;
                                break;
                            case 23:
                                i11 = 8388608;
                                i2 = -1;
                                break;
                            default:
                                i2 = -1;
                                i11 = -1;
                                break;
                        }
                        if (i11 != i2) {
                            return new Pair(Integer.valueOf(i15), Integer.valueOf(i11));
                        }
                        jd0.m3621s(i13, "Unknown AV1 level: ", "CodecSpecificDataUtil");
                        return null;
                    } catch (NumberFormatException unused) {
                        AbstractC1308pu.m5355v("Ignoring malformed AV1 codec string: ", str2, "CodecSpecificDataUtil");
                    }
                    break;
                case 1:
                case 2:
                    if (strArrSplit.length < 2) {
                        AbstractC1308pu.m5355v("Ignoring malformed AVC codec string: ", str2, "CodecSpecificDataUtil");
                        return null;
                    }
                    try {
                        if (strArrSplit[1].length() == 6) {
                            i3 = Integer.parseInt(strArrSplit[1].substring(0, 2), 16);
                            i4 = Integer.parseInt(strArrSplit[1].substring(4), 16);
                        } else {
                            if (strArrSplit.length < 3) {
                                AbstractC1337qm.m5542i0("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + str2);
                                return null;
                            }
                            i3 = Integer.parseInt(strArrSplit[1]);
                            i4 = Integer.parseInt(strArrSplit[2]);
                        }
                        if (i3 == 66) {
                            i5 = 1;
                        } else if (i3 == 77) {
                            i5 = 2;
                        } else if (i3 == 88) {
                            i5 = 4;
                        } else if (i3 == 100) {
                            i5 = 8;
                        } else if (i3 == 110) {
                            i5 = 16;
                        } else if (i3 != 122) {
                            i5 = i3 != 244 ? -1 : 64;
                        } else {
                            i5 = 32;
                        }
                        if (i5 == -1) {
                            jd0.m3621s(i3, "Unknown AVC profile: ", "CodecSpecificDataUtil");
                            return null;
                        }
                        switch (i4) {
                            case 10:
                                i6 = -1;
                                i11 = 1;
                                break;
                            case 11:
                                i6 = -1;
                                i11 = 4;
                                break;
                            case 12:
                                i6 = -1;
                                i11 = 8;
                                break;
                            case 13:
                                i11 = 16;
                                i6 = -1;
                                break;
                            default:
                                switch (i4) {
                                    case 20:
                                        i11 = 32;
                                        i6 = -1;
                                        break;
                                    case 21:
                                        i11 = 64;
                                        i6 = -1;
                                        break;
                                    case 22:
                                        i11 = 128;
                                        i6 = -1;
                                        break;
                                    default:
                                        switch (i4) {
                                            case 30:
                                                i11 = 256;
                                                i6 = -1;
                                                break;
                                            case InjectionMetrics.I_APPLY_DELTA /* 31 */:
                                                i11 = 512;
                                                i6 = -1;
                                                break;
                                            case 32:
                                                i11 = 1024;
                                                i6 = -1;
                                                break;
                                            default:
                                                switch (i4) {
                                                    case 40:
                                                        i11 = 2048;
                                                        i6 = -1;
                                                        break;
                                                    case 41:
                                                        i11 = 4096;
                                                        i6 = -1;
                                                        break;
                                                    case LinuxInputConstants.KEY_LEFTSHIFT /* 42 */:
                                                        i11 = 8192;
                                                        i6 = -1;
                                                        break;
                                                    default:
                                                        switch (i4) {
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                i6 = -1;
                                                                break;
                                                            case 51:
                                                                i11 = 32768;
                                                                i6 = -1;
                                                                break;
                                                            case 52:
                                                                i11 = 65536;
                                                                i6 = -1;
                                                                break;
                                                            default:
                                                                i6 = -1;
                                                                i11 = -1;
                                                                break;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        if (i11 != i6) {
                            return new Pair(Integer.valueOf(i5), Integer.valueOf(i11));
                        }
                        jd0.m3621s(i4, "Unknown AVC level: ", "CodecSpecificDataUtil");
                        return null;
                    } catch (NumberFormatException unused2) {
                        AbstractC1308pu.m5355v("Ignoring malformed AVC codec string: ", str2, "CodecSpecificDataUtil");
                    }
                    break;
                case 3:
                case 4:
                    return AbstractC0574dp.m2375b(str2, strArrSplit, c1673zp);
                case 5:
                    if (strArrSplit.length != 3) {
                        AbstractC1308pu.m5355v("Ignoring malformed MP4A codec string: ", str2, "CodecSpecificDataUtil");
                        return null;
                    }
                    try {
                        if ("audio/mp4a-latm".equals(v51.m6574d(Integer.parseInt(strArrSplit[1], 16)))) {
                            int i16 = Integer.parseInt(strArrSplit[2]);
                            int i17 = 17;
                            if (i16 == 17) {
                                i7 = -1;
                            } else {
                                if (i16 != 20) {
                                    i17 = 23;
                                    if (i16 != 23) {
                                        i17 = 29;
                                        if (i16 != 29) {
                                            i17 = 39;
                                            if (i16 != 39) {
                                                i17 = 42;
                                                if (i16 != 42) {
                                                    switch (i16) {
                                                        case 1:
                                                            i7 = -1;
                                                            i17 = 1;
                                                            break;
                                                        case 2:
                                                            i7 = -1;
                                                            i17 = 2;
                                                            break;
                                                        case 3:
                                                            i7 = -1;
                                                            i17 = 3;
                                                            break;
                                                        case 4:
                                                            i7 = -1;
                                                            i17 = 4;
                                                            break;
                                                        case 5:
                                                            i7 = -1;
                                                            i17 = 5;
                                                            break;
                                                        case 6:
                                                            i7 = -1;
                                                            i17 = 6;
                                                            break;
                                                        default:
                                                            i7 = -1;
                                                            i17 = -1;
                                                            break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    i17 = 20;
                                }
                                i7 = -1;
                            }
                            if (i17 != i7) {
                                return new Pair(Integer.valueOf(i17), 0);
                            }
                        }
                    } catch (NumberFormatException unused3) {
                        AbstractC1308pu.m5355v("Ignoring malformed MP4A codec string: ", str2, "CodecSpecificDataUtil");
                    }
                    break;
                case 6:
                    Pair pair = new Pair(num3, num3);
                    if (strArrSplit.length < 3) {
                        AbstractC1308pu.m5355v("Ignoring malformed H263 codec string: ", str2, "CodecSpecificDataUtil");
                        return pair;
                    }
                    try {
                        return new Pair(Integer.valueOf(Integer.parseInt(strArrSplit[1])), Integer.valueOf(Integer.parseInt(strArrSplit[2])));
                    } catch (NumberFormatException unused4) {
                        AbstractC1308pu.m5355v("Ignoring malformed H263 codec string: ", str2, "CodecSpecificDataUtil");
                        return pair;
                    }
                case 7:
                    if (strArrSplit.length < 3) {
                        AbstractC1308pu.m5355v("Ignoring malformed VP9 codec string: ", str2, "CodecSpecificDataUtil");
                        return null;
                    }
                    try {
                        int i18 = Integer.parseInt(strArrSplit[1]);
                        int i19 = Integer.parseInt(strArrSplit[2]);
                        if (i18 == 0) {
                            i8 = 1;
                        } else if (i18 == 1) {
                            i8 = 2;
                        } else if (i18 != 2) {
                            i8 = i18 != 3 ? -1 : 8;
                        } else {
                            i8 = 4;
                        }
                        if (i8 == -1) {
                            jd0.m3621s(i18, "Unknown VP9 profile: ", "CodecSpecificDataUtil");
                            return null;
                        }
                        if (i19 == 10) {
                            i9 = -1;
                            i10 = 1;
                        } else if (i19 == 11) {
                            i9 = -1;
                            i10 = 2;
                        } else if (i19 == 20) {
                            i9 = -1;
                            i10 = 4;
                        } else if (i19 == 21) {
                            i9 = -1;
                            i10 = 8;
                        } else if (i19 == 30) {
                            i9 = -1;
                        } else {
                            if (i19 == 31) {
                                i10 = 32;
                            } else if (i19 == 40) {
                                i10 = 64;
                            } else if (i19 == 41) {
                                i10 = 128;
                            } else if (i19 == 50) {
                                i10 = 256;
                            } else if (i19 != 51) {
                                switch (i19) {
                                    case 60:
                                        i10 = 2048;
                                        break;
                                    case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                                        i10 = 4096;
                                        break;
                                    case 62:
                                        i10 = 8192;
                                        break;
                                    default:
                                        i9 = -1;
                                        i10 = -1;
                                        break;
                                }
                            } else {
                                i10 = 512;
                            }
                            i9 = -1;
                        }
                        if (i10 != i9) {
                            return new Pair(Integer.valueOf(i8), Integer.valueOf(i10));
                        }
                        jd0.m3621s(i19, "Unknown VP9 level: ", "CodecSpecificDataUtil");
                        return null;
                    } catch (NumberFormatException unused5) {
                        AbstractC1308pu.m5355v("Ignoring malformed VP9 codec string: ", str2, "CodecSpecificDataUtil");
                    }
                    break;
                default:
                    return null;
            }
            return null;
        }
        Integer numValueOf = Integer.valueOf(UserVerificationMethods.USER_VERIFY_NONE);
        if (strArrSplit.length < 3) {
            AbstractC1308pu.m5355v("Ignoring malformed Dolby Vision codec string: ", str2, "CodecSpecificDataUtil");
            return null;
        }
        Matcher matcher = AbstractC0574dp.f2988c.matcher(strArrSplit[1]);
        if (!matcher.matches()) {
            AbstractC1308pu.m5355v("Ignoring malformed Dolby Vision codec string: ", str2, "CodecSpecificDataUtil");
            return null;
        }
        String strGroup = matcher.group(1);
        if (strGroup != null) {
            switch (strGroup.hashCode()) {
                case 1536:
                    num = 8;
                    b2 = !strGroup.equals("00") ? (byte) -1 : (byte) 0;
                    break;
                case 1537:
                    if (!strGroup.equals("01")) {
                        num = 8;
                    } else {
                        num = 8;
                        b2 = 1;
                    }
                    break;
                case 1538:
                    if (!strGroup.equals("02")) {
                        num = 8;
                    } else {
                        num = 8;
                        b2 = 2;
                    }
                    break;
                case 1539:
                    if (!strGroup.equals("03")) {
                        num = 8;
                    } else {
                        num = 8;
                        b2 = 3;
                    }
                    break;
                case 1540:
                    if (!strGroup.equals("04")) {
                        num = 8;
                    } else {
                        num = 8;
                        b2 = 4;
                    }
                    break;
                case 1541:
                    if (!strGroup.equals("05")) {
                        num = 8;
                    } else {
                        num = 8;
                        b2 = 5;
                    }
                    break;
                case 1542:
                    if (!strGroup.equals("06")) {
                        num = 8;
                    } else {
                        num = 8;
                        b2 = 6;
                    }
                    break;
                case 1543:
                    if (!strGroup.equals("07")) {
                        num = 8;
                    } else {
                        num = 8;
                        b2 = 7;
                    }
                    break;
                case 1544:
                    if (!strGroup.equals("08")) {
                        num = 8;
                    } else {
                        num = 8;
                        b2 = 8;
                    }
                    break;
                case 1545:
                    if (!strGroup.equals("09")) {
                        num = 8;
                    } else {
                        num = 8;
                        b2 = 9;
                    }
                    break;
                case 1567:
                    if (!strGroup.equals("10")) {
                        num = 8;
                    } else {
                        num = 8;
                        b2 = 10;
                    }
                    break;
                default:
                    num = 8;
                    break;
            }
            switch (b2) {
                case 0:
                    num2 = num3;
                    break;
                case 1:
                    num2 = 2;
                    break;
                case 2:
                    num2 = 4;
                    break;
                case 3:
                    num2 = num;
                    break;
                case 4:
                    num2 = 16;
                    break;
                case 5:
                    num2 = 32;
                    break;
                case 6:
                    num2 = 64;
                    break;
                case 7:
                    num2 = 128;
                    break;
                case 8:
                    num2 = 256;
                    break;
                case 9:
                    num2 = numValueOf;
                    break;
                case 10:
                    num2 = 1024;
                    break;
            }
            if (num2 == null) {
                AbstractC1308pu.m5355v("Unknown Dolby Vision profile string: ", strGroup, "CodecSpecificDataUtil");
                return null;
            }
            str = strArrSplit[2];
            if (str == null) {
                switch (str.hashCode()) {
                    case 1537:
                        if (str.equals("01")) {
                            b3 = -1;
                        } else {
                            b3 = 0;
                        }
                        break;
                    case 1538:
                        if (str.equals("02")) {
                            b3 = -1;
                        } else {
                            b3 = 1;
                        }
                        break;
                    case 1539:
                        if (str.equals("03")) {
                            b3 = -1;
                        } else {
                            b3 = 2;
                        }
                        break;
                    case 1540:
                        if (str.equals("04")) {
                            b3 = -1;
                        } else {
                            b3 = 3;
                        }
                        break;
                    case 1541:
                        if (str.equals("05")) {
                            b3 = -1;
                        } else {
                            b3 = 4;
                        }
                        break;
                    case 1542:
                        if (str.equals("06")) {
                            b3 = -1;
                        } else {
                            b3 = 5;
                        }
                        break;
                    case 1543:
                        if (str.equals("07")) {
                            b3 = -1;
                        } else {
                            b3 = 6;
                        }
                        break;
                    case 1544:
                        if (str.equals("08")) {
                            b3 = -1;
                        } else {
                            b3 = 7;
                        }
                        break;
                    case 1545:
                        if (str.equals("09")) {
                            b3 = -1;
                        } else {
                            b3 = 8;
                        }
                        break;
                    case 1567:
                        if (str.equals("10")) {
                            b3 = -1;
                        } else {
                            b3 = 9;
                        }
                        break;
                    case 1568:
                        if (str.equals("11")) {
                            b3 = -1;
                        } else {
                            b3 = 10;
                        }
                        break;
                    case 1569:
                        if (str.equals("12")) {
                            b3 = -1;
                        } else {
                            b3 = 11;
                        }
                        break;
                    case 1570:
                        if (str.equals("13")) {
                            b3 = -1;
                        } else {
                            b3 = DerValue.tag_UTF8String;
                        }
                        break;
                    default:
                        b3 = -1;
                        break;
                }
                switch (b3) {
                    case 0:
                        break;
                    case 1:
                        num3 = 2;
                        break;
                    case 2:
                        num3 = 4;
                        break;
                    case 3:
                        num3 = num;
                        break;
                    case 4:
                        num3 = 16;
                        break;
                    case 5:
                        num3 = 32;
                        break;
                    case 6:
                        num3 = 64;
                        break;
                    case 7:
                        num3 = 128;
                        break;
                    case 8:
                        num3 = 256;
                        break;
                    case 9:
                        num3 = numValueOf;
                        break;
                    case 10:
                        num3 = 1024;
                        break;
                    case 11:
                        num3 = 2048;
                        break;
                    case 12:
                        num3 = 4096;
                        break;
                    default:
                        num3 = null;
                        break;
                }
            } else {
                num3 = null;
            }
            if (num3 == null) {
                return new Pair(num2, num3);
            }
            AbstractC1308pu.m5355v("Unknown Dolby Vision level string: ", str, "CodecSpecificDataUtil");
            return null;
        }
        num = 8;
        num2 = null;
        if (num2 == null) {
            AbstractC1308pu.m5355v("Unknown Dolby Vision profile string: ", strGroup, "CodecSpecificDataUtil");
            return null;
        }
        str = strArrSplit[2];
        if (str == null) {
            switch (str.hashCode()) {
                case 1537:
                    if (str.equals("01")) {
                        b3 = 0;
                    } else {
                        b3 = -1;
                    }
                    break;
                case 1538:
                    if (str.equals("02")) {
                        b3 = 1;
                    } else {
                        b3 = -1;
                    }
                    break;
                case 1539:
                    if (str.equals("03")) {
                        b3 = 2;
                    } else {
                        b3 = -1;
                    }
                    break;
                case 1540:
                    if (str.equals("04")) {
                        b3 = 3;
                    } else {
                        b3 = -1;
                    }
                    break;
                case 1541:
                    if (str.equals("05")) {
                        b3 = 4;
                    } else {
                        b3 = -1;
                    }
                    break;
                case 1542:
                    if (str.equals("06")) {
                        b3 = 5;
                    } else {
                        b3 = -1;
                    }
                    break;
                case 1543:
                    if (str.equals("07")) {
                        b3 = 6;
                    } else {
                        b3 = -1;
                    }
                    break;
                case 1544:
                    if (str.equals("08")) {
                        b3 = 7;
                    } else {
                        b3 = -1;
                    }
                    break;
                case 1545:
                    if (str.equals("09")) {
                        b3 = 8;
                    } else {
                        b3 = -1;
                    }
                    break;
                case 1567:
                    if (str.equals("10")) {
                        b3 = 9;
                    } else {
                        b3 = -1;
                    }
                    break;
                case 1568:
                    if (str.equals("11")) {
                        b3 = 10;
                    } else {
                        b3 = -1;
                    }
                    break;
                case 1569:
                    if (str.equals("12")) {
                        b3 = 11;
                    } else {
                        b3 = -1;
                    }
                    break;
                case 1570:
                    if (str.equals("13")) {
                        b3 = DerValue.tag_UTF8String;
                    } else {
                        b3 = -1;
                    }
                    break;
                default:
                    b3 = -1;
                    break;
            }
            switch (b3) {
                case 0:
                    break;
                case 1:
                    num3 = 2;
                    break;
                case 2:
                    num3 = 4;
                    break;
                case 3:
                    num3 = num;
                    break;
                case 4:
                    num3 = 16;
                    break;
                case 5:
                    num3 = 32;
                    break;
                case 6:
                    num3 = 64;
                    break;
                case 7:
                    num3 = 128;
                    break;
                case 8:
                    num3 = 256;
                    break;
                case 9:
                    num3 = numValueOf;
                    break;
                case 10:
                    num3 = 1024;
                    break;
                case 11:
                    num3 = 2048;
                    break;
                case 12:
                    num3 = 4096;
                    break;
                default:
                    num3 = null;
                    break;
            }
        } else {
            num3 = null;
        }
        if (num3 == null) {
            return new Pair(num2, num3);
        }
        AbstractC1308pu.m5355v("Unknown Dolby Vision level string: ", str, "CodecSpecificDataUtil");
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static synchronized List m4352e(String str, boolean z, boolean z2) {
        try {
            i11 i11Var = new i11(str, z, z2);
            HashMap map = f6590a;
            List list = (List) map.get(i11Var);
            if (list != null) {
                return list;
            }
            C1296pi c1296pi = new C1296pi();
            c1296pi.f8901a = (z || z2) ? 1 : 0;
            ArrayList arrayListM4353f = m4353f(i11Var, c1296pi);
            if (z && arrayListM4353f.isEmpty() && z42.f13274a <= 23) {
                arrayListM4353f = m4353f(i11Var, new pu0(2));
                if (!arrayListM4353f.isEmpty()) {
                    AbstractC1337qm.m5542i0("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((c11) arrayListM4353f.get(0)).f1614a);
                }
            }
            m4348a(str, arrayListM4353f);
            qm0 qm0VarM5567n = qm0.m5567n(arrayListM4353f);
            map.put(i11Var, qm0VarM5567n);
            return qm0VarM5567n;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: f */
    public static ArrayList m4353f(i11 i11Var, k11 k11Var) throws j11 {
        String strM4350c;
        String str;
        String str2;
        i11 i11Var2 = i11Var;
        boolean z = i11Var2.f4773b;
        try {
            ArrayList arrayList = new ArrayList();
            String str3 = i11Var2.f4772a;
            int iMo3748i = k11Var.mo3748i();
            boolean zMo3749l = k11Var.mo3749l();
            int i = 0;
            while (i < iMo3748i) {
                MediaCodecInfo mediaCodecInfoMo3745b = k11Var.mo3745b(i);
                int i2 = z42.f13274a;
                if (i2 < 29 || !mediaCodecInfoMo3745b.isAlias()) {
                    String name = mediaCodecInfoMo3745b.getName();
                    if (m4355h(mediaCodecInfoMo3745b, name, zMo3749l, str3) && (strM4350c = m4350c(mediaCodecInfoMo3745b, name, str3)) != null) {
                        try {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoMo3745b.getCapabilitiesForType(strM4350c);
                            boolean zMo3746d = k11Var.mo3746d("tunneled-playback", strM4350c, capabilitiesForType);
                            boolean zMo3747h = k11Var.mo3747h("tunneled-playback", capabilitiesForType);
                            boolean z2 = i11Var2.f4774c;
                            if ((z2 || !zMo3747h) && (!z2 || zMo3746d)) {
                                boolean zMo3746d2 = k11Var.mo3746d("secure-playback", strM4350c, capabilitiesForType);
                                boolean zMo3747h2 = k11Var.mo3747h("secure-playback", capabilitiesForType);
                                if ((z || !zMo3747h2) && (!z || zMo3746d2)) {
                                    boolean zIsHardwareAccelerated = i2 >= 29 ? mediaCodecInfoMo3745b.isHardwareAccelerated() : !m4356i(mediaCodecInfoMo3745b, str3);
                                    m4356i(mediaCodecInfoMo3745b, str3);
                                    if (i2 >= 29) {
                                        mediaCodecInfoMo3745b.isVendor();
                                    } else {
                                        String strM6444b0 = ua0.m6444b0(mediaCodecInfoMo3745b.getName());
                                        if (!strM6444b0.startsWith("omx.google.") && !strM6444b0.startsWith("c2.android.")) {
                                            strM6444b0.startsWith("c2.google.");
                                        }
                                    }
                                    if (!(zMo3749l && z == zMo3746d2) && (zMo3749l || z)) {
                                        boolean z3 = zIsHardwareAccelerated;
                                        str2 = name;
                                        if (!zMo3749l && zMo3746d2) {
                                            str = strM4350c;
                                            try {
                                                arrayList.add(c11.m1106h(str2 + ".secure", str3, str, capabilitiesForType, z3, true));
                                                break;
                                            } catch (Exception e) {
                                                e = e;
                                                if (z42.f13274a <= 23 || arrayList.isEmpty()) {
                                                    AbstractC1337qm.m5549m("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                    throw e;
                                                }
                                                AbstractC1337qm.m5549m("MediaCodecUtil", "Skipping codec " + str2 + " (failed to query capabilities)");
                                                i++;
                                                i11Var2 = i11Var;
                                            }
                                        }
                                    } else {
                                        str = strM4350c;
                                        try {
                                            c11 c11VarM1106h = c11.m1106h(name, str3, str, capabilitiesForType, zIsHardwareAccelerated, false);
                                            str2 = name;
                                            try {
                                                arrayList.add(c11VarM1106h);
                                            } catch (Exception e2) {
                                                e = e2;
                                                str = str;
                                                if (z42.f13274a <= 23) {
                                                }
                                                AbstractC1337qm.m5549m("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                throw e;
                                            }
                                        } catch (Exception e3) {
                                            e = e3;
                                            str2 = name;
                                        }
                                    }
                                }
                            }
                        } catch (Exception e4) {
                            e = e4;
                            str = strM4350c;
                            str2 = name;
                        }
                    }
                }
                i++;
                i11Var2 = i11Var;
            }
            return arrayList;
        } catch (Exception e5) {
            throw new j11("Failed to query underlying media codecs", e5);
        }
    }

    /* JADX INFO: renamed from: g */
    public static kk1 m4354g(f40 f40Var, be0 be0Var, boolean z, boolean z2) {
        String str = be0Var.f1341n;
        f40Var.getClass();
        List listM4352e = m4352e(str, z, z2);
        String strM4349b = m4349b(be0Var);
        Iterable iterableM4352e = strM4349b == null ? kk1.f5896e : m4352e(strM4349b, z, z2);
        nm0 nm0VarM5566m = qm0.m5566m();
        nm0VarM5566m.m3904d(listM4352e);
        nm0VarM5566m.m3904d(iterableM4352e);
        return nm0VarM5566m.m4561g();
    }

    /* JADX INFO: renamed from: h */
    public static boolean m4355h(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder()) {
            return false;
        }
        if (!z && str.endsWith(".secure")) {
            return false;
        }
        int i = z42.f13274a;
        if (i < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(z42.f13276c))) {
            String str3 = z42.f13275b;
            if (str3.startsWith("zeroflte") || str3.startsWith("zerolte") || str3.startsWith("zenlte") || "SC-05G".equals(str3) || "marinelteatt".equals(str3) || "404SC".equals(str3) || "SC-04G".equals(str3) || "SCV31".equals(str3)) {
                return false;
            }
        }
        return (i <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m4356i(MediaCodecInfo mediaCodecInfo, String str) {
        if (z42.f13274a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (v51.m6578h(str)) {
            return true;
        }
        String strM6444b0 = ua0.m6444b0(mediaCodecInfo.getName());
        if (strM6444b0.startsWith("arc.")) {
            return false;
        }
        if (strM6444b0.startsWith("omx.google.") || strM6444b0.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strM6444b0.startsWith("omx.sec.") && strM6444b0.contains(".sw.")) || strM6444b0.equals("omx.qcom.video.decoder.hevcswvdec") || strM6444b0.startsWith("c2.android.") || strM6444b0.startsWith("c2.google.")) {
            return true;
        }
        return (strM6444b0.startsWith("omx.") || strM6444b0.startsWith("c2.")) ? false : true;
    }
}
