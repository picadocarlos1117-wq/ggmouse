package p000;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import com.sousasantoslogic.sspro.R;

/* JADX INFO: renamed from: li */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC1072li implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6354a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f6355b;

    public /* synthetic */ ViewOnLayoutChangeListenerC1072li(Object obj, int i) {
        this.f6354a = i;
        this.f6355b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int dimensionPixelSize;
        switch (this.f6354a) {
            case 0:
                throw null;
            default:
                SearchView searchView = (SearchView) this.f6355b;
                SearchView.SearchAutoComplete searchAutoComplete = searchView.f486u;
                View view2 = searchView.f454C;
                if (view2.getWidth() > 1) {
                    Resources resources = searchView.getContext().getResources();
                    int paddingLeft = searchView.f488w.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean zM3112a = h82.m3112a(searchView);
                    if (searchView.f469R) {
                        dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
                    } else {
                        dimensionPixelSize = 0;
                    }
                    searchAutoComplete.getDropDownBackground().getPadding(rect);
                    int i9 = rect.left;
                    searchAutoComplete.setDropDownHorizontalOffset(zM3112a ? -i9 : paddingLeft - (i9 + dimensionPixelSize));
                    searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
                    return;
                }
                return;
        }
    }
}
