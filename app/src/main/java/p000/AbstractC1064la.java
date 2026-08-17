package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: renamed from: la */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1064la extends AbstractC1337qm {
    /* JADX INFO: renamed from: n0 */
    public static void m4153n0(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        bArr.getClass();
        bArr2.getClass();
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    /* JADX INFO: renamed from: o0 */
    public static void m4154o0(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        objArr.getClass();
        objArr2.getClass();
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    /* JADX INFO: renamed from: p0 */
    public static final void m4155p0(Object[] objArr, Symbol symbol, int i, int i2) {
        objArr.getClass();
        Arrays.fill(objArr, i, i2, symbol);
    }

    /* JADX INFO: renamed from: q0 */
    public static Long m4156q0(long[] jArr, int i) {
        jArr.getClass();
        if (i < 0 || i >= jArr.length) {
            return null;
        }
        return Long.valueOf(jArr[i]);
    }

    /* JADX INFO: renamed from: r0 */
    public static String m4157r0(long[] jArr, int i) {
        String str = (i & 2) != 0 ? "" : "[";
        String str2 = (i & 4) == 0 ? "]" : "";
        jArr.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str);
        int i2 = 0;
        for (long j : jArr) {
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) ",");
            }
            sb.append((CharSequence) String.valueOf(j));
        }
        sb.append((CharSequence) str2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: s0 */
    public static String m4158s0(Object[] objArr, String str, String str2, C1284p6 c1284p6, int i) {
        if ((i & 32) != 0) {
            c1284p6 = null;
        }
        objArr.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str);
        int i2 = 0;
        for (Object obj : objArr) {
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) ",");
            }
            rc2.m5778b(sb, obj, c1284p6);
        }
        sb.append((CharSequence) str2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: t0 */
    public static char m4159t0(char[] cArr) {
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        f40.m2713i("Array has more than one element.");
        return (char) 0;
    }

    /* JADX INFO: renamed from: u0 */
    public static List m4160u0(long[] jArr) {
        jArr.getClass();
        int length = jArr.length;
        if (length == 0) {
            return n60.f7259a;
        }
        if (length == 1) {
            return AbstractC1337qm.m5511F(Long.valueOf(jArr[0]));
        }
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: v0 */
    public static List m4161v0(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? new ArrayList(new C1546w9(objArr)) : AbstractC1337qm.m5511F(objArr[0]);
        }
        return n60.f7259a;
    }

    /* JADX INFO: renamed from: w0 */
    public static Set m4162w0(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return q60.f9397a;
        }
        if (length == 1) {
            Set setSingleton = Collections.singleton(Integer.valueOf(iArr[0]));
            setSingleton.getClass();
            return setSingleton;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(qy0.m5619i0(iArr.length));
        for (int i : iArr) {
            linkedHashSet.add(Integer.valueOf(i));
        }
        return linkedHashSet;
    }
}
