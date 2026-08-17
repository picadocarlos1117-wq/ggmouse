package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import com.sousasantoslogic.sspro.R;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class q12 implements InterfaceC0079ay {

    /* JADX INFO: renamed from: a */
    public final Toolbar f9293a;

    /* JADX INFO: renamed from: b */
    public int f9294b;

    /* JADX INFO: renamed from: c */
    public final View f9295c;

    /* JADX INFO: renamed from: d */
    public Drawable f9296d;

    /* JADX INFO: renamed from: e */
    public Drawable f9297e;

    /* JADX INFO: renamed from: f */
    public final Drawable f9298f;

    /* JADX INFO: renamed from: g */
    public final boolean f9299g;

    /* JADX INFO: renamed from: h */
    public CharSequence f9300h;

    /* JADX INFO: renamed from: i */
    public final CharSequence f9301i;

    /* JADX INFO: renamed from: j */
    public final CharSequence f9302j;

    /* JADX INFO: renamed from: k */
    public Window.Callback f9303k;

    /* JADX INFO: renamed from: l */
    public boolean f9304l;

    /* JADX INFO: renamed from: m */
    public C1540w3 f9305m;

    /* JADX INFO: renamed from: n */
    public final int f9306n;

    /* JADX INFO: renamed from: o */
    public final Drawable f9307o;

    public q12(Toolbar toolbar, boolean z) {
        Drawable drawable;
        this.f9306n = 0;
        this.f9293a = toolbar;
        this.f9300h = toolbar.getTitle();
        this.f9301i = toolbar.getSubtitle();
        this.f9299g = this.f9300h != null;
        this.f9298f = toolbar.getNavigationIcon();
        C1174o9 c1174o9M4734Q = C1174o9.m4734Q(toolbar.getContext(), null, ki1.f5846a, R.attr.actionBarStyle);
        TypedArray typedArray = (TypedArray) c1174o9M4734Q.f7699b;
        int i = 15;
        this.f9307o = c1174o9M4734Q.m4777z(15);
        if (z) {
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                this.f9299g = true;
                this.f9300h = text;
                if ((this.f9294b & 8) != 0) {
                    toolbar.setTitle(text);
                    if (this.f9299g) {
                        i72.m3379k(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                this.f9301i = text2;
                if ((this.f9294b & 8) != 0) {
                    toolbar.setSubtitle(text2);
                }
            }
            Drawable drawableM4777z = c1174o9M4734Q.m4777z(20);
            if (drawableM4777z != null) {
                this.f9297e = drawableM4777z;
                m5406c();
            }
            Drawable drawableM4777z2 = c1174o9M4734Q.m4777z(17);
            if (drawableM4777z2 != null) {
                this.f9296d = drawableM4777z2;
                m5406c();
            }
            if (this.f9298f == null && (drawable = this.f9307o) != null) {
                this.f9298f = drawable;
                if ((this.f9294b & 4) != 0) {
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            m5404a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(toolbar.getContext()).inflate(resourceId, (ViewGroup) toolbar, false);
                View view = this.f9295c;
                if (view != null && (this.f9294b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.f9295c = viewInflate;
                if (viewInflate != null && (this.f9294b & 16) != 0) {
                    toolbar.addView(viewInflate);
                }
                m5404a(this.f9294b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                toolbar.m260d();
                toolbar.f540y.m2604a(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = toolbar.getContext();
                toolbar.f532q = resourceId2;
                C0595e9 c0595e9 = toolbar.f521b;
                if (c0595e9 != null) {
                    c0595e9.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.f533r = resourceId3;
                C0595e9 c0595e10 = toolbar.f523c;
                if (c0595e10 != null) {
                    c0595e10.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                toolbar.setPopupTheme(resourceId4);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.f9307o = toolbar.getNavigationIcon();
            } else {
                i = 11;
            }
            this.f9294b = i;
        }
        c1174o9M4734Q.m4753T();
        if (R.string.abc_action_bar_up_description != this.f9306n) {
            this.f9306n = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                int i2 = this.f9306n;
                this.f9302j = i2 != 0 ? toolbar.getContext().getString(i2) : null;
                m5405b();
            }
        }
        this.f9302j = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new lz0(this));
    }

    /* JADX INFO: renamed from: a */
    public final void m5404a(int i) {
        View view;
        int i2 = this.f9294b ^ i;
        this.f9294b = i;
        if (i2 != 0) {
            int i3 = i2 & 4;
            Toolbar toolbar = this.f9293a;
            if (i3 != 0) {
                if ((i & 4) != 0) {
                    m5405b();
                }
                if ((this.f9294b & 4) != 0) {
                    Drawable drawable = this.f9298f;
                    if (drawable == null) {
                        drawable = this.f9307o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i2 & 3) != 0) {
                m5406c();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    toolbar.setTitle(this.f9300h);
                    toolbar.setSubtitle(this.f9301i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.f9295c) == null) {
                return;
            }
            if ((i & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5405b() {
        if ((this.f9294b & 4) != 0) {
            CharSequence charSequence = this.f9302j;
            boolean zIsEmpty = TextUtils.isEmpty(charSequence);
            Toolbar toolbar = this.f9293a;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.f9306n);
            } else {
                toolbar.setNavigationContentDescription(charSequence);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m5406c() {
        Drawable drawable;
        int i = this.f9294b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f9297e) == null) {
            drawable = this.f9296d;
        }
        this.f9293a.setLogo(drawable);
    }
}
