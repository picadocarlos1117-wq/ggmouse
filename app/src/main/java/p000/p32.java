package p000;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Bundle;
import android.sun.security.util.DerValue;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.sousasantoslogic.sspro.R;
import io.github.muntashirakon.adb.PairingConnectionCtx;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.FloatBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p32 {

    /* JADX INFO: renamed from: a */
    public static final float[][] f8687a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* JADX INFO: renamed from: b */
    public static final float[][] f8688b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* JADX INFO: renamed from: c */
    public static final float[] f8689c = {95.047f, 100.0f, 108.883f};

    /* JADX INFO: renamed from: d */
    public static final float[][] f8690d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* JADX INFO: renamed from: e */
    public static final C1473ua f8691e = new C1473ua(14);

    /* JADX INFO: renamed from: f */
    public static final int[] f8692f = {0, 25847, -2608894, -518909, 237124, -777960, -876248, 466468, 1826347, 2353451, -359251, -2091905, 3119733, -2884855, 3111497, 2680103, 2725464, 1024112, -1079900, 3585928, -549488, -1119584, 2619752, -2108549, -2118186, -3859737, -1399561, -3277672, 1757237, -19422, 4010497, 280005, 2706023, 95776, 3077325, 3530437, -1661693, -3592148, -2537516, 3915439, -3861115, -3043716, 3574422, -2867647, 3539968, -300467, 2348700, -539299, -1699267, -1643818, 3505694, -3821735, 3507263, -2140649, -1600420, 3699596, 811944, 531354, 954230, 3881043, 3900724, -2556880, 2071892, -2797779, -3930395, -1528703, -3677745, -3041255, -1452451, 3475950, 2176455, -1585221, -1257611, 1939314, -4083598, -1000202, -3190144, -3157330, -3632928, 126922, 3412210, -983419, 2147896, 2715295, -2967645, -3693493, -411027, -2477047, -671102, -1228525, -22981, -1308169, -381987, 1349076, 1852771, -1430430, -3343383, 264944, 508951, 3097992, 44288, -1100098, 904516, 3958618, -3724342, -8578, 1653064, -3249728, 2389356, -210977, 759969, -1316856, 189548, -3553272, 3159746, -1851402, -2409325, -177440, 1315589, 1341330, 1285669, -1584928, -812732, -1439742, -3019102, -3881060, -3628969, 3839961, 2091667, 3407706, 2316500, 3817976, -3342478, 2244091, -2446433, -3562462, 266997, 2434439, -1235728, 3513181, -3520352, -3759364, -1197226, -3193378, 900702, 1859098, 909542, 819034, 495491, -1613174, -43260, -522500, -655327, -3122442, 2031748, 3207046, -3556995, -525098, -768622, -3595838, 342297, 286988, -2437823, 4108315, 3437287, -3342277, 1735879, 203044, 2842341, 2691481, -2590150, 1265009, 4055324, 1247620, 2486353, 1595974, -3767016, 1250494, 2635921, -3548272, -2994039, 1869119, 1903435, -1050970, -1333058, 1237275, -3318210, -1430225, -451100, 1312455, 3306115, -1962642, -1279661, 1917081, -2546312, -1374803, 1500165, 777191, 2235880, 3406031, -542412, -2831860, -1671176, -1846953, -2584293, -3724270, 594136, -3776993, -2013608, 2432395, 2454455, -164721, 1957272, 3369112, 185531, -1207385, -3183426, 162844, 1616392, 3014001, 810149, 1652634, -3694233, -1799107, -3038916, 3523897, 3866901, 269760, 2213111, -975884, 1717735, 472078, -426683, 1723600, -1803090, 1910376, -1667432, -1104333, -260646, -3833893, -2939036, -2235985, -420899, -2286327, 183443, -976891, 1612842, -3545687, -554416, 3919660, -48306, -1362209, 3937738, 1400424, -846154, 1976782};

    /* JADX INFO: renamed from: g */
    public static final int[] f8693g = {R.attr.colorPrimary};

    /* JADX INFO: renamed from: h */
    public static final int[] f8694h = {R.attr.colorPrimaryVariant};

    /* JADX INFO: renamed from: i */
    public static Field f8695i = null;

    /* JADX INFO: renamed from: j */
    public static boolean f8696j = false;

    /* JADX INFO: renamed from: k */
    public static boolean f8697k = true;

    /* JADX INFO: renamed from: A */
    public static void m5135A(Context context, int[] iArr, String str) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i)) {
                typedArrayObtainStyledAttributes.recycle();
                f40.m2713i(jd0.m3615m("The style on this component requires your app theme to be ", str, " (or a descendant)."));
                return;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 3, list:
  (r0v0 int) from 0x0007: SWITCH (r0v0 int)
 case -1811142716: goto B:118:0x0130
 case -1811142715: goto B:113:0x0123
 case -1811142714: goto B:108:0x0116
 case -1811142713: goto B:103:0x0109
 case -1811142712: goto B:98:0x00fc
 case -1811142711: goto B:93:0x00ef
 case -1811142710: goto B:88:0x00e2
 case -1811142709: goto B:83:0x00d5
 case -1811142708: goto B:78:0x00c8
 case -1811142707: goto B:73:0x00bb
 default: goto B:5:0x000a A[RegionRef:SW:4] (LINE:8)
  (r0v0 int) from 0x000a: SWITCH (r0v0 int)
 case -1811142685: goto B:68:0x00ae
 case -1811142684: goto B:63:0x00a1
 case -1811142683: goto B:58:0x0094
 default: goto B:6:0x000d A[RegionRef:SW:5] (LINE:11)
  (r0v0 int) from 0x000d: SWITCH (r0v0 int)
 case 80123371: goto B:53:0x0087
 case 80123372: goto B:48:0x007a
 case 80123373: goto B:43:0x006d
 case 80123374: goto B:38:0x0060
 case 80123375: goto B:33:0x0053
 case 80123376: goto B:28:0x0046
 case 80123377: goto B:23:0x0039
 case 80123378: goto B:18:0x002c
 case 80123379: goto B:13:0x001f
 case 80123380: goto B:8:0x0012
 default: goto B:331:? A[RegionRef:SW:6] (LINE:14)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: B */
    public static String m5136B(String str) {
        switch (str) {
            case "kotlin.jvm.internal.DoubleCompanionObject":
                return "kotlin.Double.Companion";
            case "java.lang.Integer":
                return "kotlin.Int";
            case "java.lang.Cloneable":
                return "kotlin.Cloneable";
            case "java.lang.annotation.Annotation":
                return "kotlin.Annotation";
            case "java.lang.Comparable":
                return "kotlin.Comparable";
            case "java.util.Map":
                return "kotlin.collections.Map";
            case "java.util.Set":
                return "kotlin.collections.Set";
            case "double":
                return "kotlin.Double";
            case "kotlin.jvm.internal.ByteCompanionObject":
                return "kotlin.Byte.Companion";
            case "java.lang.CharSequence":
                return "kotlin.CharSequence";
            case "java.util.Collection":
                return "kotlin.collections.Collection";
            case "java.lang.Float":
                return "kotlin.Float";
            case "java.lang.Short":
                return "kotlin.Short";
            case "kotlin.jvm.internal.CharCompanionObject":
                return "kotlin.Char.Companion";
            case "kotlin.jvm.internal.LongCompanionObject":
                return "kotlin.Long.Companion";
            case "java.util.Map$Entry":
                return "kotlin.collections.Map.Entry";
            case "int":
                return "kotlin.Int";
            case "byte":
                return "kotlin.Byte";
            case "char":
                return "kotlin.Char";
            case "long":
                return "kotlin.Long";
            case "boolean":
                return "kotlin.Boolean";
            case "java.util.List":
                return "kotlin.collections.List";
            case "kotlin.jvm.internal.ShortCompanionObject":
                return "kotlin.Short.Companion";
            case "float":
                return "kotlin.Float";
            case "short":
                return "kotlin.Short";
            case "java.lang.Character":
                return "kotlin.Char";
            case "kotlin.jvm.internal.EnumCompanionObject":
                return "kotlin.Enum.Companion";
            case "java.lang.Boolean":
                return "kotlin.Boolean";
            case "java.lang.Byte":
                return "kotlin.Byte";
            case "java.lang.Enum":
                return "kotlin.Enum";
            case "java.lang.Long":
                return "kotlin.Long";
            case "kotlin.jvm.internal.FloatCompanionObject":
                return "kotlin.Float.Companion";
            case "java.util.Iterator":
                return "kotlin.collections.Iterator";
            case "java.util.ListIterator":
                return "kotlin.collections.ListIterator";
            case "kotlin.jvm.internal.StringCompanionObject":
                return "kotlin.String.Companion";
            case "java.lang.Double":
                return "kotlin.Double";
            case "java.lang.Number":
                return "kotlin.Number";
            case "java.lang.Object":
                return "kotlin.Any";
            case "java.lang.String":
                return "kotlin.String";
            case "java.lang.Iterable":
                return "kotlin.collections.Iterable";
            case "kotlin.jvm.internal.BooleanCompanionObject":
                return "kotlin.Boolean.Companion";
            case "java.lang.Throwable":
                return "kotlin.Throwable";
            case "kotlin.jvm.internal.IntCompanionObject":
                return "kotlin.Int.Companion";
            default:
                switch (str) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "kotlin.Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "kotlin.Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "kotlin.Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "kotlin.Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "kotlin.Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "kotlin.Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "kotlin.Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "kotlin.Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "kotlin.Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "kotlin.Function19";
                        }
                        return null;
                    default:
                        switch (str) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "kotlin.Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "kotlin.Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "kotlin.Function22";
                                }
                                return null;
                            default:
                                switch (str) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "kotlin.Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "kotlin.Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "kotlin.Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "kotlin.Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "kotlin.Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "kotlin.Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "kotlin.Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "kotlin.Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "kotlin.Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "kotlin.Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    /* JADX INFO: renamed from: C */
    public static long m5137C(long j) {
        if (j > 500) {
            return 500L;
        }
        return j;
    }

    /* JADX INFO: renamed from: D */
    public static double m5138D(double d, double d2, double d3) {
        if (d2 <= d3) {
            if (d < d2) {
                return d2;
            }
            return d > d3 ? d3 : d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + '.');
    }

    /* JADX INFO: renamed from: E */
    public static float m5139E(float f, float f2, float f3) {
        if (f2 <= f3) {
            if (f < f2) {
                return f2;
            }
            return f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    /* JADX INFO: renamed from: F */
    public static int m5140F(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i < i2) {
                return i2;
            }
            return i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    /* JADX INFO: renamed from: G */
    public static long m5141G(long j) {
        if (j < -4611686018427387903L) {
            return -4611686018427387903L;
        }
        if (j > 4611686018427387903L) {
            return 4611686018427387903L;
        }
        return j;
    }

    /* JADX INFO: renamed from: H */
    public static zv0 m5142H() {
        return ik1.f5060e == null ? new ik1() : new C1363rb(0);
    }

    /* JADX INFO: renamed from: I */
    public static FloatBuffer m5143I(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J */
    public static InterfaceC0579du m5144J(ch0 ch0Var, Object obj, InterfaceC0579du interfaceC0579du) {
        ch0Var.getClass();
        interfaceC0579du.getClass();
        if (ch0Var instanceof AbstractC0018ah) {
            return ((AbstractC0018ah) ch0Var).create(obj, interfaceC0579du);
        }
        InterfaceC1456tu context = interfaceC0579du.getContext();
        return context == k60.f5681a ? new kp0(ch0Var, obj, interfaceC0579du) : new lp0(interfaceC0579du, context, ch0Var, obj);
    }

    /* JADX INFO: renamed from: K */
    public static InterfaceC1382ru m5145K(InterfaceC1382ru interfaceC1382ru, InterfaceC1419su interfaceC1419su) {
        interfaceC1419su.getClass();
        if (hp0.m3214e(interfaceC1382ru.getKey(), interfaceC1419su)) {
            return interfaceC1382ru;
        }
        return null;
    }

    /* JADX INFO: renamed from: L */
    public static C1296pi m5146L(Context context, hv0 hv0Var) throws PackageManager.NameNotFoundException {
        Cursor cursorM4420a;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = (String) hv0Var.f4721b;
        String str2 = (String) hv0Var.f4722c;
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException(AbstractC1308pu.m5339f("No package found for authority: ", str));
        }
        if (!providerInfoResolveContentProvider.packageName.equals(str2)) {
            throw new PackageManager.NameNotFoundException(jd0.m3616n("Found content provider ", str, ", but package was not ", str2));
        }
        Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        C1473ua c1473ua = f8691e;
        Collections.sort(arrayList, c1473ua);
        List listM6429K = (List) hv0Var.f4724e;
        if (listM6429K == null) {
            listM6429K = ua0.m6429K(resources, 0);
        }
        int i = 0;
        loop1: while (true) {
            cursorM4420a = null;
            if (i >= listM6429K.size()) {
                providerInfoResolveContentProvider = null;
                break;
            }
            ArrayList arrayList2 = new ArrayList((Collection) listM6429K.get(i));
            Collections.sort(arrayList2, c1473ua);
            if (arrayList.size() == arrayList2.size()) {
                int i2 = 0;
                while (true) {
                    if (i2 >= arrayList.size()) {
                        break loop1;
                    }
                    if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                        break;
                    }
                    i2++;
                }
            }
            i++;
        }
        if (providerInfoResolveContentProvider == null) {
            return new C1296pi(1, (yd0[]) null);
        }
        String str3 = providerInfoResolveContentProvider.authority;
        ArrayList arrayList3 = new ArrayList();
        Uri uriBuild = new Uri.Builder().scheme(FirebaseAnalytics.Param.CONTENT).authority(str3).build();
        Uri uriBuild2 = new Uri.Builder().scheme(FirebaseAnalytics.Param.CONTENT).authority(str3).appendPath("file").build();
        try {
            cursorM4420a = md0.m4420a(context.getContentResolver(), uriBuild, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{(String) hv0Var.f4723d}, null, null);
            if (cursorM4420a != null && cursorM4420a.getCount() > 0) {
                int columnIndex = cursorM4420a.getColumnIndex("result_code");
                arrayList3 = new ArrayList();
                int columnIndex2 = cursorM4420a.getColumnIndex("_id");
                int columnIndex3 = cursorM4420a.getColumnIndex("file_id");
                int columnIndex4 = cursorM4420a.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursorM4420a.getColumnIndex("font_weight");
                int columnIndex6 = cursorM4420a.getColumnIndex("font_italic");
                while (cursorM4420a.moveToNext()) {
                    arrayList3.add(new yd0(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorM4420a.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorM4420a.getLong(columnIndex3)), columnIndex4 != -1 ? cursorM4420a.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorM4420a.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorM4420a.getInt(columnIndex6) == 1, columnIndex != -1 ? cursorM4420a.getInt(columnIndex) : 0));
                }
            }
            return new C1296pi(0, (yd0[]) arrayList3.toArray(new yd0[0]));
        } finally {
            if (cursorM4420a != null) {
                cursorM4420a.close();
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public static int m5147N(float f) {
        if (f < 1.0f) {
            return -16777216;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f2 = (f + 16.0f) / 116.0f;
        float f3 = f > 8.0f ? f2 * f2 * f2 : f / 903.2963f;
        float f4 = f2 * f2 * f2;
        boolean z = f4 > 0.008856452f;
        float f5 = z ? f4 : ((f2 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f4 = ((f2 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f8689c;
        return AbstractC0539cq.m2112a(f5 * fArr[0], f3 * fArr[1], f4 * fArr[2]);
    }

    /* JADX INFO: renamed from: O */
    public static InterfaceC0579du m5148O(InterfaceC0579du interfaceC0579du) {
        InterfaceC0579du interfaceC0579duIntercepted;
        interfaceC0579du.getClass();
        AbstractC0616eu abstractC0616eu = interfaceC0579du instanceof AbstractC0616eu ? (AbstractC0616eu) interfaceC0579du : null;
        return (abstractC0616eu == null || (interfaceC0579duIntercepted = abstractC0616eu.intercepted()) == null) ? interfaceC0579du : interfaceC0579duIntercepted;
    }

    /* JADX INFO: renamed from: P */
    public static final boolean m5149P(AssertionError assertionError) {
        Logger logger = ga1.f4121a;
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? zv1.m7365E0(message, "getsockname failed", false) : false) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: Q */
    public static boolean m5150Q(int i, Object obj) {
        int arity;
        if (obj instanceof dh0) {
            if (obj instanceof mh0) {
                arity = ((mh0) obj).getArity();
            } else if (obj instanceof mg0) {
                arity = 0;
            } else if (obj instanceof og0) {
                arity = 1;
            } else if (obj instanceof ch0) {
                arity = 2;
            } else if (obj instanceof eh0) {
                arity = 3;
            } else {
                arity = obj instanceof fh0 ? 4 : -1;
            }
            if (arity == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: R */
    public static boolean m5151R(byte b) {
        return b > -65;
    }

    /* JADX INFO: renamed from: S */
    public static boolean m5152S(String str) {
        return str == null || str.isEmpty();
    }

    /* JADX INFO: renamed from: T */
    public static String m5153T(String str, Object... objArr) {
        int iIndexOf;
        String string;
        String strValueOf = String.valueOf(str);
        int i = 0;
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for ".concat(str2), (Throwable) e);
                    StringBuilder sbM5347n = AbstractC1308pu.m5347n("<", str2, " threw ");
                    sbM5347n.append(e.getClass().getName());
                    sbM5347n.append(">");
                    string = sbM5347n.toString();
                }
            }
            objArr[i2] = string;
        }
        StringBuilder sb = new StringBuilder((objArr.length * 16) + strValueOf.length());
        int i3 = 0;
        while (i < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i3)) != -1) {
            sb.append((CharSequence) strValueOf, i3, iIndexOf);
            sb.append(objArr[i]);
            i3 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) strValueOf, i3, strValueOf.length());
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: U */
    public static float m5154U(int i) {
        float f = i / 255.0f;
        return (f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    /* JADX INFO: renamed from: V */
    public static InterfaceC1456tu m5155V(InterfaceC1382ru interfaceC1382ru, InterfaceC1419su interfaceC1419su) {
        interfaceC1419su.getClass();
        return hp0.m3214e(interfaceC1382ru.getKey(), interfaceC1419su) ? k60.f5681a : interfaceC1382ru;
    }

    /* JADX INFO: renamed from: W */
    public static TypedArray m5156W(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m5181n(context, attributeSet, i, i2);
        m5195z(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    /* JADX INFO: renamed from: Z */
    public static void m5157Z(qx1 qx1Var, int i, InterfaceC0578dt interfaceC0578dt) {
        long jMo2823d = qx1Var.mo2823d(i);
        List listMo2824e = qx1Var.mo2824e(jMo2823d);
        if (listMo2824e.isEmpty()) {
            return;
        }
        if (i == qx1Var.mo2825g() - 1) {
            l41.m4046o();
            return;
        }
        long jMo2823d2 = qx1Var.mo2823d(i + 1) - qx1Var.mo2823d(i);
        if (jMo2823d2 > 0) {
            interfaceC0578dt.accept(new C1122mv(listMo2824e, jMo2823d, jMo2823d2));
        }
    }

    /* JADX INFO: renamed from: a */
    public static final ArrayList m5158a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            fd2 fd2Var = (fd2) obj;
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", fd2Var.f3765a);
            bundle.putLong("event_timestamp", fd2Var.f3766b);
            arrayList2.add(bundle);
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: a0 */
    public static void m5159a0(Context context, String str) {
        if (str.equals("")) {
            context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            return;
        }
        try {
            FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
            XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
            try {
                try {
                    try {
                        xmlSerializerNewSerializer.setOutput(fileOutputStreamOpenFileOutput, null);
                        xmlSerializerNewSerializer.startDocument("UTF-8", Boolean.TRUE);
                        xmlSerializerNewSerializer.startTag(null, "locales");
                        xmlSerializerNewSerializer.attribute(null, "application_locales", str);
                        xmlSerializerNewSerializer.endTag(null, "locales");
                        xmlSerializerNewSerializer.endDocument();
                        if (fileOutputStreamOpenFileOutput != null) {
                            fileOutputStreamOpenFileOutput.close();
                        }
                    } catch (Throwable th) {
                        if (fileOutputStreamOpenFileOutput != null) {
                            try {
                                fileOutputStreamOpenFileOutput.close();
                            } catch (IOException unused) {
                            }
                        }
                        throw th;
                    }
                } catch (Exception e) {
                    Log.w("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales: ".concat(str), e);
                    if (fileOutputStreamOpenFileOutput != null) {
                        fileOutputStreamOpenFileOutput.close();
                    }
                }
            } catch (IOException unused2) {
            }
        } catch (FileNotFoundException unused3) {
            Log.w("AppLocalesStorageHelper", "Storing App Locales : FileNotFoundException: Cannot open file androidx.appcompat.app.AppCompatDelegate.application_locales_record_file for writing ");
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m5160b(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws rp0 {
        if (!m5151R(b2)) {
            if ((((b2 + 112) + (b << DerValue.tag_UniversalString)) >> 30) == 0 && !m5151R(b3) && !m5151R(b4)) {
                int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                cArr[i] = (char) ((i2 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                return;
            }
        }
        throw rp0.m5882c();
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0045 A[EXC_TOP_SPLITTER, PHI: r2
  0x0045: PHI (r2v2 java.lang.String) = (r2v0 java.lang.String), (r2v4 java.lang.String) binds: [B:25:0x004e, B:21:0x0043] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX INFO: renamed from: b0 */
    public static String m5161b0(Context context) {
        String attributeValue = "";
        try {
            FileInputStream fileInputStreamOpenFileInput = context.openFileInput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            try {
                try {
                    XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                    xmlPullParserNewPullParser.setInput(fileInputStreamOpenFileInput, "UTF-8");
                    int depth = xmlPullParserNewPullParser.getDepth();
                    while (true) {
                        int next = xmlPullParserNewPullParser.next();
                        if (next != 1 && (next != 3 || xmlPullParserNewPullParser.getDepth() > depth)) {
                            if (next != 3 && next != 4 && xmlPullParserNewPullParser.getName().equals("locales")) {
                                attributeValue = xmlPullParserNewPullParser.getAttributeValue(null, "application_locales");
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (fileInputStreamOpenFileInput != null) {
                        try {
                            fileInputStreamOpenFileInput.close();
                        } catch (IOException unused) {
                        }
                    }
                } catch (Throwable th) {
                    if (fileInputStreamOpenFileInput != null) {
                        try {
                            fileInputStreamOpenFileInput.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (IOException | XmlPullParserException unused3) {
                Log.w("AppLocalesStorageHelper", "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                if (fileInputStreamOpenFileInput != null) {
                    fileInputStreamOpenFileInput.close();
                }
            }
            if (attributeValue.isEmpty()) {
                context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            }
            return attributeValue;
        } catch (FileNotFoundException unused4) {
            Log.w("AppLocalesStorageHelper", "Reading app Locales : Locales record file not found: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            return "";
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m5162c(byte b, byte b2, char[] cArr, int i) throws rp0 {
        if (b < -62 || m5151R(b2)) {
            throw rp0.m5882c();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    /* JADX INFO: renamed from: c0 */
    public static final String m5163c0(Reader reader) {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[PairingConnectionCtx.PeerInfo.MAX_PEER_INFO_SIZE];
        int i = reader.read(cArr);
        while (i >= 0) {
            stringWriter.write(cArr, 0, i);
            i = reader.read(cArr);
        }
        String string = stringWriter.toString();
        string.getClass();
        return string;
    }

    /* JADX INFO: renamed from: d */
    public static void m5164d(byte b, byte b2, byte b3, char[] cArr, int i) throws rp0 {
        if (m5151R(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m5151R(b3)))) {
            throw rp0.m5882c();
        }
        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
    }

    /* JADX INFO: renamed from: e */
    public static String m5165e(int i, int i2, String str) {
        if (i < 0) {
            return m5153T("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return m5153T("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        f40.m2713i(jd0.m3609g(i2, "negative size: "));
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static void m5166f(int i, Object obj) {
        if (obj == null || m5150Q(i, obj)) {
            return;
        }
        ClassCastException classCastException = new ClassCastException(AbstractC1308pu.m5340g(obj.getClass().getName(), " cannot be cast to ", jd0.m3609g(i, "kotlin.jvm.functions.Function")));
        hp0.m3204N(classCastException, p32.class.getName());
        throw classCastException;
    }

    /* JADX INFO: renamed from: g */
    public static void m5167g(int i, int i2) throws ji0 {
        GLES20.glBindTexture(i, i2);
        m5185p();
        GLES20.glTexParameteri(i, 10240, 9729);
        m5185p();
        GLES20.glTexParameteri(i, 10241, 9729);
        m5185p();
        GLES20.glTexParameteri(i, 10242, 33071);
        m5185p();
        GLES20.glTexParameteri(i, 10243, 33071);
        m5185p();
    }

    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 3, list:
  (r0v0 int) from 0x0007: SWITCH (r0v0 int)
 case -1811142716: goto B:118:0x0130
 case -1811142715: goto B:113:0x0123
 case -1811142714: goto B:108:0x0116
 case -1811142713: goto B:103:0x0109
 case -1811142712: goto B:98:0x00fc
 case -1811142711: goto B:93:0x00ef
 case -1811142710: goto B:88:0x00e2
 case -1811142709: goto B:83:0x00d5
 case -1811142708: goto B:78:0x00c8
 case -1811142707: goto B:73:0x00bb
 default: goto B:5:0x000a A[RegionRef:SW:4] (LINE:8)
  (r0v0 int) from 0x000a: SWITCH (r0v0 int)
 case -1811142685: goto B:68:0x00ae
 case -1811142684: goto B:63:0x00a1
 case -1811142683: goto B:58:0x0094
 default: goto B:6:0x000d A[RegionRef:SW:5] (LINE:11)
  (r0v0 int) from 0x000d: SWITCH (r0v0 int)
 case 80123371: goto B:53:0x0087
 case 80123372: goto B:48:0x007a
 case 80123373: goto B:43:0x006d
 case 80123374: goto B:38:0x0060
 case 80123375: goto B:33:0x0053
 case 80123376: goto B:28:0x0046
 case 80123377: goto B:23:0x0039
 case 80123378: goto B:18:0x002c
 case 80123379: goto B:13:0x001f
 case 80123380: goto B:8:0x0012
 default: goto B:313:? A[RegionRef:SW:6] (LINE:14)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: g0 */
    public static String m5168g0(String str) {
        switch (str) {
            case "kotlin.jvm.internal.DoubleCompanionObject":
                return "Companion";
            case "java.lang.Integer":
                return "Int";
            case "java.lang.Cloneable":
                return "Cloneable";
            case "java.lang.annotation.Annotation":
                return "Annotation";
            case "java.lang.Comparable":
                return "Comparable";
            case "java.util.Map":
                return "Map";
            case "java.util.Set":
                return "Set";
            case "double":
                return "Double";
            case "kotlin.jvm.internal.ByteCompanionObject":
                return "Companion";
            case "java.lang.CharSequence":
                return "CharSequence";
            case "java.util.Collection":
                return "Collection";
            case "java.lang.Float":
                return "Float";
            case "java.lang.Short":
                return "Short";
            case "kotlin.jvm.internal.CharCompanionObject":
                return "Companion";
            case "kotlin.jvm.internal.LongCompanionObject":
                return "Companion";
            case "java.util.Map$Entry":
                return "Entry";
            case "int":
                return "Int";
            case "byte":
                return "Byte";
            case "char":
                return "Char";
            case "long":
                return "Long";
            case "boolean":
                return "Boolean";
            case "java.util.List":
                return "List";
            case "kotlin.jvm.internal.ShortCompanionObject":
                return "Companion";
            case "float":
                return "Float";
            case "short":
                return "Short";
            case "java.lang.Character":
                return "Char";
            case "kotlin.jvm.internal.EnumCompanionObject":
                return "Companion";
            case "java.lang.Boolean":
                return "Boolean";
            case "java.lang.Byte":
                return "Byte";
            case "java.lang.Enum":
                return "Enum";
            case "java.lang.Long":
                return "Long";
            case "kotlin.jvm.internal.FloatCompanionObject":
                return "Companion";
            case "java.util.Iterator":
                return "Iterator";
            case "java.util.ListIterator":
                return "ListIterator";
            case "kotlin.jvm.internal.StringCompanionObject":
                return "Companion";
            case "java.lang.Double":
                return "Double";
            case "java.lang.Number":
                return "Number";
            case "java.lang.Object":
                return "Any";
            case "java.lang.String":
                return "String";
            case "java.lang.Iterable":
                return "Iterable";
            case "kotlin.jvm.internal.BooleanCompanionObject":
                return "Companion";
            case "java.lang.Throwable":
                return "Throwable";
            case "kotlin.jvm.internal.IntCompanionObject":
                return "Companion";
            default:
                switch (str) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "Function19";
                        }
                        return null;
                    default:
                        switch (str) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "Function22";
                                }
                                return null;
                            default:
                                switch (str) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    /* JADX INFO: renamed from: h */
    public static long m5169h(long j, long j2, int i) {
        long j3 = j2 & ((j >>> i) ^ j);
        return j ^ (j3 ^ (j3 << i));
    }

    /* JADX INFO: renamed from: h0 */
    public static final C0634fb m5170h0(Socket socket) throws IOException {
        Logger logger = ga1.f4121a;
        socket.getClass();
        zt1 zt1Var = new zt1(socket);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.getClass();
        return new C0634fb(0, zt1Var, new C0634fb(1, outputStream, zt1Var));
    }

    /* JADX INFO: renamed from: i */
    public static void m5171i(String str, int i, boolean z) {
        if (z) {
            return;
        }
        f40.m2713i(m5153T(str, Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: i0 */
    public static final C0671gb m5172i0(Socket socket) throws IOException {
        Logger logger = ga1.f4121a;
        socket.getClass();
        zt1 zt1Var = new zt1(socket);
        InputStream inputStream = socket.getInputStream();
        inputStream.getClass();
        return new C0671gb(0, zt1Var, new C0671gb(1, inputStream, zt1Var));
    }

    /* JADX INFO: renamed from: j */
    public static void m5173j(String str, long j, boolean z) {
        if (z) {
            return;
        }
        f40.m2713i(m5153T(str, Long.valueOf(j)));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    /* JADX INFO: renamed from: j0 */
    public static void m5174j0(qx1 qx1Var, xx1 xx1Var, InterfaceC0578dt interfaceC0578dt) {
        int iMo2822c;
        boolean z;
        long j = xx1Var.f12765b;
        if (j == -9223372036854775807L) {
            iMo2822c = 0;
        } else {
            iMo2822c = qx1Var.mo2822c(j);
            if (iMo2822c == -1) {
                iMo2822c = qx1Var.mo2825g();
            }
            if (iMo2822c > 0 && qx1Var.mo2823d(iMo2822c - 1) == j) {
                iMo2822c--;
            }
        }
        if (j == -9223372036854775807L || iMo2822c >= qx1Var.mo2825g()) {
            z = false;
        } else {
            List listMo2824e = qx1Var.mo2824e(j);
            long jMo2823d = qx1Var.mo2823d(iMo2822c);
            if (listMo2824e.isEmpty()) {
                z = false;
            } else {
                long j2 = xx1Var.f12765b;
                if (j2 < jMo2823d) {
                    interfaceC0578dt.accept(new C1122mv(listMo2824e, j2, jMo2823d - j2));
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        for (int i = iMo2822c; i < qx1Var.mo2825g(); i++) {
            m5157Z(qx1Var, i, interfaceC0578dt);
        }
        if (xx1Var.f12764a) {
            if (z) {
                iMo2822c--;
            }
            for (int i2 = 0; i2 < iMo2822c; i2++) {
                m5157Z(qx1Var, i2, interfaceC0578dt);
            }
            if (z) {
                interfaceC0578dt.accept(new C1122mv(qx1Var.mo2824e(j), qx1Var.mo2823d(iMo2822c), j - qx1Var.mo2823d(iMo2822c)));
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m5175k(boolean z) {
        if (z) {
            return;
        }
        l41.m4049r();
    }

    /* JADX INFO: renamed from: k0 */
    public static C1679zv m5176k0(Object obj) {
        return new C1679zv(obj.getClass().getSimpleName());
    }

    /* JADX INFO: renamed from: l */
    public static void m5177l(boolean z, String str) {
        if (z) {
            return;
        }
        f40.m2713i(str);
    }

    /* JADX INFO: renamed from: l0 */
    public static co0 m5178l0(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new co0(i, i2 - 1, 1);
        }
        co0 co0Var = co0.f1877d;
        return co0.f1877d;
    }

    /* JADX INFO: renamed from: m */
    public static void m5179m(boolean z, String str, Object obj) {
        if (z) {
            return;
        }
        f40.m2713i(m5153T(str, obj));
    }

    /* JADX INFO: renamed from: m0 */
    public static Object m5180m0(ch0 ch0Var, Object obj, InterfaceC0579du interfaceC0579du) {
        ch0Var.getClass();
        interfaceC0579du.getClass();
        InterfaceC1456tu context = interfaceC0579du.getContext();
        Object mp0Var = context == k60.f5681a ? new mp0(interfaceC0579du) : new np0(interfaceC0579du, context);
        m5166f(2, ch0Var);
        return ch0Var.invoke(obj, mp0Var);
    }

    /* JADX INFO: renamed from: n */
    public static void m5181n(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ji1.f5392A, i, i2);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(1, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                m5135A(context, f8694h, "Theme.MaterialComponents");
            }
        }
        m5135A(context, f8693g, "Theme.AppCompat");
    }

    /* JADX INFO: renamed from: n0 */
    public static final void m5182n0(FileOutputStream fileOutputStream, String str, Charset charset) throws IOException {
        charset.getClass();
        if (str.length() < 16384) {
            byte[] bytes = str.getBytes(charset);
            bytes.getClass();
            fileOutputStream.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder charsetEncoderOnUnmappableCharacter = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer charBufferAllocate = CharBuffer.allocate(PairingConnectionCtx.PeerInfo.MAX_PEER_INFO_SIZE);
        charsetEncoderOnUnmappableCharacter.getClass();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(PairingConnectionCtx.PeerInfo.MAX_PEER_INFO_SIZE * ((int) Math.ceil(charsetEncoderOnUnmappableCharacter.maxBytesPerChar())));
        byteBufferAllocate.getClass();
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int iMin = Math.min(8192 - i2, str.length() - i);
            int i3 = i + iMin;
            char[] cArrArray = charBufferAllocate.array();
            cArrArray.getClass();
            str.getChars(i, i3, cArrArray, i2);
            charBufferAllocate.limit(iMin + i2);
            i2 = 1;
            if (!charsetEncoderOnUnmappableCharacter.encode(charBufferAllocate, byteBufferAllocate, i3 == str.length()).isUnderflow()) {
                f40.m2719o("Check failed.");
                return;
            }
            fileOutputStream.write(byteBufferAllocate.array(), 0, byteBufferAllocate.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i2 = 0;
            }
            charBufferAllocate.clear();
            byteBufferAllocate.clear();
            i = i3;
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m5183o(int i, int i2) {
        String strM5153T;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strM5153T = m5153T("%s (%s) must not be negative", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    f40.m2713i(jd0.m3609g(i2, "negative size: "));
                    return;
                }
                strM5153T = m5153T("%s (%s) must be less than size (%s)", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strM5153T);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static float m5184o0() {
        return ((float) Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
    }

    /* JADX INFO: renamed from: p */
    public static void m5185p() throws ji0 {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z) {
                sb.append('\n');
            }
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "error code: 0x" + Integer.toHexString(iGlGetError);
            }
            sb.append("glError: ");
            sb.append(strGluErrorString);
            z = true;
        }
        if (z) {
            throw new ji0(sb.toString());
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m5186q(String str, boolean z) throws ji0 {
        if (!z) {
            throw new ji0(str);
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m5187r(String str, long j) {
        if (j >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j + ") must be >= 0");
    }

    /* JADX INFO: renamed from: s */
    public static void m5188s(Object obj, String str) {
        if (obj != null) {
            return;
        }
        l41.m4051t(str);
    }

    /* JADX INFO: renamed from: t */
    public static void m5189t(int i, int i2) {
        if (i < 0 || i > i2) {
            f40.m2718n(m5165e(i, i2, FirebaseAnalytics.Param.INDEX));
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m5190u(int i, int i2, int i3) {
        String strM5165e;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strM5165e = m5165e(i, i3, "start index");
            } else {
                strM5165e = (i2 < 0 || i2 > i3) ? m5165e(i2, i3, "end index") : m5153T("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strM5165e);
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m5191v(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m5192w(boolean z) {
        if (z) {
            return;
        }
        l41.m4046o();
    }

    /* JADX INFO: renamed from: x */
    public static void m5193x(boolean z, String str) {
        if (z) {
            return;
        }
        f40.m2719o(str);
    }

    /* JADX INFO: renamed from: y */
    public static void m5194y(boolean z, String str, Object obj) {
        if (z) {
            return;
        }
        f40.m2719o(m5153T(str, obj));
    }

    /* JADX INFO: renamed from: z */
    public static void m5195z(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ji1.f5392A, i, i2);
        boolean z = false;
        if (!typedArrayObtainStyledAttributes.getBoolean(2, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2.length != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
            int length = iArr2.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    typedArrayObtainStyledAttributes2.recycle();
                    z = true;
                    break;
                } else {
                    if (typedArrayObtainStyledAttributes2.getResourceId(iArr2[i3], -1) == -1) {
                        typedArrayObtainStyledAttributes2.recycle();
                        break;
                    }
                    i3++;
                }
            }
        } else if (typedArrayObtainStyledAttributes.getResourceId(0, -1) != -1) {
            z = true;
            break;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            return;
        }
        f40.m2713i("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
    }

    /* JADX INFO: renamed from: M */
    public float mo3576M(View view) {
        if (f8697k) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f8697k = false;
            }
        }
        return view.getAlpha();
    }

    /* JADX INFO: renamed from: X */
    public abstract void mo4711X(Throwable th);

    /* JADX INFO: renamed from: Y */
    public abstract void mo4712Y(C0599ed c0599ed);

    /* JADX INFO: renamed from: d0 */
    public abstract boolean mo2118d0(er1 er1Var);

    /* JADX INFO: renamed from: e0 */
    public abstract void mo2119e0(er1 er1Var);

    /* JADX INFO: renamed from: f0 */
    public void mo3577f0(View view, float f) {
        if (f8697k) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                f8697k = false;
            }
        }
        view.setAlpha(f);
    }
}
