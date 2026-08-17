package p000;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ev1 extends AbstractC0086b4 implements g31 {

    /* JADX INFO: renamed from: c */
    public Context f3447c;

    /* JADX INFO: renamed from: d */
    public ActionBarContextView f3448d;

    /* JADX INFO: renamed from: e */
    public C0558d8 f3449e;

    /* JADX INFO: renamed from: f */
    public WeakReference f3450f;

    /* JADX INFO: renamed from: g */
    public boolean f3451g;

    /* JADX INFO: renamed from: m */
    public i31 f3452m;

    @Override // p000.AbstractC0086b4
    /* JADX INFO: renamed from: a */
    public final void mo834a() {
        if (this.f3451g) {
            return;
        }
        this.f3451g = true;
        this.f3449e.mo70c(this);
    }

    @Override // p000.AbstractC0086b4
    /* JADX INFO: renamed from: b */
    public final View mo835b() {
        WeakReference weakReference = this.f3450f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // p000.AbstractC0086b4
    /* JADX INFO: renamed from: c */
    public final i31 mo836c() {
        return this.f3452m;
    }

    @Override // p000.g31
    /* JADX INFO: renamed from: d */
    public final boolean mo768d(i31 i31Var, MenuItem menuItem) {
        return ((InterfaceC0005a4) this.f3449e.f2821b).mo69a(this, menuItem);
    }

    @Override // p000.AbstractC0086b4
    /* JADX INFO: renamed from: e */
    public final MenuInflater mo837e() {
        return new ly1(this.f3448d.getContext());
    }

    @Override // p000.AbstractC0086b4
    /* JADX INFO: renamed from: f */
    public final CharSequence mo838f() {
        return this.f3448d.getSubtitle();
    }

    @Override // p000.AbstractC0086b4
    /* JADX INFO: renamed from: g */
    public final CharSequence mo839g() {
        return this.f3448d.getTitle();
    }

    @Override // p000.AbstractC0086b4
    /* JADX INFO: renamed from: h */
    public final void mo840h() {
        this.f3449e.mo72e(this, this.f3452m);
    }

    @Override // p000.AbstractC0086b4
    /* JADX INFO: renamed from: i */
    public final boolean mo841i() {
        return this.f3448d.f397x;
    }

    @Override // p000.g31
    /* JADX INFO: renamed from: j */
    public final void mo774j(i31 i31Var) {
        mo840h();
        C1540w3 c1540w3 = this.f3448d.f382d;
        if (c1540w3 != null) {
            c1540w3.m6697l();
        }
    }

    @Override // p000.AbstractC0086b4
    /* JADX INFO: renamed from: k */
    public final void mo842k(View view) {
        this.f3448d.setCustomView(view);
        this.f3450f = view != null ? new WeakReference(view) : null;
    }

    @Override // p000.AbstractC0086b4
    /* JADX INFO: renamed from: l */
    public final void mo843l(int i) {
        mo844m(this.f3447c.getString(i));
    }

    @Override // p000.AbstractC0086b4
    /* JADX INFO: renamed from: m */
    public final void mo844m(CharSequence charSequence) {
        this.f3448d.setSubtitle(charSequence);
    }

    @Override // p000.AbstractC0086b4
    /* JADX INFO: renamed from: n */
    public final void mo845n(int i) {
        mo846o(this.f3447c.getString(i));
    }

    @Override // p000.AbstractC0086b4
    /* JADX INFO: renamed from: o */
    public final void mo846o(CharSequence charSequence) {
        this.f3448d.setTitle(charSequence);
    }

    @Override // p000.AbstractC0086b4
    /* JADX INFO: renamed from: p */
    public final void mo847p(boolean z) {
        this.f1141b = z;
        this.f3448d.setTitleOptional(z);
    }
}
