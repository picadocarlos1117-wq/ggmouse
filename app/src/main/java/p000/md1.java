package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.security.Provider;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class md1 extends od1 {

    /* JADX INFO: renamed from: e */
    public final Method f6772e;

    /* JADX INFO: renamed from: f */
    public final Method f6773f;

    /* JADX INFO: renamed from: g */
    public final Method f6774g;

    /* JADX INFO: renamed from: h */
    public final Class f6775h;

    /* JADX INFO: renamed from: i */
    public final Class f6776i;

    public md1(Method method, Method method2, Method method3, Class cls, Class cls2, Provider provider) {
        super(provider);
        this.f6772e = method;
        this.f6773f = method2;
        this.f6774g = method3;
        this.f6775h = cls;
        this.f6776i = cls2;
    }

    @Override // p000.od1
    /* JADX INFO: renamed from: a */
    public final void mo4421a(SSLSocket sSLSocket) {
        try {
            this.f6774g.invoke(null, sSLSocket);
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        } catch (InvocationTargetException e) {
            od1.f7761b.log(Level.FINE, "Failed to remove SSLSocket from Jetty ALPN", (Throwable) e);
        }
    }

    @Override // p000.od1
    /* JADX INFO: renamed from: c */
    public final void mo3819c(SSLSocket sSLSocket, String str, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ph1 ph1Var = (ph1) list.get(i);
            if (ph1Var != ph1.HTTP_1_0) {
                arrayList.add(ph1Var.f8900a);
            }
        }
        try {
            this.f6772e.invoke(null, sSLSocket, Proxy.newProxyInstance(od1.class.getClassLoader(), new Class[]{this.f6775h, this.f6776i}, new nd1(arrayList)));
        } catch (IllegalAccessException e) {
            f40.m2711g(e);
        } catch (InvocationTargetException e2) {
            f40.m2711g(e2);
        }
    }

    @Override // p000.od1
    /* JADX INFO: renamed from: d */
    public final String mo3820d(SSLSocket sSLSocket) {
        try {
            nd1 nd1Var = (nd1) Proxy.getInvocationHandler(this.f6773f.invoke(null, sSLSocket));
            boolean z = nd1Var.f7382b;
            if (!z && nd1Var.f7383c == null) {
                od1.f7761b.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                return null;
            }
            if (z) {
                return null;
            }
            return nd1Var.f7383c;
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        } catch (InvocationTargetException unused2) {
            throw new AssertionError();
        }
    }

    @Override // p000.od1
    /* JADX INFO: renamed from: e */
    public final int mo3821e() {
        return 1;
    }
}
