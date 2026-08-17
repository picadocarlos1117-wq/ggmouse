package p000;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class rk1 implements InterfaceC1271ou {

    /* JADX INFO: renamed from: a */
    public final float f10069a;

    public rk1(float f) {
        this.f10069a = f;
    }

    @Override // p000.InterfaceC1271ou
    /* JADX INFO: renamed from: a */
    public final float mo1128a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f10069a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rk1) && this.f10069a == ((rk1) obj).f10069a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f10069a)});
    }
}
