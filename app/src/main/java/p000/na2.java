package p000;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class na2 {

    /* JADX INFO: renamed from: a */
    public static final Field f7335a;

    /* JADX INFO: renamed from: b */
    public static final Field f7336b;

    /* JADX INFO: renamed from: c */
    public static final Field f7337c;

    /* JADX INFO: renamed from: d */
    public static final boolean f7338d;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f7335a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f7336b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f7337c = declaredField3;
            declaredField3.setAccessible(true);
            f7338d = true;
        } catch (ReflectiveOperationException e) {
            Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e.getMessage(), e);
        }
    }
}
