package p000;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ca2 extends AbstractC0086b4 implements g31 {

    /* JADX INFO: renamed from: c */
    public final Context f1728c;

    /* JADX INFO: renamed from: d */
    public final i31 f1729d;

    /* JADX INFO: renamed from: e */
    public C0558d8 f1730e;

    /* JADX INFO: renamed from: f */
    public WeakReference f1731f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ da2 f1732g;

    public ca2(da2 da2Var, Context context, C0558d8 c0558d8) {
        this.f1732g = da2Var;
        this.f1728c = context;
        this.f1730e = c0558d8;
        i31 i31Var = new i31(context);
        i31Var.f4798l = 1;
        this.f1729d = i31Var;
        i31Var.f4791e = this;
    }

    @Override // p000.AbstractC0086b4
    /* JADX INFO: renamed from: a */
    public final void mo834a() {
        da2 da2Var = this.f1732g;
        if (da2Var.f2843i != this) {
            return;
        }
        if (da2Var.f2850p) {
            da2Var.f2844j = this;
            da2Var.f2845k = this.f1730e;
        } else {
            this.f1730e.mo70c(this);
        }
        this.f1730e = null;
        da2Var.m2302p(false);
        ActionBarContextView actionBarContextView = da2Var.f2840f;
        if (actionBarContextView.f389p == null) {
            actionBarContextView.m216e();
        }
        da2Var.f2837c.setHideOnContentScrollEnabled(da2Var.f2855u);
        da2Var.f2843i = null;
    }

    @Override // p000.AbstractC0086b4
    /* JADX INFO: renamed from: b */
    public final View mo835b() {
        WeakReference weakReference = this.f1731f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // p000.AbstractC0086b4
    /* JADX INFO: renamed from: c */
    public final i31 mo836c() {
        return this.f1729d;
    }

    @Override // p000.g31
    /* JADX INFO: renamed from: d */
    public final boolean mo768d(i31 i31Var, MenuItem menuItem) {
        C0558d8 c0558d8 = this.f1730e;
        if (c0558d8 != null) {
            return ((InterfaceC0005a4) c0558d8.f2821b).mo69a(this, menuItem);
        }
        return false;
    }

    @Override // p000.AbstractC0086b4
    /* JADX INFO: renamed from: e */
    public final MenuInflater mo837e() {
        return new ly1(this.f1728c);
    }

    @Override // p000.AbstractC0086b4
    /* JADX INFO: renamed from: f */
    public final CharSequence mo838f() {
        return this.f1732g.f2840f.getSubtitle();
    }

    @Override // p000.AbstractC0086b4
    /* JADX INFO: renamed from: g */
    public final CharSequence mo839g() {
        return this.f1732g.f2840f.getTitle();
    }

    @Override // p000.AbstractC0086b4
    /* JADX INFO: renamed from: h */
    public final void mo840h() {
        if (this.f1732g.f2843i != this) {
            return;
        }
        i31 i31Var = this.f1729d;
        i31Var.m3360w();
        try {
            this.f1730e.mo72e(this, i31Var);
        } finally {
            i31Var.m3359v();
        }
    }

    @Override // p000.AbstractC0086b4
    /* JADX INFO: renamed from: i */
    public final boolean mo841i() {
        return this.f1732g.f2840f.f397x;
    }

    @Override // p000.g31
    /* JADX INFO: renamed from: j */
    public final void mo774j(i31 i31Var) {
        if (this.f1730e == null) {
            return;
        }
        mo840h();
        C1540w3 c1540w3 = this.f1732g.f2840f.f382d;
        if (c1540w3 != null) {
            c1540w3.m6697l();
        }
    }

    @Override // p000.AbstractC0086b4
    /* JADX INFO: renamed from: k */
    public final void mo842k(View view) {
        this.f1732g.f2840f.setCustomView(view);
        this.f1731f = new WeakReference(view);
    }

    @Override // p000.AbstractC0086b4
    /* JADX INFO: renamed from: l */
    public final void mo843l(int i) {
        mo844m(this.f1732g.f2835a.getResources().getString(i));
    }

    @Override // p000.AbstractC0086b4
    /* JADX INFO: renamed from: m */
    public final void mo844m(CharSequence charSequence) {
        this.f1732g.f2840f.setSubtitle(charSequence);
    }

    @Override // p000.AbstractC0086b4
    /* JADX INFO: renamed from: n */
    public final void mo845n(int i) {
        mo846o(this.f1732g.f2835a.getResources().getString(i));
    }

    @Override // p000.AbstractC0086b4
    /* JADX INFO: renamed from: o */
    public final void mo846o(CharSequence charSequence) {
        this.f1732g.f2840f.setTitle(charSequence);
    }

    @Override // p000.AbstractC0086b4
    /* JADX INFO: renamed from: p */
    public final void mo847p(boolean z) {
        this.f1141b = z;
        this.f1732g.f2840f.setTitleOptional(z);
    }
}
