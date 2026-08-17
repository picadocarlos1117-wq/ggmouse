package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;

/* JADX INFO: renamed from: z7 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class C1655z7 extends ImageButton {

    /* JADX INFO: renamed from: a */
    public final C1652z4 f13297a;

    /* JADX INFO: renamed from: b */
    public final C0082b0 f13298b;

    /* JADX INFO: renamed from: c */
    public boolean f13299c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1655z7(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        z02.m7175a(context);
        this.f13299c = false;
        h02.m3085a(this, getContext());
        C1652z4 c1652z4 = new C1652z4(this);
        this.f13297a = c1652z4;
        c1652z4.m7202m(attributeSet, i);
        C0082b0 c0082b0 = new C0082b0(this);
        this.f13298b = c0082b0;
        c0082b0.m809k(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1652z4 c1652z4 = this.f13297a;
        if (c1652z4 != null) {
            c1652z4.m7191b();
        }
        C0082b0 c0082b0 = this.f13298b;
        if (c0082b0 != null) {
            c0082b0.m801a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1652z4 c1652z4 = this.f13297a;
        if (c1652z4 != null) {
            return c1652z4.m7199j();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1652z4 c1652z4 = this.f13297a;
        if (c1652z4 != null) {
            return c1652z4.m7200k();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C0577ds c0577ds;
        C0082b0 c0082b0 = this.f13298b;
        if (c0082b0 == null || (c0577ds = (C0577ds) c0082b0.f1105d) == null) {
            return null;
        }
        return (ColorStateList) c0577ds.f3005c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C0577ds c0577ds;
        C0082b0 c0082b0 = this.f13298b;
        if (c0082b0 == null || (c0577ds = (C0577ds) c0082b0.f1105d) == null) {
            return null;
        }
        return (PorterDuff.Mode) c0577ds.f3006d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f13298b.f1104c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1652z4 c1652z4 = this.f13297a;
        if (c1652z4 != null) {
            c1652z4.m7204o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1652z4 c1652z4 = this.f13297a;
        if (c1652z4 != null) {
            c1652z4.m7205p(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0082b0 c0082b0 = this.f13298b;
        if (c0082b0 != null) {
            c0082b0.m801a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C0082b0 c0082b0 = this.f13298b;
        if (c0082b0 != null && drawable != null && !this.f13299c) {
            c0082b0.f1103b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (c0082b0 != null) {
            c0082b0.m801a();
            if (this.f13299c) {
                return;
            }
            ImageView imageView = (ImageView) c0082b0.f1104c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(c0082b0.f1103b);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f13299c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        C0082b0 c0082b0 = this.f13298b;
        ImageView imageView = (ImageView) c0082b0.f1104c;
        if (i != 0) {
            Drawable drawableM3282r = hr1.m3282r(imageView.getContext(), i);
            if (drawableM3282r != null) {
                x30.m6864a(drawableM3282r);
            }
            imageView.setImageDrawable(drawableM3282r);
        } else {
            imageView.setImageDrawable(null);
        }
        c0082b0.m801a();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0082b0 c0082b0 = this.f13298b;
        if (c0082b0 != null) {
            c0082b0.m801a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1652z4 c1652z4 = this.f13297a;
        if (c1652z4 != null) {
            c1652z4.m7210u(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1652z4 c1652z4 = this.f13297a;
        if (c1652z4 != null) {
            c1652z4.m7211v(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0082b0 c0082b0 = this.f13298b;
        if (c0082b0 != null) {
            if (((C0577ds) c0082b0.f1105d) == null) {
                c0082b0.f1105d = new C0577ds();
            }
            C0577ds c0577ds = (C0577ds) c0082b0.f1105d;
            c0577ds.f3005c = colorStateList;
            c0577ds.f3004b = true;
            c0082b0.m801a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0082b0 c0082b0 = this.f13298b;
        if (c0082b0 != null) {
            if (((C0577ds) c0082b0.f1105d) == null) {
                c0082b0.f1105d = new C0577ds();
            }
            C0577ds c0577ds = (C0577ds) c0082b0.f1105d;
            c0577ds.f3006d = mode;
            c0577ds.f3003a = true;
            c0082b0.m801a();
        }
    }
}
