package p000;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import com.sousasantoslogic.sspro.R;

/* JADX INFO: renamed from: x7 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class C1581x7 extends EditText implements za1 {

    /* JADX INFO: renamed from: a */
    public final C1652z4 f12468a;

    /* JADX INFO: renamed from: b */
    public final C0127c9 f12469b;

    /* JADX INFO: renamed from: c */
    public final f02 f12470c;

    /* JADX INFO: renamed from: d */
    public final C0558d8 f12471d;

    /* JADX INFO: renamed from: e */
    public C1544w7 f12472e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1581x7(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        z02.m7175a(context);
        h02.m3085a(this, getContext());
        C1652z4 c1652z4 = new C1652z4(this);
        this.f12468a = c1652z4;
        c1652z4.m7202m(attributeSet, R.attr.editTextStyle);
        C0127c9 c0127c9 = new C0127c9(this);
        this.f12469b = c0127c9;
        c0127c9.m1166f(attributeSet, R.attr.editTextStyle);
        c0127c9.m1163b();
        this.f12470c = new f02();
        C0558d8 c0558d8 = new C0558d8((EditText) this, 3);
        this.f12471d = c0558d8;
        c0558d8.mo2257F(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerM2253A = c0558d8.m2253A(keyListener);
        if (keyListenerM2253A == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerM2253A);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    private C1544w7 getSuperCaller() {
        if (this.f12472e == null) {
            this.f12472e = new C1544w7(this);
        }
        return this.f12472e;
    }

    @Override // p000.za1
    /* JADX INFO: renamed from: a */
    public final C1120mt mo4713a(C1120mt c1120mt) {
        return this.f12470c.m2672a(this, c1120mt);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1652z4 c1652z4 = this.f12468a;
        if (c1652z4 != null) {
            c1652z4.m7191b();
        }
        C0127c9 c0127c9 = this.f12469b;
        if (c0127c9 != null) {
            c0127c9.m1163b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1652z4 c1652z4 = this.f12468a;
        if (c1652z4 != null) {
            return c1652z4.m7199j();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1652z4 c1652z4 = this.f12468a;
        if (c1652z4 != null) {
            return c1652z4.m7200k();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f12469b.m1164d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f12469b.m1165e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrM3372d;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f12469b.getClass();
        C0127c9.m1161h(editorInfo, inputConnectionOnCreateInputConnection, this);
        o21.m4655a0(editorInfo, inputConnectionOnCreateInputConnection, this);
        if (inputConnectionOnCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (strArrM3372d = i72.m3372d(this)) != null) {
            editorInfo.contentMimeTypes = strArrM3372d;
            inputConnectionOnCreateInputConnection = new on0(inputConnectionOnCreateInputConnection, new C1521vl(this, 24));
        }
        return this.f12471d.m2258G(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean zM2939a = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && i72.m3372d(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                toString();
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                zM2939a = AbstractC0668g8.m2939a(dragEvent, this, activity);
            }
        }
        if (zM2939a) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        C1046kt c1046kt;
        InterfaceC0803jt interfaceC0803jt;
        int i2;
        ay0 ay0Var;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31 || i72.m3372d(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i3 >= 31) {
                ay0Var = new ay0(primaryClip, 1);
            } else {
                c1046kt = new C1046kt();
                c1046kt.f5999b = primaryClip;
                c1046kt.f6000c = 1;
            }
            if (i == 16908322) {
                interfaceC0803jt = c1046kt;
                interfaceC0803jt = ay0Var;
                i2 = 0;
            } else {
                interfaceC0803jt = c1046kt;
                interfaceC0803jt = ay0Var;
                i2 = 1;
            }
            interfaceC0803jt.mo771g(i2);
            i72.m3374f(this, interfaceC0803jt.build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1652z4 c1652z4 = this.f12468a;
        if (c1652z4 != null) {
            c1652z4.m7204o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1652z4 c1652z4 = this.f12468a;
        if (c1652z4 != null) {
            c1652z4.m7205p(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0127c9 c0127c9 = this.f12469b;
        if (c0127c9 != null) {
            c0127c9.m1163b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0127c9 c0127c9 = this.f12469b;
        if (c0127c9 != null) {
            c0127c9.m1163b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f12471d.m2262K(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f12471d.m2253A(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1652z4 c1652z4 = this.f12468a;
        if (c1652z4 != null) {
            c1652z4.m7210u(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1652z4 c1652z4 = this.f12468a;
        if (c1652z4 != null) {
            c1652z4.m7211v(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0127c9 c0127c9 = this.f12469b;
        c0127c9.m1168i(colorStateList);
        c0127c9.m1163b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0127c9 c0127c9 = this.f12469b;
        c0127c9.m1169j(mode);
        c0127c9.m1163b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0127c9 c0127c9 = this.f12469b;
        if (c0127c9 != null) {
            c0127c9.m1167g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return super.getText();
    }
}
