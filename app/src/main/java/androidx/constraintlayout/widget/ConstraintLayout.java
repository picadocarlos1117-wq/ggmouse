package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.example.ssmousepro.injection.InjectionMetrics;
import com.example.ssmousepro.injection.LinuxInputConstants;
import com.example.ssmousepro.injection.TouchPipeline;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC0074at;
import p000.AbstractC1156ns;
import p000.AbstractC1269os;
import p000.C0558d8;
import p000.C0796jm;
import p000.C1174o9;
import p000.C1306ps;
import p000.C1343qs;
import p000.C1553wg;
import p000.C1602xs;
import p000.C1639ys;
import p000.C1676zs;
import p000.ch1;
import p000.di1;
import p000.es1;
import p000.hk0;
import p000.id0;
import p000.l91;
import p000.ok0;
import p000.r92;
import p000.rc2;
import p000.u52;
import p000.wi0;
import p000.xi0;
import p000.xs0;
import p000.yi0;
import p000.z10;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* JADX INFO: renamed from: w */
    public static es1 f561w;

    /* JADX INFO: renamed from: a */
    public final SparseArray f562a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f563b;

    /* JADX INFO: renamed from: c */
    public final C1676zs f564c;

    /* JADX INFO: renamed from: d */
    public int f565d;

    /* JADX INFO: renamed from: e */
    public int f566e;

    /* JADX INFO: renamed from: f */
    public int f567f;

    /* JADX INFO: renamed from: g */
    public int f568g;

    /* JADX INFO: renamed from: m */
    public boolean f569m;

    /* JADX INFO: renamed from: n */
    public int f570n;

    /* JADX INFO: renamed from: o */
    public C1602xs f571o;

    /* JADX INFO: renamed from: p */
    public C0558d8 f572p;

    /* JADX INFO: renamed from: q */
    public int f573q;

    /* JADX INFO: renamed from: r */
    public HashMap f574r;

    /* JADX INFO: renamed from: s */
    public final SparseArray f575s;

    /* JADX INFO: renamed from: t */
    public final ch1 f576t;

    /* JADX INFO: renamed from: u */
    public int f577u;

    /* JADX INFO: renamed from: v */
    public int f578v;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f562a = new SparseArray();
        this.f563b = new ArrayList(4);
        this.f564c = new C1676zs();
        this.f565d = 0;
        this.f566e = 0;
        this.f567f = Integer.MAX_VALUE;
        this.f568g = Integer.MAX_VALUE;
        this.f569m = true;
        this.f570n = 257;
        this.f571o = null;
        this.f572p = null;
        this.f573q = -1;
        this.f574r = new HashMap();
        this.f575s = new SparseArray();
        this.f576t = new ch1(this, this);
        this.f577u = 0;
        this.f578v = 0;
        m285i(attributeSet, 0);
    }

    /* JADX INFO: renamed from: g */
    public static C1306ps m283g() {
        C1306ps c1306ps = new C1306ps(-2, -2);
        c1306ps.f9084a = -1;
        c1306ps.f9086b = -1;
        c1306ps.f9088c = -1.0f;
        c1306ps.f9090d = true;
        c1306ps.f9092e = -1;
        c1306ps.f9094f = -1;
        c1306ps.f9096g = -1;
        c1306ps.f9098h = -1;
        c1306ps.f9100i = -1;
        c1306ps.f9102j = -1;
        c1306ps.f9104k = -1;
        c1306ps.f9106l = -1;
        c1306ps.f9108m = -1;
        c1306ps.f9110n = -1;
        c1306ps.f9112o = -1;
        c1306ps.f9114p = -1;
        c1306ps.f9116q = 0;
        c1306ps.f9117r = TouchPipeline.SIZE;
        c1306ps.f9118s = -1;
        c1306ps.f9119t = -1;
        c1306ps.f9120u = -1;
        c1306ps.f9121v = -1;
        c1306ps.f9122w = Integer.MIN_VALUE;
        c1306ps.f9123x = Integer.MIN_VALUE;
        c1306ps.f9124y = Integer.MIN_VALUE;
        c1306ps.f9125z = Integer.MIN_VALUE;
        c1306ps.f9058A = Integer.MIN_VALUE;
        c1306ps.f9059B = Integer.MIN_VALUE;
        c1306ps.f9060C = Integer.MIN_VALUE;
        c1306ps.f9061D = 0;
        c1306ps.f9062E = 0.5f;
        c1306ps.f9063F = 0.5f;
        c1306ps.f9064G = null;
        c1306ps.f9065H = -1.0f;
        c1306ps.f9066I = -1.0f;
        c1306ps.f9067J = 0;
        c1306ps.f9068K = 0;
        c1306ps.f9069L = 0;
        c1306ps.f9070M = 0;
        c1306ps.f9071N = 0;
        c1306ps.f9072O = 0;
        c1306ps.f9073P = 0;
        c1306ps.f9074Q = 0;
        c1306ps.f9075R = 1.0f;
        c1306ps.f9076S = 1.0f;
        c1306ps.f9077T = -1;
        c1306ps.f9078U = -1;
        c1306ps.f9079V = -1;
        c1306ps.f9080W = false;
        c1306ps.f9081X = false;
        c1306ps.f9082Y = null;
        c1306ps.f9083Z = 0;
        c1306ps.f9085a0 = true;
        c1306ps.f9087b0 = true;
        c1306ps.f9089c0 = false;
        c1306ps.f9091d0 = false;
        c1306ps.f9093e0 = false;
        c1306ps.f9095f0 = -1;
        c1306ps.f9097g0 = -1;
        c1306ps.f9099h0 = -1;
        c1306ps.f9101i0 = -1;
        c1306ps.f9103j0 = Integer.MIN_VALUE;
        c1306ps.f9105k0 = Integer.MIN_VALUE;
        c1306ps.f9107l0 = 0.5f;
        c1306ps.f9115p0 = new C1639ys();
        return c1306ps;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static es1 getSharedValues() {
        if (f561w == null) {
            es1 es1Var = new es1();
            new SparseIntArray();
            new HashMap();
            f561w = es1Var;
        }
        return f561w;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1306ps;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f563b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((AbstractC1156ns) arrayList.get(i)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        int i5 = Integer.parseInt(strArrSplit[2]);
                        int i6 = (int) ((i3 / 1080.0f) * width);
                        int i7 = (int) ((i4 / 1920.0f) * height);
                        int i8 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i6;
                        float f2 = i7;
                        float f3 = i6 + ((int) ((i5 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float f4 = i7 + i8;
                        canvas.drawLine(f3, f2, f3, f4, paint);
                        canvas.drawLine(f3, f4, f, f4, paint);
                        canvas.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, f4, paint);
                        canvas.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f569m = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m283g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C1306ps c1306ps = new C1306ps(context, attributeSet);
        c1306ps.f9084a = -1;
        c1306ps.f9086b = -1;
        c1306ps.f9088c = -1.0f;
        c1306ps.f9090d = true;
        c1306ps.f9092e = -1;
        c1306ps.f9094f = -1;
        c1306ps.f9096g = -1;
        c1306ps.f9098h = -1;
        c1306ps.f9100i = -1;
        c1306ps.f9102j = -1;
        c1306ps.f9104k = -1;
        c1306ps.f9106l = -1;
        c1306ps.f9108m = -1;
        c1306ps.f9110n = -1;
        c1306ps.f9112o = -1;
        c1306ps.f9114p = -1;
        c1306ps.f9116q = 0;
        c1306ps.f9117r = TouchPipeline.SIZE;
        c1306ps.f9118s = -1;
        c1306ps.f9119t = -1;
        c1306ps.f9120u = -1;
        c1306ps.f9121v = -1;
        c1306ps.f9122w = Integer.MIN_VALUE;
        c1306ps.f9123x = Integer.MIN_VALUE;
        c1306ps.f9124y = Integer.MIN_VALUE;
        c1306ps.f9125z = Integer.MIN_VALUE;
        c1306ps.f9058A = Integer.MIN_VALUE;
        c1306ps.f9059B = Integer.MIN_VALUE;
        c1306ps.f9060C = Integer.MIN_VALUE;
        c1306ps.f9061D = 0;
        c1306ps.f9062E = 0.5f;
        c1306ps.f9063F = 0.5f;
        c1306ps.f9064G = null;
        c1306ps.f9065H = -1.0f;
        c1306ps.f9066I = -1.0f;
        c1306ps.f9067J = 0;
        c1306ps.f9068K = 0;
        c1306ps.f9069L = 0;
        c1306ps.f9070M = 0;
        c1306ps.f9071N = 0;
        c1306ps.f9072O = 0;
        c1306ps.f9073P = 0;
        c1306ps.f9074Q = 0;
        c1306ps.f9075R = 1.0f;
        c1306ps.f9076S = 1.0f;
        c1306ps.f9077T = -1;
        c1306ps.f9078U = -1;
        c1306ps.f9079V = -1;
        c1306ps.f9080W = false;
        c1306ps.f9081X = false;
        c1306ps.f9082Y = null;
        c1306ps.f9083Z = 0;
        c1306ps.f9085a0 = true;
        c1306ps.f9087b0 = true;
        c1306ps.f9089c0 = false;
        c1306ps.f9091d0 = false;
        c1306ps.f9093e0 = false;
        c1306ps.f9095f0 = -1;
        c1306ps.f9097g0 = -1;
        c1306ps.f9099h0 = -1;
        c1306ps.f9101i0 = -1;
        c1306ps.f9103j0 = Integer.MIN_VALUE;
        c1306ps.f9105k0 = Integer.MIN_VALUE;
        c1306ps.f9107l0 = 0.5f;
        c1306ps.f9115p0 = new C1639ys();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, di1.f2939b);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            int i2 = AbstractC1269os.f8449a.get(index);
            switch (i2) {
                case 1:
                    c1306ps.f9079V = typedArrayObtainStyledAttributes.getInt(index, c1306ps.f9079V);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, c1306ps.f9114p);
                    c1306ps.f9114p = resourceId;
                    if (resourceId == -1) {
                        c1306ps.f9114p = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 3:
                    c1306ps.f9116q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1306ps.f9116q);
                    break;
                case 4:
                    float f = typedArrayObtainStyledAttributes.getFloat(index, c1306ps.f9117r) % 360.0f;
                    c1306ps.f9117r = f;
                    if (f < TouchPipeline.SIZE) {
                        c1306ps.f9117r = (360.0f - f) % 360.0f;
                    }
                    break;
                case 5:
                    c1306ps.f9084a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1306ps.f9084a);
                    break;
                case 6:
                    c1306ps.f9086b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1306ps.f9086b);
                    break;
                case 7:
                    c1306ps.f9088c = typedArrayObtainStyledAttributes.getFloat(index, c1306ps.f9088c);
                    break;
                case 8:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, c1306ps.f9092e);
                    c1306ps.f9092e = resourceId2;
                    if (resourceId2 == -1) {
                        c1306ps.f9092e = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, c1306ps.f9094f);
                    c1306ps.f9094f = resourceId3;
                    if (resourceId3 == -1) {
                        c1306ps.f9094f = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, c1306ps.f9096g);
                    c1306ps.f9096g = resourceId4;
                    if (resourceId4 == -1) {
                        c1306ps.f9096g = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, c1306ps.f9098h);
                    c1306ps.f9098h = resourceId5;
                    if (resourceId5 == -1) {
                        c1306ps.f9098h = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 12:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, c1306ps.f9100i);
                    c1306ps.f9100i = resourceId6;
                    if (resourceId6 == -1) {
                        c1306ps.f9100i = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, c1306ps.f9102j);
                    c1306ps.f9102j = resourceId7;
                    if (resourceId7 == -1) {
                        c1306ps.f9102j = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 14:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, c1306ps.f9104k);
                    c1306ps.f9104k = resourceId8;
                    if (resourceId8 == -1) {
                        c1306ps.f9104k = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, c1306ps.f9106l);
                    c1306ps.f9106l = resourceId9;
                    if (resourceId9 == -1) {
                        c1306ps.f9106l = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, c1306ps.f9108m);
                    c1306ps.f9108m = resourceId10;
                    if (resourceId10 == -1) {
                        c1306ps.f9108m = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 17:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, c1306ps.f9118s);
                    c1306ps.f9118s = resourceId11;
                    if (resourceId11 == -1) {
                        c1306ps.f9118s = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 18:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, c1306ps.f9119t);
                    c1306ps.f9119t = resourceId12;
                    if (resourceId12 == -1) {
                        c1306ps.f9119t = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 19:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, c1306ps.f9120u);
                    c1306ps.f9120u = resourceId13;
                    if (resourceId13 == -1) {
                        c1306ps.f9120u = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, c1306ps.f9121v);
                    c1306ps.f9121v = resourceId14;
                    if (resourceId14 == -1) {
                        c1306ps.f9121v = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 21:
                    c1306ps.f9122w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1306ps.f9122w);
                    break;
                case 22:
                    c1306ps.f9123x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1306ps.f9123x);
                    break;
                case 23:
                    c1306ps.f9124y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1306ps.f9124y);
                    break;
                case 24:
                    c1306ps.f9125z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1306ps.f9125z);
                    break;
                case 25:
                    c1306ps.f9058A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1306ps.f9058A);
                    break;
                case InjectionMetrics.I_MAX_ACTIVE_REJ /* 26 */:
                    c1306ps.f9059B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1306ps.f9059B);
                    break;
                case InjectionMetrics.I_TAP_ID_EXHAUST /* 27 */:
                    c1306ps.f9080W = typedArrayObtainStyledAttributes.getBoolean(index, c1306ps.f9080W);
                    break;
                case InjectionMetrics.I_AIM_LOOP_TICKS /* 28 */:
                    c1306ps.f9081X = typedArrayObtainStyledAttributes.getBoolean(index, c1306ps.f9081X);
                    break;
                case 29:
                    c1306ps.f9062E = typedArrayObtainStyledAttributes.getFloat(index, c1306ps.f9062E);
                    break;
                case 30:
                    c1306ps.f9063F = typedArrayObtainStyledAttributes.getFloat(index, c1306ps.f9063F);
                    break;
                case InjectionMetrics.I_APPLY_DELTA /* 31 */:
                    int i3 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    c1306ps.f9069L = i3;
                    if (i3 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                    }
                    break;
                case 32:
                    int i4 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    c1306ps.f9070M = i4;
                    if (i4 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                    }
                    break;
                case InjectionMetrics.I_KEY_EVENTS /* 33 */:
                    try {
                        c1306ps.f9071N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1306ps.f9071N);
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c1306ps.f9071N) == -2) {
                            c1306ps.f9071N = -2;
                        }
                    }
                    break;
                case InjectionMetrics.I_TOQUES_ATIVOS /* 34 */:
                    try {
                        c1306ps.f9073P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1306ps.f9073P);
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c1306ps.f9073P) == -2) {
                            c1306ps.f9073P = -2;
                        }
                    }
                    break;
                case InjectionMetrics.SNAPSHOT_LEN /* 35 */:
                    c1306ps.f9075R = Math.max(TouchPipeline.SIZE, typedArrayObtainStyledAttributes.getFloat(index, c1306ps.f9075R));
                    c1306ps.f9069L = 2;
                    break;
                case 36:
                    try {
                        c1306ps.f9072O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1306ps.f9072O);
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c1306ps.f9072O) == -2) {
                            c1306ps.f9072O = -2;
                        }
                    }
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_REFERENCE /* 37 */:
                    try {
                        c1306ps.f9074Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1306ps.f9074Q);
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c1306ps.f9074Q) == -2) {
                            c1306ps.f9074Q = -2;
                        }
                    }
                    break;
                case 38:
                    c1306ps.f9076S = Math.max(TouchPipeline.SIZE, typedArrayObtainStyledAttributes.getFloat(index, c1306ps.f9076S));
                    c1306ps.f9070M = 2;
                    break;
                default:
                    switch (i2) {
                        case 44:
                            C1602xs.m6951h(c1306ps, typedArrayObtainStyledAttributes.getString(index));
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                            c1306ps.f9065H = typedArrayObtainStyledAttributes.getFloat(index, c1306ps.f9065H);
                            break;
                        case 46:
                            c1306ps.f9066I = typedArrayObtainStyledAttributes.getFloat(index, c1306ps.f9066I);
                            break;
                        case LinuxInputConstants.ABS_MT_SLOT /* 47 */:
                            c1306ps.f9067J = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            c1306ps.f9068K = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            c1306ps.f9077T = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1306ps.f9077T);
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                            c1306ps.f9078U = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1306ps.f9078U);
                            break;
                        case 51:
                            c1306ps.f9082Y = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, c1306ps.f9110n);
                            c1306ps.f9110n = resourceId15;
                            if (resourceId15 == -1) {
                                c1306ps.f9110n = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 53:
                            int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, c1306ps.f9112o);
                            c1306ps.f9112o = resourceId16;
                            if (resourceId16 == -1) {
                                c1306ps.f9112o = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case LinuxInputConstants.ABS_MT_POSITION_Y /* 54 */:
                            c1306ps.f9061D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1306ps.f9061D);
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_MAP /* 55 */:
                            c1306ps.f9060C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1306ps.f9060C);
                            break;
                        default:
                            switch (i2) {
                                case 64:
                                    C1602xs.m6950g(c1306ps, typedArrayObtainStyledAttributes, index, 0);
                                    break;
                                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                                    C1602xs.m6950g(c1306ps, typedArrayObtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    c1306ps.f9083Z = typedArrayObtainStyledAttributes.getInt(index, c1306ps.f9083Z);
                                    break;
                                case 67:
                                    c1306ps.f9090d = typedArrayObtainStyledAttributes.getBoolean(index, c1306ps.f9090d);
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        c1306ps.m5314a();
        return c1306ps;
    }

    public int getMaxHeight() {
        return this.f568g;
    }

    public int getMaxWidth() {
        return this.f567f;
    }

    public int getMinHeight() {
        return this.f566e;
    }

    public int getMinWidth() {
        return this.f565d;
    }

    public int getOptimizationLevel() {
        return this.f564c.f13527D0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        C1676zs c1676zs = this.f564c;
        if (c1676zs.f13102j == null) {
            int id2 = getId();
            if (id2 != -1) {
                c1676zs.f13102j = getContext().getResources().getResourceEntryName(id2);
            } else {
                c1676zs.f13102j = "parent";
            }
        }
        if (c1676zs.f13099h0 == null) {
            c1676zs.f13099h0 = c1676zs.f13102j;
        }
        ArrayList arrayList = c1676zs.f13536q0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            C1639ys c1639ys = (C1639ys) obj;
            View view = c1639ys.f13095f0;
            if (view != null) {
                if (c1639ys.f13102j == null && (id = view.getId()) != -1) {
                    c1639ys.f13102j = getContext().getResources().getResourceEntryName(id);
                }
                if (c1639ys.f13099h0 == null) {
                    c1639ys.f13099h0 = c1639ys.f13102j;
                }
            }
        }
        c1676zs.mo7134n(sb);
        return sb.toString();
    }

    /* JADX INFO: renamed from: h */
    public final C1639ys m284h(View view) {
        if (view == this) {
            return this.f564c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof C1306ps) {
            return ((C1306ps) view.getLayoutParams()).f9115p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof C1306ps) {
            return ((C1306ps) view.getLayoutParams()).f9115p0;
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final void m285i(AttributeSet attributeSet, int i) {
        C1676zs c1676zs = this.f564c;
        c1676zs.f13095f0 = this;
        ch1 ch1Var = this.f576t;
        c1676zs.f13540u0 = ch1Var;
        c1676zs.f13538s0.f13227f = ch1Var;
        this.f562a.put(getId(), this);
        this.f571o = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, di1.f2939b, i, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == 16) {
                    this.f565d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f565d);
                } else if (index == 17) {
                    this.f566e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f566e);
                } else if (index == 14) {
                    this.f567f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f567f);
                } else if (index == 15) {
                    this.f568g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f568g);
                } else if (index == 113) {
                    this.f570n = typedArrayObtainStyledAttributes.getInt(index, this.f570n);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            m286j(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f572p = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C1602xs c1602xs = new C1602xs();
                        this.f571o = c1602xs;
                        c1602xs.m6954e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f571o = null;
                    }
                    this.f573q = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        c1676zs.f13527D0 = this.f570n;
        xs0.f12704p = c1676zs.m7341W(UserVerificationMethods.USER_VERIFY_NONE);
    }

    /* JADX INFO: renamed from: j */
    public final void m286j(int i) {
        String str;
        Context context = getContext();
        C0558d8 c0558d8 = new C0558d8((char) 0, 11);
        c0558d8.f2821b = new SparseArray();
        c0558d8.f2822c = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            l91 l91Var = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c0558d8.m2260I(context, xml);
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                l91Var = new l91(context, xml);
                                ((SparseArray) c0558d8.f2821b).put(l91Var.f6278b, l91Var);
                            }
                            break;
                        case 1382829617:
                            str = "StateSet";
                            name.equals(str);
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            name.equals(str);
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                C1343qs c1343qs = new C1343qs(context, xml);
                                if (l91Var != null) {
                                    ((ArrayList) l91Var.f6280d).add(c1343qs);
                                }
                            }
                            break;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
        this.f572p = c0558d8;
    }

    /* JADX WARN: Code duplicated, block: B:160:0x030c  */
    /* JADX WARN: Code duplicated, block: B:162:0x0328  */
    /* JADX WARN: Code duplicated, block: B:164:0x032b  */
    /* JADX WARN: Code duplicated, block: B:168:0x034c  */
    /* JADX WARN: Code duplicated, block: B:176:0x0368  */
    /* JADX WARN: Code duplicated, block: B:402:0x0399 A[SYNTHETIC] */
    /* JADX INFO: renamed from: k */
    public final void m287k(C1676zs c1676zs, int i, int i2, int i3) {
        int iMin;
        int iMax;
        int iMin2;
        int iMax2;
        int i4;
        char c;
        boolean z;
        int i5;
        int i6;
        ArrayList arrayList;
        ch1 ch1Var;
        int i7;
        boolean zM7339T;
        int i8;
        int i9;
        boolean zM4750P;
        ch1 ch1Var2;
        boolean z2;
        boolean z3;
        ch1 ch1Var3;
        boolean z4;
        ok0 ok0Var;
        u52 u52Var;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z5;
        int size;
        int i17;
        int size2;
        int i18;
        r92 r92Var;
        r92 r92Var2;
        int mode = View.MeasureSpec.getMode(i2);
        int size3 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size4 = View.MeasureSpec.getSize(i3);
        int iMax3 = Math.max(0, getPaddingTop());
        int iMax4 = Math.max(0, getPaddingBottom());
        int i19 = iMax3 + iMax4;
        int paddingWidth = getPaddingWidth();
        ch1 ch1Var4 = this.f576t;
        ch1Var4.f1806a = iMax3;
        ch1Var4.f1807b = iMax4;
        ch1Var4.f1808c = paddingWidth;
        ch1Var4.f1809d = i19;
        ch1Var4.f1810e = i2;
        ch1Var4.f1811f = i3;
        int iMax5 = Math.max(0, getPaddingStart());
        int iMax6 = Math.max(0, getPaddingEnd());
        int i20 = 1;
        if (iMax5 <= 0 && iMax6 <= 0) {
            iMax5 = Math.max(0, getPaddingLeft());
        } else if ((getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection()) {
            iMax5 = iMax6;
        }
        int i21 = size3 - paddingWidth;
        int i22 = size4 - i19;
        int i23 = ch1Var4.f1809d;
        int i24 = ch1Var4.f1808c;
        int childCount = getChildCount();
        if (mode == Integer.MIN_VALUE) {
            if (childCount == 0) {
                iMax = Math.max(0, this.f565d);
                iMin = iMax;
            } else {
                iMin = i21;
            }
            i20 = 2;
        } else if (mode == 0) {
            if (childCount == 0) {
                iMax = Math.max(0, this.f565d);
                iMin = iMax;
            } else {
                iMin = 0;
            }
            i20 = 2;
        } else if (mode != 1073741824) {
            iMin = 0;
        } else {
            iMin = Math.min(this.f567f - i24, i21);
            i20 = 1;
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (childCount == 0) {
                iMax2 = Math.max(0, this.f566e);
                iMin2 = iMax2;
            } else {
                iMin2 = i22;
            }
            i4 = 2;
        } else if (mode2 != 0) {
            iMin2 = mode2 != 1073741824 ? 0 : Math.min(this.f568g - i23, i22);
            i4 = 1;
        } else {
            if (childCount == 0) {
                iMax2 = Math.max(0, this.f566e);
                iMin2 = iMax2;
            } else {
                iMin2 = 0;
            }
            i4 = 2;
        }
        int iM7135q = c1676zs.m7135q();
        z10 z10Var = c1676zs.f13538s0;
        int[] iArr = c1676zs.f13060C;
        int i25 = iMin;
        if (i25 == iM7135q && iMin2 == c1676zs.m7131k()) {
            c = 1;
        } else {
            z10Var.f13224c = true;
            c = 1;
        }
        c1676zs.f13082Y = 0;
        c1676zs.f13083Z = 0;
        iArr[0] = this.f567f - i24;
        iArr[c] = this.f568g - i23;
        c1676zs.f13087b0 = 0;
        c1676zs.f13089c0 = 0;
        c1676zs.m7120M(i20);
        c1676zs.m7122O(i25);
        c1676zs.m7121N(i4);
        c1676zs.m7119L(iMin2);
        int i26 = this.f565d - i24;
        if (i26 < 0) {
            c1676zs.f13087b0 = 0;
        } else {
            c1676zs.f13087b0 = i26;
        }
        int i27 = this.f566e - i23;
        if (i27 < 0) {
            c1676zs.f13089c0 = 0;
        } else {
            c1676zs.f13089c0 = i27;
        }
        c1676zs.f13543x0 = iMax5;
        c1676zs.f13544y0 = iMax3;
        C1174o9 c1174o9 = c1676zs.f13537r0;
        C1676zs c1676zs2 = (C1676zs) c1174o9.f7701d;
        ArrayList arrayList2 = (ArrayList) c1174o9.f7699b;
        ch1 ch1Var5 = c1676zs.f13540u0;
        int size5 = c1676zs.f13536q0.size();
        int iM7135q2 = c1676zs.m7135q();
        int iM7131k = c1676zs.m7131k();
        boolean zM5763D = rc2.m5763D(i, 128);
        boolean z6 = zM5763D || rc2.m5763D(i, 64);
        if (z6) {
            int i28 = 0;
            while (true) {
                if (i28 < size5) {
                    boolean z7 = z6;
                    C1639ys c1639ys = (C1639ys) c1676zs.f13536q0.get(i28);
                    i5 = size5;
                    int[] iArr2 = c1639ys.f13115p0;
                    int i29 = i28;
                    boolean z8 = (iArr2[0] == 3) && (iArr2[1] == 3) && c1639ys.f13080W > TouchPipeline.SIZE;
                    if ((c1639ys.m7142x() && z8) || ((c1639ys.m7143y() && z8) || (c1639ys instanceof id0) || c1639ys.m7142x() || c1639ys.m7143y())) {
                        i6 = 1073741824;
                        z = false;
                    } else {
                        i28 = i29 + 1;
                        z6 = z7;
                        size5 = i5;
                    }
                } else {
                    z = z6;
                    i5 = size5;
                    i6 = 1073741824;
                }
            }
        } else {
            z = z6;
            i5 = size5;
            i6 = 1073741824;
        }
        boolean z9 = z & ((mode == i6 && mode2 == i6) || zM5763D);
        if (z9) {
            int iMin3 = Math.min(iArr[0], i21);
            int iMin4 = Math.min(iArr[1], i22);
            int i30 = 1073741824;
            if (mode == 1073741824) {
                if (c1676zs.m7135q() != iMin3) {
                    c1676zs.m7122O(iMin3);
                    z10Var.f13223b = true;
                }
                i30 = 1073741824;
            }
            if (mode2 == i30 && c1676zs.m7131k() != iMin4) {
                c1676zs.m7119L(iMin4);
                z10Var.f13223b = true;
            }
            if (mode == i30 && mode2 == i30) {
                ArrayList arrayList3 = z10Var.f13226e;
                C1676zs c1676zs3 = z10Var.f13222a;
                if (z10Var.f13223b || z10Var.f13224c) {
                    ArrayList arrayList4 = c1676zs3.f13536q0;
                    int size6 = arrayList4.size();
                    int i31 = 0;
                    while (i31 < size6) {
                        Object obj = arrayList4.get(i31);
                        int i32 = i31 + 1;
                        C1639ys c1639ys2 = (C1639ys) obj;
                        c1639ys2.m7129h();
                        c1639ys2.f13084a = false;
                        c1639ys2.f13090d.m4809n();
                        c1639ys2.f13092e.m6388m();
                        arrayList4 = arrayList4;
                        i31 = i32;
                    }
                    c1676zs3.m7129h();
                    i12 = 0;
                    c1676zs3.f13084a = false;
                    c1676zs3.f13090d.m4809n();
                    c1676zs3.f13092e.m6388m();
                    z10Var.f13224c = false;
                } else {
                    i12 = 0;
                }
                z10Var.m7177b(z10Var.f13225d);
                c1676zs3.f13082Y = i12;
                int[] iArr3 = c1676zs3.f13115p0;
                c1676zs3.f13083Z = i12;
                int iM7130j = c1676zs3.m7130j(i12);
                int iM7130j2 = c1676zs3.m7130j(1);
                if (z10Var.f13223b) {
                    z10Var.m7178c();
                }
                int iM7136r = c1676zs3.m7136r();
                ch1Var = ch1Var5;
                int iM7137s = c1676zs3.m7137s();
                arrayList = arrayList2;
                c1676zs3.f13090d.f9852h.mo53d(iM7136r);
                c1676zs3.f13092e.f9852h.mo53d(iM7137s);
                z10Var.m7182g();
                if (iM7130j == 2 || iM7130j2 == 2) {
                    if (zM5763D) {
                        int size7 = arrayList3.size();
                        i13 = iM7137s;
                        int i33 = 0;
                        while (i33 < size7) {
                            Object obj2 = arrayList3.get(i33);
                            i33++;
                            if (!((r92) obj2).mo3004k()) {
                                zM5763D = false;
                                break;
                            }
                        }
                    } else {
                        i13 = iM7137s;
                    }
                    if (zM5763D && iM7130j == 2) {
                        c1676zs3.m7120M(1);
                        c1676zs3.m7122O(z10Var.m7179d(c1676zs3, 0));
                        c1676zs3.f13090d.f9849e.mo53d(c1676zs3.m7135q());
                    }
                    if (zM5763D && iM7130j2 == 2) {
                        i14 = 1;
                        c1676zs3.m7121N(1);
                        c1676zs3.m7119L(z10Var.m7179d(c1676zs3, 1));
                        c1676zs3.f13092e.f9849e.mo53d(c1676zs3.m7131k());
                    }
                    i15 = iArr3[0];
                    if (i15 != i14 || i15 == 4) {
                        int iM7135q3 = c1676zs3.m7135q() + iM7136r;
                        c1676zs3.f13090d.f9853i.mo53d(iM7135q3);
                        c1676zs3.f13090d.f9849e.mo53d(iM7135q3 - iM7136r);
                        z10Var.m7182g();
                        i16 = iArr3[1];
                        if (i16 != 1 || i16 == 4) {
                            int iM7131k2 = c1676zs3.m7131k() + i13;
                            c1676zs3.f13092e.f9853i.mo53d(iM7131k2);
                            c1676zs3.f13092e.f9849e.mo53d(iM7131k2 - i13);
                        }
                        z10Var.m7182g();
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    size = arrayList3.size();
                    i17 = 0;
                    while (i17 < size) {
                        Object obj3 = arrayList3.get(i17);
                        i17++;
                        r92Var2 = (r92) obj3;
                        if (r92Var2.f9846b == c1676zs3 || r92Var2.f9851g) {
                            r92Var2.mo3002e();
                        }
                    }
                    size2 = arrayList3.size();
                    i18 = 0;
                    while (true) {
                        if (i18 < size2) {
                            zM7339T = true;
                            break;
                        }
                        Object obj4 = arrayList3.get(i18);
                        i18++;
                        r92Var = (r92) obj4;
                        if (!z5 || r92Var.f9846b != c1676zs3) {
                            if (r92Var.f9852h.f36j || ((!r92Var.f9853i.f36j && !(r92Var instanceof yi0)) || (!r92Var.f9849e.f36j && !(r92Var instanceof C0796jm) && !(r92Var instanceof yi0)))) {
                                zM7339T = false;
                                break;
                            }
                        }
                    }
                    c1676zs3.m7120M(iM7130j);
                    c1676zs3.m7121N(iM7130j2);
                    i7 = 2;
                    i11 = 1073741824;
                } else {
                    i13 = iM7137s;
                }
                i14 = 1;
                i15 = iArr3[0];
                if (i15 != i14) {
                    int iM7135q4 = c1676zs3.m7135q() + iM7136r;
                    c1676zs3.f13090d.f9853i.mo53d(iM7135q4);
                    c1676zs3.f13090d.f9849e.mo53d(iM7135q4 - iM7136r);
                    z10Var.m7182g();
                    i16 = iArr3[1];
                    if (i16 != 1) {
                        int iM7131k3 = c1676zs3.m7131k() + i13;
                        c1676zs3.f13092e.f9853i.mo53d(iM7131k3);
                        c1676zs3.f13092e.f9849e.mo53d(iM7131k3 - i13);
                    } else {
                        int iM7131k4 = c1676zs3.m7131k() + i13;
                        c1676zs3.f13092e.f9853i.mo53d(iM7131k4);
                        c1676zs3.f13092e.f9849e.mo53d(iM7131k4 - i13);
                    }
                    z10Var.m7182g();
                    z5 = true;
                } else {
                    int iM7135q5 = c1676zs3.m7135q() + iM7136r;
                    c1676zs3.f13090d.f9853i.mo53d(iM7135q5);
                    c1676zs3.f13090d.f9849e.mo53d(iM7135q5 - iM7136r);
                    z10Var.m7182g();
                    i16 = iArr3[1];
                    if (i16 != 1) {
                        int iM7131k5 = c1676zs3.m7131k() + i13;
                        c1676zs3.f13092e.f9853i.mo53d(iM7131k5);
                        c1676zs3.f13092e.f9849e.mo53d(iM7131k5 - i13);
                    } else {
                        int iM7131k6 = c1676zs3.m7131k() + i13;
                        c1676zs3.f13092e.f9853i.mo53d(iM7131k6);
                        c1676zs3.f13092e.f9849e.mo53d(iM7131k6 - i13);
                    }
                    z10Var.m7182g();
                    z5 = true;
                }
                size = arrayList3.size();
                i17 = 0;
                while (i17 < size) {
                    Object obj5 = arrayList3.get(i17);
                    i17++;
                    r92Var2 = (r92) obj5;
                    if (r92Var2.f9846b == c1676zs3) {
                    }
                    r92Var2.mo3002e();
                }
                size2 = arrayList3.size();
                i18 = 0;
                while (true) {
                    if (i18 < size2) {
                        zM7339T = true;
                        break;
                    }
                    Object obj6 = arrayList3.get(i18);
                    i18++;
                    r92Var = (r92) obj6;
                    if (!z5) {
                    }
                    if (r92Var.f9852h.f36j) {
                    }
                    zM7339T = false;
                    break;
                }
                c1676zs3.m7120M(iM7130j);
                c1676zs3.m7121N(iM7130j2);
                i7 = 2;
                i11 = 1073741824;
            } else {
                z9 = z9;
                arrayList = arrayList2;
                ch1Var = ch1Var5;
                C1676zs c1676zs4 = z10Var.f13222a;
                if (z10Var.f13223b) {
                    ArrayList arrayList5 = c1676zs4.f13536q0;
                    int size8 = arrayList5.size();
                    int i34 = 0;
                    while (i34 < size8) {
                        Object obj7 = arrayList5.get(i34);
                        i34++;
                        C1639ys c1639ys3 = (C1639ys) obj7;
                        c1639ys3.m7129h();
                        c1639ys3.f13084a = false;
                        ok0 ok0Var2 = c1639ys3.f13090d;
                        ArrayList arrayList6 = arrayList5;
                        ok0Var2.f9849e.f36j = false;
                        ok0Var2.f9851g = false;
                        ok0Var2.m4809n();
                        u52 u52Var2 = c1639ys3.f13092e;
                        u52Var2.f9849e.f36j = false;
                        u52Var2.f9851g = false;
                        u52Var2.m6388m();
                        arrayList5 = arrayList6;
                    }
                    i10 = 0;
                    c1676zs4.m7129h();
                    c1676zs4.f13084a = false;
                    ok0 ok0Var3 = c1676zs4.f13090d;
                    ok0Var3.f9849e.f36j = false;
                    ok0Var3.f9851g = false;
                    ok0Var3.m4809n();
                    u52 u52Var3 = c1676zs4.f13092e;
                    u52Var3.f9849e.f36j = false;
                    u52Var3.f9851g = false;
                    u52Var3.m6388m();
                    z10Var.m7178c();
                } else {
                    i10 = 0;
                }
                z10Var.m7177b(z10Var.f13225d);
                c1676zs4.f13082Y = i10;
                c1676zs4.f13083Z = i10;
                c1676zs4.f13090d.f9852h.mo53d(i10);
                c1676zs4.f13092e.f9852h.mo53d(i10);
                i11 = 1073741824;
                if (mode == 1073741824) {
                    zM7339T = c1676zs.m7339T(i10, zM5763D);
                    i7 = 1;
                } else {
                    i7 = 0;
                    zM7339T = true;
                }
                if (mode2 == 1073741824) {
                    zM7339T &= c1676zs.m7339T(1, zM5763D);
                    i7++;
                }
            }
            if (zM7339T) {
                c1676zs.mo7123P(mode == i11, mode2 == i11);
            }
        } else {
            z9 = z9;
            arrayList = arrayList2;
            ch1Var = ch1Var5;
            i7 = 0;
            zM7339T = false;
        }
        if (zM7339T && i7 == 2) {
            return;
        }
        int i35 = c1676zs.f13527D0;
        if (i5 > 0) {
            int size9 = c1676zs.f13536q0.size();
            boolean zM7341W = c1676zs.m7341W(64);
            ch1 ch1Var6 = c1676zs.f13540u0;
            for (int i36 = 0; i36 < size9; i36++) {
                C1639ys c1639ys4 = (C1639ys) c1676zs.f13536q0.get(i36);
                if (!(c1639ys4 instanceof xi0) && !(c1639ys4 instanceof C1553wg) && !c1639ys4.f13063F && (!zM7341W || (ok0Var = c1639ys4.f13090d) == null || (u52Var = c1639ys4.f13092e) == null || !ok0Var.f9849e.f36j || !u52Var.f9849e.f36j)) {
                    int iM7130j3 = c1639ys4.m7130j(0);
                    int iM7130j4 = c1639ys4.m7130j(1);
                    boolean z10 = iM7130j3 == 3 && c1639ys4.f13117r != 1 && iM7130j4 == 3 && c1639ys4.f13118s != 1;
                    if (!z10 && c1676zs.m7341W(1) && !(c1639ys4 instanceof id0)) {
                        if (iM7130j3 == 3 && c1639ys4.f13117r == 0 && iM7130j4 != 3 && !c1639ys4.m7142x()) {
                            z10 = true;
                        }
                        if (iM7130j4 == 3 && c1639ys4.f13118s == 0 && iM7130j3 != 3 && !c1639ys4.m7142x()) {
                            z10 = true;
                        }
                        if ((iM7130j3 == 3 || iM7130j4 == 3) && c1639ys4.f13080W > TouchPipeline.SIZE) {
                            z10 = true;
                        }
                    }
                    if (!z10) {
                        c1174o9.m4750P(0, c1639ys4, ch1Var6);
                    }
                }
            }
            ConstraintLayout constraintLayout = (ConstraintLayout) ch1Var6.f1812g;
            int childCount2 = constraintLayout.getChildCount();
            ArrayList arrayList7 = constraintLayout.f563b;
            for (int i37 = 0; i37 < childCount2; i37++) {
                constraintLayout.getChildAt(i37);
            }
            int size10 = arrayList7.size();
            if (size10 > 0) {
                for (int i38 = 0; i38 < size10; i38++) {
                    ((AbstractC1156ns) arrayList7.get(i38)).getClass();
                }
            }
        }
        c1174o9.m4760c0(c1676zs);
        int size11 = arrayList.size();
        if (i5 > 0) {
            c1174o9.m4757Z(c1676zs, 0, iM7135q2, iM7131k);
        }
        if (size11 > 0) {
            int[] iArr4 = c1676zs.f13115p0;
            boolean z11 = iArr4[0] == 2;
            boolean z12 = iArr4[1] == 2;
            int iMax7 = Math.max(c1676zs.m7135q(), c1676zs2.f13087b0);
            int iMax8 = Math.max(c1676zs.m7131k(), c1676zs2.f13089c0);
            int i39 = 0;
            boolean z13 = false;
            while (i39 < size11) {
                ArrayList arrayList8 = arrayList;
                C1639ys c1639ys5 = (C1639ys) arrayList8.get(i39);
                if (c1639ys5 instanceof id0) {
                    int iM7135q6 = c1639ys5.m7135q();
                    int iM7131k7 = c1639ys5.m7131k();
                    z2 = z12;
                    z3 = z11;
                    ch1Var3 = ch1Var;
                    boolean zM4750P2 = z13 | c1174o9.m4750P(1, c1639ys5, ch1Var3);
                    int iM7135q7 = c1639ys5.m7135q();
                    int iM7131k8 = c1639ys5.m7131k();
                    if (iM7135q7 != iM7135q6) {
                        c1639ys5.m7122O(iM7135q7);
                        if (z3 && c1639ys5.m7136r() + c1639ys5.f13078U > iMax7) {
                            iMax7 = Math.max(iMax7, c1639ys5.mo6933i(4).m4277e() + c1639ys5.m7136r() + c1639ys5.f13078U);
                        }
                        z4 = true;
                    } else {
                        z4 = zM4750P2;
                    }
                    if (iM7131k8 != iM7131k7) {
                        c1639ys5.m7119L(iM7131k8);
                        if (z2 && c1639ys5.m7137s() + c1639ys5.f13079V > iMax8) {
                            iMax8 = Math.max(iMax8, c1639ys5.mo6933i(5).m4277e() + c1639ys5.m7137s() + c1639ys5.f13079V);
                        }
                        z4 = true;
                    }
                    z13 = ((id0) c1639ys5).f4984y0 | z4;
                } else {
                    z2 = z12;
                    z3 = z11;
                    ch1Var3 = ch1Var;
                }
                i39++;
                ch1Var = ch1Var3;
                arrayList = arrayList8;
                z11 = z3;
                z12 = z2;
            }
            boolean z14 = z12;
            boolean z15 = z11;
            ArrayList arrayList9 = arrayList;
            int i40 = 0;
            while (true) {
                ch1 ch1Var7 = ch1Var;
                if (i40 >= 2) {
                    break;
                }
                int i41 = 0;
                while (i41 < size11) {
                    C1639ys c1639ys6 = (C1639ys) arrayList9.get(i41);
                    if (((c1639ys6 instanceof hk0) && !(c1639ys6 instanceof id0)) || (c1639ys6 instanceof xi0) || c1639ys6.f13097g0 == 8 || ((z9 && c1639ys6.f13090d.f9849e.f36j && c1639ys6.f13092e.f9849e.f36j) || (c1639ys6 instanceof id0))) {
                        i8 = size11;
                        ch1Var2 = ch1Var7;
                        i9 = i41;
                        zM4750P = z13;
                    } else {
                        int iM7135q8 = c1639ys6.m7135q();
                        int iM7131k9 = c1639ys6.m7131k();
                        i8 = size11;
                        int i42 = c1639ys6.f13085a0;
                        i9 = i41;
                        zM4750P = c1174o9.m4750P(i40 == 1 ? 2 : 1, c1639ys6, ch1Var7) | z13;
                        int iM7135q9 = c1639ys6.m7135q();
                        ch1Var2 = ch1Var7;
                        int iM7131k10 = c1639ys6.m7131k();
                        if (iM7135q9 != iM7135q8) {
                            c1639ys6.m7122O(iM7135q9);
                            if (z15 && c1639ys6.m7136r() + c1639ys6.f13078U > iMax7) {
                                iMax7 = Math.max(iMax7, c1639ys6.mo6933i(4).m4277e() + c1639ys6.m7136r() + c1639ys6.f13078U);
                            }
                            zM4750P = true;
                        }
                        if (iM7131k10 != iM7131k9) {
                            c1639ys6.m7119L(iM7131k10);
                            if (z14 && c1639ys6.m7137s() + c1639ys6.f13079V > iMax8) {
                                iMax8 = Math.max(iMax8, c1639ys6.mo6933i(5).m4277e() + c1639ys6.m7137s() + c1639ys6.f13079V);
                            }
                            zM4750P = true;
                        }
                        if (c1639ys6.f13062E && i42 != c1639ys6.f13085a0) {
                            zM4750P = true;
                        }
                    }
                    z13 = zM4750P;
                    ch1Var7 = ch1Var2;
                    i41 = i9 + 1;
                    size11 = i8;
                }
                int i43 = size11;
                ch1Var = ch1Var7;
                if (!z13) {
                    break;
                }
                i40++;
                c1174o9.m4757Z(c1676zs, i40, iM7135q2, iM7131k);
                size11 = i43;
                z13 = false;
            }
        }
        c1676zs.f13527D0 = i35;
        xs0.f12704p = c1676zs.m7341W(UserVerificationMethods.USER_VERIFY_NONE);
    }

    /* JADX INFO: renamed from: l */
    public final void m288l(C1639ys c1639ys, C1306ps c1306ps, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.f562a.get(i);
        C1639ys c1639ys2 = (C1639ys) sparseArray.get(i);
        if (c1639ys2 == null || view == null || !(view.getLayoutParams() instanceof C1306ps)) {
            return;
        }
        c1306ps.f9089c0 = true;
        if (i2 == 6) {
            C1306ps c1306ps2 = (C1306ps) view.getLayoutParams();
            c1306ps2.f9089c0 = true;
            c1306ps2.f9115p0.f13062E = true;
        }
        c1639ys.mo6933i(6).m4274b(c1639ys2.mo6933i(i2), c1306ps.f9061D, c1306ps.f9060C, true);
        c1639ys.f13062E = true;
        c1639ys.mo6933i(3).m4282j();
        c1639ys.mo6933i(5).m4282j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C1306ps c1306ps = (C1306ps) childAt.getLayoutParams();
            C1639ys c1639ys = c1306ps.f9115p0;
            if (childAt.getVisibility() != 8 || c1306ps.f9091d0 || c1306ps.f9093e0 || zIsInEditMode) {
                int iM7136r = c1639ys.m7136r();
                int iM7137s = c1639ys.m7137s();
                childAt.layout(iM7136r, iM7137s, c1639ys.m7135q() + iM7136r, c1639ys.m7131k() + iM7137s);
            }
        }
        ArrayList arrayList = this.f563b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((AbstractC1156ns) arrayList.get(i6)).getClass();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:128:0x0231  */
    /* JADX WARN: Code duplicated, block: B:167:0x033c  */
    /* JADX WARN: Code duplicated, block: B:169:0x0346  */
    /* JADX WARN: Code duplicated, block: B:172:0x0354  */
    /* JADX WARN: Code duplicated, block: B:179:0x0372  */
    /* JADX WARN: Code duplicated, block: B:181:0x037c  */
    /* JADX WARN: Code duplicated, block: B:182:0x038c  */
    /* JADX WARN: Code duplicated, block: B:184:0x0394  */
    /* JADX WARN: Code duplicated, block: B:189:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:192:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:194:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:195:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:197:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:204:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:206:0x0409  */
    /* JADX WARN: Code duplicated, block: B:208:0x040d  */
    /* JADX WARN: Code duplicated, block: B:209:0x0416  */
    /* JADX WARN: Code duplicated, block: B:211:0x0420  */
    /* JADX WARN: Code duplicated, block: B:214:0x0427  */
    /* JADX WARN: Code duplicated, block: B:217:0x042f  */
    /* JADX WARN: Code duplicated, block: B:290:0x0554  */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        boolean z2;
        C1639ys c1639ys;
        int i4;
        C1639ys c1639ys2;
        int i5;
        int i6;
        int i7;
        C1639ys c1639ys3;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        C1639ys c1639ys4;
        int i14;
        int i15;
        int i16;
        C1639ys c1639ys5;
        C1306ps c1306ps;
        int i17;
        int i18;
        int i19;
        C1639ys c1639ys6;
        int i20;
        float f;
        C1639ys c1639ys7;
        C1639ys c1639ys8;
        int i21;
        C1639ys c1639ys9;
        int i22;
        int i23;
        int i24;
        int i25;
        float fAbs;
        int i26;
        byte b;
        SparseArray sparseArray;
        ArrayList arrayList;
        String str;
        int iM4593f;
        int i27;
        C1639ys c1639ys10;
        ConstraintLayout constraintLayout = this;
        if (constraintLayout.f577u == i) {
            int i28 = constraintLayout.f578v;
        }
        int i29 = 1;
        int i30 = 0;
        if (!constraintLayout.f569m) {
            int childCount = constraintLayout.getChildCount();
            for (int i31 = 0; i31 < childCount; i31++) {
                if (constraintLayout.getChildAt(i31).isLayoutRequested()) {
                    constraintLayout.f569m = true;
                    break;
                }
            }
        }
        constraintLayout.f577u = i;
        constraintLayout.f578v = i2;
        boolean z3 = (constraintLayout.getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == constraintLayout.getLayoutDirection();
        C1676zs c1676zs = constraintLayout.f564c;
        c1676zs.f13541v0 = z3;
        if (constraintLayout.f569m) {
            constraintLayout.f569m = false;
            int childCount2 = constraintLayout.getChildCount();
            int i32 = 0;
            while (true) {
                if (i32 >= childCount2) {
                    z = false;
                    break;
                } else {
                    if (constraintLayout.getChildAt(i32).isLayoutRequested()) {
                        z = true;
                        break;
                    }
                    i32++;
                }
            }
            if (z) {
                boolean zIsInEditMode = constraintLayout.isInEditMode();
                int childCount3 = constraintLayout.getChildCount();
                for (int i33 = 0; i33 < childCount3; i33++) {
                    C1639ys c1639ysM284h = constraintLayout.m284h(constraintLayout.getChildAt(i33));
                    if (c1639ysM284h != null) {
                        c1639ysM284h.mo7112C();
                    }
                }
                SparseArray sparseArray2 = constraintLayout.f562a;
                if (zIsInEditMode) {
                    int i34 = 0;
                    while (i34 < childCount3) {
                        View childAt = constraintLayout.getChildAt(i34);
                        try {
                            String resourceName = constraintLayout.getResources().getResourceName(childAt.getId());
                            Integer numValueOf = Integer.valueOf(childAt.getId());
                            if (resourceName != null) {
                                i27 = i29;
                                try {
                                    if (constraintLayout.f574r == null) {
                                        constraintLayout.f574r = new HashMap();
                                    }
                                    int iIndexOf = resourceName.indexOf("/");
                                    constraintLayout.f574r.put(iIndexOf != -1 ? resourceName.substring(iIndexOf + 1) : resourceName, numValueOf);
                                } catch (Resources.NotFoundException unused) {
                                }
                            } else {
                                i27 = i29;
                            }
                            int iIndexOf2 = resourceName.indexOf(47);
                            if (iIndexOf2 != -1) {
                                resourceName = resourceName.substring(iIndexOf2 + 1);
                            }
                            int id = childAt.getId();
                            if (id != 0) {
                                View viewFindViewById = (View) sparseArray2.get(id);
                                if (viewFindViewById == null && (viewFindViewById = constraintLayout.findViewById(id)) != null && viewFindViewById != constraintLayout && viewFindViewById.getParent() == constraintLayout) {
                                    constraintLayout.onViewAdded(viewFindViewById);
                                }
                                c1639ys10 = viewFindViewById == constraintLayout ? c1676zs : viewFindViewById == null ? null : ((C1306ps) viewFindViewById.getLayoutParams()).f9115p0;
                            }
                            c1639ys10.f13099h0 = resourceName;
                        } catch (Resources.NotFoundException unused2) {
                            i27 = i29;
                        }
                        i34++;
                        i29 = i27;
                    }
                }
                int i35 = i29;
                if (constraintLayout.f573q != -1) {
                    for (int i36 = 0; i36 < childCount3; i36++) {
                        constraintLayout.getChildAt(i36).getId();
                    }
                }
                C1602xs c1602xs = constraintLayout.f571o;
                if (c1602xs != null) {
                    c1602xs.m6952a(constraintLayout);
                }
                c1676zs.f13536q0.clear();
                ArrayList arrayList2 = constraintLayout.f563b;
                int size = arrayList2.size();
                if (size > 0) {
                    int i37 = 0;
                    while (i37 < size) {
                        AbstractC1156ns abstractC1156ns = (AbstractC1156ns) arrayList2.get(i37);
                        HashMap map = abstractC1156ns.f7530g;
                        if (abstractC1156ns.isInEditMode()) {
                            abstractC1156ns.setIds(abstractC1156ns.f7528e);
                        }
                        hk0 hk0Var = abstractC1156ns.f7527d;
                        if (hk0Var == null) {
                            sparseArray = sparseArray2;
                            arrayList = arrayList2;
                        } else {
                            hk0Var.f4612r0 = i30;
                            Arrays.fill(hk0Var.f4611q0, (Object) null);
                            int i38 = i30;
                            while (i38 < abstractC1156ns.f7525b) {
                                int i39 = abstractC1156ns.f7524a[i38];
                                View view = (View) sparseArray2.get(i39);
                                if (view == null && (iM4593f = abstractC1156ns.m4593f(constraintLayout, (str = (String) map.get(Integer.valueOf(i39))))) != 0) {
                                    abstractC1156ns.f7524a[i38] = iM4593f;
                                    map.put(Integer.valueOf(iM4593f), str);
                                    view = (View) sparseArray2.get(iM4593f);
                                }
                                View view2 = view;
                                if (view2 != null) {
                                    hk0 hk0Var2 = abstractC1156ns.f7527d;
                                    C1639ys c1639ysM284h2 = constraintLayout.m284h(view2);
                                    hk0Var2.getClass();
                                    if (c1639ysM284h2 != hk0Var2 && c1639ysM284h2 != null) {
                                        int i40 = hk0Var2.f4612r0 + 1;
                                        C1639ys[] c1639ysArr = hk0Var2.f4611q0;
                                        if (i40 > c1639ysArr.length) {
                                            hk0Var2.f4611q0 = (C1639ys[]) Arrays.copyOf(c1639ysArr, c1639ysArr.length * 2);
                                        }
                                        C1639ys[] c1639ysArr2 = hk0Var2.f4611q0;
                                        int i41 = hk0Var2.f4612r0;
                                        c1639ysArr2[i41] = c1639ysM284h2;
                                        hk0Var2.f4612r0 = i41 + 1;
                                    }
                                }
                                i38++;
                                sparseArray2 = sparseArray2;
                                arrayList2 = arrayList2;
                            }
                            sparseArray = sparseArray2;
                            arrayList = arrayList2;
                            abstractC1156ns.f7527d.mo3175S();
                        }
                        i37++;
                        sparseArray2 = sparseArray;
                        arrayList2 = arrayList;
                        i30 = 0;
                    }
                }
                int i42 = 2;
                for (int i43 = 0; i43 < childCount3; i43++) {
                    constraintLayout.getChildAt(i43);
                }
                SparseArray sparseArray3 = constraintLayout.f575s;
                sparseArray3.clear();
                sparseArray3.put(0, c1676zs);
                sparseArray3.put(constraintLayout.getId(), c1676zs);
                for (int i44 = 0; i44 < childCount3; i44++) {
                    View childAt2 = constraintLayout.getChildAt(i44);
                    sparseArray3.put(childAt2.getId(), constraintLayout.m284h(childAt2));
                }
                int i45 = 0;
                while (i45 < childCount3) {
                    View childAt3 = constraintLayout.getChildAt(i45);
                    C1639ys c1639ysM284h3 = constraintLayout.m284h(childAt3);
                    if (c1639ysM284h3 == null) {
                        i3 = i45;
                        z2 = z;
                        i23 = i42;
                    } else {
                        C1306ps c1306ps2 = (C1306ps) childAt3.getLayoutParams();
                        c1676zs.f13536q0.add(c1639ysM284h3);
                        C1639ys c1639ys11 = c1639ysM284h3.f13077T;
                        if (c1639ys11 != null) {
                            ((C1676zs) c1639ys11).f13536q0.remove(c1639ysM284h3);
                            c1639ysM284h3.mo7112C();
                        }
                        c1639ysM284h3.f13077T = c1676zs;
                        c1306ps2.m5314a();
                        c1639ysM284h3.f13097g0 = childAt3.getVisibility();
                        c1639ysM284h3.f13095f0 = childAt3;
                        if (childAt3 instanceof AbstractC1156ns) {
                            ((AbstractC1156ns) childAt3).mo281h(c1639ysM284h3, c1676zs.f13541v0);
                        }
                        if (c1306ps2.f9091d0) {
                            xi0 xi0Var = (xi0) c1639ysM284h3;
                            int i46 = c1306ps2.f9109m0;
                            int i47 = c1306ps2.f9111n0;
                            float f2 = c1306ps2.f9113o0;
                            if (f2 == -1.0f) {
                                b = -1;
                                if (i46 != -1) {
                                    if (i46 > -1) {
                                        xi0Var.f12609q0 = -1.0f;
                                        xi0Var.f12610r0 = i46;
                                        xi0Var.f12611s0 = -1;
                                    }
                                } else if (i47 != -1 && i47 > -1) {
                                    xi0Var.f12609q0 = -1.0f;
                                    xi0Var.f12610r0 = -1;
                                    xi0Var.f12611s0 = i47;
                                    i3 = i45;
                                    z2 = z;
                                    i23 = i42;
                                }
                                i3 = i45;
                                z2 = z;
                                i23 = i42;
                            } else if (f2 > -1.0f) {
                                xi0Var.f12609q0 = f2;
                                b = -1;
                                xi0Var.f12610r0 = -1;
                                xi0Var.f12611s0 = -1;
                                i3 = i45;
                                z2 = z;
                                i23 = i42;
                            } else {
                                i3 = i45;
                                z2 = z;
                                i23 = i42;
                            }
                        } else {
                            int i48 = c1306ps2.f9095f0;
                            int i49 = c1306ps2.f9097g0;
                            int i50 = c1306ps2.f9099h0;
                            int i51 = c1306ps2.f9101i0;
                            int i52 = c1306ps2.f9103j0;
                            int i53 = c1306ps2.f9105k0;
                            i3 = i45;
                            float f3 = c1306ps2.f9107l0;
                            int i54 = c1306ps2.f9114p;
                            z2 = z;
                            if (i54 != -1) {
                                C1639ys c1639ys12 = (C1639ys) sparseArray3.get(i54);
                                if (c1639ys12 != null) {
                                    float f4 = c1306ps2.f9117r;
                                    c1639ysM284h3.m7140v(7, 7, c1306ps2.f9116q, 0, c1639ys12);
                                    c1639ysM284h3.f13061D = f4;
                                }
                                constraintLayout = this;
                                c1639ys6 = c1639ysM284h3;
                                c1306ps = c1306ps2;
                                i8 = 4;
                                i7 = 2;
                            } else {
                                if (i48 != -1) {
                                    C1639ys c1639ys13 = (C1639ys) sparseArray3.get(i48);
                                    if (c1639ys13 != null) {
                                        c1639ys = c1639ysM284h3;
                                        i4 = 2;
                                        c1639ys.m7140v(2, 2, ((ViewGroup.MarginLayoutParams) c1306ps2).leftMargin, i52, c1639ys13);
                                    } else {
                                        c1639ys = c1639ysM284h3;
                                        i4 = 2;
                                    }
                                } else {
                                    c1639ys = c1639ysM284h3;
                                    i4 = 2;
                                    if (i49 != -1 && (c1639ys2 = (C1639ys) sparseArray3.get(i49)) != null) {
                                        c1639ys.m7140v(2, 4, ((ViewGroup.MarginLayoutParams) c1306ps2).leftMargin, i52, c1639ys2);
                                        i5 = 2;
                                        i6 = 4;
                                    }
                                    if (i50 != -1) {
                                        c1639ys9 = (C1639ys) sparseArray3.get(i50);
                                        if (c1639ys9 != null) {
                                            c1639ys.m7140v(i6, i5, ((ViewGroup.MarginLayoutParams) c1306ps2).rightMargin, i53, c1639ys9);
                                        }
                                        i7 = i5;
                                    } else {
                                        i7 = i5;
                                        if (i51 != -1 && (c1639ys3 = (C1639ys) sparseArray3.get(i51)) != null) {
                                            c1639ys.m7140v(i6, i6, ((ViewGroup.MarginLayoutParams) c1306ps2).rightMargin, i53, c1639ys3);
                                        }
                                    }
                                    i8 = i6;
                                    i9 = c1306ps2.f9100i;
                                    if (i9 != -1) {
                                        c1639ys8 = (C1639ys) sparseArray3.get(i9);
                                        if (c1639ys8 != null) {
                                            i21 = 3;
                                            c1639ys.m7140v(3, 3, ((ViewGroup.MarginLayoutParams) c1306ps2).topMargin, c1306ps2.f9123x, c1639ys8);
                                        } else {
                                            i21 = 3;
                                        }
                                        i12 = i21;
                                        i13 = 5;
                                        i11 = -1;
                                    } else {
                                        i10 = c1306ps2.f9102j;
                                        i11 = -1;
                                        if (i10 != -1 || (c1639ys4 = (C1639ys) sparseArray3.get(i10)) == null) {
                                            i12 = 3;
                                            i13 = 5;
                                        } else {
                                            c1639ys.m7140v(3, 5, ((ViewGroup.MarginLayoutParams) c1306ps2).topMargin, c1306ps2.f9123x, c1639ys4);
                                            i12 = 3;
                                            i13 = 5;
                                        }
                                    }
                                    i14 = c1306ps2.f9104k;
                                    if (i14 != i11) {
                                        c1639ys7 = (C1639ys) sparseArray3.get(i14);
                                        if (c1639ys7 != null) {
                                            int i55 = i12;
                                            c1639ys.m7140v(i13, i55, ((ViewGroup.MarginLayoutParams) c1306ps2).bottomMargin, c1306ps2.f9125z, c1639ys7);
                                            i15 = i55;
                                        } else {
                                            i15 = i12;
                                        }
                                    } else {
                                        i15 = i12;
                                        i16 = c1306ps2.f9106l;
                                        if (i16 != i11 && (c1639ys5 = (C1639ys) sparseArray3.get(i16)) != null) {
                                            c1639ys.m7140v(i13, i13, ((ViewGroup.MarginLayoutParams) c1306ps2).bottomMargin, c1306ps2.f9125z, c1639ys5);
                                        }
                                    }
                                    c1306ps = c1306ps2;
                                    i17 = c1306ps.f9108m;
                                    if (i17 != -1) {
                                        constraintLayout = this;
                                        c1639ys6 = c1639ys;
                                        constraintLayout.m288l(c1639ys6, c1306ps, sparseArray3, i17, 6);
                                    } else {
                                        i18 = c1306ps.f9110n;
                                        if (i18 != -1) {
                                            constraintLayout = this;
                                            c1639ys6 = c1639ys;
                                            constraintLayout.m288l(c1639ys6, c1306ps, sparseArray3, i18, i15);
                                        } else {
                                            i19 = c1306ps.f9112o;
                                            constraintLayout = this;
                                            c1639ys6 = c1639ys;
                                            i20 = i13;
                                            if (i19 != -1) {
                                                constraintLayout.m288l(c1639ys6, c1306ps, sparseArray3, i19, i20);
                                            }
                                        }
                                        if (f3 >= TouchPipeline.SIZE) {
                                            c1639ys6.f13091d0 = f3;
                                        }
                                        f = c1306ps.f9063F;
                                        if (f >= TouchPipeline.SIZE) {
                                            c1639ys6.f13093e0 = f;
                                        }
                                    }
                                    if (f3 >= TouchPipeline.SIZE) {
                                        c1639ys6.f13091d0 = f3;
                                    }
                                    f = c1306ps.f9063F;
                                    if (f >= TouchPipeline.SIZE) {
                                        c1639ys6.f13093e0 = f;
                                    }
                                }
                                i5 = i4;
                                i6 = 4;
                                if (i50 != -1) {
                                    c1639ys9 = (C1639ys) sparseArray3.get(i50);
                                    if (c1639ys9 != null) {
                                        c1639ys.m7140v(i6, i5, ((ViewGroup.MarginLayoutParams) c1306ps2).rightMargin, i53, c1639ys9);
                                    }
                                    i7 = i5;
                                } else {
                                    i7 = i5;
                                    if (i51 != -1) {
                                        c1639ys.m7140v(i6, i6, ((ViewGroup.MarginLayoutParams) c1306ps2).rightMargin, i53, c1639ys3);
                                    }
                                }
                                i8 = i6;
                                i9 = c1306ps2.f9100i;
                                if (i9 != -1) {
                                    c1639ys8 = (C1639ys) sparseArray3.get(i9);
                                    if (c1639ys8 != null) {
                                        i21 = 3;
                                        c1639ys.m7140v(3, 3, ((ViewGroup.MarginLayoutParams) c1306ps2).topMargin, c1306ps2.f9123x, c1639ys8);
                                    } else {
                                        i21 = 3;
                                    }
                                    i12 = i21;
                                    i13 = 5;
                                    i11 = -1;
                                } else {
                                    i10 = c1306ps2.f9102j;
                                    i11 = -1;
                                    if (i10 != -1) {
                                        i12 = 3;
                                        i13 = 5;
                                    } else {
                                        i12 = 3;
                                        i13 = 5;
                                    }
                                }
                                i14 = c1306ps2.f9104k;
                                if (i14 != i11) {
                                    c1639ys7 = (C1639ys) sparseArray3.get(i14);
                                    if (c1639ys7 != null) {
                                        int i56 = i12;
                                        c1639ys.m7140v(i13, i56, ((ViewGroup.MarginLayoutParams) c1306ps2).bottomMargin, c1306ps2.f9125z, c1639ys7);
                                        i15 = i56;
                                    } else {
                                        i15 = i12;
                                    }
                                } else {
                                    i15 = i12;
                                    i16 = c1306ps2.f9106l;
                                    if (i16 != i11) {
                                        c1639ys.m7140v(i13, i13, ((ViewGroup.MarginLayoutParams) c1306ps2).bottomMargin, c1306ps2.f9125z, c1639ys5);
                                    }
                                }
                                c1306ps = c1306ps2;
                                i17 = c1306ps.f9108m;
                                if (i17 != -1) {
                                    constraintLayout = this;
                                    c1639ys6 = c1639ys;
                                    constraintLayout.m288l(c1639ys6, c1306ps, sparseArray3, i17, 6);
                                } else {
                                    i18 = c1306ps.f9110n;
                                    if (i18 != -1) {
                                        constraintLayout = this;
                                        c1639ys6 = c1639ys;
                                        constraintLayout.m288l(c1639ys6, c1306ps, sparseArray3, i18, i15);
                                    } else {
                                        i19 = c1306ps.f9112o;
                                        constraintLayout = this;
                                        c1639ys6 = c1639ys;
                                        i20 = i13;
                                        if (i19 != -1) {
                                            constraintLayout.m288l(c1639ys6, c1306ps, sparseArray3, i19, i20);
                                        }
                                    }
                                    if (f3 >= TouchPipeline.SIZE) {
                                        c1639ys6.f13091d0 = f3;
                                    }
                                    f = c1306ps.f9063F;
                                    if (f >= TouchPipeline.SIZE) {
                                        c1639ys6.f13093e0 = f;
                                    }
                                }
                                if (f3 >= TouchPipeline.SIZE) {
                                    c1639ys6.f13091d0 = f3;
                                }
                                f = c1306ps.f9063F;
                                if (f >= TouchPipeline.SIZE) {
                                    c1639ys6.f13093e0 = f;
                                }
                            }
                            if (zIsInEditMode && ((i26 = c1306ps.f9077T) != -1 || c1306ps.f9078U != -1)) {
                                int i57 = c1306ps.f9078U;
                                c1639ys6.f13082Y = i26;
                                c1639ys6.f13083Z = i57;
                            }
                            if (c1306ps.f9085a0) {
                                c1639ys6.m7120M(i35);
                                c1639ys6.m7122O(((ViewGroup.MarginLayoutParams) c1306ps).width);
                                if (((ViewGroup.MarginLayoutParams) c1306ps).width == -2) {
                                    c1639ys6.m7120M(i42);
                                }
                            } else if (((ViewGroup.MarginLayoutParams) c1306ps).width == -1) {
                                if (c1306ps.f9080W) {
                                    c1639ys6.m7120M(3);
                                } else {
                                    c1639ys6.m7120M(4);
                                }
                                c1639ys6.mo6933i(i7).f6504g = ((ViewGroup.MarginLayoutParams) c1306ps).leftMargin;
                                c1639ys6.mo6933i(i8).f6504g = ((ViewGroup.MarginLayoutParams) c1306ps).rightMargin;
                            } else {
                                c1639ys6.m7120M(3);
                                c1639ys6.m7122O(0);
                            }
                            if (c1306ps.f9087b0) {
                                i22 = -1;
                                c1639ys6.m7121N(1);
                                c1639ys6.m7119L(((ViewGroup.MarginLayoutParams) c1306ps).height);
                                if (((ViewGroup.MarginLayoutParams) c1306ps).height == -2) {
                                    c1639ys6.m7121N(2);
                                }
                            } else {
                                i22 = -1;
                                if (((ViewGroup.MarginLayoutParams) c1306ps).height == -1) {
                                    if (c1306ps.f9081X) {
                                        c1639ys6.m7121N(3);
                                    } else {
                                        c1639ys6.m7121N(4);
                                    }
                                    c1639ys6.mo6933i(3).f6504g = ((ViewGroup.MarginLayoutParams) c1306ps).topMargin;
                                    c1639ys6.mo6933i(5).f6504g = ((ViewGroup.MarginLayoutParams) c1306ps).bottomMargin;
                                } else {
                                    c1639ys6.m7121N(3);
                                    c1639ys6.m7119L(0);
                                }
                            }
                            String str2 = c1306ps.f9064G;
                            if (str2 == null || str2.length() == 0) {
                                c1639ys6.f13080W = TouchPipeline.SIZE;
                            } else {
                                int length = str2.length();
                                int iIndexOf3 = str2.indexOf(44);
                                if (iIndexOf3 <= 0 || iIndexOf3 >= length - 1) {
                                    i24 = i22;
                                    i25 = 0;
                                } else {
                                    String strSubstring = str2.substring(0, iIndexOf3);
                                    i24 = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : i22;
                                    i25 = iIndexOf3 + 1;
                                }
                                int iIndexOf4 = str2.indexOf(58);
                                if (iIndexOf4 < 0 || iIndexOf4 >= length - 1) {
                                    String strSubstring2 = str2.substring(i25);
                                    if (strSubstring2.length() > 0) {
                                        fAbs = Float.parseFloat(strSubstring2);
                                    } else {
                                        fAbs = 0.0f;
                                    }
                                } else {
                                    String strSubstring3 = str2.substring(i25, iIndexOf4);
                                    String strSubstring4 = str2.substring(iIndexOf4 + 1);
                                    if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                                        fAbs = 0.0f;
                                    } else {
                                        try {
                                            float f5 = Float.parseFloat(strSubstring3);
                                            float f6 = Float.parseFloat(strSubstring4);
                                            if (f5 <= TouchPipeline.SIZE || f6 <= TouchPipeline.SIZE) {
                                                fAbs = 0.0f;
                                            } else {
                                                fAbs = i24 == 1 ? Math.abs(f6 / f5) : Math.abs(f5 / f6);
                                            }
                                        } catch (NumberFormatException unused3) {
                                        }
                                    }
                                }
                                if (fAbs > TouchPipeline.SIZE) {
                                    c1639ys6.f13080W = fAbs;
                                    c1639ys6.f13081X = i24;
                                }
                            }
                            float f7 = c1306ps.f9065H;
                            float[] fArr = c1639ys6.f13105k0;
                            fArr[0] = f7;
                            i35 = 1;
                            fArr[1] = c1306ps.f9066I;
                            c1639ys6.f13101i0 = c1306ps.f9067J;
                            c1639ys6.f13103j0 = c1306ps.f9068K;
                            int i58 = c1306ps.f9083Z;
                            if (i58 >= 0 && i58 <= 3) {
                                c1639ys6.f13116q = i58;
                            }
                            int i59 = c1306ps.f9069L;
                            int i60 = c1306ps.f9071N;
                            int i61 = c1306ps.f9073P;
                            float f8 = c1306ps.f9075R;
                            c1639ys6.f13117r = i59;
                            c1639ys6.f13120u = i60;
                            if (i61 == Integer.MAX_VALUE) {
                                i61 = 0;
                            }
                            c1639ys6.f13121v = i61;
                            c1639ys6.f13122w = f8;
                            if (f8 > TouchPipeline.SIZE && f8 < 1.0f && i59 == 0) {
                                c1639ys6.f13117r = 2;
                            }
                            int i62 = c1306ps.f9070M;
                            int i63 = c1306ps.f9072O;
                            int i64 = c1306ps.f9074Q;
                            float f9 = c1306ps.f9076S;
                            c1639ys6.f13118s = i62;
                            c1639ys6.f13123x = i63;
                            if (i64 == Integer.MAX_VALUE) {
                                i64 = 0;
                            }
                            c1639ys6.f13124y = i64;
                            c1639ys6.f13125z = f9;
                            if (f9 <= TouchPipeline.SIZE || f9 >= 1.0f || i62 != 0) {
                                i23 = 2;
                            } else {
                                i23 = 2;
                                c1639ys6.f13118s = 2;
                            }
                        }
                    }
                    i45 = i3 + 1;
                    i42 = i23;
                    z = z2;
                }
            }
            if (z) {
                c1676zs.f13537r0.m4760c0(c1676zs);
            }
        }
        constraintLayout.m287k(c1676zs, constraintLayout.f570n, i, i2);
        int iM7135q = c1676zs.m7135q();
        int iM7131k = c1676zs.m7131k();
        boolean z4 = c1676zs.f13528E0;
        boolean z5 = c1676zs.f13529F0;
        ch1 ch1Var = constraintLayout.f576t;
        int i65 = ch1Var.f1809d;
        int iResolveSizeAndState = View.resolveSizeAndState(iM7135q + ch1Var.f1808c, i, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(iM7131k + i65, i2, 0) & 16777215;
        int iMin = Math.min(constraintLayout.f567f, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(constraintLayout.f568g, iResolveSizeAndState2);
        if (z4) {
            iMin |= 16777216;
        }
        if (z5) {
            iMin2 |= 16777216;
        }
        constraintLayout.setMeasuredDimension(iMin, iMin2);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        C1639ys c1639ysM284h = m284h(view);
        if ((view instanceof wi0) && !(c1639ysM284h instanceof xi0)) {
            C1306ps c1306ps = (C1306ps) view.getLayoutParams();
            xi0 xi0Var = new xi0();
            c1306ps.f9115p0 = xi0Var;
            c1306ps.f9091d0 = true;
            xi0Var.m6932S(c1306ps.f9079V);
        }
        if (view instanceof AbstractC1156ns) {
            AbstractC1156ns abstractC1156ns = (AbstractC1156ns) view;
            abstractC1156ns.m4594i();
            ((C1306ps) view.getLayoutParams()).f9093e0 = true;
            ArrayList arrayList = this.f563b;
            if (!arrayList.contains(abstractC1156ns)) {
                arrayList.add(abstractC1156ns);
            }
        }
        this.f562a.put(view.getId(), view);
        this.f569m = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f562a.remove(view.getId());
        C1639ys c1639ysM284h = m284h(view);
        this.f564c.f13536q0.remove(c1639ysM284h);
        c1639ysM284h.mo7112C();
        this.f563b.remove(view);
        this.f569m = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f569m = true;
        super.requestLayout();
    }

    public void setConstraintSet(C1602xs c1602xs) {
        this.f571o = c1602xs;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.f562a;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.f568g) {
            return;
        }
        this.f568g = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f567f) {
            return;
        }
        this.f567f = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.f566e) {
            return;
        }
        this.f566e = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.f565d) {
            return;
        }
        this.f565d = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(AbstractC0074at abstractC0074at) {
        C0558d8 c0558d8 = this.f572p;
        if (c0558d8 != null) {
            c0558d8.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.f570n = i;
        C1676zs c1676zs = this.f564c;
        c1676zs.f13527D0 = i;
        xs0.f12704p = c1676zs.m7341W(UserVerificationMethods.USER_VERIFY_NONE);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f562a = new SparseArray();
        this.f563b = new ArrayList(4);
        this.f564c = new C1676zs();
        this.f565d = 0;
        this.f566e = 0;
        this.f567f = Integer.MAX_VALUE;
        this.f568g = Integer.MAX_VALUE;
        this.f569m = true;
        this.f570n = 257;
        this.f571o = null;
        this.f572p = null;
        this.f573q = -1;
        this.f574r = new HashMap();
        this.f575s = new SparseArray();
        this.f576t = new ch1(this, this);
        this.f577u = 0;
        this.f578v = 0;
        m285i(attributeSet, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C1306ps c1306ps = new C1306ps(layoutParams);
        c1306ps.f9084a = -1;
        c1306ps.f9086b = -1;
        c1306ps.f9088c = -1.0f;
        c1306ps.f9090d = true;
        c1306ps.f9092e = -1;
        c1306ps.f9094f = -1;
        c1306ps.f9096g = -1;
        c1306ps.f9098h = -1;
        c1306ps.f9100i = -1;
        c1306ps.f9102j = -1;
        c1306ps.f9104k = -1;
        c1306ps.f9106l = -1;
        c1306ps.f9108m = -1;
        c1306ps.f9110n = -1;
        c1306ps.f9112o = -1;
        c1306ps.f9114p = -1;
        c1306ps.f9116q = 0;
        c1306ps.f9117r = TouchPipeline.SIZE;
        c1306ps.f9118s = -1;
        c1306ps.f9119t = -1;
        c1306ps.f9120u = -1;
        c1306ps.f9121v = -1;
        c1306ps.f9122w = Integer.MIN_VALUE;
        c1306ps.f9123x = Integer.MIN_VALUE;
        c1306ps.f9124y = Integer.MIN_VALUE;
        c1306ps.f9125z = Integer.MIN_VALUE;
        c1306ps.f9058A = Integer.MIN_VALUE;
        c1306ps.f9059B = Integer.MIN_VALUE;
        c1306ps.f9060C = Integer.MIN_VALUE;
        c1306ps.f9061D = 0;
        c1306ps.f9062E = 0.5f;
        c1306ps.f9063F = 0.5f;
        c1306ps.f9064G = null;
        c1306ps.f9065H = -1.0f;
        c1306ps.f9066I = -1.0f;
        c1306ps.f9067J = 0;
        c1306ps.f9068K = 0;
        c1306ps.f9069L = 0;
        c1306ps.f9070M = 0;
        c1306ps.f9071N = 0;
        c1306ps.f9072O = 0;
        c1306ps.f9073P = 0;
        c1306ps.f9074Q = 0;
        c1306ps.f9075R = 1.0f;
        c1306ps.f9076S = 1.0f;
        c1306ps.f9077T = -1;
        c1306ps.f9078U = -1;
        c1306ps.f9079V = -1;
        c1306ps.f9080W = false;
        c1306ps.f9081X = false;
        c1306ps.f9082Y = null;
        c1306ps.f9083Z = 0;
        c1306ps.f9085a0 = true;
        c1306ps.f9087b0 = true;
        c1306ps.f9089c0 = false;
        c1306ps.f9091d0 = false;
        c1306ps.f9093e0 = false;
        c1306ps.f9095f0 = -1;
        c1306ps.f9097g0 = -1;
        c1306ps.f9099h0 = -1;
        c1306ps.f9101i0 = -1;
        c1306ps.f9103j0 = Integer.MIN_VALUE;
        c1306ps.f9105k0 = Integer.MIN_VALUE;
        c1306ps.f9107l0 = 0.5f;
        c1306ps.f9115p0 = new C1639ys();
        return c1306ps;
    }
}
