package p000;

import android.view.ViewGroup;
import android.view.WindowId;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ea2 {

    /* JADX INFO: renamed from: a */
    public final WindowId f3304a;

    public ea2(ViewGroup viewGroup) {
        this.f3304a = viewGroup.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ea2) && ((ea2) obj).f3304a.equals(this.f3304a);
    }

    public final int hashCode() {
        return this.f3304a.hashCode();
    }
}
