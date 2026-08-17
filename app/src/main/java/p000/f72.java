package p000;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f72 {
    /* JADX INFO: renamed from: a */
    public static String[] m2736a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    /* JADX INFO: renamed from: b */
    public static C1120mt m2737b(View view, C1120mt c1120mt) {
        ContentInfo contentInfoMo773i = c1120mt.f7093a.mo773i();
        Objects.requireNonNull(contentInfoMo773i);
        ContentInfo contentInfoM6892k = AbstractC1585xb.m6892k(contentInfoMo773i);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoM6892k);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoM6892k ? c1120mt : new C1120mt(new ay0(contentInfoPerformReceiveContent));
    }

    /* JADX INFO: renamed from: c */
    public static void m2738c(View view, String[] strArr, ya1 ya1Var) {
        if (ya1Var == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new g72(ya1Var));
        }
    }
}
