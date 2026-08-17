package p000;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class iy1 extends ActionMode {

    /* JADX INFO: renamed from: a */
    public final Context f5200a;

    /* JADX INFO: renamed from: b */
    public final AbstractC0086b4 f5201b;

    public iy1(Context context, AbstractC0086b4 abstractC0086b4) {
        this.f5200a = context;
        this.f5201b = abstractC0086b4;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f5201b.mo834a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f5201b.mo835b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new k41(this.f5200a, this.f5201b.mo836c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f5201b.mo837e();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f5201b.mo838f();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f5201b.f1140a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f5201b.mo839g();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f5201b.f1141b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f5201b.mo840h();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f5201b.mo841i();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f5201b.mo842k(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f5201b.mo844m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f5201b.f1140a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f5201b.mo846o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.f5201b.mo847p(z);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f5201b.mo843l(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f5201b.mo845n(i);
    }
}
