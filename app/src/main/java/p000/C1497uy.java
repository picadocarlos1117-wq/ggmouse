package p000;

import android.content.Context;
import android.sun.security.util.DerValue;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.example.ssmousepro.BuildConfig;
import com.example.ssmousepro.HudPresetFreefire;
import com.example.ssmousepro.ads.RewardedVideoActivity;
import com.example.ssmousepro.injection.InjectionMetrics;
import com.example.ssmousepro.injection.LinuxInputConstants;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.google.android.gms.location.LocationRequest;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import java.util.HashMap;
import java.util.Locale;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: renamed from: uy */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1497uy {

    /* JADX INFO: renamed from: a */
    public final Context f11450a;

    /* JADX INFO: renamed from: b */
    public final HashMap f11451b;

    /* JADX INFO: renamed from: c */
    public final int f11452c;

    /* JADX INFO: renamed from: d */
    public final xy1 f11453d;

    /* JADX INFO: renamed from: e */
    public final boolean f11454e;

    /* JADX WARN: Code duplicated, block: B:7:0x0024  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public C1497uy(RewardedVideoActivity rewardedVideoActivity) {
        String strM6446c0;
        int[] iArr;
        this.f11450a = rewardedVideoActivity.getApplicationContext();
        int i = z42.f13274a;
        TelephonyManager telephonyManager = (TelephonyManager) rewardedVideoActivity.getSystemService("phone");
        if (telephonyManager != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (TextUtils.isEmpty(networkCountryIso)) {
                strM6446c0 = ua0.m6446c0(Locale.getDefault().getCountry());
            } else {
                strM6446c0 = ua0.m6446c0(networkCountryIso);
            }
        } else {
            strM6446c0 = ua0.m6446c0(Locale.getDefault().getCountry());
        }
        kk1 kk1Var = C1534vy.f11837n;
        strM6446c0.getClass();
        byte b = -1;
        switch (strM6446c0.hashCode()) {
            case 2083:
                if (strM6446c0.equals("AD")) {
                    b = 0;
                }
                break;
            case 2084:
                if (strM6446c0.equals("AE")) {
                    b = 1;
                }
                break;
            case 2085:
                if (strM6446c0.equals("AF")) {
                    b = 2;
                }
                break;
            case 2086:
                if (strM6446c0.equals("AG")) {
                    b = 3;
                }
                break;
            case 2088:
                if (strM6446c0.equals("AI")) {
                    b = 4;
                }
                break;
            case 2091:
                if (strM6446c0.equals("AL")) {
                    b = 5;
                }
                break;
            case 2092:
                if (strM6446c0.equals("AM")) {
                    b = 6;
                }
                break;
            case 2094:
                if (strM6446c0.equals("AO")) {
                    b = 7;
                }
                break;
            case 2096:
                if (strM6446c0.equals("AQ")) {
                    b = 8;
                }
                break;
            case 2097:
                if (strM6446c0.equals("AR")) {
                    b = 9;
                }
                break;
            case 2098:
                if (strM6446c0.equals("AS")) {
                    b = 10;
                }
                break;
            case 2099:
                if (strM6446c0.equals("AT")) {
                    b = 11;
                }
                break;
            case 2100:
                if (strM6446c0.equals("AU")) {
                    b = DerValue.tag_UTF8String;
                }
                break;
            case 2102:
                if (strM6446c0.equals("AW")) {
                    b = 13;
                }
                break;
            case 2103:
                if (strM6446c0.equals("AX")) {
                    b = 14;
                }
                break;
            case 2105:
                if (strM6446c0.equals("AZ")) {
                    b = 15;
                }
                break;
            case 2111:
                if (strM6446c0.equals("BA")) {
                    b = 16;
                }
                break;
            case 2112:
                if (strM6446c0.equals("BB")) {
                    b = 17;
                }
                break;
            case 2114:
                if (strM6446c0.equals("BD")) {
                    b = 18;
                }
                break;
            case 2115:
                if (strM6446c0.equals("BE")) {
                    b = DerValue.tag_PrintableString;
                }
                break;
            case 2116:
                if (strM6446c0.equals("BF")) {
                    b = DerValue.tag_T61String;
                }
                break;
            case 2117:
                if (strM6446c0.equals("BG")) {
                    b = 21;
                }
                break;
            case 2118:
                if (strM6446c0.equals("BH")) {
                    b = DerValue.tag_IA5String;
                }
                break;
            case 2119:
                if (strM6446c0.equals("BI")) {
                    b = DerValue.tag_UtcTime;
                }
                break;
            case 2120:
                if (strM6446c0.equals("BJ")) {
                    b = DerValue.tag_GeneralizedTime;
                }
                break;
            case 2122:
                if (strM6446c0.equals("BL")) {
                    b = 25;
                }
                break;
            case 2123:
                if (strM6446c0.equals("BM")) {
                    b = 26;
                }
                break;
            case 2124:
                if (strM6446c0.equals("BN")) {
                    b = DerValue.tag_GeneralString;
                }
                break;
            case 2125:
                if (strM6446c0.equals("BO")) {
                    b = DerValue.tag_UniversalString;
                }
                break;
            case 2127:
                if (strM6446c0.equals("BQ")) {
                    b = 29;
                }
                break;
            case 2128:
                if (strM6446c0.equals("BR")) {
                    b = DerValue.tag_BMPString;
                }
                break;
            case 2129:
                if (strM6446c0.equals("BS")) {
                    b = 31;
                }
                break;
            case 2130:
                if (strM6446c0.equals("BT")) {
                    b = 32;
                }
                break;
            case 2133:
                if (strM6446c0.equals("BW")) {
                    b = 33;
                }
                break;
            case 2135:
                if (strM6446c0.equals("BY")) {
                    b = 34;
                }
                break;
            case 2136:
                if (strM6446c0.equals("BZ")) {
                    b = 35;
                }
                break;
            case 2142:
                if (strM6446c0.equals("CA")) {
                    b = 36;
                }
                break;
            case 2145:
                if (strM6446c0.equals("CD")) {
                    b = 37;
                }
                break;
            case 2147:
                if (strM6446c0.equals("CF")) {
                    b = 38;
                }
                break;
            case 2148:
                if (strM6446c0.equals("CG")) {
                    b = 39;
                }
                break;
            case 2149:
                if (strM6446c0.equals("CH")) {
                    b = 40;
                }
                break;
            case 2150:
                if (strM6446c0.equals("CI")) {
                    b = 41;
                }
                break;
            case 2152:
                if (strM6446c0.equals("CK")) {
                    b = 42;
                }
                break;
            case 2153:
                if (strM6446c0.equals("CL")) {
                    b = 43;
                }
                break;
            case 2154:
                if (strM6446c0.equals("CM")) {
                    b = 44;
                }
                break;
            case 2155:
                if (strM6446c0.equals("CN")) {
                    b = 45;
                }
                break;
            case 2156:
                if (strM6446c0.equals("CO")) {
                    b = 46;
                }
                break;
            case 2159:
                if (strM6446c0.equals("CR")) {
                    b = 47;
                }
                break;
            case 2162:
                if (strM6446c0.equals("CU")) {
                    b = 48;
                }
                break;
            case 2163:
                if (strM6446c0.equals("CV")) {
                    b = 49;
                }
                break;
            case 2164:
                if (strM6446c0.equals("CW")) {
                    b = 50;
                }
                break;
            case 2165:
                if (strM6446c0.equals("CX")) {
                    b = 51;
                }
                break;
            case 2166:
                if (strM6446c0.equals("CY")) {
                    b = 52;
                }
                break;
            case 2167:
                if (strM6446c0.equals("CZ")) {
                    b = 53;
                }
                break;
            case 2177:
                if (strM6446c0.equals("DE")) {
                    b = 54;
                }
                break;
            case 2182:
                if (strM6446c0.equals("DJ")) {
                    b = 55;
                }
                break;
            case 2183:
                if (strM6446c0.equals("DK")) {
                    b = 56;
                }
                break;
            case 2185:
                if (strM6446c0.equals("DM")) {
                    b = 57;
                }
                break;
            case 2187:
                if (strM6446c0.equals("DO")) {
                    b = 58;
                }
                break;
            case 2198:
                if (strM6446c0.equals("DZ")) {
                    b = 59;
                }
                break;
            case 2206:
                if (strM6446c0.equals("EC")) {
                    b = 60;
                }
                break;
            case 2208:
                if (strM6446c0.equals("EE")) {
                    b = 61;
                }
                break;
            case 2210:
                if (strM6446c0.equals("EG")) {
                    b = 62;
                }
                break;
            case 2221:
                if (strM6446c0.equals("ER")) {
                    b = 63;
                }
                break;
            case 2222:
                if (strM6446c0.equals("ES")) {
                    b = DerValue.TAG_APPLICATION;
                }
                break;
            case 2223:
                if (strM6446c0.equals("ET")) {
                    b = 65;
                }
                break;
            case 2243:
                if (strM6446c0.equals("FI")) {
                    b = 66;
                }
                break;
            case 2244:
                if (strM6446c0.equals("FJ")) {
                    b = 67;
                }
                break;
            case 2245:
                if (strM6446c0.equals("FK")) {
                    b = 68;
                }
                break;
            case 2247:
                if (strM6446c0.equals("FM")) {
                    b = 69;
                }
                break;
            case 2249:
                if (strM6446c0.equals("FO")) {
                    b = 70;
                }
                break;
            case 2252:
                if (strM6446c0.equals("FR")) {
                    b = 71;
                }
                break;
            case 2266:
                if (strM6446c0.equals("GA")) {
                    b = 72;
                }
                break;
            case 2267:
                if (strM6446c0.equals("GB")) {
                    b = 73;
                }
                break;
            case 2269:
                if (strM6446c0.equals("GD")) {
                    b = 74;
                }
                break;
            case 2270:
                if (strM6446c0.equals("GE")) {
                    b = 75;
                }
                break;
            case 2271:
                if (strM6446c0.equals("GF")) {
                    b = 76;
                }
                break;
            case 2272:
                if (strM6446c0.equals("GG")) {
                    b = 77;
                }
                break;
            case 2273:
                if (strM6446c0.equals("GH")) {
                    b = 78;
                }
                break;
            case 2274:
                if (strM6446c0.equals("GI")) {
                    b = 79;
                }
                break;
            case 2277:
                if (strM6446c0.equals("GL")) {
                    b = 80;
                }
                break;
            case 2278:
                if (strM6446c0.equals("GM")) {
                    b = 81;
                }
                break;
            case 2279:
                if (strM6446c0.equals("GN")) {
                    b = 82;
                }
                break;
            case 2281:
                if (strM6446c0.equals("GP")) {
                    b = 83;
                }
                break;
            case 2282:
                if (strM6446c0.equals("GQ")) {
                    b = 84;
                }
                break;
            case 2283:
                if (strM6446c0.equals("GR")) {
                    b = 85;
                }
                break;
            case 2285:
                if (strM6446c0.equals("GT")) {
                    b = 86;
                }
                break;
            case 2286:
                if (strM6446c0.equals("GU")) {
                    b = 87;
                }
                break;
            case 2288:
                if (strM6446c0.equals("GW")) {
                    b = 88;
                }
                break;
            case 2290:
                if (strM6446c0.equals("GY")) {
                    b = 89;
                }
                break;
            case 2307:
                if (strM6446c0.equals("HK")) {
                    b = 90;
                }
                break;
            case 2314:
                if (strM6446c0.equals("HR")) {
                    b = 91;
                }
                break;
            case 2316:
                if (strM6446c0.equals("HT")) {
                    b = 92;
                }
                break;
            case 2317:
                if (strM6446c0.equals("HU")) {
                    b = 93;
                }
                break;
            case 2331:
                if (strM6446c0.equals("ID")) {
                    b = 94;
                }
                break;
            case 2332:
                if (strM6446c0.equals("IE")) {
                    b = 95;
                }
                break;
            case 2339:
                if (strM6446c0.equals("IL")) {
                    b = 96;
                }
                break;
            case HudPresetFreefire.REF_W /* 2340 */:
                if (strM6446c0.equals("IM")) {
                    b = 97;
                }
                break;
            case 2341:
                if (strM6446c0.equals("IN")) {
                    b = 98;
                }
                break;
            case 2342:
                if (strM6446c0.equals("IO")) {
                    b = 99;
                }
                break;
            case 2344:
                if (strM6446c0.equals("IQ")) {
                    b = 100;
                }
                break;
            case 2345:
                if (strM6446c0.equals("IR")) {
                    b = 101;
                }
                break;
            case 2346:
                if (strM6446c0.equals("IS")) {
                    b = 102;
                }
                break;
            case 2347:
                if (strM6446c0.equals("IT")) {
                    b = 103;
                }
                break;
            case 2363:
                if (strM6446c0.equals("JE")) {
                    b = 104;
                }
                break;
            case 2371:
                if (strM6446c0.equals("JM")) {
                    b = 105;
                }
                break;
            case 2373:
                if (strM6446c0.equals("JO")) {
                    b = 106;
                }
                break;
            case 2374:
                if (strM6446c0.equals("JP")) {
                    b = 107;
                }
                break;
            case 2394:
                if (strM6446c0.equals("KE")) {
                    b = 108;
                }
                break;
            case 2396:
                if (strM6446c0.equals("KG")) {
                    b = 109;
                }
                break;
            case 2397:
                if (strM6446c0.equals("KH")) {
                    b = 110;
                }
                break;
            case 2398:
                if (strM6446c0.equals("KI")) {
                    b = 111;
                }
                break;
            case 2402:
                if (strM6446c0.equals("KM")) {
                    b = 112;
                }
                break;
            case 2403:
                if (strM6446c0.equals("KN")) {
                    b = 113;
                }
                break;
            case 2407:
                if (strM6446c0.equals("KR")) {
                    b = 114;
                }
                break;
            case 2412:
                if (strM6446c0.equals("KW")) {
                    b = 115;
                }
                break;
            case 2414:
                if (strM6446c0.equals("KY")) {
                    b = 116;
                }
                break;
            case 2415:
                if (strM6446c0.equals("KZ")) {
                    b = 117;
                }
                break;
            case 2421:
                if (strM6446c0.equals("LA")) {
                    b = 118;
                }
                break;
            case 2422:
                if (strM6446c0.equals("LB")) {
                    b = 119;
                }
                break;
            case 2423:
                if (strM6446c0.equals("LC")) {
                    b = 120;
                }
                break;
            case 2429:
                if (strM6446c0.equals("LI")) {
                    b = 121;
                }
                break;
            case 2431:
                if (strM6446c0.equals("LK")) {
                    b = 122;
                }
                break;
            case 2438:
                if (strM6446c0.equals("LR")) {
                    b = 123;
                }
                break;
            case 2439:
                if (strM6446c0.equals("LS")) {
                    b = 124;
                }
                break;
            case 2440:
                if (strM6446c0.equals("LT")) {
                    b = 125;
                }
                break;
            case 2441:
                if (strM6446c0.equals("LU")) {
                    b = 126;
                }
                break;
            case 2442:
                if (strM6446c0.equals("LV")) {
                    b = 127;
                }
                break;
            case 2445:
                if (strM6446c0.equals("LY")) {
                    b = DerValue.TAG_CONTEXT;
                }
                break;
            case 2452:
                if (strM6446c0.equals("MA")) {
                    b = 129;
                }
                break;
            case 2454:
                if (strM6446c0.equals("MC")) {
                    b = 130;
                }
                break;
            case 2455:
                if (strM6446c0.equals("MD")) {
                    b = 131;
                }
                break;
            case 2456:
                if (strM6446c0.equals("ME")) {
                    b = 132;
                }
                break;
            case 2457:
                if (strM6446c0.equals("MF")) {
                    b = 133;
                }
                break;
            case 2458:
                if (strM6446c0.equals("MG")) {
                    b = 134;
                }
                break;
            case 2459:
                if (strM6446c0.equals("MH")) {
                    b = 135;
                }
                break;
            case 2462:
                if (strM6446c0.equals("MK")) {
                    b = 136;
                }
                break;
            case 2463:
                if (strM6446c0.equals("ML")) {
                    b = 137;
                }
                break;
            case 2464:
                if (strM6446c0.equals("MM")) {
                    b = 138;
                }
                break;
            case 2465:
                if (strM6446c0.equals("MN")) {
                    b = 139;
                }
                break;
            case 2466:
                if (strM6446c0.equals("MO")) {
                    b = 140;
                }
                break;
            case 2467:
                if (strM6446c0.equals("MP")) {
                    b = 141;
                }
                break;
            case 2468:
                if (strM6446c0.equals("MQ")) {
                    b = 142;
                }
                break;
            case 2469:
                if (strM6446c0.equals("MR")) {
                    b = 143;
                }
                break;
            case 2470:
                if (strM6446c0.equals("MS")) {
                    b = 144;
                }
                break;
            case 2471:
                if (strM6446c0.equals("MT")) {
                    b = 145;
                }
                break;
            case 2472:
                if (strM6446c0.equals("MU")) {
                    b = 146;
                }
                break;
            case 2473:
                if (strM6446c0.equals("MV")) {
                    b = 147;
                }
                break;
            case 2474:
                if (strM6446c0.equals("MW")) {
                    b = 148;
                }
                break;
            case 2475:
                if (strM6446c0.equals("MX")) {
                    b = 149;
                }
                break;
            case 2476:
                if (strM6446c0.equals("MY")) {
                    b = 150;
                }
                break;
            case 2477:
                if (strM6446c0.equals("MZ")) {
                    b = 151;
                }
                break;
            case 2483:
                if (strM6446c0.equals("NA")) {
                    b = 152;
                }
                break;
            case 2485:
                if (strM6446c0.equals("NC")) {
                    b = 153;
                }
                break;
            case 2487:
                if (strM6446c0.equals("NE")) {
                    b = 154;
                }
                break;
            case 2488:
                if (strM6446c0.equals("NF")) {
                    b = 155;
                }
                break;
            case 2489:
                if (strM6446c0.equals("NG")) {
                    b = 156;
                }
                break;
            case 2491:
                if (strM6446c0.equals("NI")) {
                    b = 157;
                }
                break;
            case 2494:
                if (strM6446c0.equals("NL")) {
                    b = 158;
                }
                break;
            case 2497:
                if (strM6446c0.equals("NO")) {
                    b = 159;
                }
                break;
            case 2498:
                if (strM6446c0.equals("NP")) {
                    b = 160;
                }
                break;
            case 2500:
                if (strM6446c0.equals("NR")) {
                    b = 161;
                }
                break;
            case 2503:
                if (strM6446c0.equals("NU")) {
                    b = 162;
                }
                break;
            case 2508:
                if (strM6446c0.equals("NZ")) {
                    b = 163;
                }
                break;
            case 2526:
                if (strM6446c0.equals("OM")) {
                    b = 164;
                }
                break;
            case 2545:
                if (strM6446c0.equals("PA")) {
                    b = 165;
                }
                break;
            case 2549:
                if (strM6446c0.equals("PE")) {
                    b = 166;
                }
                break;
            case 2550:
                if (strM6446c0.equals("PF")) {
                    b = 167;
                }
                break;
            case 2551:
                if (strM6446c0.equals("PG")) {
                    b = 168;
                }
                break;
            case 2552:
                if (strM6446c0.equals("PH")) {
                    b = 169;
                }
                break;
            case 2555:
                if (strM6446c0.equals("PK")) {
                    b = 170;
                }
                break;
            case 2556:
                if (strM6446c0.equals("PL")) {
                    b = 171;
                }
                break;
            case 2557:
                if (strM6446c0.equals("PM")) {
                    b = 172;
                }
                break;
            case 2562:
                if (strM6446c0.equals("PR")) {
                    b = 173;
                }
                break;
            case 2563:
                if (strM6446c0.equals("PS")) {
                    b = 174;
                }
                break;
            case 2564:
                if (strM6446c0.equals("PT")) {
                    b = 175;
                }
                break;
            case 2567:
                if (strM6446c0.equals("PW")) {
                    b = 176;
                }
                break;
            case 2569:
                if (strM6446c0.equals("PY")) {
                    b = 177;
                }
                break;
            case 2576:
                if (strM6446c0.equals("QA")) {
                    b = 178;
                }
                break;
            case 2611:
                if (strM6446c0.equals("RE")) {
                    b = 179;
                }
                break;
            case 2621:
                if (strM6446c0.equals("RO")) {
                    b = 180;
                }
                break;
            case 2625:
                if (strM6446c0.equals("RS")) {
                    b = 181;
                }
                break;
            case 2627:
                if (strM6446c0.equals("RU")) {
                    b = 182;
                }
                break;
            case 2629:
                if (strM6446c0.equals("RW")) {
                    b = 183;
                }
                break;
            case 2638:
                if (strM6446c0.equals("SA")) {
                    b = 184;
                }
                break;
            case 2639:
                if (strM6446c0.equals("SB")) {
                    b = 185;
                }
                break;
            case 2640:
                if (strM6446c0.equals("SC")) {
                    b = 186;
                }
                break;
            case 2641:
                if (strM6446c0.equals("SD")) {
                    b = 187;
                }
                break;
            case 2642:
                if (strM6446c0.equals("SE")) {
                    b = 188;
                }
                break;
            case 2644:
                if (strM6446c0.equals("SG")) {
                    b = 189;
                }
                break;
            case 2645:
                if (strM6446c0.equals("SH")) {
                    b = 190;
                }
                break;
            case 2646:
                if (strM6446c0.equals("SI")) {
                    b = 191;
                }
                break;
            case 2647:
                if (strM6446c0.equals("SJ")) {
                    b = DerValue.TAG_PRIVATE;
                }
                break;
            case 2648:
                if (strM6446c0.equals("SK")) {
                    b = 193;
                }
                break;
            case 2649:
                if (strM6446c0.equals("SL")) {
                    b = 194;
                }
                break;
            case 2650:
                if (strM6446c0.equals("SM")) {
                    b = 195;
                }
                break;
            case 2651:
                if (strM6446c0.equals("SN")) {
                    b = 196;
                }
                break;
            case 2652:
                if (strM6446c0.equals("SO")) {
                    b = 197;
                }
                break;
            case 2655:
                if (strM6446c0.equals("SR")) {
                    b = 198;
                }
                break;
            case 2656:
                if (strM6446c0.equals("SS")) {
                    b = 199;
                }
                break;
            case 2657:
                if (strM6446c0.equals("ST")) {
                    b = 200;
                }
                break;
            case 2659:
                if (strM6446c0.equals("SV")) {
                    b = 201;
                }
                break;
            case 2661:
                if (strM6446c0.equals("SX")) {
                    b = 202;
                }
                break;
            case 2662:
                if (strM6446c0.equals("SY")) {
                    b = 203;
                }
                break;
            case 2663:
                if (strM6446c0.equals("SZ")) {
                    b = 204;
                }
                break;
            case 2671:
                if (strM6446c0.equals("TC")) {
                    b = 205;
                }
                break;
            case 2672:
                if (strM6446c0.equals("TD")) {
                    b = 206;
                }
                break;
            case 2675:
                if (strM6446c0.equals("TG")) {
                    b = 207;
                }
                break;
            case 2676:
                if (strM6446c0.equals("TH")) {
                    b = 208;
                }
                break;
            case 2678:
                if (strM6446c0.equals("TJ")) {
                    b = 209;
                }
                break;
            case 2680:
                if (strM6446c0.equals("TL")) {
                    b = 210;
                }
                break;
            case 2681:
                if (strM6446c0.equals("TM")) {
                    b = 211;
                }
                break;
            case 2682:
                if (strM6446c0.equals("TN")) {
                    b = 212;
                }
                break;
            case 2683:
                if (strM6446c0.equals("TO")) {
                    b = 213;
                }
                break;
            case 2686:
                if (strM6446c0.equals("TR")) {
                    b = 214;
                }
                break;
            case 2688:
                if (strM6446c0.equals("TT")) {
                    b = 215;
                }
                break;
            case 2690:
                if (strM6446c0.equals("TV")) {
                    b = 216;
                }
                break;
            case 2691:
                if (strM6446c0.equals("TW")) {
                    b = 217;
                }
                break;
            case 2694:
                if (strM6446c0.equals("TZ")) {
                    b = 218;
                }
                break;
            case 2700:
                if (strM6446c0.equals("UA")) {
                    b = 219;
                }
                break;
            case 2706:
                if (strM6446c0.equals("UG")) {
                    b = 220;
                }
                break;
            case 2718:
                if (strM6446c0.equals("US")) {
                    b = 221;
                }
                break;
            case 2724:
                if (strM6446c0.equals("UY")) {
                    b = 222;
                }
                break;
            case 2725:
                if (strM6446c0.equals("UZ")) {
                    b = 223;
                }
                break;
            case 2731:
                if (strM6446c0.equals("VA")) {
                    b = 224;
                }
                break;
            case 2733:
                if (strM6446c0.equals("VC")) {
                    b = 225;
                }
                break;
            case 2735:
                if (strM6446c0.equals("VE")) {
                    b = 226;
                }
                break;
            case 2737:
                if (strM6446c0.equals("VG")) {
                    b = 227;
                }
                break;
            case 2739:
                if (strM6446c0.equals("VI")) {
                    b = 228;
                }
                break;
            case 2744:
                if (strM6446c0.equals("VN")) {
                    b = 229;
                }
                break;
            case 2751:
                if (strM6446c0.equals("VU")) {
                    b = 230;
                }
                break;
            case 2767:
                if (strM6446c0.equals("WF")) {
                    b = 231;
                }
                break;
            case 2780:
                if (strM6446c0.equals("WS")) {
                    b = 232;
                }
                break;
            case 2803:
                if (strM6446c0.equals("XK")) {
                    b = 233;
                }
                break;
            case 2828:
                if (strM6446c0.equals("YE")) {
                    b = 234;
                }
                break;
            case 2843:
                if (strM6446c0.equals("YT")) {
                    b = 235;
                }
                break;
            case 2855:
                if (strM6446c0.equals("ZA")) {
                    b = 236;
                }
                break;
            case 2867:
                if (strM6446c0.equals("ZM")) {
                    b = 237;
                }
                break;
            case 2877:
                if (strM6446c0.equals("ZW")) {
                    b = 238;
                }
                break;
        }
        switch (b) {
            case 0:
            case 4:
            case 17:
            case 29:
            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
            case 57:
            case 113:
            case 116:
            case 202:
            case 225:
                iArr = new int[]{1, 2, 0, 0, 2, 2};
                break;
            case 1:
                iArr = new int[]{1, 4, 2, 3, 4, 1};
                break;
            case 2:
            case 204:
                iArr = new int[]{4, 4, 3, 4, 2, 2};
                break;
            case 3:
            case 41:
                iArr = new int[]{2, 4, 3, 4, 2, 2};
                break;
            case 5:
                iArr = new int[]{1, 1, 1, 2, 2, 2};
                break;
            case 6:
            case 165:
                iArr = new int[]{2, 3, 2, 3, 2, 2};
                break;
            case 7:
                iArr = new int[]{3, 4, 4, 3, 2, 2};
                break;
            case 8:
            case 63:
            case 162:
            case 186:
            case 190:
                iArr = new int[]{4, 2, 2, 2, 2, 2};
                break;
            case 9:
                iArr = new int[]{2, 2, 2, 2, 1, 2};
                break;
            case 10:
                iArr = new int[]{2, 2, 3, 3, 2, 2};
                break;
            case 11:
            case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
            case 93:
            case LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY /* 102 */:
            case 127:
            case 145:
            case 188:
                iArr = new int[]{0, 0, 0, 0, 0, 2};
                break;
            case 12:
                iArr = new int[]{0, 3, 1, 1, 3, 0};
                break;
            case 13:
                iArr = new int[]{2, 2, 3, 4, 2, 2};
                break;
            case 14:
            case 51:
            case 121:
            case 144:
            case 172:
            case 195:
            case 224:
                iArr = new int[]{0, 2, 2, 2, 2, 2};
                break;
            case 15:
            case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
            case 128:
            case 194:
                iArr = new int[]{4, 2, 3, 3, 2, 2};
                break;
            case 16:
            case 106:
            case 214:
                iArr = new int[]{1, 1, 1, 1, 2, 2};
                break;
            case 18:
                iArr = new int[]{2, 1, 3, 2, 4, 2};
                break;
            case 19:
                iArr = new int[]{0, 0, 1, 0, 1, 2};
                break;
            case 20:
            case 187:
            case 203:
            case 206:
                iArr = new int[]{4, 3, 4, 4, 2, 2};
                break;
            case 21:
            case 175:
            case 191:
                iArr = new int[]{0, 0, 0, 0, 1, 2};
                break;
            case 22:
                iArr = new int[]{1, 3, 1, 3, 4, 2};
                break;
            case 23:
            case 84:
            case 92:
            case 154:
            case 226:
            case 234:
                iArr = new int[]{4, 4, 4, 4, 2, 2};
                break;
            case 24:
                iArr = new int[]{4, 4, 2, 3, 2, 2};
                break;
            case 25:
            case 141:
            case 177:
                iArr = new int[]{1, 2, 2, 2, 2, 2};
                break;
            case InjectionMetrics.I_MAX_ACTIVE_REJ /* 26 */:
                iArr = new int[]{0, 2, 0, 0, 2, 2};
                break;
            case InjectionMetrics.I_TAP_ID_EXHAUST /* 27 */:
                iArr = new int[]{3, 2, 0, 0, 2, 2};
                break;
            case InjectionMetrics.I_AIM_LOOP_TICKS /* 28 */:
                iArr = new int[]{1, 2, 4, 4, 2, 2};
                break;
            case 30:
                iArr = new int[]{1, 1, 1, 1, 2, 4};
                break;
            case InjectionMetrics.I_APPLY_DELTA /* 31 */:
                iArr = new int[]{3, 2, 1, 1, 2, 2};
                break;
            case 32:
                iArr = new int[]{3, 1, 2, 2, 3, 2};
                break;
            case InjectionMetrics.I_KEY_EVENTS /* 33 */:
                iArr = new int[]{3, 2, 1, 0, 2, 2};
                break;
            case InjectionMetrics.I_TOQUES_ATIVOS /* 34 */:
                iArr = new int[]{1, 2, 3, 3, 2, 2};
                break;
            case InjectionMetrics.SNAPSHOT_LEN /* 35 */:
            case LinuxInputConstants.KEY_LEFTSHIFT /* 42 */:
                iArr = new int[]{2, 2, 2, 1, 2, 2};
                break;
            case 36:
            case 219:
                iArr = new int[]{0, 2, 1, 2, 3, 3};
                break;
            case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
            case 137:
                iArr = new int[]{3, 3, 2, 2, 2, 2};
                break;
            case 38:
                iArr = new int[]{4, 2, 4, 2, 2, 2};
                break;
            case BuildConfig.VERSION_CODE /* 39 */:
            case 62:
            case 134:
                iArr = new int[]{3, 4, 3, 3, 2, 2};
                break;
            case 40:
                iArr = new int[]{0, 1, 0, 0, 0, 2};
                break;
            case 43:
            case 208:
                iArr = new int[]{0, 1, 2, 2, 2, 2};
                break;
            case 44:
            case 143:
                iArr = new int[]{4, 3, 3, 4, 2, 2};
                break;
            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                iArr = new int[]{2, 0, 1, 1, 3, 1};
                break;
            case 46:
                iArr = new int[]{2, 3, 3, 2, 2, 2};
                break;
            case LinuxInputConstants.ABS_MT_SLOT /* 47 */:
            case 157:
                iArr = new int[]{2, 4, 4, 4, 2, 2};
                break;
            case 48:
            case 111:
            case 161:
            case 210:
                iArr = new int[]{4, 2, 4, 4, 2, 2};
                break;
            case 49:
                iArr = new int[]{2, 3, 0, 1, 2, 2};
                break;
            case 52:
                iArr = new int[]{1, 0, 1, 0, 0, 2};
                break;
            case 53:
                iArr = new int[]{0, 0, 2, 0, 1, 2};
                break;
            case LinuxInputConstants.ABS_MT_POSITION_Y /* 54 */:
                iArr = new int[]{0, 1, 4, 2, 2, 1};
                break;
            case 56:
                iArr = new int[]{0, 0, 2, 0, 0, 2};
                break;
            case 58:
            case 123:
                iArr = new int[]{3, 4, 4, 4, 2, 2};
                break;
            case LinuxInputConstants.KEY_F1 /* 59 */:
            case 209:
                iArr = new int[]{3, 3, 4, 4, 2, 2};
                break;
            case 60:
                iArr = new int[]{1, 3, 2, 1, 2, 2};
                break;
            case 64:
                iArr = new int[]{0, 0, 0, 0, 1, 0};
                break;
            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                iArr = new int[]{4, 3, 4, 4, 4, 2};
                break;
            case 66:
                iArr = new int[]{0, 0, 0, 1, 0, 2};
                break;
            case 67:
                iArr = new int[]{3, 2, 2, 3, 2, 2};
                break;
            case 68:
            case 155:
            case 192:
                iArr = new int[]{3, 2, 2, 2, 2, 2};
                break;
            case 69:
                iArr = new int[]{4, 2, 4, 0, 2, 2};
                break;
            case LinuxInputConstants.KEY_F12 /* 70 */:
                iArr = new int[]{0, 2, 2, 0, 2, 2};
                break;
            case 71:
                iArr = new int[]{1, 1, 1, 1, 0, 2};
                break;
            case 72:
                iArr = new int[]{3, 4, 0, 0, 2, 2};
                break;
            case 73:
                iArr = new int[]{1, 1, 3, 2, 2, 2};
                break;
            case 74:
                iArr = new int[]{2, 2, 0, 0, 2, 2};
                break;
            case 75:
                iArr = new int[]{1, 1, 0, 2, 2, 2};
                break;
            case 76:
                iArr = new int[]{3, 2, 3, 3, 2, 2};
                break;
            case 77:
                iArr = new int[]{0, 2, 1, 1, 2, 2};
                break;
            case 78:
                iArr = new int[]{3, 3, 3, 2, 2, 2};
                break;
            case 79:
            case 97:
            case LocationRequest.PRIORITY_LOW_POWER /* 104 */:
                iArr = new int[]{0, 2, 0, 1, 2, 2};
                break;
            case 80:
            case 130:
                iArr = new int[]{1, 2, 2, 0, 2, 2};
                break;
            case 81:
            case 199:
                iArr = new int[]{4, 3, 2, 4, 2, 2};
                break;
            case 82:
                iArr = new int[]{3, 4, 4, 2, 2, 2};
                break;
            case 83:
                iArr = new int[]{2, 1, 1, 3, 2, 2};
                break;
            case 85:
                iArr = new int[]{1, 0, 0, 0, 1, 2};
                break;
            case 86:
                iArr = new int[]{2, 1, 2, 1, 2, 2};
                break;
            case 87:
                iArr = new int[]{2, 2, 4, 3, 3, 2};
                break;
            case 88:
                iArr = new int[]{4, 4, 1, 2, 2, 2};
                break;
            case 89:
                iArr = new int[]{3, 1, 1, 3, 2, 2};
                break;
            case 90:
                iArr = new int[]{0, 1, 0, 1, 1, 0};
                break;
            case 91:
            case 115:
                iArr = new int[]{1, 0, 0, 0, 0, 2};
                break;
            case 94:
                iArr = new int[]{3, 1, 3, 3, 2, 4};
                break;
            case 95:
                iArr = new int[]{1, 1, 1, 1, 1, 2};
                break;
            case 96:
                iArr = new int[]{1, 2, 2, 3, 4, 2};
                break;
            case 98:
                iArr = new int[]{1, 1, 3, 2, 2, 3};
                break;
            case 99:
                iArr = new int[]{3, 2, 2, 0, 2, 2};
                break;
            case 100:
                iArr = new int[]{3, 2, 3, 2, 2, 2};
                break;
            case 101:
                iArr = new int[]{4, 2, 3, 3, 4, 3};
                break;
            case 103:
                iArr = new int[]{0, 1, 1, 2, 1, 2};
                break;
            case LocationRequest.PRIORITY_NO_POWER /* 105 */:
                iArr = new int[]{2, 4, 3, 1, 2, 2};
                break;
            case 107:
                iArr = new int[]{0, 3, 2, 3, 4, 2};
                break;
            case 108:
                iArr = new int[]{3, 2, 1, 1, 1, 2};
                break;
            case 109:
                iArr = new int[]{2, 1, 1, 2, 2, 2};
                break;
            case 110:
                iArr = new int[]{1, 0, 4, 2, 2, 2};
                break;
            case 112:
            case 230:
                iArr = new int[]{4, 3, 3, 2, 2, 2};
                break;
            case 114:
                iArr = new int[]{0, 2, 2, 4, 4, 4};
                break;
            case 117:
                iArr = new int[]{2, 1, 2, 2, 3, 2};
                break;
            case 118:
                iArr = new int[]{1, 2, 1, 3, 2, 2};
                break;
            case 119:
                iArr = new int[]{3, 1, 1, 2, 2, 2};
                break;
            case 120:
                iArr = new int[]{2, 2, 1, 1, 2, 2};
                break;
            case 122:
            case 138:
                iArr = new int[]{3, 2, 3, 3, 4, 2};
                break;
            case 124:
            case 168:
                iArr = new int[]{4, 3, 3, 3, 2, 2};
                break;
            case 125:
                iArr = new int[]{0, 1, 0, 1, 0, 2};
                break;
            case 126:
                iArr = new int[]{4, 0, 3, 2, 1, 3};
                break;
            case 129:
                iArr = new int[]{3, 3, 1, 1, 2, 2};
                break;
            case 131:
                iArr = new int[]{1, 0, 0, 0, 2, 2};
                break;
            case 132:
                iArr = new int[]{2, 0, 0, 1, 3, 2};
                break;
            case 133:
                iArr = new int[]{1, 2, 2, 3, 2, 2};
                break;
            case 135:
            case 211:
            case 216:
            case 231:
                iArr = new int[]{4, 2, 2, 4, 2, 2};
                break;
            case 136:
                iArr = new int[]{1, 0, 0, 1, 3, 2};
                break;
            case 139:
                iArr = new int[]{2, 0, 2, 2, 2, 2};
                break;
            case 140:
                iArr = new int[]{0, 2, 4, 4, 3, 1};
                break;
            case 142:
                iArr = new int[]{2, 1, 2, 3, 2, 2};
                break;
            case 146:
                iArr = new int[]{3, 1, 0, 2, 2, 2};
                break;
            case 147:
                iArr = new int[]{3, 2, 1, 3, 4, 2};
                break;
            case 148:
                iArr = new int[]{3, 2, 2, 1, 2, 2};
                break;
            case 149:
                iArr = new int[]{2, 4, 4, 4, 3, 2};
                break;
            case 150:
                iArr = new int[]{1, 0, 4, 1, 1, 0};
                break;
            case 151:
            case 232:
                iArr = new int[]{3, 1, 2, 2, 2, 2};
                break;
            case 152:
                iArr = new int[]{3, 4, 3, 2, 2, 2};
                break;
            case 153:
            case 235:
                iArr = new int[]{2, 3, 3, 4, 2, 2};
                break;
            case 156:
                iArr = new int[]{3, 4, 2, 1, 2, 2};
                break;
            case 158:
                iArr = new int[]{2, 1, 4, 3, 0, 4};
                break;
            case 159:
                iArr = new int[]{0, 0, 3, 0, 0, 2};
                break;
            case 160:
                iArr = new int[]{2, 2, 4, 3, 2, 2};
                break;
            case 163:
                iArr = new int[]{0, 0, 1, 2, 4, 2};
                break;
            case 164:
                iArr = new int[]{2, 3, 1, 2, 4, 2};
                break;
            case 166:
                iArr = new int[]{1, 2, 4, 4, 3, 2};
                break;
            case 167:
                iArr = new int[]{2, 2, 3, 1, 2, 2};
                break;
            case 169:
                iArr = new int[]{2, 1, 2, 3, 2, 1};
                break;
            case 170:
                iArr = new int[]{3, 3, 3, 3, 2, 2};
                break;
            case 171:
                iArr = new int[]{1, 0, 2, 2, 4, 4};
                break;
            case 173:
                iArr = new int[]{2, 0, 2, 1, 2, 0};
                break;
            case 174:
                iArr = new int[]{3, 4, 1, 3, 2, 2};
                break;
            case 176:
                iArr = new int[]{2, 2, 4, 1, 2, 2};
                break;
            case 178:
                iArr = new int[]{1, 4, 4, 4, 4, 2};
                break;
            case 179:
                iArr = new int[]{0, 3, 2, 3, 1, 2};
                break;
            case 180:
                iArr = new int[]{0, 0, 1, 1, 3, 2};
                break;
            case 181:
                iArr = new int[]{1, 0, 0, 1, 2, 2};
                break;
            case 182:
                iArr = new int[]{1, 0, 0, 1, 3, 3};
                break;
            case 183:
                iArr = new int[]{3, 3, 2, 0, 2, 2};
                break;
            case 184:
                iArr = new int[]{3, 1, 1, 2, 2, 0};
                break;
            case 185:
            case 238:
                iArr = new int[]{4, 2, 4, 3, 2, 2};
                break;
            case 189:
                iArr = new int[]{2, 3, 3, 3, 1, 1};
                break;
            case 193:
                iArr = new int[]{0, 1, 1, 1, 2, 2};
                break;
            case 196:
                iArr = new int[]{4, 4, 3, 2, 2, 2};
                break;
            case 197:
                iArr = new int[]{2, 2, 3, 4, 4, 2};
                break;
            case 198:
                iArr = new int[]{2, 4, 4, 1, 2, 2};
                break;
            case 200:
                iArr = new int[]{2, 2, 1, 2, 2, 2};
                break;
            case 201:
                iArr = new int[]{2, 3, 2, 1, 2, 2};
                break;
            case 205:
                iArr = new int[]{3, 2, 1, 2, 2, 2};
                break;
            case 207:
                iArr = new int[]{3, 4, 1, 0, 2, 2};
                break;
            case 212:
                iArr = new int[]{3, 1, 1, 1, 2, 2};
                break;
            case 213:
                iArr = new int[]{3, 2, 4, 3, 2, 2};
                break;
            case 215:
                iArr = new int[]{2, 4, 1, 0, 2, 2};
                break;
            case 217:
                iArr = new int[]{0, 0, 0, 0, 0, 0};
                break;
            case 218:
                iArr = new int[]{3, 4, 2, 1, 3, 2};
                break;
            case 220:
                iArr = new int[]{3, 3, 2, 3, 4, 2};
                break;
            case 221:
                iArr = new int[]{2, 2, 4, 1, 3, 1};
                break;
            case 222:
                iArr = new int[]{2, 1, 1, 2, 1, 2};
                break;
            case 223:
                iArr = new int[]{1, 2, 3, 4, 3, 2};
                break;
            case 227:
                iArr = new int[]{2, 2, 1, 1, 2, 4};
                break;
            case 228:
                iArr = new int[]{0, 2, 1, 2, 2, 2};
                break;
            case 229:
                iArr = new int[]{0, 0, 1, 2, 2, 2};
                break;
            case 233:
                iArr = new int[]{1, 2, 1, 1, 2, 2};
                break;
            case 236:
                iArr = new int[]{2, 4, 2, 1, 1, 2};
                break;
            case 237:
                iArr = new int[]{4, 4, 4, 3, 2, 2};
                break;
            default:
                iArr = new int[]{2, 2, 2, 2, 2, 2};
                break;
        }
        HashMap map = new HashMap(8);
        map.put(0, 1000000L);
        kk1 kk1Var2 = C1534vy.f11837n;
        map.put(2, (Long) kk1Var2.get(iArr[0]));
        map.put(3, (Long) C1534vy.f11838o.get(iArr[1]));
        map.put(4, (Long) C1534vy.f11839p.get(iArr[2]));
        map.put(5, (Long) C1534vy.f11840q.get(iArr[3]));
        map.put(10, (Long) C1534vy.f11841r.get(iArr[4]));
        map.put(9, (Long) C1534vy.f11842s.get(iArr[5]));
        map.put(7, (Long) kk1Var2.get(iArr[0]));
        this.f11451b = map;
        this.f11452c = 2000;
        this.f11453d = xy1.f12780a;
        this.f11454e = true;
    }
}
