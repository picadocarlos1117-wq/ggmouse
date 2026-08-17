package p000;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class g72 implements OnReceiveContentListener {

    /* JADX INFO: renamed from: a */
    public final ya1 f4098a;

    public g72(ya1 ya1Var) {
        this.f4098a = ya1Var;
    }

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        C1120mt c1120mt = new C1120mt(new ay0(contentInfo));
        C1120mt c1120mtM2672a = ((f02) this.f4098a).m2672a(view, c1120mt);
        if (c1120mtM2672a == null) {
            return null;
        }
        if (c1120mtM2672a == c1120mt) {
            return contentInfo;
        }
        ContentInfo contentInfoMo773i = c1120mtM2672a.f7093a.mo773i();
        Objects.requireNonNull(contentInfoMo773i);
        return AbstractC1585xb.m6892k(contentInfoMo773i);
    }
}
