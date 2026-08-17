package p000;

import android.util.SparseArray;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class xo1 implements c22 {

    /* JADX INFO: renamed from: B */
    public boolean f12660B;

    /* JADX INFO: renamed from: a */
    public final vo1 f12661a;

    /* JADX INFO: renamed from: d */
    public final g40 f12664d;

    /* JADX INFO: renamed from: e */
    public final c40 f12665e;

    /* JADX INFO: renamed from: f */
    public wg1 f12666f;

    /* JADX INFO: renamed from: g */
    public be0 f12667g;

    /* JADX INFO: renamed from: h */
    public ay0 f12668h;

    /* JADX INFO: renamed from: p */
    public int f12676p;

    /* JADX INFO: renamed from: q */
    public int f12677q;

    /* JADX INFO: renamed from: r */
    public int f12678r;

    /* JADX INFO: renamed from: s */
    public int f12679s;

    /* JADX INFO: renamed from: w */
    public boolean f12683w;

    /* JADX INFO: renamed from: z */
    public be0 f12686z;

    /* JADX INFO: renamed from: b */
    public final C1583x9 f12662b = new C1583x9();

    /* JADX INFO: renamed from: i */
    public int f12669i = 1000;

    /* JADX INFO: renamed from: j */
    public long[] f12670j = new long[1000];

    /* JADX INFO: renamed from: k */
    public long[] f12671k = new long[1000];

    /* JADX INFO: renamed from: n */
    public long[] f12674n = new long[1000];

    /* JADX INFO: renamed from: m */
    public int[] f12673m = new int[1000];

    /* JADX INFO: renamed from: l */
    public int[] f12672l = new int[1000];

    /* JADX INFO: renamed from: o */
    public b22[] f12675o = new b22[1000];

    /* JADX INFO: renamed from: c */
    public final C0082b0 f12663c = new C0082b0(new l41(26));

    /* JADX INFO: renamed from: t */
    public long f12680t = Long.MIN_VALUE;

    /* JADX INFO: renamed from: u */
    public long f12681u = Long.MIN_VALUE;

    /* JADX INFO: renamed from: v */
    public long f12682v = Long.MIN_VALUE;

    /* JADX INFO: renamed from: y */
    public boolean f12685y = true;

    /* JADX INFO: renamed from: x */
    public boolean f12684x = true;

    /* JADX INFO: renamed from: A */
    public boolean f12659A = true;

    public xo1(C0547cy c0547cy, g40 g40Var, c40 c40Var) {
        this.f12664d = g40Var;
        this.f12665e = c40Var;
        this.f12661a = new vo1(c0547cy);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00c4 A[Catch: all -> 0x0063, TryCatch #0 {all -> 0x0063, blocks: (B:23:0x0045, B:25:0x0049, B:29:0x005f, B:32:0x0066, B:36:0x006e, B:41:0x00a9, B:64:0x0121, B:66:0x012a, B:43:0x00c4, B:45:0x00cd, B:47:0x00d2, B:49:0x00e7, B:53:0x00f0, B:54:0x00f5, B:56:0x00fb, B:60:0x0109, B:62:0x010e, B:63:0x011e, B:46:0x00d0), top: B:71:0x0045 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00cd A[Catch: all -> 0x0063, TryCatch #0 {all -> 0x0063, blocks: (B:23:0x0045, B:25:0x0049, B:29:0x005f, B:32:0x0066, B:36:0x006e, B:41:0x00a9, B:64:0x0121, B:66:0x012a, B:43:0x00c4, B:45:0x00cd, B:47:0x00d2, B:49:0x00e7, B:53:0x00f0, B:54:0x00f5, B:56:0x00fb, B:60:0x0109, B:62:0x010e, B:63:0x011e, B:46:0x00d0), top: B:71:0x0045 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d0 A[Catch: all -> 0x0063, TryCatch #0 {all -> 0x0063, blocks: (B:23:0x0045, B:25:0x0049, B:29:0x005f, B:32:0x0066, B:36:0x006e, B:41:0x00a9, B:64:0x0121, B:66:0x012a, B:43:0x00c4, B:45:0x00cd, B:47:0x00d2, B:49:0x00e7, B:53:0x00f0, B:54:0x00f5, B:56:0x00fb, B:60:0x0109, B:62:0x010e, B:63:0x011e, B:46:0x00d0), top: B:71:0x0045 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00e7 A[Catch: all -> 0x0063, TryCatch #0 {all -> 0x0063, blocks: (B:23:0x0045, B:25:0x0049, B:29:0x005f, B:32:0x0066, B:36:0x006e, B:41:0x00a9, B:64:0x0121, B:66:0x012a, B:43:0x00c4, B:45:0x00cd, B:47:0x00d2, B:49:0x00e7, B:53:0x00f0, B:54:0x00f5, B:56:0x00fb, B:60:0x0109, B:62:0x010e, B:63:0x011e, B:46:0x00d0), top: B:71:0x0045 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:56:0x00fb A[Catch: all -> 0x0063, TryCatch #0 {all -> 0x0063, blocks: (B:23:0x0045, B:25:0x0049, B:29:0x005f, B:32:0x0066, B:36:0x006e, B:41:0x00a9, B:64:0x0121, B:66:0x012a, B:43:0x00c4, B:45:0x00cd, B:47:0x00d2, B:49:0x00e7, B:53:0x00f0, B:54:0x00f5, B:56:0x00fb, B:60:0x0109, B:62:0x010e, B:63:0x011e, B:46:0x00d0), top: B:71:0x0045 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0106  */
    /* JADX WARN: Code duplicated, block: B:59:0x0108  */
    /* JADX WARN: Code duplicated, block: B:62:0x010e A[Catch: all -> 0x0063, TryCatch #0 {all -> 0x0063, blocks: (B:23:0x0045, B:25:0x0049, B:29:0x005f, B:32:0x0066, B:36:0x006e, B:41:0x00a9, B:64:0x0121, B:66:0x012a, B:43:0x00c4, B:45:0x00cd, B:47:0x00d2, B:49:0x00e7, B:53:0x00f0, B:54:0x00f5, B:56:0x00fb, B:60:0x0109, B:62:0x010e, B:63:0x011e, B:46:0x00d0), top: B:71:0x0045 }] */
    @Override // p000.c22
    /* JADX INFO: renamed from: a */
    public final void mo1114a(long j, int i, int i2, int i3, b22 b22Var) {
        f40 f40Var;
        C0082b0 c0082b0;
        int i4;
        SparseArray sparseArray;
        int iKeyAt;
        boolean z;
        boolean z2;
        int i5 = i & 1;
        boolean z3 = i5 != 0;
        if (this.f12684x) {
            if (!z3) {
                return;
            } else {
                this.f12684x = false;
            }
        }
        if (this.f12659A) {
            if (j < this.f12680t) {
                return;
            }
            if (i5 == 0) {
                if (!this.f12660B) {
                    AbstractC1337qm.m5542i0("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.f12686z);
                    this.f12660B = true;
                }
                i |= 1;
            }
        }
        long j2 = (this.f12661a.f11738g - ((long) i2)) - ((long) i3);
        synchronized (this) {
            try {
                int i6 = this.f12676p;
                if (i6 > 0) {
                    int iM6940h = m6940h(i6 - 1);
                    ki0.m3857c(this.f12671k[iM6940h] + ((long) this.f12672l[iM6940h]) <= j2);
                }
                this.f12683w = (536870912 & i) != 0;
                this.f12682v = Math.max(this.f12682v, j);
                int iM6940h2 = m6940h(this.f12676p);
                this.f12674n[iM6940h2] = j;
                this.f12671k[iM6940h2] = j2;
                this.f12672l[iM6940h2] = i2;
                this.f12673m[iM6940h2] = i;
                this.f12675o[iM6940h2] = b22Var;
                this.f12670j[iM6940h2] = 0;
                if (((SparseArray) this.f12663c.f1104c).size() == 0) {
                    be0 be0Var = this.f12686z;
                    be0Var.getClass();
                    if (this.f12664d != null) {
                        f40Var = f40.f3611b;
                    } else {
                        f40Var = f40.f3611b;
                    }
                    c0082b0 = this.f12663c;
                    i4 = this.f12677q + this.f12676p;
                    wo1 wo1Var = new wo1(f40Var, be0Var);
                    sparseArray = (SparseArray) c0082b0.f1104c;
                    if (c0082b0.f1103b == -1) {
                        if (sparseArray.size() == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        ki0.m3864h(z2);
                        c0082b0.f1103b = 0;
                    }
                    if (sparseArray.size() > 0) {
                        iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                        if (i4 >= iKeyAt) {
                            z = true;
                        } else {
                            z = false;
                        }
                        ki0.m3857c(z);
                        if (iKeyAt == i4) {
                            ((l41) c0082b0.f1105d).accept(sparseArray.valueAt(sparseArray.size() - 1));
                        }
                    }
                    sparseArray.append(i4, wo1Var);
                } else {
                    SparseArray sparseArray2 = (SparseArray) this.f12663c.f1104c;
                    if (!((wo1) sparseArray2.valueAt(sparseArray2.size() - 1)).f12243a.equals(this.f12686z)) {
                        be0 be0Var2 = this.f12686z;
                        be0Var2.getClass();
                        if (this.f12664d != null) {
                            f40Var = f40.f3611b;
                        } else {
                            f40Var = f40.f3611b;
                        }
                        c0082b0 = this.f12663c;
                        i4 = this.f12677q + this.f12676p;
                        wo1 wo1Var2 = new wo1(f40Var, be0Var2);
                        sparseArray = (SparseArray) c0082b0.f1104c;
                        if (c0082b0.f1103b == -1) {
                            if (sparseArray.size() == 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            ki0.m3864h(z2);
                            c0082b0.f1103b = 0;
                        }
                        if (sparseArray.size() > 0) {
                            iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                            if (i4 >= iKeyAt) {
                                z = true;
                            } else {
                                z = false;
                            }
                            ki0.m3857c(z);
                            if (iKeyAt == i4) {
                                ((l41) c0082b0.f1105d).accept(sparseArray.valueAt(sparseArray.size() - 1));
                            }
                        }
                        sparseArray.append(i4, wo1Var2);
                    }
                }
                int i7 = this.f12676p + 1;
                this.f12676p = i7;
                int i8 = this.f12669i;
                if (i7 == i8) {
                    int i9 = i8 + 1000;
                    long[] jArr = new long[i9];
                    long[] jArr2 = new long[i9];
                    long[] jArr3 = new long[i9];
                    int[] iArr = new int[i9];
                    int[] iArr2 = new int[i9];
                    b22[] b22VarArr = new b22[i9];
                    int i10 = this.f12678r;
                    int i11 = i8 - i10;
                    System.arraycopy(this.f12671k, i10, jArr2, 0, i11);
                    System.arraycopy(this.f12674n, this.f12678r, jArr3, 0, i11);
                    System.arraycopy(this.f12673m, this.f12678r, iArr, 0, i11);
                    System.arraycopy(this.f12672l, this.f12678r, iArr2, 0, i11);
                    System.arraycopy(this.f12675o, this.f12678r, b22VarArr, 0, i11);
                    System.arraycopy(this.f12670j, this.f12678r, jArr, 0, i11);
                    int i12 = this.f12678r;
                    System.arraycopy(this.f12671k, 0, jArr2, i11, i12);
                    System.arraycopy(this.f12674n, 0, jArr3, i11, i12);
                    System.arraycopy(this.f12673m, 0, iArr, i11, i12);
                    System.arraycopy(this.f12672l, 0, iArr2, i11, i12);
                    System.arraycopy(this.f12675o, 0, b22VarArr, i11, i12);
                    System.arraycopy(this.f12670j, 0, jArr, i11, i12);
                    this.f12671k = jArr2;
                    this.f12674n = jArr3;
                    this.f12673m = iArr;
                    this.f12672l = iArr2;
                    this.f12675o = b22VarArr;
                    this.f12670j = jArr;
                    this.f12678r = 0;
                    this.f12669i = i9;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.c22
    /* JADX INFO: renamed from: b */
    public final void mo1115b(dc1 dc1Var, int i, int i2) {
        while (true) {
            vo1 vo1Var = this.f12661a;
            if (i <= 0) {
                vo1Var.getClass();
                return;
            }
            int iM6650b = vo1Var.m6650b(i);
            C0642fj c0642fj = vo1Var.f11737f;
            C1468u5 c1468u5 = (C1468u5) c0642fj.f3826c;
            dc1Var.m2322e(((int) (vo1Var.f11738g - c0642fj.f3824a)) + c1468u5.f11123b, iM6650b, c1468u5.f11122a);
            i -= iM6650b;
            long j = vo1Var.f11738g + ((long) iM6650b);
            vo1Var.f11738g = j;
            C0642fj c0642fj2 = vo1Var.f11737f;
            if (j == c0642fj2.f3825b) {
                vo1Var.f11737f = (C0642fj) c0642fj2.f3827d;
            }
        }
    }

    @Override // p000.c22
    /* JADX INFO: renamed from: c */
    public final int mo1116c(InterfaceC0693gx interfaceC0693gx, int i, boolean z) throws EOFException {
        vo1 vo1Var = this.f12661a;
        int iM6650b = vo1Var.m6650b(i);
        C0642fj c0642fj = vo1Var.f11737f;
        C1468u5 c1468u5 = (C1468u5) c0642fj.f3826c;
        int i2 = interfaceC0693gx.read(c1468u5.f11122a, ((int) (vo1Var.f11738g - c0642fj.f3824a)) + c1468u5.f11123b, iM6650b);
        if (i2 == -1) {
            if (z) {
                return -1;
            }
            f40.m2708d();
            return 0;
        }
        long j = vo1Var.f11738g + ((long) i2);
        vo1Var.f11738g = j;
        C0642fj c0642fj2 = vo1Var.f11737f;
        if (j == c0642fj2.f3825b) {
            vo1Var.f11737f = (C0642fj) c0642fj2.f3827d;
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0055 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:4:0x0002, B:8:0x0011, B:13:0x0023, B:15:0x003c, B:19:0x0057, B:81:0x010d, B:73:0x00fa, B:76:0x0102, B:18:0x0055), top: B:91:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0063  */
    /* JADX WARN: Code duplicated, block: B:80:0x010c  */
    @Override // p000.c22
    /* JADX INFO: renamed from: d */
    public final void mo1117d(be0 be0Var) {
        boolean z;
        boolean z2;
        g21 g21VarM6575e;
        int iM2920a;
        synchronized (this) {
            z = false;
            try {
                this.f12685y = false;
                be0 be0Var2 = this.f12686z;
                int i = z42.f13274a;
                if (!Objects.equals(be0Var, be0Var2)) {
                    if (((SparseArray) this.f12663c.f1104c).size() == 0) {
                        this.f12686z = be0Var;
                    } else {
                        SparseArray sparseArray = (SparseArray) this.f12663c.f1104c;
                        if (((wo1) sparseArray.valueAt(sparseArray.size() - 1)).f12243a.equals(be0Var)) {
                            SparseArray sparseArray2 = (SparseArray) this.f12663c.f1104c;
                            this.f12686z = ((wo1) sparseArray2.valueAt(sparseArray2.size() - 1)).f12243a;
                        } else {
                            this.f12686z = be0Var;
                        }
                    }
                    boolean z3 = this.f12659A;
                    be0 be0Var3 = this.f12686z;
                    String str = be0Var3.f1341n;
                    String str2 = be0Var3.f1338k;
                    ArrayList arrayList = v51.f11551a;
                    if (str != null) {
                        switch (str) {
                            case "audio/eac3-joc":
                            case "audio/mpeg-L1":
                            case "audio/mpeg-L2":
                            case "audio/ac3":
                            case "audio/raw":
                            case "audio/eac3":
                            case "audio/flac":
                            case "audio/mpeg":
                            case "audio/g711-alaw":
                            case "audio/g711-mlaw":
                                z2 = true;
                                break;
                            case "audio/mp4a-latm":
                                if (str2 != null && (g21VarM6575e = v51.m6575e(str2)) != null && (iM2920a = g21VarM6575e.m2920a()) != 0 && iM2920a != 16) {
                                    z2 = true;
                                    break;
                                } else {
                                    z2 = false;
                                    break;
                                }
                                break;
                            default:
                                z2 = false;
                                break;
                        }
                    } else {
                        z2 = false;
                    }
                    this.f12659A = z3 & z2;
                    this.f12660B = false;
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        wg1 wg1Var = this.f12666f;
        if (wg1Var == null || !z) {
            return;
        }
        wg1Var.f12170v.post(wg1Var.f12168t);
    }

    /* JADX INFO: renamed from: e */
    public final long m6937e(int i) {
        long j = this.f12681u;
        int i2 = 0;
        long jMax = Long.MIN_VALUE;
        if (i != 0) {
            int iM6940h = m6940h(i - 1);
            for (int i3 = 0; i3 < i; i3++) {
                jMax = Math.max(jMax, this.f12674n[iM6940h]);
                if ((this.f12673m[iM6940h] & 1) != 0) {
                    break;
                }
                iM6940h--;
                if (iM6940h == -1) {
                    iM6940h = this.f12669i - 1;
                }
            }
        }
        this.f12681u = Math.max(j, jMax);
        this.f12676p -= i;
        int i4 = this.f12677q + i;
        this.f12677q = i4;
        int i5 = this.f12678r + i;
        this.f12678r = i5;
        int i6 = this.f12669i;
        if (i5 >= i6) {
            this.f12678r = i5 - i6;
        }
        int i7 = this.f12679s - i;
        this.f12679s = i7;
        if (i7 < 0) {
            this.f12679s = 0;
        }
        C0082b0 c0082b0 = this.f12663c;
        SparseArray sparseArray = (SparseArray) c0082b0.f1104c;
        while (i2 < sparseArray.size() - 1) {
            int i8 = i2 + 1;
            if (i4 < sparseArray.keyAt(i8)) {
                break;
            }
            ((l41) c0082b0.f1105d).accept(sparseArray.valueAt(i2));
            sparseArray.removeAt(i2);
            int i9 = c0082b0.f1103b;
            if (i9 > 0) {
                c0082b0.f1103b = i9 - 1;
            }
            i2 = i8;
        }
        if (this.f12676p != 0) {
            return this.f12671k[this.f12678r];
        }
        int i10 = this.f12678r;
        if (i10 == 0) {
            i10 = this.f12669i;
        }
        int i11 = i10 - 1;
        return this.f12671k[i11] + ((long) this.f12672l[i11]);
    }

    /* JADX INFO: renamed from: f */
    public final void m6938f() {
        long jM6937e;
        vo1 vo1Var = this.f12661a;
        synchronized (this) {
            int i = this.f12676p;
            jM6937e = i == 0 ? -1L : m6937e(i);
        }
        vo1Var.m6649a(jM6937e);
    }

    /* JADX INFO: renamed from: g */
    public final int m6939g(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.f12674n[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.f12673m[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.f12669i) {
                i = 0;
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: h */
    public final int m6940h(int i) {
        int i2 = this.f12678r + i;
        int i3 = this.f12669i;
        return i2 < i3 ? i2 : i2 - i3;
    }

    /* JADX INFO: renamed from: i */
    public final synchronized boolean m6941i(boolean z) {
        be0 be0Var;
        int i = this.f12679s;
        boolean z2 = false;
        if (i != this.f12676p) {
            if (((wo1) this.f12663c.m804f(this.f12677q + i)).f12243a != this.f12667g) {
                return true;
            }
            return m6942j(m6940h(this.f12679s));
        }
        if (z || this.f12683w || ((be0Var = this.f12686z) != null && be0Var != this.f12667g)) {
            z2 = true;
        }
        return z2;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m6942j(int i) {
        ay0 ay0Var = this.f12668h;
        if (ay0Var == null || ay0Var.m788x() == 4) {
            return true;
        }
        if ((this.f12673m[i] & 1073741824) != 0) {
            return false;
        }
        this.f12668h.getClass();
        return false;
    }

    /* JADX INFO: renamed from: k */
    public final void m6943k(be0 be0Var, C0558d8 c0558d8) {
        be0 be0Var2;
        be0 be0Var3 = this.f12667g;
        boolean z = be0Var3 == null;
        z30 z30Var = be0Var3 == null ? null : be0Var3.f1345r;
        this.f12667g = be0Var;
        z30 z30Var2 = be0Var.f1345r;
        g40 g40Var = this.f12664d;
        if (g40Var != null) {
            int iMo2497d = g40Var.mo2497d(be0Var);
            ae0 ae0VarM969a = be0Var.m969a();
            ae0VarM969a.f184K = iMo2497d;
            be0Var2 = new be0(ae0VarM969a);
        } else {
            be0Var2 = be0Var;
        }
        c0558d8.f2822c = be0Var2;
        c0558d8.f2821b = this.f12668h;
        if (g40Var == null) {
            return;
        }
        if (z || !Objects.equals(z30Var, z30Var2)) {
            ay0 ay0Var = this.f12668h;
            c40 c40Var = this.f12665e;
            ay0 ay0VarMo2495a = g40Var.mo2495a(c40Var, be0Var);
            this.f12668h = ay0VarMo2495a;
            c0558d8.f2821b = ay0VarMo2495a;
            if (ay0Var != null) {
                ay0Var.m763B(c40Var);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m6944l(boolean z) {
        vo1 vo1Var = this.f12661a;
        C0642fj c0642fj = vo1Var.f11735d;
        if (((C1468u5) c0642fj.f3826c) != null) {
            C0547cy c0547cy = vo1Var.f11732a;
            synchronized (c0547cy) {
                C0642fj c0642fj2 = c0642fj;
                while (c0642fj2 != null) {
                    try {
                        C1468u5[] c1468u5Arr = c0547cy.f2660f;
                        int i = c0547cy.f2659e;
                        c0547cy.f2659e = i + 1;
                        C1468u5 c1468u5 = (C1468u5) c0642fj2.f3826c;
                        c1468u5.getClass();
                        c1468u5Arr[i] = c1468u5;
                        c0547cy.f2658d--;
                        c0642fj2 = (C0642fj) c0642fj2.f3827d;
                        if (c0642fj2 == null || ((C1468u5) c0642fj2.f3826c) == null) {
                            c0642fj2 = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                c0547cy.notifyAll();
            }
            c0642fj.f3826c = null;
            c0642fj.f3827d = null;
        }
        C0642fj c0642fj3 = vo1Var.f11735d;
        int i2 = vo1Var.f11733b;
        ki0.m3864h(((C1468u5) c0642fj3.f3826c) == null);
        c0642fj3.f3824a = 0L;
        c0642fj3.f3825b = i2;
        C0642fj c0642fj4 = vo1Var.f11735d;
        vo1Var.f11736e = c0642fj4;
        vo1Var.f11737f = c0642fj4;
        vo1Var.f11738g = 0L;
        vo1Var.f11732a.m2137b();
        this.f12676p = 0;
        this.f12677q = 0;
        this.f12678r = 0;
        this.f12679s = 0;
        this.f12684x = true;
        this.f12680t = Long.MIN_VALUE;
        this.f12681u = Long.MIN_VALUE;
        this.f12682v = Long.MIN_VALUE;
        this.f12683w = false;
        C0082b0 c0082b0 = this.f12663c;
        SparseArray sparseArray = (SparseArray) c0082b0.f1104c;
        for (int i3 = 0; i3 < sparseArray.size(); i3++) {
            ((l41) c0082b0.f1105d).accept(sparseArray.valueAt(i3));
        }
        c0082b0.f1103b = -1;
        sparseArray.clear();
        if (z) {
            this.f12686z = null;
            this.f12685y = true;
            this.f12659A = true;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0083 */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean m6945m(long r12, boolean r14) {
        /*
            r11 = this;
            monitor-enter(r11)
            monitor-enter(r11)     // Catch: java.lang.Throwable -> L74
            r0 = 0
            r11.f12679s = r0     // Catch: java.lang.Throwable -> L7c
            vo1 r1 = r11.f12661a     // Catch: java.lang.Throwable -> L7c
            fj r2 = r1.f11735d     // Catch: java.lang.Throwable -> L7c
            r1.f11736e = r2     // Catch: java.lang.Throwable -> L7c
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L79
            int r4 = r11.m6940h(r0)     // Catch: java.lang.Throwable -> L6f
            int r1 = r11.f12679s     // Catch: java.lang.Throwable -> L74
            int r2 = r11.f12676p     // Catch: java.lang.Throwable -> L74
            r9 = 1
            if (r1 == r2) goto L19
            r3 = r9
            goto L1a
        L19:
            r3 = r0
        L1a:
            if (r3 == 0) goto L2c
            long[] r3 = r11.f12674n     // Catch: java.lang.Throwable -> L6f
            r5 = r3[r4]     // Catch: java.lang.Throwable -> L6f
            int r3 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r3 < 0) goto L2c
            long r5 = r11.f12682v     // Catch: java.lang.Throwable -> L6f
            int r3 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r3 <= 0) goto L2e
            if (r14 != 0) goto L2e
        L2c:
            r3 = r11
            goto L72
        L2e:
            boolean r3 = r11.f12659A     // Catch: java.lang.Throwable -> L6f
            r10 = -1
            if (r3 == 0) goto L56
            int r2 = r2 - r1
            r1 = r0
        L35:
            if (r1 >= r2) goto L4f
            long[] r3 = r11.f12674n     // Catch: java.lang.Throwable -> L4b
            r5 = r3[r4]     // Catch: java.lang.Throwable -> L4b
            int r3 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r3 < 0) goto L41
            r2 = r1
            goto L53
        L41:
            int r4 = r4 + 1
            int r3 = r11.f12669i     // Catch: java.lang.Throwable -> L4b
            if (r4 != r3) goto L48
            r4 = r0
        L48:
            int r1 = r1 + 1
            goto L35
        L4b:
            r0 = move-exception
            r12 = r0
            r3 = r11
            goto L85
        L4f:
            if (r14 == 0) goto L52
            goto L53
        L52:
            r2 = r10
        L53:
            r3 = r11
            r6 = r12
            goto L5f
        L56:
            int r5 = r2 - r1
            r8 = 1
            r3 = r11
            r6 = r12
            int r2 = r3.m6939g(r4, r5, r6, r8)     // Catch: java.lang.Throwable -> L6c
        L5f:
            if (r2 != r10) goto L63
            monitor-exit(r3)
            return r0
        L63:
            r3.f12680t = r6     // Catch: java.lang.Throwable -> L6c
            int r11 = r3.f12679s     // Catch: java.lang.Throwable -> L6c
            int r11 = r11 + r2
            r3.f12679s = r11     // Catch: java.lang.Throwable -> L6c
            monitor-exit(r3)
            return r9
        L6c:
            r0 = move-exception
        L6d:
            r12 = r0
            goto L85
        L6f:
            r0 = move-exception
            r3 = r11
            goto L6d
        L72:
            monitor-exit(r3)
            return r0
        L74:
            r0 = move-exception
            r3 = r11
        L76:
            r11 = r0
            r12 = r11
            goto L85
        L79:
            r0 = move-exception
            r3 = r11
            goto L76
        L7c:
            r0 = move-exception
            r3 = r11
        L7e:
            r11 = r0
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L83
            throw r11     // Catch: java.lang.Throwable -> L81
        L81:
            r0 = move-exception
            goto L76
        L83:
            r0 = move-exception
            goto L7e
        L85:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L6c
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.xo1.m6945m(long, boolean):boolean");
    }
}
