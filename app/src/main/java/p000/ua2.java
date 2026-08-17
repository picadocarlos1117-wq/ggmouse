package p000;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class ua2 extends ta2 {
    public ua2(bb2 bb2Var, WindowInsets windowInsets) {
        super(bb2Var, windowInsets);
    }

    @Override // p000.ya2
    /* JADX INFO: renamed from: a */
    public bb2 mo6480a() {
        return bb2.m960g(null, this.f10341c.consumeDisplayCutout());
    }

    @Override // p000.ya2
    /* JADX INFO: renamed from: e */
    public v20 mo6481e() {
        DisplayCutout displayCutout = this.f10341c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new v20(displayCutout);
    }

    @Override // p000.ya2
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ua2)) {
            return false;
        }
        ua2 ua2Var = (ua2) obj;
        return Objects.equals(this.f10341c, ua2Var.f10341c) && Objects.equals(this.f10345g, ua2Var.f10345g);
    }

    @Override // p000.ya2
    public int hashCode() {
        return this.f10341c.hashCode();
    }
}
