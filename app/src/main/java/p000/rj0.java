package p000;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class rj0 extends fr0 {

    /* JADX INFO: renamed from: b */
    public final int f10059b;

    /* JADX INFO: renamed from: c */
    public final boolean f10060c;

    /* JADX INFO: renamed from: d */
    public final List f10061d;

    /* JADX INFO: renamed from: e */
    public final List f10062e;

    /* JADX INFO: renamed from: f */
    public final long f10063f;

    /* JADX INFO: renamed from: g */
    public final long f10064g;

    /* JADX WARN: Code duplicated, block: B:109:0x0243 A[EDGE_INSN: B:109:0x0243->B:51:0x0243 BREAK  A[LOOP:3: B:48:0x021a->B:50:0x0224], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0192 A[LOOP:2: B:45:0x0190->B:46:0x0192, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x0224 A[LOOP:3: B:48:0x021a->B:50:0x0224, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x0279 A[LOOP:4: B:54:0x0273->B:56:0x0279, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:59:0x0288  */
    /* JADX WARN: Code duplicated, block: B:61:0x029b  */
    /* JADX WARN: Code duplicated, block: B:62:0x029d  */
    /* JADX WARN: Code duplicated, block: B:65:0x02ba A[LOOP:6: B:64:0x02b8->B:65:0x02ba, LOOP_END] */
    public rj0(hr0 hr0Var, long j, long j2) {
        List list;
        boolean z;
        int i;
        int i2;
        int i3;
        byte[][] bArr;
        int i4;
        byte[] bArr2;
        int i5;
        int i6;
        int i7;
        byte[] bArr3;
        j20 j20VarM6454j;
        lj0 lj0Var;
        int i8;
        int i9;
        int i10;
        int i11;
        ByteArrayOutputStream byteArrayOutputStream;
        int i12;
        byte[] byteArray;
        int i13;
        boolean z2;
        int i14;
        boolean z3;
        int i15;
        int i16;
        super(true);
        this.f10064g = 0L;
        this.f10059b = 1;
        this.f10061d = Collections.singletonList(hr0Var);
        this.f10062e = Collections.EMPTY_LIST;
        long j3 = j;
        this.f10064g = j3;
        this.f10063f = j2;
        this.f10060c = false;
        synchronized (this) {
            list = this.f10061d;
        }
        int size = list.size();
        long[] jArr = new long[size];
        synchronized (this) {
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            int i17 = ((hr0) list.get(size2)).f4673c.f5992c;
            jArr[size2] = ((long) ((1 << i17) - 1)) & j3;
            j3 >>>= i17;
        }
        hr0[] hr0VarArr = (hr0[]) list.toArray(new hr0[list.size()]);
        List list2 = this.f10062e;
        jr0[] jr0VarArr = (jr0[]) list2.toArray(new jr0[list2.size()]);
        hr0 hr0Var2 = (hr0) this.f10061d.get(0);
        long jM3248d = hr0VarArr[0].m3248d() - 1;
        long j4 = jArr[0];
        if (jM3248d != j4) {
            hr0VarArr[0] = hp0.m3224s(hr0Var2.f4673c, hr0Var2.f4674d, (int) j4, sc2.m6061e(hr0Var2.f4672b), sc2.m6061e(hr0Var2.f4676f));
            z = true;
        } else {
            z = false;
        }
        int i18 = 1;
        while (i18 < size) {
            int i19 = i18 - 1;
            hr0 hr0Var3 = hr0VarArr[i19];
            int i20 = hr0Var3.f4674d.f2998b;
            byte[] bArr4 = new byte[16];
            byte[] bArr5 = new byte[i20];
            lj0 lj0Var2 = new lj0(sc2.m6061e(hr0Var3.f4672b), sc2.m6061e(hr0Var3.f4676f), ua0.m6461r(hr0Var3.f4674d));
            hr0[] hr0VarArr2 = hr0VarArr;
            jr0[] jr0VarArr2 = jr0VarArr;
            lj0Var2.f6362a = (int) jArr[i19];
            lj0Var2.f6363b = -2;
            lj0Var2.m4220a(0, true, bArr5);
            byte[] bArr6 = new byte[i20];
            lj0Var2.m4220a(0, false, bArr6);
            System.arraycopy(bArr6, 0, bArr4, 0, 16);
            boolean z4 = i18 >= size + (-1) ? jArr[i18] == ((long) hr0VarArr2[i18].m3248d()) : jArr[i18] == ((long) (hr0VarArr2[i18].m3248d() - 1));
            if (Arrays.equals(bArr4, sc2.m6061e(hr0VarArr2[i18].f4672b)) && Arrays.equals(bArr5, sc2.m6061e(hr0VarArr2[i18].f4676f))) {
                if (!z4) {
                    hr0VarArr2[i18] = hp0.m3224s(((hr0) list.get(i18)).f4673c, ((hr0) list.get(i18)).f4674d, (int) jArr[i18], bArr4, bArr5);
                    z = true;
                }
                z2 = true;
            } else {
                hr0 hr0VarM3224s = hp0.m3224s(((hr0) list.get(i18)).f4673c, ((hr0) list.get(i18)).f4674d, (int) jArr[i18], bArr4, bArr5);
                hr0VarArr2[i18] = hr0VarM3224s;
                hr0 hr0Var4 = hr0VarArr2[i19];
                byte[] bArrM3479b = hr0VarM3224s.m3249f().m3479b();
                int i21 = hr0Var4.f4673c.f5992c;
                int iM3248d = hr0Var4.m3248d();
                try {
                    synchronized (hr0Var4) {
                        i = hr0Var4.f4680o;
                        if (i >= hr0Var4.f4675e) {
                            throw new i70("ots private key exhausted");
                        }
                        dr0 dr0Var = hr0Var4.f4674d;
                        byte[] bArr7 = hr0Var4.f4672b;
                        byte[] bArr8 = hr0Var4.f4676f;
                        synchronized (hr0Var4) {
                            i2 = 1;
                            hr0Var4.f4680o++;
                        }
                        i3 = (1 << i21) + iM3248d;
                        bArr = new byte[i21][];
                        i4 = 0;
                        while (i4 < i21) {
                            bArr[i4] = hr0Var4.m3246b((i3 / (i2 << i4)) ^ 1);
                            i4++;
                            i21 = i21;
                            i2 = 1;
                        }
                        kr0 kr0Var = hr0Var4.f4673c;
                        int i22 = dr0Var.f2998b;
                        byte[] bArr9 = new byte[i22];
                        list = list;
                        lj0 lj0Var3 = new lj0(bArr7, bArr8, ua0.m6454j(i22, dr0Var.f3002f));
                        lj0Var3.f6362a = i;
                        lj0Var3.f6363b = -3;
                        lj0Var3.m4220a(0, false, bArr9);
                        j20 j20VarM6454j2 = ua0.m6454j(dr0Var.f2998b, dr0Var.f3002f);
                        size = size;
                        j20VarM6454j2.mo729e(0, bArr7.length, bArr7);
                        ki0.m3861e0(i, j20VarM6454j2);
                        j20VarM6454j2.mo728c((byte) -127);
                        j20VarM6454j2.mo728c((byte) -127);
                        j20VarM6454j2.mo729e(0, i22, bArr9);
                        j20VarM6454j2.mo729e(0, bArrM3479b.length, bArrM3479b);
                        bArr2 = new byte[34];
                        j20VarM6454j2.mo3526b(0, bArr2);
                        i5 = dr0Var.f2998b;
                        i6 = dr0Var.f3000d;
                        i7 = dr0Var.f2999c;
                        bArr3 = new byte[i6 * i5];
                        j20VarM6454j = ua0.m6454j(i5, dr0Var.f3002f);
                        jArr = jArr;
                        i18 = i18;
                        lj0Var = new lj0(bArr7, bArr8, ua0.m6454j(dr0Var.f2998b, dr0Var.f3002f));
                        lj0Var.f6362a = i;
                        i8 = (1 << i7) - 1;
                        i9 = 0;
                        i10 = 0;
                        while (true) {
                            i11 = i8;
                            if (i9 < (i5 * 8) / i7) {
                                break;
                            }
                            i10 = (i10 + i11) - ((bArr2[(i9 * i7) / 8] >>> (((~i9) & ((8 / i7) - 1)) * i7)) & i11);
                            i9++;
                            i8 = i11;
                        }
                        int i23 = i10 << dr0Var.f3001e;
                        bArr2[i5] = (byte) ((i23 >>> 8) & 255);
                        bArr2[i5 + 1] = (byte) i23;
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        byteArrayOutputStream.write(bArr7);
                        byteArrayOutputStream.write((byte) (i >>> 24));
                        byteArrayOutputStream.write((byte) (i >>> 16));
                        byteArrayOutputStream.write((byte) (i >>> 8));
                        byteArrayOutputStream.write((byte) i);
                        i12 = i5 + 23;
                        while (byteArrayOutputStream.size() < i12) {
                            byteArrayOutputStream.write(0);
                        }
                        byteArray = byteArrayOutputStream.toByteArray();
                        lj0Var.f6363b = 0;
                        i13 = 0;
                        while (i13 < i6) {
                            short s = (short) i13;
                            i14 = i6;
                            byteArray[20] = (byte) (s >>> 8);
                            byteArray[21] = (byte) s;
                            if (i13 < i14 - 1) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            lj0Var.m4220a(23, z3, byteArray);
                            i16 = 0;
                            for (i15 = (bArr2[(i13 * i7) / 8] >>> (((~i13) & ((8 / i7) - 1)) * i7)) & i11; i16 < i15; i15 = i15) {
                                byteArray[22] = (byte) i16;
                                j20VarM6454j.mo729e(0, i12, byteArray);
                                j20VarM6454j.mo3526b(23, byteArray);
                                i16++;
                            }
                            System.arraycopy(byteArray, 23, bArr3, i5 * i13, i5);
                            i13++;
                            i6 = i14;
                        }
                        z2 = true;
                        jr0VarArr2[i19] = new jr0(i, new er0(dr0Var, bArr9, bArr3), kr0Var, bArr);
                        z = true;
                    }
                    byteArrayOutputStream.write(bArr7);
                    byteArrayOutputStream.write((byte) (i >>> 24));
                    byteArrayOutputStream.write((byte) (i >>> 16));
                    byteArrayOutputStream.write((byte) (i >>> 8));
                    byteArrayOutputStream.write((byte) i);
                    i12 = i5 + 23;
                    while (byteArrayOutputStream.size() < i12) {
                        byteArrayOutputStream.write(0);
                    }
                    byteArray = byteArrayOutputStream.toByteArray();
                    lj0Var.f6363b = 0;
                    i13 = 0;
                    while (i13 < i6) {
                        short s2 = (short) i13;
                        i14 = i6;
                        byteArray[20] = (byte) (s2 >>> 8);
                        byteArray[21] = (byte) s2;
                        if (i13 < i14 - 1) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        lj0Var.m4220a(23, z3, byteArray);
                        i16 = 0;
                        while (i16 < i15) {
                            byteArray[22] = (byte) i16;
                            j20VarM6454j.mo729e(0, i12, byteArray);
                            j20VarM6454j.mo3526b(23, byteArray);
                            i16++;
                        }
                        System.arraycopy(byteArray, 23, bArr3, i5 * i13, i5);
                        i13++;
                        i6 = i14;
                    }
                    z2 = true;
                    jr0VarArr2[i19] = new jr0(i, new er0(dr0Var, bArr9, bArr3), kr0Var, bArr);
                    z = true;
                } catch (Exception e) {
                    l41.m4043l(e.getMessage(), e);
                    throw null;
                }
                i3 = (1 << i21) + iM3248d;
                bArr = new byte[i21][];
                i4 = 0;
                while (i4 < i21) {
                    bArr[i4] = hr0Var4.m3246b((i3 / (i2 << i4)) ^ 1);
                    i4++;
                    i21 = i21;
                    i2 = 1;
                }
                kr0 kr0Var2 = hr0Var4.f4673c;
                int i24 = dr0Var.f2998b;
                byte[] bArr10 = new byte[i24];
                list = list;
                lj0 lj0Var4 = new lj0(bArr7, bArr8, ua0.m6454j(i24, dr0Var.f3002f));
                lj0Var4.f6362a = i;
                lj0Var4.f6363b = -3;
                lj0Var4.m4220a(0, false, bArr10);
                j20 j20VarM6454j3 = ua0.m6454j(dr0Var.f2998b, dr0Var.f3002f);
                size = size;
                j20VarM6454j3.mo729e(0, bArr7.length, bArr7);
                ki0.m3861e0(i, j20VarM6454j3);
                j20VarM6454j3.mo728c((byte) -127);
                j20VarM6454j3.mo728c((byte) -127);
                j20VarM6454j3.mo729e(0, i24, bArr10);
                j20VarM6454j3.mo729e(0, bArrM3479b.length, bArrM3479b);
                bArr2 = new byte[34];
                j20VarM6454j3.mo3526b(0, bArr2);
                i5 = dr0Var.f2998b;
                i6 = dr0Var.f3000d;
                i7 = dr0Var.f2999c;
                bArr3 = new byte[i6 * i5];
                j20VarM6454j = ua0.m6454j(i5, dr0Var.f3002f);
                jArr = jArr;
                i18 = i18;
                lj0Var = new lj0(bArr7, bArr8, ua0.m6454j(dr0Var.f2998b, dr0Var.f3002f));
                lj0Var.f6362a = i;
                i8 = (1 << i7) - 1;
                i9 = 0;
                i10 = 0;
                while (true) {
                    i11 = i8;
                    if (i9 < (i5 * 8) / i7) {
                        break;
                        break;
                    }
                    i10 = (i10 + i11) - ((bArr2[(i9 * i7) / 8] >>> (((~i9) & ((8 / i7) - 1)) * i7)) & i11);
                    i9++;
                    i8 = i11;
                }
                int i25 = i10 << dr0Var.f3001e;
                bArr2[i5] = (byte) ((i25 >>> 8) & 255);
                bArr2[i5 + 1] = (byte) i25;
                byteArrayOutputStream = new ByteArrayOutputStream();
            }
            i18++;
            size = size;
            hr0VarArr = hr0VarArr2;
            jr0VarArr = jr0VarArr2;
            list = list;
            jArr = jArr;
        }
        hr0[] hr0VarArr3 = hr0VarArr;
        jr0[] jr0VarArr3 = jr0VarArr;
        if (z) {
            synchronized (this) {
                this.f10061d = Collections.unmodifiableList(Arrays.asList(hr0VarArr3));
                this.f10062e = Collections.unmodifiableList(Arrays.asList(jr0VarArr3));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static rj0 m5855a(Object obj) {
        Throwable th;
        if (obj instanceof rj0) {
            return (rj0) obj;
        }
        DataInputStream dataInputStream = null;
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream2 = (DataInputStream) obj;
            if (dataInputStream2.readInt() != 0) {
                f40.m2719o("unknown version for hss private key");
                return null;
            }
            int i = dataInputStream2.readInt();
            long j = dataInputStream2.readLong();
            long j2 = dataInputStream2.readLong();
            boolean z = dataInputStream2.readBoolean();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(hr0.m3244e(obj));
            }
            for (int i3 = 0; i3 < i - 1; i3++) {
                arrayList2.add(jr0.m3706a(obj));
            }
            return new rj0(i, arrayList, arrayList2, j, j2, z);
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return m5855a(o21.m4674o0((InputStream) obj));
            }
            l41.m4038g(obj, "cannot parse ");
            return null;
        }
        try {
            DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                try {
                    rj0 rj0VarM5855a = m5855a(dataInputStream3);
                    dataInputStream3.close();
                    return rj0VarM5855a;
                } catch (Exception unused) {
                    hr0 hr0VarM3244e = hr0.m3244e(obj);
                    rj0 rj0Var = new rj0(hr0VarM3244e, hr0VarM3244e.m3248d(), hr0VarM3244e.f4675e);
                    dataInputStream3.close();
                    return rj0Var;
                }
            } catch (Throwable th2) {
                th = th2;
                dataInputStream = dataInputStream3;
                if (dataInputStream == null) {
                    throw th;
                }
                dataInputStream.close();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final Object clone() {
        try {
            return m5855a(getEncoded());
        } catch (Exception e) {
            l41.m4043l(e.getMessage(), e);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rj0.class != obj.getClass()) {
            return false;
        }
        rj0 rj0Var = (rj0) obj;
        if (this.f10059b == rj0Var.f10059b && this.f10060c == rj0Var.f10060c && this.f10063f == rj0Var.f10063f && this.f10064g == rj0Var.f10064g && this.f10061d.equals(rj0Var.f10061d)) {
            return this.f10062e.equals(rj0Var.f10062e);
        }
        return false;
    }

    @Override // p000.r60
    public final synchronized byte[] getEncoded() {
        C1462u c1462u;
        try {
            c1462u = new C1462u();
            c1462u.m6363h(0);
            c1462u.m6363h(this.f10059b);
            long j = this.f10064g;
            c1462u.m6363h((int) (j >>> 32));
            c1462u.m6363h((int) j);
            long j2 = this.f10063f;
            c1462u.m6363h((int) (j2 >>> 32));
            c1462u.m6363h((int) j2);
            c1462u.f11078a.write(this.f10060c ? 1 : 0);
            Iterator it = this.f10061d.iterator();
            while (it.hasNext()) {
                c1462u.m6360a((hr0) it.next());
            }
            Iterator it2 = this.f10062e.iterator();
            while (it2.hasNext()) {
                c1462u.m6360a((jr0) it2.next());
            }
        } catch (Throwable th) {
            throw th;
        }
        return c1462u.f11078a.toByteArray();
    }

    public final int hashCode() {
        int iHashCode = (this.f10062e.hashCode() + ((this.f10061d.hashCode() + (((this.f10059b * 31) + (this.f10060c ? 1 : 0)) * 31)) * 31)) * 31;
        long j = this.f10063f;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f10064g;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public rj0(int i, ArrayList arrayList, ArrayList arrayList2, long j, long j2, boolean z) {
        super(true);
        this.f10064g = 0L;
        this.f10059b = i;
        this.f10061d = Collections.unmodifiableList(arrayList);
        this.f10062e = Collections.unmodifiableList(arrayList2);
        this.f10064g = j;
        this.f10063f = j2;
        this.f10060c = z;
    }
}
