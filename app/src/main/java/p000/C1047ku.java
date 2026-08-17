package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: ku */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1047ku extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a */
    public AbstractC0727hu f6007a;

    /* JADX INFO: renamed from: b */
    public boolean f6008b;

    /* JADX INFO: renamed from: c */
    public final int f6009c;

    /* JADX INFO: renamed from: d */
    public final int f6010d;

    /* JADX INFO: renamed from: e */
    public final int f6011e;

    /* JADX INFO: renamed from: f */
    public final int f6012f;

    /* JADX INFO: renamed from: g */
    public final int f6013g;

    /* JADX INFO: renamed from: h */
    public int f6014h;

    /* JADX INFO: renamed from: i */
    public int f6015i;

    /* JADX INFO: renamed from: j */
    public int f6016j;

    /* JADX INFO: renamed from: k */
    public View f6017k;

    /* JADX INFO: renamed from: l */
    public View f6018l;

    /* JADX INFO: renamed from: m */
    public boolean f6019m;

    /* JADX INFO: renamed from: n */
    public boolean f6020n;

    /* JADX INFO: renamed from: o */
    public final Rect f6021o;

    public C1047ku(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6008b = false;
        this.f6009c = 0;
        this.f6010d = 0;
        this.f6011e = -1;
        this.f6012f = -1;
        this.f6013g = 0;
        this.f6014h = 0;
        this.f6021o = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ei1.f3354b);
        this.f6009c = typedArrayObtainStyledAttributes.getInteger(0, 0);
        this.f6012f = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        this.f6010d = typedArrayObtainStyledAttributes.getInteger(2, 0);
        this.f6011e = typedArrayObtainStyledAttributes.getInteger(6, -1);
        this.f6013g = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.f6014h = typedArrayObtainStyledAttributes.getInt(4, 0);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
        this.f6008b = zHasValue;
        if (zHasValue) {
            String string = typedArrayObtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f582y;
            AbstractC0727hu abstractC0727hu = null;
            if (!TextUtils.isEmpty(string)) {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f582y;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f579A;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f583z);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    abstractC0727hu = (AbstractC0727hu) constructor.newInstance(context, attributeSet);
                } catch (Exception e) {
                    l41.m4043l("Could not inflate Behavior subclass ".concat(string), e);
                    throw null;
                }
            }
            this.f6007a = abstractC0727hu;
        }
        typedArrayObtainStyledAttributes.recycle();
        AbstractC0727hu abstractC0727hu2 = this.f6007a;
        if (abstractC0727hu2 != null) {
            abstractC0727hu2.mo1664g(this);
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m3999a(int i) {
        if (i == 0) {
            return this.f6019m;
        }
        if (i != 1) {
            return false;
        }
        return this.f6020n;
    }

    public C1047ku() {
        super(-2, -2);
        this.f6008b = false;
        this.f6009c = 0;
        this.f6010d = 0;
        this.f6011e = -1;
        this.f6012f = -1;
        this.f6013g = 0;
        this.f6014h = 0;
        this.f6021o = new Rect();
    }

    public C1047ku(C1047ku c1047ku) {
        super((ViewGroup.MarginLayoutParams) c1047ku);
        this.f6008b = false;
        this.f6009c = 0;
        this.f6010d = 0;
        this.f6011e = -1;
        this.f6012f = -1;
        this.f6013g = 0;
        this.f6014h = 0;
        this.f6021o = new Rect();
    }

    public C1047ku(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f6008b = false;
        this.f6009c = 0;
        this.f6010d = 0;
        this.f6011e = -1;
        this.f6012f = -1;
        this.f6013g = 0;
        this.f6014h = 0;
        this.f6021o = new Rect();
    }

    public C1047ku(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f6008b = false;
        this.f6009c = 0;
        this.f6010d = 0;
        this.f6011e = -1;
        this.f6012f = -1;
        this.f6013g = 0;
        this.f6014h = 0;
        this.f6021o = new Rect();
    }
}
