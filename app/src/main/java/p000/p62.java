package p000;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class p62 extends dy0 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f8742e;

    public p62(int i, Class cls, int i2, int i3, int i4) {
        this.f8742e = i4;
        this.f3073a = i;
        this.f3076d = cls;
        this.f3075c = i2;
        this.f3074b = i3;
    }

    @Override // p000.dy0
    /* JADX INFO: renamed from: c */
    public final Object mo2408c(View view) {
        switch (this.f8742e) {
            case 0:
                return Boolean.valueOf(c72.m1152d(view));
            case 1:
                return c72.m1150b(view);
            default:
                return Boolean.valueOf(c72.m1151c(view));
        }
    }

    @Override // p000.dy0
    /* JADX INFO: renamed from: d */
    public final void mo2409d(View view, Object obj) {
        switch (this.f8742e) {
            case 0:
                c72.m1157i(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                c72.m1156h(view, (CharSequence) obj);
                break;
            default:
                c72.m1155g(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // p000.dy0
    /* JADX INFO: renamed from: g */
    public final boolean mo2412g(Object obj, Object obj2) {
        switch (this.f8742e) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
    }
}
