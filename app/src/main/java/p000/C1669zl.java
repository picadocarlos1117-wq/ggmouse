package p000;

import android.sun.security.util.DerValue;
import com.example.ssmousepro.BuildConfig;
import com.example.ssmousepro.injection.InjectionProtocol;
import com.example.ssmousepro.injection.LinuxInputConstants;
import com.google.android.gms.location.LocationRequest;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: zl */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1669zl extends AbstractC0682gm {

    /* JADX INFO: renamed from: i */
    public final int f13461i;

    /* JADX INFO: renamed from: j */
    public final int f13462j;

    /* JADX INFO: renamed from: k */
    public final int f13463k;

    /* JADX INFO: renamed from: o */
    public List f13467o;

    /* JADX INFO: renamed from: p */
    public List f13468p;

    /* JADX INFO: renamed from: q */
    public int f13469q;

    /* JADX INFO: renamed from: r */
    public int f13470r;

    /* JADX INFO: renamed from: s */
    public boolean f13471s;

    /* JADX INFO: renamed from: t */
    public boolean f13472t;

    /* JADX INFO: renamed from: u */
    public byte f13473u;

    /* JADX INFO: renamed from: v */
    public byte f13474v;

    /* JADX INFO: renamed from: x */
    public boolean f13476x;

    /* JADX INFO: renamed from: y */
    public long f13477y;

    /* JADX INFO: renamed from: z */
    public static final int[] f13459z = {11, 1, 3, 12, 14, 5, 7, 9};

    /* JADX INFO: renamed from: A */
    public static final int[] f13452A = {0, 4, 8, 12, 16, 20, 24, 28};

    /* JADX INFO: renamed from: B */
    public static final int[] f13453B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* JADX INFO: renamed from: C */
    public static final int[] f13454C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, InjectionProtocol.MOUSE_POLL_HZ_PADRAO, 97, 98, 99, 100, 101, LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY, 103, LocationRequest.PRIORITY_LOW_POWER, LocationRequest.PRIORITY_NO_POWER, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* JADX INFO: renamed from: D */
    public static final int[] f13455D = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* JADX INFO: renamed from: E */
    public static final int[] f13456E = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};

    /* JADX INFO: renamed from: F */
    public static final int[] f13457F = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* JADX INFO: renamed from: G */
    public static final boolean[] f13458G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* JADX INFO: renamed from: h */
    public final dc1 f13460h = new dc1();

    /* JADX INFO: renamed from: m */
    public final ArrayList f13465m = new ArrayList();

    /* JADX INFO: renamed from: n */
    public C1632yl f13466n = new C1632yl(0, 4);

    /* JADX INFO: renamed from: w */
    public int f13475w = 0;

    /* JADX INFO: renamed from: l */
    public final long f13464l = 16000000;

    public C1669zl(String str, int i) {
        this.f13461i = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i == 1) {
            this.f13463k = 0;
            this.f13462j = 0;
        } else if (i == 2) {
            this.f13463k = 1;
            this.f13462j = 0;
        } else if (i == 3) {
            this.f13463k = 0;
            this.f13462j = 1;
        } else if (i != 4) {
            AbstractC1337qm.m5542i0("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f13463k = 0;
            this.f13462j = 0;
        } else {
            this.f13463k = 1;
            this.f13462j = 1;
        }
        m7322l(0);
        m7321k();
        this.f13476x = true;
        this.f13477y = -9223372036854775807L;
    }

    @Override // p000.AbstractC0682gm
    /* JADX INFO: renamed from: f */
    public final C0719hm mo2367f() {
        List list = this.f13467o;
        this.f13468p = list;
        list.getClass();
        return new C0719hm(list);
    }

    @Override // p000.AbstractC0682gm, p000.InterfaceC1385rx
    public final void flush() {
        super.flush();
        this.f13467o = null;
        this.f13468p = null;
        m7322l(0);
        this.f13470r = 4;
        this.f13466n.f13016h = 4;
        m7321k();
        this.f13471s = false;
        this.f13472t = false;
        this.f13473u = (byte) 0;
        this.f13474v = (byte) 0;
        this.f13475w = 0;
        this.f13476x = true;
        this.f13477y = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x019a  */
    /* JADX WARN: Code duplicated, block: B:123:0x01a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:127:0x01ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:128:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:131:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:133:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:134:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:137:0x01c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:138:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:140:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:141:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:142:0x01da  */
    /* JADX WARN: Code duplicated, block: B:143:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:148:0x0207 A[LOOP:1: B:146:0x0201->B:148:0x0207, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:149:0x020b  */
    /* JADX WARN: Code duplicated, block: B:151:0x0211 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:152:0x0213  */
    /* JADX WARN: Code duplicated, block: B:153:0x0218  */
    /* JADX WARN: Code duplicated, block: B:154:0x021f  */
    /* JADX WARN: Code duplicated, block: B:155:0x022a  */
    /* JADX WARN: Code duplicated, block: B:156:0x0235  */
    /* JADX WARN: Code duplicated, block: B:157:0x0240  */
    /* JADX WARN: Code duplicated, block: B:158:0x0245  */
    /* JADX WARN: Code duplicated, block: B:159:0x024a  */
    /* JADX WARN: Code duplicated, block: B:161:0x025b  */
    /* JADX WARN: Code duplicated, block: B:179:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x007e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:52:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00de  */
    /* JADX WARN: Code duplicated, block: B:83:0x0100 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0102  */
    /* JADX WARN: Code duplicated, block: B:91:0x012a  */
    /* JADX WARN: Code duplicated, block: B:93:0x012e  */
    @Override // p000.AbstractC0682gm
    /* JADX INFO: renamed from: g */
    public final void mo2368g(C0608em c0608em) {
        boolean z;
        int i;
        int[] iArr;
        int i2;
        int i3;
        int i4;
        ArrayList arrayList;
        int iMin;
        ByteBuffer byteBuffer = c0608em.f11795n;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        dc1 dc1Var = this.f13460h;
        dc1Var.m2314D(iLimit, bArrArray);
        boolean z2 = false;
        while (true) {
            int iM2318a = dc1Var.m2318a();
            int i5 = this.f13461i;
            if (iM2318a < i5) {
                if (z2) {
                    int i6 = this.f13469q;
                    if (i6 == 1 || i6 == 3) {
                        this.f13467o = m7320j();
                        this.f13477y = this.f4239e;
                        return;
                    }
                    return;
                }
                return;
            }
            int iM2337t = i5 == 2 ? -4 : dc1Var.m2337t();
            int iM2337t2 = dc1Var.m2337t();
            int iM2337t3 = dc1Var.m2337t();
            if ((iM2337t & 2) == 0 && (iM2337t & 1) == this.f13462j) {
                byte b = (byte) (iM2337t2 & 127);
                byte b2 = (byte) (iM2337t3 & 127);
                if (b != 0 || b2 != 0) {
                    boolean z3 = this.f13471s;
                    if ((iM2337t & 4) == 4) {
                        boolean[] zArr = f13458G;
                        if (zArr[iM2337t2] && zArr[iM2337t3]) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    this.f13471s = z;
                    if (!z || (b & 240) != 16) {
                        this.f13472t = false;
                        if (!z) {
                            if (1 > b && b <= 15) {
                                this.f13476x = false;
                            } else if ((b & 246) == 20) {
                                if (b2 == 32 && b2 != 47) {
                                    switch (b2) {
                                        default:
                                            switch (b2) {
                                                case LinuxInputConstants.KEY_LEFTSHIFT /* 42 */:
                                                case 43:
                                                    this.f13476x = false;
                                                    break;
                                            }
                                        case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                                        case 38:
                                        case BuildConfig.VERSION_CODE /* 39 */:
                                            this.f13476x = true;
                                            break;
                                    }
                                } else {
                                    this.f13476x = true;
                                }
                            }
                            if (this.f13476x) {
                                i = b & 224;
                                if (i == 0) {
                                    this.f13475w = (b >> 3) & 1;
                                }
                                if (this.f13475w != this.f13463k) {
                                    if (i == 0) {
                                        i2 = b & 247;
                                        if (i2 == 17 || (b2 & 240) != 48) {
                                            i3 = b & 246;
                                            if (i3 != 18 && (b2 & 224) == 32) {
                                                this.f13466n.m7091b();
                                                this.f13466n.m7090a((char) ((b & 1) == 0 ? f13456E[b2 & 31] : f13457F[b2 & 31]));
                                            } else if (i2 != 17 && (b2 & 240) == 32) {
                                                this.f13466n.m7090a(' ');
                                                boolean z4 = (b2 & 1) == 1;
                                                C1632yl c1632yl = this.f13466n;
                                                c1632yl.f13009a.add(new C1595xl((b2 >> 1) & 7, c1632yl.f13011c.length(), z4));
                                            } else if ((b & 240) != 16 && (b2 & DerValue.TAG_PRIVATE) == 64) {
                                                int i7 = f13459z[b & 7];
                                                if ((b2 & 32) != 0) {
                                                    i7++;
                                                }
                                                C1632yl c1632yl2 = this.f13466n;
                                                if (i7 != c1632yl2.f13012d) {
                                                    if (this.f13469q != 1 && !c1632yl2.m7094e()) {
                                                        C1632yl c1632yl3 = new C1632yl(this.f13469q, this.f13470r);
                                                        this.f13466n = c1632yl3;
                                                        this.f13465m.add(c1632yl3);
                                                    }
                                                    this.f13466n.f13012d = i7;
                                                }
                                                boolean z5 = (b2 & 16) == 16;
                                                boolean z6 = (b2 & 1) == 1;
                                                int i8 = (b2 >> 1) & 7;
                                                C1632yl c1632yl4 = this.f13466n;
                                                c1632yl4.f13009a.add(new C1595xl(z5 ? 8 : i8, c1632yl4.f13011c.length(), z6));
                                                if (z5) {
                                                    this.f13466n.f13013e = f13452A[i8];
                                                }
                                            } else if (i2 != 23 && b2 >= 33 && b2 <= 35) {
                                                this.f13466n.f13014f = b2 - 32;
                                            } else if (i3 == 20 && (b2 & 240) == 32) {
                                                if (b2 == 32) {
                                                    m7322l(2);
                                                } else if (b2 != 41) {
                                                    switch (b2) {
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                                                            m7322l(1);
                                                            this.f13470r = 2;
                                                            this.f13466n.f13016h = 2;
                                                            break;
                                                        case 38:
                                                            m7322l(1);
                                                            this.f13470r = 3;
                                                            this.f13466n.f13016h = 3;
                                                            break;
                                                        case BuildConfig.VERSION_CODE /* 39 */:
                                                            m7322l(1);
                                                            this.f13470r = 4;
                                                            this.f13466n.f13016h = 4;
                                                            break;
                                                        default:
                                                            i4 = this.f13469q;
                                                            if (i4 != 0) {
                                                                if (b2 != 33) {
                                                                    switch (b2) {
                                                                        case 44:
                                                                            this.f13467o = Collections.EMPTY_LIST;
                                                                            if (i4 != 1 || i4 == 3) {
                                                                                m7321k();
                                                                            }
                                                                            break;
                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                            if (i4 == 1 && !this.f13466n.m7094e()) {
                                                                                C1632yl c1632yl5 = this.f13466n;
                                                                                arrayList = c1632yl5.f13010b;
                                                                                arrayList.add(c1632yl5.m7093d());
                                                                                c1632yl5.f13011c.setLength(0);
                                                                                c1632yl5.f13009a.clear();
                                                                                iMin = Math.min(c1632yl5.f13016h, c1632yl5.f13012d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            m7321k();
                                                                            break;
                                                                        case LinuxInputConstants.ABS_MT_SLOT /* 47 */:
                                                                            this.f13467o = m7320j();
                                                                            m7321k();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.f13466n.m7091b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    m7322l(3);
                                                }
                                            }
                                        } else {
                                            this.f13466n.m7090a((char) f13455D[b2 & 15]);
                                        }
                                    } else {
                                        C1632yl c1632yl6 = this.f13466n;
                                        iArr = f13454C;
                                        c1632yl6.m7090a((char) iArr[(b & 127) - 32]);
                                        if ((b2 & 224) != 0) {
                                            this.f13466n.m7090a((char) iArr[(b2 & 127) - 32]);
                                        }
                                    }
                                    z2 = true;
                                }
                            }
                        } else if (z3) {
                            m7321k();
                            z2 = true;
                        }
                    } else if (this.f13472t && this.f13473u == b && this.f13474v == b2) {
                        this.f13472t = false;
                    } else {
                        this.f13472t = true;
                        this.f13473u = b;
                        this.f13474v = b2;
                        if (!z) {
                            if (1 > b) {
                                if ((b & 246) == 20) {
                                    if (b2 == 32) {
                                        this.f13476x = true;
                                    } else {
                                        this.f13476x = true;
                                    }
                                }
                            } else if ((b & 246) == 20) {
                                if (b2 == 32) {
                                    this.f13476x = true;
                                } else {
                                    this.f13476x = true;
                                }
                            }
                            if (this.f13476x) {
                                i = b & 224;
                                if (i == 0) {
                                    this.f13475w = (b >> 3) & 1;
                                }
                                if (this.f13475w != this.f13463k) {
                                    if (i == 0) {
                                        i2 = b & 247;
                                        if (i2 == 17) {
                                            i3 = b & 246;
                                            if (i3 != 18) {
                                                if (i2 != 17) {
                                                    if ((b & 240) != 16) {
                                                        if (i2 != 23) {
                                                            if (i3 == 20) {
                                                                if (b2 == 32) {
                                                                    m7322l(2);
                                                                } else if (b2 != 41) {
                                                                    switch (b2) {
                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                                                                            m7322l(1);
                                                                            this.f13470r = 2;
                                                                            this.f13466n.f13016h = 2;
                                                                            break;
                                                                        case 38:
                                                                            m7322l(1);
                                                                            this.f13470r = 3;
                                                                            this.f13466n.f13016h = 3;
                                                                            break;
                                                                        case BuildConfig.VERSION_CODE /* 39 */:
                                                                            m7322l(1);
                                                                            this.f13470r = 4;
                                                                            this.f13466n.f13016h = 4;
                                                                            break;
                                                                        default:
                                                                            i4 = this.f13469q;
                                                                            if (i4 != 0) {
                                                                                if (b2 != 33) {
                                                                                    switch (b2) {
                                                                                        case 44:
                                                                                            this.f13467o = Collections.EMPTY_LIST;
                                                                                            if (i4 != 1) {
                                                                                                m7321k();
                                                                                            } else {
                                                                                                m7321k();
                                                                                            }
                                                                                            break;
                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                            if (i4 == 1) {
                                                                                                C1632yl c1632yl7 = this.f13466n;
                                                                                                arrayList = c1632yl7.f13010b;
                                                                                                arrayList.add(c1632yl7.m7093d());
                                                                                                c1632yl7.f13011c.setLength(0);
                                                                                                c1632yl7.f13009a.clear();
                                                                                                iMin = Math.min(c1632yl7.f13016h, c1632yl7.f13012d);
                                                                                                while (arrayList.size() >= iMin) {
                                                                                                    arrayList.remove(0);
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 46:
                                                                                            m7321k();
                                                                                            break;
                                                                                        case LinuxInputConstants.ABS_MT_SLOT /* 47 */:
                                                                                            this.f13467o = m7320j();
                                                                                            m7321k();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.f13466n.m7091b();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    m7322l(3);
                                                                }
                                                            }
                                                        } else if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                m7322l(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                                                                        m7322l(1);
                                                                        this.f13470r = 2;
                                                                        this.f13466n.f13016h = 2;
                                                                        break;
                                                                    case 38:
                                                                        m7322l(1);
                                                                        this.f13470r = 3;
                                                                        this.f13466n.f13016h = 3;
                                                                        break;
                                                                    case BuildConfig.VERSION_CODE /* 39 */:
                                                                        m7322l(1);
                                                                        this.f13470r = 4;
                                                                        this.f13466n.f13016h = 4;
                                                                        break;
                                                                    default:
                                                                        i4 = this.f13469q;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case 44:
                                                                                        this.f13467o = Collections.EMPTY_LIST;
                                                                                        if (i4 != 1) {
                                                                                            m7321k();
                                                                                        } else {
                                                                                            m7321k();
                                                                                        }
                                                                                        break;
                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                        if (i4 == 1) {
                                                                                            C1632yl c1632yl8 = this.f13466n;
                                                                                            arrayList = c1632yl8.f13010b;
                                                                                            arrayList.add(c1632yl8.m7093d());
                                                                                            c1632yl8.f13011c.setLength(0);
                                                                                            c1632yl8.f13009a.clear();
                                                                                            iMin = Math.min(c1632yl8.f13016h, c1632yl8.f13012d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m7321k();
                                                                                        break;
                                                                                    case LinuxInputConstants.ABS_MT_SLOT /* 47 */:
                                                                                        this.f13467o = m7320j();
                                                                                        m7321k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f13466n.m7091b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m7322l(3);
                                                            }
                                                        }
                                                    } else if (i2 != 23) {
                                                        if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                m7322l(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                                                                        m7322l(1);
                                                                        this.f13470r = 2;
                                                                        this.f13466n.f13016h = 2;
                                                                        break;
                                                                    case 38:
                                                                        m7322l(1);
                                                                        this.f13470r = 3;
                                                                        this.f13466n.f13016h = 3;
                                                                        break;
                                                                    case BuildConfig.VERSION_CODE /* 39 */:
                                                                        m7322l(1);
                                                                        this.f13470r = 4;
                                                                        this.f13466n.f13016h = 4;
                                                                        break;
                                                                    default:
                                                                        i4 = this.f13469q;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case 44:
                                                                                        this.f13467o = Collections.EMPTY_LIST;
                                                                                        if (i4 != 1) {
                                                                                            m7321k();
                                                                                        } else {
                                                                                            m7321k();
                                                                                        }
                                                                                        break;
                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                        if (i4 == 1) {
                                                                                            C1632yl c1632yl9 = this.f13466n;
                                                                                            arrayList = c1632yl9.f13010b;
                                                                                            arrayList.add(c1632yl9.m7093d());
                                                                                            c1632yl9.f13011c.setLength(0);
                                                                                            c1632yl9.f13009a.clear();
                                                                                            iMin = Math.min(c1632yl9.f13016h, c1632yl9.f13012d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m7321k();
                                                                                        break;
                                                                                    case LinuxInputConstants.ABS_MT_SLOT /* 47 */:
                                                                                        this.f13467o = m7320j();
                                                                                        m7321k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f13466n.m7091b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m7322l(3);
                                                            }
                                                        }
                                                    } else if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            m7322l(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                                                                    m7322l(1);
                                                                    this.f13470r = 2;
                                                                    this.f13466n.f13016h = 2;
                                                                    break;
                                                                case 38:
                                                                    m7322l(1);
                                                                    this.f13470r = 3;
                                                                    this.f13466n.f13016h = 3;
                                                                    break;
                                                                case BuildConfig.VERSION_CODE /* 39 */:
                                                                    m7322l(1);
                                                                    this.f13470r = 4;
                                                                    this.f13466n.f13016h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.f13469q;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.f13467o = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        m7321k();
                                                                                    } else {
                                                                                        m7321k();
                                                                                    }
                                                                                    break;
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                    if (i4 == 1) {
                                                                                        C1632yl c1632yl10 = this.f13466n;
                                                                                        arrayList = c1632yl10.f13010b;
                                                                                        arrayList.add(c1632yl10.m7093d());
                                                                                        c1632yl10.f13011c.setLength(0);
                                                                                        c1632yl10.f13009a.clear();
                                                                                        iMin = Math.min(c1632yl10.f13016h, c1632yl10.f13012d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m7321k();
                                                                                    break;
                                                                                case LinuxInputConstants.ABS_MT_SLOT /* 47 */:
                                                                                    this.f13467o = m7320j();
                                                                                    m7321k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f13466n.m7091b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m7322l(3);
                                                        }
                                                    }
                                                } else if ((b & 240) != 16) {
                                                    if (i2 != 23) {
                                                        if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                m7322l(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                                                                        m7322l(1);
                                                                        this.f13470r = 2;
                                                                        this.f13466n.f13016h = 2;
                                                                        break;
                                                                    case 38:
                                                                        m7322l(1);
                                                                        this.f13470r = 3;
                                                                        this.f13466n.f13016h = 3;
                                                                        break;
                                                                    case BuildConfig.VERSION_CODE /* 39 */:
                                                                        m7322l(1);
                                                                        this.f13470r = 4;
                                                                        this.f13466n.f13016h = 4;
                                                                        break;
                                                                    default:
                                                                        i4 = this.f13469q;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case 44:
                                                                                        this.f13467o = Collections.EMPTY_LIST;
                                                                                        if (i4 != 1) {
                                                                                            m7321k();
                                                                                        } else {
                                                                                            m7321k();
                                                                                        }
                                                                                        break;
                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                        if (i4 == 1) {
                                                                                            C1632yl c1632yl11 = this.f13466n;
                                                                                            arrayList = c1632yl11.f13010b;
                                                                                            arrayList.add(c1632yl11.m7093d());
                                                                                            c1632yl11.f13011c.setLength(0);
                                                                                            c1632yl11.f13009a.clear();
                                                                                            iMin = Math.min(c1632yl11.f13016h, c1632yl11.f13012d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m7321k();
                                                                                        break;
                                                                                    case LinuxInputConstants.ABS_MT_SLOT /* 47 */:
                                                                                        this.f13467o = m7320j();
                                                                                        m7321k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f13466n.m7091b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m7322l(3);
                                                            }
                                                        }
                                                    } else if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            m7322l(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                                                                    m7322l(1);
                                                                    this.f13470r = 2;
                                                                    this.f13466n.f13016h = 2;
                                                                    break;
                                                                case 38:
                                                                    m7322l(1);
                                                                    this.f13470r = 3;
                                                                    this.f13466n.f13016h = 3;
                                                                    break;
                                                                case BuildConfig.VERSION_CODE /* 39 */:
                                                                    m7322l(1);
                                                                    this.f13470r = 4;
                                                                    this.f13466n.f13016h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.f13469q;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.f13467o = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        m7321k();
                                                                                    } else {
                                                                                        m7321k();
                                                                                    }
                                                                                    break;
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                    if (i4 == 1) {
                                                                                        C1632yl c1632yl12 = this.f13466n;
                                                                                        arrayList = c1632yl12.f13010b;
                                                                                        arrayList.add(c1632yl12.m7093d());
                                                                                        c1632yl12.f13011c.setLength(0);
                                                                                        c1632yl12.f13009a.clear();
                                                                                        iMin = Math.min(c1632yl12.f13016h, c1632yl12.f13012d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m7321k();
                                                                                    break;
                                                                                case LinuxInputConstants.ABS_MT_SLOT /* 47 */:
                                                                                    this.f13467o = m7320j();
                                                                                    m7321k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f13466n.m7091b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m7322l(3);
                                                        }
                                                    }
                                                } else if (i2 != 23) {
                                                    if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            m7322l(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                                                                    m7322l(1);
                                                                    this.f13470r = 2;
                                                                    this.f13466n.f13016h = 2;
                                                                    break;
                                                                case 38:
                                                                    m7322l(1);
                                                                    this.f13470r = 3;
                                                                    this.f13466n.f13016h = 3;
                                                                    break;
                                                                case BuildConfig.VERSION_CODE /* 39 */:
                                                                    m7322l(1);
                                                                    this.f13470r = 4;
                                                                    this.f13466n.f13016h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.f13469q;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.f13467o = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        m7321k();
                                                                                    } else {
                                                                                        m7321k();
                                                                                    }
                                                                                    break;
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                    if (i4 == 1) {
                                                                                        C1632yl c1632yl13 = this.f13466n;
                                                                                        arrayList = c1632yl13.f13010b;
                                                                                        arrayList.add(c1632yl13.m7093d());
                                                                                        c1632yl13.f13011c.setLength(0);
                                                                                        c1632yl13.f13009a.clear();
                                                                                        iMin = Math.min(c1632yl13.f13016h, c1632yl13.f13012d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m7321k();
                                                                                    break;
                                                                                case LinuxInputConstants.ABS_MT_SLOT /* 47 */:
                                                                                    this.f13467o = m7320j();
                                                                                    m7321k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f13466n.m7091b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m7322l(3);
                                                        }
                                                    }
                                                } else if (i3 == 20) {
                                                    if (b2 == 32) {
                                                        m7322l(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                                                                m7322l(1);
                                                                this.f13470r = 2;
                                                                this.f13466n.f13016h = 2;
                                                                break;
                                                            case 38:
                                                                m7322l(1);
                                                                this.f13470r = 3;
                                                                this.f13466n.f13016h = 3;
                                                                break;
                                                            case BuildConfig.VERSION_CODE /* 39 */:
                                                                m7322l(1);
                                                                this.f13470r = 4;
                                                                this.f13466n.f13016h = 4;
                                                                break;
                                                            default:
                                                                i4 = this.f13469q;
                                                                if (i4 != 0) {
                                                                    if (b2 != 33) {
                                                                        switch (b2) {
                                                                            case 44:
                                                                                this.f13467o = Collections.EMPTY_LIST;
                                                                                if (i4 != 1) {
                                                                                    m7321k();
                                                                                } else {
                                                                                    m7321k();
                                                                                }
                                                                                break;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                if (i4 == 1) {
                                                                                    C1632yl c1632yl14 = this.f13466n;
                                                                                    arrayList = c1632yl14.f13010b;
                                                                                    arrayList.add(c1632yl14.m7093d());
                                                                                    c1632yl14.f13011c.setLength(0);
                                                                                    c1632yl14.f13009a.clear();
                                                                                    iMin = Math.min(c1632yl14.f13016h, c1632yl14.f13012d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                m7321k();
                                                                                break;
                                                                            case LinuxInputConstants.ABS_MT_SLOT /* 47 */:
                                                                                this.f13467o = m7320j();
                                                                                m7321k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f13466n.m7091b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        m7322l(3);
                                                    }
                                                }
                                            } else if (i2 != 17) {
                                                if ((b & 240) != 16) {
                                                    if (i2 != 23) {
                                                        if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                m7322l(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                                                                        m7322l(1);
                                                                        this.f13470r = 2;
                                                                        this.f13466n.f13016h = 2;
                                                                        break;
                                                                    case 38:
                                                                        m7322l(1);
                                                                        this.f13470r = 3;
                                                                        this.f13466n.f13016h = 3;
                                                                        break;
                                                                    case BuildConfig.VERSION_CODE /* 39 */:
                                                                        m7322l(1);
                                                                        this.f13470r = 4;
                                                                        this.f13466n.f13016h = 4;
                                                                        break;
                                                                    default:
                                                                        i4 = this.f13469q;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case 44:
                                                                                        this.f13467o = Collections.EMPTY_LIST;
                                                                                        if (i4 != 1) {
                                                                                            m7321k();
                                                                                        } else {
                                                                                            m7321k();
                                                                                        }
                                                                                        break;
                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                        if (i4 == 1) {
                                                                                            C1632yl c1632yl15 = this.f13466n;
                                                                                            arrayList = c1632yl15.f13010b;
                                                                                            arrayList.add(c1632yl15.m7093d());
                                                                                            c1632yl15.f13011c.setLength(0);
                                                                                            c1632yl15.f13009a.clear();
                                                                                            iMin = Math.min(c1632yl15.f13016h, c1632yl15.f13012d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m7321k();
                                                                                        break;
                                                                                    case LinuxInputConstants.ABS_MT_SLOT /* 47 */:
                                                                                        this.f13467o = m7320j();
                                                                                        m7321k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f13466n.m7091b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m7322l(3);
                                                            }
                                                        }
                                                    } else if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            m7322l(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                                                                    m7322l(1);
                                                                    this.f13470r = 2;
                                                                    this.f13466n.f13016h = 2;
                                                                    break;
                                                                case 38:
                                                                    m7322l(1);
                                                                    this.f13470r = 3;
                                                                    this.f13466n.f13016h = 3;
                                                                    break;
                                                                case BuildConfig.VERSION_CODE /* 39 */:
                                                                    m7322l(1);
                                                                    this.f13470r = 4;
                                                                    this.f13466n.f13016h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.f13469q;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.f13467o = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        m7321k();
                                                                                    } else {
                                                                                        m7321k();
                                                                                    }
                                                                                    break;
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                    if (i4 == 1) {
                                                                                        C1632yl c1632yl16 = this.f13466n;
                                                                                        arrayList = c1632yl16.f13010b;
                                                                                        arrayList.add(c1632yl16.m7093d());
                                                                                        c1632yl16.f13011c.setLength(0);
                                                                                        c1632yl16.f13009a.clear();
                                                                                        iMin = Math.min(c1632yl16.f13016h, c1632yl16.f13012d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m7321k();
                                                                                    break;
                                                                                case LinuxInputConstants.ABS_MT_SLOT /* 47 */:
                                                                                    this.f13467o = m7320j();
                                                                                    m7321k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f13466n.m7091b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m7322l(3);
                                                        }
                                                    }
                                                } else if (i2 != 23) {
                                                    if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            m7322l(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                                                                    m7322l(1);
                                                                    this.f13470r = 2;
                                                                    this.f13466n.f13016h = 2;
                                                                    break;
                                                                case 38:
                                                                    m7322l(1);
                                                                    this.f13470r = 3;
                                                                    this.f13466n.f13016h = 3;
                                                                    break;
                                                                case BuildConfig.VERSION_CODE /* 39 */:
                                                                    m7322l(1);
                                                                    this.f13470r = 4;
                                                                    this.f13466n.f13016h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.f13469q;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.f13467o = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        m7321k();
                                                                                    } else {
                                                                                        m7321k();
                                                                                    }
                                                                                    break;
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                    if (i4 == 1) {
                                                                                        C1632yl c1632yl17 = this.f13466n;
                                                                                        arrayList = c1632yl17.f13010b;
                                                                                        arrayList.add(c1632yl17.m7093d());
                                                                                        c1632yl17.f13011c.setLength(0);
                                                                                        c1632yl17.f13009a.clear();
                                                                                        iMin = Math.min(c1632yl17.f13016h, c1632yl17.f13012d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m7321k();
                                                                                    break;
                                                                                case LinuxInputConstants.ABS_MT_SLOT /* 47 */:
                                                                                    this.f13467o = m7320j();
                                                                                    m7321k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f13466n.m7091b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m7322l(3);
                                                        }
                                                    }
                                                } else if (i3 == 20) {
                                                    if (b2 == 32) {
                                                        m7322l(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                                                                m7322l(1);
                                                                this.f13470r = 2;
                                                                this.f13466n.f13016h = 2;
                                                                break;
                                                            case 38:
                                                                m7322l(1);
                                                                this.f13470r = 3;
                                                                this.f13466n.f13016h = 3;
                                                                break;
                                                            case BuildConfig.VERSION_CODE /* 39 */:
                                                                m7322l(1);
                                                                this.f13470r = 4;
                                                                this.f13466n.f13016h = 4;
                                                                break;
                                                            default:
                                                                i4 = this.f13469q;
                                                                if (i4 != 0) {
                                                                    if (b2 != 33) {
                                                                        switch (b2) {
                                                                            case 44:
                                                                                this.f13467o = Collections.EMPTY_LIST;
                                                                                if (i4 != 1) {
                                                                                    m7321k();
                                                                                } else {
                                                                                    m7321k();
                                                                                }
                                                                                break;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                if (i4 == 1) {
                                                                                    C1632yl c1632yl18 = this.f13466n;
                                                                                    arrayList = c1632yl18.f13010b;
                                                                                    arrayList.add(c1632yl18.m7093d());
                                                                                    c1632yl18.f13011c.setLength(0);
                                                                                    c1632yl18.f13009a.clear();
                                                                                    iMin = Math.min(c1632yl18.f13016h, c1632yl18.f13012d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                m7321k();
                                                                                break;
                                                                            case LinuxInputConstants.ABS_MT_SLOT /* 47 */:
                                                                                this.f13467o = m7320j();
                                                                                m7321k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f13466n.m7091b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        m7322l(3);
                                                    }
                                                }
                                            } else if ((b & 240) != 16) {
                                                if (i2 != 23) {
                                                    if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            m7322l(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                                                                    m7322l(1);
                                                                    this.f13470r = 2;
                                                                    this.f13466n.f13016h = 2;
                                                                    break;
                                                                case 38:
                                                                    m7322l(1);
                                                                    this.f13470r = 3;
                                                                    this.f13466n.f13016h = 3;
                                                                    break;
                                                                case BuildConfig.VERSION_CODE /* 39 */:
                                                                    m7322l(1);
                                                                    this.f13470r = 4;
                                                                    this.f13466n.f13016h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.f13469q;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.f13467o = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        m7321k();
                                                                                    } else {
                                                                                        m7321k();
                                                                                    }
                                                                                    break;
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                    if (i4 == 1) {
                                                                                        C1632yl c1632yl19 = this.f13466n;
                                                                                        arrayList = c1632yl19.f13010b;
                                                                                        arrayList.add(c1632yl19.m7093d());
                                                                                        c1632yl19.f13011c.setLength(0);
                                                                                        c1632yl19.f13009a.clear();
                                                                                        iMin = Math.min(c1632yl19.f13016h, c1632yl19.f13012d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m7321k();
                                                                                    break;
                                                                                case LinuxInputConstants.ABS_MT_SLOT /* 47 */:
                                                                                    this.f13467o = m7320j();
                                                                                    m7321k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f13466n.m7091b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m7322l(3);
                                                        }
                                                    }
                                                } else if (i3 == 20) {
                                                    if (b2 == 32) {
                                                        m7322l(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                                                                m7322l(1);
                                                                this.f13470r = 2;
                                                                this.f13466n.f13016h = 2;
                                                                break;
                                                            case 38:
                                                                m7322l(1);
                                                                this.f13470r = 3;
                                                                this.f13466n.f13016h = 3;
                                                                break;
                                                            case BuildConfig.VERSION_CODE /* 39 */:
                                                                m7322l(1);
                                                                this.f13470r = 4;
                                                                this.f13466n.f13016h = 4;
                                                                break;
                                                            default:
                                                                i4 = this.f13469q;
                                                                if (i4 != 0) {
                                                                    if (b2 != 33) {
                                                                        switch (b2) {
                                                                            case 44:
                                                                                this.f13467o = Collections.EMPTY_LIST;
                                                                                if (i4 != 1) {
                                                                                    m7321k();
                                                                                } else {
                                                                                    m7321k();
                                                                                }
                                                                                break;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                if (i4 == 1) {
                                                                                    C1632yl c1632yl110 = this.f13466n;
                                                                                    arrayList = c1632yl110.f13010b;
                                                                                    arrayList.add(c1632yl110.m7093d());
                                                                                    c1632yl110.f13011c.setLength(0);
                                                                                    c1632yl110.f13009a.clear();
                                                                                    iMin = Math.min(c1632yl110.f13016h, c1632yl110.f13012d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                m7321k();
                                                                                break;
                                                                            case LinuxInputConstants.ABS_MT_SLOT /* 47 */:
                                                                                this.f13467o = m7320j();
                                                                                m7321k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f13466n.m7091b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        m7322l(3);
                                                    }
                                                }
                                            } else if (i2 != 23) {
                                                if (i3 == 20) {
                                                    if (b2 == 32) {
                                                        m7322l(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                                                                m7322l(1);
                                                                this.f13470r = 2;
                                                                this.f13466n.f13016h = 2;
                                                                break;
                                                            case 38:
                                                                m7322l(1);
                                                                this.f13470r = 3;
                                                                this.f13466n.f13016h = 3;
                                                                break;
                                                            case BuildConfig.VERSION_CODE /* 39 */:
                                                                m7322l(1);
                                                                this.f13470r = 4;
                                                                this.f13466n.f13016h = 4;
                                                                break;
                                                            default:
                                                                i4 = this.f13469q;
                                                                if (i4 != 0) {
                                                                    if (b2 != 33) {
                                                                        switch (b2) {
                                                                            case 44:
                                                                                this.f13467o = Collections.EMPTY_LIST;
                                                                                if (i4 != 1) {
                                                                                    m7321k();
                                                                                } else {
                                                                                    m7321k();
                                                                                }
                                                                                break;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                if (i4 == 1) {
                                                                                    C1632yl c1632yl111 = this.f13466n;
                                                                                    arrayList = c1632yl111.f13010b;
                                                                                    arrayList.add(c1632yl111.m7093d());
                                                                                    c1632yl111.f13011c.setLength(0);
                                                                                    c1632yl111.f13009a.clear();
                                                                                    iMin = Math.min(c1632yl111.f13016h, c1632yl111.f13012d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                m7321k();
                                                                                break;
                                                                            case LinuxInputConstants.ABS_MT_SLOT /* 47 */:
                                                                                this.f13467o = m7320j();
                                                                                m7321k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f13466n.m7091b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        m7322l(3);
                                                    }
                                                }
                                            } else if (i3 == 20) {
                                                if (b2 == 32) {
                                                    m7322l(2);
                                                } else if (b2 != 41) {
                                                    switch (b2) {
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                                                            m7322l(1);
                                                            this.f13470r = 2;
                                                            this.f13466n.f13016h = 2;
                                                            break;
                                                        case 38:
                                                            m7322l(1);
                                                            this.f13470r = 3;
                                                            this.f13466n.f13016h = 3;
                                                            break;
                                                        case BuildConfig.VERSION_CODE /* 39 */:
                                                            m7322l(1);
                                                            this.f13470r = 4;
                                                            this.f13466n.f13016h = 4;
                                                            break;
                                                        default:
                                                            i4 = this.f13469q;
                                                            if (i4 != 0) {
                                                                if (b2 != 33) {
                                                                    switch (b2) {
                                                                        case 44:
                                                                            this.f13467o = Collections.EMPTY_LIST;
                                                                            if (i4 != 1) {
                                                                                m7321k();
                                                                            } else {
                                                                                m7321k();
                                                                            }
                                                                            break;
                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                            if (i4 == 1) {
                                                                                C1632yl c1632yl112 = this.f13466n;
                                                                                arrayList = c1632yl112.f13010b;
                                                                                arrayList.add(c1632yl112.m7093d());
                                                                                c1632yl112.f13011c.setLength(0);
                                                                                c1632yl112.f13009a.clear();
                                                                                iMin = Math.min(c1632yl112.f13016h, c1632yl112.f13012d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            m7321k();
                                                                            break;
                                                                        case LinuxInputConstants.ABS_MT_SLOT /* 47 */:
                                                                            this.f13467o = m7320j();
                                                                            m7321k();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.f13466n.m7091b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    m7322l(3);
                                                }
                                            }
                                        } else {
                                            i3 = b & 246;
                                            if (i3 != 18) {
                                                if (i2 != 17) {
                                                    if ((b & 240) != 16) {
                                                        if (i2 != 23) {
                                                            if (i3 == 20) {
                                                                if (b2 == 32) {
                                                                    m7322l(2);
                                                                } else if (b2 != 41) {
                                                                    switch (b2) {
                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                                                                            m7322l(1);
                                                                            this.f13470r = 2;
                                                                            this.f13466n.f13016h = 2;
                                                                            break;
                                                                        case 38:
                                                                            m7322l(1);
                                                                            this.f13470r = 3;
                                                                            this.f13466n.f13016h = 3;
                                                                            break;
                                                                        case BuildConfig.VERSION_CODE /* 39 */:
                                                                            m7322l(1);
                                                                            this.f13470r = 4;
                                                                            this.f13466n.f13016h = 4;
                                                                            break;
                                                                        default:
                                                                            i4 = this.f13469q;
                                                                            if (i4 != 0) {
                                                                                if (b2 != 33) {
                                                                                    switch (b2) {
                                                                                        case 44:
                                                                                            this.f13467o = Collections.EMPTY_LIST;
                                                                                            if (i4 != 1) {
                                                                                                m7321k();
                                                                                            } else {
                                                                                                m7321k();
                                                                                            }
                                                                                            break;
                                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                            if (i4 == 1) {
                                                                                                C1632yl c1632yl113 = this.f13466n;
                                                                                                arrayList = c1632yl113.f13010b;
                                                                                                arrayList.add(c1632yl113.m7093d());
                                                                                                c1632yl113.f13011c.setLength(0);
                                                                                                c1632yl113.f13009a.clear();
                                                                                                iMin = Math.min(c1632yl113.f13016h, c1632yl113.f13012d);
                                                                                                while (arrayList.size() >= iMin) {
                                                                                                    arrayList.remove(0);
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 46:
                                                                                            m7321k();
                                                                                            break;
                                                                                        case LinuxInputConstants.ABS_MT_SLOT /* 47 */:
                                                                                            this.f13467o = m7320j();
                                                                                            m7321k();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.f13466n.m7091b();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    m7322l(3);
                                                                }
                                                            }
                                                        } else if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                m7322l(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                                                                        m7322l(1);
                                                                        this.f13470r = 2;
                                                                        this.f13466n.f13016h = 2;
                                                                        break;
                                                                    case 38:
                                                                        m7322l(1);
                                                                        this.f13470r = 3;
                                                                        this.f13466n.f13016h = 3;
                                                                        break;
                                                                    case BuildConfig.VERSION_CODE /* 39 */:
                                                                        m7322l(1);
                                                                        this.f13470r = 4;
                                                                        this.f13466n.f13016h = 4;
                                                                        break;
                                                                    default:
                                                                        i4 = this.f13469q;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case 44:
                                                                                        this.f13467o = Collections.EMPTY_LIST;
                                                                                        if (i4 != 1) {
                                                                                            m7321k();
                                                                                        } else {
                                                                                            m7321k();
                                                                                        }
                                                                                        break;
                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                        if (i4 == 1) {
                                                                                            C1632yl c1632yl114 = this.f13466n;
                                                                                            arrayList = c1632yl114.f13010b;
                                                                                            arrayList.add(c1632yl114.m7093d());
                                                                                            c1632yl114.f13011c.setLength(0);
                                                                                            c1632yl114.f13009a.clear();
                                                                                            iMin = Math.min(c1632yl114.f13016h, c1632yl114.f13012d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m7321k();
                                                                                        break;
                                                                                    case LinuxInputConstants.ABS_MT_SLOT /* 47 */:
                                                                                        this.f13467o = m7320j();
                                                                                        m7321k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f13466n.m7091b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m7322l(3);
                                                            }
                                                        }
                                                    } else if (i2 != 23) {
                                                        if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                m7322l(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                                                                        m7322l(1);
                                                                        this.f13470r = 2;
                                                                        this.f13466n.f13016h = 2;
                                                                        break;
                                                                    case 38:
                                                                        m7322l(1);
                                                                        this.f13470r = 3;
                                                                        this.f13466n.f13016h = 3;
                                                                        break;
                                                                    case BuildConfig.VERSION_CODE /* 39 */:
                                                                        m7322l(1);
                                                                        this.f13470r = 4;
                                                                        this.f13466n.f13016h = 4;
                                                                        break;
                                                                    default:
                                                                        i4 = this.f13469q;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case 44:
                                                                                        this.f13467o = Collections.EMPTY_LIST;
                                                                                        if (i4 != 1) {
                                                                                            m7321k();
                                                                                        } else {
                                                                                            m7321k();
                                                                                        }
                                                                                        break;
                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                        if (i4 == 1) {
                                                                                            C1632yl c1632yl115 = this.f13466n;
                                                                                            arrayList = c1632yl115.f13010b;
                                                                                            arrayList.add(c1632yl115.m7093d());
                                                                                            c1632yl115.f13011c.setLength(0);
                                                                                            c1632yl115.f13009a.clear();
                                                                                            iMin = Math.min(c1632yl115.f13016h, c1632yl115.f13012d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m7321k();
                                                                                        break;
                                                                                    case LinuxInputConstants.ABS_MT_SLOT /* 47 */:
                                                                                        this.f13467o = m7320j();
                                                                                        m7321k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f13466n.m7091b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m7322l(3);
                                                            }
                                                        }
                                                    } else if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            m7322l(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                                                                    m7322l(1);
                                                                    this.f13470r = 2;
                                                                    this.f13466n.f13016h = 2;
                                                                    break;
                                                                case 38:
                                                                    m7322l(1);
                                                                    this.f13470r = 3;
                                                                    this.f13466n.f13016h = 3;
                                                                    break;
                                                                case BuildConfig.VERSION_CODE /* 39 */:
                                                                    m7322l(1);
                                                                    this.f13470r = 4;
                                                                    this.f13466n.f13016h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.f13469q;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.f13467o = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        m7321k();
                                                                                    } else {
                                                                                        m7321k();
                                                                                    }
                                                                                    break;
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                    if (i4 == 1) {
                                                                                        C1632yl c1632yl116 = this.f13466n;
                                                                                        arrayList = c1632yl116.f13010b;
                                                                                        arrayList.add(c1632yl116.m7093d());
                                                                                        c1632yl116.f13011c.setLength(0);
                                                                                        c1632yl116.f13009a.clear();
                                                                                        iMin = Math.min(c1632yl116.f13016h, c1632yl116.f13012d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m7321k();
                                                                                    break;
                                                                                case LinuxInputConstants.ABS_MT_SLOT /* 47 */:
                                                                                    this.f13467o = m7320j();
                                                                                    m7321k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f13466n.m7091b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m7322l(3);
                                                        }
                                                    }
                                                } else if ((b & 240) != 16) {
                                                    if (i2 != 23) {
                                                        if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                m7322l(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                                                                        m7322l(1);
                                                                        this.f13470r = 2;
                                                                        this.f13466n.f13016h = 2;
                                                                        break;
                                                                    case 38:
                                                                        m7322l(1);
                                                                        this.f13470r = 3;
                                                                        this.f13466n.f13016h = 3;
                                                                        break;
                                                                    case BuildConfig.VERSION_CODE /* 39 */:
                                                                        m7322l(1);
                                                                        this.f13470r = 4;
                                                                        this.f13466n.f13016h = 4;
                                                                        break;
                                                                    default:
                                                                        i4 = this.f13469q;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case 44:
                                                                                        this.f13467o = Collections.EMPTY_LIST;
                                                                                        if (i4 != 1) {
                                                                                            m7321k();
                                                                                        } else {
                                                                                            m7321k();
                                                                                        }
                                                                                        break;
                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                        if (i4 == 1) {
                                                                                            C1632yl c1632yl117 = this.f13466n;
                                                                                            arrayList = c1632yl117.f13010b;
                                                                                            arrayList.add(c1632yl117.m7093d());
                                                                                            c1632yl117.f13011c.setLength(0);
                                                                                            c1632yl117.f13009a.clear();
                                                                                            iMin = Math.min(c1632yl117.f13016h, c1632yl117.f13012d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m7321k();
                                                                                        break;
                                                                                    case LinuxInputConstants.ABS_MT_SLOT /* 47 */:
                                                                                        this.f13467o = m7320j();
                                                                                        m7321k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f13466n.m7091b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m7322l(3);
                                                            }
                                                        }
                                                    } else if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            m7322l(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                                                                    m7322l(1);
                                                                    this.f13470r = 2;
                                                                    this.f13466n.f13016h = 2;
                                                                    break;
                                                                case 38:
                                                                    m7322l(1);
                                                                    this.f13470r = 3;
                                                                    this.f13466n.f13016h = 3;
                                                                    break;
                                                                case BuildConfig.VERSION_CODE /* 39 */:
                                                                    m7322l(1);
                                                                    this.f13470r = 4;
                                                                    this.f13466n.f13016h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.f13469q;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.f13467o = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        m7321k();
                                                                                    } else {
                                                                                        m7321k();
                                                                                    }
                                                                                    break;
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                    if (i4 == 1) {
                                                                                        C1632yl c1632yl118 = this.f13466n;
                                                                                        arrayList = c1632yl118.f13010b;
                                                                                        arrayList.add(c1632yl118.m7093d());
                                                                                        c1632yl118.f13011c.setLength(0);
                                                                                        c1632yl118.f13009a.clear();
                                                                                        iMin = Math.min(c1632yl118.f13016h, c1632yl118.f13012d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m7321k();
                                                                                    break;
                                                                                case LinuxInputConstants.ABS_MT_SLOT /* 47 */:
                                                                                    this.f13467o = m7320j();
                                                                                    m7321k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f13466n.m7091b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m7322l(3);
                                                        }
                                                    }
                                                } else if (i2 != 23) {
                                                    if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            m7322l(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                                                                    m7322l(1);
                                                                    this.f13470r = 2;
                                                                    this.f13466n.f13016h = 2;
                                                                    break;
                                                                case 38:
                                                                    m7322l(1);
                                                                    this.f13470r = 3;
                                                                    this.f13466n.f13016h = 3;
                                                                    break;
                                                                case BuildConfig.VERSION_CODE /* 39 */:
                                                                    m7322l(1);
                                                                    this.f13470r = 4;
                                                                    this.f13466n.f13016h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.f13469q;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.f13467o = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        m7321k();
                                                                                    } else {
                                                                                        m7321k();
                                                                                    }
                                                                                    break;
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                    if (i4 == 1) {
                                                                                        C1632yl c1632yl119 = this.f13466n;
                                                                                        arrayList = c1632yl119.f13010b;
                                                                                        arrayList.add(c1632yl119.m7093d());
                                                                                        c1632yl119.f13011c.setLength(0);
                                                                                        c1632yl119.f13009a.clear();
                                                                                        iMin = Math.min(c1632yl119.f13016h, c1632yl119.f13012d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m7321k();
                                                                                    break;
                                                                                case LinuxInputConstants.ABS_MT_SLOT /* 47 */:
                                                                                    this.f13467o = m7320j();
                                                                                    m7321k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f13466n.m7091b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m7322l(3);
                                                        }
                                                    }
                                                } else if (i3 == 20) {
                                                    if (b2 == 32) {
                                                        m7322l(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                                                                m7322l(1);
                                                                this.f13470r = 2;
                                                                this.f13466n.f13016h = 2;
                                                                break;
                                                            case 38:
                                                                m7322l(1);
                                                                this.f13470r = 3;
                                                                this.f13466n.f13016h = 3;
                                                                break;
                                                            case BuildConfig.VERSION_CODE /* 39 */:
                                                                m7322l(1);
                                                                this.f13470r = 4;
                                                                this.f13466n.f13016h = 4;
                                                                break;
                                                            default:
                                                                i4 = this.f13469q;
                                                                if (i4 != 0) {
                                                                    if (b2 != 33) {
                                                                        switch (b2) {
                                                                            case 44:
                                                                                this.f13467o = Collections.EMPTY_LIST;
                                                                                if (i4 != 1) {
                                                                                    m7321k();
                                                                                } else {
                                                                                    m7321k();
                                                                                }
                                                                                break;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                if (i4 == 1) {
                                                                                    C1632yl c1632yl1110 = this.f13466n;
                                                                                    arrayList = c1632yl1110.f13010b;
                                                                                    arrayList.add(c1632yl1110.m7093d());
                                                                                    c1632yl1110.f13011c.setLength(0);
                                                                                    c1632yl1110.f13009a.clear();
                                                                                    iMin = Math.min(c1632yl1110.f13016h, c1632yl1110.f13012d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                m7321k();
                                                                                break;
                                                                            case LinuxInputConstants.ABS_MT_SLOT /* 47 */:
                                                                                this.f13467o = m7320j();
                                                                                m7321k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f13466n.m7091b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        m7322l(3);
                                                    }
                                                }
                                            } else if (i2 != 17) {
                                                if ((b & 240) != 16) {
                                                    if (i2 != 23) {
                                                        if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                m7322l(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                                                                        m7322l(1);
                                                                        this.f13470r = 2;
                                                                        this.f13466n.f13016h = 2;
                                                                        break;
                                                                    case 38:
                                                                        m7322l(1);
                                                                        this.f13470r = 3;
                                                                        this.f13466n.f13016h = 3;
                                                                        break;
                                                                    case BuildConfig.VERSION_CODE /* 39 */:
                                                                        m7322l(1);
                                                                        this.f13470r = 4;
                                                                        this.f13466n.f13016h = 4;
                                                                        break;
                                                                    default:
                                                                        i4 = this.f13469q;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case 44:
                                                                                        this.f13467o = Collections.EMPTY_LIST;
                                                                                        if (i4 != 1) {
                                                                                            m7321k();
                                                                                        } else {
                                                                                            m7321k();
                                                                                        }
                                                                                        break;
                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                        if (i4 == 1) {
                                                                                            C1632yl c1632yl1111 = this.f13466n;
                                                                                            arrayList = c1632yl1111.f13010b;
                                                                                            arrayList.add(c1632yl1111.m7093d());
                                                                                            c1632yl1111.f13011c.setLength(0);
                                                                                            c1632yl1111.f13009a.clear();
                                                                                            iMin = Math.min(c1632yl1111.f13016h, c1632yl1111.f13012d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        m7321k();
                                                                                        break;
                                                                                    case LinuxInputConstants.ABS_MT_SLOT /* 47 */:
                                                                                        this.f13467o = m7320j();
                                                                                        m7321k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f13466n.m7091b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                m7322l(3);
                                                            }
                                                        }
                                                    } else if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            m7322l(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                                                                    m7322l(1);
                                                                    this.f13470r = 2;
                                                                    this.f13466n.f13016h = 2;
                                                                    break;
                                                                case 38:
                                                                    m7322l(1);
                                                                    this.f13470r = 3;
                                                                    this.f13466n.f13016h = 3;
                                                                    break;
                                                                case BuildConfig.VERSION_CODE /* 39 */:
                                                                    m7322l(1);
                                                                    this.f13470r = 4;
                                                                    this.f13466n.f13016h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.f13469q;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.f13467o = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        m7321k();
                                                                                    } else {
                                                                                        m7321k();
                                                                                    }
                                                                                    break;
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                    if (i4 == 1) {
                                                                                        C1632yl c1632yl1112 = this.f13466n;
                                                                                        arrayList = c1632yl1112.f13010b;
                                                                                        arrayList.add(c1632yl1112.m7093d());
                                                                                        c1632yl1112.f13011c.setLength(0);
                                                                                        c1632yl1112.f13009a.clear();
                                                                                        iMin = Math.min(c1632yl1112.f13016h, c1632yl1112.f13012d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m7321k();
                                                                                    break;
                                                                                case LinuxInputConstants.ABS_MT_SLOT /* 47 */:
                                                                                    this.f13467o = m7320j();
                                                                                    m7321k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f13466n.m7091b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m7322l(3);
                                                        }
                                                    }
                                                } else if (i2 != 23) {
                                                    if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            m7322l(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                                                                    m7322l(1);
                                                                    this.f13470r = 2;
                                                                    this.f13466n.f13016h = 2;
                                                                    break;
                                                                case 38:
                                                                    m7322l(1);
                                                                    this.f13470r = 3;
                                                                    this.f13466n.f13016h = 3;
                                                                    break;
                                                                case BuildConfig.VERSION_CODE /* 39 */:
                                                                    m7322l(1);
                                                                    this.f13470r = 4;
                                                                    this.f13466n.f13016h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.f13469q;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.f13467o = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        m7321k();
                                                                                    } else {
                                                                                        m7321k();
                                                                                    }
                                                                                    break;
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                    if (i4 == 1) {
                                                                                        C1632yl c1632yl1113 = this.f13466n;
                                                                                        arrayList = c1632yl1113.f13010b;
                                                                                        arrayList.add(c1632yl1113.m7093d());
                                                                                        c1632yl1113.f13011c.setLength(0);
                                                                                        c1632yl1113.f13009a.clear();
                                                                                        iMin = Math.min(c1632yl1113.f13016h, c1632yl1113.f13012d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m7321k();
                                                                                    break;
                                                                                case LinuxInputConstants.ABS_MT_SLOT /* 47 */:
                                                                                    this.f13467o = m7320j();
                                                                                    m7321k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f13466n.m7091b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m7322l(3);
                                                        }
                                                    }
                                                } else if (i3 == 20) {
                                                    if (b2 == 32) {
                                                        m7322l(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                                                                m7322l(1);
                                                                this.f13470r = 2;
                                                                this.f13466n.f13016h = 2;
                                                                break;
                                                            case 38:
                                                                m7322l(1);
                                                                this.f13470r = 3;
                                                                this.f13466n.f13016h = 3;
                                                                break;
                                                            case BuildConfig.VERSION_CODE /* 39 */:
                                                                m7322l(1);
                                                                this.f13470r = 4;
                                                                this.f13466n.f13016h = 4;
                                                                break;
                                                            default:
                                                                i4 = this.f13469q;
                                                                if (i4 != 0) {
                                                                    if (b2 != 33) {
                                                                        switch (b2) {
                                                                            case 44:
                                                                                this.f13467o = Collections.EMPTY_LIST;
                                                                                if (i4 != 1) {
                                                                                    m7321k();
                                                                                } else {
                                                                                    m7321k();
                                                                                }
                                                                                break;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                if (i4 == 1) {
                                                                                    C1632yl c1632yl1114 = this.f13466n;
                                                                                    arrayList = c1632yl1114.f13010b;
                                                                                    arrayList.add(c1632yl1114.m7093d());
                                                                                    c1632yl1114.f13011c.setLength(0);
                                                                                    c1632yl1114.f13009a.clear();
                                                                                    iMin = Math.min(c1632yl1114.f13016h, c1632yl1114.f13012d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                m7321k();
                                                                                break;
                                                                            case LinuxInputConstants.ABS_MT_SLOT /* 47 */:
                                                                                this.f13467o = m7320j();
                                                                                m7321k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f13466n.m7091b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        m7322l(3);
                                                    }
                                                }
                                            } else if ((b & 240) != 16) {
                                                if (i2 != 23) {
                                                    if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            m7322l(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                                                                    m7322l(1);
                                                                    this.f13470r = 2;
                                                                    this.f13466n.f13016h = 2;
                                                                    break;
                                                                case 38:
                                                                    m7322l(1);
                                                                    this.f13470r = 3;
                                                                    this.f13466n.f13016h = 3;
                                                                    break;
                                                                case BuildConfig.VERSION_CODE /* 39 */:
                                                                    m7322l(1);
                                                                    this.f13470r = 4;
                                                                    this.f13466n.f13016h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.f13469q;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.f13467o = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        m7321k();
                                                                                    } else {
                                                                                        m7321k();
                                                                                    }
                                                                                    break;
                                                                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                    if (i4 == 1) {
                                                                                        C1632yl c1632yl1115 = this.f13466n;
                                                                                        arrayList = c1632yl1115.f13010b;
                                                                                        arrayList.add(c1632yl1115.m7093d());
                                                                                        c1632yl1115.f13011c.setLength(0);
                                                                                        c1632yl1115.f13009a.clear();
                                                                                        iMin = Math.min(c1632yl1115.f13016h, c1632yl1115.f13012d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    m7321k();
                                                                                    break;
                                                                                case LinuxInputConstants.ABS_MT_SLOT /* 47 */:
                                                                                    this.f13467o = m7320j();
                                                                                    m7321k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f13466n.m7091b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            m7322l(3);
                                                        }
                                                    }
                                                } else if (i3 == 20) {
                                                    if (b2 == 32) {
                                                        m7322l(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                                                                m7322l(1);
                                                                this.f13470r = 2;
                                                                this.f13466n.f13016h = 2;
                                                                break;
                                                            case 38:
                                                                m7322l(1);
                                                                this.f13470r = 3;
                                                                this.f13466n.f13016h = 3;
                                                                break;
                                                            case BuildConfig.VERSION_CODE /* 39 */:
                                                                m7322l(1);
                                                                this.f13470r = 4;
                                                                this.f13466n.f13016h = 4;
                                                                break;
                                                            default:
                                                                i4 = this.f13469q;
                                                                if (i4 != 0) {
                                                                    if (b2 != 33) {
                                                                        switch (b2) {
                                                                            case 44:
                                                                                this.f13467o = Collections.EMPTY_LIST;
                                                                                if (i4 != 1) {
                                                                                    m7321k();
                                                                                } else {
                                                                                    m7321k();
                                                                                }
                                                                                break;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                if (i4 == 1) {
                                                                                    C1632yl c1632yl1116 = this.f13466n;
                                                                                    arrayList = c1632yl1116.f13010b;
                                                                                    arrayList.add(c1632yl1116.m7093d());
                                                                                    c1632yl1116.f13011c.setLength(0);
                                                                                    c1632yl1116.f13009a.clear();
                                                                                    iMin = Math.min(c1632yl1116.f13016h, c1632yl1116.f13012d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                m7321k();
                                                                                break;
                                                                            case LinuxInputConstants.ABS_MT_SLOT /* 47 */:
                                                                                this.f13467o = m7320j();
                                                                                m7321k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f13466n.m7091b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        m7322l(3);
                                                    }
                                                }
                                            } else if (i2 != 23) {
                                                if (i3 == 20) {
                                                    if (b2 == 32) {
                                                        m7322l(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                                                                m7322l(1);
                                                                this.f13470r = 2;
                                                                this.f13466n.f13016h = 2;
                                                                break;
                                                            case 38:
                                                                m7322l(1);
                                                                this.f13470r = 3;
                                                                this.f13466n.f13016h = 3;
                                                                break;
                                                            case BuildConfig.VERSION_CODE /* 39 */:
                                                                m7322l(1);
                                                                this.f13470r = 4;
                                                                this.f13466n.f13016h = 4;
                                                                break;
                                                            default:
                                                                i4 = this.f13469q;
                                                                if (i4 != 0) {
                                                                    if (b2 != 33) {
                                                                        switch (b2) {
                                                                            case 44:
                                                                                this.f13467o = Collections.EMPTY_LIST;
                                                                                if (i4 != 1) {
                                                                                    m7321k();
                                                                                } else {
                                                                                    m7321k();
                                                                                }
                                                                                break;
                                                                            case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                                if (i4 == 1) {
                                                                                    C1632yl c1632yl1117 = this.f13466n;
                                                                                    arrayList = c1632yl1117.f13010b;
                                                                                    arrayList.add(c1632yl1117.m7093d());
                                                                                    c1632yl1117.f13011c.setLength(0);
                                                                                    c1632yl1117.f13009a.clear();
                                                                                    iMin = Math.min(c1632yl1117.f13016h, c1632yl1117.f13012d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                m7321k();
                                                                                break;
                                                                            case LinuxInputConstants.ABS_MT_SLOT /* 47 */:
                                                                                this.f13467o = m7320j();
                                                                                m7321k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f13466n.m7091b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        m7322l(3);
                                                    }
                                                }
                                            } else if (i3 == 20) {
                                                if (b2 == 32) {
                                                    m7322l(2);
                                                } else if (b2 != 41) {
                                                    switch (b2) {
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                                                            m7322l(1);
                                                            this.f13470r = 2;
                                                            this.f13466n.f13016h = 2;
                                                            break;
                                                        case 38:
                                                            m7322l(1);
                                                            this.f13470r = 3;
                                                            this.f13466n.f13016h = 3;
                                                            break;
                                                        case BuildConfig.VERSION_CODE /* 39 */:
                                                            m7322l(1);
                                                            this.f13470r = 4;
                                                            this.f13466n.f13016h = 4;
                                                            break;
                                                        default:
                                                            i4 = this.f13469q;
                                                            if (i4 != 0) {
                                                                if (b2 != 33) {
                                                                    switch (b2) {
                                                                        case 44:
                                                                            this.f13467o = Collections.EMPTY_LIST;
                                                                            if (i4 != 1) {
                                                                                m7321k();
                                                                            } else {
                                                                                m7321k();
                                                                            }
                                                                            break;
                                                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                                            if (i4 == 1) {
                                                                                C1632yl c1632yl1118 = this.f13466n;
                                                                                arrayList = c1632yl1118.f13010b;
                                                                                arrayList.add(c1632yl1118.m7093d());
                                                                                c1632yl1118.f13011c.setLength(0);
                                                                                c1632yl1118.f13009a.clear();
                                                                                iMin = Math.min(c1632yl1118.f13016h, c1632yl1118.f13012d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            m7321k();
                                                                            break;
                                                                        case LinuxInputConstants.ABS_MT_SLOT /* 47 */:
                                                                            this.f13467o = m7320j();
                                                                            m7321k();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.f13466n.m7091b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    m7322l(3);
                                                }
                                            }
                                        }
                                    } else {
                                        C1632yl c1632yl20 = this.f13466n;
                                        iArr = f13454C;
                                        c1632yl20.m7090a((char) iArr[(b & 127) - 32]);
                                        if ((b2 & 224) != 0) {
                                            this.f13466n.m7090a((char) iArr[(b2 & 127) - 32]);
                                        }
                                    }
                                    z2 = true;
                                }
                            }
                        } else if (z3) {
                            m7321k();
                            z2 = true;
                        }
                    }
                }
            }
        }
    }

    @Override // p000.AbstractC0682gm, p000.InterfaceC1385rx
    /* JADX INFO: renamed from: h */
    public final C0645fm mo3012c() {
        C0645fm c0645fm;
        C0645fm c0645fmMo3012c = super.mo3012c();
        if (c0645fmMo3012c != null) {
            return c0645fmMo3012c;
        }
        long j = this.f13464l;
        if (j == -9223372036854775807L) {
            return null;
        }
        long j2 = this.f13477y;
        if (j2 == -9223372036854775807L || this.f4239e - j2 < j || (c0645fm = (C0645fm) this.f4236b.pollFirst()) == null) {
            return null;
        }
        this.f13467o = Collections.EMPTY_LIST;
        this.f13477y = -9223372036854775807L;
        C0719hm c0719hmMo2367f = mo2367f();
        long j3 = this.f4239e;
        c0645fm.f12349g = j3;
        c0645fm.f3850n = c0719hmMo2367f;
        c0645fm.f3851o = j3;
        return c0645fm;
    }

    @Override // p000.AbstractC0682gm
    /* JADX INFO: renamed from: i */
    public final boolean mo2369i() {
        return this.f13467o != this.f13468p;
    }

    /* JADX INFO: renamed from: j */
    public final ArrayList m7320j() {
        ArrayList arrayList = this.f13465m;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int iMin = 2;
        for (int i = 0; i < size; i++) {
            C0805jv c0805jvM7092c = ((C1632yl) arrayList.get(i)).m7092c(Integer.MIN_VALUE);
            arrayList2.add(c0805jvM7092c);
            if (c0805jvM7092c != null) {
                iMin = Math.min(iMin, c0805jvM7092c.f5562i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            C0805jv c0805jvM7092c2 = (C0805jv) arrayList2.get(i2);
            if (c0805jvM7092c2 != null) {
                if (c0805jvM7092c2.f5562i != iMin) {
                    c0805jvM7092c2 = ((C1632yl) arrayList.get(i2)).m7092c(iMin);
                    c0805jvM7092c2.getClass();
                }
                arrayList3.add(c0805jvM7092c2);
            }
        }
        return arrayList3;
    }

    /* JADX INFO: renamed from: k */
    public final void m7321k() {
        C1632yl c1632yl = this.f13466n;
        c1632yl.f13015g = this.f13469q;
        c1632yl.f13009a.clear();
        c1632yl.f13010b.clear();
        c1632yl.f13011c.setLength(0);
        c1632yl.f13012d = 15;
        c1632yl.f13013e = 0;
        c1632yl.f13014f = 0;
        ArrayList arrayList = this.f13465m;
        arrayList.clear();
        arrayList.add(this.f13466n);
    }

    /* JADX INFO: renamed from: l */
    public final void m7322l(int i) {
        int i2 = this.f13469q;
        if (i2 == i) {
            return;
        }
        this.f13469q = i;
        if (i != 3) {
            m7321k();
            if (i2 == 3 || i == 1 || i == 0) {
                this.f13467o = Collections.EMPTY_LIST;
                return;
            }
            return;
        }
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f13465m;
            if (i3 >= arrayList.size()) {
                return;
            }
            ((C1632yl) arrayList.get(i3)).f13015g = i;
            i3++;
        }
    }

    @Override // p000.AbstractC0682gm, p000.InterfaceC1385rx
    public final void release() {
    }
}
