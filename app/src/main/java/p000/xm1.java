package p000;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class xm1 extends AbstractC0753ik {

    /* JADX INFO: renamed from: n */
    public static final int[] f12645n = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};

    /* JADX INFO: renamed from: d */
    public final int f12646d;

    /* JADX INFO: renamed from: e */
    public final AbstractC0753ik f12647e;

    /* JADX INFO: renamed from: f */
    public final AbstractC0753ik f12648f;

    /* JADX INFO: renamed from: g */
    public final int f12649g;

    /* JADX INFO: renamed from: m */
    public final int f12650m;

    public xm1(AbstractC0753ik abstractC0753ik, AbstractC0753ik abstractC0753ik2) {
        this.f12647e = abstractC0753ik;
        this.f12648f = abstractC0753ik2;
        int size = abstractC0753ik.size();
        this.f12649g = size;
        this.f12646d = abstractC0753ik2.size() + size;
        this.f12650m = Math.max(abstractC0753ik.mo2991k(), abstractC0753ik2.mo2991k()) + 1;
    }

    /* JADX INFO: renamed from: z */
    public static int m6936z(int i) {
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return f12645n[i];
    }

    @Override // p000.AbstractC0753ik
    /* JADX INFO: renamed from: a */
    public final ByteBuffer mo2990a() {
        return ByteBuffer.wrap(m3442v()).asReadOnlyBuffer();
    }

    @Override // p000.AbstractC0753ik
    /* JADX INFO: renamed from: e */
    public final byte mo2592e(int i) {
        AbstractC0753ik.m3439f(i, this.f12646d);
        return mo2594m(i);
    }

    @Override // p000.AbstractC0753ik
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0753ik) {
            AbstractC0753ik abstractC0753ik = (AbstractC0753ik) obj;
            int size = abstractC0753ik.size();
            int i = this.f12646d;
            if (i == size) {
                if (i == 0) {
                    return true;
                }
                int i2 = this.f5044a;
                int i3 = abstractC0753ik.f5044a;
                if (i2 == 0 || i3 == 0 || i2 == i3) {
                    wm1 wm1Var = new wm1(this);
                    C0680gk c0680gkM6808a = wm1Var.m6808a();
                    wm1 wm1Var2 = new wm1(abstractC0753ik);
                    C0680gk c0680gkM6808a2 = wm1Var2.m6808a();
                    int i4 = 0;
                    int i5 = 0;
                    int i6 = 0;
                    while (true) {
                        int size2 = c0680gkM6808a.size() - i4;
                        int size3 = c0680gkM6808a2.size() - i5;
                        int iMin = Math.min(size2, size3);
                        if (!(i4 == 0 ? c0680gkM6808a.m3000z(c0680gkM6808a2, i5, iMin) : c0680gkM6808a2.m3000z(c0680gkM6808a, i4, iMin))) {
                            break;
                        }
                        i6 += iMin;
                        if (i6 >= i) {
                            if (i6 == i) {
                                return true;
                            }
                            l41.m4046o();
                            return false;
                        }
                        if (iMin == size2) {
                            c0680gkM6808a = wm1Var.m6808a();
                            i4 = 0;
                        } else {
                            i4 += iMin;
                        }
                        if (iMin == size3) {
                            c0680gkM6808a2 = wm1Var2.m6808a();
                            i5 = 0;
                        } else {
                            i5 += iMin;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new vm1(this);
    }

    @Override // p000.AbstractC0753ik
    /* JADX INFO: renamed from: j */
    public final void mo2593j(int i, int i2, int i3, byte[] bArr) {
        int i4 = i + i3;
        AbstractC0753ik abstractC0753ik = this.f12647e;
        int i5 = this.f12649g;
        if (i4 <= i5) {
            abstractC0753ik.mo2593j(i, i2, i3, bArr);
            return;
        }
        AbstractC0753ik abstractC0753ik2 = this.f12648f;
        if (i >= i5) {
            abstractC0753ik2.mo2593j(i - i5, i2, i3, bArr);
            return;
        }
        int i6 = i5 - i;
        abstractC0753ik.mo2593j(i, i2, i6, bArr);
        abstractC0753ik2.mo2593j(0, i2 + i6, i3 - i6, bArr);
    }

    @Override // p000.AbstractC0753ik
    /* JADX INFO: renamed from: k */
    public final int mo2991k() {
        return this.f12650m;
    }

    @Override // p000.AbstractC0753ik
    /* JADX INFO: renamed from: m */
    public final byte mo2594m(int i) {
        int i2 = this.f12649g;
        return i < i2 ? this.f12647e.mo2594m(i) : this.f12648f.mo2594m(i - i2);
    }

    @Override // p000.AbstractC0753ik
    /* JADX INFO: renamed from: n */
    public final boolean mo2992n() {
        return this.f12646d >= m6936z(this.f12650m);
    }

    @Override // p000.AbstractC0753ik
    /* JADX INFO: renamed from: p */
    public final boolean mo2993p() {
        int iMo2996t = this.f12647e.mo2996t(0, 0, this.f12649g);
        AbstractC0753ik abstractC0753ik = this.f12648f;
        return abstractC0753ik.mo2996t(iMo2996t, 0, abstractC0753ik.size()) == 0;
    }

    @Override // p000.AbstractC0753ik
    /* JADX INFO: renamed from: q */
    public final AbstractC0762ip mo2994q() {
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque(this.f12650m);
        arrayDeque.push(this);
        AbstractC0753ik abstractC0753ik = this.f12647e;
        while (abstractC0753ik instanceof xm1) {
            xm1 xm1Var = (xm1) abstractC0753ik;
            arrayDeque.push(xm1Var);
            abstractC0753ik = xm1Var.f12647e;
        }
        C0680gk c0680gk = (C0680gk) abstractC0753ik;
        while (true) {
            if (!(c0680gk != null)) {
                int size = arrayList.size();
                int i = 0;
                int iRemaining = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ByteBuffer byteBuffer = (ByteBuffer) obj;
                    iRemaining += byteBuffer.remaining();
                    if (byteBuffer.hasArray()) {
                        i |= 1;
                    } else {
                        i = byteBuffer.isDirect() ? i | 2 : i | 4;
                    }
                }
                if (i == 2) {
                    return new C0648fp(iRemaining, arrayList);
                }
                up0 up0Var = new up0();
                up0Var.f11374a = arrayList.iterator();
                up0Var.f11376c = 0;
                int size2 = arrayList.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = arrayList.get(i3);
                    i3++;
                    up0Var.f11376c++;
                }
                up0Var.f11377d = -1;
                if (!up0Var.m6517c()) {
                    up0Var.f11375b = no0.f7483c;
                    up0Var.f11377d = 0;
                    up0Var.f11378e = 0;
                    up0Var.f11382n = 0L;
                }
                return AbstractC0762ip.m3469g(up0Var);
            }
            C0680gk c0680gk2 = null;
            if (c0680gk == null) {
                ca0.m1185q();
                return null;
            }
            while (!arrayDeque.isEmpty()) {
                AbstractC0753ik abstractC0753ik2 = ((xm1) arrayDeque.pop()).f12648f;
                while (abstractC0753ik2 instanceof xm1) {
                    xm1 xm1Var2 = (xm1) abstractC0753ik2;
                    arrayDeque.push(xm1Var2);
                    abstractC0753ik2 = xm1Var2.f12647e;
                }
                C0680gk c0680gk3 = (C0680gk) abstractC0753ik2;
                if (!c0680gk3.isEmpty()) {
                    c0680gk2 = c0680gk3;
                    break;
                }
            }
            arrayList.add(c0680gk.mo2990a());
            c0680gk = c0680gk2;
        }
    }

    @Override // p000.AbstractC0753ik
    /* JADX INFO: renamed from: s */
    public final int mo2995s(int i, int i2, int i3) {
        int i4 = i2 + i3;
        AbstractC0753ik abstractC0753ik = this.f12647e;
        int i5 = this.f12649g;
        if (i4 <= i5) {
            return abstractC0753ik.mo2995s(i, i2, i3);
        }
        AbstractC0753ik abstractC0753ik2 = this.f12648f;
        if (i2 >= i5) {
            return abstractC0753ik2.mo2995s(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return abstractC0753ik2.mo2995s(abstractC0753ik.mo2995s(i, i2, i6), 0, i3 - i6);
    }

    @Override // p000.AbstractC0753ik
    public final int size() {
        return this.f12646d;
    }

    @Override // p000.AbstractC0753ik
    /* JADX INFO: renamed from: t */
    public final int mo2996t(int i, int i2, int i3) {
        int i4 = i2 + i3;
        AbstractC0753ik abstractC0753ik = this.f12647e;
        int i5 = this.f12649g;
        if (i4 <= i5) {
            return abstractC0753ik.mo2996t(i, i2, i3);
        }
        AbstractC0753ik abstractC0753ik2 = this.f12648f;
        if (i2 >= i5) {
            return abstractC0753ik2.mo2996t(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return abstractC0753ik2.mo2996t(abstractC0753ik.mo2996t(i, i2, i6), 0, i3 - i6);
    }

    @Override // p000.AbstractC0753ik
    /* JADX INFO: renamed from: u */
    public final AbstractC0753ik mo2997u(int i, int i2) {
        int i3 = this.f12646d;
        int iM3440h = AbstractC0753ik.m3440h(i, i2, i3);
        if (iM3440h == 0) {
            return AbstractC0753ik.f5042b;
        }
        if (iM3440h == i3) {
            return this;
        }
        AbstractC0753ik abstractC0753ik = this.f12647e;
        int i4 = this.f12649g;
        if (i2 <= i4) {
            return abstractC0753ik.mo2997u(i, i2);
        }
        AbstractC0753ik abstractC0753ik2 = this.f12648f;
        return i >= i4 ? abstractC0753ik2.mo2997u(i - i4, i2 - i4) : new xm1(abstractC0753ik.mo2997u(i, abstractC0753ik.size()), abstractC0753ik2.mo2997u(0, i2 - i4));
    }

    @Override // p000.AbstractC0753ik
    /* JADX INFO: renamed from: w */
    public final String mo2998w(Charset charset) {
        return new String(m3442v(), charset);
    }

    @Override // p000.AbstractC0753ik
    /* JADX INFO: renamed from: y */
    public final void mo2999y(AbstractC1153np abstractC1153np) {
        this.f12647e.mo2999y(abstractC1153np);
        this.f12648f.mo2999y(abstractC1153np);
    }
}
