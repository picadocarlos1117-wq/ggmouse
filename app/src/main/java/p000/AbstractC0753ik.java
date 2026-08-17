package p000;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: ik */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0753ik implements Iterable, Serializable {

    /* JADX INFO: renamed from: b */
    public static final C0680gk f5042b = new C0680gk(no0.f7482b);

    /* JADX INFO: renamed from: c */
    public static final InterfaceC0643fk f5043c;

    /* JADX INFO: renamed from: a */
    public int f5044a = 0;

    static {
        InterfaceC0643fk bz1Var;
        if (AbstractC1579x5.m6867a()) {
            bz1Var = new k50((byte) 0, 12);
        } else {
            bz1Var = new bz1(11);
        }
        f5043c = bz1Var;
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC0753ik m3438b(Iterator it, int i) {
        if (i < 1) {
            f40.m2713i(jd0.m3610h(i, "length (", ") must be >= 1"));
            return null;
        }
        if (i == 1) {
            return (AbstractC0753ik) it.next();
        }
        int i2 = i >>> 1;
        AbstractC0753ik abstractC0753ikM3438b = m3438b(it, i2);
        AbstractC0753ik abstractC0753ikM3438b2 = m3438b(it, i - i2);
        if (Integer.MAX_VALUE - abstractC0753ikM3438b.size() < abstractC0753ikM3438b2.size()) {
            throw new IllegalArgumentException("ByteString would be too long: " + abstractC0753ikM3438b.size() + "+" + abstractC0753ikM3438b2.size());
        }
        if (abstractC0753ikM3438b2.size() == 0) {
            return abstractC0753ikM3438b;
        }
        if (abstractC0753ikM3438b.size() == 0) {
            return abstractC0753ikM3438b2;
        }
        int size = abstractC0753ikM3438b2.size() + abstractC0753ikM3438b.size();
        if (size < 128) {
            int size2 = abstractC0753ikM3438b.size();
            int size3 = abstractC0753ikM3438b2.size();
            int i3 = size2 + size3;
            byte[] bArr = new byte[i3];
            m3440h(0, size2, abstractC0753ikM3438b.size());
            m3440h(0, size2, i3);
            if (size2 > 0) {
                abstractC0753ikM3438b.mo2593j(0, 0, size2, bArr);
            }
            m3440h(0, size3, abstractC0753ikM3438b2.size());
            m3440h(size2, i3, i3);
            if (size3 > 0) {
                abstractC0753ikM3438b2.mo2593j(0, size2, size3, bArr);
            }
            return new C0680gk(bArr);
        }
        if (abstractC0753ikM3438b instanceof xm1) {
            xm1 xm1Var = (xm1) abstractC0753ikM3438b;
            AbstractC0753ik abstractC0753ik = xm1Var.f12647e;
            AbstractC0753ik abstractC0753ik2 = xm1Var.f12648f;
            if (abstractC0753ikM3438b2.size() + abstractC0753ik2.size() < 128) {
                int size4 = abstractC0753ik2.size();
                int size5 = abstractC0753ikM3438b2.size();
                int i4 = size4 + size5;
                byte[] bArr2 = new byte[i4];
                m3440h(0, size4, abstractC0753ik2.size());
                m3440h(0, size4, i4);
                if (size4 > 0) {
                    abstractC0753ik2.mo2593j(0, 0, size4, bArr2);
                }
                m3440h(0, size5, abstractC0753ikM3438b2.size());
                m3440h(size4, i4, i4);
                if (size5 > 0) {
                    abstractC0753ikM3438b2.mo2593j(0, size4, size5, bArr2);
                }
                return new xm1(abstractC0753ik, new C0680gk(bArr2));
            }
            if (abstractC0753ik.mo2991k() > abstractC0753ik2.mo2991k() && xm1Var.f12650m > abstractC0753ikM3438b2.mo2991k()) {
                return new xm1(abstractC0753ik, new xm1(abstractC0753ik2, abstractC0753ikM3438b2));
            }
        }
        if (size >= xm1.m6936z(Math.max(abstractC0753ikM3438b.mo2991k(), abstractC0753ikM3438b2.mo2991k()) + 1)) {
            return new xm1(abstractC0753ikM3438b, abstractC0753ikM3438b2);
        }
        pn0 pn0Var = new pn0(21);
        pn0Var.m5285e(abstractC0753ikM3438b);
        pn0Var.m5285e(abstractC0753ikM3438b2);
        ArrayDeque arrayDeque = (ArrayDeque) pn0Var.f8968a;
        AbstractC0753ik xm1Var2 = (AbstractC0753ik) arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            xm1Var2 = new xm1((AbstractC0753ik) arrayDeque.pop(), xm1Var2);
        }
        return xm1Var2;
    }

    /* JADX INFO: renamed from: f */
    public static void m3439f(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i >= 0) {
                throw new ArrayIndexOutOfBoundsException(AbstractC1308pu.m5338e("Index > length: ", i, i2, ", "));
            }
            throw new ArrayIndexOutOfBoundsException(jd0.m3609g(i, "Index < 0: "));
        }
    }

    /* JADX INFO: renamed from: h */
    public static int m3440h(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            f40.m2718n(jd0.m3610h(i, "Beginning index: ", " < 0"));
            return 0;
        }
        if (i2 < i) {
            f40.m2718n(AbstractC1308pu.m5338e("Beginning index larger than ending index: ", i, i2, ", "));
            return 0;
        }
        f40.m2718n(AbstractC1308pu.m5338e("End index: ", i2, i3, " >= "));
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public static C0680gk m3441i(int i, int i2, byte[] bArr) {
        m3440h(i, i + i2, bArr.length);
        return new C0680gk(f5043c.mo1081d(i, i2, bArr));
    }

    /* JADX INFO: renamed from: a */
    public abstract ByteBuffer mo2990a();

    /* JADX INFO: renamed from: e */
    public abstract byte mo2592e(int i);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iMo2995s = this.f5044a;
        if (iMo2995s == 0) {
            int size = size();
            iMo2995s = mo2995s(size, 0, size);
            if (iMo2995s == 0) {
                iMo2995s = 1;
            }
            this.f5044a = iMo2995s;
        }
        return iMo2995s;
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo2593j(int i, int i2, int i3, byte[] bArr);

    /* JADX INFO: renamed from: k */
    public abstract int mo2991k();

    /* JADX INFO: renamed from: m */
    public abstract byte mo2594m(int i);

    /* JADX INFO: renamed from: n */
    public abstract boolean mo2992n();

    /* JADX INFO: renamed from: p */
    public abstract boolean mo2993p();

    /* JADX INFO: renamed from: q */
    public abstract AbstractC0762ip mo2994q();

    /* JADX INFO: renamed from: s */
    public abstract int mo2995s(int i, int i2, int i3);

    public abstract int size();

    /* JADX INFO: renamed from: t */
    public abstract int mo2996t(int i, int i2, int i3);

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        String strM3277m = size() <= 50 ? hr1.m3277m(this) : hr1.m3277m(mo2997u(0, 47)).concat("...");
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(size);
        sb.append(" contents=\"");
        return AbstractC1308pu.m5342i(sb, strM3277m, "\">");
    }

    /* JADX INFO: renamed from: u */
    public abstract AbstractC0753ik mo2997u(int i, int i2);

    /* JADX INFO: renamed from: v */
    public final byte[] m3442v() {
        int size = size();
        if (size == 0) {
            return no0.f7482b;
        }
        byte[] bArr = new byte[size];
        mo2593j(0, 0, size, bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: w */
    public abstract String mo2998w(Charset charset);

    /* JADX INFO: renamed from: x */
    public final String m3443x() {
        return size() == 0 ? "" : mo2998w(no0.f7481a);
    }

    /* JADX INFO: renamed from: y */
    public abstract void mo2999y(AbstractC1153np abstractC1153np);
}
