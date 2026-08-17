package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ld1 extends od1 {

    /* JADX INFO: renamed from: e */
    public final Method f6323e;

    /* JADX INFO: renamed from: f */
    public final Method f6324f;

    public ld1(Provider provider, Method method, Method method2) {
        super(provider);
        this.f6323e = method;
        this.f6324f = method2;
    }

    @Override // p000.od1
    /* JADX INFO: renamed from: c */
    public final void mo3819c(SSLSocket sSLSocket, String str, List list) {
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ph1 ph1Var = (ph1) it.next();
            if (ph1Var != ph1.HTTP_1_0) {
                arrayList.add(ph1Var.f8900a);
            }
        }
        try {
            this.f6323e.invoke(sSLParameters, arrayList.toArray(new String[arrayList.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException e) {
            ca0.m1184p(e);
        } catch (InvocationTargetException e2) {
            ca0.m1184p(e2);
        }
    }

    @Override // p000.od1
    /* JADX INFO: renamed from: d */
    public final String mo3820d(SSLSocket sSLSocket) {
        try {
            return (String) this.f6324f.invoke(sSLSocket, null);
        } catch (IllegalAccessException e) {
            ca0.m1184p(e);
            return null;
        } catch (InvocationTargetException e2) {
            ca0.m1184p(e2);
            return null;
        }
    }

    @Override // p000.od1
    /* JADX INFO: renamed from: e */
    public final int mo3821e() {
        return 1;
    }
}
