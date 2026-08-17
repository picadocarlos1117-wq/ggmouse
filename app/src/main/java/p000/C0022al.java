package p000;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: al */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0022al {

    /* JADX INFO: renamed from: i */
    public static final C0022al f257i;

    /* JADX INFO: renamed from: a */
    public final C1274ox f258a;

    /* JADX INFO: renamed from: b */
    public final Executor f259b;

    /* JADX INFO: renamed from: c */
    public final AbstractC1520vk f260c;

    /* JADX INFO: renamed from: d */
    public final Object[][] f261d;

    /* JADX INFO: renamed from: e */
    public final List f262e;

    /* JADX INFO: renamed from: f */
    public final Boolean f263f;

    /* JADX INFO: renamed from: g */
    public final Integer f264g;

    /* JADX INFO: renamed from: h */
    public final Integer f265h;

    static {
        C1668zk c1668zk = new C1668zk();
        c1668zk.f13442d = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        c1668zk.f13443e = Collections.EMPTY_LIST;
        f257i = new C0022al(c1668zk);
    }

    public C0022al(C1668zk c1668zk) {
        this.f258a = c1668zk.f13439a;
        this.f259b = c1668zk.f13440b;
        this.f260c = c1668zk.f13441c;
        this.f261d = c1668zk.f13442d;
        this.f262e = c1668zk.f13443e;
        this.f263f = c1668zk.f13444f;
        this.f264g = c1668zk.f13445g;
        this.f265h = c1668zk.f13446h;
    }

    /* JADX INFO: renamed from: b */
    public static C1668zk m167b(C0022al c0022al) {
        C1668zk c1668zk = new C1668zk();
        c1668zk.f13439a = c0022al.f258a;
        c1668zk.f13440b = c0022al.f259b;
        c1668zk.f13441c = c0022al.f260c;
        c1668zk.f13442d = c0022al.f261d;
        c1668zk.f13443e = c0022al.f262e;
        c1668zk.f13444f = c0022al.f263f;
        c1668zk.f13445g = c0022al.f264g;
        c1668zk.f13446h = c0022al.f265h;
        return c1668zk;
    }

    /* JADX INFO: renamed from: a */
    public final Object m168a(C0101bj c0101bj) {
        p32.m5188s(c0101bj, "key");
        int i = 0;
        while (true) {
            Object[][] objArr = this.f261d;
            if (i >= objArr.length) {
                return null;
            }
            Object[] objArr2 = objArr[i];
            if (c0101bj == objArr2[0]) {
                return objArr2[1];
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final C0022al m169c(C0101bj c0101bj, Object obj) {
        Object[][] objArr;
        p32.m5188s(c0101bj, "key");
        C1668zk c1668zkM167b = m167b(this);
        int i = 0;
        while (true) {
            objArr = this.f261d;
            if (i >= objArr.length) {
                i = -1;
                break;
            }
            if (c0101bj == objArr[i][0]) {
                break;
            }
            i++;
        }
        Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, objArr.length + (i == -1 ? 1 : 0), 2);
        c1668zkM167b.f13442d = objArr2;
        System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        Object[][] objArr3 = c1668zkM167b.f13442d;
        if (i == -1) {
            objArr3[objArr.length] = new Object[]{c0101bj, obj};
        } else {
            objArr3[i] = new Object[]{c0101bj, obj};
        }
        return new C0022al(c1668zkM167b);
    }

    public final String toString() {
        C1679zv c1679zvM5176k0 = p32.m5176k0(this);
        c1679zvM5176k0.m7359a(this.f258a, "deadline");
        c1679zvM5176k0.m7359a(null, "authority");
        c1679zvM5176k0.m7359a(this.f260c, "callCredentials");
        Executor executor = this.f259b;
        c1679zvM5176k0.m7359a(executor != null ? executor.getClass() : null, "executor");
        c1679zvM5176k0.m7359a(null, "compressorName");
        c1679zvM5176k0.m7359a(Arrays.deepToString(this.f261d), "customOptions");
        c1679zvM5176k0.m7361c("waitForReady", Boolean.TRUE.equals(this.f263f));
        c1679zvM5176k0.m7359a(this.f264g, "maxInboundMessageSize");
        c1679zvM5176k0.m7359a(this.f265h, "maxOutboundMessageSize");
        c1679zvM5176k0.m7359a(this.f262e, "streamTracerFactories");
        return c1679zvM5176k0.toString();
    }
}
