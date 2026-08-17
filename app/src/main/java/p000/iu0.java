package p000;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class iu0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5159a = 0;

    /* JADX INFO: renamed from: b */
    public List f5160b;

    /* JADX INFO: renamed from: c */
    public C1437tb f5161c;

    /* JADX INFO: renamed from: d */
    public Object[][] f5162d;

    public iu0(List list, C1437tb c1437tb, Object[][] objArr) {
        p32.m5188s(list, "addresses are not set");
        this.f5160b = list;
        p32.m5188s(c1437tb, "attrs");
        this.f5161c = c1437tb;
        p32.m5188s(objArr, "customOptions");
        this.f5162d = objArr;
    }

    /* JADX INFO: renamed from: c */
    public static iu0 m3490c() {
        iu0 iu0Var = new iu0();
        iu0Var.f5161c = C1437tb.f10816b;
        iu0Var.f5162d = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        return iu0Var;
    }

    /* JADX INFO: renamed from: a */
    public void m3491a(mu0 mu0Var) {
        Object[][] objArr;
        bz1 bz1Var;
        int length = 0;
        while (true) {
            objArr = this.f5162d;
            int length2 = objArr.length;
            bz1Var = nu0.f7538d;
            if (length >= length2) {
                length = -1;
                break;
            } else if (bz1Var == objArr[length][0]) {
                break;
            } else {
                length++;
            }
        }
        if (length == -1) {
            Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, objArr.length + 1, 2);
            Object[][] objArr3 = this.f5162d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f5162d = objArr2;
            length = objArr2.length - 1;
        }
        this.f5162d[length] = new Object[]{bz1Var, mu0Var};
    }

    /* JADX INFO: renamed from: b */
    public Object m3492b() {
        int i = 0;
        while (true) {
            Object[][] objArr = this.f5162d;
            if (i >= objArr.length) {
                return null;
            }
            Object[] objArr2 = objArr[i];
            if (nu0.f7538d == objArr2[0]) {
                return objArr2[1];
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m3493d(List list) {
        p32.m5177l(!list.isEmpty(), "addrs is empty");
        this.f5160b = Collections.unmodifiableList(new ArrayList(list));
    }

    public String toString() {
        switch (this.f5159a) {
            case 1:
                C1679zv c1679zvM5176k0 = p32.m5176k0(this);
                c1679zvM5176k0.m7359a(this.f5160b, "addrs");
                c1679zvM5176k0.m7359a(this.f5161c, "attrs");
                c1679zvM5176k0.m7359a(Arrays.deepToString(this.f5162d), "customOptions");
                return c1679zvM5176k0.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ iu0() {
    }
}
