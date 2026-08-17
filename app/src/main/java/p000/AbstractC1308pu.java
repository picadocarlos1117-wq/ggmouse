package p000;

import android.sun.security.x509.AttributeNameEnumeration;
import com.android.billingclient.api.BillingResult;
import java.util.Enumeration;
import java.util.HashMap;

/* JADX INFO: renamed from: pu */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1308pu {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f9162a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ int[] m5333A(int i) {
        int[] iArr = new int[i];
        System.arraycopy(f9162a, 0, iArr, 0, i);
        return iArr;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m5334a(int i, int i2) {
        if (i != 0) {
            return i == i2;
        }
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public static int m5335b(int i, int i2, int i3, int i4) {
        return AbstractC1153np.m4585d(i) + i2 + i3 + i4;
    }

    /* JADX INFO: renamed from: c */
    public static int m5336c(int i, int i2, String str) {
        return (str.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: d */
    public static BillingResult m5337d(int i, String str) {
        BillingResult.Builder builderNewBuilder = BillingResult.newBuilder();
        builderNewBuilder.setResponseCode(i);
        builderNewBuilder.setDebugMessage(str);
        return builderNewBuilder.build();
    }

    /* JADX INFO: renamed from: e */
    public static String m5338e(String str, int i, int i2, String str2) {
        return str + i + str2 + i2;
    }

    /* JADX INFO: renamed from: f */
    public static String m5339f(String str, String str2) {
        return str + str2;
    }

    /* JADX INFO: renamed from: g */
    public static String m5340g(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* JADX INFO: renamed from: h */
    public static String m5341h(StringBuilder sb, int i, String str) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: i */
    public static String m5342i(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: j */
    public static StringBuilder m5343j(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    /* JADX INFO: renamed from: k */
    public static StringBuilder m5344k(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    /* JADX INFO: renamed from: l */
    public static StringBuilder m5345l(String str, int i, String str2, int i2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    /* JADX INFO: renamed from: m */
    public static StringBuilder m5346m(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    /* JADX INFO: renamed from: n */
    public static StringBuilder m5347n(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    /* JADX INFO: renamed from: o */
    public static Enumeration m5348o(String str) {
        AttributeNameEnumeration attributeNameEnumeration = new AttributeNameEnumeration();
        attributeNameEnumeration.addElement(str);
        return attributeNameEnumeration.elements();
    }

    /* JADX INFO: renamed from: p */
    public static void m5349p(int i, int i2, int i3, int i4, int i5) {
        z42.m7252z(i);
        z42.m7252z(i2);
        z42.m7252z(i3);
        z42.m7252z(i4);
        z42.m7252z(i5);
    }

    /* JADX INFO: renamed from: q */
    public static void m5350q(int i, String str, HashMap map, String str2) {
        map.put(str2, new f10(i, str));
    }

    /* JADX INFO: renamed from: r */
    public static void m5351r(int i, HashMap map, String str, int i2, String str2) {
        map.put(str, Integer.valueOf(i));
        map.put(str2, Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: s */
    public static void m5352s(C1351r c1351r) {
        C0137cj.m1224c(c1351r, new vt1());
    }

    /* JADX INFO: renamed from: t */
    public static void m5353t(C1351r c1351r, String str, String str2, String str3, String str4) {
        c1351r.m5634u(str);
        c1351r.m5634u(str2);
        c1351r.m5634u(str3);
        c1351r.m5634u(str4);
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m5354u(Object obj) {
        if (obj == null) {
            return;
        }
        l41.m4035b();
    }

    /* JADX INFO: renamed from: v */
    public static void m5355v(String str, String str2, String str3) {
        AbstractC1337qm.m5542i0(str3, str + str2);
    }

    /* JADX INFO: renamed from: w */
    public static void m5356w(StringBuilder sb, int i, String str, int i2, String str2) {
        sb.append(i);
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
    }

    /* JADX INFO: renamed from: x */
    public static void m5357x(C1351r c1351r) {
        C0137cj.m1224c(c1351r, new C1107mg(6));
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ String m5358y(int i) {
        switch (i) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ int m5359z(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }
}
