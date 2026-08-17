package p000;

import android.sun.security.util.DerValue;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class fg0 implements x80 {

    /* JADX INFO: renamed from: J */
    public static final byte[] f3780J = {-94, 57, 79, 82, 90, -101, 79, DerValue.tag_T61String, -94, 68, 108, 66, 124, 100, -115, -12};

    /* JADX INFO: renamed from: K */
    public static final be0 f3781K;

    /* JADX INFO: renamed from: A */
    public int f3782A;

    /* JADX INFO: renamed from: B */
    public int f3783B;

    /* JADX INFO: renamed from: C */
    public int f3784C;

    /* JADX INFO: renamed from: D */
    public boolean f3785D;

    /* JADX INFO: renamed from: E */
    public boolean f3786E;

    /* JADX INFO: renamed from: F */
    public z80 f3787F;

    /* JADX INFO: renamed from: G */
    public c22[] f3788G;

    /* JADX INFO: renamed from: H */
    public c22[] f3789H;

    /* JADX INFO: renamed from: I */
    public boolean f3790I;

    /* JADX INFO: renamed from: a */
    public final wx1 f3791a;

    /* JADX INFO: renamed from: b */
    public final int f3792b;

    /* JADX INFO: renamed from: c */
    public final List f3793c;

    /* JADX INFO: renamed from: d */
    public final SparseArray f3794d;

    /* JADX INFO: renamed from: e */
    public final dc1 f3795e;

    /* JADX INFO: renamed from: f */
    public final dc1 f3796f;

    /* JADX INFO: renamed from: g */
    public final dc1 f3797g;

    /* JADX INFO: renamed from: h */
    public final byte[] f3798h;

    /* JADX INFO: renamed from: i */
    public final dc1 f3799i;

    /* JADX INFO: renamed from: j */
    public final C0558d8 f3800j;

    /* JADX INFO: renamed from: k */
    public final dc1 f3801k;

    /* JADX INFO: renamed from: l */
    public final ArrayDeque f3802l;

    /* JADX INFO: renamed from: m */
    public final ArrayDeque f3803m;

    /* JADX INFO: renamed from: n */
    public final C1652z4 f3804n;

    /* JADX INFO: renamed from: o */
    public kk1 f3805o;

    /* JADX INFO: renamed from: p */
    public int f3806p;

    /* JADX INFO: renamed from: q */
    public int f3807q;

    /* JADX INFO: renamed from: r */
    public long f3808r;

    /* JADX INFO: renamed from: s */
    public int f3809s;

    /* JADX INFO: renamed from: t */
    public dc1 f3810t;

    /* JADX INFO: renamed from: u */
    public long f3811u;

    /* JADX INFO: renamed from: v */
    public int f3812v;

    /* JADX INFO: renamed from: w */
    public long f3813w;

    /* JADX INFO: renamed from: x */
    public long f3814x;

    /* JADX INFO: renamed from: y */
    public long f3815y;

    /* JADX INFO: renamed from: z */
    public eg0 f3816z;

    static {
        ae0 ae0Var = new ae0();
        ae0Var.f197m = v51.m6582l("application/x-emsg");
        f3781K = new be0(ae0Var);
    }

    public fg0(wx1 wx1Var, int i) {
        om0 om0Var = qm0.f9540b;
        kk1 kk1Var = kk1.f5896e;
        this.f3791a = wx1Var;
        this.f3792b = i;
        this.f3793c = Collections.unmodifiableList(kk1Var);
        this.f3800j = new C0558d8((byte) 0, 22);
        this.f3801k = new dc1(16);
        this.f3795e = new dc1(o21.f7628c);
        this.f3796f = new dc1(5);
        this.f3797g = new dc1();
        byte[] bArr = new byte[16];
        this.f3798h = bArr;
        this.f3799i = new dc1(bArr);
        this.f3802l = new ArrayDeque();
        this.f3803m = new ArrayDeque();
        this.f3794d = new SparseArray();
        this.f3805o = kk1Var;
        this.f3814x = -9223372036854775807L;
        this.f3813w = -9223372036854775807L;
        this.f3815y = -9223372036854775807L;
        this.f3787F = z80.f13306h;
        this.f3788G = new c22[0];
        this.f3789H = new c22[0];
        this.f3804n = new C1652z4(new C1521vl(this, 18));
    }

    /* JADX INFO: renamed from: a */
    public static z30 m2805a(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            l61 l61Var = (l61) list.get(i);
            if (l61Var.f7542b == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = l61Var.f6194g.f2882a;
                pn0 pn0VarM3200I = hp0.m3200I(bArr);
                UUID uuid = pn0VarM3200I == null ? null : (UUID) pn0VarM3200I.f8968a;
                if (uuid == null) {
                    AbstractC1337qm.m5542i0("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new y30(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new z30(null, false, (y30[]) arrayList.toArray(new y30[0]));
    }

    /* JADX INFO: renamed from: c */
    public static void m2806c(dc1 dc1Var, int i, x12 x12Var) throws fc1 {
        dc1Var.m2316F(i + 8);
        int iM2324g = dc1Var.m2324g();
        byte[] bArr = AbstractC0793jj.f5419a;
        if ((iM2324g & 1) != 0) {
            throw fc1.m2800b("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (iM2324g & 2) != 0;
        int iM2341x = dc1Var.m2341x();
        if (iM2341x == 0) {
            Arrays.fill(x12Var.f12424l, 0, x12Var.f12417e, false);
            return;
        }
        int i2 = x12Var.f12417e;
        dc1 dc1Var2 = x12Var.f12426n;
        if (iM2341x != i2) {
            StringBuilder sbM5343j = AbstractC1308pu.m5343j(iM2341x, "Senc sample count ", " is different from fragment sample count");
            sbM5343j.append(x12Var.f12417e);
            throw fc1.m2799a(null, sbM5343j.toString());
        }
        Arrays.fill(x12Var.f12424l, 0, iM2341x, z);
        dc1Var2.m2313C(dc1Var.m2318a());
        x12Var.f12423k = true;
        x12Var.f12427o = true;
        dc1Var.m2322e(0, dc1Var2.f2884c, dc1Var2.f2882a);
        dc1Var2.m2316F(0);
        x12Var.f12427o = false;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x022e  */
    @Override // p000.x80
    /* JADX INFO: renamed from: b */
    public final int mo124b(y80 y80Var, bb0 bb0Var) throws fc1 {
        C1652z4 c1652z4;
        ArrayDeque arrayDeque;
        eg0 eg0Var;
        int i;
        eg0 eg0Var2;
        boolean z;
        eg0 eg0Var3;
        int iMo1116c;
        String strM2332o;
        String str;
        long jM2339v;
        long j;
        long j2;
        long j3;
        long jM7222J;
        long jM2342y;
        long jM2342y2;
        y80 y80Var2 = y80Var;
        while (true) {
            int i2 = this.f3806p;
            ArrayDeque arrayDeque2 = this.f3802l;
            c1652z4 = this.f3804n;
            SparseArray sparseArray = this.f3794d;
            if (i2 != 0) {
                arrayDeque = this.f3803m;
                if (i2 == 1) {
                    int i3 = ((int) this.f3808r) - this.f3809s;
                    dc1 dc1Var = this.f3810t;
                    if (dc1Var != null) {
                        y80Var2.readFully(dc1Var.f2882a, 8, i3);
                        int i4 = this.f3807q;
                        l61 l61Var = new l61(i4, dc1Var);
                        long position = y80Var2.getPosition();
                        if (!arrayDeque2.isEmpty()) {
                            ((k61) arrayDeque2.peek()).f5683m.add(l61Var);
                        } else if (i4 == 1936286840) {
                            dc1Var.m2316F(8);
                            int iM3647c = AbstractC0793jj.m3647c(dc1Var.m2324g());
                            dc1Var.m2317G(4);
                            long jM2339v2 = dc1Var.m2339v();
                            if (iM3647c == 0) {
                                jM2342y = dc1Var.m2339v();
                                jM2342y2 = dc1Var.m2339v();
                            } else {
                                jM2342y = dc1Var.m2342y();
                                jM2342y2 = dc1Var.m2342y();
                            }
                            long j4 = jM2342y2 + position;
                            long j5 = jM2342y;
                            long j6 = j4;
                            int i5 = z42.f13274a;
                            long jM7222J2 = z42.m7222J(j5, 1000000L, jM2339v2, RoundingMode.DOWN);
                            dc1Var.m2317G(2);
                            int iM2343z = dc1Var.m2343z();
                            int[] iArr = new int[iM2343z];
                            long[] jArr = new long[iM2343z];
                            long[] jArr2 = new long[iM2343z];
                            long j7 = jM7222J2;
                            long[] jArr3 = new long[iM2343z];
                            int i6 = 0;
                            while (i6 < iM2343z) {
                                int iM2324g = dc1Var.m2324g();
                                if ((iM2324g & Integer.MIN_VALUE) != 0) {
                                    throw fc1.m2799a(null, "Unhandled indirect reference");
                                }
                                long jM2339v3 = dc1Var.m2339v();
                                iArr[i6] = iM2324g & Integer.MAX_VALUE;
                                jArr3[i6] = j6;
                                jArr2[i6] = j7;
                                j5 += jM2339v3;
                                int i7 = i6;
                                long[] jArr4 = jArr;
                                long[] jArr5 = jArr2;
                                long jM7222J3 = z42.m7222J(j5, 1000000L, jM2339v2, RoundingMode.DOWN);
                                jArr4[i7] = jM7222J3 - jArr5[i7];
                                dc1Var.m2317G(4);
                                jArr3 = jArr3;
                                j7 = jM7222J3;
                                i6 = i7 + 1;
                                iM2343z = iM2343z;
                                jArr = jArr4;
                                jArr2 = jArr5;
                                j6 += (long) iArr[i7];
                                jM7222J2 = jM7222J2;
                            }
                            Pair pairCreate = Pair.create(Long.valueOf(jM7222J2), new C1114mn(iArr, jArr3, jArr, jArr2));
                            this.f3815y = ((Long) pairCreate.first).longValue();
                            this.f3787F.mo752q((kq1) pairCreate.second);
                            this.f3790I = true;
                        } else if (i4 == 1701671783 && this.f3788G.length != 0) {
                            dc1Var.m2316F(8);
                            int iM3647c2 = AbstractC0793jj.m3647c(dc1Var.m2324g());
                            if (iM3647c2 == 0) {
                                strM2332o = dc1Var.m2332o();
                                strM2332o.getClass();
                                String strM2332o2 = dc1Var.m2332o();
                                strM2332o2.getClass();
                                long jM2339v4 = dc1Var.m2339v();
                                long jM2339v5 = dc1Var.m2339v();
                                RoundingMode roundingMode = RoundingMode.DOWN;
                                long jM7222J4 = z42.m7222J(jM2339v5, 1000000L, jM2339v4, roundingMode);
                                long j8 = this.f3815y;
                                long j9 = j8 != -9223372036854775807L ? j8 + jM7222J4 : -9223372036854775807L;
                                long jM7222J5 = z42.m7222J(dc1Var.m2339v(), 1000L, jM2339v4, roundingMode);
                                str = strM2332o2;
                                jM2339v = dc1Var.m2339v();
                                j = -9223372036854775807L;
                                j2 = j9;
                                j3 = jM7222J4;
                                jM7222J = jM7222J5;
                            } else if (iM3647c2 != 1) {
                                jd0.m3621s(iM3647c2, "Skipping unsupported emsg version: ", "FragmentedMp4Extractor");
                            } else {
                                long jM2339v6 = dc1Var.m2339v();
                                long jM2342y3 = dc1Var.m2342y();
                                RoundingMode roundingMode2 = RoundingMode.DOWN;
                                long jM7222J6 = z42.m7222J(jM2342y3, 1000000L, jM2339v6, roundingMode2);
                                jM7222J = z42.m7222J(dc1Var.m2339v(), 1000L, jM2339v6, roundingMode2);
                                long jM2339v7 = dc1Var.m2339v();
                                strM2332o = dc1Var.m2332o();
                                strM2332o.getClass();
                                String strM2332o3 = dc1Var.m2332o();
                                strM2332o3.getClass();
                                str = strM2332o3;
                                jM2339v = jM2339v7;
                                j3 = -9223372036854775807L;
                                j2 = jM7222J6;
                                j = -9223372036854775807L;
                            }
                            byte[] bArr = new byte[dc1Var.m2318a()];
                            long j10 = j;
                            dc1Var.m2322e(0, dc1Var.m2318a(), bArr);
                            C0558d8 c0558d8 = this.f3800j;
                            DataOutputStream dataOutputStream = (DataOutputStream) c0558d8.f2822c;
                            ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) c0558d8.f2821b;
                            byteArrayOutputStream.reset();
                            try {
                                dataOutputStream.writeBytes(strM2332o);
                                dataOutputStream.writeByte(0);
                                dataOutputStream.writeBytes(str);
                                dataOutputStream.writeByte(0);
                                dataOutputStream.writeLong(jM7222J);
                                dataOutputStream.writeLong(jM2339v);
                                dataOutputStream.write(bArr);
                                dataOutputStream.flush();
                                dc1 dc1Var2 = new dc1(byteArrayOutputStream.toByteArray());
                                int iM2318a = dc1Var2.m2318a();
                                for (c22 c22Var : this.f3788G) {
                                    dc1Var2.m2316F(0);
                                    c22Var.mo1115b(dc1Var2, iM2318a, 0);
                                }
                                if (j2 == j10) {
                                    arrayDeque.addLast(new dg0(iM2318a, true, j3));
                                    this.f3812v += iM2318a;
                                } else if (arrayDeque.isEmpty()) {
                                    for (c22 c22Var2 : this.f3788G) {
                                        c22Var2.mo1114a(j2, 1, iM2318a, 0, null);
                                    }
                                } else {
                                    arrayDeque.addLast(new dg0(iM2318a, false, j2));
                                    this.f3812v += iM2318a;
                                }
                            } catch (IOException e) {
                                ca0.m1184p(e);
                                return 0;
                            }
                        }
                        y80Var2 = y80Var;
                    } else {
                        y80Var2.mo2423m(i3);
                    }
                    m2807d(y80Var2.getPosition());
                } else if (i2 != 2) {
                    eg0Var = this.f3816z;
                    if (eg0Var != null) {
                        i = 8;
                        break;
                    }
                    int size = sparseArray.size();
                    eg0 eg0Var4 = null;
                    long j11 = Long.MAX_VALUE;
                    for (int i8 = 0; i8 < size; i8++) {
                        eg0 eg0Var5 = (eg0) sparseArray.valueAt(i8);
                        boolean z2 = eg0Var5.f3342l;
                        x12 x12Var = eg0Var5.f3332b;
                        if ((z2 || eg0Var5.f3336f != eg0Var5.f3334d.f2755b) && (!z2 || eg0Var5.f3338h != x12Var.f12416d)) {
                            long j12 = !z2 ? eg0Var5.f3334d.f2756c[eg0Var5.f3336f] : x12Var.f12418f[eg0Var5.f3338h];
                            if (j12 < j11) {
                                j11 = j12;
                                eg0Var4 = eg0Var5;
                            }
                        }
                    }
                    i = 8;
                    if (eg0Var4 != null) {
                        int position2 = (int) ((!eg0Var4.f3342l ? eg0Var4.f3334d.f2756c[eg0Var4.f3336f] : eg0Var4.f3332b.f12418f[eg0Var4.f3338h]) - y80Var2.getPosition());
                        if (position2 < 0) {
                            AbstractC1337qm.m5542i0("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                            position2 = 0;
                        }
                        y80Var2.mo2423m(position2);
                        this.f3816z = eg0Var4;
                        eg0Var = eg0Var4;
                        break;
                    }
                    int position3 = (int) (this.f3811u - y80Var2.getPosition());
                    if (position3 < 0) {
                        throw fc1.m2799a(null, "Offset to end of mdat was negative.");
                    }
                    y80Var2.mo2423m(position3);
                    this.f3806p = 0;
                    this.f3809s = 0;
                } else {
                    int size2 = sparseArray.size();
                    eg0 eg0Var6 = null;
                    long j13 = Long.MAX_VALUE;
                    for (int i9 = 0; i9 < size2; i9++) {
                        x12 x12Var2 = ((eg0) sparseArray.valueAt(i9)).f3332b;
                        if (x12Var2.f12427o) {
                            long j14 = x12Var2.f12415c;
                            if (j14 < j13) {
                                eg0Var6 = (eg0) sparseArray.valueAt(i9);
                                j13 = j14;
                            }
                        }
                    }
                    if (eg0Var6 == null) {
                        this.f3806p = 3;
                    } else {
                        int position4 = (int) (j13 - y80Var2.getPosition());
                        if (position4 < 0) {
                            throw fc1.m2799a(null, "Offset to encryption data was negative.");
                        }
                        y80Var2.mo2423m(position4);
                        x12 x12Var3 = eg0Var6.f3332b;
                        dc1 dc1Var3 = x12Var3.f12426n;
                        y80Var2.readFully(dc1Var3.f2882a, 0, dc1Var3.f2884c);
                        dc1Var3.m2316F(0);
                        x12Var3.f12427o = false;
                    }
                }
            } else {
                int i10 = this.f3809s;
                dc1 dc1Var4 = this.f3801k;
                if (i10 == 0) {
                    if (!y80Var2.mo2414b(dc1Var4.f2882a, 0, 8, true)) {
                        c1652z4.m7198i(0);
                        return -1;
                    }
                    this.f3809s = 8;
                    dc1Var4.m2316F(0);
                    this.f3808r = dc1Var4.m2339v();
                    this.f3807q = dc1Var4.m2324g();
                }
                long j15 = this.f3808r;
                if (j15 == 1) {
                    y80Var2.readFully(dc1Var4.f2882a, 8, 8);
                    this.f3809s += 8;
                    this.f3808r = dc1Var4.m2342y();
                } else if (j15 == 0) {
                    long jMo2420i = y80Var2.mo2420i();
                    if (jMo2420i == -1 && !arrayDeque2.isEmpty()) {
                        jMo2420i = ((k61) arrayDeque2.peek()).f5682g;
                    }
                    if (jMo2420i != -1) {
                        this.f3808r = (jMo2420i - y80Var2.getPosition()) + ((long) this.f3809s);
                    }
                }
                if (this.f3808r < this.f3809s) {
                    throw fc1.m2800b("Atom size less than header length (unsupported).");
                }
                long position5 = y80Var2.getPosition() - ((long) this.f3809s);
                int i11 = this.f3807q;
                if ((i11 == 1836019558 || i11 == 1835295092) && !this.f3790I) {
                    this.f3787F.mo752q(new C0825ke(this.f3814x, position5));
                    this.f3790I = true;
                }
                if (this.f3807q == 1836019558) {
                    int size3 = sparseArray.size();
                    for (int i12 = 0; i12 < size3; i12++) {
                        x12 x12Var4 = ((eg0) sparseArray.valueAt(i12)).f3332b;
                        x12Var4.getClass();
                        x12Var4.f12415c = position5;
                        x12Var4.f12414b = position5;
                    }
                }
                int i13 = this.f3807q;
                if (i13 == 1835295092) {
                    this.f3816z = null;
                    this.f3811u = position5 + this.f3808r;
                    this.f3806p = 2;
                } else if (i13 == 1836019574 || i13 == 1953653099 || i13 == 1835297121 || i13 == 1835626086 || i13 == 1937007212 || i13 == 1836019558 || i13 == 1953653094 || i13 == 1836475768 || i13 == 1701082227) {
                    long position6 = (y80Var2.getPosition() + this.f3808r) - 8;
                    arrayDeque2.push(new k61(this.f3807q, position6));
                    if (this.f3808r == this.f3809s) {
                        m2807d(position6);
                    } else {
                        this.f3806p = 0;
                        this.f3809s = 0;
                    }
                } else if (i13 == 1751411826 || i13 == 1835296868 || i13 == 1836476516 || i13 == 1936286840 || i13 == 1937011556 || i13 == 1937011827 || i13 == 1668576371 || i13 == 1937011555 || i13 == 1937011578 || i13 == 1937013298 || i13 == 1937007471 || i13 == 1668232756 || i13 == 1937011571 || i13 == 1952867444 || i13 == 1952868452 || i13 == 1953196132 || i13 == 1953654136 || i13 == 1953658222 || i13 == 1886614376 || i13 == 1935763834 || i13 == 1935763823 || i13 == 1936027235 || i13 == 1970628964 || i13 == 1935828848 || i13 == 1936158820 || i13 == 1701606260 || i13 == 1835362404 || i13 == 1701671783) {
                    if (this.f3809s != 8) {
                        throw fc1.m2800b("Leaf atom defines extended atom size (unsupported).");
                    }
                    if (this.f3808r > 2147483647L) {
                        throw fc1.m2800b("Leaf atom with length > 2147483647 (unsupported).");
                    }
                    dc1 dc1Var5 = new dc1((int) this.f3808r);
                    System.arraycopy(dc1Var4.f2882a, 0, dc1Var5.f2882a, 0, 8);
                    this.f3810t = dc1Var5;
                    this.f3806p = 1;
                } else {
                    if (this.f3808r > 2147483647L) {
                        throw fc1.m2800b("Skipping atom with length > 2147483647 (unsupported).");
                    }
                    this.f3810t = null;
                    this.f3806p = 1;
                }
            }
        }
        x12 x12Var5 = eg0Var.f3332b;
        int i14 = this.f3806p;
        int i15 = this.f3792b;
        if (i14 == 3) {
            this.f3782A = !eg0Var.f3342l ? eg0Var.f3334d.f2757d[eg0Var.f3336f] : x12Var5.f12420h[eg0Var.f3336f];
            this.f3785D = (i15 & 64) == 0 || !Objects.equals(eg0Var.f3334d.f2754a.f11490g.f1341n, "video/avc");
            if (eg0Var.f3336f < eg0Var.f3339i) {
                y80Var2.mo2423m(this.f3782A);
                w12 w12VarM2582b = eg0Var.m2582b();
                if (w12VarM2582b != null) {
                    dc1 dc1Var6 = x12Var5.f12426n;
                    int i16 = w12VarM2582b.f11907d;
                    if (i16 != 0) {
                        dc1Var6.m2317G(i16);
                    }
                    int i17 = eg0Var.f3336f;
                    if (x12Var5.f12423k && x12Var5.f12424l[i17]) {
                        dc1Var6.m2317G(dc1Var6.m2343z() * 6);
                    }
                }
                if (!eg0Var.m2583c()) {
                    this.f3816z = null;
                }
                this.f3806p = 3;
                return 0;
            }
            if (eg0Var.f3334d.f2754a.f11491h == 1) {
                this.f3782A -= 8;
                y80Var2.mo2423m(i);
            }
            boolean zEquals = "audio/ac4".equals(eg0Var.f3334d.f2754a.f11490g.f1341n);
            int i18 = this.f3782A;
            if (zEquals) {
                this.f3783B = eg0Var.m2584d(i18, 7);
                int i19 = this.f3782A;
                dc1 dc1Var7 = this.f3799i;
                o21.m4637C(i19, dc1Var7);
                eg0Var.f3331a.mo1115b(dc1Var7, 7, 0);
                this.f3783B += 7;
            } else {
                this.f3783B = eg0Var.m2584d(i18, 0);
            }
            this.f3782A += this.f3783B;
            this.f3806p = 4;
            this.f3784C = 0;
        }
        d22 d22Var = eg0Var.f3334d;
        v12 v12Var = d22Var.f2754a;
        c22 c22Var3 = eg0Var.f3331a;
        long j16 = eg0Var.f3342l ? x12Var5.f12421i[eg0Var.f3336f] : d22Var.f2759f[eg0Var.f3336f];
        int i20 = v12Var.f11494k;
        be0 be0Var = v12Var.f11490g;
        if (i20 == 0) {
            eg0Var2 = eg0Var;
            i15 = i15;
            while (true) {
                int i21 = this.f3783B;
                int i22 = this.f3782A;
                if (i21 >= i22) {
                    break;
                }
                this.f3783B += c22Var3.mo1116c(y80Var2, i22 - i21, false);
            }
        } else {
            dc1 dc1Var8 = this.f3796f;
            byte[] bArr2 = dc1Var8.f2882a;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i23 = i20 + 1;
            int i24 = 4 - i20;
            while (true) {
                i15 = i15;
                if (this.f3783B >= this.f3782A) {
                    eg0Var2 = eg0Var;
                    break;
                }
                int i25 = this.f3784C;
                if (i25 == 0) {
                    y80Var2.readFully(bArr2, i24, i23);
                    dc1Var8.m2316F(0);
                    int iM2324g2 = dc1Var8.m2324g();
                    int i26 = i23;
                    if (iM2324g2 < 1) {
                        throw fc1.m2799a(null, "Invalid NAL length");
                    }
                    this.f3784C = iM2324g2 - 1;
                    dc1 dc1Var9 = this.f3795e;
                    dc1Var9.m2316F(0);
                    byte[] bArr3 = bArr2;
                    c22Var3.mo1115b(dc1Var9, 4, 0);
                    c22Var3.mo1115b(dc1Var8, 1, 0);
                    if (this.f3789H.length > 0) {
                        byte b = bArr3[4];
                        String str2 = be0Var.f1341n;
                        String str3 = be0Var.f1338k;
                        if ((!Objects.equals(str2, "video/avc") && !v51.m6571a(str3, "video/avc")) || (b & 31) != 6) {
                            if ((Objects.equals(be0Var.f1341n, "video/hevc") || v51.m6571a(str3, "video/hevc")) && ((b & 126) >> 1) == 39) {
                            }
                            this.f3786E = z;
                            this.f3783B += 5;
                            this.f3782A += i24;
                            if (!this.f3785D && Objects.equals(eg0Var.f3334d.f2754a.f11490g.f1341n, "video/avc") && o21.m4648S(bArr3[4])) {
                                this.f3785D = true;
                            }
                            i23 = i26;
                            bArr2 = bArr3;
                        }
                        z = true;
                        this.f3786E = z;
                        this.f3783B += 5;
                        this.f3782A += i24;
                        if (!this.f3785D) {
                            this.f3785D = true;
                        }
                        i23 = i26;
                        bArr2 = bArr3;
                    }
                    z = false;
                    this.f3786E = z;
                    this.f3783B += 5;
                    this.f3782A += i24;
                    if (!this.f3785D) {
                        this.f3785D = true;
                    }
                    i23 = i26;
                    bArr2 = bArr3;
                } else {
                    int i27 = i23;
                    byte[] bArr4 = bArr2;
                    if (this.f3786E) {
                        dc1 dc1Var10 = this.f3797g;
                        dc1Var10.m2313C(i25);
                        eg0Var3 = eg0Var;
                        y80Var2.readFully(dc1Var10.f2882a, 0, this.f3784C);
                        c22Var3.mo1115b(dc1Var10, this.f3784C, 0);
                        iMo1116c = this.f3784C;
                        int iM4689x0 = o21.m4689x0(dc1Var10.f2884c, dc1Var10.f2882a);
                        dc1Var10.m2316F((Objects.equals(be0Var.f1341n, "video/hevc") || v51.m6571a(be0Var.f1338k, "video/hevc")) ? 1 : 0);
                        dc1Var10.m2315E(iM4689x0);
                        int i28 = be0Var.f1343p;
                        if (i28 == -1) {
                            if (c1652z4.f13266a != 0) {
                                c1652z4.f13266a = 0;
                                c1652z4.m7198i(0);
                            }
                        } else if (c1652z4.f13266a != i28) {
                            ki0.m3864h(i28 >= 0);
                            c1652z4.f13266a = i28;
                            c1652z4.m7198i(i28);
                        }
                        c1652z4.m7190a(j16, dc1Var10);
                        if ((eg0Var3.m2581a() & 4) != 0) {
                            c1652z4.m7198i(0);
                        }
                    } else {
                        eg0Var3 = eg0Var;
                        iMo1116c = c22Var3.mo1116c(y80Var2, i25, false);
                    }
                    this.f3783B += iMo1116c;
                    this.f3784C -= iMo1116c;
                    i23 = i27;
                    bArr2 = bArr4;
                    eg0Var = eg0Var3;
                }
            }
        }
        int iM2581a = eg0Var2.m2581a();
        if ((i15 & 64) != 0 && !this.f3785D) {
            iM2581a |= 67108864;
        }
        int i29 = iM2581a;
        w12 w12VarM2582b2 = eg0Var2.m2582b();
        long j17 = j16;
        c22Var3.mo1114a(j17, i29, this.f3782A, 0, w12VarM2582b2 != null ? w12VarM2582b2.f11906c : null);
        while (!arrayDeque.isEmpty()) {
            dg0 dg0Var = (dg0) arrayDeque.removeFirst();
            this.f3812v -= dg0Var.f2925c;
            long j18 = dg0Var.f2923a;
            if (dg0Var.f2924b) {
                j18 += j17;
            }
            long j19 = j18;
            for (c22 c22Var4 : this.f3788G) {
                c22Var4.mo1114a(j19, 1, dg0Var.f2925c, this.f3812v, null);
            }
        }
        if (!eg0Var2.m2583c()) {
            this.f3816z = null;
        }
        this.f3806p = 3;
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:148:0x0395  */
    /* JADX WARN: Code duplicated, block: B:257:0x05bb  */
    /* JADX INFO: renamed from: d */
    public final void m2807d(long j) throws fc1 {
        f00 f00Var;
        f00 f00Var2;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i;
        int i2;
        int i3;
        boolean z;
        while (true) {
            ArrayDeque arrayDeque = this.f3802l;
            if (arrayDeque.isEmpty() || ((k61) arrayDeque.peek()).f5682g != j) {
                break;
            }
            k61 k61Var = (k61) arrayDeque.pop();
            int i4 = k61Var.f7542b;
            ArrayList arrayList4 = k61Var.f5684n;
            ArrayList arrayList5 = k61Var.f5683m;
            int i5 = this.f3792b;
            int i6 = 12;
            SparseArray sparseArray = this.f3794d;
            if (i4 == 1836019574) {
                z30 z30VarM2805a = m2805a(arrayList5);
                k61 k61VarM3804r = k61Var.m3804r(1836475768);
                k61VarM3804r.getClass();
                SparseArray sparseArray2 = new SparseArray();
                ArrayList arrayList6 = k61VarM3804r.f5683m;
                int size = arrayList6.size();
                int i7 = 0;
                long jM2339v = -9223372036854775807L;
                while (i7 < size) {
                    l61 l61Var = (l61) arrayList6.get(i7);
                    int i8 = l61Var.f7542b;
                    dc1 dc1Var = l61Var.f6194g;
                    if (i8 == 1953654136) {
                        dc1Var.m2316F(i6);
                        arrayList = arrayList6;
                        Pair pairCreate = Pair.create(Integer.valueOf(dc1Var.m2324g()), new f00(dc1Var.m2324g() - 1, dc1Var.m2324g(), dc1Var.m2324g(), dc1Var.m2324g()));
                        sparseArray2.put(((Integer) pairCreate.first).intValue(), (f00) pairCreate.second);
                    } else {
                        arrayList = arrayList6;
                        if (i8 == 1835362404) {
                            dc1Var.m2316F(8);
                            jM2339v = AbstractC0793jj.m3647c(dc1Var.m2324g()) == 0 ? dc1Var.m2339v() : dc1Var.m2342y();
                        }
                    }
                    i7++;
                    arrayList6 = arrayList;
                    i6 = 12;
                }
                int i9 = 1;
                ArrayList arrayListM3651g = AbstractC0793jj.m3651g(k61Var, new xh0(), jM2339v, z30VarM2805a, (i5 & 16) != 0, false, new ca0(this));
                int size2 = arrayListM3651g.size();
                if (sparseArray.size() == 0) {
                    int i10 = 0;
                    while (i10 < size2) {
                        d22 d22Var = (d22) arrayListM3651g.get(i10);
                        v12 v12Var = d22Var.f2754a;
                        z80 z80Var = this.f3787F;
                        int i11 = v12Var.f11485b;
                        int i12 = v12Var.f11484a;
                        c22 c22VarMo750n = z80Var.mo750n(i10, i11);
                        if (sparseArray2.size() == i9) {
                            f00Var = (f00) sparseArray2.valueAt(0);
                        } else {
                            f00Var = (f00) sparseArray2.get(i12);
                            f00Var.getClass();
                        }
                        sparseArray.put(i12, new eg0(c22VarMo750n, d22Var, f00Var));
                        this.f3814x = Math.max(this.f3814x, v12Var.f11488e);
                        i10++;
                        i9 = 1;
                    }
                    this.f3787F.mo748k();
                } else {
                    ki0.m3864h(sparseArray.size() == size2);
                    for (int i13 = 0; i13 < size2; i13++) {
                        d22 d22Var2 = (d22) arrayListM3651g.get(i13);
                        v12 v12Var2 = d22Var2.f2754a;
                        eg0 eg0Var = (eg0) sparseArray.get(v12Var2.f11484a);
                        int i14 = v12Var2.f11484a;
                        if (sparseArray2.size() == 1) {
                            f00Var2 = (f00) sparseArray2.valueAt(0);
                        } else {
                            f00Var2 = (f00) sparseArray2.get(i14);
                            f00Var2.getClass();
                        }
                        eg0Var.f3334d = d22Var2;
                        eg0Var.f3335e = f00Var2;
                        eg0Var.f3331a.mo1117d(d22Var2.f2754a.f11490g);
                        eg0Var.m2585e();
                    }
                }
            } else if (i4 == 1836019558) {
                int size3 = arrayList4.size();
                int i15 = 0;
                while (i15 < size3) {
                    k61 k61Var2 = (k61) arrayList4.get(i15);
                    if (k61Var2.f7542b == 1953653094) {
                        l61 l61VarM3805s = k61Var2.m3805s(1952868452);
                        ArrayList arrayList7 = k61Var2.f5683m;
                        l61VarM3805s.getClass();
                        dc1 dc1Var2 = l61VarM3805s.f6194g;
                        dc1Var2.m2316F(8);
                        int iM2324g = dc1Var2.m2324g();
                        byte[] bArr = AbstractC0793jj.f5419a;
                        eg0 eg0Var2 = (eg0) sparseArray.get(dc1Var2.m2324g());
                        if (eg0Var2 == null) {
                            size3 = size3;
                            eg0Var2 = null;
                        } else {
                            x12 x12Var = eg0Var2.f3332b;
                            if ((iM2324g & 1) != 0) {
                                long jM2342y = dc1Var2.m2342y();
                                x12Var.f12414b = jM2342y;
                                x12Var.f12415c = jM2342y;
                            }
                            f00 f00Var3 = eg0Var2.f3335e;
                            x12Var.f12413a = new f00((iM2324g & 2) != 0 ? dc1Var2.m2324g() - 1 : f00Var3.f3508a, (iM2324g & 8) != 0 ? dc1Var2.m2324g() : f00Var3.f3509b, (iM2324g & 16) != 0 ? dc1Var2.m2324g() : f00Var3.f3510c, (iM2324g & 32) != 0 ? dc1Var2.m2324g() : f00Var3.f3511d);
                        }
                        if (eg0Var2 != null) {
                            x12 x12Var2 = eg0Var2.f3332b;
                            long j2 = x12Var2.f12428p;
                            boolean z2 = x12Var2.f12429q;
                            eg0Var2.m2585e();
                            eg0Var2.f3342l = true;
                            l61 l61VarM3805s2 = k61Var2.m3805s(1952867444);
                            if (l61VarM3805s2 == null || (i5 & 2) != 0) {
                                x12Var2.f12428p = j2;
                                x12Var2.f12429q = z2;
                            } else {
                                dc1 dc1Var3 = l61VarM3805s2.f6194g;
                                dc1Var3.m2316F(8);
                                x12Var2.f12428p = AbstractC0793jj.m3647c(dc1Var3.m2324g()) == 1 ? dc1Var3.m2342y() : dc1Var3.m2339v();
                                x12Var2.f12429q = true;
                            }
                            int size4 = arrayList7.size();
                            int i16 = 0;
                            int i17 = 0;
                            int i18 = 0;
                            while (true) {
                                i2 = 1953658222;
                                if (i16 >= size4) {
                                    break;
                                }
                                l61 l61Var2 = (l61) arrayList7.get(i16);
                                int i19 = i16;
                                if (l61Var2.f7542b == 1953658222) {
                                    dc1 dc1Var4 = l61Var2.f6194g;
                                    dc1Var4.m2316F(12);
                                    int iM2341x = dc1Var4.m2341x();
                                    if (iM2341x > 0) {
                                        i18 += iM2341x;
                                        i17++;
                                    }
                                }
                                i16 = i19 + 1;
                            }
                            eg0Var2.f3338h = 0;
                            eg0Var2.f3337g = 0;
                            eg0Var2.f3336f = 0;
                            x12Var2.f12416d = i17;
                            x12Var2.f12417e = i18;
                            if (x12Var2.f12419g.length < i17) {
                                x12Var2.f12418f = new long[i17];
                                x12Var2.f12419g = new int[i17];
                            }
                            if (x12Var2.f12420h.length < i18) {
                                int i20 = (i18 * 125) / 100;
                                x12Var2.f12420h = new int[i20];
                                x12Var2.f12421i = new long[i20];
                                x12Var2.f12422j = new boolean[i20];
                                x12Var2.f12424l = new boolean[i20];
                            }
                            int i21 = 0;
                            int i22 = 0;
                            int i23 = 0;
                            while (true) {
                                long j3 = 0;
                                if (i21 >= size4) {
                                    arrayList2 = arrayList4;
                                    arrayList3 = arrayList5;
                                    i = i15;
                                    v12 v12Var3 = eg0Var2.f3334d.f2754a;
                                    f00 f00Var4 = x12Var2.f12413a;
                                    f00Var4.getClass();
                                    w12 w12Var = v12Var3.f11495l[f00Var4.f3508a];
                                    l61 l61VarM3805s3 = k61Var2.m3805s(1935763834);
                                    if (l61VarM3805s3 != null) {
                                        w12Var.getClass();
                                        dc1 dc1Var5 = l61VarM3805s3.f6194g;
                                        int i24 = w12Var.f11907d;
                                        dc1Var5.m2316F(8);
                                        int iM2324g2 = dc1Var5.m2324g();
                                        byte[] bArr2 = AbstractC0793jj.f5419a;
                                        if ((iM2324g2 & 1) == 1) {
                                            dc1Var5.m2317G(8);
                                        }
                                        int iM2337t = dc1Var5.m2337t();
                                        int iM2341x2 = dc1Var5.m2341x();
                                        if (iM2341x2 > x12Var2.f12417e) {
                                            StringBuilder sbM5343j = AbstractC1308pu.m5343j(iM2341x2, "Saiz sample count ", " is greater than fragment sample count");
                                            sbM5343j.append(x12Var2.f12417e);
                                            throw fc1.m2799a(null, sbM5343j.toString());
                                        }
                                        if (iM2337t == 0) {
                                            boolean[] zArr = x12Var2.f12424l;
                                            i3 = 0;
                                            for (int i25 = 0; i25 < iM2341x2; i25++) {
                                                int iM2337t2 = dc1Var5.m2337t();
                                                i3 += iM2337t2;
                                                zArr[i25] = iM2337t2 > i24;
                                            }
                                            z = false;
                                        } else {
                                            boolean z3 = iM2337t > i24;
                                            i3 = iM2337t * iM2341x2;
                                            z = false;
                                            Arrays.fill(x12Var2.f12424l, 0, iM2341x2, z3);
                                        }
                                        Arrays.fill(x12Var2.f12424l, iM2341x2, x12Var2.f12417e, z);
                                        if (i3 > 0) {
                                            x12Var2.f12426n.m2313C(i3);
                                            x12Var2.f12423k = true;
                                            x12Var2.f12427o = true;
                                        }
                                    }
                                    l61 l61VarM3805s4 = k61Var2.m3805s(1935763823);
                                    if (l61VarM3805s4 != null) {
                                        dc1 dc1Var6 = l61VarM3805s4.f6194g;
                                        dc1Var6.m2316F(8);
                                        int iM2324g3 = dc1Var6.m2324g();
                                        byte[] bArr3 = AbstractC0793jj.f5419a;
                                        if ((iM2324g3 & 1) == 1) {
                                            dc1Var6.m2317G(8);
                                        }
                                        int iM2341x3 = dc1Var6.m2341x();
                                        if (iM2341x3 != 1) {
                                            throw fc1.m2799a(null, "Unexpected saio entry count: " + iM2341x3);
                                        }
                                        x12Var2.f12415c += AbstractC0793jj.m3647c(iM2324g3) == 0 ? dc1Var6.m2339v() : dc1Var6.m2342y();
                                    }
                                    byte[] bArr4 = null;
                                    l61 l61VarM3805s5 = k61Var2.m3805s(1936027235);
                                    if (l61VarM3805s5 != null) {
                                        m2806c(l61VarM3805s5.f6194g, 0, x12Var2);
                                    }
                                    String str = w12Var != null ? w12Var.f11905b : null;
                                    dc1 dc1Var7 = null;
                                    dc1 dc1Var8 = null;
                                    for (int i26 = 0; i26 < arrayList7.size(); i26++) {
                                        l61 l61Var3 = (l61) arrayList7.get(i26);
                                        dc1 dc1Var9 = l61Var3.f6194g;
                                        int i27 = l61Var3.f7542b;
                                        if (i27 == 1935828848) {
                                            dc1Var9.m2316F(12);
                                            if (dc1Var9.m2324g() == 1936025959) {
                                                dc1Var7 = dc1Var9;
                                            }
                                        } else if (i27 == 1936158820) {
                                            dc1Var9.m2316F(12);
                                            if (dc1Var9.m2324g() == 1936025959) {
                                                dc1Var8 = dc1Var9;
                                            }
                                        }
                                    }
                                    if (dc1Var7 != null && dc1Var8 != null) {
                                        dc1Var7.m2316F(8);
                                        int iM3647c = AbstractC0793jj.m3647c(dc1Var7.m2324g());
                                        dc1Var7.m2317G(4);
                                        if (iM3647c == 1) {
                                            dc1Var7.m2317G(4);
                                        }
                                        if (dc1Var7.m2324g() != 1) {
                                            throw fc1.m2800b("Entry count in sbgp != 1 (unsupported).");
                                        }
                                        dc1Var8.m2316F(8);
                                        int iM3647c2 = AbstractC0793jj.m3647c(dc1Var8.m2324g());
                                        dc1Var8.m2317G(4);
                                        if (iM3647c2 == 1) {
                                            if (dc1Var8.m2339v() == 0) {
                                                throw fc1.m2800b("Variable length description in sgpd found (unsupported)");
                                            }
                                        } else if (iM3647c2 >= 2) {
                                            dc1Var8.m2317G(4);
                                        }
                                        if (dc1Var8.m2339v() != 1) {
                                            throw fc1.m2800b("Entry count in sgpd != 1 (unsupported).");
                                        }
                                        dc1Var8.m2317G(1);
                                        int iM2337t3 = dc1Var8.m2337t();
                                        int i28 = (iM2337t3 & 240) >> 4;
                                        int i29 = iM2337t3 & 15;
                                        boolean z4 = dc1Var8.m2337t() == 1;
                                        if (z4) {
                                            int iM2337t4 = dc1Var8.m2337t();
                                            byte[] bArr5 = new byte[16];
                                            dc1Var8.m2322e(0, 16, bArr5);
                                            if (iM2337t4 == 0) {
                                                int iM2337t5 = dc1Var8.m2337t();
                                                bArr4 = new byte[iM2337t5];
                                                dc1Var8.m2322e(0, iM2337t5, bArr4);
                                            }
                                            x12Var2.f12423k = true;
                                            x12Var2.f12425m = new w12(z4, str, iM2337t4, bArr5, i28, i29, bArr4);
                                        }
                                    }
                                    int size5 = arrayList7.size();
                                    for (int i30 = 0; i30 < size5; i30++) {
                                        l61 l61Var4 = (l61) arrayList7.get(i30);
                                        if (l61Var4.f7542b == 1970628964) {
                                            dc1 dc1Var10 = l61Var4.f6194g;
                                            dc1Var10.m2316F(8);
                                            byte[] bArr6 = this.f3798h;
                                            dc1Var10.m2322e(0, 16, bArr6);
                                            if (Arrays.equals(bArr6, f3780J)) {
                                                m2806c(dc1Var10, 16, x12Var2);
                                            }
                                        }
                                    }
                                    break;
                                }
                                l61 l61Var5 = (l61) arrayList7.get(i21);
                                int i31 = size4;
                                if (l61Var5.f7542b == i2) {
                                    int i32 = i22 + 1;
                                    dc1 dc1Var11 = l61Var5.f6194g;
                                    dc1Var11.m2316F(8);
                                    int iM2324g4 = dc1Var11.m2324g();
                                    byte[] bArr7 = AbstractC0793jj.f5419a;
                                    v12 v12Var4 = eg0Var2.f3334d.f2754a;
                                    f00 f00Var5 = x12Var2.f12413a;
                                    int i33 = z42.f13274a;
                                    x12Var2.f12419g[i22] = dc1Var11.m2341x();
                                    long[] jArr = x12Var2.f12418f;
                                    long j4 = x12Var2.f12414b;
                                    jArr[i22] = j4;
                                    if ((iM2324g4 & 1) != 0) {
                                        jArr[i22] = j4 + ((long) dc1Var11.m2324g());
                                    }
                                    boolean z5 = (iM2324g4 & 4) != 0;
                                    int iM2324g5 = f00Var5.f3511d;
                                    if (z5) {
                                        iM2324g5 = dc1Var11.m2324g();
                                    }
                                    boolean z6 = z5;
                                    boolean z7 = (iM2324g4 & 256) != 0;
                                    boolean z8 = (iM2324g4 & UserVerificationMethods.USER_VERIFY_NONE) != 0;
                                    boolean z9 = (iM2324g4 & 1024) != 0;
                                    boolean z10 = (iM2324g4 & 2048) != 0;
                                    boolean z11 = z9;
                                    long[] jArr2 = v12Var4.f11492i;
                                    int i34 = iM2324g5;
                                    long[] jArr3 = v12Var4.f11493j;
                                    if (jArr2 != null && jArr2.length == 1 && jArr3 != null) {
                                        long j5 = jArr2[0];
                                        if (j5 == 0) {
                                            j3 = jArr3[0];
                                        } else {
                                            long j6 = v12Var4.f11487d;
                                            RoundingMode roundingMode = RoundingMode.DOWN;
                                            if (z42.m7222J(j5, 1000000L, j6, roundingMode) + z42.m7222J(jArr3[0], 1000000L, v12Var4.f11486c, roundingMode) >= v12Var4.f11488e) {
                                                j3 = jArr3[0];
                                            }
                                        }
                                    }
                                    int[] iArr = x12Var2.f12420h;
                                    long[] jArr4 = x12Var2.f12421i;
                                    boolean[] zArr2 = x12Var2.f12422j;
                                    boolean z12 = v12Var4.f11485b == 2 && (i5 & 1) != 0;
                                    int i35 = x12Var2.f12419g[i22] + i23;
                                    long j7 = v12Var4.f11486c;
                                    long j8 = x12Var2.f12428p;
                                    while (i23 < i35) {
                                        int iM2324g6 = z7 ? dc1Var11.m2324g() : f00Var5.f3509b;
                                        boolean z13 = z12;
                                        if (iM2324g6 < 0) {
                                            throw fc1.m2799a(null, "Unexpected negative value: " + iM2324g6);
                                        }
                                        int iM2324g7 = z8 ? dc1Var11.m2324g() : f00Var5.f3510c;
                                        if (iM2324g7 < 0) {
                                            throw fc1.m2799a(null, "Unexpected negative value: " + iM2324g7);
                                        }
                                        int iM2324g8 = z11 ? dc1Var11.m2324g() : (i23 == 0 && z6) ? i34 : f00Var5.f3511d;
                                        long jM7222J = z42.m7222J((((long) (z10 ? dc1Var11.m2324g() : 0)) + j8) - j3, 1000000L, j7, RoundingMode.DOWN);
                                        jArr4[i23] = jM7222J;
                                        if (!x12Var2.f12429q) {
                                            jArr4[i23] = jM7222J + eg0Var2.f3334d.f2761h;
                                        }
                                        iArr[i23] = iM2324g7;
                                        zArr2[i23] = ((iM2324g8 >> 16) & 1) == 0 && (!z13 || i23 == 0);
                                        j8 += (long) iM2324g6;
                                        i23++;
                                        z12 = z13;
                                        i35 = i35;
                                        f00Var5 = f00Var5;
                                    }
                                    x12Var2.f12428p = j8;
                                    i22 = i32;
                                    i23 = i35;
                                }
                                i21++;
                                size4 = i31;
                                arrayList4 = arrayList4;
                                arrayList5 = arrayList5;
                                i15 = i15;
                                i2 = 1953658222;
                            }
                        } else {
                            arrayList2 = arrayList4;
                            arrayList3 = arrayList5;
                            i = i15;
                        }
                    } else {
                        size3 = size3;
                        arrayList2 = arrayList4;
                        arrayList3 = arrayList5;
                        i = i15;
                    }
                    i15 = i + 1;
                    size3 = size3;
                    arrayList4 = arrayList2;
                    arrayList5 = arrayList3;
                }
                z30 z30VarM2805a2 = m2805a(arrayList5);
                if (z30VarM2805a2 != null) {
                    int size6 = sparseArray.size();
                    for (int i36 = 0; i36 < size6; i36++) {
                        eg0 eg0Var3 = (eg0) sparseArray.valueAt(i36);
                        v12 v12Var5 = eg0Var3.f3334d.f2754a;
                        f00 f00Var6 = eg0Var3.f3332b.f12413a;
                        int i37 = z42.f13274a;
                        w12 w12Var2 = v12Var5.f11495l[f00Var6.f3508a];
                        z30 z30VarM7186a = z30VarM2805a2.m7186a(w12Var2 != null ? w12Var2.f11905b : null);
                        ae0 ae0VarM969a = eg0Var3.f3334d.f2754a.f11490g.m969a();
                        ae0VarM969a.f201q = z30VarM7186a;
                        eg0Var3.f3331a.mo1117d(new be0(ae0VarM969a));
                    }
                }
                if (this.f3813w != -9223372036854775807L) {
                    int size7 = sparseArray.size();
                    for (int i38 = 0; i38 < size7; i38++) {
                        eg0 eg0Var4 = (eg0) sparseArray.valueAt(i38);
                        long j9 = this.f3813w;
                        int i39 = eg0Var4.f3336f;
                        while (true) {
                            x12 x12Var3 = eg0Var4.f3332b;
                            if (i39 >= x12Var3.f12417e || x12Var3.f12421i[i39] > j9) {
                                break;
                            }
                            if (x12Var3.f12422j[i39]) {
                                eg0Var4.f3339i = i39;
                            }
                            i39++;
                        }
                    }
                    this.f3813w = -9223372036854775807L;
                }
            } else if (!arrayDeque.isEmpty()) {
                ((k61) arrayDeque.peek()).f5684n.add(k61Var);
            }
        }
        this.f3806p = 0;
        this.f3809s = 0;
    }

    @Override // p000.x80
    /* JADX INFO: renamed from: e */
    public final boolean mo125e(y80 y80Var) {
        kk1 kk1VarM5570t;
        ut1 ut1VarM3263N = hr1.m3263N(y80Var, true, false);
        if (ut1VarM3263N != null) {
            kk1VarM5570t = qm0.m5570t(ut1VarM3263N);
        } else {
            om0 om0Var = qm0.f9540b;
            kk1VarM5570t = kk1.f5896e;
        }
        this.f3805o = kk1VarM5570t;
        return ut1VarM3263N == null;
    }

    @Override // p000.x80
    /* JADX INFO: renamed from: f */
    public final void mo126f(long j, long j2) {
        SparseArray sparseArray = this.f3794d;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((eg0) sparseArray.valueAt(i)).m2585e();
        }
        this.f3803m.clear();
        this.f3812v = 0;
        this.f3804n.m7198i(0);
        this.f3813w = j2;
        this.f3802l.clear();
        this.f3806p = 0;
        this.f3809s = 0;
    }

    @Override // p000.x80
    /* JADX INFO: renamed from: g */
    public final List mo2808g() {
        return this.f3805o;
    }

    @Override // p000.x80
    /* JADX INFO: renamed from: k */
    public final void mo127k(z80 z80Var) {
        int i;
        int i2 = this.f3792b;
        if ((i2 & 32) == 0) {
            z80Var = new C1174o9(z80Var, this.f3791a);
        }
        this.f3787F = z80Var;
        int i3 = 0;
        this.f3806p = 0;
        this.f3809s = 0;
        c22[] c22VarArr = new c22[2];
        this.f3788G = c22VarArr;
        int i4 = 100;
        if ((i2 & 4) != 0) {
            c22VarArr[0] = z80Var.mo750n(100, 5);
            i = 1;
            i4 = 101;
        } else {
            i = 0;
        }
        c22[] c22VarArr2 = (c22[]) z42.m7218F(i, this.f3788G);
        this.f3788G = c22VarArr2;
        for (c22 c22Var : c22VarArr2) {
            c22Var.mo1117d(f3781K);
        }
        List list = this.f3793c;
        this.f3789H = new c22[list.size()];
        while (i3 < this.f3789H.length) {
            c22 c22VarMo750n = this.f3787F.mo750n(i4, 3);
            c22VarMo750n.mo1117d((be0) list.get(i3));
            this.f3789H[i3] = c22VarMo750n;
            i3++;
            i4++;
        }
    }

    @Override // p000.x80
    public final void release() {
    }
}
