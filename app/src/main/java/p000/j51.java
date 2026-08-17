package p000;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class j51 {

    /* JADX INFO: renamed from: c */
    public static final Logger f5268c = Logger.getLogger(j51.class.getName());

    /* JADX INFO: renamed from: d */
    public static final pu0 f5269d = new pu0(3);

    /* JADX INFO: renamed from: e */
    public static final C0603eh f5270e;

    /* JADX INFO: renamed from: a */
    public Object[] f5271a;

    /* JADX INFO: renamed from: b */
    public int f5272b;

    static {
        C0603eh c0603eh = C0677gh.f4189c;
        if (c0603eh.f4191b != null) {
            c0603eh = new C0603eh(c0603eh.f4190a, (Character) null);
        }
        f5270e = c0603eh;
    }

    /* JADX INFO: renamed from: a */
    public final void m3561a(g51 g51Var) {
        if (this.f5272b == 0) {
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = this.f5272b;
            if (i >= i3) {
                Arrays.fill(this.f5271a, i2 * 2, i3 * 2, (Object) null);
                this.f5272b = i2;
                return;
            }
            if (!Arrays.equals(g51Var.f4067b, m3565e(i))) {
                byte[] bArrM3565e = m3565e(i);
                Object[] objArr = this.f5271a;
                int i4 = i2 * 2;
                objArr[i4] = bArrM3565e;
                Object obj = objArr[(i * 2) + 1];
                if (objArr instanceof byte[][]) {
                    m3562b(objArr.length);
                }
                this.f5271a[i4 + 1] = obj;
                i2++;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m3562b(int i) {
        Object[] objArr = new Object[i];
        int i2 = this.f5272b;
        if (i2 != 0) {
            System.arraycopy(this.f5271a, 0, objArr, 0, i2 * 2);
        }
        this.f5271a = objArr;
    }

    /* JADX INFO: renamed from: c */
    public final Object m3563c(g51 g51Var) {
        int i = this.f5272b;
        do {
            i--;
            if (i < 0) {
                return null;
            }
        } while (!Arrays.equals(g51Var.f4067b, m3565e(i)));
        Object obj = this.f5271a[(i * 2) + 1];
        if (obj instanceof byte[]) {
            return g51Var.mo2224a((byte[]) obj);
        }
        obj.getClass();
        l41.m4035b();
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m3564d(j51 j51Var) {
        int i = j51Var.f5272b;
        if (i == 0) {
            return;
        }
        Object[] objArr = this.f5271a;
        int length = objArr != null ? objArr.length : 0;
        int i2 = this.f5272b;
        int i3 = length - (i2 * 2);
        if (i2 == 0 || i3 < i * 2) {
            m3562b((i * 2) + (i2 * 2));
        }
        System.arraycopy(j51Var.f5271a, 0, this.f5271a, this.f5272b * 2, j51Var.f5272b * 2);
        this.f5272b += j51Var.f5272b;
    }

    /* JADX INFO: renamed from: e */
    public final byte[] m3565e(int i) {
        return (byte[]) this.f5271a[i * 2];
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    /* JADX INFO: renamed from: f */
    public final void m3566f(g51 g51Var, Object obj) {
        p32.m5188s(g51Var, "key");
        p32.m5188s(obj, "value");
        int i = this.f5272b;
        int i2 = i * 2;
        if (i2 == 0) {
            m3562b(Math.max(i * 4, 8));
        } else {
            Object[] objArr = this.f5271a;
            if (i2 == (objArr != null ? objArr.length : 0)) {
                m3562b(Math.max(i * 4, 8));
            }
        }
        int i3 = this.f5272b;
        this.f5271a[i3 * 2] = g51Var.f4067b;
        this.f5271a[(i3 * 2) + 1] = g51Var.mo2225b(obj);
        this.f5272b++;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata(");
        for (int i = 0; i < this.f5272b; i++) {
            if (i != 0) {
                sb.append(',');
            }
            byte[] bArrM3565e = m3565e(i);
            Charset charset = AbstractC0646fn.f3855a;
            String str = new String(bArrM3565e, charset);
            sb.append(str);
            sb.append('=');
            boolean zEndsWith = str.endsWith("-bin");
            Object[] objArr = this.f5271a;
            if (zEndsWith) {
                Object obj = objArr[(i * 2) + 1];
                if (!(obj instanceof byte[])) {
                    AbstractC1308pu.m5354u(obj);
                    throw null;
                }
                sb.append(f5270e.m2984c((byte[]) obj));
            } else {
                Object obj2 = objArr[(i * 2) + 1];
                if (!(obj2 instanceof byte[])) {
                    AbstractC1308pu.m5354u(obj2);
                    throw null;
                }
                sb.append(new String((byte[]) obj2, charset));
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
