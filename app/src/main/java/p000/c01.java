package p000;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class c01<S> extends zc1 {

    /* JADX INFO: renamed from: b */
    public int f1597b;

    /* JADX INFO: renamed from: c */
    public C1409sk f1598c;

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0048l
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f1597b = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") == null) {
            this.f1598c = (C1409sk) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        } else {
            l41.m4035b();
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0048l
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f1597b));
        throw null;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0048l
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f1597b);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f1598c);
    }
}
