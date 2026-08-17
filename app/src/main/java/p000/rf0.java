package p000;

import android.graphics.Rect;
import android.transition.Transition;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class rf0 extends Transition.EpicenterCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10011a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Rect f10012b;

    public /* synthetic */ rf0(int i, Rect rect) {
        this.f10011a = i;
        this.f10012b = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        int i = this.f10011a;
        Rect rect = this.f10012b;
        switch (i) {
            case 0:
                return rect;
            default:
                if (rect.isEmpty()) {
                    return null;
                }
                return rect;
        }
    }
}
