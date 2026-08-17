package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import com.example.ssmousepro.injection.TouchPipeline;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class pr1 {

    /* JADX INFO: renamed from: a */
    public o21 f9046a = new dn1();

    /* JADX INFO: renamed from: b */
    public o21 f9047b = new dn1();

    /* JADX INFO: renamed from: c */
    public o21 f9048c = new dn1();

    /* JADX INFO: renamed from: d */
    public o21 f9049d = new dn1();

    /* JADX INFO: renamed from: e */
    public InterfaceC1271ou f9050e = new C0811k0(TouchPipeline.SIZE);

    /* JADX INFO: renamed from: f */
    public InterfaceC1271ou f9051f = new C0811k0(TouchPipeline.SIZE);

    /* JADX INFO: renamed from: g */
    public InterfaceC1271ou f9052g = new C0811k0(TouchPipeline.SIZE);

    /* JADX INFO: renamed from: h */
    public InterfaceC1271ou f9053h = new C0811k0(TouchPipeline.SIZE);

    /* JADX INFO: renamed from: i */
    public k50 f9054i;

    /* JADX INFO: renamed from: j */
    public k50 f9055j;

    /* JADX INFO: renamed from: k */
    public k50 f9056k;

    /* JADX INFO: renamed from: l */
    public k50 f9057l;

    public pr1() {
        int i = 0;
        byte b = 0;
        this.f9054i = new k50(b, i);
        this.f9055j = new k50(b, i);
        this.f9056k = new k50(b, i);
        this.f9057l = new k50(b, i);
    }

    /* JADX INFO: renamed from: a */
    public static or1 m5309a(Context context, int i, int i2, C0811k0 c0811k0) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(ji1.f5413u);
        try {
            int i3 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i4 = typedArrayObtainStyledAttributes.getInt(3, i3);
            int i5 = typedArrayObtainStyledAttributes.getInt(4, i3);
            int i6 = typedArrayObtainStyledAttributes.getInt(2, i3);
            int i7 = typedArrayObtainStyledAttributes.getInt(1, i3);
            InterfaceC1271ou interfaceC1271ouM5311c = m5311c(typedArrayObtainStyledAttributes, 5, c0811k0);
            InterfaceC1271ou interfaceC1271ouM5311c2 = m5311c(typedArrayObtainStyledAttributes, 8, interfaceC1271ouM5311c);
            InterfaceC1271ou interfaceC1271ouM5311c3 = m5311c(typedArrayObtainStyledAttributes, 9, interfaceC1271ouM5311c);
            InterfaceC1271ou interfaceC1271ouM5311c4 = m5311c(typedArrayObtainStyledAttributes, 7, interfaceC1271ouM5311c);
            InterfaceC1271ou interfaceC1271ouM5311c5 = m5311c(typedArrayObtainStyledAttributes, 6, interfaceC1271ouM5311c);
            or1 or1Var = new or1();
            or1Var.f8425a = hr1.m3271g(i4);
            or1Var.f8429e = interfaceC1271ouM5311c2;
            or1Var.f8426b = hr1.m3271g(i5);
            or1Var.f8430f = interfaceC1271ouM5311c3;
            or1Var.f8427c = hr1.m3271g(i6);
            or1Var.f8431g = interfaceC1271ouM5311c4;
            or1Var.f8428d = hr1.m3271g(i7);
            or1Var.f8432h = interfaceC1271ouM5311c5;
            return or1Var;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: b */
    public static or1 m5310b(Context context, AttributeSet attributeSet, int i, int i2) {
        C0811k0 c0811k0 = new C0811k0(TouchPipeline.SIZE);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ji1.f5407o, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return m5309a(context, resourceId, resourceId2, c0811k0);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC1271ou m5311c(TypedArray typedArray, int i, InterfaceC1271ou interfaceC1271ou) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue != null) {
            int i2 = typedValuePeekValue.type;
            if (i2 == 5) {
                return new C0811k0(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new rk1(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return interfaceC1271ou;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m5312d(RectF rectF) {
        boolean z = this.f9057l.getClass().equals(k50.class) && this.f9055j.getClass().equals(k50.class) && this.f9054i.getClass().equals(k50.class) && this.f9056k.getClass().equals(k50.class);
        float fMo1128a = this.f9050e.mo1128a(rectF);
        return z && ((this.f9051f.mo1128a(rectF) > fMo1128a ? 1 : (this.f9051f.mo1128a(rectF) == fMo1128a ? 0 : -1)) == 0 && (this.f9053h.mo1128a(rectF) > fMo1128a ? 1 : (this.f9053h.mo1128a(rectF) == fMo1128a ? 0 : -1)) == 0 && (this.f9052g.mo1128a(rectF) > fMo1128a ? 1 : (this.f9052g.mo1128a(rectF) == fMo1128a ? 0 : -1)) == 0) && ((this.f9047b instanceof dn1) && (this.f9046a instanceof dn1) && (this.f9048c instanceof dn1) && (this.f9049d instanceof dn1));
    }

    /* JADX INFO: renamed from: e */
    public final or1 m5313e() {
        or1 or1Var = new or1();
        or1Var.f8425a = this.f9046a;
        or1Var.f8426b = this.f9047b;
        or1Var.f8427c = this.f9048c;
        or1Var.f8428d = this.f9049d;
        or1Var.f8429e = this.f9050e;
        or1Var.f8430f = this.f9051f;
        or1Var.f8431g = this.f9052g;
        or1Var.f8432h = this.f9053h;
        or1Var.f8433i = this.f9054i;
        or1Var.f8434j = this.f9055j;
        or1Var.f8435k = this.f9056k;
        or1Var.f8436l = this.f9057l;
        return or1Var;
    }
}
