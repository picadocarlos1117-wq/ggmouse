package p000;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: k0 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0811k0 implements InterfaceC1271ou {

    /* JADX INFO: renamed from: a */
    public final float f5623a;

    public C0811k0(float f) {
        this.f5623a = f;
    }

    @Override // p000.InterfaceC1271ou
    /* JADX INFO: renamed from: a */
    public final float mo1128a(RectF rectF) {
        return this.f5623a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0811k0) && this.f5623a == ((C0811k0) obj).f5623a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f5623a)});
    }
}
