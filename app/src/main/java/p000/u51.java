package p000;

import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class u51 {

    /* JADX INFO: renamed from: a */
    public final t51 f11125a;

    /* JADX INFO: renamed from: b */
    public final String f11126b;

    /* JADX INFO: renamed from: c */
    public final String f11127c;

    /* JADX INFO: renamed from: d */
    public final lh1 f11128d;

    /* JADX INFO: renamed from: e */
    public final lh1 f11129e;

    /* JADX INFO: renamed from: f */
    public final boolean f11130f;

    public u51(t51 t51Var, String str, lh1 lh1Var, lh1 lh1Var2, boolean z) {
        new AtomicReferenceArray(2);
        p32.m5188s(t51Var, "type");
        this.f11125a = t51Var;
        p32.m5188s(str, "fullMethodName");
        this.f11126b = str;
        int iLastIndexOf = str.lastIndexOf(47);
        this.f11127c = iLastIndexOf == -1 ? null : str.substring(0, iLastIndexOf);
        p32.m5188s(lh1Var, "requestMarshaller");
        this.f11128d = lh1Var;
        p32.m5188s(lh1Var2, "responseMarshaller");
        this.f11129e = lh1Var2;
        this.f11130f = z;
    }

    /* JADX INFO: renamed from: a */
    public static String m6385a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        p32.m5188s(str, "fullServiceName");
        sb.append(str);
        sb.append("/");
        p32.m5188s(str2, "methodName");
        sb.append(str2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static C1054l0 m6386b() {
        C1054l0 c1054l0 = new C1054l0();
        c1054l0.f6121b = null;
        c1054l0.f6122c = null;
        return c1054l0;
    }

    /* JADX INFO: renamed from: c */
    public final y41 m6387c(InputStream inputStream) {
        AbstractC0762ip abstractC0762ipM3469g;
        byte[] bArr;
        lh1 lh1Var = this.f11129e;
        if (!(inputStream instanceof kh1)) {
            lh1Var.getClass();
        } else if (((kh1) inputStream).f5824b == lh1Var.f6351a) {
            try {
                y41 y41Var = ((kh1) inputStream).f5823a;
                if (y41Var != null) {
                    return y41Var;
                }
                throw new IllegalStateException("message not available");
            } catch (IllegalStateException unused) {
            }
        }
        try {
            if (inputStream instanceof yq0) {
                int iAvailable = inputStream.available();
                if (iAvailable <= 0 || iAvailable > 4194304) {
                    if (iAvailable == 0) {
                        return lh1Var.f6352b;
                    }
                    abstractC0762ipM3469g = null;
                } else {
                    ThreadLocal threadLocal = lh1.f6350d;
                    Reference reference = (Reference) threadLocal.get();
                    if (reference == null || (bArr = (byte[]) reference.get()) == null || bArr.length < iAvailable) {
                        bArr = new byte[iAvailable];
                        threadLocal.set(new WeakReference(bArr));
                    }
                    int i = iAvailable;
                    while (i > 0) {
                        int i2 = inputStream.read(bArr, iAvailable - i, i);
                        if (i2 == -1) {
                            break;
                        }
                        i -= i2;
                    }
                    if (i != 0) {
                        throw new RuntimeException("size inaccurate: " + iAvailable + " != " + (iAvailable - i));
                    }
                    abstractC0762ipM3469g = AbstractC0762ip.m3468f(bArr, 0, iAvailable, false);
                }
            } else {
                abstractC0762ipM3469g = null;
            }
            if (abstractC0762ipM3469g == null) {
                abstractC0762ipM3469g = AbstractC0762ip.m3469g(inputStream);
            }
            int i3 = lh1Var.f6353c;
            if (i3 >= 0) {
                if (i3 < 0) {
                    f40.m2713i(jd0.m3609g(i3, "Recursion limit cannot be negative: "));
                    return null;
                }
                abstractC0762ipM3469g.f5123b = i3;
            }
            try {
                fi0 partialFrom = fi0.parsePartialFrom(((bi0) lh1Var.f6351a).f1381a, abstractC0762ipM3469g, mh1.f6993a);
                if (partialFrom != null && !partialFrom.isInitialized()) {
                    throw new rp0(partialFrom.newUninitializedMessageException().getMessage());
                }
                abstractC0762ipM3469g.mo2615a(0);
                return partialFrom;
            } catch (rp0 e) {
                throw new qv1(nv1.f7558m.m4614g("Invalid protobuf byte sequence").m4613f(e));
            }
        } catch (IOException e2) {
            ca0.m1184p(e2);
            return null;
        }
    }

    public final String toString() {
        C1679zv c1679zvM5176k0 = p32.m5176k0(this);
        c1679zvM5176k0.m7359a(this.f11126b, "fullMethodName");
        c1679zvM5176k0.m7359a(this.f11125a, "type");
        c1679zvM5176k0.m7361c("idempotent", false);
        c1679zvM5176k0.m7361c("safe", false);
        c1679zvM5176k0.m7361c("sampledToLocalTracing", this.f11130f);
        c1679zvM5176k0.m7359a(this.f11128d, "requestMarshaller");
        c1679zvM5176k0.m7359a(this.f11129e, "responseMarshaller");
        c1679zvM5176k0.m7359a(null, "schemaDescriptor");
        c1679zvM5176k0.f13575b = true;
        return c1679zvM5176k0.toString();
    }
}
