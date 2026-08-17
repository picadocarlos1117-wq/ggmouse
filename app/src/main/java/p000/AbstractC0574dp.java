package p000;

import android.sun.security.util.DerValue;
import android.util.Pair;
import com.example.ssmousepro.OverlayDisplayBinder;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.github.muntashirakon.adb.AdbProtocol;
import io.github.muntashirakon.adb.PairingConnectionCtx;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: dp */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0574dp {

    /* JADX INFO: renamed from: a */
    public static final byte[] f2986a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b */
    public static final String[] f2987b = {"", "A", "B", "C"};

    /* JADX INFO: renamed from: c */
    public static final Pattern f2988c = Pattern.compile("^\\D?(\\d+)$");

    /* JADX INFO: renamed from: a */
    public static String m2374a(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        Object[] objArr = {f2987b[i], Integer.valueOf(i2), Integer.valueOf(i3), Character.valueOf(z ? 'H' : 'L'), Integer.valueOf(i4)};
        int i5 = z42.f13274a;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i6 = 0; i6 < length; i6++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i6])));
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0052  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: b */
    public static Pair m2375b(String str, String[] strArr, C1673zp c1673zp) {
        int i;
        Integer numValueOf;
        if (strArr.length < 4) {
            AbstractC1308pu.m5355v("Ignoring malformed HEVC codec string: ", str, "CodecSpecificDataUtil");
            return null;
        }
        Matcher matcher = f2988c.matcher(strArr[1]);
        if (!matcher.matches()) {
            AbstractC1308pu.m5355v("Ignoring malformed HEVC codec string: ", str, "CodecSpecificDataUtil");
            return null;
        }
        String strGroup = matcher.group(1);
        byte b = 6;
        if ("1".equals(strGroup)) {
            i = 1;
        } else if ("2".equals(strGroup)) {
            i = (c1673zp == null || c1673zp.f13515c != 6) ? 2 : 4096;
        } else {
            if (!"6".equals(strGroup)) {
                AbstractC1308pu.m5355v("Unknown HEVC profile string: ", strGroup, "CodecSpecificDataUtil");
                return null;
            }
            i = 6;
        }
        String str2 = strArr[3];
        if (str2 != null) {
            switch (str2.hashCode()) {
                case 70821:
                    b = !str2.equals("H30") ? (byte) -1 : (byte) 0;
                    break;
                case 70914:
                    b = !str2.equals("H60") ? (byte) -1 : (byte) 1;
                    break;
                case 70917:
                    b = !str2.equals("H63") ? (byte) -1 : (byte) 2;
                    break;
                case 71007:
                    b = !str2.equals("H90") ? (byte) -1 : (byte) 3;
                    break;
                case 71010:
                    b = !str2.equals("H93") ? (byte) -1 : (byte) 4;
                    break;
                case 74665:
                    b = !str2.equals("L30") ? (byte) -1 : (byte) 5;
                    break;
                case 74758:
                    if (!str2.equals("L60")) {
                        b = -1;
                    }
                    break;
                case 74761:
                    b = !str2.equals("L63") ? (byte) -1 : (byte) 7;
                    break;
                case 74851:
                    b = !str2.equals("L90") ? (byte) -1 : (byte) 8;
                    break;
                case 74854:
                    b = !str2.equals("L93") ? (byte) -1 : (byte) 9;
                    break;
                case 2193639:
                    b = !str2.equals("H120") ? (byte) -1 : (byte) 10;
                    break;
                case 2193642:
                    b = !str2.equals("H123") ? (byte) -1 : (byte) 11;
                    break;
                case 2193732:
                    b = !str2.equals("H150") ? (byte) -1 : DerValue.tag_UTF8String;
                    break;
                case 2193735:
                    b = !str2.equals("H153") ? (byte) -1 : (byte) 13;
                    break;
                case 2193738:
                    b = !str2.equals("H156") ? (byte) -1 : (byte) 14;
                    break;
                case 2193825:
                    b = !str2.equals("H180") ? (byte) -1 : (byte) 15;
                    break;
                case 2193828:
                    b = !str2.equals("H183") ? (byte) -1 : (byte) 16;
                    break;
                case 2193831:
                    b = !str2.equals("H186") ? (byte) -1 : (byte) 17;
                    break;
                case 2312803:
                    b = !str2.equals("L120") ? (byte) -1 : (byte) 18;
                    break;
                case 2312806:
                    b = !str2.equals("L123") ? (byte) -1 : DerValue.tag_PrintableString;
                    break;
                case 2312896:
                    b = !str2.equals("L150") ? (byte) -1 : DerValue.tag_T61String;
                    break;
                case 2312899:
                    b = !str2.equals("L153") ? (byte) -1 : (byte) 21;
                    break;
                case 2312902:
                    b = !str2.equals("L156") ? (byte) -1 : DerValue.tag_IA5String;
                    break;
                case 2312989:
                    b = !str2.equals("L180") ? (byte) -1 : DerValue.tag_UtcTime;
                    break;
                case 2312992:
                    b = !str2.equals("L183") ? (byte) -1 : DerValue.tag_GeneralizedTime;
                    break;
                case 2312995:
                    b = !str2.equals("L186") ? (byte) -1 : (byte) 25;
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                    numValueOf = 2;
                    break;
                case 1:
                    numValueOf = 8;
                    break;
                case 2:
                    numValueOf = 32;
                    break;
                case 3:
                    numValueOf = 128;
                    break;
                case 4:
                    numValueOf = Integer.valueOf(UserVerificationMethods.USER_VERIFY_NONE);
                    break;
                case 5:
                    numValueOf = 1;
                    break;
                case 6:
                    numValueOf = 4;
                    break;
                case 7:
                    numValueOf = 16;
                    break;
                case 8:
                    numValueOf = 64;
                    break;
                case 9:
                    numValueOf = 256;
                    break;
                case 10:
                    numValueOf = 2048;
                    break;
                case 11:
                    numValueOf = Integer.valueOf(PairingConnectionCtx.PeerInfo.MAX_PEER_INFO_SIZE);
                    break;
                case 12:
                    numValueOf = 32768;
                    break;
                case 13:
                    numValueOf = Integer.valueOf(OverlayDisplayBinder.FLAG_EXTERNAL_DEX_HOSTING);
                    break;
                case 14:
                    numValueOf = 524288;
                    break;
                case 15:
                    numValueOf = 2097152;
                    break;
                case 16:
                    numValueOf = 8388608;
                    break;
                case 17:
                    numValueOf = 33554432;
                    break;
                case 18:
                    numValueOf = 1024;
                    break;
                case 19:
                    numValueOf = 4096;
                    break;
                case 20:
                    numValueOf = Integer.valueOf(PairingConnectionCtx.PairingPacketHeader.MAX_PAYLOAD_SIZE);
                    break;
                case 21:
                    numValueOf = 65536;
                    break;
                case 22:
                    numValueOf = Integer.valueOf(AdbProtocol.MAX_PAYLOAD_V2);
                    break;
                case 23:
                    numValueOf = Integer.valueOf(AdbProtocol.MAX_PAYLOAD_V3);
                    break;
                case 24:
                    numValueOf = 4194304;
                    break;
                case 25:
                    numValueOf = 16777216;
                    break;
                default:
                    numValueOf = null;
                    break;
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return new Pair(Integer.valueOf(i), numValueOf);
        }
        AbstractC1308pu.m5355v("Unknown HEVC level string: ", str2, "CodecSpecificDataUtil");
        return null;
    }
}
