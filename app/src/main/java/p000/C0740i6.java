package p000;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: i6 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0740i6 extends g52 implements Animatable {

    /* JADX INFO: renamed from: c */
    public final Context f4830c;

    /* JADX INFO: renamed from: d */
    public C1057l3 f4831d = null;

    /* JADX INFO: renamed from: e */
    public ArrayList f4832e = null;

    /* JADX INFO: renamed from: f */
    public final C0629f6 f4833f = new C0629f6(this);

    /* JADX INFO: renamed from: b */
    public final C0666g6 f4829b = new C0666g6();

    public C0740i6(Context context) {
        this.f4830c = context;
    }

    @Override // p000.g52, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f4069a;
        if (drawable != null) {
            v30.m6553a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f4069a;
        if (drawable != null) {
            return v30.m6554b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f4069a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        C0666g6 c0666g6 = this.f4829b;
        c0666g6.f4070a.draw(canvas);
        if (c0666g6.f4071b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f4069a;
        return drawable != null ? u30.m6379a(drawable) : this.f4829b.f4070a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f4069a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f4829b.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f4069a;
        return drawable != null ? v30.m6555c(drawable) : this.f4829b.f4070a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f4069a != null) {
            return new C0703h6(this.f4069a.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f4069a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f4829b.f4070a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f4069a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f4829b.f4070a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f4069a;
        return drawable != null ? drawable.getOpacity() : this.f4829b.f4070a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C0666g6 c0666g6;
        Drawable drawable = this.f4069a;
        if (drawable != null) {
            v30.m6556d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            c0666g6 = this.f4829b;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayM3844K = ki0.m3844K(resources, theme, attributeSet, hr1.f4686e);
                    int resourceId = typedArrayM3844K.getResourceId(0, 0);
                    if (resourceId != 0) {
                        p52 p52Var = new p52();
                        ThreadLocal threadLocal = pl1.f8932a;
                        p52Var.f4069a = kl1.m3898a(resources, resourceId, theme);
                        new o52(p52Var.f4069a.getConstantState());
                        p52Var.f8733f = false;
                        p52Var.setCallback(this.f4833f);
                        p52 p52Var2 = c0666g6.f4070a;
                        if (p52Var2 != null) {
                            p52Var2.setCallback(null);
                        }
                        c0666g6.f4070a = p52Var;
                    }
                    typedArrayM3844K.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, hr1.f4687f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f4830c;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            f40.m2719o("Context can't be null when inflating animators");
                            return;
                        }
                        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                        animatorLoadAnimator.setTarget(c0666g6.f4070a.f8729b.f7245b.f6660o.getOrDefault(string, null));
                        if (c0666g6.f4072c == null) {
                            c0666g6.f4072c = new ArrayList();
                            c0666g6.f4073d = new C0633fa();
                        }
                        c0666g6.f4072c.add(animatorLoadAnimator);
                        c0666g6.f4073d.put(animatorLoadAnimator, string);
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (c0666g6.f4071b == null) {
            c0666g6.f4071b = new AnimatorSet();
        }
        c0666g6.f4071b.playTogether(c0666g6.f4072c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f4069a;
        return drawable != null ? u30.m6382d(drawable) : this.f4829b.f4070a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f4069a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f4829b.f4071b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f4069a;
        return drawable != null ? drawable.isStateful() : this.f4829b.f4070a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f4069a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f4069a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f4829b.f4070a.setBounds(rect);
        }
    }

    @Override // p000.g52, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f4069a;
        return drawable != null ? drawable.setLevel(i) : this.f4829b.f4070a.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f4069a;
        return drawable != null ? drawable.setState(iArr) : this.f4829b.f4070a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f4069a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f4829b.f4070a.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f4069a;
        if (drawable != null) {
            u30.m6383e(drawable, z);
        } else {
            this.f4829b.f4070a.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f4069a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f4829b.f4070a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f4069a;
        if (drawable != null) {
            v30.m6559g(drawable, i);
        } else {
            this.f4829b.f4070a.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f4069a;
        if (drawable != null) {
            v30.m6560h(drawable, colorStateList);
        } else {
            this.f4829b.f4070a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f4069a;
        if (drawable != null) {
            v30.m6561i(drawable, mode);
        } else {
            this.f4829b.f4070a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f4069a;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f4829b.f4070a.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f4069a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        C0666g6 c0666g6 = this.f4829b;
        if (c0666g6.f4071b.isStarted()) {
            return;
        }
        c0666g6.f4071b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f4069a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f4829b.f4071b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
