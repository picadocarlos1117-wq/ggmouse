package p000;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class i82 extends p32 {

    /* JADX INFO: renamed from: l */
    public static boolean f4869l = true;

    /* JADX INFO: renamed from: m */
    public static boolean f4870m = true;

    /* JADX INFO: renamed from: n */
    public static boolean f4871n = true;

    /* JADX INFO: renamed from: o */
    public static boolean f4872o = true;

    /* JADX INFO: renamed from: p0 */
    public void mo3389p0(View view, int i, int i2, int i3, int i4) {
        if (f4871n) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f4871n = false;
            }
        }
    }

    /* JADX INFO: renamed from: q0 */
    public void mo3390q0(View view, int i) {
        if (Build.VERSION.SDK_INT != 28) {
            if (f4872o) {
                try {
                    view.setTransitionVisibility(i);
                    return;
                } catch (NoSuchMethodError unused) {
                    f4872o = false;
                    return;
                }
            }
            return;
        }
        if (!p32.f8696j) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                p32.f8695i = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused2) {
            }
            p32.f8696j = true;
        }
        Field field = p32.f8695i;
        if (field != null) {
            try {
                p32.f8695i.setInt(view, (field.getInt(view) & (-13)) | i);
            } catch (IllegalAccessException unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: r0 */
    public void mo3391r0(View view, Matrix matrix) {
        if (f4869l) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f4869l = false;
            }
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void mo3392s0(ViewGroup viewGroup, Matrix matrix) {
        if (f4870m) {
            try {
                viewGroup.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f4870m = false;
            }
        }
    }
}
