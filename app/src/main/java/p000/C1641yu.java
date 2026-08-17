package p000;

import android.content.Context;

/* JADX INFO: renamed from: yu */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1641yu implements b90 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f13147a;

    /* JADX INFO: renamed from: b */
    public final Object f13148b;

    public /* synthetic */ C1641yu(Object obj, int i) {
        this.f13147a = i;
        this.f13148b = obj;
    }

    @Override // p000.qh1
    public final Object get() {
        int i = this.f13147a;
        Object obj = this.f13148b;
        switch (i) {
            case 0:
                return new C1174o9((Context) ((C1641yu) obj).f13148b, (Object) new ax0(17), (Object) new ax0(14), 9);
            default:
                return obj;
        }
    }
}
