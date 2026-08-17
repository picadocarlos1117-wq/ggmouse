package p000;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class e60 extends rc2 {

    /* JADX INFO: renamed from: i */
    public final TextView f3216i;

    /* JADX INFO: renamed from: j */
    public final a60 f3217j;

    /* JADX INFO: renamed from: k */
    public boolean f3218k = true;

    public e60(TextView textView) {
        this.f3216i = textView;
        this.f3217j = new a60(textView);
    }

    @Override // p000.rc2
    /* JADX INFO: renamed from: I */
    public final InputFilter[] mo2530I(InputFilter[] inputFilterArr) {
        if (!this.f3218k) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof a60) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i4 = 0;
        while (true) {
            a60 a60Var = this.f3217j;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = a60Var;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == a60Var) {
                return inputFilterArr;
            }
            i4++;
        }
    }

    @Override // p000.rc2
    /* JADX INFO: renamed from: n0 */
    public final void mo2531n0(boolean z) {
        if (z) {
            m2533w0();
        }
    }

    @Override // p000.rc2
    /* JADX INFO: renamed from: o0 */
    public final void mo2532o0(boolean z) {
        this.f3218k = z;
        m2533w0();
        TextView textView = this.f3216i;
        textView.setFilters(mo2530I(textView.getFilters()));
    }

    /* JADX INFO: renamed from: w0 */
    public final void m2533w0() {
        TextView textView = this.f3216i;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.f3218k) {
            if (!(transformationMethod instanceof i60) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new i60(transformationMethod);
            }
        } else if (transformationMethod instanceof i60) {
            transformationMethod = ((i60) transformationMethod).f4834a;
        }
        textView.setTransformationMethod(transformationMethod);
    }
}
