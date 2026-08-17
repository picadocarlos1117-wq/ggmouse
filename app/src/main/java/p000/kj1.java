package p000;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC0066e;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class kj1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5887a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0066e f5888b;

    public /* synthetic */ kj1(AbstractC0066e abstractC0066e, int i) {
        this.f5887a = i;
        this.f5888b = abstractC0066e;
    }

    /* JADX INFO: renamed from: a */
    public final int m3890a(View view) {
        int right;
        int i;
        switch (this.f5887a) {
            case 0:
                mj1 mj1Var = (mj1) view.getLayoutParams();
                right = view.getRight() + ((mj1) view.getLayoutParams()).f7011b.right;
                i = ((ViewGroup.MarginLayoutParams) mj1Var).rightMargin;
                break;
            default:
                mj1 mj1Var2 = (mj1) view.getLayoutParams();
                right = view.getBottom() + ((mj1) view.getLayoutParams()).f7011b.bottom;
                i = ((ViewGroup.MarginLayoutParams) mj1Var2).bottomMargin;
                break;
        }
        return right + i;
    }

    /* JADX INFO: renamed from: b */
    public final int m3891b(View view) {
        int left;
        int i;
        switch (this.f5887a) {
            case 0:
                mj1 mj1Var = (mj1) view.getLayoutParams();
                left = view.getLeft() - ((mj1) view.getLayoutParams()).f7011b.left;
                i = ((ViewGroup.MarginLayoutParams) mj1Var).leftMargin;
                break;
            default:
                mj1 mj1Var2 = (mj1) view.getLayoutParams();
                left = view.getTop() - ((mj1) view.getLayoutParams()).f7011b.top;
                i = ((ViewGroup.MarginLayoutParams) mj1Var2).topMargin;
                break;
        }
        return left - i;
    }

    /* JADX INFO: renamed from: c */
    public final int m3892c() {
        int i;
        int iM660D;
        int i2 = this.f5887a;
        AbstractC0066e abstractC0066e = this.f5888b;
        switch (i2) {
            case 0:
                i = abstractC0066e.f995n;
                iM660D = abstractC0066e.m660D();
                break;
            default:
                i = abstractC0066e.f996o;
                iM660D = abstractC0066e.m658B();
                break;
        }
        return i - iM660D;
    }

    /* JADX INFO: renamed from: d */
    public final int m3893d() {
        int i = this.f5887a;
        AbstractC0066e abstractC0066e = this.f5888b;
        switch (i) {
            case 0:
                return abstractC0066e.m659C();
            default:
                return abstractC0066e.m661E();
        }
    }
}
