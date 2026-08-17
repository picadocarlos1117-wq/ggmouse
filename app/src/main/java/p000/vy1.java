package p000;

import android.content.res.Resources;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class vy1 extends or0 implements og0 {

    /* JADX INFO: renamed from: a */
    public static final vy1 f11865a = new vy1(1);

    @Override // p000.og0
    public final Object invoke(Object obj) {
        Resources resources = (Resources) obj;
        resources.getClass();
        return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
    }
}
