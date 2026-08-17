package p000;

import java.security.PrivilegedAction;
import java.security.Provider;

/* JADX INFO: renamed from: aj */
/* JADX INFO: loaded from: classes3.dex */
public final class C0020aj implements PrivilegedAction {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f242a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f243b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f244c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0137cj f245d;

    public C0020aj(C0137cj c0137cj, String str, String str2, String str3) {
        this.f245d = c0137cj;
        this.f242a = str;
        this.f243b = str2;
        this.f244c = str3;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        String str = this.f242a;
        String str2 = this.f243b;
        C0137cj c0137cj = this.f245d;
        Provider.Service service = super/*java.security.Provider*/.getService(str, str2);
        if (service == null || service.getClassName() == null) {
            return null;
        }
        c0137cj.f1829a.put(this.f244c, service);
        c0137cj.remove(service.getType() + "." + service.getAlgorithm());
        c0137cj.putService(service);
        return service;
    }
}
