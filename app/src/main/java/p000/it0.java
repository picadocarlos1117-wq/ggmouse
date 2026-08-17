package p000;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class it0 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5148a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f5149b;

    public /* synthetic */ it0(Object obj, int i) {
        this.f5148a = i;
        this.f5149b = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        m40 m40Var;
        int i2 = this.f5148a;
        Object obj = this.f5149b;
        switch (i2) {
            case 0:
                if (i != -1 && (m40Var = ((ot0) obj).f8473c) != null) {
                    m40Var.setListSelectionHidden(false);
                    break;
                }
                break;
            default:
                ((SearchView) obj).m243o(i);
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i = this.f5148a;
    }

    /* JADX INFO: renamed from: a */
    private final void m3483a(AdapterView adapterView) {
    }

    /* JADX INFO: renamed from: b */
    private final void m3484b(AdapterView adapterView) {
    }
}
