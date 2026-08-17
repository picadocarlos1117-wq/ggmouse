package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class aa1 extends ba1 {

    /* JADX INFO: renamed from: d */
    public static final C1174o9 f107d;

    /* JADX INFO: renamed from: e */
    public static final C1174o9 f108e;

    /* JADX INFO: renamed from: f */
    public static final C1174o9 f109f;

    /* JADX INFO: renamed from: g */
    public static final C1174o9 f110g;

    /* JADX INFO: renamed from: h */
    public static final C1174o9 f111h;

    /* JADX INFO: renamed from: i */
    public static final C1174o9 f112i;

    /* JADX INFO: renamed from: j */
    public static final Method f113j;

    /* JADX INFO: renamed from: k */
    public static final Method f114k;

    /* JADX INFO: renamed from: l */
    public static final Method f115l;

    /* JADX INFO: renamed from: m */
    public static final Method f116m;

    /* JADX INFO: renamed from: n */
    public static final Method f117n;

    /* JADX INFO: renamed from: o */
    public static final Method f118o;

    /* JADX INFO: renamed from: p */
    public static final Constructor f119p;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Method method6;
        Logger logger = ba1.f1263b;
        Class cls = Boolean.TYPE;
        Constructor<?> constructor = null;
        int i = 19;
        f107d = new C1174o9(constructor, "setUseSessionTickets", new Class[]{cls}, i);
        f108e = new C1174o9(constructor, "setHostname", new Class[]{String.class}, i);
        Class<byte[]> cls2 = byte[].class;
        f109f = new C1174o9(cls2, "getAlpnSelectedProtocol", new Class[0], i);
        f110g = new C1174o9(constructor, "setAlpnProtocols", new Class[]{byte[].class}, i);
        f111h = new C1174o9(cls2, "getNpnSelectedProtocol", new Class[0], i);
        f112i = new C1174o9(constructor, "setNpnProtocols", new Class[]{byte[].class}, i);
        try {
            try {
                method = SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
                try {
                    method2 = SSLParameters.class.getMethod("getApplicationProtocols", null);
                    try {
                        try {
                            method3 = SSLSocket.class.getMethod("getApplicationProtocol", null);
                            try {
                                Class<?> cls3 = Class.forName("android.net.ssl.SSLSockets");
                                method4 = cls3.getMethod("isSupportedSocket", SSLSocket.class);
                                try {
                                    method5 = cls3.getMethod("setUseSessionTickets", SSLSocket.class, cls);
                                } catch (ClassNotFoundException e) {
                                    e = e;
                                    logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                                    method5 = null;
                                } catch (NoSuchMethodException e2) {
                                    e = e2;
                                    logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                                    method5 = null;
                                }
                            } catch (ClassNotFoundException e3) {
                                e = e3;
                                method4 = null;
                            } catch (NoSuchMethodException e4) {
                                e = e4;
                                method4 = null;
                            }
                        } catch (ClassNotFoundException e5) {
                            e = e5;
                            method3 = null;
                            method4 = method3;
                            logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                            method5 = null;
                            f115l = method;
                            f116m = method2;
                            f117n = method3;
                            f113j = method4;
                            f114k = method5;
                            method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                            constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                            f118o = method6;
                            f119p = constructor;
                        } catch (NoSuchMethodException e6) {
                            e = e6;
                            method3 = null;
                            method4 = method3;
                            logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                            method5 = null;
                            f115l = method;
                            f116m = method2;
                            f117n = method3;
                            f113j = method4;
                            f114k = method5;
                            method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                            constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                            f118o = method6;
                            f119p = constructor;
                        }
                        constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                    } catch (ClassNotFoundException e7) {
                        e = e7;
                        logger.log(Level.FINER, "Failed to find Android 7.0+ APIs", (Throwable) e);
                    } catch (NoSuchMethodException e8) {
                        e = e8;
                        logger.log(Level.FINER, "Failed to find Android 7.0+ APIs", (Throwable) e);
                    }
                } catch (ClassNotFoundException e9) {
                    e = e9;
                    method2 = null;
                    method3 = method2;
                    method4 = method3;
                    logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                    method5 = null;
                    f115l = method;
                    f116m = method2;
                    f117n = method3;
                    f113j = method4;
                    f114k = method5;
                    method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                    f118o = method6;
                    f119p = constructor;
                } catch (NoSuchMethodException e10) {
                    e = e10;
                    method2 = null;
                    method3 = method2;
                    method4 = method3;
                    logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                    method5 = null;
                    f115l = method;
                    f116m = method2;
                    f117n = method3;
                    f113j = method4;
                    f114k = method5;
                    method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                    f118o = method6;
                    f119p = constructor;
                }
            } catch (ClassNotFoundException e11) {
                e = e11;
                method = null;
                method2 = null;
            } catch (NoSuchMethodException e12) {
                e = e12;
                method = null;
                method2 = null;
            }
            method6 = SSLParameters.class.getMethod("setServerNames", List.class);
        } catch (ClassNotFoundException e13) {
            e = e13;
            method6 = null;
        } catch (NoSuchMethodException e14) {
            e = e14;
            method6 = null;
        }
        f115l = method;
        f116m = method2;
        f117n = method3;
        f113j = method4;
        f114k = method5;
        f118o = method6;
        f119p = constructor;
    }

    @Override // p000.ba1
    /* JADX INFO: renamed from: a */
    public final void mo136a(SSLSocket sSLSocket, String str, List list) {
        Constructor constructor;
        Method method;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ph1) it.next()).f8900a);
        }
        boolean z = false;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        if (str != null) {
            try {
                try {
                    if (ba1.m953c(str)) {
                        Method method2 = f113j;
                        if (method2 == null || !((Boolean) method2.invoke(null, sSLSocket)).booleanValue()) {
                            f107d.m4747M(sSLSocket, Boolean.TRUE);
                        } else {
                            f114k.invoke(null, sSLSocket, Boolean.TRUE);
                        }
                        Method method3 = f118o;
                        if (method3 == null || (constructor = f119p) == null) {
                            f108e.m4747M(sSLSocket, str);
                        } else {
                            method3.invoke(sSLParameters, Collections.singletonList(constructor.newInstance(str)));
                        }
                    }
                } catch (IllegalAccessException e) {
                    ca0.m1184p(e);
                    return;
                } catch (InstantiationException e2) {
                    ca0.m1184p(e2);
                    return;
                }
            } catch (InvocationTargetException e3) {
                ca0.m1184p(e3);
                return;
            }
        }
        Method method4 = f117n;
        if (method4 != null) {
            try {
                method4.invoke(sSLSocket, null);
                f115l.invoke(sSLParameters, strArr);
                z = true;
            } catch (InvocationTargetException e4) {
                if (!(e4.getTargetException() instanceof UnsupportedOperationException)) {
                    throw e4;
                }
                ba1.f1263b.log(Level.FINER, "setApplicationProtocol unsupported, will try old methods");
            }
        }
        sSLSocket.setSSLParameters(sSLParameters);
        if (z && (method = f116m) != null && Arrays.equals(strArr, (String[]) method.invoke(sSLSocket.getSSLParameters(), null))) {
            return;
        }
        Object[] objArr = {od1.m4797b(list)};
        od1 od1Var = this.f1265a;
        if (od1Var.mo3821e() == 1) {
            f110g.m4748N(sSLSocket, objArr);
        }
        if (od1Var.mo3821e() != 3) {
            f112i.m4748N(sSLSocket, objArr);
        } else {
            l41.m4048q("We can not do TLS handshake on this Android version, please install the Google Play Services Dynamic Security Provider to use TLS");
        }
    }

    @Override // p000.ba1
    /* JADX INFO: renamed from: b */
    public final String mo137b(SSLSocket sSLSocket) {
        Logger logger = ba1.f1263b;
        Method method = f117n;
        if (method != null) {
            try {
                return (String) method.invoke(sSLSocket, null);
            } catch (IllegalAccessException e) {
                ca0.m1184p(e);
                return null;
            } catch (InvocationTargetException e2) {
                if (!(e2.getTargetException() instanceof UnsupportedOperationException)) {
                    ca0.m1184p(e2);
                    return null;
                }
                logger.log(Level.FINER, "Socket unsupported for getApplicationProtocol, will try old methods");
            }
        }
        od1 od1Var = this.f1265a;
        if (od1Var.mo3821e() == 1) {
            try {
                byte[] bArr = (byte[]) f109f.m4748N(sSLSocket, new Object[0]);
                if (bArr != null) {
                    return new String(bArr, y42.f12843b);
                }
            } catch (Exception e3) {
                logger.log(Level.FINE, "Failed calling getAlpnSelectedProtocol()", (Throwable) e3);
            }
        }
        if (od1Var.mo3821e() != 3) {
            try {
                byte[] bArr2 = (byte[]) f111h.m4748N(sSLSocket, new Object[0]);
                if (bArr2 != null) {
                    return new String(bArr2, y42.f12843b);
                }
            } catch (Exception e4) {
                logger.log(Level.FINE, "Failed calling getNpnSelectedProtocol()", (Throwable) e4);
            }
        }
        return null;
    }

    @Override // p000.ba1
    /* JADX INFO: renamed from: d */
    public final String mo138d(SSLSocket sSLSocket, String str, List list) {
        String strMo137b = mo137b(sSLSocket);
        return strMo137b == null ? super.mo138d(sSLSocket, str, list) : strMo137b;
    }
}
