package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import com.example.ssmousepro.injection.TouchPipeline;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class p52 extends g52 {

    /* JADX INFO: renamed from: o */
    public static final PorterDuff.Mode f8728o = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b */
    public n52 f8729b;

    /* JADX INFO: renamed from: c */
    public PorterDuffColorFilter f8730c;

    /* JADX INFO: renamed from: d */
    public ColorFilter f8731d;

    /* JADX INFO: renamed from: e */
    public boolean f8732e;

    /* JADX INFO: renamed from: f */
    public boolean f8733f;

    /* JADX INFO: renamed from: g */
    public final float[] f8734g;

    /* JADX INFO: renamed from: m */
    public final Matrix f8735m;

    /* JADX INFO: renamed from: n */
    public final Rect f8736n;

    public p52() {
        this.f8733f = true;
        this.f8734g = new float[9];
        this.f8735m = new Matrix();
        this.f8736n = new Rect();
        n52 n52Var = new n52();
        n52Var.f7246c = null;
        n52Var.f7247d = f8728o;
        n52Var.f7245b = new m52();
        this.f8729b = n52Var;
    }

    /* JADX INFO: renamed from: a */
    public final PorterDuffColorFilter m5203a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f4069a;
        if (drawable == null) {
            return false;
        }
        v30.m6554b(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f4069a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f8736n;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f8731d;
        if (colorFilter == null) {
            colorFilter = this.f8730c;
        }
        Matrix matrix = this.f8735m;
        canvas.getMatrix(matrix);
        float[] fArr = this.f8734g;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != TouchPipeline.SIZE || fAbs4 != TouchPipeline.SIZE) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iHeight = (int) (rect.height() * fAbs2);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && w30.m6698a(this) == 1) {
            canvas.translate(rect.width(), TouchPipeline.SIZE);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        n52 n52Var = this.f8729b;
        Bitmap bitmap = n52Var.f7249f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != n52Var.f7249f.getHeight()) {
            n52Var.f7249f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            n52Var.f7254k = true;
        }
        boolean z = this.f8733f;
        n52 n52Var2 = this.f8729b;
        if (!z) {
            n52Var2.f7249f.eraseColor(0);
            Canvas canvas2 = new Canvas(n52Var2.f7249f);
            m52 m52Var = n52Var2.f7245b;
            m52Var.m4385a(m52Var.f6652g, m52.f6645p, canvas2, iMin, iMin2);
        } else if (n52Var2.f7254k || n52Var2.f7250g != n52Var2.f7246c || n52Var2.f7251h != n52Var2.f7247d || n52Var2.f7253j != n52Var2.f7248e || n52Var2.f7252i != n52Var2.f7245b.getRootAlpha()) {
            n52 n52Var3 = this.f8729b;
            n52Var3.f7249f.eraseColor(0);
            Canvas canvas3 = new Canvas(n52Var3.f7249f);
            m52 m52Var2 = n52Var3.f7245b;
            m52Var2.m4385a(m52Var2.f6652g, m52.f6645p, canvas3, iMin, iMin2);
            n52 n52Var4 = this.f8729b;
            n52Var4.f7250g = n52Var4.f7246c;
            n52Var4.f7251h = n52Var4.f7247d;
            n52Var4.f7252i = n52Var4.f7245b.getRootAlpha();
            n52Var4.f7253j = n52Var4.f7248e;
            n52Var4.f7254k = false;
        }
        n52 n52Var5 = this.f8729b;
        if (n52Var5.f7245b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (n52Var5.f7255l == null) {
                Paint paint2 = new Paint();
                n52Var5.f7255l = paint2;
                paint2.setFilterBitmap(true);
            }
            n52Var5.f7255l.setAlpha(n52Var5.f7245b.getRootAlpha());
            n52Var5.f7255l.setColorFilter(colorFilter);
            paint = n52Var5.f7255l;
        }
        canvas.drawBitmap(n52Var5.f7249f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f4069a;
        return drawable != null ? u30.m6379a(drawable) : this.f8729b.f7245b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f4069a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return this.f8729b.getChangingConfigurations() | super.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f4069a;
        return drawable != null ? v30.m6555c(drawable) : this.f8731d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f4069a != null) {
            return new o52(this.f4069a.getConstantState());
        }
        this.f8729b.f7244a = getChangingConfigurations();
        return this.f8729b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f4069a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f8729b.f7245b.f6654i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f4069a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f8729b.f7245b.f6653h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f4069a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int i;
        char c;
        int i2;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.f4069a;
        if (drawable != null) {
            v30.m6556d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        n52 n52Var = this.f8729b;
        n52Var.f7245b = new m52();
        TypedArray typedArrayM3844K = ki0.m3844K(resources, theme, attributeSet, hr1.f4682a);
        n52 n52Var2 = this.f8729b;
        m52 m52Var = n52Var2.f7245b;
        int i3 = !ki0.m3840E(xmlPullParser, "tintMode") ? -1 : typedArrayM3844K.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i3 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i3 != 5) {
            if (i3 != 9) {
                switch (i3) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        n52Var2.f7247d = mode;
        ColorStateList colorStateListM1039a = null;
        int i4 = 1;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            typedArrayM3844K.getValue(1, typedValue);
            int i5 = typedValue.type;
            if (i5 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i5 < 28 || i5 > 31) {
                Resources resources2 = typedArrayM3844K.getResources();
                int resourceId = typedArrayM3844K.getResourceId(1, 0);
                ThreadLocal threadLocal = AbstractC0108bq.f1508a;
                try {
                    colorStateListM1039a = AbstractC0108bq.m1039a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                }
            } else {
                colorStateListM1039a = ColorStateList.valueOf(typedValue.data);
            }
        }
        ColorStateList colorStateList = colorStateListM1039a;
        if (colorStateList != null) {
            n52Var2.f7246c = colorStateList;
        }
        boolean z = n52Var2.f7248e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z = typedArrayM3844K.getBoolean(5, z);
        }
        n52Var2.f7248e = z;
        float f = m52Var.f6655j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f = typedArrayM3844K.getFloat(7, f);
        }
        m52Var.f6655j = f;
        float f2 = m52Var.f6656k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f2 = typedArrayM3844K.getFloat(8, f2);
        }
        m52Var.f6656k = f2;
        if (m52Var.f6655j <= TouchPipeline.SIZE) {
            throw new XmlPullParserException(typedArrayM3844K.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f2 <= TouchPipeline.SIZE) {
            throw new XmlPullParserException(typedArrayM3844K.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        m52Var.f6653h = typedArrayM3844K.getDimension(3, m52Var.f6653h);
        float dimension = typedArrayM3844K.getDimension(2, m52Var.f6654i);
        m52Var.f6654i = dimension;
        if (m52Var.f6653h <= TouchPipeline.SIZE) {
            throw new XmlPullParserException(typedArrayM3844K.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= TouchPipeline.SIZE) {
            throw new XmlPullParserException(typedArrayM3844K.getPositionDescription() + "<vector> tag requires height > 0");
        }
        float alpha = m52Var.getAlpha();
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
            alpha = typedArrayM3844K.getFloat(4, alpha);
        }
        m52Var.setAlpha(alpha);
        String string = typedArrayM3844K.getString(0);
        if (string != null) {
            m52Var.f6658m = string;
            m52Var.f6660o.put(string, m52Var);
        }
        typedArrayM3844K.recycle();
        n52Var.f7244a = getChangingConfigurations();
        n52Var.f7254k = true;
        n52 n52Var3 = this.f8729b;
        m52 m52Var2 = n52Var3.f7245b;
        ArrayDeque arrayDeque = new ArrayDeque();
        j52 j52Var = m52Var2.f6652g;
        C0633fa c0633fa = m52Var2.f6660o;
        arrayDeque.push(j52Var);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z2 = true;
        while (eventType != i4 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                j52 j52Var2 = (j52) arrayDeque.peek();
                i = depth;
                if ("path".equals(name)) {
                    i52 i52Var = new i52();
                    i52Var.f4819e = TouchPipeline.SIZE;
                    i52Var.f4821g = 1.0f;
                    i52Var.f4822h = 1.0f;
                    i52Var.f4823i = TouchPipeline.SIZE;
                    i52Var.f4824j = 1.0f;
                    i52Var.f4825k = TouchPipeline.SIZE;
                    Paint.Cap cap2 = Paint.Cap.BUTT;
                    i52Var.f4826l = cap2;
                    Paint.Join join2 = Paint.Join.MITER;
                    i52Var.f4827m = join2;
                    i52Var.f4828n = 4.0f;
                    TypedArray typedArrayM3844K2 = ki0.m3844K(resources, theme, attributeSet, hr1.f4684c);
                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                        String string2 = typedArrayM3844K2.getString(0);
                        if (string2 != null) {
                            i52Var.f6190b = string2;
                        }
                        String string3 = typedArrayM3844K2.getString(2);
                        if (string3 != null) {
                            i52Var.f6189a = ua0.m6456l(string3);
                        }
                        i52Var.f4820f = ki0.m3874v(typedArrayM3844K2, xmlPullParser, theme, "fillColor", 1);
                        float f3 = i52Var.f4822h;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                            f3 = typedArrayM3844K2.getFloat(12, f3);
                        }
                        i52Var.f4822h = f3;
                        int i6 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? typedArrayM3844K2.getInt(8, -1) : -1;
                        Paint.Cap cap3 = i52Var.f4826l;
                        if (i6 == 0) {
                            cap = cap2;
                        } else if (i6 != 1) {
                            cap = i6 != 2 ? cap3 : Paint.Cap.SQUARE;
                        } else {
                            cap = Paint.Cap.ROUND;
                        }
                        i52Var.f4826l = cap;
                        int i7 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? typedArrayM3844K2.getInt(9, -1) : -1;
                        Paint.Join join3 = i52Var.f4827m;
                        if (i7 == 0) {
                            join = join2;
                        } else if (i7 != 1) {
                            join = i7 != 2 ? join3 : Paint.Join.BEVEL;
                        } else {
                            join = Paint.Join.ROUND;
                        }
                        i52Var.f4827m = join;
                        float f4 = i52Var.f4828n;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                            f4 = typedArrayM3844K2.getFloat(10, f4);
                        }
                        i52Var.f4828n = f4;
                        i52Var.f4818d = ki0.m3874v(typedArrayM3844K2, xmlPullParser, theme, "strokeColor", 3);
                        float f5 = i52Var.f4821g;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                            f5 = typedArrayM3844K2.getFloat(11, f5);
                        }
                        i52Var.f4821g = f5;
                        float f6 = i52Var.f4819e;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                            f6 = typedArrayM3844K2.getFloat(4, f6);
                        }
                        i52Var.f4819e = f6;
                        float f7 = i52Var.f4824j;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                            f7 = typedArrayM3844K2.getFloat(6, f7);
                        }
                        i52Var.f4824j = f7;
                        float f8 = i52Var.f4825k;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                            f8 = typedArrayM3844K2.getFloat(7, f8);
                        }
                        i52Var.f4825k = f8;
                        float f9 = i52Var.f4823i;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                            f9 = typedArrayM3844K2.getFloat(5, f9);
                        }
                        i52Var.f4823i = f9;
                        int i8 = i52Var.f6191c;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                            i8 = typedArrayM3844K2.getInt(13, i8);
                        }
                        i52Var.f6191c = i8;
                    }
                    typedArrayM3844K2.recycle();
                    j52Var2.f5274b.add(i52Var);
                    if (i52Var.getPathName() != null) {
                        c0633fa.put(i52Var.getPathName(), i52Var);
                    }
                    n52Var3.f7244a = n52Var3.f7244a;
                    z2 = false;
                    c = '\b';
                } else {
                    c = '\b';
                    if ("clip-path".equals(name)) {
                        h52 h52Var = new h52();
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                            TypedArray typedArrayM3844K3 = ki0.m3844K(resources, theme, attributeSet, hr1.f4685d);
                            String string4 = typedArrayM3844K3.getString(0);
                            if (string4 != null) {
                                h52Var.f6190b = string4;
                            }
                            String string5 = typedArrayM3844K3.getString(1);
                            if (string5 != null) {
                                h52Var.f6189a = ua0.m6456l(string5);
                            }
                            h52Var.f6191c = !ki0.m3840E(xmlPullParser, "fillType") ? 0 : typedArrayM3844K3.getInt(2, 0);
                            typedArrayM3844K3.recycle();
                        }
                        j52Var2.f5274b.add(h52Var);
                        if (h52Var.getPathName() != null) {
                            c0633fa.put(h52Var.getPathName(), h52Var);
                        }
                        n52Var3.f7244a = n52Var3.f7244a;
                    } else if ("group".equals(name)) {
                        j52 j52Var3 = new j52();
                        TypedArray typedArrayM3844K4 = ki0.m3844K(resources, theme, attributeSet, hr1.f4683b);
                        float f10 = j52Var3.f5275c;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "rotation") != null) {
                            f10 = typedArrayM3844K4.getFloat(5, f10);
                        }
                        j52Var3.f5275c = f10;
                        j52Var3.f5276d = typedArrayM3844K4.getFloat(1, j52Var3.f5276d);
                        j52Var3.f5277e = typedArrayM3844K4.getFloat(2, j52Var3.f5277e);
                        float f11 = j52Var3.f5278f;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                            f11 = typedArrayM3844K4.getFloat(3, f11);
                        }
                        j52Var3.f5278f = f11;
                        float f12 = j52Var3.f5279g;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                            f12 = typedArrayM3844K4.getFloat(4, f12);
                        }
                        j52Var3.f5279g = f12;
                        float f13 = j52Var3.f5280h;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                            f13 = typedArrayM3844K4.getFloat(6, f13);
                        }
                        j52Var3.f5280h = f13;
                        float f14 = j52Var3.f5281i;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                            f14 = typedArrayM3844K4.getFloat(7, f14);
                        }
                        j52Var3.f5281i = f14;
                        String string6 = typedArrayM3844K4.getString(0);
                        if (string6 != null) {
                            j52Var3.f5283k = string6;
                        }
                        j52Var3.m3567c();
                        typedArrayM3844K4.recycle();
                        j52Var2.f5274b.add(j52Var3);
                        arrayDeque.push(j52Var3);
                        if (j52Var3.getGroupName() != null) {
                            c0633fa.put(j52Var3.getGroupName(), j52Var3);
                        }
                        n52Var3.f7244a = n52Var3.f7244a;
                    }
                }
                i2 = 1;
            } else {
                i = depth;
                c = '\b';
                i2 = 1;
                if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                    arrayDeque.pop();
                }
            }
            eventType = xmlPullParser.next();
            i4 = i2;
            depth = i;
        }
        if (z2) {
            throw new XmlPullParserException("no path defined");
        }
        this.f8730c = m5203a(n52Var.f7246c, n52Var.f7247d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f4069a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f4069a;
        return drawable != null ? u30.m6382d(drawable) : this.f8729b.f7248e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f4069a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        n52 n52Var = this.f8729b;
        if (n52Var == null) {
            return false;
        }
        m52 m52Var = n52Var.f7245b;
        if (m52Var.f6659n == null) {
            m52Var.f6659n = Boolean.valueOf(m52Var.f6652g.mo3362a());
        }
        if (m52Var.f6659n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.f8729b.f7246c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f4069a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f8732e && super.mutate() == this) {
            n52 n52Var = this.f8729b;
            n52 n52Var2 = new n52();
            n52Var2.f7246c = null;
            n52Var2.f7247d = f8728o;
            if (n52Var != null) {
                n52Var2.f7244a = n52Var.f7244a;
                m52 m52Var = new m52(n52Var.f7245b);
                n52Var2.f7245b = m52Var;
                if (n52Var.f7245b.f6650e != null) {
                    m52Var.f6650e = new Paint(n52Var.f7245b.f6650e);
                }
                if (n52Var.f7245b.f6649d != null) {
                    n52Var2.f7245b.f6649d = new Paint(n52Var.f7245b.f6649d);
                }
                n52Var2.f7246c = n52Var.f7246c;
                n52Var2.f7247d = n52Var.f7247d;
                n52Var2.f7248e = n52Var.f7248e;
            }
            this.f8729b = n52Var2;
            this.f8732e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f4069a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.f4069a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        n52 n52Var = this.f8729b;
        ColorStateList colorStateList = n52Var.f7246c;
        if (colorStateList == null || (mode = n52Var.f7247d) == null) {
            z = false;
        } else {
            this.f8730c = m5203a(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        m52 m52Var = n52Var.f7245b;
        if (m52Var.f6659n == null) {
            m52Var.f6659n = Boolean.valueOf(m52Var.f6652g.mo3362a());
        }
        if (m52Var.f6659n.booleanValue()) {
            boolean zMo3363b = n52Var.f7245b.f6652g.mo3363b(iArr);
            n52Var.f7254k |= zMo3363b;
            if (zMo3363b) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f4069a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f4069a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f8729b.f7245b.getRootAlpha() != i) {
            this.f8729b.f7245b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f4069a;
        if (drawable != null) {
            u30.m6383e(drawable, z);
        } else {
            this.f8729b.f7248e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f4069a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f8731d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f4069a;
        if (drawable != null) {
            v30.m6559g(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f4069a;
        if (drawable != null) {
            v30.m6560h(drawable, colorStateList);
            return;
        }
        n52 n52Var = this.f8729b;
        if (n52Var.f7246c != colorStateList) {
            n52Var.f7246c = colorStateList;
            this.f8730c = m5203a(colorStateList, n52Var.f7247d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f4069a;
        if (drawable != null) {
            v30.m6561i(drawable, mode);
            return;
        }
        n52 n52Var = this.f8729b;
        if (n52Var.f7247d != mode) {
            n52Var.f7247d = mode;
            this.f8730c = m5203a(n52Var.f7246c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f4069a;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f4069a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public p52(n52 n52Var) {
        this.f8733f = true;
        this.f8734g = new float[9];
        this.f8735m = new Matrix();
        this.f8736n = new Rect();
        this.f8729b = n52Var;
        this.f8730c = m5203a(n52Var.f7246c, n52Var.f7247d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f4069a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }
}
