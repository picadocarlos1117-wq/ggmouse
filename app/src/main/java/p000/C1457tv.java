package p000;

import android.database.Cursor;
import android.util.Log;
import android.widget.Filter;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: renamed from: tv */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1457tv extends Filter {

    /* JADX INFO: renamed from: a */
    public AbstractC1420sv f11020a;

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return this.f11020a.mo2142c((Cursor) obj);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0031  */
    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor cursorM2146g;
        cy1 cy1Var = (cy1) this.f11020a;
        SearchView searchView = cy1Var.f2670p;
        String string = charSequence == null ? "" : charSequence.toString();
        if (searchView.getVisibility() == 0 && searchView.getWindowVisibility() == 0) {
            try {
                cursorM2146g = cy1Var.m2146g(cy1Var.f2671q, string);
                if (cursorM2146g != null) {
                    cursorM2146g.getCount();
                } else {
                    cursorM2146g = null;
                }
            } catch (RuntimeException e) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
            }
        } else {
            cursorM2146g = null;
        }
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (cursorM2146g != null) {
            filterResults.count = cursorM2146g.getCount();
            filterResults.values = cursorM2146g;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        AbstractC1420sv abstractC1420sv = this.f11020a;
        Cursor cursor = abstractC1420sv.f10558c;
        Object obj = filterResults.values;
        if (obj == null || obj == cursor) {
            return;
        }
        abstractC1420sv.mo2141b((Cursor) obj);
    }
}
