package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import com.example.ssmousepro.injection.TouchPipeline;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: c9 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0127c9 {

    /* JADX INFO: renamed from: a */
    public final TextView f1706a;

    /* JADX INFO: renamed from: b */
    public C0577ds f1707b;

    /* JADX INFO: renamed from: c */
    public C0577ds f1708c;

    /* JADX INFO: renamed from: d */
    public C0577ds f1709d;

    /* JADX INFO: renamed from: e */
    public C0577ds f1710e;

    /* JADX INFO: renamed from: f */
    public C0577ds f1711f;

    /* JADX INFO: renamed from: g */
    public C0577ds f1712g;

    /* JADX INFO: renamed from: h */
    public C0577ds f1713h;

    /* JADX INFO: renamed from: i */
    public final C0743i9 f1714i;

    /* JADX INFO: renamed from: j */
    public int f1715j = 0;

    /* JADX INFO: renamed from: k */
    public int f1716k = -1;

    /* JADX INFO: renamed from: l */
    public Typeface f1717l;

    /* JADX INFO: renamed from: m */
    public boolean f1718m;

    public C0127c9(TextView textView) {
        this.f1706a = textView;
        this.f1714i = new C0743i9(textView);
    }

    /* JADX INFO: renamed from: c */
    public static C0577ds m1160c(Context context, C1507v7 c1507v7, int i) {
        ColorStateList colorStateListM3664f;
        synchronized (c1507v7) {
            colorStateListM3664f = c1507v7.f11571a.m3664f(context, i);
        }
        if (colorStateListM3664f == null) {
            return null;
        }
        C0577ds c0577ds = new C0577ds();
        c0577ds.f3004b = true;
        c0577ds.f3005c = colorStateListM3664f;
        return c0577ds;
    }

    /* JADX INFO: renamed from: h */
    public static void m1161h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i >= 30) {
            l50.m4055a(editorInfo, text);
            return;
        }
        text.getClass();
        if (i >= 30) {
            l50.m4055a(editorInfo, text);
            return;
        }
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        int i4 = i2 > i3 ? i3 : i2;
        if (i2 <= i3) {
            i2 = i3;
        }
        int length = text.length();
        if (i4 < 0 || i2 > length) {
            hr1.m3262M(editorInfo, null, 0, 0);
            return;
        }
        int i5 = editorInfo.inputType & 4095;
        if (i5 == 129 || i5 == 225 || i5 == 18) {
            hr1.m3262M(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            hr1.m3262M(editorInfo, text, i4, i2);
            return;
        }
        int i6 = i2 - i4;
        int i7 = i6 > 1024 ? 0 : i6;
        int i8 = 2048 - i7;
        int iMin = Math.min(text.length() - i2, i8 - Math.min(i4, (int) (((double) i8) * 0.8d)));
        int iMin2 = Math.min(i4, i8 - iMin);
        int i9 = i4 - iMin2;
        if (Character.isLowSurrogate(text.charAt(i9))) {
            i9++;
            iMin2--;
        }
        if (Character.isHighSurrogate(text.charAt((i2 + iMin) - 1))) {
            iMin--;
        }
        int i10 = iMin2 + i7;
        hr1.m3262M(editorInfo, i7 != i6 ? TextUtils.concat(text.subSequence(i9, i9 + iMin2), text.subSequence(i2, iMin + i2)) : text.subSequence(i9, i10 + iMin + i9), iMin2, i10);
    }

    /* JADX INFO: renamed from: a */
    public final void m1162a(Drawable drawable, C0577ds c0577ds) {
        if (drawable == null || c0577ds == null) {
            return;
        }
        C1507v7.m6595e(drawable, c0577ds, this.f1706a.getDrawableState());
    }

    /* JADX INFO: renamed from: b */
    public final void m1163b() {
        C0577ds c0577ds = this.f1707b;
        TextView textView = this.f1706a;
        if (c0577ds != null || this.f1708c != null || this.f1709d != null || this.f1710e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            m1162a(compoundDrawables[0], this.f1707b);
            m1162a(compoundDrawables[1], this.f1708c);
            m1162a(compoundDrawables[2], this.f1709d);
            m1162a(compoundDrawables[3], this.f1710e);
        }
        if (this.f1711f == null && this.f1712g == null) {
            return;
        }
        Drawable[] drawableArrM7037a = AbstractC1619y8.m7037a(textView);
        m1162a(drawableArrM7037a[0], this.f1711f);
        m1162a(drawableArrM7037a[2], this.f1712g);
    }

    /* JADX INFO: renamed from: d */
    public final ColorStateList m1164d() {
        C0577ds c0577ds = this.f1713h;
        if (c0577ds != null) {
            return (ColorStateList) c0577ds.f3005c;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final PorterDuff.Mode m1165e() {
        C0577ds c0577ds = this.f1713h;
        if (c0577ds != null) {
            return (PorterDuff.Mode) c0577ds.f3006d;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public final void m1166f(AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2;
        String string;
        String string2;
        int i2;
        ColorStateList colorStateList;
        int resourceId;
        int i3;
        int resourceId2;
        TextView textView = this.f1706a;
        Context context = textView.getContext();
        C1507v7 c1507v7M6592a = C1507v7.m6592a();
        int[] iArr = ki1.f5853h;
        C1174o9 c1174o9M4734Q = C1174o9.m4734Q(context, attributeSet, iArr, i);
        i72.m3377i(textView, textView.getContext(), iArr, attributeSet, (TypedArray) c1174o9M4734Q.f7699b, i);
        TypedArray typedArray = (TypedArray) c1174o9M4734Q.f7699b;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f1707b = m1160c(context, c1507v7M6592a, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f1708c = m1160c(context, c1507v7M6592a, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f1709d = m1160c(context, c1507v7M6592a, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f1710e = m1160c(context, c1507v7M6592a, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f1711f = m1160c(context, c1507v7M6592a, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f1712g = m1160c(context, c1507v7M6592a, typedArray.getResourceId(6, 0));
        }
        c1174o9M4734Q.m4753T();
        boolean z3 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = ki1.f5868w;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            C1174o9 c1174o9 = new C1174o9(context, typedArrayObtainStyledAttributes);
            if (z3 || !typedArrayObtainStyledAttributes.hasValue(14)) {
                z = false;
                z2 = false;
            } else {
                z2 = typedArrayObtainStyledAttributes.getBoolean(14, false);
                z = true;
            }
            m1170k(context, c1174o9);
            string2 = typedArrayObtainStyledAttributes.hasValue(15) ? typedArrayObtainStyledAttributes.getString(15) : null;
            string = typedArrayObtainStyledAttributes.hasValue(13) ? typedArrayObtainStyledAttributes.getString(13) : null;
            c1174o9.m4753T();
        } else {
            z = false;
            z2 = false;
            string = null;
            string2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        C1174o9 c1174o10 = new C1174o9(context, typedArrayObtainStyledAttributes2);
        if (!z3 && typedArrayObtainStyledAttributes2.hasValue(14)) {
            z2 = typedArrayObtainStyledAttributes2.getBoolean(14, false);
            z = true;
        }
        boolean z4 = z2;
        if (typedArrayObtainStyledAttributes2.hasValue(15)) {
            string2 = typedArrayObtainStyledAttributes2.getString(15);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(13)) {
            string = typedArrayObtainStyledAttributes2.getString(13);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(0) && typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, TouchPipeline.SIZE);
        }
        m1170k(context, c1174o10);
        c1174o10.m4753T();
        if (!z3 && z) {
            textView.setAllCaps(z4);
        }
        Typeface typeface = this.f1717l;
        if (typeface != null) {
            if (this.f1716k == -1) {
                textView.setTypeface(typeface, this.f1715j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (string != null) {
            AbstractC0010a9.m119d(textView, string);
        }
        if (string2 != null) {
            AbstractC1656z8.m7259b(textView, AbstractC1656z8.m7258a(string2));
        }
        C0743i9 c0743i9 = this.f1714i;
        Context context2 = c0743i9.f4880h;
        int[] iArr3 = ki1.f5854i;
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        TextView textView2 = c0743i9.f4879g;
        i72.m3377i(textView2, textView2.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes3, i);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            c0743i9.f4873a = typedArrayObtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(4) ? typedArrayObtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(2) ? typedArrayObtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes3.hasValue(1) ? typedArrayObtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (!typedArrayObtainStyledAttributes3.hasValue(3) || (resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(3, 0)) <= 0) {
            i2 = 0;
        } else {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            i2 = 0;
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i4 = 0; i4 < length; i4++) {
                    iArr4[i4] = typedArrayObtainTypedArray.getDimensionPixelSize(i4, -1);
                }
                int[] iArrM3393a = C0743i9.m3393a(iArr4);
                c0743i9.f4877e = iArrM3393a;
                int length2 = iArrM3393a.length;
                boolean z5 = length2 > 0;
                c0743i9.f4878f = z5;
                if (z5) {
                    c0743i9.f4873a = 1;
                    c0743i9.f4875c = iArrM3393a[0];
                    c0743i9.f4876d = iArrM3393a[length2 - 1];
                    c0743i9.f4874b = -1.0f;
                }
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (!c0743i9.m3394b()) {
            c0743i9.f4873a = i2;
        } else if (c0743i9.f4873a == 1) {
            if (!c0743i9.f4878f) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i3 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i3 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i3, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                if (dimension2 <= TouchPipeline.SIZE) {
                    throw new IllegalArgumentException("Minimum auto-size text size (" + dimension2 + "px) is less or equal to (0px)");
                }
                if (dimension3 <= dimension2) {
                    throw new IllegalArgumentException("Maximum auto-size text size (" + dimension3 + "px) is less or equal to minimum auto-size text size (" + dimension2 + "px)");
                }
                if (dimension <= TouchPipeline.SIZE) {
                    throw new IllegalArgumentException("The auto-size step granularity (" + dimension + "px) is less or equal to (0px)");
                }
                c0743i9.f4873a = 1;
                c0743i9.f4875c = dimension2;
                c0743i9.f4876d = dimension3;
                c0743i9.f4874b = dimension;
                c0743i9.f4878f = i2;
            }
            if (c0743i9.m3394b() && c0743i9.f4873a == 1 && (!c0743i9.f4878f || c0743i9.f4877e.length == 0)) {
                int iFloor = ((int) Math.floor((c0743i9.f4876d - c0743i9.f4875c) / c0743i9.f4874b)) + 1;
                int[] iArr5 = new int[iFloor];
                for (int i5 = 0; i5 < iFloor; i5++) {
                    iArr5[i5] = Math.round((i5 * c0743i9.f4874b) + c0743i9.f4875c);
                }
                c0743i9.f4877e = C0743i9.m3393a(iArr5);
            }
        }
        Method method = h82.f4474a;
        if (c0743i9.f4873a != 0) {
            int[] iArr6 = c0743i9.f4877e;
            if (iArr6.length > 0) {
                if (AbstractC0010a9.m116a(textView) != -1.0f) {
                    AbstractC0010a9.m117b(textView, Math.round(c0743i9.f4875c), Math.round(c0743i9.f4876d), Math.round(c0743i9.f4874b), 0);
                } else {
                    AbstractC0010a9.m118c(textView, iArr6, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        Drawable drawableM6596b = resourceId4 != -1 ? c1507v7M6592a.m6596b(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(13, -1);
        Drawable drawableM6596b2 = resourceId5 != -1 ? c1507v7M6592a.m6596b(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableM6596b3 = resourceId6 != -1 ? c1507v7M6592a.m6596b(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableM6596b4 = resourceId7 != -1 ? c1507v7M6592a.m6596b(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableM6596b5 = resourceId8 != -1 ? c1507v7M6592a.m6596b(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableM6596b6 = resourceId9 != -1 ? c1507v7M6592a.m6596b(context, resourceId9) : null;
        if (drawableM6596b5 != null || drawableM6596b6 != null) {
            Drawable[] drawableArrM7037a = AbstractC1619y8.m7037a(textView);
            if (drawableM6596b5 == null) {
                drawableM6596b5 = drawableArrM7037a[0];
            }
            if (drawableM6596b2 == null) {
                drawableM6596b2 = drawableArrM7037a[1];
            }
            if (drawableM6596b6 == null) {
                drawableM6596b6 = drawableArrM7037a[2];
            }
            if (drawableM6596b4 == null) {
                drawableM6596b4 = drawableArrM7037a[3];
            }
            AbstractC1619y8.m7038b(textView, drawableM6596b5, drawableM6596b2, drawableM6596b6, drawableM6596b4);
        } else if (drawableM6596b != null || drawableM6596b2 != null || drawableM6596b3 != null || drawableM6596b4 != null) {
            Drawable[] drawableArrM7037a2 = AbstractC1619y8.m7037a(textView);
            Drawable drawable = drawableArrM7037a2[0];
            if (drawable == null && drawableArrM7037a2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableM6596b == null) {
                    drawableM6596b = compoundDrawables[0];
                }
                if (drawableM6596b2 == null) {
                    drawableM6596b2 = compoundDrawables[1];
                }
                if (drawableM6596b3 == null) {
                    drawableM6596b3 = compoundDrawables[2];
                }
                if (drawableM6596b4 == null) {
                    drawableM6596b4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableM6596b, drawableM6596b2, drawableM6596b3, drawableM6596b4);
            } else {
                if (drawableM6596b2 == null) {
                    drawableM6596b2 = drawableArrM7037a2[1];
                }
                Drawable drawable2 = drawableArrM7037a2[2];
                if (drawableM6596b4 == null) {
                    drawableM6596b4 = drawableArrM7037a2[3];
                }
                AbstractC1619y8.m7038b(textView, drawable, drawableM6596b2, drawable2, drawableM6596b4);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = AbstractC0075au.getColorStateList(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
            }
            d02.m2164f(textView, colorStateList);
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            d02.m2165g(textView, x30.m6865b(typedArrayObtainStyledAttributes4.getInt(12, -1), null));
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(18, -1);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(19, -1);
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize != -1) {
            rc2.m5785h(dimensionPixelSize);
            e02.m2445c(textView, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != -1) {
            rc2.m5785h(dimensionPixelSize2);
            Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
            int i6 = b02.m819a(textView) ? fontMetricsInt.bottom : fontMetricsInt.descent;
            if (dimensionPixelSize2 > Math.abs(i6)) {
                textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), dimensionPixelSize2 - i6);
            }
        }
        if (dimensionPixelSize3 != -1) {
            rc2.m5785h(dimensionPixelSize3);
            int fontMetricsInt2 = textView.getPaint().getFontMetricsInt(null);
            if (dimensionPixelSize3 != fontMetricsInt2) {
                textView.setLineSpacing(dimensionPixelSize3 - fontMetricsInt2, 1.0f);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m1167g(Context context, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, ki1.f5868w);
        C1174o9 c1174o9 = new C1174o9(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.f1706a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, TouchPipeline.SIZE);
        }
        m1170k(context, c1174o9);
        if (typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            AbstractC0010a9.m119d(textView, string);
        }
        c1174o9.m4753T();
        Typeface typeface = this.f1717l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f1715j);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m1168i(ColorStateList colorStateList) {
        if (this.f1713h == null) {
            this.f1713h = new C0577ds();
        }
        C0577ds c0577ds = this.f1713h;
        c0577ds.f3005c = colorStateList;
        c0577ds.f3004b = colorStateList != null;
        this.f1707b = c0577ds;
        this.f1708c = c0577ds;
        this.f1709d = c0577ds;
        this.f1710e = c0577ds;
        this.f1711f = c0577ds;
        this.f1712g = c0577ds;
    }

    /* JADX INFO: renamed from: j */
    public final void m1169j(PorterDuff.Mode mode) {
        if (this.f1713h == null) {
            this.f1713h = new C0577ds();
        }
        C0577ds c0577ds = this.f1713h;
        c0577ds.f3006d = mode;
        c0577ds.f3003a = mode != null;
        this.f1707b = c0577ds;
        this.f1708c = c0577ds;
        this.f1709d = c0577ds;
        this.f1710e = c0577ds;
        this.f1711f = c0577ds;
        this.f1712g = c0577ds;
    }

    /* JADX INFO: renamed from: k */
    public final void m1170k(Context context, C1174o9 c1174o9) {
        String string;
        int i = this.f1715j;
        TypedArray typedArray = (TypedArray) c1174o9.f7699b;
        this.f1715j = typedArray.getInt(2, i);
        int i2 = typedArray.getInt(11, -1);
        this.f1716k = i2;
        if (i2 != -1) {
            this.f1715j &= 2;
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f1718m = false;
                int i3 = typedArray.getInt(1, 1);
                if (i3 == 1) {
                    this.f1717l = Typeface.SANS_SERIF;
                    return;
                } else if (i3 == 2) {
                    this.f1717l = Typeface.SERIF;
                    return;
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    this.f1717l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f1717l = null;
        int i4 = typedArray.hasValue(12) ? 12 : 10;
        int i5 = this.f1716k;
        int i6 = this.f1715j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceM4738B = c1174o9.m4738B(i4, this.f1715j, new C1545w8(this, i5, i6, new WeakReference(this.f1706a)));
                if (typefaceM4738B != null) {
                    if (this.f1716k != -1) {
                        this.f1717l = AbstractC0091b9.m947a(Typeface.create(typefaceM4738B, 0), this.f1716k, (this.f1715j & 2) != 0);
                    } else {
                        this.f1717l = typefaceM4738B;
                    }
                }
                this.f1718m = this.f1717l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f1717l != null || (string = typedArray.getString(i4)) == null) {
            return;
        }
        if (this.f1716k != -1) {
            this.f1717l = AbstractC0091b9.m947a(Typeface.create(string, 0), this.f1716k, (this.f1715j & 2) != 0);
        } else {
            this.f1717l = Typeface.create(string, this.f1715j);
        }
    }
}
