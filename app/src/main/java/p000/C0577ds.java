package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: ds */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0577ds {

    /* JADX INFO: renamed from: a */
    public boolean f3003a;

    /* JADX INFO: renamed from: b */
    public boolean f3004b;

    /* JADX INFO: renamed from: c */
    public Object f3005c;

    /* JADX INFO: renamed from: d */
    public Serializable f3006d;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Serializable, java.lang.String[]] */
    public C0577ds(C0614es c0614es) {
        this.f3003a = c0614es.f3429a;
        this.f3005c = c0614es.f3430b;
        this.f3006d = c0614es.f3431c;
        this.f3004b = c0614es.f3432d;
    }

    /* JADX INFO: renamed from: a */
    public void m2381a(EnumC1301pn... enumC1301pnArr) {
        if (!this.f3003a) {
            f40.m2719o("no cipher suites for cleartext connections");
            return;
        }
        String[] strArr = new String[enumC1301pnArr.length];
        for (int i = 0; i < enumC1301pnArr.length; i++) {
            strArr[i] = enumC1301pnArr[i].f8967a;
        }
        this.f3005c = strArr;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Serializable, java.lang.String[]] */
    /* JADX INFO: renamed from: b */
    public void m2382b(d12... d12VarArr) {
        if (!this.f3003a) {
            f40.m2719o("no TLS versions for cleartext connections");
            return;
        }
        if (d12VarArr.length == 0) {
            f40.m2713i("At least one TlsVersion is required");
            return;
        }
        Object r0 = new String[d12VarArr.length];
        for (int i = 0; i < d12VarArr.length; i++) {
            r0[i] = d12VarArr[i].f2718a;
        }
        this.f3006d = r0;
    }
}
