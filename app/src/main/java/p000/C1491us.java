package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: us */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1491us {

    /* JADX INFO: renamed from: j */
    public static final SparseIntArray f11398j;

    /* JADX INFO: renamed from: a */
    public int f11399a;

    /* JADX INFO: renamed from: b */
    public int f11400b;

    /* JADX INFO: renamed from: c */
    public int f11401c;

    /* JADX INFO: renamed from: d */
    public float f11402d;

    /* JADX INFO: renamed from: e */
    public float f11403e;

    /* JADX INFO: renamed from: f */
    public float f11404f;

    /* JADX INFO: renamed from: g */
    public int f11405g;

    /* JADX INFO: renamed from: h */
    public String f11406h;

    /* JADX INFO: renamed from: i */
    public int f11407i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f11398j = sparseIntArray;
        sparseIntArray.append(3, 1);
        sparseIntArray.append(5, 2);
        sparseIntArray.append(9, 3);
        sparseIntArray.append(2, 4);
        sparseIntArray.append(1, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(4, 7);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(7, 9);
        sparseIntArray.append(6, 10);
    }

    /* JADX INFO: renamed from: a */
    public final void m6528a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, di1.f2943f);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (f11398j.get(index)) {
                case 1:
                    this.f11403e = typedArrayObtainStyledAttributes.getFloat(index, this.f11403e);
                    break;
                case 2:
                    this.f11401c = typedArrayObtainStyledAttributes.getInt(index, this.f11401c);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        String str = hp0.f4643g[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    break;
                case 4:
                    typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f11399a = C1602xs.m6949f(typedArrayObtainStyledAttributes, index, this.f11399a);
                    break;
                case 6:
                    this.f11400b = typedArrayObtainStyledAttributes.getInteger(index, this.f11400b);
                    break;
                case 7:
                    this.f11402d = typedArrayObtainStyledAttributes.getFloat(index, this.f11402d);
                    break;
                case 8:
                    this.f11405g = typedArrayObtainStyledAttributes.getInteger(index, this.f11405g);
                    break;
                case 9:
                    this.f11404f = typedArrayObtainStyledAttributes.getFloat(index, this.f11404f);
                    break;
                case 10:
                    int i2 = typedArrayObtainStyledAttributes.peekValue(index).type;
                    if (i2 == 1) {
                        this.f11407i = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    } else if (i2 == 3) {
                        String string = typedArrayObtainStyledAttributes.getString(index);
                        this.f11406h = string;
                        if (string.indexOf("/") > 0) {
                            this.f11407i = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        }
                    } else {
                        typedArrayObtainStyledAttributes.getInteger(index, this.f11407i);
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
