package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;

/* JADX INFO: renamed from: a7 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0008a7 {

    /* JADX INFO: renamed from: a */
    public ColorStateList f74a = null;

    /* JADX INFO: renamed from: b */
    public PorterDuff.Mode f75b = null;

    /* JADX INFO: renamed from: c */
    public boolean f76c = false;

    /* JADX INFO: renamed from: d */
    public boolean f77d = false;

    /* JADX INFO: renamed from: e */
    public boolean f78e;

    /* JADX INFO: renamed from: f */
    public final TextView f79f;

    public /* synthetic */ C0008a7(TextView textView) {
        this.f79f = textView;
    }

    /* JADX INFO: renamed from: a */
    public void m94a() {
        CompoundButton compoundButton = (CompoundButton) this.f79f;
        Drawable drawableM6653a = AbstractC1527vr.m6653a(compoundButton);
        if (drawableM6653a != null) {
            if (this.f76c || this.f77d) {
                Drawable drawableMutate = drawableM6653a.mutate();
                if (this.f76c) {
                    v30.m6560h(drawableMutate, this.f74a);
                }
                if (this.f77d) {
                    v30.m6561i(drawableMutate, this.f75b);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m95b() {
        C1654z6 c1654z6 = (C1654z6) this.f79f;
        Drawable checkMarkDrawable = c1654z6.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f76c || this.f77d) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.f76c) {
                    v30.m6560h(drawableMutate, this.f74a);
                }
                if (this.f77d) {
                    v30.m6561i(drawableMutate, this.f75b);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(c1654z6.getDrawableState());
                }
                c1654z6.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m96c(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f79f;
        Context context = compoundButton.getContext();
        int[] iArr = ki1.f5858m;
        C1174o9 c1174o9M4734Q = C1174o9.m4734Q(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) c1174o9M4734Q.f7699b;
        i72.m3377i(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) c1174o9M4734Q.f7699b, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(hr1.m3282r(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        compoundButton.setButtonDrawable(hr1.m3282r(compoundButton.getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(hr1.m3282r(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                AbstractC1490ur.m6525c(compoundButton, c1174o9M4734Q.m4774w(2));
            }
            if (typedArray.hasValue(3)) {
                AbstractC1490ur.m6526d(compoundButton, x30.m6865b(typedArray.getInt(3, -1), null));
            }
        } finally {
            c1174o9M4734Q.m4753T();
        }
    }
}
