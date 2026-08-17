package p000;

import com.example.ssmousepro.injection.InjectionMetrics;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: m */
/* JADX INFO: loaded from: classes3.dex */
public final class C1090m extends FilterInputStream {

    /* JADX INFO: renamed from: a */
    public final int f6568a;

    /* JADX INFO: renamed from: b */
    public final boolean f6569b;

    /* JADX INFO: renamed from: c */
    public final byte[][] f6570c;

    public C1090m(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length, true);
    }

    /* JADX INFO: renamed from: d */
    public static AbstractC1536w m4333d(int i, h10 h10Var, byte[][] bArr) throws IOException {
        try {
            switch (i) {
                case 1:
                    return C0659g.m2880u(m4335g(h10Var, bArr));
                case 2:
                    return new C1127n(h10Var.m3089d());
                case 3:
                    return AbstractC0585e.m2433u(h10Var.m3089d());
                case 4:
                    return new C1123mw(h10Var.m3089d());
                case 5:
                    if (h10Var.m3089d().length == 0) {
                        return C1049kw.f6045a;
                    }
                    throw new IllegalStateException("malformed NULL encoding encountered");
                case 6:
                    C1351r.m5632v(h10Var.f4388d);
                    return C1351r.m5633w(m4335g(h10Var, bArr), true);
                case 7:
                    return new C1277p(new C0768iw(h10Var.m3089d()));
                case 8:
                case 9:
                case 11:
                case 15:
                case 16:
                case 17:
                case 29:
                default:
                    throw new IOException("unknown tag " + i + " encountered");
                case 10:
                    return C0772j.m3524u(m4335g(h10Var, bArr), true);
                case 12:
                    return new C1421sw(h10Var.m3089d());
                case 13:
                    int i2 = h10Var.f4388d;
                    ConcurrentHashMap concurrentHashMap = C1573x.f12387c;
                    if (i2 <= 4096) {
                        return C1573x.m6849u(m4335g(h10Var, bArr), true);
                    }
                    throw new IllegalArgumentException("exceeded relative OID contents length limit");
                case 14:
                case InjectionMetrics.I_APPLY_DELTA /* 31 */:
                case 32:
                case InjectionMetrics.I_KEY_EVENTS /* 33 */:
                case InjectionMetrics.I_TOQUES_ATIVOS /* 34 */:
                case InjectionMetrics.SNAPSHOT_LEN /* 35 */:
                case 36:
                    throw new IOException("unsupported tag " + i + " encountered");
                case 18:
                    return new C1086lw(h10Var.m3089d());
                case 19:
                    return new C1273ow(h10Var.m3089d());
                case 20:
                    return new C1384rw(h10Var.m3089d());
                case 21:
                    return new C1495uw(h10Var.m3089d());
                case 22:
                    return new C0806jw(h10Var.m3089d());
                case 23:
                    return new C0118c0(h10Var.m3089d());
                case 24:
                    return new C1053l(h10Var.m3089d());
                case 25:
                    return new C0768iw(h10Var.m3089d());
                case InjectionMetrics.I_MAX_ACTIVE_REJ /* 26 */:
                    return new C1532vw(h10Var.m3089d());
                case InjectionMetrics.I_TAP_ID_EXHAUST /* 27 */:
                    return new C0692gw(h10Var.m3089d());
                case InjectionMetrics.I_AIM_LOOP_TICKS /* 28 */:
                    return new C1458tw(h10Var.m3089d());
                case 30:
                    return new C0581dw(m4334e(h10Var));
            }
        } catch (IllegalArgumentException e) {
            throw new C0810k(e, e.getMessage());
        } catch (IllegalStateException e2) {
            throw new C0810k(e2, e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: e */
    public static char[] m4334e(h10 h10Var) throws IOException {
        int i = h10Var.f4388d;
        if ((i & 1) != 0) {
            ca0.m1178j("malformed BMPString encoding encountered");
            return null;
        }
        int i2 = i / 2;
        char[] cArr = new char[i2];
        byte[] bArr = new byte[8];
        int i3 = 0;
        int i4 = 0;
        while (i >= 8) {
            if (o21.m4676p0(h10Var, bArr, 8) != 8) {
                throw new EOFException("EOF encountered in middle of BMPString");
            }
            cArr[i4] = (char) ((bArr[0] << 8) | (bArr[1] & 255));
            cArr[i4 + 1] = (char) ((bArr[2] << 8) | (bArr[3] & 255));
            cArr[i4 + 2] = (char) ((bArr[4] << 8) | (bArr[5] & 255));
            cArr[i4 + 3] = (char) ((bArr[6] << 8) | (bArr[7] & 255));
            i4 += 4;
            i -= 8;
        }
        if (i > 0) {
            if (o21.m4676p0(h10Var, bArr, i) != i) {
                throw new EOFException("EOF encountered in middle of BMPString");
            }
            do {
                int i5 = i3 + 1;
                int i6 = bArr[i3] << 8;
                i3 += 2;
                cArr[i4] = (char) ((bArr[i5] & 255) | i6);
                i4++;
            } while (i3 < i);
        }
        if (h10Var.f4388d == 0 && i2 == i4) {
            return cArr;
        }
        l41.m4046o();
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static byte[] m4335g(h10 h10Var, byte[][] bArr) throws IOException {
        int i = h10Var.f4388d;
        if (i >= bArr.length) {
            return h10Var.m3089d();
        }
        byte[] bArr2 = bArr[i];
        if (bArr2 == null) {
            bArr2 = new byte[i];
            bArr[i] = bArr2;
        }
        if (i != bArr2.length) {
            f40.m2713i("buffer length not right for data");
            return null;
        }
        if (i == 0) {
            return bArr2;
        }
        int i2 = h10Var.f9571b;
        if (i >= i2) {
            throw new IOException("corrupted stream - out of bounds length found: " + h10Var.f4388d + " >= " + i2);
        }
        int iM4676p0 = i - o21.m4676p0(h10Var.f9570a, bArr2, bArr2.length);
        h10Var.f4388d = iM4676p0;
        if (iM4676p0 == 0) {
            h10Var.m5606c();
            return bArr2;
        }
        f40.m2709e(h10Var.f4387c, h10Var.f4388d);
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static int m4336j(InputStream inputStream, int i, boolean z) {
        String strM5338e;
        int i2 = inputStream.read();
        if ((i2 >>> 7) == 0) {
            return i2;
        }
        if (128 == i2) {
            return -1;
        }
        if (i2 < 0) {
            throw new EOFException("EOF found when length expected");
        }
        if (255 != i2) {
            int i3 = i2 & 127;
            int i4 = 0;
            int i5 = 0;
            do {
                int i6 = inputStream.read();
                if (i6 < 0) {
                    throw new EOFException("EOF found reading length");
                }
                if ((i4 >>> 23) == 0) {
                    i4 = (i4 << 8) + i6;
                    i5++;
                } else {
                    strM5338e = "long form definite-length more than 31 bits";
                }
            } while (i5 < i3);
            if (i4 < i || z) {
                return i4;
            }
            strM5338e = AbstractC1308pu.m5338e("corrupted stream - out of bounds length found: ", i4, i, " >= ");
        } else {
            strM5338e = "invalid long form definite-length 0xFF";
        }
        ca0.m1178j(strM5338e);
        return 0;
    }

    /* JADX INFO: renamed from: o */
    public static int m4337o(int i, InputStream inputStream) {
        String str;
        int i2 = i & 31;
        if (i2 != 31) {
            return i2;
        }
        int i3 = inputStream.read();
        if (i3 >= 31) {
            int i4 = i3 & 127;
            if (i4 != 0) {
                while ((i3 & 128) != 0) {
                    if ((i4 >>> 24) == 0) {
                        int i5 = i4 << 7;
                        int i6 = inputStream.read();
                        if (i6 < 0) {
                            throw new EOFException("EOF found inside tag value.");
                        }
                        i4 = i5 | (i6 & 127);
                        i3 = i6;
                    } else {
                        str = "Tag number more than 31 bits";
                    }
                }
                return i4;
            }
            str = "corrupted stream - invalid high tag number found";
        } else {
            if (i3 < 0) {
                throw new EOFException("EOF found inside tag value.");
            }
            str = "corrupted stream - high tag number < 31 found";
        }
        ca0.m1178j(str);
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC1536w m4338c(int i, int i2, int i3) throws IOException {
        h10 h10Var = new h10(this, i3, this.f6568a);
        if ((i & 224) == 0) {
            return m4333d(i2, h10Var, this.f6570c);
        }
        int i4 = i & 192;
        int i5 = 3;
        int i6 = 4;
        int i7 = 0;
        if (i4 != 0) {
            if ((i & 32) == 0) {
                return new C0827kg(i6, i4, i2, new C1123mw(h10Var.m3089d()), 2);
            }
            C0733i c0733iM4340p = m4340p(h10Var);
            return c0733iM4340p.f4753c == 1 ? new C0827kg(i5, i4, i2, c0733iM4340p.m3325c(0), 2) : new C0827kg(i6, i4, i2, AbstractC1643yw.m7156a(c0733iM4340p), 2);
        }
        if (i2 == 3) {
            C0733i c0733iM4340p2 = m4340p(h10Var);
            int i8 = c0733iM4340p2.f4753c;
            AbstractC0585e[] abstractC0585eArr = new AbstractC0585e[i8];
            while (i7 != i8) {
                InterfaceC0696h interfaceC0696hM3325c = c0733iM4340p2.m3325c(i7);
                if (!(interfaceC0696hM3325c instanceof AbstractC0585e)) {
                    f40.m2712h(interfaceC0696hM3325c.getClass(), "unknown object encountered in constructed BIT STRING: ");
                    return null;
                }
                abstractC0585eArr[i7] = (AbstractC0585e) interfaceC0696hM3325c;
                i7++;
            }
            return new C0134cg(abstractC0585eArr);
        }
        if (i2 == 4) {
            C0733i c0733iM4340p3 = m4340p(h10Var);
            int i9 = c0733iM4340p3.f4753c;
            AbstractC1388s[] abstractC1388sArr = new AbstractC1388s[i9];
            while (i7 != i9) {
                InterfaceC0696h interfaceC0696hM3325c2 = c0733iM4340p3.m3325c(i7);
                if (!(interfaceC0696hM3325c2 instanceof AbstractC1388s)) {
                    f40.m2712h(interfaceC0696hM3325c2.getClass(), "unknown object encountered in constructed OCTET STRING: ");
                    return null;
                }
                abstractC1388sArr[i7] = (AbstractC1388s) interfaceC0696hM3325c2;
                i7++;
            }
            return new C0639fg(C0639fg.m2804v(abstractC1388sArr), abstractC1388sArr);
        }
        if (i2 == 8) {
            C1310pw c1310pwM7156a = AbstractC1643yw.m7156a(m4340p(h10Var));
            c1310pwM7156a.getClass();
            return new C0655fw(c1310pwM7156a);
        }
        if (i2 != 16) {
            if (i2 == 17) {
                return AbstractC1643yw.m7157b(m4340p(h10Var));
            }
            ca0.m1178j(jd0.m3610h(i2, "unknown tag ", " encountered"));
            return null;
        }
        if (h10Var.f4388d < 1) {
            return AbstractC1643yw.f13157a;
        }
        if (!this.f6569b) {
            return AbstractC1643yw.m7156a(m4340p(h10Var));
        }
        byte[] bArrM3089d = h10Var.m3089d();
        wr0 wr0Var = new wr0();
        wr0Var.f12255c = bArrM3089d;
        return wr0Var;
    }

    /* JADX WARN: Type inference failed for: r7v4, types: [byte[][], java.io.Serializable] */
    /* JADX INFO: renamed from: l */
    public final AbstractC1536w m4339l() {
        int i = read();
        if (i <= 0) {
            if (i != 0) {
                return null;
            }
            ca0.m1178j("unexpected end-of-contents marker");
            return null;
        }
        int iM4337o = m4337o(i, this);
        int i2 = this.f6568a;
        int i3 = 0;
        int iM4336j = m4336j(this, i2, false);
        if (iM4336j >= 0) {
            try {
                return m4338c(i, iM4337o, iM4336j);
            } catch (IllegalArgumentException e) {
                throw new C0810k(e, "corrupted stream detected");
            }
        }
        if ((i & 32) == 0) {
            ca0.m1178j("indefinite-length primitive encoding encountered");
            return null;
        }
        C0082b0 c0082b0 = new C0082b0(new xm0(this, i2), i2, (Serializable) this.f6570c, i3);
        int i4 = i & 192;
        if (i4 != 0) {
            return c0082b0.m810l(i4, iM4337o);
        }
        if (iM4337o == 3) {
            return C0566dg.m2349c(c0082b0);
        }
        if (iM4337o == 4) {
            return C0676gg.m2977c(c0082b0);
        }
        if (iM4337o == 8) {
            return C0749ig.m3431c(c0082b0);
        }
        if (iM4337o == 16) {
            return new C0713hg(c0082b0.m812o());
        }
        if (iM4337o == 17) {
            return new C0789jg(c0082b0.m812o());
        }
        ca0.m1178j("unknown BER object encountered");
        return null;
    }

    /* JADX INFO: renamed from: p */
    public final C0733i m4340p(h10 h10Var) {
        C1090m c1090m;
        AbstractC1536w abstractC1536wM4339l;
        int i = h10Var.f4388d;
        if (i >= 1 && (abstractC1536wM4339l = (c1090m = new C1090m(h10Var, i, this.f6569b, this.f6570c)).m4339l()) != null) {
            C0733i c0733i = new C0733i();
            do {
                c0733i.m3324b(abstractC1536wM4339l);
                abstractC1536wM4339l = c1090m.m4339l();
            } while (abstractC1536wM4339l != null);
            return c0733i;
        }
        return new C0733i(0);
    }

    public C1090m(InputStream inputStream, int i, boolean z, byte[][] bArr) {
        super(inputStream);
        this.f6568a = i;
        this.f6569b = z;
        this.f6570c = bArr;
    }

    public C1090m(ByteArrayInputStream byteArrayInputStream, int i, boolean z) {
        this(byteArrayInputStream, i, z, new byte[11][]);
    }
}
