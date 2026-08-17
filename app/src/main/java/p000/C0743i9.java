package p000;

import android.content.Context;
import android.graphics.RectF;
import android.os.Build;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: i9 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0743i9 {

    /* JADX INFO: renamed from: a */
    public int f4873a = 0;

    /* JADX INFO: renamed from: b */
    public float f4874b = -1.0f;

    /* JADX INFO: renamed from: c */
    public float f4875c = -1.0f;

    /* JADX INFO: renamed from: d */
    public float f4876d = -1.0f;

    /* JADX INFO: renamed from: e */
    public int[] f4877e = new int[0];

    /* JADX INFO: renamed from: f */
    public boolean f4878f = false;

    /* JADX INFO: renamed from: g */
    public final TextView f4879g;

    /* JADX INFO: renamed from: h */
    public final Context f4880h;

    static {
        new RectF();
        new ConcurrentHashMap();
        new ConcurrentHashMap();
    }

    public C0743i9(TextView textView) {
        this.f4879g = textView;
        this.f4880h = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            new C0669g9();
        } else {
            new C0632f9();
        }
    }

    /* JADX INFO: renamed from: a */
    public static int[] m3393a(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i : iArr) {
                if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i2 = 0; i2 < size; i2++) {
                    iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m3394b() {
        return !(this.f4879g instanceof C1581x7);
    }
}
