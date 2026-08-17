package p000;

import java.security.AccessControlException;
import java.security.AccessController;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dh1 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f2931a = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public static boolean m2359a(String str) {
        Map map;
        try {
            String str2 = (String) AccessController.doPrivileged(new C1629yi(2, str));
            if (str2 == null && ((map = (Map) f2931a.get()) == null || (str2 = (String) map.get(str)) == null)) {
                str2 = (String) AccessController.doPrivileged(new C1629yi(3, str));
            }
            return str2 != null && str2.length() == 4 && (str2.charAt(0) == 't' || str2.charAt(0) == 'T') && ((str2.charAt(1) == 'r' || str2.charAt(1) == 'R') && ((str2.charAt(2) == 'u' || str2.charAt(2) == 'U') && (str2.charAt(3) == 'e' || str2.charAt(3) == 'E')));
        } catch (AccessControlException unused) {
        }
    }
}
