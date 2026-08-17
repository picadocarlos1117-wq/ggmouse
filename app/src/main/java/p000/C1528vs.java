package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: renamed from: vs */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1528vs {

    /* JADX INFO: renamed from: a */
    public int f11757a;

    /* JADX INFO: renamed from: b */
    public int f11758b;

    /* JADX INFO: renamed from: c */
    public float f11759c;

    /* JADX INFO: renamed from: d */
    public float f11760d;

    /* JADX INFO: renamed from: a */
    public final void m6655a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, di1.f2944g);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.f11759c = typedArrayObtainStyledAttributes.getFloat(index, this.f11759c);
            } else if (index == 0) {
                int i2 = typedArrayObtainStyledAttributes.getInt(index, this.f11757a);
                this.f11757a = i2;
                this.f11757a = C1602xs.f12698d[i2];
            } else if (index == 4) {
                this.f11758b = typedArrayObtainStyledAttributes.getInt(index, this.f11758b);
            } else if (index == 3) {
                this.f11760d = typedArrayObtainStyledAttributes.getFloat(index, this.f11760d);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
