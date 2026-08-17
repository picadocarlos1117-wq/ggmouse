package p000;

import java.security.AccessController;
import java.security.PrivilegedAction;

/* JADX INFO: renamed from: xi */
/* JADX INFO: loaded from: classes3.dex */
public final class C1592xi implements PrivilegedAction {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12608a = 1;

    public /* synthetic */ C1592xi() {
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        Class<?> clsLoadClass;
        switch (this.f12608a) {
            case 0:
                String[] strArr = C1666zi.f13421a;
                int i = 0;
                for (int i2 = 0; i2 != strArr.length; i2++) {
                    String strM5342i = AbstractC1308pu.m5342i(new StringBuilder("org.bouncycastle.pqc.jcajce.provider."), strArr[i2], "$Mappings");
                    try {
                        ClassLoader classLoader = C1666zi.class.getClassLoader();
                        clsLoadClass = classLoader != null ? classLoader.loadClass(strM5342i) : (Class) AccessController.doPrivileged(new C1629yi(i, strM5342i));
                    } catch (ClassNotFoundException unused) {
                        clsLoadClass = null;
                    }
                    if (clsLoadClass != null) {
                        try {
                            if (clsLoadClass.newInstance() == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        } catch (Exception e) {
                            throw new InternalError("cannot create instance of org.bouncycastle.pqc.jcajce.provider." + strArr[i2] + "$Mappings : " + e);
                        }
                    }
                }
                return null;
            default:
                return System.getProperty("line.separator");
        }
    }

    public C1592xi(C1666zi c1666zi) {
    }
}
