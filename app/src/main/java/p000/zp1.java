package p000;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class zp1 implements TextView.OnEditorActionListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SearchView f13521a;

    public zp1(SearchView searchView) {
        this.f13521a = searchView;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        this.f13521a.m245q();
        return true;
    }
}
