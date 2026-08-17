package p000;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.hardware.display.DisplayManager;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Xml;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.example.ssmousepro.injection.TouchPipeline;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.iid.ServiceStarter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ua0 {

    /* JADX INFO: renamed from: a */
    public static volatile u51 f11229a;

    /* JADX INFO: renamed from: b */
    public static volatile u51 f11230b;

    /* JADX INFO: renamed from: c */
    public static volatile u51 f11231c;

    /* JADX INFO: renamed from: d */
    public static volatile u51 f11232d;

    /* JADX INFO: renamed from: e */
    public static volatile u51 f11233e;

    /* JADX INFO: renamed from: f */
    public static final C1332qh f11234f = new C1332qh();

    /* JADX INFO: renamed from: g */
    public static final int[] f11235g = {R.attr.theme, com.sousasantoslogic.sspro.R.attr.theme};

    /* JADX INFO: renamed from: h */
    public static final int[] f11236h = {com.sousasantoslogic.sspro.R.attr.materialThemeOverlay};

    /* JADX INFO: renamed from: i */
    public static final byte[] f11237i = {48, 49, 53, 0};

    /* JADX INFO: renamed from: j */
    public static final byte[] f11238j = {48, 49, 48, 0};

    /* JADX INFO: renamed from: k */
    public static final byte[] f11239k = {48, 48, 57, 0};

    /* JADX INFO: renamed from: l */
    public static final byte[] f11240l = {48, 48, 53, 0};

    /* JADX INFO: renamed from: m */
    public static final byte[] f11241m = {48, 48, 49, 0};

    /* JADX INFO: renamed from: n */
    public static final byte[] f11242n = {48, 48, 49, 0};

    /* JADX INFO: renamed from: o */
    public static final byte[] f11243o = {48, 48, 50, 0};

    /* JADX INFO: renamed from: p */
    public static boolean f11244p;

    /* JADX INFO: renamed from: C */
    public static String m6424C(int i, int i2) {
        String str;
        if (i == 64) {
            str = "[APPLICATION ";
        } else if (i != 128) {
            str = i != 192 ? "[UNIVERSAL " : "[PRIVATE ";
        } else {
            str = "[CONTEXT ";
        }
        return jd0.m3610h(i2, str, "]");
    }

    /* JADX INFO: renamed from: D */
    public static void m6425D(int i, C1639ys c1639ys, ch1 ch1Var, boolean z) {
        C1082ls c1082ls;
        C1082ls c1082ls2;
        boolean z2;
        C1082ls c1082ls3;
        C1082ls c1082ls4;
        if (c1639ys.f13108m) {
            return;
        }
        if (!(c1639ys instanceof C1676zs) && c1639ys.m7144z() && m6447f(c1639ys)) {
            C1676zs.m7336V(c1639ys, ch1Var, new C1332qh());
        }
        C1082ls c1082lsMo6933i = c1639ys.mo6933i(2);
        C1082ls c1082lsMo6933i2 = c1639ys.mo6933i(4);
        int iM4276d = c1082lsMo6933i.m4276d();
        int iM4276d2 = c1082lsMo6933i2.m4276d();
        HashSet<C1082ls> hashSet = c1082lsMo6933i.f6498a;
        if (hashSet != null && c1082lsMo6933i.f6500c) {
            for (C1082ls c1082ls5 : hashSet) {
                C1639ys c1639ys2 = c1082ls5.f6501d;
                int i2 = i + 1;
                boolean zM6447f = m6447f(c1639ys2);
                C1082ls c1082ls6 = c1639ys2.f13066I;
                C1082ls c1082ls7 = c1639ys2.f13068K;
                if (c1639ys2.m7144z() && zM6447f) {
                    z2 = true;
                    C1676zs.m7336V(c1639ys2, ch1Var, new C1332qh());
                } else {
                    z2 = true;
                }
                boolean z3 = ((c1082ls5 == c1082ls6 && (c1082ls4 = c1082ls7.f6503f) != null && c1082ls4.f6500c) || (c1082ls5 == c1082ls7 && (c1082ls3 = c1082ls6.f6503f) != null && c1082ls3.f6500c)) ? z2 : false;
                int i3 = c1639ys2.f13115p0[0];
                if (i3 != 3 || zM6447f) {
                    if (!c1639ys2.m7144z()) {
                        if (c1082ls5 == c1082ls6 && c1082ls7.f6503f == null) {
                            int iM4277e = c1082ls6.m4277e() + iM4276d;
                            c1639ys2.m7117J(iM4277e, c1639ys2.m7135q() + iM4277e);
                            m6425D(i2, c1639ys2, ch1Var, z);
                        } else if (c1082ls5 == c1082ls7 && c1082ls6.f6503f == null) {
                            int iM4277e2 = iM4276d - c1082ls7.m4277e();
                            c1639ys2.m7117J(iM4277e2 - c1639ys2.m7135q(), iM4277e2);
                            m6425D(i2, c1639ys2, ch1Var, z);
                        } else if (z3 && !c1639ys2.m7142x()) {
                            m6434S(i2, c1639ys2, ch1Var, z);
                        }
                    }
                } else if (i3 == 3 && c1639ys2.f13121v >= 0 && c1639ys2.f13120u >= 0 && (c1639ys2.f13097g0 == 8 || (c1639ys2.f13117r == 0 && c1639ys2.f13080W == TouchPipeline.SIZE))) {
                    if (!c1639ys2.m7142x() && !c1639ys2.f13063F && z3 && !c1639ys2.m7142x()) {
                        m6435T(i2, c1639ys, ch1Var, c1639ys2, z);
                    }
                }
            }
        }
        if (c1639ys instanceof xi0) {
            return;
        }
        HashSet<C1082ls> hashSet2 = c1082lsMo6933i2.f6498a;
        if (hashSet2 != null && c1082lsMo6933i2.f6500c) {
            for (C1082ls c1082ls8 : hashSet2) {
                C1639ys c1639ys3 = c1082ls8.f6501d;
                int i4 = i + 1;
                boolean zM6447f2 = m6447f(c1639ys3);
                C1082ls c1082ls9 = c1639ys3.f13066I;
                C1082ls c1082ls10 = c1639ys3.f13068K;
                if (c1639ys3.m7144z() && zM6447f2) {
                    C1676zs.m7336V(c1639ys3, ch1Var, new C1332qh());
                }
                boolean z4 = (c1082ls8 == c1082ls9 && (c1082ls2 = c1082ls10.f6503f) != null && c1082ls2.f6500c) || (c1082ls8 == c1082ls10 && (c1082ls = c1082ls9.f6503f) != null && c1082ls.f6500c);
                int i5 = c1639ys3.f13115p0[0];
                if (i5 != 3 || zM6447f2) {
                    if (!c1639ys3.m7144z()) {
                        if (c1082ls8 == c1082ls9 && c1082ls10.f6503f == null) {
                            int iM4277e3 = c1082ls9.m4277e() + iM4276d2;
                            c1639ys3.m7117J(iM4277e3, c1639ys3.m7135q() + iM4277e3);
                            m6425D(i4, c1639ys3, ch1Var, z);
                        } else if (c1082ls8 == c1082ls10 && c1082ls9.f6503f == null) {
                            int iM4277e4 = iM4276d2 - c1082ls10.m4277e();
                            c1639ys3.m7117J(iM4277e4 - c1639ys3.m7135q(), iM4277e4);
                            m6425D(i4, c1639ys3, ch1Var, z);
                        } else if (z4 && !c1639ys3.m7142x()) {
                            m6434S(i4, c1639ys3, ch1Var, z);
                        }
                    }
                } else if (i5 == 3 && c1639ys3.f13121v >= 0 && c1639ys3.f13120u >= 0) {
                    if (c1639ys3.f13097g0 == 8 || (c1639ys3.f13117r == 0 && c1639ys3.f13080W == TouchPipeline.SIZE)) {
                        if (!c1639ys3.m7142x() && !c1639ys3.f13063F && z4 && !c1639ys3.m7142x()) {
                            m6435T(i4, c1639ys, ch1Var, c1639ys3, z);
                        }
                    }
                }
            }
        }
        c1639ys.f13108m = true;
    }

    /* JADX INFO: renamed from: E */
    public static int m6426E(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        f40.m2713i(jd0.m3609g(i, "type needs to be >= FIRST and <= LAST, type="));
        return 0;
    }

    /* JADX INFO: renamed from: I */
    public static int m6427I(int i, int i2, int i3) {
        return (i & (~i3)) | (i2 & i3);
    }

    /* JADX INFO: renamed from: J */
    public static ud0 m6428J(XmlResourceParser xmlResourceParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            m6433R(xmlResourceParser);
            return null;
        }
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), fi1.f3820b);
        String string = typedArrayObtainAttributes.getString(0);
        String string2 = typedArrayObtainAttributes.getString(4);
        String string3 = typedArrayObtainAttributes.getString(5);
        int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
        int integer = typedArrayObtainAttributes.getInteger(2, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(3, ServiceStarter.ERROR_UNKNOWN);
        String string4 = typedArrayObtainAttributes.getString(6);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlResourceParser.next() != 3) {
                m6433R(xmlResourceParser);
            }
            return new xd0(new hv0(string, string2, string3, m6429K(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlResourceParser.next() != 3) {
            if (xmlResourceParser.getEventType() == 2) {
                if (xmlResourceParser.getName().equals("font")) {
                    TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), fi1.f3821c);
                    int i = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, 400);
                    boolean z = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                    int i2 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                    String string5 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                    int i3 = typedArrayObtainAttributes2.getInt(i2, 0);
                    int i4 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                    int resourceId2 = typedArrayObtainAttributes2.getResourceId(i4, 0);
                    String string6 = typedArrayObtainAttributes2.getString(i4);
                    typedArrayObtainAttributes2.recycle();
                    while (xmlResourceParser.next() != 3) {
                        m6433R(xmlResourceParser);
                    }
                    arrayList.add(new wd0(string6, i, z, string5, i3, resourceId2));
                } else {
                    m6433R(xmlResourceParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new vd0((wd0[]) arrayList.toArray(new wd0[0]));
    }

    /* JADX INFO: renamed from: K */
    public static List m6429K(Resources resources, int i) {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (td0.m6269a(typedArrayObtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    /* JADX INFO: renamed from: M */
    public static int m6430M(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int iM5535e0 = AbstractC1337qm.m5535e0(obj);
        int i2 = iM5535e0 & i;
        int iM6438X = m6438X(i2, obj3);
        if (iM6438X != 0) {
            int i3 = ~i;
            int i4 = iM5535e0 & i3;
            int i5 = -1;
            while (true) {
                int i6 = iM6438X - 1;
                int i7 = iArr[i6];
                if ((i7 & i3) == i4 && hr1.m3275k(obj, objArr[i6]) && (objArr2 == null || hr1.m3275k(obj2, objArr2[i6]))) {
                    int i8 = i7 & i;
                    if (i5 == -1) {
                        m6439Y(i2, i8, obj3);
                        return i6;
                    }
                    iArr[i5] = m6427I(iArr[i5], i8, i);
                    return i6;
                }
                int i9 = i7 & i;
                if (i9 == 0) {
                    break;
                }
                i5 = i6;
                iM6438X = i9;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: N */
    public static n32 m6431N(n32 n32Var, String[] strArr, Map map) {
        int i = 0;
        if (n32Var == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (n32) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                n32 n32Var2 = new n32();
                int length = strArr.length;
                while (i < length) {
                    n32Var2.m4499a((n32) map.get(strArr[i]));
                    i++;
                }
                return n32Var2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                n32Var.m4499a((n32) map.get(strArr[0]));
                return n32Var;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    n32Var.m4499a((n32) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return n32Var;
    }

    /* JADX INFO: renamed from: O */
    public static void m6432O(C0558d8 c0558d8, float f) {
        float f2;
        float f3;
        ym1 ym1Var = (ym1) c0558d8.f2821b;
        CardView cardView = (CardView) c0558d8.f2822c;
        boolean useCompatPadding = cardView.getUseCompatPadding();
        boolean preventCornerOverlap = cardView.getPreventCornerOverlap();
        if (f != ym1Var.f13022e || ym1Var.f13023f != useCompatPadding || ym1Var.f13024g != preventCornerOverlap) {
            ym1Var.f13022e = f;
            ym1Var.f13023f = useCompatPadding;
            ym1Var.f13024g = preventCornerOverlap;
            ym1Var.m7098b(null);
            ym1Var.invalidateSelf();
        }
        if (!cardView.getUseCompatPadding()) {
            c0558d8.m2263L(0, 0, 0, 0);
            return;
        }
        ym1 ym1Var2 = (ym1) c0558d8.f2821b;
        float f4 = ym1Var2.f13022e;
        float f5 = ym1Var2.f13018a;
        if (cardView.getPreventCornerOverlap()) {
            f2 = (float) (((1.0d - zm1.f13491a) * ((double) f5)) + ((double) f4));
        } else {
            int i = zm1.f13492b;
            f2 = f4;
        }
        int iCeil = (int) Math.ceil(f2);
        if (cardView.getPreventCornerOverlap()) {
            f3 = (float) (((1.0d - zm1.f13491a) * ((double) f5)) + ((double) (f4 * 1.5f)));
        } else {
            f3 = f4 * 1.5f;
        }
        int iCeil2 = (int) Math.ceil(f3);
        c0558d8.m2263L(iCeil, iCeil2, iCeil, iCeil2);
    }

    /* JADX INFO: renamed from: R */
    public static void m6433R(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public static void m6434S(int i, C1639ys c1639ys, ch1 ch1Var, boolean z) {
        float f = c1639ys.f13091d0;
        C1082ls c1082ls = c1639ys.f13066I;
        int iM4276d = c1082ls.f6503f.m4276d();
        C1082ls c1082ls2 = c1639ys.f13068K;
        int iM4276d2 = c1082ls2.f6503f.m4276d();
        int iM4277e = c1082ls.m4277e() + iM4276d;
        int iM4277e2 = iM4276d2 - c1082ls2.m4277e();
        if (iM4276d == iM4276d2) {
            f = 0.5f;
        } else {
            iM4276d = iM4277e;
            iM4276d2 = iM4277e2;
        }
        int iM7135q = c1639ys.m7135q();
        int i2 = (iM4276d2 - iM4276d) - iM7135q;
        if (iM4276d > iM4276d2) {
            i2 = (iM4276d - iM4276d2) - iM7135q;
        }
        int i3 = ((int) (i2 > 0 ? (f * i2) + 0.5f : f * i2)) + iM4276d;
        int i4 = i3 + iM7135q;
        if (iM4276d > iM4276d2) {
            i4 = i3 - iM7135q;
        }
        c1639ys.m7117J(i3, i4);
        m6425D(i + 1, c1639ys, ch1Var, z);
    }

    /* JADX INFO: renamed from: T */
    public static void m6435T(int i, C1639ys c1639ys, ch1 ch1Var, C1639ys c1639ys2, boolean z) {
        float f = c1639ys2.f13091d0;
        C1082ls c1082ls = c1639ys2.f13066I;
        int iM4277e = c1082ls.m4277e() + c1082ls.f6503f.m4276d();
        C1082ls c1082ls2 = c1639ys2.f13068K;
        int iM4276d = c1082ls2.f6503f.m4276d() - c1082ls2.m4277e();
        if (iM4276d >= iM4277e) {
            int iM7135q = c1639ys2.m7135q();
            if (c1639ys2.f13097g0 != 8) {
                int i2 = c1639ys2.f13117r;
                if (i2 == 2) {
                    iM7135q = (int) (c1639ys2.f13091d0 * 0.5f * (c1639ys instanceof C1676zs ? c1639ys.m7135q() : c1639ys.f13077T.m7135q()));
                } else if (i2 == 0) {
                    iM7135q = iM4276d - iM4277e;
                }
                iM7135q = Math.max(c1639ys2.f13120u, iM7135q);
                int i3 = c1639ys2.f13121v;
                if (i3 > 0) {
                    iM7135q = Math.min(i3, iM7135q);
                }
            }
            int i4 = iM4277e + ((int) ((f * ((iM4276d - iM4277e) - iM7135q)) + 0.5f));
            c1639ys2.m7117J(i4, iM7135q + i4);
            m6425D(i + 1, c1639ys2, ch1Var, z);
        }
    }

    /* JADX INFO: renamed from: U */
    public static void m6436U(int i, C1639ys c1639ys, ch1 ch1Var) {
        float f = c1639ys.f13093e0;
        C1082ls c1082ls = c1639ys.f13067J;
        int iM4276d = c1082ls.f6503f.m4276d();
        C1082ls c1082ls2 = c1639ys.f13069L;
        int iM4276d2 = c1082ls2.f6503f.m4276d();
        int iM4277e = c1082ls.m4277e() + iM4276d;
        int iM4277e2 = iM4276d2 - c1082ls2.m4277e();
        if (iM4276d == iM4276d2) {
            f = 0.5f;
        } else {
            iM4276d = iM4277e;
            iM4276d2 = iM4277e2;
        }
        int iM7131k = c1639ys.m7131k();
        int i2 = (iM4276d2 - iM4276d) - iM7131k;
        if (iM4276d > iM4276d2) {
            i2 = (iM4276d - iM4276d2) - iM7131k;
        }
        int i3 = (int) (i2 > 0 ? (f * i2) + 0.5f : f * i2);
        int i4 = iM4276d + i3;
        int i5 = i4 + iM7131k;
        if (iM4276d > iM4276d2) {
            i4 = iM4276d - i3;
            i5 = i4 - iM7131k;
        }
        c1639ys.m7118K(i4, i5);
        m6450g0(i + 1, c1639ys, ch1Var);
    }

    /* JADX INFO: renamed from: V */
    public static void m6437V(int i, C1639ys c1639ys, ch1 ch1Var, C1639ys c1639ys2) {
        float f = c1639ys2.f13093e0;
        C1082ls c1082ls = c1639ys2.f13067J;
        int iM4277e = c1082ls.m4277e() + c1082ls.f6503f.m4276d();
        C1082ls c1082ls2 = c1639ys2.f13069L;
        int iM4276d = c1082ls2.f6503f.m4276d() - c1082ls2.m4277e();
        if (iM4276d >= iM4277e) {
            int iM7131k = c1639ys2.m7131k();
            if (c1639ys2.f13097g0 != 8) {
                int i2 = c1639ys2.f13118s;
                if (i2 == 2) {
                    iM7131k = (int) (f * 0.5f * (c1639ys instanceof C1676zs ? c1639ys.m7131k() : c1639ys.f13077T.m7131k()));
                } else if (i2 == 0) {
                    iM7131k = iM4276d - iM4277e;
                }
                iM7131k = Math.max(c1639ys2.f13123x, iM7131k);
                int i3 = c1639ys2.f13124y;
                if (i3 > 0) {
                    iM7131k = Math.min(i3, iM7131k);
                }
            }
            int i4 = iM4277e + ((int) ((f * ((iM4276d - iM4277e) - iM7131k)) + 0.5f));
            c1639ys2.m7118K(i4, iM7131k + i4);
            m6450g0(i + 1, c1639ys2, ch1Var);
        }
    }

    /* JADX INFO: renamed from: X */
    public static int m6438X(int i, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        return obj instanceof short[] ? ((short[]) obj)[i] & 65535 : ((int[]) obj)[i];
    }

    /* JADX INFO: renamed from: Y */
    public static void m6439Y(int i, int i2, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    /* JADX INFO: renamed from: Z */
    public static final void m6440Z(Object obj) {
        if (obj instanceof tl1) {
            throw ((tl1) obj).f10904a;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m6441a(int i, int i2, byte[] bArr) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    /* JADX INFO: renamed from: a0 */
    public static String m6442a0(int i) {
        Object[] objArr = {Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Double.valueOf(((double) Color.alpha(i)) / 255.0d)};
        int i2 = z42.f13274a;
        return String.format(Locale.US, "rgba(%d,%d,%d,%.3f)", objArr);
    }

    /* JADX INFO: renamed from: b */
    public static int m6443b(int i, byte[] bArr) {
        int i2 = ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
        return ((bArr[i + 3] & 255) << 24) | i2 | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: b0 */
    public static String m6444b0(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (c >= 'A' && c <= 'Z') {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static void m6445c(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        th.getClass();
        th2.getClass();
        if (th != th2) {
            Integer num = yp0.f13047a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = pd1.f8862a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static String m6446c0(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (c >= 'a' && c <= 'z') {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m6447f(C1639ys c1639ys) {
        int[] iArr = c1639ys.f13115p0;
        int i = iArr[0];
        int i2 = iArr[1];
        C1639ys c1639ys2 = c1639ys.f13077T;
        C1676zs c1676zs = c1639ys2 != null ? (C1676zs) c1639ys2 : null;
        if (c1676zs != null) {
            int i3 = c1676zs.f13115p0[0];
        }
        if (c1676zs != null) {
            int i4 = c1676zs.f13115p0[1];
        }
        boolean z = i == 1 || c1639ys.mo6773A() || i == 2 || (i == 3 && c1639ys.f13117r == 0 && c1639ys.f13080W == TouchPipeline.SIZE && c1639ys.m7138t(0)) || (i == 3 && c1639ys.f13117r == 1 && c1639ys.m7139u(0, c1639ys.m7135q()));
        boolean z2 = i2 == 1 || c1639ys.mo6774B() || i2 == 2 || (i2 == 3 && c1639ys.f13118s == 0 && c1639ys.f13080W == TouchPipeline.SIZE && c1639ys.m7138t(1)) || (i2 == 3 && c1639ys.f13118s == 1 && c1639ys.m7139u(1, c1639ys.m7131k()));
        return (c1639ys.f13080W > TouchPipeline.SIZE && (z || z2)) || (z && z2);
    }

    /* JADX INFO: renamed from: f0 */
    public static void m6448f0(boolean z, String str, Object obj) {
        if (!z) {
            throw new C0656fx(p32.m5153T(str, obj));
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m6449g(C0827kg c0827kg) {
        String str;
        int i = c0827kg.f5792b;
        if (i == 128) {
            return;
        }
        if (i == 64) {
            str = "APPLICATION";
        } else if (i != 128) {
            str = i != 192 ? "UNIVERSAL" : "PRIVATE";
        } else {
            str = "CONTEXT";
        }
        f40.m2719o(jd0.m3616n("Expected ", "CONTEXT", " tag but found ", str));
    }

    /* JADX INFO: renamed from: g0 */
    public static void m6450g0(int i, C1639ys c1639ys, ch1 ch1Var) {
        boolean z;
        C1082ls c1082ls;
        C1082ls c1082ls2;
        C1082ls c1082ls3;
        C1082ls c1082ls4;
        if (c1639ys.f13110n) {
            return;
        }
        if (!(c1639ys instanceof C1676zs) && c1639ys.m7144z() && m6447f(c1639ys)) {
            C1676zs.m7336V(c1639ys, ch1Var, new C1332qh());
        }
        C1082ls c1082lsMo6933i = c1639ys.mo6933i(3);
        C1082ls c1082lsMo6933i2 = c1639ys.mo6933i(5);
        int iM4276d = c1082lsMo6933i.m4276d();
        int iM4276d2 = c1082lsMo6933i2.m4276d();
        HashSet<C1082ls> hashSet = c1082lsMo6933i.f6498a;
        if (hashSet != null && c1082lsMo6933i.f6500c) {
            for (C1082ls c1082ls5 : hashSet) {
                C1639ys c1639ys2 = c1082ls5.f6501d;
                int i2 = i + 1;
                boolean zM6447f = m6447f(c1639ys2);
                C1082ls c1082ls6 = c1639ys2.f13067J;
                C1082ls c1082ls7 = c1639ys2.f13069L;
                if (c1639ys2.m7144z() && zM6447f) {
                    C1676zs.m7336V(c1639ys2, ch1Var, new C1332qh());
                }
                boolean z2 = (c1082ls5 == c1082ls6 && (c1082ls4 = c1082ls7.f6503f) != null && c1082ls4.f6500c) || (c1082ls5 == c1082ls7 && (c1082ls3 = c1082ls6.f6503f) != null && c1082ls3.f6500c);
                int i3 = c1639ys2.f13115p0[1];
                if (i3 != 3 || zM6447f) {
                    if (!c1639ys2.m7144z()) {
                        if (c1082ls5 == c1082ls6 && c1082ls7.f6503f == null) {
                            int iM4277e = c1082ls6.m4277e() + iM4276d;
                            c1639ys2.m7118K(iM4277e, c1639ys2.m7131k() + iM4277e);
                            m6450g0(i2, c1639ys2, ch1Var);
                        } else if (c1082ls5 == c1082ls7 && c1082ls6.f6503f == null) {
                            int iM4277e2 = iM4276d - c1082ls7.m4277e();
                            c1639ys2.m7118K(iM4277e2 - c1639ys2.m7131k(), iM4277e2);
                            m6450g0(i2, c1639ys2, ch1Var);
                        } else if (z2 && !c1639ys2.m7143y()) {
                            m6436U(i2, c1639ys2, ch1Var);
                        }
                    }
                } else if (i3 == 3 && c1639ys2.f13124y >= 0 && c1639ys2.f13123x >= 0 && (c1639ys2.f13097g0 == 8 || (c1639ys2.f13118s == 0 && c1639ys2.f13080W == TouchPipeline.SIZE))) {
                    if (!c1639ys2.m7143y() && !c1639ys2.f13063F && z2 && !c1639ys2.m7143y()) {
                        m6437V(i2, c1639ys, ch1Var, c1639ys2);
                    }
                }
            }
        }
        boolean z3 = true;
        z3 = true;
        z3 = true;
        if (c1639ys instanceof xi0) {
            return;
        }
        HashSet<C1082ls> hashSet2 = c1082lsMo6933i2.f6498a;
        if (hashSet2 != null && c1082lsMo6933i2.f6500c) {
            for (C1082ls c1082ls8 : hashSet2) {
                C1639ys c1639ys3 = c1082ls8.f6501d;
                int i4 = i + 1;
                boolean zM6447f2 = m6447f(c1639ys3);
                C1082ls c1082ls9 = c1639ys3.f13067J;
                C1082ls c1082ls10 = c1639ys3.f13069L;
                if (c1639ys3.m7144z() && zM6447f2) {
                    C1676zs.m7336V(c1639ys3, ch1Var, new C1332qh());
                }
                boolean z4 = (c1082ls8 == c1082ls9 && (c1082ls2 = c1082ls10.f6503f) != null && c1082ls2.f6500c) || (c1082ls8 == c1082ls10 && (c1082ls = c1082ls9.f6503f) != null && c1082ls.f6500c);
                int i5 = c1639ys3.f13115p0[1];
                if (i5 != 3 || zM6447f2) {
                    if (!c1639ys3.m7144z()) {
                        if (c1082ls8 == c1082ls9 && c1082ls10.f6503f == null) {
                            int iM4277e3 = c1082ls9.m4277e() + iM4276d2;
                            c1639ys3.m7118K(iM4277e3, c1639ys3.m7131k() + iM4277e3);
                            m6450g0(i4, c1639ys3, ch1Var);
                        } else if (c1082ls8 == c1082ls10 && c1082ls9.f6503f == null) {
                            int iM4277e4 = iM4276d2 - c1082ls10.m4277e();
                            c1639ys3.m7118K(iM4277e4 - c1639ys3.m7131k(), iM4277e4);
                            m6450g0(i4, c1639ys3, ch1Var);
                        } else if (z4 && !c1639ys3.m7143y()) {
                            m6436U(i4, c1639ys3, ch1Var);
                        }
                    }
                } else if (i5 == 3 && c1639ys3.f13124y >= 0 && c1639ys3.f13123x >= 0 && (c1639ys3.f13097g0 == 8 || (c1639ys3.f13118s == 0 && c1639ys3.f13080W == TouchPipeline.SIZE))) {
                    if (!c1639ys3.m7143y() && !c1639ys3.f13063F && z4 && !c1639ys3.m7143y()) {
                        m6437V(i4, c1639ys, ch1Var, c1639ys3);
                    }
                }
            }
        }
        C1082ls c1082lsMo6933i3 = c1639ys.mo6933i(6);
        if (c1082lsMo6933i3.f6498a != null && c1082lsMo6933i3.f6500c) {
            int iM4276d3 = c1082lsMo6933i3.m4276d();
            for (C1082ls c1082ls11 : c1082lsMo6933i3.f6498a) {
                C1639ys c1639ys4 = c1082ls11.f6501d;
                int i6 = i + 1;
                boolean zM6447f3 = m6447f(c1639ys4);
                C1082ls c1082ls12 = c1639ys4.f13070M;
                if (c1639ys4.m7144z() && zM6447f3) {
                    C1676zs.m7336V(c1639ys4, ch1Var, new C1332qh());
                }
                if (c1639ys4.f13115p0[z3 ? 1 : 0] != 3 || zM6447f3) {
                    if (!c1639ys4.m7144z()) {
                        if (c1082ls11 == c1082ls12) {
                            int iM4277e5 = c1082ls11.m4277e() + iM4276d3;
                            if (c1639ys4.f13062E) {
                                int i7 = iM4277e5 - c1639ys4.f13085a0;
                                int i8 = c1639ys4.f13079V + i7;
                                c1639ys4.f13083Z = i7;
                                c1639ys4.f13067J.m4284l(i7);
                                c1639ys4.f13069L.m4284l(i8);
                                c1082ls12.m4284l(iM4277e5);
                                z = z3 ? 1 : 0;
                                c1639ys4.f13106l = z;
                            } else {
                                z = z3 ? 1 : 0;
                            }
                            m6450g0(i6, c1639ys4, ch1Var);
                        }
                        z3 = z;
                    }
                }
                z = z3 ? 1 : 0;
                z3 = z;
            }
        }
        c1639ys.f13110n = z3;
    }

    /* JADX INFO: renamed from: h */
    public static final void m6451h(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public static Context m6452h0(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f11236h, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        boolean z = (context instanceof C0543cu) && ((C0543cu) context).f2620a == resourceId;
        if (resourceId == 0 || z) {
            return context;
        }
        C0543cu c0543cu = new C0543cu(context, resourceId);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f11235g);
        int resourceId2 = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = typedArrayObtainStyledAttributes2.getResourceId(1, 0);
        typedArrayObtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            c0543cu.getTheme().applyStyle(resourceId2, true);
        }
        return c0543cu;
    }

    /* JADX INFO: renamed from: i */
    public static float[] m6453i(float[] fArr, int i) {
        if (i < 0) {
            l41.m4049r();
            return null;
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i, length);
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    /* JADX INFO: renamed from: j */
    public static j20 m6454j(int i, C1351r c1351r) {
        r80 rn1Var;
        if (c1351r.m6676p(e71.f3252a)) {
            rn1Var = new nn1();
        } else {
            if (!c1351r.m6676p(e71.f3260i)) {
                l41.m4038g(c1351r, "unrecognized digest OID: ");
                return null;
            }
            rn1Var = new rn1(256);
        }
        return (e71.f3260i.m6676p(c1351r) || rn1Var.mo3528g() != i) ? new k20(i, rn1Var) : rn1Var;
    }

    /* JADX INFO: renamed from: k */
    public static final tl1 m6455k(Throwable th) {
        th.getClass();
        return new tl1(th);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:41:0x0091  */
    /* JADX WARN: Code duplicated, block: B:46:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:67:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:67:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00da A[SYNTHETIC] */
    /* JADX INFO: renamed from: l */
    public static ic1[] m6456l(String str) {
        String strTrim;
        float[] fArrM6453i;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        int i3 = 1;
        while (i3 < str.length()) {
            while (i3 < str.length()) {
                char cCharAt = str.charAt(i3);
                if ((cCharAt - 'Z') * (cCharAt - 'A') > 0) {
                    if ((cCharAt - 'z') * (cCharAt - 'a') > 0) {
                        continue;
                    } else if (cCharAt != 'e' && cCharAt != 'E') {
                        strTrim = str.substring(i2, i3).trim();
                        if (strTrim.length() <= 0) {
                            if (strTrim.charAt(i) != 'z' || strTrim.charAt(i) == 'Z') {
                                fArrM6453i = new float[i];
                            } else {
                                try {
                                    float[] fArr = new float[strTrim.length()];
                                    int length = strTrim.length();
                                    int i4 = i;
                                    int i5 = 1;
                                    while (i5 < length) {
                                        int i6 = i;
                                        int i7 = i6;
                                        int i8 = i7;
                                        int i9 = i8;
                                        for (int i10 = i5; i10 < strTrim.length(); i10++) {
                                            char cCharAt2 = strTrim.charAt(i10);
                                            if (cCharAt2 == ' ') {
                                                i6 = 0;
                                                i8 = 1;
                                            } else if (cCharAt2 != 'E' && cCharAt2 != 'e') {
                                                switch (cCharAt2) {
                                                    case ',':
                                                        i6 = 0;
                                                        i8 = 1;
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                                        if (i10 == i5 || i6 != 0) {
                                                            i6 = 0;
                                                        } else {
                                                            i6 = 0;
                                                            i8 = 1;
                                                            i9 = 1;
                                                        }
                                                        break;
                                                    case '.':
                                                        if (i7 == 0) {
                                                            i6 = 0;
                                                            i7 = 1;
                                                        } else {
                                                            i6 = 0;
                                                            i8 = 1;
                                                            i9 = 1;
                                                        }
                                                        break;
                                                    default:
                                                        i6 = 0;
                                                        break;
                                                }
                                            } else {
                                                i6 = 1;
                                            }
                                            if (i8 != 0) {
                                                if (i5 < i10) {
                                                    fArr[i4] = Float.parseFloat(strTrim.substring(i5, i10));
                                                    i4++;
                                                }
                                                if (i9 != 0) {
                                                    i5 = i10;
                                                } else {
                                                    i5 = i10 + 1;
                                                }
                                                i = 0;
                                            }
                                        }
                                        if (i5 < i10) {
                                            fArr[i4] = Float.parseFloat(strTrim.substring(i5, i10));
                                            i4++;
                                        }
                                        if (i9 != 0) {
                                            i5 = i10;
                                        } else {
                                            i5 = i10 + 1;
                                        }
                                        i = 0;
                                    }
                                    fArrM6453i = m6453i(fArr, i4);
                                    i = 0;
                                } catch (NumberFormatException e) {
                                    l41.m4043l(jd0.m3615m("error in parsing \"", strTrim, "\""), e);
                                    return null;
                                }
                            }
                            char cCharAt3 = strTrim.charAt(i);
                            ic1 ic1Var = new ic1();
                            ic1Var.f4935a = cCharAt3;
                            ic1Var.f4936b = fArrM6453i;
                            arrayList.add(ic1Var);
                        }
                        i2 = i3;
                        i3++;
                        i = 0;
                    }
                } else if (cCharAt != 'e') {
                    continue;
                }
                i3++;
            }
            strTrim = str.substring(i2, i3).trim();
            if (strTrim.length() <= 0) {
                if (strTrim.charAt(i) != 'z') {
                    fArrM6453i = new float[i];
                } else {
                    fArrM6453i = new float[i];
                }
                char cCharAt4 = strTrim.charAt(i);
                ic1 ic1Var2 = new ic1();
                ic1Var2.f4935a = cCharAt4;
                ic1Var2.f4936b = fArrM6453i;
                arrayList.add(ic1Var2);
            }
            i2 = i3;
            i3++;
            i = 0;
        }
        if (i3 - i2 == 1 && i2 < str.length()) {
            char cCharAt5 = str.charAt(i2);
            ic1 ic1Var3 = new ic1();
            ic1Var3.f4935a = cCharAt5;
            ic1Var3.f4936b = new float[0];
            arrayList.add(ic1Var3);
        }
        return (ic1[]) arrayList.toArray(new ic1[arrayList.size()]);
    }

    /* JADX INFO: renamed from: m */
    public static Object m6457m(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            f40.m2713i(jd0.m3609g(i, "must be power of 2 between 2^1 and 2^30: "));
            return null;
        }
        if (i <= 256) {
            return new byte[i];
        }
        return i <= 65536 ? new short[i] : new int[i];
    }

    /* JADX INFO: renamed from: n */
    public static ic1[] m6458n(ic1[] ic1VarArr) {
        if (ic1VarArr == null) {
            return null;
        }
        ic1[] ic1VarArr2 = new ic1[ic1VarArr.length];
        for (int i = 0; i < ic1VarArr.length; i++) {
            ic1 ic1Var = ic1VarArr[i];
            ic1 ic1Var2 = new ic1();
            ic1Var2.f4935a = ic1Var.f4935a;
            float[] fArr = ic1Var.f4936b;
            ic1Var2.f4936b = m6453i(fArr, fArr.length);
            ic1VarArr2[i] = ic1Var2;
        }
        return ic1VarArr2;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m6459o(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display != null && display.isHdr()) {
            for (int i : display.getHdrCapabilities().getSupportedHdrTypes()) {
                if (i == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m6460p(CharSequence charSequence, String str) {
        char c;
        int length = charSequence.length();
        if (charSequence == str) {
            return true;
        }
        if (length == str.length()) {
            for (int i = 0; i < length; i++) {
                char cCharAt = charSequence.charAt(i);
                char cCharAt2 = str.charAt(i);
                if (cCharAt == cCharAt2 || ((c = (char) ((cCharAt | ' ') - 97)) < 26 && c == ((char) ((cCharAt2 | ' ') - 97)))) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public static j20 m6461r(dr0 dr0Var) {
        return m6454j(dr0Var.f2998b, dr0Var.f3002f);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: u */
    public static final Class m6462u(jq0 jq0Var) {
        jq0Var.getClass();
        Class clsMo5862a = ((InterfaceC1375rn) jq0Var).mo5862a();
        if (clsMo5862a.isPrimitive()) {
            String name = clsMo5862a.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return clsMo5862a;
    }

    /* JADX INFO: renamed from: z */
    public static final int m6463z(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i < i2) {
                int i4 = i2 % i3;
                if (i4 < 0) {
                    i4 += i3;
                }
                int i5 = i % i3;
                if (i5 < 0) {
                    i5 += i3;
                }
                int i6 = (i4 - i5) % i3;
                if (i6 < 0) {
                    i6 += i3;
                }
                return i2 - i6;
            }
        } else {
            if (i3 >= 0) {
                f40.m2713i("Step is zero.");
                return 0;
            }
            if (i > i2) {
                int i7 = -i3;
                int i8 = i % i7;
                if (i8 < 0) {
                    i8 += i7;
                }
                int i9 = i2 % i7;
                if (i9 < 0) {
                    i9 += i7;
                }
                int i10 = (i8 - i9) % i7;
                if (i10 < 0) {
                    i10 += i7;
                }
                return i10 + i2;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: A */
    public abstract String mo6117A();

    /* JADX INFO: renamed from: B */
    public abstract int mo6464B();

    /* JADX INFO: renamed from: F */
    public abstract boolean mo6465F(float f);

    /* JADX INFO: renamed from: G */
    public abstract boolean mo6466G(View view);

    /* JADX INFO: renamed from: H */
    public abstract boolean mo6467H(float f, float f2);

    /* JADX INFO: renamed from: L */
    public abstract void mo6118L();

    /* JADX INFO: renamed from: P */
    public abstract boolean mo6468P(View view, float f);

    /* JADX INFO: renamed from: Q */
    public abstract void mo6119Q();

    /* JADX INFO: renamed from: W */
    public abstract void mo6120W(AbstractC1337qm abstractC1337qm);

    /* JADX INFO: renamed from: d */
    public abstract int mo6469d(ViewGroup.MarginLayoutParams marginLayoutParams);

    /* JADX INFO: renamed from: d0 */
    public abstract void mo6470d0(ViewGroup.MarginLayoutParams marginLayoutParams, int i);

    /* JADX INFO: renamed from: e */
    public abstract float mo6471e(int i);

    /* JADX INFO: renamed from: e0 */
    public abstract void mo6472e0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2);

    /* JADX INFO: renamed from: q */
    public abstract int mo6473q(ViewGroup.MarginLayoutParams marginLayoutParams);

    /* JADX INFO: renamed from: s */
    public abstract int mo6474s();

    /* JADX INFO: renamed from: t */
    public abstract int mo6475t();

    /* JADX INFO: renamed from: v */
    public abstract int mo6476v();

    /* JADX INFO: renamed from: w */
    public abstract int mo6477w();

    /* JADX INFO: renamed from: x */
    public abstract int mo6478x(View view);

    /* JADX INFO: renamed from: y */
    public abstract int mo6479y(CoordinatorLayout coordinatorLayout);
}
