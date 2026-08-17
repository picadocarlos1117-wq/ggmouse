package p000;

import android.text.TextUtils;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.github.muntashirakon.adb.PairingConnectionCtx;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class be0 {

    /* JADX INFO: renamed from: A */
    public final int f1315A;

    /* JADX INFO: renamed from: B */
    public final C1673zp f1316B;

    /* JADX INFO: renamed from: C */
    public final int f1317C;

    /* JADX INFO: renamed from: D */
    public final int f1318D;

    /* JADX INFO: renamed from: E */
    public final int f1319E;

    /* JADX INFO: renamed from: F */
    public final int f1320F;

    /* JADX INFO: renamed from: G */
    public final int f1321G;

    /* JADX INFO: renamed from: H */
    public final int f1322H;

    /* JADX INFO: renamed from: I */
    public final int f1323I;

    /* JADX INFO: renamed from: J */
    public final int f1324J;

    /* JADX INFO: renamed from: K */
    public final int f1325K;

    /* JADX INFO: renamed from: L */
    public final int f1326L;

    /* JADX INFO: renamed from: M */
    public int f1327M;

    /* JADX INFO: renamed from: a */
    public final String f1328a;

    /* JADX INFO: renamed from: b */
    public final String f1329b;

    /* JADX INFO: renamed from: c */
    public final qm0 f1330c;

    /* JADX INFO: renamed from: d */
    public final String f1331d;

    /* JADX INFO: renamed from: e */
    public final int f1332e;

    /* JADX INFO: renamed from: f */
    public final int f1333f;

    /* JADX INFO: renamed from: g */
    public final int f1334g;

    /* JADX INFO: renamed from: h */
    public final int f1335h;

    /* JADX INFO: renamed from: i */
    public final int f1336i;

    /* JADX INFO: renamed from: j */
    public final int f1337j;

    /* JADX INFO: renamed from: k */
    public final String f1338k;

    /* JADX INFO: renamed from: l */
    public final k51 f1339l;

    /* JADX INFO: renamed from: m */
    public final String f1340m;

    /* JADX INFO: renamed from: n */
    public final String f1341n;

    /* JADX INFO: renamed from: o */
    public final int f1342o;

    /* JADX INFO: renamed from: p */
    public final int f1343p;

    /* JADX INFO: renamed from: q */
    public final List f1344q;

    /* JADX INFO: renamed from: r */
    public final z30 f1345r;

    /* JADX INFO: renamed from: s */
    public final long f1346s;

    /* JADX INFO: renamed from: t */
    public final boolean f1347t;

    /* JADX INFO: renamed from: u */
    public final int f1348u;

    /* JADX INFO: renamed from: v */
    public final int f1349v;

    /* JADX INFO: renamed from: w */
    public final float f1350w;

    /* JADX INFO: renamed from: x */
    public final int f1351x;

    /* JADX INFO: renamed from: y */
    public final float f1352y;

    /* JADX INFO: renamed from: z */
    public final byte[] f1353z;

    static {
        new be0(new ae0());
        z42.m7252z(0);
        z42.m7252z(1);
        z42.m7252z(2);
        z42.m7252z(3);
        z42.m7252z(4);
        AbstractC1308pu.m5349p(5, 6, 7, 8, 9);
        AbstractC1308pu.m5349p(10, 11, 12, 13, 14);
        AbstractC1308pu.m5349p(15, 16, 17, 18, 19);
        AbstractC1308pu.m5349p(20, 21, 22, 23, 24);
        AbstractC1308pu.m5349p(25, 26, 27, 28, 29);
        z42.m7252z(30);
        z42.m7252z(31);
        z42.m7252z(32);
        z42.m7252z(33);
    }

    public be0(ae0 ae0Var) {
        boolean z;
        String str;
        this.f1328a = ae0Var.f185a;
        String strM7217E = z42.m7217E(ae0Var.f188d);
        this.f1331d = strM7217E;
        if (ae0Var.f187c.isEmpty() && ae0Var.f186b != null) {
            this.f1330c = qm0.m5570t(new nr0(strM7217E, ae0Var.f186b));
            this.f1329b = ae0Var.f186b;
        } else if (ae0Var.f187c.isEmpty() || ae0Var.f186b != null) {
            if (!ae0Var.f187c.isEmpty() || ae0Var.f186b != null) {
                int i = 0;
                while (true) {
                    if (i >= ae0Var.f187c.size()) {
                        z = false;
                        break;
                    } else {
                        if (((nr0) ae0Var.f187c.get(i)).f7511b.equals(ae0Var.f186b)) {
                            z = true;
                            break;
                        }
                        i++;
                    }
                }
            } else {
                z = true;
                break;
            }
            ki0.m3864h(z);
            this.f1330c = ae0Var.f187c;
            this.f1329b = ae0Var.f186b;
        } else {
            qm0 qm0Var = ae0Var.f187c;
            this.f1330c = qm0Var;
            int size = qm0Var.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    str = ((nr0) qm0Var.get(0)).f7511b;
                    break;
                }
                Object obj = qm0Var.get(i2);
                i2++;
                nr0 nr0Var = (nr0) obj;
                if (TextUtils.equals(nr0Var.f7510a, strM7217E)) {
                    str = nr0Var.f7511b;
                    break;
                }
            }
            this.f1329b = str;
        }
        this.f1332e = ae0Var.f189e;
        ki0.m3865i(ae0Var.f191g == 0 || (ae0Var.f190f & 32768) != 0, "Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set");
        this.f1333f = ae0Var.f190f;
        this.f1334g = ae0Var.f191g;
        int i3 = ae0Var.f192h;
        this.f1335h = i3;
        int i4 = ae0Var.f193i;
        this.f1336i = i4;
        this.f1337j = i4 != -1 ? i4 : i3;
        this.f1338k = ae0Var.f194j;
        this.f1339l = ae0Var.f195k;
        this.f1340m = ae0Var.f196l;
        this.f1341n = ae0Var.f197m;
        this.f1342o = ae0Var.f198n;
        this.f1343p = ae0Var.f199o;
        List list = ae0Var.f200p;
        this.f1344q = list == null ? Collections.EMPTY_LIST : list;
        z30 z30Var = ae0Var.f201q;
        this.f1345r = z30Var;
        this.f1346s = ae0Var.f202r;
        this.f1347t = ae0Var.f203s;
        this.f1348u = ae0Var.f204t;
        this.f1349v = ae0Var.f205u;
        this.f1350w = ae0Var.f206v;
        int i5 = ae0Var.f207w;
        this.f1351x = i5 == -1 ? 0 : i5;
        float f = ae0Var.f208x;
        this.f1352y = f == -1.0f ? 1.0f : f;
        this.f1353z = ae0Var.f209y;
        this.f1315A = ae0Var.f210z;
        this.f1316B = ae0Var.f174A;
        this.f1317C = ae0Var.f175B;
        this.f1318D = ae0Var.f176C;
        this.f1319E = ae0Var.f177D;
        int i6 = ae0Var.f178E;
        this.f1320F = i6 == -1 ? 0 : i6;
        int i7 = ae0Var.f179F;
        this.f1321G = i7 != -1 ? i7 : 0;
        this.f1322H = ae0Var.f180G;
        this.f1323I = ae0Var.f181H;
        this.f1324J = ae0Var.f182I;
        this.f1325K = ae0Var.f183J;
        int i8 = ae0Var.f184K;
        if (i8 != 0 || z30Var == null) {
            this.f1326L = i8;
        } else {
            this.f1326L = 1;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m968c(be0 be0Var) {
        int i;
        String str;
        String str2;
        String str3;
        if (be0Var == null) {
            return "null";
        }
        int i2 = be0Var.f1332e;
        qm0 qm0Var = be0Var.f1330c;
        String str4 = be0Var.f1331d;
        int i3 = be0Var.f1318D;
        int i4 = be0Var.f1317C;
        float f = be0Var.f1350w;
        C1673zp c1673zp = be0Var.f1316B;
        float f2 = be0Var.f1352y;
        int i5 = be0Var.f1349v;
        int i6 = be0Var.f1348u;
        z30 z30Var = be0Var.f1345r;
        String str5 = be0Var.f1338k;
        int i7 = be0Var.f1337j;
        String str6 = be0Var.f1340m;
        int i8 = be0Var.f1333f;
        C0101bj c0101bj = new C0101bj(String.valueOf(','));
        StringBuilder sbM5344k = AbstractC1308pu.m5344k("id=");
        sbM5344k.append(be0Var.f1328a);
        sbM5344k.append(", mimeType=");
        sbM5344k.append(be0Var.f1341n);
        if (str6 != null) {
            sbM5344k.append(", container=");
            sbM5344k.append(str6);
        }
        int i9 = -1;
        if (i7 != -1) {
            sbM5344k.append(", bitrate=");
            sbM5344k.append(i7);
        }
        if (str5 != null) {
            sbM5344k.append(", codecs=");
            sbM5344k.append(str5);
        }
        if (z30Var != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i10 = 0;
            while (i10 < z30Var.f13253d) {
                UUID uuid = z30Var.f13250a[i10].f12824b;
                if (uuid.equals(AbstractC0794jk.f5434b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(AbstractC0794jk.f5435c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(AbstractC0794jk.f5437e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(AbstractC0794jk.f5436d)) {
                    linkedHashSet.add("widevine");
                } else {
                    if (uuid.equals(AbstractC0794jk.f5433a)) {
                        linkedHashSet.add("universal");
                    } else {
                        linkedHashSet.add("unknown (" + uuid + ")");
                    }
                    i10++;
                    z30Var = z30Var;
                }
                i10++;
                z30Var = z30Var;
            }
            sbM5344k.append(", drm=[");
            c0101bj.m996a(sbM5344k, linkedHashSet.iterator());
            sbM5344k.append(']');
            i9 = -1;
        }
        if (i6 != i9 && i5 != i9) {
            sbM5344k.append(", res=");
            sbM5344k.append(i6);
            sbM5344k.append("x");
            sbM5344k.append(i5);
        }
        double d = f2;
        int i11 = t30.f10734a;
        if (Math.copySign(d - 1.0d, 1.0d) > 0.001d && d != 1.0d && (!Double.isNaN(d) || !Double.isNaN(1.0d))) {
            sbM5344k.append(", par=");
            Object[] objArr = {Float.valueOf(f2)};
            int i12 = z42.f13274a;
            sbM5344k.append(String.format(Locale.US, "%.3f", objArr));
        }
        if (c1673zp != null) {
            int i13 = c1673zp.f13518f;
            int i14 = c1673zp.f13517e;
            if ((i14 != -1 && i13 != -1) || c1673zp.m7331d()) {
                sbM5344k.append(", color=");
                if (c1673zp.m7331d()) {
                    String strM7326b = C1673zp.m7326b(c1673zp.f13513a);
                    String strM7325a = C1673zp.m7325a(c1673zp.f13514b);
                    String strM7327c = C1673zp.m7327c(c1673zp.f13515c);
                    Locale locale = Locale.US;
                    str2 = strM7326b + "/" + strM7325a + "/" + strM7327c;
                } else {
                    str2 = "NA/NA/NA";
                }
                if (i14 == -1 || i13 == -1) {
                    str3 = "NA/NA";
                } else {
                    str3 = i14 + "/" + i13;
                }
                sbM5344k.append(str2 + "/" + str3);
            }
        }
        if (f != -1.0f) {
            sbM5344k.append(", fps=");
            sbM5344k.append(f);
        }
        if (i4 != -1) {
            sbM5344k.append(", channels=");
            sbM5344k.append(i4);
        }
        if (i3 != -1) {
            sbM5344k.append(", sample_rate=");
            sbM5344k.append(i3);
        }
        if (str4 != null) {
            sbM5344k.append(", language=");
            sbM5344k.append(str4);
        }
        if (!qm0Var.isEmpty()) {
            sbM5344k.append(", labels=[");
            c0101bj.m996a(sbM5344k, AbstractC1337qm.m5540h0(qm0Var, new ca0(8)).iterator());
            sbM5344k.append("]");
        }
        if (i2 != 0) {
            sbM5344k.append(", selectionFlags=[");
            int i15 = z42.f13274a;
            ArrayList arrayList = new ArrayList();
            if ((i2 & 4) != 0) {
                arrayList.add(DebugKt.DEBUG_PROPERTY_VALUE_AUTO);
            }
            if ((i2 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i2 & 2) != 0) {
                arrayList.add("forced");
            }
            c0101bj.m996a(sbM5344k, arrayList.iterator());
            sbM5344k.append("]");
        }
        if (i8 != 0) {
            sbM5344k.append(", roleFlags=[");
            int i16 = z42.f13274a;
            ArrayList arrayList2 = new ArrayList();
            if ((i8 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i8 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i8 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i8 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i8 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i8 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i8 & 64) != 0) {
                arrayList2.add("caption");
            }
            i = i8;
            if ((i & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i & PairingConnectionCtx.PeerInfo.MAX_PEER_INFO_SIZE) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i & PairingConnectionCtx.PairingPacketHeader.MAX_PAYLOAD_SIZE) != 0) {
                arrayList2.add("trick-play");
            }
            if ((i & 32768) != 0) {
                arrayList2.add("auxiliary");
            }
            c0101bj.m996a(sbM5344k, arrayList2.iterator());
            sbM5344k.append("]");
        } else {
            i = i8;
        }
        if ((i & 32768) != 0) {
            sbM5344k.append(", auxiliaryTrackType=");
            int i17 = be0Var.f1334g;
            int i18 = z42.f13274a;
            if (i17 == 0) {
                str = "undefined";
            } else if (i17 == 1) {
                str = "original";
            } else if (i17 == 2) {
                str = "depth-linear";
            } else if (i17 == 3) {
                str = "depth-inverse";
            } else {
                if (i17 != 4) {
                    f40.m2719o("Unsupported auxiliary track type");
                    return null;
                }
                str = "depth metadata";
            }
            sbM5344k.append(str);
        }
        return sbM5344k.toString();
    }

    /* JADX INFO: renamed from: a */
    public final ae0 m969a() {
        ae0 ae0Var = new ae0();
        ae0Var.f185a = this.f1328a;
        ae0Var.f186b = this.f1329b;
        ae0Var.f187c = this.f1330c;
        ae0Var.f188d = this.f1331d;
        ae0Var.f189e = this.f1332e;
        ae0Var.f190f = this.f1333f;
        ae0Var.f192h = this.f1335h;
        ae0Var.f193i = this.f1336i;
        ae0Var.f194j = this.f1338k;
        ae0Var.f195k = this.f1339l;
        ae0Var.f196l = this.f1340m;
        ae0Var.f197m = this.f1341n;
        ae0Var.f198n = this.f1342o;
        ae0Var.f199o = this.f1343p;
        ae0Var.f200p = this.f1344q;
        ae0Var.f201q = this.f1345r;
        ae0Var.f202r = this.f1346s;
        ae0Var.f203s = this.f1347t;
        ae0Var.f204t = this.f1348u;
        ae0Var.f205u = this.f1349v;
        ae0Var.f206v = this.f1350w;
        ae0Var.f207w = this.f1351x;
        ae0Var.f208x = this.f1352y;
        ae0Var.f209y = this.f1353z;
        ae0Var.f210z = this.f1315A;
        ae0Var.f174A = this.f1316B;
        ae0Var.f175B = this.f1317C;
        ae0Var.f176C = this.f1318D;
        ae0Var.f177D = this.f1319E;
        ae0Var.f178E = this.f1320F;
        ae0Var.f179F = this.f1321G;
        ae0Var.f180G = this.f1322H;
        ae0Var.f181H = this.f1323I;
        ae0Var.f182I = this.f1324J;
        ae0Var.f183J = this.f1325K;
        ae0Var.f184K = this.f1326L;
        return ae0Var;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m970b(be0 be0Var) {
        List list = this.f1344q;
        if (list.size() != be0Var.f1344q.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) be0Var.f1344q.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || be0.class != obj.getClass()) {
            return false;
        }
        be0 be0Var = (be0) obj;
        int i2 = this.f1327M;
        return (i2 == 0 || (i = be0Var.f1327M) == 0 || i2 == i) && this.f1332e == be0Var.f1332e && this.f1333f == be0Var.f1333f && this.f1334g == be0Var.f1334g && this.f1335h == be0Var.f1335h && this.f1336i == be0Var.f1336i && this.f1342o == be0Var.f1342o && this.f1346s == be0Var.f1346s && this.f1348u == be0Var.f1348u && this.f1349v == be0Var.f1349v && this.f1351x == be0Var.f1351x && this.f1315A == be0Var.f1315A && this.f1317C == be0Var.f1317C && this.f1318D == be0Var.f1318D && this.f1319E == be0Var.f1319E && this.f1320F == be0Var.f1320F && this.f1321G == be0Var.f1321G && this.f1322H == be0Var.f1322H && this.f1324J == be0Var.f1324J && this.f1325K == be0Var.f1325K && this.f1326L == be0Var.f1326L && Float.compare(this.f1350w, be0Var.f1350w) == 0 && Float.compare(this.f1352y, be0Var.f1352y) == 0 && Objects.equals(this.f1328a, be0Var.f1328a) && Objects.equals(this.f1329b, be0Var.f1329b) && this.f1330c.equals(be0Var.f1330c) && Objects.equals(this.f1338k, be0Var.f1338k) && Objects.equals(this.f1340m, be0Var.f1340m) && Objects.equals(this.f1341n, be0Var.f1341n) && Objects.equals(this.f1331d, be0Var.f1331d) && Arrays.equals(this.f1353z, be0Var.f1353z) && Objects.equals(this.f1339l, be0Var.f1339l) && Objects.equals(this.f1316B, be0Var.f1316B) && Objects.equals(this.f1345r, be0Var.f1345r) && m970b(be0Var);
    }

    public final int hashCode() {
        if (this.f1327M == 0) {
            String str = this.f1328a;
            int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f1329b;
            int iHashCode2 = (this.f1330c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            String str3 = this.f1331d;
            int iHashCode3 = (((((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f1332e) * 31) + this.f1333f) * 31) + this.f1334g) * 31) + this.f1335h) * 31) + this.f1336i) * 31;
            String str4 = this.f1338k;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            k51 k51Var = this.f1339l;
            int iHashCode5 = (iHashCode4 + (k51Var == null ? 0 : k51Var.hashCode())) * 961;
            String str5 = this.f1340m;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f1341n;
            this.f1327M = ((((((((((((((((((((Float.floatToIntBits(this.f1352y) + ((((Float.floatToIntBits(this.f1350w) + ((((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f1342o) * 31) + ((int) this.f1346s)) * 31) + this.f1348u) * 31) + this.f1349v) * 31)) * 31) + this.f1351x) * 31)) * 31) + this.f1315A) * 31) + this.f1317C) * 31) + this.f1318D) * 31) + this.f1319E) * 31) + this.f1320F) * 31) + this.f1321G) * 31) + this.f1322H) * 31) + this.f1324J) * 31) + this.f1325K) * 31) + this.f1326L;
        }
        return this.f1327M;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.f1328a);
        sb.append(", ");
        sb.append(this.f1329b);
        sb.append(", ");
        sb.append(this.f1340m);
        sb.append(", ");
        sb.append(this.f1341n);
        sb.append(", ");
        sb.append(this.f1338k);
        sb.append(", ");
        sb.append(this.f1337j);
        sb.append(", ");
        sb.append(this.f1331d);
        sb.append(", [");
        sb.append(this.f1348u);
        sb.append(", ");
        sb.append(this.f1349v);
        sb.append(", ");
        sb.append(this.f1350w);
        sb.append(", ");
        sb.append(this.f1316B);
        sb.append("], [");
        sb.append(this.f1317C);
        sb.append(", ");
        return AbstractC1308pu.m5341h(sb, this.f1318D, "])");
    }
}
