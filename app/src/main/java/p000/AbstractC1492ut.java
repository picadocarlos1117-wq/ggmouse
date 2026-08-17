package p000;

import android.content.Context;

/* JADX INFO: renamed from: ut */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1492ut {
    /* JADX INFO: renamed from: a */
    public static int m6531a(Context context, int i) {
        return context.getColor(i);
    }

    /* JADX INFO: renamed from: b */
    public static <T> T m6532b(Context context, Class<T> cls) {
        return (T) context.getSystemService(cls);
    }

    /* JADX INFO: renamed from: c */
    public static String m6533c(Context context, Class<?> cls) {
        return context.getSystemServiceName(cls);
    }
}
