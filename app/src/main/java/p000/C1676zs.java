package p000;

import com.example.ssmousepro.injection.TouchPipeline;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: zs */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1676zs extends C1639ys {

    /* JADX INFO: renamed from: A0 */
    public int f13524A0;

    /* JADX INFO: renamed from: B0 */
    public C0755im[] f13525B0;

    /* JADX INFO: renamed from: C0 */
    public C0755im[] f13526C0;

    /* JADX INFO: renamed from: D0 */
    public int f13527D0;

    /* JADX INFO: renamed from: E0 */
    public boolean f13528E0;

    /* JADX INFO: renamed from: F0 */
    public boolean f13529F0;

    /* JADX INFO: renamed from: G0 */
    public WeakReference f13530G0;

    /* JADX INFO: renamed from: H0 */
    public WeakReference f13531H0;

    /* JADX INFO: renamed from: I0 */
    public WeakReference f13532I0;

    /* JADX INFO: renamed from: J0 */
    public WeakReference f13533J0;

    /* JADX INFO: renamed from: K0 */
    public final HashSet f13534K0;

    /* JADX INFO: renamed from: L0 */
    public final C1332qh f13535L0;

    /* JADX INFO: renamed from: q0 */
    public ArrayList f13536q0 = new ArrayList();

    /* JADX INFO: renamed from: r0 */
    public final C1174o9 f13537r0 = new C1174o9(this);

    /* JADX INFO: renamed from: s0 */
    public final z10 f13538s0;

    /* JADX INFO: renamed from: t0 */
    public int f13539t0;

    /* JADX INFO: renamed from: u0 */
    public ch1 f13540u0;

    /* JADX INFO: renamed from: v0 */
    public boolean f13541v0;

    /* JADX INFO: renamed from: w0 */
    public final xs0 f13542w0;

    /* JADX INFO: renamed from: x0 */
    public int f13543x0;

    /* JADX INFO: renamed from: y0 */
    public int f13544y0;

    /* JADX INFO: renamed from: z0 */
    public int f13545z0;

    public C1676zs() {
        z10 z10Var = new z10();
        z10Var.f13223b = true;
        z10Var.f13224c = true;
        z10Var.f13226e = new ArrayList();
        new ArrayList();
        z10Var.f13227f = null;
        z10Var.f13228g = new C1332qh();
        z10Var.f13229h = new ArrayList();
        z10Var.f13222a = this;
        z10Var.f13225d = this;
        this.f13538s0 = z10Var;
        this.f13540u0 = null;
        this.f13541v0 = false;
        this.f13542w0 = new xs0();
        this.f13545z0 = 0;
        this.f13524A0 = 0;
        this.f13525B0 = new C0755im[4];
        this.f13526C0 = new C0755im[4];
        this.f13527D0 = 257;
        this.f13528E0 = false;
        this.f13529F0 = false;
        this.f13530G0 = null;
        this.f13531H0 = null;
        this.f13532I0 = null;
        this.f13533J0 = null;
        this.f13534K0 = new HashSet();
        this.f13535L0 = new C1332qh();
    }

    /* JADX INFO: renamed from: V */
    public static void m7336V(C1639ys c1639ys, ch1 ch1Var, C1332qh c1332qh) {
        int i;
        int i2;
        if (ch1Var == null) {
            return;
        }
        int i3 = c1639ys.f13097g0;
        int[] iArr = c1639ys.f13119t;
        if (i3 == 8 || (c1639ys instanceof xi0) || (c1639ys instanceof C1553wg)) {
            c1332qh.f9504e = 0;
            c1332qh.f9505f = 0;
            return;
        }
        int[] iArr2 = c1639ys.f13115p0;
        c1332qh.f9500a = iArr2[0];
        c1332qh.f9501b = iArr2[1];
        c1332qh.f9502c = c1639ys.m7135q();
        c1332qh.f9503d = c1639ys.m7131k();
        c1332qh.f9508i = false;
        c1332qh.f9509j = 0;
        boolean z = c1332qh.f9500a == 3;
        boolean z2 = c1332qh.f9501b == 3;
        boolean z3 = z && c1639ys.f13080W > TouchPipeline.SIZE;
        boolean z4 = z2 && c1639ys.f13080W > TouchPipeline.SIZE;
        if (z && c1639ys.m7138t(0) && c1639ys.f13117r == 0 && !z3) {
            c1332qh.f9500a = 2;
            if (z2 && c1639ys.f13118s == 0) {
                c1332qh.f9500a = 1;
            }
            z = false;
        }
        if (z2 && c1639ys.m7138t(1) && c1639ys.f13118s == 0 && !z4) {
            c1332qh.f9501b = 2;
            if (z && c1639ys.f13117r == 0) {
                c1332qh.f9501b = 1;
            }
            z2 = false;
        }
        if (c1639ys.mo6773A()) {
            c1332qh.f9500a = 1;
            z = false;
        }
        if (c1639ys.mo6774B()) {
            c1332qh.f9501b = 1;
            z2 = false;
        }
        if (z3) {
            if (iArr[0] == 4) {
                c1332qh.f9500a = 1;
            } else if (!z2) {
                if (c1332qh.f9501b == 1) {
                    i2 = c1332qh.f9503d;
                } else {
                    c1332qh.f9500a = 2;
                    ch1Var.m1220d(c1639ys, c1332qh);
                    i2 = c1332qh.f9505f;
                }
                c1332qh.f9500a = 1;
                c1332qh.f9502c = (int) (c1639ys.f13080W * i2);
            }
        }
        if (z4) {
            if (iArr[1] == 4) {
                c1332qh.f9501b = 1;
            } else if (!z) {
                if (c1332qh.f9500a == 1) {
                    i = c1332qh.f9502c;
                } else {
                    c1332qh.f9501b = 2;
                    ch1Var.m1220d(c1639ys, c1332qh);
                    i = c1332qh.f9504e;
                }
                c1332qh.f9501b = 1;
                int i4 = c1639ys.f13081X;
                float f = c1639ys.f13080W;
                if (i4 == -1) {
                    c1332qh.f9503d = (int) (i / f);
                } else {
                    c1332qh.f9503d = (int) (f * i);
                }
            }
        }
        ch1Var.m1220d(c1639ys, c1332qh);
        c1639ys.m7122O(c1332qh.f9504e);
        c1639ys.m7119L(c1332qh.f9505f);
        c1639ys.f13062E = c1332qh.f9507h;
        c1639ys.m7116I(c1332qh.f9506g);
        c1332qh.f9509j = 0;
    }

    @Override // p000.C1639ys
    /* JADX INFO: renamed from: C */
    public final void mo7112C() {
        this.f13542w0.m6974t();
        this.f13543x0 = 0;
        this.f13544y0 = 0;
        this.f13536q0.clear();
        super.mo7112C();
    }

    @Override // p000.C1639ys
    /* JADX INFO: renamed from: F */
    public final void mo7115F(C1174o9 c1174o9) {
        super.mo7115F(c1174o9);
        int size = this.f13536q0.size();
        for (int i = 0; i < size; i++) {
            ((C1639ys) this.f13536q0.get(i)).mo7115F(c1174o9);
        }
    }

    @Override // p000.C1639ys
    /* JADX INFO: renamed from: P */
    public final void mo7123P(boolean z, boolean z2) {
        super.mo7123P(z, z2);
        int size = this.f13536q0.size();
        for (int i = 0; i < size; i++) {
            ((C1639ys) this.f13536q0.get(i)).mo7123P(z, z2);
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m7337R(C1639ys c1639ys, int i) {
        if (i == 0) {
            int i2 = this.f13545z0 + 1;
            C0755im[] c0755imArr = this.f13526C0;
            if (i2 >= c0755imArr.length) {
                this.f13526C0 = (C0755im[]) Arrays.copyOf(c0755imArr, c0755imArr.length * 2);
            }
            C0755im[] c0755imArr2 = this.f13526C0;
            int i3 = this.f13545z0;
            c0755imArr2[i3] = new C0755im(c1639ys, 0, this.f13541v0);
            this.f13545z0 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.f13524A0 + 1;
            C0755im[] c0755imArr3 = this.f13525B0;
            if (i4 >= c0755imArr3.length) {
                this.f13525B0 = (C0755im[]) Arrays.copyOf(c0755imArr3, c0755imArr3.length * 2);
            }
            C0755im[] c0755imArr4 = this.f13525B0;
            int i5 = this.f13524A0;
            c0755imArr4[i5] = new C0755im(c1639ys, 1, this.f13541v0);
            this.f13524A0 = i5 + 1;
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m7338S(xs0 xs0Var) {
        C1676zs c1676zs;
        xs0 xs0Var2;
        boolean zM7341W = m7341W(64);
        mo3424b(xs0Var, zM7341W);
        int size = this.f13536q0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            C1639ys c1639ys = (C1639ys) this.f13536q0.get(i);
            boolean[] zArr = c1639ys.f13076S;
            zArr[0] = false;
            zArr[1] = false;
            if (c1639ys instanceof C1553wg) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                C1639ys c1639ys2 = (C1639ys) this.f13536q0.get(i2);
                if (c1639ys2 instanceof C1553wg) {
                    C1553wg c1553wg = (C1553wg) c1639ys2;
                    for (int i3 = 0; i3 < c1553wg.f4612r0; i3++) {
                        C1639ys c1639ys3 = c1553wg.f4611q0[i3];
                        if (c1553wg.f12129t0 || c1639ys3.mo6777c()) {
                            int i4 = c1553wg.f12128s0;
                            if (i4 == 0 || i4 == 1) {
                                c1639ys3.f13076S[0] = true;
                            } else if (i4 == 2 || i4 == 3) {
                                c1639ys3.f13076S[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.f13534K0;
        hashSet.clear();
        for (int i5 = 0; i5 < size; i5++) {
            C1639ys c1639ys4 = (C1639ys) this.f13536q0.get(i5);
            c1639ys4.getClass();
            boolean z2 = c1639ys4 instanceof id0;
            if (z2 || (c1639ys4 instanceof xi0)) {
                if (z2) {
                    hashSet.add(c1639ys4);
                } else {
                    c1639ys4.mo3424b(xs0Var, zM7341W);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                id0 id0Var = (id0) ((C1639ys) it.next());
                for (int i6 = 0; i6 < id0Var.f4612r0; i6++) {
                    if (hashSet.contains(id0Var.f4611q0[i6])) {
                        id0Var.mo3424b(xs0Var, zM7341W);
                        hashSet.remove(id0Var);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((C1639ys) it2.next()).mo3424b(xs0Var, zM7341W);
                }
                hashSet.clear();
            }
        }
        if (xs0.f12704p) {
            HashSet<C1639ys> hashSet2 = new HashSet();
            for (int i7 = 0; i7 < size; i7++) {
                C1639ys c1639ys5 = (C1639ys) this.f13536q0.get(i7);
                c1639ys5.getClass();
                if (!(c1639ys5 instanceof id0) && !(c1639ys5 instanceof xi0)) {
                    hashSet2.add(c1639ys5);
                }
            }
            c1676zs = this;
            xs0Var2 = xs0Var;
            c1676zs.m7124a(this, xs0Var2, hashSet2, this.f13115p0[0] == 2 ? 0 : 1, false);
            for (C1639ys c1639ys6 : hashSet2) {
                rc2.m5787i(c1676zs, xs0Var2, c1639ys6);
                c1639ys6.mo3424b(xs0Var2, zM7341W);
            }
        } else {
            c1676zs = this;
            xs0Var2 = xs0Var;
            for (int i8 = 0; i8 < size; i8++) {
                C1639ys c1639ys7 = (C1639ys) c1676zs.f13536q0.get(i8);
                if (c1639ys7 instanceof C1676zs) {
                    int[] iArr = c1639ys7.f13115p0;
                    int i9 = iArr[0];
                    int i10 = iArr[1];
                    if (i9 == 2) {
                        c1639ys7.m7120M(1);
                    }
                    if (i10 == 2) {
                        c1639ys7.m7121N(1);
                    }
                    c1639ys7.mo3424b(xs0Var2, zM7341W);
                    if (i9 == 2) {
                        c1639ys7.m7120M(i9);
                    }
                    if (i10 == 2) {
                        c1639ys7.m7121N(i10);
                    }
                } else {
                    rc2.m5787i(c1676zs, xs0Var2, c1639ys7);
                    if (!(c1639ys7 instanceof id0) && !(c1639ys7 instanceof xi0)) {
                        c1639ys7.mo3424b(xs0Var2, zM7341W);
                    }
                }
            }
        }
        if (c1676zs.f13545z0 > 0) {
            hp0.m3213d(c1676zs, xs0Var2, null, 0);
        }
        if (c1676zs.f13524A0 > 0) {
            hp0.m3213d(c1676zs, xs0Var2, null, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0096  */
    /* JADX INFO: renamed from: T */
    public final boolean m7339T(int i, boolean z) {
        boolean z2;
        z10 z10Var = this.f13538s0;
        ArrayList arrayList = z10Var.f13226e;
        C1676zs c1676zs = z10Var.f13222a;
        boolean z3 = false;
        int iM7130j = c1676zs.m7130j(0);
        int iM7130j2 = c1676zs.m7130j(1);
        int iM7136r = c1676zs.m7136r();
        int iM7137s = c1676zs.m7137s();
        if (z && (iM7130j == 2 || iM7130j2 == 2)) {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                r92 r92Var = (r92) obj;
                if (r92Var.f9850f == i && !r92Var.mo3004k()) {
                    z = false;
                    break;
                }
            }
            if (i == 0) {
                if (z && iM7130j == 2) {
                    c1676zs.m7120M(1);
                    c1676zs.m7122O(z10Var.m7179d(c1676zs, 0));
                    c1676zs.f13090d.f9849e.mo53d(c1676zs.m7135q());
                }
            } else if (z && iM7130j2 == 2) {
                c1676zs.m7121N(1);
                c1676zs.m7119L(z10Var.m7179d(c1676zs, 1));
                c1676zs.f13092e.f9849e.mo53d(c1676zs.m7131k());
            }
        }
        int[] iArr = c1676zs.f13115p0;
        if (i == 0) {
            int i3 = iArr[0];
            if (i3 == 1 || i3 == 4) {
                int iM7135q = c1676zs.m7135q() + iM7136r;
                c1676zs.f13090d.f9853i.mo53d(iM7135q);
                c1676zs.f13090d.f9849e.mo53d(iM7135q - iM7136r);
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            int i4 = iArr[1];
            if (i4 == 1 || i4 == 4) {
                int iM7131k = c1676zs.m7131k() + iM7137s;
                c1676zs.f13092e.f9853i.mo53d(iM7131k);
                c1676zs.f13092e.f9849e.mo53d(iM7131k - iM7137s);
                z2 = true;
            } else {
                z2 = false;
            }
        }
        z10Var.m7182g();
        int size2 = arrayList.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj2 = arrayList.get(i5);
            i5++;
            r92 r92Var2 = (r92) obj2;
            if (r92Var2.f9850f == i && (r92Var2.f9846b != c1676zs || r92Var2.f9851g)) {
                r92Var2.mo3002e();
            }
        }
        int size3 = arrayList.size();
        int i6 = 0;
        while (i6 < size3) {
            Object obj3 = arrayList.get(i6);
            i6++;
            r92 r92Var3 = (r92) obj3;
            if (r92Var3.f9850f == i && (z2 || r92Var3.f9846b != c1676zs)) {
                if (!r92Var3.f9852h.f36j || !r92Var3.f9853i.f36j || (!(r92Var3 instanceof C0796jm) && !r92Var3.f9849e.f36j)) {
                    c1676zs.m7120M(iM7130j);
                    c1676zs.m7121N(iM7130j2);
                    return z3;
                }
            }
        }
        z3 = true;
        c1676zs.m7120M(iM7130j);
        c1676zs.m7121N(iM7130j2);
        return z3;
    }

    /* JADX WARN: Code duplicated, block: B:339:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:341:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:349:0x0603  */
    /* JADX WARN: Code duplicated, block: B:350:0x060a  */
    /* JADX WARN: Code duplicated, block: B:356:0x061e  */
    /* JADX WARN: Code duplicated, block: B:362:0x0637  */
    /* JADX WARN: Code duplicated, block: B:365:0x063d  */
    /* JADX WARN: Code duplicated, block: B:367:0x0645 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:369:0x064e  */
    /* JADX WARN: Code duplicated, block: B:370:0x0653  */
    /* JADX WARN: Code duplicated, block: B:375:0x0661  */
    /* JADX WARN: Code duplicated, block: B:379:0x066c  */
    /* JADX WARN: Code duplicated, block: B:382:0x0677 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:384:0x067d  */
    /* JADX WARN: Code duplicated, block: B:387:0x0685  */
    /* JADX WARN: Code duplicated, block: B:391:0x068c  */
    /* JADX WARN: Code duplicated, block: B:394:0x0696  */
    /* JADX WARN: Code duplicated, block: B:396:0x06a2  */
    /* JADX WARN: Code duplicated, block: B:400:0x06b3  */
    /* JADX WARN: Code duplicated, block: B:403:0x06c5 A[Catch: Exception -> 0x06d3, LOOP:12: B:402:0x06c3->B:403:0x06c5, LOOP_END, TryCatch #6 {Exception -> 0x06d3, blocks: (B:401:0x06b7, B:403:0x06c5, B:406:0x06dc), top: B:540:0x06b7 }] */
    /* JADX WARN: Code duplicated, block: B:411:0x06e9 A[Catch: Exception -> 0x0712, TRY_LEAVE, TryCatch #7 {Exception -> 0x0712, blocks: (B:409:0x06e3, B:411:0x06e9), top: B:542:0x06e3 }] */
    /* JADX WARN: Code duplicated, block: B:427:0x0716  */
    /* JADX WARN: Code duplicated, block: B:430:0x071e A[Catch: Exception -> 0x0706, TryCatch #3 {Exception -> 0x0706, blocks: (B:416:0x06ff, B:428:0x071a, B:430:0x071e, B:432:0x0724, B:433:0x073e, B:435:0x0742, B:437:0x0748, B:441:0x075e, B:444:0x0769, B:446:0x076d, B:448:0x0773), top: B:534:0x06ff }] */
    /* JADX WARN: Code duplicated, block: B:435:0x0742 A[Catch: Exception -> 0x0706, TryCatch #3 {Exception -> 0x0706, blocks: (B:416:0x06ff, B:428:0x071a, B:430:0x071e, B:432:0x0724, B:433:0x073e, B:435:0x0742, B:437:0x0748, B:441:0x075e, B:444:0x0769, B:446:0x076d, B:448:0x0773), top: B:534:0x06ff }] */
    /* JADX WARN: Code duplicated, block: B:446:0x076d A[Catch: Exception -> 0x0706, TryCatch #3 {Exception -> 0x0706, blocks: (B:416:0x06ff, B:428:0x071a, B:430:0x071e, B:432:0x0724, B:433:0x073e, B:435:0x0742, B:437:0x0748, B:441:0x075e, B:444:0x0769, B:446:0x076d, B:448:0x0773), top: B:534:0x06ff }] */
    /* JADX WARN: Code duplicated, block: B:460:0x0798  */
    /* JADX WARN: Code duplicated, block: B:467:0x07c3  */
    /* JADX WARN: Code duplicated, block: B:469:0x07dc  */
    /* JADX WARN: Code duplicated, block: B:471:0x07f0  */
    /* JADX WARN: Code duplicated, block: B:473:0x07f4  */
    /* JADX WARN: Code duplicated, block: B:476:0x0800  */
    /* JADX WARN: Code duplicated, block: B:478:0x0807 A[LOOP:15: B:477:0x0805->B:478:0x0807, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:482:0x081a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:487:0x0827 A[LOOP:14: B:486:0x0825->B:487:0x0827, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:490:0x085c  */
    /* JADX WARN: Code duplicated, block: B:494:0x086e  */
    /* JADX WARN: Code duplicated, block: B:499:0x088e  */
    /* JADX WARN: Code duplicated, block: B:500:0x089a  */
    /* JADX WARN: Code duplicated, block: B:503:0x08ad  */
    /* JADX WARN: Code duplicated, block: B:504:0x08b5  */
    /* JADX WARN: Code duplicated, block: B:506:0x08b9  */
    /* JADX WARN: Code duplicated, block: B:508:0x08c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:511:0x08c8  */
    /* JADX WARN: Code duplicated, block: B:514:0x08d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:519:0x08ed  */
    /* JADX WARN: Code duplicated, block: B:521:0x08f1  */
    /* JADX WARN: Code duplicated, block: B:525:0x0902  */
    /* JADX WARN: Code duplicated, block: B:542:0x06e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:592:0x06a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:595:0x08f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x012c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v100 */
    /* JADX WARN: Type inference failed for: r0v101 */
    /* JADX WARN: Type inference failed for: r0v102 */
    /* JADX WARN: Type inference failed for: r0v103 */
    /* JADX WARN: Type inference failed for: r0v104 */
    /* JADX WARN: Type inference failed for: r0v105 */
    /* JADX WARN: Type inference failed for: r0v106 */
    /* JADX WARN: Type inference failed for: r0v107 */
    /* JADX WARN: Type inference failed for: r0v108 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v99 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r24v5 */
    /* JADX WARN: Type inference failed for: r24v6 */
    /* JADX WARN: Type inference failed for: r24v7 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r32v0, types: [ys, zs] */
    /* JADX WARN: Type inference failed for: r3v67, types: [int] */
    /* JADX WARN: Type inference failed for: r5v53, types: [int] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v77, types: [int] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v52, types: [int] */
    /* JADX INFO: renamed from: U */
    public final void m7340U() {
        Object r21;
        int i;
        int i2;
        int i3;
        int i4;
        C1082ls c1082ls;
        C1082ls c1082ls2;
        boolean z;
        boolean z2;
        char c;
        boolean z3;
        int i5;
        int i6;
        boolean zM7341W;
        Object r12;
        int i7;
        boolean z4;
        boolean z5;
        int i8;
        C1082ls c1082ls3;
        boolean z6;
        boolean z7;
        int i9;
        boolean z8;
        int iMax;
        Object r8;
        Object r17;
        boolean z9;
        int iMax2;
        Object r0;
        boolean z10;
        boolean z11;
        Object r1;
        int i10;
        boolean z12;
        Object r2;
        boolean z13;
        Object r3;
        Object r4;
        int i11;
        int iMax3;
        int iMax4;
        int iMax5;
        int iMax6;
        boolean zM7341W2;
        int size;
        int i12;
        boolean z14;
        C1639ys c1639ys;
        boolean z15;
        int i13;
        WeakReference weakReference;
        WeakReference weakReference2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        C1082ls c1082ls4;
        C1639ys c1639ys2;
        int i14;
        int i15;
        int i16;
        int i17;
        char c2;
        q92 q92Var;
        q92 q92Var2;
        int i18;
        int iM7135q;
        int size2;
        int i19;
        int i20;
        q92 q92Var3;
        int iM5460b;
        int iM5460b2;
        q92 q92Var4;
        q92 q92Var5;
        int i21;
        boolean z16;
        boolean[] zArr = rc2.f9892e;
        this.f13082Y = 0;
        this.f13083Z = 0;
        this.f13528E0 = false;
        this.f13529F0 = false;
        int size3 = this.f13536q0.size();
        int iMax7 = Math.max(0, m7135q());
        int iMax8 = Math.max(0, m7131k());
        int[] iArr = this.f13115p0;
        int i22 = iArr[1];
        int i23 = iArr[0];
        int i24 = this.f13539t0;
        C1082ls c1082ls5 = this.f13067J;
        C1082ls c1082ls6 = this.f13066I;
        if (i24 == 0 && rc2.m5763D(this.f13527D0, 1)) {
            ch1 ch1Var = this.f13540u0;
            int i25 = iArr[0];
            int i26 = iArr[1];
            m7114E();
            ArrayList arrayList = this.f13536q0;
            int size4 = arrayList.size();
            for (int i27 = 0; i27 < size4; i27++) {
                ((C1639ys) arrayList.get(i27)).m7114E();
            }
            boolean z17 = this.f13541v0;
            if (i25 == 1) {
                m7117J(0, m7135q());
            } else {
                c1082ls6.m4284l(0);
                this.f13082Y = 0;
            }
            int i28 = 0;
            boolean z18 = false;
            boolean z19 = false;
            while (i28 < size4) {
                int i29 = i28;
                C1639ys c1639ys3 = (C1639ys) arrayList.get(i28);
                int[] iArr2 = iArr;
                if (c1639ys3 instanceof xi0) {
                    xi0 xi0Var = (xi0) c1639ys3;
                    z16 = z18;
                    if (xi0Var.f12613u0 == 1) {
                        int i30 = xi0Var.f12610r0;
                        if (i30 != -1) {
                            xi0Var.m6931R(i30);
                        } else if (xi0Var.f12611s0 != -1 && mo6773A()) {
                            xi0Var.m6931R(m7135q() - xi0Var.f12611s0);
                        } else if (mo6773A()) {
                            xi0Var.m6931R((int) ((xi0Var.f12609q0 * m7135q()) + 0.5f));
                        }
                        z16 = true;
                    }
                } else {
                    z16 = z18;
                    if ((c1639ys3 instanceof C1553wg) && ((C1553wg) c1639ys3).m6776U() == 0) {
                        z18 = z16;
                        z19 = true;
                    }
                    i28 = i29 + 1;
                    iArr = iArr2;
                }
                z18 = z16;
                i28 = i29 + 1;
                iArr = iArr2;
            }
            r21 = iArr;
            if (z18) {
                for (int i31 = 0; i31 < size4; i31 = i21 + 1) {
                    C1639ys c1639ys4 = (C1639ys) arrayList.get(i31);
                    if (c1639ys4 instanceof xi0) {
                        xi0 xi0Var2 = (xi0) c1639ys4;
                        i21 = i31;
                        if (xi0Var2.f12613u0 == 1) {
                            ua0.m6425D(0, xi0Var2, ch1Var, z17);
                        }
                    } else {
                        i21 = i31;
                    }
                }
            }
            ua0.m6425D(0, this, ch1Var, z17);
            if (z19) {
                for (int i32 = 0; i32 < size4; i32++) {
                    C1639ys c1639ys5 = (C1639ys) arrayList.get(i32);
                    if (c1639ys5 instanceof C1553wg) {
                        C1553wg c1553wg = (C1553wg) c1639ys5;
                        if (c1553wg.m6776U() == 0 && c1553wg.m6775T()) {
                            ua0.m6425D(1, c1553wg, ch1Var, z17);
                        }
                    }
                }
            }
            if (i26 == 1) {
                m7118K(0, m7131k());
            } else {
                c1082ls5.m4284l(0);
                this.f13083Z = 0;
            }
            int i33 = 0;
            boolean z20 = false;
            boolean z21 = false;
            while (i33 < size4) {
                C1639ys c1639ys6 = (C1639ys) arrayList.get(i33);
                int i34 = i33;
                if (c1639ys6 instanceof xi0) {
                    xi0 xi0Var3 = (xi0) c1639ys6;
                    if (xi0Var3.f12613u0 == 0) {
                        int i35 = xi0Var3.f12610r0;
                        if (i35 != -1) {
                            xi0Var3.m6931R(i35);
                        } else if (xi0Var3.f12611s0 != -1 && mo6774B()) {
                            xi0Var3.m6931R(m7131k() - xi0Var3.f12611s0);
                        } else if (mo6774B()) {
                            xi0Var3.m6931R((int) ((xi0Var3.f12609q0 * m7131k()) + 0.5f));
                        }
                        z20 = true;
                    }
                } else if ((c1639ys6 instanceof C1553wg) && ((C1553wg) c1639ys6).m6776U() == 1) {
                    z21 = true;
                }
                i33 = i34 + 1;
            }
            if (z20) {
                for (int i36 = 0; i36 < size4; i36++) {
                    C1639ys c1639ys7 = (C1639ys) arrayList.get(i36);
                    if (c1639ys7 instanceof xi0) {
                        xi0 xi0Var4 = (xi0) c1639ys7;
                        if (xi0Var4.f12613u0 == 0) {
                            ua0.m6450g0(1, xi0Var4, ch1Var);
                        }
                    }
                }
            }
            ua0.m6450g0(0, this, ch1Var);
            if (z21) {
                for (int i37 = 0; i37 < size4; i37++) {
                    C1639ys c1639ys8 = (C1639ys) arrayList.get(i37);
                    if (c1639ys8 instanceof C1553wg) {
                        C1553wg c1553wg2 = (C1553wg) c1639ys8;
                        if (c1553wg2.m6776U() == 1 && c1553wg2.m6775T()) {
                            ua0.m6450g0(1, c1553wg2, ch1Var);
                        }
                    }
                }
            }
            for (int i38 = 0; i38 < size4; i38++) {
                C1639ys c1639ys9 = (C1639ys) arrayList.get(i38);
                if (c1639ys9.m7144z() && ua0.m6447f(c1639ys9)) {
                    m7336V(c1639ys9, ch1Var, ua0.f11234f);
                    if (!(c1639ys9 instanceof xi0)) {
                        ua0.m6425D(0, c1639ys9, ch1Var, z17);
                        ua0.m6450g0(0, c1639ys9, ch1Var);
                    } else if (((xi0) c1639ys9).f12613u0 == 0) {
                        ua0.m6450g0(0, c1639ys9, ch1Var);
                    } else {
                        ua0.m6425D(0, c1639ys9, ch1Var, z17);
                    }
                }
            }
            for (int i39 = 0; i39 < size3; i39++) {
                C1639ys c1639ys10 = (C1639ys) this.f13536q0.get(i39);
                if (c1639ys10.m7144z() && !(c1639ys10 instanceof xi0) && !(c1639ys10 instanceof C1553wg) && !(c1639ys10 instanceof id0) && !c1639ys10.f13063F) {
                    int iM7130j = c1639ys10.m7130j(0);
                    int iM7130j2 = c1639ys10.m7130j(1);
                    if (iM7130j != 3 || c1639ys10.f13117r == 1 || iM7130j2 != 3 || c1639ys10.f13118s == 1) {
                        m7336V(c1639ys10, this.f13540u0, new C1332qh());
                    }
                }
            }
        } else {
            r21 = iArr;
        }
        xs0 xs0Var = this.f13542w0;
        if (size3 <= 2 || !((i23 == 2 || i22 == 2) && rc2.m5763D(this.f13527D0, 1024))) {
            i = iMax7;
            i2 = size3;
            i3 = i22;
            i4 = i23;
            c1082ls = c1082ls5;
            c1082ls2 = c1082ls6;
        } else {
            ch1 ch1Var2 = this.f13540u0;
            ArrayList arrayList2 = this.f13536q0;
            int size5 = arrayList2.size();
            int i40 = 0;
            while (true) {
                if (i40 < size5) {
                    C1639ys c1639ys11 = (C1639ys) arrayList2.get(i40);
                    Object r5 = r21[0];
                    Object r6 = r21[1];
                    int i41 = i40;
                    int[] iArr3 = c1639ys11.f13115p0;
                    c1082ls2 = c1082ls6;
                    if (rc2.m5807u0(r5, r6, iArr3[0], iArr3[1]) && !(c1639ys11 instanceof id0)) {
                        i40 = i41 + 1;
                        c1082ls6 = c1082ls2;
                    } else {
                        i14 = iMax7;
                        i2 = size3;
                        i15 = iMax8;
                        i16 = i22;
                        i17 = i23;
                        c1082ls = c1082ls5;
                    }
                } else {
                    c1082ls2 = c1082ls6;
                    i2 = size3;
                    c1082ls = c1082ls5;
                    int i42 = 0;
                    ArrayList arrayList3 = null;
                    ArrayList arrayList4 = null;
                    ArrayList arrayList5 = null;
                    ArrayList arrayList6 = null;
                    ArrayList arrayList7 = null;
                    ArrayList arrayList8 = null;
                    while (i42 < size5) {
                        int i43 = i42;
                        C1639ys c1639ys12 = (C1639ys) arrayList2.get(i42);
                        int i44 = iMax8;
                        Object r7 = r21[0];
                        int i45 = i22;
                        Object r9 = r21[1];
                        int i46 = iMax7;
                        int[] iArr4 = c1639ys12.f13115p0;
                        int i47 = i23;
                        if (!rc2.m5807u0(r7, r9, iArr4[0], iArr4[1])) {
                            m7336V(c1639ys12, ch1Var2, this.f13535L0);
                        }
                        boolean z22 = c1639ys12 instanceof xi0;
                        if (z22) {
                            xi0 xi0Var5 = (xi0) c1639ys12;
                            if (xi0Var5.f12613u0 == 0) {
                                if (arrayList7 == null) {
                                    arrayList7 = new ArrayList();
                                }
                                arrayList7.add(xi0Var5);
                            }
                            if (xi0Var5.f12613u0 == 1) {
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(xi0Var5);
                            }
                        }
                        if (c1639ys12 instanceof hk0) {
                            if (c1639ys12 instanceof C1553wg) {
                                C1553wg c1553wg3 = (C1553wg) c1639ys12;
                                if (c1553wg3.m6776U() == 0) {
                                    if (arrayList5 == null) {
                                        arrayList5 = new ArrayList();
                                    }
                                    arrayList5.add(c1553wg3);
                                }
                                if (c1553wg3.m6776U() == 1) {
                                    if (arrayList8 == null) {
                                        arrayList8 = new ArrayList();
                                    }
                                    arrayList8.add(c1553wg3);
                                }
                            } else {
                                hk0 hk0Var = (hk0) c1639ys12;
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                }
                                arrayList5.add(hk0Var);
                                if (arrayList8 == null) {
                                    arrayList8 = new ArrayList();
                                }
                                arrayList8.add(hk0Var);
                            }
                        }
                        if (c1639ys12.f13066I.f6503f == null && c1639ys12.f13068K.f6503f == null && !z22 && !(c1639ys12 instanceof C1553wg)) {
                            if (arrayList6 == null) {
                                arrayList6 = new ArrayList();
                            }
                            arrayList6.add(c1639ys12);
                        }
                        if (c1639ys12.f13067J.f6503f == null && c1639ys12.f13069L.f6503f == null && c1639ys12.f13070M.f6503f == null && !z22 && !(c1639ys12 instanceof C1553wg)) {
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                            }
                            arrayList4.add(c1639ys12);
                        }
                        i42 = i43 + 1;
                        iMax8 = i44;
                        i22 = i45;
                        iMax7 = i46;
                        i23 = i47;
                    }
                    i14 = iMax7;
                    i15 = iMax8;
                    i16 = i22;
                    i17 = i23;
                    ArrayList arrayList9 = new ArrayList();
                    if (arrayList3 != null) {
                        int size6 = arrayList3.size();
                        int i48 = 0;
                        while (i48 < size6) {
                            Object obj = arrayList3.get(i48);
                            i48++;
                            rc2.m5764F((xi0) obj, 0, arrayList9, null);
                        }
                    }
                    if (arrayList5 != null) {
                        int size7 = arrayList5.size();
                        int i49 = 0;
                        while (i49 < size7) {
                            Object obj2 = arrayList5.get(i49);
                            i49++;
                            hk0 hk0Var2 = (hk0) obj2;
                            q92 q92VarM5764F = rc2.m5764F(hk0Var2, 0, arrayList9, null);
                            hk0Var2.m3174R(0, q92VarM5764F, arrayList9);
                            q92VarM5764F.m5459a(arrayList9);
                        }
                    }
                    HashSet hashSet = mo6933i(2).f6498a;
                    if (hashSet != null) {
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            rc2.m5764F(((C1082ls) it.next()).f6501d, 0, arrayList9, null);
                        }
                    }
                    HashSet hashSet2 = mo6933i(4).f6498a;
                    if (hashSet2 != null) {
                        Iterator it2 = hashSet2.iterator();
                        while (it2.hasNext()) {
                            rc2.m5764F(((C1082ls) it2.next()).f6501d, 0, arrayList9, null);
                        }
                    }
                    HashSet hashSet3 = mo6933i(7).f6498a;
                    if (hashSet3 != null) {
                        Iterator it3 = hashSet3.iterator();
                        while (it3.hasNext()) {
                            rc2.m5764F(((C1082ls) it3.next()).f6501d, 0, arrayList9, null);
                        }
                    }
                    if (arrayList6 != null) {
                        int size8 = arrayList6.size();
                        int i50 = 0;
                        while (i50 < size8) {
                            Object obj3 = arrayList6.get(i50);
                            i50++;
                            rc2.m5764F((C1639ys) obj3, 0, arrayList9, null);
                        }
                    }
                    if (arrayList7 != null) {
                        int size9 = arrayList7.size();
                        int i51 = 0;
                        while (i51 < size9) {
                            Object obj4 = arrayList7.get(i51);
                            i51++;
                            rc2.m5764F((xi0) obj4, 1, arrayList9, null);
                        }
                    }
                    if (arrayList8 != null) {
                        int size10 = arrayList8.size();
                        int i52 = 0;
                        while (i52 < size10) {
                            Object obj5 = arrayList8.get(i52);
                            i52++;
                            hk0 hk0Var3 = (hk0) obj5;
                            q92 q92VarM5764F2 = rc2.m5764F(hk0Var3, 1, arrayList9, null);
                            hk0Var3.m3174R(1, q92VarM5764F2, arrayList9);
                            q92VarM5764F2.m5459a(arrayList9);
                        }
                    }
                    HashSet hashSet4 = mo6933i(3).f6498a;
                    if (hashSet4 != null) {
                        Iterator it4 = hashSet4.iterator();
                        while (it4.hasNext()) {
                            rc2.m5764F(((C1082ls) it4.next()).f6501d, 1, arrayList9, null);
                        }
                    }
                    HashSet hashSet5 = mo6933i(6).f6498a;
                    if (hashSet5 != null) {
                        Iterator it5 = hashSet5.iterator();
                        while (it5.hasNext()) {
                            rc2.m5764F(((C1082ls) it5.next()).f6501d, 1, arrayList9, null);
                        }
                    }
                    HashSet hashSet6 = mo6933i(5).f6498a;
                    if (hashSet6 != null) {
                        Iterator it6 = hashSet6.iterator();
                        while (it6.hasNext()) {
                            rc2.m5764F(((C1082ls) it6.next()).f6501d, 1, arrayList9, null);
                        }
                    }
                    HashSet hashSet7 = mo6933i(7).f6498a;
                    if (hashSet7 != null) {
                        Iterator it7 = hashSet7.iterator();
                        while (it7.hasNext()) {
                            rc2.m5764F(((C1082ls) it7.next()).f6501d, 1, arrayList9, null);
                        }
                    }
                    if (arrayList4 != null) {
                        int size11 = arrayList4.size();
                        int i53 = 0;
                        while (i53 < size11) {
                            Object obj6 = arrayList4.get(i53);
                            i53++;
                            rc2.m5764F((C1639ys) obj6, 1, arrayList9, null);
                        }
                    }
                    char c3 = 1;
                    int i54 = 0;
                    while (i54 < size5) {
                        C1639ys c1639ys13 = (C1639ys) arrayList2.get(i54);
                        int[] iArr5 = c1639ys13.f13115p0;
                        if (iArr5[0] == 3 && iArr5[c3] == 3) {
                            int i55 = c1639ys13.f13111n0;
                            int size12 = arrayList9.size();
                            int i56 = 0;
                            while (true) {
                                if (i56 >= size12) {
                                    q92Var4 = null;
                                    break;
                                }
                                q92Var4 = (q92) arrayList9.get(i56);
                                if (i55 == q92Var4.f9450b) {
                                    break;
                                } else {
                                    i56++;
                                }
                            }
                            int i57 = c1639ys13.f13113o0;
                            int size13 = arrayList9.size();
                            int i58 = 0;
                            while (true) {
                                if (i58 >= size13) {
                                    q92Var5 = null;
                                    break;
                                }
                                q92Var5 = (q92) arrayList9.get(i58);
                                if (i57 == q92Var5.f9450b) {
                                    break;
                                } else {
                                    i58++;
                                }
                            }
                            if (q92Var4 != null && q92Var5 != null) {
                                q92Var4.m5461c(0, q92Var5);
                                q92Var5.f9451c = 2;
                                arrayList9.remove(q92Var4);
                            }
                        }
                        i54++;
                        c3 = 1;
                    }
                    if (arrayList9.size() > 1) {
                        if (r21[0] == 2) {
                            int size14 = arrayList9.size();
                            int i59 = 0;
                            int i60 = 0;
                            q92Var = null;
                            while (i60 < size14) {
                                Object obj7 = arrayList9.get(i60);
                                i60++;
                                q92 q92Var6 = (q92) obj7;
                                if (q92Var6.f9451c != 1 && (iM5460b2 = q92Var6.m5460b(xs0Var, 0)) > i59) {
                                    q92Var = q92Var6;
                                    i59 = iM5460b2;
                                }
                            }
                            c2 = 1;
                            if (q92Var != null) {
                                m7120M(1);
                                m7122O(i59);
                            }
                            if (r21[c2] == 2) {
                                size2 = arrayList9.size();
                                i19 = 0;
                                i20 = 0;
                                q92Var2 = null;
                                while (i20 < size2) {
                                    Object obj8 = arrayList9.get(i20);
                                    i20++;
                                    q92Var3 = (q92) obj8;
                                    if (q92Var3.f9451c != 0 && (iM5460b = q92Var3.m5460b(xs0Var, 1)) > i19) {
                                        q92Var2 = q92Var3;
                                        i19 = iM5460b;
                                    }
                                }
                                if (q92Var2 != null) {
                                    m7121N(1);
                                    m7119L(i19);
                                } else {
                                    q92Var2 = null;
                                }
                            } else {
                                q92Var2 = null;
                            }
                            if (q92Var == null || q92Var2 != null) {
                                i4 = i17;
                                if (i4 == 2) {
                                    i18 = i14;
                                    if (i18 < m7135q() || i18 <= 0) {
                                        iM7135q = m7135q();
                                    } else {
                                        m7122O(i18);
                                        this.f13528E0 = true;
                                    }
                                    i3 = i16;
                                    if (i3 == 2) {
                                        iMax8 = i15;
                                        if (iMax8 < m7131k() || iMax8 <= 0) {
                                            iMax8 = m7131k();
                                        } else {
                                            m7119L(iMax8);
                                            this.f13529F0 = true;
                                        }
                                    } else {
                                        iMax8 = i15;
                                    }
                                    i = iM7135q;
                                    z = true;
                                } else {
                                    i18 = i14;
                                }
                                iM7135q = i18;
                                i3 = i16;
                                if (i3 == 2) {
                                    iMax8 = i15;
                                    if (iMax8 < m7131k()) {
                                        iMax8 = m7131k();
                                    } else {
                                        iMax8 = m7131k();
                                    }
                                } else {
                                    iMax8 = i15;
                                }
                                i = iM7135q;
                                z = true;
                            }
                            if (!m7341W(64) || m7341W(128)) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            xs0Var.getClass();
                            xs0Var.f12712g = false;
                            if (this.f13527D0 == 0 && z2) {
                                c = 1;
                                xs0Var.f12712g = true;
                            } else {
                                c = 1;
                            }
                            ArrayList arrayList10 = this.f13536q0;
                            if (r21[0] != 2 || r21[c] == 2) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            this.f13545z0 = 0;
                            this.f13524A0 = 0;
                            i5 = i2;
                            for (i6 = 0; i6 < i5; i6++) {
                                c1639ys2 = (C1639ys) this.f13536q0.get(i6);
                                if (c1639ys2 instanceof C1676zs) {
                                    ((C1676zs) c1639ys2).m7340U();
                                }
                            }
                            zM7341W = m7341W(64);
                            r12 = z;
                            i7 = 0;
                            z4 = true;
                            while (z4) {
                                i8 = i7 + 1;
                                try {
                                    xs0Var.m6974t();
                                    this.f13545z0 = 0;
                                    this.f13524A0 = 0;
                                    m7128g(xs0Var);
                                    for (i13 = 0; i13 < i5; i13++) {
                                        ((C1639ys) this.f13536q0.get(i13)).m7128g(xs0Var);
                                    }
                                    m7338S(xs0Var);
                                    try {
                                        weakReference = this.f13530G0;
                                        if (weakReference != null) {
                                            try {
                                                if (weakReference.get() != null) {
                                                    c1082ls3 = c1082ls;
                                                    try {
                                                        try {
                                                            z6 = z3;
                                                            try {
                                                                xs0Var.m6961f(xs0Var.m6966k((C1082ls) this.f13530G0.get()), xs0Var.m6966k(c1082ls3), 0, 5);
                                                                this.f13530G0 = null;
                                                            } catch (Exception e) {
                                                                e = e;
                                                                z15 = true;
                                                                e.printStackTrace();
                                                                System.out.println("EXCEPTION : " + e);
                                                                z7 = z15;
                                                                if (z7) {
                                                                    zArr[2] = false;
                                                                    zM7341W2 = m7341W(64);
                                                                    mo6930Q(xs0Var, zM7341W2);
                                                                    size = this.f13536q0.size();
                                                                    i12 = 0;
                                                                    z14 = false;
                                                                    while (i12 < size) {
                                                                        c1639ys = (C1639ys) this.f13536q0.get(i12);
                                                                        c1639ys.mo6930Q(xs0Var, zM7341W2);
                                                                        boolean z23 = zM7341W2;
                                                                        int i61 = size;
                                                                        if (c1639ys.f13098h == -1) {
                                                                            z14 = true;
                                                                        } else {
                                                                            z14 = true;
                                                                        }
                                                                        i12++;
                                                                        zM7341W2 = z23;
                                                                        size = i61;
                                                                        z14 = z14;
                                                                    }
                                                                    z8 = z14;
                                                                } else {
                                                                    mo6930Q(xs0Var, zM7341W);
                                                                    for (i9 = 0; i9 < i5; i9++) {
                                                                        ((C1639ys) this.f13536q0.get(i9)).mo6930Q(xs0Var, zM7341W);
                                                                    }
                                                                    z8 = false;
                                                                }
                                                                if (z6) {
                                                                    iMax3 = 0;
                                                                    iMax4 = 0;
                                                                    for (i11 = 0; i11 < i5; i11++) {
                                                                        C1639ys c1639ys14 = (C1639ys) this.f13536q0.get(i11);
                                                                        iMax4 = Math.max(iMax4, c1639ys14.m7135q() + c1639ys14.f13082Y);
                                                                        iMax3 = Math.max(iMax3, c1639ys14.m7131k() + c1639ys14.f13083Z);
                                                                    }
                                                                    iMax5 = Math.max(this.f13087b0, iMax4);
                                                                    iMax6 = Math.max(this.f13089c0, iMax3);
                                                                    z8 = z8;
                                                                    r12 = r12;
                                                                    if (i4 == 2) {
                                                                        z8 = z8;
                                                                        r12 = r12;
                                                                        m7122O(iMax5);
                                                                        r21[0] = 2;
                                                                        z8 = true;
                                                                        r12 = 1;
                                                                    }
                                                                    if (i3 == 2) {
                                                                        m7119L(iMax6);
                                                                        r21[1] = 2;
                                                                        z8 = true;
                                                                        r12 = 1;
                                                                    }
                                                                }
                                                                iMax = Math.max(this.f13087b0, m7135q());
                                                                if (iMax > m7135q()) {
                                                                    m7122O(iMax);
                                                                    r8 = 1;
                                                                    r21[0] = 1;
                                                                    z9 = true;
                                                                    r17 = 1;
                                                                } else {
                                                                    r8 = 1;
                                                                    r17 = r12;
                                                                    z9 = z8;
                                                                }
                                                                iMax2 = Math.max(this.f13089c0, m7131k());
                                                                if (iMax2 > m7131k()) {
                                                                    m7119L(iMax2);
                                                                    r21[r8] = r8;
                                                                    r4 = r8;
                                                                    z10 = r4 == true ? 1 : 0;
                                                                } else {
                                                                    r0 = r17;
                                                                }
                                                                if (r0 == 0) {
                                                                    z10 = z9;
                                                                    if (r21[0] == 2) {
                                                                        r3 = r0;
                                                                        z13 = z10;
                                                                        if (m7135q() > i) {
                                                                            this.f13528E0 = r8;
                                                                            r21[0] = r8;
                                                                            m7122O(i);
                                                                            Object r10 = r8;
                                                                            z13 = r10 == true ? 1 : 0;
                                                                            r3 = r10;
                                                                        }
                                                                    }
                                                                    r0 = r4;
                                                                    r3 = r0;
                                                                    r3 = r0;
                                                                    z13 = z10;
                                                                    z13 = z10;
                                                                    r1 = r3;
                                                                    r1 = r3;
                                                                    z11 = z13;
                                                                    z11 = z13;
                                                                    if (r21[r8] != 2) {
                                                                    }
                                                                    if (i8 > i10) {
                                                                        r1 = r3;
                                                                        z11 = z13;
                                                                        z12 = false;
                                                                    } else {
                                                                        r1 = r3;
                                                                        z11 = z13;
                                                                    }
                                                                    r12 = r2;
                                                                    i7 = i8;
                                                                    z3 = z6;
                                                                    c1082ls = c1082ls3;
                                                                    z4 = z12;
                                                                } else {
                                                                    z10 = z9;
                                                                    r0 = r4;
                                                                    r1 = r0;
                                                                    z11 = z10;
                                                                }
                                                                r1 = r3;
                                                                z11 = z13;
                                                                i10 = 8;
                                                                r2 = r1;
                                                                z12 = z11;
                                                                if (i8 > i10) {
                                                                    r1 = r3;
                                                                    z11 = z13;
                                                                    z12 = false;
                                                                } else {
                                                                    r1 = r3;
                                                                    z11 = z13;
                                                                }
                                                                r12 = r2;
                                                                i7 = i8;
                                                                z3 = z6;
                                                                c1082ls = c1082ls3;
                                                                z4 = z12;
                                                            }
                                                        } catch (Exception e2) {
                                                            e = e2;
                                                            z6 = z3;
                                                            z15 = true;
                                                            e.printStackTrace();
                                                            System.out.println("EXCEPTION : " + e);
                                                            z7 = z15;
                                                            if (z7) {
                                                                zArr[2] = false;
                                                                zM7341W2 = m7341W(64);
                                                                mo6930Q(xs0Var, zM7341W2);
                                                                size = this.f13536q0.size();
                                                                i12 = 0;
                                                                z14 = false;
                                                                while (i12 < size) {
                                                                    c1639ys = (C1639ys) this.f13536q0.get(i12);
                                                                    c1639ys.mo6930Q(xs0Var, zM7341W2);
                                                                    boolean z24 = zM7341W2;
                                                                    int i62 = size;
                                                                    if (c1639ys.f13098h == -1) {
                                                                        z14 = true;
                                                                    } else {
                                                                        z14 = true;
                                                                    }
                                                                    i12++;
                                                                    zM7341W2 = z24;
                                                                    size = i62;
                                                                    z14 = z14;
                                                                }
                                                                z8 = z14;
                                                            } else {
                                                                mo6930Q(xs0Var, zM7341W);
                                                                while (i9 < i5) {
                                                                    ((C1639ys) this.f13536q0.get(i9)).mo6930Q(xs0Var, zM7341W);
                                                                }
                                                                z8 = false;
                                                            }
                                                            if (z6) {
                                                                iMax3 = 0;
                                                                iMax4 = 0;
                                                                while (i11 < i5) {
                                                                    C1639ys c1639ys15 = (C1639ys) this.f13536q0.get(i11);
                                                                    iMax4 = Math.max(iMax4, c1639ys15.m7135q() + c1639ys15.f13082Y);
                                                                    iMax3 = Math.max(iMax3, c1639ys15.m7131k() + c1639ys15.f13083Z);
                                                                }
                                                                iMax5 = Math.max(this.f13087b0, iMax4);
                                                                iMax6 = Math.max(this.f13089c0, iMax3);
                                                                z8 = z8;
                                                                r12 = r12;
                                                                if (i4 == 2) {
                                                                    z8 = z8;
                                                                    r12 = r12;
                                                                    m7122O(iMax5);
                                                                    r21[0] = 2;
                                                                    z8 = true;
                                                                    r12 = 1;
                                                                }
                                                                if (i3 == 2) {
                                                                    m7119L(iMax6);
                                                                    r21[1] = 2;
                                                                    z8 = true;
                                                                    r12 = 1;
                                                                }
                                                            }
                                                            iMax = Math.max(this.f13087b0, m7135q());
                                                            if (iMax > m7135q()) {
                                                                m7122O(iMax);
                                                                r8 = 1;
                                                                r21[0] = 1;
                                                                z9 = true;
                                                                r17 = 1;
                                                            } else {
                                                                r8 = 1;
                                                                r17 = r12;
                                                                z9 = z8;
                                                            }
                                                            iMax2 = Math.max(this.f13089c0, m7131k());
                                                            if (iMax2 > m7131k()) {
                                                                m7119L(iMax2);
                                                                r21[r8] = r8;
                                                                r4 = r8;
                                                                z10 = r4 == true ? 1 : 0;
                                                            } else {
                                                                r0 = r17;
                                                            }
                                                            if (r0 == 0) {
                                                                z10 = z9;
                                                                if (r21[0] == 2) {
                                                                    r3 = r0;
                                                                    z13 = z10;
                                                                    if (m7135q() > i) {
                                                                        this.f13528E0 = r8;
                                                                        r21[0] = r8;
                                                                        m7122O(i);
                                                                        Object r11 = r8;
                                                                        z13 = r11 == true ? 1 : 0;
                                                                        r3 = r11;
                                                                    }
                                                                }
                                                                r0 = r4;
                                                                r3 = r0;
                                                                r3 = r0;
                                                                z13 = z10;
                                                                z13 = z10;
                                                                r1 = r3;
                                                                r1 = r3;
                                                                z11 = z13;
                                                                z11 = z13;
                                                                if (r21[r8] != 2) {
                                                                }
                                                                if (i8 > i10) {
                                                                    r1 = r3;
                                                                    z11 = z13;
                                                                    z12 = false;
                                                                } else {
                                                                    r1 = r3;
                                                                    z11 = z13;
                                                                }
                                                                r12 = r2;
                                                                i7 = i8;
                                                                z3 = z6;
                                                                c1082ls = c1082ls3;
                                                                z4 = z12;
                                                            } else {
                                                                z10 = z9;
                                                                r0 = r4;
                                                                r1 = r0;
                                                                z11 = z10;
                                                            }
                                                            r1 = r3;
                                                            z11 = z13;
                                                            i10 = 8;
                                                            r2 = r1;
                                                            z12 = z11;
                                                            if (i8 > i10) {
                                                                r1 = r3;
                                                                z11 = z13;
                                                                z12 = false;
                                                            } else {
                                                                r1 = r3;
                                                                z11 = z13;
                                                            }
                                                            r12 = r2;
                                                            i7 = i8;
                                                            z3 = z6;
                                                            c1082ls = c1082ls3;
                                                            z4 = z12;
                                                        }
                                                    } catch (Exception e3) {
                                                        e = e3;
                                                    }
                                                } else {
                                                    c1082ls3 = c1082ls;
                                                    z6 = z3;
                                                }
                                                weakReference2 = this.f13532I0;
                                                if (weakReference2 != null && weakReference2.get() != null) {
                                                    xs0Var.m6961f(xs0Var.m6966k(this.f13069L), xs0Var.m6966k((C1082ls) this.f13532I0.get()), 0, 5);
                                                    this.f13532I0 = null;
                                                }
                                                weakReference3 = this.f13531H0;
                                                if (weakReference3 != null && weakReference3.get() != null) {
                                                    c1082ls4 = c1082ls2;
                                                    try {
                                                        c1082ls2 = c1082ls4;
                                                        xs0Var.m6961f(xs0Var.m6966k((C1082ls) this.f13531H0.get()), xs0Var.m6966k(c1082ls4), 0, 5);
                                                        this.f13531H0 = null;
                                                    } catch (Exception e4) {
                                                        e = e4;
                                                        c1082ls2 = c1082ls4;
                                                        z15 = true;
                                                        e.printStackTrace();
                                                        System.out.println("EXCEPTION : " + e);
                                                        z7 = z15;
                                                        if (z7) {
                                                            zArr[2] = false;
                                                            zM7341W2 = m7341W(64);
                                                            mo6930Q(xs0Var, zM7341W2);
                                                            size = this.f13536q0.size();
                                                            i12 = 0;
                                                            z14 = false;
                                                            while (i12 < size) {
                                                                c1639ys = (C1639ys) this.f13536q0.get(i12);
                                                                c1639ys.mo6930Q(xs0Var, zM7341W2);
                                                                boolean z25 = zM7341W2;
                                                                int i63 = size;
                                                                if (c1639ys.f13098h == -1) {
                                                                    z14 = true;
                                                                } else {
                                                                    z14 = true;
                                                                }
                                                                i12++;
                                                                zM7341W2 = z25;
                                                                size = i63;
                                                                z14 = z14;
                                                            }
                                                            z8 = z14;
                                                        } else {
                                                            mo6930Q(xs0Var, zM7341W);
                                                            while (i9 < i5) {
                                                                ((C1639ys) this.f13536q0.get(i9)).mo6930Q(xs0Var, zM7341W);
                                                            }
                                                            z8 = false;
                                                        }
                                                        if (z6) {
                                                            iMax3 = 0;
                                                            iMax4 = 0;
                                                            while (i11 < i5) {
                                                                C1639ys c1639ys16 = (C1639ys) this.f13536q0.get(i11);
                                                                iMax4 = Math.max(iMax4, c1639ys16.m7135q() + c1639ys16.f13082Y);
                                                                iMax3 = Math.max(iMax3, c1639ys16.m7131k() + c1639ys16.f13083Z);
                                                            }
                                                            iMax5 = Math.max(this.f13087b0, iMax4);
                                                            iMax6 = Math.max(this.f13089c0, iMax3);
                                                            z8 = z8;
                                                            r12 = r12;
                                                            if (i4 == 2) {
                                                                z8 = z8;
                                                                r12 = r12;
                                                                m7122O(iMax5);
                                                                r21[0] = 2;
                                                                z8 = true;
                                                                r12 = 1;
                                                            }
                                                            if (i3 == 2) {
                                                                m7119L(iMax6);
                                                                r21[1] = 2;
                                                                z8 = true;
                                                                r12 = 1;
                                                            }
                                                        }
                                                        iMax = Math.max(this.f13087b0, m7135q());
                                                        if (iMax > m7135q()) {
                                                            m7122O(iMax);
                                                            r8 = 1;
                                                            r21[0] = 1;
                                                            z9 = true;
                                                            r17 = 1;
                                                        } else {
                                                            r8 = 1;
                                                            r17 = r12;
                                                            z9 = z8;
                                                        }
                                                        iMax2 = Math.max(this.f13089c0, m7131k());
                                                        if (iMax2 > m7131k()) {
                                                            m7119L(iMax2);
                                                            r21[r8] = r8;
                                                            r4 = r8;
                                                            z10 = r4 == true ? 1 : 0;
                                                        } else {
                                                            r0 = r17;
                                                        }
                                                        if (r0 == 0) {
                                                            z10 = z9;
                                                            if (r21[0] == 2) {
                                                                r3 = r0;
                                                                z13 = z10;
                                                                if (m7135q() > i) {
                                                                    this.f13528E0 = r8;
                                                                    r21[0] = r8;
                                                                    m7122O(i);
                                                                    Object r13 = r8;
                                                                    z13 = r13 == true ? 1 : 0;
                                                                    r3 = r13;
                                                                }
                                                            }
                                                            r0 = r4;
                                                            r3 = r0;
                                                            r3 = r0;
                                                            z13 = z10;
                                                            z13 = z10;
                                                            r1 = r3;
                                                            r1 = r3;
                                                            z11 = z13;
                                                            z11 = z13;
                                                            if (r21[r8] != 2) {
                                                            }
                                                            if (i8 > i10) {
                                                                r1 = r3;
                                                                z11 = z13;
                                                                z12 = false;
                                                            } else {
                                                                r1 = r3;
                                                                z11 = z13;
                                                            }
                                                            r12 = r2;
                                                            i7 = i8;
                                                            z3 = z6;
                                                            c1082ls = c1082ls3;
                                                            z4 = z12;
                                                        } else {
                                                            z10 = z9;
                                                            r0 = r4;
                                                            r1 = r0;
                                                            z11 = z10;
                                                        }
                                                        r1 = r3;
                                                        z11 = z13;
                                                        i10 = 8;
                                                        r2 = r1;
                                                        z12 = z11;
                                                        if (i8 > i10) {
                                                            r1 = r3;
                                                            z11 = z13;
                                                            z12 = false;
                                                        } else {
                                                            r1 = r3;
                                                            z11 = z13;
                                                        }
                                                        r12 = r2;
                                                        i7 = i8;
                                                        z3 = z6;
                                                        c1082ls = c1082ls3;
                                                        z4 = z12;
                                                    }
                                                }
                                                weakReference4 = this.f13533J0;
                                                if (weakReference4 == null && weakReference4.get() != null) {
                                                    try {
                                                        try {
                                                            xs0Var.m6961f(xs0Var.m6966k(this.f13068K), xs0Var.m6966k((C1082ls) this.f13533J0.get()), 0, 5);
                                                            try {
                                                                this.f13533J0 = null;
                                                            } catch (Exception e5) {
                                                                e = e5;
                                                                z15 = true;
                                                                e.printStackTrace();
                                                                System.out.println("EXCEPTION : " + e);
                                                                z7 = z15;
                                                            }
                                                        } catch (Exception e6) {
                                                            e = e6;
                                                            z15 = true;
                                                            e.printStackTrace();
                                                            System.out.println("EXCEPTION : " + e);
                                                            z7 = z15;
                                                            if (z7) {
                                                                zArr[2] = false;
                                                                zM7341W2 = m7341W(64);
                                                                mo6930Q(xs0Var, zM7341W2);
                                                                size = this.f13536q0.size();
                                                                i12 = 0;
                                                                z14 = false;
                                                                while (i12 < size) {
                                                                    c1639ys = (C1639ys) this.f13536q0.get(i12);
                                                                    c1639ys.mo6930Q(xs0Var, zM7341W2);
                                                                    boolean z26 = zM7341W2;
                                                                    int i64 = size;
                                                                    if (c1639ys.f13098h == -1) {
                                                                        z14 = true;
                                                                    } else {
                                                                        z14 = true;
                                                                    }
                                                                    i12++;
                                                                    zM7341W2 = z26;
                                                                    size = i64;
                                                                    z14 = z14;
                                                                }
                                                                z8 = z14;
                                                            } else {
                                                                mo6930Q(xs0Var, zM7341W);
                                                                while (i9 < i5) {
                                                                    ((C1639ys) this.f13536q0.get(i9)).mo6930Q(xs0Var, zM7341W);
                                                                }
                                                                z8 = false;
                                                            }
                                                            if (z6) {
                                                                iMax3 = 0;
                                                                iMax4 = 0;
                                                                while (i11 < i5) {
                                                                    C1639ys c1639ys17 = (C1639ys) this.f13536q0.get(i11);
                                                                    iMax4 = Math.max(iMax4, c1639ys17.m7135q() + c1639ys17.f13082Y);
                                                                    iMax3 = Math.max(iMax3, c1639ys17.m7131k() + c1639ys17.f13083Z);
                                                                }
                                                                iMax5 = Math.max(this.f13087b0, iMax4);
                                                                iMax6 = Math.max(this.f13089c0, iMax3);
                                                                z8 = z8;
                                                                r12 = r12;
                                                                if (i4 == 2) {
                                                                    z8 = z8;
                                                                    r12 = r12;
                                                                    m7122O(iMax5);
                                                                    r21[0] = 2;
                                                                    z8 = true;
                                                                    r12 = 1;
                                                                }
                                                                if (i3 == 2) {
                                                                    m7119L(iMax6);
                                                                    r21[1] = 2;
                                                                    z8 = true;
                                                                    r12 = 1;
                                                                }
                                                            }
                                                            iMax = Math.max(this.f13087b0, m7135q());
                                                            if (iMax > m7135q()) {
                                                                m7122O(iMax);
                                                                r8 = 1;
                                                                r21[0] = 1;
                                                                z9 = true;
                                                                r17 = 1;
                                                            } else {
                                                                r8 = 1;
                                                                r17 = r12;
                                                                z9 = z8;
                                                            }
                                                            iMax2 = Math.max(this.f13089c0, m7131k());
                                                            if (iMax2 > m7131k()) {
                                                                m7119L(iMax2);
                                                                r21[r8] = r8;
                                                                r4 = r8;
                                                                z10 = r4 == true ? 1 : 0;
                                                            } else {
                                                                r0 = r17;
                                                            }
                                                            if (r0 == 0) {
                                                                z10 = z9;
                                                                if (r21[0] == 2) {
                                                                    r3 = r0;
                                                                    z13 = z10;
                                                                    if (m7135q() > i) {
                                                                        this.f13528E0 = r8;
                                                                        r21[0] = r8;
                                                                        m7122O(i);
                                                                        Object r14 = r8;
                                                                        z13 = r14 == true ? 1 : 0;
                                                                        r3 = r14;
                                                                    }
                                                                }
                                                                r0 = r4;
                                                                r3 = r0;
                                                                r3 = r0;
                                                                z13 = z10;
                                                                z13 = z10;
                                                                r1 = r3;
                                                                r1 = r3;
                                                                z11 = z13;
                                                                z11 = z13;
                                                                if (r21[r8] != 2) {
                                                                }
                                                                if (i8 > i10) {
                                                                    r1 = r3;
                                                                    z11 = z13;
                                                                    z12 = false;
                                                                } else {
                                                                    r1 = r3;
                                                                    z11 = z13;
                                                                }
                                                                r12 = r2;
                                                                i7 = i8;
                                                                z3 = z6;
                                                                c1082ls = c1082ls3;
                                                                z4 = z12;
                                                            } else {
                                                                z10 = z9;
                                                                r0 = r4;
                                                                r1 = r0;
                                                                z11 = z10;
                                                            }
                                                            r1 = r3;
                                                            z11 = z13;
                                                            i10 = 8;
                                                            r2 = r1;
                                                            z12 = z11;
                                                            if (i8 > i10) {
                                                                r1 = r3;
                                                                z11 = z13;
                                                                z12 = false;
                                                            } else {
                                                                r1 = r3;
                                                                z11 = z13;
                                                            }
                                                            r12 = r2;
                                                            i7 = i8;
                                                            z3 = z6;
                                                            c1082ls = c1082ls3;
                                                            z4 = z12;
                                                        }
                                                    } catch (Exception e7) {
                                                        e = e7;
                                                    }
                                                }
                                                xs0Var.m6970p();
                                                z7 = true;
                                            } catch (Exception e8) {
                                                e = e8;
                                                c1082ls3 = c1082ls;
                                            }
                                        } else {
                                            c1082ls3 = c1082ls;
                                            z6 = z3;
                                            weakReference2 = this.f13532I0;
                                            if (weakReference2 != null) {
                                                xs0Var.m6961f(xs0Var.m6966k(this.f13069L), xs0Var.m6966k((C1082ls) this.f13532I0.get()), 0, 5);
                                                this.f13532I0 = null;
                                            }
                                            weakReference3 = this.f13531H0;
                                            if (weakReference3 != null) {
                                                c1082ls4 = c1082ls2;
                                                c1082ls2 = c1082ls4;
                                                xs0Var.m6961f(xs0Var.m6966k((C1082ls) this.f13531H0.get()), xs0Var.m6966k(c1082ls4), 0, 5);
                                                this.f13531H0 = null;
                                            }
                                            weakReference4 = this.f13533J0;
                                            if (weakReference4 == null) {
                                            }
                                            xs0Var.m6970p();
                                            z7 = true;
                                        }
                                    } catch (Exception e9) {
                                        e = e9;
                                        c1082ls3 = c1082ls;
                                        z6 = z3;
                                    }
                                } catch (Exception e10) {
                                    e = e10;
                                    c1082ls3 = c1082ls;
                                    z6 = z3;
                                    z15 = z4;
                                }
                                if (z7) {
                                    zArr[2] = false;
                                    zM7341W2 = m7341W(64);
                                    mo6930Q(xs0Var, zM7341W2);
                                    size = this.f13536q0.size();
                                    i12 = 0;
                                    z14 = false;
                                    while (i12 < size) {
                                        c1639ys = (C1639ys) this.f13536q0.get(i12);
                                        c1639ys.mo6930Q(xs0Var, zM7341W2);
                                        boolean z27 = zM7341W2;
                                        int i65 = size;
                                        if (c1639ys.f13098h == -1 || c1639ys.f13100i != -1) {
                                            z14 = true;
                                        }
                                        i12++;
                                        zM7341W2 = z27;
                                        size = i65;
                                        z14 = z14;
                                    }
                                    z8 = z14;
                                } else {
                                    mo6930Q(xs0Var, zM7341W);
                                    while (i9 < i5) {
                                        ((C1639ys) this.f13536q0.get(i9)).mo6930Q(xs0Var, zM7341W);
                                    }
                                    z8 = false;
                                }
                                if (z6 && i8 < 8 && zArr[2]) {
                                    iMax3 = 0;
                                    iMax4 = 0;
                                    while (i11 < i5) {
                                        C1639ys c1639ys18 = (C1639ys) this.f13536q0.get(i11);
                                        iMax4 = Math.max(iMax4, c1639ys18.m7135q() + c1639ys18.f13082Y);
                                        iMax3 = Math.max(iMax3, c1639ys18.m7131k() + c1639ys18.f13083Z);
                                    }
                                    iMax5 = Math.max(this.f13087b0, iMax4);
                                    iMax6 = Math.max(this.f13089c0, iMax3);
                                    z8 = z8;
                                    r12 = r12;
                                    if (i4 == 2 && m7135q() < iMax5) {
                                        z8 = z8;
                                        r12 = r12;
                                        m7122O(iMax5);
                                        r21[0] = 2;
                                        z8 = true;
                                        r12 = 1;
                                    }
                                    if (i3 == 2 && m7131k() < iMax6) {
                                        m7119L(iMax6);
                                        r21[1] = 2;
                                        z8 = true;
                                        r12 = 1;
                                    }
                                }
                                iMax = Math.max(this.f13087b0, m7135q());
                                if (iMax > m7135q()) {
                                    m7122O(iMax);
                                    r8 = 1;
                                    r21[0] = 1;
                                    z9 = true;
                                    r17 = 1;
                                } else {
                                    r8 = 1;
                                    r17 = r12;
                                    z9 = z8;
                                }
                                iMax2 = Math.max(this.f13089c0, m7131k());
                                if (iMax2 > m7131k()) {
                                    m7119L(iMax2);
                                    r21[r8] = r8;
                                    r4 = r8;
                                    z10 = r4 == true ? 1 : 0;
                                } else {
                                    r0 = r17;
                                }
                                if (r0 == 0) {
                                    z10 = z9;
                                    if (r21[0] == 2 && i > 0) {
                                        r3 = r0;
                                        z13 = z10;
                                        if (m7135q() > i) {
                                            this.f13528E0 = r8;
                                            r21[0] = r8;
                                            m7122O(i);
                                            Object r15 = r8;
                                            z13 = r15 == true ? 1 : 0;
                                            r3 = r15;
                                        }
                                    }
                                    r0 = r4;
                                    r3 = r0;
                                    r3 = r0;
                                    z13 = z10;
                                    z13 = z10;
                                    r1 = r3;
                                    r1 = r3;
                                    z11 = z13;
                                    z11 = z13;
                                    if (r21[r8] != 2 && iMax8 > 0 && m7131k() > iMax8) {
                                        this.f13529F0 = r8;
                                        r21[r8] = r8;
                                        m7119L(iMax8);
                                        r2 = 1;
                                        i10 = 8;
                                        z12 = true;
                                    }
                                    if (i8 > i10) {
                                        r1 = r3;
                                        z11 = z13;
                                        z12 = false;
                                    } else {
                                        r1 = r3;
                                        z11 = z13;
                                    }
                                    r12 = r2;
                                    i7 = i8;
                                    z3 = z6;
                                    c1082ls = c1082ls3;
                                    z4 = z12;
                                } else {
                                    z10 = z9;
                                    r0 = r4;
                                    r1 = r0;
                                    z11 = z10;
                                }
                                r1 = r3;
                                z11 = z13;
                                i10 = 8;
                                r2 = r1;
                                z12 = z11;
                                if (i8 > i10) {
                                    r1 = r3;
                                    z11 = z13;
                                    z12 = false;
                                } else {
                                    r1 = r3;
                                    z11 = z13;
                                }
                                r12 = r2;
                                i7 = i8;
                                z3 = z6;
                                c1082ls = c1082ls3;
                                z4 = z12;
                            }
                            z5 = r12 == true ? 1 : 0;
                            this.f13536q0 = arrayList10;
                            if (z5) {
                                r21[0] = i4;
                                r21[1] = i3;
                            }
                            mo7115F(xs0Var.f12717l);
                        }
                        c2 = 1;
                        q92Var = null;
                        if (r21[c2] == 2) {
                            size2 = arrayList9.size();
                            i19 = 0;
                            i20 = 0;
                            q92Var2 = null;
                            while (i20 < size2) {
                                Object obj9 = arrayList9.get(i20);
                                i20++;
                                q92Var3 = (q92) obj9;
                                if (q92Var3.f9451c != 0) {
                                    q92Var2 = q92Var3;
                                    i19 = iM5460b;
                                }
                            }
                            if (q92Var2 != null) {
                                m7121N(1);
                                m7119L(i19);
                            } else {
                                q92Var2 = null;
                            }
                        } else {
                            q92Var2 = null;
                        }
                        if (q92Var == null) {
                        }
                        i4 = i17;
                        if (i4 == 2) {
                            i18 = i14;
                            if (i18 < m7135q()) {
                            }
                            iM7135q = m7135q();
                            i3 = i16;
                            if (i3 == 2) {
                                iMax8 = i15;
                                if (iMax8 < m7131k()) {
                                    iMax8 = m7131k();
                                } else {
                                    iMax8 = m7131k();
                                }
                            } else {
                                iMax8 = i15;
                            }
                            i = iM7135q;
                            z = true;
                            if (m7341W(64)) {
                                z2 = true;
                            } else {
                                z2 = true;
                            }
                            xs0Var.getClass();
                            xs0Var.f12712g = false;
                            if (this.f13527D0 == 0) {
                                c = 1;
                            } else {
                                c = 1;
                            }
                            ArrayList arrayList11 = this.f13536q0;
                            if (r21[0] != 2) {
                                z3 = true;
                            } else {
                                z3 = true;
                            }
                            this.f13545z0 = 0;
                            this.f13524A0 = 0;
                            i5 = i2;
                            while (i6 < i5) {
                                c1639ys2 = (C1639ys) this.f13536q0.get(i6);
                                if (c1639ys2 instanceof C1676zs) {
                                    ((C1676zs) c1639ys2).m7340U();
                                }
                            }
                            zM7341W = m7341W(64);
                            r12 = z;
                            i7 = 0;
                            z4 = true;
                            while (z4) {
                                i8 = i7 + 1;
                                xs0Var.m6974t();
                                this.f13545z0 = 0;
                                this.f13524A0 = 0;
                                m7128g(xs0Var);
                                while (i13 < i5) {
                                    ((C1639ys) this.f13536q0.get(i13)).m7128g(xs0Var);
                                }
                                m7338S(xs0Var);
                                weakReference = this.f13530G0;
                                if (weakReference != null) {
                                    if (weakReference.get() != null) {
                                        c1082ls3 = c1082ls;
                                        z6 = z3;
                                        xs0Var.m6961f(xs0Var.m6966k((C1082ls) this.f13530G0.get()), xs0Var.m6966k(c1082ls3), 0, 5);
                                        this.f13530G0 = null;
                                    } else {
                                        c1082ls3 = c1082ls;
                                        z6 = z3;
                                    }
                                    weakReference2 = this.f13532I0;
                                    if (weakReference2 != null) {
                                        xs0Var.m6961f(xs0Var.m6966k(this.f13069L), xs0Var.m6966k((C1082ls) this.f13532I0.get()), 0, 5);
                                        this.f13532I0 = null;
                                    }
                                    weakReference3 = this.f13531H0;
                                    if (weakReference3 != null) {
                                        c1082ls4 = c1082ls2;
                                        c1082ls2 = c1082ls4;
                                        xs0Var.m6961f(xs0Var.m6966k((C1082ls) this.f13531H0.get()), xs0Var.m6966k(c1082ls4), 0, 5);
                                        this.f13531H0 = null;
                                    }
                                    weakReference4 = this.f13533J0;
                                    if (weakReference4 == null) {
                                    }
                                    xs0Var.m6970p();
                                    z7 = true;
                                } else {
                                    c1082ls3 = c1082ls;
                                    z6 = z3;
                                    weakReference2 = this.f13532I0;
                                    if (weakReference2 != null) {
                                        xs0Var.m6961f(xs0Var.m6966k(this.f13069L), xs0Var.m6966k((C1082ls) this.f13532I0.get()), 0, 5);
                                        this.f13532I0 = null;
                                    }
                                    weakReference3 = this.f13531H0;
                                    if (weakReference3 != null) {
                                        c1082ls4 = c1082ls2;
                                        c1082ls2 = c1082ls4;
                                        xs0Var.m6961f(xs0Var.m6966k((C1082ls) this.f13531H0.get()), xs0Var.m6966k(c1082ls4), 0, 5);
                                        this.f13531H0 = null;
                                    }
                                    weakReference4 = this.f13533J0;
                                    if (weakReference4 == null) {
                                    }
                                    xs0Var.m6970p();
                                    z7 = true;
                                }
                                if (z7) {
                                    zArr[2] = false;
                                    zM7341W2 = m7341W(64);
                                    mo6930Q(xs0Var, zM7341W2);
                                    size = this.f13536q0.size();
                                    i12 = 0;
                                    z14 = false;
                                    while (i12 < size) {
                                        c1639ys = (C1639ys) this.f13536q0.get(i12);
                                        c1639ys.mo6930Q(xs0Var, zM7341W2);
                                        boolean z28 = zM7341W2;
                                        int i66 = size;
                                        if (c1639ys.f13098h == -1) {
                                            z14 = true;
                                        } else {
                                            z14 = true;
                                        }
                                        i12++;
                                        zM7341W2 = z28;
                                        size = i66;
                                        z14 = z14;
                                    }
                                    z8 = z14;
                                } else {
                                    mo6930Q(xs0Var, zM7341W);
                                    while (i9 < i5) {
                                        ((C1639ys) this.f13536q0.get(i9)).mo6930Q(xs0Var, zM7341W);
                                    }
                                    z8 = false;
                                }
                                if (z6) {
                                    iMax3 = 0;
                                    iMax4 = 0;
                                    while (i11 < i5) {
                                        C1639ys c1639ys19 = (C1639ys) this.f13536q0.get(i11);
                                        iMax4 = Math.max(iMax4, c1639ys19.m7135q() + c1639ys19.f13082Y);
                                        iMax3 = Math.max(iMax3, c1639ys19.m7131k() + c1639ys19.f13083Z);
                                    }
                                    iMax5 = Math.max(this.f13087b0, iMax4);
                                    iMax6 = Math.max(this.f13089c0, iMax3);
                                    z8 = z8;
                                    r12 = r12;
                                    if (i4 == 2) {
                                        z8 = z8;
                                        r12 = r12;
                                        m7122O(iMax5);
                                        r21[0] = 2;
                                        z8 = true;
                                        r12 = 1;
                                    }
                                    if (i3 == 2) {
                                        m7119L(iMax6);
                                        r21[1] = 2;
                                        z8 = true;
                                        r12 = 1;
                                    }
                                }
                                iMax = Math.max(this.f13087b0, m7135q());
                                if (iMax > m7135q()) {
                                    m7122O(iMax);
                                    r8 = 1;
                                    r21[0] = 1;
                                    z9 = true;
                                    r17 = 1;
                                } else {
                                    r8 = 1;
                                    r17 = r12;
                                    z9 = z8;
                                }
                                iMax2 = Math.max(this.f13089c0, m7131k());
                                if (iMax2 > m7131k()) {
                                    m7119L(iMax2);
                                    r21[r8] = r8;
                                    r4 = r8;
                                    z10 = r4 == true ? 1 : 0;
                                } else {
                                    r0 = r17;
                                }
                                if (r0 == 0) {
                                    z10 = z9;
                                    if (r21[0] == 2) {
                                        r3 = r0;
                                        z13 = z10;
                                        if (m7135q() > i) {
                                            this.f13528E0 = r8;
                                            r21[0] = r8;
                                            m7122O(i);
                                            Object r16 = r8;
                                            z13 = r16 == true ? 1 : 0;
                                            r3 = r16;
                                        }
                                    }
                                    r0 = r4;
                                    r3 = r0;
                                    r3 = r0;
                                    z13 = z10;
                                    z13 = z10;
                                    r1 = r3;
                                    r1 = r3;
                                    z11 = z13;
                                    z11 = z13;
                                    if (r21[r8] != 2) {
                                    }
                                    if (i8 > i10) {
                                        r1 = r3;
                                        z11 = z13;
                                        z12 = false;
                                    } else {
                                        r1 = r3;
                                        z11 = z13;
                                    }
                                    r12 = r2;
                                    i7 = i8;
                                    z3 = z6;
                                    c1082ls = c1082ls3;
                                    z4 = z12;
                                } else {
                                    z10 = z9;
                                    r0 = r4;
                                    r1 = r0;
                                    z11 = z10;
                                }
                                r1 = r3;
                                z11 = z13;
                                i10 = 8;
                                r2 = r1;
                                z12 = z11;
                                if (i8 > i10) {
                                    r1 = r3;
                                    z11 = z13;
                                    z12 = false;
                                } else {
                                    r1 = r3;
                                    z11 = z13;
                                }
                                r12 = r2;
                                i7 = i8;
                                z3 = z6;
                                c1082ls = c1082ls3;
                                z4 = z12;
                            }
                            z5 = r12 == true ? 1 : 0;
                            this.f13536q0 = arrayList11;
                            if (z5) {
                                r21[0] = i4;
                                r21[1] = i3;
                            }
                            mo7115F(xs0Var.f12717l);
                        }
                        i18 = i14;
                        iM7135q = i18;
                        i3 = i16;
                        if (i3 == 2) {
                            iMax8 = i15;
                            if (iMax8 < m7131k()) {
                                iMax8 = m7131k();
                            } else {
                                iMax8 = m7131k();
                            }
                        } else {
                            iMax8 = i15;
                        }
                        i = iM7135q;
                        z = true;
                        if (m7341W(64)) {
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                        xs0Var.getClass();
                        xs0Var.f12712g = false;
                        if (this.f13527D0 == 0) {
                            c = 1;
                        } else {
                            c = 1;
                        }
                        ArrayList arrayList12 = this.f13536q0;
                        if (r21[0] != 2) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        this.f13545z0 = 0;
                        this.f13524A0 = 0;
                        i5 = i2;
                        while (i6 < i5) {
                            c1639ys2 = (C1639ys) this.f13536q0.get(i6);
                            if (c1639ys2 instanceof C1676zs) {
                                ((C1676zs) c1639ys2).m7340U();
                            }
                        }
                        zM7341W = m7341W(64);
                        r12 = z;
                        i7 = 0;
                        z4 = true;
                        while (z4) {
                            i8 = i7 + 1;
                            xs0Var.m6974t();
                            this.f13545z0 = 0;
                            this.f13524A0 = 0;
                            m7128g(xs0Var);
                            while (i13 < i5) {
                                ((C1639ys) this.f13536q0.get(i13)).m7128g(xs0Var);
                            }
                            m7338S(xs0Var);
                            weakReference = this.f13530G0;
                            if (weakReference != null) {
                                if (weakReference.get() != null) {
                                    c1082ls3 = c1082ls;
                                    z6 = z3;
                                    xs0Var.m6961f(xs0Var.m6966k((C1082ls) this.f13530G0.get()), xs0Var.m6966k(c1082ls3), 0, 5);
                                    this.f13530G0 = null;
                                } else {
                                    c1082ls3 = c1082ls;
                                    z6 = z3;
                                }
                                weakReference2 = this.f13532I0;
                                if (weakReference2 != null) {
                                    xs0Var.m6961f(xs0Var.m6966k(this.f13069L), xs0Var.m6966k((C1082ls) this.f13532I0.get()), 0, 5);
                                    this.f13532I0 = null;
                                }
                                weakReference3 = this.f13531H0;
                                if (weakReference3 != null) {
                                    c1082ls4 = c1082ls2;
                                    c1082ls2 = c1082ls4;
                                    xs0Var.m6961f(xs0Var.m6966k((C1082ls) this.f13531H0.get()), xs0Var.m6966k(c1082ls4), 0, 5);
                                    this.f13531H0 = null;
                                }
                                weakReference4 = this.f13533J0;
                                if (weakReference4 == null) {
                                }
                                xs0Var.m6970p();
                                z7 = true;
                            } else {
                                c1082ls3 = c1082ls;
                                z6 = z3;
                                weakReference2 = this.f13532I0;
                                if (weakReference2 != null) {
                                    xs0Var.m6961f(xs0Var.m6966k(this.f13069L), xs0Var.m6966k((C1082ls) this.f13532I0.get()), 0, 5);
                                    this.f13532I0 = null;
                                }
                                weakReference3 = this.f13531H0;
                                if (weakReference3 != null) {
                                    c1082ls4 = c1082ls2;
                                    c1082ls2 = c1082ls4;
                                    xs0Var.m6961f(xs0Var.m6966k((C1082ls) this.f13531H0.get()), xs0Var.m6966k(c1082ls4), 0, 5);
                                    this.f13531H0 = null;
                                }
                                weakReference4 = this.f13533J0;
                                if (weakReference4 == null) {
                                }
                                xs0Var.m6970p();
                                z7 = true;
                            }
                            if (z7) {
                                zArr[2] = false;
                                zM7341W2 = m7341W(64);
                                mo6930Q(xs0Var, zM7341W2);
                                size = this.f13536q0.size();
                                i12 = 0;
                                z14 = false;
                                while (i12 < size) {
                                    c1639ys = (C1639ys) this.f13536q0.get(i12);
                                    c1639ys.mo6930Q(xs0Var, zM7341W2);
                                    boolean z29 = zM7341W2;
                                    int i67 = size;
                                    if (c1639ys.f13098h == -1) {
                                        z14 = true;
                                    } else {
                                        z14 = true;
                                    }
                                    i12++;
                                    zM7341W2 = z29;
                                    size = i67;
                                    z14 = z14;
                                }
                                z8 = z14;
                            } else {
                                mo6930Q(xs0Var, zM7341W);
                                while (i9 < i5) {
                                    ((C1639ys) this.f13536q0.get(i9)).mo6930Q(xs0Var, zM7341W);
                                }
                                z8 = false;
                            }
                            if (z6) {
                                iMax3 = 0;
                                iMax4 = 0;
                                while (i11 < i5) {
                                    C1639ys c1639ys110 = (C1639ys) this.f13536q0.get(i11);
                                    iMax4 = Math.max(iMax4, c1639ys110.m7135q() + c1639ys110.f13082Y);
                                    iMax3 = Math.max(iMax3, c1639ys110.m7131k() + c1639ys110.f13083Z);
                                }
                                iMax5 = Math.max(this.f13087b0, iMax4);
                                iMax6 = Math.max(this.f13089c0, iMax3);
                                z8 = z8;
                                r12 = r12;
                                if (i4 == 2) {
                                    z8 = z8;
                                    r12 = r12;
                                    m7122O(iMax5);
                                    r21[0] = 2;
                                    z8 = true;
                                    r12 = 1;
                                }
                                if (i3 == 2) {
                                    m7119L(iMax6);
                                    r21[1] = 2;
                                    z8 = true;
                                    r12 = 1;
                                }
                            }
                            iMax = Math.max(this.f13087b0, m7135q());
                            if (iMax > m7135q()) {
                                m7122O(iMax);
                                r8 = 1;
                                r21[0] = 1;
                                z9 = true;
                                r17 = 1;
                            } else {
                                r8 = 1;
                                r17 = r12;
                                z9 = z8;
                            }
                            iMax2 = Math.max(this.f13089c0, m7131k());
                            if (iMax2 > m7131k()) {
                                m7119L(iMax2);
                                r21[r8] = r8;
                                r4 = r8;
                                z10 = r4 == true ? 1 : 0;
                            } else {
                                r0 = r17;
                            }
                            if (r0 == 0) {
                                z10 = z9;
                                if (r21[0] == 2) {
                                    r3 = r0;
                                    z13 = z10;
                                    if (m7135q() > i) {
                                        this.f13528E0 = r8;
                                        r21[0] = r8;
                                        m7122O(i);
                                        Object r18 = r8;
                                        z13 = r18 == true ? 1 : 0;
                                        r3 = r18;
                                    }
                                }
                                r0 = r4;
                                r3 = r0;
                                r3 = r0;
                                z13 = z10;
                                z13 = z10;
                                r1 = r3;
                                r1 = r3;
                                z11 = z13;
                                z11 = z13;
                                if (r21[r8] != 2) {
                                }
                                if (i8 > i10) {
                                    r1 = r3;
                                    z11 = z13;
                                    z12 = false;
                                } else {
                                    r1 = r3;
                                    z11 = z13;
                                }
                                r12 = r2;
                                i7 = i8;
                                z3 = z6;
                                c1082ls = c1082ls3;
                                z4 = z12;
                            } else {
                                z10 = z9;
                                r0 = r4;
                                r1 = r0;
                                z11 = z10;
                            }
                            r1 = r3;
                            z11 = z13;
                            i10 = 8;
                            r2 = r1;
                            z12 = z11;
                            if (i8 > i10) {
                                r1 = r3;
                                z11 = z13;
                                z12 = false;
                            } else {
                                r1 = r3;
                                z11 = z13;
                            }
                            r12 = r2;
                            i7 = i8;
                            z3 = z6;
                            c1082ls = c1082ls3;
                            z4 = z12;
                        }
                        z5 = r12 == true ? 1 : 0;
                        this.f13536q0 = arrayList12;
                        if (z5) {
                            r21[0] = i4;
                            r21[1] = i3;
                        }
                        mo7115F(xs0Var.f12717l);
                    }
                }
                iMax8 = i15;
                i3 = i16;
                i = i14;
                i4 = i17;
            }
        }
        z = false;
        if (m7341W(64)) {
            z2 = true;
        } else {
            z2 = true;
        }
        xs0Var.getClass();
        xs0Var.f12712g = false;
        if (this.f13527D0 == 0) {
            c = 1;
        } else {
            c = 1;
        }
        ArrayList arrayList13 = this.f13536q0;
        if (r21[0] != 2) {
            z3 = true;
        } else {
            z3 = true;
        }
        this.f13545z0 = 0;
        this.f13524A0 = 0;
        i5 = i2;
        while (i6 < i5) {
            c1639ys2 = (C1639ys) this.f13536q0.get(i6);
            if (c1639ys2 instanceof C1676zs) {
                ((C1676zs) c1639ys2).m7340U();
            }
        }
        zM7341W = m7341W(64);
        r12 = z;
        i7 = 0;
        z4 = true;
        while (z4) {
            i8 = i7 + 1;
            xs0Var.m6974t();
            this.f13545z0 = 0;
            this.f13524A0 = 0;
            m7128g(xs0Var);
            while (i13 < i5) {
                ((C1639ys) this.f13536q0.get(i13)).m7128g(xs0Var);
            }
            m7338S(xs0Var);
            weakReference = this.f13530G0;
            if (weakReference != null) {
                if (weakReference.get() != null) {
                    c1082ls3 = c1082ls;
                    z6 = z3;
                    xs0Var.m6961f(xs0Var.m6966k((C1082ls) this.f13530G0.get()), xs0Var.m6966k(c1082ls3), 0, 5);
                    this.f13530G0 = null;
                } else {
                    c1082ls3 = c1082ls;
                    z6 = z3;
                }
                weakReference2 = this.f13532I0;
                if (weakReference2 != null) {
                    xs0Var.m6961f(xs0Var.m6966k(this.f13069L), xs0Var.m6966k((C1082ls) this.f13532I0.get()), 0, 5);
                    this.f13532I0 = null;
                }
                weakReference3 = this.f13531H0;
                if (weakReference3 != null) {
                    c1082ls4 = c1082ls2;
                    c1082ls2 = c1082ls4;
                    xs0Var.m6961f(xs0Var.m6966k((C1082ls) this.f13531H0.get()), xs0Var.m6966k(c1082ls4), 0, 5);
                    this.f13531H0 = null;
                }
                weakReference4 = this.f13533J0;
                if (weakReference4 == null) {
                }
                xs0Var.m6970p();
                z7 = true;
            } else {
                c1082ls3 = c1082ls;
                z6 = z3;
                weakReference2 = this.f13532I0;
                if (weakReference2 != null) {
                    xs0Var.m6961f(xs0Var.m6966k(this.f13069L), xs0Var.m6966k((C1082ls) this.f13532I0.get()), 0, 5);
                    this.f13532I0 = null;
                }
                weakReference3 = this.f13531H0;
                if (weakReference3 != null) {
                    c1082ls4 = c1082ls2;
                    c1082ls2 = c1082ls4;
                    xs0Var.m6961f(xs0Var.m6966k((C1082ls) this.f13531H0.get()), xs0Var.m6966k(c1082ls4), 0, 5);
                    this.f13531H0 = null;
                }
                weakReference4 = this.f13533J0;
                if (weakReference4 == null) {
                }
                xs0Var.m6970p();
                z7 = true;
            }
            if (z7) {
                zArr[2] = false;
                zM7341W2 = m7341W(64);
                mo6930Q(xs0Var, zM7341W2);
                size = this.f13536q0.size();
                i12 = 0;
                z14 = false;
                while (i12 < size) {
                    c1639ys = (C1639ys) this.f13536q0.get(i12);
                    c1639ys.mo6930Q(xs0Var, zM7341W2);
                    boolean z210 = zM7341W2;
                    int i68 = size;
                    if (c1639ys.f13098h == -1) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    i12++;
                    zM7341W2 = z210;
                    size = i68;
                    z14 = z14;
                }
                z8 = z14;
            } else {
                mo6930Q(xs0Var, zM7341W);
                while (i9 < i5) {
                    ((C1639ys) this.f13536q0.get(i9)).mo6930Q(xs0Var, zM7341W);
                }
                z8 = false;
            }
            if (z6) {
                iMax3 = 0;
                iMax4 = 0;
                while (i11 < i5) {
                    C1639ys c1639ys111 = (C1639ys) this.f13536q0.get(i11);
                    iMax4 = Math.max(iMax4, c1639ys111.m7135q() + c1639ys111.f13082Y);
                    iMax3 = Math.max(iMax3, c1639ys111.m7131k() + c1639ys111.f13083Z);
                }
                iMax5 = Math.max(this.f13087b0, iMax4);
                iMax6 = Math.max(this.f13089c0, iMax3);
                z8 = z8;
                r12 = r12;
                if (i4 == 2) {
                    z8 = z8;
                    r12 = r12;
                    m7122O(iMax5);
                    r21[0] = 2;
                    z8 = true;
                    r12 = 1;
                }
                if (i3 == 2) {
                    m7119L(iMax6);
                    r21[1] = 2;
                    z8 = true;
                    r12 = 1;
                }
            }
            iMax = Math.max(this.f13087b0, m7135q());
            if (iMax > m7135q()) {
                m7122O(iMax);
                r8 = 1;
                r21[0] = 1;
                z9 = true;
                r17 = 1;
            } else {
                r8 = 1;
                r17 = r12;
                z9 = z8;
            }
            iMax2 = Math.max(this.f13089c0, m7131k());
            if (iMax2 > m7131k()) {
                m7119L(iMax2);
                r21[r8] = r8;
                r4 = r8;
                z10 = r4 == true ? 1 : 0;
            } else {
                r0 = r17;
            }
            if (r0 == 0) {
                z10 = z9;
                if (r21[0] == 2) {
                    r3 = r0;
                    z13 = z10;
                    if (m7135q() > i) {
                        this.f13528E0 = r8;
                        r21[0] = r8;
                        m7122O(i);
                        Object r19 = r8;
                        z13 = r19 == true ? 1 : 0;
                        r3 = r19;
                    }
                }
                r0 = r4;
                r3 = r0;
                r3 = r0;
                z13 = z10;
                z13 = z10;
                r1 = r3;
                r1 = r3;
                z11 = z13;
                z11 = z13;
                if (r21[r8] != 2) {
                }
                if (i8 > i10) {
                    r1 = r3;
                    z11 = z13;
                    z12 = false;
                } else {
                    r1 = r3;
                    z11 = z13;
                }
                r12 = r2;
                i7 = i8;
                z3 = z6;
                c1082ls = c1082ls3;
                z4 = z12;
            } else {
                z10 = z9;
                r0 = r4;
                r1 = r0;
                z11 = z10;
            }
            r1 = r3;
            z11 = z13;
            i10 = 8;
            r2 = r1;
            z12 = z11;
            if (i8 > i10) {
                r1 = r3;
                z11 = z13;
                z12 = false;
            } else {
                r1 = r3;
                z11 = z13;
            }
            r12 = r2;
            i7 = i8;
            z3 = z6;
            c1082ls = c1082ls3;
            z4 = z12;
        }
        z5 = r12 == true ? 1 : 0;
        this.f13536q0 = arrayList13;
        if (z5) {
            r21[0] = i4;
            r21[1] = i3;
        }
        mo7115F(xs0Var.f12717l);
    }

    /* JADX INFO: renamed from: W */
    public final boolean m7341W(int i) {
        return (this.f13527D0 & i) == i;
    }

    @Override // p000.C1639ys
    /* JADX INFO: renamed from: n */
    public final void mo7134n(StringBuilder sb) {
        sb.append(this.f13102j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.f13078U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.f13079V);
        sb.append("\n");
        ArrayList arrayList = this.f13536q0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((C1639ys) obj).mo7134n(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
