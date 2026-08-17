package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: ws */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1565ws {

    /* JADX INFO: renamed from: n */
    public static final SparseIntArray f12257n;

    /* JADX INFO: renamed from: a */
    public float f12258a;

    /* JADX INFO: renamed from: b */
    public float f12259b;

    /* JADX INFO: renamed from: c */
    public float f12260c;

    /* JADX INFO: renamed from: d */
    public float f12261d;

    /* JADX INFO: renamed from: e */
    public float f12262e;

    /* JADX INFO: renamed from: f */
    public float f12263f;

    /* JADX INFO: renamed from: g */
    public float f12264g;

    /* JADX INFO: renamed from: h */
    public int f12265h;

    /* JADX INFO: renamed from: i */
    public float f12266i;

    /* JADX INFO: renamed from: j */
    public float f12267j;

    /* JADX INFO: renamed from: k */
    public float f12268k;

    /* JADX INFO: renamed from: l */
    public boolean f12269l;

    /* JADX INFO: renamed from: m */
    public float f12270m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f12257n = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
        sparseIntArray.append(11, 12);
    }

    /* JADX INFO: renamed from: a */
    public final void m6825a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, di1.f2946i);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (f12257n.get(index)) {
                case 1:
                    this.f12258a = typedArrayObtainStyledAttributes.getFloat(index, this.f12258a);
                    break;
                case 2:
                    this.f12259b = typedArrayObtainStyledAttributes.getFloat(index, this.f12259b);
                    break;
                case 3:
                    this.f12260c = typedArrayObtainStyledAttributes.getFloat(index, this.f12260c);
                    break;
                case 4:
                    this.f12261d = typedArrayObtainStyledAttributes.getFloat(index, this.f12261d);
                    break;
                case 5:
                    this.f12262e = typedArrayObtainStyledAttributes.getFloat(index, this.f12262e);
                    break;
                case 6:
                    this.f12263f = typedArrayObtainStyledAttributes.getDimension(index, this.f12263f);
                    break;
                case 7:
                    this.f12264g = typedArrayObtainStyledAttributes.getDimension(index, this.f12264g);
                    break;
                case 8:
                    this.f12266i = typedArrayObtainStyledAttributes.getDimension(index, this.f12266i);
                    break;
                case 9:
                    this.f12267j = typedArrayObtainStyledAttributes.getDimension(index, this.f12267j);
                    break;
                case 10:
                    this.f12268k = typedArrayObtainStyledAttributes.getDimension(index, this.f12268k);
                    break;
                case 11:
                    this.f12269l = true;
                    this.f12270m = typedArrayObtainStyledAttributes.getDimension(index, this.f12270m);
                    break;
                case 12:
                    this.f12265h = C1602xs.m6949f(typedArrayObtainStyledAttributes, index, this.f12265h);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
