package p000;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.github.muntashirakon.adb.PairingConnectionCtx;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class c11 {

    /* JADX INFO: renamed from: a */
    public final String f1614a;

    /* JADX INFO: renamed from: b */
    public final String f1615b;

    /* JADX INFO: renamed from: c */
    public final String f1616c;

    /* JADX INFO: renamed from: d */
    public final MediaCodecInfo.CodecCapabilities f1617d;

    /* JADX INFO: renamed from: e */
    public final boolean f1618e;

    /* JADX INFO: renamed from: f */
    public final boolean f1619f;

    /* JADX INFO: renamed from: g */
    public final boolean f1620g;

    /* JADX INFO: renamed from: h */
    public final boolean f1621h;

    /* JADX INFO: renamed from: i */
    public final boolean f1622i;

    public c11(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4) {
        str.getClass();
        this.f1614a = str;
        this.f1615b = str2;
        this.f1616c = str3;
        this.f1617d = codecCapabilities;
        this.f1620g = z;
        this.f1618e = z2;
        this.f1619f = z3;
        this.f1621h = z4;
        this.f1622i = v51.m6581k(str2);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1105a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(z42.m7231e(i, widthAlignment) * widthAlignment, z42.m7231e(i2, heightAlignment) * heightAlignment);
        int i3 = point.x;
        int i4 = point.y;
        return (d == -1.0d || d < 1.0d) ? videoCapabilities.isSizeSupported(i3, i4) : videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0039  */
    /* JADX INFO: renamed from: h */
    public static c11 m1106h(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        boolean z3;
        if (codecCapabilities == null || !codecCapabilities.isFeatureSupported("adaptive-playback")) {
            z3 = false;
        } else {
            if (z42.f13274a <= 22) {
                String str4 = z42.f13277d;
                if (("ODROID-XU3".equals(str4) || "Nexus 10".equals(str4)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                    z3 = false;
                }
            }
            z3 = true;
        }
        if (codecCapabilities != null) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        return new c11(str, str2, str3, codecCapabilities, z, z3, z2 || (codecCapabilities != null && codecCapabilities.isFeatureSupported("secure-playback")), z42.f13274a >= 35 && codecCapabilities != null && codecCapabilities.isFeatureSupported("detached-surface"));
    }

    /* JADX INFO: renamed from: b */
    public final C1607xx m1107b(be0 be0Var, be0 be0Var2) {
        be0 be0Var3;
        be0 be0Var4;
        String str = be0Var.f1341n;
        C1673zp c1673zp = be0Var.f1316B;
        String str2 = be0Var2.f1341n;
        C1673zp c1673zp2 = be0Var2.f1316B;
        int i = z42.f13274a;
        int i2 = !Objects.equals(str, str2) ? 8 : 0;
        if (this.f1622i) {
            if (be0Var.f1351x != be0Var2.f1351x) {
                i2 |= 1024;
            }
            if (!this.f1618e && (be0Var.f1348u != be0Var2.f1348u || be0Var.f1349v != be0Var2.f1349v)) {
                i2 |= UserVerificationMethods.USER_VERIFY_NONE;
            }
            if ((!C1673zp.m7328e(c1673zp) || !C1673zp.m7328e(c1673zp2)) && !Objects.equals(c1673zp, c1673zp2)) {
                i2 |= 2048;
            }
            if (z42.f13277d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f1614a) && !be0Var.m970b(be0Var2)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new C1607xx(this.f1614a, be0Var, be0Var2, be0Var.m970b(be0Var2) ? 3 : 2, 0);
            }
            be0Var3 = be0Var;
            be0Var4 = be0Var2;
        } else {
            be0Var3 = be0Var;
            be0Var4 = be0Var2;
            if (be0Var3.f1317C != be0Var4.f1317C) {
                i2 |= 4096;
            }
            if (be0Var3.f1318D != be0Var4.f1318D) {
                i2 |= PairingConnectionCtx.PeerInfo.MAX_PEER_INFO_SIZE;
            }
            if (be0Var3.f1319E != be0Var4.f1319E) {
                i2 |= PairingConnectionCtx.PairingPacketHeader.MAX_PAYLOAD_SIZE;
            }
            String str3 = this.f1615b;
            if (i2 == 0 && "audio/mp4a-latm".equals(str3)) {
                Pair pairM4351d = m11.m4351d(be0Var3);
                Pair pairM4351d2 = m11.m4351d(be0Var4);
                if (pairM4351d != null && pairM4351d2 != null) {
                    int iIntValue = ((Integer) pairM4351d.first).intValue();
                    int iIntValue2 = ((Integer) pairM4351d2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new C1607xx(this.f1614a, be0Var3, be0Var4, 3, 0);
                    }
                }
            }
            if (!be0Var3.m970b(be0Var4)) {
                i2 |= 32;
            }
            if ("audio/opus".equals(str3)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new C1607xx(this.f1614a, be0Var3, be0Var4, 1, 0);
            }
        }
        return new C1607xx(this.f1614a, be0Var3, be0Var4, 0, i2);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x013c A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0048  */
    /* JADX WARN: Code duplicated, block: B:19:0x0066  */
    /* JADX WARN: Code duplicated, block: B:21:0x006e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0071  */
    /* JADX WARN: Code duplicated, block: B:25:0x0077  */
    /* JADX WARN: Code duplicated, block: B:31:0x0083  */
    /* JADX WARN: Code duplicated, block: B:33:0x0087  */
    /* JADX WARN: Code duplicated, block: B:35:0x008b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0093  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:50:0x00be  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00db  */
    /* JADX WARN: Code duplicated, block: B:62:0x00de  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:74:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:76:0x0100  */
    /* JADX WARN: Code duplicated, block: B:77:0x0102  */
    /* JADX WARN: Code duplicated, block: B:81:0x0114  */
    /* JADX WARN: Code duplicated, block: B:83:0x011a  */
    /* JADX INFO: renamed from: c */
    public final boolean m1108c(be0 be0Var, boolean z) {
        int iIntValue;
        int iIntValue2;
        boolean zEquals;
        int i;
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int length;
        int i2;
        MediaCodecInfo.CodecProfileLevel codecProfileLevel;
        int iIntValue3;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair pairM4351d = m11.m4351d(be0Var);
        String str2 = be0Var.f1341n;
        String str3 = this.f1616c;
        if (str2 != null && str2.equals("video/mv-hevc")) {
            String strM6582l = v51.m6582l(str3);
            if (!strM6582l.equals("video/mv-hevc")) {
                if (strM6582l.equals("video/hevc")) {
                    String strM4644N = o21.m4644N(be0Var.f1344q);
                    if (strM4644N == null) {
                        pairM4351d = null;
                    } else {
                        String strTrim = strM4644N.trim();
                        int i3 = z42.f13274a;
                        pairM4351d = AbstractC0574dp.m2375b(strM4644N, strTrim.split("\\.", -1), be0Var.f1316B);
                    }
                }
                if (pairM4351d != null) {
                    iIntValue = ((Integer) pairM4351d.first).intValue();
                    iIntValue2 = ((Integer) pairM4351d.second).intValue();
                    zEquals = "video/dolby-vision".equals(str2);
                    i = 8;
                    str = this.f1615b;
                    if (zEquals) {
                        if ("video/avc".equals(str)) {
                            iIntValue = 8;
                        } else if ("video/hevc".equals(str)) {
                            iIntValue = 2;
                        }
                        iIntValue2 = 0;
                    }
                    if (this.f1622i) {
                        codecCapabilities = this.f1617d;
                        if (codecCapabilities != null) {
                            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                        } else {
                            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                        }
                        if (z42.f13274a <= 23) {
                            if (codecCapabilities != null) {
                                iIntValue3 = 0;
                            } else {
                                iIntValue3 = 0;
                            }
                            if (iIntValue3 >= 180000000) {
                                i = 1024;
                            } else if (iIntValue3 >= 120000000) {
                                i = UserVerificationMethods.USER_VERIFY_NONE;
                            } else if (iIntValue3 >= 60000000) {
                                i = 256;
                            } else if (iIntValue3 >= 30000000) {
                                i = 128;
                            } else if (iIntValue3 >= 18000000) {
                                i = 64;
                            } else if (iIntValue3 >= 12000000) {
                                i = 32;
                            } else if (iIntValue3 >= 7200000) {
                                i = 16;
                            } else if (iIntValue3 < 3600000) {
                                if (iIntValue3 >= 1800000) {
                                    i = 4;
                                } else if (iIntValue3 >= 800000) {
                                    i = 2;
                                } else {
                                    i = 1;
                                }
                            }
                            MediaCodecInfo.CodecProfileLevel codecProfileLevel2 = new MediaCodecInfo.CodecProfileLevel();
                            codecProfileLevel2.profile = 1;
                            codecProfileLevel2.level = i;
                            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel2};
                        }
                        length = codecProfileLevelArr.length;
                        for (i2 = 0; i2 < length; i2++) {
                            codecProfileLevel = codecProfileLevelArr[i2];
                            if (codecProfileLevel.profile != iIntValue) {
                            }
                        }
                        m1112g("codec.profileLevel, " + be0Var.f1338k + ", " + str3);
                        return false;
                    }
                    codecCapabilities = this.f1617d;
                    if (codecCapabilities != null) {
                        codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                    } else {
                        codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                    }
                    if (z42.f13274a <= 23) {
                        if (codecCapabilities != null) {
                            iIntValue3 = 0;
                        } else {
                            iIntValue3 = 0;
                        }
                        if (iIntValue3 >= 180000000) {
                            i = 1024;
                        } else if (iIntValue3 >= 120000000) {
                            i = UserVerificationMethods.USER_VERIFY_NONE;
                        } else if (iIntValue3 >= 60000000) {
                            i = 256;
                        } else if (iIntValue3 >= 30000000) {
                            i = 128;
                        } else if (iIntValue3 >= 18000000) {
                            i = 64;
                        } else if (iIntValue3 >= 12000000) {
                            i = 32;
                        } else if (iIntValue3 >= 7200000) {
                            i = 16;
                        } else if (iIntValue3 < 3600000) {
                            if (iIntValue3 >= 1800000) {
                                i = 4;
                            } else if (iIntValue3 >= 800000) {
                                i = 2;
                            } else {
                                i = 1;
                            }
                        }
                        MediaCodecInfo.CodecProfileLevel codecProfileLevel3 = new MediaCodecInfo.CodecProfileLevel();
                        codecProfileLevel3.profile = 1;
                        codecProfileLevel3.level = i;
                        codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel3};
                    }
                    length = codecProfileLevelArr.length;
                    while (i2 < length) {
                        codecProfileLevel = codecProfileLevelArr[i2];
                        if (codecProfileLevel.profile != iIntValue) {
                        }
                    }
                    m1112g("codec.profileLevel, " + be0Var.f1338k + ", " + str3);
                    return false;
                }
            }
        } else if (pairM4351d != null) {
            iIntValue = ((Integer) pairM4351d.first).intValue();
            iIntValue2 = ((Integer) pairM4351d.second).intValue();
            zEquals = "video/dolby-vision".equals(str2);
            i = 8;
            str = this.f1615b;
            if (zEquals) {
                if ("video/avc".equals(str)) {
                    iIntValue = 8;
                } else if ("video/hevc".equals(str)) {
                    iIntValue = 2;
                }
                iIntValue2 = 0;
            }
            if (this.f1622i || iIntValue == 42) {
                codecCapabilities = this.f1617d;
                if (codecCapabilities != null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                if (z42.f13274a <= 23 && "video/x-vnd.on2.vp9".equals(str) && codecProfileLevelArr.length == 0) {
                    if (codecCapabilities != null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                        iIntValue3 = 0;
                    } else {
                        iIntValue3 = ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
                    }
                    if (iIntValue3 >= 180000000) {
                        i = 1024;
                    } else if (iIntValue3 >= 120000000) {
                        i = UserVerificationMethods.USER_VERIFY_NONE;
                    } else if (iIntValue3 >= 60000000) {
                        i = 256;
                    } else if (iIntValue3 >= 30000000) {
                        i = 128;
                    } else if (iIntValue3 >= 18000000) {
                        i = 64;
                    } else if (iIntValue3 >= 12000000) {
                        i = 32;
                    } else if (iIntValue3 >= 7200000) {
                        i = 16;
                    } else if (iIntValue3 < 3600000) {
                        if (iIntValue3 >= 1800000) {
                            i = 4;
                        } else if (iIntValue3 >= 800000) {
                            i = 2;
                        } else {
                            i = 1;
                        }
                    }
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel4 = new MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel4.profile = 1;
                    codecProfileLevel4.level = i;
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel4};
                }
                length = codecProfileLevelArr.length;
                while (i2 < length) {
                    codecProfileLevel = codecProfileLevelArr[i2];
                    if (codecProfileLevel.profile != iIntValue && (codecProfileLevel.level >= iIntValue2 || !z)) {
                        if ("video/hevc".equals(str) && 2 == iIntValue) {
                            String str4 = z42.f13275b;
                            if ("sailfish".equals(str4) || "marlin".equals(str4)) {
                            }
                        }
                    }
                }
                m1112g("codec.profileLevel, " + be0Var.f1338k + ", " + str3);
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m1109d(be0 be0Var) {
        int i;
        int i2;
        String str = be0Var.f1341n;
        String str2 = this.f1615b;
        if ((!str2.equals(str) && !str2.equals(m11.m4349b(be0Var))) || !m1108c(be0Var, true)) {
            return false;
        }
        if (this.f1622i) {
            int i3 = be0Var.f1348u;
            if (i3 > 0 && (i2 = be0Var.f1349v) > 0) {
                return m1111f(i3, i2, be0Var.f1350w);
            }
        } else {
            int i4 = be0Var.f1318D;
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.f1617d;
            if (i4 != -1) {
                if (codecCapabilities == null) {
                    m1112g("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    m1112g("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i4)) {
                    m1112g("sampleRate.support, " + i4);
                    return false;
                }
            }
            int i5 = be0Var.f1317C;
            if (i5 != -1) {
                if (codecCapabilities == null) {
                    m1112g("channelCount.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    m1112g("channelCount.aCaps");
                    return false;
                }
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((z42.f13274a < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                    if ("audio/ac3".equals(str2)) {
                        i = 6;
                    } else {
                        i = "audio/eac3".equals(str2) ? 16 : 30;
                    }
                    AbstractC1337qm.m5542i0("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + this.f1614a + ", [" + maxInputChannelCount + " to " + i + "]");
                    maxInputChannelCount = i;
                }
                if (maxInputChannelCount < i5) {
                    m1112g("channelCount.support, " + i5);
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m1110e(be0 be0Var) {
        if (this.f1622i) {
            return this.f1618e;
        }
        Pair pairM4351d = m11.m4351d(be0Var);
        return pairM4351d != null && ((Integer) pairM4351d.first).intValue() == 42;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00ab  */
    /* JADX INFO: renamed from: f */
    public final boolean m1111f(int i, int i2, double d) {
        String str;
        char c;
        Boolean bool;
        List supportedPerformancePoints;
        boolean z;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f1617d;
        if (codecCapabilities == null) {
            m1112g("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            m1112g("sizeAndRate.vCaps");
            return false;
        }
        int i3 = z42.f13274a;
        if (i3 >= 29) {
            if (i3 < 29 || (((bool = AbstractC1337qm.f9539g) != null && bool.booleanValue()) || (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) == null || supportedPerformancePoints.isEmpty())) {
                c = 0;
            } else {
                d11.m2188k();
                MediaCodecInfo.VideoCapabilities.PerformancePoint performancePointM2181d = d11.m2181d(i, i2, (int) d);
                int i4 = 0;
                while (true) {
                    if (i4 >= supportedPerformancePoints.size()) {
                        c = 1;
                        break;
                    }
                    if (d11.m2182e(supportedPerformancePoints.get(i4)).covers(performancePointM2181d)) {
                        c = 2;
                        break;
                    }
                    i4++;
                }
                if (c == 1 && AbstractC1337qm.f9539g == null) {
                    if (i3 >= 35) {
                        z = false;
                    } else {
                        int iM6073q = sc2.m6073q(false);
                        int iM6073q2 = sc2.m6073q(true);
                        if (iM6073q != 0 && (iM6073q2 != 0 ? iM6073q == 2 && iM6073q2 == 2 : iM6073q == 2)) {
                            z = false;
                        } else {
                            z = true;
                        }
                    }
                    AbstractC1337qm.f9539g = Boolean.valueOf(z);
                    if (z) {
                        c = 0;
                    }
                }
            }
            if (c != 2) {
                if (c == 1) {
                    StringBuilder sbM5345l = AbstractC1308pu.m5345l("sizeAndRate.cover, ", i, "x", i2, "@");
                    sbM5345l.append(d);
                    m1112g(sbM5345l.toString());
                    return false;
                }
                if (!m1105a(videoCapabilities, i, i2, d)) {
                    if (i < i2) {
                        str = this.f1614a;
                        if ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str)) {
                            StringBuilder sbM5345l2 = AbstractC1308pu.m5345l("sizeAndRate.rotated, ", i, "x", i2, "@");
                            sbM5345l2.append(d);
                            StringBuilder sbM3618p = jd0.m3618p("AssumedSupport [", sbM5345l2.toString(), "] [", str, ", ");
                            sbM3618p.append(this.f1615b);
                            sbM3618p.append("] [");
                            sbM3618p.append(z42.f13278e);
                            sbM3618p.append("]");
                            AbstractC1337qm.m5547l(sbM3618p.toString());
                            return true;
                        }
                        StringBuilder sbM5345l3 = AbstractC1308pu.m5345l("sizeAndRate.rotated, ", i, "x", i2, "@");
                        sbM5345l3.append(d);
                        StringBuilder sbM3618p2 = jd0.m3618p("AssumedSupport [", sbM5345l3.toString(), "] [", str, ", ");
                        sbM3618p2.append(this.f1615b);
                        sbM3618p2.append("] [");
                        sbM3618p2.append(z42.f13278e);
                        sbM3618p2.append("]");
                        AbstractC1337qm.m5547l(sbM3618p2.toString());
                        return true;
                    }
                    StringBuilder sbM5345l4 = AbstractC1308pu.m5345l("sizeAndRate.support, ", i, "x", i2, "@");
                    sbM5345l4.append(d);
                    m1112g(sbM5345l4.toString());
                    return false;
                }
            }
        } else if (!m1105a(videoCapabilities, i, i2, d)) {
            if (i < i2) {
                str = this.f1614a;
                if (("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(z42.f13275b)) && m1105a(videoCapabilities, i2, i, d)) {
                    StringBuilder sbM5345l5 = AbstractC1308pu.m5345l("sizeAndRate.rotated, ", i, "x", i2, "@");
                    sbM5345l5.append(d);
                    StringBuilder sbM3618p3 = jd0.m3618p("AssumedSupport [", sbM5345l5.toString(), "] [", str, ", ");
                    sbM3618p3.append(this.f1615b);
                    sbM3618p3.append("] [");
                    sbM3618p3.append(z42.f13278e);
                    sbM3618p3.append("]");
                    AbstractC1337qm.m5547l(sbM3618p3.toString());
                    return true;
                }
            }
            StringBuilder sbM5345l6 = AbstractC1308pu.m5345l("sizeAndRate.support, ", i, "x", i2, "@");
            sbM5345l6.append(d);
            m1112g(sbM5345l6.toString());
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final void m1112g(String str) {
        StringBuilder sbM5347n = AbstractC1308pu.m5347n("NoSupport [", str, "] [");
        sbM5347n.append(this.f1614a);
        sbM5347n.append(", ");
        sbM5347n.append(this.f1615b);
        sbM5347n.append("] [");
        sbM5347n.append(z42.f13278e);
        sbM5347n.append("]");
        AbstractC1337qm.m5547l(sbM5347n.toString());
    }

    public final String toString() {
        return this.f1614a;
    }
}
