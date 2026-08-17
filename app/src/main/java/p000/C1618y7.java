package p000;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: renamed from: y7 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1618y7 {

    /* JADX INFO: renamed from: a */
    public final TextView f12855a;

    /* JADX INFO: renamed from: b */
    public final ay0 f12856b;

    public C1618y7(TextView textView) {
        this.f12855a = textView;
        this.f12856b = new ay0(textView);
    }

    /* JADX INFO: renamed from: a */
    public final void m7026a(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.f12855a.getContext().obtainStyledAttributes(attributeSet, ki1.f5854i, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            m7028c(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m7027b(boolean z) {
        ((rc2) this.f12856b.f1096b).mo2531n0(z);
    }

    /* JADX INFO: renamed from: c */
    public final void m7028c(boolean z) {
        ((rc2) this.f12856b.f1096b).mo2532o0(z);
    }
}
